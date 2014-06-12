#!/usr/bin/env python
# Copyright (c) 2014, The MITRE Corporation. All rights reserved.
# For license information, see the LICENSE.txt file

from lxml import etree
import argparse

base_nsmap = {'stix': 'http://stix.mitre.org/stix-1',
              'campaign': 'http://stix.mitre.org/Campaign-1',
              'indicator': 'http://stix.mitre.org/Indicator-2', 
              'ttp': 'http://stix.mitre.org/TTP-1',
              'ta': 'http://stix.mitre.org/ThreatActor-1',
              'incident': 'http://stix.mitre.org/Incident-1',
              'et': 'http://stix.mitre.org/ExploitTarget-1',
              'coa': 'http://stix.mitre.org/CourseOfAction-1',
              'marking': 'http://data-marking.mitre.org/Marking-1'}
marking_xpath = "//stix:Handling|//campaign:Handling|//indicator:Handling|//ttp:Handling|//ta:Handling|//incident:Handling|//et:Handling|//coa:Handling"

def get_node_type(node):
    if node.__class__.__name__ == '_Element':
        return 'Element'
    elif node.__class__.__name__ == '_Comment':
        return 'Comment'
    elif node.is_attribute:
        return 'Attribute'
    elif node.is_text:
        return 'Element Data'
    elif node.is_tail:
        return 'Tail'
    else:
        return 'Unknown'

def main():
    """
    A utility that seeks out all Data Markings in the STIX document and identifies which fields are marked
    """
    parser = argparse.ArgumentParser("STIX Data Marking Parser")
    parser.add_argument("doc", help="The file location of the STIX document to parse.")
    args = parser.parse_args()

    e = etree.parse(args.doc).getroot()
    if e.attrib.get('version') != '1.1.1':
        raise Exception("This parser only works with STIX 1.1.1 documents. The version specified was %s" % e.attrib.get('version'))
    
    handlings = e.xpath(marking_xpath, namespaces = base_nsmap)
    print "Parsing Data Markings for: %s" % args.doc
    for handling in handlings:#Iterate over each handling element found
        for marking in handling:#Iterate over each Marking element in the Handling element
            id = marking.attrib.get('id')
            print "Parsing Marking with id=%s" % id
            
            try:
                controlled_structure = marking.xpath('./marking:Controlled_Structure', namespaces = base_nsmap)[0]
            except:
                raise Exception("Error: No Controlled_Structure elements found for marking id=%s!" % id)
            
            try:
                marking_structures = marking.xpath('./marking:Marking_Structure', namespaces = base_nsmap)
                print "Found these Marking_Structure elements:"
                for marking_structure in marking_structures:
                    #Is it possible to do better than just print out the element?
                    #E.g., for TLP:RED, it would be nice to print out TLP:RED
                    print "\t", etree.tostring(marking_structure)
            except Exception as e:
                raise Exception("Error: No Marking_Structure elements found for marking id=%s" % id)
            
            print "Evaluating XPath: ", controlled_structure.text
            results = controlled_structure.xpath(controlled_structure.text, namespaces = controlled_structure.nsmap)
            print "Nodes that matched XPath: ", len(results)
            
            if len(results) > 0:            
                print "Matching Nodes:"
                for result in results:
                    t = get_node_type(result)
                    if t == "Element":
                        v = result.tag
                    else:
                        v = repr(result)
                    print "\t", t, ":", v
            
            print "===================================================="

if __name__ == "__main__":
    main()
#!/usr/bin/env python
# Copyright (c) 2014, The MITRE Corporation. All rights reserved.
# For license information, see the LICENSE.txt file

"""
Locate STIX Data Markings and identify which fields are marked.
"""

from lxml import etree
import argparse

NSMAP = {
    'stix': 'http://stix.mitre.org/stix-1',
    'campaign': 'http://stix.mitre.org/Campaign-1',
    'coa': 'http://stix.mitre.org/CourseOfAction-1',
    'et': 'http://stix.mitre.org/ExploitTarget-1',
    'incident': 'http://stix.mitre.org/Incident-1',
    'indicator': 'http://stix.mitre.org/Indicator-2',
    'marking': 'http://data-marking.mitre.org/Marking-1',
    'ta': 'http://stix.mitre.org/ThreatActor-1',
    'ttp': 'http://stix.mitre.org/TTP-1',
}

MARKING_XPATH = ("//stix:Handling|//campaign:Handling|//indicator:Handling|"
                 "//ttp:Handling|//ta:Handling|//incident:Handling|"
                 "//et:Handling|//coa:Handling")


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


def handle_marking(marking, include_all=False):
    id = marking.attrib.get('id')
    print "Parsing Marking with id=%s" % id

    try:
        controlled_structure = marking.xpath('./marking:Controlled_Structure',
                                             namespaces=NSMAP)[0]
    except:
        msg = "ERROR: Marking %s contains no Controlled_Structure elements"
        raise Exception(msg % id)

    try:
        marking_structures = marking.xpath('./marking:Marking_Structure',
                                           namespaces=NSMAP)
        print "Found these Marking_Structure elements:"
        for marking_structure in marking_structures:
            # Is it possible to do better than just print out the element?
            # E.g., for TLP:RED, it would be nice to print out TLP:RED
            print "\t", etree.tostring(marking_structure)
    except Exception as e:

        msg = "ERROR: Marking %s contains no Marking_Structure elements"
        raise Exception(msg % id)

    print "Evaluating XPath: ", controlled_structure.text
    results = controlled_structure.xpath(controlled_structure.text,
                                         namespaces=controlled_structure.nsmap)
    print "Nodes that matched XPath: ", len(results)

    if len(results) > 0:
        print "Matching Nodes:"
        for result in results:
            t = get_node_type(result)

            # Ignore comments
            if not include_all and t == "Comment":
                continue

            if t == "Element":
                v = result.tag
            else:
                if not include_all and not str(result).strip():
                    # Text is empty or whitespace only.
                    continue
                v = repr(result)
            print "\t", t, ":", v


def main():
    parser = argparse.ArgumentParser(description="STIX Data Marking Parser")
    parser.add_argument("file", help="The STIX document to parse.")
    parser.add_argument("-a", "--all", dest="all", action="store_true",
                        default=False,
                        help="Include all XML nodes, including comments and "
                        "whitespace-only strings.")
    args = parser.parse_args()

    e = etree.parse(args.file).getroot()
    stix_version = e.attrib.get('version')
    if stix_version != '1.1.1':
        raise Exception("This parser only works with STIX 1.1.1 documents. "
                        "The version specified was %s" % stix_version)

    handlings = e.xpath(MARKING_XPATH, namespaces=NSMAP)
    print "Parsing Data Markings for: %s" % args.file

    # Iterate over each handling element found
    for handling in handlings:
        # Iterate over each Marking element in the Handling element
        for marking in handling:
            handle_marking(marking, include_all=args.all)
            print "===================================================="

if __name__ == "__main__":
    main()

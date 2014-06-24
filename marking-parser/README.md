STIX Data Marking Parser
========================
This script takes, as a single command line argument, a STIX 1.1.1 XML file and performs the following actions:

1. Collects all `Handling` elements from everywhere in the document
1. For each `Handling` element: 
    1. Looks for a `Controlled_Structure` element within the `Handling` element, throwing an error if one does not exist
    1. Prints out all identified `Marking_Structure` elements found within the `Handling` element.
    1. Runs the XPath found in the `Controlled_Structure` element using the `Controlled_Structure` element as the context root
    1. Prints a count of total XPath matches
    1. Prints all matching XML nodes (if any)

Example: ``python marking_parser.py stix_document_file.xml``
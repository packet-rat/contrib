#!/usr/bin/env python
"""
:File:
consume.py

:Description:
Converts a STIX document containing C2 IP addresses into a JSON
format.

:Inputs:
A STIX document containing C2 IP Addresses (see sample.xml for example).

:STIX Micro Use Case ID:
stix-muc-share-c2-ip-addresses
"""

import json
import argparse

from stix.core import STIXPackage
from cybox.objects.address_object import Address

def main():
    # Parse args
    parser = argparse.ArgumentParser(
        description="Parse an input STIX XML file and emit JSON representation",
        formatter_class=argparse.ArgumentDefaultsHelpFormatter )

    parser.add_argument("infile",help="input file")
    parser.add_argument("--outfile","-o", help="output file")
    args = parser.parse_args()

    # Attempt to parse input XML document. Return error if parse fails
    try:
        stix_package = STIXPackage.from_xml(args.infile)
    except:
        print "Could not parse input file as STIX XML: " + args.infile
        exit(1)

    json_out = {}

    # Collect TTP titles (C2 bot names)
    ttp_titles = {}
    for ttp in stix_package.ttps:
        ttp_titles[ttp.id_] = ttp.title

    # Collect IP addresses and associate them with the C2 bot name.
    for ind in stix_package.indicators:
        unknown_count = 1

        # Get indicated TTP. Assumes there is only one.
        indicated_ttp = ind.indicated_ttps[0]
        c2_name= ttp_titles.get(indicated_ttp.item.idref)

        # If the C2 name is None, we create a "Unknown C2 #<counter>" name
        if not c2_name:
            c2_name = "Unknown C2 #%d" % unknown_count
            unknown_count += 1

        # Walk the indicator and fetch Address instances
        for entity in ind.walk():
            if isinstance(entity, Address):
                json_out[c2_name] = entity.address_value.value

    # Convert Python dict to JSON representation
    json_out = json.dumps(json_out)

    # Output to file or stdout if no output file was given
    if args.outfile:
        fd = open(args.outfile,'w')
        fd.write(str(json_out))
    else:
        print json_out

if __name__ == '__main__':
    main()

#!/usr/bin/env python
"""
:File:
produce.py

:Description:
Converts JSON document containing C2 IP addresses into a STIX XML document.

:Inputs:
A JSON document containing C2 IP addresses and bot names (see sample.json
for example).

:STIX Micro Use Case ID:
stix-muc-share-c2-ip-addresses
"""

import json
import argparse
import warnings

from stix.indicator import Indicator
from stix.ttp import TTP
from stix.core import STIXPackage, STIXHeader
from stix.common.vocabs import PackageIntent

from cybox.objects.address_object import Address

def main():
    # get args
    parser = argparse.ArgumentParser(
        descriptio="Parse an input JSON file and output STIX XML ",
        formatter_class=argparse.ArgumentDefaultsHelpFormatter)

    parser.add_argument("infile",help="input file")
    parser.add_argument("--outfile","-o", help="output file")

    args = parser.parse_args()
    
    # We assume the input file is a flat JSON file
    # format 'bot_name':[list,of,ips]
    content = json.load(open(args.infile))
        
    # Set up STIX document
    stix_package = STIXPackage()
    stix_header = STIXHeader()
    stix_header.title = "C2 Server IP Addresses"
    stix_header.add_package_intent (PackageIntent.TERM_INDICATORS_WATCHLIST)
    stix_package.stix_header = stix_header

    # Create Indicator and TTP for each item in JSON document
    for item in content:

        # Create TTP for C2 server
        ttp = TTP()
        ttp.title = item
        stix_package.add_ttp(ttp)

        # Create Indicator for C2 IP addresses
        indicator = Indicator()
        indicator.title = "IP addresses for known C2 channel"
        indicator.description = "Bot connecting to control server"

        # Add IPs for C2 node
        addr = Address(address_value=content[item], category=Address.CAT_IPV4)
        addr.address_value.condition= "Equals"
        indicator.add_object(addr)

        # Relate Indicator and TTP
        indicator.add_indicated_ttp(TTP(idref=ttp.id_))

        # Add Indicator to STIX PAckage
        stix_package.add_indicator(indicator)

    # Output to given file
    # The context manager is just to make the output look nicer by ignoring
    # warnings from to_xml()
    with warnings.catch_warnings():
        warnings.simplefilter("ignore")
        stix_out = stix_package.to_xml()

        if args.outfile:
            fd = open(args.outfile,'w')
            fd.write(stix_out)
        else:
            print stix_out

if __name__ == '__main__':
    main()

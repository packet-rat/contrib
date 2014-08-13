#!/usr/bin/env python

import json
import argparse

from datetime import datetime
from stix.indicator import Indicator

from stix.core import STIXPackage, STIXHeader

from cybox.common import ToolInformationList, Time
from cybox.core import Observable
from cybox.objects.socket_address_object import SocketAddress


def main():
    # get args
    parser = argparse.ArgumentParser ( description = "Parse an input JSON file and output STIX XML to stdout"
    , formatter_class=argparse.ArgumentDefaultsHelpFormatter )

    parser.add_argument("infile",help="input file")
    parser.add_argument("--outfile","-o", help="input file")

    args = parser.parse_args()
    
    # we assume the input file is a flat JSON file 
    # format 'bot_name':[list,of,ips]
    content = json.load(open(args.infile))

    # DBG
    for item in content:
        print item
        print content[item]
        
    # setup stix document
    stix_package = STIXPackage()
    stix_header = STIXHeader()
    stix_header.title = "Bot Server IP addresses"
    stix_header.description = "IP addresses connecting to bot control servers "
    stix_header.add_package_intent ("Indicators - Watchlist")

    stix_package.stix_header = stix_header

    # write each bot_name as its own indicator
    for item in content:
        indicator = Indicator()
        indicator.title = "IP addresses for " + item
        indicator.description = "Bot connecting to control server"

        # add IP for each in list
        for ip in content[item]:
            sock = SocketAddress()
            sock.ip_address = ip
            sock.ip_address.condition= "Equals"

            indicator.add_object(sock)

        # finalize indicator 
        stix_package.add_indicator(indicator)

        
# output to XML or given file
    stix_out = stix_package.to_xml() 
    if args.outfile:
        fd = open(args.outfile,'w')
        fd.write(stix_out)
    else:
        print stix_out

if __name__ == '__main__':
    main()

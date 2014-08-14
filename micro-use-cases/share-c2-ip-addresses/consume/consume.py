#!/usr/bin/env python

import json
import argparse

from stix.core import STIXPackage

def main():
    # get args
    parser = argparse.ArgumentParser ( description = "Parse an input STIX XML file and emit JSON file to stdout"
    , formatter_class=argparse.ArgumentDefaultsHelpFormatter )

    parser.add_argument("infile",help="input file")
    parser.add_argument("--outfile","-o", help="output file")

    args = parser.parse_args()

    # assume input file is XML
    try:
        stix_package = STIXPackage.from_xml(open(args.infile))
    except:
        print "Could not parse input file as STIX XML: " + args.infile
        exit(1)


    json_out = {}
    # parse out data from stix
    for ind in stix_package.indicators:
        json_out[ind.title] = []

        for obs in ind.observables:
            obs = obs.to_dict()
            for thing in obs['observable_composition']['observables']:
                json_out[ind.title].append(thing['object']['properties']['ip_address']['address_value']['value'])

    # convert dict to json array
    json_out = json.dumps(json_out)

# output to given file
    if args.outfile:
        fd = open(args.outfile,'w')
        fd.write(str(json_out))
    else:
        print json_out

if __name__ == '__main__':
    main()

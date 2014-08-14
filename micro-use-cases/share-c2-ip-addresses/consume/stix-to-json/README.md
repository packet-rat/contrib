Sharing C2 IP Addresses: STIX-to-JSON
=====================================

Converts a STIX XML document which contains C2 IP Address information into a
JSON representation.

## Installation
`pip install -r requirements.txt`

## Usage
To generate a C2 IP Address JSON document from a STIX XML document:  
``$ consume.py  infile [-o outfile]``

###Example
``$ consume.py sample.xml -o c2_ip_addresses.json``


**Note:** If no output file is specified, `consume.py` will output to `stdout`.

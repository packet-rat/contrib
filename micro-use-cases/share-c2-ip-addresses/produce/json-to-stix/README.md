Sharing C2 IP Addresses: JSON-to-STIX
=====================================
Converts a JSON document which contains C2 IP Address information into a STIX
XML representation.

# Installation
`pip install -r requirements.txt`

# Expected JSON Format
The expected input JSON format looks like:

```
{
  "Bot1 C2": ["1.2.3.4","5.6.7.8"],
  "Bot2 C2": ["192.168.1.1","10.0.1.1","172.50.50.3"]
}
```

# Usage
To generate a STIX document from a JSON file: ``$ produce.py  infile [-o outfile]``

## Example:
``$ produce.py sample.json -o stix_c2_ip_addresses.xml``

**Note:** If no output file is specified, `produce.py` will output to `stdout`.



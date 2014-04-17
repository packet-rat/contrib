//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.04.17 at 04:06:30 PM EDT 
//


package org.mitre.cybox.objects;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CategoryTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CategoryTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="asn"/>
 *     &lt;enumeration value="atm"/>
 *     &lt;enumeration value="cidr"/>
 *     &lt;enumeration value="e-mail"/>
 *     &lt;enumeration value="mac"/>
 *     &lt;enumeration value="ipv4-addr"/>
 *     &lt;enumeration value="ipv4-net"/>
 *     &lt;enumeration value="ipv4-net-mask"/>
 *     &lt;enumeration value="ipv6-addr"/>
 *     &lt;enumeration value="ipv6-net"/>
 *     &lt;enumeration value="ipv6-net-mask"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CategoryTypeEnum", namespace = "http://cybox.mitre.org/objects#AddressObject-2")
@XmlEnum
public enum CategoryTypeEnum {


    /**
     * The asn value specifies an identifier for an Autonomous System Number.
     * 
     */
    @XmlEnumValue("asn")
    ASN("asn"),

    /**
     * The atm value specifies an Asynchronous Transfer Mode address.
     * 
     */
    @XmlEnumValue("atm")
    ATM("atm"),

    /**
     * The CIDR value specifies an address in Classless Inter-domain Routing notation (the IP address and its associated routing prefix).
     * 
     */
    @XmlEnumValue("cidr")
    CIDR("cidr"),

    /**
     * The e-mail value specifies an e-mail address.
     * 
     */
    @XmlEnumValue("e-mail")
    E_MAIL("e-mail"),

    /**
     * The mac value specifies a system's MAC address.
     * 
     */
    @XmlEnumValue("mac")
    MAC("mac"),

    /**
     * The IPV4-addr value specifies an IPV4 address.
     * 
     */
    @XmlEnumValue("ipv4-addr")
    IPV_4_ADDR("ipv4-addr"),
    @XmlEnumValue("ipv4-net")
    IPV_4_NET("ipv4-net"),

    /**
     * The IPV4-net-mask value specifies an IPV4 bitwise netmask.
     * 
     */
    @XmlEnumValue("ipv4-net-mask")
    IPV_4_NET_MASK("ipv4-net-mask"),

    /**
     * The IPV6-addr value specifies an IPV6 address.
     * 
     */
    @XmlEnumValue("ipv6-addr")
    IPV_6_ADDR("ipv6-addr"),
    @XmlEnumValue("ipv6-net")
    IPV_6_NET("ipv6-net"),

    /**
     * The IPV6-net-mask value specifies an IPV6 bitwise netmask.
     * 
     */
    @XmlEnumValue("ipv6-net-mask")
    IPV_6_NET_MASK("ipv6-net-mask");
    private final String value;

    CategoryTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CategoryTypeEnum fromValue(String v) {
        for (CategoryTypeEnum c: CategoryTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

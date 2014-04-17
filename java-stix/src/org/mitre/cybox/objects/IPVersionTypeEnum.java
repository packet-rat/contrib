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
 * <p>Java class for IPVersionTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="IPVersionTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="IPv4(4)"/>
 *     &lt;enumeration value="ST(5)"/>
 *     &lt;enumeration value="IPv6(6)"/>
 *     &lt;enumeration value="TP/IX(7)"/>
 *     &lt;enumeration value="PIP(8)"/>
 *     &lt;enumeration value="TUBA(9)"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "IPVersionTypeEnum")
@XmlEnum
public enum IPVersionTypeEnum {


    /**
     * Indicates IP Version 4.
     * 
     */
    @XmlEnumValue("IPv4(4)")
    I_PV_4_4("IPv4(4)"),

    /**
     * Indicates the IP version designating ST Datagram Mode.
     * 
     */
    @XmlEnumValue("ST(5)")
    ST_5("ST(5)"),

    /**
     * Indicates IP Version 6.
     * 
     */
    @XmlEnumValue("IPv6(6)")
    I_PV_6_6("IPv6(6)"),

    /**
     * Indicates the IP version designating TP/IX: The Next Internet.
     * 
     */
    @XmlEnumValue("TP/IX(7)")
    TP_IX_7("TP/IX(7)"),

    /**
     * Indicates the IP version designating PIP: The P Internet Protocol.
     * 
     */
    @XmlEnumValue("PIP(8)")
    PIP_8("PIP(8)"),

    /**
     * Indicates the IP version designating TUBA (TCP and UDP with Bigger Addresses, i.e. RFC 1347).
     * 
     */
    @XmlEnumValue("TUBA(9)")
    TUBA_9("TUBA(9)");
    private final String value;

    IPVersionTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static IPVersionTypeEnum fromValue(String v) {
        for (IPVersionTypeEnum c: IPVersionTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

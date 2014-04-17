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
 * <p>Java class for IPv6DoNotRecogActionTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="IPv6DoNotRecogActionTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="skipoption(00)"/>
 *     &lt;enumeration value="discardpacket(01)"/>
 *     &lt;enumeration value="discardpacketsendicmpcode2(10)"/>
 *     &lt;enumeration value="discardpacketsendicmpcode2nomulti(11)"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "IPv6DoNotRecogActionTypeEnum")
@XmlEnum
public enum IPv6DoNotRecogActionTypeEnum {


    /**
     * Indicates that the option should be skipped and the header should continue to be processed. See RFC 2460.
     * 
     */
    @XmlEnumValue("skipoption(00)")
    SKIPOPTION_00("skipoption(00)"),

    /**
     * Indicates that the packet should be discarded. See RFC 2460.
     * 
     */
    @XmlEnumValue("discardpacket(01)")
    DISCARDPACKET_01("discardpacket(01)"),

    /**
     * Indicates that the packet should be discarded and regardless of whether or not the packet's Destination Address was a multicast address, send an ICMP Parameter Problem, Code 2, message to the packet's Source Address, pointing to the unrecognized Option Type. See RFC 2460.
     * 
     */
    @XmlEnumValue("discardpacketsendicmpcode2(10)")
    DISCARDPACKETSENDICMPCODE_2_10("discardpacketsendicmpcode2(10)"),

    /**
     * Indicates that the packet should be discarded and only if the packet's Destination Address was not a multicast address, send an ICMP Parameter Problem, Code 2, message to the packet's Source Address, pointing to the unrecognized Option Type. See RFC 2460.
     * 
     */
    @XmlEnumValue("discardpacketsendicmpcode2nomulti(11)")
    DISCARDPACKETSENDICMPCODE_2_NOMULTI_11("discardpacketsendicmpcode2nomulti(11)");
    private final String value;

    IPv6DoNotRecogActionTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static IPv6DoNotRecogActionTypeEnum fromValue(String v) {
        for (IPv6DoNotRecogActionTypeEnum c: IPv6DoNotRecogActionTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
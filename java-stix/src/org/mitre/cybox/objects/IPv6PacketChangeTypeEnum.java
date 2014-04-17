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
 * <p>Java class for IPv6PacketChangeTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="IPv6PacketChangeTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="nochange(0)"/>
 *     &lt;enumeration value="change(1)"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "IPv6PacketChangeTypeEnum")
@XmlEnum
public enum IPv6PacketChangeTypeEnum {


    /**
     * Indicates that the packet does not change en-route. See RFC 2460.
     * 
     */
    @XmlEnumValue("nochange(0)")
    NOCHANGE_0("nochange(0)"),

    /**
     * Indicates that the packet may change en-route. See RFC 2460.
     * 
     */
    @XmlEnumValue("change(1)")
    CHANGE_1("change(1)");
    private final String value;

    IPv6PacketChangeTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static IPv6PacketChangeTypeEnum fromValue(String v) {
        for (IPv6PacketChangeTypeEnum c: IPv6PacketChangeTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

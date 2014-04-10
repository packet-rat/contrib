//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.04.09 at 05:02:22 PM EDT 
//


package org.mitre.maec.xmlschema.maec_package_2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Layer4ProtocolEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Layer4ProtocolEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="tcp"/>
 *     &lt;enumeration value="udp"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Layer4ProtocolEnum")
@XmlEnum
public enum Layer4ProtocolEnum {


    /**
     * The tcp value specifies the Transport Control Protocol (TCP). 
     * 
     */
    @XmlEnumValue("tcp")
    TCP("tcp"),

    /**
     * The udp value specifies the User Datagram Protocol (UDP). 
     * 
     */
    @XmlEnumValue("udp")
    UDP("udp");
    private final String value;

    Layer4ProtocolEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Layer4ProtocolEnum fromValue(String v) {
        for (Layer4ProtocolEnum c: Layer4ProtocolEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
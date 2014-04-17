//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.04.17 at 04:06:30 PM EDT 
//


package org.mitre.capec.capec_2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Status_Type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Status_Type">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;whiteSpace value="collapse"/>
 *     &lt;enumeration value="Deprecated"/>
 *     &lt;enumeration value="Incomplete"/>
 *     &lt;enumeration value="Draft"/>
 *     &lt;enumeration value="Usable"/>
 *     &lt;enumeration value="Stable"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Status_Type")
@XmlEnum
public enum StatusType {

    @XmlEnumValue("Deprecated")
    DEPRECATED("Deprecated"),
    @XmlEnumValue("Incomplete")
    INCOMPLETE("Incomplete"),
    @XmlEnumValue("Draft")
    DRAFT("Draft"),
    @XmlEnumValue("Usable")
    USABLE("Usable"),
    @XmlEnumValue("Stable")
    STABLE("Stable");
    private final String value;

    StatusType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static StatusType fromValue(String v) {
        for (StatusType c: StatusType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

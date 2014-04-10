//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.04.08 at 09:40:17 PM EDT 
//


package org.mitre.stix.default_vocabularies_1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LocationClassEnum-1.0.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LocationClassEnum-1.0">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Internally-Located"/>
 *     &lt;enumeration value="Externally-Located"/>
 *     &lt;enumeration value="Co-Located"/>
 *     &lt;enumeration value="Mobile"/>
 *     &lt;enumeration value="Unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LocationClassEnum-1.0")
@XmlEnum
public enum LocationClassEnum10 {


    /**
     * The asset is located internally.
     * 
     */
    @XmlEnumValue("Internally-Located")
    INTERNALLY_LOCATED("Internally-Located"),

    /**
     * The asset is located externally.
     * 
     */
    @XmlEnumValue("Externally-Located")
    EXTERNALLY_LOCATED("Externally-Located"),

    /**
     * The asset is co-located.
     * 
     */
    @XmlEnumValue("Co-Located")
    CO_LOCATED("Co-Located"),

    /**
     * The asset is mobile.
     * 
     */
    @XmlEnumValue("Mobile")
    MOBILE("Mobile"),

    /**
     * The asset location is unknown.
     * 
     */
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown");
    private final String value;

    LocationClassEnum10(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LocationClassEnum10 fromValue(String v) {
        for (LocationClassEnum10 c: LocationClassEnum10 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

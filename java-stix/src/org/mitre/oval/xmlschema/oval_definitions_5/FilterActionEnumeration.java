//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.04.17 at 04:06:30 PM EDT 
//


package org.mitre.oval.xmlschema.oval_definitions_5;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FilterActionEnumeration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FilterActionEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="exclude"/>
 *     &lt;enumeration value="include"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FilterActionEnumeration")
@XmlEnum
public enum FilterActionEnumeration {


    /**
     * The exclude value specifies that all items that match the filter shall be excluded from set that the filter is applied to.
     * 
     */
    @XmlEnumValue("exclude")
    EXCLUDE("exclude"),

    /**
     * The include value specifies that only items that match the filter shall be included in the set that the filter is applied to.
     * 
     */
    @XmlEnumValue("include")
    INCLUDE("include");
    private final String value;

    FilterActionEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FilterActionEnumeration fromValue(String v) {
        for (FilterActionEnumeration c: FilterActionEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
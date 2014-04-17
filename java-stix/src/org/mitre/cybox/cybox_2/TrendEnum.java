//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.04.17 at 04:06:30 PM EDT 
//


package org.mitre.cybox.cybox_2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TrendEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TrendEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Increasing"/>
 *     &lt;enumeration value="Decreasing"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TrendEnum")
@XmlEnum
public enum TrendEnum {


    /**
     * Specifies an increasing trend.
     * 
     */
    @XmlEnumValue("Increasing")
    INCREASING("Increasing"),

    /**
     * Specifies a decreasing trend.
     * 
     */
    @XmlEnumValue("Decreasing")
    DECREASING("Decreasing");
    private final String value;

    TrendEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TrendEnum fromValue(String v) {
        for (TrendEnum c: TrendEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

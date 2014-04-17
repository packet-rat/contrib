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
 * <p>Java class for PDFObjectTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PDFObjectTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Boolean"/>
 *     &lt;enumeration value="Integer"/>
 *     &lt;enumeration value="String"/>
 *     &lt;enumeration value="Name"/>
 *     &lt;enumeration value="Array"/>
 *     &lt;enumeration value="Dictionary"/>
 *     &lt;enumeration value="Stream"/>
 *     &lt;enumeration value="Null"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PDFObjectTypeEnum", namespace = "http://cybox.mitre.org/objects#PDFFileObject-1")
@XmlEnum
public enum PDFObjectTypeEnum {

    @XmlEnumValue("Boolean")
    BOOLEAN("Boolean"),
    @XmlEnumValue("Integer")
    INTEGER("Integer"),
    @XmlEnumValue("String")
    STRING("String"),
    @XmlEnumValue("Name")
    NAME("Name"),
    @XmlEnumValue("Array")
    ARRAY("Array"),
    @XmlEnumValue("Dictionary")
    DICTIONARY("Dictionary"),
    @XmlEnumValue("Stream")
    STREAM("Stream"),
    @XmlEnumValue("Null")
    NULL("Null");
    private final String value;

    PDFObjectTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PDFObjectTypeEnum fromValue(String v) {
        for (PDFObjectTypeEnum c: PDFObjectTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
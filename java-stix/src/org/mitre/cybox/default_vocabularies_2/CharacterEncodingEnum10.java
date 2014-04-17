//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.04.17 at 04:06:30 PM EDT 
//


package org.mitre.cybox.default_vocabularies_2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CharacterEncodingEnum-1.0.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CharacterEncodingEnum-1.0">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ASCII"/>
 *     &lt;enumeration value="UTF-8"/>
 *     &lt;enumeration value="UTF-16"/>
 *     &lt;enumeration value="UTF-32"/>
 *     &lt;enumeration value="Windows-1250"/>
 *     &lt;enumeration value="Windows-1251"/>
 *     &lt;enumeration value="Windows-1252"/>
 *     &lt;enumeration value="Windows-1253"/>
 *     &lt;enumeration value="Windows-1254"/>
 *     &lt;enumeration value="Windows-1255"/>
 *     &lt;enumeration value="Windows-1256"/>
 *     &lt;enumeration value="Windows-1257"/>
 *     &lt;enumeration value="Windows-1258"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CharacterEncodingEnum-1.0")
@XmlEnum
public enum CharacterEncodingEnum10 {


    /**
     * Specifies the American Standard Code for Information Interchange (ASCII) character encoding scheme.
     * 
     */
    ASCII("ASCII"),

    /**
     * Specifies the UCS Transformation Format-8 bit (UTF-8) character encoding scheme.
     * 
     */
    @XmlEnumValue("UTF-8")
    UTF_8("UTF-8"),

    /**
     * Specifies the UCS Transformation Format-16 bit (UTF-16) character encoding scheme.
     * 
     */
    @XmlEnumValue("UTF-16")
    UTF_16("UTF-16"),

    /**
     * Specifies the UCS Transformation Format-32 bit (UTF-32) character encoding scheme.
     * 
     */
    @XmlEnumValue("UTF-32")
    UTF_32("UTF-32"),

    /**
     * Specifies the Windows-1250 character encoding scheme, for Central European languages.
     * 
     */
    @XmlEnumValue("Windows-1250")
    WINDOWS_1250("Windows-1250"),

    /**
     * Specifies the Windows-1251 character encoding scheme, for Cyrillic alphabets.
     * 
     */
    @XmlEnumValue("Windows-1251")
    WINDOWS_1251("Windows-1251"),

    /**
     * Specifies the Windows-1252 character encoding scheme, for Western languages.
     * 
     */
    @XmlEnumValue("Windows-1252")
    WINDOWS_1252("Windows-1252"),

    /**
     * Specifies the Windows-1253 character encoding scheme, for Greek.
     * 
     */
    @XmlEnumValue("Windows-1253")
    WINDOWS_1253("Windows-1253"),

    /**
     * Specifies the Windows-1254 character encoding scheme, for Turkish.
     * 
     */
    @XmlEnumValue("Windows-1254")
    WINDOWS_1254("Windows-1254"),

    /**
     * Specifies the Windows-1255 character encoding scheme, for Hebrew.
     * 
     */
    @XmlEnumValue("Windows-1255")
    WINDOWS_1255("Windows-1255"),

    /**
     * Specifies the Windows-1256 character encoding scheme, for Arabic.
     * 
     */
    @XmlEnumValue("Windows-1256")
    WINDOWS_1256("Windows-1256"),

    /**
     * Specifies the Windows-1257 character encoding scheme, for Baltic languages.
     * 
     */
    @XmlEnumValue("Windows-1257")
    WINDOWS_1257("Windows-1257"),

    /**
     * Specifies the Windows-1258 character encoding scheme, for Vietnamese.
     * 
     */
    @XmlEnumValue("Windows-1258")
    WINDOWS_1258("Windows-1258");
    private final String value;

    CharacterEncodingEnum10(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CharacterEncodingEnum10 fromValue(String v) {
        for (CharacterEncodingEnum10 c: CharacterEncodingEnum10 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.04.09 at 05:02:22 PM EDT 
//


package org.mitre.cybox.common_2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CompensationModelEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CompensationModelEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Freeware"/>
 *     &lt;enumeration value="Shareware"/>
 *     &lt;enumeration value="Commercial"/>
 *     &lt;enumeration value="Adware"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CompensationModelEnum")
@XmlEnum
public enum CompensationModelEnum {


    /**
     * Specifies that the tool is available for use at no monetary cost as the compensation model.
     * 
     */
    @XmlEnumValue("Freeware")
    FREEWARE("Freeware"),

    /**
     * Specifies that the tool is proprietary and offers a limited use license as the compensation model.
     * 
     */
    @XmlEnumValue("Shareware")
    SHAREWARE("Shareware"),

    /**
     * Specifies that the tool is produced for sale or serves commercial purposes as the compensation model.
     * 
     */
    @XmlEnumValue("Commercial")
    COMMERCIAL("Commercial"),

    /**
     * Specifies that the tool uses automatically rendered advertisements as the compensation model.
     * 
     */
    @XmlEnumValue("Adware")
    ADWARE("Adware");
    private final String value;

    CompensationModelEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CompensationModelEnum fromValue(String v) {
        for (CompensationModelEnum c: CompensationModelEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

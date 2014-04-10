//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.04.09 at 05:02:22 PM EDT 
//


package org.icasi.cvrf.schema.prod._1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RelationTypeEnumType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RelationTypeEnumType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Default Component Of"/>
 *     &lt;enumeration value="Optional Component Of"/>
 *     &lt;enumeration value="External Component Of"/>
 *     &lt;enumeration value="Installed On"/>
 *     &lt;enumeration value="Installed With"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RelationTypeEnumType")
@XmlEnum
public enum RelationTypeEnumType {


    /**
     * This product is a default component of the referenced product.
     * 
     */
    @XmlEnumValue("Default Component Of")
    DEFAULT_COMPONENT_OF("Default Component Of"),

    /**
     * This product is an optional component of the referenced product.
     * 
     */
    @XmlEnumValue("Optional Component Of")
    OPTIONAL_COMPONENT_OF("Optional Component Of"),

    /**
     * This product is an external component of the referenced product.
     * 
     */
    @XmlEnumValue("External Component Of")
    EXTERNAL_COMPONENT_OF("External Component Of"),

    /**
     * This product is installed on the referenced product.
     * 
     */
    @XmlEnumValue("Installed On")
    INSTALLED_ON("Installed On"),

    /**
     * This product is installed with the referenced product.
     * 
     */
    @XmlEnumValue("Installed With")
    INSTALLED_WITH("Installed With");
    private final String value;

    RelationTypeEnumType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RelationTypeEnumType fromValue(String v) {
        for (RelationTypeEnumType c: RelationTypeEnumType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

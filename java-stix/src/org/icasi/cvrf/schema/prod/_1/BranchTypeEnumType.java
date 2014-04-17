//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.04.17 at 04:06:30 PM EDT 
//


package org.icasi.cvrf.schema.prod._1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BranchTypeEnumType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BranchTypeEnumType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Vendor"/>
 *     &lt;enumeration value="Product Family"/>
 *     &lt;enumeration value="Product Name"/>
 *     &lt;enumeration value="Product Version"/>
 *     &lt;enumeration value="Patch Level"/>
 *     &lt;enumeration value="Service Pack"/>
 *     &lt;enumeration value="Architecture"/>
 *     &lt;enumeration value="Language"/>
 *     &lt;enumeration value="Legacy"/>
 *     &lt;enumeration value="Specification"/>
 *     &lt;enumeration value="Host Name"/>
 *     &lt;enumeration value="Realm"/>
 *     &lt;enumeration value="Resource"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "BranchTypeEnumType")
@XmlEnum
public enum BranchTypeEnumType {


    /**
     * The name of the vendor or manufacturer that makes the product .
     * 
     */
    @XmlEnumValue("Vendor")
    VENDOR("Vendor"),

    /**
     * The product family that the product falls into.
     * 
     */
    @XmlEnumValue("Product Family")
    PRODUCT_FAMILY("Product Family"),

    /**
     * The name of the product.
     * 
     */
    @XmlEnumValue("Product Name")
    PRODUCT_NAME("Product Name"),

    /**
     * The version of the product. This can be a numeric or other descriptor.
     * 
     */
    @XmlEnumValue("Product Version")
    PRODUCT_VERSION("Product Version"),

    /**
     * The patch level of the product.
     * 
     */
    @XmlEnumValue("Patch Level")
    PATCH_LEVEL("Patch Level"),

    /**
     * The service pack of the product.
     * 
     */
    @XmlEnumValue("Service Pack")
    SERVICE_PACK("Service Pack"),

    /**
     * The architecture for which the product is intended.
     * 
     */
    @XmlEnumValue("Architecture")
    ARCHITECTURE("Architecture"),

    /**
     * The language of the product.
     * 
     */
    @XmlEnumValue("Language")
    LANGUAGE("Language"),

    /**
     * A non-specific legacy entry.
     * 
     */
    @XmlEnumValue("Legacy")
    LEGACY("Legacy"),

    /**
     * A specification such as a standard, best common practice, etc.
     * 
     */
    @XmlEnumValue("Specification")
    SPECIFICATION("Specification"),

    /**
     * The host name of a system/service.
     * 
     */
    @XmlEnumValue("Host Name")
    HOST_NAME("Host Name"),

    /**
     * The URI component of a system/service.
     * 
     */
    @XmlEnumValue("Realm")
    REALM("Realm"),

    /**
     * The file name component of a system/service.
     * 
     */
    @XmlEnumValue("Resource")
    RESOURCE("Resource");
    private final String value;

    BranchTypeEnumType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BranchTypeEnumType fromValue(String v) {
        for (BranchTypeEnumType c: BranchTypeEnumType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

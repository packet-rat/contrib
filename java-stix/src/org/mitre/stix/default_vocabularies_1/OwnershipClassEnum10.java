//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.04.17 at 04:06:30 PM EDT 
//


package org.mitre.stix.default_vocabularies_1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OwnershipClassEnum-1.0.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OwnershipClassEnum-1.0">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Internally-Owned"/>
 *     &lt;enumeration value="Employee-Owned"/>
 *     &lt;enumeration value="Partner-Owned"/>
 *     &lt;enumeration value="Customer-Owned"/>
 *     &lt;enumeration value="Unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "OwnershipClassEnum-1.0")
@XmlEnum
public enum OwnershipClassEnum10 {


    /**
     * The asset is owned internally.
     * 
     */
    @XmlEnumValue("Internally-Owned")
    INTERNALLY_OWNED("Internally-Owned"),

    /**
     * The asset is owned by an employee.
     * 
     */
    @XmlEnumValue("Employee-Owned")
    EMPLOYEE_OWNED("Employee-Owned"),

    /**
     * The asset is owned by a partner.
     * 
     */
    @XmlEnumValue("Partner-Owned")
    PARTNER_OWNED("Partner-Owned"),

    /**
     * The asset is owned by a customer.
     * 
     */
    @XmlEnumValue("Customer-Owned")
    CUSTOMER_OWNED("Customer-Owned"),

    /**
     * The asset ownership class is unknown.
     * 
     */
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown");
    private final String value;

    OwnershipClassEnum10(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OwnershipClassEnum10 fromValue(String v) {
        for (OwnershipClassEnum10 c: OwnershipClassEnum10 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

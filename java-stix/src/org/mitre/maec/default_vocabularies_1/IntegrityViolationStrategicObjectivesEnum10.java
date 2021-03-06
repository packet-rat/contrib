//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.04.17 at 04:06:30 PM EDT 
//


package org.mitre.maec.default_vocabularies_1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IntegrityViolationStrategicObjectivesEnum-1.0.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="IntegrityViolationStrategicObjectivesEnum-1.0">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="compromise system operational integrity"/>
 *     &lt;enumeration value="compromise user data integrity"/>
 *     &lt;enumeration value="annoy user"/>
 *     &lt;enumeration value="compromise network operational integrity"/>
 *     &lt;enumeration value="compromise system data integrity"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "IntegrityViolationStrategicObjectivesEnum-1.0")
@XmlEnum
public enum IntegrityViolationStrategicObjectivesEnum10 {


    /**
     * The 'compromise system operational integrity' value indicates that the malware instance is able to compromise the operational integrity of a system.
     * 
     */
    @XmlEnumValue("compromise system operational integrity")
    COMPROMISE_SYSTEM_OPERATIONAL_INTEGRITY("compromise system operational integrity"),

    /**
     * The 'compromise user data integrity' value indicates that the malware instance is able to compromise a system's user data.
     * 
     */
    @XmlEnumValue("compromise user data integrity")
    COMPROMISE_USER_DATA_INTEGRITY("compromise user data integrity"),

    /**
     * The 'annoy user' value indicates that the malware instance is able to annoy the users of a system.
     * 
     */
    @XmlEnumValue("annoy user")
    ANNOY_USER("annoy user"),

    /**
     * The 'compromise network operational integrity' value indicates that the malware instance is able to compromise the operational integrity of a network. 
     * 
     */
    @XmlEnumValue("compromise network operational integrity")
    COMPROMISE_NETWORK_OPERATIONAL_INTEGRITY("compromise network operational integrity"),

    /**
     * The 'compromise system data integrity' value indicates that the malware instance is able to compromise the integrity of a system's data.
     * 
     */
    @XmlEnumValue("compromise system data integrity")
    COMPROMISE_SYSTEM_DATA_INTEGRITY("compromise system data integrity");
    private final String value;

    IntegrityViolationStrategicObjectivesEnum10(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static IntegrityViolationStrategicObjectivesEnum10 fromValue(String v) {
        for (IntegrityViolationStrategicObjectivesEnum10 c: IntegrityViolationStrategicObjectivesEnum10 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.04.09 at 05:02:22 PM EDT 
//


package org.mitre.maec.default_vocabularies_1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SecurityDegradationStrategicObjectivesEnum-1.0.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SecurityDegradationStrategicObjectivesEnum-1.0">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="disable service provider security features"/>
 *     &lt;enumeration value="degrade security programs"/>
 *     &lt;enumeration value="disable system updates"/>
 *     &lt;enumeration value="disable os security features"/>
 *     &lt;enumeration value="disable [host-based or os] access controls"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SecurityDegradationStrategicObjectivesEnum-1.0")
@XmlEnum
public enum SecurityDegradationStrategicObjectivesEnum10 {


    /**
     * The 'disable service provider security features' value indicates that the malware instance is able to bypass or disable third-party security features that would otherwise identify or notify users of its presence.
     * 
     */
    @XmlEnumValue("disable service provider security features")
    DISABLE_SERVICE_PROVIDER_SECURITY_FEATURES("disable service provider security features"),

    /**
     * The 'degrade security programs' value indicates that the malware instance is able to degrade security programs running on a system, either by stopping them from executing or by making changes to their code or configuration parameters.
     * 
     */
    @XmlEnumValue("degrade security programs")
    DEGRADE_SECURITY_PROGRAMS("degrade security programs"),

    /**
     * The 'disable system updates' values indicates that the malware instance is able to disable the downloading and installation of system updates.
     * 
     */
    @XmlEnumValue("disable system updates")
    DISABLE_SYSTEM_UPDATES("disable system updates"),

    /**
     * The 'disable os security features' value indicates that the malware instance is able to bypass inherent operating system security mechanisms that typically involve elevated privileges.
     * 
     */
    @XmlEnumValue("disable os security features")
    DISABLE_OS_SECURITY_FEATURES("disable os security features"),

    /**
     * The 'disable access controls' value indicates that the malware instance is able to bypass access control mechanisms designed to prevent unauthorized or unprivileged use or execution of applications or files.
     * 
     */
    @XmlEnumValue("disable [host-based or os] access controls")
    DISABLE_HOST_BASED_OR_OS_ACCESS_CONTROLS("disable [host-based or os] access controls");
    private final String value;

    SecurityDegradationStrategicObjectivesEnum10(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SecurityDegradationStrategicObjectivesEnum10 fromValue(String v) {
        for (SecurityDegradationStrategicObjectivesEnum10 c: SecurityDegradationStrategicObjectivesEnum10 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
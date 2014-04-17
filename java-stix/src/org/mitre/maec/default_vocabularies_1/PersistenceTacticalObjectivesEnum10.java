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
 * <p>Java class for PersistenceTacticalObjectivesEnum-1.0.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PersistenceTacticalObjectivesEnum-1.0">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="reinstantiate self after initial detection"/>
 *     &lt;enumeration value="limit application type/version"/>
 *     &lt;enumeration value="persist after os install/reinstall"/>
 *     &lt;enumeration value="drop/retrieve debug log file"/>
 *     &lt;enumeration value="persist independent of hard disk/os changes"/>
 *     &lt;enumeration value="persist after system reboot"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PersistenceTacticalObjectivesEnum-1.0")
@XmlEnum
public enum PersistenceTacticalObjectivesEnum10 {


    /**
     * The 'reinstantiate self after initial detection' value indicates that the malware instance is able to re-establish itself on the system after it is initially detected.
     * 
     */
    @XmlEnumValue("reinstantiate self after initial detection")
    REINSTANTIATE_SELF_AFTER_INITIAL_DETECTION("reinstantiate self after initial detection"),

    /**
     * The 'limit application type/version' value indicates that the malware instance is able to limit the type or version of an application that runs on a system in order to ensure that it is able to continue executing.
     * 
     */
    @XmlEnumValue("limit application type/version")
    LIMIT_APPLICATION_TYPE_VERSION("limit application type/version"),

    /**
     * The 'persist after os install/reinstall' value indicates that the malware instance is able to continue to execute after the operating system is installed or reinstalled.
     * 
     */
    @XmlEnumValue("persist after os install/reinstall")
    PERSIST_AFTER_OS_INSTALL_REINSTALL("persist after os install/reinstall"),

    /**
     * The 'drop/retrieve debug log file' value indicates that the malware instance is able to generate and retrieve a log file of errors associated with the malware.
     * 
     */
    @XmlEnumValue("drop/retrieve debug log file")
    DROP_RETRIEVE_DEBUG_LOG_FILE("drop/retrieve debug log file"),

    /**
     * The 'persist independent of hard disk/os changes' value indicates that the malware instance is able to continue to execute after changes to the hard disk or the operating system have been made.
     * 
     */
    @XmlEnumValue("persist independent of hard disk/os changes")
    PERSIST_INDEPENDENT_OF_HARD_DISK_OS_CHANGES("persist independent of hard disk/os changes"),

    /**
     * The 'persist after system reboot' value indicates that the malware instance is able to continue to execute after a system reboot.
     * 
     */
    @XmlEnumValue("persist after system reboot")
    PERSIST_AFTER_SYSTEM_REBOOT("persist after system reboot");
    private final String value;

    PersistenceTacticalObjectivesEnum10(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PersistenceTacticalObjectivesEnum10 fromValue(String v) {
        for (PersistenceTacticalObjectivesEnum10 c: PersistenceTacticalObjectivesEnum10 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

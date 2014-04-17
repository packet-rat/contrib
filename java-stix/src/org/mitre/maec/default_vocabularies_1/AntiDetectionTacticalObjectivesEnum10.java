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
 * <p>Java class for AntiDetectionTacticalObjectivesEnum-1.0.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AntiDetectionTacticalObjectivesEnum-1.0">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="hide open network ports"/>
 *     &lt;enumeration value="execute before/external to kernel/hypervisor"/>
 *     &lt;enumeration value="encrypt self"/>
 *     &lt;enumeration value="hide processes"/>
 *     &lt;enumeration value="hide network traffic"/>
 *     &lt;enumeration value="change/add content"/>
 *     &lt;enumeration value="execute stealthy code"/>
 *     &lt;enumeration value="hide registry artifacts"/>
 *     &lt;enumeration value="hide userspace libraries"/>
 *     &lt;enumeration value="hide arbitrary virtual memory"/>
 *     &lt;enumeration value="execute non-main cpu code"/>
 *     &lt;enumeration value="feed misinformation during physical memory acquisition"/>
 *     &lt;enumeration value="prevent physical memory acquisition"/>
 *     &lt;enumeration value="prevent native api hooking"/>
 *     &lt;enumeration value="obfuscate artifact properties"/>
 *     &lt;enumeration value="hide kernel modules"/>
 *     &lt;enumeration value="hide code in file"/>
 *     &lt;enumeration value="hide services"/>
 *     &lt;enumeration value="hide file system artifacts"/>
 *     &lt;enumeration value="hide threads"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AntiDetectionTacticalObjectivesEnum-1.0")
@XmlEnum
public enum AntiDetectionTacticalObjectivesEnum10 {


    /**
     * The 'hide open network ports' value indicates that the malware instance is able to hide its open network ports.
     * 
     */
    @XmlEnumValue("hide open network ports")
    HIDE_OPEN_NETWORK_PORTS("hide open network ports"),

    /**
     * The 'execute before/external to kernel/hypervisor' value indicates that the malware instance is able to execute some or all of its code before or external to the system's kernel or hypervisor (e.g., through the BIOS).
     * 
     */
    @XmlEnumValue("execute before/external to kernel/hypervisor")
    EXECUTE_BEFORE_EXTERNAL_TO_KERNEL_HYPERVISOR("execute before/external to kernel/hypervisor"),

    /**
     * The 'encrypt self' value indicates that the malware is able to encrypt itself.
     * 
     */
    @XmlEnumValue("encrypt self")
    ENCRYPT_SELF("encrypt self"),

    /**
     * The 'hide processes' value indicates that the malware instance is able to hide its processes.
     * 
     */
    @XmlEnumValue("hide processes")
    HIDE_PROCESSES("hide processes"),

    /**
     * The 'hide network traffic' value indicates that the malware instance is able to hide its network traffic.
     * 
     */
    @XmlEnumValue("hide network traffic")
    HIDE_NETWORK_TRAFFIC("hide network traffic"),

    /**
     * The 'change/add content' value indicates that the malware instance is able to change or add to its content.
     * 
     */
    @XmlEnumValue("change/add content")
    CHANGE_ADD_CONTENT("change/add content"),

    /**
     * The 'execute stealthy code' value indicates that the malware instance is able to execute some or all of its code in a hidden manner (e.g., by injecting it into a benign process).
     * 
     */
    @XmlEnumValue("execute stealthy code")
    EXECUTE_STEALTHY_CODE("execute stealthy code"),

    /**
     * The 'hide registry artifacts' value indicates that the malware instance is able to hide its Windows registry artifacts.
     * 
     */
    @XmlEnumValue("hide registry artifacts")
    HIDE_REGISTRY_ARTIFACTS("hide registry artifacts"),

    /**
     * The 'hide userspace libraries' value indicates that the malware instance is able to hide its usage of userspace libraries.
     * 
     */
    @XmlEnumValue("hide userspace libraries")
    HIDE_USERSPACE_LIBRARIES("hide userspace libraries"),

    /**
     * The 'hide arbitrary virtual memory' value indicates that the malware instance is able to hide arbitrary virtual memory to prevent retrieval.
     * 
     */
    @XmlEnumValue("hide arbitrary virtual memory")
    HIDE_ARBITRARY_VIRTUAL_MEMORY("hide arbitrary virtual memory"),

    /**
     * The 'execute non-main cpu code' value indicates that the malware instance is able to execute some or all of its code on a secondary, non CPU processor (e.g., a GPU).
     * 
     */
    @XmlEnumValue("execute non-main cpu code")
    EXECUTE_NON_MAIN_CPU_CODE("execute non-main cpu code"),

    /**
     * The 'feed misinformation during physical memory acquisition' value indicates that the malware instance is able to report inaccurate data when the content of physical memory is retrieved. 
     * 
     */
    @XmlEnumValue("feed misinformation during physical memory acquisition")
    FEED_MISINFORMATION_DURING_PHYSICAL_MEMORY_ACQUISITION("feed misinformation during physical memory acquisition"),

    /**
     * The 'prevent physical memory acquisition' value indicates that the malware instance is able to prevent the contents of a system's physical memory from being retrieved.
     * 
     */
    @XmlEnumValue("prevent physical memory acquisition")
    PREVENT_PHYSICAL_MEMORY_ACQUISITION("prevent physical memory acquisition"),

    /**
     * The 'prevent native api hooking' value indicates that the malware instance is able to prevent other software from hooking native APIs. 
     * 
     */
    @XmlEnumValue("prevent native api hooking")
    PREVENT_NATIVE_API_HOOKING("prevent native api hooking"),

    /**
     * The 'obfuscate artifact properties' value indicates that the malware instance is able to hide the properties of its artifacts (e.g., by altering timestamps).
     * 
     */
    @XmlEnumValue("obfuscate artifact properties")
    OBFUSCATE_ARTIFACT_PROPERTIES("obfuscate artifact properties"),

    /**
     * The 'hide kernel modules' value indicates that the malware instance is able to hide its usage of kernel modules.
     * 
     */
    @XmlEnumValue("hide kernel modules")
    HIDE_KERNEL_MODULES("hide kernel modules"),

    /**
     * The 'hide code in file' value indicates that the malware instance is able to hide its code in a file.
     * 
     */
    @XmlEnumValue("hide code in file")
    HIDE_CODE_IN_FILE("hide code in file"),

    /**
     * The 'hide services' value indicates that the malware instance is able to hide any system services it creates or injects itself into.
     * 
     */
    @XmlEnumValue("hide services")
    HIDE_SERVICES("hide services"),

    /**
     * The 'hide file system artifacts' value indicates that the malware instance is able to hide its file system artifacts.
     * 
     */
    @XmlEnumValue("hide file system artifacts")
    HIDE_FILE_SYSTEM_ARTIFACTS("hide file system artifacts"),

    /**
     * The 'hide threads' value indicates that the malware instance is able to hide its threads.
     * 
     */
    @XmlEnumValue("hide threads")
    HIDE_THREADS("hide threads");
    private final String value;

    AntiDetectionTacticalObjectivesEnum10(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AntiDetectionTacticalObjectivesEnum10 fromValue(String v) {
        for (AntiDetectionTacticalObjectivesEnum10 c: AntiDetectionTacticalObjectivesEnum10 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

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
 * <p>Java class for DiskActionNameEnum-1.0.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DiskActionNameEnum-1.0">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="get disk type"/>
 *     &lt;enumeration value="get disk attributes"/>
 *     &lt;enumeration value="mount disk"/>
 *     &lt;enumeration value="unmount disk"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DiskActionNameEnum-1.0")
@XmlEnum
public enum DiskActionNameEnum10 {


    /**
     * The 'get disk type' value specifies the defined action of getting the disk type.
     * 
     */
    @XmlEnumValue("get disk type")
    GET_DISK_TYPE("get disk type"),

    /**
     * The 'get disk attributes' value specifies the defined action of querying the attributes of a disk, such as the amount of available free space.
     * 
     */
    @XmlEnumValue("get disk attributes")
    GET_DISK_ATTRIBUTES("get disk attributes"),

    /**
     * The 'mount disk' value specifies the defined action of mounting an existing file system to a mounting point.
     * 
     */
    @XmlEnumValue("mount disk")
    MOUNT_DISK("mount disk"),

    /**
     * The 'unmount disk' value specifies the defined action of unmounting an existing file system from a mounting point.
     * 
     */
    @XmlEnumValue("unmount disk")
    UNMOUNT_DISK("unmount disk");
    private final String value;

    DiskActionNameEnum10(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DiskActionNameEnum10 fromValue(String v) {
        for (DiskActionNameEnum10 c: DiskActionNameEnum10 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
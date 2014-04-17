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
 * <p>Java class for DirectoryActionNameEnum-1.0.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DirectoryActionNameEnum-1.0">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="create directory"/>
 *     &lt;enumeration value="delete directory"/>
 *     &lt;enumeration value="monitor directory"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DirectoryActionNameEnum-1.0")
@XmlEnum
public enum DirectoryActionNameEnum10 {


    /**
     * The 'create directory' value specifies the defined action of creating a new directory on the filesystem.
     * 
     */
    @XmlEnumValue("create directory")
    CREATE_DIRECTORY("create directory"),

    /**
     * The 'delete directory' value specifies the defined action of deleting an existing directory on the filesystem.
     * 
     */
    @XmlEnumValue("delete directory")
    DELETE_DIRECTORY("delete directory"),

    /**
     * The 'monitor directory' value specifies the defined action of monitoring an existing directory on the filesystem for changes.
     * 
     */
    @XmlEnumValue("monitor directory")
    MONITOR_DIRECTORY("monitor directory");
    private final String value;

    DirectoryActionNameEnum10(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DirectoryActionNameEnum10 fromValue(String v) {
        for (DirectoryActionNameEnum10 c: DirectoryActionNameEnum10 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

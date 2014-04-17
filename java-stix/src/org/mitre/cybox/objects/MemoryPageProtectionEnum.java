//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.04.17 at 04:06:30 PM EDT 
//


package org.mitre.cybox.objects;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MemoryPageProtectionEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MemoryPageProtectionEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PAGE_EXECUTE"/>
 *     &lt;enumeration value="PAGE_EXECUTE_READ"/>
 *     &lt;enumeration value="PAGE_EXECUTE_READWRITE"/>
 *     &lt;enumeration value="PAGE_EXECUTE_WRITECOPY"/>
 *     &lt;enumeration value="PAGE_NOACCESS"/>
 *     &lt;enumeration value="PAGE_READONLY"/>
 *     &lt;enumeration value="PAGE_READWRITE"/>
 *     &lt;enumeration value="PAGE_WRITECOPY"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MemoryPageProtectionEnum", namespace = "http://cybox.mitre.org/objects#WinMemoryPageRegionObject-2")
@XmlEnum
public enum MemoryPageProtectionEnum {


    /**
     * From Microsoft: "Enables execute access to the committed region of pages. An attempt to read from or write to the committed region results in an access violation.".
     * 
     */
    PAGE_EXECUTE,

    /**
     * From Microsoft: "Enables execute or read-only access to the committed region of pages. An attempt to write to the committed region results in an access violation.".
     * 
     */
    PAGE_EXECUTE_READ,

    /**
     * From Microsoft: "Enables execute, read-only, or read/write access to the committed region of pages.".
     * 
     */
    PAGE_EXECUTE_READWRITE,

    /**
     * From Microsoft: "Enables execute, read-only, or copy-on-write access to a mapped view of a file mapping object. An attempt to write to a committed copy-on-write page results in a private copy of the page being made for the process. The private page is marked as PAGE_EXECUTE_READWRITE, and the change is written to the new page.".
     * 
     */
    PAGE_EXECUTE_WRITECOPY,

    /**
     * From Microsoft: "Disables all access to the committed region of pages. An attempt to read from, write to, or execute the committed region results in an access violation.".
     * 
     */
    PAGE_NOACCESS,

    /**
     * From Microsoft: "Enables read-only access to the committed region of pages. An attempt to write to the committed region results in an access violation. If Data Execution Prevention is enabled, an attempt to execute code in the committed region results in an access violation.".
     * 
     */
    PAGE_READONLY,

    /**
     * From Microsoft: "Enables read-only or read/write access to the committed region of pages. If Data Execution Prevention is enabled, attempting to execute code in the committed region results in an access violation.".
     * 
     */
    PAGE_READWRITE,

    /**
     * From Microsoft: "Enables read-only or copy-on-write access to a mapped view of a file mapping object. An attempt to write to a committed copy-on-write page results in a private copy of the page being made for the process. The private page is marked as PAGE_READWRITE, and the change is written to the new page. If Data Execution Prevention is enabled, attempting to execute code in the committed region results in an access violation.".
     * 
     */
    PAGE_WRITECOPY;

    public String value() {
        return name();
    }

    public static MemoryPageProtectionEnum fromValue(String v) {
        return valueOf(v);
    }

}

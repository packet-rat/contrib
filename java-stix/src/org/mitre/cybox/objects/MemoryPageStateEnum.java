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
 * <p>Java class for MemoryPageStateEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MemoryPageStateEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="MEM_COMMIT"/>
 *     &lt;enumeration value="MEM_FREE"/>
 *     &lt;enumeration value="MEM_RESERVE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MemoryPageStateEnum", namespace = "http://cybox.mitre.org/objects#WinMemoryPageRegionObject-2")
@XmlEnum
public enum MemoryPageStateEnum {


    /**
     * From Microsoft: "Indicates committed pages for which physical storage has been allocated, either in memory or in the paging file on disk.".
     * 
     */
    MEM_COMMIT,

    /**
     * From Microsoft: "Indicates free pages not accessible to the calling process and available to be allocated. For free pages, the information in the AllocationBase, AllocationProtect, Protect, and Type members is undefined.".
     * 
     */
    MEM_FREE,

    /**
     * From Microsoft: "Indicates reserved pages where a range of the process's virtual address space is reserved without any physical storage being allocated. For reserved pages, the information in the Protect member is undefined.".
     * 
     */
    MEM_RESERVE;

    public String value() {
        return name();
    }

    public static MemoryPageStateEnum fromValue(String v) {
        return valueOf(v);
    }

}

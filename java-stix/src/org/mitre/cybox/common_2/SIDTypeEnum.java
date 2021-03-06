//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.04.17 at 04:06:30 PM EDT 
//


package org.mitre.cybox.common_2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SIDTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SIDTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SidTypeUser"/>
 *     &lt;enumeration value="SidTypeGroup"/>
 *     &lt;enumeration value="SidTypeDomain"/>
 *     &lt;enumeration value="SidTypeAlias"/>
 *     &lt;enumeration value="SidTypeWellKnownGroup"/>
 *     &lt;enumeration value="SidTypeDeletedAccount"/>
 *     &lt;enumeration value="SidTypeInvalid"/>
 *     &lt;enumeration value="SidTypeUnknown"/>
 *     &lt;enumeration value="SidTypeComputer"/>
 *     &lt;enumeration value="SidTypeLabel"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SIDTypeEnum")
@XmlEnum
public enum SIDTypeEnum {


    /**
     * Indicates a SID of type User.
     * 
     */
    @XmlEnumValue("SidTypeUser")
    SID_TYPE_USER("SidTypeUser"),

    /**
     * Indicates a SID of type Group.
     * 
     */
    @XmlEnumValue("SidTypeGroup")
    SID_TYPE_GROUP("SidTypeGroup"),

    /**
     * Indicates a SID of type Domain.
     * 
     */
    @XmlEnumValue("SidTypeDomain")
    SID_TYPE_DOMAIN("SidTypeDomain"),

    /**
     * Indicates a SID of type Alias.
     * 
     */
    @XmlEnumValue("SidTypeAlias")
    SID_TYPE_ALIAS("SidTypeAlias"),

    /**
     * Indicates a SID for a well-known group.
     * 
     */
    @XmlEnumValue("SidTypeWellKnownGroup")
    SID_TYPE_WELL_KNOWN_GROUP("SidTypeWellKnownGroup"),

    /**
     * Indicates a SID for a deleted account.
     * 
     */
    @XmlEnumValue("SidTypeDeletedAccount")
    SID_TYPE_DELETED_ACCOUNT("SidTypeDeletedAccount"),

    /**
     * Indicates an invalid SID.
     * 
     */
    @XmlEnumValue("SidTypeInvalid")
    SID_TYPE_INVALID("SidTypeInvalid"),

    /**
     * Indicates a SID of unknown type.
     * 
     */
    @XmlEnumValue("SidTypeUnknown")
    SID_TYPE_UNKNOWN("SidTypeUnknown"),

    /**
     * Indicates a SID for a computer.
     * 
     */
    @XmlEnumValue("SidTypeComputer")
    SID_TYPE_COMPUTER("SidTypeComputer"),

    /**
     * Indicates a mandatory integrity label SID.
     * 
     */
    @XmlEnumValue("SidTypeLabel")
    SID_TYPE_LABEL("SidTypeLabel");
    private final String value;

    SIDTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SIDTypeEnum fromValue(String v) {
        for (SIDTypeEnum c: SIDTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.04.17 at 04:06:30 PM EDT 
//


package oasis.names.tc.ciq.xnl._3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrganisationNameTypeList.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OrganisationNameTypeList">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString">
 *     &lt;enumeration value="LegalName"/>
 *     &lt;enumeration value="FormerName"/>
 *     &lt;enumeration value="CommonUse"/>
 *     &lt;enumeration value="PublishingName"/>
 *     &lt;enumeration value="OfficialName"/>
 *     &lt;enumeration value="UnofficialName"/>
 *     &lt;enumeration value="Undefined"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "OrganisationNameTypeList")
@XmlEnum
public enum OrganisationNameTypeList {

    @XmlEnumValue("LegalName")
    LEGAL_NAME("LegalName"),

    /**
     * Former name of the organisation
     * 
     */
    @XmlEnumValue("FormerName")
    FORMER_NAME("FormerName"),
    @XmlEnumValue("CommonUse")
    COMMON_USE("CommonUse"),
    @XmlEnumValue("PublishingName")
    PUBLISHING_NAME("PublishingName"),
    @XmlEnumValue("OfficialName")
    OFFICIAL_NAME("OfficialName"),
    @XmlEnumValue("UnofficialName")
    UNOFFICIAL_NAME("UnofficialName"),

    /**
     * unknown
     * 
     */
    @XmlEnumValue("Undefined")
    UNDEFINED("Undefined");
    private final String value;

    OrganisationNameTypeList(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OrganisationNameTypeList fromValue(String v) {
        for (OrganisationNameTypeList c: OrganisationNameTypeList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
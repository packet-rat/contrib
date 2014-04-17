//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.04.17 at 04:06:30 PM EDT 
//


package xml.metadatasharing;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VolumeUnitsEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="VolumeUnitsEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="numberUsersAffected"/>
 *     &lt;enumeration value="numberMachinesAffected"/>
 *     &lt;enumeration value="numberSeenInSpam"/>
 *     &lt;enumeration value="numberSeenInMalwareSamples"/>
 *     &lt;enumeration value="numberOfWebsitesHosting"/>
 *     &lt;enumeration value="numberOfWebsitesRedirecting"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "VolumeUnitsEnum")
@XmlEnum
public enum VolumeUnitsEnum {


    /**
     * 
     *       numberUsersAffected - The count of users (humans) affected by the items referenced by the field data entry.
     *      
     * 
     */
    @XmlEnumValue("numberUsersAffected")
    NUMBER_USERS_AFFECTED("numberUsersAffected"),

    /**
     * 
     *       numberMachinesAffected - The count of computers affected by the items referenced by the field data entry.
     *      
     * 
     */
    @XmlEnumValue("numberMachinesAffected")
    NUMBER_MACHINES_AFFECTED("numberMachinesAffected"),

    /**
     * 
     *       numberSeenInSpam - The count of spam messages containing the items referenced by the field data entry. Most commonly used for uris.
     *      
     * 
     */
    @XmlEnumValue("numberSeenInSpam")
    NUMBER_SEEN_IN_SPAM("numberSeenInSpam"),

    /**
     * 
     *       numberSeenInMalwareSamples - The count of malware samples containing the items referenced by the field data entry. Most commonly used for uris.
     *      
     * 
     */
    @XmlEnumValue("numberSeenInMalwareSamples")
    NUMBER_SEEN_IN_MALWARE_SAMPLES("numberSeenInMalwareSamples"),

    /**
     * 
     *       numberOfWebsitesHosting - The count of web sites hosting the items referenced by the field data entry. Most commonly used for uris.
     *      
     * 
     */
    @XmlEnumValue("numberOfWebsitesHosting")
    NUMBER_OF_WEBSITES_HOSTING("numberOfWebsitesHosting"),

    /**
     * 
     *       numberOfWebsitesRedirecting - The count of web sites redirecting the items referenced by the field data entry. Most commonly used for uris.
     *      
     * 
     */
    @XmlEnumValue("numberOfWebsitesRedirecting")
    NUMBER_OF_WEBSITES_REDIRECTING("numberOfWebsitesRedirecting");
    private final String value;

    VolumeUnitsEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VolumeUnitsEnum fromValue(String v) {
        for (VolumeUnitsEnum c: VolumeUnitsEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
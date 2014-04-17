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
 * <p>Java class for OriginTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OriginTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="user"/>
 *     &lt;enumeration value="desktop"/>
 *     &lt;enumeration value="lan"/>
 *     &lt;enumeration value="gateway"/>
 *     &lt;enumeration value="isp"/>
 *     &lt;enumeration value="honeypot"/>
 *     &lt;enumeration value="collection"/>
 *     &lt;enumeration value="spam"/>
 *     &lt;enumeration value="wan"/>
 *     &lt;enumeration value="internal"/>
 *     &lt;enumeration value="partner"/>
 *     &lt;enumeration value="unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "OriginTypeEnum")
@XmlEnum
public enum OriginTypeEnum {


    /**
     * 
     *       user - Data originated from a user, normally meaning manual submissions from a user.
     *      
     * 
     */
    @XmlEnumValue("user")
    USER("user"),

    /**
     * 
     *       desktop - Data originated from a computer, normally meaning automated submissions from a product running on a users computer.
     *      
     * 
     */
    @XmlEnumValue("desktop")
    DESKTOP("desktop"),

    /**
     * 
     *       network - Data originated from a local network.
     *      
     * 
     */
    @XmlEnumValue("lan")
    LAN("lan"),

    /**
     * 
     *       gateway - Data originated from measurements at a gateway.
     *      
     * 
     */
    @XmlEnumValue("gateway")
    GATEWAY("gateway"),

    /**
     * 
     *       isp - Data originated from measurements at an ISP.
     *      
     * 
     */
    @XmlEnumValue("isp")
    ISP("isp"),

    /**
     * 
     *       honeypot - Data originated from internally gathered data using a honeypot or other collection device.
     *      
     * 
     */
    @XmlEnumValue("honeypot")
    HONEYPOT("honeypot"),

    /**
     * 
     *       collection - Data from a malware collection. 
     *      
     * 
     */
    @XmlEnumValue("collection")
    COLLECTION("collection"),

    /**
     * 
     *       spam - Data originated from spam (e.g. spam Email had a link to malware or the malware itself).
     *      
     * 
     */
    @XmlEnumValue("spam")
    SPAM("spam"),

    /**
     * 
     *       web - Data originated from the Internet.
     *      
     * 
     */
    @XmlEnumValue("wan")
    WAN("wan"),

    /**
     * 
     *       internal - Internally generated object (e.g. replicants of a polymorphic malware) .
     *      
     * 
     */
    @XmlEnumValue("internal")
    INTERNAL("internal"),

    /**
     * 
     *       partner - Data originated from a partner.
     *      
     * 
     */
    @XmlEnumValue("partner")
    PARTNER("partner"),

    /**
     * 
     *      unknown - unknown.
     *     
     * 
     */
    @XmlEnumValue("unknown")
    UNKNOWN("unknown");
    private final String value;

    OriginTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OriginTypeEnum fromValue(String v) {
        for (OriginTypeEnum c: OriginTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
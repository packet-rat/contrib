//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.04.17 at 04:06:30 PM EDT 
//


package org.mitre.cybox.objects;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IANAHardwareTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="IANAHardwareTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Ethernet(1)"/>
 *     &lt;enumeration value="IEEE802(6)"/>
 *     &lt;enumeration value="ARCNET(7)"/>
 *     &lt;enumeration value="FrameRelay(15)"/>
 *     &lt;enumeration value="ATM(16)"/>
 *     &lt;enumeration value="HDLC(17)"/>
 *     &lt;enumeration value="FibreChannel(18)"/>
 *     &lt;enumeration value="ATM(19)"/>
 *     &lt;enumeration value="SerialLine(20)"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "IANAHardwareTypeEnum")
@XmlEnum
public enum IANAHardwareTypeEnum {


    /**
     * Indicates Ethernet hardware.
     * 
     */
    @XmlEnumValue("Ethernet(1)")
    ETHERNET_1("Ethernet(1)"),

    /**
     * Indicates IEEE 802 compliant hardware for networks carrying variable-size packets.
     * 
     */
    @XmlEnumValue("IEEE802(6)")
    IEEE_802_6("IEEE802(6)"),

    /**
     * Indicates the ARCNET LAN protocol.
     * 
     */
    @XmlEnumValue("ARCNET(7)")
    ARCNET_7("ARCNET(7)"),

    /**
     * Indicates the Frame Relay WAN technology.
     * 
     */
    @XmlEnumValue("FrameRelay(15)")
    FRAME_RELAY_15("FrameRelay(15)"),

    /**
     * Indicates the ATM (Asynchronous Transfer Mode) networking standard.
     * 
     */
    @XmlEnumValue("ATM(16)")
    ATM_16("ATM(16)"),

    /**
     * Indicates the HDLC (High-Level Data Link Control) protocol.
     * 
     */
    @XmlEnumValue("HDLC(17)")
    HDLC_17("HDLC(17)"),

    /**
     * Indicates the FibreChannel technology.
     * 
     */
    @XmlEnumValue("FibreChannel(18)")
    FIBRE_CHANNEL_18("FibreChannel(18)"),

    /**
     * Indicates the ATM (Asynchronous Transfer Mode) networking standard.
     * 
     */
    @XmlEnumValue("ATM(19)")
    ATM_19("ATM(19)"),

    /**
     * Indicates the Serial Line protocol, or SLIP.
     * 
     */
    @XmlEnumValue("SerialLine(20)")
    SERIAL_LINE_20("SerialLine(20)");
    private final String value;

    IANAHardwareTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static IANAHardwareTypeEnum fromValue(String v) {
        for (IANAHardwareTypeEnum c: IANAHardwareTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.04.17 at 04:06:30 PM EDT 
//


package org.mitre.cybox.objects;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Netflow record formats that capture traffic in one direction.
 * 
 * <p>Java class for UnidirectionalRecordType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UnidirectionalRecordType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice minOccurs="0">
 *         &lt;element name="IPFIX_Message" type="{http://cybox.mitre.org/objects#NetworkFlowObject-2}IPFIXMessageType" minOccurs="0"/>
 *         &lt;element name="NetflowV9_Export_Packet" type="{http://cybox.mitre.org/objects#NetworkFlowObject-2}NetflowV9ExportPacketType" minOccurs="0"/>
 *         &lt;element name="NetflowV5_Packet" type="{http://cybox.mitre.org/objects#NetworkFlowObject-2}NetflowV5PacketType" minOccurs="0"/>
 *         &lt;element name="SiLK_Record" type="{http://cybox.mitre.org/objects#NetworkFlowObject-2}SiLKRecordType" minOccurs="0"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnidirectionalRecordType", namespace = "http://cybox.mitre.org/objects#NetworkFlowObject-2", propOrder = {
    "ipfixMessage",
    "netflowV9ExportPacket",
    "netflowV5Packet",
    "siLKRecord"
})
public class UnidirectionalRecordType {

    @XmlElement(name = "IPFIX_Message")
    protected IPFIXMessageType ipfixMessage;
    @XmlElement(name = "NetflowV9_Export_Packet")
    protected NetflowV9ExportPacketType netflowV9ExportPacket;
    @XmlElement(name = "NetflowV5_Packet")
    protected NetflowV5PacketType netflowV5Packet;
    @XmlElement(name = "SiLK_Record")
    protected SiLKRecordType siLKRecord;

    /**
     * Gets the value of the ipfixMessage property.
     * 
     * @return
     *     possible object is
     *     {@link IPFIXMessageType }
     *     
     */
    public IPFIXMessageType getIPFIXMessage() {
        return ipfixMessage;
    }

    /**
     * Sets the value of the ipfixMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link IPFIXMessageType }
     *     
     */
    public void setIPFIXMessage(IPFIXMessageType value) {
        this.ipfixMessage = value;
    }

    /**
     * Gets the value of the netflowV9ExportPacket property.
     * 
     * @return
     *     possible object is
     *     {@link NetflowV9ExportPacketType }
     *     
     */
    public NetflowV9ExportPacketType getNetflowV9ExportPacket() {
        return netflowV9ExportPacket;
    }

    /**
     * Sets the value of the netflowV9ExportPacket property.
     * 
     * @param value
     *     allowed object is
     *     {@link NetflowV9ExportPacketType }
     *     
     */
    public void setNetflowV9ExportPacket(NetflowV9ExportPacketType value) {
        this.netflowV9ExportPacket = value;
    }

    /**
     * Gets the value of the netflowV5Packet property.
     * 
     * @return
     *     possible object is
     *     {@link NetflowV5PacketType }
     *     
     */
    public NetflowV5PacketType getNetflowV5Packet() {
        return netflowV5Packet;
    }

    /**
     * Sets the value of the netflowV5Packet property.
     * 
     * @param value
     *     allowed object is
     *     {@link NetflowV5PacketType }
     *     
     */
    public void setNetflowV5Packet(NetflowV5PacketType value) {
        this.netflowV5Packet = value;
    }

    /**
     * Gets the value of the siLKRecord property.
     * 
     * @return
     *     possible object is
     *     {@link SiLKRecordType }
     *     
     */
    public SiLKRecordType getSiLKRecord() {
        return siLKRecord;
    }

    /**
     * Sets the value of the siLKRecord property.
     * 
     * @param value
     *     allowed object is
     *     {@link SiLKRecordType }
     *     
     */
    public void setSiLKRecord(SiLKRecordType value) {
        this.siLKRecord = value;
    }

}

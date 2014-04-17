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
import org.mitre.cybox.common_2.HexBinaryObjectPropertyType;


/**
 * The Address Resolution Protocol is a request and reply protocol that runs encapsulated by the line protocol. It is communicated within the boundaries of a single network, never routed across internetwork nodes. This property places ARP into the Link Layer. It is encapsulated. REF: http://www.comptechdoc.org/independent/networking/guide/netarp.html.
 * 
 * <p>Java class for ARPType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ARPType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Hardware_Addr_Type" type="{http://cybox.mitre.org/objects#PacketObject-2}IANAHardwareType" minOccurs="0"/>
 *         &lt;element name="Proto_Addr_Type" type="{http://cybox.mitre.org/objects#PacketObject-2}IANAEtherType" minOccurs="0"/>
 *         &lt;element name="Hardware_Addr_Size" type="{http://cybox.mitre.org/common-2}HexBinaryObjectPropertyType" minOccurs="0"/>
 *         &lt;element name="Proto_Addr_Size" type="{http://cybox.mitre.org/common-2}HexBinaryObjectPropertyType" minOccurs="0"/>
 *         &lt;element name="Op_Type" type="{http://cybox.mitre.org/objects#PacketObject-2}ARPOpType" minOccurs="0"/>
 *         &lt;element name="Sender_Hardware_Addr" type="{http://cybox.mitre.org/objects#AddressObject-2}AddressObjectType" minOccurs="0"/>
 *         &lt;element name="Sender_Protocol_Addr" type="{http://cybox.mitre.org/objects#AddressObject-2}AddressObjectType" minOccurs="0"/>
 *         &lt;element name="Recip_Hardware_Addr" type="{http://cybox.mitre.org/objects#AddressObject-2}AddressObjectType" minOccurs="0"/>
 *         &lt;element name="Recip_Protocol_Addr" type="{http://cybox.mitre.org/objects#AddressObject-2}AddressObjectType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ARPType", propOrder = {
    "hardwareAddrType",
    "protoAddrType",
    "hardwareAddrSize",
    "protoAddrSize",
    "opType",
    "senderHardwareAddr",
    "senderProtocolAddr",
    "recipHardwareAddr",
    "recipProtocolAddr"
})
public class ARPType {

    @XmlElement(name = "Hardware_Addr_Type")
    protected IANAHardwareType hardwareAddrType;
    @XmlElement(name = "Proto_Addr_Type")
    protected IANAEtherType protoAddrType;
    @XmlElement(name = "Hardware_Addr_Size")
    protected HexBinaryObjectPropertyType hardwareAddrSize;
    @XmlElement(name = "Proto_Addr_Size")
    protected HexBinaryObjectPropertyType protoAddrSize;
    @XmlElement(name = "Op_Type")
    protected ARPOpType opType;
    @XmlElement(name = "Sender_Hardware_Addr")
    protected AddressObjectType senderHardwareAddr;
    @XmlElement(name = "Sender_Protocol_Addr")
    protected AddressObjectType senderProtocolAddr;
    @XmlElement(name = "Recip_Hardware_Addr")
    protected AddressObjectType recipHardwareAddr;
    @XmlElement(name = "Recip_Protocol_Addr")
    protected AddressObjectType recipProtocolAddr;

    /**
     * Gets the value of the hardwareAddrType property.
     * 
     * @return
     *     possible object is
     *     {@link IANAHardwareType }
     *     
     */
    public IANAHardwareType getHardwareAddrType() {
        return hardwareAddrType;
    }

    /**
     * Sets the value of the hardwareAddrType property.
     * 
     * @param value
     *     allowed object is
     *     {@link IANAHardwareType }
     *     
     */
    public void setHardwareAddrType(IANAHardwareType value) {
        this.hardwareAddrType = value;
    }

    /**
     * Gets the value of the protoAddrType property.
     * 
     * @return
     *     possible object is
     *     {@link IANAEtherType }
     *     
     */
    public IANAEtherType getProtoAddrType() {
        return protoAddrType;
    }

    /**
     * Sets the value of the protoAddrType property.
     * 
     * @param value
     *     allowed object is
     *     {@link IANAEtherType }
     *     
     */
    public void setProtoAddrType(IANAEtherType value) {
        this.protoAddrType = value;
    }

    /**
     * Gets the value of the hardwareAddrSize property.
     * 
     * @return
     *     possible object is
     *     {@link HexBinaryObjectPropertyType }
     *     
     */
    public HexBinaryObjectPropertyType getHardwareAddrSize() {
        return hardwareAddrSize;
    }

    /**
     * Sets the value of the hardwareAddrSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link HexBinaryObjectPropertyType }
     *     
     */
    public void setHardwareAddrSize(HexBinaryObjectPropertyType value) {
        this.hardwareAddrSize = value;
    }

    /**
     * Gets the value of the protoAddrSize property.
     * 
     * @return
     *     possible object is
     *     {@link HexBinaryObjectPropertyType }
     *     
     */
    public HexBinaryObjectPropertyType getProtoAddrSize() {
        return protoAddrSize;
    }

    /**
     * Sets the value of the protoAddrSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link HexBinaryObjectPropertyType }
     *     
     */
    public void setProtoAddrSize(HexBinaryObjectPropertyType value) {
        this.protoAddrSize = value;
    }

    /**
     * Gets the value of the opType property.
     * 
     * @return
     *     possible object is
     *     {@link ARPOpType }
     *     
     */
    public ARPOpType getOpType() {
        return opType;
    }

    /**
     * Sets the value of the opType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ARPOpType }
     *     
     */
    public void setOpType(ARPOpType value) {
        this.opType = value;
    }

    /**
     * Gets the value of the senderHardwareAddr property.
     * 
     * @return
     *     possible object is
     *     {@link AddressObjectType }
     *     
     */
    public AddressObjectType getSenderHardwareAddr() {
        return senderHardwareAddr;
    }

    /**
     * Sets the value of the senderHardwareAddr property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressObjectType }
     *     
     */
    public void setSenderHardwareAddr(AddressObjectType value) {
        this.senderHardwareAddr = value;
    }

    /**
     * Gets the value of the senderProtocolAddr property.
     * 
     * @return
     *     possible object is
     *     {@link AddressObjectType }
     *     
     */
    public AddressObjectType getSenderProtocolAddr() {
        return senderProtocolAddr;
    }

    /**
     * Sets the value of the senderProtocolAddr property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressObjectType }
     *     
     */
    public void setSenderProtocolAddr(AddressObjectType value) {
        this.senderProtocolAddr = value;
    }

    /**
     * Gets the value of the recipHardwareAddr property.
     * 
     * @return
     *     possible object is
     *     {@link AddressObjectType }
     *     
     */
    public AddressObjectType getRecipHardwareAddr() {
        return recipHardwareAddr;
    }

    /**
     * Sets the value of the recipHardwareAddr property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressObjectType }
     *     
     */
    public void setRecipHardwareAddr(AddressObjectType value) {
        this.recipHardwareAddr = value;
    }

    /**
     * Gets the value of the recipProtocolAddr property.
     * 
     * @return
     *     possible object is
     *     {@link AddressObjectType }
     *     
     */
    public AddressObjectType getRecipProtocolAddr() {
        return recipProtocolAddr;
    }

    /**
     * Sets the value of the recipProtocolAddr property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressObjectType }
     *     
     */
    public void setRecipProtocolAddr(AddressObjectType value) {
        this.recipProtocolAddr = value;
    }

}

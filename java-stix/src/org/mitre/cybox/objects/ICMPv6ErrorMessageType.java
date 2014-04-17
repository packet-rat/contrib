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
 * ICMP v6 error messages include destination unreachable messages, packet too big messages, and time exceeded messages, and parameter problem messages, as defined in RFC 2463. Type values of ICMP v6 error messages range from 1 to 127.
 * 
 * <p>Java class for ICMPv6ErrorMessageType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ICMPv6ErrorMessageType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="Destination_Unreachable" type="{http://cybox.mitre.org/objects#PacketObject-2}ICMPv6DestinationUnreachableType" minOccurs="0"/>
 *           &lt;element name="Packet_Too_Big" type="{http://cybox.mitre.org/objects#PacketObject-2}ICMPv6PacketTooBigType" minOccurs="0"/>
 *           &lt;element name="Time_Exceeded" type="{http://cybox.mitre.org/objects#PacketObject-2}ICMPv6TimeExceededType" minOccurs="0"/>
 *           &lt;element name="Parameter_Problem" type="{http://cybox.mitre.org/objects#PacketObject-2}ICMPv6ParameterProblemType" minOccurs="0"/>
 *         &lt;/choice>
 *         &lt;element name="Invoking_Packet" type="{http://cybox.mitre.org/common-2}HexBinaryObjectPropertyType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ICMPv6ErrorMessageType", propOrder = {
    "destinationUnreachable",
    "packetTooBig",
    "timeExceeded",
    "parameterProblem",
    "invokingPacket"
})
public class ICMPv6ErrorMessageType {

    @XmlElement(name = "Destination_Unreachable")
    protected ICMPv6DestinationUnreachableType destinationUnreachable;
    @XmlElement(name = "Packet_Too_Big")
    protected ICMPv6PacketTooBigType packetTooBig;
    @XmlElement(name = "Time_Exceeded")
    protected ICMPv6TimeExceededType timeExceeded;
    @XmlElement(name = "Parameter_Problem")
    protected ICMPv6ParameterProblemType parameterProblem;
    @XmlElement(name = "Invoking_Packet")
    protected HexBinaryObjectPropertyType invokingPacket;

    /**
     * Gets the value of the destinationUnreachable property.
     * 
     * @return
     *     possible object is
     *     {@link ICMPv6DestinationUnreachableType }
     *     
     */
    public ICMPv6DestinationUnreachableType getDestinationUnreachable() {
        return destinationUnreachable;
    }

    /**
     * Sets the value of the destinationUnreachable property.
     * 
     * @param value
     *     allowed object is
     *     {@link ICMPv6DestinationUnreachableType }
     *     
     */
    public void setDestinationUnreachable(ICMPv6DestinationUnreachableType value) {
        this.destinationUnreachable = value;
    }

    /**
     * Gets the value of the packetTooBig property.
     * 
     * @return
     *     possible object is
     *     {@link ICMPv6PacketTooBigType }
     *     
     */
    public ICMPv6PacketTooBigType getPacketTooBig() {
        return packetTooBig;
    }

    /**
     * Sets the value of the packetTooBig property.
     * 
     * @param value
     *     allowed object is
     *     {@link ICMPv6PacketTooBigType }
     *     
     */
    public void setPacketTooBig(ICMPv6PacketTooBigType value) {
        this.packetTooBig = value;
    }

    /**
     * Gets the value of the timeExceeded property.
     * 
     * @return
     *     possible object is
     *     {@link ICMPv6TimeExceededType }
     *     
     */
    public ICMPv6TimeExceededType getTimeExceeded() {
        return timeExceeded;
    }

    /**
     * Sets the value of the timeExceeded property.
     * 
     * @param value
     *     allowed object is
     *     {@link ICMPv6TimeExceededType }
     *     
     */
    public void setTimeExceeded(ICMPv6TimeExceededType value) {
        this.timeExceeded = value;
    }

    /**
     * Gets the value of the parameterProblem property.
     * 
     * @return
     *     possible object is
     *     {@link ICMPv6ParameterProblemType }
     *     
     */
    public ICMPv6ParameterProblemType getParameterProblem() {
        return parameterProblem;
    }

    /**
     * Sets the value of the parameterProblem property.
     * 
     * @param value
     *     allowed object is
     *     {@link ICMPv6ParameterProblemType }
     *     
     */
    public void setParameterProblem(ICMPv6ParameterProblemType value) {
        this.parameterProblem = value;
    }

    /**
     * Gets the value of the invokingPacket property.
     * 
     * @return
     *     possible object is
     *     {@link HexBinaryObjectPropertyType }
     *     
     */
    public HexBinaryObjectPropertyType getInvokingPacket() {
        return invokingPacket;
    }

    /**
     * Sets the value of the invokingPacket property.
     * 
     * @param value
     *     allowed object is
     *     {@link HexBinaryObjectPropertyType }
     *     
     */
    public void setInvokingPacket(HexBinaryObjectPropertyType value) {
        this.invokingPacket = value;
    }

}
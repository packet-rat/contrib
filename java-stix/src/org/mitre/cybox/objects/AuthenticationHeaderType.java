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
 * The IP Authentication Header is used to provide connectionless integrity and data origin authentication for IP datagrams and to provide protection against replays. http://www.ietf.org/rfc/rfc2402.txt.
 * 
 * <p>Java class for AuthenticationHeaderType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AuthenticationHeaderType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Next_Header" type="{http://cybox.mitre.org/objects#PacketObject-2}IANAAssignedIPNumbersType" minOccurs="0"/>
 *         &lt;element name="Header_Ext_Len" type="{http://cybox.mitre.org/common-2}HexBinaryObjectPropertyType" minOccurs="0"/>
 *         &lt;element name="Security_Parameters_Index" type="{http://cybox.mitre.org/common-2}HexBinaryObjectPropertyType" minOccurs="0"/>
 *         &lt;element name="Sequence_Number" type="{http://cybox.mitre.org/common-2}HexBinaryObjectPropertyType" minOccurs="0"/>
 *         &lt;element name="Authentication_Data" type="{http://cybox.mitre.org/common-2}HexBinaryObjectPropertyType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AuthenticationHeaderType", propOrder = {
    "nextHeader",
    "headerExtLen",
    "securityParametersIndex",
    "sequenceNumber",
    "authenticationData"
})
public class AuthenticationHeaderType {

    @XmlElement(name = "Next_Header")
    protected IANAAssignedIPNumbersType nextHeader;
    @XmlElement(name = "Header_Ext_Len")
    protected HexBinaryObjectPropertyType headerExtLen;
    @XmlElement(name = "Security_Parameters_Index")
    protected HexBinaryObjectPropertyType securityParametersIndex;
    @XmlElement(name = "Sequence_Number")
    protected HexBinaryObjectPropertyType sequenceNumber;
    @XmlElement(name = "Authentication_Data")
    protected HexBinaryObjectPropertyType authenticationData;

    /**
     * Gets the value of the nextHeader property.
     * 
     * @return
     *     possible object is
     *     {@link IANAAssignedIPNumbersType }
     *     
     */
    public IANAAssignedIPNumbersType getNextHeader() {
        return nextHeader;
    }

    /**
     * Sets the value of the nextHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link IANAAssignedIPNumbersType }
     *     
     */
    public void setNextHeader(IANAAssignedIPNumbersType value) {
        this.nextHeader = value;
    }

    /**
     * Gets the value of the headerExtLen property.
     * 
     * @return
     *     possible object is
     *     {@link HexBinaryObjectPropertyType }
     *     
     */
    public HexBinaryObjectPropertyType getHeaderExtLen() {
        return headerExtLen;
    }

    /**
     * Sets the value of the headerExtLen property.
     * 
     * @param value
     *     allowed object is
     *     {@link HexBinaryObjectPropertyType }
     *     
     */
    public void setHeaderExtLen(HexBinaryObjectPropertyType value) {
        this.headerExtLen = value;
    }

    /**
     * Gets the value of the securityParametersIndex property.
     * 
     * @return
     *     possible object is
     *     {@link HexBinaryObjectPropertyType }
     *     
     */
    public HexBinaryObjectPropertyType getSecurityParametersIndex() {
        return securityParametersIndex;
    }

    /**
     * Sets the value of the securityParametersIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link HexBinaryObjectPropertyType }
     *     
     */
    public void setSecurityParametersIndex(HexBinaryObjectPropertyType value) {
        this.securityParametersIndex = value;
    }

    /**
     * Gets the value of the sequenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link HexBinaryObjectPropertyType }
     *     
     */
    public HexBinaryObjectPropertyType getSequenceNumber() {
        return sequenceNumber;
    }

    /**
     * Sets the value of the sequenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link HexBinaryObjectPropertyType }
     *     
     */
    public void setSequenceNumber(HexBinaryObjectPropertyType value) {
        this.sequenceNumber = value;
    }

    /**
     * Gets the value of the authenticationData property.
     * 
     * @return
     *     possible object is
     *     {@link HexBinaryObjectPropertyType }
     *     
     */
    public HexBinaryObjectPropertyType getAuthenticationData() {
        return authenticationData;
    }

    /**
     * Sets the value of the authenticationData property.
     * 
     * @param value
     *     allowed object is
     *     {@link HexBinaryObjectPropertyType }
     *     
     */
    public void setAuthenticationData(HexBinaryObjectPropertyType value) {
        this.authenticationData = value;
    }

}

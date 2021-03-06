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
import org.mitre.cybox.common_2.IntegerObjectPropertyType;


/**
 * The redirected header option is used in redirect messages and contains all or part of the packet that is being redirected. (type=4).
 * 
 * <p>Java class for NDPRedirectedHeaderType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NDPRedirectedHeaderType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Length" type="{http://cybox.mitre.org/common-2}IntegerObjectPropertyType" minOccurs="0"/>
 *         &lt;element name="IPHeader_And_Data" type="{http://cybox.mitre.org/common-2}HexBinaryObjectPropertyType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NDPRedirectedHeaderType", propOrder = {
    "length",
    "ipHeaderAndData"
})
public class NDPRedirectedHeaderType {

    @XmlElement(name = "Length")
    protected IntegerObjectPropertyType length;
    @XmlElement(name = "IPHeader_And_Data")
    protected HexBinaryObjectPropertyType ipHeaderAndData;

    /**
     * Gets the value of the length property.
     * 
     * @return
     *     possible object is
     *     {@link IntegerObjectPropertyType }
     *     
     */
    public IntegerObjectPropertyType getLength() {
        return length;
    }

    /**
     * Sets the value of the length property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntegerObjectPropertyType }
     *     
     */
    public void setLength(IntegerObjectPropertyType value) {
        this.length = value;
    }

    /**
     * Gets the value of the ipHeaderAndData property.
     * 
     * @return
     *     possible object is
     *     {@link HexBinaryObjectPropertyType }
     *     
     */
    public HexBinaryObjectPropertyType getIPHeaderAndData() {
        return ipHeaderAndData;
    }

    /**
     * Sets the value of the ipHeaderAndData property.
     * 
     * @param value
     *     allowed object is
     *     {@link HexBinaryObjectPropertyType }
     *     
     */
    public void setIPHeaderAndData(HexBinaryObjectPropertyType value) {
        this.ipHeaderAndData = value;
    }

}

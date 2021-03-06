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
import org.mitre.cybox.common_2.SIDType;
import org.mitre.cybox.common_2.StringObjectPropertyType;


/**
 * The WinUserAccountObjectType type is intended to characterize Windows user accounts.
 * 
 * <p>Java class for WindowsUserAccountObjectType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WindowsUserAccountObjectType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://cybox.mitre.org/objects#UserAccountObject-2}UserAccountObjectType">
 *       &lt;sequence>
 *         &lt;element name="Security_ID" type="{http://cybox.mitre.org/common-2}StringObjectPropertyType" minOccurs="0"/>
 *         &lt;element name="Security_Type" type="{http://cybox.mitre.org/common-2}SIDType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WindowsUserAccountObjectType", namespace = "http://cybox.mitre.org/objects#WinUserAccountObject-2", propOrder = {
    "securityID",
    "securityType"
})
public class WindowsUserAccountObjectType
    extends UserAccountObjectType
{

    @XmlElement(name = "Security_ID")
    protected StringObjectPropertyType securityID;
    @XmlElement(name = "Security_Type")
    protected SIDType securityType;

    /**
     * Gets the value of the securityID property.
     * 
     * @return
     *     possible object is
     *     {@link StringObjectPropertyType }
     *     
     */
    public StringObjectPropertyType getSecurityID() {
        return securityID;
    }

    /**
     * Sets the value of the securityID property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringObjectPropertyType }
     *     
     */
    public void setSecurityID(StringObjectPropertyType value) {
        this.securityID = value;
    }

    /**
     * Gets the value of the securityType property.
     * 
     * @return
     *     possible object is
     *     {@link SIDType }
     *     
     */
    public SIDType getSecurityType() {
        return securityType;
    }

    /**
     * Sets the value of the securityType property.
     * 
     * @param value
     *     allowed object is
     *     {@link SIDType }
     *     
     */
    public void setSecurityType(SIDType value) {
        this.securityType = value;
    }

}

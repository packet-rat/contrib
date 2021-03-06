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
import org.mitre.cybox.common_2.NonNegativeIntegerObjectPropertyType;
import org.mitre.cybox.common_2.ObjectPropertiesType;
import org.mitre.cybox.common_2.StringObjectPropertyType;


/**
 * The WindowsMailslotObjectType is intended to characterize Windows mailslot objects.
 * 
 * <p>Java class for WindowsMailslotObjectType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WindowsMailslotObjectType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://cybox.mitre.org/common-2}ObjectPropertiesType">
 *       &lt;sequence>
 *         &lt;element name="Handle" type="{http://cybox.mitre.org/objects#WinHandleObject-2}WindowsHandleObjectType" minOccurs="0"/>
 *         &lt;element name="Max_Message_Size" type="{http://cybox.mitre.org/common-2}NonNegativeIntegerObjectPropertyType" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://cybox.mitre.org/common-2}StringObjectPropertyType" minOccurs="0"/>
 *         &lt;element name="Read_Timeout" type="{http://cybox.mitre.org/common-2}NonNegativeIntegerObjectPropertyType" minOccurs="0"/>
 *         &lt;element name="Security_Attributes" type="{http://cybox.mitre.org/common-2}StringObjectPropertyType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WindowsMailslotObjectType", namespace = "http://cybox.mitre.org/objects#WinMailslotObject-2", propOrder = {
    "handle",
    "maxMessageSize",
    "name",
    "readTimeout",
    "securityAttributes"
})
public class WindowsMailslotObjectType
    extends ObjectPropertiesType
{

    @XmlElement(name = "Handle")
    protected WindowsHandleObjectType handle;
    @XmlElement(name = "Max_Message_Size")
    protected NonNegativeIntegerObjectPropertyType maxMessageSize;
    @XmlElement(name = "Name")
    protected StringObjectPropertyType name;
    @XmlElement(name = "Read_Timeout")
    protected NonNegativeIntegerObjectPropertyType readTimeout;
    @XmlElement(name = "Security_Attributes")
    protected StringObjectPropertyType securityAttributes;

    /**
     * Gets the value of the handle property.
     * 
     * @return
     *     possible object is
     *     {@link WindowsHandleObjectType }
     *     
     */
    public WindowsHandleObjectType getHandle() {
        return handle;
    }

    /**
     * Sets the value of the handle property.
     * 
     * @param value
     *     allowed object is
     *     {@link WindowsHandleObjectType }
     *     
     */
    public void setHandle(WindowsHandleObjectType value) {
        this.handle = value;
    }

    /**
     * Gets the value of the maxMessageSize property.
     * 
     * @return
     *     possible object is
     *     {@link NonNegativeIntegerObjectPropertyType }
     *     
     */
    public NonNegativeIntegerObjectPropertyType getMaxMessageSize() {
        return maxMessageSize;
    }

    /**
     * Sets the value of the maxMessageSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonNegativeIntegerObjectPropertyType }
     *     
     */
    public void setMaxMessageSize(NonNegativeIntegerObjectPropertyType value) {
        this.maxMessageSize = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link StringObjectPropertyType }
     *     
     */
    public StringObjectPropertyType getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringObjectPropertyType }
     *     
     */
    public void setName(StringObjectPropertyType value) {
        this.name = value;
    }

    /**
     * Gets the value of the readTimeout property.
     * 
     * @return
     *     possible object is
     *     {@link NonNegativeIntegerObjectPropertyType }
     *     
     */
    public NonNegativeIntegerObjectPropertyType getReadTimeout() {
        return readTimeout;
    }

    /**
     * Sets the value of the readTimeout property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonNegativeIntegerObjectPropertyType }
     *     
     */
    public void setReadTimeout(NonNegativeIntegerObjectPropertyType value) {
        this.readTimeout = value;
    }

    /**
     * Gets the value of the securityAttributes property.
     * 
     * @return
     *     possible object is
     *     {@link StringObjectPropertyType }
     *     
     */
    public StringObjectPropertyType getSecurityAttributes() {
        return securityAttributes;
    }

    /**
     * Sets the value of the securityAttributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringObjectPropertyType }
     *     
     */
    public void setSecurityAttributes(StringObjectPropertyType value) {
        this.securityAttributes = value;
    }

}

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
import org.mitre.cybox.common_2.StringObjectPropertyType;


/**
 * The GUIWindowObjectType is intended to characterize GUI windows.
 * 
 * <p>Java class for GUIWindowObjectType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GUIWindowObjectType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://cybox.mitre.org/objects#GUIObject-2}GUIObjectType">
 *       &lt;sequence>
 *         &lt;element name="Owner_Window" type="{http://cybox.mitre.org/common-2}StringObjectPropertyType" minOccurs="0"/>
 *         &lt;element name="Parent_Window" type="{http://cybox.mitre.org/common-2}StringObjectPropertyType" minOccurs="0"/>
 *         &lt;element name="Window_Display_Name" type="{http://cybox.mitre.org/common-2}StringObjectPropertyType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GUIWindowObjectType", namespace = "http://cybox.mitre.org/objects#GUIWindowObject-2", propOrder = {
    "ownerWindow",
    "parentWindow",
    "windowDisplayName"
})
public class GUIWindowObjectType
    extends GUIObjectType
{

    @XmlElement(name = "Owner_Window")
    protected StringObjectPropertyType ownerWindow;
    @XmlElement(name = "Parent_Window")
    protected StringObjectPropertyType parentWindow;
    @XmlElement(name = "Window_Display_Name")
    protected StringObjectPropertyType windowDisplayName;

    /**
     * Gets the value of the ownerWindow property.
     * 
     * @return
     *     possible object is
     *     {@link StringObjectPropertyType }
     *     
     */
    public StringObjectPropertyType getOwnerWindow() {
        return ownerWindow;
    }

    /**
     * Sets the value of the ownerWindow property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringObjectPropertyType }
     *     
     */
    public void setOwnerWindow(StringObjectPropertyType value) {
        this.ownerWindow = value;
    }

    /**
     * Gets the value of the parentWindow property.
     * 
     * @return
     *     possible object is
     *     {@link StringObjectPropertyType }
     *     
     */
    public StringObjectPropertyType getParentWindow() {
        return parentWindow;
    }

    /**
     * Sets the value of the parentWindow property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringObjectPropertyType }
     *     
     */
    public void setParentWindow(StringObjectPropertyType value) {
        this.parentWindow = value;
    }

    /**
     * Gets the value of the windowDisplayName property.
     * 
     * @return
     *     possible object is
     *     {@link StringObjectPropertyType }
     *     
     */
    public StringObjectPropertyType getWindowDisplayName() {
        return windowDisplayName;
    }

    /**
     * Sets the value of the windowDisplayName property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringObjectPropertyType }
     *     
     */
    public void setWindowDisplayName(StringObjectPropertyType value) {
        this.windowDisplayName = value;
    }

}
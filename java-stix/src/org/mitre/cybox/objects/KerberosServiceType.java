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
 * The KerberosServiceType specifies the properties of the Kerberos delegation service for the Windows computer account.
 * 
 * <p>Java class for KerberosServiceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="KerberosServiceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Computer" type="{http://cybox.mitre.org/common-2}StringObjectPropertyType" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://cybox.mitre.org/common-2}StringObjectPropertyType" minOccurs="0"/>
 *         &lt;element name="Port" type="{http://cybox.mitre.org/objects#PortObject-2}PortObjectType" minOccurs="0"/>
 *         &lt;element name="User" type="{http://cybox.mitre.org/common-2}StringObjectPropertyType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KerberosServiceType", namespace = "http://cybox.mitre.org/objects#WinComputerAccountObject-2", propOrder = {
    "computer",
    "name",
    "port",
    "user"
})
public class KerberosServiceType {

    @XmlElement(name = "Computer")
    protected StringObjectPropertyType computer;
    @XmlElement(name = "Name")
    protected StringObjectPropertyType name;
    @XmlElement(name = "Port")
    protected PortObjectType port;
    @XmlElement(name = "User")
    protected StringObjectPropertyType user;

    /**
     * Gets the value of the computer property.
     * 
     * @return
     *     possible object is
     *     {@link StringObjectPropertyType }
     *     
     */
    public StringObjectPropertyType getComputer() {
        return computer;
    }

    /**
     * Sets the value of the computer property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringObjectPropertyType }
     *     
     */
    public void setComputer(StringObjectPropertyType value) {
        this.computer = value;
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
     * Gets the value of the port property.
     * 
     * @return
     *     possible object is
     *     {@link PortObjectType }
     *     
     */
    public PortObjectType getPort() {
        return port;
    }

    /**
     * Sets the value of the port property.
     * 
     * @param value
     *     allowed object is
     *     {@link PortObjectType }
     *     
     */
    public void setPort(PortObjectType value) {
        this.port = value;
    }

    /**
     * Gets the value of the user property.
     * 
     * @return
     *     possible object is
     *     {@link StringObjectPropertyType }
     *     
     */
    public StringObjectPropertyType getUser() {
        return user;
    }

    /**
     * Sets the value of the user property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringObjectPropertyType }
     *     
     */
    public void setUser(StringObjectPropertyType value) {
        this.user = value;
    }

}

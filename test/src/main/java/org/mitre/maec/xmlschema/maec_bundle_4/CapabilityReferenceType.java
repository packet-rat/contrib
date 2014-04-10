//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.04.09 at 05:02:22 PM EDT 
//


package org.mitre.maec.xmlschema.maec_bundle_4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;


/**
 * The CapabilityReferenceType serves as a method for referencing existing Capabilities contained in the MAEC document.
 * 
 * <p>Java class for CapabilityReferenceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CapabilityReferenceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="capability_idref" use="required" type="{http://www.w3.org/2001/XMLSchema}QName" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CapabilityReferenceType")
public class CapabilityReferenceType {

    @XmlAttribute(name = "capability_idref", required = true)
    protected QName capabilityIdref;

    /**
     * Gets the value of the capabilityIdref property.
     * 
     * @return
     *     possible object is
     *     {@link QName }
     *     
     */
    public QName getCapabilityIdref() {
        return capabilityIdref;
    }

    /**
     * Sets the value of the capabilityIdref property.
     * 
     * @param value
     *     allowed object is
     *     {@link QName }
     *     
     */
    public void setCapabilityIdref(QName value) {
        this.capabilityIdref = value;
    }

}
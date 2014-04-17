//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.04.17 at 04:06:30 PM EDT 
//


package org.mitre.maec.xmlschema.maec_bundle_4;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * The CapabilityListType captures a list of Capabilities.
 * 
 * <p>Java class for CapabilityListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CapabilityListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded">
 *         &lt;element name="Capability" type="{http://maec.mitre.org/XMLSchema/maec-bundle-4}CapabilityType"/>
 *         &lt;element name="Capability_Reference" type="{http://maec.mitre.org/XMLSchema/maec-bundle-4}CapabilityReferenceType"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CapabilityListType", propOrder = {
    "capabilityOrCapabilityReference"
})
public class CapabilityListType {

    @XmlElements({
        @XmlElement(name = "Capability", type = CapabilityType.class),
        @XmlElement(name = "Capability_Reference", type = CapabilityReferenceType.class)
    })
    protected List<Object> capabilityOrCapabilityReference;

    /**
     * Gets the value of the capabilityOrCapabilityReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the capabilityOrCapabilityReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCapabilityOrCapabilityReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CapabilityType }
     * {@link CapabilityReferenceType }
     * 
     * 
     */
    public List<Object> getCapabilityOrCapabilityReference() {
        if (capabilityOrCapabilityReference == null) {
            capabilityOrCapabilityReference = new ArrayList<Object>();
        }
        return this.capabilityOrCapabilityReference;
    }

}

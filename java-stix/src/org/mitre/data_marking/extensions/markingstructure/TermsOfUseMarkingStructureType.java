//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.04.17 at 04:06:30 PM EDT 
//


package org.mitre.data_marking.extensions.markingstructure;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.mitre.data_marking.marking_1.MarkingStructureType;


/**
 * Nodes may be marked by multiple Terms Of Use Marking statements. When this occurs, all of the multiple Terms of Use Marking statements apply. Its up to the organization adding an additional Term Of User Marking statement to ensure that it's Terms Of Use does not conflict with any previously applied Terms Of Use Marking Statement.
 * 
 * <p>Java class for TermsOfUseMarkingStructureType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TermsOfUseMarkingStructureType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://data-marking.mitre.org/Marking-1}MarkingStructureType">
 *       &lt;sequence>
 *         &lt;element name="Terms_Of_Use" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TermsOfUseMarkingStructureType", namespace = "http://data-marking.mitre.org/extensions/MarkingStructure#Terms_Of_Use-1", propOrder = {
    "termsOfUse"
})
public class TermsOfUseMarkingStructureType
    extends MarkingStructureType
{

    @XmlElement(name = "Terms_Of_Use", required = true)
    protected String termsOfUse;

    /**
     * Gets the value of the termsOfUse property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTermsOfUse() {
        return termsOfUse;
    }

    /**
     * Sets the value of the termsOfUse property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTermsOfUse(String value) {
        this.termsOfUse = value;
    }

}
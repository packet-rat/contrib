//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.04.17 at 04:06:30 PM EDT 
//


package org.mitre.maec.xmlschema.maec_package_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The MetaAnalysisType captures meta-analysis entities associated with the Bundles that were captured for a Malware Subject, such as Action Equivalencies.
 * 
 * <p>Java class for MetaAnalysisType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MetaAnalysisType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Action_Equivalences" type="{http://maec.mitre.org/XMLSchema/maec-package-2}ActionEquivalenceListType" minOccurs="0"/>
 *         &lt;element name="Object_Equivalences" type="{http://maec.mitre.org/XMLSchema/maec-package-2}ObjectEquivalenceListType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MetaAnalysisType", propOrder = {
    "actionEquivalences",
    "objectEquivalences"
})
public class MetaAnalysisType {

    @XmlElement(name = "Action_Equivalences")
    protected ActionEquivalenceListType actionEquivalences;
    @XmlElement(name = "Object_Equivalences")
    protected ObjectEquivalenceListType objectEquivalences;

    /**
     * Gets the value of the actionEquivalences property.
     * 
     * @return
     *     possible object is
     *     {@link ActionEquivalenceListType }
     *     
     */
    public ActionEquivalenceListType getActionEquivalences() {
        return actionEquivalences;
    }

    /**
     * Sets the value of the actionEquivalences property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActionEquivalenceListType }
     *     
     */
    public void setActionEquivalences(ActionEquivalenceListType value) {
        this.actionEquivalences = value;
    }

    /**
     * Gets the value of the objectEquivalences property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectEquivalenceListType }
     *     
     */
    public ObjectEquivalenceListType getObjectEquivalences() {
        return objectEquivalences;
    }

    /**
     * Sets the value of the objectEquivalences property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectEquivalenceListType }
     *     
     */
    public void setObjectEquivalences(ObjectEquivalenceListType value) {
        this.objectEquivalences = value;
    }

}
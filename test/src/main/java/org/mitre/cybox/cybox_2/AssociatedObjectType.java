//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.04.08 at 09:40:17 PM EDT 
//


package org.mitre.cybox.cybox_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.mitre.cybox.common_2.ControlledVocabularyStringType;


/**
 * The AssociatedObjectType is a complex type representing the characterization of a cyber observable Object associated with a given cyber observable Action.
 * 
 * <p>Java class for AssociatedObjectType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AssociatedObjectType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://cybox.mitre.org/cybox-2}ObjectType">
 *       &lt;sequence>
 *         &lt;element name="Association_Type" type="{http://cybox.mitre.org/common-2}ControlledVocabularyStringType" minOccurs="0"/>
 *         &lt;element name="Action_Pertinent_Object_Properties" type="{http://cybox.mitre.org/cybox-2}ActionPertinentObjectPropertiesType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AssociatedObjectType", propOrder = {
    "associationType",
    "actionPertinentObjectProperties"
})
public class AssociatedObjectType
    extends ObjectType
{

    @XmlElement(name = "Association_Type")
    protected ControlledVocabularyStringType associationType;
    @XmlElement(name = "Action_Pertinent_Object_Properties")
    protected ActionPertinentObjectPropertiesType actionPertinentObjectProperties;

    /**
     * Gets the value of the associationType property.
     * 
     * @return
     *     possible object is
     *     {@link ControlledVocabularyStringType }
     *     
     */
    public ControlledVocabularyStringType getAssociationType() {
        return associationType;
    }

    /**
     * Sets the value of the associationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ControlledVocabularyStringType }
     *     
     */
    public void setAssociationType(ControlledVocabularyStringType value) {
        this.associationType = value;
    }

    /**
     * Gets the value of the actionPertinentObjectProperties property.
     * 
     * @return
     *     possible object is
     *     {@link ActionPertinentObjectPropertiesType }
     *     
     */
    public ActionPertinentObjectPropertiesType getActionPertinentObjectProperties() {
        return actionPertinentObjectProperties;
    }

    /**
     * Sets the value of the actionPertinentObjectProperties property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActionPertinentObjectPropertiesType }
     *     
     */
    public void setActionPertinentObjectProperties(ActionPertinentObjectPropertiesType value) {
        this.actionPertinentObjectProperties = value;
    }

}
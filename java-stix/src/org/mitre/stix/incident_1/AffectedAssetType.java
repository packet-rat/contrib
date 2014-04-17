//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.04.17 at 04:06:30 PM EDT 
//


package org.mitre.stix.incident_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.mitre.cybox.cybox_2.ObservablesType;
import org.mitre.stix.common_1.AddressAbstractType;
import org.mitre.stix.common_1.ControlledVocabularyStringType;
import org.mitre.stix.common_1.StructuredTextType;


/**
 * <p>Java class for AffectedAssetType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AffectedAssetType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Type" type="{http://stix.mitre.org/Incident-1}AssetTypeType" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://stix.mitre.org/common-1}StructuredTextType" minOccurs="0"/>
 *         &lt;element name="Business_Function_Or_Role" type="{http://stix.mitre.org/common-1}StructuredTextType" minOccurs="0"/>
 *         &lt;element name="Ownership_Class" type="{http://stix.mitre.org/common-1}ControlledVocabularyStringType" minOccurs="0"/>
 *         &lt;element name="Management_Class" type="{http://stix.mitre.org/common-1}ControlledVocabularyStringType" minOccurs="0"/>
 *         &lt;element name="Location_Class" type="{http://stix.mitre.org/common-1}ControlledVocabularyStringType" minOccurs="0"/>
 *         &lt;element name="Location" type="{http://stix.mitre.org/common-1}AddressAbstractType" minOccurs="0"/>
 *         &lt;element name="Nature_Of_Security_Effect" type="{http://stix.mitre.org/Incident-1}NatureOfSecurityEffectType" minOccurs="0"/>
 *         &lt;element name="Structured_Description" type="{http://cybox.mitre.org/cybox-2}ObservablesType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AffectedAssetType", propOrder = {
    "type",
    "description",
    "businessFunctionOrRole",
    "ownershipClass",
    "managementClass",
    "locationClass",
    "location",
    "natureOfSecurityEffect",
    "structuredDescription"
})
public class AffectedAssetType {

    @XmlElement(name = "Type")
    protected AssetTypeType type;
    @XmlElement(name = "Description")
    protected StructuredTextType description;
    @XmlElement(name = "Business_Function_Or_Role")
    protected StructuredTextType businessFunctionOrRole;
    @XmlElement(name = "Ownership_Class")
    protected ControlledVocabularyStringType ownershipClass;
    @XmlElement(name = "Management_Class")
    protected ControlledVocabularyStringType managementClass;
    @XmlElement(name = "Location_Class")
    protected ControlledVocabularyStringType locationClass;
    @XmlElement(name = "Location")
    protected AddressAbstractType location;
    @XmlElement(name = "Nature_Of_Security_Effect")
    protected NatureOfSecurityEffectType natureOfSecurityEffect;
    @XmlElement(name = "Structured_Description")
    protected ObservablesType structuredDescription;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link AssetTypeType }
     *     
     */
    public AssetTypeType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssetTypeType }
     *     
     */
    public void setType(AssetTypeType value) {
        this.type = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link StructuredTextType }
     *     
     */
    public StructuredTextType getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link StructuredTextType }
     *     
     */
    public void setDescription(StructuredTextType value) {
        this.description = value;
    }

    /**
     * Gets the value of the businessFunctionOrRole property.
     * 
     * @return
     *     possible object is
     *     {@link StructuredTextType }
     *     
     */
    public StructuredTextType getBusinessFunctionOrRole() {
        return businessFunctionOrRole;
    }

    /**
     * Sets the value of the businessFunctionOrRole property.
     * 
     * @param value
     *     allowed object is
     *     {@link StructuredTextType }
     *     
     */
    public void setBusinessFunctionOrRole(StructuredTextType value) {
        this.businessFunctionOrRole = value;
    }

    /**
     * Gets the value of the ownershipClass property.
     * 
     * @return
     *     possible object is
     *     {@link ControlledVocabularyStringType }
     *     
     */
    public ControlledVocabularyStringType getOwnershipClass() {
        return ownershipClass;
    }

    /**
     * Sets the value of the ownershipClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link ControlledVocabularyStringType }
     *     
     */
    public void setOwnershipClass(ControlledVocabularyStringType value) {
        this.ownershipClass = value;
    }

    /**
     * Gets the value of the managementClass property.
     * 
     * @return
     *     possible object is
     *     {@link ControlledVocabularyStringType }
     *     
     */
    public ControlledVocabularyStringType getManagementClass() {
        return managementClass;
    }

    /**
     * Sets the value of the managementClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link ControlledVocabularyStringType }
     *     
     */
    public void setManagementClass(ControlledVocabularyStringType value) {
        this.managementClass = value;
    }

    /**
     * Gets the value of the locationClass property.
     * 
     * @return
     *     possible object is
     *     {@link ControlledVocabularyStringType }
     *     
     */
    public ControlledVocabularyStringType getLocationClass() {
        return locationClass;
    }

    /**
     * Sets the value of the locationClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link ControlledVocabularyStringType }
     *     
     */
    public void setLocationClass(ControlledVocabularyStringType value) {
        this.locationClass = value;
    }

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link AddressAbstractType }
     *     
     */
    public AddressAbstractType getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressAbstractType }
     *     
     */
    public void setLocation(AddressAbstractType value) {
        this.location = value;
    }

    /**
     * Gets the value of the natureOfSecurityEffect property.
     * 
     * @return
     *     possible object is
     *     {@link NatureOfSecurityEffectType }
     *     
     */
    public NatureOfSecurityEffectType getNatureOfSecurityEffect() {
        return natureOfSecurityEffect;
    }

    /**
     * Sets the value of the natureOfSecurityEffect property.
     * 
     * @param value
     *     allowed object is
     *     {@link NatureOfSecurityEffectType }
     *     
     */
    public void setNatureOfSecurityEffect(NatureOfSecurityEffectType value) {
        this.natureOfSecurityEffect = value;
    }

    /**
     * Gets the value of the structuredDescription property.
     * 
     * @return
     *     possible object is
     *     {@link ObservablesType }
     *     
     */
    public ObservablesType getStructuredDescription() {
        return structuredDescription;
    }

    /**
     * Sets the value of the structuredDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObservablesType }
     *     
     */
    public void setStructuredDescription(ObservablesType value) {
        this.structuredDescription = value;
    }

}
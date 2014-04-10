//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.04.08 at 09:40:17 PM EDT 
//


package org.mitre.stix.incident_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.mitre.stix.common_1.ControlledVocabularyStringType;


/**
 * <p>Java class for DirectImpactSummaryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DirectImpactSummaryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Asset_Losses" type="{http://stix.mitre.org/common-1}ControlledVocabularyStringType" minOccurs="0"/>
 *         &lt;element name="Business-Mission_Disruption" type="{http://stix.mitre.org/common-1}ControlledVocabularyStringType" minOccurs="0"/>
 *         &lt;element name="Response_And_Recovery_Costs" type="{http://stix.mitre.org/common-1}ControlledVocabularyStringType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DirectImpactSummaryType", propOrder = {
    "assetLosses",
    "businessMissionDisruption",
    "responseAndRecoveryCosts"
})
public class DirectImpactSummaryType {

    @XmlElement(name = "Asset_Losses")
    protected ControlledVocabularyStringType assetLosses;
    @XmlElement(name = "Business-Mission_Disruption")
    protected ControlledVocabularyStringType businessMissionDisruption;
    @XmlElement(name = "Response_And_Recovery_Costs")
    protected ControlledVocabularyStringType responseAndRecoveryCosts;

    /**
     * Gets the value of the assetLosses property.
     * 
     * @return
     *     possible object is
     *     {@link ControlledVocabularyStringType }
     *     
     */
    public ControlledVocabularyStringType getAssetLosses() {
        return assetLosses;
    }

    /**
     * Sets the value of the assetLosses property.
     * 
     * @param value
     *     allowed object is
     *     {@link ControlledVocabularyStringType }
     *     
     */
    public void setAssetLosses(ControlledVocabularyStringType value) {
        this.assetLosses = value;
    }

    /**
     * Gets the value of the businessMissionDisruption property.
     * 
     * @return
     *     possible object is
     *     {@link ControlledVocabularyStringType }
     *     
     */
    public ControlledVocabularyStringType getBusinessMissionDisruption() {
        return businessMissionDisruption;
    }

    /**
     * Sets the value of the businessMissionDisruption property.
     * 
     * @param value
     *     allowed object is
     *     {@link ControlledVocabularyStringType }
     *     
     */
    public void setBusinessMissionDisruption(ControlledVocabularyStringType value) {
        this.businessMissionDisruption = value;
    }

    /**
     * Gets the value of the responseAndRecoveryCosts property.
     * 
     * @return
     *     possible object is
     *     {@link ControlledVocabularyStringType }
     *     
     */
    public ControlledVocabularyStringType getResponseAndRecoveryCosts() {
        return responseAndRecoveryCosts;
    }

    /**
     * Sets the value of the responseAndRecoveryCosts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ControlledVocabularyStringType }
     *     
     */
    public void setResponseAndRecoveryCosts(ControlledVocabularyStringType value) {
        this.responseAndRecoveryCosts = value;
    }

}

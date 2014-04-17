//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.04.17 at 04:06:30 PM EDT 
//


package org.mitre.stix.courseofaction_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.mitre.cybox.cybox_2.ObservablesType;
import org.mitre.data_marking.marking_1.MarkingType;
import org.mitre.stix.common_1.ControlledVocabularyStringType;
import org.mitre.stix.common_1.CourseOfActionBaseType;
import org.mitre.stix.common_1.InformationSourceType;
import org.mitre.stix.common_1.RelatedPackageRefsType;
import org.mitre.stix.common_1.StatementType;
import org.mitre.stix.common_1.StructuredTextType;


/**
 * The CourseOfActionType characterizes a Course of Action to be taken in regards to one of more cyber threats. NOTE: This construct is still in its early stages of maturity and will require a good deal of review and refinement.
 * 
 * <p>Java class for CourseOfActionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CourseOfActionType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://stix.mitre.org/common-1}CourseOfActionBaseType">
 *       &lt;sequence>
 *         &lt;element name="Title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Stage" type="{http://stix.mitre.org/common-1}ControlledVocabularyStringType" minOccurs="0"/>
 *         &lt;element name="Type" type="{http://stix.mitre.org/common-1}ControlledVocabularyStringType" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://stix.mitre.org/common-1}StructuredTextType" minOccurs="0"/>
 *         &lt;element name="Short_Description" type="{http://stix.mitre.org/common-1}StructuredTextType" minOccurs="0"/>
 *         &lt;element name="Objective" type="{http://stix.mitre.org/CourseOfAction-1}ObjectiveType" minOccurs="0"/>
 *         &lt;element name="Parameter_Observables" type="{http://cybox.mitre.org/cybox-2}ObservablesType" minOccurs="0"/>
 *         &lt;element name="Structured_COA" type="{http://stix.mitre.org/CourseOfAction-1}StructuredCOAType" minOccurs="0"/>
 *         &lt;element name="Impact" type="{http://stix.mitre.org/common-1}StatementType" minOccurs="0"/>
 *         &lt;element name="Cost" type="{http://stix.mitre.org/common-1}StatementType" minOccurs="0"/>
 *         &lt;element name="Efficacy" type="{http://stix.mitre.org/common-1}StatementType" minOccurs="0"/>
 *         &lt;element name="Information_Source" type="{http://stix.mitre.org/common-1}InformationSourceType" minOccurs="0"/>
 *         &lt;element name="Handling" type="{http://data-marking.mitre.org/Marking-1}MarkingType" minOccurs="0"/>
 *         &lt;element name="Related_COAs" type="{http://stix.mitre.org/CourseOfAction-1}RelatedCOAsType" minOccurs="0"/>
 *         &lt;element name="Related_Packages" type="{http://stix.mitre.org/common-1}RelatedPackageRefsType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="version" type="{http://stix.mitre.org/CourseOfAction-1}CourseOfActionVersionType" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CourseOfActionType", propOrder = {
    "title",
    "stage",
    "type",
    "description",
    "shortDescription",
    "objective",
    "parameterObservables",
    "structuredCOA",
    "impact",
    "cost",
    "efficacy",
    "informationSource",
    "handling",
    "relatedCOAs",
    "relatedPackages"
})
public class CourseOfActionType
    extends CourseOfActionBaseType
{

    @XmlElement(name = "Title")
    protected String title;
    @XmlElement(name = "Stage")
    protected ControlledVocabularyStringType stage;
    @XmlElement(name = "Type")
    protected ControlledVocabularyStringType type;
    @XmlElement(name = "Description")
    protected StructuredTextType description;
    @XmlElement(name = "Short_Description")
    protected StructuredTextType shortDescription;
    @XmlElement(name = "Objective")
    protected ObjectiveType objective;
    @XmlElement(name = "Parameter_Observables")
    protected ObservablesType parameterObservables;
    @XmlElement(name = "Structured_COA")
    protected StructuredCOAType structuredCOA;
    @XmlElement(name = "Impact")
    protected StatementType impact;
    @XmlElement(name = "Cost")
    protected StatementType cost;
    @XmlElement(name = "Efficacy")
    protected StatementType efficacy;
    @XmlElement(name = "Information_Source")
    protected InformationSourceType informationSource;
    @XmlElement(name = "Handling")
    protected MarkingType handling;
    @XmlElement(name = "Related_COAs")
    protected RelatedCOAsType relatedCOAs;
    @XmlElement(name = "Related_Packages")
    protected RelatedPackageRefsType relatedPackages;
    @XmlAttribute(name = "version")
    protected String version;

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the stage property.
     * 
     * @return
     *     possible object is
     *     {@link ControlledVocabularyStringType }
     *     
     */
    public ControlledVocabularyStringType getStage() {
        return stage;
    }

    /**
     * Sets the value of the stage property.
     * 
     * @param value
     *     allowed object is
     *     {@link ControlledVocabularyStringType }
     *     
     */
    public void setStage(ControlledVocabularyStringType value) {
        this.stage = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link ControlledVocabularyStringType }
     *     
     */
    public ControlledVocabularyStringType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link ControlledVocabularyStringType }
     *     
     */
    public void setType(ControlledVocabularyStringType value) {
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
     * Gets the value of the shortDescription property.
     * 
     * @return
     *     possible object is
     *     {@link StructuredTextType }
     *     
     */
    public StructuredTextType getShortDescription() {
        return shortDescription;
    }

    /**
     * Sets the value of the shortDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link StructuredTextType }
     *     
     */
    public void setShortDescription(StructuredTextType value) {
        this.shortDescription = value;
    }

    /**
     * Gets the value of the objective property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectiveType }
     *     
     */
    public ObjectiveType getObjective() {
        return objective;
    }

    /**
     * Sets the value of the objective property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectiveType }
     *     
     */
    public void setObjective(ObjectiveType value) {
        this.objective = value;
    }

    /**
     * Gets the value of the parameterObservables property.
     * 
     * @return
     *     possible object is
     *     {@link ObservablesType }
     *     
     */
    public ObservablesType getParameterObservables() {
        return parameterObservables;
    }

    /**
     * Sets the value of the parameterObservables property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObservablesType }
     *     
     */
    public void setParameterObservables(ObservablesType value) {
        this.parameterObservables = value;
    }

    /**
     * Gets the value of the structuredCOA property.
     * 
     * @return
     *     possible object is
     *     {@link StructuredCOAType }
     *     
     */
    public StructuredCOAType getStructuredCOA() {
        return structuredCOA;
    }

    /**
     * Sets the value of the structuredCOA property.
     * 
     * @param value
     *     allowed object is
     *     {@link StructuredCOAType }
     *     
     */
    public void setStructuredCOA(StructuredCOAType value) {
        this.structuredCOA = value;
    }

    /**
     * Gets the value of the impact property.
     * 
     * @return
     *     possible object is
     *     {@link StatementType }
     *     
     */
    public StatementType getImpact() {
        return impact;
    }

    /**
     * Sets the value of the impact property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatementType }
     *     
     */
    public void setImpact(StatementType value) {
        this.impact = value;
    }

    /**
     * Gets the value of the cost property.
     * 
     * @return
     *     possible object is
     *     {@link StatementType }
     *     
     */
    public StatementType getCost() {
        return cost;
    }

    /**
     * Sets the value of the cost property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatementType }
     *     
     */
    public void setCost(StatementType value) {
        this.cost = value;
    }

    /**
     * Gets the value of the efficacy property.
     * 
     * @return
     *     possible object is
     *     {@link StatementType }
     *     
     */
    public StatementType getEfficacy() {
        return efficacy;
    }

    /**
     * Sets the value of the efficacy property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatementType }
     *     
     */
    public void setEfficacy(StatementType value) {
        this.efficacy = value;
    }

    /**
     * Gets the value of the informationSource property.
     * 
     * @return
     *     possible object is
     *     {@link InformationSourceType }
     *     
     */
    public InformationSourceType getInformationSource() {
        return informationSource;
    }

    /**
     * Sets the value of the informationSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link InformationSourceType }
     *     
     */
    public void setInformationSource(InformationSourceType value) {
        this.informationSource = value;
    }

    /**
     * Gets the value of the handling property.
     * 
     * @return
     *     possible object is
     *     {@link MarkingType }
     *     
     */
    public MarkingType getHandling() {
        return handling;
    }

    /**
     * Sets the value of the handling property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarkingType }
     *     
     */
    public void setHandling(MarkingType value) {
        this.handling = value;
    }

    /**
     * Gets the value of the relatedCOAs property.
     * 
     * @return
     *     possible object is
     *     {@link RelatedCOAsType }
     *     
     */
    public RelatedCOAsType getRelatedCOAs() {
        return relatedCOAs;
    }

    /**
     * Sets the value of the relatedCOAs property.
     * 
     * @param value
     *     allowed object is
     *     {@link RelatedCOAsType }
     *     
     */
    public void setRelatedCOAs(RelatedCOAsType value) {
        this.relatedCOAs = value;
    }

    /**
     * Gets the value of the relatedPackages property.
     * 
     * @return
     *     possible object is
     *     {@link RelatedPackageRefsType }
     *     
     */
    public RelatedPackageRefsType getRelatedPackages() {
        return relatedPackages;
    }

    /**
     * Sets the value of the relatedPackages property.
     * 
     * @param value
     *     allowed object is
     *     {@link RelatedPackageRefsType }
     *     
     */
    public void setRelatedPackages(RelatedPackageRefsType value) {
        this.relatedPackages = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

}
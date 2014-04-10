//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.04.09 at 05:02:22 PM EDT 
//


package org.mitre.capec.capec_2;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Description">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Description_Summary" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Extended_Description" type="{http://capec.mitre.org/capec-2}Structured_Text_Type" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element ref="{http://capec.mitre.org/capec-2}Relationships" minOccurs="0"/>
 *         &lt;element ref="{http://capec.mitre.org/capec-2}Relationship_Notes" minOccurs="0"/>
 *         &lt;element ref="{http://capec.mitre.org/capec-2}Maintenance_Notes" minOccurs="0"/>
 *         &lt;element name="Background_Details" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Background_Detail" type="{http://capec.mitre.org/capec-2}Structured_Text_Type" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element ref="{http://capec.mitre.org/capec-2}Other_Notes" minOccurs="0"/>
 *         &lt;element ref="{http://capec.mitre.org/capec-2}Alternate_Terms" minOccurs="0"/>
 *         &lt;element ref="{http://capec.mitre.org/capec-2}Research_Gaps" minOccurs="0"/>
 *         &lt;element name="References" type="{http://capec.mitre.org/capec-2}Reference_List_Type" minOccurs="0"/>
 *         &lt;element ref="{http://capec.mitre.org/capec-2}Content_History" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="Name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Compound_Element_Abstraction" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;whiteSpace value="collapse"/>
 *             &lt;enumeration value="Meta"/>
 *             &lt;enumeration value="Standard"/>
 *             &lt;enumeration value="Detailed"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="Compound_Element_Completeness" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;whiteSpace value="collapse"/>
 *             &lt;enumeration value="Complete"/>
 *             &lt;enumeration value="Stub"/>
 *             &lt;enumeration value="Hook"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="Compound_Element_Structure" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;whiteSpace value="collapse"/>
 *             &lt;enumeration value="Composite"/>
 *             &lt;enumeration value="Chain"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="Status" use="required" type="{http://capec.mitre.org/capec-2}Status_Type" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "description",
    "relationships",
    "relationshipNotes",
    "maintenanceNotes",
    "backgroundDetails",
    "otherNotes",
    "alternateTerms",
    "researchGaps",
    "references",
    "contentHistory"
})
@XmlRootElement(name = "Compound_Element")
public class CompoundElement {

    @XmlElement(name = "Description", required = true)
    protected CompoundElement.Description description;
    @XmlElement(name = "Relationships")
    protected Relationships relationships;
    @XmlElement(name = "Relationship_Notes")
    protected RelationshipNotes relationshipNotes;
    @XmlElement(name = "Maintenance_Notes")
    protected MaintenanceNotes maintenanceNotes;
    @XmlElement(name = "Background_Details")
    protected CompoundElement.BackgroundDetails backgroundDetails;
    @XmlElement(name = "Other_Notes")
    protected OtherNotes otherNotes;
    @XmlElement(name = "Alternate_Terms")
    protected AlternateTerms alternateTerms;
    @XmlElement(name = "Research_Gaps")
    protected ResearchGaps researchGaps;
    @XmlElement(name = "References")
    protected ReferenceListType references;
    @XmlElement(name = "Content_History")
    protected ContentHistory contentHistory;
    @XmlAttribute(name = "ID", required = true)
    protected BigInteger id;
    @XmlAttribute(name = "Name", required = true)
    protected String name;
    @XmlAttribute(name = "Compound_Element_Abstraction", required = true)
    protected String compoundElementAbstraction;
    @XmlAttribute(name = "Compound_Element_Completeness", required = true)
    protected String compoundElementCompleteness;
    @XmlAttribute(name = "Compound_Element_Structure", required = true)
    protected String compoundElementStructure;
    @XmlAttribute(name = "Status", required = true)
    protected StatusType status;

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link CompoundElement.Description }
     *     
     */
    public CompoundElement.Description getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompoundElement.Description }
     *     
     */
    public void setDescription(CompoundElement.Description value) {
        this.description = value;
    }

    /**
     * The Relationships structure contains one or more
     * 							Relationship elements, each of which identifies an association between
     * 							this structure, whether it is an Attack Pattern, Category, or
     * 							Compound_Element and another structure.
     * 
     * @return
     *     possible object is
     *     {@link Relationships }
     *     
     */
    public Relationships getRelationships() {
        return relationships;
    }

    /**
     * Sets the value of the relationships property.
     * 
     * @param value
     *     allowed object is
     *     {@link Relationships }
     *     
     */
    public void setRelationships(Relationships value) {
        this.relationships = value;
    }

    /**
     * This structure houses one or more Relationship_Note
     * 							elements, which each contain details regarding the relationships between
     * 							CAPEC entries.
     * 
     * @return
     *     possible object is
     *     {@link RelationshipNotes }
     *     
     */
    public RelationshipNotes getRelationshipNotes() {
        return relationshipNotes;
    }

    /**
     * Sets the value of the relationshipNotes property.
     * 
     * @param value
     *     allowed object is
     *     {@link RelationshipNotes }
     *     
     */
    public void setRelationshipNotes(RelationshipNotes value) {
        this.relationshipNotes = value;
    }

    /**
     * This element contains one or more Maintenance_Note
     * 							elements which each contain significant maintenance tasks within this
     * 							entry that still need to be addressed, such as clarifying the concepts
     * 							involved or improving relationships. It should be filled out in any
     * 							entry that is still undergoing significant review by the CAPEC
     * 							team.
     * 
     * @return
     *     possible object is
     *     {@link MaintenanceNotes }
     *     
     */
    public MaintenanceNotes getMaintenanceNotes() {
        return maintenanceNotes;
    }

    /**
     * Sets the value of the maintenanceNotes property.
     * 
     * @param value
     *     allowed object is
     *     {@link MaintenanceNotes }
     *     
     */
    public void setMaintenanceNotes(MaintenanceNotes value) {
        this.maintenanceNotes = value;
    }

    /**
     * Gets the value of the backgroundDetails property.
     * 
     * @return
     *     possible object is
     *     {@link CompoundElement.BackgroundDetails }
     *     
     */
    public CompoundElement.BackgroundDetails getBackgroundDetails() {
        return backgroundDetails;
    }

    /**
     * Sets the value of the backgroundDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompoundElement.BackgroundDetails }
     *     
     */
    public void setBackgroundDetails(CompoundElement.BackgroundDetails value) {
        this.backgroundDetails = value;
    }

    /**
     * This element contains one or more Note elements, each of
     * 							which provide any additional notes or comments that cannot be captured
     * 							using other elements. New elements might be defined in the future to
     * 							contain this information. It should be filled out where needed.
     * 						
     * 
     * @return
     *     possible object is
     *     {@link OtherNotes }
     *     
     */
    public OtherNotes getOtherNotes() {
        return otherNotes;
    }

    /**
     * Sets the value of the otherNotes property.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherNotes }
     *     
     */
    public void setOtherNotes(OtherNotes value) {
        this.otherNotes = value;
    }

    /**
     * This element contains one or more Alternate_Term elements,
     * 							each of which contains other names used to describe this attack
     * 							pattern.
     * 
     * @return
     *     possible object is
     *     {@link AlternateTerms }
     *     
     */
    public AlternateTerms getAlternateTerms() {
        return alternateTerms;
    }

    /**
     * Sets the value of the alternateTerms property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlternateTerms }
     *     
     */
    public void setAlternateTerms(AlternateTerms value) {
        this.alternateTerms = value;
    }

    /**
     * This structure contains one or more Research gap elements,
     * 							each of which identifies potential opportunities for the vulnerability
     * 							research community to conduct further exploration of issues related to
     * 							this attack pattern. It is intended to highlight parts of CAPEC that
     * 							have not received sufficient attention from researchers. This should be
     * 							filled out where appropriate for attack patterns and
     * 							categories.
     * 
     * @return
     *     possible object is
     *     {@link ResearchGaps }
     *     
     */
    public ResearchGaps getResearchGaps() {
        return researchGaps;
    }

    /**
     * Sets the value of the researchGaps property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResearchGaps }
     *     
     */
    public void setResearchGaps(ResearchGaps value) {
        this.researchGaps = value;
    }

    /**
     * Gets the value of the references property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceListType }
     *     
     */
    public ReferenceListType getReferences() {
        return references;
    }

    /**
     * Sets the value of the references property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceListType }
     *     
     */
    public void setReferences(ReferenceListType value) {
        this.references = value;
    }

    /**
     * This element is used to keep track of the author of the
     * 							attack pattern entry and anyone who has made modifications to the
     * 							content. This provides a means of contacting the authors and modifiers
     * 							for clarifying ambiguities, merging overlapping contributions, etc. This
     * 							should be filled out for all entries.
     * 
     * @return
     *     possible object is
     *     {@link ContentHistory }
     *     
     */
    public ContentHistory getContentHistory() {
        return contentHistory;
    }

    /**
     * Sets the value of the contentHistory property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentHistory }
     *     
     */
    public void setContentHistory(ContentHistory value) {
        this.contentHistory = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setID(BigInteger value) {
        this.id = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the compoundElementAbstraction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompoundElementAbstraction() {
        return compoundElementAbstraction;
    }

    /**
     * Sets the value of the compoundElementAbstraction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompoundElementAbstraction(String value) {
        this.compoundElementAbstraction = value;
    }

    /**
     * Gets the value of the compoundElementCompleteness property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompoundElementCompleteness() {
        return compoundElementCompleteness;
    }

    /**
     * Sets the value of the compoundElementCompleteness property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompoundElementCompleteness(String value) {
        this.compoundElementCompleteness = value;
    }

    /**
     * Gets the value of the compoundElementStructure property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompoundElementStructure() {
        return compoundElementStructure;
    }

    /**
     * Sets the value of the compoundElementStructure property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompoundElementStructure(String value) {
        this.compoundElementStructure = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link StatusType }
     *     
     */
    public StatusType getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusType }
     *     
     */
    public void setStatus(StatusType value) {
        this.status = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Background_Detail" type="{http://capec.mitre.org/capec-2}Structured_Text_Type" maxOccurs="unbounded"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "backgroundDetail"
    })
    public static class BackgroundDetails {

        @XmlElement(name = "Background_Detail", required = true)
        protected List<StructuredTextType> backgroundDetail;

        /**
         * Gets the value of the backgroundDetail property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the backgroundDetail property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getBackgroundDetail().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link StructuredTextType }
         * 
         * 
         */
        public List<StructuredTextType> getBackgroundDetail() {
            if (backgroundDetail == null) {
                backgroundDetail = new ArrayList<StructuredTextType>();
            }
            return this.backgroundDetail;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Description_Summary" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="Extended_Description" type="{http://capec.mitre.org/capec-2}Structured_Text_Type" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "descriptionSummary",
        "extendedDescription"
    })
    public static class Description {

        @XmlElement(name = "Description_Summary", required = true)
        protected String descriptionSummary;
        @XmlElement(name = "Extended_Description")
        protected StructuredTextType extendedDescription;

        /**
         * Gets the value of the descriptionSummary property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDescriptionSummary() {
            return descriptionSummary;
        }

        /**
         * Sets the value of the descriptionSummary property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDescriptionSummary(String value) {
            this.descriptionSummary = value;
        }

        /**
         * Gets the value of the extendedDescription property.
         * 
         * @return
         *     possible object is
         *     {@link StructuredTextType }
         *     
         */
        public StructuredTextType getExtendedDescription() {
            return extendedDescription;
        }

        /**
         * Sets the value of the extendedDescription property.
         * 
         * @param value
         *     allowed object is
         *     {@link StructuredTextType }
         *     
         */
        public void setExtendedDescription(StructuredTextType value) {
            this.extendedDescription = value;
        }

    }

}

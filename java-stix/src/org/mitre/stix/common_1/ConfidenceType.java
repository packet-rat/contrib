//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.04.17 at 04:06:30 PM EDT 
//


package org.mitre.stix.common_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * The ConfidenceType specifies a level of Confidence held in some assertion.
 * 
 * <p>Java class for ConfidenceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConfidenceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Value" type="{http://stix.mitre.org/common-1}ControlledVocabularyStringType" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://stix.mitre.org/common-1}StructuredTextType" minOccurs="0"/>
 *         &lt;element name="Source" type="{http://stix.mitre.org/common-1}ControlledVocabularyStringType" minOccurs="0"/>
 *         &lt;element name="Confidence_Assertion_Chain" type="{http://stix.mitre.org/common-1}ConfidenceAssertionChainType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="timestamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="timestamp_precision" type="{http://stix.mitre.org/common-1}DateTimePrecisionEnum" default="second" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConfidenceType", propOrder = {
    "value",
    "description",
    "source",
    "confidenceAssertionChain"
})
public class ConfidenceType {

    @XmlElement(name = "Value")
    protected ControlledVocabularyStringType value;
    @XmlElement(name = "Description")
    protected StructuredTextType description;
    @XmlElement(name = "Source")
    protected ControlledVocabularyStringType source;
    @XmlElement(name = "Confidence_Assertion_Chain")
    protected ConfidenceAssertionChainType confidenceAssertionChain;
    @XmlAttribute(name = "timestamp")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timestamp;
    @XmlAttribute(name = "timestamp_precision")
    protected DateTimePrecisionEnum timestampPrecision;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link ControlledVocabularyStringType }
     *     
     */
    public ControlledVocabularyStringType getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link ControlledVocabularyStringType }
     *     
     */
    public void setValue(ControlledVocabularyStringType value) {
        this.value = value;
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
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link ControlledVocabularyStringType }
     *     
     */
    public ControlledVocabularyStringType getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link ControlledVocabularyStringType }
     *     
     */
    public void setSource(ControlledVocabularyStringType value) {
        this.source = value;
    }

    /**
     * Gets the value of the confidenceAssertionChain property.
     * 
     * @return
     *     possible object is
     *     {@link ConfidenceAssertionChainType }
     *     
     */
    public ConfidenceAssertionChainType getConfidenceAssertionChain() {
        return confidenceAssertionChain;
    }

    /**
     * Sets the value of the confidenceAssertionChain property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConfidenceAssertionChainType }
     *     
     */
    public void setConfidenceAssertionChain(ConfidenceAssertionChainType value) {
        this.confidenceAssertionChain = value;
    }

    /**
     * Gets the value of the timestamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTimestamp() {
        return timestamp;
    }

    /**
     * Sets the value of the timestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTimestamp(XMLGregorianCalendar value) {
        this.timestamp = value;
    }

    /**
     * Gets the value of the timestampPrecision property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimePrecisionEnum }
     *     
     */
    public DateTimePrecisionEnum getTimestampPrecision() {
        if (timestampPrecision == null) {
            return DateTimePrecisionEnum.SECOND;
        } else {
            return timestampPrecision;
        }
    }

    /**
     * Sets the value of the timestampPrecision property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimePrecisionEnum }
     *     
     */
    public void setTimestampPrecision(DateTimePrecisionEnum value) {
        this.timestampPrecision = value;
    }

}

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.04.17 at 04:06:30 PM EDT 
//


package org.mitre.cybox.objects;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.mitre.cybox.common_2.DateTimeObjectPropertyType;
import org.mitre.cybox.common_2.StringObjectPropertyType;


/**
 * The EmailReceivedLineType captures a single 'Received' line in an email message header.
 * 
 * <p>Java class for EmailReceivedLineType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EmailReceivedLineType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="From" type="{http://cybox.mitre.org/common-2}StringObjectPropertyType" minOccurs="0"/>
 *         &lt;element name="By" type="{http://cybox.mitre.org/common-2}StringObjectPropertyType" minOccurs="0"/>
 *         &lt;element name="Via" type="{http://cybox.mitre.org/common-2}StringObjectPropertyType" minOccurs="0"/>
 *         &lt;element name="With" type="{http://cybox.mitre.org/common-2}StringObjectPropertyType" minOccurs="0"/>
 *         &lt;element name="For" type="{http://cybox.mitre.org/common-2}StringObjectPropertyType" minOccurs="0"/>
 *         &lt;element name="ID" type="{http://cybox.mitre.org/common-2}StringObjectPropertyType" minOccurs="0"/>
 *         &lt;element name="Timestamp" type="{http://cybox.mitre.org/common-2}DateTimeObjectPropertyType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EmailReceivedLineType", namespace = "http://cybox.mitre.org/objects#EmailMessageObject-2", propOrder = {
    "from",
    "by",
    "via",
    "with",
    "_for",
    "id",
    "timestamp"
})
public class EmailReceivedLineType {

    @XmlElement(name = "From")
    protected StringObjectPropertyType from;
    @XmlElement(name = "By")
    protected StringObjectPropertyType by;
    @XmlElement(name = "Via")
    protected StringObjectPropertyType via;
    @XmlElement(name = "With")
    protected StringObjectPropertyType with;
    @XmlElement(name = "For")
    protected StringObjectPropertyType _for;
    @XmlElement(name = "ID")
    protected StringObjectPropertyType id;
    @XmlElement(name = "Timestamp")
    protected DateTimeObjectPropertyType timestamp;

    /**
     * Gets the value of the from property.
     * 
     * @return
     *     possible object is
     *     {@link StringObjectPropertyType }
     *     
     */
    public StringObjectPropertyType getFrom() {
        return from;
    }

    /**
     * Sets the value of the from property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringObjectPropertyType }
     *     
     */
    public void setFrom(StringObjectPropertyType value) {
        this.from = value;
    }

    /**
     * Gets the value of the by property.
     * 
     * @return
     *     possible object is
     *     {@link StringObjectPropertyType }
     *     
     */
    public StringObjectPropertyType getBy() {
        return by;
    }

    /**
     * Sets the value of the by property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringObjectPropertyType }
     *     
     */
    public void setBy(StringObjectPropertyType value) {
        this.by = value;
    }

    /**
     * Gets the value of the via property.
     * 
     * @return
     *     possible object is
     *     {@link StringObjectPropertyType }
     *     
     */
    public StringObjectPropertyType getVia() {
        return via;
    }

    /**
     * Sets the value of the via property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringObjectPropertyType }
     *     
     */
    public void setVia(StringObjectPropertyType value) {
        this.via = value;
    }

    /**
     * Gets the value of the with property.
     * 
     * @return
     *     possible object is
     *     {@link StringObjectPropertyType }
     *     
     */
    public StringObjectPropertyType getWith() {
        return with;
    }

    /**
     * Sets the value of the with property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringObjectPropertyType }
     *     
     */
    public void setWith(StringObjectPropertyType value) {
        this.with = value;
    }

    /**
     * Gets the value of the for property.
     * 
     * @return
     *     possible object is
     *     {@link StringObjectPropertyType }
     *     
     */
    public StringObjectPropertyType getFor() {
        return _for;
    }

    /**
     * Sets the value of the for property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringObjectPropertyType }
     *     
     */
    public void setFor(StringObjectPropertyType value) {
        this._for = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link StringObjectPropertyType }
     *     
     */
    public StringObjectPropertyType getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringObjectPropertyType }
     *     
     */
    public void setID(StringObjectPropertyType value) {
        this.id = value;
    }

    /**
     * Gets the value of the timestamp property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeObjectPropertyType }
     *     
     */
    public DateTimeObjectPropertyType getTimestamp() {
        return timestamp;
    }

    /**
     * Sets the value of the timestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeObjectPropertyType }
     *     
     */
    public void setTimestamp(DateTimeObjectPropertyType value) {
        this.timestamp = value;
    }

}

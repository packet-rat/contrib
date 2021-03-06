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
import org.mitre.cybox.common_2.HashListType;
import org.mitre.cybox.common_2.PositiveIntegerObjectPropertyType;


/**
 * The PDFXRefTableType captures the details of a PDF cross-reference table, which provides a capability for the random access of indirect objects contained in the file.
 * 
 * <p>Java class for PDFXRefTableType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PDFXRefTableType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Subsections" type="{http://cybox.mitre.org/objects#PDFFileObject-1}PDFXrefTableSubsectionListType" minOccurs="0"/>
 *         &lt;element name="Offset" type="{http://cybox.mitre.org/common-2}PositiveIntegerObjectPropertyType" minOccurs="0"/>
 *         &lt;element name="Hashes" type="{http://cybox.mitre.org/common-2}HashListType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PDFXRefTableType", namespace = "http://cybox.mitre.org/objects#PDFFileObject-1", propOrder = {
    "subsections",
    "offset",
    "hashes"
})
public class PDFXRefTableType {

    @XmlElement(name = "Subsections")
    protected PDFXrefTableSubsectionListType subsections;
    @XmlElement(name = "Offset")
    protected PositiveIntegerObjectPropertyType offset;
    @XmlElement(name = "Hashes")
    protected HashListType hashes;

    /**
     * Gets the value of the subsections property.
     * 
     * @return
     *     possible object is
     *     {@link PDFXrefTableSubsectionListType }
     *     
     */
    public PDFXrefTableSubsectionListType getSubsections() {
        return subsections;
    }

    /**
     * Sets the value of the subsections property.
     * 
     * @param value
     *     allowed object is
     *     {@link PDFXrefTableSubsectionListType }
     *     
     */
    public void setSubsections(PDFXrefTableSubsectionListType value) {
        this.subsections = value;
    }

    /**
     * Gets the value of the offset property.
     * 
     * @return
     *     possible object is
     *     {@link PositiveIntegerObjectPropertyType }
     *     
     */
    public PositiveIntegerObjectPropertyType getOffset() {
        return offset;
    }

    /**
     * Sets the value of the offset property.
     * 
     * @param value
     *     allowed object is
     *     {@link PositiveIntegerObjectPropertyType }
     *     
     */
    public void setOffset(PositiveIntegerObjectPropertyType value) {
        this.offset = value;
    }

    /**
     * Gets the value of the hashes property.
     * 
     * @return
     *     possible object is
     *     {@link HashListType }
     *     
     */
    public HashListType getHashes() {
        return hashes;
    }

    /**
     * Sets the value of the hashes property.
     * 
     * @param value
     *     allowed object is
     *     {@link HashListType }
     *     
     */
    public void setHashes(HashListType value) {
        this.hashes = value;
    }

}

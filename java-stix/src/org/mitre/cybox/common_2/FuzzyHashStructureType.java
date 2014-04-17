//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.04.17 at 04:06:30 PM EDT 
//


package org.mitre.cybox.common_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The FuzzyHashStructureType is used for characterizing the internal components of a cryptograhic fuzzy hash algorithmic calculation.
 * 
 * <p>Java class for FuzzyHashStructureType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FuzzyHashStructureType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Block_Size" type="{http://cybox.mitre.org/common-2}IntegerObjectPropertyType" minOccurs="0"/>
 *         &lt;element name="Block_Hash" type="{http://cybox.mitre.org/common-2}FuzzyHashBlockType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FuzzyHashStructureType", propOrder = {
    "blockSize",
    "blockHash"
})
public class FuzzyHashStructureType {

    @XmlElement(name = "Block_Size")
    protected IntegerObjectPropertyType blockSize;
    @XmlElement(name = "Block_Hash")
    protected FuzzyHashBlockType blockHash;

    /**
     * Gets the value of the blockSize property.
     * 
     * @return
     *     possible object is
     *     {@link IntegerObjectPropertyType }
     *     
     */
    public IntegerObjectPropertyType getBlockSize() {
        return blockSize;
    }

    /**
     * Sets the value of the blockSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntegerObjectPropertyType }
     *     
     */
    public void setBlockSize(IntegerObjectPropertyType value) {
        this.blockSize = value;
    }

    /**
     * Gets the value of the blockHash property.
     * 
     * @return
     *     possible object is
     *     {@link FuzzyHashBlockType }
     *     
     */
    public FuzzyHashBlockType getBlockHash() {
        return blockHash;
    }

    /**
     * Sets the value of the blockHash property.
     * 
     * @param value
     *     allowed object is
     *     {@link FuzzyHashBlockType }
     *     
     */
    public void setBlockHash(FuzzyHashBlockType value) {
        this.blockHash = value;
    }

}

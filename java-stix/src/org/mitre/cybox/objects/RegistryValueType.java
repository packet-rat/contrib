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
import org.mitre.cybox.common_2.ByteRunsType;
import org.mitre.cybox.common_2.StringObjectPropertyType;


/**
 * The RegistryValueType type is intended to characterize Windows registry Value name/data pairs.
 * 
 * <p>Java class for RegistryValueType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RegistryValueType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{http://cybox.mitre.org/common-2}StringObjectPropertyType" minOccurs="0"/>
 *         &lt;element name="Data" type="{http://cybox.mitre.org/common-2}StringObjectPropertyType" minOccurs="0"/>
 *         &lt;element name="Datatype" type="{http://cybox.mitre.org/objects#WinRegistryKeyObject-2}RegistryDatatypeType" minOccurs="0"/>
 *         &lt;element name="Byte_Runs" type="{http://cybox.mitre.org/common-2}ByteRunsType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegistryValueType", namespace = "http://cybox.mitre.org/objects#WinRegistryKeyObject-2", propOrder = {
    "name",
    "data",
    "datatype",
    "byteRuns"
})
public class RegistryValueType {

    @XmlElement(name = "Name")
    protected StringObjectPropertyType name;
    @XmlElement(name = "Data")
    protected StringObjectPropertyType data;
    @XmlElement(name = "Datatype")
    protected RegistryDatatypeType datatype;
    @XmlElement(name = "Byte_Runs")
    protected ByteRunsType byteRuns;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link StringObjectPropertyType }
     *     
     */
    public StringObjectPropertyType getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringObjectPropertyType }
     *     
     */
    public void setName(StringObjectPropertyType value) {
        this.name = value;
    }

    /**
     * Gets the value of the data property.
     * 
     * @return
     *     possible object is
     *     {@link StringObjectPropertyType }
     *     
     */
    public StringObjectPropertyType getData() {
        return data;
    }

    /**
     * Sets the value of the data property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringObjectPropertyType }
     *     
     */
    public void setData(StringObjectPropertyType value) {
        this.data = value;
    }

    /**
     * Gets the value of the datatype property.
     * 
     * @return
     *     possible object is
     *     {@link RegistryDatatypeType }
     *     
     */
    public RegistryDatatypeType getDatatype() {
        return datatype;
    }

    /**
     * Sets the value of the datatype property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegistryDatatypeType }
     *     
     */
    public void setDatatype(RegistryDatatypeType value) {
        this.datatype = value;
    }

    /**
     * Gets the value of the byteRuns property.
     * 
     * @return
     *     possible object is
     *     {@link ByteRunsType }
     *     
     */
    public ByteRunsType getByteRuns() {
        return byteRuns;
    }

    /**
     * Sets the value of the byteRuns property.
     * 
     * @param value
     *     allowed object is
     *     {@link ByteRunsType }
     *     
     */
    public void setByteRuns(ByteRunsType value) {
        this.byteRuns = value;
    }

}

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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.mitre.cybox.common_2.DigitalSignatureInfoType;
import org.mitre.cybox.common_2.IntegerObjectPropertyType;


/**
 * The WindowsExecutableFileObjectType type is intended to characterize Windows PE (Portable Executable) files.
 * 
 * <p>Java class for WindowsExecutableFileObjectType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WindowsExecutableFileObjectType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://cybox.mitre.org/objects#WinFileObject-2}WindowsFileObjectType">
 *       &lt;sequence>
 *         &lt;element name="Build_Information" type="{http://cybox.mitre.org/objects#WinExecutableFileObject-2}PEBuildInformationType" minOccurs="0"/>
 *         &lt;element name="Digital_Signature" type="{http://cybox.mitre.org/common-2}DigitalSignatureInfoType" minOccurs="0"/>
 *         &lt;element name="Exports" type="{http://cybox.mitre.org/objects#WinExecutableFileObject-2}PEExportsType" minOccurs="0"/>
 *         &lt;element name="Extraneous_Bytes" type="{http://cybox.mitre.org/common-2}IntegerObjectPropertyType" minOccurs="0"/>
 *         &lt;element name="Headers" type="{http://cybox.mitre.org/objects#WinExecutableFileObject-2}PEHeadersType" minOccurs="0"/>
 *         &lt;element name="Imports" type="{http://cybox.mitre.org/objects#WinExecutableFileObject-2}PEImportListType" minOccurs="0"/>
 *         &lt;element name="PE_Checksum" type="{http://cybox.mitre.org/objects#WinExecutableFileObject-2}PEChecksumType" minOccurs="0"/>
 *         &lt;element name="Resources" type="{http://cybox.mitre.org/objects#WinExecutableFileObject-2}PEResourceListType" minOccurs="0"/>
 *         &lt;element name="Sections" type="{http://cybox.mitre.org/objects#WinExecutableFileObject-2}PESectionListType" minOccurs="0"/>
 *         &lt;element name="Type" type="{http://cybox.mitre.org/objects#WinExecutableFileObject-2}PEType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WindowsExecutableFileObjectType", namespace = "http://cybox.mitre.org/objects#WinExecutableFileObject-2", propOrder = {
    "buildInformation",
    "digitalSignature",
    "exports",
    "extraneousBytes",
    "headers",
    "imports",
    "peChecksum",
    "resources",
    "sections",
    "type"
})
@XmlSeeAlso({
    WindowsDriverObjectType.class
})
public class WindowsExecutableFileObjectType
    extends WindowsFileObjectType
{

    @XmlElement(name = "Build_Information")
    protected PEBuildInformationType buildInformation;
    @XmlElement(name = "Digital_Signature")
    protected DigitalSignatureInfoType digitalSignature;
    @XmlElement(name = "Exports")
    protected PEExportsType exports;
    @XmlElement(name = "Extraneous_Bytes")
    protected IntegerObjectPropertyType extraneousBytes;
    @XmlElement(name = "Headers")
    protected PEHeadersType headers;
    @XmlElement(name = "Imports")
    protected PEImportListType imports;
    @XmlElement(name = "PE_Checksum")
    protected PEChecksumType peChecksum;
    @XmlElement(name = "Resources")
    protected PEResourceListType resources;
    @XmlElement(name = "Sections")
    protected PESectionListType sections;
    @XmlElement(name = "Type")
    protected PEType type;

    /**
     * Gets the value of the buildInformation property.
     * 
     * @return
     *     possible object is
     *     {@link PEBuildInformationType }
     *     
     */
    public PEBuildInformationType getBuildInformation() {
        return buildInformation;
    }

    /**
     * Sets the value of the buildInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link PEBuildInformationType }
     *     
     */
    public void setBuildInformation(PEBuildInformationType value) {
        this.buildInformation = value;
    }

    /**
     * Gets the value of the digitalSignature property.
     * 
     * @return
     *     possible object is
     *     {@link DigitalSignatureInfoType }
     *     
     */
    public DigitalSignatureInfoType getDigitalSignature() {
        return digitalSignature;
    }

    /**
     * Sets the value of the digitalSignature property.
     * 
     * @param value
     *     allowed object is
     *     {@link DigitalSignatureInfoType }
     *     
     */
    public void setDigitalSignature(DigitalSignatureInfoType value) {
        this.digitalSignature = value;
    }

    /**
     * Gets the value of the exports property.
     * 
     * @return
     *     possible object is
     *     {@link PEExportsType }
     *     
     */
    public PEExportsType getExports() {
        return exports;
    }

    /**
     * Sets the value of the exports property.
     * 
     * @param value
     *     allowed object is
     *     {@link PEExportsType }
     *     
     */
    public void setExports(PEExportsType value) {
        this.exports = value;
    }

    /**
     * Gets the value of the extraneousBytes property.
     * 
     * @return
     *     possible object is
     *     {@link IntegerObjectPropertyType }
     *     
     */
    public IntegerObjectPropertyType getExtraneousBytes() {
        return extraneousBytes;
    }

    /**
     * Sets the value of the extraneousBytes property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntegerObjectPropertyType }
     *     
     */
    public void setExtraneousBytes(IntegerObjectPropertyType value) {
        this.extraneousBytes = value;
    }

    /**
     * Gets the value of the headers property.
     * 
     * @return
     *     possible object is
     *     {@link PEHeadersType }
     *     
     */
    public PEHeadersType getHeaders() {
        return headers;
    }

    /**
     * Sets the value of the headers property.
     * 
     * @param value
     *     allowed object is
     *     {@link PEHeadersType }
     *     
     */
    public void setHeaders(PEHeadersType value) {
        this.headers = value;
    }

    /**
     * Gets the value of the imports property.
     * 
     * @return
     *     possible object is
     *     {@link PEImportListType }
     *     
     */
    public PEImportListType getImports() {
        return imports;
    }

    /**
     * Sets the value of the imports property.
     * 
     * @param value
     *     allowed object is
     *     {@link PEImportListType }
     *     
     */
    public void setImports(PEImportListType value) {
        this.imports = value;
    }

    /**
     * Gets the value of the peChecksum property.
     * 
     * @return
     *     possible object is
     *     {@link PEChecksumType }
     *     
     */
    public PEChecksumType getPEChecksum() {
        return peChecksum;
    }

    /**
     * Sets the value of the peChecksum property.
     * 
     * @param value
     *     allowed object is
     *     {@link PEChecksumType }
     *     
     */
    public void setPEChecksum(PEChecksumType value) {
        this.peChecksum = value;
    }

    /**
     * Gets the value of the resources property.
     * 
     * @return
     *     possible object is
     *     {@link PEResourceListType }
     *     
     */
    public PEResourceListType getResources() {
        return resources;
    }

    /**
     * Sets the value of the resources property.
     * 
     * @param value
     *     allowed object is
     *     {@link PEResourceListType }
     *     
     */
    public void setResources(PEResourceListType value) {
        this.resources = value;
    }

    /**
     * Gets the value of the sections property.
     * 
     * @return
     *     possible object is
     *     {@link PESectionListType }
     *     
     */
    public PESectionListType getSections() {
        return sections;
    }

    /**
     * Sets the value of the sections property.
     * 
     * @param value
     *     allowed object is
     *     {@link PESectionListType }
     *     
     */
    public void setSections(PESectionListType value) {
        this.sections = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link PEType }
     *     
     */
    public PEType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link PEType }
     *     
     */
    public void setType(PEType value) {
        this.type = value;
    }

}

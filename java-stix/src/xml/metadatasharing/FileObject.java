//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.04.17 at 04:06:30 PM EDT 
//


package xml.metadatasharing;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.HexBinaryAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * 
 *     Object definition for files. The required attribute is the id, which needs to be globally unique. 
 *     By convention, the value used is a hash, the stronger the better. 
 *     
 *     The choice should be: use sha256 if you have it, if not use sha1, if not use md5.
 *   
 *     Other hashes and file sizes are recorded in the elements. 
 * 
 *     File names are put in as properties.
 *     
 *    
 * 
 * <p>Java class for fileObject complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="fileObject">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="md5" type="{http://www.w3.org/2001/XMLSchema}hexBinary"/>
 *         &lt;element name="sha1" type="{http://www.w3.org/2001/XMLSchema}hexBinary" minOccurs="0"/>
 *         &lt;element name="sha256" type="{http://www.w3.org/2001/XMLSchema}hexBinary" minOccurs="0"/>
 *         &lt;element name="sha512" type="{http://www.w3.org/2001/XMLSchema}hexBinary" minOccurs="0"/>
 *         &lt;element name="size" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="crc32" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fileType" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="extraHash" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                 &lt;attribute name="type" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="filename" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="normalizedNativePath" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="filenameWithinInstaller" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="folderWithinInstaller" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="vendor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="internalName" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="language" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="productName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fileVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="productVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="developmentEnvironment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="checksum" type="{http://www.w3.org/2001/XMLSchema}hexBinary" minOccurs="0"/>
 *         &lt;element name="architecture" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="buildTimeDateStamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="compilerVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="linkerVersion" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="minOSVersionCPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numberOfSections" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="MIMEType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="requiredPrivilege" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="digitalSignature" type="{http://xml/metadataSharing.xsd}digitalSignatureObject" minOccurs="0"/>
 *         &lt;element name="taggant" type="{http://xml/metadataSharing.xsd}taggantObject" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}hexBinary" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "fileObject", propOrder = {
    "md5",
    "sha1",
    "sha256",
    "sha512",
    "size",
    "crc32",
    "fileType",
    "extraHash",
    "filename",
    "normalizedNativePath",
    "filenameWithinInstaller",
    "folderWithinInstaller",
    "vendor",
    "internalName",
    "language",
    "productName",
    "fileVersion",
    "productVersion",
    "developmentEnvironment",
    "checksum",
    "architecture",
    "buildTimeDateStamp",
    "compilerVersion",
    "linkerVersion",
    "minOSVersionCPE",
    "numberOfSections",
    "mimeType",
    "requiredPrivilege",
    "digitalSignature",
    "taggant"
})
public class FileObject {

    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    @XmlSchemaType(name = "hexBinary")
    protected byte[] md5;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    @XmlSchemaType(name = "hexBinary")
    protected byte[] sha1;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    @XmlSchemaType(name = "hexBinary")
    protected byte[] sha256;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    @XmlSchemaType(name = "hexBinary")
    protected byte[] sha512;
    protected Integer size;
    protected String crc32;
    protected List<String> fileType;
    protected List<FileObject.ExtraHash> extraHash;
    protected List<String> filename;
    protected List<String> normalizedNativePath;
    protected List<String> filenameWithinInstaller;
    protected List<String> folderWithinInstaller;
    protected String vendor;
    protected List<String> internalName;
    protected List<String> language;
    protected String productName;
    protected String fileVersion;
    protected String productVersion;
    protected String developmentEnvironment;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    @XmlSchemaType(name = "hexBinary")
    protected byte[] checksum;
    protected String architecture;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar buildTimeDateStamp;
    protected String compilerVersion;
    protected Float linkerVersion;
    protected String minOSVersionCPE;
    protected Integer numberOfSections;
    @XmlElement(name = "MIMEType")
    protected String mimeType;
    protected String requiredPrivilege;
    protected DigitalSignatureObject digitalSignature;
    protected TaggantObject taggant;
    @XmlAttribute(name = "id", required = true)
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    @XmlSchemaType(name = "hexBinary")
    protected byte[] id;

    /**
     * Gets the value of the md5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public byte[] getMd5() {
        return md5;
    }

    /**
     * Sets the value of the md5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMd5(byte[] value) {
        this.md5 = value;
    }

    /**
     * Gets the value of the sha1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public byte[] getSha1() {
        return sha1;
    }

    /**
     * Sets the value of the sha1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSha1(byte[] value) {
        this.sha1 = value;
    }

    /**
     * Gets the value of the sha256 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public byte[] getSha256() {
        return sha256;
    }

    /**
     * Sets the value of the sha256 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSha256(byte[] value) {
        this.sha256 = value;
    }

    /**
     * Gets the value of the sha512 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public byte[] getSha512() {
        return sha512;
    }

    /**
     * Sets the value of the sha512 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSha512(byte[] value) {
        this.sha512 = value;
    }

    /**
     * Gets the value of the size property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSize() {
        return size;
    }

    /**
     * Sets the value of the size property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSize(Integer value) {
        this.size = value;
    }

    /**
     * Gets the value of the crc32 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCrc32() {
        return crc32;
    }

    /**
     * Sets the value of the crc32 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCrc32(String value) {
        this.crc32 = value;
    }

    /**
     * Gets the value of the fileType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fileType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFileType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getFileType() {
        if (fileType == null) {
            fileType = new ArrayList<String>();
        }
        return this.fileType;
    }

    /**
     * Gets the value of the extraHash property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the extraHash property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExtraHash().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FileObject.ExtraHash }
     * 
     * 
     */
    public List<FileObject.ExtraHash> getExtraHash() {
        if (extraHash == null) {
            extraHash = new ArrayList<FileObject.ExtraHash>();
        }
        return this.extraHash;
    }

    /**
     * Gets the value of the filename property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the filename property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFilename().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getFilename() {
        if (filename == null) {
            filename = new ArrayList<String>();
        }
        return this.filename;
    }

    /**
     * Gets the value of the normalizedNativePath property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the normalizedNativePath property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNormalizedNativePath().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getNormalizedNativePath() {
        if (normalizedNativePath == null) {
            normalizedNativePath = new ArrayList<String>();
        }
        return this.normalizedNativePath;
    }

    /**
     * Gets the value of the filenameWithinInstaller property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the filenameWithinInstaller property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFilenameWithinInstaller().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getFilenameWithinInstaller() {
        if (filenameWithinInstaller == null) {
            filenameWithinInstaller = new ArrayList<String>();
        }
        return this.filenameWithinInstaller;
    }

    /**
     * Gets the value of the folderWithinInstaller property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the folderWithinInstaller property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFolderWithinInstaller().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getFolderWithinInstaller() {
        if (folderWithinInstaller == null) {
            folderWithinInstaller = new ArrayList<String>();
        }
        return this.folderWithinInstaller;
    }

    /**
     * Gets the value of the vendor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVendor() {
        return vendor;
    }

    /**
     * Sets the value of the vendor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVendor(String value) {
        this.vendor = value;
    }

    /**
     * Gets the value of the internalName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the internalName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInternalName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getInternalName() {
        if (internalName == null) {
            internalName = new ArrayList<String>();
        }
        return this.internalName;
    }

    /**
     * Gets the value of the language property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the language property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLanguage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getLanguage() {
        if (language == null) {
            language = new ArrayList<String>();
        }
        return this.language;
    }

    /**
     * Gets the value of the productName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductName() {
        return productName;
    }

    /**
     * Sets the value of the productName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductName(String value) {
        this.productName = value;
    }

    /**
     * Gets the value of the fileVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileVersion() {
        return fileVersion;
    }

    /**
     * Sets the value of the fileVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileVersion(String value) {
        this.fileVersion = value;
    }

    /**
     * Gets the value of the productVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductVersion() {
        return productVersion;
    }

    /**
     * Sets the value of the productVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductVersion(String value) {
        this.productVersion = value;
    }

    /**
     * Gets the value of the developmentEnvironment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDevelopmentEnvironment() {
        return developmentEnvironment;
    }

    /**
     * Sets the value of the developmentEnvironment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDevelopmentEnvironment(String value) {
        this.developmentEnvironment = value;
    }

    /**
     * Gets the value of the checksum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public byte[] getChecksum() {
        return checksum;
    }

    /**
     * Sets the value of the checksum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChecksum(byte[] value) {
        this.checksum = value;
    }

    /**
     * Gets the value of the architecture property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArchitecture() {
        return architecture;
    }

    /**
     * Sets the value of the architecture property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArchitecture(String value) {
        this.architecture = value;
    }

    /**
     * Gets the value of the buildTimeDateStamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBuildTimeDateStamp() {
        return buildTimeDateStamp;
    }

    /**
     * Sets the value of the buildTimeDateStamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBuildTimeDateStamp(XMLGregorianCalendar value) {
        this.buildTimeDateStamp = value;
    }

    /**
     * Gets the value of the compilerVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompilerVersion() {
        return compilerVersion;
    }

    /**
     * Sets the value of the compilerVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompilerVersion(String value) {
        this.compilerVersion = value;
    }

    /**
     * Gets the value of the linkerVersion property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getLinkerVersion() {
        return linkerVersion;
    }

    /**
     * Sets the value of the linkerVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setLinkerVersion(Float value) {
        this.linkerVersion = value;
    }

    /**
     * Gets the value of the minOSVersionCPE property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMinOSVersionCPE() {
        return minOSVersionCPE;
    }

    /**
     * Sets the value of the minOSVersionCPE property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMinOSVersionCPE(String value) {
        this.minOSVersionCPE = value;
    }

    /**
     * Gets the value of the numberOfSections property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberOfSections() {
        return numberOfSections;
    }

    /**
     * Sets the value of the numberOfSections property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberOfSections(Integer value) {
        this.numberOfSections = value;
    }

    /**
     * Gets the value of the mimeType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMIMEType() {
        return mimeType;
    }

    /**
     * Sets the value of the mimeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMIMEType(String value) {
        this.mimeType = value;
    }

    /**
     * Gets the value of the requiredPrivilege property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequiredPrivilege() {
        return requiredPrivilege;
    }

    /**
     * Sets the value of the requiredPrivilege property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequiredPrivilege(String value) {
        this.requiredPrivilege = value;
    }

    /**
     * Gets the value of the digitalSignature property.
     * 
     * @return
     *     possible object is
     *     {@link DigitalSignatureObject }
     *     
     */
    public DigitalSignatureObject getDigitalSignature() {
        return digitalSignature;
    }

    /**
     * Sets the value of the digitalSignature property.
     * 
     * @param value
     *     allowed object is
     *     {@link DigitalSignatureObject }
     *     
     */
    public void setDigitalSignature(DigitalSignatureObject value) {
        this.digitalSignature = value;
    }

    /**
     * Gets the value of the taggant property.
     * 
     * @return
     *     possible object is
     *     {@link TaggantObject }
     *     
     */
    public TaggantObject getTaggant() {
        return taggant;
    }

    /**
     * Sets the value of the taggant property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaggantObject }
     *     
     */
    public void setTaggant(TaggantObject value) {
        this.taggant = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public byte[] getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(byte[] value) {
        this.id = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *       &lt;attribute name="type" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class ExtraHash {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "type", required = true)
        protected String type;

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
        }

        /**
         * Gets the value of the type property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getType() {
            return type;
        }

        /**
         * Sets the value of the type property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setType(String value) {
            this.type = value;
        }

    }

}

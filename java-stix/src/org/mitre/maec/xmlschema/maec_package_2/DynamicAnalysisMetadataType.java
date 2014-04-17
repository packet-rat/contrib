//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.04.17 at 04:06:30 PM EDT 
//


package org.mitre.maec.xmlschema.maec_package_2;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The DynamicAnalysisMetadataType captures any metadata specific to the dynamic analysis of a malware instance.
 * 
 * <p>Java class for DynamicAnalysisMetadataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DynamicAnalysisMetadataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Command_Line" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Analysis_Duration" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="Exit_Code" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="Raised_Exception" type="{http://maec.mitre.org/XMLSchema/maec-package-2}MalwareExceptionType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DynamicAnalysisMetadataType", propOrder = {
    "commandLine",
    "analysisDuration",
    "exitCode",
    "raisedException"
})
public class DynamicAnalysisMetadataType {

    @XmlElement(name = "Command_Line")
    protected String commandLine;
    @XmlElement(name = "Analysis_Duration")
    protected Float analysisDuration;
    @XmlElement(name = "Exit_Code")
    protected BigInteger exitCode;
    @XmlElement(name = "Raised_Exception")
    protected List<MalwareExceptionType> raisedException;

    /**
     * Gets the value of the commandLine property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommandLine() {
        return commandLine;
    }

    /**
     * Sets the value of the commandLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommandLine(String value) {
        this.commandLine = value;
    }

    /**
     * Gets the value of the analysisDuration property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getAnalysisDuration() {
        return analysisDuration;
    }

    /**
     * Sets the value of the analysisDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setAnalysisDuration(Float value) {
        this.analysisDuration = value;
    }

    /**
     * Gets the value of the exitCode property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getExitCode() {
        return exitCode;
    }

    /**
     * Sets the value of the exitCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setExitCode(BigInteger value) {
        this.exitCode = value;
    }

    /**
     * Gets the value of the raisedException property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the raisedException property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRaisedException().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MalwareExceptionType }
     * 
     * 
     */
    public List<MalwareExceptionType> getRaisedException() {
        if (raisedException == null) {
            raisedException = new ArrayList<MalwareExceptionType>();
        }
        return this.raisedException;
    }

}

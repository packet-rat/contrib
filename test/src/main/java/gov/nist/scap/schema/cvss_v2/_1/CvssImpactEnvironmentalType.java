//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.04.09 at 05:02:22 PM EDT 
//


package gov.nist.scap.schema.cvss_v2._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for cvssImpactEnvironmentalType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="cvssImpactEnvironmentalType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://scap.nist.gov/schema/cvss-v2/1.0}cvssImpactTemporalType">
 *       &lt;sequence>
 *         &lt;element name="environmental_metrics" type="{http://scap.nist.gov/schema/cvss-v2/1.0}environmentalMetricsType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cvssImpactEnvironmentalType", propOrder = {
    "environmentalMetrics"
})
public class CvssImpactEnvironmentalType
    extends CvssImpactTemporalType
{

    @XmlElement(name = "environmental_metrics")
    protected EnvironmentalMetricsType environmentalMetrics;

    /**
     * Gets the value of the environmentalMetrics property.
     * 
     * @return
     *     possible object is
     *     {@link EnvironmentalMetricsType }
     *     
     */
    public EnvironmentalMetricsType getEnvironmentalMetrics() {
        return environmentalMetrics;
    }

    /**
     * Sets the value of the environmentalMetrics property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnvironmentalMetricsType }
     *     
     */
    public void setEnvironmentalMetrics(EnvironmentalMetricsType value) {
        this.environmentalMetrics = value;
    }

}

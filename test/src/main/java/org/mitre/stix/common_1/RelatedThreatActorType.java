//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.04.08 at 09:40:17 PM EDT 
//


package org.mitre.stix.common_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Identifies or characterizes a relationship to a threat actor.
 * 
 * <p>Java class for RelatedThreatActorType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RelatedThreatActorType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://stix.mitre.org/common-1}GenericRelationshipType">
 *       &lt;sequence>
 *         &lt;element name="Threat_Actor" type="{http://stix.mitre.org/common-1}ThreatActorBaseType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RelatedThreatActorType", propOrder = {
    "threatActor"
})
public class RelatedThreatActorType
    extends GenericRelationshipType
{

    @XmlElement(name = "Threat_Actor", required = true)
    protected ThreatActorBaseType threatActor;

    /**
     * Gets the value of the threatActor property.
     * 
     * @return
     *     possible object is
     *     {@link ThreatActorBaseType }
     *     
     */
    public ThreatActorBaseType getThreatActor() {
        return threatActor;
    }

    /**
     * Sets the value of the threatActor property.
     * 
     * @param value
     *     allowed object is
     *     {@link ThreatActorBaseType }
     *     
     */
    public void setThreatActor(ThreatActorBaseType value) {
        this.threatActor = value;
    }

}

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.04.17 at 04:06:30 PM EDT 
//


package org.mitre.stix.common_1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for KillChainPhasesReferenceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="KillChainPhasesReferenceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Kill_Chain_Phase" type="{http://stix.mitre.org/common-1}KillChainPhaseReferenceType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KillChainPhasesReferenceType", propOrder = {
    "killChainPhase"
})
public class KillChainPhasesReferenceType {

    @XmlElement(name = "Kill_Chain_Phase", required = true)
    protected List<KillChainPhaseReferenceType> killChainPhase;

    /**
     * Gets the value of the killChainPhase property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the killChainPhase property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKillChainPhase().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link KillChainPhaseReferenceType }
     * 
     * 
     */
    public List<KillChainPhaseReferenceType> getKillChainPhase() {
        if (killChainPhase == null) {
            killChainPhase = new ArrayList<KillChainPhaseReferenceType>();
        }
        return this.killChainPhase;
    }

}

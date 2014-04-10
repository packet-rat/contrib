//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.04.08 at 09:40:17 PM EDT 
//


package org.mitre.stix.campaign_1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.mitre.stix.common_1.GenericRelationshipListType;
import org.mitre.stix.common_1.RelatedTTPType;


/**
 * <p>Java class for RelatedTTPsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RelatedTTPsType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://stix.mitre.org/common-1}GenericRelationshipListType">
 *       &lt;sequence>
 *         &lt;sequence>
 *           &lt;element name="Related_TTP" type="{http://stix.mitre.org/common-1}RelatedTTPType" maxOccurs="unbounded"/>
 *         &lt;/sequence>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RelatedTTPsType", propOrder = {
    "relatedTTP"
})
public class RelatedTTPsType
    extends GenericRelationshipListType
{

    @XmlElement(name = "Related_TTP", required = true)
    protected List<RelatedTTPType> relatedTTP;

    /**
     * Gets the value of the relatedTTP property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the relatedTTP property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRelatedTTP().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RelatedTTPType }
     * 
     * 
     */
    public List<RelatedTTPType> getRelatedTTP() {
        if (relatedTTP == null) {
            relatedTTP = new ArrayList<RelatedTTPType>();
        }
        return this.relatedTTP;
    }

}

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.04.17 at 04:06:30 PM EDT 
//


package org.mitre.maec.xmlschema.maec_package_2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The ObjectEquivalenceListType captures a list of Object Equivalences.
 * 
 * <p>Java class for ObjectEquivalenceListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ObjectEquivalenceListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Object_Equivalence" type="{http://maec.mitre.org/XMLSchema/maec-package-2}ObjectEquivalenceType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ObjectEquivalenceListType", propOrder = {
    "objectEquivalence"
})
public class ObjectEquivalenceListType {

    @XmlElement(name = "Object_Equivalence", required = true)
    protected List<ObjectEquivalenceType> objectEquivalence;

    /**
     * Gets the value of the objectEquivalence property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the objectEquivalence property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getObjectEquivalence().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ObjectEquivalenceType }
     * 
     * 
     */
    public List<ObjectEquivalenceType> getObjectEquivalence() {
        if (objectEquivalence == null) {
            objectEquivalence = new ArrayList<ObjectEquivalenceType>();
        }
        return this.objectEquivalence;
    }

}

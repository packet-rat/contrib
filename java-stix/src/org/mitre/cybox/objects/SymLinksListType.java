//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.04.17 at 04:06:30 PM EDT 
//


package org.mitre.cybox.objects;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.mitre.cybox.common_2.StringObjectPropertyType;


/**
 * The SymLinksListType specifies a list of symbolic links.
 * 
 * <p>Java class for SymLinksListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SymLinksListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Sym_Link" type="{http://cybox.mitre.org/common-2}StringObjectPropertyType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SymLinksListType", namespace = "http://cybox.mitre.org/objects#FileObject-2", propOrder = {
    "symLink"
})
public class SymLinksListType {

    @XmlElement(name = "Sym_Link", required = true)
    protected List<StringObjectPropertyType> symLink;

    /**
     * Gets the value of the symLink property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the symLink property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSymLink().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StringObjectPropertyType }
     * 
     * 
     */
    public List<StringObjectPropertyType> getSymLink() {
        if (symLink == null) {
            symLink = new ArrayList<StringObjectPropertyType>();
        }
        return this.symLink;
    }

}

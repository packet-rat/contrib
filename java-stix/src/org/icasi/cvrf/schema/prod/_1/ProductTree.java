//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.04.17 at 04:06:30 PM EDT 
//


package org.icasi.cvrf.schema.prod._1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.icasi.cvrf.schema.common._1.LocalizedString;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Branch" type="{http://www.icasi.org/CVRF/schema/prod/1.1}BranchType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.icasi.org/CVRF/schema/prod/1.1}FullProductName" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Relationship" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.icasi.org/CVRF/schema/prod/1.1}FullProductName" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="ProductReference" use="required" type="{http://www.w3.org/2001/XMLSchema}token" />
 *                 &lt;attribute name="RelationType" use="required" type="{http://www.icasi.org/CVRF/schema/prod/1.1}RelationTypeEnumType" />
 *                 &lt;attribute name="RelatesToProductReference" use="required" type="{http://www.w3.org/2001/XMLSchema}token" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ProductGroups" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Group" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Description" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;simpleContent>
 *                                   &lt;extension base="&lt;http://www.icasi.org/CVRF/schema/common/1.1>localizedString">
 *                                   &lt;/extension>
 *                                 &lt;/simpleContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="ProductID" type="{http://www.w3.org/2001/XMLSchema}token" maxOccurs="unbounded" minOccurs="2"/>
 *                           &lt;/sequence>
 *                           &lt;attribute name="GroupID" use="required" type="{http://www.w3.org/2001/XMLSchema}token" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "branch",
    "fullProductName",
    "relationship",
    "productGroups"
})
@XmlRootElement(name = "ProductTree")
public class ProductTree {

    @XmlElement(name = "Branch")
    protected List<BranchType> branch;
    @XmlElement(name = "FullProductName")
    protected List<FullProductName> fullProductName;
    @XmlElement(name = "Relationship")
    protected List<ProductTree.Relationship> relationship;
    @XmlElement(name = "ProductGroups")
    protected ProductTree.ProductGroups productGroups;

    /**
     * Gets the value of the branch property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the branch property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBranch().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BranchType }
     * 
     * 
     */
    public List<BranchType> getBranch() {
        if (branch == null) {
            branch = new ArrayList<BranchType>();
        }
        return this.branch;
    }

    /**
     * Gets the value of the fullProductName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fullProductName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFullProductName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FullProductName }
     * 
     * 
     */
    public List<FullProductName> getFullProductName() {
        if (fullProductName == null) {
            fullProductName = new ArrayList<FullProductName>();
        }
        return this.fullProductName;
    }

    /**
     * Gets the value of the relationship property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the relationship property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRelationship().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductTree.Relationship }
     * 
     * 
     */
    public List<ProductTree.Relationship> getRelationship() {
        if (relationship == null) {
            relationship = new ArrayList<ProductTree.Relationship>();
        }
        return this.relationship;
    }

    /**
     * Gets the value of the productGroups property.
     * 
     * @return
     *     possible object is
     *     {@link ProductTree.ProductGroups }
     *     
     */
    public ProductTree.ProductGroups getProductGroups() {
        return productGroups;
    }

    /**
     * Sets the value of the productGroups property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductTree.ProductGroups }
     *     
     */
    public void setProductGroups(ProductTree.ProductGroups value) {
        this.productGroups = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Group" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Description" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;simpleContent>
     *                         &lt;extension base="&lt;http://www.icasi.org/CVRF/schema/common/1.1>localizedString">
     *                         &lt;/extension>
     *                       &lt;/simpleContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="ProductID" type="{http://www.w3.org/2001/XMLSchema}token" maxOccurs="unbounded" minOccurs="2"/>
     *                 &lt;/sequence>
     *                 &lt;attribute name="GroupID" use="required" type="{http://www.w3.org/2001/XMLSchema}token" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "group"
    })
    public static class ProductGroups {

        @XmlElement(name = "Group", required = true)
        protected List<ProductTree.ProductGroups.Group> group;

        /**
         * Gets the value of the group property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the group property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getGroup().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ProductTree.ProductGroups.Group }
         * 
         * 
         */
        public List<ProductTree.ProductGroups.Group> getGroup() {
            if (group == null) {
                group = new ArrayList<ProductTree.ProductGroups.Group>();
            }
            return this.group;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="Description" minOccurs="0">
         *           &lt;complexType>
         *             &lt;simpleContent>
         *               &lt;extension base="&lt;http://www.icasi.org/CVRF/schema/common/1.1>localizedString">
         *               &lt;/extension>
         *             &lt;/simpleContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="ProductID" type="{http://www.w3.org/2001/XMLSchema}token" maxOccurs="unbounded" minOccurs="2"/>
         *       &lt;/sequence>
         *       &lt;attribute name="GroupID" use="required" type="{http://www.w3.org/2001/XMLSchema}token" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "description",
            "productID"
        })
        public static class Group {

            @XmlElement(name = "Description")
            protected ProductTree.ProductGroups.Group.Description description;
            @XmlElement(name = "ProductID", required = true)
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            @XmlSchemaType(name = "token")
            protected List<String> productID;
            @XmlAttribute(name = "GroupID", required = true)
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            @XmlSchemaType(name = "token")
            protected String groupID;

            /**
             * Gets the value of the description property.
             * 
             * @return
             *     possible object is
             *     {@link ProductTree.ProductGroups.Group.Description }
             *     
             */
            public ProductTree.ProductGroups.Group.Description getDescription() {
                return description;
            }

            /**
             * Sets the value of the description property.
             * 
             * @param value
             *     allowed object is
             *     {@link ProductTree.ProductGroups.Group.Description }
             *     
             */
            public void setDescription(ProductTree.ProductGroups.Group.Description value) {
                this.description = value;
            }

            /**
             * Gets the value of the productID property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the productID property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getProductID().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link String }
             * 
             * 
             */
            public List<String> getProductID() {
                if (productID == null) {
                    productID = new ArrayList<String>();
                }
                return this.productID;
            }

            /**
             * Gets the value of the groupID property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getGroupID() {
                return groupID;
            }

            /**
             * Sets the value of the groupID property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setGroupID(String value) {
                this.groupID = value;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;simpleContent>
             *     &lt;extension base="&lt;http://www.icasi.org/CVRF/schema/common/1.1>localizedString">
             *     &lt;/extension>
             *   &lt;/simpleContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class Description
                extends LocalizedString
            {


            }

        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element ref="{http://www.icasi.org/CVRF/schema/prod/1.1}FullProductName" maxOccurs="unbounded"/>
     *       &lt;/sequence>
     *       &lt;attribute name="ProductReference" use="required" type="{http://www.w3.org/2001/XMLSchema}token" />
     *       &lt;attribute name="RelationType" use="required" type="{http://www.icasi.org/CVRF/schema/prod/1.1}RelationTypeEnumType" />
     *       &lt;attribute name="RelatesToProductReference" use="required" type="{http://www.w3.org/2001/XMLSchema}token" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "fullProductName"
    })
    public static class Relationship {

        @XmlElement(name = "FullProductName", required = true)
        protected List<FullProductName> fullProductName;
        @XmlAttribute(name = "ProductReference", required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlSchemaType(name = "token")
        protected String productReference;
        @XmlAttribute(name = "RelationType", required = true)
        protected RelationTypeEnumType relationType;
        @XmlAttribute(name = "RelatesToProductReference", required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlSchemaType(name = "token")
        protected String relatesToProductReference;

        /**
         * Gets the value of the fullProductName property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the fullProductName property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFullProductName().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link FullProductName }
         * 
         * 
         */
        public List<FullProductName> getFullProductName() {
            if (fullProductName == null) {
                fullProductName = new ArrayList<FullProductName>();
            }
            return this.fullProductName;
        }

        /**
         * Gets the value of the productReference property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProductReference() {
            return productReference;
        }

        /**
         * Sets the value of the productReference property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setProductReference(String value) {
            this.productReference = value;
        }

        /**
         * Gets the value of the relationType property.
         * 
         * @return
         *     possible object is
         *     {@link RelationTypeEnumType }
         *     
         */
        public RelationTypeEnumType getRelationType() {
            return relationType;
        }

        /**
         * Sets the value of the relationType property.
         * 
         * @param value
         *     allowed object is
         *     {@link RelationTypeEnumType }
         *     
         */
        public void setRelationType(RelationTypeEnumType value) {
            this.relationType = value;
        }

        /**
         * Gets the value of the relatesToProductReference property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRelatesToProductReference() {
            return relatesToProductReference;
        }

        /**
         * Sets the value of the relatesToProductReference property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRelatesToProductReference(String value) {
            this.relatesToProductReference = value;
        }

    }

}
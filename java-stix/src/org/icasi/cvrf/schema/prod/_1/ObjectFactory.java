//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.04.17 at 04:06:30 PM EDT 
//


package org.icasi.cvrf.schema.prod._1;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.icasi.cvrf.schema.prod._1 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.icasi.cvrf.schema.prod._1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ProductTree }
     * 
     */
    public ProductTree createProductTree() {
        return new ProductTree();
    }

    /**
     * Create an instance of {@link ProductTree.ProductGroups }
     * 
     */
    public ProductTree.ProductGroups createProductTreeProductGroups() {
        return new ProductTree.ProductGroups();
    }

    /**
     * Create an instance of {@link ProductTree.ProductGroups.Group }
     * 
     */
    public ProductTree.ProductGroups.Group createProductTreeProductGroupsGroup() {
        return new ProductTree.ProductGroups.Group();
    }

    /**
     * Create an instance of {@link BranchType }
     * 
     */
    public BranchType createBranchType() {
        return new BranchType();
    }

    /**
     * Create an instance of {@link FullProductName }
     * 
     */
    public FullProductName createFullProductName() {
        return new FullProductName();
    }

    /**
     * Create an instance of {@link ProductTree.Relationship }
     * 
     */
    public ProductTree.Relationship createProductTreeRelationship() {
        return new ProductTree.Relationship();
    }

    /**
     * Create an instance of {@link ProductTree.ProductGroups.Group.Description }
     * 
     */
    public ProductTree.ProductGroups.Group.Description createProductTreeProductGroupsGroupDescription() {
        return new ProductTree.ProductGroups.Group.Description();
    }

}

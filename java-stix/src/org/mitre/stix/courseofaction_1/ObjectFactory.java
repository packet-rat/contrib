//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.04.17 at 04:06:30 PM EDT 
//


package org.mitre.stix.courseofaction_1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.mitre.stix.courseofaction_1 package. 
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

    private final static QName _CourseOfAction_QNAME = new QName("http://stix.mitre.org/CourseOfAction-1", "Course_Of_Action");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.mitre.stix.courseofaction_1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CourseOfActionType }
     * 
     */
    public CourseOfActionType createCourseOfActionType() {
        return new CourseOfActionType();
    }

    /**
     * Create an instance of {@link RelatedCOAsType }
     * 
     */
    public RelatedCOAsType createRelatedCOAsType() {
        return new RelatedCOAsType();
    }

    /**
     * Create an instance of {@link ObjectiveType }
     * 
     */
    public ObjectiveType createObjectiveType() {
        return new ObjectiveType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CourseOfActionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://stix.mitre.org/CourseOfAction-1", name = "Course_Of_Action")
    public JAXBElement<CourseOfActionType> createCourseOfAction(CourseOfActionType value) {
        return new JAXBElement<CourseOfActionType>(_CourseOfAction_QNAME, CourseOfActionType.class, null, value);
    }

}

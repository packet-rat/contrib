//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.04.17 at 04:06:30 PM EDT 
//


package org.mitre.stix.common_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Identifies or characterizes a relationship to a course of action.
 * 
 * <p>Java class for RelatedCourseOfActionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RelatedCourseOfActionType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://stix.mitre.org/common-1}GenericRelationshipType">
 *       &lt;sequence>
 *         &lt;element name="Course_Of_Action" type="{http://stix.mitre.org/common-1}CourseOfActionBaseType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RelatedCourseOfActionType", propOrder = {
    "courseOfAction"
})
public class RelatedCourseOfActionType
    extends GenericRelationshipType
{

    @XmlElement(name = "Course_Of_Action", required = true)
    protected CourseOfActionBaseType courseOfAction;

    /**
     * Gets the value of the courseOfAction property.
     * 
     * @return
     *     possible object is
     *     {@link CourseOfActionBaseType }
     *     
     */
    public CourseOfActionBaseType getCourseOfAction() {
        return courseOfAction;
    }

    /**
     * Sets the value of the courseOfAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link CourseOfActionBaseType }
     *     
     */
    public void setCourseOfAction(CourseOfActionBaseType value) {
        this.courseOfAction = value;
    }

}
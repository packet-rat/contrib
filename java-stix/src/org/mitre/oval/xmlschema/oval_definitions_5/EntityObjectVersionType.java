//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.04.17 at 04:06:30 PM EDT 
//


package org.mitre.oval.xmlschema.oval_definitions_5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * The EntityObjectVersionType type is extended by the entities of an individual OVAL State. This type provides uniformity to each state entity by including the attributes found in the EntityStateSimpleBaseType. This specific type describes simple version data.
 * 
 * <p>Java class for EntityObjectVersionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EntityObjectVersionType">
 *   &lt;simpleContent>
 *     &lt;restriction base="&lt;http://oval.mitre.org/XMLSchema/oval-definitions-5>EntitySimpleBaseType">
 *       &lt;attribute name="datatype" use="required" type="{http://oval.mitre.org/XMLSchema/oval-common-5}SimpleDatatypeEnumeration" fixed="version" />
 *     &lt;/restriction>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EntityObjectVersionType")
public class EntityObjectVersionType
    extends EntitySimpleBaseType
{


}

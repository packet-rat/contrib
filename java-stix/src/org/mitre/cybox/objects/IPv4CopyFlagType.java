//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.04.17 at 04:06:30 PM EDT 
//


package org.mitre.cybox.objects;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.mitre.cybox.common_2.BaseObjectPropertyType;


/**
 * IPv4CopyFlagType specifies value of IPv4 copy flag, via a union of the IPv4CopyFlagTypeEnum type and the atomic xs:string type. Its base type is the BaseObjectPropertyType, for permitting complex (i.e. regular-expression based) specifications.
 * 
 * <p>Java class for IPv4CopyFlagType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IPv4CopyFlagType">
 *   &lt;simpleContent>
 *     &lt;restriction base="&lt;http://cybox.mitre.org/common-2>BaseObjectPropertyType">
 *       &lt;attribute name="datatype" type="{http://cybox.mitre.org/common-2}DatatypeEnum" fixed="string" />
 *     &lt;/restriction>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IPv4CopyFlagType")
public class IPv4CopyFlagType
    extends BaseObjectPropertyType
{


}

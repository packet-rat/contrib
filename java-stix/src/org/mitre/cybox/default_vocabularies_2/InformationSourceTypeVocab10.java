//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.04.17 at 04:06:30 PM EDT 
//


package org.mitre.cybox.default_vocabularies_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.mitre.cybox.common_2.ControlledVocabularyStringType;


/**
 * The InformationSourceTypeVocab is the default CybOX vocabulary for information source types, used in the MeasureSourceType/Information_Source_Type element in CybOX Common.
 * 
 * <p>Java class for InformationSourceTypeVocab-1.0 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InformationSourceTypeVocab-1.0">
 *   &lt;simpleContent>
 *     &lt;restriction base="&lt;http://cybox.mitre.org/common-2>ControlledVocabularyStringType">
 *       &lt;attribute name="vocab_name" type="{http://www.w3.org/2001/XMLSchema}string" fixed="CybOX Default Information Source Types" />
 *       &lt;attribute name="vocab_reference" type="{http://www.w3.org/2001/XMLSchema}anyURI" fixed="http://cybox.mitre.org/XMLSchema/default_vocabularies/2.1/cybox_default_vocabularies.xsd#InformationSourceTypeVocab-1.0" />
 *     &lt;/restriction>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InformationSourceTypeVocab-1.0")
public class InformationSourceTypeVocab10
    extends ControlledVocabularyStringType
{


}

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.04.17 at 04:06:30 PM EDT 
//


package org.mitre.stix.default_vocabularies_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.mitre.stix.common_1.ControlledVocabularyStringType;


/**
 * The IncidentEffectVocab is the default STIX vocabulary for expressing the possible effects of an incident.
 * 
 * <p>Java class for IncidentEffectVocab-1.0 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IncidentEffectVocab-1.0">
 *   &lt;simpleContent>
 *     &lt;restriction base="&lt;http://stix.mitre.org/common-1>ControlledVocabularyStringType">
 *       &lt;attribute name="vocab_name" type="{http://www.w3.org/2001/XMLSchema}string" fixed="STIX Default Incident Effect Vocabulary" />
 *       &lt;attribute name="vocab_reference" type="{http://www.w3.org/2001/XMLSchema}anyURI" fixed="http://stix.mitre.org/XMLSchema/default_vocabularies/1.1.0/stix_default_vocabularies.xsd#IncidentEffectVocab-1.0" />
 *     &lt;/restriction>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IncidentEffectVocab-1.0")
public class IncidentEffectVocab10
    extends ControlledVocabularyStringType
{


}

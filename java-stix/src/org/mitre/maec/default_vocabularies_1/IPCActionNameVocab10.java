//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.04.17 at 04:06:30 PM EDT 
//


package org.mitre.maec.default_vocabularies_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.mitre.cybox.common_2.ControlledVocabularyStringType;


/**
 * For IPC action names, it should be used in place of the CybOX ActionNameVocab-1.0.
 * 
 * <p>Java class for IPCActionNameVocab-1.0 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IPCActionNameVocab-1.0">
 *   &lt;simpleContent>
 *     &lt;restriction base="&lt;http://cybox.mitre.org/common-2>ControlledVocabularyStringType">
 *       &lt;attribute name="vocab_name" type="{http://www.w3.org/2001/XMLSchema}string" fixed="MAEC Default IPC Action Names" />
 *       &lt;attribute name="vocab_reference" type="{http://www.w3.org/2001/XMLSchema}anyURI" fixed="http://maec.mitre.org/XMLSchema/default_vocabularies/2.1/maec_default_vocabularies.xsd#IPCActionNameVocab-1.0" />
 *     &lt;/restriction>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IPCActionNameVocab-1.0")
public class IPCActionNameVocab10
    extends ControlledVocabularyStringType
{


}

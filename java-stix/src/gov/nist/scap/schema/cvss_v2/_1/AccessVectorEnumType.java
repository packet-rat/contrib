//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.04.17 at 04:06:30 PM EDT 
//


package gov.nist.scap.schema.cvss_v2._1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for accessVectorEnumType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="accessVectorEnumType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="LOCAL"/>
 *     &lt;enumeration value="ADJACENT_NETWORK"/>
 *     &lt;enumeration value="NETWORK"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "accessVectorEnumType")
@XmlEnum
public enum AccessVectorEnumType {

    LOCAL,
    ADJACENT_NETWORK,
    NETWORK;

    public String value() {
        return name();
    }

    public static AccessVectorEnumType fromValue(String v) {
        return valueOf(v);
    }

}
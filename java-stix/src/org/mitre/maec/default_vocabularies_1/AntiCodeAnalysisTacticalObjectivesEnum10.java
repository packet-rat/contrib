//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.04.17 at 04:06:30 PM EDT 
//


package org.mitre.maec.default_vocabularies_1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AntiCodeAnalysisTacticalObjectivesEnum-1.0.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AntiCodeAnalysisTacticalObjectivesEnum-1.0">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="transform control flow"/>
 *     &lt;enumeration value="restructure arrays"/>
 *     &lt;enumeration value="detect debugging"/>
 *     &lt;enumeration value="prevent debugging"/>
 *     &lt;enumeration value="defeat flow-oriented (recursive traversal) disassembler"/>
 *     &lt;enumeration value="defeat linear disassembler"/>
 *     &lt;enumeration value="obfuscate instructions"/>
 *     &lt;enumeration value="obfuscate imports"/>
 *     &lt;enumeration value="defeat call graph generation"/>
 *     &lt;enumeration value="obfuscate runtime code"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AntiCodeAnalysisTacticalObjectivesEnum-1.0")
@XmlEnum
public enum AntiCodeAnalysisTacticalObjectivesEnum10 {


    /**
     * The 'transform control flow' value indicates that the malware instance is able to transform its control flow.
     * 
     */
    @XmlEnumValue("transform control flow")
    TRANSFORM_CONTROL_FLOW("transform control flow"),

    /**
     * The 'restructure arrays' value indicates that the malware instance is able to restructure its arrays, making disassembly more difficult.
     * 
     */
    @XmlEnumValue("restructure arrays")
    RESTRUCTURE_ARRAYS("restructure arrays"),

    /**
     * The 'detect debugging' value indicates that the malware instance is able to detect its execution in a debugger.  
     * 
     */
    @XmlEnumValue("detect debugging")
    DETECT_DEBUGGING("detect debugging"),

    /**
     * The 'prevent debugging' value indicates that the malware instance is able to prevent its execution in a debugger.
     * 
     */
    @XmlEnumValue("prevent debugging")
    PREVENT_DEBUGGING("prevent debugging"),

    /**
     * The 'defeat flow-oriented disassembler' value indicates that the malware instance is able to defeat its disassembly in a flow-oriented (recursive traversal) disassembler.
     * 
     */
    @XmlEnumValue("defeat flow-oriented (recursive traversal) disassembler")
    DEFEAT_FLOW_ORIENTED_RECURSIVE_TRAVERSAL_DISASSEMBLER("defeat flow-oriented (recursive traversal) disassembler"),

    /**
     * The 'defeat linear disassembler' value indicates that the malware instance is able to prevent its disassembly in a linear disassembler.
     * 
     */
    @XmlEnumValue("defeat linear disassembler")
    DEFEAT_LINEAR_DISASSEMBLER("defeat linear disassembler"),

    /**
     * The 'obfuscate instructions' value indicates that the malware instance obfuscates its instructions.
     * 
     */
    @XmlEnumValue("obfuscate instructions")
    OBFUSCATE_INSTRUCTIONS("obfuscate instructions"),

    /**
     * The 'obfuscate imports' value indicates that the malware instance is able to obfuscate its import table, making disassembly more difficult.
     * 
     */
    @XmlEnumValue("obfuscate imports")
    OBFUSCATE_IMPORTS("obfuscate imports"),

    /**
     * The 'defeat call graph generation' value indicates that the malware instance is able to defeat accurate call graph generation during disassembly.
     * 
     */
    @XmlEnumValue("defeat call graph generation")
    DEFEAT_CALL_GRAPH_GENERATION("defeat call graph generation"),

    /**
     * The 'obfuscate runtime code' value indicates that the malware instance is able to obfuscate its runtime code.
     * 
     */
    @XmlEnumValue("obfuscate runtime code")
    OBFUSCATE_RUNTIME_CODE("obfuscate runtime code");
    private final String value;

    AntiCodeAnalysisTacticalObjectivesEnum10(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AntiCodeAnalysisTacticalObjectivesEnum10 fromValue(String v) {
        for (AntiCodeAnalysisTacticalObjectivesEnum10 c: AntiCodeAnalysisTacticalObjectivesEnum10 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.04.17 at 04:06:30 PM EDT 
//


package org.mitre.capec.capec_2;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Attack_Phases">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Attack_Phase" maxOccurs="3">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Attack_Steps">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="Attack_Step" maxOccurs="unbounded">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;choice>
 *                                                 &lt;element name="Common_Attack_Step">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="Pattern_Specific_Overrides" type="{http://capec.mitre.org/capec-2}Custom_Attack_StepType"/>
 *                                                         &lt;/sequence>
 *                                                         &lt;attribute name="Common_Attack_Step_ID" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="Custom_Attack_Step" type="{http://capec.mitre.org/capec-2}Custom_Attack_StepType"/>
 *                                               &lt;/choice>
 *                                               &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                           &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                           &lt;attribute name="Name" use="required">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *                                 &lt;whiteSpace value="collapse"/>
 *                                 &lt;enumeration value="Explore"/>
 *                                 &lt;enumeration value="Experiment"/>
 *                                 &lt;enumeration value="Exploit"/>
 *                                 &lt;enumeration value=""/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "attackPhases"
})
@XmlRootElement(name = "Attack_Execution_Flow")
public class AttackExecutionFlow {

    @XmlElement(name = "Attack_Phases", required = true)
    protected AttackExecutionFlow.AttackPhases attackPhases;

    /**
     * Gets the value of the attackPhases property.
     * 
     * @return
     *     possible object is
     *     {@link AttackExecutionFlow.AttackPhases }
     *     
     */
    public AttackExecutionFlow.AttackPhases getAttackPhases() {
        return attackPhases;
    }

    /**
     * Sets the value of the attackPhases property.
     * 
     * @param value
     *     allowed object is
     *     {@link AttackExecutionFlow.AttackPhases }
     *     
     */
    public void setAttackPhases(AttackExecutionFlow.AttackPhases value) {
        this.attackPhases = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Attack_Phase" maxOccurs="3">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Attack_Steps">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="Attack_Step" maxOccurs="unbounded">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;choice>
     *                                       &lt;element name="Common_Attack_Step">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="Pattern_Specific_Overrides" type="{http://capec.mitre.org/capec-2}Custom_Attack_StepType"/>
     *                                               &lt;/sequence>
     *                                               &lt;attribute name="Common_Attack_Step_ID" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                       &lt;element name="Custom_Attack_Step" type="{http://capec.mitre.org/capec-2}Custom_Attack_StepType"/>
     *                                     &lt;/choice>
     *                                     &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *                 &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *                 &lt;attribute name="Name" use="required">
     *                   &lt;simpleType>
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
     *                       &lt;whiteSpace value="collapse"/>
     *                       &lt;enumeration value="Explore"/>
     *                       &lt;enumeration value="Experiment"/>
     *                       &lt;enumeration value="Exploit"/>
     *                       &lt;enumeration value=""/>
     *                     &lt;/restriction>
     *                   &lt;/simpleType>
     *                 &lt;/attribute>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "attackPhase"
    })
    public static class AttackPhases {

        @XmlElement(name = "Attack_Phase", required = true)
        protected List<AttackExecutionFlow.AttackPhases.AttackPhase> attackPhase;

        /**
         * Gets the value of the attackPhase property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the attackPhase property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAttackPhase().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AttackExecutionFlow.AttackPhases.AttackPhase }
         * 
         * 
         */
        public List<AttackExecutionFlow.AttackPhases.AttackPhase> getAttackPhase() {
            if (attackPhase == null) {
                attackPhase = new ArrayList<AttackExecutionFlow.AttackPhases.AttackPhase>();
            }
            return this.attackPhase;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="Attack_Steps">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="Attack_Step" maxOccurs="unbounded">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;choice>
         *                             &lt;element name="Common_Attack_Step">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="Pattern_Specific_Overrides" type="{http://capec.mitre.org/capec-2}Custom_Attack_StepType"/>
         *                                     &lt;/sequence>
         *                                     &lt;attribute name="Common_Attack_Step_ID" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                             &lt;element name="Custom_Attack_Step" type="{http://capec.mitre.org/capec-2}Custom_Attack_StepType"/>
         *                           &lt;/choice>
         *                           &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *       &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
         *       &lt;attribute name="Name" use="required">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
         *             &lt;whiteSpace value="collapse"/>
         *             &lt;enumeration value="Explore"/>
         *             &lt;enumeration value="Experiment"/>
         *             &lt;enumeration value="Exploit"/>
         *             &lt;enumeration value=""/>
         *           &lt;/restriction>
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "attackSteps"
        })
        public static class AttackPhase {

            @XmlElement(name = "Attack_Steps", required = true)
            protected AttackExecutionFlow.AttackPhases.AttackPhase.AttackSteps attackSteps;
            @XmlAttribute(name = "ID", required = true)
            protected BigInteger id;
            @XmlAttribute(name = "Name", required = true)
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            protected String name;

            /**
             * Gets the value of the attackSteps property.
             * 
             * @return
             *     possible object is
             *     {@link AttackExecutionFlow.AttackPhases.AttackPhase.AttackSteps }
             *     
             */
            public AttackExecutionFlow.AttackPhases.AttackPhase.AttackSteps getAttackSteps() {
                return attackSteps;
            }

            /**
             * Sets the value of the attackSteps property.
             * 
             * @param value
             *     allowed object is
             *     {@link AttackExecutionFlow.AttackPhases.AttackPhase.AttackSteps }
             *     
             */
            public void setAttackSteps(AttackExecutionFlow.AttackPhases.AttackPhase.AttackSteps value) {
                this.attackSteps = value;
            }

            /**
             * Gets the value of the id property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getID() {
                return id;
            }

            /**
             * Sets the value of the id property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setID(BigInteger value) {
                this.id = value;
            }

            /**
             * Gets the value of the name property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getName() {
                return name;
            }

            /**
             * Sets the value of the name property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setName(String value) {
                this.name = value;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="Attack_Step" maxOccurs="unbounded">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;choice>
             *                   &lt;element name="Common_Attack_Step">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="Pattern_Specific_Overrides" type="{http://capec.mitre.org/capec-2}Custom_Attack_StepType"/>
             *                           &lt;/sequence>
             *                           &lt;attribute name="Common_Attack_Step_ID" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                   &lt;element name="Custom_Attack_Step" type="{http://capec.mitre.org/capec-2}Custom_Attack_StepType"/>
             *                 &lt;/choice>
             *                 &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "attackStep"
            })
            public static class AttackSteps {

                @XmlElement(name = "Attack_Step", required = true)
                protected List<AttackExecutionFlow.AttackPhases.AttackPhase.AttackSteps.AttackStep> attackStep;

                /**
                 * Gets the value of the attackStep property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the attackStep property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getAttackStep().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link AttackExecutionFlow.AttackPhases.AttackPhase.AttackSteps.AttackStep }
                 * 
                 * 
                 */
                public List<AttackExecutionFlow.AttackPhases.AttackPhase.AttackSteps.AttackStep> getAttackStep() {
                    if (attackStep == null) {
                        attackStep = new ArrayList<AttackExecutionFlow.AttackPhases.AttackPhase.AttackSteps.AttackStep>();
                    }
                    return this.attackStep;
                }


                /**
                 * <p>Java class for anonymous complex type.
                 * 
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;choice>
                 *         &lt;element name="Common_Attack_Step">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="Pattern_Specific_Overrides" type="{http://capec.mitre.org/capec-2}Custom_Attack_StepType"/>
                 *                 &lt;/sequence>
                 *                 &lt;attribute name="Common_Attack_Step_ID" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element name="Custom_Attack_Step" type="{http://capec.mitre.org/capec-2}Custom_Attack_StepType"/>
                 *       &lt;/choice>
                 *       &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "commonAttackStep",
                    "customAttackStep"
                })
                public static class AttackStep {

                    @XmlElement(name = "Common_Attack_Step")
                    protected AttackExecutionFlow.AttackPhases.AttackPhase.AttackSteps.AttackStep.CommonAttackStep commonAttackStep;
                    @XmlElement(name = "Custom_Attack_Step")
                    protected CustomAttackStepType customAttackStep;
                    @XmlAttribute(name = "ID", required = true)
                    protected BigInteger id;

                    /**
                     * Gets the value of the commonAttackStep property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link AttackExecutionFlow.AttackPhases.AttackPhase.AttackSteps.AttackStep.CommonAttackStep }
                     *     
                     */
                    public AttackExecutionFlow.AttackPhases.AttackPhase.AttackSteps.AttackStep.CommonAttackStep getCommonAttackStep() {
                        return commonAttackStep;
                    }

                    /**
                     * Sets the value of the commonAttackStep property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link AttackExecutionFlow.AttackPhases.AttackPhase.AttackSteps.AttackStep.CommonAttackStep }
                     *     
                     */
                    public void setCommonAttackStep(AttackExecutionFlow.AttackPhases.AttackPhase.AttackSteps.AttackStep.CommonAttackStep value) {
                        this.commonAttackStep = value;
                    }

                    /**
                     * Gets the value of the customAttackStep property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link CustomAttackStepType }
                     *     
                     */
                    public CustomAttackStepType getCustomAttackStep() {
                        return customAttackStep;
                    }

                    /**
                     * Sets the value of the customAttackStep property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link CustomAttackStepType }
                     *     
                     */
                    public void setCustomAttackStep(CustomAttackStepType value) {
                        this.customAttackStep = value;
                    }

                    /**
                     * Gets the value of the id property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigInteger }
                     *     
                     */
                    public BigInteger getID() {
                        return id;
                    }

                    /**
                     * Sets the value of the id property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigInteger }
                     *     
                     */
                    public void setID(BigInteger value) {
                        this.id = value;
                    }


                    /**
                     * <p>Java class for anonymous complex type.
                     * 
                     * <p>The following schema fragment specifies the expected content contained within this class.
                     * 
                     * <pre>
                     * &lt;complexType>
                     *   &lt;complexContent>
                     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *       &lt;sequence>
                     *         &lt;element name="Pattern_Specific_Overrides" type="{http://capec.mitre.org/capec-2}Custom_Attack_StepType"/>
                     *       &lt;/sequence>
                     *       &lt;attribute name="Common_Attack_Step_ID" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
                     *     &lt;/restriction>
                     *   &lt;/complexContent>
                     * &lt;/complexType>
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "", propOrder = {
                        "patternSpecificOverrides"
                    })
                    public static class CommonAttackStep {

                        @XmlElement(name = "Pattern_Specific_Overrides", required = true)
                        protected CustomAttackStepType patternSpecificOverrides;
                        @XmlAttribute(name = "Common_Attack_Step_ID", required = true)
                        protected BigInteger commonAttackStepID;

                        /**
                         * Gets the value of the patternSpecificOverrides property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link CustomAttackStepType }
                         *     
                         */
                        public CustomAttackStepType getPatternSpecificOverrides() {
                            return patternSpecificOverrides;
                        }

                        /**
                         * Sets the value of the patternSpecificOverrides property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link CustomAttackStepType }
                         *     
                         */
                        public void setPatternSpecificOverrides(CustomAttackStepType value) {
                            this.patternSpecificOverrides = value;
                        }

                        /**
                         * Gets the value of the commonAttackStepID property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link BigInteger }
                         *     
                         */
                        public BigInteger getCommonAttackStepID() {
                            return commonAttackStepID;
                        }

                        /**
                         * Sets the value of the commonAttackStepID property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link BigInteger }
                         *     
                         */
                        public void setCommonAttackStepID(BigInteger value) {
                            this.commonAttackStepID = value;
                        }

                    }

                }

            }

        }

    }

}

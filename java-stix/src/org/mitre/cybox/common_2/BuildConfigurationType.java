//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.04.17 at 04:06:30 PM EDT 
//


package org.mitre.cybox.common_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The BuildConfigurationType describes how the build utility was configured for this build of this application.
 * 
 * <p>Java class for BuildConfigurationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BuildConfigurationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Configuration_Setting_Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Configuration_Settings" type="{http://cybox.mitre.org/common-2}ConfigurationSettingsType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BuildConfigurationType", propOrder = {
    "configurationSettingDescription",
    "configurationSettings"
})
public class BuildConfigurationType {

    @XmlElement(name = "Configuration_Setting_Description")
    protected String configurationSettingDescription;
    @XmlElement(name = "Configuration_Settings", required = true)
    protected ConfigurationSettingsType configurationSettings;

    /**
     * Gets the value of the configurationSettingDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConfigurationSettingDescription() {
        return configurationSettingDescription;
    }

    /**
     * Sets the value of the configurationSettingDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConfigurationSettingDescription(String value) {
        this.configurationSettingDescription = value;
    }

    /**
     * Gets the value of the configurationSettings property.
     * 
     * @return
     *     possible object is
     *     {@link ConfigurationSettingsType }
     *     
     */
    public ConfigurationSettingsType getConfigurationSettings() {
        return configurationSettings;
    }

    /**
     * Sets the value of the configurationSettings property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConfigurationSettingsType }
     *     
     */
    public void setConfigurationSettings(ConfigurationSettingsType value) {
        this.configurationSettings = value;
    }

}

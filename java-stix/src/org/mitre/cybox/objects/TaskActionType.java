//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.04.17 at 04:06:30 PM EDT 
//


package org.mitre.cybox.objects;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.mitre.cybox.common_2.StringObjectPropertyType;


/**
 * The TaskActionType type characterizes scheduled task actions.
 * 
 * <p>Java class for TaskActionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TaskActionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Action_Type" type="{http://cybox.mitre.org/objects#WinTaskObject-2}TaskActionTypeType" minOccurs="0"/>
 *         &lt;element name="Action_ID" type="{http://cybox.mitre.org/common-2}StringObjectPropertyType" minOccurs="0"/>
 *         &lt;element name="IEmailAction" type="{http://cybox.mitre.org/objects#EmailMessageObject-2}EmailMessageObjectType" minOccurs="0"/>
 *         &lt;element name="IComHandlerAction" type="{http://cybox.mitre.org/objects#WinTaskObject-2}IComHandlerActionType" minOccurs="0"/>
 *         &lt;element name="IExecAction" type="{http://cybox.mitre.org/objects#WinTaskObject-2}IExecActionType" minOccurs="0"/>
 *         &lt;element name="IShowMessageAction" type="{http://cybox.mitre.org/objects#WinTaskObject-2}IShowMessageActionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaskActionType", namespace = "http://cybox.mitre.org/objects#WinTaskObject-2", propOrder = {
    "actionType",
    "actionID",
    "iEmailAction",
    "iComHandlerAction",
    "iExecAction",
    "iShowMessageAction"
})
public class TaskActionType {

    @XmlElement(name = "Action_Type")
    protected TaskActionTypeType actionType;
    @XmlElement(name = "Action_ID")
    protected StringObjectPropertyType actionID;
    @XmlElement(name = "IEmailAction")
    protected EmailMessageObjectType iEmailAction;
    @XmlElement(name = "IComHandlerAction")
    protected IComHandlerActionType iComHandlerAction;
    @XmlElement(name = "IExecAction")
    protected IExecActionType iExecAction;
    @XmlElement(name = "IShowMessageAction")
    protected IShowMessageActionType iShowMessageAction;

    /**
     * Gets the value of the actionType property.
     * 
     * @return
     *     possible object is
     *     {@link TaskActionTypeType }
     *     
     */
    public TaskActionTypeType getActionType() {
        return actionType;
    }

    /**
     * Sets the value of the actionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaskActionTypeType }
     *     
     */
    public void setActionType(TaskActionTypeType value) {
        this.actionType = value;
    }

    /**
     * Gets the value of the actionID property.
     * 
     * @return
     *     possible object is
     *     {@link StringObjectPropertyType }
     *     
     */
    public StringObjectPropertyType getActionID() {
        return actionID;
    }

    /**
     * Sets the value of the actionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringObjectPropertyType }
     *     
     */
    public void setActionID(StringObjectPropertyType value) {
        this.actionID = value;
    }

    /**
     * Gets the value of the iEmailAction property.
     * 
     * @return
     *     possible object is
     *     {@link EmailMessageObjectType }
     *     
     */
    public EmailMessageObjectType getIEmailAction() {
        return iEmailAction;
    }

    /**
     * Sets the value of the iEmailAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmailMessageObjectType }
     *     
     */
    public void setIEmailAction(EmailMessageObjectType value) {
        this.iEmailAction = value;
    }

    /**
     * Gets the value of the iComHandlerAction property.
     * 
     * @return
     *     possible object is
     *     {@link IComHandlerActionType }
     *     
     */
    public IComHandlerActionType getIComHandlerAction() {
        return iComHandlerAction;
    }

    /**
     * Sets the value of the iComHandlerAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link IComHandlerActionType }
     *     
     */
    public void setIComHandlerAction(IComHandlerActionType value) {
        this.iComHandlerAction = value;
    }

    /**
     * Gets the value of the iExecAction property.
     * 
     * @return
     *     possible object is
     *     {@link IExecActionType }
     *     
     */
    public IExecActionType getIExecAction() {
        return iExecAction;
    }

    /**
     * Sets the value of the iExecAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link IExecActionType }
     *     
     */
    public void setIExecAction(IExecActionType value) {
        this.iExecAction = value;
    }

    /**
     * Gets the value of the iShowMessageAction property.
     * 
     * @return
     *     possible object is
     *     {@link IShowMessageActionType }
     *     
     */
    public IShowMessageActionType getIShowMessageAction() {
        return iShowMessageAction;
    }

    /**
     * Sets the value of the iShowMessageAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link IShowMessageActionType }
     *     
     */
    public void setIShowMessageAction(IShowMessageActionType value) {
        this.iShowMessageAction = value;
    }

}

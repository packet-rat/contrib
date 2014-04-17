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
import org.mitre.cybox.common_2.UnsignedIntegerObjectPropertyType;


/**
 * The SocketOptionsType specifies any particular options used by the socket. If an options is supported only by specific address families or socket types, that's indicated in parentheses.
 * 
 * <p>Java class for SocketOptionsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SocketOptionsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IP_MULTICAST_IF" type="{http://cybox.mitre.org/common-2}StringObjectPropertyType" minOccurs="0"/>
 *         &lt;element name="IP_MULTICAST_IF2" type="{http://cybox.mitre.org/common-2}StringObjectPropertyType" minOccurs="0"/>
 *         &lt;element name="IP_MULTICAST_LOOP" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IP_TOS" type="{http://cybox.mitre.org/common-2}StringObjectPropertyType" minOccurs="0"/>
 *         &lt;element name="SO_BROADCAST" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="SO_CONDITIONAL_ACCEPT" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="SO_KEEPALIVE" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="SO_DONTROUTE" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="SO_LINGER" type="{http://cybox.mitre.org/common-2}UnsignedIntegerObjectPropertyType" minOccurs="0"/>
 *         &lt;element name="SO_DONTLINGER" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="SO_OOBINLINE" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="SO_RCVBUF" type="{http://cybox.mitre.org/common-2}UnsignedIntegerObjectPropertyType" minOccurs="0"/>
 *         &lt;element name="SO_GROUP_PRIORITY" type="{http://cybox.mitre.org/common-2}UnsignedIntegerObjectPropertyType" minOccurs="0"/>
 *         &lt;element name="SO_REUSEADDR" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="SO_DEBUG" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="SO_RCVTIMEO" type="{http://cybox.mitre.org/common-2}UnsignedIntegerObjectPropertyType" minOccurs="0"/>
 *         &lt;element name="SO_SNDBUF" type="{http://cybox.mitre.org/common-2}UnsignedIntegerObjectPropertyType" minOccurs="0"/>
 *         &lt;element name="SO_SNDTIMEO" type="{http://cybox.mitre.org/common-2}UnsignedIntegerObjectPropertyType" minOccurs="0"/>
 *         &lt;element name="SO_UPDATE_ACCEPT_CONTEXT" type="{http://cybox.mitre.org/common-2}UnsignedIntegerObjectPropertyType" minOccurs="0"/>
 *         &lt;element name="SO_TIMEOUT" type="{http://cybox.mitre.org/common-2}UnsignedIntegerObjectPropertyType" minOccurs="0"/>
 *         &lt;element name="TCP_NODELAY" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SocketOptionsType", namespace = "http://cybox.mitre.org/objects#NetworkSocketObject-2", propOrder = {
    "ipmulticastif",
    "ipmulticastif2",
    "ipmulticastloop",
    "iptos",
    "sobroadcast",
    "soconditionalaccept",
    "sokeepalive",
    "sodontroute",
    "solinger",
    "sodontlinger",
    "sooobinline",
    "sorcvbuf",
    "sogrouppriority",
    "soreuseaddr",
    "sodebug",
    "sorcvtimeo",
    "sosndbuf",
    "sosndtimeo",
    "soupdateacceptcontext",
    "sotimeout",
    "tcpnodelay"
})
public class SocketOptionsType {

    @XmlElement(name = "IP_MULTICAST_IF")
    protected StringObjectPropertyType ipmulticastif;
    @XmlElement(name = "IP_MULTICAST_IF2")
    protected StringObjectPropertyType ipmulticastif2;
    @XmlElement(name = "IP_MULTICAST_LOOP")
    protected Boolean ipmulticastloop;
    @XmlElement(name = "IP_TOS")
    protected StringObjectPropertyType iptos;
    @XmlElement(name = "SO_BROADCAST")
    protected Boolean sobroadcast;
    @XmlElement(name = "SO_CONDITIONAL_ACCEPT")
    protected Boolean soconditionalaccept;
    @XmlElement(name = "SO_KEEPALIVE")
    protected Boolean sokeepalive;
    @XmlElement(name = "SO_DONTROUTE")
    protected Boolean sodontroute;
    @XmlElement(name = "SO_LINGER")
    protected UnsignedIntegerObjectPropertyType solinger;
    @XmlElement(name = "SO_DONTLINGER")
    protected Boolean sodontlinger;
    @XmlElement(name = "SO_OOBINLINE")
    protected Boolean sooobinline;
    @XmlElement(name = "SO_RCVBUF")
    protected UnsignedIntegerObjectPropertyType sorcvbuf;
    @XmlElement(name = "SO_GROUP_PRIORITY")
    protected UnsignedIntegerObjectPropertyType sogrouppriority;
    @XmlElement(name = "SO_REUSEADDR")
    protected Boolean soreuseaddr;
    @XmlElement(name = "SO_DEBUG")
    protected Boolean sodebug;
    @XmlElement(name = "SO_RCVTIMEO")
    protected UnsignedIntegerObjectPropertyType sorcvtimeo;
    @XmlElement(name = "SO_SNDBUF")
    protected UnsignedIntegerObjectPropertyType sosndbuf;
    @XmlElement(name = "SO_SNDTIMEO")
    protected UnsignedIntegerObjectPropertyType sosndtimeo;
    @XmlElement(name = "SO_UPDATE_ACCEPT_CONTEXT")
    protected UnsignedIntegerObjectPropertyType soupdateacceptcontext;
    @XmlElement(name = "SO_TIMEOUT")
    protected UnsignedIntegerObjectPropertyType sotimeout;
    @XmlElement(name = "TCP_NODELAY")
    protected Boolean tcpnodelay;

    /**
     * Gets the value of the ipmulticastif property.
     * 
     * @return
     *     possible object is
     *     {@link StringObjectPropertyType }
     *     
     */
    public StringObjectPropertyType getIPMULTICASTIF() {
        return ipmulticastif;
    }

    /**
     * Sets the value of the ipmulticastif property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringObjectPropertyType }
     *     
     */
    public void setIPMULTICASTIF(StringObjectPropertyType value) {
        this.ipmulticastif = value;
    }

    /**
     * Gets the value of the ipmulticastif2 property.
     * 
     * @return
     *     possible object is
     *     {@link StringObjectPropertyType }
     *     
     */
    public StringObjectPropertyType getIPMULTICASTIF2() {
        return ipmulticastif2;
    }

    /**
     * Sets the value of the ipmulticastif2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringObjectPropertyType }
     *     
     */
    public void setIPMULTICASTIF2(StringObjectPropertyType value) {
        this.ipmulticastif2 = value;
    }

    /**
     * Gets the value of the ipmulticastloop property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIPMULTICASTLOOP() {
        return ipmulticastloop;
    }

    /**
     * Sets the value of the ipmulticastloop property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIPMULTICASTLOOP(Boolean value) {
        this.ipmulticastloop = value;
    }

    /**
     * Gets the value of the iptos property.
     * 
     * @return
     *     possible object is
     *     {@link StringObjectPropertyType }
     *     
     */
    public StringObjectPropertyType getIPTOS() {
        return iptos;
    }

    /**
     * Sets the value of the iptos property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringObjectPropertyType }
     *     
     */
    public void setIPTOS(StringObjectPropertyType value) {
        this.iptos = value;
    }

    /**
     * Gets the value of the sobroadcast property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSOBROADCAST() {
        return sobroadcast;
    }

    /**
     * Sets the value of the sobroadcast property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSOBROADCAST(Boolean value) {
        this.sobroadcast = value;
    }

    /**
     * Gets the value of the soconditionalaccept property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSOCONDITIONALACCEPT() {
        return soconditionalaccept;
    }

    /**
     * Sets the value of the soconditionalaccept property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSOCONDITIONALACCEPT(Boolean value) {
        this.soconditionalaccept = value;
    }

    /**
     * Gets the value of the sokeepalive property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSOKEEPALIVE() {
        return sokeepalive;
    }

    /**
     * Sets the value of the sokeepalive property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSOKEEPALIVE(Boolean value) {
        this.sokeepalive = value;
    }

    /**
     * Gets the value of the sodontroute property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSODONTROUTE() {
        return sodontroute;
    }

    /**
     * Sets the value of the sodontroute property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSODONTROUTE(Boolean value) {
        this.sodontroute = value;
    }

    /**
     * Gets the value of the solinger property.
     * 
     * @return
     *     possible object is
     *     {@link UnsignedIntegerObjectPropertyType }
     *     
     */
    public UnsignedIntegerObjectPropertyType getSOLINGER() {
        return solinger;
    }

    /**
     * Sets the value of the solinger property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnsignedIntegerObjectPropertyType }
     *     
     */
    public void setSOLINGER(UnsignedIntegerObjectPropertyType value) {
        this.solinger = value;
    }

    /**
     * Gets the value of the sodontlinger property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSODONTLINGER() {
        return sodontlinger;
    }

    /**
     * Sets the value of the sodontlinger property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSODONTLINGER(Boolean value) {
        this.sodontlinger = value;
    }

    /**
     * Gets the value of the sooobinline property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSOOOBINLINE() {
        return sooobinline;
    }

    /**
     * Sets the value of the sooobinline property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSOOOBINLINE(Boolean value) {
        this.sooobinline = value;
    }

    /**
     * Gets the value of the sorcvbuf property.
     * 
     * @return
     *     possible object is
     *     {@link UnsignedIntegerObjectPropertyType }
     *     
     */
    public UnsignedIntegerObjectPropertyType getSORCVBUF() {
        return sorcvbuf;
    }

    /**
     * Sets the value of the sorcvbuf property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnsignedIntegerObjectPropertyType }
     *     
     */
    public void setSORCVBUF(UnsignedIntegerObjectPropertyType value) {
        this.sorcvbuf = value;
    }

    /**
     * Gets the value of the sogrouppriority property.
     * 
     * @return
     *     possible object is
     *     {@link UnsignedIntegerObjectPropertyType }
     *     
     */
    public UnsignedIntegerObjectPropertyType getSOGROUPPRIORITY() {
        return sogrouppriority;
    }

    /**
     * Sets the value of the sogrouppriority property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnsignedIntegerObjectPropertyType }
     *     
     */
    public void setSOGROUPPRIORITY(UnsignedIntegerObjectPropertyType value) {
        this.sogrouppriority = value;
    }

    /**
     * Gets the value of the soreuseaddr property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSOREUSEADDR() {
        return soreuseaddr;
    }

    /**
     * Sets the value of the soreuseaddr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSOREUSEADDR(Boolean value) {
        this.soreuseaddr = value;
    }

    /**
     * Gets the value of the sodebug property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSODEBUG() {
        return sodebug;
    }

    /**
     * Sets the value of the sodebug property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSODEBUG(Boolean value) {
        this.sodebug = value;
    }

    /**
     * Gets the value of the sorcvtimeo property.
     * 
     * @return
     *     possible object is
     *     {@link UnsignedIntegerObjectPropertyType }
     *     
     */
    public UnsignedIntegerObjectPropertyType getSORCVTIMEO() {
        return sorcvtimeo;
    }

    /**
     * Sets the value of the sorcvtimeo property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnsignedIntegerObjectPropertyType }
     *     
     */
    public void setSORCVTIMEO(UnsignedIntegerObjectPropertyType value) {
        this.sorcvtimeo = value;
    }

    /**
     * Gets the value of the sosndbuf property.
     * 
     * @return
     *     possible object is
     *     {@link UnsignedIntegerObjectPropertyType }
     *     
     */
    public UnsignedIntegerObjectPropertyType getSOSNDBUF() {
        return sosndbuf;
    }

    /**
     * Sets the value of the sosndbuf property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnsignedIntegerObjectPropertyType }
     *     
     */
    public void setSOSNDBUF(UnsignedIntegerObjectPropertyType value) {
        this.sosndbuf = value;
    }

    /**
     * Gets the value of the sosndtimeo property.
     * 
     * @return
     *     possible object is
     *     {@link UnsignedIntegerObjectPropertyType }
     *     
     */
    public UnsignedIntegerObjectPropertyType getSOSNDTIMEO() {
        return sosndtimeo;
    }

    /**
     * Sets the value of the sosndtimeo property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnsignedIntegerObjectPropertyType }
     *     
     */
    public void setSOSNDTIMEO(UnsignedIntegerObjectPropertyType value) {
        this.sosndtimeo = value;
    }

    /**
     * Gets the value of the soupdateacceptcontext property.
     * 
     * @return
     *     possible object is
     *     {@link UnsignedIntegerObjectPropertyType }
     *     
     */
    public UnsignedIntegerObjectPropertyType getSOUPDATEACCEPTCONTEXT() {
        return soupdateacceptcontext;
    }

    /**
     * Sets the value of the soupdateacceptcontext property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnsignedIntegerObjectPropertyType }
     *     
     */
    public void setSOUPDATEACCEPTCONTEXT(UnsignedIntegerObjectPropertyType value) {
        this.soupdateacceptcontext = value;
    }

    /**
     * Gets the value of the sotimeout property.
     * 
     * @return
     *     possible object is
     *     {@link UnsignedIntegerObjectPropertyType }
     *     
     */
    public UnsignedIntegerObjectPropertyType getSOTIMEOUT() {
        return sotimeout;
    }

    /**
     * Sets the value of the sotimeout property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnsignedIntegerObjectPropertyType }
     *     
     */
    public void setSOTIMEOUT(UnsignedIntegerObjectPropertyType value) {
        this.sotimeout = value;
    }

    /**
     * Gets the value of the tcpnodelay property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTCPNODELAY() {
        return tcpnodelay;
    }

    /**
     * Sets the value of the tcpnodelay property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTCPNODELAY(Boolean value) {
        this.tcpnodelay = value;
    }

}
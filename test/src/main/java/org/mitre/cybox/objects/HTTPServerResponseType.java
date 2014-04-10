//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.04.09 at 05:02:22 PM EDT 
//


package org.mitre.cybox.objects;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The HTTPServerResponseType captures the details of an HTTP server response.
 * 
 * <p>Java class for HTTPServerResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HTTPServerResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="HTTP_Status_Line" type="{http://cybox.mitre.org/objects#HTTPSessionObject-2}HTTPStatusLineType" minOccurs="0"/>
 *         &lt;element name="HTTP_Response_Header" type="{http://cybox.mitre.org/objects#HTTPSessionObject-2}HTTPResponseHeaderType" minOccurs="0"/>
 *         &lt;element name="HTTP_Message_Body" type="{http://cybox.mitre.org/objects#HTTPSessionObject-2}HTTPMessageType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HTTPServerResponseType", propOrder = {
    "httpStatusLine",
    "httpResponseHeader",
    "httpMessageBody"
})
public class HTTPServerResponseType {

    @XmlElement(name = "HTTP_Status_Line")
    protected HTTPStatusLineType httpStatusLine;
    @XmlElement(name = "HTTP_Response_Header")
    protected HTTPResponseHeaderType httpResponseHeader;
    @XmlElement(name = "HTTP_Message_Body")
    protected HTTPMessageType httpMessageBody;

    /**
     * Gets the value of the httpStatusLine property.
     * 
     * @return
     *     possible object is
     *     {@link HTTPStatusLineType }
     *     
     */
    public HTTPStatusLineType getHTTPStatusLine() {
        return httpStatusLine;
    }

    /**
     * Sets the value of the httpStatusLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link HTTPStatusLineType }
     *     
     */
    public void setHTTPStatusLine(HTTPStatusLineType value) {
        this.httpStatusLine = value;
    }

    /**
     * Gets the value of the httpResponseHeader property.
     * 
     * @return
     *     possible object is
     *     {@link HTTPResponseHeaderType }
     *     
     */
    public HTTPResponseHeaderType getHTTPResponseHeader() {
        return httpResponseHeader;
    }

    /**
     * Sets the value of the httpResponseHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link HTTPResponseHeaderType }
     *     
     */
    public void setHTTPResponseHeader(HTTPResponseHeaderType value) {
        this.httpResponseHeader = value;
    }

    /**
     * Gets the value of the httpMessageBody property.
     * 
     * @return
     *     possible object is
     *     {@link HTTPMessageType }
     *     
     */
    public HTTPMessageType getHTTPMessageBody() {
        return httpMessageBody;
    }

    /**
     * Sets the value of the httpMessageBody property.
     * 
     * @param value
     *     allowed object is
     *     {@link HTTPMessageType }
     *     
     */
    public void setHTTPMessageBody(HTTPMessageType value) {
        this.httpMessageBody = value;
    }

}

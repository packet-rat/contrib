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
 * <p>Java class for FTPActionNameEnum-1.0.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FTPActionNameEnum-1.0">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="connect to ftp server"/>
 *     &lt;enumeration value="disconnect from ftp server"/>
 *     &lt;enumeration value="send ftp command"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FTPActionNameEnum-1.0")
@XmlEnum
public enum FTPActionNameEnum10 {


    /**
     * The 'connect to ftp server' value specifies the defined action of connecting to an existing FTP server.
     * 
     */
    @XmlEnumValue("connect to ftp server")
    CONNECT_TO_FTP_SERVER("connect to ftp server"),

    /**
     * The 'disconnect from ftp server' value specifies the defined action of disconnecting from an existing FTP server.
     * 
     */
    @XmlEnumValue("disconnect from ftp server")
    DISCONNECT_FROM_FTP_SERVER("disconnect from ftp server"),

    /**
     * The 'send ftp command' value specifies the defined action of sending a command on an FTP server connection.
     * 
     */
    @XmlEnumValue("send ftp command")
    SEND_FTP_COMMAND("send ftp command");
    private final String value;

    FTPActionNameEnum10(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FTPActionNameEnum10 fromValue(String v) {
        for (FTPActionNameEnum10 c: FTPActionNameEnum10 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.04.17 at 04:06:30 PM EDT 
//


package org.mitre.stix.extensions.identity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import oasis.names.tc.ciq.xpil._3.PartyType;


/**
 * The STIXCIQIdentityType provides a restriction and minor extension of the imported OASIS CIQ-PIL PartyType for use in characterizing STIX Identities.
 * 
 * <p>Java class for STIXCIQIdentity3.0Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="STIXCIQIdentity3.0Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{urn:oasis:names:tc:ciq:xpil:3}PartyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:oasis:names:tc:ciq:xpil:3}FreeTextLines" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:tc:ciq:xpil:3}PartyName" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:tc:ciq:xpil:3}Addresses" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:tc:ciq:xpil:3}Accounts" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:tc:ciq:xpil:3}ContactNumbers" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:tc:ciq:xpil:3}Documents" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:tc:ciq:xpil:3}ElectronicAddressIdentifiers" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:tc:ciq:xpil:3}Events" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:tc:ciq:xpil:3}Identifiers" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:tc:ciq:xpil:3}Memberships" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:tc:ciq:xpil:3}Relationships" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:tc:ciq:xpil:3}Revenues" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:tc:ciq:xpil:3}Stocks" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:tc:ciq:xpil:3}Vehicles" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:tc:ciq:xpil:3}OrganisationInfo" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:tc:ciq:xpil:3}PersonInfo" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:tc:ciq:xpil:3}BirthInfo" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:tc:ciq:xpil:3}CountriesOfResidence" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:tc:ciq:xpil:3}Favourites" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:tc:ciq:xpil:3}Habits" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:tc:ciq:xpil:3}Hobbies" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:tc:ciq:xpil:3}Languages" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:tc:ciq:xpil:3}Nationalities" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:tc:ciq:xpil:3}Occupations" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:tc:ciq:xpil:3}PhysicalInfo" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:tc:ciq:xpil:3}Preferences" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:tc:ciq:xpil:3}Qualifications" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:tc:ciq:xpil:3}Visas" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="PartyType" type="{urn:oasis:names:tc:ciq:xpil:3}PartyTypeList" />
 *       &lt;attribute name="LanguageCode" type="{http://www.w3.org/2001/XMLSchema}language" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "STIXCIQIdentity3.0Type")
public class STIXCIQIdentity30Type
    extends PartyType
{


}

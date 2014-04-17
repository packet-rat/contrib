//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.04.17 at 04:06:30 PM EDT 
//


package oasis.names.tc.ciq.xpil._3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VehicleInfoElementList.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="VehicleInfoElementList">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString">
 *     &lt;enumeration value="Make"/>
 *     &lt;enumeration value="Model"/>
 *     &lt;enumeration value="ManufactureDate"/>
 *     &lt;enumeration value="EngineNumber"/>
 *     &lt;enumeration value="ChassisNumber"/>
 *     &lt;enumeration value="BodyNumber"/>
 *     &lt;enumeration value="LicensePlateNumber"/>
 *     &lt;enumeration value="LicensePlateType"/>
 *     &lt;enumeration value="Colour"/>
 *     &lt;enumeration value="BodyType"/>
 *     &lt;enumeration value="Type"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "VehicleInfoElementList")
@XmlEnum
public enum VehicleInfoElementList {


    /**
     * Free text make description, e.g. Toyota, Ford
     * 
     */
    @XmlEnumValue("Make")
    MAKE("Make"),

    /**
     * Free text model description, e.g. Pajero, Falcon, etc. May include make as in Ford Falcon or Mitsubishi Pajero. If the make information is included then do not put the make as a separate element qualified with Make.
     * 
     */
    @XmlEnumValue("Model")
    MODEL("Model"),

    /**
     * Free text data which can be a full date or a year.
     * 
     */
    @XmlEnumValue("ManufactureDate")
    MANUFACTURE_DATE("ManufactureDate"),

    /**
     * Free text engine number
     * 
     */
    @XmlEnumValue("EngineNumber")
    ENGINE_NUMBER("EngineNumber"),

    /**
     * Free text chassis number
     * 
     */
    @XmlEnumValue("ChassisNumber")
    CHASSIS_NUMBER("ChassisNumber"),

    /**
     * Free text body number
     * 
     */
    @XmlEnumValue("BodyNumber")
    BODY_NUMBER("BodyNumber"),

    /**
     * Free text license plate number
     * 
     */
    @XmlEnumValue("LicensePlateNumber")
    LICENSE_PLATE_NUMBER("LicensePlateNumber"),

    /**
     * Number plate types are different. e.g. standard, premier, diplomat, etc
     * 
     */
    @XmlEnumValue("LicensePlateType")
    LICENSE_PLATE_TYPE("LicensePlateType"),
    @XmlEnumValue("Colour")
    COLOUR("Colour"),

    /**
     * Type of body. e.g. Sedan, Ute, Station wagon, 2 door, etc
     * 
     */
    @XmlEnumValue("BodyType")
    BODY_TYPE("BodyType"),

    /**
     * Use this if the enumeration list for type of vehicle is not used.
     * 
     */
    @XmlEnumValue("Type")
    TYPE("Type");
    private final String value;

    VehicleInfoElementList(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VehicleInfoElementList fromValue(String v) {
        for (VehicleInfoElementList c: VehicleInfoElementList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

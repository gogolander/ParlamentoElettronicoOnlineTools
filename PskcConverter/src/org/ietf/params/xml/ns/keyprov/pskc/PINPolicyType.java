//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.02.10 at 10:02:26 PM CET 
//


package ietf.params.xml.ns.keyprov.pskc;

import java.util.HashMap;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;


/**
 * <p>Java class for PINPolicyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PINPolicyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="PINKeyId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="PINUsageMode" type="{urn:ietf:params:xml:ns:keyprov:pskc}PINUsageModeType" />
 *       &lt;attribute name="MaxFailedAttempts" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *       &lt;attribute name="MinLength" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *       &lt;attribute name="MaxLength" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *       &lt;attribute name="PINEncoding" type="{urn:ietf:params:xml:ns:keyprov:pskc}ValueFormatType" />
 *       &lt;anyAttribute namespace='##other'/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PINPolicyType")
public class PINPolicyType {

    @XmlAttribute(name = "PINKeyId")
    protected String pinKeyId;
    @XmlAttribute(name = "PINUsageMode")
    protected PINUsageModeType pinUsageMode;
    @XmlAttribute(name = "MaxFailedAttempts")
    @XmlSchemaType(name = "unsignedInt")
    protected Long maxFailedAttempts;
    @XmlAttribute(name = "MinLength")
    @XmlSchemaType(name = "unsignedInt")
    protected Long minLength;
    @XmlAttribute(name = "MaxLength")
    @XmlSchemaType(name = "unsignedInt")
    protected Long maxLength;
    @XmlAttribute(name = "PINEncoding")
    protected ValueFormatType pinEncoding;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the pinKeyId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPINKeyId() {
        return pinKeyId;
    }

    /**
     * Sets the value of the pinKeyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPINKeyId(String value) {
        this.pinKeyId = value;
    }

    /**
     * Gets the value of the pinUsageMode property.
     * 
     * @return
     *     possible object is
     *     {@link PINUsageModeType }
     *     
     */
    public PINUsageModeType getPINUsageMode() {
        return pinUsageMode;
    }

    /**
     * Sets the value of the pinUsageMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link PINUsageModeType }
     *     
     */
    public void setPINUsageMode(PINUsageModeType value) {
        this.pinUsageMode = value;
    }

    /**
     * Gets the value of the maxFailedAttempts property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMaxFailedAttempts() {
        return maxFailedAttempts;
    }

    /**
     * Sets the value of the maxFailedAttempts property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMaxFailedAttempts(Long value) {
        this.maxFailedAttempts = value;
    }

    /**
     * Gets the value of the minLength property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMinLength() {
        return minLength;
    }

    /**
     * Sets the value of the minLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMinLength(Long value) {
        this.minLength = value;
    }

    /**
     * Gets the value of the maxLength property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMaxLength() {
        return maxLength;
    }

    /**
     * Sets the value of the maxLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMaxLength(Long value) {
        this.maxLength = value;
    }

    /**
     * Gets the value of the pinEncoding property.
     * 
     * @return
     *     possible object is
     *     {@link ValueFormatType }
     *     
     */
    public ValueFormatType getPINEncoding() {
        return pinEncoding;
    }

    /**
     * Sets the value of the pinEncoding property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValueFormatType }
     *     
     */
    public void setPINEncoding(ValueFormatType value) {
        this.pinEncoding = value;
    }

    /**
     * Gets a map that contains attributes that aren't bound to any typed property on this class.
     * 
     * <p>
     * the map is keyed by the name of the attribute and 
     * the value is the string value of the attribute.
     * 
     * the map returned by this method is live, and you can add new attribute
     * by updating the map directly. Because of this design, there's no setter.
     * 
     * 
     * @return
     *     always non-null
     */
    public Map<QName, String> getOtherAttributes() {
        return otherAttributes;
    }

}

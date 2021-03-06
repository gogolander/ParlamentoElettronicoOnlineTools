//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.02.10 at 10:02:26 PM CET 
//


package ietf.params.xml.ns.keyprov.pskc;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for KeyPackageType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="KeyPackageType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DeviceInfo" type="{urn:ietf:params:xml:ns:keyprov:pskc}DeviceInfoType" minOccurs="0"/>
 *         &lt;element name="CryptoModuleInfo" type="{urn:ietf:params:xml:ns:keyprov:pskc}CryptoModuleInfoType" minOccurs="0"/>
 *         &lt;element name="Key" type="{urn:ietf:params:xml:ns:keyprov:pskc}KeyType" minOccurs="0"/>
 *         &lt;element name="Extensions" type="{urn:ietf:params:xml:ns:keyprov:pskc}ExtensionsType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KeyPackageType", propOrder = {
    "deviceInfo",
    "cryptoModuleInfo",
    "key",
    "extensions"
})
public class KeyPackageType {

    @XmlElement(name = "DeviceInfo")
    protected DeviceInfoType deviceInfo;
    @XmlElement(name = "CryptoModuleInfo")
    protected CryptoModuleInfoType cryptoModuleInfo;
    @XmlElement(name = "Key")
    protected KeyType key;
    @XmlElement(name = "Extensions")
    protected List<ExtensionsType> extensions;

    /**
     * Gets the value of the deviceInfo property.
     * 
     * @return
     *     possible object is
     *     {@link DeviceInfoType }
     *     
     */
    public DeviceInfoType getDeviceInfo() {
        return deviceInfo;
    }

    /**
     * Sets the value of the deviceInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceInfoType }
     *     
     */
    public void setDeviceInfo(DeviceInfoType value) {
        this.deviceInfo = value;
    }

    /**
     * Gets the value of the cryptoModuleInfo property.
     * 
     * @return
     *     possible object is
     *     {@link CryptoModuleInfoType }
     *     
     */
    public CryptoModuleInfoType getCryptoModuleInfo() {
        return cryptoModuleInfo;
    }

    /**
     * Sets the value of the cryptoModuleInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CryptoModuleInfoType }
     *     
     */
    public void setCryptoModuleInfo(CryptoModuleInfoType value) {
        this.cryptoModuleInfo = value;
    }

    /**
     * Gets the value of the key property.
     * 
     * @return
     *     possible object is
     *     {@link KeyType }
     *     
     */
    public KeyType getKey() {
        return key;
    }

    /**
     * Sets the value of the key property.
     * 
     * @param value
     *     allowed object is
     *     {@link KeyType }
     *     
     */
    public void setKey(KeyType value) {
        this.key = value;
    }

    /**
     * Gets the value of the extensions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the extensions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExtensions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExtensionsType }
     * 
     * 
     */
    public List<ExtensionsType> getExtensions() {
        if (extensions == null) {
            extensions = new ArrayList<ExtensionsType>();
        }
        return this.extensions;
    }

}

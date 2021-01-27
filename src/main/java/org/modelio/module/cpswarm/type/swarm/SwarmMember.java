//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2019.12.09 at 02:40:53 PM CET
//
package org.modelio.module.cpswarm.type.swarm;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;

/**
 * <p>Java class for SwarmMember complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SwarmMember">
 * &lt;simpleContent>
 * &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 * &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 * &lt;attribute name="launchFile" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 * &lt;attribute name="number" type="{http://www.w3.org/2001/XMLSchema}integer" default="1" />
 * &lt;/extension>
 * &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SwarmMember", propOrder = {
    "value"
})
public class SwarmMember {
    @XmlValue
    protected String value;

    @XmlAttribute(name = "name")
    protected String name;

    @XmlAttribute(name = "launchFile", required = true)
    protected String launchFile;

    @XmlAttribute(name = "number")
    protected BigInteger number;

    /**
     * Gets the value of the value property.
     * @return
     * possible object is
     * {@link String }
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value allowed object is
     * {@link String }
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the name property.
     * @return
     * possible object is
     * {@link String }
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value allowed object is
     * {@link String }
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the launchFile property.
     * @return
     * possible object is
     * {@link String }
     */
    public String getLaunchFile() {
        return launchFile;
    }

    /**
     * Sets the value of the launchFile property.
     * 
     * @param value allowed object is
     * {@link String }
     */
    public void setLaunchFile(String value) {
        this.launchFile = value;
    }

    /**
     * Gets the value of the number property.
     * @return
     * possible object is
     * {@link BigInteger }
     */
    public BigInteger getNumber() {
        if (number == null) {
            return new BigInteger("1");
        } else {
            return number;
        }
    }

    /**
     * Sets the value of the number property.
     * 
     * @param value allowed object is
     * {@link BigInteger }
     */
    public void setNumber(BigInteger value) {
        this.number = value;
    }

}

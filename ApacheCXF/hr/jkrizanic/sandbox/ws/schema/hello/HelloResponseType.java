
package hr.jkrizanic.sandbox.ws.schema.hello;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HelloResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HelloResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="helloResponse" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HelloResponseType", propOrder = {
    "helloResponse"
})
public class HelloResponseType {

    @XmlElement(required = true)
    protected String helloResponse;

    /**
     * Gets the value of the helloResponse property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHelloResponse() {
        return helloResponse;
    }

    /**
     * Sets the value of the helloResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHelloResponse(String value) {
        this.helloResponse = value;
    }

}

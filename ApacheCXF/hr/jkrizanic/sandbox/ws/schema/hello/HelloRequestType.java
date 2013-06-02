
package hr.jkrizanic.sandbox.ws.schema.hello;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HelloRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HelloRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="helloRequest" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HelloRequestType", propOrder = {
    "helloRequest"
})
public class HelloRequestType {

    @XmlElement(required = true)
    protected String helloRequest;

    /**
     * Gets the value of the helloRequest property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHelloRequest() {
        return helloRequest;
    }

    /**
     * Sets the value of the helloRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHelloRequest(String value) {
        this.helloRequest = value;
    }

}


package hr.jkrizanic.sandbox.ws.schema.hello;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the hr.jkrizanic.sandbox.ws.schema.hello package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _HelloResponseElement_QNAME = new QName("http://ws.sandbox.jkrizanic.hr/schema/Hello/", "HelloResponseElement");
    private final static QName _HelloRequestElement_QNAME = new QName("http://ws.sandbox.jkrizanic.hr/schema/Hello/", "HelloRequestElement");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: hr.jkrizanic.sandbox.ws.schema.hello
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link HelloResponseType }
     * 
     */
    public HelloResponseType createHelloResponseType() {
        return new HelloResponseType();
    }

    /**
     * Create an instance of {@link HelloRequestType }
     * 
     */
    public HelloRequestType createHelloRequestType() {
        return new HelloRequestType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.sandbox.jkrizanic.hr/schema/Hello/", name = "HelloResponseElement")
    public JAXBElement<HelloResponseType> createHelloResponseElement(HelloResponseType value) {
        return new JAXBElement<HelloResponseType>(_HelloResponseElement_QNAME, HelloResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.sandbox.jkrizanic.hr/schema/Hello/", name = "HelloRequestElement")
    public JAXBElement<HelloRequestType> createHelloRequestElement(HelloRequestType value) {
        return new JAXBElement<HelloRequestType>(_HelloRequestElement_QNAME, HelloRequestType.class, null, value);
    }

}

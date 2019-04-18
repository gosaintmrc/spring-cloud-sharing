
package com.gosiant.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.gosiant.service package. 
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

    private final static QName _Add_QNAME = new QName("http://service.gosiant.com/", "add");
    private final static QName _AddResponse_QNAME = new QName("http://service.gosiant.com/", "addResponse");
    private final static QName _MultiResponse_QNAME = new QName("http://service.gosiant.com/", "multiResponse");
    private final static QName _Multi_QNAME = new QName("http://service.gosiant.com/", "multi");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.gosiant.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Add }
     * 
     */
    public Add createAdd() {
        return new Add();
    }

    /**
     * Create an instance of {@link AddResponse }
     * 
     */
    public AddResponse createAddResponse() {
        return new AddResponse();
    }

    /**
     * Create an instance of {@link MultiResponse }
     * 
     */
    public MultiResponse createMultiResponse() {
        return new MultiResponse();
    }

    /**
     * Create an instance of {@link Multi }
     * 
     */
    public Multi createMulti() {
        return new Multi();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Add }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.gosiant.com/", name = "add")
    public JAXBElement<Add> createAdd(Add value) {
        return new JAXBElement<Add>(_Add_QNAME, Add.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.gosiant.com/", name = "addResponse")
    public JAXBElement<AddResponse> createAddResponse(AddResponse value) {
        return new JAXBElement<AddResponse>(_AddResponse_QNAME, AddResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MultiResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.gosiant.com/", name = "multiResponse")
    public JAXBElement<MultiResponse> createMultiResponse(MultiResponse value) {
        return new JAXBElement<MultiResponse>(_MultiResponse_QNAME, MultiResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Multi }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.gosiant.com/", name = "multi")
    public JAXBElement<Multi> createMulti(Multi value) {
        return new JAXBElement<Multi>(_Multi_QNAME, Multi.class, null, value);
    }

}

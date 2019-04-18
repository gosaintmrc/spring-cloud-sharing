
package com.gosiant.service.impl;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;
import com.gosiant.service.ObjectFactory;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "Calculator", targetNamespace = "http://service.gosiant.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Calculator {


    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "multi", targetNamespace = "http://service.gosiant.com/", className = "com.gosiant.service.Multi")
    @ResponseWrapper(localName = "multiResponse", targetNamespace = "http://service.gosiant.com/", className = "com.gosiant.service.MultiResponse")
    @Action(input = "http://service.gosiant.com/Calculator/multiRequest", output = "http://service.gosiant.com/Calculator/multiResponse")
    public int multi(
            @WebParam(name = "arg0", targetNamespace = "")
                    int arg0,
            @WebParam(name = "arg1", targetNamespace = "")
                    int arg1);

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "add", targetNamespace = "http://service.gosiant.com/", className = "com.gosiant.service.Add")
    @ResponseWrapper(localName = "addResponse", targetNamespace = "http://service.gosiant.com/", className = "com.gosiant.service.AddResponse")
    @Action(input = "http://service.gosiant.com/Calculator/addRequest", output = "http://service.gosiant.com/Calculator/addResponse")
    public int add(
            @WebParam(name = "arg0", targetNamespace = "")
                    int arg0,
            @WebParam(name = "arg1", targetNamespace = "")
                    int arg1);

}

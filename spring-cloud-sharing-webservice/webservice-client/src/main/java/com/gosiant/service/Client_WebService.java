package com.gosiant.service;

import com.gosiant.service.impl.Calculator;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.URL;

public class Client_WebService {

    public static void main(String[] args) throws Exception{
        // nameSpace这里需要包名倒写
        QName qName=new QName("http://impl.service.gosiant.com/",
                "CalculatorImplService");
        URL url = new URL("http://localhost:8088/calculator?wsdl");
        Service service=Service.create(url,qName);
        Calculator calculator = service.getPort(Calculator.class);
        System.out.println(calculator.add(3,9));
        System.out.println(calculator.multi(3,9));
    }
}

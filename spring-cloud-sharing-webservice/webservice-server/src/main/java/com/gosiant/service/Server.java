package com.gosiant.service;

import com.gosiant.service.impl.CalculatorImpl;

import javax.xml.ws.Endpoint;

public class Server {
    public static void main(String[] args) {
        Endpoint.publish("http://localhost:8088/calculator", new CalculatorImpl());
        //http://localhost:8088/calculator?wsdl
    }
}
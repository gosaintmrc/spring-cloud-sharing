package com.gosiant.service.impl;

import com.gosiant.service.Calculator;

import javax.jws.WebService;

@WebService(endpointInterface = "com.gosiant.service.Calculator")
public class CalculatorImpl implements Calculator {

    public int add(int a, int b) {
        return a+b;
    }


    public int multi(int a, int b) {
        return a*b;
    }

}
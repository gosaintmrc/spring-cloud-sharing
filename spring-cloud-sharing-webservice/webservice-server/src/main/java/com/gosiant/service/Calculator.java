package com.gosiant.service;

import javax.jws.WebService;

@WebService
public interface Calculator {
    
    int add(int a, int b);
    
    int multi(int a, int b);
}
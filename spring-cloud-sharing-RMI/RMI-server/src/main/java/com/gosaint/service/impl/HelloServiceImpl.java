package com.gosaint.service.impl;

import com.gosaint.service.HelloService;

import java.rmi.RemoteException;

public class HelloServiceImpl implements HelloService {

    public String sayHello(String str) throws RemoteException {
        return str+"RMI";
    }
}

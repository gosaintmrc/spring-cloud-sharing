package com.gosaint.service.impl;

import com.gosaint.service.HelloService;

import java.rmi.RemoteException;

public class HelloServiceImpl implements HelloService {

    public void sayHello(String str) throws RemoteException {
        System.out.println(str+"RMI");
    }
}

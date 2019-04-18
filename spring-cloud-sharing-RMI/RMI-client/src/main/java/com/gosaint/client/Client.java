package com.gosaint.client;

import com.gosaint.service.HelloService;
import com.sun.security.ntlm.Server;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Client {

    public static void main(String[] args) throws RemoteException, NotBoundException {
        Registry registry = LocateRegistry.getRegistry("localhost", 1099);
        HelloService helloService = (HelloService) registry.lookup("helloService");
        String response = helloService.sayHello("Hello!");
        System.out.println("客户端获取接口返回值---->"+response);
    }
}

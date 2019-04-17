package com.gosaint.client;

import com.gosaint.service.HelloService;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Client {

    public static void main(String[] args) throws RemoteException, NotBoundException {

        //在客户端加载策略文件
        System.setSecurityManager(new SecurityManager());
        Registry registry = LocateRegistry.getRegistry("192.168.31.42", 1099);
        HelloService helloService = (HelloService)registry.lookup("helloService");
        helloService.sayHello("Hello!");
    }
}

package com.gosaint.service;

import com.gosaint.service.impl.HelloServiceImpl;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class Main {

    public static void main(String[] args) throws RemoteException, InterruptedException {
        int port = 2019;
        HelloService helloService=new HelloServiceImpl();
        UnicastRemoteObject.exportObject(helloService,port);
        Registry registry = LocateRegistry.createRegistry(1099);
        registry.rebind("helloService", helloService);
        System.out.println("服务开启");

    }
}

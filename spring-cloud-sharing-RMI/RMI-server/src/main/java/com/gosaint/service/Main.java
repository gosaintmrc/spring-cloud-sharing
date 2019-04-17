package com.gosaint.service;

import com.gosaint.service.impl.HelloServiceImpl;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class Main {

    public static void main(String[] args) throws RemoteException {

        System.setSecurityManager(new SecurityManager());
        // 创建本机 1099 端口上的RMI registry
        Registry registry = LocateRegistry.createRegistry(1099);
        HelloServiceImpl helloServiceImpl=new HelloServiceImpl();
        HelloService helloService =
                (HelloService) UnicastRemoteObject.exportObject(helloServiceImpl, 1099);
        registry.rebind("helloService", helloService);
        System.out.println("server is ready");
    }
}

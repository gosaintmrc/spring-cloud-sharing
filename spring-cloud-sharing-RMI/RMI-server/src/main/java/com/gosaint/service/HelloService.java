package com.gosaint.service;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface HelloService extends Remote {

    String sayHello(String str) throws RemoteException;
}

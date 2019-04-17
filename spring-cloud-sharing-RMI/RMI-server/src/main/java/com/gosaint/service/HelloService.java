package com.gosaint.service;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface HelloService extends Remote {

    void sayHello(String str) throws RemoteException;
}

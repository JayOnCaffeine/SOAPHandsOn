/**
 * Games.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.olympics;

public interface Games extends java.rmi.Remote {
    public java.lang.String getGameList() throws java.rmi.RemoteException;
    public java.lang.String getPlayerDetails(java.lang.String gameName) throws java.rmi.RemoteException;
    public java.lang.String getGameInfo(java.lang.String gameName) throws java.rmi.RemoteException;
}

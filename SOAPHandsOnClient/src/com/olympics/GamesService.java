/**
 * GamesService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.olympics;

public interface GamesService extends javax.xml.rpc.Service {
    public java.lang.String getGamesAddress();

    public com.olympics.Games getGames() throws javax.xml.rpc.ServiceException;

    public com.olympics.Games getGames(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}

/**
 * GamesServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.olympics;

public class GamesServiceLocator extends org.apache.axis.client.Service implements com.olympics.GamesService {

    public GamesServiceLocator() {
    }


    public GamesServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public GamesServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for Games
    private java.lang.String Games_address = "http://localhost:8080/SOAPHandsOn/services/Games";

    public java.lang.String getGamesAddress() {
        return Games_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String GamesWSDDServiceName = "Games";

    public java.lang.String getGamesWSDDServiceName() {
        return GamesWSDDServiceName;
    }

    public void setGamesWSDDServiceName(java.lang.String name) {
        GamesWSDDServiceName = name;
    }

    public com.olympics.Games getGames() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(Games_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getGames(endpoint);
    }

    public com.olympics.Games getGames(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.olympics.GamesSoapBindingStub _stub = new com.olympics.GamesSoapBindingStub(portAddress, this);
            _stub.setPortName(getGamesWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setGamesEndpointAddress(java.lang.String address) {
        Games_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.olympics.Games.class.isAssignableFrom(serviceEndpointInterface)) {
                com.olympics.GamesSoapBindingStub _stub = new com.olympics.GamesSoapBindingStub(new java.net.URL(Games_address), this);
                _stub.setPortName(getGamesWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("Games".equals(inputPortName)) {
            return getGames();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://olympics.com", "GamesService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://olympics.com", "Games"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("Games".equals(portName)) {
            setGamesEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}

/**
 * SaidServicio_ServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.frida.www.Said;

public class SaidServicio_ServiceLocator extends org.apache.axis.client.Service implements com.frida.www.Said.SaidServicio_Service {

    public SaidServicio_ServiceLocator() {
    }


    public SaidServicio_ServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public SaidServicio_ServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for SaidServicioSoap11
    private java.lang.String SaidServicioSoap11_address = "http://10.105.210.198:8080/SaidInterface/endpoints";

    public java.lang.String getSaidServicioSoap11Address() {
        return SaidServicioSoap11_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String SaidServicioSoap11WSDDServiceName = "SaidServicioSoap11";

    public java.lang.String getSaidServicioSoap11WSDDServiceName() {
        return SaidServicioSoap11WSDDServiceName;
    }

    public void setSaidServicioSoap11WSDDServiceName(java.lang.String name) {
        SaidServicioSoap11WSDDServiceName = name;
    }

    public com.frida.www.Said.SaidServicio_PortType getSaidServicioSoap11() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(SaidServicioSoap11_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getSaidServicioSoap11(endpoint);
    }

    public com.frida.www.Said.SaidServicio_PortType getSaidServicioSoap11(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.frida.www.Said.SaidServicioSoap11Stub _stub = new com.frida.www.Said.SaidServicioSoap11Stub(portAddress, this);
            _stub.setPortName(getSaidServicioSoap11WSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setSaidServicioSoap11EndpointAddress(java.lang.String address) {
        SaidServicioSoap11_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.frida.www.Said.SaidServicio_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                com.frida.www.Said.SaidServicioSoap11Stub _stub = new com.frida.www.Said.SaidServicioSoap11Stub(new java.net.URL(SaidServicioSoap11_address), this);
                _stub.setPortName(getSaidServicioSoap11WSDDServiceName());
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
        if ("SaidServicioSoap11".equals(inputPortName)) {
            return getSaidServicioSoap11();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://www.frida.com/Said", "SaidServicio");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://www.frida.com/Said", "SaidServicioSoap11"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("SaidServicioSoap11".equals(portName)) {
            setSaidServicioSoap11EndpointAddress(address);
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

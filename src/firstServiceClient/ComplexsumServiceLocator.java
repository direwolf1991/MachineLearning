/**
 * ComplexsumServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package firstServiceClient;

public class ComplexsumServiceLocator extends org.apache.axis.client.Service implements firstServiceClient.ComplexsumService {

    public ComplexsumServiceLocator() {
    }


    public ComplexsumServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ComplexsumServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for complexService
    private java.lang.String complexService_address = "http://localhost:8080/axis/services/complexService";

    public java.lang.String getcomplexServiceAddress() {
        return complexService_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String complexServiceWSDDServiceName = "complexService";

    public java.lang.String getcomplexServiceWSDDServiceName() {
        return complexServiceWSDDServiceName;
    }

    public void setcomplexServiceWSDDServiceName(java.lang.String name) {
        complexServiceWSDDServiceName = name;
    }

    public firstServiceClient.Complexsum getcomplexService() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(complexService_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getcomplexService(endpoint);
    }

    public firstServiceClient.Complexsum getcomplexService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            firstServiceClient.ComplexsumBindingStub _stub = new firstServiceClient.ComplexsumBindingStub(portAddress, this);
            _stub.setPortName(getcomplexServiceWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setcomplexServiceEndpointAddress(java.lang.String address) {
        complexService_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (firstServiceClient.Complexsum.class.isAssignableFrom(serviceEndpointInterface)) {
                firstServiceClient.ComplexsumBindingStub _stub = new firstServiceClient.ComplexsumBindingStub(new java.net.URL(complexService_address), this);
                _stub.setPortName(getcomplexServiceWSDDServiceName());
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
        if ("complexService".equals(inputPortName)) {
            return getcomplexService();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://localhost:8080/axis/services/complexService/", "complexsumService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://localhost:8080/axis/services/complexService/", "complexService"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("complexService".equals(portName)) {
            setcomplexServiceEndpointAddress(address);
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

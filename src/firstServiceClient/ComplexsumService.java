/**
 * ComplexsumService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package firstServiceClient;

public interface ComplexsumService extends javax.xml.rpc.Service {
    public java.lang.String getcomplexServiceAddress();

    public firstServiceClient.Complexsum getcomplexService() throws javax.xml.rpc.ServiceException;

    public firstServiceClient.Complexsum getcomplexService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}

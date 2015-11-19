/**
 * ComplexsumServiceTestCase.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package firstServiceClient;

public class ComplexsumServiceTestCase extends junit.framework.TestCase {
    public ComplexsumServiceTestCase(java.lang.String name) {
        super(name);
    }

    public void testcomplexServiceWSDL() throws Exception {
        javax.xml.rpc.ServiceFactory serviceFactory = javax.xml.rpc.ServiceFactory.newInstance();
        java.net.URL url = new java.net.URL(new firstServiceClient.ComplexsumServiceLocator().getcomplexServiceAddress() + "?WSDL");
        javax.xml.rpc.Service service = serviceFactory.createService(url, new firstServiceClient.ComplexsumServiceLocator().getServiceName());
        assertTrue(service != null);
    }

    public void test1complexServiceComplexsum() throws Exception {
        firstServiceClient.ComplexsumBindingStub binding;
        try {
            binding = (firstServiceClient.ComplexsumBindingStub)
                          new firstServiceClient.ComplexsumServiceLocator().getcomplexService();
        }
        catch (javax.xml.rpc.ServiceException jre) {
            if(jre.getLinkedCause()!=null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        firstServiceClient.Complex value = null;
        value = binding.complexsum(new firstServiceClient.Complex(), new firstServiceClient.Complex());
        // TBD - validate results
    }

}

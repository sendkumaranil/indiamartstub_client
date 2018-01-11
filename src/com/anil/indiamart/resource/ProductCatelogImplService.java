
package com.anil.indiamart.resource;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "ProductCatelogImplService", targetNamespace = "http://resource.indiamart.anil.com/", wsdlLocation = "http://localhost:8080//indiamart/ProductCatelogImplService?wsdl")
public class ProductCatelogImplService
    extends Service
{

    private final static URL PRODUCTCATELOGIMPLSERVICE_WSDL_LOCATION;
    private final static WebServiceException PRODUCTCATELOGIMPLSERVICE_EXCEPTION;
    private final static QName PRODUCTCATELOGIMPLSERVICE_QNAME = new QName("http://resource.indiamart.anil.com/", "ProductCatelogImplService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080//indiamart/ProductCatelogImplService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        PRODUCTCATELOGIMPLSERVICE_WSDL_LOCATION = url;
        PRODUCTCATELOGIMPLSERVICE_EXCEPTION = e;
    }

    public ProductCatelogImplService() {
        super(__getWsdlLocation(), PRODUCTCATELOGIMPLSERVICE_QNAME);
    }

    public ProductCatelogImplService(WebServiceFeature... features) {
        super(__getWsdlLocation(), PRODUCTCATELOGIMPLSERVICE_QNAME, features);
    }

    public ProductCatelogImplService(URL wsdlLocation) {
        super(wsdlLocation, PRODUCTCATELOGIMPLSERVICE_QNAME);
    }

    public ProductCatelogImplService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, PRODUCTCATELOGIMPLSERVICE_QNAME, features);
    }

    public ProductCatelogImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ProductCatelogImplService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns ProductCatelogImpl
     */
    @WebEndpoint(name = "ProductCatelogImplPort")
    public ProductCatelogImpl getProductCatelogImplPort() {
        return super.getPort(new QName("http://resource.indiamart.anil.com/", "ProductCatelogImplPort"), ProductCatelogImpl.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ProductCatelogImpl
     */
    @WebEndpoint(name = "ProductCatelogImplPort")
    public ProductCatelogImpl getProductCatelogImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://resource.indiamart.anil.com/", "ProductCatelogImplPort"), ProductCatelogImpl.class, features);
    }

    private static URL __getWsdlLocation() {
        if (PRODUCTCATELOGIMPLSERVICE_EXCEPTION!= null) {
            throw PRODUCTCATELOGIMPLSERVICE_EXCEPTION;
        }
        return PRODUCTCATELOGIMPLSERVICE_WSDL_LOCATION;
    }

}

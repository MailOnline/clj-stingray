/**
 * CatalogAuthenticatorsBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.zeus.soap.zxtm._1_0;

public class CatalogAuthenticatorsBindingStub extends org.apache.axis.client.Stub implements com.zeus.soap.zxtm._1_0.CatalogAuthenticatorsPort {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[49];
        _initOperationDesc1();
        _initOperationDesc2();
        _initOperationDesc3();
        _initOperationDesc4();
        _initOperationDesc5();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("addAuthenticator");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "class_names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/Catalog/Authenticators/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.LicenseError",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "LicenseError"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/Catalog/Authenticators/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.DeploymentError",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "DeploymentError"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/Catalog/Authenticators/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidObjectName",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidObjectName"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/Catalog/Authenticators/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.ObjectAlreadyExists",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "ObjectAlreadyExists"), 
                      true
                     ));
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("addLDAPSearchAttr");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "values"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArrayArray"), java.lang.String[][].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/Catalog/Authenticators/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.LicenseError",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "LicenseError"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/Catalog/Authenticators/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidInput",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidInput"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/Catalog/Authenticators/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.DeploymentError",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "DeploymentError"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/Catalog/Authenticators/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.ObjectDoesNotExist",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "ObjectDoesNotExist"), 
                      true
                     ));
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("addLDAPSearchAttrByLocation");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "location"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "values"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArrayArray"), java.lang.String[][].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/Catalog/Authenticators/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.LicenseError",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "LicenseError"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/Catalog/Authenticators/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidInput",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidInput"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/Catalog/Authenticators/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.DeploymentError",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "DeploymentError"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/Catalog/Authenticators/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.ObjectDoesNotExist",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "ObjectDoesNotExist"), 
                      true
                     ));
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("copyAuthenticator");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "class_names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "new_names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/Catalog/Authenticators/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.LicenseError",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "LicenseError"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/Catalog/Authenticators/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.DeploymentError",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "DeploymentError"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/Catalog/Authenticators/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.ObjectDoesNotExist",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "ObjectDoesNotExist"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/Catalog/Authenticators/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidObjectName",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidObjectName"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/Catalog/Authenticators/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.ObjectAlreadyExists",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "ObjectAlreadyExists"), 
                      true
                     ));
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("deleteAuthenticator");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "class_names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/Catalog/Authenticators/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.LicenseError",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "LicenseError"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/Catalog/Authenticators/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.DeploymentError",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "DeploymentError"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/Catalog/Authenticators/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.ObjectDoesNotExist",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "ObjectDoesNotExist"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/Catalog/Authenticators/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.ObjectInUse",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "ObjectInUse"), 
                      true
                     ));
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getAuthenticatorNames");
        oper.setReturnType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"));
        oper.setReturnClass(java.lang.String[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "class_names"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/Catalog/Authenticators/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.LicenseError",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "LicenseError"), 
                      true
                     ));
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getHost");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"));
        oper.setReturnClass(java.lang.String[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "values"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/Catalog/Authenticators/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.LicenseError",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "LicenseError"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/Catalog/Authenticators/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.ObjectDoesNotExist",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "ObjectDoesNotExist"), 
                      true
                     ));
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getHostByLocation");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "location"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"));
        oper.setReturnClass(java.lang.String[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "values"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/Catalog/Authenticators/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.LicenseError",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "LicenseError"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/Catalog/Authenticators/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.ObjectDoesNotExist",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "ObjectDoesNotExist"), 
                      true
                     ));
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getLDAPBindDN");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"));
        oper.setReturnClass(java.lang.String[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "values"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/Catalog/Authenticators/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.LicenseError",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "LicenseError"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/Catalog/Authenticators/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.ObjectDoesNotExist",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "ObjectDoesNotExist"), 
                      true
                     ));
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getLDAPBindDNByLocation");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "location"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"));
        oper.setReturnClass(java.lang.String[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "values"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/Catalog/Authenticators/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.LicenseError",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "LicenseError"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/Catalog/Authenticators/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.ObjectDoesNotExist",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "ObjectDoesNotExist"), 
                      true
                     ));
        _operations[9] = oper;

    }

    private static void _initOperationDesc2(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getLDAPFilter");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"));
        oper.setReturnClass(java.lang.String[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "values"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/Catalog/Authenticators/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.LicenseError",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "LicenseError"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/Catalog/Authenticators/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.ObjectDoesNotExist",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "ObjectDoesNotExist"), 
                      true
                     ));
        _operations[10] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getLDAPFilterBaseDN");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"));
        oper.setReturnClass(java.lang.String[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "values"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/Catalog/Authenticators/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.LicenseError",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "LicenseError"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/Catalog/Authenticators/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.ObjectDoesNotExist",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "ObjectDoesNotExist"), 
                      true
                     ));
        _operations[11] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getLDAPFilterBaseDNByLocation");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "location"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"));
        oper.setReturnClass(java.lang.String[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "values"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/Catalog/Authenticators/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.LicenseError",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "LicenseError"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/Catalog/Authenticators/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.ObjectDoesNotExist",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "ObjectDoesNotExist"), 
                      true
                     ));
        _operations[12] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getLDAPFilterByLocation");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "location"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"));
        oper.setReturnClass(java.lang.String[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "values"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/Catalog/Authenticators/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.LicenseError",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "LicenseError"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/Catalog/Authenticators/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.ObjectDoesNotExist",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "ObjectDoesNotExist"), 
                      true
                     ));
        _operations[13] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getLDAPSSLCertificate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"));
        oper.setReturnClass(java.lang.String[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "values"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/Catalog/Authenticators/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.LicenseError",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "LicenseError"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/Catalog/Authenticators/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.ObjectDoesNotExist",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "ObjectDoesNotExist"), 
                      true
                     ));
        _operations[14] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getLDAPSSLCertificateByLocation");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "location"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"));
        oper.setReturnClass(java.lang.String[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "values"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/Catalog/Authenticators/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.LicenseError",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "LicenseError"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/Catalog/Authenticators/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.ObjectDoesNotExist",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "ObjectDoesNotExist"), 
                      true
                     ));
        _operations[15] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getLDAPSSLEnabled");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "booleanArray"));
        oper.setReturnClass(boolean[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "values"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/Catalog/Authenticators/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.LicenseError",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "LicenseError"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/Catalog/Authenticators/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.ObjectDoesNotExist",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "ObjectDoesNotExist"), 
                      true
                     ));
        _operations[16] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getLDAPSSLEnabledByLocation");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "location"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "booleanArray"));
        oper.setReturnClass(boolean[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "values"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/Catalog/Authenticators/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.LicenseError",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "LicenseError"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/Catalog/Authenticators/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.ObjectDoesNotExist",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "ObjectDoesNotExist"), 
                      true
                     ));
        _operations[17] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getLDAPSSLType");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "Catalog.Authenticators.LDAPSSLTypeArray"));
        oper.setReturnClass(com.zeus.soap.zxtm._1_0.CatalogAuthenticatorsLDAPSSLType[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "values"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/Catalog/Authenticators/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.LicenseError",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "LicenseError"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/Catalog/Authenticators/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.ObjectDoesNotExist",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "ObjectDoesNotExist"), 
                      true
                     ));
        _operations[18] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getLDAPSSLTypeByLocation");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "location"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "Catalog.Authenticators.LDAPSSLTypeArray"));
        oper.setReturnClass(com.zeus.soap.zxtm._1_0.CatalogAuthenticatorsLDAPSSLType[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "values"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/Catalog/Authenticators/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.LicenseError",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "LicenseError"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/Catalog/Authenticators/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.ObjectDoesNotExist",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "ObjectDoesNotExist"), 
                      true
                     ));
        _operations[19] = oper;

    }

    private static void _initOperationDesc3(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getLDAPSearchAttr");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArrayArray"));
        oper.setReturnClass(java.lang.String[][].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "values"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/Catalog/Authenticators/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.LicenseError",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "LicenseError"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/Catalog/Authenticators/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.ObjectDoesNotExist",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "ObjectDoesNotExist"), 
                      true
                     ));
        _operations[20] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getLDAPSearchAttrByLocation");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "location"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArrayArray"));
        oper.setReturnClass(java.lang.String[][].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "values"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/Catalog/Authenticators/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.LicenseError",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "LicenseError"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/Catalog/Authenticators/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.ObjectDoesNotExist",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "ObjectDoesNotExist"), 
                      true
                     ));
        _operations[21] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getNote");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"));
        oper.setReturnClass(java.lang.String[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "values"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/Catalog/Authenticators/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.LicenseError",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "LicenseError"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/Catalog/Authenticators/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.ObjectDoesNotExist",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "ObjectDoesNotExist"), 
                      true
                     ));
        _operations[22] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getPort");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "unsignedIntArray"));
        oper.setReturnClass(org.apache.axis.types.UnsignedInt[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "values"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/Catalog/Authenticators/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.LicenseError",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "LicenseError"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/Catalog/Authenticators/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.ObjectDoesNotExist",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "ObjectDoesNotExist"), 
                      true
                     ));
        _operations[23] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getPortByLocation");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "location"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "unsignedIntArray"));
        oper.setReturnClass(org.apache.axis.types.UnsignedInt[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "values"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/Catalog/Authenticators/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.LicenseError",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "LicenseError"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/Catalog/Authenticators/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.ObjectDoesNotExist",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "ObjectDoesNotExist"), 
                      true
                     ));
        _operations[24] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("removeLDAPSearchAttr");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "values"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArrayArray"), java.lang.String[][].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/Catalog/Authenticators/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.LicenseError",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "LicenseError"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/Catalog/Authenticators/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidInput",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidInput"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/Catalog/Authenticators/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.DeploymentError",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "DeploymentError"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/Catalog/Authenticators/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.ObjectDoesNotExist",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "ObjectDoesNotExist"), 
                      true
                     ));
        _operations[25] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("removeLDAPSearchAttrByLocation");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "location"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "values"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArrayArray"), java.lang.String[][].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/Catalog/Authenticators/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.LicenseError",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "LicenseError"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/Catalog/Authenticators/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidInput",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidInput"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/Catalog/Authenticators/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.DeploymentError",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "DeploymentError"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/Catalog/Authenticators/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.ObjectDoesNotExist",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "ObjectDoesNotExist"), 
                      true
                     ));
        _operations[26] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("renameAuthenticator");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "class_names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "new_names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/Catalog/Authenticators/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.LicenseError",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "LicenseError"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/Catalog/Authenticators/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidOperation",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidOperation"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/Catalog/Authenticators/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.DeploymentError",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "DeploymentError"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/Catalog/Authenticators/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.ObjectDoesNotExist",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "ObjectDoesNotExist"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/Catalog/Authenticators/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidObjectName",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidObjectName"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/Catalog/Authenticators/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.ObjectAlreadyExists",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "ObjectAlreadyExists"), 
                      true
                     ));
        _operations[27] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("setHost");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "values"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/Catalog/Authenticators/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.LicenseError",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "LicenseError"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/Catalog/Authenticators/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidInput",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidInput"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/Catalog/Authenticators/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.DeploymentError",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "DeploymentError"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/Catalog/Authenticators/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.ObjectDoesNotExist",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "ObjectDoesNotExist"), 
                      true
                     ));
        _operations[28] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("setHostByLocation");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "location"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "values"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/Catalog/Authenticators/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.LicenseError",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "LicenseError"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/Catalog/Authenticators/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidInput",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidInput"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/Catalog/Authenticators/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.DeploymentError",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "DeploymentError"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/Catalog/Authenticators/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.ObjectDoesNotExist",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "ObjectDoesNotExist"), 
                      true
                     ));
        _operations[29] = oper;

    }

    private static void _initOperationDesc4(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("setLDAPBindDN");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "values"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/Catalog/Authenticators/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.LicenseError",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "LicenseError"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/Catalog/Authenticators/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidInput",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidInput"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/Catalog/Authenticators/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.DeploymentError",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "DeploymentError"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/Catalog/Authenticators/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.ObjectDoesNotExist",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "ObjectDoesNotExist"), 
                      true
                     ));
        _operations[30] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("setLDAPBindDNByLocation");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "location"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "values"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/Catalog/Authenticators/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.LicenseError",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "LicenseError"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/Catalog/Authenticators/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidInput",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidInput"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/Catalog/Authenticators/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.DeploymentError",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "DeploymentError"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/Catalog/Authenticators/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.ObjectDoesNotExist",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "ObjectDoesNotExist"), 
                      true
                     ));
        _operations[31] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("setLDAPBindPassword");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "values"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/Catalog/Authenticators/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.LicenseError",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "LicenseError"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/Catalog/Authenticators/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidInput",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidInput"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/Catalog/Authenticators/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.DeploymentError",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "DeploymentError"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/Catalog/Authenticators/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.ObjectDoesNotExist",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "ObjectDoesNotExist"), 
                      true
                     ));
        _operations[32] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("setLDAPBindPasswordByLocation");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "location"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "values"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/Catalog/Authenticators/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.LicenseError",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "LicenseError"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/Catalog/Authenticators/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidInput",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidInput"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/Catalog/Authenticators/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.DeploymentError",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "DeploymentError"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/Catalog/Authenticators/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.ObjectDoesNotExist",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "ObjectDoesNotExist"), 
                      true
                     ));
        _operations[33] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("setLDAPFilter");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "values"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/Catalog/Authenticators/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.LicenseError",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "LicenseError"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/Catalog/Authenticators/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidInput",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidInput"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/Catalog/Authenticators/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.DeploymentError",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "DeploymentError"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/Catalog/Authenticators/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.ObjectDoesNotExist",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "ObjectDoesNotExist"), 
                      true
                     ));
        _operations[34] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("setLDAPFilterBaseDN");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "values"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/Catalog/Authenticators/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.LicenseError",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "LicenseError"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/Catalog/Authenticators/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidInput",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidInput"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/Catalog/Authenticators/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.DeploymentError",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "DeploymentError"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/Catalog/Authenticators/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.ObjectDoesNotExist",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "ObjectDoesNotExist"), 
                      true
                     ));
        _operations[35] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("setLDAPFilterBaseDNByLocation");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "location"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "values"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/Catalog/Authenticators/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.LicenseError",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "LicenseError"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/Catalog/Authenticators/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidInput",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidInput"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/Catalog/Authenticators/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.DeploymentError",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "DeploymentError"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/Catalog/Authenticators/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.ObjectDoesNotExist",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "ObjectDoesNotExist"), 
                      true
                     ));
        _operations[36] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("setLDAPFilterByLocation");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "location"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "values"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/Catalog/Authenticators/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.LicenseError",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "LicenseError"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/Catalog/Authenticators/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidInput",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidInput"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/Catalog/Authenticators/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.DeploymentError",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "DeploymentError"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/Catalog/Authenticators/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.ObjectDoesNotExist",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "ObjectDoesNotExist"), 
                      true
                     ));
        _operations[37] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("setLDAPSSLCertificate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "values"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/Catalog/Authenticators/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.LicenseError",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "LicenseError"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/Catalog/Authenticators/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidInput",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidInput"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/Catalog/Authenticators/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.DeploymentError",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "DeploymentError"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/Catalog/Authenticators/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.ObjectDoesNotExist",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "ObjectDoesNotExist"), 
                      true
                     ));
        _operations[38] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("setLDAPSSLCertificateByLocation");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "location"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "values"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/Catalog/Authenticators/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.LicenseError",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "LicenseError"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/Catalog/Authenticators/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidInput",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidInput"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/Catalog/Authenticators/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.DeploymentError",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "DeploymentError"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/Catalog/Authenticators/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.ObjectDoesNotExist",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "ObjectDoesNotExist"), 
                      true
                     ));
        _operations[39] = oper;

    }

    private static void _initOperationDesc5(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("setLDAPSSLEnabled");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "values"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "booleanArray"), boolean[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/Catalog/Authenticators/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.LicenseError",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "LicenseError"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/Catalog/Authenticators/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidInput",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidInput"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/Catalog/Authenticators/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.DeploymentError",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "DeploymentError"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/Catalog/Authenticators/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.ObjectDoesNotExist",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "ObjectDoesNotExist"), 
                      true
                     ));
        _operations[40] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("setLDAPSSLEnabledByLocation");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "location"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "values"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "booleanArray"), boolean[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/Catalog/Authenticators/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.LicenseError",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "LicenseError"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/Catalog/Authenticators/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidInput",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidInput"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/Catalog/Authenticators/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.DeploymentError",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "DeploymentError"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/Catalog/Authenticators/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.ObjectDoesNotExist",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "ObjectDoesNotExist"), 
                      true
                     ));
        _operations[41] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("setLDAPSSLType");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "values"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "Catalog.Authenticators.LDAPSSLTypeArray"), com.zeus.soap.zxtm._1_0.CatalogAuthenticatorsLDAPSSLType[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/Catalog/Authenticators/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.LicenseError",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "LicenseError"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/Catalog/Authenticators/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidInput",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidInput"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/Catalog/Authenticators/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.DeploymentError",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "DeploymentError"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/Catalog/Authenticators/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.ObjectDoesNotExist",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "ObjectDoesNotExist"), 
                      true
                     ));
        _operations[42] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("setLDAPSSLTypeByLocation");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "location"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "values"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "Catalog.Authenticators.LDAPSSLTypeArray"), com.zeus.soap.zxtm._1_0.CatalogAuthenticatorsLDAPSSLType[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/Catalog/Authenticators/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.LicenseError",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "LicenseError"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/Catalog/Authenticators/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidInput",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidInput"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/Catalog/Authenticators/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.DeploymentError",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "DeploymentError"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/Catalog/Authenticators/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.ObjectDoesNotExist",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "ObjectDoesNotExist"), 
                      true
                     ));
        _operations[43] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("setLDAPSearchAttr");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "values"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArrayArray"), java.lang.String[][].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/Catalog/Authenticators/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.LicenseError",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "LicenseError"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/Catalog/Authenticators/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidInput",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidInput"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/Catalog/Authenticators/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.DeploymentError",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "DeploymentError"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/Catalog/Authenticators/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.ObjectDoesNotExist",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "ObjectDoesNotExist"), 
                      true
                     ));
        _operations[44] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("setLDAPSearchAttrByLocation");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "location"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "values"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArrayArray"), java.lang.String[][].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/Catalog/Authenticators/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.LicenseError",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "LicenseError"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/Catalog/Authenticators/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidInput",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidInput"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/Catalog/Authenticators/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.DeploymentError",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "DeploymentError"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/Catalog/Authenticators/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.ObjectDoesNotExist",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "ObjectDoesNotExist"), 
                      true
                     ));
        _operations[45] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("setNote");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "values"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/Catalog/Authenticators/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.LicenseError",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "LicenseError"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/Catalog/Authenticators/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidInput",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidInput"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/Catalog/Authenticators/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.DeploymentError",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "DeploymentError"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/Catalog/Authenticators/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.ObjectDoesNotExist",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "ObjectDoesNotExist"), 
                      true
                     ));
        _operations[46] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("setPort");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "values"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "unsignedIntArray"), org.apache.axis.types.UnsignedInt[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/Catalog/Authenticators/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.LicenseError",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "LicenseError"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/Catalog/Authenticators/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidInput",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidInput"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/Catalog/Authenticators/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.DeploymentError",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "DeploymentError"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/Catalog/Authenticators/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.ObjectDoesNotExist",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "ObjectDoesNotExist"), 
                      true
                     ));
        _operations[47] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("setPortByLocation");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "location"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "values"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "unsignedIntArray"), org.apache.axis.types.UnsignedInt[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/Catalog/Authenticators/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.LicenseError",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "LicenseError"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/Catalog/Authenticators/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidInput",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidInput"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/Catalog/Authenticators/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.DeploymentError",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "DeploymentError"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/Catalog/Authenticators/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.ObjectDoesNotExist",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "ObjectDoesNotExist"), 
                      true
                     ));
        _operations[48] = oper;

    }

    public CatalogAuthenticatorsBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public CatalogAuthenticatorsBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public CatalogAuthenticatorsBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "booleanArray");
            cachedSerQNames.add(qName);
            cls = boolean[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "Catalog.Authenticators.LDAPSSLType");
            cachedSerQNames.add(qName);
            cls = com.zeus.soap.zxtm._1_0.CatalogAuthenticatorsLDAPSSLType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "Catalog.Authenticators.LDAPSSLTypeArray");
            cachedSerQNames.add(qName);
            cls = com.zeus.soap.zxtm._1_0.CatalogAuthenticatorsLDAPSSLType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "Catalog.Authenticators.LDAPSSLType");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "DeploymentError");
            cachedSerQNames.add(qName);
            cls = com.zeus.soap.zxtm._1_0.DeploymentError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidInput");
            cachedSerQNames.add(qName);
            cls = com.zeus.soap.zxtm._1_0.InvalidInput.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidObjectName");
            cachedSerQNames.add(qName);
            cls = com.zeus.soap.zxtm._1_0.InvalidObjectName.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidOperation");
            cachedSerQNames.add(qName);
            cls = com.zeus.soap.zxtm._1_0.InvalidOperation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "LicenseError");
            cachedSerQNames.add(qName);
            cls = com.zeus.soap.zxtm._1_0.LicenseError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "ObjectAlreadyExists");
            cachedSerQNames.add(qName);
            cls = com.zeus.soap.zxtm._1_0.ObjectAlreadyExists.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "ObjectDoesNotExist");
            cachedSerQNames.add(qName);
            cls = com.zeus.soap.zxtm._1_0.ObjectDoesNotExist.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "ObjectInUse");
            cachedSerQNames.add(qName);
            cls = com.zeus.soap.zxtm._1_0.ObjectInUse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArrayArray");
            cachedSerQNames.add(qName);
            cls = java.lang.String[][].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "unsignedIntArray");
            cachedSerQNames.add(qName);
            cls = org.apache.axis.types.UnsignedInt[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
                    _call.setEncodingStyle(org.apache.axis.Constants.URI_SOAP11_ENC);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }


    /**
     * Add new Authenticator classes.
     */
    public void addAuthenticator(java.lang.String[] class_names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.LicenseError, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.InvalidObjectName, com.zeus.soap.zxtm._1_0.ObjectAlreadyExists {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/Catalog/Authenticators/addAuthenticator");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/Catalog/Authenticators/", "addAuthenticator"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {class_names});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.LicenseError) {
              throw (com.zeus.soap.zxtm._1_0.LicenseError) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.DeploymentError) {
              throw (com.zeus.soap.zxtm._1_0.DeploymentError) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidObjectName) {
              throw (com.zeus.soap.zxtm._1_0.InvalidObjectName) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.ObjectAlreadyExists) {
              throw (com.zeus.soap.zxtm._1_0.ObjectAlreadyExists) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }


    /**
     * Add the attributes to return from the search.
     */
    public void addLDAPSearchAttr(java.lang.String[] names, java.lang.String[][] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.LicenseError, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/Catalog/Authenticators/addLDAPSearchAttr");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/Catalog/Authenticators/", "addLDAPSearchAttr"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {names, values});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.LicenseError) {
              throw (com.zeus.soap.zxtm._1_0.LicenseError) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidInput) {
              throw (com.zeus.soap.zxtm._1_0.InvalidInput) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.DeploymentError) {
              throw (com.zeus.soap.zxtm._1_0.DeploymentError) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.ObjectDoesNotExist) {
              throw (com.zeus.soap.zxtm._1_0.ObjectDoesNotExist) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }


    /**
     * Add the attributes to return from the search. This is a location
     * specific function, any action will operate on the specified location.
     */
    public void addLDAPSearchAttrByLocation(java.lang.String location, java.lang.String[] names, java.lang.String[][] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.LicenseError, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/Catalog/Authenticators/addLDAPSearchAttrByLocation");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/Catalog/Authenticators/", "addLDAPSearchAttrByLocation"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {location, names, values});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.LicenseError) {
              throw (com.zeus.soap.zxtm._1_0.LicenseError) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidInput) {
              throw (com.zeus.soap.zxtm._1_0.InvalidInput) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.DeploymentError) {
              throw (com.zeus.soap.zxtm._1_0.DeploymentError) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.ObjectDoesNotExist) {
              throw (com.zeus.soap.zxtm._1_0.ObjectDoesNotExist) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }


    /**
     * Copy the named Authenticator classes.
     */
    public void copyAuthenticator(java.lang.String[] class_names, java.lang.String[] new_names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.LicenseError, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist, com.zeus.soap.zxtm._1_0.InvalidObjectName, com.zeus.soap.zxtm._1_0.ObjectAlreadyExists {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/Catalog/Authenticators/copyAuthenticator");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/Catalog/Authenticators/", "copyAuthenticator"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {class_names, new_names});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.LicenseError) {
              throw (com.zeus.soap.zxtm._1_0.LicenseError) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.DeploymentError) {
              throw (com.zeus.soap.zxtm._1_0.DeploymentError) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.ObjectDoesNotExist) {
              throw (com.zeus.soap.zxtm._1_0.ObjectDoesNotExist) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidObjectName) {
              throw (com.zeus.soap.zxtm._1_0.InvalidObjectName) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.ObjectAlreadyExists) {
              throw (com.zeus.soap.zxtm._1_0.ObjectAlreadyExists) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }


    /**
     * Delete the named Authenticator classes.
     */
    public void deleteAuthenticator(java.lang.String[] class_names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.LicenseError, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist, com.zeus.soap.zxtm._1_0.ObjectInUse {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/Catalog/Authenticators/deleteAuthenticator");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/Catalog/Authenticators/", "deleteAuthenticator"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {class_names});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.LicenseError) {
              throw (com.zeus.soap.zxtm._1_0.LicenseError) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.DeploymentError) {
              throw (com.zeus.soap.zxtm._1_0.DeploymentError) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.ObjectDoesNotExist) {
              throw (com.zeus.soap.zxtm._1_0.ObjectDoesNotExist) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.ObjectInUse) {
              throw (com.zeus.soap.zxtm._1_0.ObjectInUse) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }


    /**
     * Get the names of all the configured Authenticator classes.
     */
    public java.lang.String[] getAuthenticatorNames() throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.LicenseError {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/Catalog/Authenticators/getAuthenticatorNames");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/Catalog/Authenticators/", "getAuthenticatorNames"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String[]) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.LicenseError) {
              throw (com.zeus.soap.zxtm._1_0.LicenseError) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }


    /**
     * Get the hostname of the remote authenticator.
     */
    public java.lang.String[] getHost(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.LicenseError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/Catalog/Authenticators/getHost");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/Catalog/Authenticators/", "getHost"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {names});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String[]) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.LicenseError) {
              throw (com.zeus.soap.zxtm._1_0.LicenseError) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.ObjectDoesNotExist) {
              throw (com.zeus.soap.zxtm._1_0.ObjectDoesNotExist) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }


    /**
     * Get the hostname of the remote authenticator. This is a location
     * specific function, any action will operate on the specified location.
     */
    public java.lang.String[] getHostByLocation(java.lang.String location, java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.LicenseError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/Catalog/Authenticators/getHostByLocation");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/Catalog/Authenticators/", "getHostByLocation"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {location, names});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String[]) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.LicenseError) {
              throw (com.zeus.soap.zxtm._1_0.LicenseError) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.ObjectDoesNotExist) {
              throw (com.zeus.soap.zxtm._1_0.ObjectDoesNotExist) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }


    /**
     * Get the user used to connect to the LDAP server for each of
     * the named Authenticators
     */
    public java.lang.String[] getLDAPBindDN(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.LicenseError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/Catalog/Authenticators/getLDAPBindDN");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/Catalog/Authenticators/", "getLDAPBindDN"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {names});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String[]) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.LicenseError) {
              throw (com.zeus.soap.zxtm._1_0.LicenseError) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.ObjectDoesNotExist) {
              throw (com.zeus.soap.zxtm._1_0.ObjectDoesNotExist) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }


    /**
     * Get the user used to connect to the LDAP server for each of
     * the named Authenticators This is a location specific function, any
     * action will operate on the specified location.
     */
    public java.lang.String[] getLDAPBindDNByLocation(java.lang.String location, java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.LicenseError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[9]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/Catalog/Authenticators/getLDAPBindDNByLocation");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/Catalog/Authenticators/", "getLDAPBindDNByLocation"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {location, names});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String[]) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.LicenseError) {
              throw (com.zeus.soap.zxtm._1_0.LicenseError) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.ObjectDoesNotExist) {
              throw (com.zeus.soap.zxtm._1_0.ObjectDoesNotExist) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }


    /**
     * Get the filter used to identify user records. Any occurences
     * of '%u' in the filter will be replaced by the name of the user being
     * authenticated.
     */
    public java.lang.String[] getLDAPFilter(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.LicenseError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[10]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/Catalog/Authenticators/getLDAPFilter");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/Catalog/Authenticators/", "getLDAPFilter"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {names});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String[]) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.LicenseError) {
              throw (com.zeus.soap.zxtm._1_0.LicenseError) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.ObjectDoesNotExist) {
              throw (com.zeus.soap.zxtm._1_0.ObjectDoesNotExist) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }


    /**
     * Get the DN that we will search for user records under.
     */
    public java.lang.String[] getLDAPFilterBaseDN(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.LicenseError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[11]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/Catalog/Authenticators/getLDAPFilterBaseDN");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/Catalog/Authenticators/", "getLDAPFilterBaseDN"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {names});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String[]) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.LicenseError) {
              throw (com.zeus.soap.zxtm._1_0.LicenseError) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.ObjectDoesNotExist) {
              throw (com.zeus.soap.zxtm._1_0.ObjectDoesNotExist) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }


    /**
     * Get the DN that we will search for user records under. This
     * is a location specific function, any action will operate on the specified
     * location.
     */
    public java.lang.String[] getLDAPFilterBaseDNByLocation(java.lang.String location, java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.LicenseError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[12]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/Catalog/Authenticators/getLDAPFilterBaseDNByLocation");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/Catalog/Authenticators/", "getLDAPFilterBaseDNByLocation"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {location, names});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String[]) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.LicenseError) {
              throw (com.zeus.soap.zxtm._1_0.LicenseError) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.ObjectDoesNotExist) {
              throw (com.zeus.soap.zxtm._1_0.ObjectDoesNotExist) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }


    /**
     * Get the filter used to identify user records. Any occurences
     * of '%u' in the filter will be replaced by the name of the user being
     * authenticated. This is a location specific function, any action will
     * operate on the specified location.
     */
    public java.lang.String[] getLDAPFilterByLocation(java.lang.String location, java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.LicenseError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[13]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/Catalog/Authenticators/getLDAPFilterByLocation");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/Catalog/Authenticators/", "getLDAPFilterByLocation"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {location, names});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String[]) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.LicenseError) {
              throw (com.zeus.soap.zxtm._1_0.LicenseError) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.ObjectDoesNotExist) {
              throw (com.zeus.soap.zxtm._1_0.ObjectDoesNotExist) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }


    /**
     * Get the SSL certificate in the CA catalog used to authenticate
     * the remote LDAP server.
     */
    public java.lang.String[] getLDAPSSLCertificate(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.LicenseError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[14]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/Catalog/Authenticators/getLDAPSSLCertificate");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/Catalog/Authenticators/", "getLDAPSSLCertificate"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {names});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String[]) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.LicenseError) {
              throw (com.zeus.soap.zxtm._1_0.LicenseError) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.ObjectDoesNotExist) {
              throw (com.zeus.soap.zxtm._1_0.ObjectDoesNotExist) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }


    /**
     * Get the SSL certificate in the CA catalog used to authenticate
     * the remote LDAP server. This is a location specific function, any
     * action will operate on the specified location.
     */
    public java.lang.String[] getLDAPSSLCertificateByLocation(java.lang.String location, java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.LicenseError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[15]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/Catalog/Authenticators/getLDAPSSLCertificateByLocation");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/Catalog/Authenticators/", "getLDAPSSLCertificateByLocation"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {location, names});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String[]) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.LicenseError) {
              throw (com.zeus.soap.zxtm._1_0.LicenseError) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.ObjectDoesNotExist) {
              throw (com.zeus.soap.zxtm._1_0.ObjectDoesNotExist) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }


    /**
     * Get if SSL should be used to connect to the LDAP server.
     */
    public boolean[] getLDAPSSLEnabled(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.LicenseError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[16]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/Catalog/Authenticators/getLDAPSSLEnabled");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/Catalog/Authenticators/", "getLDAPSSLEnabled"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {names});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (boolean[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (boolean[]) org.apache.axis.utils.JavaUtils.convert(_resp, boolean[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.LicenseError) {
              throw (com.zeus.soap.zxtm._1_0.LicenseError) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.ObjectDoesNotExist) {
              throw (com.zeus.soap.zxtm._1_0.ObjectDoesNotExist) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }


    /**
     * Get if SSL should be used to connect to the LDAP server. This
     * is a location specific function, any action will operate on the specified
     * location.
     */
    public boolean[] getLDAPSSLEnabledByLocation(java.lang.String location, java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.LicenseError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[17]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/Catalog/Authenticators/getLDAPSSLEnabledByLocation");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/Catalog/Authenticators/", "getLDAPSSLEnabledByLocation"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {location, names});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (boolean[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (boolean[]) org.apache.axis.utils.JavaUtils.convert(_resp, boolean[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.LicenseError) {
              throw (com.zeus.soap.zxtm._1_0.LicenseError) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.ObjectDoesNotExist) {
              throw (com.zeus.soap.zxtm._1_0.ObjectDoesNotExist) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }


    /**
     * Get how a SSL connection should be established.
     */
    public com.zeus.soap.zxtm._1_0.CatalogAuthenticatorsLDAPSSLType[] getLDAPSSLType(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.LicenseError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[18]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/Catalog/Authenticators/getLDAPSSLType");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/Catalog/Authenticators/", "getLDAPSSLType"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {names});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.zeus.soap.zxtm._1_0.CatalogAuthenticatorsLDAPSSLType[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.zeus.soap.zxtm._1_0.CatalogAuthenticatorsLDAPSSLType[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.zeus.soap.zxtm._1_0.CatalogAuthenticatorsLDAPSSLType[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.LicenseError) {
              throw (com.zeus.soap.zxtm._1_0.LicenseError) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.ObjectDoesNotExist) {
              throw (com.zeus.soap.zxtm._1_0.ObjectDoesNotExist) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }


    /**
     * Get how a SSL connection should be established. This is a location
     * specific function, any action will operate on the specified location.
     */
    public com.zeus.soap.zxtm._1_0.CatalogAuthenticatorsLDAPSSLType[] getLDAPSSLTypeByLocation(java.lang.String location, java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.LicenseError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[19]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/Catalog/Authenticators/getLDAPSSLTypeByLocation");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/Catalog/Authenticators/", "getLDAPSSLTypeByLocation"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {location, names});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.zeus.soap.zxtm._1_0.CatalogAuthenticatorsLDAPSSLType[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.zeus.soap.zxtm._1_0.CatalogAuthenticatorsLDAPSSLType[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.zeus.soap.zxtm._1_0.CatalogAuthenticatorsLDAPSSLType[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.LicenseError) {
              throw (com.zeus.soap.zxtm._1_0.LicenseError) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.ObjectDoesNotExist) {
              throw (com.zeus.soap.zxtm._1_0.ObjectDoesNotExist) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }


    /**
     * Get the attributes to return from the search.
     */
    public java.lang.String[][] getLDAPSearchAttr(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.LicenseError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[20]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/Catalog/Authenticators/getLDAPSearchAttr");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/Catalog/Authenticators/", "getLDAPSearchAttr"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {names});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String[][]) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String[][]) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String[][].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.LicenseError) {
              throw (com.zeus.soap.zxtm._1_0.LicenseError) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.ObjectDoesNotExist) {
              throw (com.zeus.soap.zxtm._1_0.ObjectDoesNotExist) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }


    /**
     * Get the attributes to return from the search. This is a location
     * specific function, any action will operate on the specified location.
     */
    public java.lang.String[][] getLDAPSearchAttrByLocation(java.lang.String location, java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.LicenseError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[21]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/Catalog/Authenticators/getLDAPSearchAttrByLocation");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/Catalog/Authenticators/", "getLDAPSearchAttrByLocation"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {location, names});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String[][]) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String[][]) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String[][].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.LicenseError) {
              throw (com.zeus.soap.zxtm._1_0.LicenseError) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.ObjectDoesNotExist) {
              throw (com.zeus.soap.zxtm._1_0.ObjectDoesNotExist) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }


    /**
     * Get the note for each of the named Authenticators
     */
    public java.lang.String[] getNote(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.LicenseError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[22]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/Catalog/Authenticators/getNote");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/Catalog/Authenticators/", "getNote"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {names});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String[]) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.LicenseError) {
              throw (com.zeus.soap.zxtm._1_0.LicenseError) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.ObjectDoesNotExist) {
              throw (com.zeus.soap.zxtm._1_0.ObjectDoesNotExist) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }


    /**
     * Get the port of the remote authenticator.
     */
    public org.apache.axis.types.UnsignedInt[] getPort(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.LicenseError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[23]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/Catalog/Authenticators/getPort");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/Catalog/Authenticators/", "getPort"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {names});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.apache.axis.types.UnsignedInt[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.apache.axis.types.UnsignedInt[]) org.apache.axis.utils.JavaUtils.convert(_resp, org.apache.axis.types.UnsignedInt[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.LicenseError) {
              throw (com.zeus.soap.zxtm._1_0.LicenseError) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.ObjectDoesNotExist) {
              throw (com.zeus.soap.zxtm._1_0.ObjectDoesNotExist) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }


    /**
     * Get the port of the remote authenticator. This is a location
     * specific function, any action will operate on the specified location.
     */
    public org.apache.axis.types.UnsignedInt[] getPortByLocation(java.lang.String location, java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.LicenseError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[24]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/Catalog/Authenticators/getPortByLocation");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/Catalog/Authenticators/", "getPortByLocation"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {location, names});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.apache.axis.types.UnsignedInt[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.apache.axis.types.UnsignedInt[]) org.apache.axis.utils.JavaUtils.convert(_resp, org.apache.axis.types.UnsignedInt[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.LicenseError) {
              throw (com.zeus.soap.zxtm._1_0.LicenseError) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.ObjectDoesNotExist) {
              throw (com.zeus.soap.zxtm._1_0.ObjectDoesNotExist) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }


    /**
     * Remove the attributes to return from the search.
     */
    public void removeLDAPSearchAttr(java.lang.String[] names, java.lang.String[][] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.LicenseError, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[25]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/Catalog/Authenticators/removeLDAPSearchAttr");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/Catalog/Authenticators/", "removeLDAPSearchAttr"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {names, values});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.LicenseError) {
              throw (com.zeus.soap.zxtm._1_0.LicenseError) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidInput) {
              throw (com.zeus.soap.zxtm._1_0.InvalidInput) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.DeploymentError) {
              throw (com.zeus.soap.zxtm._1_0.DeploymentError) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.ObjectDoesNotExist) {
              throw (com.zeus.soap.zxtm._1_0.ObjectDoesNotExist) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }


    /**
     * Remove the attributes to return from the search. This is a
     * location specific function, any action will operate on the specified
     * location.
     */
    public void removeLDAPSearchAttrByLocation(java.lang.String location, java.lang.String[] names, java.lang.String[][] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.LicenseError, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[26]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/Catalog/Authenticators/removeLDAPSearchAttrByLocation");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/Catalog/Authenticators/", "removeLDAPSearchAttrByLocation"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {location, names, values});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.LicenseError) {
              throw (com.zeus.soap.zxtm._1_0.LicenseError) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidInput) {
              throw (com.zeus.soap.zxtm._1_0.InvalidInput) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.DeploymentError) {
              throw (com.zeus.soap.zxtm._1_0.DeploymentError) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.ObjectDoesNotExist) {
              throw (com.zeus.soap.zxtm._1_0.ObjectDoesNotExist) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }


    /**
     * Rename the named Authenticator classes.
     */
    public void renameAuthenticator(java.lang.String[] class_names, java.lang.String[] new_names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.LicenseError, com.zeus.soap.zxtm._1_0.InvalidOperation, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist, com.zeus.soap.zxtm._1_0.InvalidObjectName, com.zeus.soap.zxtm._1_0.ObjectAlreadyExists {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[27]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/Catalog/Authenticators/renameAuthenticator");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/Catalog/Authenticators/", "renameAuthenticator"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {class_names, new_names});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.LicenseError) {
              throw (com.zeus.soap.zxtm._1_0.LicenseError) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidOperation) {
              throw (com.zeus.soap.zxtm._1_0.InvalidOperation) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.DeploymentError) {
              throw (com.zeus.soap.zxtm._1_0.DeploymentError) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.ObjectDoesNotExist) {
              throw (com.zeus.soap.zxtm._1_0.ObjectDoesNotExist) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidObjectName) {
              throw (com.zeus.soap.zxtm._1_0.InvalidObjectName) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.ObjectAlreadyExists) {
              throw (com.zeus.soap.zxtm._1_0.ObjectAlreadyExists) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }


    /**
     * Set the hostname of the remote authenticator.
     */
    public void setHost(java.lang.String[] names, java.lang.String[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.LicenseError, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[28]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/Catalog/Authenticators/setHost");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/Catalog/Authenticators/", "setHost"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {names, values});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.LicenseError) {
              throw (com.zeus.soap.zxtm._1_0.LicenseError) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidInput) {
              throw (com.zeus.soap.zxtm._1_0.InvalidInput) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.DeploymentError) {
              throw (com.zeus.soap.zxtm._1_0.DeploymentError) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.ObjectDoesNotExist) {
              throw (com.zeus.soap.zxtm._1_0.ObjectDoesNotExist) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }


    /**
     * Set the hostname of the remote authenticator. This is a location
     * specific function, any action will operate on the specified location.
     */
    public void setHostByLocation(java.lang.String location, java.lang.String[] names, java.lang.String[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.LicenseError, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[29]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/Catalog/Authenticators/setHostByLocation");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/Catalog/Authenticators/", "setHostByLocation"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {location, names, values});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.LicenseError) {
              throw (com.zeus.soap.zxtm._1_0.LicenseError) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidInput) {
              throw (com.zeus.soap.zxtm._1_0.InvalidInput) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.DeploymentError) {
              throw (com.zeus.soap.zxtm._1_0.DeploymentError) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.ObjectDoesNotExist) {
              throw (com.zeus.soap.zxtm._1_0.ObjectDoesNotExist) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }


    /**
     * Set the user used to connect to the LDAP server for each of
     * the named Authenticators
     */
    public void setLDAPBindDN(java.lang.String[] names, java.lang.String[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.LicenseError, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[30]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/Catalog/Authenticators/setLDAPBindDN");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/Catalog/Authenticators/", "setLDAPBindDN"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {names, values});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.LicenseError) {
              throw (com.zeus.soap.zxtm._1_0.LicenseError) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidInput) {
              throw (com.zeus.soap.zxtm._1_0.InvalidInput) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.DeploymentError) {
              throw (com.zeus.soap.zxtm._1_0.DeploymentError) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.ObjectDoesNotExist) {
              throw (com.zeus.soap.zxtm._1_0.ObjectDoesNotExist) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }


    /**
     * Set the user used to connect to the LDAP server for each of
     * the named Authenticators This is a location specific function, any
     * action will operate on the specified location.
     */
    public void setLDAPBindDNByLocation(java.lang.String location, java.lang.String[] names, java.lang.String[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.LicenseError, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[31]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/Catalog/Authenticators/setLDAPBindDNByLocation");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/Catalog/Authenticators/", "setLDAPBindDNByLocation"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {location, names, values});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.LicenseError) {
              throw (com.zeus.soap.zxtm._1_0.LicenseError) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidInput) {
              throw (com.zeus.soap.zxtm._1_0.InvalidInput) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.DeploymentError) {
              throw (com.zeus.soap.zxtm._1_0.DeploymentError) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.ObjectDoesNotExist) {
              throw (com.zeus.soap.zxtm._1_0.ObjectDoesNotExist) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }


    /**
     * Set the password of the bind user.
     */
    public void setLDAPBindPassword(java.lang.String[] names, java.lang.String[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.LicenseError, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[32]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/Catalog/Authenticators/setLDAPBindPassword");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/Catalog/Authenticators/", "setLDAPBindPassword"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {names, values});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.LicenseError) {
              throw (com.zeus.soap.zxtm._1_0.LicenseError) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidInput) {
              throw (com.zeus.soap.zxtm._1_0.InvalidInput) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.DeploymentError) {
              throw (com.zeus.soap.zxtm._1_0.DeploymentError) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.ObjectDoesNotExist) {
              throw (com.zeus.soap.zxtm._1_0.ObjectDoesNotExist) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }


    /**
     * Set the password of the bind user. This is a location specific
     * function, any action will operate on the specified location.
     */
    public void setLDAPBindPasswordByLocation(java.lang.String location, java.lang.String[] names, java.lang.String[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.LicenseError, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[33]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/Catalog/Authenticators/setLDAPBindPasswordByLocation");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/Catalog/Authenticators/", "setLDAPBindPasswordByLocation"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {location, names, values});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.LicenseError) {
              throw (com.zeus.soap.zxtm._1_0.LicenseError) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidInput) {
              throw (com.zeus.soap.zxtm._1_0.InvalidInput) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.DeploymentError) {
              throw (com.zeus.soap.zxtm._1_0.DeploymentError) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.ObjectDoesNotExist) {
              throw (com.zeus.soap.zxtm._1_0.ObjectDoesNotExist) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }


    /**
     * Set the filter used to identify user records. Any occurences
     * of '%u' in the filter will be replaced by the name of the user being
     * authenticated.
     */
    public void setLDAPFilter(java.lang.String[] names, java.lang.String[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.LicenseError, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[34]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/Catalog/Authenticators/setLDAPFilter");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/Catalog/Authenticators/", "setLDAPFilter"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {names, values});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.LicenseError) {
              throw (com.zeus.soap.zxtm._1_0.LicenseError) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidInput) {
              throw (com.zeus.soap.zxtm._1_0.InvalidInput) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.DeploymentError) {
              throw (com.zeus.soap.zxtm._1_0.DeploymentError) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.ObjectDoesNotExist) {
              throw (com.zeus.soap.zxtm._1_0.ObjectDoesNotExist) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }


    /**
     * Set the DN that we will search for user records under.
     */
    public void setLDAPFilterBaseDN(java.lang.String[] names, java.lang.String[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.LicenseError, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[35]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/Catalog/Authenticators/setLDAPFilterBaseDN");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/Catalog/Authenticators/", "setLDAPFilterBaseDN"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {names, values});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.LicenseError) {
              throw (com.zeus.soap.zxtm._1_0.LicenseError) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidInput) {
              throw (com.zeus.soap.zxtm._1_0.InvalidInput) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.DeploymentError) {
              throw (com.zeus.soap.zxtm._1_0.DeploymentError) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.ObjectDoesNotExist) {
              throw (com.zeus.soap.zxtm._1_0.ObjectDoesNotExist) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }


    /**
     * Set the DN that we will search for user records under. This
     * is a location specific function, any action will operate on the specified
     * location.
     */
    public void setLDAPFilterBaseDNByLocation(java.lang.String location, java.lang.String[] names, java.lang.String[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.LicenseError, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[36]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/Catalog/Authenticators/setLDAPFilterBaseDNByLocation");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/Catalog/Authenticators/", "setLDAPFilterBaseDNByLocation"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {location, names, values});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.LicenseError) {
              throw (com.zeus.soap.zxtm._1_0.LicenseError) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidInput) {
              throw (com.zeus.soap.zxtm._1_0.InvalidInput) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.DeploymentError) {
              throw (com.zeus.soap.zxtm._1_0.DeploymentError) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.ObjectDoesNotExist) {
              throw (com.zeus.soap.zxtm._1_0.ObjectDoesNotExist) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }


    /**
     * Set the filter used to identify user records. Any occurences
     * of '%u' in the filter will be replaced by the name of the user being
     * authenticated. This is a location specific function, any action will
     * operate on the specified location.
     */
    public void setLDAPFilterByLocation(java.lang.String location, java.lang.String[] names, java.lang.String[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.LicenseError, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[37]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/Catalog/Authenticators/setLDAPFilterByLocation");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/Catalog/Authenticators/", "setLDAPFilterByLocation"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {location, names, values});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.LicenseError) {
              throw (com.zeus.soap.zxtm._1_0.LicenseError) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidInput) {
              throw (com.zeus.soap.zxtm._1_0.InvalidInput) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.DeploymentError) {
              throw (com.zeus.soap.zxtm._1_0.DeploymentError) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.ObjectDoesNotExist) {
              throw (com.zeus.soap.zxtm._1_0.ObjectDoesNotExist) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }


    /**
     * Set the SSL certificate in the CA catalog used to authenticate
     * the remote LDAP server.
     */
    public void setLDAPSSLCertificate(java.lang.String[] names, java.lang.String[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.LicenseError, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[38]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/Catalog/Authenticators/setLDAPSSLCertificate");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/Catalog/Authenticators/", "setLDAPSSLCertificate"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {names, values});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.LicenseError) {
              throw (com.zeus.soap.zxtm._1_0.LicenseError) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidInput) {
              throw (com.zeus.soap.zxtm._1_0.InvalidInput) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.DeploymentError) {
              throw (com.zeus.soap.zxtm._1_0.DeploymentError) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.ObjectDoesNotExist) {
              throw (com.zeus.soap.zxtm._1_0.ObjectDoesNotExist) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }


    /**
     * Set the SSL certificate in the CA catalog used to authenticate
     * the remote LDAP server. This is a location specific function, any
     * action will operate on the specified location.
     */
    public void setLDAPSSLCertificateByLocation(java.lang.String location, java.lang.String[] names, java.lang.String[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.LicenseError, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[39]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/Catalog/Authenticators/setLDAPSSLCertificateByLocation");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/Catalog/Authenticators/", "setLDAPSSLCertificateByLocation"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {location, names, values});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.LicenseError) {
              throw (com.zeus.soap.zxtm._1_0.LicenseError) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidInput) {
              throw (com.zeus.soap.zxtm._1_0.InvalidInput) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.DeploymentError) {
              throw (com.zeus.soap.zxtm._1_0.DeploymentError) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.ObjectDoesNotExist) {
              throw (com.zeus.soap.zxtm._1_0.ObjectDoesNotExist) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }


    /**
     * Set if SSL should be used to connect to the LDAP server.
     */
    public void setLDAPSSLEnabled(java.lang.String[] names, boolean[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.LicenseError, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[40]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/Catalog/Authenticators/setLDAPSSLEnabled");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/Catalog/Authenticators/", "setLDAPSSLEnabled"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {names, values});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.LicenseError) {
              throw (com.zeus.soap.zxtm._1_0.LicenseError) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidInput) {
              throw (com.zeus.soap.zxtm._1_0.InvalidInput) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.DeploymentError) {
              throw (com.zeus.soap.zxtm._1_0.DeploymentError) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.ObjectDoesNotExist) {
              throw (com.zeus.soap.zxtm._1_0.ObjectDoesNotExist) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }


    /**
     * Set if SSL should be used to connect to the LDAP server. This
     * is a location specific function, any action will operate on the specified
     * location.
     */
    public void setLDAPSSLEnabledByLocation(java.lang.String location, java.lang.String[] names, boolean[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.LicenseError, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[41]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/Catalog/Authenticators/setLDAPSSLEnabledByLocation");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/Catalog/Authenticators/", "setLDAPSSLEnabledByLocation"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {location, names, values});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.LicenseError) {
              throw (com.zeus.soap.zxtm._1_0.LicenseError) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidInput) {
              throw (com.zeus.soap.zxtm._1_0.InvalidInput) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.DeploymentError) {
              throw (com.zeus.soap.zxtm._1_0.DeploymentError) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.ObjectDoesNotExist) {
              throw (com.zeus.soap.zxtm._1_0.ObjectDoesNotExist) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }


    /**
     * Set how a SSL connection should be established.
     */
    public void setLDAPSSLType(java.lang.String[] names, com.zeus.soap.zxtm._1_0.CatalogAuthenticatorsLDAPSSLType[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.LicenseError, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[42]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/Catalog/Authenticators/setLDAPSSLType");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/Catalog/Authenticators/", "setLDAPSSLType"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {names, values});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.LicenseError) {
              throw (com.zeus.soap.zxtm._1_0.LicenseError) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidInput) {
              throw (com.zeus.soap.zxtm._1_0.InvalidInput) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.DeploymentError) {
              throw (com.zeus.soap.zxtm._1_0.DeploymentError) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.ObjectDoesNotExist) {
              throw (com.zeus.soap.zxtm._1_0.ObjectDoesNotExist) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }


    /**
     * Set how a SSL connection should be established. This is a location
     * specific function, any action will operate on the specified location.
     */
    public void setLDAPSSLTypeByLocation(java.lang.String location, java.lang.String[] names, com.zeus.soap.zxtm._1_0.CatalogAuthenticatorsLDAPSSLType[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.LicenseError, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[43]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/Catalog/Authenticators/setLDAPSSLTypeByLocation");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/Catalog/Authenticators/", "setLDAPSSLTypeByLocation"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {location, names, values});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.LicenseError) {
              throw (com.zeus.soap.zxtm._1_0.LicenseError) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidInput) {
              throw (com.zeus.soap.zxtm._1_0.InvalidInput) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.DeploymentError) {
              throw (com.zeus.soap.zxtm._1_0.DeploymentError) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.ObjectDoesNotExist) {
              throw (com.zeus.soap.zxtm._1_0.ObjectDoesNotExist) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }


    /**
     * Set the attributes to return from the search.
     */
    public void setLDAPSearchAttr(java.lang.String[] names, java.lang.String[][] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.LicenseError, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[44]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/Catalog/Authenticators/setLDAPSearchAttr");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/Catalog/Authenticators/", "setLDAPSearchAttr"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {names, values});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.LicenseError) {
              throw (com.zeus.soap.zxtm._1_0.LicenseError) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidInput) {
              throw (com.zeus.soap.zxtm._1_0.InvalidInput) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.DeploymentError) {
              throw (com.zeus.soap.zxtm._1_0.DeploymentError) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.ObjectDoesNotExist) {
              throw (com.zeus.soap.zxtm._1_0.ObjectDoesNotExist) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }


    /**
     * Set the attributes to return from the search. This is a location
     * specific function, any action will operate on the specified location.
     */
    public void setLDAPSearchAttrByLocation(java.lang.String location, java.lang.String[] names, java.lang.String[][] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.LicenseError, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[45]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/Catalog/Authenticators/setLDAPSearchAttrByLocation");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/Catalog/Authenticators/", "setLDAPSearchAttrByLocation"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {location, names, values});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.LicenseError) {
              throw (com.zeus.soap.zxtm._1_0.LicenseError) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidInput) {
              throw (com.zeus.soap.zxtm._1_0.InvalidInput) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.DeploymentError) {
              throw (com.zeus.soap.zxtm._1_0.DeploymentError) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.ObjectDoesNotExist) {
              throw (com.zeus.soap.zxtm._1_0.ObjectDoesNotExist) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }


    /**
     * Set the note for each of the named Authenticators
     */
    public void setNote(java.lang.String[] names, java.lang.String[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.LicenseError, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[46]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/Catalog/Authenticators/setNote");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/Catalog/Authenticators/", "setNote"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {names, values});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.LicenseError) {
              throw (com.zeus.soap.zxtm._1_0.LicenseError) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidInput) {
              throw (com.zeus.soap.zxtm._1_0.InvalidInput) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.DeploymentError) {
              throw (com.zeus.soap.zxtm._1_0.DeploymentError) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.ObjectDoesNotExist) {
              throw (com.zeus.soap.zxtm._1_0.ObjectDoesNotExist) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }


    /**
     * Set the port of the remote authenticator.
     */
    public void setPort(java.lang.String[] names, org.apache.axis.types.UnsignedInt[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.LicenseError, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[47]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/Catalog/Authenticators/setPort");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/Catalog/Authenticators/", "setPort"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {names, values});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.LicenseError) {
              throw (com.zeus.soap.zxtm._1_0.LicenseError) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidInput) {
              throw (com.zeus.soap.zxtm._1_0.InvalidInput) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.DeploymentError) {
              throw (com.zeus.soap.zxtm._1_0.DeploymentError) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.ObjectDoesNotExist) {
              throw (com.zeus.soap.zxtm._1_0.ObjectDoesNotExist) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }


    /**
     * Set the port of the remote authenticator. This is a location
     * specific function, any action will operate on the specified location.
     */
    public void setPortByLocation(java.lang.String location, java.lang.String[] names, org.apache.axis.types.UnsignedInt[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.LicenseError, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[48]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/Catalog/Authenticators/setPortByLocation");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/Catalog/Authenticators/", "setPortByLocation"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {location, names, values});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.LicenseError) {
              throw (com.zeus.soap.zxtm._1_0.LicenseError) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidInput) {
              throw (com.zeus.soap.zxtm._1_0.InvalidInput) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.DeploymentError) {
              throw (com.zeus.soap.zxtm._1_0.DeploymentError) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.ObjectDoesNotExist) {
              throw (com.zeus.soap.zxtm._1_0.ObjectDoesNotExist) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

}

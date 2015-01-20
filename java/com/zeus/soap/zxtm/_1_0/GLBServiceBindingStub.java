/**
 * GLBServiceBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.zeus.soap.zxtm._1_0;

public class GLBServiceBindingStub extends org.apache.axis.client.Stub implements com.zeus.soap.zxtm._1_0.GLBServicePort {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[68];
        _initOperationDesc1();
        _initOperationDesc2();
        _initOperationDesc3();
        _initOperationDesc4();
        _initOperationDesc5();
        _initOperationDesc6();
        _initOperationDesc7();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("addDNSSECMappings");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "mappings"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "GLB.Service.DNSSECMappingArrayArray"), com.zeus.soap.zxtm._1_0.GLBServiceDNSSECMapping[][].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.LicenseError",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "LicenseError"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidInput",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidInput"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.DeploymentError",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "DeploymentError"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.ObjectDoesNotExist",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "ObjectDoesNotExist"), 
                      true
                     ));
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("addDomains");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "values"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArrayArray"), java.lang.String[][].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.LicenseError",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "LicenseError"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidInput",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidInput"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.DeploymentError",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "DeploymentError"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.ObjectDoesNotExist",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "ObjectDoesNotExist"), 
                      true
                     ));
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("addDraining");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "values"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArrayArray"), java.lang.String[][].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.LicenseError",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "LicenseError"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidInput",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidInput"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.DeploymentError",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "DeploymentError"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.ObjectDoesNotExist",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "ObjectDoesNotExist"), 
                      true
                     ));
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("addGLBService");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "domains"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArrayArray"), java.lang.String[][].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.LicenseError",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "LicenseError"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidInput",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidInput"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.DeploymentError",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "DeploymentError"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidObjectName",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidObjectName"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.ObjectAlreadyExists",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "ObjectAlreadyExists"), 
                      true
                     ));
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("addLocalIPAddresses");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "localips"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "GLB.Service.LocalIPListArrayArray"), com.zeus.soap.zxtm._1_0.GLBServiceLocalIPList[][].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.LicenseError",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "LicenseError"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidInput",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidInput"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.DeploymentError",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "DeploymentError"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.ObjectDoesNotExist",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "ObjectDoesNotExist"), 
                      true
                     ));
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("addLocations");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "locations"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArrayArray"), java.lang.String[][].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.LicenseError",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "LicenseError"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidInput",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidInput"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.DeploymentError",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "DeploymentError"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.ObjectDoesNotExist",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "ObjectDoesNotExist"), 
                      true
                     ));
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("addMonitors");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "monitors"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "GLB.Service.MonitorListArrayArray"), com.zeus.soap.zxtm._1_0.GLBServiceMonitorList[][].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.LicenseError",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "LicenseError"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidInput",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidInput"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.DeploymentError",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "DeploymentError"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.ObjectDoesNotExist",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "ObjectDoesNotExist"), 
                      true
                     ));
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("addMonitorsByLocation");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "location"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "monitors"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "GLB.Service.MonitorListArrayArray"), com.zeus.soap.zxtm._1_0.GLBServiceMonitorList[][].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.LicenseError",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "LicenseError"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidInput",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidInput"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.DeploymentError",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "DeploymentError"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.ObjectDoesNotExist",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "ObjectDoesNotExist"), 
                      true
                     ));
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("addRules");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "rules"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "GLB.Service.RuleArrayArray"), com.zeus.soap.zxtm._1_0.GLBServiceRule[][].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.LicenseError",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "LicenseError"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidInput",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidInput"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.DeploymentError",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "DeploymentError"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.ObjectDoesNotExist",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "ObjectDoesNotExist"), 
                      true
                     ));
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("addRulesByLocation");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "location"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "rules"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "GLB.Service.RuleArrayArray"), com.zeus.soap.zxtm._1_0.GLBServiceRule[][].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.LicenseError",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "LicenseError"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidInput",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidInput"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.DeploymentError",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "DeploymentError"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "parameters"),
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
        oper.setName("deleteGLBService");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.DeploymentError",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "DeploymentError"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.ObjectDoesNotExist",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "ObjectDoesNotExist"), 
                      true
                     ));
        _operations[10] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getAlgorithm");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "GLB.Service.AlgorithmArray"));
        oper.setReturnClass(com.zeus.soap.zxtm._1_0.GLBServiceAlgorithm[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "values"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.LicenseError",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "LicenseError"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.ObjectDoesNotExist",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "ObjectDoesNotExist"), 
                      true
                     ));
        _operations[11] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getAllMonitorsNeeded");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "booleanArray"));
        oper.setReturnClass(boolean[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "values"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.LicenseError",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "LicenseError"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.ObjectDoesNotExist",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "ObjectDoesNotExist"), 
                      true
                     ));
        _operations[12] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getAutoFailback");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "booleanArray"));
        oper.setReturnClass(boolean[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "values"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.LicenseError",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "LicenseError"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.ObjectDoesNotExist",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "ObjectDoesNotExist"), 
                      true
                     ));
        _operations[13] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getDNSSECMappings");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "GLB.Service.DNSSECMappingArrayArray"));
        oper.setReturnClass(com.zeus.soap.zxtm._1_0.GLBServiceDNSSECMapping[][].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "mappings"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.LicenseError",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "LicenseError"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.ObjectDoesNotExist",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "ObjectDoesNotExist"), 
                      true
                     ));
        _operations[14] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getDomains");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArrayArray"));
        oper.setReturnClass(java.lang.String[][].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "values"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.LicenseError",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "LicenseError"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.ObjectDoesNotExist",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "ObjectDoesNotExist"), 
                      true
                     ));
        _operations[15] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getDraining");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArrayArray"));
        oper.setReturnClass(java.lang.String[][].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "values"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.LicenseError",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "LicenseError"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.ObjectDoesNotExist",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "ObjectDoesNotExist"), 
                      true
                     ));
        _operations[16] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getEnabled");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "booleanArray"));
        oper.setReturnClass(boolean[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "values"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.LicenseError",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "LicenseError"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.ObjectDoesNotExist",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "ObjectDoesNotExist"), 
                      true
                     ));
        _operations[17] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getGLBServiceNames");
        oper.setReturnType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"));
        oper.setReturnClass(java.lang.String[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "names"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[18] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getGeoEffect");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "unsignedIntArray"));
        oper.setReturnClass(org.apache.axis.types.UnsignedInt[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "values"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.LicenseError",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "LicenseError"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "parameters"),
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
        oper.setName("getLoad");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "GLB.Service.LoadArrayArray"));
        oper.setReturnClass(com.zeus.soap.zxtm._1_0.GLBServiceLoad[][].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "loads"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.LicenseError",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "LicenseError"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidInput",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidInput"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.DeploymentError",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "DeploymentError"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.ObjectDoesNotExist",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "ObjectDoesNotExist"), 
                      true
                     ));
        _operations[20] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getLocalIPAddresses");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "GLB.Service.LocalIPListArrayArray"));
        oper.setReturnClass(com.zeus.soap.zxtm._1_0.GLBServiceLocalIPList[][].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "localips"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.LicenseError",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "LicenseError"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.ObjectDoesNotExist",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "ObjectDoesNotExist"), 
                      true
                     ));
        _operations[21] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getLocations");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArrayArray"));
        oper.setReturnClass(java.lang.String[][].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "locations"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.LicenseError",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "LicenseError"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.ObjectDoesNotExist",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "ObjectDoesNotExist"), 
                      true
                     ));
        _operations[22] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getLogEnabled");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "booleanArray"));
        oper.setReturnClass(boolean[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "values"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.LicenseError",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "LicenseError"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.ObjectDoesNotExist",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "ObjectDoesNotExist"), 
                      true
                     ));
        _operations[23] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getLogEnabledByLocation");
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
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.LicenseError",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "LicenseError"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.ObjectDoesNotExist",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "ObjectDoesNotExist"), 
                      true
                     ));
        _operations[24] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getLogFilename");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"));
        oper.setReturnClass(java.lang.String[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "values"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.LicenseError",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "LicenseError"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.ObjectDoesNotExist",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "ObjectDoesNotExist"), 
                      true
                     ));
        _operations[25] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getLogFilenameByLocation");
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
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.LicenseError",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "LicenseError"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.ObjectDoesNotExist",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "ObjectDoesNotExist"), 
                      true
                     ));
        _operations[26] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getLogFormat");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"));
        oper.setReturnClass(java.lang.String[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "values"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.LicenseError",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "LicenseError"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.ObjectDoesNotExist",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "ObjectDoesNotExist"), 
                      true
                     ));
        _operations[27] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getLogFormatByLocation");
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
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.LicenseError",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "LicenseError"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.ObjectDoesNotExist",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "ObjectDoesNotExist"), 
                      true
                     ));
        _operations[28] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getMonitors");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "GLB.Service.MonitorListArrayArray"));
        oper.setReturnClass(com.zeus.soap.zxtm._1_0.GLBServiceMonitorList[][].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "monitors"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.LicenseError",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "LicenseError"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "parameters"),
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
        oper.setName("getMonitorsByLocation");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "location"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "GLB.Service.MonitorListArrayArray"));
        oper.setReturnClass(com.zeus.soap.zxtm._1_0.GLBServiceMonitorList[][].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "monitors"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.LicenseError",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "LicenseError"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.ObjectDoesNotExist",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "ObjectDoesNotExist"), 
                      true
                     ));
        _operations[30] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getReturnIPsOnFail");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "booleanArray"));
        oper.setReturnClass(boolean[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "values"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.LicenseError",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "LicenseError"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.ObjectDoesNotExist",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "ObjectDoesNotExist"), 
                      true
                     ));
        _operations[31] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getRules");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "GLB.Service.RuleArrayArray"));
        oper.setReturnClass(com.zeus.soap.zxtm._1_0.GLBServiceRule[][].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "rules"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.LicenseError",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "LicenseError"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.ObjectDoesNotExist",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "ObjectDoesNotExist"), 
                      true
                     ));
        _operations[32] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getRulesByLocation");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "location"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "GLB.Service.RuleArrayArray"));
        oper.setReturnClass(com.zeus.soap.zxtm._1_0.GLBServiceRule[][].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "rules"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.LicenseError",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "LicenseError"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.ObjectDoesNotExist",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "ObjectDoesNotExist"), 
                      true
                     ));
        _operations[33] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getTTL");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "intArray"));
        oper.setReturnClass(int[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "values"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.LicenseError",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "LicenseError"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.ObjectDoesNotExist",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "ObjectDoesNotExist"), 
                      true
                     ));
        _operations[34] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("removeDNSSECMappings");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "mappings"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "GLB.Service.DNSSECMappingArrayArray"), com.zeus.soap.zxtm._1_0.GLBServiceDNSSECMapping[][].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.LicenseError",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "LicenseError"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidInput",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidInput"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.DeploymentError",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "DeploymentError"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.ObjectDoesNotExist",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "ObjectDoesNotExist"), 
                      true
                     ));
        _operations[35] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("removeDomains");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "values"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArrayArray"), java.lang.String[][].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.LicenseError",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "LicenseError"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidInput",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidInput"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.DeploymentError",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "DeploymentError"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.ObjectDoesNotExist",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "ObjectDoesNotExist"), 
                      true
                     ));
        _operations[36] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("removeDraining");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "values"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArrayArray"), java.lang.String[][].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.LicenseError",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "LicenseError"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidInput",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidInput"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.DeploymentError",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "DeploymentError"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.ObjectDoesNotExist",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "ObjectDoesNotExist"), 
                      true
                     ));
        _operations[37] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("removeLocalIPAddresses");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "localips"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "GLB.Service.LocalIPListArrayArray"), com.zeus.soap.zxtm._1_0.GLBServiceLocalIPList[][].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.LicenseError",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "LicenseError"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidInput",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidInput"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.DeploymentError",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "DeploymentError"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.ObjectDoesNotExist",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "ObjectDoesNotExist"), 
                      true
                     ));
        _operations[38] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("removeLocations");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "locations"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArrayArray"), java.lang.String[][].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.LicenseError",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "LicenseError"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidInput",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidInput"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.DeploymentError",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "DeploymentError"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "parameters"),
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
        oper.setName("removeMonitors");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "monitors"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "GLB.Service.MonitorListArrayArray"), com.zeus.soap.zxtm._1_0.GLBServiceMonitorList[][].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.LicenseError",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "LicenseError"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidInput",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidInput"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.DeploymentError",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "DeploymentError"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.ObjectDoesNotExist",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "ObjectDoesNotExist"), 
                      true
                     ));
        _operations[40] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("removeMonitorsByLocation");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "location"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "monitors"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "GLB.Service.MonitorListArrayArray"), com.zeus.soap.zxtm._1_0.GLBServiceMonitorList[][].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.LicenseError",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "LicenseError"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidInput",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidInput"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.DeploymentError",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "DeploymentError"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.ObjectDoesNotExist",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "ObjectDoesNotExist"), 
                      true
                     ));
        _operations[41] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("removeRules");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "rules"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArrayArray"), java.lang.String[][].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.LicenseError",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "LicenseError"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidInput",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidInput"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.DeploymentError",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "DeploymentError"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.ObjectDoesNotExist",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "ObjectDoesNotExist"), 
                      true
                     ));
        _operations[42] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("removeRulesByLocation");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "location"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "rules"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArrayArray"), java.lang.String[][].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.LicenseError",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "LicenseError"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidInput",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidInput"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.DeploymentError",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "DeploymentError"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.ObjectDoesNotExist",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "ObjectDoesNotExist"), 
                      true
                     ));
        _operations[43] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("renameGLBService");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "new_names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.LicenseError",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "LicenseError"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidInput",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidInput"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.DeploymentError",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "DeploymentError"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.ObjectDoesNotExist",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "ObjectDoesNotExist"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.ObjectAlreadyExists",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "ObjectAlreadyExists"), 
                      true
                     ));
        _operations[44] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("setAlgorithm");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "values"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "GLB.Service.AlgorithmArray"), com.zeus.soap.zxtm._1_0.GLBServiceAlgorithm[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.LicenseError",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "LicenseError"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidInput",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidInput"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.DeploymentError",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "DeploymentError"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.ObjectDoesNotExist",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "ObjectDoesNotExist"), 
                      true
                     ));
        _operations[45] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("setAllMonitorsNeeded");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "values"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "booleanArray"), boolean[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.LicenseError",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "LicenseError"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidInput",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidInput"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.DeploymentError",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "DeploymentError"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.ObjectDoesNotExist",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "ObjectDoesNotExist"), 
                      true
                     ));
        _operations[46] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("setAutoFailback");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "values"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "booleanArray"), boolean[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.LicenseError",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "LicenseError"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidInput",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidInput"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.DeploymentError",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "DeploymentError"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.ObjectDoesNotExist",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "ObjectDoesNotExist"), 
                      true
                     ));
        _operations[47] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("setDNSSECMappings");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "mappings"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "GLB.Service.DNSSECMappingArrayArray"), com.zeus.soap.zxtm._1_0.GLBServiceDNSSECMapping[][].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.LicenseError",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "LicenseError"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidInput",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidInput"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.DeploymentError",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "DeploymentError"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.ObjectDoesNotExist",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "ObjectDoesNotExist"), 
                      true
                     ));
        _operations[48] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("setDomains");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "values"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArrayArray"), java.lang.String[][].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.LicenseError",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "LicenseError"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidInput",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidInput"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.DeploymentError",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "DeploymentError"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.ObjectDoesNotExist",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "ObjectDoesNotExist"), 
                      true
                     ));
        _operations[49] = oper;

    }

    private static void _initOperationDesc6(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("setDraining");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "values"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArrayArray"), java.lang.String[][].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.LicenseError",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "LicenseError"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidInput",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidInput"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.DeploymentError",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "DeploymentError"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.ObjectDoesNotExist",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "ObjectDoesNotExist"), 
                      true
                     ));
        _operations[50] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("setEnabled");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "values"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "booleanArray"), boolean[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.LicenseError",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "LicenseError"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidInput",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidInput"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.DeploymentError",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "DeploymentError"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.ObjectDoesNotExist",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "ObjectDoesNotExist"), 
                      true
                     ));
        _operations[51] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("setGeoEffect");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "values"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "unsignedIntArray"), org.apache.axis.types.UnsignedInt[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.LicenseError",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "LicenseError"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidInput",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidInput"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.DeploymentError",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "DeploymentError"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.ObjectDoesNotExist",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "ObjectDoesNotExist"), 
                      true
                     ));
        _operations[52] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("setLoad");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "loads"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "GLB.Service.LoadArrayArray"), com.zeus.soap.zxtm._1_0.GLBServiceLoad[][].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.LicenseError",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "LicenseError"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidInput",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidInput"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.DeploymentError",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "DeploymentError"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.ObjectDoesNotExist",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "ObjectDoesNotExist"), 
                      true
                     ));
        _operations[53] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("setLocalIPAddresses");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "localips"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "GLB.Service.LocalIPListArrayArray"), com.zeus.soap.zxtm._1_0.GLBServiceLocalIPList[][].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.LicenseError",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "LicenseError"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidInput",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidInput"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.DeploymentError",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "DeploymentError"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.ObjectDoesNotExist",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "ObjectDoesNotExist"), 
                      true
                     ));
        _operations[54] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("setLocations");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "locations"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArrayArray"), java.lang.String[][].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.LicenseError",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "LicenseError"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidInput",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidInput"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.DeploymentError",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "DeploymentError"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.ObjectDoesNotExist",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "ObjectDoesNotExist"), 
                      true
                     ));
        _operations[55] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("setLogEnabled");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "values"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "booleanArray"), boolean[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.LicenseError",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "LicenseError"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidInput",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidInput"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.DeploymentError",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "DeploymentError"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.ObjectDoesNotExist",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "ObjectDoesNotExist"), 
                      true
                     ));
        _operations[56] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("setLogEnabledByLocation");
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
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.LicenseError",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "LicenseError"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidInput",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidInput"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.DeploymentError",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "DeploymentError"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.ObjectDoesNotExist",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "ObjectDoesNotExist"), 
                      true
                     ));
        _operations[57] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("setLogFilename");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "values"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.LicenseError",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "LicenseError"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidInput",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidInput"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.DeploymentError",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "DeploymentError"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.ObjectDoesNotExist",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "ObjectDoesNotExist"), 
                      true
                     ));
        _operations[58] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("setLogFilenameByLocation");
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
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.LicenseError",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "LicenseError"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidInput",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidInput"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.DeploymentError",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "DeploymentError"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.ObjectDoesNotExist",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "ObjectDoesNotExist"), 
                      true
                     ));
        _operations[59] = oper;

    }

    private static void _initOperationDesc7(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("setLogFormat");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "values"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.LicenseError",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "LicenseError"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidInput",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidInput"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.DeploymentError",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "DeploymentError"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.ObjectDoesNotExist",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "ObjectDoesNotExist"), 
                      true
                     ));
        _operations[60] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("setLogFormatByLocation");
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
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.LicenseError",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "LicenseError"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidInput",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidInput"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.DeploymentError",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "DeploymentError"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.ObjectDoesNotExist",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "ObjectDoesNotExist"), 
                      true
                     ));
        _operations[61] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("setMonitors");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "monitors"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "GLB.Service.MonitorListArrayArray"), com.zeus.soap.zxtm._1_0.GLBServiceMonitorList[][].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.LicenseError",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "LicenseError"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidInput",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidInput"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.DeploymentError",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "DeploymentError"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.ObjectDoesNotExist",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "ObjectDoesNotExist"), 
                      true
                     ));
        _operations[62] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("setMonitorsByLocation");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "location"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "monitors"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "GLB.Service.MonitorListArrayArray"), com.zeus.soap.zxtm._1_0.GLBServiceMonitorList[][].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.LicenseError",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "LicenseError"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidInput",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidInput"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.DeploymentError",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "DeploymentError"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.ObjectDoesNotExist",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "ObjectDoesNotExist"), 
                      true
                     ));
        _operations[63] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("setReturnIPsOnFail");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "values"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "booleanArray"), boolean[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.LicenseError",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "LicenseError"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidInput",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidInput"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.DeploymentError",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "DeploymentError"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.ObjectDoesNotExist",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "ObjectDoesNotExist"), 
                      true
                     ));
        _operations[64] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("setRules");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "rules"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "GLB.Service.RuleArrayArray"), com.zeus.soap.zxtm._1_0.GLBServiceRule[][].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.LicenseError",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "LicenseError"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidInput",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidInput"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.DeploymentError",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "DeploymentError"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.ObjectDoesNotExist",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "ObjectDoesNotExist"), 
                      true
                     ));
        _operations[65] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("setRulesByLocation");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "location"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "rules"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "GLB.Service.RuleArrayArray"), com.zeus.soap.zxtm._1_0.GLBServiceRule[][].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.LicenseError",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "LicenseError"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidInput",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidInput"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.DeploymentError",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "DeploymentError"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.ObjectDoesNotExist",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "ObjectDoesNotExist"), 
                      true
                     ));
        _operations[66] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("setTTL");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "values"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "intArray"), int[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.LicenseError",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "LicenseError"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidInput",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidInput"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.DeploymentError",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "DeploymentError"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.ObjectDoesNotExist",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "ObjectDoesNotExist"), 
                      true
                     ));
        _operations[67] = oper;

    }

    public GLBServiceBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public GLBServiceBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public GLBServiceBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
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

            qName = new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "DeploymentError");
            cachedSerQNames.add(qName);
            cls = com.zeus.soap.zxtm._1_0.DeploymentError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "GLB.Service.Algorithm");
            cachedSerQNames.add(qName);
            cls = com.zeus.soap.zxtm._1_0.GLBServiceAlgorithm.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "GLB.Service.AlgorithmArray");
            cachedSerQNames.add(qName);
            cls = com.zeus.soap.zxtm._1_0.GLBServiceAlgorithm[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "GLB.Service.Algorithm");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "GLB.Service.DNSSECMapping");
            cachedSerQNames.add(qName);
            cls = com.zeus.soap.zxtm._1_0.GLBServiceDNSSECMapping.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "GLB.Service.DNSSECMappingArray");
            cachedSerQNames.add(qName);
            cls = com.zeus.soap.zxtm._1_0.GLBServiceDNSSECMapping[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "GLB.Service.DNSSECMapping");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "GLB.Service.DNSSECMappingArrayArray");
            cachedSerQNames.add(qName);
            cls = com.zeus.soap.zxtm._1_0.GLBServiceDNSSECMapping[][].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "GLB.Service.DNSSECMappingArray");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "GLB.Service.Load");
            cachedSerQNames.add(qName);
            cls = com.zeus.soap.zxtm._1_0.GLBServiceLoad.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "GLB.Service.LoadArray");
            cachedSerQNames.add(qName);
            cls = com.zeus.soap.zxtm._1_0.GLBServiceLoad[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "GLB.Service.Load");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "GLB.Service.LoadArrayArray");
            cachedSerQNames.add(qName);
            cls = com.zeus.soap.zxtm._1_0.GLBServiceLoad[][].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "GLB.Service.LoadArray");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "GLB.Service.LocalIPList");
            cachedSerQNames.add(qName);
            cls = com.zeus.soap.zxtm._1_0.GLBServiceLocalIPList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "GLB.Service.LocalIPListArray");
            cachedSerQNames.add(qName);
            cls = com.zeus.soap.zxtm._1_0.GLBServiceLocalIPList[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "GLB.Service.LocalIPList");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "GLB.Service.LocalIPListArrayArray");
            cachedSerQNames.add(qName);
            cls = com.zeus.soap.zxtm._1_0.GLBServiceLocalIPList[][].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "GLB.Service.LocalIPListArray");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "GLB.Service.MonitorList");
            cachedSerQNames.add(qName);
            cls = com.zeus.soap.zxtm._1_0.GLBServiceMonitorList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "GLB.Service.MonitorListArray");
            cachedSerQNames.add(qName);
            cls = com.zeus.soap.zxtm._1_0.GLBServiceMonitorList[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "GLB.Service.MonitorList");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "GLB.Service.MonitorListArrayArray");
            cachedSerQNames.add(qName);
            cls = com.zeus.soap.zxtm._1_0.GLBServiceMonitorList[][].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "GLB.Service.MonitorListArray");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "GLB.Service.Rule");
            cachedSerQNames.add(qName);
            cls = com.zeus.soap.zxtm._1_0.GLBServiceRule.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "GLB.Service.RuleArray");
            cachedSerQNames.add(qName);
            cls = com.zeus.soap.zxtm._1_0.GLBServiceRule[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "GLB.Service.Rule");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "GLB.Service.RuleArrayArray");
            cachedSerQNames.add(qName);
            cls = com.zeus.soap.zxtm._1_0.GLBServiceRule[][].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "GLB.Service.RuleArray");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "intArray");
            cachedSerQNames.add(qName);
            cls = int[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

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
     * Add a set of DNSSEC domain to key mappings to the GLB services
     * specified.
     */
    public void addDNSSECMappings(java.lang.String[] names, com.zeus.soap.zxtm._1_0.GLBServiceDNSSECMapping[][] mappings) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.LicenseError, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/GLB/Service/addDNSSECMappings");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "addDNSSECMappings"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {names, mappings});

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
     * For each named GLB service, add new DNS domain names to the
     * list of domains to load balance
     */
    public void addDomains(java.lang.String[] names, java.lang.String[][] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.LicenseError, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/GLB/Service/addDomains");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "addDomains"));

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
     * Add the list of locations that are draining for this service.
     */
    public void addDraining(java.lang.String[] names, java.lang.String[][] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.LicenseError, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/GLB/Service/addDraining");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "addDraining"));

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
     * Add each of the named GLB Services, using the domain lists
     * for each.
     */
    public void addGLBService(java.lang.String[] names, java.lang.String[][] domains) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.LicenseError, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.InvalidObjectName, com.zeus.soap.zxtm._1_0.ObjectAlreadyExists {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/GLB/Service/addGLBService");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "addGLBService"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {names, domains});

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
     * Add Local IPs to the named GLB Services
     */
    public void addLocalIPAddresses(java.lang.String[] names, com.zeus.soap.zxtm._1_0.GLBServiceLocalIPList[][] localips) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.LicenseError, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/GLB/Service/addLocalIPAddresses");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "addLocalIPAddresses"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {names, localips});

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
     * Add new locations to each of the named GLB services.
     */
    public void addLocations(java.lang.String[] names, java.lang.String[][] locations) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.LicenseError, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/GLB/Service/addLocations");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "addLocations"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {names, locations});

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
     * Add Monitors to the named GLB Services
     */
    public void addMonitors(java.lang.String[] names, com.zeus.soap.zxtm._1_0.GLBServiceMonitorList[][] monitors) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.LicenseError, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/GLB/Service/addMonitors");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "addMonitors"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {names, monitors});

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
     * Add Monitors to the named GLB Services This is a location specific
     * function, any action will operate on the specified location.
     */
    public void addMonitorsByLocation(java.lang.String location, java.lang.String[] names, com.zeus.soap.zxtm._1_0.GLBServiceMonitorList[][] monitors) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.LicenseError, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/GLB/Service/addMonitorsByLocation");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "addMonitorsByLocation"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {location, names, monitors});

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
     * Add new rules to be run on DNS packets for each of the named
     * GLB services. New rules are run after existing rules. If any of the
     * rules are already configured to run, then they are enabled and flags
     * are set to the values passed in.
     */
    public void addRules(java.lang.String[] names, com.zeus.soap.zxtm._1_0.GLBServiceRule[][] rules) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.LicenseError, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/GLB/Service/addRules");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "addRules"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {names, rules});

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
     * Add new rules to be run on DNS packets for each of the named
     * GLB services. New rules are run after existing rules. If any of the
     * rules are already configured to run, then they are enabled and flags
     * are set to the values passed in. This is a location specific function,
     * any action will operate on the specified location.
     */
    public void addRulesByLocation(java.lang.String location, java.lang.String[] names, com.zeus.soap.zxtm._1_0.GLBServiceRule[][] rules) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.LicenseError, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[9]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/GLB/Service/addRulesByLocation");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "addRulesByLocation"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {location, names, rules});

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
     * Delete each of the named GLB Services.
     */
    public void deleteGLBService(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[10]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/GLB/Service/deleteGLBService");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "deleteGLBService"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {names});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
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
     * Get the load balancing algorithm to use.
     */
    public com.zeus.soap.zxtm._1_0.GLBServiceAlgorithm[] getAlgorithm(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.LicenseError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[11]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/GLB/Service/getAlgorithm");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "getAlgorithm"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {names});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.zeus.soap.zxtm._1_0.GLBServiceAlgorithm[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.zeus.soap.zxtm._1_0.GLBServiceAlgorithm[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.zeus.soap.zxtm._1_0.GLBServiceAlgorithm[].class);
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
     * Get whether all monitors are required to be working in a location
     * for this service to be alive.
     */
    public boolean[] getAllMonitorsNeeded(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.LicenseError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[12]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/GLB/Service/getAllMonitorsNeeded");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "getAllMonitorsNeeded"));

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
     * Get whether automatic failback mode is enabled.
     */
    public boolean[] getAutoFailback(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.LicenseError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[13]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/GLB/Service/getAutoFailback");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "getAutoFailback"));

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
     * Get the load for the named GLB Services
     */
    public com.zeus.soap.zxtm._1_0.GLBServiceDNSSECMapping[][] getDNSSECMappings(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.LicenseError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[14]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/GLB/Service/getDNSSECMappings");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "getDNSSECMappings"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {names});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.zeus.soap.zxtm._1_0.GLBServiceDNSSECMapping[][]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.zeus.soap.zxtm._1_0.GLBServiceDNSSECMapping[][]) org.apache.axis.utils.JavaUtils.convert(_resp, com.zeus.soap.zxtm._1_0.GLBServiceDNSSECMapping[][].class);
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
     * Get the list of domain names to load balance, for each of the
     * named GLB services
     */
    public java.lang.String[][] getDomains(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.LicenseError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[15]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/GLB/Service/getDomains");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "getDomains"));

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
     * Get the list of locations that are draining for this service.
     */
    public java.lang.String[][] getDraining(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.LicenseError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[16]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/GLB/Service/getDraining");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "getDraining"));

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
     * Get whether we perform DNS manipulation.
     */
    public boolean[] getEnabled(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.LicenseError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[17]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/GLB/Service/getEnabled");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "getEnabled"));

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
     * Get the names of all of the configured GLB Services.
     */
    public java.lang.String[] getGLBServiceNames() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[18]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/GLB/Service/getGLBServiceNames");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "getGLBServiceNames"));

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
  throw axisFaultException;
}
    }


    /**
     * Get the influence of locality on location choice
     */
    public org.apache.axis.types.UnsignedInt[] getGeoEffect(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.LicenseError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[19]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/GLB/Service/getGeoEffect");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "getGeoEffect"));

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
     * Get the load for the named GLB Services
     */
    public com.zeus.soap.zxtm._1_0.GLBServiceLoad[][] getLoad(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.LicenseError, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[20]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/GLB/Service/getLoad");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "getLoad"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {names});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.zeus.soap.zxtm._1_0.GLBServiceLoad[][]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.zeus.soap.zxtm._1_0.GLBServiceLoad[][]) org.apache.axis.utils.JavaUtils.convert(_resp, com.zeus.soap.zxtm._1_0.GLBServiceLoad[][].class);
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
     * Get the Local IPs configured for the named GLB Services
     */
    public com.zeus.soap.zxtm._1_0.GLBServiceLocalIPList[][] getLocalIPAddresses(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.LicenseError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[21]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/GLB/Service/getLocalIPAddresses");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "getLocalIPAddresses"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {names});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.zeus.soap.zxtm._1_0.GLBServiceLocalIPList[][]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.zeus.soap.zxtm._1_0.GLBServiceLocalIPList[][]) org.apache.axis.utils.JavaUtils.convert(_resp, com.zeus.soap.zxtm._1_0.GLBServiceLocalIPList[][].class);
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
     * Get the locations configured for the named GLB services.
     */
    public java.lang.String[][] getLocations(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.LicenseError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[22]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/GLB/Service/getLocations");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "getLocations"));

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
     * Get whether each of the named GLB services should log each
     * connection.
     */
    public boolean[] getLogEnabled(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.LicenseError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[23]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/GLB/Service/getLogEnabled");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "getLogEnabled"));

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
     * Get whether each of the named GLB services should log each
     * connection. This is a location specific function, any action will
     * operate on the specified location.
     */
    public boolean[] getLogEnabledByLocation(java.lang.String location, java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.LicenseError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[24]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/GLB/Service/getLogEnabledByLocation");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "getLogEnabledByLocation"));

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
     * Get the name of the file used to store query logs, for each
     * of the named GLB services.
     */
    public java.lang.String[] getLogFilename(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.LicenseError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[25]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/GLB/Service/getLogFilename");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "getLogFilename"));

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
     * Get the name of the file used to store query logs, for each
     * of the named GLB services. This is a location specific function, any
     * action will operate on the specified location.
     */
    public java.lang.String[] getLogFilenameByLocation(java.lang.String location, java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.LicenseError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[26]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/GLB/Service/getLogFilenameByLocation");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "getLogFilenameByLocation"));

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
     * Get the log file format for each of the named GLB services.
     */
    public java.lang.String[] getLogFormat(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.LicenseError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[27]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/GLB/Service/getLogFormat");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "getLogFormat"));

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
     * Get the log file format for each of the named GLB services.
     * This is a location specific function, any action will operate on the
     * specified location.
     */
    public java.lang.String[] getLogFormatByLocation(java.lang.String location, java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.LicenseError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[28]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/GLB/Service/getLogFormatByLocation");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "getLogFormatByLocation"));

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
     * Get the Monitors configured for the named GLB Services
     */
    public com.zeus.soap.zxtm._1_0.GLBServiceMonitorList[][] getMonitors(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.LicenseError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[29]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/GLB/Service/getMonitors");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "getMonitors"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {names});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.zeus.soap.zxtm._1_0.GLBServiceMonitorList[][]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.zeus.soap.zxtm._1_0.GLBServiceMonitorList[][]) org.apache.axis.utils.JavaUtils.convert(_resp, com.zeus.soap.zxtm._1_0.GLBServiceMonitorList[][].class);
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
     * Get the Monitors configured for the named GLB Services This
     * is a location specific function, any action will operate on the specified
     * location.
     */
    public com.zeus.soap.zxtm._1_0.GLBServiceMonitorList[][] getMonitorsByLocation(java.lang.String location, java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.LicenseError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[30]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/GLB/Service/getMonitorsByLocation");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "getMonitorsByLocation"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {location, names});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.zeus.soap.zxtm._1_0.GLBServiceMonitorList[][]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.zeus.soap.zxtm._1_0.GLBServiceMonitorList[][]) org.apache.axis.utils.JavaUtils.convert(_resp, com.zeus.soap.zxtm._1_0.GLBServiceMonitorList[][].class);
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
     * Get whether to return all or no IP addresses on a complete
     * failure
     */
    public boolean[] getReturnIPsOnFail(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.LicenseError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[31]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/GLB/Service/getReturnIPsOnFail");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "getReturnIPsOnFail"));

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
     * Get the rules that are run on DNS packets for each of the named
     * GLB services.
     */
    public com.zeus.soap.zxtm._1_0.GLBServiceRule[][] getRules(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.LicenseError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[32]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/GLB/Service/getRules");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "getRules"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {names});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.zeus.soap.zxtm._1_0.GLBServiceRule[][]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.zeus.soap.zxtm._1_0.GLBServiceRule[][]) org.apache.axis.utils.JavaUtils.convert(_resp, com.zeus.soap.zxtm._1_0.GLBServiceRule[][].class);
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
     * Get the rules that are run on DNS packets for each of the named
     * GLB services. This is a location specific function, any action will
     * operate on the specified location.
     */
    public com.zeus.soap.zxtm._1_0.GLBServiceRule[][] getRulesByLocation(java.lang.String location, java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.LicenseError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[33]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/GLB/Service/getRulesByLocation");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "getRulesByLocation"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {location, names});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.zeus.soap.zxtm._1_0.GLBServiceRule[][]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.zeus.soap.zxtm._1_0.GLBServiceRule[][]) org.apache.axis.utils.JavaUtils.convert(_resp, com.zeus.soap.zxtm._1_0.GLBServiceRule[][].class);
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
     * Get the TTL used for domains handled by this config
     */
    public int[] getTTL(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.LicenseError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[34]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/GLB/Service/getTTL");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "getTTL"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {names});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (int[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (int[]) org.apache.axis.utils.JavaUtils.convert(_resp, int[].class);
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
     * Remove the specified DNSSEC domain to key mappings.
     */
    public void removeDNSSECMappings(java.lang.String[] names, com.zeus.soap.zxtm._1_0.GLBServiceDNSSECMapping[][] mappings) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.LicenseError, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[35]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/GLB/Service/removeDNSSECMappings");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "removeDNSSECMappings"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {names, mappings});

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
     * For each named GLB service, remove DNS domain names from the
     * list of domains to load balance
     */
    public void removeDomains(java.lang.String[] names, java.lang.String[][] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.LicenseError, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[36]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/GLB/Service/removeDomains");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "removeDomains"));

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
     * Remove the list of locations that are draining for this service.
     */
    public void removeDraining(java.lang.String[] names, java.lang.String[][] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.LicenseError, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[37]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/GLB/Service/removeDraining");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "removeDraining"));

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
     * Remove Local IPs from the named GLB Services
     */
    public void removeLocalIPAddresses(java.lang.String[] names, com.zeus.soap.zxtm._1_0.GLBServiceLocalIPList[][] localips) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.LicenseError, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[38]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/GLB/Service/removeLocalIPAddresses");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "removeLocalIPAddresses"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {names, localips});

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
     * For each of the named GLB services, remove locations.
     */
    public void removeLocations(java.lang.String[] names, java.lang.String[][] locations) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.LicenseError, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[39]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/GLB/Service/removeLocations");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "removeLocations"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {names, locations});

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
     * Remove Monitors from the named GLB Services
     */
    public void removeMonitors(java.lang.String[] names, com.zeus.soap.zxtm._1_0.GLBServiceMonitorList[][] monitors) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.LicenseError, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[40]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/GLB/Service/removeMonitors");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "removeMonitors"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {names, monitors});

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
     * Remove Monitors from the named GLB Services This is a location
     * specific function, any action will operate on the specified location.
     */
    public void removeMonitorsByLocation(java.lang.String location, java.lang.String[] names, com.zeus.soap.zxtm._1_0.GLBServiceMonitorList[][] monitors) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.LicenseError, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[41]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/GLB/Service/removeMonitorsByLocation");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "removeMonitorsByLocation"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {location, names, monitors});

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
     * For each of the named GLB services, remove rules from the list
     * of rules that are run on DNS packets.
     */
    public void removeRules(java.lang.String[] names, java.lang.String[][] rules) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.LicenseError, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[42]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/GLB/Service/removeRules");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "removeRules"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {names, rules});

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
     * For each of the named GLB services, remove rules from the list
     * of rules that are run on DNS packets. This is a location specific
     * function, any action will operate on the specified location.
     */
    public void removeRulesByLocation(java.lang.String location, java.lang.String[] names, java.lang.String[][] rules) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.LicenseError, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[43]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/GLB/Service/removeRulesByLocation");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "removeRulesByLocation"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {location, names, rules});

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
     * Rename each of the named GLB Services.
     */
    public void renameGLBService(java.lang.String[] names, java.lang.String[] new_names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.LicenseError, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist, com.zeus.soap.zxtm._1_0.ObjectAlreadyExists {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[44]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/GLB/Service/renameGLBService");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "renameGLBService"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {names, new_names});

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
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.ObjectAlreadyExists) {
              throw (com.zeus.soap.zxtm._1_0.ObjectAlreadyExists) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }


    /**
     * Set the load balancing algorithm to use.
     */
    public void setAlgorithm(java.lang.String[] names, com.zeus.soap.zxtm._1_0.GLBServiceAlgorithm[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.LicenseError, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[45]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/GLB/Service/setAlgorithm");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "setAlgorithm"));

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
     * Set whether all monitors are required to be working in a location
     * for this service to be alive.
     */
    public void setAllMonitorsNeeded(java.lang.String[] names, boolean[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.LicenseError, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[46]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/GLB/Service/setAllMonitorsNeeded");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "setAllMonitorsNeeded"));

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
     * Set whether automatic failback mode is enabled.
     */
    public void setAutoFailback(java.lang.String[] names, boolean[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.LicenseError, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[47]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/GLB/Service/setAutoFailback");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "setAutoFailback"));

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
     * Set the DNSSEC domain to key mappings to the GLB services specified.
     * All previous mappings for this service will be removed.
     */
    public void setDNSSECMappings(java.lang.String[] names, com.zeus.soap.zxtm._1_0.GLBServiceDNSSECMapping[][] mappings) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.LicenseError, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[48]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/GLB/Service/setDNSSECMappings");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "setDNSSECMappings"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {names, mappings});

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
     * Set the list of domain names to load balance, for each of the
     * named GLB services
     */
    public void setDomains(java.lang.String[] names, java.lang.String[][] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.LicenseError, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[49]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/GLB/Service/setDomains");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "setDomains"));

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
     * Set the list of locations that are draining for this service.
     */
    public void setDraining(java.lang.String[] names, java.lang.String[][] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.LicenseError, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[50]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/GLB/Service/setDraining");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "setDraining"));

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
     * Set whether we perform DNS manipulation.
     */
    public void setEnabled(java.lang.String[] names, boolean[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.LicenseError, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[51]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/GLB/Service/setEnabled");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "setEnabled"));

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
     * Set the influence of locality on location choice
     */
    public void setGeoEffect(java.lang.String[] names, org.apache.axis.types.UnsignedInt[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.LicenseError, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[52]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/GLB/Service/setGeoEffect");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "setGeoEffect"));

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
     * Set the load for the named GLB Services
     */
    public void setLoad(java.lang.String[] names, com.zeus.soap.zxtm._1_0.GLBServiceLoad[][] loads) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.LicenseError, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[53]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/GLB/Service/setLoad");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "setLoad"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {names, loads});

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
     * Set the Local IPs configured for the named GLB Services
     */
    public void setLocalIPAddresses(java.lang.String[] names, com.zeus.soap.zxtm._1_0.GLBServiceLocalIPList[][] localips) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.LicenseError, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[54]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/GLB/Service/setLocalIPAddresses");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "setLocalIPAddresses"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {names, localips});

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
     * Set the locations configured for each of the named GLB services.
     */
    public void setLocations(java.lang.String[] names, java.lang.String[][] locations) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.LicenseError, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[55]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/GLB/Service/setLocations");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "setLocations"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {names, locations});

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
     * Set whether each of the named GLB services should log each
     * connection.
     */
    public void setLogEnabled(java.lang.String[] names, boolean[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.LicenseError, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[56]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/GLB/Service/setLogEnabled");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "setLogEnabled"));

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
     * Set whether each of the named GLB services should log each
     * connection. This is a location specific function, any action will
     * operate on the specified location.
     */
    public void setLogEnabledByLocation(java.lang.String location, java.lang.String[] names, boolean[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.LicenseError, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[57]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/GLB/Service/setLogEnabledByLocation");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "setLogEnabledByLocation"));

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
     * Set the name of the file used to store query logs, for each
     * of the named GLB services.
     */
    public void setLogFilename(java.lang.String[] names, java.lang.String[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.LicenseError, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[58]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/GLB/Service/setLogFilename");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "setLogFilename"));

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
     * Set the name of the file used to store query logs, for each
     * of the named GLB services. This is a location specific function, any
     * action will operate on the specified location.
     */
    public void setLogFilenameByLocation(java.lang.String location, java.lang.String[] names, java.lang.String[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.LicenseError, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[59]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/GLB/Service/setLogFilenameByLocation");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "setLogFilenameByLocation"));

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
     * Set the log file format for each of the named GLB services.
     */
    public void setLogFormat(java.lang.String[] names, java.lang.String[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.LicenseError, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[60]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/GLB/Service/setLogFormat");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "setLogFormat"));

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
     * Set the log file format for each of the named GLB services.
     * This is a location specific function, any action will operate on the
     * specified location.
     */
    public void setLogFormatByLocation(java.lang.String location, java.lang.String[] names, java.lang.String[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.LicenseError, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[61]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/GLB/Service/setLogFormatByLocation");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "setLogFormatByLocation"));

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
     * Set the Monitors configured for the named GLB Services
     */
    public void setMonitors(java.lang.String[] names, com.zeus.soap.zxtm._1_0.GLBServiceMonitorList[][] monitors) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.LicenseError, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[62]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/GLB/Service/setMonitors");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "setMonitors"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {names, monitors});

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
     * Set the Monitors configured for the named GLB Services This
     * is a location specific function, any action will operate on the specified
     * location.
     */
    public void setMonitorsByLocation(java.lang.String location, java.lang.String[] names, com.zeus.soap.zxtm._1_0.GLBServiceMonitorList[][] monitors) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.LicenseError, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[63]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/GLB/Service/setMonitorsByLocation");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "setMonitorsByLocation"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {location, names, monitors});

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
     * Set whether to return all or no IP addresses on a complete
     * failure
     */
    public void setReturnIPsOnFail(java.lang.String[] names, boolean[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.LicenseError, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[64]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/GLB/Service/setReturnIPsOnFail");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "setReturnIPsOnFail"));

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
     * Set the rules that are run on DNS packets for each of the named
     * GLB services.
     */
    public void setRules(java.lang.String[] names, com.zeus.soap.zxtm._1_0.GLBServiceRule[][] rules) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.LicenseError, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[65]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/GLB/Service/setRules");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "setRules"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {names, rules});

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
     * Set the rules that are run on DNS packets for each of the named
     * GLB services. This is a location specific function, any action will
     * operate on the specified location.
     */
    public void setRulesByLocation(java.lang.String location, java.lang.String[] names, com.zeus.soap.zxtm._1_0.GLBServiceRule[][] rules) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.LicenseError, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[66]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/GLB/Service/setRulesByLocation");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "setRulesByLocation"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {location, names, rules});

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
     * Set the TTL used for domains handled by this config
     */
    public void setTTL(java.lang.String[] names, int[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.LicenseError, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[67]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/GLB/Service/setTTL");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/GLB/Service/", "setTTL"));

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

}

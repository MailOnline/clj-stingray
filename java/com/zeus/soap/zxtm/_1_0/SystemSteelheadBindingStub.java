/**
 * SystemSteelheadBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.zeus.soap.zxtm._1_0;

public class SystemSteelheadBindingStub extends org.apache.axis.client.Stub implements com.zeus.soap.zxtm._1_0.SystemSteelheadPort {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[20];
        _initOperationDesc1();
        _initOperationDesc2();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getDiscoveryMode");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "traffic_managers"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "System.Steelhead.DiscoveryModeArray"));
        oper.setReturnClass(com.zeus.soap.zxtm._1_0.SystemSteelheadDiscoveryMode[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "modes"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Steelhead/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidInput",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidInput"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Steelhead/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.ObjectDoesNotExist",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "ObjectDoesNotExist"), 
                      true
                     ));
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getEnabled");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "traffic_managers"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "booleanArray"));
        oper.setReturnClass(boolean[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "enabled"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Steelhead/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidInput",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidInput"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Steelhead/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.ObjectDoesNotExist",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "ObjectDoesNotExist"), 
                      true
                     ));
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getLoadBalancingMethod");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "traffic_managers"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "System.Steelhead.SteelheadLBArray"));
        oper.setReturnClass(com.zeus.soap.zxtm._1_0.SystemSteelheadSteelheadLB[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "lbs"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Steelhead/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidInput",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidInput"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Steelhead/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.ObjectDoesNotExist",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "ObjectDoesNotExist"), 
                      true
                     ));
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getLogLevel");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "traffic_managers"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "System.Steelhead.LogLevelArray"));
        oper.setReturnClass(com.zeus.soap.zxtm._1_0.SystemSteelheadLogLevel[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "levels"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Steelhead/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidInput",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidInput"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Steelhead/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.ObjectDoesNotExist",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "ObjectDoesNotExist"), 
                      true
                     ));
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getPortalClientID");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "traffic_managers"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"));
        oper.setReturnClass(java.lang.String[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "ids"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Steelhead/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidInput",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidInput"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Steelhead/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.ObjectDoesNotExist",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "ObjectDoesNotExist"), 
                      true
                     ));
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getPortalClientKey");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "traffic_managers"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"));
        oper.setReturnClass(java.lang.String[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "keys"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Steelhead/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidInput",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidInput"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Steelhead/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.ObjectDoesNotExist",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "ObjectDoesNotExist"), 
                      true
                     ));
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getPortalHost");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "traffic_managers"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"));
        oper.setReturnClass(java.lang.String[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "hosts"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Steelhead/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidInput",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidInput"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Steelhead/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.ObjectDoesNotExist",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "ObjectDoesNotExist"), 
                      true
                     ));
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getProxyHost");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "traffic_managers"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"));
        oper.setReturnClass(java.lang.String[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "hosts"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Steelhead/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidInput",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidInput"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Steelhead/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.ObjectDoesNotExist",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "ObjectDoesNotExist"), 
                      true
                     ));
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getProxyPort");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "traffic_managers"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"));
        oper.setReturnClass(java.lang.String[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "ports"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Steelhead/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidInput",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidInput"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Steelhead/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.ObjectDoesNotExist",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "ObjectDoesNotExist"), 
                      true
                     ));
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getSteelheadIPs");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "traffic_managers"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArrayArray"));
        oper.setReturnClass(java.lang.String[][].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "ips"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Steelhead/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidInput",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidInput"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Steelhead/", "parameters"),
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
        oper.setName("setDiscoveryMode");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "traffic_managers"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "modes"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "System.Steelhead.DiscoveryModeArray"), com.zeus.soap.zxtm._1_0.SystemSteelheadDiscoveryMode[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Steelhead/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidInput",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidInput"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Steelhead/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.DeploymentError",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "DeploymentError"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Steelhead/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.ObjectDoesNotExist",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "ObjectDoesNotExist"), 
                      true
                     ));
        _operations[10] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("setEnabled");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "traffic_managers"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "enabled"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "booleanArray"), boolean[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Steelhead/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidInput",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidInput"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Steelhead/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.DeploymentError",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "DeploymentError"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Steelhead/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.ObjectDoesNotExist",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "ObjectDoesNotExist"), 
                      true
                     ));
        _operations[11] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("setLoadBalancingMethod");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "traffic_managers"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "lbs"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "System.Steelhead.SteelheadLBArray"), com.zeus.soap.zxtm._1_0.SystemSteelheadSteelheadLB[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Steelhead/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidInput",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidInput"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Steelhead/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.DeploymentError",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "DeploymentError"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Steelhead/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.ObjectDoesNotExist",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "ObjectDoesNotExist"), 
                      true
                     ));
        _operations[12] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("setLogLevel");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "traffic_managers"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "levels"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "System.Steelhead.LogLevelArray"), com.zeus.soap.zxtm._1_0.SystemSteelheadLogLevel[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Steelhead/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidInput",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidInput"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Steelhead/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.DeploymentError",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "DeploymentError"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Steelhead/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.ObjectDoesNotExist",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "ObjectDoesNotExist"), 
                      true
                     ));
        _operations[13] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("setPortalClientID");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "traffic_managers"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ids"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Steelhead/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidInput",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidInput"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Steelhead/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.DeploymentError",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "DeploymentError"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Steelhead/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.ObjectDoesNotExist",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "ObjectDoesNotExist"), 
                      true
                     ));
        _operations[14] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("setPortalClientKey");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "traffic_managers"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "keys"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Steelhead/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidInput",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidInput"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Steelhead/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.DeploymentError",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "DeploymentError"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Steelhead/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.ObjectDoesNotExist",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "ObjectDoesNotExist"), 
                      true
                     ));
        _operations[15] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("setPortalHost");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "traffic_managers"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "hosts"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Steelhead/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidInput",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidInput"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Steelhead/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.DeploymentError",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "DeploymentError"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Steelhead/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.ObjectDoesNotExist",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "ObjectDoesNotExist"), 
                      true
                     ));
        _operations[16] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("setProxyHost");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "traffic_managers"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "hosts"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Steelhead/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidInput",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidInput"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Steelhead/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.DeploymentError",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "DeploymentError"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Steelhead/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.ObjectDoesNotExist",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "ObjectDoesNotExist"), 
                      true
                     ));
        _operations[17] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("setProxyPort");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "traffic_managers"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ports"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Steelhead/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidInput",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidInput"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Steelhead/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.DeploymentError",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "DeploymentError"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Steelhead/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.ObjectDoesNotExist",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "ObjectDoesNotExist"), 
                      true
                     ));
        _operations[18] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("setSteelheadIPs");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "traffic_managers"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ips"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArrayArray"), java.lang.String[][].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Steelhead/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidInput",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidInput"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Steelhead/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.DeploymentError",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "DeploymentError"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Steelhead/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.ObjectDoesNotExist",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "ObjectDoesNotExist"), 
                      true
                     ));
        _operations[19] = oper;

    }

    public SystemSteelheadBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public SystemSteelheadBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public SystemSteelheadBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
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

            qName = new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidInput");
            cachedSerQNames.add(qName);
            cls = com.zeus.soap.zxtm._1_0.InvalidInput.class;
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

            qName = new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "System.Steelhead.DiscoveryMode");
            cachedSerQNames.add(qName);
            cls = com.zeus.soap.zxtm._1_0.SystemSteelheadDiscoveryMode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "System.Steelhead.DiscoveryModeArray");
            cachedSerQNames.add(qName);
            cls = com.zeus.soap.zxtm._1_0.SystemSteelheadDiscoveryMode[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "System.Steelhead.DiscoveryMode");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "System.Steelhead.LogLevel");
            cachedSerQNames.add(qName);
            cls = com.zeus.soap.zxtm._1_0.SystemSteelheadLogLevel.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "System.Steelhead.LogLevelArray");
            cachedSerQNames.add(qName);
            cls = com.zeus.soap.zxtm._1_0.SystemSteelheadLogLevel[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "System.Steelhead.LogLevel");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "System.Steelhead.SteelheadLB");
            cachedSerQNames.add(qName);
            cls = com.zeus.soap.zxtm._1_0.SystemSteelheadSteelheadLB.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "System.Steelhead.SteelheadLBArray");
            cachedSerQNames.add(qName);
            cls = com.zeus.soap.zxtm._1_0.SystemSteelheadSteelheadLB[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "System.Steelhead.SteelheadLB");
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
     * Returns the mode used to discover Cloud Steelheads in the local
     * data center or cloud for the supplied traffic managers.
     */
    public com.zeus.soap.zxtm._1_0.SystemSteelheadDiscoveryMode[] getDiscoveryMode(java.lang.String[] traffic_managers) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Steelhead/getDiscoveryMode");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Steelhead/", "getDiscoveryMode"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {traffic_managers});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.zeus.soap.zxtm._1_0.SystemSteelheadDiscoveryMode[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.zeus.soap.zxtm._1_0.SystemSteelheadDiscoveryMode[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.zeus.soap.zxtm._1_0.SystemSteelheadDiscoveryMode[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidInput) {
              throw (com.zeus.soap.zxtm._1_0.InvalidInput) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.ObjectDoesNotExist) {
              throw (com.zeus.soap.zxtm._1_0.ObjectDoesNotExist) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }


    /**
     * Returns true if the Cloud Steelhead discovery agents on the
     * provided traffic managers are enabled.
     */
    public boolean[] getEnabled(java.lang.String[] traffic_managers) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Steelhead/getEnabled");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Steelhead/", "getEnabled"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {traffic_managers});

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
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidInput) {
              throw (com.zeus.soap.zxtm._1_0.InvalidInput) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.ObjectDoesNotExist) {
              throw (com.zeus.soap.zxtm._1_0.ObjectDoesNotExist) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }


    /**
     * Returns the current load balancing method that each of the
     * named traffic managers are using. Only required when using 'manual'
     * mode.
     */
    public com.zeus.soap.zxtm._1_0.SystemSteelheadSteelheadLB[] getLoadBalancingMethod(java.lang.String[] traffic_managers) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Steelhead/getLoadBalancingMethod");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Steelhead/", "getLoadBalancingMethod"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {traffic_managers});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.zeus.soap.zxtm._1_0.SystemSteelheadSteelheadLB[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.zeus.soap.zxtm._1_0.SystemSteelheadSteelheadLB[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.zeus.soap.zxtm._1_0.SystemSteelheadSteelheadLB[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidInput) {
              throw (com.zeus.soap.zxtm._1_0.InvalidInput) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.ObjectDoesNotExist) {
              throw (com.zeus.soap.zxtm._1_0.ObjectDoesNotExist) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }


    /**
     * Returns the level of logging used on each of the named traffic
     * managers.
     */
    public com.zeus.soap.zxtm._1_0.SystemSteelheadLogLevel[] getLogLevel(java.lang.String[] traffic_managers) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Steelhead/getLogLevel");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Steelhead/", "getLogLevel"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {traffic_managers});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.zeus.soap.zxtm._1_0.SystemSteelheadLogLevel[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.zeus.soap.zxtm._1_0.SystemSteelheadLogLevel[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.zeus.soap.zxtm._1_0.SystemSteelheadLogLevel[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidInput) {
              throw (com.zeus.soap.zxtm._1_0.InvalidInput) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.ObjectDoesNotExist) {
              throw (com.zeus.soap.zxtm._1_0.ObjectDoesNotExist) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }


    /**
     * Returns the string used to identifiy the supplied traffic managers
     * to the cloud portal. Only required in 'portal' and 'local' discovery
     * modes.
     */
    public java.lang.String[] getPortalClientID(java.lang.String[] traffic_managers) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Steelhead/getPortalClientID");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Steelhead/", "getPortalClientID"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {traffic_managers});

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
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidInput) {
              throw (com.zeus.soap.zxtm._1_0.InvalidInput) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.ObjectDoesNotExist) {
              throw (com.zeus.soap.zxtm._1_0.ObjectDoesNotExist) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }


    /**
     * Returns the key used to authenticate the supplied traffic managers
     * to the cloud portal. Only required in 'portal' and 'local' discovery
     * modes.
     */
    public java.lang.String[] getPortalClientKey(java.lang.String[] traffic_managers) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Steelhead/getPortalClientKey");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Steelhead/", "getPortalClientKey"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {traffic_managers});

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
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidInput) {
              throw (com.zeus.soap.zxtm._1_0.InvalidInput) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.ObjectDoesNotExist) {
              throw (com.zeus.soap.zxtm._1_0.ObjectDoesNotExist) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }


    /**
     * Returns the hostname or IP address of the cloud portal to use.
     * Only required when using the 'local' discovery mode.
     */
    public java.lang.String[] getPortalHost(java.lang.String[] traffic_managers) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Steelhead/getPortalHost");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Steelhead/", "getPortalHost"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {traffic_managers});

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
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidInput) {
              throw (com.zeus.soap.zxtm._1_0.InvalidInput) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.ObjectDoesNotExist) {
              throw (com.zeus.soap.zxtm._1_0.ObjectDoesNotExist) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }


    /**
     * Returns the hostname or IP address of the proxy that portal
     * communication should go through, or the empty string if no proxy should
     * be used. Configured per traffic manager.
     */
    public java.lang.String[] getProxyHost(java.lang.String[] traffic_managers) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Steelhead/getProxyHost");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Steelhead/", "getProxyHost"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {traffic_managers});

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
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidInput) {
              throw (com.zeus.soap.zxtm._1_0.InvalidInput) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.ObjectDoesNotExist) {
              throw (com.zeus.soap.zxtm._1_0.ObjectDoesNotExist) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }


    /**
     * Gets the current proxy server port for each of the named traffic
     * managers. Only used if a proxy host has been specified.
     */
    public java.lang.String[] getProxyPort(java.lang.String[] traffic_managers) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Steelhead/getProxyPort");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Steelhead/", "getProxyPort"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {traffic_managers});

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
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidInput) {
              throw (com.zeus.soap.zxtm._1_0.InvalidInput) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.ObjectDoesNotExist) {
              throw (com.zeus.soap.zxtm._1_0.ObjectDoesNotExist) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }


    /**
     * Gets an array of Cloud Steelhead IP addresses that each of
     * the named traffic managers is using. Only required when using the
     * 'manual' discovery mode.
     */
    public java.lang.String[][] getSteelheadIPs(java.lang.String[] traffic_managers) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[9]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Steelhead/getSteelheadIPs");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Steelhead/", "getSteelheadIPs"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {traffic_managers});

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
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidInput) {
              throw (com.zeus.soap.zxtm._1_0.InvalidInput) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.ObjectDoesNotExist) {
              throw (com.zeus.soap.zxtm._1_0.ObjectDoesNotExist) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }


    /**
     * Sets the mode used to discover Cloud Steelheads in the local
     * data center or cloud for the supplied traffic managers.
     */
    public void setDiscoveryMode(java.lang.String[] traffic_managers, com.zeus.soap.zxtm._1_0.SystemSteelheadDiscoveryMode[] modes) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[10]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Steelhead/setDiscoveryMode");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Steelhead/", "setDiscoveryMode"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {traffic_managers, modes});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
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
     * Enable or disable the Cloud Steelhead discovery agent on each
     * of the provided traffic managers
     */
    public void setEnabled(java.lang.String[] traffic_managers, boolean[] enabled) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[11]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Steelhead/setEnabled");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Steelhead/", "setEnabled"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {traffic_managers, enabled});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
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
     * Sets the load balancing method that each of the named traffic
     * managers should use. Only required when using 'manual' mode.
     */
    public void setLoadBalancingMethod(java.lang.String[] traffic_managers, com.zeus.soap.zxtm._1_0.SystemSteelheadSteelheadLB[] lbs) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[12]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Steelhead/setLoadBalancingMethod");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Steelhead/", "setLoadBalancingMethod"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {traffic_managers, lbs});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
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
     * Sets the level of logging used on each of the named traffic
     * managers.
     */
    public void setLogLevel(java.lang.String[] traffic_managers, com.zeus.soap.zxtm._1_0.SystemSteelheadLogLevel[] levels) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[13]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Steelhead/setLogLevel");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Steelhead/", "setLogLevel"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {traffic_managers, levels});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
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
     * Sets the string used to identifiy the supplied traffic managers
     * to the cloud portal. Only required in 'portal' and 'local' discovery
     * modes.
     */
    public void setPortalClientID(java.lang.String[] traffic_managers, java.lang.String[] ids) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[14]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Steelhead/setPortalClientID");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Steelhead/", "setPortalClientID"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {traffic_managers, ids});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
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
     * Sets the key used to authenticate the supplied traffic managers
     * to the cloud portal. Only required in 'portal' and 'local' discovery
     * modes.
     */
    public void setPortalClientKey(java.lang.String[] traffic_managers, java.lang.String[] keys) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[15]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Steelhead/setPortalClientKey");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Steelhead/", "setPortalClientKey"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {traffic_managers, keys});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
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
     * Sets the hostname or IP address of the cloud portal to use.
     * Only required when using the 'local' discovery mode.
     */
    public void setPortalHost(java.lang.String[] traffic_managers, java.lang.String[] hosts) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[16]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Steelhead/setPortalHost");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Steelhead/", "setPortalHost"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {traffic_managers, hosts});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
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
     * Set the hostname or IP address of the proxy that portal communication
     * should go through. Set to the empty string to not use a proxy. Configured
     * per traffic manager.
     */
    public void setProxyHost(java.lang.String[] traffic_managers, java.lang.String[] hosts) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[17]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Steelhead/setProxyHost");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Steelhead/", "setProxyHost"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {traffic_managers, hosts});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
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
     * Sets the current proxy server port for each of the named traffic
     * managers. Only used if a proxy host has been specified, can be set
     * to the empty string otherwise.
     */
    public void setProxyPort(java.lang.String[] traffic_managers, java.lang.String[] ports) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[18]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Steelhead/setProxyPort");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Steelhead/", "setProxyPort"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {traffic_managers, ports});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
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
     * Sets an array of Cloud Steelhead IP addresses that each of
     * the named traffic managers should use. Only required when using the
     * 'manual' discovery mode.
     */
    public void setSteelheadIPs(java.lang.String[] traffic_managers, java.lang.String[][] ips) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[19]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Steelhead/setSteelheadIPs");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Steelhead/", "setSteelheadIPs"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {traffic_managers, ips});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
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

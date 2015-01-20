/**
 * SystemStatsBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.zeus.soap.zxtm._1_0;

public class SystemStatsBindingStub extends org.apache.axis.client.Stub implements com.zeus.soap.zxtm._1_0.SystemStatsPort {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[308];
        _initOperationDesc1();
        _initOperationDesc2();
        _initOperationDesc3();
        _initOperationDesc4();
        _initOperationDesc5();
        _initOperationDesc6();
        _initOperationDesc7();
        _initOperationDesc8();
        _initOperationDesc9();
        _initOperationDesc10();
        _initOperationDesc11();
        _initOperationDesc12();
        _initOperationDesc13();
        _initOperationDesc14();
        _initOperationDesc15();
        _initOperationDesc16();
        _initOperationDesc17();
        _initOperationDesc18();
        _initOperationDesc19();
        _initOperationDesc20();
        _initOperationDesc21();
        _initOperationDesc22();
        _initOperationDesc23();
        _initOperationDesc24();
        _initOperationDesc25();
        _initOperationDesc26();
        _initOperationDesc27();
        _initOperationDesc28();
        _initOperationDesc29();
        _initOperationDesc30();
        _initOperationDesc31();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getActionNumber");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getActions");
        oper.setReturnType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"));
        oper.setReturnClass(java.lang.String[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getActionsProcessed");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "intArray"));
        oper.setReturnClass(int[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidInput",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidInput"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidObjectName",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidObjectName"), 
                      true
                     ));
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getAspSessionCacheEntries");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getAspSessionCacheEntriesMax");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getAspSessionCacheHitRate");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getAspSessionCacheHits");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getAspSessionCacheLookups");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getAspSessionCacheMisses");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getAspSessionCacheOldest");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[9] = oper;

    }

    private static void _initOperationDesc2(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getAuthenticatorErrors");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "intArray"));
        oper.setReturnClass(int[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidInput",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidInput"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidObjectName",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidObjectName"), 
                      true
                     ));
        _operations[10] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getAuthenticatorFails");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "intArray"));
        oper.setReturnClass(int[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidInput",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidInput"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidObjectName",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidObjectName"), 
                      true
                     ));
        _operations[11] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getAuthenticatorNumber");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[12] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getAuthenticatorPasses");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "intArray"));
        oper.setReturnClass(int[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidInput",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidInput"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidObjectName",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidObjectName"), 
                      true
                     ));
        _operations[13] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getAuthenticatorRequests");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "intArray"));
        oper.setReturnClass(int[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidInput",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidInput"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidObjectName",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidObjectName"), 
                      true
                     ));
        _operations[14] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getAuthenticators");
        oper.setReturnType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"));
        oper.setReturnClass(java.lang.String[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[15] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getBandwidthClassBytesOut");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "System.Stats.longArray"));
        oper.setReturnClass(long[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidInput",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidInput"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidObjectName",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidObjectName"), 
                      true
                     ));
        _operations[16] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getBandwidthClassGuarantee");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "intArray"));
        oper.setReturnClass(int[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidInput",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidInput"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidObjectName",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidObjectName"), 
                      true
                     ));
        _operations[17] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getBandwidthClassMaximum");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "intArray"));
        oper.setReturnClass(int[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidInput",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidInput"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidObjectName",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidObjectName"), 
                      true
                     ));
        _operations[18] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getBandwidthClassNumber");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[19] = oper;

    }

    private static void _initOperationDesc3(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getBandwidthClasses");
        oper.setReturnType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"));
        oper.setReturnClass(java.lang.String[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[20] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getCloudcredentialsClassNumber");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[21] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getCloudcredentialsNodeCreations");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "intArray"));
        oper.setReturnClass(int[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidInput",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidInput"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidObjectName",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidObjectName"), 
                      true
                     ));
        _operations[22] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getCloudcredentialsNodeDeletions");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "intArray"));
        oper.setReturnClass(int[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidInput",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidInput"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidObjectName",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidObjectName"), 
                      true
                     ));
        _operations[23] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getCloudcredentialsStatusRequests");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "intArray"));
        oper.setReturnClass(int[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidInput",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidInput"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidObjectName",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidObjectName"), 
                      true
                     ));
        _operations[24] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getCloudcredentialses");
        oper.setReturnType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"));
        oper.setReturnClass(java.lang.String[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[25] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getDataEntries");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[26] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getDataMemoryUsage");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[27] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getEventNumber");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[28] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getEvents");
        oper.setReturnType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"));
        oper.setReturnClass(java.lang.String[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[29] = oper;

    }

    private static void _initOperationDesc4(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getEventsMatched");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "intArray"));
        oper.setReturnClass(int[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidInput",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidInput"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidObjectName",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidObjectName"), 
                      true
                     ));
        _operations[30] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getEventsSeen");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[31] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getGlbServiceDiscarded");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "intArray"));
        oper.setReturnClass(int[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidInput",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidInput"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidObjectName",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidObjectName"), 
                      true
                     ));
        _operations[32] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getGlbServiceNumber");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[33] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getGlbServiceResponses");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "intArray"));
        oper.setReturnClass(int[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidInput",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidInput"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidObjectName",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidObjectName"), 
                      true
                     ));
        _operations[34] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getGlbServiceUnmodified");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "intArray"));
        oper.setReturnClass(int[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidInput",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidInput"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidObjectName",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidObjectName"), 
                      true
                     ));
        _operations[35] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getGlbServices");
        oper.setReturnType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"));
        oper.setReturnClass(java.lang.String[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[36] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getInterfaceCollisions");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "intArray"));
        oper.setReturnClass(int[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidInput",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidInput"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidObjectName",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidObjectName"), 
                      true
                     ));
        _operations[37] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getInterfaceNumber");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[38] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getInterfaceRxBytes");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "System.Stats.longArray"));
        oper.setReturnClass(long[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidInput",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidInput"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidObjectName",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidObjectName"), 
                      true
                     ));
        _operations[39] = oper;

    }

    private static void _initOperationDesc5(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getInterfaceRxErrors");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "intArray"));
        oper.setReturnClass(int[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidInput",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidInput"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidObjectName",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidObjectName"), 
                      true
                     ));
        _operations[40] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getInterfaceRxPackets");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "intArray"));
        oper.setReturnClass(int[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidInput",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidInput"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidObjectName",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidObjectName"), 
                      true
                     ));
        _operations[41] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getInterfaceTxBytes");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "System.Stats.longArray"));
        oper.setReturnClass(long[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidInput",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidInput"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidObjectName",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidObjectName"), 
                      true
                     ));
        _operations[42] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getInterfaceTxErrors");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "intArray"));
        oper.setReturnClass(int[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidInput",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidInput"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidObjectName",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidObjectName"), 
                      true
                     ));
        _operations[43] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getInterfaceTxPackets");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "intArray"));
        oper.setReturnClass(int[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidInput",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidInput"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidObjectName",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidObjectName"), 
                      true
                     ));
        _operations[44] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getInterfaces");
        oper.setReturnType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"));
        oper.setReturnClass(java.lang.String[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[45] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getIpSessionCacheEntries");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[46] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getIpSessionCacheEntriesMax");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[47] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getIpSessionCacheHitRate");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[48] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getIpSessionCacheHits");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[49] = oper;

    }

    private static void _initOperationDesc6(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getIpSessionCacheLookups");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[50] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getIpSessionCacheMisses");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[51] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getIpSessionCacheOldest");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[52] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getJ2eeSessionCacheEntries");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[53] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getJ2eeSessionCacheEntriesMax");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[54] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getJ2eeSessionCacheHitRate");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[55] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getJ2eeSessionCacheHits");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[56] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getJ2eeSessionCacheLookups");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[57] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getJ2eeSessionCacheMisses");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[58] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getJ2eeSessionCacheOldest");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[59] = oper;

    }

    private static void _initOperationDesc7(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getLicensekeyNumber");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[60] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getListenIPBytesIn");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "listen_ip_addresses"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "System.Stats.longArray"));
        oper.setReturnClass(long[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidInput",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidInput"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidObjectName",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidObjectName"), 
                      true
                     ));
        _operations[61] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getListenIPBytesOut");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "listen_ip_addresses"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "System.Stats.longArray"));
        oper.setReturnClass(long[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidInput",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidInput"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidObjectName",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidObjectName"), 
                      true
                     ));
        _operations[62] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getListenIPCurrentConn");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "listen_ip_addresses"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "intArray"));
        oper.setReturnClass(int[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidInput",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidInput"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidObjectName",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidObjectName"), 
                      true
                     ));
        _operations[63] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getListenIPMaxConn");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "listen_ip_addresses"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "intArray"));
        oper.setReturnClass(int[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidInput",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidInput"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidObjectName",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidObjectName"), 
                      true
                     ));
        _operations[64] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getListenIPTotalConn");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "listen_ip_addresses"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "intArray"));
        oper.setReturnClass(int[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidInput",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidInput"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidObjectName",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidObjectName"), 
                      true
                     ));
        _operations[65] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getListenIPs");
        oper.setReturnType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"));
        oper.setReturnClass(java.lang.String[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[66] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getLocationLoad");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "intArray"));
        oper.setReturnClass(int[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidInput",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidInput"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidObjectName",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidObjectName"), 
                      true
                     ));
        _operations[67] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getLocationResponses");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "intArray"));
        oper.setReturnClass(int[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidInput",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidInput"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidObjectName",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidObjectName"), 
                      true
                     ));
        _operations[68] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getLocations");
        oper.setReturnType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"));
        oper.setReturnClass(java.lang.String[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[69] = oper;

    }

    private static void _initOperationDesc8(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getMonitorNumber");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[70] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getNodeBytesFromNode");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "nodes"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "System.Stats.NodeArray"), com.zeus.soap.zxtm._1_0.SystemStatsNode[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "System.Stats.longArray"));
        oper.setReturnClass(long[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidInput",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidInput"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidObjectName",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidObjectName"), 
                      true
                     ));
        _operations[71] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getNodeBytesToNode");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "nodes"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "System.Stats.NodeArray"), com.zeus.soap.zxtm._1_0.SystemStatsNode[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "System.Stats.longArray"));
        oper.setReturnClass(long[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidInput",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidInput"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidObjectName",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidObjectName"), 
                      true
                     ));
        _operations[72] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getNodeCurrentConn");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "nodes"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "System.Stats.NodeArray"), com.zeus.soap.zxtm._1_0.SystemStatsNode[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "intArray"));
        oper.setReturnClass(int[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidInput",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidInput"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidObjectName",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidObjectName"), 
                      true
                     ));
        _operations[73] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getNodeCurrentRequests");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "nodes"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "System.Stats.NodeArray"), com.zeus.soap.zxtm._1_0.SystemStatsNode[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "intArray"));
        oper.setReturnClass(int[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidInput",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidInput"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidObjectName",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidObjectName"), 
                      true
                     ));
        _operations[74] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getNodeErrors");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "nodes"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "System.Stats.NodeArray"), com.zeus.soap.zxtm._1_0.SystemStatsNode[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "intArray"));
        oper.setReturnClass(int[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidInput",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidInput"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidObjectName",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidObjectName"), 
                      true
                     ));
        _operations[75] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getNodeFailures");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "nodes"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "System.Stats.NodeArray"), com.zeus.soap.zxtm._1_0.SystemStatsNode[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "intArray"));
        oper.setReturnClass(int[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidInput",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidInput"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidObjectName",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidObjectName"), 
                      true
                     ));
        _operations[76] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getNodeIdleConns");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "nodes"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "System.Stats.NodeArray"), com.zeus.soap.zxtm._1_0.SystemStatsNode[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "intArray"));
        oper.setReturnClass(int[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidInput",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidInput"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidObjectName",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidObjectName"), 
                      true
                     ));
        _operations[77] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getNodeNewConn");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "nodes"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "System.Stats.NodeArray"), com.zeus.soap.zxtm._1_0.SystemStatsNode[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "intArray"));
        oper.setReturnClass(int[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidInput",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidInput"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidObjectName",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidObjectName"), 
                      true
                     ));
        _operations[78] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getNodeNumber");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[79] = oper;

    }

    private static void _initOperationDesc9(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getNodePooledConn");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "nodes"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "System.Stats.NodeArray"), com.zeus.soap.zxtm._1_0.SystemStatsNode[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "intArray"));
        oper.setReturnClass(int[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidInput",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidInput"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidObjectName",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidObjectName"), 
                      true
                     ));
        _operations[80] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getNodeResponseMax");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "nodes"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "System.Stats.NodeArray"), com.zeus.soap.zxtm._1_0.SystemStatsNode[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "intArray"));
        oper.setReturnClass(int[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidInput",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidInput"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidObjectName",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidObjectName"), 
                      true
                     ));
        _operations[81] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getNodeResponseMean");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "nodes"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "System.Stats.NodeArray"), com.zeus.soap.zxtm._1_0.SystemStatsNode[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "intArray"));
        oper.setReturnClass(int[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidInput",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidInput"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidObjectName",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidObjectName"), 
                      true
                     ));
        _operations[82] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getNodeResponseMin");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "nodes"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "System.Stats.NodeArray"), com.zeus.soap.zxtm._1_0.SystemStatsNode[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "intArray"));
        oper.setReturnClass(int[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidInput",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidInput"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidObjectName",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidObjectName"), 
                      true
                     ));
        _operations[83] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getNodeState");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "nodes"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "System.Stats.NodeArray"), com.zeus.soap.zxtm._1_0.SystemStatsNode[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "System.Stats.NodeStateArray"));
        oper.setReturnClass(com.zeus.soap.zxtm._1_0.SystemStatsNodeState[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidInput",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidInput"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidObjectName",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidObjectName"), 
                      true
                     ));
        _operations[84] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getNodeTotalConn");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "nodes"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "System.Stats.NodeArray"), com.zeus.soap.zxtm._1_0.SystemStatsNode[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "intArray"));
        oper.setReturnClass(int[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidInput",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidInput"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidObjectName",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidObjectName"), 
                      true
                     ));
        _operations[85] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getNodes");
        oper.setReturnType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "System.Stats.NodeArray"));
        oper.setReturnClass(com.zeus.soap.zxtm._1_0.SystemStatsNode[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[86] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getNumIdleConnections");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[87] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getNumberChildProcesses");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[88] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getNumberDNSACacheHits");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[89] = oper;

    }

    private static void _initOperationDesc10(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getNumberDNSARequests");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[90] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getNumberDNSPTRCacheHits");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[91] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getNumberDNSPTRRequests");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[92] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getNumberSNMPBadRequests");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[93] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getNumberSNMPGetBulkRequests");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[94] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getNumberSNMPGetNextRequests");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[95] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getNumberSNMPGetRequests");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[96] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getNumberSNMPUnauthorisedRequests");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[97] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getPerLocationServiceDraining");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "per_location_services"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "System.Stats.PerLocationServiceArray"), com.zeus.soap.zxtm._1_0.SystemStatsPerLocationService[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "System.Stats.PerLocationServiceDrainingArray"));
        oper.setReturnClass(com.zeus.soap.zxtm._1_0.SystemStatsPerLocationServiceDraining[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidInput",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidInput"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidObjectName",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidObjectName"), 
                      true
                     ));
        _operations[98] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getPerLocationServiceFrontendState");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "per_location_services"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "System.Stats.PerLocationServiceArray"), com.zeus.soap.zxtm._1_0.SystemStatsPerLocationService[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "System.Stats.PerLocationServiceFrontendStateArray"));
        oper.setReturnClass(com.zeus.soap.zxtm._1_0.SystemStatsPerLocationServiceFrontendState[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidInput",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidInput"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidObjectName",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidObjectName"), 
                      true
                     ));
        _operations[99] = oper;

    }

    private static void _initOperationDesc11(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getPerLocationServiceLoad");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "per_location_services"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "System.Stats.PerLocationServiceArray"), com.zeus.soap.zxtm._1_0.SystemStatsPerLocationService[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "intArray"));
        oper.setReturnClass(int[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidInput",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidInput"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidObjectName",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidObjectName"), 
                      true
                     ));
        _operations[100] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getPerLocationServiceMonitorState");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "per_location_services"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "System.Stats.PerLocationServiceArray"), com.zeus.soap.zxtm._1_0.SystemStatsPerLocationService[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "System.Stats.PerLocationServiceMonitorStateArray"));
        oper.setReturnClass(com.zeus.soap.zxtm._1_0.SystemStatsPerLocationServiceMonitorState[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidInput",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidInput"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidObjectName",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidObjectName"), 
                      true
                     ));
        _operations[101] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getPerLocationServiceResponses");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "per_location_services"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "System.Stats.PerLocationServiceArray"), com.zeus.soap.zxtm._1_0.SystemStatsPerLocationService[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "intArray"));
        oper.setReturnClass(int[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidInput",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidInput"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidObjectName",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidObjectName"), 
                      true
                     ));
        _operations[102] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getPerLocationServiceState");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "per_location_services"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "System.Stats.PerLocationServiceArray"), com.zeus.soap.zxtm._1_0.SystemStatsPerLocationService[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "System.Stats.PerLocationServiceStateArray"));
        oper.setReturnClass(com.zeus.soap.zxtm._1_0.SystemStatsPerLocationServiceState[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidInput",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidInput"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidObjectName",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidObjectName"), 
                      true
                     ));
        _operations[103] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getPerLocationServices");
        oper.setReturnType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "System.Stats.PerLocationServiceArray"));
        oper.setReturnClass(com.zeus.soap.zxtm._1_0.SystemStatsPerLocationService[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[104] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getPerNodeServiceLevelResponseMax");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "per_node_service_levels"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "System.Stats.PerNodeServiceLevelArray"), com.zeus.soap.zxtm._1_0.SystemStatsPerNodeServiceLevel[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "intArray"));
        oper.setReturnClass(int[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidInput",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidInput"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidObjectName",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidObjectName"), 
                      true
                     ));
        _operations[105] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getPerNodeServiceLevelResponseMean");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "per_node_service_levels"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "System.Stats.PerNodeServiceLevelArray"), com.zeus.soap.zxtm._1_0.SystemStatsPerNodeServiceLevel[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "intArray"));
        oper.setReturnClass(int[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidInput",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidInput"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidObjectName",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidObjectName"), 
                      true
                     ));
        _operations[106] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getPerNodeServiceLevelResponseMin");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "per_node_service_levels"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "System.Stats.PerNodeServiceLevelArray"), com.zeus.soap.zxtm._1_0.SystemStatsPerNodeServiceLevel[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "intArray"));
        oper.setReturnClass(int[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidInput",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidInput"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidObjectName",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidObjectName"), 
                      true
                     ));
        _operations[107] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getPerNodeServiceLevelTotalConn");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "per_node_service_levels"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "System.Stats.PerNodeServiceLevelArray"), com.zeus.soap.zxtm._1_0.SystemStatsPerNodeServiceLevel[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "intArray"));
        oper.setReturnClass(int[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidInput",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidInput"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidObjectName",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidObjectName"), 
                      true
                     ));
        _operations[108] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getPerNodeServiceLevelTotalNonConf");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "per_node_service_levels"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "System.Stats.PerNodeServiceLevelArray"), com.zeus.soap.zxtm._1_0.SystemStatsPerNodeServiceLevel[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "intArray"));
        oper.setReturnClass(int[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidInput",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidInput"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidObjectName",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidObjectName"), 
                      true
                     ));
        _operations[109] = oper;

    }

    private static void _initOperationDesc12(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getPerNodeServiceLevels");
        oper.setReturnType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "System.Stats.PerNodeServiceLevelArray"));
        oper.setReturnClass(com.zeus.soap.zxtm._1_0.SystemStatsPerNodeServiceLevel[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[110] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getPerPoolNodeBytesFromNode");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "per_pool_nodes"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "System.Stats.PerPoolNodeArray"), com.zeus.soap.zxtm._1_0.SystemStatsPerPoolNode[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "System.Stats.longArray"));
        oper.setReturnClass(long[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidInput",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidInput"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidObjectName",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidObjectName"), 
                      true
                     ));
        _operations[111] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getPerPoolNodeBytesToNode");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "per_pool_nodes"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "System.Stats.PerPoolNodeArray"), com.zeus.soap.zxtm._1_0.SystemStatsPerPoolNode[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "System.Stats.longArray"));
        oper.setReturnClass(long[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidInput",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidInput"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidObjectName",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidObjectName"), 
                      true
                     ));
        _operations[112] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getPerPoolNodeCurrentConn");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "per_pool_nodes"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "System.Stats.PerPoolNodeArray"), com.zeus.soap.zxtm._1_0.SystemStatsPerPoolNode[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "intArray"));
        oper.setReturnClass(int[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidInput",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidInput"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidObjectName",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidObjectName"), 
                      true
                     ));
        _operations[113] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getPerPoolNodeCurrentRequests");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "per_pool_nodes"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "System.Stats.PerPoolNodeArray"), com.zeus.soap.zxtm._1_0.SystemStatsPerPoolNode[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "intArray"));
        oper.setReturnClass(int[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidInput",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidInput"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidObjectName",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidObjectName"), 
                      true
                     ));
        _operations[114] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getPerPoolNodeErrors");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "per_pool_nodes"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "System.Stats.PerPoolNodeArray"), com.zeus.soap.zxtm._1_0.SystemStatsPerPoolNode[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "intArray"));
        oper.setReturnClass(int[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidInput",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidInput"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidObjectName",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidObjectName"), 
                      true
                     ));
        _operations[115] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getPerPoolNodeFailures");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "per_pool_nodes"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "System.Stats.PerPoolNodeArray"), com.zeus.soap.zxtm._1_0.SystemStatsPerPoolNode[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "intArray"));
        oper.setReturnClass(int[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidInput",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidInput"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidObjectName",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidObjectName"), 
                      true
                     ));
        _operations[116] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getPerPoolNodeIdleConns");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "per_pool_nodes"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "System.Stats.PerPoolNodeArray"), com.zeus.soap.zxtm._1_0.SystemStatsPerPoolNode[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "intArray"));
        oper.setReturnClass(int[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidInput",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidInput"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidObjectName",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidObjectName"), 
                      true
                     ));
        _operations[117] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getPerPoolNodeNewConn");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "per_pool_nodes"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "System.Stats.PerPoolNodeArray"), com.zeus.soap.zxtm._1_0.SystemStatsPerPoolNode[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "intArray"));
        oper.setReturnClass(int[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidInput",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidInput"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidObjectName",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidObjectName"), 
                      true
                     ));
        _operations[118] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getPerPoolNodeNumber");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[119] = oper;

    }

    private static void _initOperationDesc13(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getPerPoolNodePooledConn");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "per_pool_nodes"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "System.Stats.PerPoolNodeArray"), com.zeus.soap.zxtm._1_0.SystemStatsPerPoolNode[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "intArray"));
        oper.setReturnClass(int[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidInput",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidInput"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidObjectName",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidObjectName"), 
                      true
                     ));
        _operations[120] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getPerPoolNodeResponseMax");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "per_pool_nodes"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "System.Stats.PerPoolNodeArray"), com.zeus.soap.zxtm._1_0.SystemStatsPerPoolNode[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "intArray"));
        oper.setReturnClass(int[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidInput",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidInput"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidObjectName",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidObjectName"), 
                      true
                     ));
        _operations[121] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getPerPoolNodeResponseMean");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "per_pool_nodes"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "System.Stats.PerPoolNodeArray"), com.zeus.soap.zxtm._1_0.SystemStatsPerPoolNode[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "intArray"));
        oper.setReturnClass(int[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidInput",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidInput"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidObjectName",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidObjectName"), 
                      true
                     ));
        _operations[122] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getPerPoolNodeResponseMin");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "per_pool_nodes"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "System.Stats.PerPoolNodeArray"), com.zeus.soap.zxtm._1_0.SystemStatsPerPoolNode[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "intArray"));
        oper.setReturnClass(int[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidInput",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidInput"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidObjectName",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidObjectName"), 
                      true
                     ));
        _operations[123] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getPerPoolNodeState");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "per_pool_nodes"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "System.Stats.PerPoolNodeArray"), com.zeus.soap.zxtm._1_0.SystemStatsPerPoolNode[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "System.Stats.PerPoolNodeStateArray"));
        oper.setReturnClass(com.zeus.soap.zxtm._1_0.SystemStatsPerPoolNodeState[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidInput",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidInput"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidObjectName",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidObjectName"), 
                      true
                     ));
        _operations[124] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getPerPoolNodeTotalConn");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "per_pool_nodes"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "System.Stats.PerPoolNodeArray"), com.zeus.soap.zxtm._1_0.SystemStatsPerPoolNode[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "intArray"));
        oper.setReturnClass(int[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidInput",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidInput"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidObjectName",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidObjectName"), 
                      true
                     ));
        _operations[125] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getPerPoolNodes");
        oper.setReturnType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "System.Stats.PerPoolNodeArray"));
        oper.setReturnClass(com.zeus.soap.zxtm._1_0.SystemStatsPerPoolNode[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[126] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getPoolAlgorithm");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "System.Stats.PoolAlgorithmArray"));
        oper.setReturnClass(com.zeus.soap.zxtm._1_0.SystemStatsPoolAlgorithm[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidInput",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidInput"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidObjectName",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidObjectName"), 
                      true
                     ));
        _operations[127] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getPoolBytesIn");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "System.Stats.longArray"));
        oper.setReturnClass(long[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidInput",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidInput"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidObjectName",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidObjectName"), 
                      true
                     ));
        _operations[128] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getPoolBytesOut");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "System.Stats.longArray"));
        oper.setReturnClass(long[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidInput",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidInput"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidObjectName",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidObjectName"), 
                      true
                     ));
        _operations[129] = oper;

    }

    private static void _initOperationDesc14(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getPoolConnsQueued");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "intArray"));
        oper.setReturnClass(int[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[130] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getPoolDisabled");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "intArray"));
        oper.setReturnClass(int[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidInput",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidInput"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidObjectName",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidObjectName"), 
                      true
                     ));
        _operations[131] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getPoolDraining");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "intArray"));
        oper.setReturnClass(int[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidInput",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidInput"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidObjectName",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidObjectName"), 
                      true
                     ));
        _operations[132] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getPoolMaxQueueTime");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "intArray"));
        oper.setReturnClass(int[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[133] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getPoolMeanQueueTime");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "intArray"));
        oper.setReturnClass(int[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[134] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getPoolMinQueueTime");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "intArray"));
        oper.setReturnClass(int[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[135] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getPoolNodes");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "intArray"));
        oper.setReturnClass(int[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidInput",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidInput"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidObjectName",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidObjectName"), 
                      true
                     ));
        _operations[136] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getPoolNumber");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[137] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getPoolPersistence");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "System.Stats.PoolPersistenceArray"));
        oper.setReturnClass(com.zeus.soap.zxtm._1_0.SystemStatsPoolPersistence[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidInput",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidInput"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidObjectName",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidObjectName"), 
                      true
                     ));
        _operations[138] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getPoolQueueTimeouts");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "intArray"));
        oper.setReturnClass(int[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[139] = oper;

    }

    private static void _initOperationDesc15(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getPoolSessionMigrated");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "intArray"));
        oper.setReturnClass(int[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidInput",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidInput"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidObjectName",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidObjectName"), 
                      true
                     ));
        _operations[140] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getPoolState");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "System.Stats.PoolStateArray"));
        oper.setReturnClass(com.zeus.soap.zxtm._1_0.SystemStatsPoolState[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidInput",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidInput"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidObjectName",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidObjectName"), 
                      true
                     ));
        _operations[141] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getPoolTotalConn");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "intArray"));
        oper.setReturnClass(int[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidInput",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidInput"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidObjectName",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidObjectName"), 
                      true
                     ));
        _operations[142] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getPools");
        oper.setReturnType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"));
        oper.setReturnClass(java.lang.String[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[143] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getRateClassConnsEntered");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "intArray"));
        oper.setReturnClass(int[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidInput",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidInput"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidObjectName",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidObjectName"), 
                      true
                     ));
        _operations[144] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getRateClassConnsLeft");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "intArray"));
        oper.setReturnClass(int[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidInput",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidInput"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidObjectName",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidObjectName"), 
                      true
                     ));
        _operations[145] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getRateClassCurrentRate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "intArray"));
        oper.setReturnClass(int[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidInput",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidInput"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidObjectName",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidObjectName"), 
                      true
                     ));
        _operations[146] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getRateClassDropped");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "intArray"));
        oper.setReturnClass(int[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidInput",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidInput"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidObjectName",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidObjectName"), 
                      true
                     ));
        _operations[147] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getRateClassMaxRatePerMin");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "intArray"));
        oper.setReturnClass(int[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidInput",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidInput"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidObjectName",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidObjectName"), 
                      true
                     ));
        _operations[148] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getRateClassMaxRatePerSec");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "intArray"));
        oper.setReturnClass(int[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidInput",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidInput"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidObjectName",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidObjectName"), 
                      true
                     ));
        _operations[149] = oper;

    }

    private static void _initOperationDesc16(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getRateClassNumber");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[150] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getRateClassQueueLength");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "intArray"));
        oper.setReturnClass(int[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidInput",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidInput"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidObjectName",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidObjectName"), 
                      true
                     ));
        _operations[151] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getRateClasses");
        oper.setReturnType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"));
        oper.setReturnClass(java.lang.String[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[152] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getRuleAborts");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "intArray"));
        oper.setReturnClass(int[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidInput",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidInput"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidObjectName",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidObjectName"), 
                      true
                     ));
        _operations[153] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getRuleDiscards");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "intArray"));
        oper.setReturnClass(int[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidInput",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidInput"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidObjectName",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidObjectName"), 
                      true
                     ));
        _operations[154] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getRuleExecutions");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "intArray"));
        oper.setReturnClass(int[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidInput",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidInput"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidObjectName",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidObjectName"), 
                      true
                     ));
        _operations[155] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getRuleNumber");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[156] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getRulePoolSelect");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "intArray"));
        oper.setReturnClass(int[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidInput",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidInput"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidObjectName",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidObjectName"), 
                      true
                     ));
        _operations[157] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getRuleResponds");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "intArray"));
        oper.setReturnClass(int[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidInput",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidInput"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidObjectName",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidObjectName"), 
                      true
                     ));
        _operations[158] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getRuleRetries");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "intArray"));
        oper.setReturnClass(int[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidInput",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidInput"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidObjectName",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidObjectName"), 
                      true
                     ));
        _operations[159] = oper;

    }

    private static void _initOperationDesc17(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getRules");
        oper.setReturnType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"));
        oper.setReturnClass(java.lang.String[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[160] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getServiceLevelConforming");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "intArray"));
        oper.setReturnClass(int[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidInput",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidInput"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidObjectName",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidObjectName"), 
                      true
                     ));
        _operations[161] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getServiceLevelCurrentConns");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "intArray"));
        oper.setReturnClass(int[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidInput",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidInput"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidObjectName",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidObjectName"), 
                      true
                     ));
        _operations[162] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getServiceLevelIsOK");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "System.Stats.ServiceLevelIsOKArray"));
        oper.setReturnClass(com.zeus.soap.zxtm._1_0.SystemStatsServiceLevelIsOK[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidInput",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidInput"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidObjectName",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidObjectName"), 
                      true
                     ));
        _operations[163] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getServiceLevelNumber");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[164] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getServiceLevelResponseMax");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "intArray"));
        oper.setReturnClass(int[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidInput",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidInput"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidObjectName",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidObjectName"), 
                      true
                     ));
        _operations[165] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getServiceLevelResponseMean");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "intArray"));
        oper.setReturnClass(int[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidInput",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidInput"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidObjectName",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidObjectName"), 
                      true
                     ));
        _operations[166] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getServiceLevelResponseMin");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "intArray"));
        oper.setReturnClass(int[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidInput",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidInput"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidObjectName",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidObjectName"), 
                      true
                     ));
        _operations[167] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getServiceLevelTotalConn");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "intArray"));
        oper.setReturnClass(int[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidInput",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidInput"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidObjectName",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidObjectName"), 
                      true
                     ));
        _operations[168] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getServiceLevelTotalNonConf");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "intArray"));
        oper.setReturnClass(int[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidInput",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidInput"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidObjectName",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidObjectName"), 
                      true
                     ));
        _operations[169] = oper;

    }

    private static void _initOperationDesc18(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getServiceLevels");
        oper.setReturnType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"));
        oper.setReturnClass(java.lang.String[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[170] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getServiceProtLastRefusalTime");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "intArray"));
        oper.setReturnClass(int[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidInput",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidInput"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidObjectName",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidObjectName"), 
                      true
                     ));
        _operations[171] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getServiceProtNumber");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[172] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getServiceProtRefusalBinary");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "intArray"));
        oper.setReturnClass(int[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidInput",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidInput"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidObjectName",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidObjectName"), 
                      true
                     ));
        _operations[173] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getServiceProtRefusalConc10IP");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "intArray"));
        oper.setReturnClass(int[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidInput",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidInput"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidObjectName",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidObjectName"), 
                      true
                     ));
        _operations[174] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getServiceProtRefusalConc1IP");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "intArray"));
        oper.setReturnClass(int[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidInput",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidInput"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidObjectName",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidObjectName"), 
                      true
                     ));
        _operations[175] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getServiceProtRefusalConnRate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "intArray"));
        oper.setReturnClass(int[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidInput",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidInput"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidObjectName",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidObjectName"), 
                      true
                     ));
        _operations[176] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getServiceProtRefusalIP");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "intArray"));
        oper.setReturnClass(int[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidInput",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidInput"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidObjectName",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidObjectName"), 
                      true
                     ));
        _operations[177] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getServiceProtRefusalRFC2396");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "intArray"));
        oper.setReturnClass(int[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidInput",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidInput"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidObjectName",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidObjectName"), 
                      true
                     ));
        _operations[178] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getServiceProtRefusalSize");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "intArray"));
        oper.setReturnClass(int[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidInput",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidInput"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidObjectName",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidObjectName"), 
                      true
                     ));
        _operations[179] = oper;

    }

    private static void _initOperationDesc19(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getServiceProtTotalRefusal");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "intArray"));
        oper.setReturnClass(int[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidInput",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidInput"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidObjectName",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidObjectName"), 
                      true
                     ));
        _operations[180] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getServiceProts");
        oper.setReturnType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"));
        oper.setReturnClass(java.lang.String[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[181] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getSslCacheEntries");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[182] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getSslCacheEntriesMax");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[183] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getSslCacheHitRate");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[184] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getSslCacheHits");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[185] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getSslCacheLookups");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[186] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getSslCacheMisses");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[187] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getSslCacheOldest");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[188] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getSslCipher3DESDecrypts");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[189] = oper;

    }

    private static void _initOperationDesc20(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getSslCipher3DESEncrypts");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[190] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getSslCipherAESDecrypts");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[191] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getSslCipherAESEncrypts");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[192] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getSslCipherDESDecrypts");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[193] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getSslCipherDESEncrypts");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[194] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getSslCipherDecrypts");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[195] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getSslCipherEncrypts");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[196] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getSslCipherRC4Decrypts");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[197] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getSslCipherRC4Encrypts");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[198] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getSslCipherRSADecrypts");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[199] = oper;

    }

    private static void _initOperationDesc21(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getSslCipherRSADecryptsExternal");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[200] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getSslCipherRSAEncrypts");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[201] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getSslCipherRSAEncryptsExternal");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[202] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getSslClientCertExpired");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[203] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getSslClientCertInvalid");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[204] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getSslClientCertNotSent");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[205] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getSslClientCertRevoked");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[206] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getSslConnections");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[207] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getSslHandshakeSSLv2");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[208] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getSslHandshakeSSLv3");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[209] = oper;

    }

    private static void _initOperationDesc22(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getSslHandshakeTLSv1");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[210] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getSslHandshakeTLSv11");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[211] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getSslSessionCacheEntries");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[212] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getSslSessionCacheEntriesMax");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[213] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getSslSessionCacheHitRate");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[214] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getSslSessionCacheHits");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[215] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getSslSessionCacheLookups");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[216] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getSslSessionCacheMisses");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[217] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getSslSessionCacheOldest");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[218] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getSslSessionIDDiskCacheHit");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[219] = oper;

    }

    private static void _initOperationDesc23(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getSslSessionIDDiskCacheMiss");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[220] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getSslSessionIDMemCacheHit");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[221] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getSslSessionIDMemCacheMiss");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[222] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getSteelheadNumber");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[223] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getSteelheadOptimized");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "intArray"));
        oper.setReturnClass(int[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidInput",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidInput"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidObjectName",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidObjectName"), 
                      true
                     ));
        _operations[224] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getSteelheads");
        oper.setReturnType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"));
        oper.setReturnClass(java.lang.String[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[225] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getSysCPUBusyPercent");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[226] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getSysCPUIdlePercent");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[227] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getSysCPUSystemBusyPercent");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[228] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getSysCPUUserBusyPercent");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[229] = oper;

    }

    private static void _initOperationDesc24(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getSysFDsFree");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[230] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getSysMemBuffered");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[231] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getSysMemFree");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[232] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getSysMemInUse");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[233] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getSysMemSwapTotal");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[234] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getSysMemSwapped");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[235] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getSysMemTotal");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[236] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getTimeLastConfigUpdate");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[237] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getTotalBackendServerErrors");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[238] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getTotalBadDNSPackets");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[239] = oper;

    }

    private static void _initOperationDesc25(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getTotalBytesIn");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        oper.setReturnClass(long.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[240] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getTotalBytesOut");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        oper.setReturnClass(long.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[241] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getTotalConn");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[242] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getTotalCurrentConn");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[243] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getTotalDNSResponses");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[244] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getTotalRequests");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[245] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getTotalTransactions");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[246] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getTrafficIPARPMessage");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[247] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getTrafficIPGatewayPingRequests");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[248] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getTrafficIPGatewayPingResponses");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[249] = oper;

    }

    private static void _initOperationDesc26(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getTrafficIPNodePingRequests");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[250] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getTrafficIPNodePingResponses");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[251] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getTrafficIPNumber");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[252] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getTrafficIPNumberRaised");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[253] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getTrafficIPPingResponseErrors");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[254] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getTrafficIPState");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "traffic_ip_addresses"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "System.Stats.TrafficIPStateArray"));
        oper.setReturnClass(com.zeus.soap.zxtm._1_0.SystemStatsTrafficIPState[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidInput",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidInput"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidObjectName",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidObjectName"), 
                      true
                     ));
        _operations[255] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getTrafficIPTime");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "traffic_ip_addresses"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "intArray"));
        oper.setReturnClass(int[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidInput",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidInput"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidObjectName",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidObjectName"), 
                      true
                     ));
        _operations[256] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getTrafficIPs");
        oper.setReturnType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"));
        oper.setReturnClass(java.lang.String[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[257] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getUniSessionCacheEntries");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[258] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getUniSessionCacheEntriesMax");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[259] = oper;

    }

    private static void _initOperationDesc27(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getUniSessionCacheHitRate");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[260] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getUniSessionCacheHits");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[261] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getUniSessionCacheLookups");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[262] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getUniSessionCacheMisses");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[263] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getUniSessionCacheOldest");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[264] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getUpTime");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[265] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getUserCounter64Value");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "System.Stats.longArray"));
        oper.setReturnClass(long[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidInput",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidInput"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidObjectName",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidObjectName"), 
                      true
                     ));
        _operations[266] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getUserCounter64s");
        oper.setReturnType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"));
        oper.setReturnClass(java.lang.String[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[267] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getUserCounterNumber");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[268] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getUserCounterValue");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "intArray"));
        oper.setReturnClass(int[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidInput",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidInput"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidObjectName",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidObjectName"), 
                      true
                     ));
        _operations[269] = oper;

    }

    private static void _initOperationDesc28(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getUserCounters");
        oper.setReturnType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"));
        oper.setReturnClass(java.lang.String[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[270] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getVirtualserverBytesIn");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "System.Stats.longArray"));
        oper.setReturnClass(long[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidInput",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidInput"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidObjectName",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidObjectName"), 
                      true
                     ));
        _operations[271] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getVirtualserverBytesOut");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "System.Stats.longArray"));
        oper.setReturnClass(long[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidInput",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidInput"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidObjectName",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidObjectName"), 
                      true
                     ));
        _operations[272] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getVirtualserverConnectTimedOut");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "intArray"));
        oper.setReturnClass(int[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidInput",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidInput"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidObjectName",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidObjectName"), 
                      true
                     ));
        _operations[273] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getVirtualserverConnectionErrors");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "intArray"));
        oper.setReturnClass(int[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[274] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getVirtualserverConnectionFailures");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "intArray"));
        oper.setReturnClass(int[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[275] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getVirtualserverCurrentConn");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "intArray"));
        oper.setReturnClass(int[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidInput",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidInput"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidObjectName",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidObjectName"), 
                      true
                     ));
        _operations[276] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getVirtualserverDataTimedOut");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "intArray"));
        oper.setReturnClass(int[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidInput",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidInput"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidObjectName",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidObjectName"), 
                      true
                     ));
        _operations[277] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getVirtualserverDirectReplies");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "intArray"));
        oper.setReturnClass(int[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidInput",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidInput"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidObjectName",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidObjectName"), 
                      true
                     ));
        _operations[278] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getVirtualserverDiscard");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "intArray"));
        oper.setReturnClass(int[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidInput",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidInput"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidObjectName",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidObjectName"), 
                      true
                     ));
        _operations[279] = oper;

    }

    private static void _initOperationDesc29(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getVirtualserverGzip");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "intArray"));
        oper.setReturnClass(int[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidInput",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidInput"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidObjectName",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidObjectName"), 
                      true
                     ));
        _operations[280] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getVirtualserverGzipBytesSaved");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "System.Stats.longArray"));
        oper.setReturnClass(long[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidInput",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidInput"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidObjectName",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidObjectName"), 
                      true
                     ));
        _operations[281] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getVirtualserverHttpCacheHitRate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "intArray"));
        oper.setReturnClass(int[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidInput",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidInput"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidObjectName",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidObjectName"), 
                      true
                     ));
        _operations[282] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getVirtualserverHttpCacheHits");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "intArray"));
        oper.setReturnClass(int[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidInput",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidInput"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidObjectName",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidObjectName"), 
                      true
                     ));
        _operations[283] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getVirtualserverHttpCacheLookups");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "intArray"));
        oper.setReturnClass(int[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidInput",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidInput"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidObjectName",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidObjectName"), 
                      true
                     ));
        _operations[284] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getVirtualserverHttpRewriteCookie");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "intArray"));
        oper.setReturnClass(int[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidInput",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidInput"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidObjectName",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidObjectName"), 
                      true
                     ));
        _operations[285] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getVirtualserverHttpRewriteLocation");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "intArray"));
        oper.setReturnClass(int[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidInput",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidInput"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidObjectName",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidObjectName"), 
                      true
                     ));
        _operations[286] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getVirtualserverKeepaliveTimedOut");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "intArray"));
        oper.setReturnClass(int[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidInput",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidInput"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidObjectName",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidObjectName"), 
                      true
                     ));
        _operations[287] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getVirtualserverMaxConn");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "intArray"));
        oper.setReturnClass(int[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidInput",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidInput"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidObjectName",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidObjectName"), 
                      true
                     ));
        _operations[288] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getVirtualserverNumber");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[289] = oper;

    }

    private static void _initOperationDesc30(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getVirtualserverPort");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "intArray"));
        oper.setReturnClass(int[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidInput",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidInput"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidObjectName",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidObjectName"), 
                      true
                     ));
        _operations[290] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getVirtualserverProtocol");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "System.Stats.VirtualserverProtocolArray"));
        oper.setReturnClass(com.zeus.soap.zxtm._1_0.SystemStatsVirtualserverProtocol[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidInput",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidInput"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidObjectName",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidObjectName"), 
                      true
                     ));
        _operations[291] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getVirtualserverSIPRejectedRequests");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "intArray"));
        oper.setReturnClass(int[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidInput",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidInput"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidObjectName",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidObjectName"), 
                      true
                     ));
        _operations[292] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getVirtualserverSIPTotalCalls");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "intArray"));
        oper.setReturnClass(int[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidInput",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidInput"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidObjectName",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidObjectName"), 
                      true
                     ));
        _operations[293] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getVirtualserverTotalConn");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "intArray"));
        oper.setReturnClass(int[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidInput",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidInput"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidObjectName",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidObjectName"), 
                      true
                     ));
        _operations[294] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getVirtualserverTotalDgram");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "intArray"));
        oper.setReturnClass(int[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidInput",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidInput"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidObjectName",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidObjectName"), 
                      true
                     ));
        _operations[295] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getVirtualserverUdpTimedOut");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "intArray"));
        oper.setReturnClass(int[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidInput",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidInput"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidObjectName",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidObjectName"), 
                      true
                     ));
        _operations[296] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getVirtualservers");
        oper.setReturnType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"));
        oper.setReturnClass(java.lang.String[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[297] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getWebCacheEntries");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[298] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getWebCacheHitRate");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[299] = oper;

    }

    private static void _initOperationDesc31(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getWebCacheHits");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        oper.setReturnClass(long.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[300] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getWebCacheLookups");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        oper.setReturnClass(long.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[301] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getWebCacheMaxEntries");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[302] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getWebCacheMemMaximum");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[303] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getWebCacheMemUsed");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[304] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getWebCacheMisses");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        oper.setReturnClass(long.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[305] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getWebCacheOldest");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[306] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getZxtmNumber");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[307] = oper;

    }

    public SystemStatsBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public SystemStatsBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public SystemStatsBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
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

            qName = new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "System.Stats.longArray");
            cachedSerQNames.add(qName);
            cls = long[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "System.Stats.Node");
            cachedSerQNames.add(qName);
            cls = com.zeus.soap.zxtm._1_0.SystemStatsNode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "System.Stats.NodeArray");
            cachedSerQNames.add(qName);
            cls = com.zeus.soap.zxtm._1_0.SystemStatsNode[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "System.Stats.Node");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "System.Stats.NodeState");
            cachedSerQNames.add(qName);
            cls = com.zeus.soap.zxtm._1_0.SystemStatsNodeState.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "System.Stats.NodeStateArray");
            cachedSerQNames.add(qName);
            cls = com.zeus.soap.zxtm._1_0.SystemStatsNodeState[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "System.Stats.NodeState");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "System.Stats.PerLocationService");
            cachedSerQNames.add(qName);
            cls = com.zeus.soap.zxtm._1_0.SystemStatsPerLocationService.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "System.Stats.PerLocationServiceArray");
            cachedSerQNames.add(qName);
            cls = com.zeus.soap.zxtm._1_0.SystemStatsPerLocationService[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "System.Stats.PerLocationService");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "System.Stats.PerLocationServiceDraining");
            cachedSerQNames.add(qName);
            cls = com.zeus.soap.zxtm._1_0.SystemStatsPerLocationServiceDraining.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "System.Stats.PerLocationServiceDrainingArray");
            cachedSerQNames.add(qName);
            cls = com.zeus.soap.zxtm._1_0.SystemStatsPerLocationServiceDraining[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "System.Stats.PerLocationServiceDraining");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "System.Stats.PerLocationServiceFrontendState");
            cachedSerQNames.add(qName);
            cls = com.zeus.soap.zxtm._1_0.SystemStatsPerLocationServiceFrontendState.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "System.Stats.PerLocationServiceFrontendStateArray");
            cachedSerQNames.add(qName);
            cls = com.zeus.soap.zxtm._1_0.SystemStatsPerLocationServiceFrontendState[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "System.Stats.PerLocationServiceFrontendState");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "System.Stats.PerLocationServiceMonitorState");
            cachedSerQNames.add(qName);
            cls = com.zeus.soap.zxtm._1_0.SystemStatsPerLocationServiceMonitorState.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "System.Stats.PerLocationServiceMonitorStateArray");
            cachedSerQNames.add(qName);
            cls = com.zeus.soap.zxtm._1_0.SystemStatsPerLocationServiceMonitorState[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "System.Stats.PerLocationServiceMonitorState");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "System.Stats.PerLocationServiceState");
            cachedSerQNames.add(qName);
            cls = com.zeus.soap.zxtm._1_0.SystemStatsPerLocationServiceState.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "System.Stats.PerLocationServiceStateArray");
            cachedSerQNames.add(qName);
            cls = com.zeus.soap.zxtm._1_0.SystemStatsPerLocationServiceState[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "System.Stats.PerLocationServiceState");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "System.Stats.PerNodeServiceLevel");
            cachedSerQNames.add(qName);
            cls = com.zeus.soap.zxtm._1_0.SystemStatsPerNodeServiceLevel.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "System.Stats.PerNodeServiceLevelArray");
            cachedSerQNames.add(qName);
            cls = com.zeus.soap.zxtm._1_0.SystemStatsPerNodeServiceLevel[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "System.Stats.PerNodeServiceLevel");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "System.Stats.PerPoolNode");
            cachedSerQNames.add(qName);
            cls = com.zeus.soap.zxtm._1_0.SystemStatsPerPoolNode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "System.Stats.PerPoolNodeArray");
            cachedSerQNames.add(qName);
            cls = com.zeus.soap.zxtm._1_0.SystemStatsPerPoolNode[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "System.Stats.PerPoolNode");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "System.Stats.PerPoolNodeState");
            cachedSerQNames.add(qName);
            cls = com.zeus.soap.zxtm._1_0.SystemStatsPerPoolNodeState.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "System.Stats.PerPoolNodeStateArray");
            cachedSerQNames.add(qName);
            cls = com.zeus.soap.zxtm._1_0.SystemStatsPerPoolNodeState[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "System.Stats.PerPoolNodeState");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "System.Stats.PoolAlgorithm");
            cachedSerQNames.add(qName);
            cls = com.zeus.soap.zxtm._1_0.SystemStatsPoolAlgorithm.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "System.Stats.PoolAlgorithmArray");
            cachedSerQNames.add(qName);
            cls = com.zeus.soap.zxtm._1_0.SystemStatsPoolAlgorithm[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "System.Stats.PoolAlgorithm");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "System.Stats.PoolPersistence");
            cachedSerQNames.add(qName);
            cls = com.zeus.soap.zxtm._1_0.SystemStatsPoolPersistence.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "System.Stats.PoolPersistenceArray");
            cachedSerQNames.add(qName);
            cls = com.zeus.soap.zxtm._1_0.SystemStatsPoolPersistence[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "System.Stats.PoolPersistence");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "System.Stats.PoolState");
            cachedSerQNames.add(qName);
            cls = com.zeus.soap.zxtm._1_0.SystemStatsPoolState.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "System.Stats.PoolStateArray");
            cachedSerQNames.add(qName);
            cls = com.zeus.soap.zxtm._1_0.SystemStatsPoolState[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "System.Stats.PoolState");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "System.Stats.ServiceLevelIsOK");
            cachedSerQNames.add(qName);
            cls = com.zeus.soap.zxtm._1_0.SystemStatsServiceLevelIsOK.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "System.Stats.ServiceLevelIsOKArray");
            cachedSerQNames.add(qName);
            cls = com.zeus.soap.zxtm._1_0.SystemStatsServiceLevelIsOK[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "System.Stats.ServiceLevelIsOK");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "System.Stats.TrafficIPState");
            cachedSerQNames.add(qName);
            cls = com.zeus.soap.zxtm._1_0.SystemStatsTrafficIPState.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "System.Stats.TrafficIPStateArray");
            cachedSerQNames.add(qName);
            cls = com.zeus.soap.zxtm._1_0.SystemStatsTrafficIPState[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "System.Stats.TrafficIPState");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "System.Stats.VirtualserverProtocol");
            cachedSerQNames.add(qName);
            cls = com.zeus.soap.zxtm._1_0.SystemStatsVirtualserverProtocol.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "System.Stats.VirtualserverProtocolArray");
            cachedSerQNames.add(qName);
            cls = com.zeus.soap.zxtm._1_0.SystemStatsVirtualserverProtocol[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "System.Stats.VirtualserverProtocol");
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
     * The number of actions configured in the traffic manager.
     */
    public int getActionNumber() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getActionNumber");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getActionNumber"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Gets the list of Alerting Actions configured.
     */
    public java.lang.String[] getActions() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getActions");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getActions"));

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
     * Number of times this action has been processed, for each of
     * the named Actions.
     */
    public int[] getActionsProcessed(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getActionsProcessed");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getActionsProcessed"));

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
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidInput) {
              throw (com.zeus.soap.zxtm._1_0.InvalidInput) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidObjectName) {
              throw (com.zeus.soap.zxtm._1_0.InvalidObjectName) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }


    /**
     * The total number of ASP sessions stored in the cache.
     */
    public int getAspSessionCacheEntries() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getAspSessionCacheEntries");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getAspSessionCacheEntries"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * The maximum number of ASP sessions in the cache.
     */
    public int getAspSessionCacheEntriesMax() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getAspSessionCacheEntriesMax");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getAspSessionCacheEntriesMax"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * The percentage of ASP session lookups that succeeded.
     */
    public int getAspSessionCacheHitRate() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getAspSessionCacheHitRate");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getAspSessionCacheHitRate"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Number of times a ASP session entry has been successfully found
     * in the cache.
     */
    public int getAspSessionCacheHits() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getAspSessionCacheHits");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getAspSessionCacheHits"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Number of times a ASP session entry has been looked up in the
     * cache.
     */
    public int getAspSessionCacheLookups() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getAspSessionCacheLookups");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getAspSessionCacheLookups"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Number of times a ASP session entry has not been available
     * in the cache.
     */
    public int getAspSessionCacheMisses() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getAspSessionCacheMisses");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getAspSessionCacheMisses"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * The age of the oldest ASP session in the cache (in seconds).
     */
    public int getAspSessionCacheOldest() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[9]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getAspSessionCacheOldest");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getAspSessionCacheOldest"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Number of connection errors that have occured when trying to
     * connect to an authentication server, for each of the named Authenticators.
     */
    public int[] getAuthenticatorErrors(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[10]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getAuthenticatorErrors");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getAuthenticatorErrors"));

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
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidInput) {
              throw (com.zeus.soap.zxtm._1_0.InvalidInput) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidObjectName) {
              throw (com.zeus.soap.zxtm._1_0.InvalidObjectName) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }


    /**
     * Number of times this Authenticator has failed to authenticate,
     * for each of the named Authenticators.
     */
    public int[] getAuthenticatorFails(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[11]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getAuthenticatorFails");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getAuthenticatorFails"));

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
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidInput) {
              throw (com.zeus.soap.zxtm._1_0.InvalidInput) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidObjectName) {
              throw (com.zeus.soap.zxtm._1_0.InvalidObjectName) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }


    /**
     * The number of Authenticators.
     */
    public int getAuthenticatorNumber() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[12]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getAuthenticatorNumber");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getAuthenticatorNumber"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Number of times this Authenticator has successfully authenticated,
     * for each of the named Authenticators.
     */
    public int[] getAuthenticatorPasses(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[13]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getAuthenticatorPasses");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getAuthenticatorPasses"));

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
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidInput) {
              throw (com.zeus.soap.zxtm._1_0.InvalidInput) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidObjectName) {
              throw (com.zeus.soap.zxtm._1_0.InvalidObjectName) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }


    /**
     * Number of times this Authenticator has been asked to authenticate,
     * for each of the named Authenticators.
     */
    public int[] getAuthenticatorRequests(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[14]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getAuthenticatorRequests");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getAuthenticatorRequests"));

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
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidInput) {
              throw (com.zeus.soap.zxtm._1_0.InvalidInput) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidObjectName) {
              throw (com.zeus.soap.zxtm._1_0.InvalidObjectName) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }


    /**
     * Gets the list of Authenticators configured.
     */
    public java.lang.String[] getAuthenticators() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[15]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getAuthenticators");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getAuthenticators"));

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
     * Bytes output by connections assigned to this bandwidth class,
     * for each of the named BandwidthClasses.
     */
    public long[] getBandwidthClassBytesOut(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[16]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getBandwidthClassBytesOut");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getBandwidthClassBytesOut"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {names});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (long[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (long[]) org.apache.axis.utils.JavaUtils.convert(_resp, long[].class);
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
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidObjectName) {
              throw (com.zeus.soap.zxtm._1_0.InvalidObjectName) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }


    /**
     * Guaranteed bandwidth class limit (kbits/s).  Currently unused,
     * for each of the named BandwidthClasses.
     */
    public int[] getBandwidthClassGuarantee(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[17]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getBandwidthClassGuarantee");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getBandwidthClassGuarantee"));

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
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidInput) {
              throw (com.zeus.soap.zxtm._1_0.InvalidInput) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidObjectName) {
              throw (com.zeus.soap.zxtm._1_0.InvalidObjectName) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }


    /**
     * Maximum bandwidth class limit (kbits/s), for each of the named
     * BandwidthClasses.
     */
    public int[] getBandwidthClassMaximum(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[18]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getBandwidthClassMaximum");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getBandwidthClassMaximum"));

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
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidInput) {
              throw (com.zeus.soap.zxtm._1_0.InvalidInput) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidObjectName) {
              throw (com.zeus.soap.zxtm._1_0.InvalidObjectName) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }


    /**
     * The number of bandwidth classes defined.
     */
    public int getBandwidthClassNumber() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[19]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getBandwidthClassNumber");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getBandwidthClassNumber"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Gets the list of Bandwidth Classes configured.
     */
    public java.lang.String[] getBandwidthClasses() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[20]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getBandwidthClasses");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getBandwidthClasses"));

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
     * The number of cloud credentials sets defined.
     */
    public int getCloudcredentialsClassNumber() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[21]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getCloudcredentialsClassNumber");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getCloudcredentialsClassNumber"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * The number of instance creation API requests made with this
     * set of cloud credentials, for each of the named Cloudcredentialses.
     */
    public int[] getCloudcredentialsNodeCreations(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[22]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getCloudcredentialsNodeCreations");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getCloudcredentialsNodeCreations"));

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
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidInput) {
              throw (com.zeus.soap.zxtm._1_0.InvalidInput) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidObjectName) {
              throw (com.zeus.soap.zxtm._1_0.InvalidObjectName) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }


    /**
     * The number of instance destruction API requests made with this
     * set of cloud credentials, for each of the named Cloudcredentialses.
     */
    public int[] getCloudcredentialsNodeDeletions(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[23]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getCloudcredentialsNodeDeletions");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getCloudcredentialsNodeDeletions"));

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
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidInput) {
              throw (com.zeus.soap.zxtm._1_0.InvalidInput) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidObjectName) {
              throw (com.zeus.soap.zxtm._1_0.InvalidObjectName) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }


    /**
     * The number of status API requests made with this set of cloud
     * credentials, for each of the named Cloudcredentialses.
     */
    public int[] getCloudcredentialsStatusRequests(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[24]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getCloudcredentialsStatusRequests");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getCloudcredentialsStatusRequests"));

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
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidInput) {
              throw (com.zeus.soap.zxtm._1_0.InvalidInput) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidObjectName) {
              throw (com.zeus.soap.zxtm._1_0.InvalidObjectName) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }


    /**
     * Gets the list of Cloud Credentials configured.
     */
    public java.lang.String[] getCloudcredentialses() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[25]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getCloudcredentialses");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getCloudcredentialses"));

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
     * Number of entries in the TrafficScript data.get()/set() storage.
     */
    public int getDataEntries() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[26]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getDataEntries");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getDataEntries"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Number of bytes used in the TrafficScript data.get()/set()
     * storage.
     */
    public int getDataMemoryUsage() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[27]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getDataMemoryUsage");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getDataMemoryUsage"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * The number of event configurations.
     */
    public int getEventNumber() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[28]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getEventNumber");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getEventNumber"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Gets the list of Event Types configured.
     */
    public java.lang.String[] getEvents() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[29]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getEvents");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getEvents"));

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
     * Number of times this event configuration has matched, for each
     * of the named Events.
     */
    public int[] getEventsMatched(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[30]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getEventsMatched");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getEventsMatched"));

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
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidInput) {
              throw (com.zeus.soap.zxtm._1_0.InvalidInput) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidObjectName) {
              throw (com.zeus.soap.zxtm._1_0.InvalidObjectName) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }


    /**
     * Events seen by the traffic Manager's event handling process.
     */
    public int getEventsSeen() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[31]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getEventsSeen");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getEventsSeen"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Number of A records this GLB Service has discarded, for each
     * of the named GlbServices.
     */
    public int[] getGlbServiceDiscarded(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[32]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getGlbServiceDiscarded");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getGlbServiceDiscarded"));

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
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidInput) {
              throw (com.zeus.soap.zxtm._1_0.InvalidInput) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidObjectName) {
              throw (com.zeus.soap.zxtm._1_0.InvalidObjectName) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }


    /**
     * The number of GLB Services on this system.
     */
    public int getGlbServiceNumber() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[33]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getGlbServiceNumber");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getGlbServiceNumber"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Number of A records this GLB Service has altered, for each
     * of the named GlbServices.
     */
    public int[] getGlbServiceResponses(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[34]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getGlbServiceResponses");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getGlbServiceResponses"));

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
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidInput) {
              throw (com.zeus.soap.zxtm._1_0.InvalidInput) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidObjectName) {
              throw (com.zeus.soap.zxtm._1_0.InvalidObjectName) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }


    /**
     * Number of A records this GLB Service has passed through unmodified,
     * for each of the named GlbServices.
     */
    public int[] getGlbServiceUnmodified(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[35]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getGlbServiceUnmodified");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getGlbServiceUnmodified"));

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
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidInput) {
              throw (com.zeus.soap.zxtm._1_0.InvalidInput) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidObjectName) {
              throw (com.zeus.soap.zxtm._1_0.InvalidObjectName) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }


    /**
     * Gets the list of GLB services configured.
     */
    public java.lang.String[] getGlbServices() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[36]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getGlbServices");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getGlbServices"));

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
     * The number of collisions reported by this interface, for each
     * of the named Interfaces.
     */
    public int[] getInterfaceCollisions(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[37]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getInterfaceCollisions");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getInterfaceCollisions"));

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
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidInput) {
              throw (com.zeus.soap.zxtm._1_0.InvalidInput) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidObjectName) {
              throw (com.zeus.soap.zxtm._1_0.InvalidObjectName) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }


    /**
     * The number of network interfaces.
     */
    public int getInterfaceNumber() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[38]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getInterfaceNumber");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getInterfaceNumber"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Bytes received by this interface, for each of the named Interfaces.
     */
    public long[] getInterfaceRxBytes(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[39]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getInterfaceRxBytes");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getInterfaceRxBytes"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {names});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (long[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (long[]) org.apache.axis.utils.JavaUtils.convert(_resp, long[].class);
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
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidObjectName) {
              throw (com.zeus.soap.zxtm._1_0.InvalidObjectName) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }


    /**
     * The number of receive errors reported by this interface, for
     * each of the named Interfaces.
     */
    public int[] getInterfaceRxErrors(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[40]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getInterfaceRxErrors");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getInterfaceRxErrors"));

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
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidInput) {
              throw (com.zeus.soap.zxtm._1_0.InvalidInput) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidObjectName) {
              throw (com.zeus.soap.zxtm._1_0.InvalidObjectName) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }


    /**
     * The number of packets received by this interface, for each
     * of the named Interfaces.
     */
    public int[] getInterfaceRxPackets(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[41]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getInterfaceRxPackets");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getInterfaceRxPackets"));

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
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidInput) {
              throw (com.zeus.soap.zxtm._1_0.InvalidInput) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidObjectName) {
              throw (com.zeus.soap.zxtm._1_0.InvalidObjectName) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }


    /**
     * Bytes transmitted by this interface, for each of the named
     * Interfaces.
     */
    public long[] getInterfaceTxBytes(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[42]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getInterfaceTxBytes");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getInterfaceTxBytes"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {names});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (long[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (long[]) org.apache.axis.utils.JavaUtils.convert(_resp, long[].class);
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
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidObjectName) {
              throw (com.zeus.soap.zxtm._1_0.InvalidObjectName) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }


    /**
     * The number of transmit errors reported by this interface, for
     * each of the named Interfaces.
     */
    public int[] getInterfaceTxErrors(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[43]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getInterfaceTxErrors");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getInterfaceTxErrors"));

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
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidInput) {
              throw (com.zeus.soap.zxtm._1_0.InvalidInput) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidObjectName) {
              throw (com.zeus.soap.zxtm._1_0.InvalidObjectName) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }


    /**
     * The number of packets transmitted by this interface, for each
     * of the named Interfaces.
     */
    public int[] getInterfaceTxPackets(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[44]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getInterfaceTxPackets");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getInterfaceTxPackets"));

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
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidInput) {
              throw (com.zeus.soap.zxtm._1_0.InvalidInput) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidObjectName) {
              throw (com.zeus.soap.zxtm._1_0.InvalidObjectName) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }


    /**
     * Gets the list of Network Interfaces configured.
     */
    public java.lang.String[] getInterfaces() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[45]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getInterfaces");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getInterfaces"));

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
     * The total number of IP sessions stored in the cache.
     */
    public int getIpSessionCacheEntries() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[46]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getIpSessionCacheEntries");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getIpSessionCacheEntries"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * The maximum number of IP sessions in the cache.
     */
    public int getIpSessionCacheEntriesMax() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[47]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getIpSessionCacheEntriesMax");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getIpSessionCacheEntriesMax"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * The percentage of IP session lookups that succeeded.
     */
    public int getIpSessionCacheHitRate() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[48]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getIpSessionCacheHitRate");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getIpSessionCacheHitRate"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Number of times a IP session entry has been successfully found
     * in the cache.
     */
    public int getIpSessionCacheHits() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[49]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getIpSessionCacheHits");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getIpSessionCacheHits"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Number of times a IP session entry has been looked up in the
     * cache.
     */
    public int getIpSessionCacheLookups() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[50]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getIpSessionCacheLookups");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getIpSessionCacheLookups"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Number of times a IP session entry has not been available in
     * the cache.
     */
    public int getIpSessionCacheMisses() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[51]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getIpSessionCacheMisses");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getIpSessionCacheMisses"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * The age of the oldest IP session in the cache (in seconds).
     */
    public int getIpSessionCacheOldest() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[52]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getIpSessionCacheOldest");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getIpSessionCacheOldest"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * The total number of J2EE sessions stored in the cache.
     */
    public int getJ2EeSessionCacheEntries() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[53]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getJ2eeSessionCacheEntries");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getJ2eeSessionCacheEntries"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * The maximum number of J2EE sessions in the cache.
     */
    public int getJ2EeSessionCacheEntriesMax() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[54]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getJ2eeSessionCacheEntriesMax");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getJ2eeSessionCacheEntriesMax"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * The percentage of J2EE session lookups that succeeded.
     */
    public int getJ2EeSessionCacheHitRate() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[55]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getJ2eeSessionCacheHitRate");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getJ2eeSessionCacheHitRate"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Number of times a J2EE session entry has been successfully
     * found in the cache.
     */
    public int getJ2EeSessionCacheHits() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[56]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getJ2eeSessionCacheHits");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getJ2eeSessionCacheHits"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Number of times a J2EE session entry has been looked up in
     * the cache.
     */
    public int getJ2EeSessionCacheLookups() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[57]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getJ2eeSessionCacheLookups");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getJ2eeSessionCacheLookups"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Number of times a J2EE session entry has not been available
     * in the cache.
     */
    public int getJ2EeSessionCacheMisses() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[58]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getJ2eeSessionCacheMisses");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getJ2eeSessionCacheMisses"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * The age of the oldest J2EE session in the cache (in seconds).
     */
    public int getJ2EeSessionCacheOldest() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[59]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getJ2eeSessionCacheOldest");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getJ2eeSessionCacheOldest"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * The number of License keys.
     */
    public int getLicensekeyNumber() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[60]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getLicensekeyNumber");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getLicensekeyNumber"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Bytes sent to this listening IP, for each of the specified
     * ListenIPs.
     */
    public long[] getListenIPBytesIn(java.lang.String[] listen_ip_addresses) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[61]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getListenIPBytesIn");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getListenIPBytesIn"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {listen_ip_addresses});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (long[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (long[]) org.apache.axis.utils.JavaUtils.convert(_resp, long[].class);
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
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidObjectName) {
              throw (com.zeus.soap.zxtm._1_0.InvalidObjectName) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }


    /**
     * Bytes sent from this listening IP, for each of the specified
     * ListenIPs.
     */
    public long[] getListenIPBytesOut(java.lang.String[] listen_ip_addresses) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[62]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getListenIPBytesOut");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getListenIPBytesOut"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {listen_ip_addresses});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (long[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (long[]) org.apache.axis.utils.JavaUtils.convert(_resp, long[].class);
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
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidObjectName) {
              throw (com.zeus.soap.zxtm._1_0.InvalidObjectName) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }


    /**
     * TCP connections currently established to this listening IP,
     * for each of the specified ListenIPs.
     */
    public int[] getListenIPCurrentConn(java.lang.String[] listen_ip_addresses) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[63]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getListenIPCurrentConn");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getListenIPCurrentConn"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {listen_ip_addresses});

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
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidInput) {
              throw (com.zeus.soap.zxtm._1_0.InvalidInput) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidObjectName) {
              throw (com.zeus.soap.zxtm._1_0.InvalidObjectName) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }


    /**
     * Maximum number of simultaneous TCP connections this listening
     * IP has processed at any one time, for each of the specified ListenIPs.
     */
    public int[] getListenIPMaxConn(java.lang.String[] listen_ip_addresses) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[64]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getListenIPMaxConn");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getListenIPMaxConn"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {listen_ip_addresses});

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
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidInput) {
              throw (com.zeus.soap.zxtm._1_0.InvalidInput) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidObjectName) {
              throw (com.zeus.soap.zxtm._1_0.InvalidObjectName) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }


    /**
     * Requests sent to this listening IP, for each of the specified
     * ListenIPs.
     */
    public int[] getListenIPTotalConn(java.lang.String[] listen_ip_addresses) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[65]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getListenIPTotalConn");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getListenIPTotalConn"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {listen_ip_addresses});

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
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidInput) {
              throw (com.zeus.soap.zxtm._1_0.InvalidInput) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidObjectName) {
              throw (com.zeus.soap.zxtm._1_0.InvalidObjectName) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }


    /**
     * Gets the list of all IP addresses that Virtual Servers are
     * listening on.
     */
    public java.lang.String[] getListenIPs() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[66]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getListenIPs");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getListenIPs"));

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
     * The mean load metric for this location, for each of the named
     * Locations.
     */
    public int[] getLocationLoad(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[67]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getLocationLoad");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getLocationLoad"));

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
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidInput) {
              throw (com.zeus.soap.zxtm._1_0.InvalidInput) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidObjectName) {
              throw (com.zeus.soap.zxtm._1_0.InvalidObjectName) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }


    /**
     * Number of A records that have been altered to point to this
     * location, for each of the named Locations.
     */
    public int[] getLocationResponses(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[68]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getLocationResponses");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getLocationResponses"));

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
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidInput) {
              throw (com.zeus.soap.zxtm._1_0.InvalidInput) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidObjectName) {
              throw (com.zeus.soap.zxtm._1_0.InvalidObjectName) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }


    /**
     * Gets the list of Locations configured.
     */
    public java.lang.String[] getLocations() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[69]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getLocations");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getLocations"));

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
     * The number of Monitors.
     */
    public int getMonitorNumber() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[70]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getMonitorNumber");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getMonitorNumber"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Bytes received from this node, for each of the specified Nodes.
     */
    public long[] getNodeBytesFromNode(com.zeus.soap.zxtm._1_0.SystemStatsNode[] nodes) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[71]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getNodeBytesFromNode");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getNodeBytesFromNode"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {nodes});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (long[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (long[]) org.apache.axis.utils.JavaUtils.convert(_resp, long[].class);
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
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidObjectName) {
              throw (com.zeus.soap.zxtm._1_0.InvalidObjectName) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }


    /**
     * Bytes sent to this node, for each of the specified Nodes.
     */
    public long[] getNodeBytesToNode(com.zeus.soap.zxtm._1_0.SystemStatsNode[] nodes) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[72]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getNodeBytesToNode");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getNodeBytesToNode"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {nodes});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (long[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (long[]) org.apache.axis.utils.JavaUtils.convert(_resp, long[].class);
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
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidObjectName) {
              throw (com.zeus.soap.zxtm._1_0.InvalidObjectName) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }


    /**
     * Current connections established to this node, includes idle
     * connections, for each of the specified Nodes.
     */
    public int[] getNodeCurrentConn(com.zeus.soap.zxtm._1_0.SystemStatsNode[] nodes) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[73]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getNodeCurrentConn");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getNodeCurrentConn"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {nodes});

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
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidInput) {
              throw (com.zeus.soap.zxtm._1_0.InvalidInput) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidObjectName) {
              throw (com.zeus.soap.zxtm._1_0.InvalidObjectName) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }


    /**
     * Active connections established to this node, does not include
     * idle connections, for each of the specified Nodes.
     */
    public int[] getNodeCurrentRequests(com.zeus.soap.zxtm._1_0.SystemStatsNode[] nodes) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[74]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getNodeCurrentRequests");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getNodeCurrentRequests"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {nodes});

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
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidInput) {
              throw (com.zeus.soap.zxtm._1_0.InvalidInput) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidObjectName) {
              throw (com.zeus.soap.zxtm._1_0.InvalidObjectName) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }


    /**
     * Number of timeouts, connection problems and other errors for
     * this node, for each of the specified Nodes.
     */
    public int[] getNodeErrors(com.zeus.soap.zxtm._1_0.SystemStatsNode[] nodes) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[75]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getNodeErrors");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getNodeErrors"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {nodes});

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
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidInput) {
              throw (com.zeus.soap.zxtm._1_0.InvalidInput) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidObjectName) {
              throw (com.zeus.soap.zxtm._1_0.InvalidObjectName) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }


    /**
     * Failures of this node, for each of the specified Nodes.
     */
    public int[] getNodeFailures(com.zeus.soap.zxtm._1_0.SystemStatsNode[] nodes) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[76]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getNodeFailures");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getNodeFailures"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {nodes});

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
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidInput) {
              throw (com.zeus.soap.zxtm._1_0.InvalidInput) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidObjectName) {
              throw (com.zeus.soap.zxtm._1_0.InvalidObjectName) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }


    /**
     * Number of idle HTTP connections to this node, for each of the
     * specified Nodes.
     */
    public int[] getNodeIdleConns(com.zeus.soap.zxtm._1_0.SystemStatsNode[] nodes) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[77]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getNodeIdleConns");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getNodeIdleConns"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {nodes});

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
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidInput) {
              throw (com.zeus.soap.zxtm._1_0.InvalidInput) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidObjectName) {
              throw (com.zeus.soap.zxtm._1_0.InvalidObjectName) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }


    /**
     * Requests that created a new connection to this node, for each
     * of the specified Nodes.
     */
    public int[] getNodeNewConn(com.zeus.soap.zxtm._1_0.SystemStatsNode[] nodes) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[78]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getNodeNewConn");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getNodeNewConn"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {nodes});

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
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidInput) {
              throw (com.zeus.soap.zxtm._1_0.InvalidInput) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidObjectName) {
              throw (com.zeus.soap.zxtm._1_0.InvalidObjectName) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }


    /**
     * The number of nodes on this system (includes IPv4 and IPv6
     * nodes).
     */
    public int getNodeNumber() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[79]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getNodeNumber");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getNodeNumber"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Requests that reused an existing pooled/keepalive connection
     * rather than creating a new TCP connection, for each of the specified
     * Nodes.
     */
    public int[] getNodePooledConn(com.zeus.soap.zxtm._1_0.SystemStatsNode[] nodes) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[80]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getNodePooledConn");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getNodePooledConn"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {nodes});

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
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidInput) {
              throw (com.zeus.soap.zxtm._1_0.InvalidInput) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidObjectName) {
              throw (com.zeus.soap.zxtm._1_0.InvalidObjectName) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }


    /**
     * Maximum response time (ms) in the last second for this node,
     * for each of the specified Nodes.
     */
    public int[] getNodeResponseMax(com.zeus.soap.zxtm._1_0.SystemStatsNode[] nodes) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[81]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getNodeResponseMax");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getNodeResponseMax"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {nodes});

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
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidInput) {
              throw (com.zeus.soap.zxtm._1_0.InvalidInput) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidObjectName) {
              throw (com.zeus.soap.zxtm._1_0.InvalidObjectName) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }


    /**
     * Mean response time (ms) in the last second for this node, for
     * each of the specified Nodes.
     */
    public int[] getNodeResponseMean(com.zeus.soap.zxtm._1_0.SystemStatsNode[] nodes) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[82]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getNodeResponseMean");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getNodeResponseMean"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {nodes});

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
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidInput) {
              throw (com.zeus.soap.zxtm._1_0.InvalidInput) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidObjectName) {
              throw (com.zeus.soap.zxtm._1_0.InvalidObjectName) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }


    /**
     * Minimum response time (ms) in the last second for this node,
     * for each of the specified Nodes.
     */
    public int[] getNodeResponseMin(com.zeus.soap.zxtm._1_0.SystemStatsNode[] nodes) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[83]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getNodeResponseMin");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getNodeResponseMin"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {nodes});

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
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidInput) {
              throw (com.zeus.soap.zxtm._1_0.InvalidInput) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidObjectName) {
              throw (com.zeus.soap.zxtm._1_0.InvalidObjectName) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }


    /**
     * The state of this node, for each of the specified Nodes.
     */
    public com.zeus.soap.zxtm._1_0.SystemStatsNodeState[] getNodeState(com.zeus.soap.zxtm._1_0.SystemStatsNode[] nodes) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[84]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getNodeState");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getNodeState"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {nodes});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.zeus.soap.zxtm._1_0.SystemStatsNodeState[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.zeus.soap.zxtm._1_0.SystemStatsNodeState[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.zeus.soap.zxtm._1_0.SystemStatsNodeState[].class);
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
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidObjectName) {
              throw (com.zeus.soap.zxtm._1_0.InvalidObjectName) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }


    /**
     * Requests sent to this node, for each of the specified Nodes.
     */
    public int[] getNodeTotalConn(com.zeus.soap.zxtm._1_0.SystemStatsNode[] nodes) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[85]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getNodeTotalConn");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getNodeTotalConn"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {nodes});

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
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidInput) {
              throw (com.zeus.soap.zxtm._1_0.InvalidInput) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidObjectName) {
              throw (com.zeus.soap.zxtm._1_0.InvalidObjectName) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }


    /**
     * Retrieves the list of available Nodes.
     */
    public com.zeus.soap.zxtm._1_0.SystemStatsNode[] getNodes() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[86]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getNodes");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getNodes"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.zeus.soap.zxtm._1_0.SystemStatsNode[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.zeus.soap.zxtm._1_0.SystemStatsNode[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.zeus.soap.zxtm._1_0.SystemStatsNode[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Total number of idle HTTP connections to all nodes (used for
     * future HTTP requests).
     */
    public int getNumIdleConnections() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[87]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getNumIdleConnections");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getNumIdleConnections"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * The number of traffic manager child processes.
     */
    public int getNumberChildProcesses() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[88]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getNumberChildProcesses");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getNumberChildProcesses"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Requests for DNS A records resolved from the traffic manager's
     * local cache.
     */
    public int getNumberDNSACacheHits() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[89]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getNumberDNSACacheHits");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getNumberDNSACacheHits"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Requests for DNS A records (hostname->IP address) made by the
     * traffic manager.
     */
    public int getNumberDNSARequests() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[90]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getNumberDNSARequests");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getNumberDNSARequests"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Requests for DNS PTR records resolved from the traffic manager's
     * local cache.
     */
    public int getNumberDNSPTRCacheHits() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[91]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getNumberDNSPTRCacheHits");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getNumberDNSPTRCacheHits"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Requests for DNS PTR records (IP address->hostname) made by
     * the traffic manager.
     */
    public int getNumberDNSPTRRequests() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[92]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getNumberDNSPTRRequests");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getNumberDNSPTRRequests"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Malformed SNMP requests received.
     */
    public int getNumberSNMPBadRequests() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[93]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getNumberSNMPBadRequests");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getNumberSNMPBadRequests"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * SNMP GetBulkRequests received.
     */
    public int getNumberSNMPGetBulkRequests() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[94]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getNumberSNMPGetBulkRequests");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getNumberSNMPGetBulkRequests"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * SNMP GetNextRequests received.
     */
    public int getNumberSNMPGetNextRequests() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[95]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getNumberSNMPGetNextRequests");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getNumberSNMPGetNextRequests"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * SNMP GetRequests received.
     */
    public int getNumberSNMPGetRequests() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[96]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getNumberSNMPGetRequests");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getNumberSNMPGetRequests"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * SNMP requests dropped due to access restrictions.
     */
    public int getNumberSNMPUnauthorisedRequests() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[97]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getNumberSNMPUnauthorisedRequests");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getNumberSNMPUnauthorisedRequests"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * The draining state of this location for this GLB Service, for
     * each of the specified PerLocationServices.
     */
    public com.zeus.soap.zxtm._1_0.SystemStatsPerLocationServiceDraining[] getPerLocationServiceDraining(com.zeus.soap.zxtm._1_0.SystemStatsPerLocationService[] per_location_services) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[98]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getPerLocationServiceDraining");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getPerLocationServiceDraining"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {per_location_services});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.zeus.soap.zxtm._1_0.SystemStatsPerLocationServiceDraining[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.zeus.soap.zxtm._1_0.SystemStatsPerLocationServiceDraining[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.zeus.soap.zxtm._1_0.SystemStatsPerLocationServiceDraining[].class);
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
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidObjectName) {
              throw (com.zeus.soap.zxtm._1_0.InvalidObjectName) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }


    /**
     * The frontend state of this location for this GLB Service, for
     * each of the specified PerLocationServices.
     */
    public com.zeus.soap.zxtm._1_0.SystemStatsPerLocationServiceFrontendState[] getPerLocationServiceFrontendState(com.zeus.soap.zxtm._1_0.SystemStatsPerLocationService[] per_location_services) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[99]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getPerLocationServiceFrontendState");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getPerLocationServiceFrontendState"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {per_location_services});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.zeus.soap.zxtm._1_0.SystemStatsPerLocationServiceFrontendState[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.zeus.soap.zxtm._1_0.SystemStatsPerLocationServiceFrontendState[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.zeus.soap.zxtm._1_0.SystemStatsPerLocationServiceFrontendState[].class);
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
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidObjectName) {
              throw (com.zeus.soap.zxtm._1_0.InvalidObjectName) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }


    /**
     * The load metric for this location for this GLB Service, for
     * each of the specified PerLocationServices.
     */
    public int[] getPerLocationServiceLoad(com.zeus.soap.zxtm._1_0.SystemStatsPerLocationService[] per_location_services) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[100]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getPerLocationServiceLoad");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getPerLocationServiceLoad"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {per_location_services});

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
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidInput) {
              throw (com.zeus.soap.zxtm._1_0.InvalidInput) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidObjectName) {
              throw (com.zeus.soap.zxtm._1_0.InvalidObjectName) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }


    /**
     * The monitor state of this location for this GLB Service, for
     * each of the specified PerLocationServices.
     */
    public com.zeus.soap.zxtm._1_0.SystemStatsPerLocationServiceMonitorState[] getPerLocationServiceMonitorState(com.zeus.soap.zxtm._1_0.SystemStatsPerLocationService[] per_location_services) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[101]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getPerLocationServiceMonitorState");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getPerLocationServiceMonitorState"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {per_location_services});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.zeus.soap.zxtm._1_0.SystemStatsPerLocationServiceMonitorState[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.zeus.soap.zxtm._1_0.SystemStatsPerLocationServiceMonitorState[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.zeus.soap.zxtm._1_0.SystemStatsPerLocationServiceMonitorState[].class);
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
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidObjectName) {
              throw (com.zeus.soap.zxtm._1_0.InvalidObjectName) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }


    /**
     * Number of A records that have been altered to point to this
     * location for this GLB Service, for each of the specified PerLocationServices.
     */
    public int[] getPerLocationServiceResponses(com.zeus.soap.zxtm._1_0.SystemStatsPerLocationService[] per_location_services) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[102]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getPerLocationServiceResponses");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getPerLocationServiceResponses"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {per_location_services});

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
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidInput) {
              throw (com.zeus.soap.zxtm._1_0.InvalidInput) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidObjectName) {
              throw (com.zeus.soap.zxtm._1_0.InvalidObjectName) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }


    /**
     * The state of this location for this GLB Service, for each of
     * the specified PerLocationServices.
     */
    public com.zeus.soap.zxtm._1_0.SystemStatsPerLocationServiceState[] getPerLocationServiceState(com.zeus.soap.zxtm._1_0.SystemStatsPerLocationService[] per_location_services) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[103]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getPerLocationServiceState");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getPerLocationServiceState"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {per_location_services});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.zeus.soap.zxtm._1_0.SystemStatsPerLocationServiceState[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.zeus.soap.zxtm._1_0.SystemStatsPerLocationServiceState[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.zeus.soap.zxtm._1_0.SystemStatsPerLocationServiceState[].class);
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
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidObjectName) {
              throw (com.zeus.soap.zxtm._1_0.InvalidObjectName) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }


    /**
     * Retrieves the list of available PerLocationServices.
     */
    public com.zeus.soap.zxtm._1_0.SystemStatsPerLocationService[] getPerLocationServices() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[104]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getPerLocationServices");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getPerLocationServices"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.zeus.soap.zxtm._1_0.SystemStatsPerLocationService[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.zeus.soap.zxtm._1_0.SystemStatsPerLocationService[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.zeus.soap.zxtm._1_0.SystemStatsPerLocationService[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Maximum response time (ms) in the last second for this SLM
     * class to this node, for each of the specified PerNodeServiceLevels.
     */
    public int[] getPerNodeServiceLevelResponseMax(com.zeus.soap.zxtm._1_0.SystemStatsPerNodeServiceLevel[] per_node_service_levels) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[105]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getPerNodeServiceLevelResponseMax");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getPerNodeServiceLevelResponseMax"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {per_node_service_levels});

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
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidInput) {
              throw (com.zeus.soap.zxtm._1_0.InvalidInput) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidObjectName) {
              throw (com.zeus.soap.zxtm._1_0.InvalidObjectName) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }


    /**
     * Mean response time (ms) in the last second for this SLM class
     * to this node, for each of the specified PerNodeServiceLevels.
     */
    public int[] getPerNodeServiceLevelResponseMean(com.zeus.soap.zxtm._1_0.SystemStatsPerNodeServiceLevel[] per_node_service_levels) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[106]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getPerNodeServiceLevelResponseMean");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getPerNodeServiceLevelResponseMean"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {per_node_service_levels});

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
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidInput) {
              throw (com.zeus.soap.zxtm._1_0.InvalidInput) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidObjectName) {
              throw (com.zeus.soap.zxtm._1_0.InvalidObjectName) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }


    /**
     * Minimum response time (ms) in the last second for this SLM
     * class to this node, for each of the specified PerNodeServiceLevels.
     */
    public int[] getPerNodeServiceLevelResponseMin(com.zeus.soap.zxtm._1_0.SystemStatsPerNodeServiceLevel[] per_node_service_levels) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[107]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getPerNodeServiceLevelResponseMin");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getPerNodeServiceLevelResponseMin"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {per_node_service_levels});

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
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidInput) {
              throw (com.zeus.soap.zxtm._1_0.InvalidInput) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidObjectName) {
              throw (com.zeus.soap.zxtm._1_0.InvalidObjectName) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }


    /**
     * Requests handled by this SLM class to this node, for each of
     * the specified PerNodeServiceLevels.
     */
    public int[] getPerNodeServiceLevelTotalConn(com.zeus.soap.zxtm._1_0.SystemStatsPerNodeServiceLevel[] per_node_service_levels) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[108]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getPerNodeServiceLevelTotalConn");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getPerNodeServiceLevelTotalConn"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {per_node_service_levels});

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
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidInput) {
              throw (com.zeus.soap.zxtm._1_0.InvalidInput) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidObjectName) {
              throw (com.zeus.soap.zxtm._1_0.InvalidObjectName) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }


    /**
     * Non-conforming requests handled by this SLM class to this node,
     * for each of the specified PerNodeServiceLevels.
     */
    public int[] getPerNodeServiceLevelTotalNonConf(com.zeus.soap.zxtm._1_0.SystemStatsPerNodeServiceLevel[] per_node_service_levels) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[109]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getPerNodeServiceLevelTotalNonConf");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getPerNodeServiceLevelTotalNonConf"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {per_node_service_levels});

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
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidInput) {
              throw (com.zeus.soap.zxtm._1_0.InvalidInput) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidObjectName) {
              throw (com.zeus.soap.zxtm._1_0.InvalidObjectName) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }


    /**
     * Retrieves the list of available PerNodeServiceLevels.
     */
    public com.zeus.soap.zxtm._1_0.SystemStatsPerNodeServiceLevel[] getPerNodeServiceLevels() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[110]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getPerNodeServiceLevels");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getPerNodeServiceLevels"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.zeus.soap.zxtm._1_0.SystemStatsPerNodeServiceLevel[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.zeus.soap.zxtm._1_0.SystemStatsPerNodeServiceLevel[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.zeus.soap.zxtm._1_0.SystemStatsPerNodeServiceLevel[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Bytes received from this node, for each of the specified PerPoolNodes.
     */
    public long[] getPerPoolNodeBytesFromNode(com.zeus.soap.zxtm._1_0.SystemStatsPerPoolNode[] per_pool_nodes) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[111]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getPerPoolNodeBytesFromNode");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getPerPoolNodeBytesFromNode"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {per_pool_nodes});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (long[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (long[]) org.apache.axis.utils.JavaUtils.convert(_resp, long[].class);
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
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidObjectName) {
              throw (com.zeus.soap.zxtm._1_0.InvalidObjectName) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }


    /**
     * Bytes sent to this node, for each of the specified PerPoolNodes.
     */
    public long[] getPerPoolNodeBytesToNode(com.zeus.soap.zxtm._1_0.SystemStatsPerPoolNode[] per_pool_nodes) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[112]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getPerPoolNodeBytesToNode");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getPerPoolNodeBytesToNode"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {per_pool_nodes});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (long[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (long[]) org.apache.axis.utils.JavaUtils.convert(_resp, long[].class);
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
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidObjectName) {
              throw (com.zeus.soap.zxtm._1_0.InvalidObjectName) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }


    /**
     * Current connections established to a node, includes idle connections,
     * for each of the specified PerPoolNodes.
     */
    public int[] getPerPoolNodeCurrentConn(com.zeus.soap.zxtm._1_0.SystemStatsPerPoolNode[] per_pool_nodes) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[113]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getPerPoolNodeCurrentConn");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getPerPoolNodeCurrentConn"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {per_pool_nodes});

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
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidInput) {
              throw (com.zeus.soap.zxtm._1_0.InvalidInput) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidObjectName) {
              throw (com.zeus.soap.zxtm._1_0.InvalidObjectName) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }


    /**
     * Active connections established to this node, does not include
     * idle connections, for each of the specified PerPoolNodes.
     */
    public int[] getPerPoolNodeCurrentRequests(com.zeus.soap.zxtm._1_0.SystemStatsPerPoolNode[] per_pool_nodes) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[114]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getPerPoolNodeCurrentRequests");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getPerPoolNodeCurrentRequests"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {per_pool_nodes});

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
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidInput) {
              throw (com.zeus.soap.zxtm._1_0.InvalidInput) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidObjectName) {
              throw (com.zeus.soap.zxtm._1_0.InvalidObjectName) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }


    /**
     * Number of timeouts, connection problems and other errors for
     * this node, for each of the specified PerPoolNodes.
     */
    public int[] getPerPoolNodeErrors(com.zeus.soap.zxtm._1_0.SystemStatsPerPoolNode[] per_pool_nodes) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[115]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getPerPoolNodeErrors");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getPerPoolNodeErrors"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {per_pool_nodes});

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
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidInput) {
              throw (com.zeus.soap.zxtm._1_0.InvalidInput) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidObjectName) {
              throw (com.zeus.soap.zxtm._1_0.InvalidObjectName) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }


    /**
     * Failures of this node, for each of the specified PerPoolNodes.
     */
    public int[] getPerPoolNodeFailures(com.zeus.soap.zxtm._1_0.SystemStatsPerPoolNode[] per_pool_nodes) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[116]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getPerPoolNodeFailures");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getPerPoolNodeFailures"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {per_pool_nodes});

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
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidInput) {
              throw (com.zeus.soap.zxtm._1_0.InvalidInput) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidObjectName) {
              throw (com.zeus.soap.zxtm._1_0.InvalidObjectName) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }


    /**
     * Number of idle HTTP connections to this node, for each of the
     * specified PerPoolNodes.
     */
    public int[] getPerPoolNodeIdleConns(com.zeus.soap.zxtm._1_0.SystemStatsPerPoolNode[] per_pool_nodes) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[117]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getPerPoolNodeIdleConns");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getPerPoolNodeIdleConns"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {per_pool_nodes});

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
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidInput) {
              throw (com.zeus.soap.zxtm._1_0.InvalidInput) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidObjectName) {
              throw (com.zeus.soap.zxtm._1_0.InvalidObjectName) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }


    /**
     * Requests that created a new connection to this node, for each
     * of the specified PerPoolNodes.
     */
    public int[] getPerPoolNodeNewConn(com.zeus.soap.zxtm._1_0.SystemStatsPerPoolNode[] per_pool_nodes) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[118]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getPerPoolNodeNewConn");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getPerPoolNodeNewConn"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {per_pool_nodes});

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
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidInput) {
              throw (com.zeus.soap.zxtm._1_0.InvalidInput) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidObjectName) {
              throw (com.zeus.soap.zxtm._1_0.InvalidObjectName) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }


    /**
     * The number of nodes on this system.
     */
    public int getPerPoolNodeNumber() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[119]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getPerPoolNodeNumber");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getPerPoolNodeNumber"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Requests that reused an existing pooled/keepalive connection
     * rather than creating a new TCP connection, for each of the specified
     * PerPoolNodes.
     */
    public int[] getPerPoolNodePooledConn(com.zeus.soap.zxtm._1_0.SystemStatsPerPoolNode[] per_pool_nodes) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[120]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getPerPoolNodePooledConn");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getPerPoolNodePooledConn"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {per_pool_nodes});

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
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidInput) {
              throw (com.zeus.soap.zxtm._1_0.InvalidInput) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidObjectName) {
              throw (com.zeus.soap.zxtm._1_0.InvalidObjectName) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }


    /**
     * Maximum response time (ms) in the last second for this node,
     * for each of the specified PerPoolNodes.
     */
    public int[] getPerPoolNodeResponseMax(com.zeus.soap.zxtm._1_0.SystemStatsPerPoolNode[] per_pool_nodes) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[121]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getPerPoolNodeResponseMax");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getPerPoolNodeResponseMax"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {per_pool_nodes});

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
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidInput) {
              throw (com.zeus.soap.zxtm._1_0.InvalidInput) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidObjectName) {
              throw (com.zeus.soap.zxtm._1_0.InvalidObjectName) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }


    /**
     * Mean response time (ms) in the last second for this node, for
     * each of the specified PerPoolNodes.
     */
    public int[] getPerPoolNodeResponseMean(com.zeus.soap.zxtm._1_0.SystemStatsPerPoolNode[] per_pool_nodes) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[122]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getPerPoolNodeResponseMean");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getPerPoolNodeResponseMean"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {per_pool_nodes});

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
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidInput) {
              throw (com.zeus.soap.zxtm._1_0.InvalidInput) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidObjectName) {
              throw (com.zeus.soap.zxtm._1_0.InvalidObjectName) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }


    /**
     * Minimum response time (ms) in the last second for this node,
     * for each of the specified PerPoolNodes.
     */
    public int[] getPerPoolNodeResponseMin(com.zeus.soap.zxtm._1_0.SystemStatsPerPoolNode[] per_pool_nodes) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[123]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getPerPoolNodeResponseMin");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getPerPoolNodeResponseMin"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {per_pool_nodes});

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
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidInput) {
              throw (com.zeus.soap.zxtm._1_0.InvalidInput) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidObjectName) {
              throw (com.zeus.soap.zxtm._1_0.InvalidObjectName) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }


    /**
     * The state of this node, for each of the specified PerPoolNodes.
     */
    public com.zeus.soap.zxtm._1_0.SystemStatsPerPoolNodeState[] getPerPoolNodeState(com.zeus.soap.zxtm._1_0.SystemStatsPerPoolNode[] per_pool_nodes) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[124]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getPerPoolNodeState");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getPerPoolNodeState"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {per_pool_nodes});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.zeus.soap.zxtm._1_0.SystemStatsPerPoolNodeState[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.zeus.soap.zxtm._1_0.SystemStatsPerPoolNodeState[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.zeus.soap.zxtm._1_0.SystemStatsPerPoolNodeState[].class);
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
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidObjectName) {
              throw (com.zeus.soap.zxtm._1_0.InvalidObjectName) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }


    /**
     * Requests sent to this node, for each of the specified PerPoolNodes.
     */
    public int[] getPerPoolNodeTotalConn(com.zeus.soap.zxtm._1_0.SystemStatsPerPoolNode[] per_pool_nodes) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[125]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getPerPoolNodeTotalConn");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getPerPoolNodeTotalConn"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {per_pool_nodes});

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
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidInput) {
              throw (com.zeus.soap.zxtm._1_0.InvalidInput) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidObjectName) {
              throw (com.zeus.soap.zxtm._1_0.InvalidObjectName) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }


    /**
     * Retrieves the list of available PerPoolNodes.
     */
    public com.zeus.soap.zxtm._1_0.SystemStatsPerPoolNode[] getPerPoolNodes() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[126]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getPerPoolNodes");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getPerPoolNodes"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.zeus.soap.zxtm._1_0.SystemStatsPerPoolNode[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.zeus.soap.zxtm._1_0.SystemStatsPerPoolNode[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.zeus.soap.zxtm._1_0.SystemStatsPerPoolNode[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * The load-balancing algorithm the pool uses, for each of the
     * named Pools.
     */
    public com.zeus.soap.zxtm._1_0.SystemStatsPoolAlgorithm[] getPoolAlgorithm(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[127]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getPoolAlgorithm");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getPoolAlgorithm"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {names});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.zeus.soap.zxtm._1_0.SystemStatsPoolAlgorithm[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.zeus.soap.zxtm._1_0.SystemStatsPoolAlgorithm[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.zeus.soap.zxtm._1_0.SystemStatsPoolAlgorithm[].class);
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
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidObjectName) {
              throw (com.zeus.soap.zxtm._1_0.InvalidObjectName) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }


    /**
     * Bytes received by this pool from nodes, for each of the named
     * Pools.
     */
    public long[] getPoolBytesIn(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[128]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getPoolBytesIn");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getPoolBytesIn"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {names});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (long[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (long[]) org.apache.axis.utils.JavaUtils.convert(_resp, long[].class);
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
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidObjectName) {
              throw (com.zeus.soap.zxtm._1_0.InvalidObjectName) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }


    /**
     * Bytes sent by this pool to nodes, for each of the named Pools.
     */
    public long[] getPoolBytesOut(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[129]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getPoolBytesOut");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getPoolBytesOut"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {names});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (long[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (long[]) org.apache.axis.utils.JavaUtils.convert(_resp, long[].class);
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
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidObjectName) {
              throw (com.zeus.soap.zxtm._1_0.InvalidObjectName) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }


    /**
     * Total connections currently queued to this pool, for each of
     * the named Pools.
     */
    public int[] getPoolConnsQueued(java.lang.String[] names) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[130]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getPoolConnsQueued");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getPoolConnsQueued"));

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
  throw axisFaultException;
}
    }


    /**
     * The number of nodes in this pool that are disabled, for each
     * of the named Pools.
     */
    public int[] getPoolDisabled(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[131]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getPoolDisabled");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getPoolDisabled"));

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
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidInput) {
              throw (com.zeus.soap.zxtm._1_0.InvalidInput) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidObjectName) {
              throw (com.zeus.soap.zxtm._1_0.InvalidObjectName) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }


    /**
     * The number of nodes in this pool which are draining, for each
     * of the named Pools.
     */
    public int[] getPoolDraining(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[132]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getPoolDraining");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getPoolDraining"));

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
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidInput) {
              throw (com.zeus.soap.zxtm._1_0.InvalidInput) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidObjectName) {
              throw (com.zeus.soap.zxtm._1_0.InvalidObjectName) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }


    /**
     * Maximum time a connection was queued for, over the last second,
     * for each of the named Pools.
     */
    public int[] getPoolMaxQueueTime(java.lang.String[] names) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[133]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getPoolMaxQueueTime");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getPoolMaxQueueTime"));

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
  throw axisFaultException;
}
    }


    /**
     * Mean time a connection was queued for, over the last second,
     * for each of the named Pools.
     */
    public int[] getPoolMeanQueueTime(java.lang.String[] names) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[134]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getPoolMeanQueueTime");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getPoolMeanQueueTime"));

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
  throw axisFaultException;
}
    }


    /**
     * Minimum time a connection was queued for, over the last second,
     * for each of the named Pools.
     */
    public int[] getPoolMinQueueTime(java.lang.String[] names) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[135]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getPoolMinQueueTime");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getPoolMinQueueTime"));

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
  throw axisFaultException;
}
    }


    /**
     * The number of nodes registered with this pool, for each of
     * the named Pools.
     */
    public int[] getPoolNodes(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[136]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getPoolNodes");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getPoolNodes"));

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
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidInput) {
              throw (com.zeus.soap.zxtm._1_0.InvalidInput) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidObjectName) {
              throw (com.zeus.soap.zxtm._1_0.InvalidObjectName) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }


    /**
     * The number of pools on this system.
     */
    public int getPoolNumber() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[137]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getPoolNumber");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getPoolNumber"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * The session persistence method this pool uses, for each of
     * the named Pools.
     */
    public com.zeus.soap.zxtm._1_0.SystemStatsPoolPersistence[] getPoolPersistence(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[138]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getPoolPersistence");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getPoolPersistence"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {names});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.zeus.soap.zxtm._1_0.SystemStatsPoolPersistence[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.zeus.soap.zxtm._1_0.SystemStatsPoolPersistence[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.zeus.soap.zxtm._1_0.SystemStatsPoolPersistence[].class);
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
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidObjectName) {
              throw (com.zeus.soap.zxtm._1_0.InvalidObjectName) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }


    /**
     * Total connections that timed-out while queued, for each of
     * the named Pools.
     */
    public int[] getPoolQueueTimeouts(java.lang.String[] names) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[139]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getPoolQueueTimeouts");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getPoolQueueTimeouts"));

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
  throw axisFaultException;
}
    }


    /**
     * Sessions migrated to a new node because the desired node was
     * unavailable, for each of the named Pools.
     */
    public int[] getPoolSessionMigrated(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[140]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getPoolSessionMigrated");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getPoolSessionMigrated"));

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
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidInput) {
              throw (com.zeus.soap.zxtm._1_0.InvalidInput) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidObjectName) {
              throw (com.zeus.soap.zxtm._1_0.InvalidObjectName) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }


    /**
     * The state of this pool, for each of the named Pools.
     */
    public com.zeus.soap.zxtm._1_0.SystemStatsPoolState[] getPoolState(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[141]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getPoolState");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getPoolState"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {names});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.zeus.soap.zxtm._1_0.SystemStatsPoolState[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.zeus.soap.zxtm._1_0.SystemStatsPoolState[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.zeus.soap.zxtm._1_0.SystemStatsPoolState[].class);
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
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidObjectName) {
              throw (com.zeus.soap.zxtm._1_0.InvalidObjectName) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }


    /**
     * Requests sent to this pool, for each of the named Pools.
     */
    public int[] getPoolTotalConn(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[142]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getPoolTotalConn");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getPoolTotalConn"));

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
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidInput) {
              throw (com.zeus.soap.zxtm._1_0.InvalidInput) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidObjectName) {
              throw (com.zeus.soap.zxtm._1_0.InvalidObjectName) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }


    /**
     * Gets the list of Pools configured.
     */
    public java.lang.String[] getPools() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[143]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getPools");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getPools"));

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
     * Connections that have entered the rate class and have been
     * queued, for each of the named RateClasses.
     */
    public int[] getRateClassConnsEntered(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[144]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getRateClassConnsEntered");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getRateClassConnsEntered"));

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
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidInput) {
              throw (com.zeus.soap.zxtm._1_0.InvalidInput) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidObjectName) {
              throw (com.zeus.soap.zxtm._1_0.InvalidObjectName) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }


    /**
     * Connections that have left the rate class, for each of the
     * named RateClasses.
     */
    public int[] getRateClassConnsLeft(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[145]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getRateClassConnsLeft");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getRateClassConnsLeft"));

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
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidInput) {
              throw (com.zeus.soap.zxtm._1_0.InvalidInput) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidObjectName) {
              throw (com.zeus.soap.zxtm._1_0.InvalidObjectName) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }


    /**
     * The average rate that requests are passing through this rate
     * class, for each of the named RateClasses.
     */
    public int[] getRateClassCurrentRate(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[146]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getRateClassCurrentRate");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getRateClassCurrentRate"));

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
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidInput) {
              throw (com.zeus.soap.zxtm._1_0.InvalidInput) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidObjectName) {
              throw (com.zeus.soap.zxtm._1_0.InvalidObjectName) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }


    /**
     * Requests dropped from this rate class without being processed
     * (e.g. timeouts), for each of the named RateClasses.
     */
    public int[] getRateClassDropped(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[147]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getRateClassDropped");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getRateClassDropped"));

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
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidInput) {
              throw (com.zeus.soap.zxtm._1_0.InvalidInput) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidObjectName) {
              throw (com.zeus.soap.zxtm._1_0.InvalidObjectName) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }


    /**
     * The maximum rate that requests may pass through this rate class
     * (requests/min), for each of the named RateClasses.
     */
    public int[] getRateClassMaxRatePerMin(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[148]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getRateClassMaxRatePerMin");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getRateClassMaxRatePerMin"));

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
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidInput) {
              throw (com.zeus.soap.zxtm._1_0.InvalidInput) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidObjectName) {
              throw (com.zeus.soap.zxtm._1_0.InvalidObjectName) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }


    /**
     * The maximum rate that requests may pass through this rate class
     * (requests/sec), for each of the named RateClasses.
     */
    public int[] getRateClassMaxRatePerSec(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[149]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getRateClassMaxRatePerSec");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getRateClassMaxRatePerSec"));

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
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidInput) {
              throw (com.zeus.soap.zxtm._1_0.InvalidInput) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidObjectName) {
              throw (com.zeus.soap.zxtm._1_0.InvalidObjectName) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }


    /**
     * The number of rate classes defined.
     */
    public int getRateClassNumber() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[150]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getRateClassNumber");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getRateClassNumber"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * The current number of requests queued by this rate class, for
     * each of the named RateClasses.
     */
    public int[] getRateClassQueueLength(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[151]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getRateClassQueueLength");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getRateClassQueueLength"));

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
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidInput) {
              throw (com.zeus.soap.zxtm._1_0.InvalidInput) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidObjectName) {
              throw (com.zeus.soap.zxtm._1_0.InvalidObjectName) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }


    /**
     * Gets the list of Rate Classes configured.
     */
    public java.lang.String[] getRateClasses() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[152]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getRateClasses");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getRateClasses"));

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
     * Number of times this TrafficScript rule has aborted, for each
     * of the named Rules.
     */
    public int[] getRuleAborts(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[153]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getRuleAborts");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getRuleAborts"));

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
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidInput) {
              throw (com.zeus.soap.zxtm._1_0.InvalidInput) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidObjectName) {
              throw (com.zeus.soap.zxtm._1_0.InvalidObjectName) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }


    /**
     * Number of times this TrafficScript rule has discarded the connection,
     * for each of the named Rules.
     */
    public int[] getRuleDiscards(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[154]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getRuleDiscards");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getRuleDiscards"));

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
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidInput) {
              throw (com.zeus.soap.zxtm._1_0.InvalidInput) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidObjectName) {
              throw (com.zeus.soap.zxtm._1_0.InvalidObjectName) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }


    /**
     * Number of times this TrafficScript rule has been executed,
     * for each of the named Rules.
     */
    public int[] getRuleExecutions(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[155]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getRuleExecutions");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getRuleExecutions"));

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
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidInput) {
              throw (com.zeus.soap.zxtm._1_0.InvalidInput) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidObjectName) {
              throw (com.zeus.soap.zxtm._1_0.InvalidObjectName) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }


    /**
     * The number of TrafficScript rules.
     */
    public int getRuleNumber() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[156]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getRuleNumber");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getRuleNumber"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Number of times this TrafficScript rule has selected a pool
     * to use, for each of the named Rules.
     */
    public int[] getRulePoolSelect(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[157]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getRulePoolSelect");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getRulePoolSelect"));

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
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidInput) {
              throw (com.zeus.soap.zxtm._1_0.InvalidInput) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidObjectName) {
              throw (com.zeus.soap.zxtm._1_0.InvalidObjectName) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }


    /**
     * Number of times this TrafficScript rule has responded directly
     * to the client, for each of the named Rules.
     */
    public int[] getRuleResponds(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[158]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getRuleResponds");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getRuleResponds"));

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
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidInput) {
              throw (com.zeus.soap.zxtm._1_0.InvalidInput) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidObjectName) {
              throw (com.zeus.soap.zxtm._1_0.InvalidObjectName) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }


    /**
     * Number of times this TrafficScript rule has forced the request
     * to be retried, for each of the named Rules.
     */
    public int[] getRuleRetries(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[159]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getRuleRetries");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getRuleRetries"));

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
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidInput) {
              throw (com.zeus.soap.zxtm._1_0.InvalidInput) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidObjectName) {
              throw (com.zeus.soap.zxtm._1_0.InvalidObjectName) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }


    /**
     * Gets the list of Rules configured.
     */
    public java.lang.String[] getRules() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[160]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getRules");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getRules"));

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
     * Percentage of requests associated with this SLM class that
     * are conforming, for each of the named ServiceLevels.
     */
    public int[] getServiceLevelConforming(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[161]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getServiceLevelConforming");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getServiceLevelConforming"));

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
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidInput) {
              throw (com.zeus.soap.zxtm._1_0.InvalidInput) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidObjectName) {
              throw (com.zeus.soap.zxtm._1_0.InvalidObjectName) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }


    /**
     * The number of connections currently associated with this SLM
     * class, for each of the named ServiceLevels.
     */
    public int[] getServiceLevelCurrentConns(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[162]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getServiceLevelCurrentConns");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getServiceLevelCurrentConns"));

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
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidInput) {
              throw (com.zeus.soap.zxtm._1_0.InvalidInput) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidObjectName) {
              throw (com.zeus.soap.zxtm._1_0.InvalidObjectName) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }


    /**
     * Indicates if this SLM class is currently conforming, for each
     * of the named ServiceLevels.
     */
    public com.zeus.soap.zxtm._1_0.SystemStatsServiceLevelIsOK[] getServiceLevelIsOK(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[163]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getServiceLevelIsOK");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getServiceLevelIsOK"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {names});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.zeus.soap.zxtm._1_0.SystemStatsServiceLevelIsOK[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.zeus.soap.zxtm._1_0.SystemStatsServiceLevelIsOK[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.zeus.soap.zxtm._1_0.SystemStatsServiceLevelIsOK[].class);
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
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidObjectName) {
              throw (com.zeus.soap.zxtm._1_0.InvalidObjectName) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }


    /**
     * The number of SLM classes defined.
     */
    public int getServiceLevelNumber() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[164]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getServiceLevelNumber");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getServiceLevelNumber"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Maximum response time (ms) in the last second for this SLM
     * class, for each of the named ServiceLevels.
     */
    public int[] getServiceLevelResponseMax(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[165]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getServiceLevelResponseMax");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getServiceLevelResponseMax"));

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
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidInput) {
              throw (com.zeus.soap.zxtm._1_0.InvalidInput) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidObjectName) {
              throw (com.zeus.soap.zxtm._1_0.InvalidObjectName) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }


    /**
     * Mean response time (ms) in the last second for this SLM class,
     * for each of the named ServiceLevels.
     */
    public int[] getServiceLevelResponseMean(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[166]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getServiceLevelResponseMean");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getServiceLevelResponseMean"));

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
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidInput) {
              throw (com.zeus.soap.zxtm._1_0.InvalidInput) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidObjectName) {
              throw (com.zeus.soap.zxtm._1_0.InvalidObjectName) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }


    /**
     * Minimum response time (ms) in the last second for this SLM
     * class, for each of the named ServiceLevels.
     */
    public int[] getServiceLevelResponseMin(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[167]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getServiceLevelResponseMin");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getServiceLevelResponseMin"));

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
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidInput) {
              throw (com.zeus.soap.zxtm._1_0.InvalidInput) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidObjectName) {
              throw (com.zeus.soap.zxtm._1_0.InvalidObjectName) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }


    /**
     * Requests handled by this SLM class, for each of the named ServiceLevels.
     */
    public int[] getServiceLevelTotalConn(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[168]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getServiceLevelTotalConn");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getServiceLevelTotalConn"));

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
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidInput) {
              throw (com.zeus.soap.zxtm._1_0.InvalidInput) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidObjectName) {
              throw (com.zeus.soap.zxtm._1_0.InvalidObjectName) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }


    /**
     * Non-conforming requests handled by this SLM class, for each
     * of the named ServiceLevels.
     */
    public int[] getServiceLevelTotalNonConf(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[169]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getServiceLevelTotalNonConf");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getServiceLevelTotalNonConf"));

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
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidInput) {
              throw (com.zeus.soap.zxtm._1_0.InvalidInput) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidObjectName) {
              throw (com.zeus.soap.zxtm._1_0.InvalidObjectName) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }


    /**
     * Gets the list of Service Level Monitoring classes configured.
     */
    public java.lang.String[] getServiceLevels() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[170]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getServiceLevels");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getServiceLevels"));

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
     * The time (in hundredths of a second) since this service protection
     * class last refused a connection (this value will wrap if no connections
     * are refused in more than 497 days), for each of the named ServiceProts.
     */
    public int[] getServiceProtLastRefusalTime(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[171]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getServiceProtLastRefusalTime");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getServiceProtLastRefusalTime"));

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
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidInput) {
              throw (com.zeus.soap.zxtm._1_0.InvalidInput) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidObjectName) {
              throw (com.zeus.soap.zxtm._1_0.InvalidObjectName) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }


    /**
     * The number of service protection classes defined.
     */
    public int getServiceProtNumber() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[172]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getServiceProtNumber");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getServiceProtNumber"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Connections refused by this service protection class because
     * the  request contained disallowed binary content, for each of the
     * named ServiceProts.
     */
    public int[] getServiceProtRefusalBinary(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[173]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getServiceProtRefusalBinary");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getServiceProtRefusalBinary"));

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
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidInput) {
              throw (com.zeus.soap.zxtm._1_0.InvalidInput) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidObjectName) {
              throw (com.zeus.soap.zxtm._1_0.InvalidObjectName) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }


    /**
     * Connections refused by this service protection class because
     * the  top 10 source IP addresses issued too many concurrent connections,
     * for each of the named ServiceProts.
     */
    public int[] getServiceProtRefusalConc10IP(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[174]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getServiceProtRefusalConc10IP");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getServiceProtRefusalConc10IP"));

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
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidInput) {
              throw (com.zeus.soap.zxtm._1_0.InvalidInput) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidObjectName) {
              throw (com.zeus.soap.zxtm._1_0.InvalidObjectName) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }


    /**
     * Connections refused by this service protection class because
     * the  source IP address issued too many concurrent connections, for
     * each of the named ServiceProts.
     */
    public int[] getServiceProtRefusalConc1IP(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[175]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getServiceProtRefusalConc1IP");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getServiceProtRefusalConc1IP"));

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
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidInput) {
              throw (com.zeus.soap.zxtm._1_0.InvalidInput) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidObjectName) {
              throw (com.zeus.soap.zxtm._1_0.InvalidObjectName) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }


    /**
     * Connections refused by this service protection class because
     * the  source IP address issued too many connections within 60 seconds,
     * for each of the named ServiceProts.
     */
    public int[] getServiceProtRefusalConnRate(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[176]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getServiceProtRefusalConnRate");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getServiceProtRefusalConnRate"));

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
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidInput) {
              throw (com.zeus.soap.zxtm._1_0.InvalidInput) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidObjectName) {
              throw (com.zeus.soap.zxtm._1_0.InvalidObjectName) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }


    /**
     * Connections refused by this service protection class because
     * the  source IP address was banned, for each of the named ServiceProts.
     */
    public int[] getServiceProtRefusalIP(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[177]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getServiceProtRefusalIP");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getServiceProtRefusalIP"));

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
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidInput) {
              throw (com.zeus.soap.zxtm._1_0.InvalidInput) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidObjectName) {
              throw (com.zeus.soap.zxtm._1_0.InvalidObjectName) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }


    /**
     * Connections refused by this service protection class because
     * the  HTTP request was not RFC 2396 compliant, for each of the named
     * ServiceProts.
     */
    public int[] getServiceProtRefusalRFC2396(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[178]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getServiceProtRefusalRFC2396");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getServiceProtRefusalRFC2396"));

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
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidInput) {
              throw (com.zeus.soap.zxtm._1_0.InvalidInput) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidObjectName) {
              throw (com.zeus.soap.zxtm._1_0.InvalidObjectName) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }


    /**
     * Connections refused by this service protection class because
     * the  request was larger than the defined limits allowed, for each
     * of the named ServiceProts.
     */
    public int[] getServiceProtRefusalSize(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[179]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getServiceProtRefusalSize");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getServiceProtRefusalSize"));

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
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidInput) {
              throw (com.zeus.soap.zxtm._1_0.InvalidInput) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidObjectName) {
              throw (com.zeus.soap.zxtm._1_0.InvalidObjectName) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }


    /**
     * Connections refused by this service protection class, for each
     * of the named ServiceProts.
     */
    public int[] getServiceProtTotalRefusal(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[180]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getServiceProtTotalRefusal");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getServiceProtTotalRefusal"));

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
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidInput) {
              throw (com.zeus.soap.zxtm._1_0.InvalidInput) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidObjectName) {
              throw (com.zeus.soap.zxtm._1_0.InvalidObjectName) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }


    /**
     * Gets the list of Service Protection Classes configured.
     */
    public java.lang.String[] getServiceProts() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[181]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getServiceProts");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getServiceProts"));

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
     * The total number of SSL sessions stored in the server cache.
     */
    public int getSslCacheEntries() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[182]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getSslCacheEntries");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getSslCacheEntries"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * The maximum number of SSL entries in the server cache.
     */
    public int getSslCacheEntriesMax() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[183]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getSslCacheEntriesMax");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getSslCacheEntriesMax"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * The percentage of SSL server cache lookups that succeeded.
     */
    public int getSslCacheHitRate() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[184]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getSslCacheHitRate");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getSslCacheHitRate"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Number of times a SSL entry has been successfully found in
     * the server cache.
     */
    public int getSslCacheHits() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[185]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getSslCacheHits");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getSslCacheHits"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Number of times a SSL entry has been looked up in the server
     * cache.
     */
    public int getSslCacheLookups() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[186]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getSslCacheLookups");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getSslCacheLookups"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Number of times a SSL entry has not been available in the server
     * cache.
     */
    public int getSslCacheMisses() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[187]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getSslCacheMisses");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getSslCacheMisses"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * The age of the oldest SSL session in the server cache (in seconds).
     */
    public int getSslCacheOldest() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[188]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getSslCacheOldest");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getSslCacheOldest"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Bytes decrypted with 3DES.
     */
    public int getSslCipher3DESDecrypts() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[189]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getSslCipher3DESDecrypts");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getSslCipher3DESDecrypts"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Bytes encrypted with 3DES.
     */
    public int getSslCipher3DESEncrypts() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[190]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getSslCipher3DESEncrypts");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getSslCipher3DESEncrypts"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Bytes decrypted with AES.
     */
    public int getSslCipherAESDecrypts() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[191]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getSslCipherAESDecrypts");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getSslCipherAESDecrypts"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Bytes encrypted with AES.
     */
    public int getSslCipherAESEncrypts() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[192]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getSslCipherAESEncrypts");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getSslCipherAESEncrypts"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Bytes decrypted with DES.
     */
    public int getSslCipherDESDecrypts() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[193]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getSslCipherDESDecrypts");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getSslCipherDESDecrypts"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Bytes encrypted with DES.
     */
    public int getSslCipherDESEncrypts() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[194]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getSslCipherDESEncrypts");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getSslCipherDESEncrypts"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Bytes decrypted with a symmetric cipher.
     */
    public int getSslCipherDecrypts() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[195]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getSslCipherDecrypts");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getSslCipherDecrypts"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Bytes encrypted with a symmetric cipher.
     */
    public int getSslCipherEncrypts() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[196]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getSslCipherEncrypts");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getSslCipherEncrypts"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Bytes decrypted with RC4.
     */
    public int getSslCipherRC4Decrypts() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[197]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getSslCipherRC4Decrypts");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getSslCipherRC4Decrypts"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Bytes encrypted with RC4.
     */
    public int getSslCipherRC4Encrypts() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[198]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getSslCipherRC4Encrypts");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getSslCipherRC4Encrypts"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Number of RSA decrypts.
     */
    public int getSslCipherRSADecrypts() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[199]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getSslCipherRSADecrypts");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getSslCipherRSADecrypts"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Number of external RSA decrypts.
     */
    public int getSslCipherRSADecryptsExternal() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[200]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getSslCipherRSADecryptsExternal");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getSslCipherRSADecryptsExternal"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Number of RSA encrypts.
     */
    public int getSslCipherRSAEncrypts() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[201]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getSslCipherRSAEncrypts");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getSslCipherRSAEncrypts"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Number of external RSA encrypts.
     */
    public int getSslCipherRSAEncryptsExternal() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[202]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getSslCipherRSAEncryptsExternal");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getSslCipherRSAEncryptsExternal"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Number of times a client certificate has expired.
     */
    public int getSslClientCertExpired() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[203]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getSslClientCertExpired");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getSslClientCertExpired"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Number of times a client certificate was invalid.
     */
    public int getSslClientCertInvalid() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[204]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getSslClientCertInvalid");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getSslClientCertInvalid"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Number of times a client certificate was required but not supplied.
     */
    public int getSslClientCertNotSent() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[205]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getSslClientCertNotSent");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getSslClientCertNotSent"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Number of times a client certificate was revoked.
     */
    public int getSslClientCertRevoked() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[206]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getSslClientCertRevoked");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getSslClientCertRevoked"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Number of SSL connections negotiated.
     */
    public int getSslConnections() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[207]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getSslConnections");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getSslConnections"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Number of SSLv2 handshakes.
     */
    public int getSslHandshakeSSLv2() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[208]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getSslHandshakeSSLv2");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getSslHandshakeSSLv2"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Number of SSLv3 handshakes.
     */
    public int getSslHandshakeSSLv3() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[209]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getSslHandshakeSSLv3");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getSslHandshakeSSLv3"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Number of TLSv1.0 handshakes.
     */
    public int getSslHandshakeTLSv1() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[210]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getSslHandshakeTLSv1");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getSslHandshakeTLSv1"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Number of TLSv1.1 handshakes.
     */
    public int getSslHandshakeTLSv11() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[211]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getSslHandshakeTLSv11");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getSslHandshakeTLSv11"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * The total number of SSL session persistence entries stored
     * in the cache.
     */
    public int getSslSessionCacheEntries() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[212]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getSslSessionCacheEntries");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getSslSessionCacheEntries"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * The maximum number of SSL session persistence entries in the
     * cache.
     */
    public int getSslSessionCacheEntriesMax() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[213]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getSslSessionCacheEntriesMax");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getSslSessionCacheEntriesMax"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * The percentage of SSL session persistence lookups that succeeded.
     */
    public int getSslSessionCacheHitRate() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[214]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getSslSessionCacheHitRate");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getSslSessionCacheHitRate"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Number of times a SSL session persistence entry has been successfully
     * found in the cache.
     */
    public int getSslSessionCacheHits() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[215]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getSslSessionCacheHits");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getSslSessionCacheHits"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Number of times a SSL session persistence entry has been looked
     * up in the cache.
     */
    public int getSslSessionCacheLookups() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[216]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getSslSessionCacheLookups");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getSslSessionCacheLookups"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Number of times a SSL session persistence entry has not been
     * available in the cache.
     */
    public int getSslSessionCacheMisses() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[217]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getSslSessionCacheMisses");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getSslSessionCacheMisses"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * The age of the oldest SSL session in the cache (in seconds).
     */
    public int getSslSessionCacheOldest() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[218]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getSslSessionCacheOldest");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getSslSessionCacheOldest"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Number of times the SSL session id was found in the disk cache
     * and reused (deprecated, will always return 0).
     */
    public int getSslSessionIDDiskCacheHit() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[219]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getSslSessionIDDiskCacheHit");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getSslSessionIDDiskCacheHit"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Number of times the SSL session id was not found in the disk
     * cache (deprecated, will always return 0).
     */
    public int getSslSessionIDDiskCacheMiss() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[220]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getSslSessionIDDiskCacheMiss");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getSslSessionIDDiskCacheMiss"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Number of times the SSL session id was found in the cache and
     * reused.
     */
    public int getSslSessionIDMemCacheHit() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[221]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getSslSessionIDMemCacheHit");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getSslSessionIDMemCacheHit"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Number of times the SSL session id was not found in the cache.
     */
    public int getSslSessionIDMemCacheMiss() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[222]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getSslSessionIDMemCacheMiss");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getSslSessionIDMemCacheMiss"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * The number of Steelheads.
     */
    public int getSteelheadNumber() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[223]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getSteelheadNumber");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getSteelheadNumber"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * The current number of connections being forwarded to the Cloud
     * Steelhead for optimization, for each of the named Steelheads.
     */
    public int[] getSteelheadOptimized(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[224]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getSteelheadOptimized");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getSteelheadOptimized"));

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
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidInput) {
              throw (com.zeus.soap.zxtm._1_0.InvalidInput) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidObjectName) {
              throw (com.zeus.soap.zxtm._1_0.InvalidObjectName) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }


    /**
     * Gets the list of Cloud Steelheads configured.
     */
    public java.lang.String[] getSteelheads() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[225]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getSteelheads");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getSteelheads"));

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
     * Percentage of time that the CPUs are busy.
     */
    public int getSysCPUBusyPercent() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[226]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getSysCPUBusyPercent");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getSysCPUBusyPercent"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Percentage of time that the CPUs are idle.
     */
    public int getSysCPUIdlePercent() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[227]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getSysCPUIdlePercent");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getSysCPUIdlePercent"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Percentage of time that the CPUs are busy running system code.
     */
    public int getSysCPUSystemBusyPercent() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[228]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getSysCPUSystemBusyPercent");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getSysCPUSystemBusyPercent"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Percentage of time that the CPUs are busy running user-space
     * code.
     */
    public int getSysCPUUserBusyPercent() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[229]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getSysCPUUserBusyPercent");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getSysCPUUserBusyPercent"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Number of free file descriptors.
     */
    public int getSysFDsFree() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[230]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getSysFDsFree");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getSysFDsFree"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Buffer memory (MBytes).
     */
    public int getSysMemBuffered() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[231]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getSysMemBuffered");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getSysMemBuffered"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Free memory (MBytes).
     */
    public int getSysMemFree() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[232]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getSysMemFree");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getSysMemFree"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Memory used (MBytes).
     */
    public int getSysMemInUse() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[233]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getSysMemInUse");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getSysMemInUse"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Total swap space (MBytes).
     */
    public int getSysMemSwapTotal() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[234]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getSysMemSwapTotal");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getSysMemSwapTotal"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Amount of swap space in use (MBytes).
     */
    public int getSysMemSwapped() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[235]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getSysMemSwapped");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getSysMemSwapped"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Total memory (MBytes).
     */
    public int getSysMemTotal() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[236]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getSysMemTotal");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getSysMemTotal"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * The time (in hundredths of a second) since the configuration
     * of traffic manager was updated (this value will wrap if no configuration
     * changes are made for 497 days).
     */
    public int getTimeLastConfigUpdate() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[237]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getTimeLastConfigUpdate");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getTimeLastConfigUpdate"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Total errors returned from the backend servers.
     */
    public int getTotalBackendServerErrors() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[238]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getTotalBackendServerErrors");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getTotalBackendServerErrors"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Total number of malformed DNS response packets encountered
     * from the backend servers.
     */
    public int getTotalBadDNSPackets() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[239]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getTotalBadDNSPackets");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getTotalBadDNSPackets"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Bytes received by the traffic manager from clients.
     */
    public long getTotalBytesIn() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[240]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getTotalBytesIn");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getTotalBytesIn"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Long) _resp).longValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Long) org.apache.axis.utils.JavaUtils.convert(_resp, long.class)).longValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Bytes sent by the traffic manager to clients.
     */
    public long getTotalBytesOut() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[241]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getTotalBytesOut");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getTotalBytesOut"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Long) _resp).longValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Long) org.apache.axis.utils.JavaUtils.convert(_resp, long.class)).longValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Total number of TCP connections received.
     */
    public int getTotalConn() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[242]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getTotalConn");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getTotalConn"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Number of TCP connections currently established.
     */
    public int getTotalCurrentConn() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[243]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getTotalCurrentConn");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getTotalCurrentConn"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Total number of DNS response packets handled.
     */
    public int getTotalDNSResponses() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[244]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getTotalDNSResponses");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getTotalDNSResponses"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Total number of TCP requests recieved.
     */
    public int getTotalRequests() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[245]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getTotalRequests");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getTotalRequests"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Total number of TCP requests being processed, after applying
     * TPS limits.
     */
    public int getTotalTransactions() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[246]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getTotalTransactions");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getTotalTransactions"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Number of ARP messages sent for raised Traffic IP Addresses.
     */
    public int getTrafficIPARPMessage() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[247]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getTrafficIPARPMessage");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getTrafficIPARPMessage"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Number of ping requests sent to the gateway machine.
     */
    public int getTrafficIPGatewayPingRequests() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[248]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getTrafficIPGatewayPingRequests");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getTrafficIPGatewayPingRequests"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Number of ping responses received from the gateway machine.
     */
    public int getTrafficIPGatewayPingResponses() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[249]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getTrafficIPGatewayPingResponses");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getTrafficIPGatewayPingResponses"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Number of ping requests sent to the backend nodes.
     */
    public int getTrafficIPNodePingRequests() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[250]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getTrafficIPNodePingRequests");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getTrafficIPNodePingRequests"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Number of ping responses received from the backend nodes.
     */
    public int getTrafficIPNodePingResponses() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[251]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getTrafficIPNodePingResponses");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getTrafficIPNodePingResponses"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * The number of traffic IP addresses on this system (includes
     * IPv4 and IPv6 addresses).
     */
    public int getTrafficIPNumber() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[252]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getTrafficIPNumber");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getTrafficIPNumber"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * The number of traffic IP addresses currently raised on this
     * system (includes IPv4 and IPv6 addresses).
     */
    public int getTrafficIPNumberRaised() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[253]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getTrafficIPNumberRaised");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getTrafficIPNumberRaised"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Number of ping response errors.
     */
    public int getTrafficIPPingResponseErrors() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[254]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getTrafficIPPingResponseErrors");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getTrafficIPPingResponseErrors"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Whether this traffic IP address is currently being hosted by
     * this traffic manager, for each of the specified TrafficIPs.
     */
    public com.zeus.soap.zxtm._1_0.SystemStatsTrafficIPState[] getTrafficIPState(java.lang.String[] traffic_ip_addresses) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[255]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getTrafficIPState");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getTrafficIPState"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {traffic_ip_addresses});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.zeus.soap.zxtm._1_0.SystemStatsTrafficIPState[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.zeus.soap.zxtm._1_0.SystemStatsTrafficIPState[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.zeus.soap.zxtm._1_0.SystemStatsTrafficIPState[].class);
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
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidObjectName) {
              throw (com.zeus.soap.zxtm._1_0.InvalidObjectName) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }


    /**
     * The time (in hundredths of a second) since trafficIPState last
     * changed (this value will wrap if the state hasn't changed for 497
     * days), for each of the specified TrafficIPs.
     */
    public int[] getTrafficIPTime(java.lang.String[] traffic_ip_addresses) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[256]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getTrafficIPTime");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getTrafficIPTime"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {traffic_ip_addresses});

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
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidInput) {
              throw (com.zeus.soap.zxtm._1_0.InvalidInput) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidObjectName) {
              throw (com.zeus.soap.zxtm._1_0.InvalidObjectName) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }


    /**
     * Gets the list of Traffic IP addresses configured.
     */
    public java.lang.String[] getTrafficIPs() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[257]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getTrafficIPs");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getTrafficIPs"));

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
     * The total number of universal sessions stored in the cache.
     */
    public int getUniSessionCacheEntries() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[258]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getUniSessionCacheEntries");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getUniSessionCacheEntries"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * The maximum number of universal sessions in the cache.
     */
    public int getUniSessionCacheEntriesMax() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[259]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getUniSessionCacheEntriesMax");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getUniSessionCacheEntriesMax"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * The percentage of universal session lookups that succeeded.
     */
    public int getUniSessionCacheHitRate() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[260]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getUniSessionCacheHitRate");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getUniSessionCacheHitRate"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Number of times a universal session entry has been successfully
     * found in the cache.
     */
    public int getUniSessionCacheHits() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[261]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getUniSessionCacheHits");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getUniSessionCacheHits"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Number of times a universal session entry has been looked up
     * in the cache.
     */
    public int getUniSessionCacheLookups() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[262]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getUniSessionCacheLookups");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getUniSessionCacheLookups"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Number of times a universal session entry has not been available
     * in the cache.
     */
    public int getUniSessionCacheMisses() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[263]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getUniSessionCacheMisses");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getUniSessionCacheMisses"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * The age of the oldest universal session in the cache (in seconds).
     */
    public int getUniSessionCacheOldest() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[264]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getUniSessionCacheOldest");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getUniSessionCacheOldest"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * The time (in hundredths of a second) that Stingray software
     * has been operational for (this value will wrap if it has been running
     * for more than 497 days).
     */
    public int getUpTime() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[265]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getUpTime");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getUpTime"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * The value of the 64-bit user counter, for each of the named
     * UserCounter64s.
     */
    public long[] getUserCounter64Value(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[266]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getUserCounter64Value");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getUserCounter64Value"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {names});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (long[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (long[]) org.apache.axis.utils.JavaUtils.convert(_resp, long[].class);
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
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidObjectName) {
              throw (com.zeus.soap.zxtm._1_0.InvalidObjectName) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }


    /**
     * Gets the list of 64-bit User counters configured.
     */
    public java.lang.String[] getUserCounter64S() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[267]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getUserCounter64s");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getUserCounter64s"));

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
     * The number of user defined counters.
     */
    public int getUserCounterNumber() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[268]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getUserCounterNumber");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getUserCounterNumber"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * The value of the user counter, for each of the named UserCounters.
     */
    public int[] getUserCounterValue(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[269]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getUserCounterValue");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getUserCounterValue"));

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
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidInput) {
              throw (com.zeus.soap.zxtm._1_0.InvalidInput) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidObjectName) {
              throw (com.zeus.soap.zxtm._1_0.InvalidObjectName) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }


    /**
     * Gets the list of User counters configured.
     */
    public java.lang.String[] getUserCounters() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[270]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getUserCounters");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getUserCounters"));

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
     * Bytes received by this virtual server from clients, for each
     * of the named Virtualservers.
     */
    public long[] getVirtualserverBytesIn(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[271]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getVirtualserverBytesIn");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getVirtualserverBytesIn"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {names});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (long[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (long[]) org.apache.axis.utils.JavaUtils.convert(_resp, long[].class);
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
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidObjectName) {
              throw (com.zeus.soap.zxtm._1_0.InvalidObjectName) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }


    /**
     * Bytes sent by this virtual server to clients, for each of the
     * named Virtualservers.
     */
    public long[] getVirtualserverBytesOut(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[272]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getVirtualserverBytesOut");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getVirtualserverBytesOut"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {names});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (long[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (long[]) org.apache.axis.utils.JavaUtils.convert(_resp, long[].class);
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
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidObjectName) {
              throw (com.zeus.soap.zxtm._1_0.InvalidObjectName) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }


    /**
     * Connections closed by this virtual server because the 'connect_timeout'
     * interval was exceeded, for each of the named Virtualservers.
     */
    public int[] getVirtualserverConnectTimedOut(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[273]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getVirtualserverConnectTimedOut");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getVirtualserverConnectTimedOut"));

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
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidInput) {
              throw (com.zeus.soap.zxtm._1_0.InvalidInput) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidObjectName) {
              throw (com.zeus.soap.zxtm._1_0.InvalidObjectName) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }


    /**
     * Number of transaction or protocol errors in this virtual server,
     * for each of the named Virtualservers.
     */
    public int[] getVirtualserverConnectionErrors(java.lang.String[] names) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[274]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getVirtualserverConnectionErrors");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getVirtualserverConnectionErrors"));

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
  throw axisFaultException;
}
    }


    /**
     * Number of connection failures in this virtual server, for each
     * of the named Virtualservers.
     */
    public int[] getVirtualserverConnectionFailures(java.lang.String[] names) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[275]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getVirtualserverConnectionFailures");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getVirtualserverConnectionFailures"));

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
  throw axisFaultException;
}
    }


    /**
     * TCP connections currently established to this virtual server,
     * for each of the named Virtualservers.
     */
    public int[] getVirtualserverCurrentConn(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[276]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getVirtualserverCurrentConn");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getVirtualserverCurrentConn"));

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
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidInput) {
              throw (com.zeus.soap.zxtm._1_0.InvalidInput) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidObjectName) {
              throw (com.zeus.soap.zxtm._1_0.InvalidObjectName) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }


    /**
     * Connections closed by this virtual server because the 'timeout'
     * interval was exceeded, for each of the named Virtualservers.
     */
    public int[] getVirtualserverDataTimedOut(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[277]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getVirtualserverDataTimedOut");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getVirtualserverDataTimedOut"));

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
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidInput) {
              throw (com.zeus.soap.zxtm._1_0.InvalidInput) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidObjectName) {
              throw (com.zeus.soap.zxtm._1_0.InvalidObjectName) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }


    /**
     * Direct replies from this virtual server, without forwarding
     * to a node, for each of the named Virtualservers.
     */
    public int[] getVirtualserverDirectReplies(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[278]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getVirtualserverDirectReplies");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getVirtualserverDirectReplies"));

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
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidInput) {
              throw (com.zeus.soap.zxtm._1_0.InvalidInput) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidObjectName) {
              throw (com.zeus.soap.zxtm._1_0.InvalidObjectName) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }


    /**
     * Connections discarded by this virtual server, for each of the
     * named Virtualservers.
     */
    public int[] getVirtualserverDiscard(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[279]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getVirtualserverDiscard");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getVirtualserverDiscard"));

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
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidInput) {
              throw (com.zeus.soap.zxtm._1_0.InvalidInput) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidObjectName) {
              throw (com.zeus.soap.zxtm._1_0.InvalidObjectName) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }


    /**
     * Responses which have been compressed by content compression,
     * for each of the named Virtualservers.
     */
    public int[] getVirtualserverGzip(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[280]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getVirtualserverGzip");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getVirtualserverGzip"));

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
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidInput) {
              throw (com.zeus.soap.zxtm._1_0.InvalidInput) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidObjectName) {
              throw (com.zeus.soap.zxtm._1_0.InvalidObjectName) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }


    /**
     * Bytes of network traffic saved by content compression, for
     * each of the named Virtualservers.
     */
    public long[] getVirtualserverGzipBytesSaved(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[281]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getVirtualserverGzipBytesSaved");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getVirtualserverGzipBytesSaved"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {names});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (long[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (long[]) org.apache.axis.utils.JavaUtils.convert(_resp, long[].class);
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
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidObjectName) {
              throw (com.zeus.soap.zxtm._1_0.InvalidObjectName) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }


    /**
     * Percentage hit rate of the web cache for this virtual server,
     * for each of the named Virtualservers.
     */
    public int[] getVirtualserverHttpCacheHitRate(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[282]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getVirtualserverHttpCacheHitRate");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getVirtualserverHttpCacheHitRate"));

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
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidInput) {
              throw (com.zeus.soap.zxtm._1_0.InvalidInput) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidObjectName) {
              throw (com.zeus.soap.zxtm._1_0.InvalidObjectName) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }


    /**
     * HTTP responses sent directly from the web cache by this virtual
     * server, for each of the named Virtualservers.
     */
    public int[] getVirtualserverHttpCacheHits(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[283]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getVirtualserverHttpCacheHits");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getVirtualserverHttpCacheHits"));

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
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidInput) {
              throw (com.zeus.soap.zxtm._1_0.InvalidInput) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidObjectName) {
              throw (com.zeus.soap.zxtm._1_0.InvalidObjectName) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }


    /**
     * HTTP requests that are looked up in the web cache by this virtual
     * server, for each of the named Virtualservers.
     */
    public int[] getVirtualserverHttpCacheLookups(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[284]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getVirtualserverHttpCacheLookups");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getVirtualserverHttpCacheLookups"));

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
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidInput) {
              throw (com.zeus.soap.zxtm._1_0.InvalidInput) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidObjectName) {
              throw (com.zeus.soap.zxtm._1_0.InvalidObjectName) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }


    /**
     * HTTP Set-Cookie headers, supplied by a node, that have been
     * rewritten, for each of the named Virtualservers.
     */
    public int[] getVirtualserverHttpRewriteCookie(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[285]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getVirtualserverHttpRewriteCookie");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getVirtualserverHttpRewriteCookie"));

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
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidInput) {
              throw (com.zeus.soap.zxtm._1_0.InvalidInput) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidObjectName) {
              throw (com.zeus.soap.zxtm._1_0.InvalidObjectName) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }


    /**
     * HTTP Location headers, supplied by a node, that have been rewritten,
     * for each of the named Virtualservers.
     */
    public int[] getVirtualserverHttpRewriteLocation(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[286]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getVirtualserverHttpRewriteLocation");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getVirtualserverHttpRewriteLocation"));

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
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidInput) {
              throw (com.zeus.soap.zxtm._1_0.InvalidInput) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidObjectName) {
              throw (com.zeus.soap.zxtm._1_0.InvalidObjectName) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }


    /**
     * Connections closed by this virtual server because the 'keepalive_timeout'
     * interval was exceeded, for each of the named Virtualservers.
     */
    public int[] getVirtualserverKeepaliveTimedOut(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[287]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getVirtualserverKeepaliveTimedOut");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getVirtualserverKeepaliveTimedOut"));

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
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidInput) {
              throw (com.zeus.soap.zxtm._1_0.InvalidInput) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidObjectName) {
              throw (com.zeus.soap.zxtm._1_0.InvalidObjectName) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }


    /**
     * Maximum number of simultaneous TCP connections this virtual
     * server has processed at any one time, for each of the named Virtualservers.
     */
    public int[] getVirtualserverMaxConn(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[288]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getVirtualserverMaxConn");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getVirtualserverMaxConn"));

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
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidInput) {
              throw (com.zeus.soap.zxtm._1_0.InvalidInput) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidObjectName) {
              throw (com.zeus.soap.zxtm._1_0.InvalidObjectName) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }


    /**
     * The number of virtual servers.
     */
    public int getVirtualserverNumber() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[289]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getVirtualserverNumber");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getVirtualserverNumber"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * The port the virtual server listens on, for each of the named
     * Virtualservers.
     */
    public int[] getVirtualserverPort(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[290]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getVirtualserverPort");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getVirtualserverPort"));

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
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidInput) {
              throw (com.zeus.soap.zxtm._1_0.InvalidInput) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidObjectName) {
              throw (com.zeus.soap.zxtm._1_0.InvalidObjectName) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }


    /**
     * The protocol the virtual server is operating, for each of the
     * named Virtualservers.
     */
    public com.zeus.soap.zxtm._1_0.SystemStatsVirtualserverProtocol[] getVirtualserverProtocol(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[291]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getVirtualserverProtocol");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getVirtualserverProtocol"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {names});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.zeus.soap.zxtm._1_0.SystemStatsVirtualserverProtocol[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.zeus.soap.zxtm._1_0.SystemStatsVirtualserverProtocol[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.zeus.soap.zxtm._1_0.SystemStatsVirtualserverProtocol[].class);
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
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidObjectName) {
              throw (com.zeus.soap.zxtm._1_0.InvalidObjectName) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }


    /**
     * Number of SIP requests rejected due to them exceeding the maximum
     * amount of memory allocated to the connection, for each of the named
     * Virtualservers.
     */
    public int[] getVirtualserverSIPRejectedRequests(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[292]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getVirtualserverSIPRejectedRequests");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getVirtualserverSIPRejectedRequests"));

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
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidInput) {
              throw (com.zeus.soap.zxtm._1_0.InvalidInput) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidObjectName) {
              throw (com.zeus.soap.zxtm._1_0.InvalidObjectName) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }


    /**
     * Total number of SIP INVITE requests seen by this virtual server,
     * for each of the named Virtualservers.
     */
    public int[] getVirtualserverSIPTotalCalls(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[293]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getVirtualserverSIPTotalCalls");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getVirtualserverSIPTotalCalls"));

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
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidInput) {
              throw (com.zeus.soap.zxtm._1_0.InvalidInput) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidObjectName) {
              throw (com.zeus.soap.zxtm._1_0.InvalidObjectName) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }


    /**
     * Requests received by this virtual server, for each of the named
     * Virtualservers.
     */
    public int[] getVirtualserverTotalConn(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[294]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getVirtualserverTotalConn");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getVirtualserverTotalConn"));

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
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidInput) {
              throw (com.zeus.soap.zxtm._1_0.InvalidInput) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidObjectName) {
              throw (com.zeus.soap.zxtm._1_0.InvalidObjectName) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }


    /**
     * UDP datagrams processed by this virtual server, for each of
     * the named Virtualservers.
     */
    public int[] getVirtualserverTotalDgram(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[295]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getVirtualserverTotalDgram");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getVirtualserverTotalDgram"));

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
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidInput) {
              throw (com.zeus.soap.zxtm._1_0.InvalidInput) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidObjectName) {
              throw (com.zeus.soap.zxtm._1_0.InvalidObjectName) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }


    /**
     * Connections closed by this virtual server because the 'udp_timeout'
     * interval was exceeded, for each of the named Virtualservers.
     */
    public int[] getVirtualserverUdpTimedOut(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[296]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getVirtualserverUdpTimedOut");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getVirtualserverUdpTimedOut"));

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
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidInput) {
              throw (com.zeus.soap.zxtm._1_0.InvalidInput) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidObjectName) {
              throw (com.zeus.soap.zxtm._1_0.InvalidObjectName) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }


    /**
     * Gets the list of Virtual Servers configured and enabled.
     */
    public java.lang.String[] getVirtualservers() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[297]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getVirtualservers");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getVirtualservers"));

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
     * The number of items in the web cache.
     */
    public int getWebCacheEntries() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[298]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getWebCacheEntries");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getWebCacheEntries"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * The percentage of web cache lookups that succeeded.
     */
    public int getWebCacheHitRate() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[299]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getWebCacheHitRate");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getWebCacheHitRate"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Number of times a page has been successfully found in the web
     * cache.
     */
    public long getWebCacheHits() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[300]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getWebCacheHits");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getWebCacheHits"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Long) _resp).longValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Long) org.apache.axis.utils.JavaUtils.convert(_resp, long.class)).longValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Number of times a page has been looked up in the web cache.
     */
    public long getWebCacheLookups() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[301]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getWebCacheLookups");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getWebCacheLookups"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Long) _resp).longValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Long) org.apache.axis.utils.JavaUtils.convert(_resp, long.class)).longValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * The maximum number of items in the web cache.
     */
    public int getWebCacheMaxEntries() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[302]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getWebCacheMaxEntries");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getWebCacheMaxEntries"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * The maximum amount of memory the web cache can use in kilobytes.
     */
    public int getWebCacheMemMaximum() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[303]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getWebCacheMemMaximum");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getWebCacheMemMaximum"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Total memory used by the web cache in kilobytes.
     */
    public int getWebCacheMemUsed() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[304]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getWebCacheMemUsed");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getWebCacheMemUsed"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Number of times a page has not been found in the web cache.
     */
    public long getWebCacheMisses() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[305]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getWebCacheMisses");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getWebCacheMisses"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Long) _resp).longValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Long) org.apache.axis.utils.JavaUtils.convert(_resp, long.class)).longValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * The age of the oldest item in the web cache (in seconds).
     */
    public int getWebCacheOldest() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[306]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getWebCacheOldest");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getWebCacheOldest"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * The number of traffic managers in the cluster.
     */
    public int getZxtmNumber() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[307]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/System/Stats/getZxtmNumber");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/System/Stats/", "getZxtmNumber"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}

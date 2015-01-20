/**
 * TrafficIPGroupsBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.zeus.soap.zxtm._1_0;

public class TrafficIPGroupsBindingStub extends org.apache.axis.client.Stub implements com.zeus.soap.zxtm._1_0.TrafficIPGroupsPort {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[34];
        _initOperationDesc1();
        _initOperationDesc2();
        _initOperationDesc3();
        _initOperationDesc4();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("addIPAddresses");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "values"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArrayArray"), java.lang.String[][].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/TrafficIPGroups/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidInput",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidInput"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/TrafficIPGroups/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidOperation",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidOperation"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/TrafficIPGroups/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.DeploymentError",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "DeploymentError"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/TrafficIPGroups/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.ObjectDoesNotExist",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "ObjectDoesNotExist"), 
                      true
                     ));
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("addPassiveMachine");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "values"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArrayArray"), java.lang.String[][].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/TrafficIPGroups/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidInput",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidInput"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/TrafficIPGroups/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidOperation",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidOperation"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/TrafficIPGroups/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.DeploymentError",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "DeploymentError"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/TrafficIPGroups/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.ObjectDoesNotExist",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "ObjectDoesNotExist"), 
                      true
                     ));
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("addTrafficIPGroup");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "details"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "TrafficIPGroups.DetailsArray"), com.zeus.soap.zxtm._1_0.TrafficIPGroupsDetails[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/TrafficIPGroups/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidInput",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidInput"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/TrafficIPGroups/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidOperation",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidOperation"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/TrafficIPGroups/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.DeploymentError",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "DeploymentError"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/TrafficIPGroups/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidObjectName",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidObjectName"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/TrafficIPGroups/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.ObjectAlreadyExists",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "ObjectAlreadyExists"), 
                      true
                     ));
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("addTrafficManager");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "values"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArrayArray"), java.lang.String[][].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/TrafficIPGroups/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidInput",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidInput"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/TrafficIPGroups/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.DeploymentError",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "DeploymentError"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/TrafficIPGroups/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.ObjectDoesNotExist",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "ObjectDoesNotExist"), 
                      true
                     ));
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("deleteSpecificSubnetMappings");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "mappings"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "TrafficIPGroups.SubnetMappingPerHostArray"), com.zeus.soap.zxtm._1_0.TrafficIPGroupsSubnetMappingPerHost[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/TrafficIPGroups/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidInput",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidInput"), 
                      true
                     ));
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("deleteSubnetMappings");
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("deleteTrafficIPGroup");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/TrafficIPGroups/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidOperation",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidOperation"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/TrafficIPGroups/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.DeploymentError",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "DeploymentError"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/TrafficIPGroups/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.ObjectDoesNotExist",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "ObjectDoesNotExist"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/TrafficIPGroups/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.ObjectInUse",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "ObjectInUse"), 
                      true
                     ));
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getAvailableTrafficManagers");
        oper.setReturnType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"));
        oper.setReturnClass(java.lang.String[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "names"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[7] = oper;

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
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/TrafficIPGroups/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.ObjectDoesNotExist",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "ObjectDoesNotExist"), 
                      true
                     ));
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getIPAddresses");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArrayArray"));
        oper.setReturnClass(java.lang.String[][].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "values"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/TrafficIPGroups/", "parameters"),
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
        oper.setName("getIPDistributionMode");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "TrafficIPGroups.IPDistributionModeArray"));
        oper.setReturnClass(com.zeus.soap.zxtm._1_0.TrafficIPGroupsIPDistributionMode[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "values"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/TrafficIPGroups/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.ObjectDoesNotExist",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "ObjectDoesNotExist"), 
                      true
                     ));
        _operations[10] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getKeepTogether");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "booleanArray"));
        oper.setReturnClass(boolean[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "values"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/TrafficIPGroups/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.ObjectDoesNotExist",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "ObjectDoesNotExist"), 
                      true
                     ));
        _operations[11] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getMulticastIP");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"));
        oper.setReturnClass(java.lang.String[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "values"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/TrafficIPGroups/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.ObjectDoesNotExist",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "ObjectDoesNotExist"), 
                      true
                     ));
        _operations[12] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getNetworkInterfaces");
        oper.setReturnType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "TrafficIPGroups.NetworkInterfaceArray"));
        oper.setReturnClass(com.zeus.soap.zxtm._1_0.TrafficIPGroupsNetworkInterface[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "interfaces"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[13] = oper;

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
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/TrafficIPGroups/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.ObjectDoesNotExist",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "ObjectDoesNotExist"), 
                      true
                     ));
        _operations[14] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getPassiveMachine");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArrayArray"));
        oper.setReturnClass(java.lang.String[][].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "values"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/TrafficIPGroups/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.ObjectDoesNotExist",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "ObjectDoesNotExist"), 
                      true
                     ));
        _operations[15] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getSubnetMappings");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "hostnames"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "TrafficIPGroups.SubnetMappingPerHostArray"));
        oper.setReturnClass(com.zeus.soap.zxtm._1_0.TrafficIPGroupsSubnetMappingPerHost[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "mappings"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/TrafficIPGroups/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidInput",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidInput"), 
                      true
                     ));
        _operations[16] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getTrafficIPGroupNames");
        oper.setReturnType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"));
        oper.setReturnClass(java.lang.String[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "names"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[17] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getTrafficManager");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArrayArray"));
        oper.setReturnClass(java.lang.String[][].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "values"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/TrafficIPGroups/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.ObjectDoesNotExist",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "ObjectDoesNotExist"), 
                      true
                     ));
        _operations[18] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getUseClientSourcePort");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "booleanArray"));
        oper.setReturnClass(boolean[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "values"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/TrafficIPGroups/", "parameters"),
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
        oper.setName("removeIPAddresses");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "values"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArrayArray"), java.lang.String[][].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/TrafficIPGroups/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidInput",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidInput"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/TrafficIPGroups/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidOperation",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidOperation"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/TrafficIPGroups/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.DeploymentError",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "DeploymentError"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/TrafficIPGroups/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.ObjectDoesNotExist",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "ObjectDoesNotExist"), 
                      true
                     ));
        _operations[20] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("removePassiveMachine");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "values"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArrayArray"), java.lang.String[][].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/TrafficIPGroups/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidInput",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidInput"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/TrafficIPGroups/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.DeploymentError",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "DeploymentError"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/TrafficIPGroups/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.ObjectDoesNotExist",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "ObjectDoesNotExist"), 
                      true
                     ));
        _operations[21] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("removeTrafficManager");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "values"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArrayArray"), java.lang.String[][].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/TrafficIPGroups/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidOperation",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidOperation"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/TrafficIPGroups/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.DeploymentError",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "DeploymentError"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/TrafficIPGroups/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.ObjectDoesNotExist",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "ObjectDoesNotExist"), 
                      true
                     ));
        _operations[22] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("renameTrafficIPGroup");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "new_names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/TrafficIPGroups/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidInput",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidInput"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/TrafficIPGroups/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidOperation",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidOperation"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/TrafficIPGroups/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.DeploymentError",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "DeploymentError"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/TrafficIPGroups/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.ObjectDoesNotExist",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "ObjectDoesNotExist"), 
                      true
                     ));
        _operations[23] = oper;

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
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/TrafficIPGroups/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidInput",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidInput"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/TrafficIPGroups/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.DeploymentError",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "DeploymentError"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/TrafficIPGroups/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.ObjectDoesNotExist",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "ObjectDoesNotExist"), 
                      true
                     ));
        _operations[24] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("setIPAddresses");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "values"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArrayArray"), java.lang.String[][].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/TrafficIPGroups/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidInput",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidInput"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/TrafficIPGroups/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidOperation",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidOperation"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/TrafficIPGroups/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.DeploymentError",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "DeploymentError"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/TrafficIPGroups/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.ObjectDoesNotExist",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "ObjectDoesNotExist"), 
                      true
                     ));
        _operations[25] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("setIPDistributionMode");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "values"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "TrafficIPGroups.IPDistributionModeArray"), com.zeus.soap.zxtm._1_0.TrafficIPGroupsIPDistributionMode[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/TrafficIPGroups/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidInput",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidInput"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/TrafficIPGroups/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.DeploymentError",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "DeploymentError"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/TrafficIPGroups/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.ObjectDoesNotExist",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "ObjectDoesNotExist"), 
                      true
                     ));
        _operations[26] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("setKeepTogether");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "values"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "booleanArray"), boolean[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/TrafficIPGroups/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidInput",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidInput"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/TrafficIPGroups/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.DeploymentError",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "DeploymentError"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/TrafficIPGroups/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.ObjectDoesNotExist",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "ObjectDoesNotExist"), 
                      true
                     ));
        _operations[27] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("setMulticastIP");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "values"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/TrafficIPGroups/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidInput",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidInput"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/TrafficIPGroups/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.DeploymentError",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "DeploymentError"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/TrafficIPGroups/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.ObjectDoesNotExist",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "ObjectDoesNotExist"), 
                      true
                     ));
        _operations[28] = oper;

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
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/TrafficIPGroups/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidInput",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidInput"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/TrafficIPGroups/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidOperation",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidOperation"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/TrafficIPGroups/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.DeploymentError",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "DeploymentError"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/TrafficIPGroups/", "parameters"),
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
        oper.setName("setPassiveMachine");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "values"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArrayArray"), java.lang.String[][].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/TrafficIPGroups/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidInput",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidInput"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/TrafficIPGroups/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidOperation",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidOperation"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/TrafficIPGroups/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.DeploymentError",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "DeploymentError"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/TrafficIPGroups/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.ObjectDoesNotExist",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "ObjectDoesNotExist"), 
                      true
                     ));
        _operations[30] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("setSubnetMappings");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "mappings"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "TrafficIPGroups.SubnetMappingPerHostArray"), com.zeus.soap.zxtm._1_0.TrafficIPGroupsSubnetMappingPerHost[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/TrafficIPGroups/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidInput",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidInput"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/TrafficIPGroups/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.DeploymentError",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "DeploymentError"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/TrafficIPGroups/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.ObjectDoesNotExist",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "ObjectDoesNotExist"), 
                      true
                     ));
        _operations[31] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("setTrafficManager");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "values"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArrayArray"), java.lang.String[][].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/TrafficIPGroups/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidInput",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidInput"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/TrafficIPGroups/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidOperation",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidOperation"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/TrafficIPGroups/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.DeploymentError",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "DeploymentError"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/TrafficIPGroups/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.ObjectDoesNotExist",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "ObjectDoesNotExist"), 
                      true
                     ));
        _operations[32] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("setUseClientSourcePort");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "StringArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "values"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "booleanArray"), boolean[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/TrafficIPGroups/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.InvalidInput",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidInput"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/TrafficIPGroups/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.DeploymentError",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "DeploymentError"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/TrafficIPGroups/", "parameters"),
                      "com.zeus.soap.zxtm._1_0.ObjectDoesNotExist",
                      new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "ObjectDoesNotExist"), 
                      true
                     ));
        _operations[33] = oper;

    }

    public TrafficIPGroupsBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public TrafficIPGroupsBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public TrafficIPGroupsBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
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

            qName = new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "TrafficIPGroups.Details");
            cachedSerQNames.add(qName);
            cls = com.zeus.soap.zxtm._1_0.TrafficIPGroupsDetails.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "TrafficIPGroups.DetailsArray");
            cachedSerQNames.add(qName);
            cls = com.zeus.soap.zxtm._1_0.TrafficIPGroupsDetails[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "TrafficIPGroups.Details");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "TrafficIPGroups.IPDistributionMode");
            cachedSerQNames.add(qName);
            cls = com.zeus.soap.zxtm._1_0.TrafficIPGroupsIPDistributionMode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "TrafficIPGroups.IPDistributionModeArray");
            cachedSerQNames.add(qName);
            cls = com.zeus.soap.zxtm._1_0.TrafficIPGroupsIPDistributionMode[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "TrafficIPGroups.IPDistributionMode");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "TrafficIPGroups.NetworkInterface");
            cachedSerQNames.add(qName);
            cls = com.zeus.soap.zxtm._1_0.TrafficIPGroupsNetworkInterface.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "TrafficIPGroups.NetworkInterfaceArray");
            cachedSerQNames.add(qName);
            cls = com.zeus.soap.zxtm._1_0.TrafficIPGroupsNetworkInterface[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "TrafficIPGroups.NetworkInterface");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "TrafficIPGroups.SubnetMapping");
            cachedSerQNames.add(qName);
            cls = com.zeus.soap.zxtm._1_0.TrafficIPGroupsSubnetMapping.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "TrafficIPGroups.SubnetMappingArray");
            cachedSerQNames.add(qName);
            cls = com.zeus.soap.zxtm._1_0.TrafficIPGroupsSubnetMapping[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "TrafficIPGroups.SubnetMapping");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "TrafficIPGroups.SubnetMappingPerHost");
            cachedSerQNames.add(qName);
            cls = com.zeus.soap.zxtm._1_0.TrafficIPGroupsSubnetMappingPerHost.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "TrafficIPGroups.SubnetMappingPerHostArray");
            cachedSerQNames.add(qName);
            cls = com.zeus.soap.zxtm._1_0.TrafficIPGroupsSubnetMappingPerHost[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "TrafficIPGroups.SubnetMappingPerHost");
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
     * Add new IP addresses to each of the named traffic IP groups.
     */
    public void addIPAddresses(java.lang.String[] names, java.lang.String[][] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidOperation, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/TrafficIPGroups/addIPAddresses");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/TrafficIPGroups/", "addIPAddresses"));

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
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidInput) {
              throw (com.zeus.soap.zxtm._1_0.InvalidInput) axisFaultException.detail;
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
   }
  throw axisFaultException;
}
    }


    /**
     * Add machines to the lists of passive machines, for each of
     * the named traffic IP groups.
     */
    public void addPassiveMachine(java.lang.String[] names, java.lang.String[][] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidOperation, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/TrafficIPGroups/addPassiveMachine");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/TrafficIPGroups/", "addPassiveMachine"));

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
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidInput) {
              throw (com.zeus.soap.zxtm._1_0.InvalidInput) axisFaultException.detail;
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
   }
  throw axisFaultException;
}
    }


    /**
     * Add the new named Traffic IP Groups, using the provided details.
     */
    public void addTrafficIPGroup(java.lang.String[] names, com.zeus.soap.zxtm._1_0.TrafficIPGroupsDetails[] details) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidOperation, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.InvalidObjectName, com.zeus.soap.zxtm._1_0.ObjectAlreadyExists {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/TrafficIPGroups/addTrafficIPGroup");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/TrafficIPGroups/", "addTrafficIPGroup"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {names, details});

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
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidOperation) {
              throw (com.zeus.soap.zxtm._1_0.InvalidOperation) axisFaultException.detail;
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
     * Add new traffic managers to each of the named traffic IP groups.
     */
    public void addTrafficManager(java.lang.String[] names, java.lang.String[][] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/TrafficIPGroups/addTrafficManager");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/TrafficIPGroups/", "addTrafficManager"));

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
     * Delete specified interface network mappings.
     */
    public void deleteSpecificSubnetMappings(com.zeus.soap.zxtm._1_0.TrafficIPGroupsSubnetMappingPerHost[] mappings) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/TrafficIPGroups/deleteSpecificSubnetMappings");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/TrafficIPGroups/", "deleteSpecificSubnetMappings"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {mappings});

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
   }
  throw axisFaultException;
}
    }


    /**
     * Delete all interface network mappings.
     */
    public void deleteSubnetMappings() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/TrafficIPGroups/deleteSubnetMappings");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/TrafficIPGroups/", "deleteSubnetMappings"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Delete the named Traffic IP Groups.
     */
    public void deleteTrafficIPGroup(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidOperation, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist, com.zeus.soap.zxtm._1_0.ObjectInUse {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/TrafficIPGroups/deleteTrafficIPGroup");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/TrafficIPGroups/", "deleteTrafficIPGroup"));

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
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidOperation) {
              throw (com.zeus.soap.zxtm._1_0.InvalidOperation) axisFaultException.detail;
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
     * Get the names of all of the Traffic Managers in the cluster.
     */
    public java.lang.String[] getAvailableTrafficManagers() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/TrafficIPGroups/getAvailableTrafficManagers");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/TrafficIPGroups/", "getAvailableTrafficManagers"));

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
     * Get whether this traffic IP group is enabled or not.
     */
    public boolean[] getEnabled(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/TrafficIPGroups/getEnabled");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/TrafficIPGroups/", "getEnabled"));

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
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.ObjectDoesNotExist) {
              throw (com.zeus.soap.zxtm._1_0.ObjectDoesNotExist) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }


    /**
     * Get the IP addresses that are managed by each of the named
     * traffic IP groups.
     */
    public java.lang.String[][] getIPAddresses(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[9]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/TrafficIPGroups/getIPAddresses");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/TrafficIPGroups/", "getIPAddresses"));

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
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.ObjectDoesNotExist) {
              throw (com.zeus.soap.zxtm._1_0.ObjectDoesNotExist) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }


    /**
     * Get how traffic IPs will be distributed across the machines
     * in the cluster. If "multihosted" mode is used, the multicast IP must
     * be set first.
     */
    public com.zeus.soap.zxtm._1_0.TrafficIPGroupsIPDistributionMode[] getIPDistributionMode(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[10]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/TrafficIPGroups/getIPDistributionMode");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/TrafficIPGroups/", "getIPDistributionMode"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {names});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.zeus.soap.zxtm._1_0.TrafficIPGroupsIPDistributionMode[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.zeus.soap.zxtm._1_0.TrafficIPGroupsIPDistributionMode[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.zeus.soap.zxtm._1_0.TrafficIPGroupsIPDistributionMode[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.ObjectDoesNotExist) {
              throw (com.zeus.soap.zxtm._1_0.ObjectDoesNotExist) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }


    /**
     * Get the KeepTogether attribute for each of the named traffic
     * IP groups.
     */
    public boolean[] getKeepTogether(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[11]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/TrafficIPGroups/getKeepTogether");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/TrafficIPGroups/", "getKeepTogether"));

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
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.ObjectDoesNotExist) {
              throw (com.zeus.soap.zxtm._1_0.ObjectDoesNotExist) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }


    /**
     * Get the multicast IP group that is used to share data across
     * machines in the cluster. This setting is only used if the traffic
     * IP is using 'multihosted' distribution mode.
     */
    public java.lang.String[] getMulticastIP(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[12]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/TrafficIPGroups/getMulticastIP");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/TrafficIPGroups/", "getMulticastIP"));

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
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.ObjectDoesNotExist) {
              throw (com.zeus.soap.zxtm._1_0.ObjectDoesNotExist) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }


    /**
     * Get a list of network interfaces for all machines in the cluster.
     */
    public com.zeus.soap.zxtm._1_0.TrafficIPGroupsNetworkInterface[] getNetworkInterfaces() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[13]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/TrafficIPGroups/getNetworkInterfaces");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/TrafficIPGroups/", "getNetworkInterfaces"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.zeus.soap.zxtm._1_0.TrafficIPGroupsNetworkInterface[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.zeus.soap.zxtm._1_0.TrafficIPGroupsNetworkInterface[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.zeus.soap.zxtm._1_0.TrafficIPGroupsNetworkInterface[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Get the note for each of the named traffic IP groups.
     */
    public java.lang.String[] getNote(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[14]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/TrafficIPGroups/getNote");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/TrafficIPGroups/", "getNote"));

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
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.ObjectDoesNotExist) {
              throw (com.zeus.soap.zxtm._1_0.ObjectDoesNotExist) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }


    /**
     * Get the lists of passive machines in each of the named traffic
     * IP groups.
     */
    public java.lang.String[][] getPassiveMachine(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[15]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/TrafficIPGroups/getPassiveMachine");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/TrafficIPGroups/", "getPassiveMachine"));

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
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.ObjectDoesNotExist) {
              throw (com.zeus.soap.zxtm._1_0.ObjectDoesNotExist) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }


    /**
     * Get interface to CIDR subnet mappings.
     */
    public com.zeus.soap.zxtm._1_0.TrafficIPGroupsSubnetMappingPerHost[] getSubnetMappings(java.lang.String[] hostnames) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[16]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/TrafficIPGroups/getSubnetMappings");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/TrafficIPGroups/", "getSubnetMappings"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {hostnames});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.zeus.soap.zxtm._1_0.TrafficIPGroupsSubnetMappingPerHost[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.zeus.soap.zxtm._1_0.TrafficIPGroupsSubnetMappingPerHost[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.zeus.soap.zxtm._1_0.TrafficIPGroupsSubnetMappingPerHost[].class);
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
   }
  throw axisFaultException;
}
    }


    /**
     * Get the names of all of the configured Traffic IP Groups.
     */
    public java.lang.String[] getTrafficIPGroupNames() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[17]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/TrafficIPGroups/getTrafficIPGroupNames");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/TrafficIPGroups/", "getTrafficIPGroupNames"));

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
     * Get the traffic managers that manage the IP addresses in each
     * of the named traffic IP groups.
     */
    public java.lang.String[][] getTrafficManager(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[18]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/TrafficIPGroups/getTrafficManager");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/TrafficIPGroups/", "getTrafficManager"));

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
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.ObjectDoesNotExist) {
              throw (com.zeus.soap.zxtm._1_0.ObjectDoesNotExist) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }


    /**
     * Get whether the source port is taken into account when deciding
     * which traffic manager should handle the request. This setting is only
     * used if the Traffic IP is using 'multihosted' distribution mode.
     */
    public boolean[] getUseClientSourcePort(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[19]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/TrafficIPGroups/getUseClientSourcePort");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/TrafficIPGroups/", "getUseClientSourcePort"));

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
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.ObjectDoesNotExist) {
              throw (com.zeus.soap.zxtm._1_0.ObjectDoesNotExist) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }


    /**
     * Remove the named IP addresses from each of the named traffic
     * IP groups.
     */
    public void removeIPAddresses(java.lang.String[] names, java.lang.String[][] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidOperation, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[20]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/TrafficIPGroups/removeIPAddresses");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/TrafficIPGroups/", "removeIPAddresses"));

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
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidInput) {
              throw (com.zeus.soap.zxtm._1_0.InvalidInput) axisFaultException.detail;
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
   }
  throw axisFaultException;
}
    }


    /**
     * Remove the named machines from the list of passive machines,
     * for each of the named traffic IP groups.
     */
    public void removePassiveMachine(java.lang.String[] names, java.lang.String[][] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[21]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/TrafficIPGroups/removePassiveMachine");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/TrafficIPGroups/", "removePassiveMachine"));

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
     * Remove the named traffic managers from each named traffic IP
     * group.
     */
    public void removeTrafficManager(java.lang.String[] names, java.lang.String[][] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidOperation, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[22]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/TrafficIPGroups/removeTrafficManager");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/TrafficIPGroups/", "removeTrafficManager"));

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
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidOperation) {
              throw (com.zeus.soap.zxtm._1_0.InvalidOperation) axisFaultException.detail;
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
     * Rename each of the named Traffic IP Groups.
     */
    public void renameTrafficIPGroup(java.lang.String[] names, java.lang.String[] new_names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidOperation, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[23]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/TrafficIPGroups/renameTrafficIPGroup");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/TrafficIPGroups/", "renameTrafficIPGroup"));

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
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidInput) {
              throw (com.zeus.soap.zxtm._1_0.InvalidInput) axisFaultException.detail;
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
   }
  throw axisFaultException;
}
    }


    /**
     * Set whether this traffic IP group is enabled or not.
     */
    public void setEnabled(java.lang.String[] names, boolean[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[24]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/TrafficIPGroups/setEnabled");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/TrafficIPGroups/", "setEnabled"));

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
     * Set the IP addresses that are managed by each of the named
     * traffic IP groups.
     */
    public void setIPAddresses(java.lang.String[] names, java.lang.String[][] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidOperation, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[25]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/TrafficIPGroups/setIPAddresses");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/TrafficIPGroups/", "setIPAddresses"));

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
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidInput) {
              throw (com.zeus.soap.zxtm._1_0.InvalidInput) axisFaultException.detail;
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
   }
  throw axisFaultException;
}
    }


    /**
     * Set how traffic IPs will be distributed across the machines
     * in the cluster. If "multihosted" mode is used, the multicast IP must
     * be set first.
     */
    public void setIPDistributionMode(java.lang.String[] names, com.zeus.soap.zxtm._1_0.TrafficIPGroupsIPDistributionMode[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[26]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/TrafficIPGroups/setIPDistributionMode");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/TrafficIPGroups/", "setIPDistributionMode"));

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
     * Set the KeepTogether attribute for each of the named traffic
     * IP groups.
     */
    public void setKeepTogether(java.lang.String[] names, boolean[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[27]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/TrafficIPGroups/setKeepTogether");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/TrafficIPGroups/", "setKeepTogether"));

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
     * Set the multicast IP group that is used to share data across
     * machines in the cluster. This setting is only used if the traffic
     * IP is using 'multihosted' distribution mode.
     */
    public void setMulticastIP(java.lang.String[] names, java.lang.String[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[28]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/TrafficIPGroups/setMulticastIP");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/TrafficIPGroups/", "setMulticastIP"));

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
     * Set the note for each of the named traffic IP groups.
     */
    public void setNote(java.lang.String[] names, java.lang.String[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidOperation, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[29]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/TrafficIPGroups/setNote");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/TrafficIPGroups/", "setNote"));

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
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidInput) {
              throw (com.zeus.soap.zxtm._1_0.InvalidInput) axisFaultException.detail;
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
   }
  throw axisFaultException;
}
    }


    /**
     * Set the lists of passive machines in each of the named traffic
     * IP groups.
     */
    public void setPassiveMachine(java.lang.String[] names, java.lang.String[][] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidOperation, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[30]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/TrafficIPGroups/setPassiveMachine");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/TrafficIPGroups/", "setPassiveMachine"));

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
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidInput) {
              throw (com.zeus.soap.zxtm._1_0.InvalidInput) axisFaultException.detail;
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
   }
  throw axisFaultException;
}
    }


    /**
     * Update interface to CIDR subnet mappings.
     */
    public void setSubnetMappings(com.zeus.soap.zxtm._1_0.TrafficIPGroupsSubnetMappingPerHost[] mappings) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[31]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/TrafficIPGroups/setSubnetMappings");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/TrafficIPGroups/", "setSubnetMappings"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {mappings});

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
     * Set the traffic managers that manage the IP addresses in each
     * of the named traffic IP groups.
     */
    public void setTrafficManager(java.lang.String[] names, java.lang.String[][] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidOperation, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[32]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/TrafficIPGroups/setTrafficManager");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/TrafficIPGroups/", "setTrafficManager"));

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
        if (axisFaultException.detail instanceof com.zeus.soap.zxtm._1_0.InvalidInput) {
              throw (com.zeus.soap.zxtm._1_0.InvalidInput) axisFaultException.detail;
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
   }
  throw axisFaultException;
}
    }


    /**
     * Set whether the source port is taken into account when deciding
     * which traffic manager should handle the request. This setting is only
     * used if the Traffic IP is using 'multihosted' distribution mode.
     */
    public void setUseClientSourcePort(java.lang.String[] names, boolean[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[33]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.zeus.com/zxtm/1.0/TrafficIPGroups/setUseClientSourcePort");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/TrafficIPGroups/", "setUseClientSourcePort"));

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

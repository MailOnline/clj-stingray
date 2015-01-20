/**
 * AlertCallbackObjectType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.zeus.soap.zxtm._1_0;

public class AlertCallbackObjectType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected AlertCallbackObjectType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _value1 = "Unknown";
    public static final java.lang.String _value2 = "actions";
    public static final java.lang.String _value3 = "aptimizer/profiles";
    public static final java.lang.String _value4 = "aptimizer/scopes";
    public static final java.lang.String _value5 = "auth";
    public static final java.lang.String _value6 = "bandwidth";
    public static final java.lang.String _value7 = "cloudcredentials";
    public static final java.lang.String _value8 = "config";
    public static final java.lang.String _value9 = "dns";
    public static final java.lang.String _value10 = "events";
    public static final java.lang.String _value11 = "extra";
    public static final java.lang.String _value12 = "faulttolerance";
    public static final java.lang.String _value13 = "flipper";
    public static final java.lang.String _value14 = "general";
    public static final java.lang.String _value15 = "http";
    public static final java.lang.String _value16 = "jars";
    public static final java.lang.String _value17 = "java";
    public static final java.lang.String _value18 = "licensekeys";
    public static final java.lang.String _value19 = "locations";
    public static final java.lang.String _value20 = "monitors";
    public static final java.lang.String _value21 = "nodes";
    public static final java.lang.String _value22 = "persistence";
    public static final java.lang.String _value23 = "pids";
    public static final java.lang.String _value24 = "pools";
    public static final java.lang.String _value25 = "protection";
    public static final java.lang.String _value26 = "rate";
    public static final java.lang.String _value27 = "rtsp";
    public static final java.lang.String _value28 = "rules";
    public static final java.lang.String _value29 = "services";
    public static final java.lang.String _value30 = "servlet";
    public static final java.lang.String _value31 = "servlets";
    public static final java.lang.String _value32 = "sip";
    public static final java.lang.String _value33 = "slm";
    public static final java.lang.String _value34 = "smtp";
    public static final java.lang.String _value35 = "sslhw";
    public static final java.lang.String _value36 = "streaming";
    public static final java.lang.String _value37 = "tips";
    public static final java.lang.String _value38 = "trafficscript";
    public static final java.lang.String _value39 = "vservers";
    public static final java.lang.String _value40 = "zxtms";
    public static final AlertCallbackObjectType value1 = new AlertCallbackObjectType(_value1);
    public static final AlertCallbackObjectType value2 = new AlertCallbackObjectType(_value2);
    public static final AlertCallbackObjectType value3 = new AlertCallbackObjectType(_value3);
    public static final AlertCallbackObjectType value4 = new AlertCallbackObjectType(_value4);
    public static final AlertCallbackObjectType value5 = new AlertCallbackObjectType(_value5);
    public static final AlertCallbackObjectType value6 = new AlertCallbackObjectType(_value6);
    public static final AlertCallbackObjectType value7 = new AlertCallbackObjectType(_value7);
    public static final AlertCallbackObjectType value8 = new AlertCallbackObjectType(_value8);
    public static final AlertCallbackObjectType value9 = new AlertCallbackObjectType(_value9);
    public static final AlertCallbackObjectType value10 = new AlertCallbackObjectType(_value10);
    public static final AlertCallbackObjectType value11 = new AlertCallbackObjectType(_value11);
    public static final AlertCallbackObjectType value12 = new AlertCallbackObjectType(_value12);
    public static final AlertCallbackObjectType value13 = new AlertCallbackObjectType(_value13);
    public static final AlertCallbackObjectType value14 = new AlertCallbackObjectType(_value14);
    public static final AlertCallbackObjectType value15 = new AlertCallbackObjectType(_value15);
    public static final AlertCallbackObjectType value16 = new AlertCallbackObjectType(_value16);
    public static final AlertCallbackObjectType value17 = new AlertCallbackObjectType(_value17);
    public static final AlertCallbackObjectType value18 = new AlertCallbackObjectType(_value18);
    public static final AlertCallbackObjectType value19 = new AlertCallbackObjectType(_value19);
    public static final AlertCallbackObjectType value20 = new AlertCallbackObjectType(_value20);
    public static final AlertCallbackObjectType value21 = new AlertCallbackObjectType(_value21);
    public static final AlertCallbackObjectType value22 = new AlertCallbackObjectType(_value22);
    public static final AlertCallbackObjectType value23 = new AlertCallbackObjectType(_value23);
    public static final AlertCallbackObjectType value24 = new AlertCallbackObjectType(_value24);
    public static final AlertCallbackObjectType value25 = new AlertCallbackObjectType(_value25);
    public static final AlertCallbackObjectType value26 = new AlertCallbackObjectType(_value26);
    public static final AlertCallbackObjectType value27 = new AlertCallbackObjectType(_value27);
    public static final AlertCallbackObjectType value28 = new AlertCallbackObjectType(_value28);
    public static final AlertCallbackObjectType value29 = new AlertCallbackObjectType(_value29);
    public static final AlertCallbackObjectType value30 = new AlertCallbackObjectType(_value30);
    public static final AlertCallbackObjectType value31 = new AlertCallbackObjectType(_value31);
    public static final AlertCallbackObjectType value32 = new AlertCallbackObjectType(_value32);
    public static final AlertCallbackObjectType value33 = new AlertCallbackObjectType(_value33);
    public static final AlertCallbackObjectType value34 = new AlertCallbackObjectType(_value34);
    public static final AlertCallbackObjectType value35 = new AlertCallbackObjectType(_value35);
    public static final AlertCallbackObjectType value36 = new AlertCallbackObjectType(_value36);
    public static final AlertCallbackObjectType value37 = new AlertCallbackObjectType(_value37);
    public static final AlertCallbackObjectType value38 = new AlertCallbackObjectType(_value38);
    public static final AlertCallbackObjectType value39 = new AlertCallbackObjectType(_value39);
    public static final AlertCallbackObjectType value40 = new AlertCallbackObjectType(_value40);
    public java.lang.String getValue() { return _value_;}
    public static AlertCallbackObjectType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        AlertCallbackObjectType enumeration = (AlertCallbackObjectType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static AlertCallbackObjectType fromString(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        return fromValue(value);
    }
    public boolean equals(java.lang.Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public java.lang.String toString() { return _value_;}
    public java.lang.Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumSerializer(
            _javaType, _xmlType);
    }
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumDeserializer(
            _javaType, _xmlType);
    }
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AlertCallbackObjectType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "AlertCallback.ObjectType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}

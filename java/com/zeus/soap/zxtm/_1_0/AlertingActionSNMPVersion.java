/**
 * AlertingActionSNMPVersion.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.zeus.soap.zxtm._1_0;

public class AlertingActionSNMPVersion implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected AlertingActionSNMPVersion(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _snmpv1 = "snmpv1";
    public static final java.lang.String _snmpv2c = "snmpv2c";
    public static final java.lang.String _snmpv3 = "snmpv3";
    public static final AlertingActionSNMPVersion snmpv1 = new AlertingActionSNMPVersion(_snmpv1);
    public static final AlertingActionSNMPVersion snmpv2c = new AlertingActionSNMPVersion(_snmpv2c);
    public static final AlertingActionSNMPVersion snmpv3 = new AlertingActionSNMPVersion(_snmpv3);
    public java.lang.String getValue() { return _value_;}
    public static AlertingActionSNMPVersion fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        AlertingActionSNMPVersion enumeration = (AlertingActionSNMPVersion)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static AlertingActionSNMPVersion fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(AlertingActionSNMPVersion.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "Alerting.Action.SNMPVersion"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}

/**
 * SystemConnectionsConnectionState.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.zeus.soap.zxtm._1_0;

public class SystemConnectionsConnectionState implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected SystemConnectionsConnectionState(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _reading_from_client = "reading_from_client";
    public static final java.lang.String _writing_to_client = "writing_to_client";
    public static final java.lang.String _executing_rule = "executing_rule";
    public static final java.lang.String _connecting_to_node = "connecting_to_node";
    public static final java.lang.String _writing_to_node = "writing_to_node";
    public static final java.lang.String _reading_from_node = "reading_from_node";
    public static final java.lang.String _closing_client_connection = "closing_client_connection";
    public static final java.lang.String _holding_client_connection = "holding_client_connection";
    public static final java.lang.String _recent_connection = "recent_connection";
    public static final SystemConnectionsConnectionState reading_from_client = new SystemConnectionsConnectionState(_reading_from_client);
    public static final SystemConnectionsConnectionState writing_to_client = new SystemConnectionsConnectionState(_writing_to_client);
    public static final SystemConnectionsConnectionState executing_rule = new SystemConnectionsConnectionState(_executing_rule);
    public static final SystemConnectionsConnectionState connecting_to_node = new SystemConnectionsConnectionState(_connecting_to_node);
    public static final SystemConnectionsConnectionState writing_to_node = new SystemConnectionsConnectionState(_writing_to_node);
    public static final SystemConnectionsConnectionState reading_from_node = new SystemConnectionsConnectionState(_reading_from_node);
    public static final SystemConnectionsConnectionState closing_client_connection = new SystemConnectionsConnectionState(_closing_client_connection);
    public static final SystemConnectionsConnectionState holding_client_connection = new SystemConnectionsConnectionState(_holding_client_connection);
    public static final SystemConnectionsConnectionState recent_connection = new SystemConnectionsConnectionState(_recent_connection);
    public java.lang.String getValue() { return _value_;}
    public static SystemConnectionsConnectionState fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        SystemConnectionsConnectionState enumeration = (SystemConnectionsConnectionState)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static SystemConnectionsConnectionState fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(SystemConnectionsConnectionState.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "System.Connections.ConnectionState"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}

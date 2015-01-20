/**
 * VirtualServerBasicInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.zeus.soap.zxtm._1_0;


/**
 * This structure contains the basic information for a virtual server.
 * 
 *             It is used when creating a server, or modifying the port,
 * protocol or default pool of a server.
 */
public class VirtualServerBasicInfo  implements java.io.Serializable {
    /* The port to listen for incoming connections on. */
    private int port;

    /* The protocol that this virtual server handles. */
    private com.zeus.soap.zxtm._1_0.VirtualServerProtocol protocol;

    /* The default pool that traffic to this virtual server will go
     * to. */
    private java.lang.String default_pool;

    public VirtualServerBasicInfo() {
    }

    public VirtualServerBasicInfo(
           int port,
           com.zeus.soap.zxtm._1_0.VirtualServerProtocol protocol,
           java.lang.String default_pool) {
           this.port = port;
           this.protocol = protocol;
           this.default_pool = default_pool;
    }


    /**
     * Gets the port value for this VirtualServerBasicInfo.
     * 
     * @return port   * The port to listen for incoming connections on.
     */
    public int getPort() {
        return port;
    }


    /**
     * Sets the port value for this VirtualServerBasicInfo.
     * 
     * @param port   * The port to listen for incoming connections on.
     */
    public void setPort(int port) {
        this.port = port;
    }


    /**
     * Gets the protocol value for this VirtualServerBasicInfo.
     * 
     * @return protocol   * The protocol that this virtual server handles.
     */
    public com.zeus.soap.zxtm._1_0.VirtualServerProtocol getProtocol() {
        return protocol;
    }


    /**
     * Sets the protocol value for this VirtualServerBasicInfo.
     * 
     * @param protocol   * The protocol that this virtual server handles.
     */
    public void setProtocol(com.zeus.soap.zxtm._1_0.VirtualServerProtocol protocol) {
        this.protocol = protocol;
    }


    /**
     * Gets the default_pool value for this VirtualServerBasicInfo.
     * 
     * @return default_pool   * The default pool that traffic to this virtual server will go
     * to.
     */
    public java.lang.String getDefault_pool() {
        return default_pool;
    }


    /**
     * Sets the default_pool value for this VirtualServerBasicInfo.
     * 
     * @param default_pool   * The default pool that traffic to this virtual server will go
     * to.
     */
    public void setDefault_pool(java.lang.String default_pool) {
        this.default_pool = default_pool;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VirtualServerBasicInfo)) return false;
        VirtualServerBasicInfo other = (VirtualServerBasicInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.port == other.getPort() &&
            ((this.protocol==null && other.getProtocol()==null) || 
             (this.protocol!=null &&
              this.protocol.equals(other.getProtocol()))) &&
            ((this.default_pool==null && other.getDefault_pool()==null) || 
             (this.default_pool!=null &&
              this.default_pool.equals(other.getDefault_pool())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        _hashCode += getPort();
        if (getProtocol() != null) {
            _hashCode += getProtocol().hashCode();
        }
        if (getDefault_pool() != null) {
            _hashCode += getDefault_pool().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VirtualServerBasicInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "VirtualServer.BasicInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("port");
        elemField.setXmlName(new javax.xml.namespace.QName("", "port"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("protocol");
        elemField.setXmlName(new javax.xml.namespace.QName("", "protocol"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "VirtualServer.Protocol"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("default_pool");
        elemField.setXmlName(new javax.xml.namespace.QName("", "default_pool"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}

/**
 * SystemStatsPerNodeServiceLevel.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.zeus.soap.zxtm._1_0;


/**
 * Represents a PerNodeServiceLevel object.
 */
public class SystemStatsPerNodeServiceLevel  implements java.io.Serializable {
    /* The name of the SLM class. */
    private java.lang.String SLMName;

    /* The IP address of this node. */
    private java.lang.String nodeAddress;

    /* The port number of this node. */
    private int nodePort;

    public SystemStatsPerNodeServiceLevel() {
    }

    public SystemStatsPerNodeServiceLevel(
           java.lang.String SLMName,
           java.lang.String nodeAddress,
           int nodePort) {
           this.SLMName = SLMName;
           this.nodeAddress = nodeAddress;
           this.nodePort = nodePort;
    }


    /**
     * Gets the SLMName value for this SystemStatsPerNodeServiceLevel.
     * 
     * @return SLMName   * The name of the SLM class.
     */
    public java.lang.String getSLMName() {
        return SLMName;
    }


    /**
     * Sets the SLMName value for this SystemStatsPerNodeServiceLevel.
     * 
     * @param SLMName   * The name of the SLM class.
     */
    public void setSLMName(java.lang.String SLMName) {
        this.SLMName = SLMName;
    }


    /**
     * Gets the nodeAddress value for this SystemStatsPerNodeServiceLevel.
     * 
     * @return nodeAddress   * The IP address of this node.
     */
    public java.lang.String getNodeAddress() {
        return nodeAddress;
    }


    /**
     * Sets the nodeAddress value for this SystemStatsPerNodeServiceLevel.
     * 
     * @param nodeAddress   * The IP address of this node.
     */
    public void setNodeAddress(java.lang.String nodeAddress) {
        this.nodeAddress = nodeAddress;
    }


    /**
     * Gets the nodePort value for this SystemStatsPerNodeServiceLevel.
     * 
     * @return nodePort   * The port number of this node.
     */
    public int getNodePort() {
        return nodePort;
    }


    /**
     * Sets the nodePort value for this SystemStatsPerNodeServiceLevel.
     * 
     * @param nodePort   * The port number of this node.
     */
    public void setNodePort(int nodePort) {
        this.nodePort = nodePort;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SystemStatsPerNodeServiceLevel)) return false;
        SystemStatsPerNodeServiceLevel other = (SystemStatsPerNodeServiceLevel) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.SLMName==null && other.getSLMName()==null) || 
             (this.SLMName!=null &&
              this.SLMName.equals(other.getSLMName()))) &&
            ((this.nodeAddress==null && other.getNodeAddress()==null) || 
             (this.nodeAddress!=null &&
              this.nodeAddress.equals(other.getNodeAddress()))) &&
            this.nodePort == other.getNodePort();
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
        if (getSLMName() != null) {
            _hashCode += getSLMName().hashCode();
        }
        if (getNodeAddress() != null) {
            _hashCode += getNodeAddress().hashCode();
        }
        _hashCode += getNodePort();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SystemStatsPerNodeServiceLevel.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "System.Stats.PerNodeServiceLevel"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SLMName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SLMName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nodeAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("", "NodeAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nodePort");
        elemField.setXmlName(new javax.xml.namespace.QName("", "NodePort"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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

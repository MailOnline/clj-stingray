/**
 * SystemStatsPerPoolNode.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.zeus.soap.zxtm._1_0;


/**
 * Represents a PerPoolNode object.
 */
public class SystemStatsPerPoolNode  implements java.io.Serializable {
    /* The name of the pool that this node belongs to. */
    private java.lang.String poolName;

    /* The IPv4 or IPv6 address of this node. */
    private java.lang.String nodeAddress;

    /* The port that this node listens on. */
    private int nodePort;

    public SystemStatsPerPoolNode() {
    }

    public SystemStatsPerPoolNode(
           java.lang.String poolName,
           java.lang.String nodeAddress,
           int nodePort) {
           this.poolName = poolName;
           this.nodeAddress = nodeAddress;
           this.nodePort = nodePort;
    }


    /**
     * Gets the poolName value for this SystemStatsPerPoolNode.
     * 
     * @return poolName   * The name of the pool that this node belongs to.
     */
    public java.lang.String getPoolName() {
        return poolName;
    }


    /**
     * Sets the poolName value for this SystemStatsPerPoolNode.
     * 
     * @param poolName   * The name of the pool that this node belongs to.
     */
    public void setPoolName(java.lang.String poolName) {
        this.poolName = poolName;
    }


    /**
     * Gets the nodeAddress value for this SystemStatsPerPoolNode.
     * 
     * @return nodeAddress   * The IPv4 or IPv6 address of this node.
     */
    public java.lang.String getNodeAddress() {
        return nodeAddress;
    }


    /**
     * Sets the nodeAddress value for this SystemStatsPerPoolNode.
     * 
     * @param nodeAddress   * The IPv4 or IPv6 address of this node.
     */
    public void setNodeAddress(java.lang.String nodeAddress) {
        this.nodeAddress = nodeAddress;
    }


    /**
     * Gets the nodePort value for this SystemStatsPerPoolNode.
     * 
     * @return nodePort   * The port that this node listens on.
     */
    public int getNodePort() {
        return nodePort;
    }


    /**
     * Sets the nodePort value for this SystemStatsPerPoolNode.
     * 
     * @param nodePort   * The port that this node listens on.
     */
    public void setNodePort(int nodePort) {
        this.nodePort = nodePort;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SystemStatsPerPoolNode)) return false;
        SystemStatsPerPoolNode other = (SystemStatsPerPoolNode) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.poolName==null && other.getPoolName()==null) || 
             (this.poolName!=null &&
              this.poolName.equals(other.getPoolName()))) &&
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
        if (getPoolName() != null) {
            _hashCode += getPoolName().hashCode();
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
        new org.apache.axis.description.TypeDesc(SystemStatsPerPoolNode.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "System.Stats.PerPoolNode"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("poolName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PoolName"));
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

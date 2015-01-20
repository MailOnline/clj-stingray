/**
 * TrafficIPGroupsNetworkInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.zeus.soap.zxtm._1_0;


/**
 * This structure displays the network interfaces of all machines
 * in the cluster.
 */
public class TrafficIPGroupsNetworkInterface  implements java.io.Serializable {
    /* The traffic manager in the cluster. */
    private java.lang.String hostname;

    /* The network interfaces configured in this traffic manager. */
    private java.lang.String[] interfaces;

    public TrafficIPGroupsNetworkInterface() {
    }

    public TrafficIPGroupsNetworkInterface(
           java.lang.String hostname,
           java.lang.String[] interfaces) {
           this.hostname = hostname;
           this.interfaces = interfaces;
    }


    /**
     * Gets the hostname value for this TrafficIPGroupsNetworkInterface.
     * 
     * @return hostname   * The traffic manager in the cluster.
     */
    public java.lang.String getHostname() {
        return hostname;
    }


    /**
     * Sets the hostname value for this TrafficIPGroupsNetworkInterface.
     * 
     * @param hostname   * The traffic manager in the cluster.
     */
    public void setHostname(java.lang.String hostname) {
        this.hostname = hostname;
    }


    /**
     * Gets the interfaces value for this TrafficIPGroupsNetworkInterface.
     * 
     * @return interfaces   * The network interfaces configured in this traffic manager.
     */
    public java.lang.String[] getInterfaces() {
        return interfaces;
    }


    /**
     * Sets the interfaces value for this TrafficIPGroupsNetworkInterface.
     * 
     * @param interfaces   * The network interfaces configured in this traffic manager.
     */
    public void setInterfaces(java.lang.String[] interfaces) {
        this.interfaces = interfaces;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TrafficIPGroupsNetworkInterface)) return false;
        TrafficIPGroupsNetworkInterface other = (TrafficIPGroupsNetworkInterface) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.hostname==null && other.getHostname()==null) || 
             (this.hostname!=null &&
              this.hostname.equals(other.getHostname()))) &&
            ((this.interfaces==null && other.getInterfaces()==null) || 
             (this.interfaces!=null &&
              java.util.Arrays.equals(this.interfaces, other.getInterfaces())));
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
        if (getHostname() != null) {
            _hashCode += getHostname().hashCode();
        }
        if (getInterfaces() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getInterfaces());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getInterfaces(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TrafficIPGroupsNetworkInterface.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "TrafficIPGroups.NetworkInterface"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hostname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "hostname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("interfaces");
        elemField.setXmlName(new javax.xml.namespace.QName("", "interfaces"));
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

/**
 * TrafficIPGroupsSubnetMappingPerHost.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.zeus.soap.zxtm._1_0;


/**
 * This structure shows the traffic IP subnet mapping per host machine
 * in the cluster.
 */
public class TrafficIPGroupsSubnetMappingPerHost  implements java.io.Serializable {
    /* The traffic manager in the cluster. */
    private java.lang.String hostname;

    /* The subnets mappings for this traffic manager. */
    private com.zeus.soap.zxtm._1_0.TrafficIPGroupsSubnetMapping[] subnetmappings;

    public TrafficIPGroupsSubnetMappingPerHost() {
    }

    public TrafficIPGroupsSubnetMappingPerHost(
           java.lang.String hostname,
           com.zeus.soap.zxtm._1_0.TrafficIPGroupsSubnetMapping[] subnetmappings) {
           this.hostname = hostname;
           this.subnetmappings = subnetmappings;
    }


    /**
     * Gets the hostname value for this TrafficIPGroupsSubnetMappingPerHost.
     * 
     * @return hostname   * The traffic manager in the cluster.
     */
    public java.lang.String getHostname() {
        return hostname;
    }


    /**
     * Sets the hostname value for this TrafficIPGroupsSubnetMappingPerHost.
     * 
     * @param hostname   * The traffic manager in the cluster.
     */
    public void setHostname(java.lang.String hostname) {
        this.hostname = hostname;
    }


    /**
     * Gets the subnetmappings value for this TrafficIPGroupsSubnetMappingPerHost.
     * 
     * @return subnetmappings   * The subnets mappings for this traffic manager.
     */
    public com.zeus.soap.zxtm._1_0.TrafficIPGroupsSubnetMapping[] getSubnetmappings() {
        return subnetmappings;
    }


    /**
     * Sets the subnetmappings value for this TrafficIPGroupsSubnetMappingPerHost.
     * 
     * @param subnetmappings   * The subnets mappings for this traffic manager.
     */
    public void setSubnetmappings(com.zeus.soap.zxtm._1_0.TrafficIPGroupsSubnetMapping[] subnetmappings) {
        this.subnetmappings = subnetmappings;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TrafficIPGroupsSubnetMappingPerHost)) return false;
        TrafficIPGroupsSubnetMappingPerHost other = (TrafficIPGroupsSubnetMappingPerHost) obj;
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
            ((this.subnetmappings==null && other.getSubnetmappings()==null) || 
             (this.subnetmappings!=null &&
              java.util.Arrays.equals(this.subnetmappings, other.getSubnetmappings())));
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
        if (getSubnetmappings() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSubnetmappings());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSubnetmappings(), i);
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
        new org.apache.axis.description.TypeDesc(TrafficIPGroupsSubnetMappingPerHost.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "TrafficIPGroups.SubnetMappingPerHost"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hostname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "hostname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subnetmappings");
        elemField.setXmlName(new javax.xml.namespace.QName("", "subnetmappings"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "TrafficIPGroups.SubnetMapping"));
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

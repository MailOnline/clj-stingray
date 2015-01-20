/**
 * TrafficIPGroupsDetails.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.zeus.soap.zxtm._1_0;


/**
 * This structure contains the basic details of a Traffic IP Group:
 * the nodes, and the traffic managers that the Traffic IP group spans.
 * It is used when creating a new Traffic IP Group.
 */
public class TrafficIPGroupsDetails  implements java.io.Serializable {
    /* The IP addresses in the Traffic IP Group. */
    private java.lang.String[] ipaddresses;

    /* The names of the traffic managers that will manage the IP Addresses. */
    private java.lang.String[] machines;

    public TrafficIPGroupsDetails() {
    }

    public TrafficIPGroupsDetails(
           java.lang.String[] ipaddresses,
           java.lang.String[] machines) {
           this.ipaddresses = ipaddresses;
           this.machines = machines;
    }


    /**
     * Gets the ipaddresses value for this TrafficIPGroupsDetails.
     * 
     * @return ipaddresses   * The IP addresses in the Traffic IP Group.
     */
    public java.lang.String[] getIpaddresses() {
        return ipaddresses;
    }


    /**
     * Sets the ipaddresses value for this TrafficIPGroupsDetails.
     * 
     * @param ipaddresses   * The IP addresses in the Traffic IP Group.
     */
    public void setIpaddresses(java.lang.String[] ipaddresses) {
        this.ipaddresses = ipaddresses;
    }


    /**
     * Gets the machines value for this TrafficIPGroupsDetails.
     * 
     * @return machines   * The names of the traffic managers that will manage the IP Addresses.
     */
    public java.lang.String[] getMachines() {
        return machines;
    }


    /**
     * Sets the machines value for this TrafficIPGroupsDetails.
     * 
     * @param machines   * The names of the traffic managers that will manage the IP Addresses.
     */
    public void setMachines(java.lang.String[] machines) {
        this.machines = machines;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TrafficIPGroupsDetails)) return false;
        TrafficIPGroupsDetails other = (TrafficIPGroupsDetails) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ipaddresses==null && other.getIpaddresses()==null) || 
             (this.ipaddresses!=null &&
              java.util.Arrays.equals(this.ipaddresses, other.getIpaddresses()))) &&
            ((this.machines==null && other.getMachines()==null) || 
             (this.machines!=null &&
              java.util.Arrays.equals(this.machines, other.getMachines())));
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
        if (getIpaddresses() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIpaddresses());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIpaddresses(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMachines() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMachines());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMachines(), i);
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
        new org.apache.axis.description.TypeDesc(TrafficIPGroupsDetails.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "TrafficIPGroups.Details"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ipaddresses");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ipaddresses"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("machines");
        elemField.setXmlName(new javax.xml.namespace.QName("", "machines"));
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

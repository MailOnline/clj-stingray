/**
 * AFMState.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.zeus.soap.zxtm._1_0;


/**
 * Contains status information about a Stingray Application Firewall
 * installation.
 */
public class AFMState  implements java.io.Serializable {
    /* Name of the machine this information is from. */
    private java.lang.String machine;

    /* Describes the basic runtime status of Stingray Application
     * Firewall on a machine. */
    private com.zeus.soap.zxtm._1_0.AFMBasicStatus basicstatus;

    /* State messages from the Stingray Application Firewall on the
     * machine. */
    private com.zeus.soap.zxtm._1_0.AFMStateMessage[] messages;

    /* Statuses for all Stingray Application Firewall instances in
     * the cluster. */
    private com.zeus.soap.zxtm._1_0.AFMClusterStatus[] cluster;

    /* Strings describing any general errors relating to Stingray
     * Application Firewall. */
    private java.lang.String[] errors;

    public AFMState() {
    }

    public AFMState(
           java.lang.String machine,
           com.zeus.soap.zxtm._1_0.AFMBasicStatus basicstatus,
           com.zeus.soap.zxtm._1_0.AFMStateMessage[] messages,
           com.zeus.soap.zxtm._1_0.AFMClusterStatus[] cluster,
           java.lang.String[] errors) {
           this.machine = machine;
           this.basicstatus = basicstatus;
           this.messages = messages;
           this.cluster = cluster;
           this.errors = errors;
    }


    /**
     * Gets the machine value for this AFMState.
     * 
     * @return machine   * Name of the machine this information is from.
     */
    public java.lang.String getMachine() {
        return machine;
    }


    /**
     * Sets the machine value for this AFMState.
     * 
     * @param machine   * Name of the machine this information is from.
     */
    public void setMachine(java.lang.String machine) {
        this.machine = machine;
    }


    /**
     * Gets the basicstatus value for this AFMState.
     * 
     * @return basicstatus   * Describes the basic runtime status of Stingray Application
     * Firewall on a machine.
     */
    public com.zeus.soap.zxtm._1_0.AFMBasicStatus getBasicstatus() {
        return basicstatus;
    }


    /**
     * Sets the basicstatus value for this AFMState.
     * 
     * @param basicstatus   * Describes the basic runtime status of Stingray Application
     * Firewall on a machine.
     */
    public void setBasicstatus(com.zeus.soap.zxtm._1_0.AFMBasicStatus basicstatus) {
        this.basicstatus = basicstatus;
    }


    /**
     * Gets the messages value for this AFMState.
     * 
     * @return messages   * State messages from the Stingray Application Firewall on the
     * machine.
     */
    public com.zeus.soap.zxtm._1_0.AFMStateMessage[] getMessages() {
        return messages;
    }


    /**
     * Sets the messages value for this AFMState.
     * 
     * @param messages   * State messages from the Stingray Application Firewall on the
     * machine.
     */
    public void setMessages(com.zeus.soap.zxtm._1_0.AFMStateMessage[] messages) {
        this.messages = messages;
    }


    /**
     * Gets the cluster value for this AFMState.
     * 
     * @return cluster   * Statuses for all Stingray Application Firewall instances in
     * the cluster.
     */
    public com.zeus.soap.zxtm._1_0.AFMClusterStatus[] getCluster() {
        return cluster;
    }


    /**
     * Sets the cluster value for this AFMState.
     * 
     * @param cluster   * Statuses for all Stingray Application Firewall instances in
     * the cluster.
     */
    public void setCluster(com.zeus.soap.zxtm._1_0.AFMClusterStatus[] cluster) {
        this.cluster = cluster;
    }


    /**
     * Gets the errors value for this AFMState.
     * 
     * @return errors   * Strings describing any general errors relating to Stingray
     * Application Firewall.
     */
    public java.lang.String[] getErrors() {
        return errors;
    }


    /**
     * Sets the errors value for this AFMState.
     * 
     * @param errors   * Strings describing any general errors relating to Stingray
     * Application Firewall.
     */
    public void setErrors(java.lang.String[] errors) {
        this.errors = errors;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AFMState)) return false;
        AFMState other = (AFMState) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.machine==null && other.getMachine()==null) || 
             (this.machine!=null &&
              this.machine.equals(other.getMachine()))) &&
            ((this.basicstatus==null && other.getBasicstatus()==null) || 
             (this.basicstatus!=null &&
              this.basicstatus.equals(other.getBasicstatus()))) &&
            ((this.messages==null && other.getMessages()==null) || 
             (this.messages!=null &&
              java.util.Arrays.equals(this.messages, other.getMessages()))) &&
            ((this.cluster==null && other.getCluster()==null) || 
             (this.cluster!=null &&
              java.util.Arrays.equals(this.cluster, other.getCluster()))) &&
            ((this.errors==null && other.getErrors()==null) || 
             (this.errors!=null &&
              java.util.Arrays.equals(this.errors, other.getErrors())));
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
        if (getMachine() != null) {
            _hashCode += getMachine().hashCode();
        }
        if (getBasicstatus() != null) {
            _hashCode += getBasicstatus().hashCode();
        }
        if (getMessages() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMessages());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMessages(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCluster() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCluster());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCluster(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getErrors() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getErrors());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getErrors(), i);
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
        new org.apache.axis.description.TypeDesc(AFMState.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "AFM.State"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("machine");
        elemField.setXmlName(new javax.xml.namespace.QName("", "machine"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("basicstatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "basicstatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "AFM.BasicStatus"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("messages");
        elemField.setXmlName(new javax.xml.namespace.QName("", "messages"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "AFM.StateMessage"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cluster");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cluster"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "AFM.ClusterStatus"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errors");
        elemField.setXmlName(new javax.xml.namespace.QName("", "errors"));
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

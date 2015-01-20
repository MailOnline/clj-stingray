/**
 * VirtualServerRule.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.zeus.soap.zxtm._1_0;


/**
 * This structure contains the information on how a rule is assigned
 * to a virtual server.
 */
public class VirtualServerRule  implements java.io.Serializable {
    /* The name of the rule. */
    private java.lang.String name;

    /* Whether the rule is enabled or not. */
    private boolean enabled;

    /* Whether the rule runs on every request/response, or just the
     * first */
    private com.zeus.soap.zxtm._1_0.VirtualServerRuleRunFlag run_frequency;

    public VirtualServerRule() {
    }

    public VirtualServerRule(
           java.lang.String name,
           boolean enabled,
           com.zeus.soap.zxtm._1_0.VirtualServerRuleRunFlag run_frequency) {
           this.name = name;
           this.enabled = enabled;
           this.run_frequency = run_frequency;
    }


    /**
     * Gets the name value for this VirtualServerRule.
     * 
     * @return name   * The name of the rule.
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this VirtualServerRule.
     * 
     * @param name   * The name of the rule.
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the enabled value for this VirtualServerRule.
     * 
     * @return enabled   * Whether the rule is enabled or not.
     */
    public boolean isEnabled() {
        return enabled;
    }


    /**
     * Sets the enabled value for this VirtualServerRule.
     * 
     * @param enabled   * Whether the rule is enabled or not.
     */
    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }


    /**
     * Gets the run_frequency value for this VirtualServerRule.
     * 
     * @return run_frequency   * Whether the rule runs on every request/response, or just the
     * first
     */
    public com.zeus.soap.zxtm._1_0.VirtualServerRuleRunFlag getRun_frequency() {
        return run_frequency;
    }


    /**
     * Sets the run_frequency value for this VirtualServerRule.
     * 
     * @param run_frequency   * Whether the rule runs on every request/response, or just the
     * first
     */
    public void setRun_frequency(com.zeus.soap.zxtm._1_0.VirtualServerRuleRunFlag run_frequency) {
        this.run_frequency = run_frequency;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VirtualServerRule)) return false;
        VirtualServerRule other = (VirtualServerRule) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            this.enabled == other.isEnabled() &&
            ((this.run_frequency==null && other.getRun_frequency()==null) || 
             (this.run_frequency!=null &&
              this.run_frequency.equals(other.getRun_frequency())));
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
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        _hashCode += (isEnabled() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getRun_frequency() != null) {
            _hashCode += getRun_frequency().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VirtualServerRule.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "VirtualServer.Rule"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enabled");
        elemField.setXmlName(new javax.xml.namespace.QName("", "enabled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("run_frequency");
        elemField.setXmlName(new javax.xml.namespace.QName("", "run_frequency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "VirtualServer.RuleRunFlag"));
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

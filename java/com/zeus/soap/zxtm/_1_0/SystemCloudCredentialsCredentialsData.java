/**
 * SystemCloudCredentialsCredentialsData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.zeus.soap.zxtm._1_0;


/**
 * This structure contains the information needed to create CloudCredentials
 */
public class SystemCloudCredentialsCredentialsData  implements java.io.Serializable {
    /* The user name (mandatory) */
    private java.lang.String cred1;

    /* The password (mandatory) */
    private java.lang.String cred2;

    /* The authorization token (can be empty) */
    private java.lang.String cred3;

    /* The script to use for API calls (mandatory) */
    private java.lang.String script;

    /* Time period to wait between status API calls in seconds */
    private int update_interval;

    public SystemCloudCredentialsCredentialsData() {
    }

    public SystemCloudCredentialsCredentialsData(
           java.lang.String cred1,
           java.lang.String cred2,
           java.lang.String cred3,
           java.lang.String script,
           int update_interval) {
           this.cred1 = cred1;
           this.cred2 = cred2;
           this.cred3 = cred3;
           this.script = script;
           this.update_interval = update_interval;
    }


    /**
     * Gets the cred1 value for this SystemCloudCredentialsCredentialsData.
     * 
     * @return cred1   * The user name (mandatory)
     */
    public java.lang.String getCred1() {
        return cred1;
    }


    /**
     * Sets the cred1 value for this SystemCloudCredentialsCredentialsData.
     * 
     * @param cred1   * The user name (mandatory)
     */
    public void setCred1(java.lang.String cred1) {
        this.cred1 = cred1;
    }


    /**
     * Gets the cred2 value for this SystemCloudCredentialsCredentialsData.
     * 
     * @return cred2   * The password (mandatory)
     */
    public java.lang.String getCred2() {
        return cred2;
    }


    /**
     * Sets the cred2 value for this SystemCloudCredentialsCredentialsData.
     * 
     * @param cred2   * The password (mandatory)
     */
    public void setCred2(java.lang.String cred2) {
        this.cred2 = cred2;
    }


    /**
     * Gets the cred3 value for this SystemCloudCredentialsCredentialsData.
     * 
     * @return cred3   * The authorization token (can be empty)
     */
    public java.lang.String getCred3() {
        return cred3;
    }


    /**
     * Sets the cred3 value for this SystemCloudCredentialsCredentialsData.
     * 
     * @param cred3   * The authorization token (can be empty)
     */
    public void setCred3(java.lang.String cred3) {
        this.cred3 = cred3;
    }


    /**
     * Gets the script value for this SystemCloudCredentialsCredentialsData.
     * 
     * @return script   * The script to use for API calls (mandatory)
     */
    public java.lang.String getScript() {
        return script;
    }


    /**
     * Sets the script value for this SystemCloudCredentialsCredentialsData.
     * 
     * @param script   * The script to use for API calls (mandatory)
     */
    public void setScript(java.lang.String script) {
        this.script = script;
    }


    /**
     * Gets the update_interval value for this SystemCloudCredentialsCredentialsData.
     * 
     * @return update_interval   * Time period to wait between status API calls in seconds
     */
    public int getUpdate_interval() {
        return update_interval;
    }


    /**
     * Sets the update_interval value for this SystemCloudCredentialsCredentialsData.
     * 
     * @param update_interval   * Time period to wait between status API calls in seconds
     */
    public void setUpdate_interval(int update_interval) {
        this.update_interval = update_interval;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SystemCloudCredentialsCredentialsData)) return false;
        SystemCloudCredentialsCredentialsData other = (SystemCloudCredentialsCredentialsData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.cred1==null && other.getCred1()==null) || 
             (this.cred1!=null &&
              this.cred1.equals(other.getCred1()))) &&
            ((this.cred2==null && other.getCred2()==null) || 
             (this.cred2!=null &&
              this.cred2.equals(other.getCred2()))) &&
            ((this.cred3==null && other.getCred3()==null) || 
             (this.cred3!=null &&
              this.cred3.equals(other.getCred3()))) &&
            ((this.script==null && other.getScript()==null) || 
             (this.script!=null &&
              this.script.equals(other.getScript()))) &&
            this.update_interval == other.getUpdate_interval();
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
        if (getCred1() != null) {
            _hashCode += getCred1().hashCode();
        }
        if (getCred2() != null) {
            _hashCode += getCred2().hashCode();
        }
        if (getCred3() != null) {
            _hashCode += getCred3().hashCode();
        }
        if (getScript() != null) {
            _hashCode += getScript().hashCode();
        }
        _hashCode += getUpdate_interval();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SystemCloudCredentialsCredentialsData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "System.CloudCredentials.CredentialsData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cred1");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cred1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cred2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cred2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cred3");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cred3"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("script");
        elemField.setXmlName(new javax.xml.namespace.QName("", "script"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("update_interval");
        elemField.setXmlName(new javax.xml.namespace.QName("", "update_interval"));
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

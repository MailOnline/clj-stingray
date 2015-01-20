/**
 * SystemLogAuditItem.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.zeus.soap.zxtm._1_0;


/**
 * This structure contains the information about an event in the Audit
 * Log file. It is used when getting Audit Log information.
 */
public class SystemLogAuditItem  implements java.io.Serializable {
    /* The date and time at which the event occurred. */
    private java.util.Calendar date;

    /* The name of the user who caused the event. */
    private java.lang.String user;

    /* The group of the user who caused the event. */
    private java.lang.String group;

    /* The authenticator that authorised the user who caused the event. */
    private java.lang.String auth;

    /* The IP address of the user. */
    private java.lang.String ip;

    /* The type of operation that occurred. */
    private com.zeus.soap.zxtm._1_0.SystemLogOperationType op_type;

    /* The list of parameters used in the operation. This list is
     * required for all operations with the exception of operations for which
     * there are no additional parameters. */
    private com.zeus.soap.zxtm._1_0.SystemLogOpParam op_params;

    public SystemLogAuditItem() {
    }

    public SystemLogAuditItem(
           java.util.Calendar date,
           java.lang.String user,
           java.lang.String group,
           java.lang.String auth,
           java.lang.String ip,
           com.zeus.soap.zxtm._1_0.SystemLogOperationType op_type,
           com.zeus.soap.zxtm._1_0.SystemLogOpParam op_params) {
           this.date = date;
           this.user = user;
           this.group = group;
           this.auth = auth;
           this.ip = ip;
           this.op_type = op_type;
           this.op_params = op_params;
    }


    /**
     * Gets the date value for this SystemLogAuditItem.
     * 
     * @return date   * The date and time at which the event occurred.
     */
    public java.util.Calendar getDate() {
        return date;
    }


    /**
     * Sets the date value for this SystemLogAuditItem.
     * 
     * @param date   * The date and time at which the event occurred.
     */
    public void setDate(java.util.Calendar date) {
        this.date = date;
    }


    /**
     * Gets the user value for this SystemLogAuditItem.
     * 
     * @return user   * The name of the user who caused the event.
     */
    public java.lang.String getUser() {
        return user;
    }


    /**
     * Sets the user value for this SystemLogAuditItem.
     * 
     * @param user   * The name of the user who caused the event.
     */
    public void setUser(java.lang.String user) {
        this.user = user;
    }


    /**
     * Gets the group value for this SystemLogAuditItem.
     * 
     * @return group   * The group of the user who caused the event.
     */
    public java.lang.String getGroup() {
        return group;
    }


    /**
     * Sets the group value for this SystemLogAuditItem.
     * 
     * @param group   * The group of the user who caused the event.
     */
    public void setGroup(java.lang.String group) {
        this.group = group;
    }


    /**
     * Gets the auth value for this SystemLogAuditItem.
     * 
     * @return auth   * The authenticator that authorised the user who caused the event.
     */
    public java.lang.String getAuth() {
        return auth;
    }


    /**
     * Sets the auth value for this SystemLogAuditItem.
     * 
     * @param auth   * The authenticator that authorised the user who caused the event.
     */
    public void setAuth(java.lang.String auth) {
        this.auth = auth;
    }


    /**
     * Gets the ip value for this SystemLogAuditItem.
     * 
     * @return ip   * The IP address of the user.
     */
    public java.lang.String getIp() {
        return ip;
    }


    /**
     * Sets the ip value for this SystemLogAuditItem.
     * 
     * @param ip   * The IP address of the user.
     */
    public void setIp(java.lang.String ip) {
        this.ip = ip;
    }


    /**
     * Gets the op_type value for this SystemLogAuditItem.
     * 
     * @return op_type   * The type of operation that occurred.
     */
    public com.zeus.soap.zxtm._1_0.SystemLogOperationType getOp_type() {
        return op_type;
    }


    /**
     * Sets the op_type value for this SystemLogAuditItem.
     * 
     * @param op_type   * The type of operation that occurred.
     */
    public void setOp_type(com.zeus.soap.zxtm._1_0.SystemLogOperationType op_type) {
        this.op_type = op_type;
    }


    /**
     * Gets the op_params value for this SystemLogAuditItem.
     * 
     * @return op_params   * The list of parameters used in the operation. This list is
     * required for all operations with the exception of operations for which
     * there are no additional parameters.
     */
    public com.zeus.soap.zxtm._1_0.SystemLogOpParam getOp_params() {
        return op_params;
    }


    /**
     * Sets the op_params value for this SystemLogAuditItem.
     * 
     * @param op_params   * The list of parameters used in the operation. This list is
     * required for all operations with the exception of operations for which
     * there are no additional parameters.
     */
    public void setOp_params(com.zeus.soap.zxtm._1_0.SystemLogOpParam op_params) {
        this.op_params = op_params;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SystemLogAuditItem)) return false;
        SystemLogAuditItem other = (SystemLogAuditItem) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.date==null && other.getDate()==null) || 
             (this.date!=null &&
              this.date.equals(other.getDate()))) &&
            ((this.user==null && other.getUser()==null) || 
             (this.user!=null &&
              this.user.equals(other.getUser()))) &&
            ((this.group==null && other.getGroup()==null) || 
             (this.group!=null &&
              this.group.equals(other.getGroup()))) &&
            ((this.auth==null && other.getAuth()==null) || 
             (this.auth!=null &&
              this.auth.equals(other.getAuth()))) &&
            ((this.ip==null && other.getIp()==null) || 
             (this.ip!=null &&
              this.ip.equals(other.getIp()))) &&
            ((this.op_type==null && other.getOp_type()==null) || 
             (this.op_type!=null &&
              this.op_type.equals(other.getOp_type()))) &&
            ((this.op_params==null && other.getOp_params()==null) || 
             (this.op_params!=null &&
              this.op_params.equals(other.getOp_params())));
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
        if (getDate() != null) {
            _hashCode += getDate().hashCode();
        }
        if (getUser() != null) {
            _hashCode += getUser().hashCode();
        }
        if (getGroup() != null) {
            _hashCode += getGroup().hashCode();
        }
        if (getAuth() != null) {
            _hashCode += getAuth().hashCode();
        }
        if (getIp() != null) {
            _hashCode += getIp().hashCode();
        }
        if (getOp_type() != null) {
            _hashCode += getOp_type().hashCode();
        }
        if (getOp_params() != null) {
            _hashCode += getOp_params().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SystemLogAuditItem.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "System.Log.AuditItem"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("date");
        elemField.setXmlName(new javax.xml.namespace.QName("", "date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("user");
        elemField.setXmlName(new javax.xml.namespace.QName("", "user"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("group");
        elemField.setXmlName(new javax.xml.namespace.QName("", "group"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("auth");
        elemField.setXmlName(new javax.xml.namespace.QName("", "auth"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ip");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ip"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("op_type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "op_type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "System.Log.OperationType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("op_params");
        elemField.setXmlName(new javax.xml.namespace.QName("", "op_params"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "System.Log.OpParam"));
        elemField.setMinOccurs(0);
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

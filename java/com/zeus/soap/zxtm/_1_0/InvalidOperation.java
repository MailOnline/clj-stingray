/**
 * InvalidOperation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.zeus.soap.zxtm._1_0;


/**
 * The InvalidOperation fault is emitted when attempting an operation
 * that doesn't make sense or is prohibited, for example deleting
 *               a built-in monitor, or attempting to rename an object
 * twice in
 *               the same call.
 */
public class InvalidOperation  extends org.apache.axis.AxisFault  implements java.io.Serializable {
    /* A human readable string describing the error */
    private java.lang.String errmsg;

    /* The name of the object that caused the fault (if appropriate) */
    private java.lang.String object;

    /* The configuration key that caused the fault (if appropriate) */
    private java.lang.String key;

    /* The value that caused the fault (if appropriate) */
    private java.lang.String value;

    public InvalidOperation() {
    }

    public InvalidOperation(
           java.lang.String errmsg,
           java.lang.String object,
           java.lang.String key,
           java.lang.String value) {
        this.errmsg = errmsg;
        this.object = object;
        this.key = key;
        this.value = value;
    }


    /**
     * Gets the errmsg value for this InvalidOperation.
     * 
     * @return errmsg   * A human readable string describing the error
     */
    public java.lang.String getErrmsg() {
        return errmsg;
    }


    /**
     * Sets the errmsg value for this InvalidOperation.
     * 
     * @param errmsg   * A human readable string describing the error
     */
    public void setErrmsg(java.lang.String errmsg) {
        this.errmsg = errmsg;
    }


    /**
     * Gets the object value for this InvalidOperation.
     * 
     * @return object   * The name of the object that caused the fault (if appropriate)
     */
    public java.lang.String getObject() {
        return object;
    }


    /**
     * Sets the object value for this InvalidOperation.
     * 
     * @param object   * The name of the object that caused the fault (if appropriate)
     */
    public void setObject(java.lang.String object) {
        this.object = object;
    }


    /**
     * Gets the key value for this InvalidOperation.
     * 
     * @return key   * The configuration key that caused the fault (if appropriate)
     */
    public java.lang.String getKey() {
        return key;
    }


    /**
     * Sets the key value for this InvalidOperation.
     * 
     * @param key   * The configuration key that caused the fault (if appropriate)
     */
    public void setKey(java.lang.String key) {
        this.key = key;
    }


    /**
     * Gets the value value for this InvalidOperation.
     * 
     * @return value   * The value that caused the fault (if appropriate)
     */
    public java.lang.String getValue() {
        return value;
    }


    /**
     * Sets the value value for this InvalidOperation.
     * 
     * @param value   * The value that caused the fault (if appropriate)
     */
    public void setValue(java.lang.String value) {
        this.value = value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InvalidOperation)) return false;
        InvalidOperation other = (InvalidOperation) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.errmsg==null && other.getErrmsg()==null) || 
             (this.errmsg!=null &&
              this.errmsg.equals(other.getErrmsg()))) &&
            ((this.object==null && other.getObject()==null) || 
             (this.object!=null &&
              this.object.equals(other.getObject()))) &&
            ((this.key==null && other.getKey()==null) || 
             (this.key!=null &&
              this.key.equals(other.getKey()))) &&
            ((this.value==null && other.getValue()==null) || 
             (this.value!=null &&
              this.value.equals(other.getValue())));
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
        if (getErrmsg() != null) {
            _hashCode += getErrmsg().hashCode();
        }
        if (getObject() != null) {
            _hashCode += getObject().hashCode();
        }
        if (getKey() != null) {
            _hashCode += getKey().hashCode();
        }
        if (getValue() != null) {
            _hashCode += getValue().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InvalidOperation.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidOperation"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errmsg");
        elemField.setXmlName(new javax.xml.namespace.QName("", "errmsg"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("object");
        elemField.setXmlName(new javax.xml.namespace.QName("", "object"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("key");
        elemField.setXmlName(new javax.xml.namespace.QName("", "key"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("value");
        elemField.setXmlName(new javax.xml.namespace.QName("", "value"));
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


    /**
     * Writes the exception data to the faultDetails
     */
    public void writeDetails(javax.xml.namespace.QName qname, org.apache.axis.encoding.SerializationContext context) throws java.io.IOException {
        context.serialize(qname, null, this);
    }
}

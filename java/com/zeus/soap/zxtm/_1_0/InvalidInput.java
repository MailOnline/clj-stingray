/**
 * InvalidInput.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.zeus.soap.zxtm._1_0;


/**
 * The InvalidInput fault is raised when the input to a function is
 * invalid, for example a number was out of range. This fault is also
 * raised in cases such as VirtualServer.setPool() where the Pool
 *               doesn't exist
 *          
 *               The details in the fault contain the object, key and
 * value
 *               that caused the fault. These might be blank if they
 * are not relevant
 *               to the fault.
 */
public class InvalidInput  extends org.apache.axis.AxisFault  implements java.io.Serializable {
    /* A human readable string describing the error */
    private java.lang.String errmsg;

    /* The name of the object that caused the fault (if appropriate) */
    private java.lang.String object;

    /* The configuration key that caused the fault (if appropriate) */
    private java.lang.String key;

    /* The value that caused the fault (if appropriate) */
    private java.lang.String value;

    public InvalidInput() {
    }

    public InvalidInput(
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
     * Gets the errmsg value for this InvalidInput.
     * 
     * @return errmsg   * A human readable string describing the error
     */
    public java.lang.String getErrmsg() {
        return errmsg;
    }


    /**
     * Sets the errmsg value for this InvalidInput.
     * 
     * @param errmsg   * A human readable string describing the error
     */
    public void setErrmsg(java.lang.String errmsg) {
        this.errmsg = errmsg;
    }


    /**
     * Gets the object value for this InvalidInput.
     * 
     * @return object   * The name of the object that caused the fault (if appropriate)
     */
    public java.lang.String getObject() {
        return object;
    }


    /**
     * Sets the object value for this InvalidInput.
     * 
     * @param object   * The name of the object that caused the fault (if appropriate)
     */
    public void setObject(java.lang.String object) {
        this.object = object;
    }


    /**
     * Gets the key value for this InvalidInput.
     * 
     * @return key   * The configuration key that caused the fault (if appropriate)
     */
    public java.lang.String getKey() {
        return key;
    }


    /**
     * Sets the key value for this InvalidInput.
     * 
     * @param key   * The configuration key that caused the fault (if appropriate)
     */
    public void setKey(java.lang.String key) {
        this.key = key;
    }


    /**
     * Gets the value value for this InvalidInput.
     * 
     * @return value   * The value that caused the fault (if appropriate)
     */
    public java.lang.String getValue() {
        return value;
    }


    /**
     * Sets the value value for this InvalidInput.
     * 
     * @param value   * The value that caused the fault (if appropriate)
     */
    public void setValue(java.lang.String value) {
        this.value = value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InvalidInput)) return false;
        InvalidInput other = (InvalidInput) obj;
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
        new org.apache.axis.description.TypeDesc(InvalidInput.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "InvalidInput"));
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

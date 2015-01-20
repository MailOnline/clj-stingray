/**
 * VirtualServerRegexReplacement.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.zeus.soap.zxtm._1_0;


/**
 * This structure contains a regex and a replacement string.
 */
public class VirtualServerRegexReplacement  implements java.io.Serializable {
    /* The regular expression used to match against. */
    private java.lang.String regex;

    /* The replacement string if the regular expression matches. Parameters
     * $1-$9 can be used to represent bracketed parts of the regular expression. */
    private java.lang.String replacement;

    public VirtualServerRegexReplacement() {
    }

    public VirtualServerRegexReplacement(
           java.lang.String regex,
           java.lang.String replacement) {
           this.regex = regex;
           this.replacement = replacement;
    }


    /**
     * Gets the regex value for this VirtualServerRegexReplacement.
     * 
     * @return regex   * The regular expression used to match against.
     */
    public java.lang.String getRegex() {
        return regex;
    }


    /**
     * Sets the regex value for this VirtualServerRegexReplacement.
     * 
     * @param regex   * The regular expression used to match against.
     */
    public void setRegex(java.lang.String regex) {
        this.regex = regex;
    }


    /**
     * Gets the replacement value for this VirtualServerRegexReplacement.
     * 
     * @return replacement   * The replacement string if the regular expression matches. Parameters
     * $1-$9 can be used to represent bracketed parts of the regular expression.
     */
    public java.lang.String getReplacement() {
        return replacement;
    }


    /**
     * Sets the replacement value for this VirtualServerRegexReplacement.
     * 
     * @param replacement   * The replacement string if the regular expression matches. Parameters
     * $1-$9 can be used to represent bracketed parts of the regular expression.
     */
    public void setReplacement(java.lang.String replacement) {
        this.replacement = replacement;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VirtualServerRegexReplacement)) return false;
        VirtualServerRegexReplacement other = (VirtualServerRegexReplacement) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.regex==null && other.getRegex()==null) || 
             (this.regex!=null &&
              this.regex.equals(other.getRegex()))) &&
            ((this.replacement==null && other.getReplacement()==null) || 
             (this.replacement!=null &&
              this.replacement.equals(other.getReplacement())));
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
        if (getRegex() != null) {
            _hashCode += getRegex().hashCode();
        }
        if (getReplacement() != null) {
            _hashCode += getReplacement().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VirtualServerRegexReplacement.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "VirtualServer.RegexReplacement"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("regex");
        elemField.setXmlName(new javax.xml.namespace.QName("", "regex"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("replacement");
        elemField.setXmlName(new javax.xml.namespace.QName("", "replacement"));
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

/**
 * VirtualServerSSLSite.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.zeus.soap.zxtm._1_0;


/**
 * This object represents a mapping between a destination address
 * and an SSL certificate (this is the name of an item in the SSL Certificates
 * Catalog). Clients connecting to the SSL Site's address will be sent
 * the associated certificate.
 */
public class VirtualServerSSLSite  implements java.io.Serializable {
    /* The destination address that this site handles. */
    private java.lang.String dest_address;

    /* The certificate that will be sent when clients connect to the
     * destination address. This is a certificate name from the SSL Certificates
     * Catalog. */
    private java.lang.String certificate;

    public VirtualServerSSLSite() {
    }

    public VirtualServerSSLSite(
           java.lang.String dest_address,
           java.lang.String certificate) {
           this.dest_address = dest_address;
           this.certificate = certificate;
    }


    /**
     * Gets the dest_address value for this VirtualServerSSLSite.
     * 
     * @return dest_address   * The destination address that this site handles.
     */
    public java.lang.String getDest_address() {
        return dest_address;
    }


    /**
     * Sets the dest_address value for this VirtualServerSSLSite.
     * 
     * @param dest_address   * The destination address that this site handles.
     */
    public void setDest_address(java.lang.String dest_address) {
        this.dest_address = dest_address;
    }


    /**
     * Gets the certificate value for this VirtualServerSSLSite.
     * 
     * @return certificate   * The certificate that will be sent when clients connect to the
     * destination address. This is a certificate name from the SSL Certificates
     * Catalog.
     */
    public java.lang.String getCertificate() {
        return certificate;
    }


    /**
     * Sets the certificate value for this VirtualServerSSLSite.
     * 
     * @param certificate   * The certificate that will be sent when clients connect to the
     * destination address. This is a certificate name from the SSL Certificates
     * Catalog.
     */
    public void setCertificate(java.lang.String certificate) {
        this.certificate = certificate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VirtualServerSSLSite)) return false;
        VirtualServerSSLSite other = (VirtualServerSSLSite) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.dest_address==null && other.getDest_address()==null) || 
             (this.dest_address!=null &&
              this.dest_address.equals(other.getDest_address()))) &&
            ((this.certificate==null && other.getCertificate()==null) || 
             (this.certificate!=null &&
              this.certificate.equals(other.getCertificate())));
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
        if (getDest_address() != null) {
            _hashCode += getDest_address().hashCode();
        }
        if (getCertificate() != null) {
            _hashCode += getCertificate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VirtualServerSSLSite.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "VirtualServer.SSLSite"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dest_address");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dest_address"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("certificate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "certificate"));
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

/**
 * CatalogSSLCertificateAuthoritiesRevokedCert.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.zeus.soap.zxtm._1_0;


/**
 * This structure contains the information about a revoked Certificate.
 */
public class CatalogSSLCertificateAuthoritiesRevokedCert  implements java.io.Serializable {
    /* The serial number of the revoked certificate */
    private java.lang.String serial;

    /* The time that the certificate was revoked */
    private java.util.Calendar revocation_date;

    public CatalogSSLCertificateAuthoritiesRevokedCert() {
    }

    public CatalogSSLCertificateAuthoritiesRevokedCert(
           java.lang.String serial,
           java.util.Calendar revocation_date) {
           this.serial = serial;
           this.revocation_date = revocation_date;
    }


    /**
     * Gets the serial value for this CatalogSSLCertificateAuthoritiesRevokedCert.
     * 
     * @return serial   * The serial number of the revoked certificate
     */
    public java.lang.String getSerial() {
        return serial;
    }


    /**
     * Sets the serial value for this CatalogSSLCertificateAuthoritiesRevokedCert.
     * 
     * @param serial   * The serial number of the revoked certificate
     */
    public void setSerial(java.lang.String serial) {
        this.serial = serial;
    }


    /**
     * Gets the revocation_date value for this CatalogSSLCertificateAuthoritiesRevokedCert.
     * 
     * @return revocation_date   * The time that the certificate was revoked
     */
    public java.util.Calendar getRevocation_date() {
        return revocation_date;
    }


    /**
     * Sets the revocation_date value for this CatalogSSLCertificateAuthoritiesRevokedCert.
     * 
     * @param revocation_date   * The time that the certificate was revoked
     */
    public void setRevocation_date(java.util.Calendar revocation_date) {
        this.revocation_date = revocation_date;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CatalogSSLCertificateAuthoritiesRevokedCert)) return false;
        CatalogSSLCertificateAuthoritiesRevokedCert other = (CatalogSSLCertificateAuthoritiesRevokedCert) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.serial==null && other.getSerial()==null) || 
             (this.serial!=null &&
              this.serial.equals(other.getSerial()))) &&
            ((this.revocation_date==null && other.getRevocation_date()==null) || 
             (this.revocation_date!=null &&
              this.revocation_date.equals(other.getRevocation_date())));
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
        if (getSerial() != null) {
            _hashCode += getSerial().hashCode();
        }
        if (getRevocation_date() != null) {
            _hashCode += getRevocation_date().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CatalogSSLCertificateAuthoritiesRevokedCert.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "Catalog.SSL.CertificateAuthorities.RevokedCert"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serial");
        elemField.setXmlName(new javax.xml.namespace.QName("", "serial"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("revocation_date");
        elemField.setXmlName(new javax.xml.namespace.QName("", "revocation_date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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

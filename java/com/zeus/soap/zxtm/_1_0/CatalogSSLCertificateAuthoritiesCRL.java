/**
 * CatalogSSLCertificateAuthoritiesCRL.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.zeus.soap.zxtm._1_0;


/**
 * This structure contains the information about a Certificate Revocation
 * list.
 */
public class CatalogSSLCertificateAuthoritiesCRL  implements java.io.Serializable {
    /* The time when the CRL was updated */
    private java.util.Calendar update;

    /* The time that the CRL will next be updated. */
    private java.util.Calendar next_update;

    /* The list of revoked certificates */
    private com.zeus.soap.zxtm._1_0.CatalogSSLCertificateAuthoritiesRevokedCert[] revoked_certs;

    public CatalogSSLCertificateAuthoritiesCRL() {
    }

    public CatalogSSLCertificateAuthoritiesCRL(
           java.util.Calendar update,
           java.util.Calendar next_update,
           com.zeus.soap.zxtm._1_0.CatalogSSLCertificateAuthoritiesRevokedCert[] revoked_certs) {
           this.update = update;
           this.next_update = next_update;
           this.revoked_certs = revoked_certs;
    }


    /**
     * Gets the update value for this CatalogSSLCertificateAuthoritiesCRL.
     * 
     * @return update   * The time when the CRL was updated
     */
    public java.util.Calendar getUpdate() {
        return update;
    }


    /**
     * Sets the update value for this CatalogSSLCertificateAuthoritiesCRL.
     * 
     * @param update   * The time when the CRL was updated
     */
    public void setUpdate(java.util.Calendar update) {
        this.update = update;
    }


    /**
     * Gets the next_update value for this CatalogSSLCertificateAuthoritiesCRL.
     * 
     * @return next_update   * The time that the CRL will next be updated.
     */
    public java.util.Calendar getNext_update() {
        return next_update;
    }


    /**
     * Sets the next_update value for this CatalogSSLCertificateAuthoritiesCRL.
     * 
     * @param next_update   * The time that the CRL will next be updated.
     */
    public void setNext_update(java.util.Calendar next_update) {
        this.next_update = next_update;
    }


    /**
     * Gets the revoked_certs value for this CatalogSSLCertificateAuthoritiesCRL.
     * 
     * @return revoked_certs   * The list of revoked certificates
     */
    public com.zeus.soap.zxtm._1_0.CatalogSSLCertificateAuthoritiesRevokedCert[] getRevoked_certs() {
        return revoked_certs;
    }


    /**
     * Sets the revoked_certs value for this CatalogSSLCertificateAuthoritiesCRL.
     * 
     * @param revoked_certs   * The list of revoked certificates
     */
    public void setRevoked_certs(com.zeus.soap.zxtm._1_0.CatalogSSLCertificateAuthoritiesRevokedCert[] revoked_certs) {
        this.revoked_certs = revoked_certs;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CatalogSSLCertificateAuthoritiesCRL)) return false;
        CatalogSSLCertificateAuthoritiesCRL other = (CatalogSSLCertificateAuthoritiesCRL) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.update==null && other.getUpdate()==null) || 
             (this.update!=null &&
              this.update.equals(other.getUpdate()))) &&
            ((this.next_update==null && other.getNext_update()==null) || 
             (this.next_update!=null &&
              this.next_update.equals(other.getNext_update()))) &&
            ((this.revoked_certs==null && other.getRevoked_certs()==null) || 
             (this.revoked_certs!=null &&
              java.util.Arrays.equals(this.revoked_certs, other.getRevoked_certs())));
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
        if (getUpdate() != null) {
            _hashCode += getUpdate().hashCode();
        }
        if (getNext_update() != null) {
            _hashCode += getNext_update().hashCode();
        }
        if (getRevoked_certs() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRevoked_certs());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRevoked_certs(), i);
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
        new org.apache.axis.description.TypeDesc(CatalogSSLCertificateAuthoritiesCRL.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "Catalog.SSL.CertificateAuthorities.CRL"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("update");
        elemField.setXmlName(new javax.xml.namespace.QName("", "update"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("next_update");
        elemField.setXmlName(new javax.xml.namespace.QName("", "next_update"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("revoked_certs");
        elemField.setXmlName(new javax.xml.namespace.QName("", "revoked_certs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "Catalog.SSL.CertificateAuthorities.RevokedCert"));
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

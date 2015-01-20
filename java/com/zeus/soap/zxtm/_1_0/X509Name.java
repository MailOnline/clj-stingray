/**
 * X509Name.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.zeus.soap.zxtm._1_0;


/**
 * This structure contains a representation of an X509 Name object.
 * These
 *              are used inside Certificate objects to represent the
 * issuer and subject
 *              of the certificate.
 */
public class X509Name  implements java.io.Serializable {
    /* The common name (CN). This is usually the name of the site
     * the
     *                   certificate is issued to (e.g. "secure.example.com") */
    private java.lang.String common_name;

    /* The two-letter country code. */
    private java.lang.String country;

    /* The location (town or city). */
    private java.lang.String location;

    /* The state, this is only needed if the country is 'US'. */
    private java.lang.String state;

    /* The name of the organisation */
    private java.lang.String organisation;

    /* The unit inside the organisation */
    private java.lang.String unit;

    /* An email address. This is usually empty. */
    private java.lang.String email;

    public X509Name() {
    }

    public X509Name(
           java.lang.String common_name,
           java.lang.String country,
           java.lang.String location,
           java.lang.String state,
           java.lang.String organisation,
           java.lang.String unit,
           java.lang.String email) {
           this.common_name = common_name;
           this.country = country;
           this.location = location;
           this.state = state;
           this.organisation = organisation;
           this.unit = unit;
           this.email = email;
    }


    /**
     * Gets the common_name value for this X509Name.
     * 
     * @return common_name   * The common name (CN). This is usually the name of the site
     * the
     *                   certificate is issued to (e.g. "secure.example.com")
     */
    public java.lang.String getCommon_name() {
        return common_name;
    }


    /**
     * Sets the common_name value for this X509Name.
     * 
     * @param common_name   * The common name (CN). This is usually the name of the site
     * the
     *                   certificate is issued to (e.g. "secure.example.com")
     */
    public void setCommon_name(java.lang.String common_name) {
        this.common_name = common_name;
    }


    /**
     * Gets the country value for this X509Name.
     * 
     * @return country   * The two-letter country code.
     */
    public java.lang.String getCountry() {
        return country;
    }


    /**
     * Sets the country value for this X509Name.
     * 
     * @param country   * The two-letter country code.
     */
    public void setCountry(java.lang.String country) {
        this.country = country;
    }


    /**
     * Gets the location value for this X509Name.
     * 
     * @return location   * The location (town or city).
     */
    public java.lang.String getLocation() {
        return location;
    }


    /**
     * Sets the location value for this X509Name.
     * 
     * @param location   * The location (town or city).
     */
    public void setLocation(java.lang.String location) {
        this.location = location;
    }


    /**
     * Gets the state value for this X509Name.
     * 
     * @return state   * The state, this is only needed if the country is 'US'.
     */
    public java.lang.String getState() {
        return state;
    }


    /**
     * Sets the state value for this X509Name.
     * 
     * @param state   * The state, this is only needed if the country is 'US'.
     */
    public void setState(java.lang.String state) {
        this.state = state;
    }


    /**
     * Gets the organisation value for this X509Name.
     * 
     * @return organisation   * The name of the organisation
     */
    public java.lang.String getOrganisation() {
        return organisation;
    }


    /**
     * Sets the organisation value for this X509Name.
     * 
     * @param organisation   * The name of the organisation
     */
    public void setOrganisation(java.lang.String organisation) {
        this.organisation = organisation;
    }


    /**
     * Gets the unit value for this X509Name.
     * 
     * @return unit   * The unit inside the organisation
     */
    public java.lang.String getUnit() {
        return unit;
    }


    /**
     * Sets the unit value for this X509Name.
     * 
     * @param unit   * The unit inside the organisation
     */
    public void setUnit(java.lang.String unit) {
        this.unit = unit;
    }


    /**
     * Gets the email value for this X509Name.
     * 
     * @return email   * An email address. This is usually empty.
     */
    public java.lang.String getEmail() {
        return email;
    }


    /**
     * Sets the email value for this X509Name.
     * 
     * @param email   * An email address. This is usually empty.
     */
    public void setEmail(java.lang.String email) {
        this.email = email;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof X509Name)) return false;
        X509Name other = (X509Name) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.common_name==null && other.getCommon_name()==null) || 
             (this.common_name!=null &&
              this.common_name.equals(other.getCommon_name()))) &&
            ((this.country==null && other.getCountry()==null) || 
             (this.country!=null &&
              this.country.equals(other.getCountry()))) &&
            ((this.location==null && other.getLocation()==null) || 
             (this.location!=null &&
              this.location.equals(other.getLocation()))) &&
            ((this.state==null && other.getState()==null) || 
             (this.state!=null &&
              this.state.equals(other.getState()))) &&
            ((this.organisation==null && other.getOrganisation()==null) || 
             (this.organisation!=null &&
              this.organisation.equals(other.getOrganisation()))) &&
            ((this.unit==null && other.getUnit()==null) || 
             (this.unit!=null &&
              this.unit.equals(other.getUnit()))) &&
            ((this.email==null && other.getEmail()==null) || 
             (this.email!=null &&
              this.email.equals(other.getEmail())));
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
        if (getCommon_name() != null) {
            _hashCode += getCommon_name().hashCode();
        }
        if (getCountry() != null) {
            _hashCode += getCountry().hashCode();
        }
        if (getLocation() != null) {
            _hashCode += getLocation().hashCode();
        }
        if (getState() != null) {
            _hashCode += getState().hashCode();
        }
        if (getOrganisation() != null) {
            _hashCode += getOrganisation().hashCode();
        }
        if (getUnit() != null) {
            _hashCode += getUnit().hashCode();
        }
        if (getEmail() != null) {
            _hashCode += getEmail().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(X509Name.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "X509Name"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("common_name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "common_name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("country");
        elemField.setXmlName(new javax.xml.namespace.QName("", "country"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("location");
        elemField.setXmlName(new javax.xml.namespace.QName("", "location"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("state");
        elemField.setXmlName(new javax.xml.namespace.QName("", "state"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("organisation");
        elemField.setXmlName(new javax.xml.namespace.QName("", "organisation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unit");
        elemField.setXmlName(new javax.xml.namespace.QName("", "unit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("email");
        elemField.setXmlName(new javax.xml.namespace.QName("", "email"));
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

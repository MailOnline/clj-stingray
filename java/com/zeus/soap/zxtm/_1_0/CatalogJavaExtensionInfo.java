/**
 * CatalogJavaExtensionInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.zeus.soap.zxtm._1_0;


/**
 * This structure contains basic information about a Java Extension
 * in the catalog.
 */
public class CatalogJavaExtensionInfo  implements java.io.Serializable {
    /* The Java class name of the extension. */
    private java.lang.String class_name;

    /* The location of the Java extension class. */
    private java.lang.String path;

    /* The virtual servers that use this extension. */
    private java.lang.String[] virtual_servers;

    /* The rules that use this extension. */
    private java.lang.String[] rules;

    public CatalogJavaExtensionInfo() {
    }

    public CatalogJavaExtensionInfo(
           java.lang.String class_name,
           java.lang.String path,
           java.lang.String[] virtual_servers,
           java.lang.String[] rules) {
           this.class_name = class_name;
           this.path = path;
           this.virtual_servers = virtual_servers;
           this.rules = rules;
    }


    /**
     * Gets the class_name value for this CatalogJavaExtensionInfo.
     * 
     * @return class_name   * The Java class name of the extension.
     */
    public java.lang.String getClass_name() {
        return class_name;
    }


    /**
     * Sets the class_name value for this CatalogJavaExtensionInfo.
     * 
     * @param class_name   * The Java class name of the extension.
     */
    public void setClass_name(java.lang.String class_name) {
        this.class_name = class_name;
    }


    /**
     * Gets the path value for this CatalogJavaExtensionInfo.
     * 
     * @return path   * The location of the Java extension class.
     */
    public java.lang.String getPath() {
        return path;
    }


    /**
     * Sets the path value for this CatalogJavaExtensionInfo.
     * 
     * @param path   * The location of the Java extension class.
     */
    public void setPath(java.lang.String path) {
        this.path = path;
    }


    /**
     * Gets the virtual_servers value for this CatalogJavaExtensionInfo.
     * 
     * @return virtual_servers   * The virtual servers that use this extension.
     */
    public java.lang.String[] getVirtual_servers() {
        return virtual_servers;
    }


    /**
     * Sets the virtual_servers value for this CatalogJavaExtensionInfo.
     * 
     * @param virtual_servers   * The virtual servers that use this extension.
     */
    public void setVirtual_servers(java.lang.String[] virtual_servers) {
        this.virtual_servers = virtual_servers;
    }


    /**
     * Gets the rules value for this CatalogJavaExtensionInfo.
     * 
     * @return rules   * The rules that use this extension.
     */
    public java.lang.String[] getRules() {
        return rules;
    }


    /**
     * Sets the rules value for this CatalogJavaExtensionInfo.
     * 
     * @param rules   * The rules that use this extension.
     */
    public void setRules(java.lang.String[] rules) {
        this.rules = rules;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CatalogJavaExtensionInfo)) return false;
        CatalogJavaExtensionInfo other = (CatalogJavaExtensionInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.class_name==null && other.getClass_name()==null) || 
             (this.class_name!=null &&
              this.class_name.equals(other.getClass_name()))) &&
            ((this.path==null && other.getPath()==null) || 
             (this.path!=null &&
              this.path.equals(other.getPath()))) &&
            ((this.virtual_servers==null && other.getVirtual_servers()==null) || 
             (this.virtual_servers!=null &&
              java.util.Arrays.equals(this.virtual_servers, other.getVirtual_servers()))) &&
            ((this.rules==null && other.getRules()==null) || 
             (this.rules!=null &&
              java.util.Arrays.equals(this.rules, other.getRules())));
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
        if (getClass_name() != null) {
            _hashCode += getClass_name().hashCode();
        }
        if (getPath() != null) {
            _hashCode += getPath().hashCode();
        }
        if (getVirtual_servers() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVirtual_servers());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVirtual_servers(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRules() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRules());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRules(), i);
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
        new org.apache.axis.description.TypeDesc(CatalogJavaExtensionInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "Catalog.JavaExtension.Info"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("class_name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "class_name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("path");
        elemField.setXmlName(new javax.xml.namespace.QName("", "path"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("virtual_servers");
        elemField.setXmlName(new javax.xml.namespace.QName("", "virtual_servers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rules");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rules"));
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

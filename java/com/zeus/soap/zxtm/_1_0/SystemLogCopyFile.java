/**
 * SystemLogCopyFile.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.zeus.soap.zxtm._1_0;


/**
 * This is the operation parameters structure for 'copyfile' operations
 * (file copied). It is used when getting Audit Log data.
 */
public class SystemLogCopyFile  extends com.zeus.soap.zxtm._1_0.SystemLogOpParam  implements java.io.Serializable {
    /* A file that was copied or renamed. */
    private java.lang.String oldfile;

    /* A file on the filesystem being modified. */
    private java.lang.String file;

    public SystemLogCopyFile() {
    }

    public SystemLogCopyFile(
           java.lang.String oldfile,
           java.lang.String file) {
        this.oldfile = oldfile;
        this.file = file;
    }


    /**
     * Gets the oldfile value for this SystemLogCopyFile.
     * 
     * @return oldfile   * A file that was copied or renamed.
     */
    public java.lang.String getOldfile() {
        return oldfile;
    }


    /**
     * Sets the oldfile value for this SystemLogCopyFile.
     * 
     * @param oldfile   * A file that was copied or renamed.
     */
    public void setOldfile(java.lang.String oldfile) {
        this.oldfile = oldfile;
    }


    /**
     * Gets the file value for this SystemLogCopyFile.
     * 
     * @return file   * A file on the filesystem being modified.
     */
    public java.lang.String getFile() {
        return file;
    }


    /**
     * Sets the file value for this SystemLogCopyFile.
     * 
     * @param file   * A file on the filesystem being modified.
     */
    public void setFile(java.lang.String file) {
        this.file = file;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SystemLogCopyFile)) return false;
        SystemLogCopyFile other = (SystemLogCopyFile) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.oldfile==null && other.getOldfile()==null) || 
             (this.oldfile!=null &&
              this.oldfile.equals(other.getOldfile()))) &&
            ((this.file==null && other.getFile()==null) || 
             (this.file!=null &&
              this.file.equals(other.getFile())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getOldfile() != null) {
            _hashCode += getOldfile().hashCode();
        }
        if (getFile() != null) {
            _hashCode += getFile().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SystemLogCopyFile.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "System.Log.CopyFile"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oldfile");
        elemField.setXmlName(new javax.xml.namespace.QName("", "oldfile"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("file");
        elemField.setXmlName(new javax.xml.namespace.QName("", "file"));
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

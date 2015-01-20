/**
 * SystemLogMaintenanceCLICmd.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.zeus.soap.zxtm._1_0;


/**
 * This is the operation parameters structure for 'maintclicmd' operations
 * (maintenance CLI command). It is used when getting Audit Log data.
 */
public class SystemLogMaintenanceCLICmd  extends com.zeus.soap.zxtm._1_0.SystemLogOpParam  implements java.io.Serializable {
    /* The command being run. */
    private java.lang.String cmd;

    /* The arguments for the command being run. */
    private java.lang.String args;

    public SystemLogMaintenanceCLICmd() {
    }

    public SystemLogMaintenanceCLICmd(
           java.lang.String cmd,
           java.lang.String args) {
        this.cmd = cmd;
        this.args = args;
    }


    /**
     * Gets the cmd value for this SystemLogMaintenanceCLICmd.
     * 
     * @return cmd   * The command being run.
     */
    public java.lang.String getCmd() {
        return cmd;
    }


    /**
     * Sets the cmd value for this SystemLogMaintenanceCLICmd.
     * 
     * @param cmd   * The command being run.
     */
    public void setCmd(java.lang.String cmd) {
        this.cmd = cmd;
    }


    /**
     * Gets the args value for this SystemLogMaintenanceCLICmd.
     * 
     * @return args   * The arguments for the command being run.
     */
    public java.lang.String getArgs() {
        return args;
    }


    /**
     * Sets the args value for this SystemLogMaintenanceCLICmd.
     * 
     * @param args   * The arguments for the command being run.
     */
    public void setArgs(java.lang.String args) {
        this.args = args;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SystemLogMaintenanceCLICmd)) return false;
        SystemLogMaintenanceCLICmd other = (SystemLogMaintenanceCLICmd) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.cmd==null && other.getCmd()==null) || 
             (this.cmd!=null &&
              this.cmd.equals(other.getCmd()))) &&
            ((this.args==null && other.getArgs()==null) || 
             (this.args!=null &&
              this.args.equals(other.getArgs())));
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
        if (getCmd() != null) {
            _hashCode += getCmd().hashCode();
        }
        if (getArgs() != null) {
            _hashCode += getArgs().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SystemLogMaintenanceCLICmd.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "System.Log.MaintenanceCLICmd"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cmd");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cmd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("args");
        elemField.setXmlName(new javax.xml.namespace.QName("", "args"));
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

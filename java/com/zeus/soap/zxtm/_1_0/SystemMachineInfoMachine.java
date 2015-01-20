/**
 * SystemMachineInfoMachine.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.zeus.soap.zxtm._1_0;


/**
 * This structure contains information about a traffic manager in
 * the cluster.
 */
public class SystemMachineInfoMachine  implements java.io.Serializable {
    /* The hostname of this machine */
    private java.lang.String hostname;

    /* The IP address of this machine. */
    private java.lang.String ipaddress;

    /* The URL of the admin server for this traffic manager. */
    private java.lang.String admin_server;

    /* The install path of the traffic manager on this machine. */
    private java.lang.String zeushome;

    public SystemMachineInfoMachine() {
    }

    public SystemMachineInfoMachine(
           java.lang.String hostname,
           java.lang.String ipaddress,
           java.lang.String admin_server,
           java.lang.String zeushome) {
           this.hostname = hostname;
           this.ipaddress = ipaddress;
           this.admin_server = admin_server;
           this.zeushome = zeushome;
    }


    /**
     * Gets the hostname value for this SystemMachineInfoMachine.
     * 
     * @return hostname   * The hostname of this machine
     */
    public java.lang.String getHostname() {
        return hostname;
    }


    /**
     * Sets the hostname value for this SystemMachineInfoMachine.
     * 
     * @param hostname   * The hostname of this machine
     */
    public void setHostname(java.lang.String hostname) {
        this.hostname = hostname;
    }


    /**
     * Gets the ipaddress value for this SystemMachineInfoMachine.
     * 
     * @return ipaddress   * The IP address of this machine.
     */
    public java.lang.String getIpaddress() {
        return ipaddress;
    }


    /**
     * Sets the ipaddress value for this SystemMachineInfoMachine.
     * 
     * @param ipaddress   * The IP address of this machine.
     */
    public void setIpaddress(java.lang.String ipaddress) {
        this.ipaddress = ipaddress;
    }


    /**
     * Gets the admin_server value for this SystemMachineInfoMachine.
     * 
     * @return admin_server   * The URL of the admin server for this traffic manager.
     */
    public java.lang.String getAdmin_server() {
        return admin_server;
    }


    /**
     * Sets the admin_server value for this SystemMachineInfoMachine.
     * 
     * @param admin_server   * The URL of the admin server for this traffic manager.
     */
    public void setAdmin_server(java.lang.String admin_server) {
        this.admin_server = admin_server;
    }


    /**
     * Gets the zeushome value for this SystemMachineInfoMachine.
     * 
     * @return zeushome   * The install path of the traffic manager on this machine.
     */
    public java.lang.String getZeushome() {
        return zeushome;
    }


    /**
     * Sets the zeushome value for this SystemMachineInfoMachine.
     * 
     * @param zeushome   * The install path of the traffic manager on this machine.
     */
    public void setZeushome(java.lang.String zeushome) {
        this.zeushome = zeushome;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SystemMachineInfoMachine)) return false;
        SystemMachineInfoMachine other = (SystemMachineInfoMachine) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.hostname==null && other.getHostname()==null) || 
             (this.hostname!=null &&
              this.hostname.equals(other.getHostname()))) &&
            ((this.ipaddress==null && other.getIpaddress()==null) || 
             (this.ipaddress!=null &&
              this.ipaddress.equals(other.getIpaddress()))) &&
            ((this.admin_server==null && other.getAdmin_server()==null) || 
             (this.admin_server!=null &&
              this.admin_server.equals(other.getAdmin_server()))) &&
            ((this.zeushome==null && other.getZeushome()==null) || 
             (this.zeushome!=null &&
              this.zeushome.equals(other.getZeushome())));
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
        if (getHostname() != null) {
            _hashCode += getHostname().hashCode();
        }
        if (getIpaddress() != null) {
            _hashCode += getIpaddress().hashCode();
        }
        if (getAdmin_server() != null) {
            _hashCode += getAdmin_server().hashCode();
        }
        if (getZeushome() != null) {
            _hashCode += getZeushome().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SystemMachineInfoMachine.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "System.MachineInfo.Machine"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hostname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "hostname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ipaddress");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ipaddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("admin_server");
        elemField.setXmlName(new javax.xml.namespace.QName("", "admin_server"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zeushome");
        elemField.setXmlName(new javax.xml.namespace.QName("", "zeushome"));
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

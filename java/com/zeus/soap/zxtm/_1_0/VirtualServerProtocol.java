/**
 * VirtualServerProtocol.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.zeus.soap.zxtm._1_0;

public class VirtualServerProtocol implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected VirtualServerProtocol(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _http = "http";
    public static final java.lang.String _ftp = "ftp";
    public static final java.lang.String _imapv2 = "imapv2";
    public static final java.lang.String _imapv3 = "imapv3";
    public static final java.lang.String _imapv4 = "imapv4";
    public static final java.lang.String _pop3 = "pop3";
    public static final java.lang.String _smtp = "smtp";
    public static final java.lang.String _ldap = "ldap";
    public static final java.lang.String _telnet = "telnet";
    public static final java.lang.String _ssl = "ssl";
    public static final java.lang.String _https = "https";
    public static final java.lang.String _imaps = "imaps";
    public static final java.lang.String _pop3s = "pop3s";
    public static final java.lang.String _ldaps = "ldaps";
    public static final java.lang.String _udpstreaming = "udpstreaming";
    public static final java.lang.String _udp = "udp";
    public static final java.lang.String _dns = "dns";
    public static final java.lang.String _dns_tcp = "dns_tcp";
    public static final java.lang.String _sipudp = "sipudp";
    public static final java.lang.String _siptcp = "siptcp";
    public static final java.lang.String _rtsp = "rtsp";
    public static final java.lang.String _server_first = "server_first";
    public static final java.lang.String _client_first = "client_first";
    public static final java.lang.String _stream = "stream";
    public static final VirtualServerProtocol http = new VirtualServerProtocol(_http);
    public static final VirtualServerProtocol ftp = new VirtualServerProtocol(_ftp);
    public static final VirtualServerProtocol imapv2 = new VirtualServerProtocol(_imapv2);
    public static final VirtualServerProtocol imapv3 = new VirtualServerProtocol(_imapv3);
    public static final VirtualServerProtocol imapv4 = new VirtualServerProtocol(_imapv4);
    public static final VirtualServerProtocol pop3 = new VirtualServerProtocol(_pop3);
    public static final VirtualServerProtocol smtp = new VirtualServerProtocol(_smtp);
    public static final VirtualServerProtocol ldap = new VirtualServerProtocol(_ldap);
    public static final VirtualServerProtocol telnet = new VirtualServerProtocol(_telnet);
    public static final VirtualServerProtocol ssl = new VirtualServerProtocol(_ssl);
    public static final VirtualServerProtocol https = new VirtualServerProtocol(_https);
    public static final VirtualServerProtocol imaps = new VirtualServerProtocol(_imaps);
    public static final VirtualServerProtocol pop3s = new VirtualServerProtocol(_pop3s);
    public static final VirtualServerProtocol ldaps = new VirtualServerProtocol(_ldaps);
    public static final VirtualServerProtocol udpstreaming = new VirtualServerProtocol(_udpstreaming);
    public static final VirtualServerProtocol udp = new VirtualServerProtocol(_udp);
    public static final VirtualServerProtocol dns = new VirtualServerProtocol(_dns);
    public static final VirtualServerProtocol dns_tcp = new VirtualServerProtocol(_dns_tcp);
    public static final VirtualServerProtocol sipudp = new VirtualServerProtocol(_sipudp);
    public static final VirtualServerProtocol siptcp = new VirtualServerProtocol(_siptcp);
    public static final VirtualServerProtocol rtsp = new VirtualServerProtocol(_rtsp);
    public static final VirtualServerProtocol server_first = new VirtualServerProtocol(_server_first);
    public static final VirtualServerProtocol client_first = new VirtualServerProtocol(_client_first);
    public static final VirtualServerProtocol stream = new VirtualServerProtocol(_stream);
    public java.lang.String getValue() { return _value_;}
    public static VirtualServerProtocol fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        VirtualServerProtocol enumeration = (VirtualServerProtocol)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static VirtualServerProtocol fromString(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        return fromValue(value);
    }
    public boolean equals(java.lang.Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public java.lang.String toString() { return _value_;}
    public java.lang.Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumSerializer(
            _javaType, _xmlType);
    }
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumDeserializer(
            _javaType, _xmlType);
    }
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VirtualServerProtocol.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "VirtualServer.Protocol"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}

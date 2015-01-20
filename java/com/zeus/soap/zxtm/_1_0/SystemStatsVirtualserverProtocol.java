/**
 * SystemStatsVirtualserverProtocol.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.zeus.soap.zxtm._1_0;

public class SystemStatsVirtualserverProtocol implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected SystemStatsVirtualserverProtocol(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _http = "http";
    public static final java.lang.String _https = "https";
    public static final java.lang.String _ftp = "ftp";
    public static final java.lang.String _imaps = "imaps";
    public static final java.lang.String _imapv2 = "imapv2";
    public static final java.lang.String _imapv3 = "imapv3";
    public static final java.lang.String _imapv4 = "imapv4";
    public static final java.lang.String _pop3 = "pop3";
    public static final java.lang.String _pop3s = "pop3s";
    public static final java.lang.String _smtp = "smtp";
    public static final java.lang.String _ldap = "ldap";
    public static final java.lang.String _ldaps = "ldaps";
    public static final java.lang.String _telnet = "telnet";
    public static final java.lang.String _sslforwarding = "sslforwarding";
    public static final java.lang.String _udpstreaming = "udpstreaming";
    public static final java.lang.String _udp = "udp";
    public static final java.lang.String _dns = "dns";
    public static final java.lang.String _genericserverfirst = "genericserverfirst";
    public static final java.lang.String _genericclientfirst = "genericclientfirst";
    public static final java.lang.String _dnstcp = "dnstcp";
    public static final java.lang.String _sipudp = "sipudp";
    public static final java.lang.String _siptcp = "siptcp";
    public static final java.lang.String _rtsp = "rtsp";
    public static final SystemStatsVirtualserverProtocol http = new SystemStatsVirtualserverProtocol(_http);
    public static final SystemStatsVirtualserverProtocol https = new SystemStatsVirtualserverProtocol(_https);
    public static final SystemStatsVirtualserverProtocol ftp = new SystemStatsVirtualserverProtocol(_ftp);
    public static final SystemStatsVirtualserverProtocol imaps = new SystemStatsVirtualserverProtocol(_imaps);
    public static final SystemStatsVirtualserverProtocol imapv2 = new SystemStatsVirtualserverProtocol(_imapv2);
    public static final SystemStatsVirtualserverProtocol imapv3 = new SystemStatsVirtualserverProtocol(_imapv3);
    public static final SystemStatsVirtualserverProtocol imapv4 = new SystemStatsVirtualserverProtocol(_imapv4);
    public static final SystemStatsVirtualserverProtocol pop3 = new SystemStatsVirtualserverProtocol(_pop3);
    public static final SystemStatsVirtualserverProtocol pop3s = new SystemStatsVirtualserverProtocol(_pop3s);
    public static final SystemStatsVirtualserverProtocol smtp = new SystemStatsVirtualserverProtocol(_smtp);
    public static final SystemStatsVirtualserverProtocol ldap = new SystemStatsVirtualserverProtocol(_ldap);
    public static final SystemStatsVirtualserverProtocol ldaps = new SystemStatsVirtualserverProtocol(_ldaps);
    public static final SystemStatsVirtualserverProtocol telnet = new SystemStatsVirtualserverProtocol(_telnet);
    public static final SystemStatsVirtualserverProtocol sslforwarding = new SystemStatsVirtualserverProtocol(_sslforwarding);
    public static final SystemStatsVirtualserverProtocol udpstreaming = new SystemStatsVirtualserverProtocol(_udpstreaming);
    public static final SystemStatsVirtualserverProtocol udp = new SystemStatsVirtualserverProtocol(_udp);
    public static final SystemStatsVirtualserverProtocol dns = new SystemStatsVirtualserverProtocol(_dns);
    public static final SystemStatsVirtualserverProtocol genericserverfirst = new SystemStatsVirtualserverProtocol(_genericserverfirst);
    public static final SystemStatsVirtualserverProtocol genericclientfirst = new SystemStatsVirtualserverProtocol(_genericclientfirst);
    public static final SystemStatsVirtualserverProtocol dnstcp = new SystemStatsVirtualserverProtocol(_dnstcp);
    public static final SystemStatsVirtualserverProtocol sipudp = new SystemStatsVirtualserverProtocol(_sipudp);
    public static final SystemStatsVirtualserverProtocol siptcp = new SystemStatsVirtualserverProtocol(_siptcp);
    public static final SystemStatsVirtualserverProtocol rtsp = new SystemStatsVirtualserverProtocol(_rtsp);
    public java.lang.String getValue() { return _value_;}
    public static SystemStatsVirtualserverProtocol fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        SystemStatsVirtualserverProtocol enumeration = (SystemStatsVirtualserverProtocol)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static SystemStatsVirtualserverProtocol fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(SystemStatsVirtualserverProtocol.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "System.Stats.VirtualserverProtocol"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}

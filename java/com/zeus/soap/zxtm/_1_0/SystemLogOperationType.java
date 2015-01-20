/**
 * SystemLogOperationType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.zeus.soap.zxtm._1_0;

public class SystemLogOperationType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected SystemLogOperationType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _AccessDenied = "AccessDenied";
    public static final java.lang.String _TrafficManagerActivated = "TrafficManagerActivated";
    public static final java.lang.String _AddAuthenticator = "AddAuthenticator";
    public static final java.lang.String _AddFile = "AddFile";
    public static final java.lang.String _AddGroup = "AddGroup";
    public static final java.lang.String _AddUser = "AddUser";
    public static final java.lang.String _Adhoc = "Adhoc";
    public static final java.lang.String _AdminPasswordReset = "AdminPasswordReset";
    public static final java.lang.String _CopyAuthenticator = "CopyAuthenticator";
    public static final java.lang.String _CopyFile = "CopyFile";
    public static final java.lang.String _CopyGroup = "CopyGroup";
    public static final java.lang.String _DeleteAuthenticator = "DeleteAuthenticator";
    public static final java.lang.String _DeleteFile = "DeleteFile";
    public static final java.lang.String _DeleteGroup = "DeleteGroup";
    public static final java.lang.String _DeleteUser = "DeleteUser";
    public static final java.lang.String _ModifyFile = "ModifyFile";
    public static final java.lang.String _ModifyKey = "ModifyKey";
    public static final java.lang.String _Login = "Login";
    public static final java.lang.String _LoginFail = "LoginFail";
    public static final java.lang.String _LoginLimitHit = "LoginLimitHit";
    public static final java.lang.String _LoginSuspended = "LoginSuspended";
    public static final java.lang.String _Logout = "Logout";
    public static final java.lang.String _MaintenanceCLICmd = "MaintenanceCLICmd";
    public static final java.lang.String _NoAccessPermission = "NoAccessPermission";
    public static final java.lang.String _NoChangePermission = "NoChangePermission";
    public static final java.lang.String _PasswordExpired = "PasswordExpired";
    public static final java.lang.String _SystemSettingsReapplied = "SystemSettingsReapplied";
    public static final java.lang.String _RemoveKey = "RemoveKey";
    public static final java.lang.String _RenameFile = "RenameFile";
    public static final java.lang.String _RestSessionEnd = "RestSessionEnd";
    public static final java.lang.String _RestSessionStart = "RestSessionStart";
    public static final java.lang.String _ConfigRefreshed = "ConfigRefreshed";
    public static final java.lang.String _ModifyRule = "ModifyRule";
    public static final java.lang.String _StartVS = "StartVS";
    public static final java.lang.String _StopVS = "StopVS";
    public static final java.lang.String _SuspensionExpired = "SuspensionExpired";
    public static final java.lang.String _Synchronise = "Synchronise";
    public static final java.lang.String _SessionTerminated = "SessionTerminated";
    public static final java.lang.String _Timeout = "Timeout";
    public static final java.lang.String _ModifyUser = "ModifyUser";
    public static final SystemLogOperationType AccessDenied = new SystemLogOperationType(_AccessDenied);
    public static final SystemLogOperationType TrafficManagerActivated = new SystemLogOperationType(_TrafficManagerActivated);
    public static final SystemLogOperationType AddAuthenticator = new SystemLogOperationType(_AddAuthenticator);
    public static final SystemLogOperationType AddFile = new SystemLogOperationType(_AddFile);
    public static final SystemLogOperationType AddGroup = new SystemLogOperationType(_AddGroup);
    public static final SystemLogOperationType AddUser = new SystemLogOperationType(_AddUser);
    public static final SystemLogOperationType Adhoc = new SystemLogOperationType(_Adhoc);
    public static final SystemLogOperationType AdminPasswordReset = new SystemLogOperationType(_AdminPasswordReset);
    public static final SystemLogOperationType CopyAuthenticator = new SystemLogOperationType(_CopyAuthenticator);
    public static final SystemLogOperationType CopyFile = new SystemLogOperationType(_CopyFile);
    public static final SystemLogOperationType CopyGroup = new SystemLogOperationType(_CopyGroup);
    public static final SystemLogOperationType DeleteAuthenticator = new SystemLogOperationType(_DeleteAuthenticator);
    public static final SystemLogOperationType DeleteFile = new SystemLogOperationType(_DeleteFile);
    public static final SystemLogOperationType DeleteGroup = new SystemLogOperationType(_DeleteGroup);
    public static final SystemLogOperationType DeleteUser = new SystemLogOperationType(_DeleteUser);
    public static final SystemLogOperationType ModifyFile = new SystemLogOperationType(_ModifyFile);
    public static final SystemLogOperationType ModifyKey = new SystemLogOperationType(_ModifyKey);
    public static final SystemLogOperationType Login = new SystemLogOperationType(_Login);
    public static final SystemLogOperationType LoginFail = new SystemLogOperationType(_LoginFail);
    public static final SystemLogOperationType LoginLimitHit = new SystemLogOperationType(_LoginLimitHit);
    public static final SystemLogOperationType LoginSuspended = new SystemLogOperationType(_LoginSuspended);
    public static final SystemLogOperationType Logout = new SystemLogOperationType(_Logout);
    public static final SystemLogOperationType MaintenanceCLICmd = new SystemLogOperationType(_MaintenanceCLICmd);
    public static final SystemLogOperationType NoAccessPermission = new SystemLogOperationType(_NoAccessPermission);
    public static final SystemLogOperationType NoChangePermission = new SystemLogOperationType(_NoChangePermission);
    public static final SystemLogOperationType PasswordExpired = new SystemLogOperationType(_PasswordExpired);
    public static final SystemLogOperationType SystemSettingsReapplied = new SystemLogOperationType(_SystemSettingsReapplied);
    public static final SystemLogOperationType RemoveKey = new SystemLogOperationType(_RemoveKey);
    public static final SystemLogOperationType RenameFile = new SystemLogOperationType(_RenameFile);
    public static final SystemLogOperationType RestSessionEnd = new SystemLogOperationType(_RestSessionEnd);
    public static final SystemLogOperationType RestSessionStart = new SystemLogOperationType(_RestSessionStart);
    public static final SystemLogOperationType ConfigRefreshed = new SystemLogOperationType(_ConfigRefreshed);
    public static final SystemLogOperationType ModifyRule = new SystemLogOperationType(_ModifyRule);
    public static final SystemLogOperationType StartVS = new SystemLogOperationType(_StartVS);
    public static final SystemLogOperationType StopVS = new SystemLogOperationType(_StopVS);
    public static final SystemLogOperationType SuspensionExpired = new SystemLogOperationType(_SuspensionExpired);
    public static final SystemLogOperationType Synchronise = new SystemLogOperationType(_Synchronise);
    public static final SystemLogOperationType SessionTerminated = new SystemLogOperationType(_SessionTerminated);
    public static final SystemLogOperationType Timeout = new SystemLogOperationType(_Timeout);
    public static final SystemLogOperationType ModifyUser = new SystemLogOperationType(_ModifyUser);
    public java.lang.String getValue() { return _value_;}
    public static SystemLogOperationType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        SystemLogOperationType enumeration = (SystemLogOperationType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static SystemLogOperationType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(SystemLogOperationType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "System.Log.OperationType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}

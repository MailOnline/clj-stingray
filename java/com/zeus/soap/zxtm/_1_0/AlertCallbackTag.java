/**
 * AlertCallbackTag.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.zeus.soap.zxtm._1_0;

public class AlertCallbackTag implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected AlertCallbackTag(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _value1 = "CustomEvent";
    public static final java.lang.String _value2 = "Unknown";
    public static final java.lang.String _value3 = "cloudcredentials_apistatusprocesshanging";
    public static final java.lang.String _value4 = "cloudcredentials_autoscaleresponseparseerror";
    public static final java.lang.String _value5 = "cloudcredentials_autoscalestatusupdateerror";
    public static final java.lang.String _value6 = "cloudcredentials_autoscalingprocesstimedout";
    public static final java.lang.String _value7 = "cloudcredentials_usedcredsdeleted";
    public static final java.lang.String _value8 = "config_confadd";
    public static final java.lang.String _value9 = "config_confdel";
    public static final java.lang.String _value10 = "config_confmod";
    public static final java.lang.String _value11 = "config_confok";
    public static final java.lang.String _value12 = "faulttolerance_activatealldead";
    public static final java.lang.String _value13 = "faulttolerance_activatedautomatically";
    public static final java.lang.String _value14 = "faulttolerance_allmachinesok";
    public static final java.lang.String _value15 = "faulttolerance_dropec2ipwarn";
    public static final java.lang.String _value16 = "faulttolerance_dropipinfo";
    public static final java.lang.String _value17 = "faulttolerance_dropipwarn";
    public static final java.lang.String _value18 = "faulttolerance_ec2flipperraiselocalworking";
    public static final java.lang.String _value19 = "faulttolerance_ec2flipperraiseothersdead";
    public static final java.lang.String _value20 = "faulttolerance_ec2iperr";
    public static final java.lang.String _value21 = "faulttolerance_ec2nopublicip";
    public static final java.lang.String _value22 = "faulttolerance_ec2nosecondaryprivateip";
    public static final java.lang.String _value23 = "faulttolerance_ec2vpceipassocerr";
    public static final java.lang.String _value24 = "faulttolerance_ec2vpciderr";
    public static final java.lang.String _value25 = "faulttolerance_flipperbackendsworking";
    public static final java.lang.String _value26 = "faulttolerance_flipperdadreraise";
    public static final java.lang.String _value27 = "faulttolerance_flipperfrontendsworking";
    public static final java.lang.String _value28 = "faulttolerance_flipperipexists";
    public static final java.lang.String _value29 = "faulttolerance_flipperraiselocalworking";
    public static final java.lang.String _value30 = "faulttolerance_flipperraiseosdrop";
    public static final java.lang.String _value31 = "faulttolerance_flipperraiseothersdead";
    public static final java.lang.String _value32 = "faulttolerance_flipperraiseremotedropped";
    public static final java.lang.String _value33 = "faulttolerance_flipperrecovered";
    public static final java.lang.String _value34 = "faulttolerance_machinefail";
    public static final java.lang.String _value35 = "faulttolerance_machineok";
    public static final java.lang.String _value36 = "faulttolerance_machinerecovered";
    public static final java.lang.String _value37 = "faulttolerance_machinetimeout";
    public static final java.lang.String _value38 = "faulttolerance_multihostload";
    public static final java.lang.String _value39 = "faulttolerance_pingbackendfail";
    public static final java.lang.String _value40 = "faulttolerance_pingfrontendfail";
    public static final java.lang.String _value41 = "faulttolerance_pinggwfail";
    public static final java.lang.String _value42 = "faulttolerance_statebaddata";
    public static final java.lang.String _value43 = "faulttolerance_stateconnfail";
    public static final java.lang.String _value44 = "faulttolerance_stateok";
    public static final java.lang.String _value45 = "faulttolerance_statereadfail";
    public static final java.lang.String _value46 = "faulttolerance_statetimeout";
    public static final java.lang.String _value47 = "faulttolerance_stateunexpected";
    public static final java.lang.String _value48 = "faulttolerance_statewritefail";
    public static final java.lang.String _value49 = "faulttolerance_zclustermoderr";
    public static final java.lang.String _value50 = "general_aptimizerresourcetoolargeforcache";
    public static final java.lang.String _value51 = "general_autherror";
    public static final java.lang.String _value52 = "general_autoscalinglicenseerror";
    public static final java.lang.String _value53 = "general_confrepfailed";
    public static final java.lang.String _value54 = "general_confreptimeout";
    public static final java.lang.String _value55 = "general_fewfreefds";
    public static final java.lang.String _value56 = "general_geodataloadfail";
    public static final java.lang.String _value57 = "general_hardware";
    public static final java.lang.String _value58 = "general_licensetoomanylocations";
    public static final java.lang.String _value59 = "general_logdiskfull";
    public static final java.lang.String _value60 = "general_logdiskoverload";
    public static final java.lang.String _value61 = "general_numlocations-exceeded";
    public static final java.lang.String _value62 = "general_numnodes-exceeded";
    public static final java.lang.String _value63 = "general_numpools-exceeded";
    public static final java.lang.String _value64 = "general_numtipg-exceeded";
    public static final java.lang.String _value65 = "general_restartrequired";
    public static final java.lang.String _value66 = "general_running";
    public static final java.lang.String _value67 = "general_sslcrltoobig";
    public static final java.lang.String _value68 = "general_timemovedback";
    public static final java.lang.String _value69 = "general_zxtmhighload";
    public static final java.lang.String _value70 = "general_zxtmswerror";
    public static final java.lang.String _value71 = "java_javadied";
    public static final java.lang.String _value72 = "java_javanotfound";
    public static final java.lang.String _value73 = "java_javastarted";
    public static final java.lang.String _value74 = "java_javastartfail";
    public static final java.lang.String _value75 = "java_javastop";
    public static final java.lang.String _value76 = "java_javaterminatefail";
    public static final java.lang.String _value77 = "java_servleterror";
    public static final java.lang.String _value78 = "licensekeys_analyticslicensedisabled";
    public static final java.lang.String _value79 = "licensekeys_analyticslicenseenabled";
    public static final java.lang.String _value80 = "licensekeys_autoscalinglicensedisabled";
    public static final java.lang.String _value81 = "licensekeys_autoscalinglicenseenabled";
    public static final java.lang.String _value82 = "licensekeys_bwlimited";
    public static final java.lang.String _value83 = "licensekeys_cachesizereduced";
    public static final java.lang.String _value84 = "licensekeys_expired";
    public static final java.lang.String _value85 = "licensekeys_expiresoon";
    public static final java.lang.String _value86 = "licensekeys_lessmemallowed";
    public static final java.lang.String _value87 = "licensekeys_license-authorized";
    public static final java.lang.String _value88 = "licensekeys_license-authorized-ts";
    public static final java.lang.String _value89 = "licensekeys_license-graceperiodexpired";
    public static final java.lang.String _value90 = "licensekeys_license-graceperiodexpired-ts";
    public static final java.lang.String _value91 = "licensekeys_license-rejected-authorized";
    public static final java.lang.String _value92 = "licensekeys_license-rejected-authorized-ts";
    public static final java.lang.String _value93 = "licensekeys_license-rejected-unauthorized";
    public static final java.lang.String _value94 = "licensekeys_license-rejected-unauthorized-ts";
    public static final java.lang.String _value95 = "licensekeys_license-timedout-authorized";
    public static final java.lang.String _value96 = "licensekeys_license-timedout-authorized-ts";
    public static final java.lang.String _value97 = "licensekeys_license-timedout-unauthorized";
    public static final java.lang.String _value98 = "licensekeys_license-timedout-unauthorized-ts";
    public static final java.lang.String _value99 = "licensekeys_license-unauthorized";
    public static final java.lang.String _value100 = "licensekeys_licenseclustertoobig";
    public static final java.lang.String _value101 = "licensekeys_licensecorrupt";
    public static final java.lang.String _value102 = "licensekeys_morememallowed";
    public static final java.lang.String _value103 = "licensekeys_ssltpslimited";
    public static final java.lang.String _value104 = "licensekeys_tpslimited";
    public static final java.lang.String _value105 = "licensekeys_unlicensed";
    public static final java.lang.String _value106 = "licensekeys_usingdevlicense";
    public static final java.lang.String _value107 = "licensekeys_usinglicense";
    public static final java.lang.String _value108 = "locations_locationfail";
    public static final java.lang.String _value109 = "locations_locationmonitorfail";
    public static final java.lang.String _value110 = "locations_locationmonitorok";
    public static final java.lang.String _value111 = "locations_locationok";
    public static final java.lang.String _value112 = "locations_locationsoapfail";
    public static final java.lang.String _value113 = "locations_locationsoapok";
    public static final java.lang.String _value114 = "locations_locempty";
    public static final java.lang.String _value115 = "locations_locmovemachine";
    public static final java.lang.String _value116 = "monitors_monitorfail";
    public static final java.lang.String _value117 = "monitors_monitorok";
    public static final java.lang.String _value118 = "pools_apichangeprocesshanging";
    public static final java.lang.String _value119 = "pools_autonodecreationcomplete";
    public static final java.lang.String _value120 = "pools_autonodecreationstarted";
    public static final java.lang.String _value121 = "pools_autonodedestroyed";
    public static final java.lang.String _value122 = "pools_autonodedestructioncomplete";
    public static final java.lang.String _value123 = "pools_autonodedisappeared";
    public static final java.lang.String _value124 = "pools_autonodeexisted";
    public static final java.lang.String _value125 = "pools_autonodestatuschange";
    public static final java.lang.String _value126 = "pools_autoscalednodecontested";
    public static final java.lang.String _value127 = "pools_autoscaledpoolrefractory";
    public static final java.lang.String _value128 = "pools_autoscaledpooltoobig";
    public static final java.lang.String _value129 = "pools_autoscaledpooltoosmall";
    public static final java.lang.String _value130 = "pools_autoscaleinvalidargforcreatenode";
    public static final java.lang.String _value131 = "pools_autoscaleinvalidargfordeletenode";
    public static final java.lang.String _value132 = "pools_autoscalepoolconfupdate";
    public static final java.lang.String _value133 = "pools_autoscalewrongimageid";
    public static final java.lang.String _value134 = "pools_autoscalewrongname";
    public static final java.lang.String _value135 = "pools_autoscalewrongsizeid";
    public static final java.lang.String _value136 = "pools_autoscalingchangeprocessfailure";
    public static final java.lang.String _value137 = "pools_autoscalingdisabled";
    public static final java.lang.String _value138 = "pools_autoscalinghitfloor";
    public static final java.lang.String _value139 = "pools_autoscalinghitroof";
    public static final java.lang.String _value140 = "pools_autoscalinghysteresiscantgrow";
    public static final java.lang.String _value141 = "pools_autoscalinghysteresiscantshrink";
    public static final java.lang.String _value142 = "pools_autoscalingpoolstatechange";
    public static final java.lang.String _value143 = "pools_autoscalingresuscitatepool";
    public static final java.lang.String _value144 = "pools_badcontentlen";
    public static final java.lang.String _value145 = "pools_cannotshrinkemptypool";
    public static final java.lang.String _value146 = "pools_ehloinvalid";
    public static final java.lang.String _value147 = "pools_nodefail";
    public static final java.lang.String _value148 = "pools_noderesolvefailure";
    public static final java.lang.String _value149 = "pools_noderesolvemultiple";
    public static final java.lang.String _value150 = "pools_nodeworking";
    public static final java.lang.String _value151 = "pools_nostarttls";
    public static final java.lang.String _value152 = "pools_pooldied";
    public static final java.lang.String _value153 = "pools_poolnonodes";
    public static final java.lang.String _value154 = "pools_poolok";
    public static final java.lang.String _value155 = "pools_starttlsinvalid";
    public static final java.lang.String _value156 = "protection_triggersummary";
    public static final java.lang.String _value157 = "rules_aptimizedisabled";
    public static final java.lang.String _value158 = "rules_aptimizeuseunknownprofile";
    public static final java.lang.String _value159 = "rules_aptimizeuseunknownscope";
    public static final java.lang.String _value160 = "rules_datastorefull";
    public static final java.lang.String _value161 = "rules_forwardproxybadhost";
    public static final java.lang.String _value162 = "rules_invalidemit";
    public static final java.lang.String _value163 = "rules_norate";
    public static final java.lang.String _value164 = "rules_poolactivenodesunknown";
    public static final java.lang.String _value165 = "rules_pooluseunknown";
    public static final java.lang.String _value166 = "rules_ruleabort";
    public static final java.lang.String _value167 = "rules_rulebodycomperror";
    public static final java.lang.String _value168 = "rules_rulebufferlarge";
    public static final java.lang.String _value169 = "rules_rulelogmsginfo";
    public static final java.lang.String _value170 = "rules_rulelogmsgserious";
    public static final java.lang.String _value171 = "rules_rulelogmsgwarn";
    public static final java.lang.String _value172 = "rules_rulenopersistence";
    public static final java.lang.String _value173 = "rules_rulesinvalidrequestbody";
    public static final java.lang.String _value174 = "rules_rulestreamerrorgetresponse";
    public static final java.lang.String _value175 = "rules_rulestreamerrorinternal";
    public static final java.lang.String _value176 = "rules_rulestreamerrornotenough";
    public static final java.lang.String _value177 = "rules_rulestreamerrornotfinished";
    public static final java.lang.String _value178 = "rules_rulestreamerrornotstarted";
    public static final java.lang.String _value179 = "rules_rulestreamerrorprocessfailure";
    public static final java.lang.String _value180 = "rules_rulestreamerrortoomuch";
    public static final java.lang.String _value181 = "rules_rulexmlerr";
    public static final java.lang.String _value182 = "rules_serviceruleabort";
    public static final java.lang.String _value183 = "rules_servicerulelocdead";
    public static final java.lang.String _value184 = "rules_servicerulelocnotconfigured";
    public static final java.lang.String _value185 = "rules_servicerulelocunknown";
    public static final java.lang.String _value186 = "services_glbdeadlocmissingips";
    public static final java.lang.String _value187 = "services_glbfailalter";
    public static final java.lang.String _value188 = "services_glblogwritefail";
    public static final java.lang.String _value189 = "services_glbmissingips";
    public static final java.lang.String _value190 = "services_glbnewmaster";
    public static final java.lang.String _value191 = "services_glbnolocations";
    public static final java.lang.String _value192 = "services_glbservicedied";
    public static final java.lang.String _value193 = "services_glbserviceok";
    public static final java.lang.String _value194 = "slm_slmclasslimitexceeded";
    public static final java.lang.String _value195 = "slm_slmfallenbelowserious";
    public static final java.lang.String _value196 = "slm_slmfallenbelowwarn";
    public static final java.lang.String _value197 = "slm_slmnodeinfo";
    public static final java.lang.String _value198 = "slm_slmrecoveredserious";
    public static final java.lang.String _value199 = "slm_slmrecoveredwarn";
    public static final java.lang.String _value200 = "sslhw_sslhwfail";
    public static final java.lang.String _value201 = "sslhw_sslhwrestart";
    public static final java.lang.String _value202 = "sslhw_sslhwstart";
    public static final java.lang.String _value203 = "testaction";
    public static final java.lang.String _value204 = "vservers_connerror";
    public static final java.lang.String _value205 = "vservers_connfail";
    public static final java.lang.String _value206 = "vservers_logfiledeleted";
    public static final java.lang.String _value207 = "vservers_maxclientbufferdrop";
    public static final java.lang.String _value208 = "vservers_poolpersistencemismatch";
    public static final java.lang.String _value209 = "vservers_privkeyok";
    public static final java.lang.String _value210 = "vservers_respcompfail";
    public static final java.lang.String _value211 = "vservers_responsetoolarge";
    public static final java.lang.String _value212 = "vservers_rtspstreamnoports";
    public static final java.lang.String _value213 = "vservers_sipstreamnoports";
    public static final java.lang.String _value214 = "vservers_ssldrop";
    public static final java.lang.String _value215 = "vservers_sslfail";
    public static final java.lang.String _value216 = "vservers_sslhandshakemsgsizelimit";
    public static final java.lang.String _value217 = "vservers_vscacertexpired";
    public static final java.lang.String _value218 = "vservers_vscacerttoexpire";
    public static final java.lang.String _value219 = "vservers_vscrloutofdate";
    public static final java.lang.String _value220 = "vservers_vslogwritefail";
    public static final java.lang.String _value221 = "vservers_vssslcertexpired";
    public static final java.lang.String _value222 = "vservers_vssslcerttoexpire";
    public static final java.lang.String _value223 = "vservers_vsstart";
    public static final java.lang.String _value224 = "vservers_vsstop";
    public static final java.lang.String _value225 = "zxtms_versionmismatch";
    public static final AlertCallbackTag value1 = new AlertCallbackTag(_value1);
    public static final AlertCallbackTag value2 = new AlertCallbackTag(_value2);
    public static final AlertCallbackTag value3 = new AlertCallbackTag(_value3);
    public static final AlertCallbackTag value4 = new AlertCallbackTag(_value4);
    public static final AlertCallbackTag value5 = new AlertCallbackTag(_value5);
    public static final AlertCallbackTag value6 = new AlertCallbackTag(_value6);
    public static final AlertCallbackTag value7 = new AlertCallbackTag(_value7);
    public static final AlertCallbackTag value8 = new AlertCallbackTag(_value8);
    public static final AlertCallbackTag value9 = new AlertCallbackTag(_value9);
    public static final AlertCallbackTag value10 = new AlertCallbackTag(_value10);
    public static final AlertCallbackTag value11 = new AlertCallbackTag(_value11);
    public static final AlertCallbackTag value12 = new AlertCallbackTag(_value12);
    public static final AlertCallbackTag value13 = new AlertCallbackTag(_value13);
    public static final AlertCallbackTag value14 = new AlertCallbackTag(_value14);
    public static final AlertCallbackTag value15 = new AlertCallbackTag(_value15);
    public static final AlertCallbackTag value16 = new AlertCallbackTag(_value16);
    public static final AlertCallbackTag value17 = new AlertCallbackTag(_value17);
    public static final AlertCallbackTag value18 = new AlertCallbackTag(_value18);
    public static final AlertCallbackTag value19 = new AlertCallbackTag(_value19);
    public static final AlertCallbackTag value20 = new AlertCallbackTag(_value20);
    public static final AlertCallbackTag value21 = new AlertCallbackTag(_value21);
    public static final AlertCallbackTag value22 = new AlertCallbackTag(_value22);
    public static final AlertCallbackTag value23 = new AlertCallbackTag(_value23);
    public static final AlertCallbackTag value24 = new AlertCallbackTag(_value24);
    public static final AlertCallbackTag value25 = new AlertCallbackTag(_value25);
    public static final AlertCallbackTag value26 = new AlertCallbackTag(_value26);
    public static final AlertCallbackTag value27 = new AlertCallbackTag(_value27);
    public static final AlertCallbackTag value28 = new AlertCallbackTag(_value28);
    public static final AlertCallbackTag value29 = new AlertCallbackTag(_value29);
    public static final AlertCallbackTag value30 = new AlertCallbackTag(_value30);
    public static final AlertCallbackTag value31 = new AlertCallbackTag(_value31);
    public static final AlertCallbackTag value32 = new AlertCallbackTag(_value32);
    public static final AlertCallbackTag value33 = new AlertCallbackTag(_value33);
    public static final AlertCallbackTag value34 = new AlertCallbackTag(_value34);
    public static final AlertCallbackTag value35 = new AlertCallbackTag(_value35);
    public static final AlertCallbackTag value36 = new AlertCallbackTag(_value36);
    public static final AlertCallbackTag value37 = new AlertCallbackTag(_value37);
    public static final AlertCallbackTag value38 = new AlertCallbackTag(_value38);
    public static final AlertCallbackTag value39 = new AlertCallbackTag(_value39);
    public static final AlertCallbackTag value40 = new AlertCallbackTag(_value40);
    public static final AlertCallbackTag value41 = new AlertCallbackTag(_value41);
    public static final AlertCallbackTag value42 = new AlertCallbackTag(_value42);
    public static final AlertCallbackTag value43 = new AlertCallbackTag(_value43);
    public static final AlertCallbackTag value44 = new AlertCallbackTag(_value44);
    public static final AlertCallbackTag value45 = new AlertCallbackTag(_value45);
    public static final AlertCallbackTag value46 = new AlertCallbackTag(_value46);
    public static final AlertCallbackTag value47 = new AlertCallbackTag(_value47);
    public static final AlertCallbackTag value48 = new AlertCallbackTag(_value48);
    public static final AlertCallbackTag value49 = new AlertCallbackTag(_value49);
    public static final AlertCallbackTag value50 = new AlertCallbackTag(_value50);
    public static final AlertCallbackTag value51 = new AlertCallbackTag(_value51);
    public static final AlertCallbackTag value52 = new AlertCallbackTag(_value52);
    public static final AlertCallbackTag value53 = new AlertCallbackTag(_value53);
    public static final AlertCallbackTag value54 = new AlertCallbackTag(_value54);
    public static final AlertCallbackTag value55 = new AlertCallbackTag(_value55);
    public static final AlertCallbackTag value56 = new AlertCallbackTag(_value56);
    public static final AlertCallbackTag value57 = new AlertCallbackTag(_value57);
    public static final AlertCallbackTag value58 = new AlertCallbackTag(_value58);
    public static final AlertCallbackTag value59 = new AlertCallbackTag(_value59);
    public static final AlertCallbackTag value60 = new AlertCallbackTag(_value60);
    public static final AlertCallbackTag value61 = new AlertCallbackTag(_value61);
    public static final AlertCallbackTag value62 = new AlertCallbackTag(_value62);
    public static final AlertCallbackTag value63 = new AlertCallbackTag(_value63);
    public static final AlertCallbackTag value64 = new AlertCallbackTag(_value64);
    public static final AlertCallbackTag value65 = new AlertCallbackTag(_value65);
    public static final AlertCallbackTag value66 = new AlertCallbackTag(_value66);
    public static final AlertCallbackTag value67 = new AlertCallbackTag(_value67);
    public static final AlertCallbackTag value68 = new AlertCallbackTag(_value68);
    public static final AlertCallbackTag value69 = new AlertCallbackTag(_value69);
    public static final AlertCallbackTag value70 = new AlertCallbackTag(_value70);
    public static final AlertCallbackTag value71 = new AlertCallbackTag(_value71);
    public static final AlertCallbackTag value72 = new AlertCallbackTag(_value72);
    public static final AlertCallbackTag value73 = new AlertCallbackTag(_value73);
    public static final AlertCallbackTag value74 = new AlertCallbackTag(_value74);
    public static final AlertCallbackTag value75 = new AlertCallbackTag(_value75);
    public static final AlertCallbackTag value76 = new AlertCallbackTag(_value76);
    public static final AlertCallbackTag value77 = new AlertCallbackTag(_value77);
    public static final AlertCallbackTag value78 = new AlertCallbackTag(_value78);
    public static final AlertCallbackTag value79 = new AlertCallbackTag(_value79);
    public static final AlertCallbackTag value80 = new AlertCallbackTag(_value80);
    public static final AlertCallbackTag value81 = new AlertCallbackTag(_value81);
    public static final AlertCallbackTag value82 = new AlertCallbackTag(_value82);
    public static final AlertCallbackTag value83 = new AlertCallbackTag(_value83);
    public static final AlertCallbackTag value84 = new AlertCallbackTag(_value84);
    public static final AlertCallbackTag value85 = new AlertCallbackTag(_value85);
    public static final AlertCallbackTag value86 = new AlertCallbackTag(_value86);
    public static final AlertCallbackTag value87 = new AlertCallbackTag(_value87);
    public static final AlertCallbackTag value88 = new AlertCallbackTag(_value88);
    public static final AlertCallbackTag value89 = new AlertCallbackTag(_value89);
    public static final AlertCallbackTag value90 = new AlertCallbackTag(_value90);
    public static final AlertCallbackTag value91 = new AlertCallbackTag(_value91);
    public static final AlertCallbackTag value92 = new AlertCallbackTag(_value92);
    public static final AlertCallbackTag value93 = new AlertCallbackTag(_value93);
    public static final AlertCallbackTag value94 = new AlertCallbackTag(_value94);
    public static final AlertCallbackTag value95 = new AlertCallbackTag(_value95);
    public static final AlertCallbackTag value96 = new AlertCallbackTag(_value96);
    public static final AlertCallbackTag value97 = new AlertCallbackTag(_value97);
    public static final AlertCallbackTag value98 = new AlertCallbackTag(_value98);
    public static final AlertCallbackTag value99 = new AlertCallbackTag(_value99);
    public static final AlertCallbackTag value100 = new AlertCallbackTag(_value100);
    public static final AlertCallbackTag value101 = new AlertCallbackTag(_value101);
    public static final AlertCallbackTag value102 = new AlertCallbackTag(_value102);
    public static final AlertCallbackTag value103 = new AlertCallbackTag(_value103);
    public static final AlertCallbackTag value104 = new AlertCallbackTag(_value104);
    public static final AlertCallbackTag value105 = new AlertCallbackTag(_value105);
    public static final AlertCallbackTag value106 = new AlertCallbackTag(_value106);
    public static final AlertCallbackTag value107 = new AlertCallbackTag(_value107);
    public static final AlertCallbackTag value108 = new AlertCallbackTag(_value108);
    public static final AlertCallbackTag value109 = new AlertCallbackTag(_value109);
    public static final AlertCallbackTag value110 = new AlertCallbackTag(_value110);
    public static final AlertCallbackTag value111 = new AlertCallbackTag(_value111);
    public static final AlertCallbackTag value112 = new AlertCallbackTag(_value112);
    public static final AlertCallbackTag value113 = new AlertCallbackTag(_value113);
    public static final AlertCallbackTag value114 = new AlertCallbackTag(_value114);
    public static final AlertCallbackTag value115 = new AlertCallbackTag(_value115);
    public static final AlertCallbackTag value116 = new AlertCallbackTag(_value116);
    public static final AlertCallbackTag value117 = new AlertCallbackTag(_value117);
    public static final AlertCallbackTag value118 = new AlertCallbackTag(_value118);
    public static final AlertCallbackTag value119 = new AlertCallbackTag(_value119);
    public static final AlertCallbackTag value120 = new AlertCallbackTag(_value120);
    public static final AlertCallbackTag value121 = new AlertCallbackTag(_value121);
    public static final AlertCallbackTag value122 = new AlertCallbackTag(_value122);
    public static final AlertCallbackTag value123 = new AlertCallbackTag(_value123);
    public static final AlertCallbackTag value124 = new AlertCallbackTag(_value124);
    public static final AlertCallbackTag value125 = new AlertCallbackTag(_value125);
    public static final AlertCallbackTag value126 = new AlertCallbackTag(_value126);
    public static final AlertCallbackTag value127 = new AlertCallbackTag(_value127);
    public static final AlertCallbackTag value128 = new AlertCallbackTag(_value128);
    public static final AlertCallbackTag value129 = new AlertCallbackTag(_value129);
    public static final AlertCallbackTag value130 = new AlertCallbackTag(_value130);
    public static final AlertCallbackTag value131 = new AlertCallbackTag(_value131);
    public static final AlertCallbackTag value132 = new AlertCallbackTag(_value132);
    public static final AlertCallbackTag value133 = new AlertCallbackTag(_value133);
    public static final AlertCallbackTag value134 = new AlertCallbackTag(_value134);
    public static final AlertCallbackTag value135 = new AlertCallbackTag(_value135);
    public static final AlertCallbackTag value136 = new AlertCallbackTag(_value136);
    public static final AlertCallbackTag value137 = new AlertCallbackTag(_value137);
    public static final AlertCallbackTag value138 = new AlertCallbackTag(_value138);
    public static final AlertCallbackTag value139 = new AlertCallbackTag(_value139);
    public static final AlertCallbackTag value140 = new AlertCallbackTag(_value140);
    public static final AlertCallbackTag value141 = new AlertCallbackTag(_value141);
    public static final AlertCallbackTag value142 = new AlertCallbackTag(_value142);
    public static final AlertCallbackTag value143 = new AlertCallbackTag(_value143);
    public static final AlertCallbackTag value144 = new AlertCallbackTag(_value144);
    public static final AlertCallbackTag value145 = new AlertCallbackTag(_value145);
    public static final AlertCallbackTag value146 = new AlertCallbackTag(_value146);
    public static final AlertCallbackTag value147 = new AlertCallbackTag(_value147);
    public static final AlertCallbackTag value148 = new AlertCallbackTag(_value148);
    public static final AlertCallbackTag value149 = new AlertCallbackTag(_value149);
    public static final AlertCallbackTag value150 = new AlertCallbackTag(_value150);
    public static final AlertCallbackTag value151 = new AlertCallbackTag(_value151);
    public static final AlertCallbackTag value152 = new AlertCallbackTag(_value152);
    public static final AlertCallbackTag value153 = new AlertCallbackTag(_value153);
    public static final AlertCallbackTag value154 = new AlertCallbackTag(_value154);
    public static final AlertCallbackTag value155 = new AlertCallbackTag(_value155);
    public static final AlertCallbackTag value156 = new AlertCallbackTag(_value156);
    public static final AlertCallbackTag value157 = new AlertCallbackTag(_value157);
    public static final AlertCallbackTag value158 = new AlertCallbackTag(_value158);
    public static final AlertCallbackTag value159 = new AlertCallbackTag(_value159);
    public static final AlertCallbackTag value160 = new AlertCallbackTag(_value160);
    public static final AlertCallbackTag value161 = new AlertCallbackTag(_value161);
    public static final AlertCallbackTag value162 = new AlertCallbackTag(_value162);
    public static final AlertCallbackTag value163 = new AlertCallbackTag(_value163);
    public static final AlertCallbackTag value164 = new AlertCallbackTag(_value164);
    public static final AlertCallbackTag value165 = new AlertCallbackTag(_value165);
    public static final AlertCallbackTag value166 = new AlertCallbackTag(_value166);
    public static final AlertCallbackTag value167 = new AlertCallbackTag(_value167);
    public static final AlertCallbackTag value168 = new AlertCallbackTag(_value168);
    public static final AlertCallbackTag value169 = new AlertCallbackTag(_value169);
    public static final AlertCallbackTag value170 = new AlertCallbackTag(_value170);
    public static final AlertCallbackTag value171 = new AlertCallbackTag(_value171);
    public static final AlertCallbackTag value172 = new AlertCallbackTag(_value172);
    public static final AlertCallbackTag value173 = new AlertCallbackTag(_value173);
    public static final AlertCallbackTag value174 = new AlertCallbackTag(_value174);
    public static final AlertCallbackTag value175 = new AlertCallbackTag(_value175);
    public static final AlertCallbackTag value176 = new AlertCallbackTag(_value176);
    public static final AlertCallbackTag value177 = new AlertCallbackTag(_value177);
    public static final AlertCallbackTag value178 = new AlertCallbackTag(_value178);
    public static final AlertCallbackTag value179 = new AlertCallbackTag(_value179);
    public static final AlertCallbackTag value180 = new AlertCallbackTag(_value180);
    public static final AlertCallbackTag value181 = new AlertCallbackTag(_value181);
    public static final AlertCallbackTag value182 = new AlertCallbackTag(_value182);
    public static final AlertCallbackTag value183 = new AlertCallbackTag(_value183);
    public static final AlertCallbackTag value184 = new AlertCallbackTag(_value184);
    public static final AlertCallbackTag value185 = new AlertCallbackTag(_value185);
    public static final AlertCallbackTag value186 = new AlertCallbackTag(_value186);
    public static final AlertCallbackTag value187 = new AlertCallbackTag(_value187);
    public static final AlertCallbackTag value188 = new AlertCallbackTag(_value188);
    public static final AlertCallbackTag value189 = new AlertCallbackTag(_value189);
    public static final AlertCallbackTag value190 = new AlertCallbackTag(_value190);
    public static final AlertCallbackTag value191 = new AlertCallbackTag(_value191);
    public static final AlertCallbackTag value192 = new AlertCallbackTag(_value192);
    public static final AlertCallbackTag value193 = new AlertCallbackTag(_value193);
    public static final AlertCallbackTag value194 = new AlertCallbackTag(_value194);
    public static final AlertCallbackTag value195 = new AlertCallbackTag(_value195);
    public static final AlertCallbackTag value196 = new AlertCallbackTag(_value196);
    public static final AlertCallbackTag value197 = new AlertCallbackTag(_value197);
    public static final AlertCallbackTag value198 = new AlertCallbackTag(_value198);
    public static final AlertCallbackTag value199 = new AlertCallbackTag(_value199);
    public static final AlertCallbackTag value200 = new AlertCallbackTag(_value200);
    public static final AlertCallbackTag value201 = new AlertCallbackTag(_value201);
    public static final AlertCallbackTag value202 = new AlertCallbackTag(_value202);
    public static final AlertCallbackTag value203 = new AlertCallbackTag(_value203);
    public static final AlertCallbackTag value204 = new AlertCallbackTag(_value204);
    public static final AlertCallbackTag value205 = new AlertCallbackTag(_value205);
    public static final AlertCallbackTag value206 = new AlertCallbackTag(_value206);
    public static final AlertCallbackTag value207 = new AlertCallbackTag(_value207);
    public static final AlertCallbackTag value208 = new AlertCallbackTag(_value208);
    public static final AlertCallbackTag value209 = new AlertCallbackTag(_value209);
    public static final AlertCallbackTag value210 = new AlertCallbackTag(_value210);
    public static final AlertCallbackTag value211 = new AlertCallbackTag(_value211);
    public static final AlertCallbackTag value212 = new AlertCallbackTag(_value212);
    public static final AlertCallbackTag value213 = new AlertCallbackTag(_value213);
    public static final AlertCallbackTag value214 = new AlertCallbackTag(_value214);
    public static final AlertCallbackTag value215 = new AlertCallbackTag(_value215);
    public static final AlertCallbackTag value216 = new AlertCallbackTag(_value216);
    public static final AlertCallbackTag value217 = new AlertCallbackTag(_value217);
    public static final AlertCallbackTag value218 = new AlertCallbackTag(_value218);
    public static final AlertCallbackTag value219 = new AlertCallbackTag(_value219);
    public static final AlertCallbackTag value220 = new AlertCallbackTag(_value220);
    public static final AlertCallbackTag value221 = new AlertCallbackTag(_value221);
    public static final AlertCallbackTag value222 = new AlertCallbackTag(_value222);
    public static final AlertCallbackTag value223 = new AlertCallbackTag(_value223);
    public static final AlertCallbackTag value224 = new AlertCallbackTag(_value224);
    public static final AlertCallbackTag value225 = new AlertCallbackTag(_value225);
    public java.lang.String getValue() { return _value_;}
    public static AlertCallbackTag fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        AlertCallbackTag enumeration = (AlertCallbackTag)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static AlertCallbackTag fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(AlertCallbackTag.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "AlertCallback.Tag"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}

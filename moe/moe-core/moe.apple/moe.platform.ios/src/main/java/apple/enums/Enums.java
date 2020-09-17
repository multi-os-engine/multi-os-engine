/*
Copyright 2014-2016 Intel Corporation

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/

package apple.enums;

import org.moe.natj.general.ann.Generated;

@Generated
public final class Enums {
    @Generated public static final int noErr = 0x00000000;
    @Generated public static final int kNilOptions = 0x00000000;
    @Generated public static final int OSUnknownByteOrder = 0x00000000;
    @Generated public static final int OSLittleEndian = 0x00000001;
    @Generated public static final int OSBigEndian = 0x00000002;
    @Generated public static final int developStage = 0x00000020;
    @Generated public static final int alphaStage = 0x00000040;
    @Generated public static final int betaStage = 0x00000060;
    @Generated public static final int finalStage = 0x00000080;
    @Generated public static final int kUnknownType = 0x3F3F3F3F;
    @Generated public static final int normal = 0x00000000;
    @Generated public static final int bold = 0x00000001;
    @Generated public static final int italic = 0x00000002;
    @Generated public static final int underline = 0x00000004;
    @Generated public static final int outline = 0x00000008;
    @Generated public static final int shadow = 0x00000010;
    @Generated public static final int condense = 0x00000020;
    @Generated public static final int extend = 0x00000040;
    @Generated public static final int kVariableLengthArray = 0x00000001;

    @Generated
    private Enums() {
    }

    @Generated public static final long DISPATCH_WALLTIME_NOW = 0xFFFFFFFFFFFFFFFEL;
    @Generated public static final int kDNSServiceClass_IN = 0x00000001;
    @Generated public static final int kDNSServiceProtocol_IPv4 = 0x00000001;
    @Generated public static final int kDNSServiceProtocol_IPv6 = 0x00000002;
    @Generated public static final int kDNSServiceProtocol_UDP = 0x00000010;
    @Generated public static final int kDNSServiceProtocol_TCP = 0x00000020;
    @Generated public static final int kDNSServiceFlagsMoreComing = 0x00000001;
    @Generated public static final int kDNSServiceFlagsAutoTrigger = 0x00000001;
    @Generated public static final int kDNSServiceFlagsAdd = 0x00000002;
    @Generated public static final int kDNSServiceFlagsDefault = 0x00000004;
    @Generated public static final int kDNSServiceFlagsNoAutoRename = 0x00000008;
    @Generated public static final int kDNSServiceFlagsShared = 0x00000010;
    @Generated public static final int kDNSServiceFlagsUnique = 0x00000020;
    @Generated public static final int kDNSServiceFlagsBrowseDomains = 0x00000040;
    @Generated public static final int kDNSServiceFlagsRegistrationDomains = 0x00000080;
    @Generated public static final int kDNSServiceFlagsLongLivedQuery = 0x00000100;
    @Generated public static final int kDNSServiceFlagsAllowRemoteQuery = 0x00000200;
    @Generated public static final int kDNSServiceFlagsForceMulticast = 0x00000400;
    @Generated public static final int kDNSServiceFlagsForce = 0x00000800;
    @Generated public static final int kDNSServiceFlagsKnownUnique = 0x00000800;
    @Generated public static final int kDNSServiceFlagsReturnIntermediates = 0x00001000;
    @Generated public static final int kDNSServiceFlagsShareConnection = 0x00004000;
    @Generated public static final int kDNSServiceFlagsSuppressUnusable = 0x00008000;
    @Generated public static final int kDNSServiceFlagsTimeout = 0x00010000;
    @Generated public static final int kDNSServiceFlagsIncludeP2P = 0x00020000;
    @Generated public static final int kDNSServiceFlagsWakeOnResolve = 0x00040000;
    @Generated public static final int kDNSServiceFlagsBackgroundTrafficClass = 0x00080000;
    @Generated public static final int kDNSServiceFlagsIncludeAWDL = 0x00100000;
    @Generated public static final int kDNSServiceFlagsValidate = 0x00200000;
    @Generated public static final int kDNSServiceFlagsSecure = 0x00200010;
    @Generated public static final int kDNSServiceFlagsInsecure = 0x00200020;
    @Generated public static final int kDNSServiceFlagsBogus = 0x00200040;
    @Generated public static final int kDNSServiceFlagsIndeterminate = 0x00200080;
    @Generated public static final int kDNSServiceFlagsUnicastResponse = 0x00400000;
    @Generated public static final int kDNSServiceFlagsValidateOptional = 0x00800000;
    @Generated public static final int kDNSServiceFlagsWakeOnlyService = 0x01000000;
    @Generated public static final int kDNSServiceFlagsThresholdOne = 0x02000000;
    @Generated public static final int kDNSServiceFlagsThresholdFinder = 0x04000000;
    @Generated public static final int kDNSServiceFlagsThresholdReached = 0x02000000;
    @Generated public static final int kDNSServiceFlagsPrivateOne = 0x00002000;
    @Generated public static final int kDNSServiceFlagsPrivateTwo = 0x08000000;
    @Generated public static final int kDNSServiceFlagsPrivateThree = 0x10000000;
    @Generated public static final int kDNSServiceFlagsPrivateFour = 0x20000000;
    @Generated public static final int kDNSServiceFlagsPrivateFive = 0x40000000;
    @Generated public static final int kDNSServiceFlagAnsweredFromCache = 0x40000000;
    @Generated public static final int kDNSServiceFlagsAllowExpiredAnswers = 0x80000000;
    @Generated public static final int kDNSServiceFlagsExpiredAnswer = 0x80000000;
    @Generated public static final int kDNSServiceType_A = 0x00000001;
    @Generated public static final int kDNSServiceType_NS = 0x00000002;
    @Generated public static final int kDNSServiceType_MD = 0x00000003;
    @Generated public static final int kDNSServiceType_MF = 0x00000004;
    @Generated public static final int kDNSServiceType_CNAME = 0x00000005;
    @Generated public static final int kDNSServiceType_SOA = 0x00000006;
    @Generated public static final int kDNSServiceType_MB = 0x00000007;
    @Generated public static final int kDNSServiceType_MG = 0x00000008;
    @Generated public static final int kDNSServiceType_MR = 0x00000009;
    @Generated public static final int kDNSServiceType_NULL = 0x0000000A;
    @Generated public static final int kDNSServiceType_WKS = 0x0000000B;
    @Generated public static final int kDNSServiceType_PTR = 0x0000000C;
    @Generated public static final int kDNSServiceType_HINFO = 0x0000000D;
    @Generated public static final int kDNSServiceType_MINFO = 0x0000000E;
    @Generated public static final int kDNSServiceType_MX = 0x0000000F;
    @Generated public static final int kDNSServiceType_TXT = 0x00000010;
    @Generated public static final int kDNSServiceType_RP = 0x00000011;
    @Generated public static final int kDNSServiceType_AFSDB = 0x00000012;
    @Generated public static final int kDNSServiceType_X25 = 0x00000013;
    @Generated public static final int kDNSServiceType_ISDN = 0x00000014;
    @Generated public static final int kDNSServiceType_RT = 0x00000015;
    @Generated public static final int kDNSServiceType_NSAP = 0x00000016;
    @Generated public static final int kDNSServiceType_NSAP_PTR = 0x00000017;
    @Generated public static final int kDNSServiceType_SIG = 0x00000018;
    @Generated public static final int kDNSServiceType_KEY = 0x00000019;
    @Generated public static final int kDNSServiceType_PX = 0x0000001A;
    @Generated public static final int kDNSServiceType_GPOS = 0x0000001B;
    @Generated public static final int kDNSServiceType_AAAA = 0x0000001C;
    @Generated public static final int kDNSServiceType_LOC = 0x0000001D;
    @Generated public static final int kDNSServiceType_NXT = 0x0000001E;
    @Generated public static final int kDNSServiceType_EID = 0x0000001F;
    @Generated public static final int kDNSServiceType_NIMLOC = 0x00000020;
    @Generated public static final int kDNSServiceType_SRV = 0x00000021;
    @Generated public static final int kDNSServiceType_ATMA = 0x00000022;
    @Generated public static final int kDNSServiceType_NAPTR = 0x00000023;
    @Generated public static final int kDNSServiceType_KX = 0x00000024;
    @Generated public static final int kDNSServiceType_CERT = 0x00000025;
    @Generated public static final int kDNSServiceType_A6 = 0x00000026;
    @Generated public static final int kDNSServiceType_DNAME = 0x00000027;
    @Generated public static final int kDNSServiceType_SINK = 0x00000028;
    @Generated public static final int kDNSServiceType_OPT = 0x00000029;
    @Generated public static final int kDNSServiceType_APL = 0x0000002A;
    @Generated public static final int kDNSServiceType_DS = 0x0000002B;
    @Generated public static final int kDNSServiceType_SSHFP = 0x0000002C;
    @Generated public static final int kDNSServiceType_IPSECKEY = 0x0000002D;
    @Generated public static final int kDNSServiceType_RRSIG = 0x0000002E;
    @Generated public static final int kDNSServiceType_NSEC = 0x0000002F;
    @Generated public static final int kDNSServiceType_DNSKEY = 0x00000030;
    @Generated public static final int kDNSServiceType_DHCID = 0x00000031;
    @Generated public static final int kDNSServiceType_NSEC3 = 0x00000032;
    @Generated public static final int kDNSServiceType_NSEC3PARAM = 0x00000033;
    @Generated public static final int kDNSServiceType_HIP = 0x00000037;
    @Generated public static final int kDNSServiceType_SPF = 0x00000063;
    @Generated public static final int kDNSServiceType_UINFO = 0x00000064;
    @Generated public static final int kDNSServiceType_UID = 0x00000065;
    @Generated public static final int kDNSServiceType_GID = 0x00000066;
    @Generated public static final int kDNSServiceType_UNSPEC = 0x00000067;
    @Generated public static final int kDNSServiceType_TKEY = 0x000000F9;
    @Generated public static final int kDNSServiceType_TSIG = 0x000000FA;
    @Generated public static final int kDNSServiceType_IXFR = 0x000000FB;
    @Generated public static final int kDNSServiceType_AXFR = 0x000000FC;
    @Generated public static final int kDNSServiceType_MAILB = 0x000000FD;
    @Generated public static final int kDNSServiceType_MAILA = 0x000000FE;
    @Generated public static final int kDNSServiceType_ANY = 0x000000FF;
    @Generated public static final int kDNSServiceErr_NoError = 0x00000000;
    @Generated public static final int kDNSServiceErr_Unknown = 0xFFFEFFFF;
    @Generated public static final int kDNSServiceErr_NoSuchName = 0xFFFEFFFE;
    @Generated public static final int kDNSServiceErr_NoMemory = 0xFFFEFFFD;
    @Generated public static final int kDNSServiceErr_BadParam = 0xFFFEFFFC;
    @Generated public static final int kDNSServiceErr_BadReference = 0xFFFEFFFB;
    @Generated public static final int kDNSServiceErr_BadState = 0xFFFEFFFA;
    @Generated public static final int kDNSServiceErr_BadFlags = 0xFFFEFFF9;
    @Generated public static final int kDNSServiceErr_Unsupported = 0xFFFEFFF8;
    @Generated public static final int kDNSServiceErr_NotInitialized = 0xFFFEFFF7;
    @Generated public static final int kDNSServiceErr_AlreadyRegistered = 0xFFFEFFF5;
    @Generated public static final int kDNSServiceErr_NameConflict = 0xFFFEFFF4;
    @Generated public static final int kDNSServiceErr_Invalid = 0xFFFEFFF3;
    @Generated public static final int kDNSServiceErr_Firewall = 0xFFFEFFF2;
    @Generated public static final int kDNSServiceErr_Incompatible = 0xFFFEFFF1;
    @Generated public static final int kDNSServiceErr_BadInterfaceIndex = 0xFFFEFFF0;
    @Generated public static final int kDNSServiceErr_Refused = 0xFFFEFFEF;
    @Generated public static final int kDNSServiceErr_NoSuchRecord = 0xFFFEFFEE;
    @Generated public static final int kDNSServiceErr_NoAuth = 0xFFFEFFED;
    @Generated public static final int kDNSServiceErr_NoSuchKey = 0xFFFEFFEC;
    @Generated public static final int kDNSServiceErr_NATTraversal = 0xFFFEFFEB;
    @Generated public static final int kDNSServiceErr_DoubleNAT = 0xFFFEFFEA;
    @Generated public static final int kDNSServiceErr_BadTime = 0xFFFEFFE9;
    @Generated public static final int kDNSServiceErr_BadSig = 0xFFFEFFE8;
    @Generated public static final int kDNSServiceErr_BadKey = 0xFFFEFFE7;
    @Generated public static final int kDNSServiceErr_Transient = 0xFFFEFFE6;
    @Generated public static final int kDNSServiceErr_ServiceNotRunning = 0xFFFEFFE5;
    @Generated public static final int kDNSServiceErr_NATPortMappingUnsupported = 0xFFFEFFE4;
    @Generated public static final int kDNSServiceErr_NATPortMappingDisabled = 0xFFFEFFE3;
    @Generated public static final int kDNSServiceErr_NoRouter = 0xFFFEFFE2;
    @Generated public static final int kDNSServiceErr_PollingMode = 0xFFFEFFE1;
    @Generated public static final int kDNSServiceErr_Timeout = 0xFFFEFFE0;
    @Generated public static final int kDNSServiceErr_DefunctConnection = 0xFFFEFFDF;
    @Generated public static final int kDNSServiceErr_PolicyDenied = 0xFFFEFFDE;
    @Generated public static final int kDNSServiceFlagsEnableDNSSEC = 0x00200000;
    @Generated public static final int kDNSServiceType_SVCB = 0x00000040;
    @Generated public static final int kDNSServiceType_HTTPS = 0x00000041;
}

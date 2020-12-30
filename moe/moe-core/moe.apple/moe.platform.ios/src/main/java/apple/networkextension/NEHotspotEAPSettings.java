package apple.networkextension;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSNumber;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSCopying;
import apple.foundation.protocol.NSSecureCoding;
import apple.security.opaque.SecIdentityRef;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * [@interface] NEHotspotEAPSettings
 * 
 *   NEHotspotEAPSettings class provides a set of properties that are required
 *   to configure a WPA/WPA2 Enterprise or Hotspot 2.0 Wi-Fi networks.
 */
@Generated
@Library("NetworkExtension")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NEHotspotEAPSettings extends NSObject implements NSCopying, NSSecureCoding {
    static {
        NatJ.register();
    }

    @Generated
    protected NEHotspotEAPSettings(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NEHotspotEAPSettings alloc();

    @Generated
    @Selector("allocWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(String key);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(@Mapped(ObjCObjectMapper.class) Object aTarget);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
    public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
            @Mapped(ObjCObjectMapper.class) Object aTarget, SEL aSelector,
            @Mapped(ObjCObjectMapper.class) Object anArgument);

    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @Generated
    @Selector("classForKeyedUnarchiver")
    public static native Class classForKeyedUnarchiver();

    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(VoidPtr zone);

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(NSCoder coder);

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native NEHotspotEAPSettings init();

    @Generated
    @Selector("initWithCoder:")
    public native NEHotspotEAPSettings initWithCoder(NSCoder coder);

    @Generated
    @Selector("instanceMethodForSelector:")
    @FunctionPtr(name = "call_instanceMethodForSelector_ret")
    public static native NSObject.Function_instanceMethodForSelector_ret instanceMethodForSelector(SEL aSelector);

    @Generated
    @Selector("instanceMethodSignatureForSelector:")
    public static native NSMethodSignature instanceMethodSignatureForSelector(SEL aSelector);

    @Generated
    @Selector("instancesRespondToSelector:")
    public static native boolean instancesRespondToSelector(SEL aSelector);

    @Generated
    @Selector("isSubclassOfClass:")
    public static native boolean isSubclassOfClass(Class aClass);

    /**
     * [@property] isTLSClientCertificateRequired
     * 
     * If YES, supports two-factor authentication for EAP-TTLS, PEAP, or EAP-FAST.
     *   If NO, allows for zero-factor authentication for EAP-TLS. The default is YES for EAP-TLS,
     *   and NO for other EAP types.
     */
    @Generated
    @Selector("isTLSClientCertificateRequired")
    public native boolean isTLSClientCertificateRequired();

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

    @Generated
    @Owned
    @Selector("new")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object new_objc();

    /**
     * [@property] outerIdentity
     * 
     * Identity string to be used in EAP-Response/Identity of the outer phase. This key is only
     *   relevant to TTLS, PEAP, and EAP-FAST.
     */
    @Generated
    @Selector("outerIdentity")
    public native String outerIdentity();

    /**
     * [@property] password
     * 
     * The password component of the 802.1X authentication credential.
     *   Length of this property must be between 1 and 64 characters.
     */
    @Generated
    @Selector("password")
    public native String password();

    /**
     * [@property] preferredTLSVersion
     * 
     * TLS version to use during the TLS handshake.
     *   Default value is NEHotspotConfigurationEAPTLSVersion_1_2.
     */
    @Generated
    @Selector("preferredTLSVersion")
    @NInt
    public native long preferredTLSVersion();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * setIdentity
     * 
     * Setter to configure the EAP peer identity. The application needs to store
     * this identity in keychain access group "$(TeamIdentifierPrefix)com.apple.networkextensionsharing".
     * The API uses SecItemCopyMatching to obtain persistent reference for this identity from application's
     * keychain and uses that at the time of EAP authentication.
     * This property is mandatory when EAP-TLS is desired or tlsClientCertificateRequired is set to YES.
     * 
     * @param identity The identity of the EAP Peer. This is a SecIdentityRef object that contains
     * a SecKeyRef object and an associated SecCertificateRef object.
     * @return returns NO if the parameter is not an object of SecIdentityRef type or if the persistent reference
     * is not found in the application's keychain else returns YES.
     */
    @Generated
    @Selector("setIdentity:")
    public native boolean setIdentity(SecIdentityRef identity);

    /**
     * [@property] outerIdentity
     * 
     * Identity string to be used in EAP-Response/Identity of the outer phase. This key is only
     *   relevant to TTLS, PEAP, and EAP-FAST.
     */
    @Generated
    @Selector("setOuterIdentity:")
    public native void setOuterIdentity(String value);

    /**
     * [@property] password
     * 
     * The password component of the 802.1X authentication credential.
     *   Length of this property must be between 1 and 64 characters.
     */
    @Generated
    @Selector("setPassword:")
    public native void setPassword(String value);

    /**
     * [@property] preferredTLSVersion
     * 
     * TLS version to use during the TLS handshake.
     *   Default value is NEHotspotConfigurationEAPTLSVersion_1_2.
     */
    @Generated
    @Selector("setPreferredTLSVersion:")
    public native void setPreferredTLSVersion(@NInt long value);

    /**
     * [@property] supportedEAPTypes
     * 
     * Array of supported EAP Types. Refer to NEHotspotConfigurationEAPType
     *   for valid values.
     */
    @Generated
    @Selector("setSupportedEAPTypes:")
    public native void setSupportedEAPTypes(NSArray<? extends NSNumber> value);

    /**
     * [@property] isTLSClientCertificateRequired
     * 
     * If YES, supports two-factor authentication for EAP-TTLS, PEAP, or EAP-FAST.
     *   If NO, allows for zero-factor authentication for EAP-TLS. The default is YES for EAP-TLS,
     *   and NO for other EAP types.
     */
    @Generated
    @Selector("setTlsClientCertificateRequired:")
    public native void setTlsClientCertificateRequired(boolean value);

    /**
     * setTrustedServerCertificates
     * 
     * Setter to configure an array of trusted server certificates used for trust evaluation of
     * the server certificate.
     * 
     * @param certificates Each value in the array is a SecCertificateRef object. Application needs to store
     * the certificates in keychain access group "$(TeamIdentifierPrefix)com.apple.networkextensionsharing".
     * The API uses SecItemCopyMatching to obtain persistent reference for each certificate from application's
     * keychain and uses that at the time os EAP authentication.
     * Number of elements in the array cannot be more than 10.
     * 
     * @return returns NO if any element in the array is not an object of type SecCertificateRef or if API
     * fails to find persistent reference for each element from the application's keychain else return YES.
     */
    @Generated
    @Selector("setTrustedServerCertificates:")
    public native boolean setTrustedServerCertificates(NSArray<?> certificates);

    /**
     * [@property] trustedServerNames
     * 
     * Array of server certificate common names that will be used to verify server's certificate.
     *   The string could have wildcards to specify the name, such as "*.mycompany.net". If a server presents
     *   a certificate with DNSName or Common Name that isn't in this list, it won't be trusted.
     */
    @Generated
    @Selector("setTrustedServerNames:")
    public native void setTrustedServerNames(NSArray<String> value);

    /**
     * [@property] ttlsInnerAuthentication
     * 
     * Specifies the inner authentication used by the TTLS module.
     *   Possible values are PAP, CHAP, MSCHAP, MSCHAPv2, and EAP. Defaults to EAP.
     */
    @Generated
    @Selector("setTtlsInnerAuthenticationType:")
    public native void setTtlsInnerAuthenticationType(@NInt long value);

    /**
     * [@property] username
     * 
     * A UTF-8 encoded string containing username component of the user authentication
     *   credentials. Length of this property must be between 1 and 253 characters.
     */
    @Generated
    @Selector("setUsername:")
    public native void setUsername(String value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    /**
     * [@property] supportedEAPTypes
     * 
     * Array of supported EAP Types. Refer to NEHotspotConfigurationEAPType
     *   for valid values.
     */
    @Generated
    @Selector("supportedEAPTypes")
    public native NSArray<? extends NSNumber> supportedEAPTypes();

    @Generated
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    /**
     * [@property] trustedServerNames
     * 
     * Array of server certificate common names that will be used to verify server's certificate.
     *   The string could have wildcards to specify the name, such as "*.mycompany.net". If a server presents
     *   a certificate with DNSName or Common Name that isn't in this list, it won't be trusted.
     */
    @Generated
    @Selector("trustedServerNames")
    public native NSArray<String> trustedServerNames();

    /**
     * [@property] ttlsInnerAuthentication
     * 
     * Specifies the inner authentication used by the TTLS module.
     *   Possible values are PAP, CHAP, MSCHAP, MSCHAPv2, and EAP. Defaults to EAP.
     */
    @Generated
    @Selector("ttlsInnerAuthenticationType")
    @NInt
    public native long ttlsInnerAuthenticationType();

    /**
     * [@property] username
     * 
     * A UTF-8 encoded string containing username component of the user authentication
     *   credentials. Length of this property must be between 1 and 253 characters.
     */
    @Generated
    @Selector("username")
    public native String username();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}
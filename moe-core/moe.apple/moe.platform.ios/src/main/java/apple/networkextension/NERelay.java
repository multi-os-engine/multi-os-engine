package apple.networkextension;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSData;
import apple.foundation.NSDictionary;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.NSURL;
import apple.foundation.protocol.NSCopying;
import apple.foundation.protocol.NSSecureCoding;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
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
 * [@interface] NERelay
 * 
 * The NERelay class declares the programmatic interface of an object that
 * manages the details of a relay's configuration, such as authentication and URL details.
 * 
 * Instances of this class are thread safe.
 * 
 * API-Since: 17.0
 */
@Generated
@Library("NetworkExtension")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NERelay extends NSObject implements NSCopying, NSSecureCoding {
    static {
        NatJ.register();
    }

    @Generated
    protected NERelay(Pointer peer) {
        super(peer);
    }

    /**
     * [@property] HTTP2RelayURL
     * 
     * The URL of the relay accessible over HTTP/2.
     */
    @Generated
    @Selector("HTTP2RelayURL")
    @Nullable
    public native NSURL HTTP2RelayURL();

    /**
     * [@property] HTTP3RelayURL
     * 
     * The URL of the relay accessible over HTTP/3.
     */
    @Generated
    @Selector("HTTP3RelayURL")
    @Nullable
    public native NSURL HTTP3RelayURL();

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    /**
     * [@property] additionalHTTPHeaderFields
     * 
     * Additional HTTP header field names and values to be added to all relay requests.
     */
    @Generated
    @Selector("additionalHTTPHeaderFields")
    @NotNull
    public native NSDictionary<String, String> additionalHTTPHeaderFields();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NERelay alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native NERelay allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(
            @Mapped(ObjCObjectMapper.class) @NotNull Object aTarget);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
    public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
            @Mapped(ObjCObjectMapper.class) @NotNull Object aTarget, @NotNull SEL aSelector,
            @Mapped(ObjCObjectMapper.class) @Nullable Object anArgument);

    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    @NotNull
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @Generated
    @Selector("classForKeyedUnarchiver")
    @NotNull
    public static native Class classForKeyedUnarchiver();

    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    @NotNull
    public native Object copyWithZone(@Nullable VoidPtr zone);

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * [@property] dnsOverHTTPSURL
     * 
     * The URL of a DNS-over-HTTPS (DoH) resolver accessible via the relay.
     */
    @Generated
    @Selector("dnsOverHTTPSURL")
    @Nullable
    public native NSURL dnsOverHTTPSURL();

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(@NotNull NSCoder coder);

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    /**
     * [@property] identityData
     * 
     * The PKCS12 data for the relay client authentication. The value is a NSData in PKCS12 format.
     */
    @Generated
    @Selector("identityData")
    @Nullable
    public native NSData identityData();

    /**
     * [@property] identityDataPassword
     * 
     * The password to be used to decrypt the PKCS12 identity data.
     */
    @Generated
    @Selector("identityDataPassword")
    @Nullable
    public native String identityDataPassword();

    @Generated
    @Selector("init")
    public native NERelay init();

    @Generated
    @Selector("initWithCoder:")
    public native NERelay initWithCoder(@NotNull NSCoder coder);

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

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    @NotNull
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    @Generated
    @Owned
    @Selector("new")
    public static native NERelay new_objc();

    /**
     * [@property] rawPublicKeys
     * 
     * TLS 1.3 raw public keys to use to authenticate the relay servers.
     */
    @Generated
    @Selector("rawPublicKeys")
    @Nullable
    public native NSArray<? extends NSData> rawPublicKeys();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * [@property] additionalHTTPHeaderFields
     * 
     * Additional HTTP header field names and values to be added to all relay requests.
     */
    @Generated
    @Selector("setAdditionalHTTPHeaderFields:")
    public native void setAdditionalHTTPHeaderFields(@NotNull NSDictionary<String, String> value);

    /**
     * [@property] dnsOverHTTPSURL
     * 
     * The URL of a DNS-over-HTTPS (DoH) resolver accessible via the relay.
     */
    @Generated
    @Selector("setDnsOverHTTPSURL:")
    public native void setDnsOverHTTPSURL(@Nullable NSURL value);

    /**
     * [@property] HTTP2RelayURL
     * 
     * The URL of the relay accessible over HTTP/2.
     */
    @Generated
    @Selector("setHTTP2RelayURL:")
    public native void setHTTP2RelayURL(@Nullable NSURL value);

    /**
     * [@property] HTTP3RelayURL
     * 
     * The URL of the relay accessible over HTTP/3.
     */
    @Generated
    @Selector("setHTTP3RelayURL:")
    public native void setHTTP3RelayURL(@Nullable NSURL value);

    /**
     * [@property] identityData
     * 
     * The PKCS12 data for the relay client authentication. The value is a NSData in PKCS12 format.
     */
    @Generated
    @Selector("setIdentityData:")
    public native void setIdentityData(@Nullable NSData value);

    /**
     * [@property] identityDataPassword
     * 
     * The password to be used to decrypt the PKCS12 identity data.
     */
    @Generated
    @Selector("setIdentityDataPassword:")
    public native void setIdentityDataPassword(@Nullable String value);

    /**
     * [@property] rawPublicKeys
     * 
     * TLS 1.3 raw public keys to use to authenticate the relay servers.
     */
    @Generated
    @Selector("setRawPublicKeys:")
    public native void setRawPublicKeys(@Nullable NSArray<? extends NSData> value);

    /**
     * [@property] syntheticDNSAnswerIPv4Prefix
     * 
     * An IPv4 address prefix (such as "192.0.2.0/24") that will be used to synthesize
     * DNS answers for apps that use `getaddrinfo()` to resolve domains included in `matchDomains`
     */
    @Generated
    @Selector("setSyntheticDNSAnswerIPv4Prefix:")
    public native void setSyntheticDNSAnswerIPv4Prefix(@Nullable String value);

    /**
     * [@property] syntheticDNSAnswerIPv6Prefix
     * 
     * An IPv6 address prefix (such as "2001:DB8::/32") that will be used to synthesize
     * DNS answers for apps that use `getaddrinfo()` to resolve domains included in `matchDomains`
     */
    @Generated
    @Selector("setSyntheticDNSAnswerIPv6Prefix:")
    public native void setSyntheticDNSAnswerIPv6Prefix(@Nullable String value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    /**
     * [@property] syntheticDNSAnswerIPv4Prefix
     * 
     * An IPv4 address prefix (such as "192.0.2.0/24") that will be used to synthesize
     * DNS answers for apps that use `getaddrinfo()` to resolve domains included in `matchDomains`
     */
    @Generated
    @Selector("syntheticDNSAnswerIPv4Prefix")
    @Nullable
    public native String syntheticDNSAnswerIPv4Prefix();

    /**
     * [@property] syntheticDNSAnswerIPv6Prefix
     * 
     * An IPv6 address prefix (such as "2001:DB8::/32") that will be used to synthesize
     * DNS answers for apps that use `getaddrinfo()` to resolve domains included in `matchDomains`
     */
    @Generated
    @Selector("syntheticDNSAnswerIPv6Prefix")
    @Nullable
    public native String syntheticDNSAnswerIPv6Prefix();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}
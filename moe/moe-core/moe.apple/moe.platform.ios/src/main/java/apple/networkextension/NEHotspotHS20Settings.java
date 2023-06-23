package apple.networkextension;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSCopying;
import apple.foundation.protocol.NSSecureCoding;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * [@interface] NEHotspotHS20Settings
 * 
 * NEHotspotHS20Settings class provides a set of properties that are required
 * to discover and negotiate Hotspot 2.0 Wi-Fi networks.
 * 
 * API-Since: 11.0
 */
@Generated
@Library("NetworkExtension")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NEHotspotHS20Settings extends NSObject implements NSCopying, NSSecureCoding {
    static {
        NatJ.register();
    }

    @Generated
    protected NEHotspotHS20Settings(Pointer peer) {
        super(peer);
    }

    /**
     * [@property] MCCAndMNCs
     * 
     * Array of Mobile Country Code (MCC)/Mobile Network Code (MNC)
     * pairs used for Wi-Fi Hotspot 2.0 negotiation. Each string must contain
     * exactly six digits.
     * 
     * API-Since: 11.0
     */
    @NotNull
    @Generated
    @Selector("MCCAndMNCs")
    public native NSArray<String> MCCAndMNCs();

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NEHotspotHS20Settings alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native NEHotspotHS20Settings allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(
            @NotNull @Mapped(ObjCObjectMapper.class) Object aTarget);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
    public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
            @NotNull @Mapped(ObjCObjectMapper.class) Object aTarget, @NotNull SEL aSelector,
            @Nullable @Mapped(ObjCObjectMapper.class) Object anArgument);

    @NotNull
    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @NotNull
    @Generated
    @Selector("classForKeyedUnarchiver")
    public static native Class classForKeyedUnarchiver();

    @NotNull
    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(@Nullable VoidPtr zone);

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * [@property] domainName
     * 
     * Domain Name of Legacy Hotspot or Hotspot 2.0 Wi-Fi Network.
     * This Domain Name is used for Wi-Fi Hotspot 2.0 negotiation.
     * 
     * API-Since: 11.0
     */
    @NotNull
    @Generated
    @Selector("domainName")
    public native String domainName();

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(@NotNull NSCoder coder);

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native NEHotspotHS20Settings init();

    @Generated
    @Selector("initWithCoder:")
    public native NEHotspotHS20Settings initWithCoder(@NotNull NSCoder coder);

    /**
     * initWithDomainName:roamingEnabled
     * 
     * A designated initializer to instantiate a new NEHotspotHSSettings object.
     * This initializer is used to configure Legacy Hotspot or HS2.0 Wi-Fi Networks.
     * 
     * @param domainName     The domain name of HS2.0 Wi-Fi Network
     * @param roamingEnabled If YES, allows connections to networks of roaming service providers.
     * 
     *                       API-Since: 11.0
     */
    @Generated
    @Selector("initWithDomainName:roamingEnabled:")
    public native NEHotspotHS20Settings initWithDomainNameRoamingEnabled(@NotNull String domainName,
            boolean roamingEnabled);

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

    /**
     * [@property] roamingEnabled
     * 
     * If set to YES, allows connection to networks of roaming service
     * providers. Defaults to NO.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("isRoamingEnabled")
    public native boolean isRoamingEnabled();

    @Generated
    @Selector("isSubclassOfClass:")
    public static native boolean isSubclassOfClass(Class aClass);

    @NotNull
    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    /**
     * [@property] naiRealmNames
     * 
     * Array of Network Access Identifier Realm names used for
     * Wi-Fi Hotspot 2.0 negotiation.
     * 
     * API-Since: 11.0
     */
    @NotNull
    @Generated
    @Selector("naiRealmNames")
    public native NSArray<String> naiRealmNames();

    @Generated
    @Owned
    @Selector("new")
    public static native NEHotspotHS20Settings new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * [@property] roamingConsortiumOIs
     * 
     * Array of Roaming Consortium Organization Identifiers used
     * for Wi-Fi Hotspot 2.0 negotiation.
     * 
     * API-Since: 11.0
     */
    @NotNull
    @Generated
    @Selector("roamingConsortiumOIs")
    public native NSArray<String> roamingConsortiumOIs();

    /**
     * [@property] MCCAndMNCs
     * 
     * Array of Mobile Country Code (MCC)/Mobile Network Code (MNC)
     * pairs used for Wi-Fi Hotspot 2.0 negotiation. Each string must contain
     * exactly six digits.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("setMCCAndMNCs:")
    public native void setMCCAndMNCs(@NotNull NSArray<String> value);

    /**
     * [@property] naiRealmNames
     * 
     * Array of Network Access Identifier Realm names used for
     * Wi-Fi Hotspot 2.0 negotiation.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("setNaiRealmNames:")
    public native void setNaiRealmNames(@NotNull NSArray<String> value);

    /**
     * [@property] roamingConsortiumOIs
     * 
     * Array of Roaming Consortium Organization Identifiers used
     * for Wi-Fi Hotspot 2.0 negotiation.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("setRoamingConsortiumOIs:")
    public native void setRoamingConsortiumOIs(@NotNull NSArray<String> value);

    /**
     * [@property] roamingEnabled
     * 
     * If set to YES, allows connection to networks of roaming service
     * providers. Defaults to NO.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("setRoamingEnabled:")
    public native void setRoamingEnabled(boolean value);

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

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}

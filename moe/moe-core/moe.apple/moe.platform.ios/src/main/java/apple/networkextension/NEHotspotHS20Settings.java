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

/**
 * [@interface] NEHotspotHS20Settings
 * <p>
 * NEHotspotHS20Settings class provides a set of properties that are required
 * to discover and negotiate Hotspot 2.0 Wi-Fi networks.
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
     * <p>
     * Array of Mobile Country Code (MCC)/Mobile Network Code (MNC)
     * pairs used for Wi-Fi Hotspot 2.0 negotiation. Each string must contain
     * exactly six digits.
     */
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

    /**
     * [@property] domainName
     * <p>
     * Domain Name of Legacy Hotspot or Hotspot 2.0 Wi-Fi Network.
     * This Domain Name is used for Wi-Fi Hotspot 2.0 negotiation.
     */
    @Generated
    @Selector("domainName")
    public native String domainName();

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(NSCoder coder);

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native NEHotspotHS20Settings init();

    @Generated
    @Selector("initWithCoder:")
    public native NEHotspotHS20Settings initWithCoder(NSCoder coder);

    /**
     * initWithDomainName:roamingEnabled
     * <p>
     * A designated initializer to instantiate a new NEHotspotHSSettings object.
     * This initializer is used to configure Legacy Hotspot or HS2.0 Wi-Fi Networks.
     *
     * @param domainName     The domain name of HS2.0 Wi-Fi Network
     * @param roamingEnabled If YES, allows connections to networks of roaming service providers.
     */
    @Generated
    @Selector("initWithDomainName:roamingEnabled:")
    public native NEHotspotHS20Settings initWithDomainNameRoamingEnabled(String domainName, boolean roamingEnabled);

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
     * <p>
     * If set to YES, allows connection to networks of roaming service
     * providers. Defaults to NO.
     */
    @Generated
    @Selector("isRoamingEnabled")
    public native boolean isRoamingEnabled();

    @Generated
    @Selector("isSubclassOfClass:")
    public static native boolean isSubclassOfClass(Class aClass);

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

    /**
     * [@property] naiRealmNames
     * <p>
     * Array of Network Access Identifier Realm names used for
     * Wi-Fi Hotspot 2.0 negotiation.
     */
    @Generated
    @Selector("naiRealmNames")
    public native NSArray<String> naiRealmNames();

    @Generated
    @Owned
    @Selector("new")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * [@property] roamingConsortiumOIs
     * <p>
     * Array of Roaming Consortium Organization Identifiers used
     * for Wi-Fi Hotspot 2.0 negotiation.
     */
    @Generated
    @Selector("roamingConsortiumOIs")
    public native NSArray<String> roamingConsortiumOIs();

    /**
     * [@property] MCCAndMNCs
     * <p>
     * Array of Mobile Country Code (MCC)/Mobile Network Code (MNC)
     * pairs used for Wi-Fi Hotspot 2.0 negotiation. Each string must contain
     * exactly six digits.
     */
    @Generated
    @Selector("setMCCAndMNCs:")
    public native void setMCCAndMNCs(NSArray<String> value);

    /**
     * [@property] naiRealmNames
     * <p>
     * Array of Network Access Identifier Realm names used for
     * Wi-Fi Hotspot 2.0 negotiation.
     */
    @Generated
    @Selector("setNaiRealmNames:")
    public native void setNaiRealmNames(NSArray<String> value);

    /**
     * [@property] roamingConsortiumOIs
     * <p>
     * Array of Roaming Consortium Organization Identifiers used
     * for Wi-Fi Hotspot 2.0 negotiation.
     */
    @Generated
    @Selector("setRoamingConsortiumOIs:")
    public native void setRoamingConsortiumOIs(NSArray<String> value);

    /**
     * [@property] roamingEnabled
     * <p>
     * If set to YES, allows connection to networks of roaming service
     * providers. Defaults to NO.
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

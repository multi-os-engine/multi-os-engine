package apple.networkextension;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSNumber;
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
 * [@interface] NEHotspotConfiguration
 * 
 *   The NEHotspotConfiguration class represents set of properties that are required
 *   to configure a Wi-Fi Network.
 */
@Generated
@Library("NetworkExtension")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NEHotspotConfiguration extends NSObject implements NSCopying, NSSecureCoding {
    static {
        NatJ.register();
    }

    @Generated
    protected NEHotspotConfiguration(Pointer peer) {
        super(peer);
    }

    /**
     * [@property] SSID
     * 
     * SSID of the Wi-Fi Network.
     */
    @Generated
    @Selector("SSID")
    public native String SSID();

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NEHotspotConfiguration alloc();

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
    public native NEHotspotConfiguration init();

    @Generated
    @Selector("initWithCoder:")
    public native NEHotspotConfiguration initWithCoder(NSCoder coder);

    /**
     * initWithHS20Settings:eapSettings
     * 
     *   A designated initializer to instantiate a new NEHotspotConfiguration object.
     *   This initializer is used configure HS2.0 Wi-Fi Networks.
     * 
     * @param hs20Settings Hotspot 2.0 configuration
     * @param eapSettings EAP configuration
     */
    @Generated
    @Selector("initWithHS20Settings:eapSettings:")
    public native NEHotspotConfiguration initWithHS20SettingsEapSettings(NEHotspotHS20Settings hs20Settings,
            NEHotspotEAPSettings eapSettings);

    /**
     * initWithSSID:
     * 
     *   A designated initializer to instantiate a new NEHotspotConfiguration object.
     *   This initializer is used to configure open Wi-Fi Networks.
     * 
     * @param SSID The SSID of the Open Wi-Fi Network.
     *   Length of SSID must be between 1 and 32 characters.
     */
    @Generated
    @Selector("initWithSSID:")
    public native NEHotspotConfiguration initWithSSID(String SSID);

    /**
     * initWithSSID:eapSettings
     * 
     *   A designated initializer to instantiate a new NEHotspotConfiguration object.
     *   This initializer is used configure WPA/WPA2 Enterprise Wi-Fi Networks.
     * 
     * @param SSID The SSID of WPA/WPA2 Enterprise Wi-Fi Network
     * @param eapSettings EAP configuration
     */
    @Generated
    @Selector("initWithSSID:eapSettings:")
    public native NEHotspotConfiguration initWithSSIDEapSettings(String SSID, NEHotspotEAPSettings eapSettings);

    /**
     * initWithSSID:passphrase:isWEP
     * 
     *   A designated initializer to instantiate a new NEHotspotConfiguration object.
     *   This initializer is used configure either WEP or WPA/WPA2 Personal Wi-Fi Networks.
     * 
     * @param SSID The SSID of the WEP or WPA/WPA2 Personal Wi-Fi Network
     * @param passphrase The passphrase credential.
     *   For WPA/WPA2 Personal networks: between 8 and 63 characters.
     *   For Static WEP(64bit)  : 10 Hex Digits
     *   For Static WEP(128bit) : 26 Hex Digits
     * @param isWEP YES specifies WEP Wi-Fi Network else WPA/WPA2 Personal Wi-Fi Network
     */
    @Generated
    @Selector("initWithSSID:passphrase:isWEP:")
    public native NEHotspotConfiguration initWithSSIDPassphraseIsWEP(String SSID, String passphrase, boolean isWEP);

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
     * [@property] joinOnce
     * 
     * if set to YES the configuration will not be persisted. Default is NO.
     */
    @Generated
    @Selector("joinOnce")
    public native boolean joinOnce();

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

    /**
     * [@property] lifeTimeInDays
     * 
     * The lifetime of the configuration in days. The configuration is stored for the
     *   number of days specified by this property. The minimum value is 1 day and maximum value is 365 days.
     *   A configuration does not get deleted automatically if this property is not set or set to an invalid value.
     *   This property does not apply to Enterprise and HS2.0 networks.
     */
    @Generated
    @Selector("lifeTimeInDays")
    public native NSNumber lifeTimeInDays();

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
     * [@property] joinOnce
     * 
     * if set to YES the configuration will not be persisted. Default is NO.
     */
    @Generated
    @Selector("setJoinOnce:")
    public native void setJoinOnce(boolean value);

    /**
     * [@property] lifeTimeInDays
     * 
     * The lifetime of the configuration in days. The configuration is stored for the
     *   number of days specified by this property. The minimum value is 1 day and maximum value is 365 days.
     *   A configuration does not get deleted automatically if this property is not set or set to an invalid value.
     *   This property does not apply to Enterprise and HS2.0 networks.
     */
    @Generated
    @Selector("setLifeTimeInDays:")
    public native void setLifeTimeInDays(NSNumber value);

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

    /**
     * [@property] SSIDPrefix
     * 
     * Prefix string of SSID of the Wi-Fi Network.
     */
    @Generated
    @Selector("SSIDPrefix")
    public native String SSIDPrefix();

    /**
     * [@property] hidden
     * 
     * if set to YES the system will perform active scan of the SSID. Default is NO.
     */
    @Generated
    @Selector("hidden")
    public native boolean hidden();

    /**
     * initWithSSIDPrefix:
     * 
     *   A designated initializer to instantiate a new NEHotspotConfiguration object.
     *   This initializer is used to configure open Wi-Fi Networks.
     * 
     * @param SSIDPrefix The prefix string of SSID of the Open Wi-Fi Network.
     *   Length of SSIDPrefix must be between 3 and 32 characters.
     */
    @Generated
    @Selector("initWithSSIDPrefix:")
    public native NEHotspotConfiguration initWithSSIDPrefix(String SSIDPrefix);

    /**
     * initWithSSIDPrefix:passphrase:isWEP
     * 
     *   A designated initializer to instantiate a new NEHotspotConfiguration object.
     *   This initializer is used configure either WEP or WPA/WPA2 Personal Wi-Fi Networks.
     * 
     * @param SSIDPrefix The prefix string of SSID of the WEP or WPA/WPA2 Personal Wi-Fi Network.
     * 	Length of SSIDPrefix must be between 3 and 32 characters.
     * @param passphrase The passphrase credential.
     *   For WPA/WPA2 Personal networks: between 8 and 63 characters.
     *   For Static WEP(64bit)  : 10 Hex Digits
     *   For Static WEP(128bit) : 26 Hex Digits
     * @param isWEP YES specifies WEP Wi-Fi Network else WPA/WPA2 Personal Wi-Fi Network
     */
    @Generated
    @Selector("initWithSSIDPrefix:passphrase:isWEP:")
    public native NEHotspotConfiguration initWithSSIDPrefixPassphraseIsWEP(String SSIDPrefix, String passphrase,
            boolean isWEP);

    /**
     * [@property] hidden
     * 
     * if set to YES the system will perform active scan of the SSID. Default is NO.
     */
    @Generated
    @Selector("setHidden:")
    public native void setHidden(boolean value);
}
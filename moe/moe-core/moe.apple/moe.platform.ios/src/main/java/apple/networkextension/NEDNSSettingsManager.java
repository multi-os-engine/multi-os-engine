package apple.networkextension;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * [@interface] NEDNSSettingsManager
 * <p>
 * The NEDNSSettingsManager class declares the programmatic interface for an object that manages DNS settings configurations.
 * <p>
 * NEDNSSettingsManager declares methods and properties for configuring and controlling DNS settings on the system.
 * <p>
 * Instances of this class are thread safe.
 */
@Generated
@Library("NetworkExtension")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NEDNSSettingsManager extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected NEDNSSettingsManager(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NEDNSSettingsManager alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native NEDNSSettingsManager allocWithZone(VoidPtr zone);

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
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * [@property] dnsSettings
     * <p>
     * An NEDNSSettings object containing the DNS resolver configuration to apply to the system.
     */
    @Generated
    @Selector("dnsSettings")
    public native NEDNSSettings dnsSettings();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native NEDNSSettingsManager init();

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
     * [@property] enabled
     * <p>
     * Checks the enabled status of the DNS settings. DNS settings must be enabled by the user in Settings or System Preferences.
     */
    @Generated
    @Selector("isEnabled")
    public native boolean isEnabled();

    @Generated
    @Selector("isSubclassOfClass:")
    public static native boolean isSubclassOfClass(Class aClass);

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

    /**
     * loadFromPreferencesWithCompletionHandler:
     * <p>
     * This function loads the current DNS settings configuration from the caller's DNS settings preferences.
     *
     * @param completionHandler A block that will be called when the load operation is completed. The NSError passed to this block will be nil if the load operation succeeded, non-nil otherwise.
     */
    @Generated
    @Selector("loadFromPreferencesWithCompletionHandler:")
    public native void loadFromPreferencesWithCompletionHandler(
            @ObjCBlock(name = "call_loadFromPreferencesWithCompletionHandler") Block_loadFromPreferencesWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_loadFromPreferencesWithCompletionHandler {
        @Generated
        void call_loadFromPreferencesWithCompletionHandler(NSError error);
    }

    /**
     * [@property] localizedDescription
     * <p>
     * A string containing a description of the DNS settings.
     */
    @Generated
    @Selector("localizedDescription")
    public native String localizedDescription();

    @Generated
    @Owned
    @Selector("new")
    public static native NEDNSSettingsManager new_objc();

    /**
     * [@property] onDemandRules
     * <p>
     * An array of NEOnDemandRule objects. If nil, the associated DNS settings will always apply. If non-nil, the array describes the networks on which the DNS configuration should take effect or not.
     */
    @Generated
    @Selector("onDemandRules")
    public native NSArray<? extends NEOnDemandRule> onDemandRules();

    /**
     * removeFromPreferencesWithCompletionHandler:
     * <p>
     * This function removes the DNS settings configuration from the caller's DNS settings preferences. If the DNS settings are enabled, the DNS settings becomes disabled.
     *
     * @param completionHandler A block that will be called when the remove operation is completed. The NSError passed to this block will be nil if the remove operation succeeded, non-nil otherwise.
     */
    @Generated
    @Selector("removeFromPreferencesWithCompletionHandler:")
    public native void removeFromPreferencesWithCompletionHandler(
            @ObjCBlock(name = "call_removeFromPreferencesWithCompletionHandler") Block_removeFromPreferencesWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_removeFromPreferencesWithCompletionHandler {
        @Generated
        void call_removeFromPreferencesWithCompletionHandler(NSError error);
    }

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * saveToPreferencesWithCompletionHandler:
     * <p>
     * This function saves the DNS settingsconfiguration in the caller's DNS settings preferences. If the DNS settings are enabled, they will become active.
     *
     * @param completionHandler A block that will be called when the save operation is completed. The NSError passed to this block will be nil if the save operation succeeded, non-nil otherwise.
     */
    @Generated
    @Selector("saveToPreferencesWithCompletionHandler:")
    public native void saveToPreferencesWithCompletionHandler(
            @ObjCBlock(name = "call_saveToPreferencesWithCompletionHandler") Block_saveToPreferencesWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_saveToPreferencesWithCompletionHandler {
        @Generated
        void call_saveToPreferencesWithCompletionHandler(NSError error);
    }

    /**
     * [@property] dnsSettings
     * <p>
     * An NEDNSSettings object containing the DNS resolver configuration to apply to the system.
     */
    @Generated
    @Selector("setDnsSettings:")
    public native void setDnsSettings(NEDNSSettings value);

    /**
     * [@property] localizedDescription
     * <p>
     * A string containing a description of the DNS settings.
     */
    @Generated
    @Selector("setLocalizedDescription:")
    public native void setLocalizedDescription(String value);

    /**
     * [@property] onDemandRules
     * <p>
     * An array of NEOnDemandRule objects. If nil, the associated DNS settings will always apply. If non-nil, the array describes the networks on which the DNS configuration should take effect or not.
     */
    @Generated
    @Selector("setOnDemandRules:")
    public native void setOnDemandRules(NSArray<? extends NEOnDemandRule> value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * sharedManager
     *
     * @return The singleton NEDNSSettingsManager object for the calling process.
     */
    @Generated
    @Selector("sharedManager")
    public static native NEDNSSettingsManager sharedManager();

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}

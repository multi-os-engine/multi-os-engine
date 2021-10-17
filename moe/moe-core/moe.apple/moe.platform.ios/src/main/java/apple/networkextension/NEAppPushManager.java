package apple.networkextension;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSDictionary;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.networkextension.protocol.NEAppPushDelegate;
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
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * [@interface] NEAppPushManager
 * <p>
 * The NEAppPushManager class declares a programmatic interface to configure NEAppPushProvider.
 * <p>
 * NEAppPushManager declares methods and properties for configuring and managing life cycle of app push provider.
 * <p>
 * <p>
 * Instances of this class are thread safe.
 */
@Generated
@Library("NetworkExtension")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NEAppPushManager extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected NEAppPushManager(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NEAppPushManager alloc();

    @Generated
    @Selector("allocWithZone:")
    public static native NEAppPushManager allocWithZone(VoidPtr zone);

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

    /**
     * [@property] delegate
     * <p>
     * An instance of type NEAppPushDelegate that is required to receive incoming call informarion from the provider.
     */
    @Generated
    @Selector("delegate")
    @MappedReturn(ObjCObjectMapper.class)
    public native NEAppPushDelegate delegate();

    @Generated
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native NEAppPushManager init();

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
     * [@property] active
     * <p>
     * If set to YES, it indicates the associated configuration is in use. Use KVO to watch for changes.
     */
    @Generated
    @Selector("isActive")
    public native boolean isActive();

    /**
     * [@property] enabled
     * <p>
     * Toggles the enabled status of the configuration. This property will be set to NO when the same app saves another configuration that overlaps with this configuration.
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
     * loadAllFromPreferencesWithCompletionHandler:
     * <p>
     * This class method asynchronously reads all of the saved configurations and returns them as an array of NEAppPushManager objects.
     *
     * @param completionHandler A block that takes an array of NEAppPushManager objects. The array passed to the block may be empty if no configurations
     *                          were successfully read from the disk. The NSError object passed to this block will be nil if the load operation succeeded, non-nil otherwise.
     */
    @Generated
    @Selector("loadAllFromPreferencesWithCompletionHandler:")
    public static native void loadAllFromPreferencesWithCompletionHandler(
            @ObjCBlock(name = "call_loadAllFromPreferencesWithCompletionHandler") Block_loadAllFromPreferencesWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_loadAllFromPreferencesWithCompletionHandler {
        @Generated
        void call_loadAllFromPreferencesWithCompletionHandler(NSArray<? extends NEAppPushManager> managers,
                NSError error);
    }

    /**
     * loadFromPreferencesWithCompletionHandler:
     * <p>
     * This method loads the saved configuration from the persistent store.
     *
     * @param completionHandler A block that will be called when the load operation is completed. The NSError object passed to this block will be nil if the load operation succeeded, non-nil otherwise.
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
     * A string containing a description of the app push manager.
     */
    @Generated
    @Selector("localizedDescription")
    public native String localizedDescription();

    /**
     * [@property] matchSSIDs
     * <p>
     * An array of Wi-Fi SSID strings. If the SSID string of current Wi-Fi network matches with one of these strings then the NEAppPushProvider
     * is started. The upper limit of number of SSIDs is 10.
     */
    @Generated
    @Selector("matchSSIDs")
    public native NSArray<String> matchSSIDs();

    @Generated
    @Owned
    @Selector("new")
    public static native NEAppPushManager new_objc();

    /**
     * [@property] providerBundleIdentifier
     * <p>
     * A string containing the bundle identifier of the NEAppPushProvider.
     */
    @Generated
    @Selector("providerBundleIdentifier")
    public native String providerBundleIdentifier();

    /**
     * [@property] providerConfiguration
     * <p>
     * A dictionary containing vendor-specific key-value pairs, where the data type of values must be one of the data types supported by property list. Values of user defined data
     * type are not supported. This dictionary is passed as-is to NEAppPushProvider when is it is started or notified for other specified reasons.
     */
    @Generated
    @Selector("providerConfiguration")
    public native NSDictionary<String, ?> providerConfiguration();

    /**
     * removeFromPreferencesWithCompletionHandler:
     * <p>
     * This method removes the configuration from the persistent store.
     *
     * @param completionHandler A block that will be called when the remove operation is completed. The NSError object passed to this block will be nil if the remove operation succeeded, non-nil otherwise.
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
     * This method saves the configuration in the persistent store.
     *
     * @param completionHandler A block that will be called when the save operation is completed. The NSError object passed to this block will be nil if the save operation succeeded, non-nil otherwise.
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
     * [@property] delegate
     * <p>
     * An instance of type NEAppPushDelegate that is required to receive incoming call informarion from the provider.
     */
    @Generated
    @Selector("setDelegate:")
    public native void setDelegate_unsafe(@Mapped(ObjCObjectMapper.class) NEAppPushDelegate value);

    /**
     * [@property] delegate
     * <p>
     * An instance of type NEAppPushDelegate that is required to receive incoming call informarion from the provider.
     */
    @Generated
    public void setDelegate(@Mapped(ObjCObjectMapper.class) NEAppPushDelegate value) {
        Object __old = delegate();
        if (value != null) {
            org.moe.natj.objc.ObjCRuntime.associateObjCObject(this, value);
        }
        setDelegate_unsafe(value);
        if (__old != null) {
            org.moe.natj.objc.ObjCRuntime.dissociateObjCObject(this, __old);
        }
    }

    /**
     * [@property] enabled
     * <p>
     * Toggles the enabled status of the configuration. This property will be set to NO when the same app saves another configuration that overlaps with this configuration.
     */
    @Generated
    @Selector("setEnabled:")
    public native void setEnabled(boolean value);

    /**
     * [@property] localizedDescription
     * <p>
     * A string containing a description of the app push manager.
     */
    @Generated
    @Selector("setLocalizedDescription:")
    public native void setLocalizedDescription(String value);

    /**
     * [@property] matchSSIDs
     * <p>
     * An array of Wi-Fi SSID strings. If the SSID string of current Wi-Fi network matches with one of these strings then the NEAppPushProvider
     * is started. The upper limit of number of SSIDs is 10.
     */
    @Generated
    @Selector("setMatchSSIDs:")
    public native void setMatchSSIDs(NSArray<String> value);

    /**
     * [@property] providerBundleIdentifier
     * <p>
     * A string containing the bundle identifier of the NEAppPushProvider.
     */
    @Generated
    @Selector("setProviderBundleIdentifier:")
    public native void setProviderBundleIdentifier(String value);

    /**
     * [@property] providerConfiguration
     * <p>
     * A dictionary containing vendor-specific key-value pairs, where the data type of values must be one of the data types supported by property list. Values of user defined data
     * type are not supported. This dictionary is passed as-is to NEAppPushProvider when is it is started or notified for other specified reasons.
     */
    @Generated
    @Selector("setProviderConfiguration:")
    public native void setProviderConfiguration(NSDictionary<String, ?> value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * [@property] matchPrivateLTENetworks
     * <p>
     * An array of NEPrivateLTENetwork objects. If the properties of current private LTE network match with properties of one of these NEPrivateLTENetwork objects then the
     * NEAppPushProvider is started. The upper limit of number of private LTE networks is 10. For private LTE networks that are not band 48, the device must be supervised in order to perform the match
     */
    @Generated
    @Selector("matchPrivateLTENetworks")
    public native NSArray<? extends NEPrivateLTENetwork> matchPrivateLTENetworks();

    /**
     * [@property] matchPrivateLTENetworks
     * <p>
     * An array of NEPrivateLTENetwork objects. If the properties of current private LTE network match with properties of one of these NEPrivateLTENetwork objects then the
     * NEAppPushProvider is started. The upper limit of number of private LTE networks is 10. For private LTE networks that are not band 48, the device must be supervised in order to perform the match
     */
    @Generated
    @Selector("setMatchPrivateLTENetworks:")
    public native void setMatchPrivateLTENetworks(NSArray<? extends NEPrivateLTENetwork> value);
}

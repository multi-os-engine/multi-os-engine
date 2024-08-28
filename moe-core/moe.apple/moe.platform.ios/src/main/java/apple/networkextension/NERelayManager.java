package apple.networkextension;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
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
 * [@interface] NERelayManager
 * 
 * The NERelayManager class declares the programmatic interface for an object that manages relay configurations.
 * 
 * NERelayManager declares methods and properties for configuring and controlling relay settings on the system.
 * 
 * Instances of this class are thread safe.
 * 
 * API-Since: 17.0
 */
@Generated
@Library("NetworkExtension")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NERelayManager extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected NERelayManager(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NERelayManager alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native NERelayManager allocWithZone(VoidPtr zone);

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
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * [@property] excludedDomains
     * 
     * An array of strings containing domain names. If the destination host name of a connection shares a suffix with
     * one of these strings then the relay will not be used.
     */
    @Generated
    @Selector("excludedDomains")
    @Nullable
    public native NSArray<String> excludedDomains();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native NERelayManager init();

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
     * 
     * Toggles the enabled status of the relay.
     */
    @Generated
    @Selector("isEnabled")
    public native boolean isEnabled();

    @Generated
    @Selector("isSubclassOfClass:")
    public static native boolean isSubclassOfClass(Class aClass);

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    @NotNull
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    /**
     * loadAllManagersFromPreferencesWithCompletionHandler:
     * 
     * This function asynchronously reads all of the NERelay configurations created by the calling app that have
     * previously been saved to disk and returns them as NERelayManager objects.
     * 
     * @param completionHandler A block that takes an array NERelayManager objects. The array passed to the block may be
     *                          empty if no NERelay configurations were successfully read from the disk. The NSError
     *                          passed to this block will be nil if the load operation succeeded, non-nil otherwise.
     */
    @Generated
    @Selector("loadAllManagersFromPreferencesWithCompletionHandler:")
    public static native void loadAllManagersFromPreferencesWithCompletionHandler(
            @ObjCBlock(name = "call_loadAllManagersFromPreferencesWithCompletionHandler") @NotNull Block_loadAllManagersFromPreferencesWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_loadAllManagersFromPreferencesWithCompletionHandler {
        @Generated
        void call_loadAllManagersFromPreferencesWithCompletionHandler(
                @NotNull NSArray<? extends NERelayManager> managers, @Nullable NSError error);
    }

    /**
     * loadFromPreferencesWithCompletionHandler:
     * 
     * This function loads the current relay configuration from the caller's relay preferences.
     * 
     * @param completionHandler A block that will be called when the load operation is completed. The NSError passed to
     *                          this block will be nil if the load operation succeeded, non-nil otherwise.
     */
    @Generated
    @Selector("loadFromPreferencesWithCompletionHandler:")
    public native void loadFromPreferencesWithCompletionHandler(
            @ObjCBlock(name = "call_loadFromPreferencesWithCompletionHandler") @NotNull Block_loadFromPreferencesWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_loadFromPreferencesWithCompletionHandler {
        @Generated
        void call_loadFromPreferencesWithCompletionHandler(@Nullable NSError error);
    }

    /**
     * [@property] localizedDescription
     * 
     * A string containing a description of the relay.
     */
    @Generated
    @Selector("localizedDescription")
    @Nullable
    public native String localizedDescription();

    /**
     * [@property] matchDomains
     * 
     * An array of strings containing domain names. If this property is non-nil, the relay will only be used to access
     * hosts within the specified domains. If the property is nil, the relay will be used for all domains.
     */
    @Generated
    @Selector("matchDomains")
    @Nullable
    public native NSArray<String> matchDomains();

    @Generated
    @Owned
    @Selector("new")
    public static native NERelayManager new_objc();

    /**
     * [@property] onDemandRules
     * 
     * An array of NEOnDemandRule objects. If nil, the associated relay will always apply. If non-nil, the array
     * describes the networks on which the relay should be used or not.
     */
    @Generated
    @Selector("onDemandRules")
    @Nullable
    public native NSArray<? extends NEOnDemandRule> onDemandRules();

    /**
     * [@property] relays
     * 
     * An array of relay configurations describing one or more relay hops.
     */
    @Generated
    @Selector("relays")
    @Nullable
    public native NSArray<? extends NERelay> relays();

    /**
     * removeFromPreferencesWithCompletionHandler:
     * 
     * This function removes the relay configuration from the caller's relay preferences. If the relay is enabled, the
     * relay becomes disabled.
     * 
     * @param completionHandler A block that will be called when the remove operation is completed. The NSError passed
     *                          to this block will be nil if the remove operation succeeded, non-nil otherwise.
     */
    @Generated
    @Selector("removeFromPreferencesWithCompletionHandler:")
    public native void removeFromPreferencesWithCompletionHandler(
            @ObjCBlock(name = "call_removeFromPreferencesWithCompletionHandler") @NotNull Block_removeFromPreferencesWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_removeFromPreferencesWithCompletionHandler {
        @Generated
        void call_removeFromPreferencesWithCompletionHandler(@Nullable NSError error);
    }

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * saveToPreferencesWithCompletionHandler:
     * 
     * This function saves the relay configuration in the caller's relay preferences. If the relay are enabled, they
     * will become active.
     * 
     * @param completionHandler A block that will be called when the save operation is completed. The NSError passed to
     *                          this block will be nil if the save operation succeeded, non-nil otherwise.
     */
    @Generated
    @Selector("saveToPreferencesWithCompletionHandler:")
    public native void saveToPreferencesWithCompletionHandler(
            @ObjCBlock(name = "call_saveToPreferencesWithCompletionHandler") @NotNull Block_saveToPreferencesWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_saveToPreferencesWithCompletionHandler {
        @Generated
        void call_saveToPreferencesWithCompletionHandler(@Nullable NSError error);
    }

    /**
     * [@property] enabled
     * 
     * Toggles the enabled status of the relay.
     */
    @Generated
    @Selector("setEnabled:")
    public native void setEnabled(boolean value);

    /**
     * [@property] excludedDomains
     * 
     * An array of strings containing domain names. If the destination host name of a connection shares a suffix with
     * one of these strings then the relay will not be used.
     */
    @Generated
    @Selector("setExcludedDomains:")
    public native void setExcludedDomains(@Nullable NSArray<String> value);

    /**
     * [@property] localizedDescription
     * 
     * A string containing a description of the relay.
     */
    @Generated
    @Selector("setLocalizedDescription:")
    public native void setLocalizedDescription(@Nullable String value);

    /**
     * [@property] matchDomains
     * 
     * An array of strings containing domain names. If this property is non-nil, the relay will only be used to access
     * hosts within the specified domains. If the property is nil, the relay will be used for all domains.
     */
    @Generated
    @Selector("setMatchDomains:")
    public native void setMatchDomains(@Nullable NSArray<String> value);

    /**
     * [@property] onDemandRules
     * 
     * An array of NEOnDemandRule objects. If nil, the associated relay will always apply. If non-nil, the array
     * describes the networks on which the relay should be used or not.
     */
    @Generated
    @Selector("setOnDemandRules:")
    public native void setOnDemandRules(@Nullable NSArray<? extends NEOnDemandRule> value);

    /**
     * [@property] relays
     * 
     * An array of relay configurations describing one or more relay hops.
     */
    @Generated
    @Selector("setRelays:")
    public native void setRelays(@Nullable NSArray<? extends NERelay> value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * sharedManager
     * 
     * @return The singleton NERelayManager object for the calling process.
     */
    @Generated
    @Selector("sharedManager")
    @NotNull
    public static native NERelayManager sharedManager();

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}
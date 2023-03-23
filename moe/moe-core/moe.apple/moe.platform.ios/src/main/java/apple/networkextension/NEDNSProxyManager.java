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
 * [@interface] NEDNSProxyManager
 * 
 * The NEDNSProxyManager class declares the programmatic interface for an object that manages DNS proxy configurations.
 * 
 * NEDNSProxyManager declares methods and properties for configuring and controlling a DNS proxy.
 * 
 * Instances of this class are thread safe.
 * 
 * API-Since: 11.0
 */
@Generated
@Library("NetworkExtension")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NEDNSProxyManager extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected NEDNSProxyManager(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NEDNSProxyManager alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native NEDNSProxyManager allocWithZone(VoidPtr zone);

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

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native NEDNSProxyManager init();

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
     * Toggles the enabled status of the DNS proxy. Setting this property will disable DNS proxy configurations of other
     * apps. This property will be set to NO when other DNS proxy configurations are enabled.
     * 
     * API-Since: 11.0
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
     * 
     * This function loads the current DNS proxy configuration from the caller's DNS proxy preferences.
     * 
     * @param completionHandler A block that will be called when the load operation is completed. The NSError passed to
     *                          this block will be nil if the load operation succeeded, non-nil otherwise.
     * 
     *                          API-Since: 11.0
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
     * 
     * A string containing a description of the DNS proxy.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("localizedDescription")
    public native String localizedDescription();

    @Generated
    @Owned
    @Selector("new")
    public static native NEDNSProxyManager new_objc();

    /**
     * [@property] providerProtocol
     * 
     * An NEDNSProxyProviderProtocol object containing the provider-specific portion of the DNS proxy configuration.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("providerProtocol")
    public native NEDNSProxyProviderProtocol providerProtocol();

    /**
     * removeFromPreferencesWithCompletionHandler:
     * 
     * This function removes the DNS proxy configuration from the caller's DNS proxy preferences. If the DNS proxy is
     * enabled, the DNS proxy becomes disabled.
     * 
     * @param completionHandler A block that will be called when the remove operation is completed. The NSError passed
     *                          to this block will be nil if the remove operation succeeded, non-nil otherwise.
     * 
     *                          API-Since: 11.0
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
     * 
     * This function saves the DNS proxy configuration in the caller's DNS proxy preferences. If the DNS proxy is
     * enabled, it will become active.
     * 
     * @param completionHandler A block that will be called when the save operation is completed. The NSError passed to
     *                          this block will be nil if the save operation succeeded, non-nil otherwise.
     * 
     *                          API-Since: 11.0
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
     * [@property] enabled
     * 
     * Toggles the enabled status of the DNS proxy. Setting this property will disable DNS proxy configurations of other
     * apps. This property will be set to NO when other DNS proxy configurations are enabled.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("setEnabled:")
    public native void setEnabled(boolean value);

    /**
     * [@property] localizedDescription
     * 
     * A string containing a description of the DNS proxy.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("setLocalizedDescription:")
    public native void setLocalizedDescription(String value);

    /**
     * [@property] providerProtocol
     * 
     * An NEDNSProxyProviderProtocol object containing the provider-specific portion of the DNS proxy configuration.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("setProviderProtocol:")
    public native void setProviderProtocol(NEDNSProxyProviderProtocol value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * sharedManager
     * 
     * @return The singleton NEDNSProxyManager object for the calling process.
     * 
     *         API-Since: 11.0
     */
    @Generated
    @Selector("sharedManager")
    public static native NEDNSProxyManager sharedManager();

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}

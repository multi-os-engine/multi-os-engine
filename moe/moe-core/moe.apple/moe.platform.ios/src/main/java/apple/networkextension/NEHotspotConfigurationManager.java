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
 * [@interface] NEHotspotConfigurationManager
 * <p>
 * The NEHotspotConfigurationManager class allows an application to
 * Add/Update/Remove Wi-Fi Network Configuraton.
 */
@Generated
@Library("NetworkExtension")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NEHotspotConfigurationManager extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected NEHotspotConfigurationManager(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NEHotspotConfigurationManager alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native NEHotspotConfigurationManager allocWithZone(VoidPtr zone);

    /**
     * applyConfiguration:
     * <p>
     * This function adds or updates a Wi-Fi network configuration.
     *
     * @param configuration     NEHotspotConfiguration object containing the Wi-Fi network configuration.
     * @param completionHandler A block that will be called when add/update operation is completed.
     *                          This could be nil if application does not intend to receive the result.
     *                          The NSError passed to this block will be nil if the configuration is successfully
     *                          stored, non-nil otherwise.
     *                          If the configuration is found invalid or API encounters some other error then
     *                          completionHandler is called
     *                          with instance of NSError containing appropriate error code. This API attempts to join
     *                          the Wi-Fi network
     *                          if the configuration is successfully added or updated and the network is found nearby.
     */
    @Generated
    @Selector("applyConfiguration:completionHandler:")
    public native void applyConfigurationCompletionHandler(NEHotspotConfiguration configuration,
            @ObjCBlock(name = "call_applyConfigurationCompletionHandler") Block_applyConfigurationCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_applyConfigurationCompletionHandler {
        @Generated
        void call_applyConfigurationCompletionHandler(NSError error);
    }

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
     * getConfiguredSSIDsWithCompletionHandler:
     * <p>
     * This function returns array of SSIDs and HS2.0 Domain Names that the calling application has configured.
     * It returns nil if there are no networks configurred by the calling application.
     */
    @Generated
    @Selector("getConfiguredSSIDsWithCompletionHandler:")
    public native void getConfiguredSSIDsWithCompletionHandler(
            @ObjCBlock(name = "call_getConfiguredSSIDsWithCompletionHandler") Block_getConfiguredSSIDsWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_getConfiguredSSIDsWithCompletionHandler {
        @Generated
        void call_getConfiguredSSIDsWithCompletionHandler(NSArray<String> arg0);
    }

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native NEHotspotConfigurationManager init();

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
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

    @Generated
    @Owned
    @Selector("new")
    public static native NEHotspotConfigurationManager new_objc();

    /**
     * removeConfigurationForNetworkName:
     * <p>
     * This function removes Wi-Fi configuration.
     *
     * @param domainName HS2.0 domainName for which the configuration is to be deleted.
     */
    @Generated
    @Selector("removeConfigurationForHS20DomainName:")
    public native void removeConfigurationForHS20DomainName(String domainName);

    /**
     * removeConfigurationForSSID:
     * <p>
     * This function removes Wi-Fi configuration.
     * If the joinOnce property was set to YES, invoking this method will disassociate from the Wi-Fi network
     * after the configuration is removed.
     *
     * @param SSID Wi-Fi SSID for which the configuration is to be deleted.
     */
    @Generated
    @Selector("removeConfigurationForSSID:")
    public native void removeConfigurationForSSID(String SSID);

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("sharedManager")
    public static native NEHotspotConfigurationManager sharedManager();

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}

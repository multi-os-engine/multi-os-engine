package apple.cryptotokenkit;

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
import org.moe.natj.general.ann.ReferenceInfo;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * Provides a centralized management system for registering and unregistering smartcards
 * using their token IDs.
 * 
 * `Registered smartcard` keeps its itself accessible via Keychain and system will automatically
 * invoke an NFC slot when a cryptographic operation is required and asks to provide the registered card.
 * 
 * API-Since: 26.0
 */
@Generated
@Library("CryptoTokenKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class TKSmartCardTokenRegistrationManager extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected TKSmartCardTokenRegistrationManager(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native TKSmartCardTokenRegistrationManager alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native TKSmartCardTokenRegistrationManager allocWithZone(VoidPtr zone);

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

    /**
     * Default instance of registration manager
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("defaultManager")
    @NotNull
    public static native TKSmartCardTokenRegistrationManager defaultManager();

    @Generated
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native TKSmartCardTokenRegistrationManager init();

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
    public static native TKSmartCardTokenRegistrationManager new_objc();

    /**
     * Registers a smartcard with a specific token ID.
     * 
     * In case the same tokenID is already registered, the registration data are overwritten.
     * In case the smartcard with provided tokenID isn't found in the system, failure is returned.
     * 
     * API-Since: 26.0
     * 
     * @param tokenID       ID of the smartcard
     * @param promptMessage Message that will be shown in the presented system UI when an operation with this smartcard
     *                      is requested.
     * @param error         On failure, this parameter is set to error describing the failure. On success, it is set to
     *                      'nil'.
     */
    @Generated
    @Selector("registerSmartCardWithTokenID:promptMessage:error:")
    public native boolean registerSmartCardWithTokenIDPromptMessageError(@NotNull String tokenID,
            @NotNull String promptMessage, @ReferenceInfo(type = NSError.class) @Nullable Ptr<NSError> error);

    /**
     * Returns the tokenIDs of all currently registered smart card tokens
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("registeredSmartCardTokens")
    @NotNull
    public native NSArray<String> registeredSmartCardTokens();

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
    @Selector("superclass")
    public static native Class superclass_static();

    /**
     * Unregisters a smartcard for the provided token ID.
     * 
     * In case the tokenID is not found, failure is returned.
     * 
     * API-Since: 26.0
     * 
     * @param tokenID ID of the smartcard
     * @param error   On failure, this parameter is set to error describing the failure. On success, it is set to 'nil'.
     */
    @Generated
    @Selector("unregisterSmartCardWithTokenID:error:")
    public native boolean unregisterSmartCardWithTokenIDError(@NotNull String tokenID,
            @ReferenceInfo(type = NSError.class) @Nullable Ptr<NSError> error);

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}
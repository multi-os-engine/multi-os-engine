package apple.homekit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.NSURL;
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
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Generated
@Library("HomeKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class HMAddAccessoryRequest extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected HMAddAccessoryRequest(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    /**
     * The category of the accessory to be added.
     */
    @NotNull
    @Generated
    @Selector("accessoryCategory")
    public native HMAccessoryCategory accessoryCategory();

    /**
     * Name of the accessory to be added.
     */
    @NotNull
    @Generated
    @Selector("accessoryName")
    public native String accessoryName();

    @Generated
    @Owned
    @Selector("alloc")
    public static native HMAddAccessoryRequest alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native HMAddAccessoryRequest allocWithZone(VoidPtr zone);

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

    /**
     * Home that the accessory is to be added to.
     */
    @NotNull
    @Generated
    @Selector("home")
    public native HMHome home();

    @Generated
    @Selector("init")
    public native HMAddAccessoryRequest init();

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

    @NotNull
    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    @Generated
    @Owned
    @Selector("new")
    public static native HMAddAccessoryRequest new_objc();

    /**
     * Creates an accessory setup payload with ownership token
     * 
     * This method may fail if this request requires a setup payload URL.
     * 
     * @param ownershipToken The token proving ownership of the accessory being added to the home.
     * 
     * @return Returns an accessory setup payload object if successful or nil on error.
     */
    @Nullable
    @Generated
    @Selector("payloadWithOwnershipToken:")
    public native HMAccessorySetupPayload payloadWithOwnershipToken(@NotNull HMAccessoryOwnershipToken ownershipToken);

    /**
     * Creates an accessory setup payload with URL and ownership token
     * 
     * This method may fail if the setup payload URL is not a valid payload URL.
     * 
     * @param setupPayloadURL The HomeKit setup payload for the accessory being added to the home.
     * 
     * @param ownershipToken  The token proving ownership of the accessory being added to the home.
     * 
     * @return Returns an accessory setup payload object if successful or nil on error.
     */
    @Nullable
    @Generated
    @Selector("payloadWithURL:ownershipToken:")
    public native HMAccessorySetupPayload payloadWithURLOwnershipToken(@NotNull NSURL setupPayloadURL,
            @NotNull HMAccessoryOwnershipToken ownershipToken);

    /**
     * Indication if the ownership token needs to be updated for this request.
     * 
     * API-Since: 13.0
     * Deprecated-Since: 13.0
     * Deprecated-Message: No longer supported
     */
    @Deprecated
    @Generated
    @Selector("requiresOwnershipToken")
    public native boolean requiresOwnershipToken();

    /**
     * Indication if the setup URL needs to be updated for this request. If this is true,
     * payloadWithURL:ownershipToken: must be used to create the HMAccessorySetupPayload.
     */
    @Generated
    @Selector("requiresSetupPayloadURL")
    public native boolean requiresSetupPayloadURL();

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

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}

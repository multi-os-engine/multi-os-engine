package apple.homekit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.NSUUID;
import apple.foundation.protocol.NSCopying;
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
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * API-Since: 15.4
 */
@Generated
@Library("HomeKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class HMAccessorySetupRequest extends NSObject implements NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected HMAccessorySetupRequest(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native HMAccessorySetupRequest alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native HMAccessorySetupRequest allocWithZone(VoidPtr zone);

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

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    /**
     * The -[HMHome uniqueIdentifier] that corresponds to the HMHome that the accessory should be
     * added to when being set up. If nil, then the user will be prompted to choose a home
     */
    @Nullable
    @Generated
    @Selector("homeUniqueIdentifier")
    public native NSUUID homeUniqueIdentifier();

    @Generated
    @Selector("init")
    public native HMAccessorySetupRequest init();

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
    public static native HMAccessorySetupRequest new_objc();

    /**
     * The payload to use for accessory setup
     * [@note] When this is non-nil, the following entitlement is required:
     * com.apple.developer.homekit.allow-setup-payload
     */
    @Nullable
    @Generated
    @Selector("payload")
    public native HMAccessorySetupPayload payload();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * The -[HMHome uniqueIdentifier] that corresponds to the HMHome that the accessory should be
     * added to when being set up. If nil, then the user will be prompted to choose a home
     */
    @Generated
    @Selector("setHomeUniqueIdentifier:")
    public native void setHomeUniqueIdentifier(@Nullable NSUUID value);

    /**
     * The payload to use for accessory setup
     * [@note] When this is non-nil, the following entitlement is required:
     * com.apple.developer.homekit.allow-setup-payload
     */
    @Generated
    @Selector("setPayload:")
    public native void setPayload(@Nullable HMAccessorySetupPayload value);

    /**
     * The name that will be suggested when the user is prompted to name the accessory being set up.
     * If nil, then the suggested name will be taken from the accessory itself
     * [@note] If an accessory bridge is being set up, then this value only applies to the accessory bridge
     * and not any accessories behind the bridge
     */
    @Generated
    @Selector("setSuggestedAccessoryName:")
    public native void setSuggestedAccessoryName(@Nullable String value);

    /**
     * The -[HMRoom uniqueIdentifier] that corresponds to the existing HMRoom that should be
     * suggested when the user is prompted to choose a room to add the accessory to. If nil, then any
     * room may be suggested
     * [@note] This value will be ignored if homeUniqueIdentifier is nil
     */
    @Generated
    @Selector("setSuggestedRoomUniqueIdentifier:")
    public native void setSuggestedRoomUniqueIdentifier(@Nullable NSUUID value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * The name that will be suggested when the user is prompted to name the accessory being set up.
     * If nil, then the suggested name will be taken from the accessory itself
     * [@note] If an accessory bridge is being set up, then this value only applies to the accessory bridge
     * and not any accessories behind the bridge
     */
    @Nullable
    @Generated
    @Selector("suggestedAccessoryName")
    public native String suggestedAccessoryName();

    /**
     * The -[HMRoom uniqueIdentifier] that corresponds to the existing HMRoom that should be
     * suggested when the user is prompted to choose a room to add the accessory to. If nil, then any
     * room may be suggested
     * [@note] This value will be ignored if homeUniqueIdentifier is nil
     */
    @Nullable
    @Generated
    @Selector("suggestedRoomUniqueIdentifier")
    public native NSUUID suggestedRoomUniqueIdentifier();

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}
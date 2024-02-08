package apple.intents;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMeasurement;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.NSUnitVolume;
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

/**
 * API-Since: 13.0
 */
@Generated
@Library("Intents")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class INVolumeResolutionResult extends INIntentResolutionResult {
    static {
        NatJ.register();
    }

    @Generated
    protected INVolumeResolutionResult(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native INVolumeResolutionResult alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native INVolumeResolutionResult allocWithZone(VoidPtr zone);

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
    @Selector("confirmationRequiredWithItemToConfirm:forReason:")
    public static native INVolumeResolutionResult confirmationRequiredWithItemToConfirmForReason(
            @NotNull @Mapped(ObjCObjectMapper.class) Object itemToConfirm, @NInt long reason);

    /**
     * This resolution result is to ask Siri to confirm if this is the volume with which the user wants to continue.
     */
    @NotNull
    @Generated
    @Selector("confirmationRequiredWithVolumeToConfirm:")
    public static native INVolumeResolutionResult confirmationRequiredWithVolumeToConfirm(
            @Nullable NSMeasurement<NSUnitVolume> volumeToConfirm);

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * This resolution result is to ask Siri to disambiguate between the provided volume.
     */
    @NotNull
    @Generated
    @Selector("disambiguationWithVolumeToDisambiguate:")
    public static native INVolumeResolutionResult disambiguationWithVolumeToDisambiguate(
            @NotNull NSArray<? extends NSMeasurement<NSUnitVolume>> volumeToDisambiguate);

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native INVolumeResolutionResult init();

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

    @NotNull
    @Generated
    @Selector("needsValue")
    public static native INVolumeResolutionResult needsValue();

    @Generated
    @Owned
    @Selector("new")
    public static native INVolumeResolutionResult new_objc();

    @NotNull
    @Generated
    @Selector("notRequired")
    public static native INVolumeResolutionResult notRequired();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * This resolution result is for when the app extension wants to tell Siri to proceed, with a given volume. The
     * resolvedVolume can be different than the original volume. This allows app extensions to apply business logic
     * constraints.
     * Use +notRequired to continue with a 'nil' value.
     */
    @NotNull
    @Generated
    @Selector("successWithResolvedVolume:")
    public static native INVolumeResolutionResult successWithResolvedVolume(
            @NotNull NSMeasurement<NSUnitVolume> resolvedVolume);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @NotNull
    @Generated
    @Selector("unsupported")
    public static native INVolumeResolutionResult unsupported();

    @NotNull
    @Generated
    @Selector("unsupportedWithReason:")
    public static native INVolumeResolutionResult unsupportedWithReason(@NInt long reason);

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}

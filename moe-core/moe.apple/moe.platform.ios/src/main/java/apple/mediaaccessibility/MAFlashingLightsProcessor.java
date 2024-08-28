package apple.mediaaccessibility;

import apple.NSObject;
import apple.coregraphics.opaque.IOSurfaceRef;
import apple.foundation.NSArray;
import apple.foundation.NSDictionary;
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
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * API-Since: 17.0
 */
@Generated
@Library("MediaAccessibility")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MAFlashingLightsProcessor extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected MAFlashingLightsProcessor(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MAFlashingLightsProcessor alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native MAFlashingLightsProcessor allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    /**
     * [@function] canProcessSurface:
     * 
     * Determines whether the flashing lights processor is able to process the content in the surface for flashing
     * lights. This might be false on
     * unsupported hardware or unsupported color spaces.
     * 
     * @return A boolean result.
     */
    @Generated
    @Selector("canProcessSurface:")
    public native boolean canProcessSurface(@NotNull IOSurfaceRef surface);

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

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native MAFlashingLightsProcessor init();

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
    public static native MAFlashingLightsProcessor new_objc();

    /**
     * [@function] processSurface:outSurface:timestamp:options:
     * 
     * Processes an inSurface by analyzing pixels for sequences of flashing lights and then darkens content to reduce
     * the risk of discomfort from some users.
     * The outSurface will contain the mitigated content.
     * The timestamp indicates the time at which the surface will be shown in the video playback. FPS will be determined
     * based on the values of the timestamps.
     * Options dictionary for additional parameters.
     * 
     * @return An object which indicates whether the surface was able to be processed, the amount of mitigation that was
     *         applied, and the intensitry level that was detected.
     */
    @Generated
    @Selector("processSurface:outSurface:timestamp:options:")
    @NotNull
    public native MAFlashingLightsProcessorResult processSurfaceOutSurfaceTimestampOptions(
            @NotNull IOSurfaceRef inSurface, @NotNull IOSurfaceRef outSurface, double timestamp,
            @Nullable NSDictionary<String, ?> options);

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
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}
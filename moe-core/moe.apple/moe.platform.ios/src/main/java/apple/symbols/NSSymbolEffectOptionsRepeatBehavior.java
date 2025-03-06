package apple.symbols;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSCopying;
import apple.foundation.protocol.NSSecureCoding;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
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
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * The behavior of repetition to use when a symbol effect is animating.
 * 
 * API-Since: 18.0
 */
@Generated
@Library("Symbols")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSSymbolEffectOptionsRepeatBehavior extends NSObject implements NSCopying, NSSecureCoding {
    static {
        NatJ.register();
    }

    @Generated
    protected NSSymbolEffectOptionsRepeatBehavior(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSSymbolEffectOptionsRepeatBehavior alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native NSSymbolEffectOptionsRepeatBehavior allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    /**
     * Creates and returns a repeat behavior that prefers to repeat indefinitely,
     * using continuous animations if available.
     * Continuous animations have an intro, a body that runs as long as the effect is enabled, and an outro.
     * If available these animations provide a smoother animation when an effect repeats indefinitely.
     * 
     * - Returns: A new behavior that prefers to repeat indefinitely with continuous animations.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("behaviorContinuous")
    public static native NSSymbolEffectOptionsRepeatBehavior behaviorContinuous();

    /**
     * Creates and returns a repeat behavior that prefers to repeat indefinitely using periodic animations.
     * Periodic animations play the effect at regular intervals starting and stopping each time.
     * 
     * - Returns: A new behavior that prefers to repeat indefinitely using periodic animations.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("behaviorPeriodic")
    public static native NSSymbolEffectOptionsRepeatBehavior behaviorPeriodic();

    /**
     * Creates and returns a repeat behavior with a preferred play count using periodic animations.
     * Periodic animations play the effect at regular intervals starting and stopping each time.
     * 
     * - Parameter count: The preferred number of times to play the
     * effect. Very
     * large or small values may be clamped.
     * 
     * - Returns: A new behavior with the preferred
     * play count using periodic animations.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("behaviorPeriodicWithCount:")
    public static native NSSymbolEffectOptionsRepeatBehavior behaviorPeriodicWithCount(@NInt long count);

    /**
     * Creates and returns a repeat behavior with a preferred play count and delay using periodic animations.
     * Periodic animations play the effect at regular intervals starting and stopping each time.
     * 
     * - Parameter count: The preferred number of times to play the
     * effect. Very
     * large or small values may be clamped.
     * 
     * - Parameter delay: The preferred delay between repetitions,
     * in seconds.
     * 
     * - Returns: A new behavior with the preferred
     * play count and delay using periodic animations.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("behaviorPeriodicWithCount:delay:")
    public static native NSSymbolEffectOptionsRepeatBehavior behaviorPeriodicWithCountDelay(@NInt long count,
            double delay);

    /**
     * Creates and returns a repeat behavior with a preferred repeat delay using periodic animations.
     * Periodic animations play the effect at regular intervals starting and stopping each time.
     * 
     * - Parameter delay: The preferred delay between repetitions,
     * in seconds.
     * 
     * - Returns: A new behavior that prefers to repeat indefinitely
     * with a specified delay using periodic animations.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("behaviorPeriodicWithDelay:")
    public static native NSSymbolEffectOptionsRepeatBehavior behaviorPeriodicWithDelay(double delay);

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
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    @NotNull
    public native Object copyWithZone(@Nullable VoidPtr zone);

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(@NotNull NSCoder coder);

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native NSSymbolEffectOptionsRepeatBehavior init();

    @Generated
    @Selector("initWithCoder:")
    public native NSSymbolEffectOptionsRepeatBehavior initWithCoder(@NotNull NSCoder coder);

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
    public static native NSSymbolEffectOptionsRepeatBehavior new_objc();

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
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}
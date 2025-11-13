package apple.avfoundation;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.NSValue;
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
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * Represents a metric event when variant switch was attempted.
 * 
 * Subclasses of this type that are used from Swift must fulfill the requirements of a Sendable type.
 * 
 * API-Since: 18.0
 */
@Generated
@Library("AVFoundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class AVMetricPlayerItemVariantSwitchStartEvent extends AVMetricEvent {
    static {
        NatJ.register();
    }

    @Generated
    protected AVMetricPlayerItemVariantSwitchStartEvent(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native AVMetricPlayerItemVariantSwitchStartEvent alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native AVMetricPlayerItemVariantSwitchStartEvent allocWithZone(VoidPtr zone);

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
     * Returns the variant from which the switch is attempted. If no value is available, returns nil
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("fromVariant")
    @Nullable
    public native AVAssetVariant fromVariant();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native AVMetricPlayerItemVariantSwitchStartEvent init();

    @Generated
    @Selector("initWithCoder:")
    public native AVMetricPlayerItemVariantSwitchStartEvent initWithCoder(@NotNull NSCoder coder);

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

    /**
     * This property provides a collection of time ranges for which the player has the media data readily available. The
     * ranges provided might be discontinuous.
     * 
     * Returns an NSArray of NSValues containing CMTimeRanges.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("loadedTimeRanges")
    @NotNull
    public native NSArray<? extends NSValue> loadedTimeRanges();

    @Generated
    @Owned
    @Selector("new")
    public static native AVMetricPlayerItemVariantSwitchStartEvent new_objc();

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

    /**
     * Returns the variant to which the switch is attempted.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("toVariant")
    @NotNull
    public native AVAssetVariant toVariant();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * [@property] audioRendition
     * 
     * Contains information corresponding to the currently selected audio rendition.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("audioRendition")
    @NotNull
    public native AVMetricMediaRendition audioRendition();

    /**
     * [@property] subtitleRendition
     * 
     * Contains information corresponding to the currently selected subtitle rendition.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("subtitleRendition")
    @NotNull
    public native AVMetricMediaRendition subtitleRendition();

    /**
     * [@property] videoRendition
     * 
     * Contains information corresponding to the currently selected video rendition.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("videoRendition")
    @NotNull
    public native AVMetricMediaRendition videoRendition();
}
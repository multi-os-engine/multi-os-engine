package apple.avfoundation;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.NSURL;
import apple.foundation.struct.NSRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
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
 * AVMetricHLSMediaSegmentRequestEvent
 * 
 * Represents a metric event associated with a HLS media segment resource request.
 * 
 * Subclasses of this type that are used from Swift must fulfill the requirements of a Sendable type.
 * 
 * API-Since: 18.0
 */
@Generated
@Library("AVFoundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class AVMetricHLSMediaSegmentRequestEvent extends AVMetricEvent {
    static {
        NatJ.register();
    }

    @Generated
    protected AVMetricHLSMediaSegmentRequestEvent(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native AVMetricHLSMediaSegmentRequestEvent alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native AVMetricHLSMediaSegmentRequestEvent allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    /**
     * [@property] byteRange
     * 
     * Returns the byte range for the media segment. If not available, the range start and end will be 0.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("byteRange")
    @ByValue
    public native NSRange byteRange();

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

    /**
     * [@property] indexFileURL
     * 
     * Returns the URL of the index file in which this segment was declared. If not available, returns nil.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("indexFileURL")
    @NotNull
    public native NSURL indexFileURL();

    @Generated
    @Selector("init")
    public native AVMetricHLSMediaSegmentRequestEvent init();

    @Generated
    @Selector("initWithCoder:")
    public native AVMetricHLSMediaSegmentRequestEvent initWithCoder(@NotNull NSCoder coder);

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
     * [@property] isMapSegment
     * 
     * Returns true if the media segment request is for a map segment.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("isMapSegment")
    public native boolean isMapSegment();

    @Generated
    @Selector("isSubclassOfClass:")
    public static native boolean isSubclassOfClass(Class aClass);

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    @NotNull
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    /**
     * [@property] mediaResourceRequestEvent
     * 
     * Returns the media resource request event which was used to satisfy the media segment.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("mediaResourceRequestEvent")
    @Nullable
    public native AVMetricMediaResourceRequestEvent mediaResourceRequestEvent();

    /**
     * [@property] mediaType
     * 
     * Returns the media type. If the value cannot be determined, returns AVMediaTypeMuxed.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("mediaType")
    @NotNull
    public native String mediaType();

    @Generated
    @Owned
    @Selector("new")
    public static native AVMetricHLSMediaSegmentRequestEvent new_objc();

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
     * [@property] url
     * 
     * Returns the URL of the media segment. If no value is available, returns nil.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("url")
    @Nullable
    public native NSURL url();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}
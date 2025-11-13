package apple.avfoundation;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSDate;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.NSURL;
import apple.foundation.NSURLSessionTaskMetrics;
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
 * Represents a metric event associated with media resource requests.
 * 
 * Subclasses of this type that are used from Swift must fulfill the requirements of a Sendable type.
 * 
 * API-Since: 18.0
 */
@Generated
@Library("AVFoundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class AVMetricMediaResourceRequestEvent extends AVMetricEvent {
    static {
        NatJ.register();
    }

    @Generated
    protected AVMetricMediaResourceRequestEvent(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native AVMetricMediaResourceRequestEvent alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native AVMetricMediaResourceRequestEvent allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    /**
     * Returns the byte range downloaded for the resource request. If not available, the range start and end will be 0.
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

    /**
     * Returns the error event, if any, encountered during the resource request. If no value is present, returns nil.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("errorEvent")
    @Nullable
    public native AVMetricErrorEvent errorEvent();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native AVMetricMediaResourceRequestEvent init();

    @Generated
    @Selector("initWithCoder:")
    public native AVMetricMediaResourceRequestEvent initWithCoder(@NotNull NSCoder coder);

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
     * Returns the NSURLSessionTaskMetrics associated with the resource request. If no value is present, returns nil
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("networkTransactionMetrics")
    @Nullable
    public native NSURLSessionTaskMetrics networkTransactionMetrics();

    @Generated
    @Owned
    @Selector("new")
    public static native AVMetricMediaResourceRequestEvent new_objc();

    /**
     * Returns the end time of the resource request.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("requestEndTime")
    @NotNull
    public native NSDate requestEndTime();

    /**
     * Returns the start time of the resource request.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("requestStartTime")
    @NotNull
    public native NSDate requestStartTime();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * Returns the end time of the resource request response.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("responseEndTime")
    @NotNull
    public native NSDate responseEndTime();

    /**
     * Returns the start time of the resource request response.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("responseStartTime")
    @NotNull
    public native NSDate responseStartTime();

    /**
     * The IP address of the server. If not available, the value is nil.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("serverAddress")
    @Nullable
    public native String serverAddress();

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
     * Returns the URL of the resource request. If no value is available, returns nil.
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

    /**
     * Returns true if the resource was read from the cache.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("wasReadFromCache")
    public native boolean wasReadFromCache();
}
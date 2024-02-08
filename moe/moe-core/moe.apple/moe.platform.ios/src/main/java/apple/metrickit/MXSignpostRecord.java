package apple.metrickit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSData;
import apple.foundation.NSDate;
import apple.foundation.NSDictionary;
import apple.foundation.NSMeasurement;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.NSUnitDuration;
import apple.foundation.protocol.NSSecureCoding;
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
 * MXSignpostRecord
 * 
 * A class that represents a record of signpost instance.
 * 
 * Signpost instances are either Signpost intervals or events and MXSignpostRecord captures information reagarding such
 * signpost instances
 * 
 * API-Since: 17.0
 */
@Generated
@Library("MetricKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MXSignpostRecord extends NSObject implements NSSecureCoding {
    static {
        NatJ.register();
    }

    @Generated
    protected MXSignpostRecord(Pointer peer) {
        super(peer);
    }

    /**
     * JSONRepresentation
     * 
     * Convenience method to return a JSON representation of this SignpostRecord.
     * 
     * @return An NSData object containing the JSON representation
     */
    @Generated
    @Selector("JSONRepresentation")
    @NotNull
    public native NSData JSONRepresentation();

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MXSignpostRecord alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native MXSignpostRecord allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    /**
     * [@property] beginTimeStamp
     * 
     * An NSDate representation of the begin time stamp of the signpost instance.
     */
    @Generated
    @Selector("beginTimeStamp")
    @NotNull
    public native NSDate beginTimeStamp();

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(
            @Mapped(ObjCObjectMapper.class) @NotNull Object aTarget);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
    public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
            @Mapped(ObjCObjectMapper.class) @NotNull Object aTarget, @NotNull SEL aSelector,
            @Mapped(ObjCObjectMapper.class) @Nullable Object anArgument);

    /**
     * [@property] category
     * 
     * An NSString representation of the category of the signpost instance.
     */
    @Generated
    @Selector("category")
    @NotNull
    public native String category();

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
     * dictionaryRepresentation
     * 
     * Convenience method to return a NSDictionary representation of this SignpostRecord.
     * 
     * @return An NSDictionary object containing the dictionary representation
     */
    @Generated
    @Selector("dictionaryRepresentation")
    @NotNull
    public native NSDictionary<?, ?> dictionaryRepresentation();

    /**
     * [@property] duration
     * 
     * An NSMeasurement representing the duration in milliseconds of signpost instances which are intervals and will be
     * nil for signpost events.
     */
    @Generated
    @Selector("duration")
    @Nullable
    public native NSMeasurement<NSUnitDuration> duration();

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(@NotNull NSCoder coder);

    /**
     * [@property] endTimeStamp
     * 
     * An NSDate representation of the end time stamp of the signpost instances which are intervals and will be nil for
     * signpost events.
     */
    @Generated
    @Selector("endTimeStamp")
    @Nullable
    public native NSDate endTimeStamp();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native MXSignpostRecord init();

    @Generated
    @Selector("initWithCoder:")
    public native MXSignpostRecord initWithCoder(@NotNull NSCoder coder);

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
     * [@property] isInterval
     * 
     * A BOOL denoting whether the signpost instance is an interval or not..
     */
    @Generated
    @Selector("isInterval")
    public native boolean isInterval();

    @Generated
    @Selector("isSubclassOfClass:")
    public static native boolean isSubclassOfClass(Class aClass);

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    @NotNull
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    /**
     * [@property] name
     * 
     * An NSString representation of the name of the signpost instance.
     */
    @Generated
    @Selector("name")
    @NotNull
    public native String name();

    @Generated
    @Owned
    @Selector("new")
    public static native MXSignpostRecord new_objc();

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
     * [@property] subsystem
     * 
     * An NSString representation of the subsystem of the signpost instance.
     */
    @Generated
    @Selector("subsystem")
    @NotNull
    public native String subsystem();

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
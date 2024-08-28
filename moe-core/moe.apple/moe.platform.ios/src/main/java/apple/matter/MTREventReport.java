package apple.matter;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSDate;
import apple.foundation.NSDictionary;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSNumber;
import apple.foundation.NSSet;
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

@Generated
@Library("Matter")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MTREventReport extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected MTREventReport(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MTREventReport alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native MTREventReport allocWithZone(VoidPtr zone);

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
     * If this specific path resulted in an error, the error (in the
     * MTRInteractionErrorDomain or MTRErrorDomain) that corresponds to this
     * path.
     */
    @Generated
    @Selector("error")
    @Nullable
    public native NSError error();

    /**
     * EventNumber type (uint64_t)
     */
    @Generated
    @Selector("eventNumber")
    @NotNull
    public native NSNumber eventNumber();

    /**
     * Either systemUpTime or timestampDate will be valid depending on
     * eventTimeType, if "error" is nil. If "error" is not nil, none of
     * eventTimeType, systemUpTime, timestampDate should be expected to have useful
     * values.
     * 
     * API-Since: 16.5
     */
    @Generated
    @Selector("eventTimeType")
    @NUInt
    public native long eventTimeType();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native MTREventReport init();

    /**
     * Initialize an MTREventReport with a response-value dictionary of the sort
     * that MTRDeviceResponseHandler would receive.
     * 
     * Will return nil and hand out an error if the response-value dictionary is not
     * an event response.
     * 
     * Will set the value property to nil and the error property to non-nil, even if
     * the schema for the value is not known, if the response-value is an error, not
     * data.
     * 
     * Will return nil and hand out an error if the response-value is data in the
     * following cases:
     * 
     * * The response is for a cluster/event combination for which the schema is
     * unknown and hence the type of the data is not known.
     * * The data does not match the known schema.
     * 
     * API-Since: 17.0
     */
    @Generated
    @Selector("initWithResponseValue:error:")
    public native MTREventReport initWithResponseValueError(@NotNull NSDictionary<String, ?> responseValue,
            @ReferenceInfo(type = NSError.class) @Nullable Ptr<NSError> error);

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
    public static native MTREventReport new_objc();

    @Generated
    @Selector("path")
    @NotNull
    public native MTREventPath path();

    /**
     * PriorityLevel type (MTREventPriority)
     */
    @Generated
    @Selector("priority")
    @NotNull
    public native NSNumber priority();

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
     * API-Since: 16.5
     */
    @Generated
    @Selector("systemUpTime")
    public native double systemUpTime();

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.5
     * Deprecated-Message: Please use timestampDate and systemUpTime
     */
    @Generated
    @Deprecated
    @Selector("timestamp")
    @NotNull
    public native NSNumber timestamp();

    /**
     * API-Since: 16.5
     */
    @Generated
    @Selector("timestampDate")
    @Nullable
    public native NSDate timestampDate();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();

    /**
     * An instance of the event payload interface that corresponds to the report's
     * path (e.g. MTRBasicInformationClusterStartUpEvent if the path's cluster
     * 0x0028 "Basic Information" and the path's event is 0x00 "StartUp"), or nil if
     * error is not nil (in which case there is no payload available).
     */
    @Generated
    @Selector("value")
    @MappedReturn(ObjCObjectMapper.class)
    @Nullable
    public native Object value();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}
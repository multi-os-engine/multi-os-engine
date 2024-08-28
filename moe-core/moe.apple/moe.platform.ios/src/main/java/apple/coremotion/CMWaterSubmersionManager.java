package apple.coremotion;

import apple.NSObject;
import apple.coremotion.protocol.CMWaterSubmersionManagerDelegate;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
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
import apple.foundation.NSMeasurement;
import apple.foundation.NSUnitLength;

/**
 * CMWaterSubmersionManager
 * 
 * Discussion:
 * API to retrieve values related to device state with respect to water
 * submersion and measurements updates when device is submerged.
 * 
 * API-Since: 16.0
 */
@Generated
@Library("CoreMotion")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class CMWaterSubmersionManager extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected CMWaterSubmersionManager(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native CMWaterSubmersionManager alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native CMWaterSubmersionManager allocWithZone(VoidPtr zone);

    /**
     * authorizationStatus
     * 
     * Discussion:
     * Checks to see if the client is authorized to use this API via TCC
     * under Motion & Fitness.
     */
    @Generated
    @Selector("authorizationStatus")
    @NInt
    public static native long authorizationStatus();

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

    /**
     * delegate
     * 
     * Discussion:
     * The delegate object to receive event and measurements updates.
     * Setting of the delegate will invoke TCC, and updates are subject
     * to client being authorized. By setting the delegate to a non-nil value,
     * start event and measurement updates. Setting the delegate to nil will
     * stop all updates.
     */
    @Nullable
    @Generated
    @Selector("delegate")
    @MappedReturn(ObjCObjectMapper.class)
    public native CMWaterSubmersionManagerDelegate delegate();

    @Generated
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native CMWaterSubmersionManager init();

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
    public static native CMWaterSubmersionManager new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * delegate
     * 
     * Discussion:
     * The delegate object to receive event and measurements updates.
     * Setting of the delegate will invoke TCC, and updates are subject
     * to client being authorized. By setting the delegate to a non-nil value,
     * start event and measurement updates. Setting the delegate to nil will
     * stop all updates.
     */
    @Generated
    @Selector("setDelegate:")
    public native void setDelegate_unsafe(
            @Nullable @Mapped(ObjCObjectMapper.class) CMWaterSubmersionManagerDelegate value);

    /**
     * delegate
     * 
     * Discussion:
     * The delegate object to receive event and measurements updates.
     * Setting of the delegate will invoke TCC, and updates are subject
     * to client being authorized. By setting the delegate to a non-nil value,
     * start event and measurement updates. Setting the delegate to nil will
     * stop all updates.
     */
    @Generated
    public void setDelegate(@Nullable @Mapped(ObjCObjectMapper.class) CMWaterSubmersionManagerDelegate value) {
        Object __old = delegate();
        if (value != null) {
            org.moe.natj.objc.ObjCRuntime.associateObjCObject(this, value);
        }
        setDelegate_unsafe(value);
        if (__old != null) {
            org.moe.natj.objc.ObjCRuntime.dissociateObjCObject(this, __old);
        }
    }

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

    /**
     * waterSubmersionAvailable
     * 
     * Discussion:
     * Determines whether this feature is available on the current platform.
     */
    @Generated
    @Selector("waterSubmersionAvailable")
    public static native boolean waterSubmersionAvailable();

    /**
     * maximumDepth
     * 
     * Discussion:
     * Returns the maximum depth threshold that this client is authorized to
     * receive. This is the threshold at which the API will change state
     * to CMWaterSubmersionDepthStatePastMaxDepth. The API will continue
     * to vend data until CMWaterSubmersionDepthStateSensorDepthError, 10%
     * above this threshold.
     * 
     * Returns nil if client is not authorized for submersion data.
     */
    @Generated
    @Selector("maximumDepth")
    @Nullable
    public native NSMeasurement<NSUnitLength> maximumDepth();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
package apple.metrickit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.metrickit.protocol.MXMetricManagerSubscriber;
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

/**
 * MXMetricManager
 * 
 * An instance of this class can be used to retrieve periodic, aggregated power and performance metrics.
 * 
 * To receive metrics, clients must acquire a reference to the shared instance of the metric manager and add an eligible MXMetricManagerSubscriber.
 * 
 * Metrics are not guaranteed to be delivered, but can be expected atleast once per day when conditions permit.
 * 
 * Subscribers to the metric manager can remove themselves using removeSubscriber:subscriber if they no longer wish to receive metrics.
 */
@Generated
@Library("MetricKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MXMetricManager extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected MXMetricManager(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    /**
     * addSubscriber:subscriber
     * 
     * Adds a subscriber to the metric manager.
     * 
     * Subscribers can receive metric payloads by conforming to the MXMetricManagerSubscriber protocol.
     * 
     * @param         subscriber An object that conforms to the MXMetricManagerSubscriber protocol.
     */
    @Generated
    @Selector("addSubscriber:")
    public native void addSubscriber(@Mapped(ObjCObjectMapper.class) MXMetricManagerSubscriber subscriber);

    @Generated
    @Owned
    @Selector("alloc")
    public static native MXMetricManager alloc();

    @Generated
    @Selector("allocWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(String key);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(@Mapped(ObjCObjectMapper.class) Object aTarget);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
    public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
            @Mapped(ObjCObjectMapper.class) Object aTarget, SEL aSelector,
            @Mapped(ObjCObjectMapper.class) Object anArgument);

    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @Generated
    @Selector("classForKeyedUnarchiver")
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
    public native MXMetricManager init();

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
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

    /**
     * makeLogHandleWithCategory:category
     * 
     * Retrieve a log handle for flagging critical sections with os_signpost().
     * 
     * The log handle configures persistence for any signposts emit while using the log handle.
     * 
     * @param         category A string used to define a log category
     * @return        A log handle that can be used with the logging framework.
     */
    @Generated
    @Selector("makeLogHandleWithCategory:")
    public static native NSObject makeLogHandleWithCategory(String category);

    @Generated
    @Owned
    @Selector("new")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object new_objc();

    /**
     * [@property]      pastPayloads
     * 
     * A list of past metric payloads received.
     */
    @Generated
    @Selector("pastPayloads")
    public native NSArray<? extends MXMetricPayload> pastPayloads();

    /**
     * removeSubscriber:subscriber
     * 
     * Removes a subscriber from the metric manager.
     * 
     * The subscriber indicated, if previously registered, will no longer receive metric payloads.
     * 
     * @param         subscriber An object that conforms to the MXMetricManagerSubscriber protocol.
     */
    @Generated
    @Selector("removeSubscriber:")
    public native void removeSubscriber(@Mapped(ObjCObjectMapper.class) MXMetricManagerSubscriber subscriber);

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
     * [@property]      sharedManager
     * 
     * Singleton instance of MXMetricManager.
     */
    @Generated
    @Selector("sharedManager")
    public static native MXMetricManager sharedManager();

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * [@property]      pastDiagnosticPayloads
     * 
     * A list of past diagnostic payloads received.
     */
    @Generated
    @Selector("pastDiagnosticPayloads")
    public native NSArray<? extends MXDiagnosticPayload> pastDiagnosticPayloads();
}
package apple.avfoundation;

import apple.NSObject;
import apple.avfoundation.protocol.AVCaptureDepthDataOutputDelegate;
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

/**
 * @class AVCaptureDepthDataOutput
 * @abstract
 *    AVCaptureDepthDataOutput is a concrete subclass of AVCaptureOutput that can be used to process depth data in a streaming fashion.
 * 
 * @discussion
 *    Instances of AVCaptureDepthDataOutput capture AVDepthData objects expressing disparity/depth. Applications can access the frames with the depthDataOutput:didOutputDepthData:fromConnection: delegate method.
 * 
 *    AVCaptureDepthDataOutput always provides depth data in the format expressed by its source's -[AVCaptureDevice activeDepthDataFormat] property. If you wish to receive depth data in another format, you may choose from the -[AVCaptureDevice activeFormat]'s -[AVCaptureDeviceFormat supportedDepthDataFormats], and set it using -[AVCaptureDevice setActiveDepthDataFormat:].
 */
@Generated
@Library("AVFoundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class AVCaptureDepthDataOutput extends AVCaptureOutput {
    static {
        NatJ.register();
    }

    @Generated
    protected AVCaptureDepthDataOutput(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native AVCaptureDepthDataOutput alloc();

    @Generated
    @Selector("allocWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object allocWithZone(VoidPtr zone);

    /**
     * @property alwaysDiscardsLateDepthData
     * @abstract
     *    Specifies whether the receiver should always discard any depth data that is not processed before the next depth data is captured.
     * 
     * @discussion
     *    When the value of this property is YES, the receiver will immediately discard depth data that are captured while the delegateCallbackQueue is blocked. When the value of this property is NO, delegates will be allowed more time to process old depth data before new depth data are discarded, but application memory usage may increase as a result. The default value is YES.
     */
    @Generated
    @Selector("alwaysDiscardsLateDepthData")
    public native boolean alwaysDiscardsLateDepthData();

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

    /**
     * @property delegate
     * @abstract
     *    The receiver's delegate.
     * 
     * @discussion
     *    The value of this property is an object conforming to the AVCaptureDepthDataOutputDelegate protocol that receives depth data as it is captured. The delegate is set using the setDelegate:callbackQueue: method.
     */
    @Generated
    @Selector("delegate")
    @MappedReturn(ObjCObjectMapper.class)
    public native AVCaptureDepthDataOutputDelegate delegate();

    /**
     * @property delegateCallbackQueue
     * @abstract
     *    The dispatch queue on which all delegate methods are called.
     * 
     * @discussion
     *    The value of this property is a dispatch_queue_t. The queue is set using the setDelegate:queue: method.
     */
    @Generated
    @Selector("delegateCallbackQueue")
    public native NSObject delegateCallbackQueue();

    @Generated
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native AVCaptureDepthDataOutput init();

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
     * @property filteringEnabled
     * @abstract
     *    Specifies whether the depth data output should filter depth data to smooth out noise and fill invalid values.
     * 
     * @discussion
     *    When the value of this property is YES, the receiver temporally filters the stream of AVDepthData objects to reduce noise, as well as fill invalid values. Invalid values (NaN) may be present in AVDepthData pixel buffer maps due to factors such as low light or lens occlusion. When filtering is enabled, the depth data output interpolates missing depth data values. Filtering should be disabled if you desire the raw depth data values. The default value is YES.
     */
    @Generated
    @Selector("isFilteringEnabled")
    public native boolean isFilteringEnabled();

    @Generated
    @Selector("isSubclassOfClass:")
    public static native boolean isSubclassOfClass(Class aClass);

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

    @Generated
    @Owned
    @Selector("new")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * @property alwaysDiscardsLateDepthData
     * @abstract
     *    Specifies whether the receiver should always discard any depth data that is not processed before the next depth data is captured.
     * 
     * @discussion
     *    When the value of this property is YES, the receiver will immediately discard depth data that are captured while the delegateCallbackQueue is blocked. When the value of this property is NO, delegates will be allowed more time to process old depth data before new depth data are discarded, but application memory usage may increase as a result. The default value is YES.
     */
    @Generated
    @Selector("setAlwaysDiscardsLateDepthData:")
    public native void setAlwaysDiscardsLateDepthData(boolean value);

    /**
     * @method setDelegate:queue:
     * @abstract
     *    Sets the receiver's delegate that receives captured depth data and the dispatch queue on which the delegate is called.
     * 
     * @param delegate
     *    An object conforming to the AVCaptureDepthDataOutputDelegate protocol that receives depth data in a streaming fashion.
     * @param callbackQueue
     *    A dispatch queue on which all delegate methods are called.
     * 
     * @discussion
     *    The depth data output vends captured depth data to its delegate using the methods specified in the AVCaptureDepthOutputDelegate protocol. All delegate methods are called on the specified dispatch queue. If the callback queue is blocked when new depth data is captured, that depth data is automatically dropped at a time determined by the value of the alwaysDiscardsLateDepthData property. This allows clients to process existing depth data on the same queue without having to manage the potential memory usage increases that would otherwise occur when that processing is unable to keep up with the rate of incoming depth data.
     * 
     *    Clients who need to minimize the chances of depth data being dropped should provide a dedicated queue and not share it with other data outputs. Processing of depth data may be deferred to another queue, but beware that the depth data pixel buffer maps may come from a finite buffer pool, which may be starved if your deferred processing fails to keep up.
     * 
     *    A serial dispatch queue must be used to guarantee that depth data will be delivered in order. The callbackQueue parameter may not be NULL, except when setting the delegate to nil.
     */
    @Generated
    @Selector("setDelegate:callbackQueue:")
    public native void setDelegateCallbackQueue(
            @Mapped(ObjCObjectMapper.class) AVCaptureDepthDataOutputDelegate delegate, NSObject callbackQueue);

    /**
     * @property filteringEnabled
     * @abstract
     *    Specifies whether the depth data output should filter depth data to smooth out noise and fill invalid values.
     * 
     * @discussion
     *    When the value of this property is YES, the receiver temporally filters the stream of AVDepthData objects to reduce noise, as well as fill invalid values. Invalid values (NaN) may be present in AVDepthData pixel buffer maps due to factors such as low light or lens occlusion. When filtering is enabled, the depth data output interpolates missing depth data values. Filtering should be disabled if you desire the raw depth data values. The default value is YES.
     */
    @Generated
    @Selector("setFilteringEnabled:")
    public native void setFilteringEnabled(boolean value);

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
}
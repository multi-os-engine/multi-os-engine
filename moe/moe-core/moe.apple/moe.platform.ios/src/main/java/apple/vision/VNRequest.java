package apple.vision;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSError;
import apple.foundation.NSIndexSet;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSCopying;
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
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * VNRequest
 * 
 * VNRequest objects describe the operation to be performed as well as act as the recipient of the operation's resultant observations.
 * 
 * VNRequest objects are instantiated in a pre-configured nominal state. Prior to sending a VNRequest to a request handler to perform a desired operation, the default configuration can be changed by modifying the values of VNRequest properties. The VNRequest class itself acts as a base class and is not meant to be directly instantiated.
 */
@Generated
@Library("Vision")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class VNRequest extends NSObject implements NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected VNRequest(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native VNRequest alloc();

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

    /**
     * [@property] completionHandler
     * 
     * The completion handler block that will be invoked after the request has completed processing.
     */
    @Generated
    @Selector("completionHandler")
    @ObjCBlock(name = "call_completionHandler_ret")
    public native Block_completionHandler_ret completionHandler();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_completionHandler_ret {
        @Generated
        void call_completionHandler_ret(VNRequest request, NSError error);
    }

    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(VoidPtr zone);

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
     * Creates a new VNRequest with no completion handler.
     */
    @Generated
    @Selector("init")
    public native VNRequest init();

    /**
     * Creates a new VNRequest with an optional completion handler.
     * 
     * @param completionHandler	The block to be invoked after the request has completed its processing. The completion handler gets executed on the same dispatch queue as the request being executed.
     */
    @Generated
    @Selector("initWithCompletionHandler:")
    public native VNRequest initWithCompletionHandler(
            @ObjCBlock(name = "call_initWithCompletionHandler") Block_initWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_initWithCompletionHandler {
        @Generated
        void call_initWithCompletionHandler(VNRequest request, NSError error);
    }

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

    @Generated
    @Owned
    @Selector("new")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object new_objc();

    /**
     * A hint used to minimize the resource burden of the request. Memory footprint, processing footprint and/or CPU/GPU contention will be reduced (depending on the request), at the potential cost of longer execution time. This can help, for example, with ensuring UI updates and rendering are not getting blocked by Vision processing.
     */
    @Generated
    @Selector("preferBackgroundProcessing")
    public native boolean preferBackgroundProcessing();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * [@property] results
     * 
     * The collection of VNObservations generated by the processing of the request.
     * 
     * The only valid time to access this property is after the request has been processed by a request handler.  If the request failed, this property will be nil; otherwise, it will be an array of zero or more VNObservation subclasses specific to the VNRequest subclass.
     */
    @Generated
    @Selector("results")
    public native NSArray<?> results();

    /**
     * A hint used to minimize the resource burden of the request. Memory footprint, processing footprint and/or CPU/GPU contention will be reduced (depending on the request), at the potential cost of longer execution time. This can help, for example, with ensuring UI updates and rendering are not getting blocked by Vision processing.
     */
    @Generated
    @Selector("setPreferBackgroundProcessing:")
    public native void setPreferBackgroundProcessing(boolean value);

    /**
     * This property, if set to YES, signifies that the request should be performed exclusively on the CPU and not on the GPU. The default value is NO, which signifies that the request is free to leverage the GPU to accelerate any work the request may require.
     */
    @Generated
    @Selector("setUsesCPUOnly:")
    public native void setUsesCPUOnly(boolean value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    /**
     * This property, if set to YES, signifies that the request should be performed exclusively on the CPU and not on the GPU. The default value is NO, which signifies that the request is free to leverage the GPU to accelerate any work the request may require.
     */
    @Generated
    @Selector("usesCPUOnly")
    public native boolean usesCPUOnly();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * Tries to abort the request as soon as possible. Results will be nil. The completionHandler (if present) will be called with an error of VNErrorRequestCancelled.
     */
    @Generated
    @Selector("cancel")
    public native void cancel();

    /**
     * Provides the current revison supported by the request.
     */
    @Generated
    @Selector("currentRevision")
    @NUInt
    public static native long currentRevision();

    /**
     * Provides the revision of the request that was latest for the particular SDK that was linked with the client application.
     */
    @Generated
    @Selector("defaultRevision")
    @NUInt
    public static native long defaultRevision();

    /**
     * The specific algorithm or implementation revision that is to be used to perform the request.
     */
    @Generated
    @Selector("revision")
    @NUInt
    public native long revision();

    /**
     * The specific algorithm or implementation revision that is to be used to perform the request.
     */
    @Generated
    @Selector("setRevision:")
    public native void setRevision(@NUInt long value);

    /**
     * Provides the collection of currently-supported algorithm or implementation versions for the class of request.
     * 
     * This method allows clients to introspect at runtime what capabilities are available for each class of VNRequest in the Vision framework.
     */
    @Generated
    @Selector("supportedRevisions")
    public static native NSIndexSet supportedRevisions();
}
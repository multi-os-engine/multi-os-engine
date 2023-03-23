package apple.avfoundation;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
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
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * AVSampleBufferGeneratorBatch
 * 
 * An AVSampleBufferGeneratorBatch provides an optimized way to load sample data asynchronously for multiple
 * CMSampleBuffers in an asset.
 * 
 * The AVSampleBufferGeneratorBatch loads sample data asynchronously, by aggregating adjacent I/O requests and
 * overlapping them when possible for all CMSampleBuffers within a batch.
 * An AVSampleBufferGeneratorBatch is associated with an AVSampleBufferGenerator. See -[AVSampleBufferGenerator
 * makeBatch] to create an AVSampleBufferGeneratorBatch.
 * See -[AVSampleBufferGeneratorBatch createSampleBufferForRequest: addingToBatch: error:] to create a CMSampleBuffer,
 * defer I/O for its data, and build up a batch.
 * 
 * API-Since: 16.0
 */
@Generated
@Library("AVFoundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class AVSampleBufferGeneratorBatch extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected AVSampleBufferGeneratorBatch(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native AVSampleBufferGeneratorBatch alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native AVSampleBufferGeneratorBatch allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(String key);

    /**
     * cancel
     * 
     * Attempt to cancel any I/O for this batch. The associated sample buffers will have their data ready handler
     * invoked with an error.
     */
    @Generated
    @Selector("cancel")
    public native void cancel();

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
    public native AVSampleBufferGeneratorBatch init();

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
     * makeDataReadyWithCompletionHandler:
     * 
     * Loads sample data asynchronously for all CMSampleBuffers within a batch.
     * This can only be called once on a batch, an exception will be thrown otherwise.
     * 
     * @param completionHandler
     *                          The completionHandler is called once, when all CMSampleBuffers in the batch are
     *                          data-ready, or as soon as an error has occurred.
     */
    @Generated
    @Selector("makeDataReadyWithCompletionHandler:")
    public native void makeDataReadyWithCompletionHandler(
            @ObjCBlock(name = "call_makeDataReadyWithCompletionHandler") Block_makeDataReadyWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_makeDataReadyWithCompletionHandler {
        @Generated
        void call_makeDataReadyWithCompletionHandler(NSError error);
    }

    @Generated
    @Owned
    @Selector("new")
    public static native AVSampleBufferGeneratorBatch new_objc();

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
    @Selector("version")
    @NInt
    public static native long version_static();
}
package apple.avfoundation;

import apple.NSObject;
import apple.coremedia.opaque.CMSampleBufferRef;
import apple.coremedia.opaque.CMTimebaseRef;
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
import org.moe.natj.general.ann.ReferenceInfo;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * API-Since: 16.0
 */
@Generated
@Library("AVFoundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class AVSampleBufferGenerator extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected AVSampleBufferGenerator(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native AVSampleBufferGenerator alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native AVSampleBufferGenerator allocWithZone(VoidPtr zone);

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

    /**
     * createSampleBufferForRequest: addingToBatch: error:
     * 
     * Creates a sample buffer and attempts to defer I/O for its data. Attempt may fail based on generator configuration
     * or file format.
     * The [AVSampleBufferGeneratorBatch makeDataReadyWithCompletionHandler:] should be called once to commence I/O and
     * load sample data for all CMSampleBuffers within a batch.
     * Any subsequent calls to createSampleBufferForRequest:addingToBatch:error: will throw an exception.
     * 
     * @param request
     *                 An instance of AVSampleBufferRequest representing the CMSampleBuffer creation request
     * @param batch
     *                 An instance of AVSampleBufferGeneratorBatch to contain the output sample buffer. If nil, an
     *                 exception is thrown.
     *                 Must be created by calling makeBatch on the same instance of AVSampleBufferGenerator. An
     *                 exception will be thrown otherwise.
     * @param outError
     *                 A pointer to an NSError object that will be populated with failure information, if sample buffer
     *                 creation fails.
     * @return A CMSampleBuffer object referencing the output sample buffer. The generator may defer I/O to fetch sample
     *         data depending on the source of the sample data and
     *         the generator's timebase.
     * 
     *         API-Since: 16.0
     */
    @Nullable
    @Generated
    @Selector("createSampleBufferForRequest:addingToBatch:error:")
    public native CMSampleBufferRef createSampleBufferForRequestAddingToBatchError(
            @NotNull AVSampleBufferRequest request, @NotNull AVSampleBufferGeneratorBatch batch,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

    /**
     * createSampleBufferForRequest: error:
     * 
     * Creates a sample buffer and if requested, attempts to load its data asynchronously. Attempt may fail based on
     * generator configuration or file format.
     * See [AVSampleBufferGenerator notifyOfDataReadyForSampleBuffer: completionHandler:] to get notified when the
     * sample buffer data is available.
     * 
     * If the AVSampleBufferGenerator was created with a NULL timebase, any associated AVSampleBufferRequest will
     * default to using AVSampleBufferRequestModeImmediate.
     * 
     * API-Since: 16.0
     * 
     * @param request
     *                 An instance of AVSampleBufferRequest representing the CMSampleBuffer creation request.
     * @param outError
     *                 A pointer to an NSError object that will be populated with failure information, if sample buffer
     *                 creation fails.
     * @return A CMSampleBuffer object referencing the output sample buffer.
     */
    @Nullable
    @Generated
    @Selector("createSampleBufferForRequest:error:")
    public native CMSampleBufferRef createSampleBufferForRequestError(@NotNull AVSampleBufferRequest request,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

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
    public native AVSampleBufferGenerator init();

    /**
     * initWithAsset: timebase:
     * 
     * Creates an instance of AVSampleBufferGenerator to generate sample buffers from the specified asset.
     * 
     * If the specified asset is an HTTP Live Streaming asset, the generator cannot create sample buffers.
     * 
     * @param asset
     *                 The asset from which sample buffers will be created.
     * @param timebase
     *                 The generator timebase, which governs when sample data for sample buffers is loaded. If NULL,
     *                 sample data is loaded synchronously.
     * @return An instance of AVSampleBufferGenerator.
     */
    @Generated
    @Selector("initWithAsset:timebase:")
    public native AVSampleBufferGenerator initWithAssetTimebase(@NotNull AVAsset asset,
            @Nullable CMTimebaseRef timebase);

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

    /**
     * makeBatch
     * 
     * Creates a batch to handle multiple sample buffers, allowing to asynchronously load sample data and optimize I/O
     * when possible.
     * 
     * @return An instance of an AVSampleBufferGeneratorBatch that can be used in calls to
     *         createSampleBufferForRequest:addingToBatch:error: of the same AVSampleBufferGenerator instance.
     * 
     *         API-Since: 16.0
     */
    @NotNull
    @Generated
    @Selector("makeBatch")
    public native AVSampleBufferGeneratorBatch makeBatch();

    @Generated
    @Owned
    @Selector("new")
    public static native AVSampleBufferGenerator new_objc();

    /**
     * notifyOfDataReadyForSampleBuffer: completionHandler:
     * 
     * Allows the client to get notified when the sample buffer data is ready, or as soon as an error has occured.
     * 
     * @param completionHandler
     *                          The completionHandler will be called, when the sample buffer data is ready, or as soon
     *                          as an error has occurred.
     */
    @Generated
    @Selector("notifyOfDataReadyForSampleBuffer:completionHandler:")
    public static native void notifyOfDataReadyForSampleBufferCompletionHandler(@NotNull CMSampleBufferRef sbuf,
            @NotNull @ObjCBlock(name = "call_notifyOfDataReadyForSampleBufferCompletionHandler") Block_notifyOfDataReadyForSampleBufferCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_notifyOfDataReadyForSampleBufferCompletionHandler {
        @Generated
        void call_notifyOfDataReadyForSampleBufferCompletionHandler(boolean dataReady, @NotNull NSError error);
    }

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
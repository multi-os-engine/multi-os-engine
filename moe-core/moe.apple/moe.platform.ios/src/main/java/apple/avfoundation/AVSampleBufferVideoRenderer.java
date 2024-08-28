package apple.avfoundation;

import apple.NSObject;
import apple.avfoundation.protocol.AVQueuedSampleBufferRendering;
import apple.coremedia.opaque.CMSampleBufferRef;
import apple.coremedia.opaque.CMTimebaseRef;
import apple.foundation.NSArray;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.opaque.dispatch_queue_t;
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
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * API-Since: 17.0
 */
@Generated
@Library("AVFoundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class AVSampleBufferVideoRenderer extends NSObject implements AVQueuedSampleBufferRendering {
    static {
        NatJ.register();
    }

    @Generated
    protected AVSampleBufferVideoRenderer(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native AVSampleBufferVideoRenderer alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native AVSampleBufferVideoRenderer allocWithZone(VoidPtr zone);

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

    @Generated
    @Selector("enqueueSampleBuffer:")
    public native void enqueueSampleBuffer(@NotNull CMSampleBufferRef sampleBuffer);

    /**
     * [@property] error
     * 
     * If the video renderer's status is AVQueuedSampleBufferRenderingStatusFailed, this describes the error that caused
     * the failure.
     * 
     * The value of this property is an NSError that describes what caused the video renderer to no longer be able to
     * enqueue sample buffers. If the status is not AVQueuedSampleBufferRenderingStatusFailed, the value of this
     * property is nil.
     */
    @Generated
    @Selector("error")
    @Nullable
    public native NSError error();

    @Generated
    @Selector("flush")
    public native void flush();

    /**
     * flushWithRemovalOfDisplayedImage:completionHandler:
     * 
     * Instructs the video renderer to discard pending enqueued sample buffers and call the provided block when
     * complete.
     * 
     * A flush resets decoder state. The next frame passed to enqueueSampleBuffer: should be an IDR frame (also known as
     * a key frame or sync sample).
     * 
     * @param removeDisplayedImage
     *                             Set YES to remove any currently displayed image, NO to preserve any current image.
     * @param handler
     *                             The handler to invoke when flush operation is complete. May be nil.
     */
    @Generated
    @Selector("flushWithRemovalOfDisplayedImage:completionHandler:")
    public native void flushWithRemovalOfDisplayedImageCompletionHandler(boolean removeDisplayedImage,
            @ObjCBlock(name = "call_flushWithRemovalOfDisplayedImageCompletionHandler") @Nullable Block_flushWithRemovalOfDisplayedImageCompletionHandler handler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_flushWithRemovalOfDisplayedImageCompletionHandler {
        @Generated
        void call_flushWithRemovalOfDisplayedImageCompletionHandler();
    }

    @Generated
    @Selector("hasSufficientMediaDataForReliablePlaybackStart")
    public native boolean hasSufficientMediaDataForReliablePlaybackStart();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native AVSampleBufferVideoRenderer init();

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
    @Selector("isReadyForMoreMediaData")
    public native boolean isReadyForMoreMediaData();

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
    public static native AVSampleBufferVideoRenderer new_objc();

    @Generated
    @Selector("requestMediaDataWhenReadyOnQueue:usingBlock:")
    public native void requestMediaDataWhenReadyOnQueueUsingBlock(@NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_requestMediaDataWhenReadyOnQueueUsingBlock") @NotNull AVQueuedSampleBufferRendering.Block_requestMediaDataWhenReadyOnQueueUsingBlock block);

    /**
     * [@property] requiresFlushToResumeDecoding
     * 
     * Indicates that the receiver is in a state where it requires a call to -flush to continue decoding frames.
     * 
     * When the application enters a state where use of video decoder resources is not permissible, the value of this
     * property changes to YES along with the video renderer's status changing to
     * AVQueuedSampleBufferRenderingStatusFailed.
     * To resume rendering sample buffers using the video renderer after this property's value is YES, clients must
     * first reset the video renderer by calling flush or flushWithRemovalOfDisplayedImage:completionHandler:.
     * Clients can track changes to this property via
     * AVSampleBufferVideoRendererRequiresFlushToResumeDecodingDidChangeNotification.
     * This property is not key value observable.
     */
    @Generated
    @Selector("requiresFlushToResumeDecoding")
    public native boolean requiresFlushToResumeDecoding();

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
     * [@property] status
     * 
     * The ability of the video renderer to be used for enqueueing sample buffers.
     * 
     * The value of this property is an AVQueuedSampleBufferRenderingStatus that indicates whether the receiver can be
     * used for enqueueing and rendering sample buffers. When the value of this property is
     * AVQueuedSampleBufferRenderingStatusFailed, clients can check the value of the error property to determine the
     * failure. To resume rendering sample buffers using the video renderer after a failure, clients must first reset
     * the status to AVQueuedSampleBufferRenderingStatusUnknown. This can be achieved by invoking -flush on the video
     * renderer.
     * This property is key value observable.
     */
    @Generated
    @Selector("status")
    @NInt
    public native long status();

    @Generated
    @Selector("stopRequestingMediaData")
    public native void stopRequestingMediaData();

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("timebase")
    @NotNull
    public native CMTimebaseRef timebase();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}
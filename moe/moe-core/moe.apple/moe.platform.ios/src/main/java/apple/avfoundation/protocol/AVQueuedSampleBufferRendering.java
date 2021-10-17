package apple.avfoundation.protocol;

import apple.NSObject;
import apple.coremedia.opaque.CMSampleBufferRef;
import apple.coremedia.opaque.CMTimebaseRef;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

/**
 * [@protocol]		AVQueuedSampleBufferRendering
 * <p>
 * Defines methods for enqueueing CMSampleBuffers for presentation.
 * <p>
 * AVSampleBufferDisplayLayer and AVSampleBufferAudioRenderer conform to this protocol.  When used in conjunction with an AVSampleBufferRenderSynchronizer, an object conforming to AVQueuedSampleBufferRendering can only be attached to a single synchronizer.
 */
@Generated
@Library("AVFoundation")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("AVQueuedSampleBufferRendering")
public interface AVQueuedSampleBufferRendering {
    /**
     * enqueueSampleBuffer:
     * <p>
     * Sends a sample buffer in order to render its contents.
     * <p>
     * Video-specific notes:
     * <p>
     * If sampleBuffer has the kCMSampleAttachmentKey_DoNotDisplay attachment set to kCFBooleanTrue, the frame will be decoded but not displayed.  Otherwise, if sampleBuffer has the kCMSampleAttachmentKey_DisplayImmediately attachment set to kCFBooleanTrue, the decoded image will be displayed as soon as possible, replacing all previously enqueued images regardless of their timestamps.  Otherwise, the decoded image will be displayed at sampleBuffer's output presentation timestamp, as interpreted by the timebase.
     * <p>
     * To schedule the removal of previous images at a specific timestamp, enqueue a marker sample buffer containing no samples, with the kCMSampleBufferAttachmentKey_EmptyMedia attachment set to kCFBooleanTrue.
     * <p>
     * IMPORTANT NOTE: attachments with the kCMSampleAttachmentKey_ prefix must be set via CMSampleBufferGetSampleAttachmentsArray and CFDictionarySetValue.  Attachments with the kCMSampleBufferAttachmentKey_ prefix must be set via CMSetAttachment.
     */
    @Generated
    @Selector("enqueueSampleBuffer:")
    void enqueueSampleBuffer(CMSampleBufferRef sampleBuffer);

    /**
     * flush
     * <p>
     * Instructs the receiver to discard pending enqueued sample buffers.
     * <p>
     * Additional sample buffers can be appended after -flush.
     * <p>
     * Video-specific notes:
     * <p>
     * It is not possible to determine which sample buffers have been decoded, so the next frame passed to enqueueSampleBuffer: should be an IDR frame (also known as a key frame or sync sample).
     */
    @Generated
    @Selector("flush")
    void flush();

    /**
     * [@property]		readyForMoreMediaData
     * <p>
     * Indicates the readiness of the receiver to accept more sample buffers.
     * <p>
     * An object conforming to AVQueuedSampleBufferRendering keeps track of the occupancy levels of its internal queues for the benefit of clients that enqueue sample buffers from non-real-time sources -- i.e., clients that can supply sample buffers faster than they are consumed, and so need to decide when to hold back.
     * <p>
     * Clients enqueueing sample buffers from non-real-time sources may hold off from generating or obtaining more sample buffers to enqueue when the value of readyForMoreMediaData is NO.
     * <p>
     * It is safe to call enqueueSampleBuffer: when readyForMoreMediaData is NO, but it is a bad idea to enqueue sample buffers without bound.
     * <p>
     * To help with control of the non-real-time supply of sample buffers, such clients can use -requestMediaDataWhenReadyOnQueue:usingBlock in order to specify a block that the receiver should invoke whenever it's ready for sample buffers to be appended.
     * <p>
     * The value of readyForMoreMediaData will often change from NO to YES asynchronously, as previously supplied sample buffers are decoded and rendered.
     * <p>
     * This property is not key value observable.
     */
    @Generated
    @Selector("isReadyForMoreMediaData")
    boolean isReadyForMoreMediaData();

    /**
     * requestMediaDataWhenReadyOnQueue:usingBlock:
     * <p>
     * Instructs the target to invoke a client-supplied block repeatedly, at its convenience, in order to gather sample buffers for playback.
     * <p>
     * The block should enqueue sample buffers to the receiver either until the receiver's readyForMoreMediaData property becomes NO or until there is no more data to supply. When the receiver has decoded enough of the media data it has received that it becomes ready for more media data again, it will invoke the block again in order to obtain more.
     * <p>
     * If this method is called multiple times, only the last call is effective. Call stopRequestingMediaData to cancel this request.
     * <p>
     * Each call to requestMediaDataWhenReadyOnQueue:usingBlock: should be paired with a corresponding call to stopRequestingMediaData:. Releasing the AVQueuedSampleBufferRendering object without a call to stopRequestingMediaData will result in undefined behavior.
     */
    @Generated
    @Selector("requestMediaDataWhenReadyOnQueue:usingBlock:")
    void requestMediaDataWhenReadyOnQueueUsingBlock(NSObject queue,
            @ObjCBlock(name = "call_requestMediaDataWhenReadyOnQueueUsingBlock") Block_requestMediaDataWhenReadyOnQueueUsingBlock block);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_requestMediaDataWhenReadyOnQueueUsingBlock {
        @Generated
        void call_requestMediaDataWhenReadyOnQueueUsingBlock();
    }

    /**
     * stopRequestingMediaData
     * <p>
     * Cancels any current requestMediaDataWhenReadyOnQueue:usingBlock: call.
     * <p>
     * This method may be called from outside the block or from within the block.
     */
    @Generated
    @Selector("stopRequestingMediaData")
    void stopRequestingMediaData();

    /**
     * [@property]		timebase
     * <p>
     * The renderer's timebase, which governs how time stamps are interpreted.
     * <p>
     * The timebase is used to interpret time stamps.
     * <p>
     * The timebase is read-only.  Use the AVSampleBufferRenderSynchronizer to set the rate or time.
     */
    @Generated
    @Selector("timebase")
    CMTimebaseRef timebase();

    /**
     * [@property]	hasSufficientMediaDataForReliablePlaybackStart
     * <p>
     * Indicates whether the enqueued media data meets the renderer's preroll level.
     * <p>
     * Clients should fetch the value of this property to learn if the renderer has had enough media data enqueued to start playback reliably. Starting playback when this property is NO may prevent smooth playback following an immediate start.
     */
    @Generated
    @Selector("hasSufficientMediaDataForReliablePlaybackStart")
    boolean hasSufficientMediaDataForReliablePlaybackStart();
}

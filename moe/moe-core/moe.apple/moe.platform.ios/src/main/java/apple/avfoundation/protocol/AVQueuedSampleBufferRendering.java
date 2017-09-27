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

@Generated
@Library("AVFoundation")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("AVQueuedSampleBufferRendering")
public interface AVQueuedSampleBufferRendering {
    @Generated
    @Selector("enqueueSampleBuffer:")
    void enqueueSampleBuffer(CMSampleBufferRef sampleBuffer);

    @Generated
    @Selector("flush")
    void flush();

    @Generated
    @Selector("isReadyForMoreMediaData")
    boolean isReadyForMoreMediaData();

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

    @Generated
    @Selector("stopRequestingMediaData")
    void stopRequestingMediaData();

    @Generated
    @Selector("timebase")
    CMTimebaseRef timebase();
}
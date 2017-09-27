package apple.arkit.protocol;

import apple.arkit.ARCamera;
import apple.arkit.ARSession;
import apple.coremedia.opaque.CMSampleBufferRef;
import apple.foundation.NSError;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

@Generated
@Library("ARKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("ARSessionObserver")
public interface ARSessionObserver {
    @Generated
    @IsOptional
    @Selector("session:cameraDidChangeTrackingState:")
    default void sessionCameraDidChangeTrackingState(ARSession session, ARCamera camera) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("session:didFailWithError:")
    default void sessionDidFailWithError(ARSession session, NSError error) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("session:didOutputAudioSampleBuffer:")
    default void sessionDidOutputAudioSampleBuffer(ARSession session, CMSampleBufferRef audioSampleBuffer) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("sessionInterruptionEnded:")
    default void sessionInterruptionEnded(ARSession session) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("sessionWasInterrupted:")
    default void sessionWasInterrupted(ARSession session) {
        throw new java.lang.UnsupportedOperationException();
    }
}
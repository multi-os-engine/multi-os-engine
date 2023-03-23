package apple.arkit.protocol;

import apple.arkit.ARCamera;
import apple.arkit.ARCollaborationData;
import apple.arkit.ARGeoTrackingStatus;
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

/**
 * API-Since: 11.0
 */
@Generated
@Library("ARKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("ARSessionObserver")
public interface ARSessionObserver {
    /**
     * This is called when the camera’s tracking state has changed.
     * 
     * @param session The session being run.
     * @param camera  The camera that changed tracking states.
     */
    @Generated
    @IsOptional
    @Selector("session:cameraDidChangeTrackingState:")
    default void sessionCameraDidChangeTrackingState(ARSession session, ARCamera camera) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * This is called when a session fails.
     * 
     * On failure the session will be paused.
     * 
     * @param session The session that failed.
     * @param error   The error being reported (see ARError.h).
     */
    @Generated
    @IsOptional
    @Selector("session:didFailWithError:")
    default void sessionDidFailWithError(ARSession session, NSError error) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * This is called when the session outputs a new audio sample buffer.
     * 
     * @param session           The session being run.
     * @param audioSampleBuffer The captured audio sample buffer.
     */
    @Generated
    @IsOptional
    @Selector("session:didOutputAudioSampleBuffer:")
    default void sessionDidOutputAudioSampleBuffer(ARSession session, CMSampleBufferRef audioSampleBuffer) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * This is called when a session interruption has ended.
     * 
     * A session will continue running from the last known state once
     * the interruption has ended. If the device has moved, anchors will be misaligned.
     * To avoid this, some applications may want to reset tracking (see ARSessionRunOptions)
     * or attempt to relocalize (see `-[ARSessionObserver sessionShouldAttemptRelocalization:]`).
     * 
     * @param session The session that was interrupted.
     */
    @Generated
    @IsOptional
    @Selector("sessionInterruptionEnded:")
    default void sessionInterruptionEnded(ARSession session) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * This is called when a session is interrupted.
     * 
     * A session will be interrupted and no longer able to track when
     * it fails to receive required sensor data. This happens when video capture is interrupted,
     * for example when the application is sent to the background or when there are
     * multiple foreground applications (see AVCaptureSessionInterruptionReason).
     * No additional frame updates will be delivered until the interruption has ended.
     * 
     * @param session The session that was interrupted.
     */
    @Generated
    @IsOptional
    @Selector("sessionWasInterrupted:")
    default void sessionWasInterrupted(ARSession session) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * This is called when the session generated new collaboration data.
     * 
     * This data should be sent to all participants.
     * 
     * @param session The session that produced world tracking collaboration data.
     * @param data    Collaboration data to be sent to participants.
     * @see ARCollaborationData
     * 
     *      API-Since: 13.0
     */
    @Generated
    @IsOptional
    @Selector("session:didOutputCollaborationData:")
    default void sessionDidOutputCollaborationData(ARSession session, ARCollaborationData data) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * This is called after a session resumes from a pause or interruption to determine
     * whether or not the session should attempt to relocalize.
     * 
     * To avoid misaligned anchors, apps may wish to attempt a relocalization after
     * a session pause or interruption. If YES is returned: the session will begin relocalizing
     * and tracking state will switch to limited with reason relocalizing. If successful, the
     * session's tracking state will return to normal. Because relocalization depends on
     * the user's location, it can run indefinitely. Apps that wish to give up on relocalization
     * may call run with `ARSessionRunOptionResetTracking` at any time.
     * 
     * @param session The session to relocalize.
     * @return Return YES to begin relocalizing.
     * 
     *         API-Since: 11.3
     */
    @Generated
    @IsOptional
    @Selector("sessionShouldAttemptRelocalization:")
    default boolean sessionShouldAttemptRelocalization(ARSession session) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * This is called when geo tracking status changes.
     * 
     * @param session           The session being run.
     * @param geoTrackingStatus Latest geo tracking status.
     * 
     *                          API-Since: 14.0
     */
    @Generated
    @IsOptional
    @Selector("session:didChangeGeoTrackingStatus:")
    default void sessionDidChangeGeoTrackingStatus(ARSession session, ARGeoTrackingStatus geoTrackingStatus) {
        throw new java.lang.UnsupportedOperationException();
    }
}

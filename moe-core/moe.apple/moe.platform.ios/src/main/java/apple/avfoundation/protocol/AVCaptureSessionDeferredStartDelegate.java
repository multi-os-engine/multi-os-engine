package apple.avfoundation.protocol;

import apple.avfoundation.AVCaptureSession;
import org.jetbrains.annotations.NotNull;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

/**
 * Defines an interface for delegates of the capture session to receive events about the session's deferred start.
 * 
 * API-Since: 26.0
 */
@Generated
@Library("AVFoundation")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("AVCaptureSessionDeferredStartDelegate")
public interface AVCaptureSessionDeferredStartDelegate {
    /**
     * This method gets called by the session when deferred start has finished running.
     * 
     * - Parameter session: The ``AVCaptureSession`` instance that runs the deferred start.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("sessionDidRunDeferredStart:")
    void sessionDidRunDeferredStart(@NotNull AVCaptureSession session);

    /**
     * This method gets called by the session when deferred start is about to run.
     * 
     * Delegates receive this message when the session has finished the deferred start. This message will be sent
     * regardless of whether the session's ``AVCaptureSession/automaticallyRunsDeferredStart`` property is set. See
     * ``AVCaptureSession/setDeferredStartDelegate:deferredStartDelegateCallbackQueue:`` documentation for more
     * information.
     * 
     * - Parameter session: The ``AVCaptureSession`` instance that runs the deferred start.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("sessionWillRunDeferredStart:")
    void sessionWillRunDeferredStart(@NotNull AVCaptureSession session);
}
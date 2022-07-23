/*
Copyright 2014-2016 Intel Corporation

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/

package apple.replaykit;

import apple.NSObject;
import apple.coremedia.opaque.CMSampleBufferRef;
import apple.foundation.NSArray;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.NSURL;
import apple.replaykit.protocol.RPScreenRecorderDelegate;
import apple.uikit.UIView;
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
 * RPScreenRecorder
 * <p>
 * Singleton class used to control app recording.
 */
@Generated
@Library("ReplayKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class RPScreenRecorder extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected RPScreenRecorder(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native RPScreenRecorder alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native RPScreenRecorder allocWithZone(VoidPtr zone);

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

    @Generated
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

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
    public static native RPScreenRecorder new_objc();

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
     * Shared instance of the screen recorder.
     */
    @Generated
    @Selector("sharedRecorder")
    public static native RPScreenRecorder sharedRecorder();

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @Generated
    @Selector("cameraPreviewView")
    public native UIView cameraPreviewView();

    /**
     * Delegate instance for RPScreenRecorder.
     */
    @Generated
    @Selector("delegate")
    @MappedReturn(ObjCObjectMapper.class)
    public native RPScreenRecorderDelegate delegate();

    /**
     * Discards the current recording. This can only be called after the handler block in stopRecordingWithHandler: is
     * executed.
     */
    @Generated
    @Selector("discardRecordingWithHandler:")
    public native void discardRecordingWithHandler(
            @ObjCBlock(name = "call_discardRecordingWithHandler") Block_discardRecordingWithHandler handler);

    @Generated
    @Selector("init")
    public native RPScreenRecorder init();

    /**
     * Check if ReplayKit is available on the device. Implement the screenRecorderDidChangeAvailability: on the delegate
     * to listen for changes to this property. Can be used for key value observing.
     */
    @Generated
    @Selector("isAvailable")
    public native boolean isAvailable();

    /**
     * Specify or query whether the camera should be enabled during recording. Can be used for key value observing.
     * Default is NO.
     */
    @Generated
    @Selector("isCameraEnabled")
    public native boolean isCameraEnabled();

    /**
     * Specify or query whether the camera should be enabled during recording. Can be used for key value observing.
     * Default is NO.
     */
    @Generated
    @Selector("setCameraEnabled:")
    public native void setCameraEnabled(boolean value);

    /**
     * Specify or query whether the microphone should be enabled during recording. Can be used for key value observing.
     * Default is NO.
     */
    @Generated
    @Selector("isMicrophoneEnabled")
    public native boolean isMicrophoneEnabled();

    /**
     * Specify or query whether the microphone should be enabled during recording. Can be used for key value observing.
     * Default is NO.
     */
    @Generated
    @Selector("setMicrophoneEnabled:")
    public native void setMicrophoneEnabled(boolean value);

    /**
     * Check if a recording session is in progress. Can be used for key value observing.
     */
    @Generated
    @Selector("isRecording")
    public native boolean isRecording();

    /**
     * Delegate instance for RPScreenRecorder.
     */
    @Generated
    @Selector("setDelegate:")
    public native void setDelegate_unsafe(@Mapped(ObjCObjectMapper.class) RPScreenRecorderDelegate value);

    /**
     * Delegate instance for RPScreenRecorder.
     */
    @Generated
    public void setDelegate(@Mapped(ObjCObjectMapper.class) RPScreenRecorderDelegate value) {
        Object __old = delegate();
        if (value != null) {
            org.moe.natj.objc.ObjCRuntime.associateObjCObject(this, value);
        }
        setDelegate_unsafe(value);
        if (__old != null) {
            org.moe.natj.objc.ObjCRuntime.dissociateObjCObject(this, __old);
        }
    }

    /**
     * Starts app recording with a completion handler. Note that before recording actually starts, the user may be
     * prompted with UI to confirm recording.
     * <p>
     * handler Called after user interactions are complete. Will be passed an optional NSError in the
     * RPRecordingErrorDomain domain if there was an issue starting the recording.
     */
    @Generated
    @Selector("startRecordingWithHandler:")
    public native void startRecordingWithHandler(
            @ObjCBlock(name = "call_startRecordingWithHandler") Block_startRecordingWithHandler handler);

    /**
     * Deprecated. Use startRecordingWithHandler: instead.
     * <p>
     * Starts app recording with a completion handler. Note that before recording actually starts, the user may be
     * prompted with UI to confirm recording.
     * <p>
     * handler Called after user interactions are complete. Will be passed an optional NSError in the
     * RPRecordingErrorDomain domain if there was an issue starting the recording.
     *
     * @param microphoneEnabled Determines whether the microphone input should be included in the recorded movie audio.
     */
    @Generated
    @Selector("startRecordingWithMicrophoneEnabled:handler:")
    public native void startRecordingWithMicrophoneEnabledHandler(boolean microphoneEnabled,
            @ObjCBlock(name = "call_startRecordingWithMicrophoneEnabledHandler") Block_startRecordingWithMicrophoneEnabledHandler handler);

    /**
     * Stops app recording with a completion handler.
     * <p>
     * handler Called when the movie is ready. Will return an instance of RPPreviewViewController on success which
     * should be presented using [UIViewController presentViewController:animated:completion:]. Will be passed an
     * optional NSError in the RPRecordingErrorDomain domain if there was an issue stopping the recording.
     */
    @Generated
    @Selector("stopRecordingWithHandler:")
    public native void stopRecordingWithHandler(
            @ObjCBlock(name = "call_stopRecordingWithHandler") Block_stopRecordingWithHandler handler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_discardRecordingWithHandler {
        @Generated
        void call_discardRecordingWithHandler();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_startRecordingWithHandler {
        @Generated
        void call_startRecordingWithHandler(NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_startRecordingWithMicrophoneEnabledHandler {
        @Generated
        void call_startRecordingWithMicrophoneEnabledHandler(NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_stopRecordingWithHandler {
        @Generated
        void call_stopRecordingWithHandler(RPPreviewViewController previewViewController, NSError error);
    }

    /**
     * Specify or query camera position. Can be used for key value observing. Default is RPCameraPositionFront.
     */
    @Generated
    @Selector("cameraPosition")
    @NInt
    public native long cameraPosition();

    /**
     * Specify or query camera position. Can be used for key value observing. Default is RPCameraPositionFront.
     */
    @Generated
    @Selector("setCameraPosition:")
    public native void setCameraPosition(@NInt long value);

    /**
     * Starts screen and audio capture and continually calls the supplied handler with the current sampleBuffer and
     * bufferType and passed it back to the application. Note that before recording actually starts, the user may be
     * prompted with UI to confirm recording.
     * <p>
     * handler Called continually with sampleBuffers and the bufferType. Will be passed an optional NSError in the
     * RPRecordingErrorDomain domain if there was an issue starting the capture.
     */
    @Generated
    @Selector("startCaptureWithHandler:completionHandler:")
    public native void startCaptureWithHandlerCompletionHandler(
            @ObjCBlock(name = "call_startCaptureWithHandlerCompletionHandler_0") Block_startCaptureWithHandlerCompletionHandler_0 captureHandler,
            @ObjCBlock(name = "call_startCaptureWithHandlerCompletionHandler_1") Block_startCaptureWithHandlerCompletionHandler_1 completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_startCaptureWithHandlerCompletionHandler_0 {
        @Generated
        void call_startCaptureWithHandlerCompletionHandler_0(CMSampleBufferRef sampleBuffer, @NInt long bufferType,
                NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_startCaptureWithHandlerCompletionHandler_1 {
        @Generated
        void call_startCaptureWithHandlerCompletionHandler_1(NSError error);
    }

    /**
     * Stops screen capture with a completion handler
     * <p>
     * handler Called after the screen capture has stopped. Will be passed an optional NSError in the
     * RPRecordingErrorDomain domain if there was an issue stopping the capture
     */
    @Generated
    @Selector("stopCaptureWithHandler:")
    public native void stopCaptureWithHandler(
            @ObjCBlock(name = "call_stopCaptureWithHandler") Block_stopCaptureWithHandler handler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_stopCaptureWithHandler {
        @Generated
        void call_stopCaptureWithHandler(NSError error);
    }

    /**
     * Stops app recording with output URL and completion handler.
     * <p>
     * handler Called when movie is written to specified output URL. Will be passed an optional NSError in the
     * RPRecordingErrorDomain domain if there was an issue stopping the recording and writing the output URL.
     *
     * @param url Output URL for app recording movie.
     */
    @Generated
    @Selector("stopRecordingWithOutputURL:completionHandler:")
    public native void stopRecordingWithOutputURLCompletionHandler(NSURL url,
            @ObjCBlock(name = "call_stopRecordingWithOutputURLCompletionHandler") Block_stopRecordingWithOutputURLCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_stopRecordingWithOutputURLCompletionHandler {
        @Generated
        void call_stopRecordingWithOutputURLCompletionHandler(NSError error);
    }

    /**
     * Exports clip recording
     * <p>
     * Must be called after startClipBufferingWithCompletionHandler:, otherwise this will return an error. Exports clip
     * recording from newest samples in buffer for duration. handler Will be called after asset is finished writing to
     * output path. Will be passed an optional NSError in the RPRecordingErrorDomain domain if there was an issue
     * generating the clip recording.
     *
     * @param url      URL containing absolute path for where to save the clip
     * @param duration Length of time in seconds for clip recording, capped at either the elapsed time, or a maximum of
     *                 15 seconds, depending on which is the shorter amount of time
     */
    @Generated
    @Selector("exportClipToURL:duration:completionHandler:")
    public native void exportClipToURLDurationCompletionHandler(NSURL url, double duration,
            @ObjCBlock(name = "call_exportClipToURLDurationCompletionHandler") Block_exportClipToURLDurationCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_exportClipToURLDurationCompletionHandler {
        @Generated
        void call_exportClipToURLDurationCompletionHandler(NSError error);
    }

    /**
     * Start clip recording buffering with a completion handler. Note that before recording actually starts, the user
     * may be prompted with UI to confirm recording.
     * <p>
     * handler Called after clip recording is started. Will be passed an optional NSError in the RPRecordingErrorDomain
     * domain if there was an issue starting clip record buffering.
     */
    @Generated
    @Selector("startClipBufferingWithCompletionHandler:")
    public native void startClipBufferingWithCompletionHandler(
            @ObjCBlock(name = "call_startClipBufferingWithCompletionHandler") Block_startClipBufferingWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_startClipBufferingWithCompletionHandler {
        @Generated
        void call_startClipBufferingWithCompletionHandler(NSError error);
    }

    /**
     * Stop clip recording buffering with a completion handler.
     * <p>
     * handler Called after clip recording session is stopped. Will be passed an optional NSError in the
     * RPRecordingErrorDomain domain if there was an issue stopping clip record buffering.
     */
    @Generated
    @Selector("stopClipBufferingWithCompletionHandler:")
    public native void stopClipBufferingWithCompletionHandler(
            @ObjCBlock(name = "call_stopClipBufferingWithCompletionHandler") Block_stopClipBufferingWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_stopClipBufferingWithCompletionHandler {
        @Generated
        void call_stopClipBufferingWithCompletionHandler(NSError error);
    }
}

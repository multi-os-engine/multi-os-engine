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

package apple.avfoundation;

import apple.NSObject;
import apple.coregraphics.struct.CGPoint;
import apple.coregraphics.struct.CGRect;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.quartzcore.CALayer;
import apple.quartzcore.protocol.CAAction;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NFloat;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * AVCaptureVideoPreviewLayer
 * <p>
 * A CoreAnimation layer subclass for previewing the visual output of an AVCaptureSession.
 * <p>
 * An AVCaptureVideoPreviewLayer instance is a subclass of CALayer and is therefore suitable for insertion in a layer hierarchy as part of a graphical interface. One creates an AVCaptureVideoPreviewLayer instance with the capture session to be previewed, using +layerWithSession: or -initWithSession:. Using the @"videoGravity" property, one can influence how content is viewed relative to the layer bounds. On some hardware configurations, the orientation of the layer can be manipulated using @"orientation" and @"mirrored".
 */
@Generated
@Library("AVFoundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class AVCaptureVideoPreviewLayer extends CALayer {
    static {
        NatJ.register();
    }

    @Generated
    protected AVCaptureVideoPreviewLayer(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native AVCaptureVideoPreviewLayer alloc();

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

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("defaultActionForKey:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native CAAction defaultActionForKey(String event);

    @Generated
    @Selector("defaultValueForKey:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object defaultValueForKey(String key);

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
    @Selector("layer")
    public static native AVCaptureVideoPreviewLayer layer();

    /**
     * layerWithSession:
     * <p>
     * Creates an AVCaptureVideoPreviewLayer for previewing the visual output of the specified AVCaptureSession.
     *
     * @param session The AVCaptureSession instance to be previewed.
     * @return A newly initialized AVCaptureVideoPreviewLayer instance.
     */
    @Generated
    @Selector("layerWithSession:")
    public static native AVCaptureVideoPreviewLayer layerWithSession(AVCaptureSession session);

    /**
     * layerWithSessionWithNoConnection:
     * <p>
     * Creates an AVCaptureVideoPreviewLayer for previewing the visual output of the specified AVCaptureSession, but creates no connections to any of the session's eligible video inputs. Only use this initializer if you intend to manually form a connection between a desired AVCaptureInputPort and the receiver using AVCaptureSession's -addConnection: method.
     *
     * @param session The AVCaptureSession instance to be previewed.
     * @return A newly initialized AVCaptureVideoPreviewLayer instance.
     */
    @Generated
    @Selector("layerWithSessionWithNoConnection:")
    public static native AVCaptureVideoPreviewLayer layerWithSessionWithNoConnection(AVCaptureSession session);

    @Generated
    @Selector("needsDisplayForKey:")
    public static native boolean needsDisplayForKey(String key);

    @Generated
    @Owned
    @Selector("new")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object new_objc();

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

    /**
     * [@property] automaticallyAdjustsMirroring
     * <p>
     * Specifies whether or not the value of @"mirrored" can change based on configuration of the session.
     * <p>
     * For some session configurations, preview will be mirrored by default. When the value of this property is YES, the value of @"mirrored" may change depending on the configuration of the session, for example after switching to a different AVCaptureDeviceInput. The default value is YES. This property is deprecated. Use AVCaptureConnection's -automaticallyAdjustsVideoMirroring instead.
     */
    @Generated
    @Deprecated
    @Selector("automaticallyAdjustsMirroring")
    public native boolean automaticallyAdjustsMirroring();

    /**
     * captureDevicePointOfInterestForPoint:
     * <p>
     * Converts a point in layer coordinates to a point of interest in the coordinate space of the capture device providing input to the layer.
     * <p>
     * AVCaptureDevice pointOfInterest is expressed as a CGPoint where {0,0} represents the top left of the picture area, and {1,1} represents the bottom right on an unrotated picture. This convenience method converts a point in the coordinate space of the receiver to a point of interest in the coordinate space of the AVCaptureDevice providing input to the receiver. The conversion takes frameSize and videoGravity into consideration.
     *
     * @param pointInLayer A CGPoint in layer coordinates.
     * @return A CGPoint in the coordinate space of the capture device providing input to the layer.
     */
    @Generated
    @Selector("captureDevicePointOfInterestForPoint:")
    @ByValue
    public native CGPoint captureDevicePointOfInterestForPoint(@ByValue CGPoint pointInLayer);

    /**
     * [@property] connection
     * <p>
     * The AVCaptureConnection instance describing the AVCaptureInputPort to which the receiver is connected.
     * <p>
     * When calling initWithSession: or setSession: with a valid AVCaptureSession instance, a connection is formed to the first eligible video AVCaptureInput. If the receiver is detached from a session, the connection property becomes nil.
     */
    @Generated
    @Selector("connection")
    public native AVCaptureConnection connection();

    @Generated
    @Selector("init")
    public native AVCaptureVideoPreviewLayer init();

    @Generated
    @Selector("initWithCoder:")
    public native AVCaptureVideoPreviewLayer initWithCoder(NSCoder coder);

    @Generated
    @Selector("initWithLayer:")
    public native AVCaptureVideoPreviewLayer initWithLayer(@Mapped(ObjCObjectMapper.class) Object layer);

    /**
     * initWithSession:
     * <p>
     * Creates an AVCaptureVideoPreviewLayer for previewing the visual output of the specified AVCaptureSession.
     *
     * @param session The AVCaptureSession instance to be previewed.
     * @return A newly initialized AVCaptureVideoPreviewLayer instance.
     */
    @Generated
    @Selector("initWithSession:")
    public native AVCaptureVideoPreviewLayer initWithSession(AVCaptureSession session);

    /**
     * initWithSessionWithNoConnection:
     * <p>
     * Creates an AVCaptureVideoPreviewLayer for previewing the visual output of the specified AVCaptureSession, but creates no connections to any of the session's eligible video inputs. Only use this initializer if you intend to manually form a connection between a desired AVCaptureInputPort and the receiver using AVCaptureSession's -addConnection: method.
     *
     * @param session The AVCaptureSession instance to be previewed.
     * @return A newly initialized AVCaptureVideoPreviewLayer instance.
     */
    @Generated
    @Selector("initWithSessionWithNoConnection:")
    public native AVCaptureVideoPreviewLayer initWithSessionWithNoConnection(AVCaptureSession session);

    /**
     * [@property] mirrored
     * <p>
     * Specifies whether or not the preview is flipped over a vertical axis.
     * <p>
     * For most applications, it is unnecessary to manipulate preview mirroring manually if @"automaticallyAdjustsMirroring" is set to YES. The value of @"automaticallyAdjustsMirroring" must be NO in order to set @"mirrored". The value of @"mirroringSupported" must be YES in order to set @"mirrored". An exception will be raised if the value of @"mirrored" is mutated without respecting these requirements. This property is deprecated. Use AVCaptureConnection's -videoMirrored instead.
     */
    @Generated
    @Deprecated
    @Selector("isMirrored")
    public native boolean isMirrored();

    /**
     * [@property] mirrored
     * <p>
     * Specifies whether or not the preview is flipped over a vertical axis.
     * <p>
     * For most applications, it is unnecessary to manipulate preview mirroring manually if @"automaticallyAdjustsMirroring" is set to YES. The value of @"automaticallyAdjustsMirroring" must be NO in order to set @"mirrored". The value of @"mirroringSupported" must be YES in order to set @"mirrored". An exception will be raised if the value of @"mirrored" is mutated without respecting these requirements. This property is deprecated. Use AVCaptureConnection's -videoMirrored instead.
     */
    @Generated
    @Deprecated
    @Selector("setMirrored:")
    public native void setMirrored(boolean value);

    /**
     * [@property] mirroringSupported
     * <p>
     * Specifies whether or not the preview layer supports mirroring.
     * <p>
     * Mirroring is not supported on all hardware configurations. An application should check the value of @"mirroringSupported" before attempting to manipulate mirroring on the receiver. This property is deprecated. Use AVCaptureConnection's -isVideoMirroringSupported instead.
     */
    @Generated
    @Deprecated
    @Selector("isMirroringSupported")
    public native boolean isMirroringSupported();

    /**
     * [@property] orientationSupported
     * <p>
     * Specifies whether or not the preview layer supports orientation.
     * <p>
     * Changes in orientation are not supported on all hardware configurations. An application should check the value of @"orientationSupported" before attempting to manipulate the orientation of the receiver. This property is deprecated. Use AVCaptureConnection's -isVideoOrientationSupported instead.
     */
    @Generated
    @Deprecated
    @Selector("isOrientationSupported")
    public native boolean isOrientationSupported();

    /**
     * metadataOutputRectOfInterestForRect:
     * <p>
     * Converts a rectangle in layer coordinates to a rectangle of interest in the coordinate space of an AVCaptureMetadataOutput whose capture device is providing input to the layer.
     * <p>
     * AVCaptureMetadataOutput rectOfInterest is expressed as a CGRect where {0,0} represents the top left of the picture area, and {1,1} represents the bottom right on an unrotated picture. This convenience method converts a rectangle in the coordinate space of the receiver to a rectangle of interest in the coordinate space of an AVCaptureMetadataOutput whose AVCaptureDevice is providing input to the receiver. The conversion takes frame size and videoGravity into consideration.
     *
     * @param rectInLayerCoordinates A CGRect in layer coordinates.
     * @return A CGRect in the coordinate space of the metadata output whose capture device is providing input to the layer.
     */
    @Generated
    @Selector("metadataOutputRectOfInterestForRect:")
    @ByValue
    public native CGRect metadataOutputRectOfInterestForRect(@ByValue CGRect rectInLayerCoordinates);

    /**
     * [@property] orientation
     * <p>
     * Specifies the orientation of the preview layer.
     * <p>
     * AVCaptureVideoOrientation and its constants are defined in AVCaptureSession.h. The value of @"orientationSupported" must be YES in order to set @"orientation". An exception will be raised if this requirement is ignored. This property is deprecated. Use AVCaptureConnection's -videoOrientation instead.
     */
    @Generated
    @Deprecated
    @Selector("orientation")
    @NInt
    public native long orientation();

    /**
     * pointForCaptureDevicePointOfInterest:
     * <p>
     * Converts a point of interest in the coordinate space of the capture device providing input to the layer to a point in layer coordinates.
     * <p>
     * AVCaptureDevice pointOfInterest is expressed as a CGPoint where {0,0} represents the top left of the picture area, and {1,1} represents the bottom right on an unrotated picture. This convenience method converts a point in the coordinate space of the AVCaptureDevice providing input to the coordinate space of the receiver. The conversion takes frame size and videoGravity into consideration.
     *
     * @param captureDevicePointOfInterest A CGPoint in the coordinate space of the capture device providing input to the layer.
     * @return A CGPoint in layer coordinates.
     */
    @Generated
    @Selector("pointForCaptureDevicePointOfInterest:")
    @ByValue
    public native CGPoint pointForCaptureDevicePointOfInterest(@ByValue CGPoint captureDevicePointOfInterest);

    /**
     * rectForMetadataOutputRectOfInterest:
     * <p>
     * Converts a rectangle of interest in the coordinate space of an AVCaptureMetadataOutput whose capture device is providing input to the layer to a rectangle in layer coordinates.
     * <p>
     * AVCaptureMetadataOutput rectOfInterest is expressed as a CGRect where {0,0} represents the top left of the picture area, and {1,1} represents the bottom right on an unrotated picture. This convenience method converts a rectangle in the coordinate space of an AVCaptureMetadataOutput whose AVCaptureDevice is providing input to the coordinate space of the receiver. The conversion takes frame size and videoGravity into consideration.
     *
     * @param rectInMetadataOutputCoordinates A CGRect in the coordinate space of the metadata output whose capture device is providing input to the layer.
     * @return A CGRect in layer coordinates.
     */
    @Generated
    @Selector("rectForMetadataOutputRectOfInterest:")
    @ByValue
    public native CGRect rectForMetadataOutputRectOfInterest(@ByValue CGRect rectInMetadataOutputCoordinates);

    /**
     * [@property] session
     * <p>
     * The AVCaptureSession instance being previewed by the receiver.
     * <p>
     * The session is retained by the preview layer.
     */
    @Generated
    @Selector("session")
    public native AVCaptureSession session();

    /**
     * [@property] automaticallyAdjustsMirroring
     * <p>
     * Specifies whether or not the value of @"mirrored" can change based on configuration of the session.
     * <p>
     * For some session configurations, preview will be mirrored by default. When the value of this property is YES, the value of @"mirrored" may change depending on the configuration of the session, for example after switching to a different AVCaptureDeviceInput. The default value is YES. This property is deprecated. Use AVCaptureConnection's -automaticallyAdjustsVideoMirroring instead.
     */
    @Generated
    @Deprecated
    @Selector("setAutomaticallyAdjustsMirroring:")
    public native void setAutomaticallyAdjustsMirroring(boolean value);

    /**
     * [@property] orientation
     * <p>
     * Specifies the orientation of the preview layer.
     * <p>
     * AVCaptureVideoOrientation and its constants are defined in AVCaptureSession.h. The value of @"orientationSupported" must be YES in order to set @"orientation". An exception will be raised if this requirement is ignored. This property is deprecated. Use AVCaptureConnection's -videoOrientation instead.
     */
    @Generated
    @Deprecated
    @Selector("setOrientation:")
    public native void setOrientation(@NInt long value);

    /**
     * [@property] session
     * <p>
     * The AVCaptureSession instance being previewed by the receiver.
     * <p>
     * The session is retained by the preview layer.
     */
    @Generated
    @Selector("setSession:")
    public native void setSession(AVCaptureSession value);

    /**
     * method setSessionWithNoConnection:
     * <p>
     * Attaches the receiver to a given session without implicitly forming a connection to the first eligible video AVCaptureInputPort. Only use this setter if you intend to manually form a connection between a desired AVCaptureInputPort and the receiver using AVCaptureSession's -addConnection: method.
     * <p>
     * The session is retained by the preview layer.
     */
    @Generated
    @Selector("setSessionWithNoConnection:")
    public native void setSessionWithNoConnection(AVCaptureSession session);

    /**
     * [@property] videoGravity
     * <p>
     * A string defining how the video is displayed within an AVCaptureVideoPreviewLayer bounds rect.
     * <p>
     * Options are AVLayerVideoGravityResize, AVLayerVideoGravityResizeAspect and AVLayerVideoGravityResizeAspectFill. AVLayerVideoGravityResizeAspect is default. See <AVFoundation/AVAnimation.h> for a description of these options.
     */
    @Generated
    @Selector("setVideoGravity:")
    public native void setVideoGravity(String value);

    /**
     * transformedMetadataObjectForMetadataObject:
     * <p>
     * Converts an AVMetadataObject's visual properties to layer coordinates.
     * <p>
     * AVMetadataObject bounds may be expressed as a rect where {0,0} represents the top left of the picture area, and {1,1} represents the bottom right on an unrotated picture. Face metadata objects likewise express yaw and roll angles with respect to an unrotated picture. -transformedMetadataObjectForMetadataObject: converts the visual properties in the coordinate space of the supplied AVMetadataObject to the coordinate space of the receiver. The conversion takes orientation, mirroring, layer bounds and videoGravity into consideration. If the provided metadata object originates from an input source other than the preview layer's, nil will be returned.
     *
     * @param metadataObject An AVMetadataObject originating from the same AVCaptureInput as the preview layer.
     * @return An AVMetadataObject whose properties are in layer coordinates.
     */
    @Generated
    @Selector("transformedMetadataObjectForMetadataObject:")
    public native AVMetadataObject transformedMetadataObjectForMetadataObject(AVMetadataObject metadataObject);

    /**
     * [@property] videoGravity
     * <p>
     * A string defining how the video is displayed within an AVCaptureVideoPreviewLayer bounds rect.
     * <p>
     * Options are AVLayerVideoGravityResize, AVLayerVideoGravityResizeAspect and AVLayerVideoGravityResizeAspectFill. AVLayerVideoGravityResizeAspect is default. See <AVFoundation/AVAnimation.h> for a description of these options.
     */
    @Generated
    @Selector("videoGravity")
    public native String videoGravity();

    @Generated
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    @Generated
    @Selector("cornerCurveExpansionFactor:")
    @NFloat
    public static native double cornerCurveExpansionFactor(String curve);

    /**
     * [@property] previewing
     * <p>
     * A BOOL value indicating whether the receiver is currently rendering video frames from its source.
     * <p>
     * An AVCaptureVideoPreviewLayer begins previewing when -[AVCaptureSession startRunning] is called. When associated with an AVCaptureMultiCamSession, all video preview layers are guaranteed to be previewing by the time the blocking call to -startRunning or -commitConfiguration returns. While a session is running, you may enable or disable a video preview layer's connection to re-start or stop the flow of video to the layer. Once you've set enabled to YES, you can observe this property changing from NO to YES and synchronize any UI to take place precisely when the video resumes rendering to the video preview layer.
     */
    @Generated
    @Selector("isPreviewing")
    public native boolean isPreviewing();
}

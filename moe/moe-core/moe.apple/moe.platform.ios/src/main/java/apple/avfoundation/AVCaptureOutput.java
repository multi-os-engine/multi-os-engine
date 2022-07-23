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
import apple.coregraphics.struct.CGRect;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
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
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * AVCaptureOutput
 * <p>
 * AVCaptureOutput is an abstract class that defines an interface for an output destination of an AVCaptureSession.
 * <p>
 * AVCaptureOutput provides an abstract interface for connecting capture output destinations, such as files and video
 * previews, to an AVCaptureSession.
 * <p>
 * An AVCaptureOutput can have multiple connections represented by AVCaptureConnection objects, one for each stream of
 * media that it receives from an AVCaptureInput. An AVCaptureOutput does not have any connections when it is first
 * created. When an output is added to an AVCaptureSession, connections are created that map media data from that
 * session's inputs to its outputs.
 * <p>
 * Concrete AVCaptureOutput instances can be added to an AVCaptureSession using the -[AVCaptureSession addOutput:] and
 * -[AVCaptureSession addOutputWithNoConnections:] methods.
 */
@Generated
@Library("AVFoundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class AVCaptureOutput extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected AVCaptureOutput(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native AVCaptureOutput alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native AVCaptureOutput allocWithZone(VoidPtr zone);

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
    public static native AVCaptureOutput new_objc();

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
     * connectionWithMediaType:
     * <p>
     * Returns the first connection in the connections array with an inputPort of the specified mediaType.
     * <p>
     * This convenience method returns the first AVCaptureConnection in the receiver's connections array that has an
     * AVCaptureInputPort of the specified mediaType. If no connection with the specified mediaType is found, nil is
     * returned.
     *
     * @param mediaType An AVMediaType constant from AVMediaFormat.h, e.g. AVMediaTypeVideo.
     */
    @Generated
    @Selector("connectionWithMediaType:")
    public native AVCaptureConnection connectionWithMediaType(String mediaType);

    /**
     * [@property] connections
     * <p>
     * The connections that describe the flow of media data to the receiver from AVCaptureInputs.
     * <p>
     * The value of this property is an NSArray of AVCaptureConnection objects, each describing the mapping between the
     * receiver and the AVCaptureInputPorts of one or more AVCaptureInputs.
     */
    @Generated
    @Selector("connections")
    public native NSArray<? extends AVCaptureConnection> connections();

    @Generated
    @Selector("init")
    public native AVCaptureOutput init();

    /**
     * metadataOutputRectOfInterestForRect:
     * <p>
     * Converts a rectangle in the receiver's coordinate space to a rectangle of interest in the coordinate space of an
     * AVCaptureMetadataOutput whose capture device is providing input to the receiver.
     * <p>
     * AVCaptureMetadataOutput rectOfInterest is expressed as a CGRect where {0,0} represents the top left of the
     * picture area, and {1,1} represents the bottom right on an unrotated picture. This convenience method converts a
     * rectangle in the coordinate space of the receiver to a rectangle of interest in the coordinate space of an
     * AVCaptureMetadataOutput whose AVCaptureDevice is providing input to the receiver. The conversion takes
     * orientation, mirroring, and scaling into consideration. See
     * -transformedMetadataObjectForMetadataObject:connection: for a full discussion of how orientation and mirroring
     * are applied to sample buffers passing through the output.
     *
     * @param rectInOutputCoordinates A CGRect in the receiver's coordinates.
     * @return A CGRect in the coordinate space of the metadata output whose capture device is providing input to the
     *         receiver.
     */
    @Generated
    @Selector("metadataOutputRectOfInterestForRect:")
    @ByValue
    public native CGRect metadataOutputRectOfInterestForRect(@ByValue CGRect rectInOutputCoordinates);

    /**
     * rectForMetadataOutputRectOfInterest:
     * <p>
     * Converts a rectangle of interest in the coordinate space of an AVCaptureMetadataOutput whose capture device is
     * providing input to the receiver to a rectangle in the receiver's coordinates.
     * <p>
     * AVCaptureMetadataOutput rectOfInterest is expressed as a CGRect where {0,0} represents the top left of the
     * picture area, and {1,1} represents the bottom right on an unrotated picture. This convenience method converts a
     * rectangle in the coordinate space of an AVCaptureMetadataOutput whose AVCaptureDevice is providing input to the
     * coordinate space of the receiver. The conversion takes orientation, mirroring, and scaling into consideration.
     * See -transformedMetadataObjectForMetadataObject:connection: for a full discussion of how orientation and
     * mirroring are applied to sample buffers passing through the output.
     *
     * @param rectInMetadataOutputCoordinates A CGRect in the coordinate space of the metadata output whose capture
     *                                        device is providing input to the receiver.
     * @return A CGRect in the receiver's coordinates.
     */
    @Generated
    @Selector("rectForMetadataOutputRectOfInterest:")
    @ByValue
    public native CGRect rectForMetadataOutputRectOfInterest(@ByValue CGRect rectInMetadataOutputCoordinates);

    /**
     * transformedMetadataObjectForMetadataObject:connection:
     * <p>
     * Converts an AVMetadataObject's visual properties to the receiver's coordinates.
     * <p>
     * AVMetadataObject bounds may be expressed as a rect where {0,0} represents the top left of the picture area, and
     * {1,1} represents the bottom right on an unrotated picture. Face metadata objects likewise express yaw and roll
     * angles with respect to an unrotated picture. -transformedMetadataObjectForMetadataObject:connection: converts the
     * visual properties in the coordinate space of the supplied AVMetadataObject to the coordinate space of the
     * receiver. The conversion takes orientation, mirroring, and scaling into consideration. If the provided metadata
     * object originates from an input source other than the preview layer's, nil will be returned.
     * <p>
     * If an AVCaptureVideoDataOutput instance's connection's videoOrientation or videoMirrored properties are set to
     * non-default values, the output applies the desired mirroring and orientation by physically rotating and or
     * flipping sample buffers as they pass through it. AVCaptureStillImageOutput, on the other hand, does not
     * physically rotate its buffers. It attaches an appropriate kCGImagePropertyOrientation number to captured still
     * image buffers (see ImageIO/CGImageProperties.h) indicating how the image should be displayed on playback.
     * Likewise, AVCaptureMovieFileOutput does not physically apply orientation/mirroring to its sample buffers -- it
     * uses a QuickTime track matrix to indicate how the buffers should be rotated and/or flipped on playback.
     * <p>
     * transformedMetadataObjectForMetadataObject:connection: alters the visual properties of the provided metadata
     * object to match the physical rotation / mirroring of the sample buffers provided by the receiver through the
     * indicated connection. I.e., for video data output, adjusted metadata object coordinates are rotated/mirrored. For
     * still image and movie file output, they are not.
     *
     * @param metadataObject An AVMetadataObject originating from the same AVCaptureInput as the receiver.
     * @param connection     The receiver's connection whose AVCaptureInput matches that of the metadata object to be
     *                       converted.
     * @return An AVMetadataObject whose properties are in output coordinates.
     */
    @Generated
    @Selector("transformedMetadataObjectForMetadataObject:connection:")
    public native AVMetadataObject transformedMetadataObjectForMetadataObjectConnection(AVMetadataObject metadataObject,
            AVCaptureConnection connection);
}

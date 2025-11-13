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

package apple.coreimage;

import apple.NSObject;
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
import apple.corefoundation.struct.CGPoint;
import apple.corefoundation.struct.CGRect;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Information about a face detected in a still or video image.
 * 
 * > Note: In macOS 10.13, iOS 11, and tvOS 11 or later, the Vision framework replaces this
 * class for identifying and analyzing image features. See `VNDetectFaceRectanglesRequest`.
 * See <doc://com.apple.documentation/documentation/vision/vndetectfacerectanglesrequest>)
 * 
 * The properties of a `CIFaceFeature` object provide information about the face’s eyes and mouth.
 * A face object in a video can also have properties that track its location over time, tracking ID and frame count.
 */
@Generated
@Library("CoreImage")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class CIFaceFeature extends CIFeature {
    static {
        NatJ.register();
    }

    @Generated
    protected CIFaceFeature(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native CIFaceFeature alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native CIFaceFeature allocWithZone(VoidPtr zone);

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

    @NotNull
    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    @Generated
    @Owned
    @Selector("new")
    public static native CIFaceFeature new_objc();

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
     * A rectangle indicating the position and extent of the face feature in image coordinates.
     */
    @Generated
    @Selector("bounds")
    @ByValue
    public native CGRect bounds();

    /**
     * The rotation of the face.
     * 
     * Rotation is measured counterclockwise in degrees, with zero indicating that a line drawn between
     * the eyes is horizontal relative to the image orientation.
     */
    @Generated
    @Selector("faceAngle")
    public native float faceAngle();

    /**
     * A Boolean value that indicates whether information about face rotation is available.
     */
    @Generated
    @Selector("hasFaceAngle")
    public native boolean hasFaceAngle();

    /**
     * A Boolean value that indicates whether the detector found the face’s left eye.
     */
    @Generated
    @Selector("hasLeftEyePosition")
    public native boolean hasLeftEyePosition();

    /**
     * A Boolean value that indicates whether the detector found the face’s mouth.
     */
    @Generated
    @Selector("hasMouthPosition")
    public native boolean hasMouthPosition();

    /**
     * A Boolean value that indicates whether the detector found the face’s right eye.
     */
    @Generated
    @Selector("hasRightEyePosition")
    public native boolean hasRightEyePosition();

    /**
     * A Boolean value that indicates whether a smile is detected in the face.
     * 
     * To detect smiles, ``/CIDetector/featuresInImage:options:`` needs to be called with the ``CIDetectorSmile`` option
     * set to true.
     */
    @Generated
    @Selector("hasSmile")
    public native boolean hasSmile();

    /**
     * A Boolean value that indicates the face object has a tracking frame count.
     */
    @Generated
    @Selector("hasTrackingFrameCount")
    public native boolean hasTrackingFrameCount();

    /**
     * A Boolean value that indicates whether the face object has a tracking ID.
     */
    @Generated
    @Selector("hasTrackingID")
    public native boolean hasTrackingID();

    @Generated
    @Selector("init")
    public native CIFaceFeature init();

    /**
     * A Boolean value that indicates whether a closed left eye is detected in the face.
     * 
     * To detect closed eyes, ``/CIDetector/featuresInImage:options:`` needs to be called with the
     * ``CIDetectorEyeBlink`` option set to true.
     */
    @Generated
    @Selector("leftEyeClosed")
    public native boolean leftEyeClosed();

    /**
     * The image coordinate of the center of the left eye.
     * 
     * > Note: The left eye is on the left side of the face from the observer's perspective.
     * It is not the left eye from the subject's perspective.
     */
    @Generated
    @Selector("leftEyePosition")
    @ByValue
    public native CGPoint leftEyePosition();

    /**
     * The image coordinate of the center of the mouth.
     */
    @Generated
    @Selector("mouthPosition")
    @ByValue
    public native CGPoint mouthPosition();

    /**
     * A Boolean value that indicates whether a closed right eye is detected in the face.
     * 
     * To detect closed eyes, ``/CIDetector/featuresInImage:options:`` needs to be called with the
     * ``CIDetectorEyeBlink`` option set to true.
     */
    @Generated
    @Selector("rightEyeClosed")
    public native boolean rightEyeClosed();

    /**
     * The image coordinate of the center of the right eye.
     * 
     * > Note: The right eye is on the right side of the face from the observer's perspective.
     * It is not the right eye from the subject's perspective.
     */
    @Generated
    @Selector("rightEyePosition")
    @ByValue
    public native CGPoint rightEyePosition();

    /**
     * The tracking frame count of the face.
     */
    @Generated
    @Selector("trackingFrameCount")
    public native int trackingFrameCount();

    /**
     * The tracking identifier of the face object.
     * 
     * Core Image provides a tracking identifier for faces it detects in a video stream, which you can
     * use to identify when a CIFaceFeature objects detected in one video frame is the same face detected
     * in a previous video frame.
     * 
     * This identifier persists only as long as a face is in the frame and is not associated with a specific
     * face. In other words, if a face moves out of the video frame and comes back into the frame later,
     * another ID is assigned. (Core Image detects faces, but does not recognize specific faces.)
     */
    @Generated
    @Selector("trackingID")
    public native int trackingID();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}

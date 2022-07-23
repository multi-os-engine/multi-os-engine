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
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSCopying;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
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
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * AVMetadataFaceObject
 * <p>
 * AVMetadataFaceObject is a concrete subclass of AVMetadataObject defining the features of a detected face.
 * <p>
 * AVMetadataFaceObject represents a single detected face in a picture. It is an immutable object describing the various
 * features found in the face.
 * <p>
 * On supported platforms, AVCaptureMetadataOutput outputs arrays of detected face objects. See AVCaptureOutput.h.
 */
@Generated
@Library("AVFoundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class AVMetadataFaceObject extends AVMetadataObject implements NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected AVMetadataFaceObject(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native AVMetadataFaceObject alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native AVMetadataFaceObject allocWithZone(VoidPtr zone);

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
    public static native AVMetadataFaceObject new_objc();

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

    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(VoidPtr zone);

    /**
     * [@property] faceID
     * <p>
     * A unique number associated with the receiver.
     * <p>
     * The value of this property is an NSInteger indicating the unique identifier of this face in the picture. When a
     * new face enters the picture, it is assigned a new unique identifier. faceIDs are not re-used as faces leave the
     * picture and new ones enter. Faces that leave the picture then re-enter are assigned a new faceID.
     */
    @Generated
    @Selector("faceID")
    @NInt
    public native long faceID();

    /**
     * [@property] hasRollAngle
     * <p>
     * A BOOL indicating whether the rollAngle property is valid for this receiver.
     */
    @Generated
    @Selector("hasRollAngle")
    public native boolean hasRollAngle();

    /**
     * [@property] hasYawAngle
     * <p>
     * A BOOL indicating whether the yawAngle property is valid for this receiver.
     */
    @Generated
    @Selector("hasYawAngle")
    public native boolean hasYawAngle();

    @Generated
    @Selector("init")
    public native AVMetadataFaceObject init();

    /**
     * [@property] rollAngle
     * <p>
     * The roll angle of the face in degrees.
     * <p>
     * The value of this property is a CGFloat indicating the face's angle of roll (or tilt) in degrees. A value of 0.0
     * indicates that the face is level in the picture. If -hasRollAngle returns NO, then reading this property throws
     * an NSGenericException.
     */
    @Generated
    @Selector("rollAngle")
    @NFloat
    public native double rollAngle();

    /**
     * [@property] yawAngle
     * <p>
     * The yaw angle of the face in degrees.
     * <p>
     * The value of this property is a CGFloat indicating the face's angle of yaw (or turn) in degrees. A value of 0.0
     * indicates that the face is straight on in the picture. If -hasYawAngle returns NO, then reading this property
     * throws an NSGenericException.
     */
    @Generated
    @Selector("yawAngle")
    @NFloat
    public native double yawAngle();
}

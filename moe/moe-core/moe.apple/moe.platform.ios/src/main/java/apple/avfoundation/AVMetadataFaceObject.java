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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * AVMetadataFaceObject
 * 
 * AVMetadataFaceObject is a concrete subclass of AVMetadataObject defining the features of a detected face.
 * 
 * AVMetadataFaceObject represents a single detected face in a picture. It is an immutable object describing the various
 * features found in the face.
 * 
 * On supported platforms, AVCaptureMetadataOutput outputs arrays of detected face objects. See AVCaptureOutput.h.
 * 
 * API-Since: 6.0
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

    @NotNull
    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(@Nullable VoidPtr zone);

    /**
     * [@property] faceID
     * 
     * A unique number associated with the receiver.
     * 
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
     * 
     * A BOOL indicating whether the rollAngle property is valid for this receiver.
     */
    @Generated
    @Selector("hasRollAngle")
    public native boolean hasRollAngle();

    /**
     * [@property] hasYawAngle
     * 
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
     * 
     * The roll angle of the face in degrees.
     * 
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
     * 
     * The yaw angle of the face in degrees.
     * 
     * The value of this property is a CGFloat indicating the face's angle of yaw (or turn) in degrees. A value of 0.0
     * indicates that the face is straight on in the picture. If -hasYawAngle returns NO, then reading this property
     * throws an NSGenericException.
     */
    @Generated
    @Selector("yawAngle")
    @NFloat
    public native double yawAngle();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}

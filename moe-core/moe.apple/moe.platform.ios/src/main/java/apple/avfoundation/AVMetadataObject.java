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
import apple.coremedia.struct.CMTime;
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
import apple.corefoundation.struct.CGRect;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * AVMetadataObject
 * 
 * AVMetadataObject is an abstract class that defines an interface for a metadata object used by AVFoundation.
 * 
 * AVMetadataObject provides an abstract interface for metadata associated with a piece of media. One example is face
 * metadata that might be detected in a picture. All metadata objects have a time, duration, bounds, and type.
 * 
 * The concrete AVMetadataFaceObject is used by AVCaptureMetadataOutput for face detection.
 * 
 * API-Since: 6.0
 */
@Generated
@Library("AVFoundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class AVMetadataObject extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected AVMetadataObject(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native AVMetadataObject alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native AVMetadataObject allocWithZone(VoidPtr zone);

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
    public static native AVMetadataObject new_objc();

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
     * [@property] bounds
     * 
     * The bounding rectangle of the receiver.
     * 
     * The value of this property is a CGRect representing the bounding rectangle of the object with respect to the
     * picture in which it resides. The rectangle's origin is top left. If the metadata originates from video, bounds
     * may be expressed as scalar values from 0. - 1. If the original video has been scaled down, the bounds of the
     * metadata object still are meaningful. This property may return CGRectZero if the metadata has no bounds.
     * 
     * API-Since: 6.0
     */
    @Generated
    @Selector("bounds")
    @ByValue
    public native CGRect bounds();

    /**
     * [@property] duration
     * 
     * The media duration associated with this metadata object.
     * 
     * The value of this property is a CMTime representing the duration of the metadata object. If this metadata object
     * originates from a CMSampleBuffer, its duration matches the sample buffer's duration. This property may return
     * kCMTimeInvalid.
     * 
     * API-Since: 6.0
     */
    @Generated
    @Selector("duration")
    @ByValue
    public native CMTime duration();

    @Generated
    @Selector("init")
    public native AVMetadataObject init();

    /**
     * [@property] time
     * 
     * The media time associated with this metadata object.
     * 
     * The value of this property is a CMTime associated with the metadata object. For capture, it is the time at which
     * this object was captured. If this metadata object originates from a CMSampleBuffer, its time matches the sample
     * buffer's presentation time. This property may return kCMTimeInvalid.
     * 
     * API-Since: 6.0
     */
    @Generated
    @Selector("time")
    @ByValue
    public native CMTime time();

    /**
     * [@property] type
     * 
     * An identifier for the metadata object.
     * 
     * The value of this property is an AVMetadataObjectType representing the type of the metadata object. Clients
     * inspecting a collection of metadata objects can use this property to filter objects with a matching type.
     * 
     * API-Since: 6.0
     */
    @NotNull
    @Generated
    @Selector("type")
    public native String type();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();

    /**
     * The current focus mode when an object is detected during a Cinematic Video recording.
     * 
     * Default is ``AVCaptureCinematicVideoFocusMode/AVCaptureCinematicVideoFocusModeNone``.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("cinematicVideoFocusMode")
    @NInt
    public native long cinematicVideoFocusMode();

    /**
     * An identifier associated with a metadata object used to group it with other metadata objects belonging to a
     * common parent.
     * 
     * When presented with a collection of ``AVMetadataObject`` instances of different types, you may use the objects'
     * ``groupID`` to combine them into groups. For example, a human body and face belonging to the same person have the
     * same ``groupID``. If an object's ``groupID`` property is set to -1, it is invalid. When set to a value of >=0, it
     * is unique across all object groups.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("groupID")
    @NInt
    public native long groupID();

    /**
     * A BOOL indicating whether this metadata object represents a fixed focus.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("isFixedFocus")
    public native boolean isFixedFocus();

    /**
     * A unique identifier for each detected object type (face, body, hands, heads and salient objects) in a collection.
     * 
     * Defaults to a value of -1 when invalid or not available. When used in conjunction with an
     * ``AVCaptureMetadataOutput``, each newly detected object that enters the scene is assigned a unique identifier.
     * ``objectID``s are never re-used as objects leave the picture and new ones enter. Objects that leave the picture
     * and then re-enter are assigned a new ``objectID``.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("objectID")
    @NInt
    public native long objectID();
}

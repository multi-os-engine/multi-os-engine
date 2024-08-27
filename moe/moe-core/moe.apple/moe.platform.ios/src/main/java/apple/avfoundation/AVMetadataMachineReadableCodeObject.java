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
import apple.coreimage.CIBarcodeDescriptor;
import apple.foundation.NSArray;
import apple.foundation.NSDictionary;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * AVMetadataMachineReadableCodeObject
 * 
 * AVMetadataMachineReadableCodeObject is a concrete subclass of AVMetadataObject defining the features of a detected
 * one-dimensional or two-dimensional barcode.
 * 
 * AVMetadataMachineReadableCodeObject represents a single detected machine readable code in a picture. It is an
 * immutable object describing the features and payload of a barcode.
 * 
 * On supported platforms, AVCaptureMetadataOutput outputs arrays of detected machine readable code objects. See
 * AVCaptureMetadataOutput.h.
 * 
 * API-Since: 7.0
 */
@Generated
@Library("AVFoundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class AVMetadataMachineReadableCodeObject extends AVMetadataObject {
    static {
        NatJ.register();
    }

    @Generated
    protected AVMetadataMachineReadableCodeObject(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native AVMetadataMachineReadableCodeObject alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native AVMetadataMachineReadableCodeObject allocWithZone(VoidPtr zone);

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
    public static native AVMetadataMachineReadableCodeObject new_objc();

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
     * [@property] corners
     * 
     * The points defining the (X,Y) locations of the corners of the machine-readable code.
     * 
     * The value of this property is an NSArray of NSDictionaries, each of which has been created from a CGPoint using
     * CGPointCreateDictionaryRepresentation(), representing the coordinates of the corners of the object with respect
     * to the image in which it resides. If the metadata originates from video, the points may be expressed as scalar
     * values from 0. - 1. The points in the corners differ from the bounds rectangle in that bounds is axis-aligned to
     * orientation of the captured image, and the values of the corners reside within the bounds rectangle. The points
     * are arranged in counter-clockwise order (clockwise if the code or image is mirrored), starting with the top-left
     * of the code in its canonical orientation.
     */
    @NotNull
    @Generated
    @Selector("corners")
    public native NSArray<? extends NSDictionary<?, ?>> corners();

    @Generated
    @Selector("init")
    public native AVMetadataMachineReadableCodeObject init();

    /**
     * [@property] stringValue
     * 
     * Returns the receiver's errorCorrectedData decoded into a human-readable string.
     * 
     * The value of this property is an NSString created by decoding the binary payload according to the format of the
     * machine readable code. Returns nil if a string representation cannot be created from the payload.
     */
    @Nullable
    @Generated
    @Selector("stringValue")
    public native String stringValue();

    /**
     * [@property] descriptor
     * 
     * An abstract representation of a machine readable code's symbol attributes.
     * 
     * The value may be nil if an abstract representation of a machine readable code object is not defined for the code
     * type or could not be detected.
     * 
     * API-Since: 11.0
     */
    @Nullable
    @Generated
    @Selector("descriptor")
    public native CIBarcodeDescriptor descriptor();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}

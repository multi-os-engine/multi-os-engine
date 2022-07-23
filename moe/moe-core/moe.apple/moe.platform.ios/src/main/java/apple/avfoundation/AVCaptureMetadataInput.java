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
import apple.coremedia.opaque.CMClockRef;
import apple.coremedia.opaque.CMFormatDescriptionRef;
import apple.foundation.NSArray;
import apple.foundation.NSError;
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
import org.moe.natj.general.ann.ReferenceInfo;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * AVCaptureMetadataInput
 * <p>
 * AVCaptureMetadataInput is a concrete subclass of AVCaptureInput that provides a way for clients to supply
 * AVMetadataItems to an AVCaptureSession.
 * <p>
 * Instances of AVCaptureMetadataInput are input sources for AVCaptureSession that provide AVMetadataItems to an
 * AVCaptureSession. AVCaptureMetadataInputs present one and only one AVCaptureInputPort, which currently may only be
 * connected to an AVCaptureMovieFileOutput. The metadata supplied over the input port is provided by the client, and
 * must conform to a client-supplied CMFormatDescription. The AVMetadataItems are supplied in an AVTimedMetadataGroup.
 */
@Generated
@Library("AVFoundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class AVCaptureMetadataInput extends AVCaptureInput {
    static {
        NatJ.register();
    }

    @Generated
    protected AVCaptureMetadataInput(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native AVCaptureMetadataInput alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native AVCaptureMetadataInput allocWithZone(VoidPtr zone);

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

    /**
     * metadataInputWithFormatDescription:clock:
     * <p>
     * Returns an AVCaptureMetadataInput instance that allows a client to provide AVTimedMetadataGroups to an
     * AVCaptureSession.
     * <p>
     * This method returns an instance of AVCaptureMetadataInput that can be used to capture AVTimedMetadataGroups
     * supplied by the client to an AVCaptureSession.
     *
     * @param desc  A CMFormatDescription that defines the metadata to be supplied by the client. Throws an
     *              NSInvalidArgumentException if NULL is passed.
     * @param clock A CMClock that provided the timebase for the supplied samples. Throws an NSInvalidArgumentException
     *              if NULL is passed.
     * @return An AVCaptureMetadataInput instance.
     */
    @Generated
    @Selector("metadataInputWithFormatDescription:clock:")
    public static native AVCaptureMetadataInput metadataInputWithFormatDescriptionClock(CMFormatDescriptionRef desc,
            CMClockRef clock);

    @Generated
    @Owned
    @Selector("new")
    public static native AVCaptureMetadataInput new_objc();

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
     * appendTimedMetadataGroup:
     * <p>
     * Provides metadata to the AVCaptureSession.
     * <p>
     * The provided AVTimedMetadataGroup will be provided to the AVCaptureSession. The group's presentation timestamp is
     * expressed in the context of the clock supplied to the initializer. It is not required that the
     * AVTimedMetadataGroup have a duration; an empty AVTimedMetadataGroup can be supplied to denote a period of no
     * metadata.
     *
     * @param metadata An AVTimedMetadataGroup of metadata. Will throw an exception if nil. In order to denote a period
     *                 of no metadata, an empty AVTimedMetadataGroup should be passed.
     */
    @Generated
    @Selector("appendTimedMetadataGroup:error:")
    public native boolean appendTimedMetadataGroupError(AVTimedMetadataGroup metadata,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

    @Generated
    @Selector("init")
    public native AVCaptureMetadataInput init();

    /**
     * initWithFormatDescription:clock:
     * <p>
     * Creates an AVCaptureMetadataInput instance that allows a client to provide AVTimedMetadataGroups to an
     * AVCaptureSession.
     * <p>
     * This method creates an instance of AVCaptureMetadataInput that can be used to capture AVTimedMetadataGroups
     * supplied by the client to an AVCaptureSession.
     *
     * @param desc  A CMFormatDescription that defines the metadata to be supplied by the client. Throws
     *              NSInvalidArgumentException if NULL is passed.
     * @param clock A CMClock that provided the timebase for the supplied samples. Throws NSInvalidArgumentException if
     *              NULL is passed.
     * @return An AVCaptureMetadataInput instance, or nil, if the device could not be used for capture.
     */
    @Generated
    @Selector("initWithFormatDescription:clock:")
    public native AVCaptureMetadataInput initWithFormatDescriptionClock(CMFormatDescriptionRef desc, CMClockRef clock);
}

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

/**
 * AVCaptureInputPort
 * 
 * An AVCaptureInputPort describes a single stream of media data provided by an AVCaptureInput and provides an interface
 * for connecting that stream to AVCaptureOutput instances via AVCaptureConnection.
 * 
 * Instances of AVCaptureInputPort cannot be created directly. An AVCaptureInput exposes its input ports via its ports
 * property. Input ports provide information about the format of their media data via the mediaType and
 * formatDescription properties, and allow clients to control the flow of data via the enabled property. Input ports are
 * used by an AVCaptureConnection to define the mapping between inputs and outputs in an AVCaptureSession.
 * 
 * API-Since: 4.0
 */
@Generated
@Library("AVFoundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class AVCaptureInputPort extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected AVCaptureInputPort(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native AVCaptureInputPort alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native AVCaptureInputPort allocWithZone(VoidPtr zone);

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
    public static native AVCaptureInputPort new_objc();

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
     * [@property] clock
     * 
     * Provides access to the "native" clock used by the input port.
     * 
     * The clock is read-only.
     * 
     * API-Since: 7.0
     */
    @Generated
    @Selector("clock")
    public native CMClockRef clock();

    /**
     * [@property] formatDescription
     * 
     * The format of the data provided by the receiver.
     * 
     * The value of this property is a CMFormatDescription that describes the format of the media data currently
     * provided by the receiver. Clients can be notified of changes to the format by observing the
     * AVCaptureInputPortFormatDescriptionDidChangeNotification.
     */
    @Generated
    @Selector("formatDescription")
    public native CMFormatDescriptionRef formatDescription();

    @Generated
    @Selector("init")
    public native AVCaptureInputPort init();

    /**
     * [@property] input
     * 
     * The input that owns the receiver.
     * 
     * The value of this property is an AVCaptureInput instance that owns the receiver.
     */
    @Generated
    @Selector("input")
    public native AVCaptureInput input();

    /**
     * [@property] enabled
     * 
     * Whether the receiver should provide data.
     * 
     * The value of this property is a BOOL that determines whether the receiver should provide data to outputs when a
     * session is running. Clients can set this property to fine tune which media streams from a given input will be
     * used during capture. The default value is YES.
     */
    @Generated
    @Selector("isEnabled")
    public native boolean isEnabled();

    /**
     * [@property] enabled
     * 
     * Whether the receiver should provide data.
     * 
     * The value of this property is a BOOL that determines whether the receiver should provide data to outputs when a
     * session is running. Clients can set this property to fine tune which media streams from a given input will be
     * used during capture. The default value is YES.
     */
    @Generated
    @Selector("setEnabled:")
    public native void setEnabled(boolean value);

    /**
     * [@property] mediaType
     * 
     * The media type of the data provided by the receiver.
     * 
     * The value of this property is a constant describing the type of media, such as AVMediaTypeVideo or
     * AVMediaTypeAudio, provided by the receiver. Media type constants are defined in AVMediaFormat.h.
     */
    @Generated
    @Selector("mediaType")
    public native String mediaType();

    /**
     * [@property] sourceDevicePosition
     * 
     * The AVCaptureDevicePosition of the source device providing input through this port.
     * 
     * All AVCaptureInputPorts contained in an AVCaptureDeviceInput's ports array have the same sourceDevicePosition,
     * which is deviceInput.device.position. When working with microphone input in an AVCaptureMultiCamSession, it is
     * possible to record multiple microphone directions simultaneously, for instance, to record front-facing microphone
     * input to pair with video from the front facing camera, and back-facing microphone input to pair with the video
     * from the back-facing camera. By calling -[AVCaptureDeviceInput
     * portsWithMediaType:sourceDeviceType:sourceDevicePosition:], you may discover additional hidden ports originating
     * from the source audio device. These ports represent individual microphones positioned to pick up audio from one
     * particular direction. Examples follow.
     * 
     * To discover the audio port that captures omnidirectional audio, use [microphoneDeviceInput
     * portsWithMediaType:AVMediaTypeAudio sourceDeviceType:AVCaptureDeviceTypeBuiltInMicrophone
     * sourceDevicePosition:AVCaptureDevicePositionUnspecified].firstObject.
     * To discover the audio port that captures front-facing audio, use [microphoneDeviceInput
     * portsWithMediaType:AVMediaTypeAudio sourceDeviceType:AVCaptureDeviceTypeBuiltInMicrophone
     * sourceDevicePosition:AVCaptureDevicePositionFront].firstObject.
     * To discover the audio port that captures back-facing audio, use [microphoneDeviceInput
     * portsWithMediaType:AVMediaTypeAudio sourceDeviceType:AVCaptureDeviceTypeBuiltInMicrophone
     * sourceDevicePosition:AVCaptureDevicePositionBack].firstObject.
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("sourceDevicePosition")
    @NInt
    public native long sourceDevicePosition();

    /**
     * [@property] sourceDeviceType
     * 
     * The AVCaptureDeviceType of the source device providing input through this port.
     * 
     * All AVCaptureInputPorts contained in an AVCaptureDeviceInput's ports array have the same sourceDeviceType, which
     * is equal to deviceInput.device.deviceType. All of these ports are legal for use in an AVCaptureSession. When
     * working with virtual devices such as the DualCamera in an AVCaptureMultiCamSession, it is possible to stream
     * media from the virtual device's constituent device streams by discovering and connecting hidden ports. In the
     * case of the DualCamera, its constituent devices are the WideAngle camera and the Telephoto camera. By calling
     * -[AVCaptureDeviceInput portsWithMediaType:sourceDeviceType:sourceDevicePosition:], you may discover ports
     * originating from one or more of the virtual device's constituent devices and then make connections using those
     * ports. Constituent device ports are never present in their owning virtual device input's ports array. As an
     * example, to find the video port originating from the DualCamera's Telephoto camera constituent device, you call
     * [dualCameraDeviceInput portsWithMediaType:AVMediaTypeVideo
     * sourceDeviceType:AVCaptureDeviceTypeBuiltInTelephotoCamera sourceDevicePosition:dualCamera.position] and use the
     * first port in the resulting array.
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("sourceDeviceType")
    public native String sourceDeviceType();
}

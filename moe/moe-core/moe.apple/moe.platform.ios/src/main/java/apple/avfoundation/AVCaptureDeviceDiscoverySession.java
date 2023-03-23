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
 * AVCaptureDeviceDiscoverySession
 * 
 * The AVCaptureDeviceDiscoverySession allows clients to search for devices by certain criteria.
 * 
 * This class allows clients to discover devices by providing certain search criteria. The objective of this class is to
 * help find devices by device type and optionally by media type or position and allow you to key-value observe changes
 * to the returned devices list.
 * 
 * API-Since: 10.0
 */
@Generated
@Library("AVFoundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class AVCaptureDeviceDiscoverySession extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected AVCaptureDeviceDiscoverySession(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native AVCaptureDeviceDiscoverySession alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native AVCaptureDeviceDiscoverySession allocWithZone(VoidPtr zone);

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

    /**
     * discoverySessionWithDeviceTypes:
     * 
     * Returns an AVCaptureDeviceDiscoverySession instance for the given device types, media type, and position.
     * 
     * The list of device types is mandatory. This is used to make sure that clients only get access to devices of types
     * they expect. This prevents new device types from automatically being included in the list of devices.
     * 
     * @param deviceTypes
     *                    An array specifying the device types to include in the list of discovered devices.
     * @param mediaType
     *                    The media type, such as AVMediaTypeVideo, AVMediaTypeAudio, or AVMediaTypeMuxed, to include in
     *                    the list of discovered devices. Pass nil to search for devices with any media type.
     * @param position
     *                    The position to include in the list of discovered devices. Pass
     *                    AVCaptureDevicePositionUnspecified to search for devices with any position.
     * @return
     *         The AVCaptureDeviceDiscoverySession from which the list of devices can be obtained.
     */
    @Generated
    @Selector("discoverySessionWithDeviceTypes:mediaType:position:")
    public static native AVCaptureDeviceDiscoverySession discoverySessionWithDeviceTypesMediaTypePosition(
            NSArray<String> deviceTypes, String mediaType, @NInt long position);

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
    public static native AVCaptureDeviceDiscoverySession new_objc();

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
     * [@property] devices
     * 
     * The list of devices that comply to the search criteria specified on the discovery session.
     * 
     * The returned array contains only devices that are available at the time the method is called. Applications can
     * key-value observe this property to be notified when the list of available devices has changed. For apps linked
     * against iOS 10, the devices returned are unsorted. For apps linked against iOS 11 or later, the devices are
     * sorted by AVCaptureDeviceType, matching the order specified in the deviceTypes parameter of
     * +[AVCaptureDeviceDiscoverySession discoverySessionWithDeviceTypes:mediaType:position:]. If a position of
     * AVCaptureDevicePositionUnspecified is specified, the results are further ordered by position in the
     * AVCaptureDevicePosition enum. Starting in Mac Catalyst 14.0, clients can key value observe the value of this
     * property to be notified when the devices change.
     */
    @Generated
    @Selector("devices")
    public native NSArray<? extends AVCaptureDevice> devices();

    @Generated
    @Selector("init")
    public native AVCaptureDeviceDiscoverySession init();

    /**
     * [@property] supportedMultiCamDeviceSets
     * 
     * An array of sets of AVCaptureDevices that are allowed to be used simultaneously in an AVCaptureMultiCamSession.
     * 
     * When using an AVCaptureMultiCamSession, multiple cameras may be used as device inputs to the session, so long as
     * they are included in one of the supportedMultiCamDeviceSets. Starting in Mac Catalyst 14.0, clients can key value
     * observe the value of this property to be notified when the device sets change.
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("supportedMultiCamDeviceSets")
    public native NSArray<? extends NSSet<? extends AVCaptureDevice>> supportedMultiCamDeviceSets();
}

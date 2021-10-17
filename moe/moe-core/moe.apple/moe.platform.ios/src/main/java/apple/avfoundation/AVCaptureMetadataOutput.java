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
import apple.avfoundation.protocol.AVCaptureMetadataOutputObjectsDelegate;
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
import org.moe.natj.general.ann.MappedReturn;
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
 * AVCaptureMetadataOutput
 * <p>
 * AVCaptureMetadataOutput is a concrete subclass of AVCaptureOutput that can be used to process metadata objects from an attached connection.
 * <p>
 * Instances of AVCaptureMetadataOutput emit arrays of AVMetadataObject instances (see AVMetadataObject.h), such as detected faces. Applications can access the metadata objects with the captureOutput:didOutputMetadataObjects:fromConnection: delegate method.
 */
@Generated
@Library("AVFoundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class AVCaptureMetadataOutput extends AVCaptureOutput {
    static {
        NatJ.register();
    }

    @Generated
    protected AVCaptureMetadataOutput(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native AVCaptureMetadataOutput alloc();

    @Generated
    @Selector("allocWithZone:")
    public static native AVCaptureMetadataOutput allocWithZone(VoidPtr zone);

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
    public static native AVCaptureMetadataOutput new_objc();

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
     * [@property] availableMetadataObjectTypes
     * <p>
     * Indicates the receiver's supported metadata object types.
     * <p>
     * The value of this property is an NSArray of NSStrings corresponding to AVMetadataObjectType strings defined in AVMetadataObject.h -- one for each metadata object type supported by the receiver. Available metadata object types are dependent on the capabilities of the AVCaptureInputPort to which this receiver's AVCaptureConnection is connected. Clients may specify the types of objects they would like to process by calling setMetadataObjectTypes:. This property is key-value observable.
     */
    @Generated
    @Selector("availableMetadataObjectTypes")
    public native NSArray<String> availableMetadataObjectTypes();

    @Generated
    @Selector("init")
    public native AVCaptureMetadataOutput init();

    /**
     * [@property] metadataObjectTypes
     * <p>
     * Specifies the types of metadata objects that the receiver should present to the client.
     * <p>
     * AVCaptureMetadataOutput may detect and emit multiple metadata object types. For apps linked before iOS 7.0, the receiver defaults to capturing face metadata objects if supported (see -availableMetadataObjectTypes). For apps linked on or after iOS 7.0, the receiver captures no metadata objects by default. -setMetadataObjectTypes: throws an NSInvalidArgumentException if any elements in the array are not present in the -availableMetadataObjectTypes array.
     */
    @Generated
    @Selector("metadataObjectTypes")
    public native NSArray<String> metadataObjectTypes();

    /**
     * [@property] metadataObjectsCallbackQueue
     * <p>
     * The dispatch queue on which all metadata object delegate methods will be called.
     * <p>
     * The value of this property is a dispatch_queue_t. The queue is set using the setMetadataObjectsDelegate:queue: method.
     */
    @Generated
    @Selector("metadataObjectsCallbackQueue")
    public native NSObject metadataObjectsCallbackQueue();

    /**
     * [@property] metadataObjectsDelegate
     * <p>
     * The receiver's delegate.
     * <p>
     * The value of this property is an object conforming to the AVCaptureMetadataOutputObjectsDelegate protocol that will receive metadata objects after they are captured. The delegate is set using the setMetadataObjectsDelegate:queue: method.
     */
    @Generated
    @Selector("metadataObjectsDelegate")
    @MappedReturn(ObjCObjectMapper.class)
    public native AVCaptureMetadataOutputObjectsDelegate metadataObjectsDelegate();

    /**
     * [@property] rectOfInterest
     * <p>
     * Specifies a rectangle of interest for limiting the search area for visual metadata.
     * <p>
     * The value of this property is a CGRect that determines the receiver's rectangle of interest for each frame of video. The rectangle's origin is top left and is relative to the coordinate space of the device providing the metadata. Specifying a rectOfInterest may improve detection performance for certain types of metadata. The default value of this property is the value CGRectMake(0, 0, 1, 1). Metadata objects whose bounds do not intersect with the rectOfInterest will not be returned.
     * <p>
     * As of iOS 13, this property can be set without requiring a lengthy rebuild of the session in which video preview is disrupted.
     */
    @Generated
    @Selector("rectOfInterest")
    @ByValue
    public native CGRect rectOfInterest();

    /**
     * [@property] metadataObjectTypes
     * <p>
     * Specifies the types of metadata objects that the receiver should present to the client.
     * <p>
     * AVCaptureMetadataOutput may detect and emit multiple metadata object types. For apps linked before iOS 7.0, the receiver defaults to capturing face metadata objects if supported (see -availableMetadataObjectTypes). For apps linked on or after iOS 7.0, the receiver captures no metadata objects by default. -setMetadataObjectTypes: throws an NSInvalidArgumentException if any elements in the array are not present in the -availableMetadataObjectTypes array.
     */
    @Generated
    @Selector("setMetadataObjectTypes:")
    public native void setMetadataObjectTypes(NSArray<String> value);

    /**
     * setMetadataObjectsDelegate:queue:
     * <p>
     * Sets the receiver's delegate that will accept metadata objects and dispatch queue on which the delegate will be called.
     * <p>
     * When new metadata objects are captured in the receiver's connection, they will be vended to the delegate using the captureOutput:didOutputMetadataObjects:fromConnection: delegate method. All delegate methods will be called on the specified dispatch queue.
     * <p>
     * Clients that need to minimize the chances of metadata being dropped should specify a queue on which a sufficiently small amount of processing is performed along with receiving metadata objects.
     * <p>
     * A serial dispatch queue must be used to guarantee that metadata objects will be delivered in order. The objectsCallbackQueue parameter may not be NULL, except when setting the objectsDelegate to nil.
     *
     * @param objectsDelegate      An object conforming to the AVCaptureMetadataOutputObjectsDelegate protocol that will receive metadata objects after they are captured.
     * @param objectsCallbackQueue A dispatch queue on which all delegate methods will be called.
     */
    @Generated
    @Selector("setMetadataObjectsDelegate:queue:")
    public native void setMetadataObjectsDelegateQueue(
            @Mapped(ObjCObjectMapper.class) AVCaptureMetadataOutputObjectsDelegate objectsDelegate,
            NSObject objectsCallbackQueue);

    /**
     * [@property] rectOfInterest
     * <p>
     * Specifies a rectangle of interest for limiting the search area for visual metadata.
     * <p>
     * The value of this property is a CGRect that determines the receiver's rectangle of interest for each frame of video. The rectangle's origin is top left and is relative to the coordinate space of the device providing the metadata. Specifying a rectOfInterest may improve detection performance for certain types of metadata. The default value of this property is the value CGRectMake(0, 0, 1, 1). Metadata objects whose bounds do not intersect with the rectOfInterest will not be returned.
     * <p>
     * As of iOS 13, this property can be set without requiring a lengthy rebuild of the session in which video preview is disrupted.
     */
    @Generated
    @Selector("setRectOfInterest:")
    public native void setRectOfInterest(@ByValue CGRect value);
}

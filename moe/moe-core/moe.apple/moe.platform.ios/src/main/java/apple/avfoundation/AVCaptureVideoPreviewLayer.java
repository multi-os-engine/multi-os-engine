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
import apple.coregraphics.struct.CGPoint;
import apple.coregraphics.struct.CGRect;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.quartzcore.CALayer;
import apple.quartzcore.protocol.CAAction;
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

@Generated
@Library("AVFoundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class AVCaptureVideoPreviewLayer extends CALayer {
    static {
        NatJ.register();
    }

    @Generated
    protected AVCaptureVideoPreviewLayer(Pointer peer) {
        super(peer);
    }

    @Generated
    @Owned
    @Selector("alloc")
    public static native AVCaptureVideoPreviewLayer alloc();

    /**
     * automaticallyAdjustsMirroring</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVCaptureVideoPreviewLayer_Class/index.html#//apple_ref/occ/instp/AVCaptureVideoPreviewLayer/automaticallyAdjustsMirroring">iOS Dev Center</a>
     */
    @Generated
    @Deprecated
    @Selector("automaticallyAdjustsMirroring")
    public native boolean automaticallyAdjustsMirroring();

    /**
     * captureDevicePointOfInterestForPoint:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVCaptureVideoPreviewLayer_Class/index.html#//apple_ref/occ/instm/AVCaptureVideoPreviewLayer/captureDevicePointOfInterestForPoint:">iOS Dev Center</a>
     */
    @Generated
    @Selector("captureDevicePointOfInterestForPoint:")
    @ByValue
    public native CGPoint captureDevicePointOfInterestForPoint(@ByValue CGPoint pointInLayer);

    /**
     * connection</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVCaptureVideoPreviewLayer_Class/index.html#//apple_ref/occ/instp/AVCaptureVideoPreviewLayer/connection">iOS Dev Center</a>
     */
    @Generated
    @Selector("connection")
    public native AVCaptureConnection connection();

    @Generated
    @Selector("init")
    public native AVCaptureVideoPreviewLayer init();

    @Generated
    @Selector("initWithLayer:")
    public native AVCaptureVideoPreviewLayer initWithLayer(@Mapped(ObjCObjectMapper.class) Object layer);

    /**
     * initWithSession:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVCaptureVideoPreviewLayer_Class/index.html#//apple_ref/occ/instm/AVCaptureVideoPreviewLayer/initWithSession:">iOS Dev Center</a>
     */
    @Generated
    @Selector("initWithSession:")
    public native AVCaptureVideoPreviewLayer initWithSession(AVCaptureSession session);

    /**
     * initWithSessionWithNoConnection:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVCaptureVideoPreviewLayer_Class/index.html#//apple_ref/occ/instm/AVCaptureVideoPreviewLayer/initWithSessionWithNoConnection:">iOS Dev Center</a>
     */
    @Generated
    @Selector("initWithSessionWithNoConnection:")
    public native AVCaptureVideoPreviewLayer initWithSessionWithNoConnection(AVCaptureSession session);

    /**
     * mirrored</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVCaptureVideoPreviewLayer_Class/index.html#//apple_ref/occ/instp/AVCaptureVideoPreviewLayer/mirrored">iOS Dev Center</a>
     */
    @Generated
    @Deprecated
    @Selector("isMirrored")
    public native boolean isMirrored();

    /**
     * mirroringSupported</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVCaptureVideoPreviewLayer_Class/index.html#//apple_ref/occ/instp/AVCaptureVideoPreviewLayer/mirroringSupported">iOS Dev Center</a>
     */
    @Generated
    @Deprecated
    @Selector("isMirroringSupported")
    public native boolean isMirroringSupported();

    /**
     * orientationSupported</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVCaptureVideoPreviewLayer_Class/index.html#//apple_ref/occ/instp/AVCaptureVideoPreviewLayer/orientationSupported">iOS Dev Center</a>
     */
    @Generated
    @Deprecated
    @Selector("isOrientationSupported")
    public native boolean isOrientationSupported();

    @Generated
    @Selector("layer")
    public static native AVCaptureVideoPreviewLayer layer();

    /**
     * layerWithSession:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVCaptureVideoPreviewLayer_Class/index.html#//apple_ref/occ/clm/AVCaptureVideoPreviewLayer/layerWithSession:">iOS Dev Center</a>
     */
    @Generated
    @Selector("layerWithSession:")
    public static native AVCaptureVideoPreviewLayer layerWithSession(AVCaptureSession session);

    /**
     * layerWithSessionWithNoConnection:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVCaptureVideoPreviewLayer_Class/index.html#//apple_ref/occ/clm/AVCaptureVideoPreviewLayer/layerWithSessionWithNoConnection:">iOS Dev Center</a>
     */
    @Generated
    @Selector("layerWithSessionWithNoConnection:")
    public static native AVCaptureVideoPreviewLayer layerWithSessionWithNoConnection(AVCaptureSession session);

    /**
     * metadataOutputRectOfInterestForRect:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVCaptureVideoPreviewLayer_Class/index.html#//apple_ref/occ/instm/AVCaptureVideoPreviewLayer/metadataOutputRectOfInterestForRect:">iOS Dev Center</a>
     */
    @Generated
    @Selector("metadataOutputRectOfInterestForRect:")
    @ByValue
    public native CGRect metadataOutputRectOfInterestForRect(@ByValue CGRect rectInLayerCoordinates);

    /**
     * orientation</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVCaptureVideoPreviewLayer_Class/index.html#//apple_ref/occ/instp/AVCaptureVideoPreviewLayer/orientation">iOS Dev Center</a>
     */
    @Generated
    @Deprecated
    @Selector("orientation")
    @NInt
    public native long orientation();

    /**
     * pointForCaptureDevicePointOfInterest:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVCaptureVideoPreviewLayer_Class/index.html#//apple_ref/occ/instm/AVCaptureVideoPreviewLayer/pointForCaptureDevicePointOfInterest:">iOS Dev Center</a>
     */
    @Generated
    @Selector("pointForCaptureDevicePointOfInterest:")
    @ByValue
    public native CGPoint pointForCaptureDevicePointOfInterest(@ByValue CGPoint captureDevicePointOfInterest);

    /**
     * rectForMetadataOutputRectOfInterest:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVCaptureVideoPreviewLayer_Class/index.html#//apple_ref/occ/instm/AVCaptureVideoPreviewLayer/rectForMetadataOutputRectOfInterest:">iOS Dev Center</a>
     */
    @Generated
    @Selector("rectForMetadataOutputRectOfInterest:")
    @ByValue
    public native CGRect rectForMetadataOutputRectOfInterest(@ByValue CGRect rectInMetadataOutputCoordinates);

    /**
     * session</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVCaptureVideoPreviewLayer_Class/index.html#//apple_ref/occ/instp/AVCaptureVideoPreviewLayer/session">iOS Dev Center</a>
     */
    @Generated
    @Selector("session")
    public native AVCaptureSession session();

    /**
     * automaticallyAdjustsMirroring</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVCaptureVideoPreviewLayer_Class/index.html#//apple_ref/occ/instp/AVCaptureVideoPreviewLayer/automaticallyAdjustsMirroring">iOS Dev Center</a>
     */
    @Generated
    @Deprecated
    @Selector("setAutomaticallyAdjustsMirroring:")
    public native void setAutomaticallyAdjustsMirroring(boolean value);

    /**
     * mirrored</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVCaptureVideoPreviewLayer_Class/index.html#//apple_ref/occ/instp/AVCaptureVideoPreviewLayer/mirrored">iOS Dev Center</a>
     */
    @Generated
    @Deprecated
    @Selector("setMirrored:")
    public native void setMirrored(boolean value);

    /**
     * orientation</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVCaptureVideoPreviewLayer_Class/index.html#//apple_ref/occ/instp/AVCaptureVideoPreviewLayer/orientation">iOS Dev Center</a>
     */
    @Generated
    @Deprecated
    @Selector("setOrientation:")
    public native void setOrientation(@NInt long value);

    /**
     * session</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVCaptureVideoPreviewLayer_Class/index.html#//apple_ref/occ/instp/AVCaptureVideoPreviewLayer/session">iOS Dev Center</a>
     */
    @Generated
    @Selector("setSession:")
    public native void setSession(AVCaptureSession value);

    /**
     * setSessionWithNoConnection:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVCaptureVideoPreviewLayer_Class/index.html#//apple_ref/occ/instm/AVCaptureVideoPreviewLayer/setSessionWithNoConnection:">iOS Dev Center</a>
     */
    @Generated
    @Selector("setSessionWithNoConnection:")
    public native void setSessionWithNoConnection(AVCaptureSession session);

    /**
     * videoGravity</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVCaptureVideoPreviewLayer_Class/index.html#//apple_ref/occ/instp/AVCaptureVideoPreviewLayer/videoGravity">iOS Dev Center</a>
     */
    @Generated
    @Selector("setVideoGravity:")
    public native void setVideoGravity(String value);

    /**
     * transformedMetadataObjectForMetadataObject:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVCaptureVideoPreviewLayer_Class/index.html#//apple_ref/occ/instm/AVCaptureVideoPreviewLayer/transformedMetadataObjectForMetadataObject:">iOS Dev Center</a>
     */
    @Generated
    @Selector("transformedMetadataObjectForMetadataObject:")
    public native AVMetadataObject transformedMetadataObjectForMetadataObject(AVMetadataObject metadataObject);

    /**
     * videoGravity</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVCaptureVideoPreviewLayer_Class/index.html#//apple_ref/occ/instp/AVCaptureVideoPreviewLayer/videoGravity">iOS Dev Center</a>
     */
    @Generated
    @Selector("videoGravity")
    public native String videoGravity();

    @Generated
    @Selector("initWithCoder:")
    public native AVCaptureVideoPreviewLayer initWithCoder(NSCoder aDecoder);

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Selector("allocWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object allocWithZone(VoidPtr zone);

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
    @Selector("defaultActionForKey:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native CAAction defaultActionForKey(String event);

    @Generated
    @Selector("defaultValueForKey:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object defaultValueForKey(String key);

    @Generated
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("initialize")
    public static native void initialize();

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
    @Selector("load")
    public static native void load_objc_static();

    @Generated
    @Selector("needsDisplayForKey:")
    public static native boolean needsDisplayForKey(String key);

    @Generated
    @Owned
    @Selector("new")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}

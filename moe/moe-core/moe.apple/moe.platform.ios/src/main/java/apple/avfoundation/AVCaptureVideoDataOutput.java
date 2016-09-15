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
import apple.avfoundation.protocol.AVCaptureVideoDataOutputSampleBufferDelegate;
import apple.coremedia.struct.CMTime;
import apple.foundation.NSArray;
import apple.foundation.NSDictionary;
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

@Generated
@Library("AVFoundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class AVCaptureVideoDataOutput extends AVCaptureOutput {
    static {
        NatJ.register();
    }

    @Generated
    protected AVCaptureVideoDataOutput(Pointer peer) {
        super(peer);
    }

    @Generated
    @Owned
    @Selector("alloc")
    public static native AVCaptureVideoDataOutput alloc();

    /**
     * alwaysDiscardsLateVideoFrames</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVCaptureVideoDataOutput_Class/index.html#//apple_ref/occ/instp/AVCaptureVideoDataOutput/alwaysDiscardsLateVideoFrames">iOS Dev Center</a>
     */
    @Generated
    @Selector("alwaysDiscardsLateVideoFrames")
    public native boolean alwaysDiscardsLateVideoFrames();

    /**
     * availableVideoCVPixelFormatTypes</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVCaptureVideoDataOutput_Class/index.html#//apple_ref/occ/instp/AVCaptureVideoDataOutput/availableVideoCVPixelFormatTypes">iOS Dev Center</a>
     */
    @Generated
    @Selector("availableVideoCVPixelFormatTypes")
    public native NSArray<?> availableVideoCVPixelFormatTypes();

    /**
     * availableVideoCodecTypes</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVCaptureVideoDataOutput_Class/index.html#//apple_ref/occ/instp/AVCaptureVideoDataOutput/availableVideoCodecTypes">iOS Dev Center</a>
     */
    @Generated
    @Selector("availableVideoCodecTypes")
    public native NSArray<?> availableVideoCodecTypes();

    @Generated
    @Selector("init")
    public native AVCaptureVideoDataOutput init();

    /**
     * minFrameDuration</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVCaptureVideoDataOutput_Class/index.html#//apple_ref/occ/instp/AVCaptureVideoDataOutput/minFrameDuration">iOS Dev Center</a>
     */
    @Generated
    @Deprecated
    @Selector("minFrameDuration")
    @ByValue
    public native CMTime minFrameDuration();

    /**
     * recommendedVideoSettingsForAssetWriterWithOutputFileType:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVCaptureVideoDataOutput_Class/index.html#//apple_ref/occ/instm/AVCaptureVideoDataOutput/recommendedVideoSettingsForAssetWriterWithOutputFileType:">iOS Dev Center</a>
     */
    @Generated
    @Selector("recommendedVideoSettingsForAssetWriterWithOutputFileType:")
    public native NSDictionary<?, ?> recommendedVideoSettingsForAssetWriterWithOutputFileType(String outputFileType);

    /**
     * sampleBufferCallbackQueue</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVCaptureVideoDataOutput_Class/index.html#//apple_ref/occ/instp/AVCaptureVideoDataOutput/sampleBufferCallbackQueue">iOS Dev Center</a>
     */
    @Generated
    @Selector("sampleBufferCallbackQueue")
    public native NSObject sampleBufferCallbackQueue();

    /**
     * sampleBufferDelegate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVCaptureVideoDataOutput_Class/index.html#//apple_ref/occ/instp/AVCaptureVideoDataOutput/sampleBufferDelegate">iOS Dev Center</a>
     */
    @Generated
    @Selector("sampleBufferDelegate")
    @MappedReturn(ObjCObjectMapper.class)
    public native AVCaptureVideoDataOutputSampleBufferDelegate sampleBufferDelegate();

    /**
     * alwaysDiscardsLateVideoFrames</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVCaptureVideoDataOutput_Class/index.html#//apple_ref/occ/instp/AVCaptureVideoDataOutput/alwaysDiscardsLateVideoFrames">iOS Dev Center</a>
     */
    @Generated
    @Selector("setAlwaysDiscardsLateVideoFrames:")
    public native void setAlwaysDiscardsLateVideoFrames(boolean value);

    /**
     * minFrameDuration</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVCaptureVideoDataOutput_Class/index.html#//apple_ref/occ/instp/AVCaptureVideoDataOutput/minFrameDuration">iOS Dev Center</a>
     */
    @Generated
    @Deprecated
    @Selector("setMinFrameDuration:")
    public native void setMinFrameDuration(@ByValue CMTime value);

    /**
     * setSampleBufferDelegate:queue:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVCaptureVideoDataOutput_Class/index.html#//apple_ref/occ/instm/AVCaptureVideoDataOutput/setSampleBufferDelegate:queue:">iOS Dev Center</a>
     */
    @Generated
    @Selector("setSampleBufferDelegate:queue:")
    public native void setSampleBufferDelegateQueue(
            @Mapped(ObjCObjectMapper.class) AVCaptureVideoDataOutputSampleBufferDelegate sampleBufferDelegate,
            NSObject sampleBufferCallbackQueue);

    /**
     * videoSettings</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVCaptureVideoDataOutput_Class/index.html#//apple_ref/occ/instp/AVCaptureVideoDataOutput/videoSettings">iOS Dev Center</a>
     */
    @Generated
    @Selector("setVideoSettings:")
    public native void setVideoSettings(NSDictionary<?, ?> value);

    /**
     * videoSettings</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVCaptureVideoDataOutput_Class/index.html#//apple_ref/occ/instp/AVCaptureVideoDataOutput/videoSettings">iOS Dev Center</a>
     */
    @Generated
    @Selector("videoSettings")
    public native NSDictionary<?, ?> videoSettings();

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

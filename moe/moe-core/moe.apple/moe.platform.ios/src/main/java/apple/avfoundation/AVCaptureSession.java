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
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
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
public class AVCaptureSession extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected AVCaptureSession(Pointer peer) {
        super(peer);
    }

    @Generated
    @Owned
    @Selector("alloc")
    public static native AVCaptureSession alloc();

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
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * addConnection:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVCaptureSession_Class/index.html#//apple_ref/occ/instm/AVCaptureSession/addConnection:">iOS Dev Center</a>
     */
    @Generated
    @Selector("addConnection:")
    public native void addConnection(AVCaptureConnection connection);

    /**
     * addInput:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVCaptureSession_Class/index.html#//apple_ref/occ/instm/AVCaptureSession/addInput:">iOS Dev Center</a>
     */
    @Generated
    @Selector("addInput:")
    public native void addInput(AVCaptureInput input);

    /**
     * addInputWithNoConnections:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVCaptureSession_Class/index.html#//apple_ref/occ/instm/AVCaptureSession/addInputWithNoConnections:">iOS Dev Center</a>
     */
    @Generated
    @Selector("addInputWithNoConnections:")
    public native void addInputWithNoConnections(AVCaptureInput input);

    /**
     * addOutput:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVCaptureSession_Class/index.html#//apple_ref/occ/instm/AVCaptureSession/addOutput:">iOS Dev Center</a>
     */
    @Generated
    @Selector("addOutput:")
    public native void addOutput(AVCaptureOutput output);

    /**
     * addOutputWithNoConnections:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVCaptureSession_Class/index.html#//apple_ref/occ/instm/AVCaptureSession/addOutputWithNoConnections:">iOS Dev Center</a>
     */
    @Generated
    @Selector("addOutputWithNoConnections:")
    public native void addOutputWithNoConnections(AVCaptureOutput output);

    /**
     * automaticallyConfiguresApplicationAudioSession</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVCaptureSession_Class/index.html#//apple_ref/occ/instp/AVCaptureSession/automaticallyConfiguresApplicationAudioSession">iOS Dev Center</a>
     */
    @Generated
    @Selector("automaticallyConfiguresApplicationAudioSession")
    public native boolean automaticallyConfiguresApplicationAudioSession();

    /**
     * beginConfiguration</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVCaptureSession_Class/index.html#//apple_ref/occ/instm/AVCaptureSession/beginConfiguration">iOS Dev Center</a>
     */
    @Generated
    @Selector("beginConfiguration")
    public native void beginConfiguration();

    /**
     * canAddConnection:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVCaptureSession_Class/index.html#//apple_ref/occ/instm/AVCaptureSession/canAddConnection:">iOS Dev Center</a>
     */
    @Generated
    @Selector("canAddConnection:")
    public native boolean canAddConnection(AVCaptureConnection connection);

    /**
     * canAddInput:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVCaptureSession_Class/index.html#//apple_ref/occ/instm/AVCaptureSession/canAddInput:">iOS Dev Center</a>
     */
    @Generated
    @Selector("canAddInput:")
    public native boolean canAddInput(AVCaptureInput input);

    /**
     * canAddOutput:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVCaptureSession_Class/index.html#//apple_ref/occ/instm/AVCaptureSession/canAddOutput:">iOS Dev Center</a>
     */
    @Generated
    @Selector("canAddOutput:")
    public native boolean canAddOutput(AVCaptureOutput output);

    /**
     * canSetSessionPreset:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVCaptureSession_Class/index.html#//apple_ref/occ/instm/AVCaptureSession/canSetSessionPreset:">iOS Dev Center</a>
     */
    @Generated
    @Selector("canSetSessionPreset:")
    public native boolean canSetSessionPreset(String preset);

    /**
     * commitConfiguration</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVCaptureSession_Class/index.html#//apple_ref/occ/instm/AVCaptureSession/commitConfiguration">iOS Dev Center</a>
     */
    @Generated
    @Selector("commitConfiguration")
    public native void commitConfiguration();

    @Generated
    @Selector("init")
    public native AVCaptureSession init();

    /**
     * inputs</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVCaptureSession_Class/index.html#//apple_ref/occ/instp/AVCaptureSession/inputs">iOS Dev Center</a>
     */
    @Generated
    @Selector("inputs")
    public native NSArray<?> inputs();

    /**
     * interrupted</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVCaptureSession_Class/index.html#//apple_ref/occ/instp/AVCaptureSession/interrupted">iOS Dev Center</a>
     */
    @Generated
    @Selector("isInterrupted")
    public native boolean isInterrupted();

    /**
     * running</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVCaptureSession_Class/index.html#//apple_ref/occ/instp/AVCaptureSession/running">iOS Dev Center</a>
     */
    @Generated
    @Selector("isRunning")
    public native boolean isRunning();

    /**
     * masterClock</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVCaptureSession_Class/index.html#//apple_ref/occ/instp/AVCaptureSession/masterClock">iOS Dev Center</a>
     */
    @Generated
    @Selector("masterClock")
    public native CMClockRef masterClock();

    /**
     * outputs</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVCaptureSession_Class/index.html#//apple_ref/occ/instp/AVCaptureSession/outputs">iOS Dev Center</a>
     */
    @Generated
    @Selector("outputs")
    public native NSArray<?> outputs();

    /**
     * removeConnection:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVCaptureSession_Class/index.html#//apple_ref/occ/instm/AVCaptureSession/removeConnection:">iOS Dev Center</a>
     */
    @Generated
    @Selector("removeConnection:")
    public native void removeConnection(AVCaptureConnection connection);

    /**
     * removeInput:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVCaptureSession_Class/index.html#//apple_ref/occ/instm/AVCaptureSession/removeInput:">iOS Dev Center</a>
     */
    @Generated
    @Selector("removeInput:")
    public native void removeInput(AVCaptureInput input);

    /**
     * removeOutput:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVCaptureSession_Class/index.html#//apple_ref/occ/instm/AVCaptureSession/removeOutput:">iOS Dev Center</a>
     */
    @Generated
    @Selector("removeOutput:")
    public native void removeOutput(AVCaptureOutput output);

    /**
     * sessionPreset</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVCaptureSession_Class/index.html#//apple_ref/occ/instp/AVCaptureSession/sessionPreset">iOS Dev Center</a>
     */
    @Generated
    @Selector("sessionPreset")
    public native String sessionPreset();

    /**
     * automaticallyConfiguresApplicationAudioSession</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVCaptureSession_Class/index.html#//apple_ref/occ/instp/AVCaptureSession/automaticallyConfiguresApplicationAudioSession">iOS Dev Center</a>
     */
    @Generated
    @Selector("setAutomaticallyConfiguresApplicationAudioSession:")
    public native void setAutomaticallyConfiguresApplicationAudioSession(boolean value);

    /**
     * sessionPreset</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVCaptureSession_Class/index.html#//apple_ref/occ/instp/AVCaptureSession/sessionPreset">iOS Dev Center</a>
     */
    @Generated
    @Selector("setSessionPreset:")
    public native void setSessionPreset(String value);

    /**
     * usesApplicationAudioSession</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVCaptureSession_Class/index.html#//apple_ref/occ/instp/AVCaptureSession/usesApplicationAudioSession">iOS Dev Center</a>
     */
    @Generated
    @Selector("setUsesApplicationAudioSession:")
    public native void setUsesApplicationAudioSession(boolean value);

    /**
     * startRunning</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVCaptureSession_Class/index.html#//apple_ref/occ/instm/AVCaptureSession/startRunning">iOS Dev Center</a>
     */
    @Generated
    @Selector("startRunning")
    public native void startRunning();

    /**
     * stopRunning</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVCaptureSession_Class/index.html#//apple_ref/occ/instm/AVCaptureSession/stopRunning">iOS Dev Center</a>
     */
    @Generated
    @Selector("stopRunning")
    public native void stopRunning();

    /**
     * usesApplicationAudioSession</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVCaptureSession_Class/index.html#//apple_ref/occ/instp/AVCaptureSession/usesApplicationAudioSession">iOS Dev Center</a>
     */
    @Generated
    @Selector("usesApplicationAudioSession")
    public native boolean usesApplicationAudioSession();
}

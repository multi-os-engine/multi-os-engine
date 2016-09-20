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
import apple.avfoundation.protocol.AVAudioRecorderDelegate;
import apple.foundation.NSArray;
import apple.foundation.NSDictionary;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSNumber;
import apple.foundation.NSSet;
import apple.foundation.NSURL;
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
import org.moe.natj.general.ptr.Ptr;
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
public class AVAudioRecorder extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected AVAudioRecorder(Pointer peer) {
        super(peer);
    }

    @Generated
    @Owned
    @Selector("alloc")
    public static native AVAudioRecorder alloc();

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
     * averagePowerForChannel:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAudioRecorder_ClassReference/index.html#//apple_ref/occ/instm/AVAudioRecorder/averagePowerForChannel:">iOS Dev Center</a>
     */
    @Generated
    @Selector("averagePowerForChannel:")
    public native float averagePowerForChannel(@NUInt long channelNumber);

    /**
     * channelAssignments</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAudioRecorder_ClassReference/index.html#//apple_ref/occ/instp/AVAudioRecorder/channelAssignments">iOS Dev Center</a>
     */
    @Generated
    @Selector("channelAssignments")
    public native NSArray<? extends NSNumber> channelAssignments();

    /**
     * currentTime</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAudioRecorder_ClassReference/index.html#//apple_ref/occ/instp/AVAudioRecorder/currentTime">iOS Dev Center</a>
     */
    @Generated
    @Selector("currentTime")
    public native double currentTime();

    /**
     * delegate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAudioRecorder_ClassReference/index.html#//apple_ref/occ/instp/AVAudioRecorder/delegate">iOS Dev Center</a>
     */
    @Generated
    @Selector("delegate")
    @MappedReturn(ObjCObjectMapper.class)
    public native AVAudioRecorderDelegate delegate();

    /**
     * deleteRecording</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAudioRecorder_ClassReference/index.html#//apple_ref/occ/instm/AVAudioRecorder/deleteRecording">iOS Dev Center</a>
     */
    @Generated
    @Selector("deleteRecording")
    public native boolean deleteRecording();

    /**
     * deviceCurrentTime</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAudioRecorder_ClassReference/index.html#//apple_ref/occ/instp/AVAudioRecorder/deviceCurrentTime">iOS Dev Center</a>
     */
    @Generated
    @Selector("deviceCurrentTime")
    public native double deviceCurrentTime();

    @Generated
    @Selector("init")
    public native AVAudioRecorder init();

    /**
     * initWithURL:settings:error:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAudioRecorder_ClassReference/index.html#//apple_ref/occ/instm/AVAudioRecorder/initWithURL:settings:error:">iOS Dev Center</a>
     */
    @Generated
    @Selector("initWithURL:settings:error:")
    public native AVAudioRecorder initWithURLSettingsError(NSURL url, NSDictionary<String, ?> settings,
            Ptr<NSError> outError);

    /**
     * meteringEnabled</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAudioRecorder_ClassReference/index.html#//apple_ref/occ/instp/AVAudioRecorder/meteringEnabled">iOS Dev Center</a>
     */
    @Generated
    @Selector("isMeteringEnabled")
    public native boolean isMeteringEnabled();

    /**
     * meteringEnabled</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAudioRecorder_ClassReference/index.html#//apple_ref/occ/instp/AVAudioRecorder/meteringEnabled">iOS Dev Center</a>
     */
    @Generated
    @Selector("setMeteringEnabled:")
    public native void setMeteringEnabled(boolean value);

    /**
     * recording</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAudioRecorder_ClassReference/index.html#//apple_ref/occ/instp/AVAudioRecorder/recording">iOS Dev Center</a>
     */
    @Generated
    @Selector("isRecording")
    public native boolean isRecording();

    /**
     * pause</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAudioRecorder_ClassReference/index.html#//apple_ref/occ/instm/AVAudioRecorder/pause">iOS Dev Center</a>
     */
    @Generated
    @Selector("pause")
    public native void pause();

    /**
     * peakPowerForChannel:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAudioRecorder_ClassReference/index.html#//apple_ref/occ/instm/AVAudioRecorder/peakPowerForChannel:">iOS Dev Center</a>
     */
    @Generated
    @Selector("peakPowerForChannel:")
    public native float peakPowerForChannel(@NUInt long channelNumber);

    /**
     * prepareToRecord</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAudioRecorder_ClassReference/index.html#//apple_ref/occ/instm/AVAudioRecorder/prepareToRecord">iOS Dev Center</a>
     */
    @Generated
    @Selector("prepareToRecord")
    public native boolean prepareToRecord();

    /**
     * record</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAudioRecorder_ClassReference/index.html#//apple_ref/occ/instm/AVAudioRecorder/record">iOS Dev Center</a>
     */
    @Generated
    @Selector("record")
    public native boolean record();

    /**
     * recordAtTime:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAudioRecorder_ClassReference/index.html#//apple_ref/occ/instm/AVAudioRecorder/recordAtTime:">iOS Dev Center</a>
     */
    @Generated
    @Selector("recordAtTime:")
    public native boolean recordAtTime(double time);

    /**
     * recordAtTime:forDuration:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAudioRecorder_ClassReference/index.html#//apple_ref/occ/instm/AVAudioRecorder/recordAtTime:forDuration:">iOS Dev Center</a>
     */
    @Generated
    @Selector("recordAtTime:forDuration:")
    public native boolean recordAtTimeForDuration(double time, double duration);

    /**
     * recordForDuration:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAudioRecorder_ClassReference/index.html#//apple_ref/occ/instm/AVAudioRecorder/recordForDuration:">iOS Dev Center</a>
     */
    @Generated
    @Selector("recordForDuration:")
    public native boolean recordForDuration(double duration);

    /**
     * channelAssignments</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAudioRecorder_ClassReference/index.html#//apple_ref/occ/instp/AVAudioRecorder/channelAssignments">iOS Dev Center</a>
     */
    @Generated
    @Selector("setChannelAssignments:")
    public native void setChannelAssignments(NSArray<? extends NSNumber> value);

    /**
     * delegate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAudioRecorder_ClassReference/index.html#//apple_ref/occ/instp/AVAudioRecorder/delegate">iOS Dev Center</a>
     */
    @Generated
    @Selector("setDelegate:")
    public native void setDelegate_unsafe(@Mapped(ObjCObjectMapper.class) AVAudioRecorderDelegate value);

    /**
     * delegate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAudioRecorder_ClassReference/index.html#//apple_ref/occ/instp/AVAudioRecorder/delegate">iOS Dev Center</a>
     */
    @Generated
    public void setDelegate(@Mapped(ObjCObjectMapper.class) AVAudioRecorderDelegate value) {
        Object __old = delegate();
        if (value != null) {
            org.moe.natj.objc.ObjCRuntime.associateObjCObject(this, value);
        }
        setDelegate_unsafe(value);
        if (__old != null) {
            org.moe.natj.objc.ObjCRuntime.dissociateObjCObject(this, __old);
        }
    }

    /**
     * settings</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAudioRecorder_ClassReference/index.html#//apple_ref/occ/instp/AVAudioRecorder/settings">iOS Dev Center</a>
     */
    @Generated
    @Selector("settings")
    public native NSDictionary<String, ?> settings();

    /**
     * stop</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAudioRecorder_ClassReference/index.html#//apple_ref/occ/instm/AVAudioRecorder/stop">iOS Dev Center</a>
     */
    @Generated
    @Selector("stop")
    public native void stop();

    /**
     * updateMeters</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAudioRecorder_ClassReference/index.html#//apple_ref/occ/instm/AVAudioRecorder/updateMeters">iOS Dev Center</a>
     */
    @Generated
    @Selector("updateMeters")
    public native void updateMeters();

    /**
     * url</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAudioRecorder_ClassReference/index.html#//apple_ref/occ/instp/AVAudioRecorder/url">iOS Dev Center</a>
     */
    @Generated
    @Selector("url")
    public native NSURL url();
}

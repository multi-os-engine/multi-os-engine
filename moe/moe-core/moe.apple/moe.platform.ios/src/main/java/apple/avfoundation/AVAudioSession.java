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
import apple.avfoundation.protocol.AVAudioSessionDelegate;
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
import org.moe.natj.general.ann.MappedReturn;
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
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("AVFoundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class AVAudioSession extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected AVAudioSession(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native AVAudioSession alloc();

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
    @Selector("sharedInstance")
    public static native AVAudioSession sharedInstance();

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @Generated
    @Selector("IOBufferDuration")
    public native double IOBufferDuration();

    @Generated
    @Selector("availableCategories")
    public native NSArray<String> availableCategories();

    @Generated
    @Selector("availableInputs")
    public native NSArray<? extends AVAudioSessionPortDescription> availableInputs();

    @Generated
    @Selector("availableModes")
    public native NSArray<String> availableModes();

    @Generated
    @Selector("category")
    public native String category();

    @Generated
    @Selector("categoryOptions")
    @NUInt
    public native long categoryOptions();

    @Generated
    @Deprecated
    @Selector("currentHardwareInputNumberOfChannels")
    @NInt
    public native long currentHardwareInputNumberOfChannels();

    @Generated
    @Deprecated
    @Selector("currentHardwareOutputNumberOfChannels")
    @NInt
    public native long currentHardwareOutputNumberOfChannels();

    @Generated
    @Deprecated
    @Selector("currentHardwareSampleRate")
    public native double currentHardwareSampleRate();

    @Generated
    @Selector("currentRoute")
    public native AVAudioSessionRouteDescription currentRoute();

    @Generated
    @Deprecated
    @Selector("delegate")
    @MappedReturn(ObjCObjectMapper.class)
    public native AVAudioSessionDelegate delegate();

    @Generated
    @Selector("init")
    public native AVAudioSession init();

    @Generated
    @Selector("inputDataSource")
    public native AVAudioSessionDataSourceDescription inputDataSource();

    @Generated
    @Selector("inputDataSources")
    public native NSArray<? extends AVAudioSessionDataSourceDescription> inputDataSources();

    @Generated
    @Selector("inputGain")
    public native float inputGain();

    @Generated
    @Deprecated
    @Selector("inputIsAvailable")
    public native boolean inputIsAvailable();

    @Generated
    @Selector("inputLatency")
    public native double inputLatency();

    @Generated
    @Selector("inputNumberOfChannels")
    @NInt
    public native long inputNumberOfChannels();

    @Generated
    @Selector("isInputAvailable")
    public native boolean isInputAvailable();

    @Generated
    @Selector("isInputGainSettable")
    public native boolean isInputGainSettable();

    @Generated
    @Selector("isOtherAudioPlaying")
    public native boolean isOtherAudioPlaying();

    @Generated
    @Selector("maximumInputNumberOfChannels")
    @NInt
    public native long maximumInputNumberOfChannels();

    @Generated
    @Selector("maximumOutputNumberOfChannels")
    @NInt
    public native long maximumOutputNumberOfChannels();

    @Generated
    @Selector("mode")
    public native String mode();

    @Generated
    @Selector("outputDataSource")
    public native AVAudioSessionDataSourceDescription outputDataSource();

    @Generated
    @Selector("outputDataSources")
    public native NSArray<? extends AVAudioSessionDataSourceDescription> outputDataSources();

    @Generated
    @Selector("outputLatency")
    public native double outputLatency();

    @Generated
    @Selector("outputNumberOfChannels")
    @NInt
    public native long outputNumberOfChannels();

    @Generated
    @Selector("outputVolume")
    public native float outputVolume();

    @Generated
    @Selector("overrideOutputAudioPort:error:")
    public native boolean overrideOutputAudioPortError(@NUInt long portOverride,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

    @Generated
    @Deprecated
    @Selector("preferredHardwareSampleRate")
    public native double preferredHardwareSampleRate();

    @Generated
    @Selector("preferredIOBufferDuration")
    public native double preferredIOBufferDuration();

    @Generated
    @Selector("preferredInput")
    public native AVAudioSessionPortDescription preferredInput();

    @Generated
    @Selector("preferredInputNumberOfChannels")
    @NInt
    public native long preferredInputNumberOfChannels();

    @Generated
    @Selector("preferredOutputNumberOfChannels")
    @NInt
    public native long preferredOutputNumberOfChannels();

    @Generated
    @Selector("preferredSampleRate")
    public native double preferredSampleRate();

    @Generated
    @Selector("recordPermission")
    @NUInt
    public native long recordPermission();

    @Generated
    @Selector("requestRecordPermission:")
    public native void requestRecordPermission(
            @ObjCBlock(name = "call_requestRecordPermission") Block_requestRecordPermission response);

    @Generated
    @Selector("sampleRate")
    public native double sampleRate();

    @Generated
    @Selector("secondaryAudioShouldBeSilencedHint")
    public native boolean secondaryAudioShouldBeSilencedHint();

    @Generated
    @Selector("setActive:error:")
    public native boolean setActiveError(boolean active, @ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

    @Generated
    @Deprecated
    @Selector("setActive:withFlags:error:")
    public native boolean setActiveWithFlagsError(boolean active, @NInt long flags,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

    @Generated
    @Selector("setActive:withOptions:error:")
    public native boolean setActiveWithOptionsError(boolean active, @NUInt long options,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

    @Generated
    @Selector("setAggregatedIOPreference:error:")
    public native boolean setAggregatedIOPreferenceError(@NUInt long inIOType,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

    @Generated
    @Selector("setCategory:error:")
    public native boolean setCategoryError(String category, @ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

    @Generated
    @Selector("setCategory:mode:options:error:")
    public native boolean setCategoryModeOptionsError(String category, String mode, @NUInt long options,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

    @Generated
    @Selector("setCategory:withOptions:error:")
    public native boolean setCategoryWithOptionsError(String category, @NUInt long options,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

    @Generated
    @Deprecated
    @Selector("setDelegate:")
    public native void setDelegate_unsafe(@Mapped(ObjCObjectMapper.class) AVAudioSessionDelegate value);

    @Generated
    @Deprecated
    public void setDelegate(@Mapped(ObjCObjectMapper.class) AVAudioSessionDelegate value) {
        Object __old = delegate();
        if (value != null) {
            org.moe.natj.objc.ObjCRuntime.associateObjCObject(this, value);
        }
        setDelegate_unsafe(value);
        if (__old != null) {
            org.moe.natj.objc.ObjCRuntime.dissociateObjCObject(this, __old);
        }
    }

    @Generated
    @Selector("setInputDataSource:error:")
    public native boolean setInputDataSourceError(AVAudioSessionDataSourceDescription dataSource,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

    @Generated
    @Selector("setInputGain:error:")
    public native boolean setInputGainError(float gain, @ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

    @Generated
    @Selector("setMode:error:")
    public native boolean setModeError(String mode, @ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

    @Generated
    @Selector("setOutputDataSource:error:")
    public native boolean setOutputDataSourceError(AVAudioSessionDataSourceDescription dataSource,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

    @Generated
    @Deprecated
    @Selector("setPreferredHardwareSampleRate:error:")
    public native boolean setPreferredHardwareSampleRateError(double sampleRate,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

    @Generated
    @Selector("setPreferredIOBufferDuration:error:")
    public native boolean setPreferredIOBufferDurationError(double duration,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

    @Generated
    @Selector("setPreferredInput:error:")
    public native boolean setPreferredInputError(AVAudioSessionPortDescription inPort,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

    @Generated
    @Selector("setPreferredInputNumberOfChannels:error:")
    public native boolean setPreferredInputNumberOfChannelsError(@NInt long count,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

    @Generated
    @Selector("setPreferredOutputNumberOfChannels:error:")
    public native boolean setPreferredOutputNumberOfChannelsError(@NInt long count,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

    @Generated
    @Selector("setPreferredSampleRate:error:")
    public native boolean setPreferredSampleRateError(double sampleRate,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_requestRecordPermission {
        @Generated
        void call_requestRecordPermission(boolean arg0);
    }

    @Generated
    @Selector("routeSharingPolicy")
    @NUInt
    public native long routeSharingPolicy();

    @Generated
    @Selector("setCategory:mode:routeSharingPolicy:options:error:")
    public native boolean setCategoryModeRouteSharingPolicyOptionsError(String category, String mode,
            @NUInt long policy, @NUInt long options, @ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

    @Generated
    @Selector("allowHapticsAndSystemSoundsDuringRecording")
    public native boolean allowHapticsAndSystemSoundsDuringRecording();

    @Generated
    @Selector("promptStyle")
    @NUInt
    public native long promptStyle();

    @Generated
    @Selector("setAllowHapticsAndSystemSoundsDuringRecording:error:")
    public native boolean setAllowHapticsAndSystemSoundsDuringRecordingError(boolean inValue,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

    @Generated
    @Selector("prepareRouteSelectionForPlaybackWithCompletionHandler:")
    public native void prepareRouteSelectionForPlaybackWithCompletionHandler(
            @ObjCBlock(name = "call_prepareRouteSelectionForPlaybackWithCompletionHandler") Block_prepareRouteSelectionForPlaybackWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_prepareRouteSelectionForPlaybackWithCompletionHandler {
        @Generated
        void call_prepareRouteSelectionForPlaybackWithCompletionHandler(boolean arg0, @NInt long arg1);
    }
}

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

package apple.audiotoolbox;

import apple.NSObject;
import apple.audiotoolbox.opaque.AudioComponent;
import apple.audiotoolbox.struct.AudioComponentDescription;
import apple.avfoundation.AVAudioFormat;
import apple.coreaudio.struct.AudioBufferList;
import apple.coreaudio.struct.AudioTimeStamp;
import apple.foundation.NSArray;
import apple.foundation.NSDictionary;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSNumber;
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
import org.moe.natj.general.ann.ReferenceInfo;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.ConstBytePtr;
import org.moe.natj.general.ptr.DoublePtr;
import org.moe.natj.general.ptr.IntPtr;
import org.moe.natj.general.ptr.NIntPtr;
import org.moe.natj.general.ptr.NUIntPtr;
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
@Library("AudioToolbox")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class AUAudioUnit extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected AUAudioUnit(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native AUAudioUnit alloc();

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
    @Selector("instantiateWithComponentDescription:options:completionHandler:")
    public static native void instantiateWithComponentDescriptionOptionsCompletionHandler(
            @ByValue AudioComponentDescription componentDescription, int options,
            @ObjCBlock(name = "call_instantiateWithComponentDescriptionOptionsCompletionHandler") Block_instantiateWithComponentDescriptionOptionsCompletionHandler completionHandler);

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
    @Selector("registerSubclass:asComponentDescription:name:version:")
    public static native void registerSubclassAsComponentDescriptionNameVersion(Class cls,
            @ByValue AudioComponentDescription componentDescription, String name, int version);

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

    @Generated
    @Selector("allParameterValues")
    public native boolean allParameterValues();

    @Generated
    @Selector("allocateRenderResourcesAndReturnError:")
    public native boolean allocateRenderResourcesAndReturnError(
            @ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

    @Generated
    @Selector("audioUnitName")
    public native String audioUnitName();

    @Generated
    @Selector("canPerformInput")
    public native boolean canPerformInput();

    @Generated
    @Selector("canPerformOutput")
    public native boolean canPerformOutput();

    @Generated
    @Selector("canProcessInPlace")
    public native boolean canProcessInPlace();

    @Generated
    @Selector("channelCapabilities")
    public native NSArray<? extends NSNumber> channelCapabilities();

    @Generated
    @Selector("channelMap")
    public native NSArray<? extends NSNumber> channelMap();

    @Generated
    @Selector("component")
    public native AudioComponent component();

    @Generated
    @Selector("componentDescription")
    @ByValue
    public native AudioComponentDescription componentDescription();

    @Generated
    @Selector("componentName")
    public native String componentName();

    @Generated
    @Selector("componentVersion")
    public native int componentVersion();

    @Generated
    @Selector("contextName")
    public native String contextName();

    @Generated
    @Selector("currentPreset")
    public native AUAudioUnitPreset currentPreset();

    @Generated
    @Selector("deallocateRenderResources")
    public native void deallocateRenderResources();

    @Generated
    @Selector("factoryPresets")
    public native NSArray<? extends AUAudioUnitPreset> factoryPresets();

    @Generated
    @Selector("fullState")
    public native NSDictionary<String, ?> fullState();

    @Generated
    @Selector("fullStateForDocument")
    public native NSDictionary<String, ?> fullStateForDocument();

    @Generated
    @Selector("init")
    public native AUAudioUnit init();

    @Generated
    @Selector("initWithComponentDescription:error:")
    public native AUAudioUnit initWithComponentDescriptionError(@ByValue AudioComponentDescription componentDescription,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

    @Generated
    @Selector("initWithComponentDescription:options:error:")
    public native AUAudioUnit initWithComponentDescriptionOptionsError(
            @ByValue AudioComponentDescription componentDescription, int options,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

    @Generated
    @Selector("inputBusses")
    public native AUAudioUnitBusArray inputBusses();

    @Generated
    @Selector("inputHandler")
    @ObjCBlock(name = "call_inputHandler_ret")
    public native Block_inputHandler_ret inputHandler();

    @Generated
    @Selector("isInputEnabled")
    public native boolean isInputEnabled();

    @Generated
    @Selector("setInputEnabled:")
    public native void setInputEnabled(boolean value);

    @Generated
    @Selector("isMusicDeviceOrEffect")
    public native boolean isMusicDeviceOrEffect();

    @Generated
    @Selector("isOutputEnabled")
    public native boolean isOutputEnabled();

    @Generated
    @Selector("setOutputEnabled:")
    public native void setOutputEnabled(boolean value);

    @Generated
    @Selector("isRenderingOffline")
    public native boolean isRenderingOffline();

    @Generated
    @Selector("setRenderingOffline:")
    public native void setRenderingOffline(boolean value);

    @Generated
    @Selector("latency")
    public native double latency();

    @Generated
    @Selector("manufacturerName")
    public native String manufacturerName();

    @Generated
    @Selector("maximumFramesToRender")
    public native int maximumFramesToRender();

    @Generated
    @Selector("musicalContextBlock")
    @ObjCBlock(name = "call_musicalContextBlock_ret")
    public native Block_musicalContextBlock_ret musicalContextBlock();

    @Generated
    @Selector("outputBusses")
    public native AUAudioUnitBusArray outputBusses();

    @Generated
    @Selector("outputProvider")
    @ObjCBlock(name = "call_outputProvider_ret")
    public native Block_outputProvider_ret outputProvider();

    @Generated
    @Selector("parameterTree")
    public native AUParameterTree parameterTree();

    @Generated
    @Selector("parametersForOverviewWithCount:")
    public native NSArray<? extends NSNumber> parametersForOverviewWithCount(@NInt long count);

    @Generated
    @Selector("removeRenderObserver:")
    public native void removeRenderObserver(@NInt long token);

    @Generated
    @Selector("renderQuality")
    @NInt
    public native long renderQuality();

    @Generated
    @Selector("renderResourcesAllocated")
    public native boolean renderResourcesAllocated();

    @Generated
    @Selector("reset")
    public native void reset();

    @Generated
    @Selector("scheduleMIDIEventBlock")
    @ObjCBlock(name = "call_scheduleMIDIEventBlock_ret")
    public native Block_scheduleMIDIEventBlock_ret scheduleMIDIEventBlock();

    @Generated
    @Selector("scheduleParameterBlock")
    @ObjCBlock(name = "call_scheduleParameterBlock_ret")
    public native Block_scheduleParameterBlock_ret scheduleParameterBlock();

    @Generated
    @Selector("setChannelMap:")
    public native void setChannelMap(NSArray<? extends NSNumber> value);

    @Generated
    @Selector("setContextName:")
    public native void setContextName(String value);

    @Generated
    @Selector("setCurrentPreset:")
    public native void setCurrentPreset(AUAudioUnitPreset value);

    @Generated
    @Selector("setFullState:")
    public native void setFullState(NSDictionary<String, ?> value);

    @Generated
    @Selector("setFullStateForDocument:")
    public native void setFullStateForDocument(NSDictionary<String, ?> value);

    @Generated
    @Selector("setInputHandler:")
    public native void setInputHandler(@ObjCBlock(name = "call_setInputHandler") Block_setInputHandler value);

    @Generated
    @Selector("setMaximumFramesToRender:")
    public native void setMaximumFramesToRender(int value);

    @Generated
    @Selector("setMusicalContextBlock:")
    public native void setMusicalContextBlock(
            @ObjCBlock(name = "call_setMusicalContextBlock") Block_setMusicalContextBlock value);

    @Generated
    @Selector("setOutputProvider:")
    public native void setOutputProvider(@ObjCBlock(name = "call_setOutputProvider") Block_setOutputProvider value);

    @Generated
    @Selector("setRenderQuality:")
    public native void setRenderQuality(@NInt long value);

    @Generated
    @Selector("setRenderResourcesAllocated:")
    public native void setRenderResourcesAllocated(boolean flag);

    @Generated
    @Selector("setShouldBypassEffect:")
    public native void setShouldBypassEffect(boolean value);

    @Generated
    @Selector("setTransportStateBlock:")
    public native void setTransportStateBlock(
            @ObjCBlock(name = "call_setTransportStateBlock") Block_setTransportStateBlock value);

    @Generated
    @Selector("shouldBypassEffect")
    public native boolean shouldBypassEffect();

    @Generated
    @Selector("shouldChangeToFormat:forBus:")
    public native boolean shouldChangeToFormatForBus(AVAudioFormat format, AUAudioUnitBus bus);

    @Generated
    @Selector("startHardwareAndReturnError:")
    public native boolean startHardwareAndReturnError(@ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

    @Generated
    @Selector("stopHardware")
    public native void stopHardware();

    @Generated
    @Selector("supportsMPE")
    public native boolean supportsMPE();

    @Generated
    @Selector("tailTime")
    public native double tailTime();

    @Generated
    @Selector("tokenByAddingRenderObserver:")
    @NInt
    public native long tokenByAddingRenderObserver(
            @ObjCBlock(name = "call_tokenByAddingRenderObserver") Block_tokenByAddingRenderObserver observer);

    @Generated
    @Selector("transportStateBlock")
    @ObjCBlock(name = "call_transportStateBlock_ret")
    public native Block_transportStateBlock_ret transportStateBlock();

    @Generated
    @Selector("virtualMIDICableCount")
    @NInt
    public native long virtualMIDICableCount();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_inputHandler_ret {
        @Generated
        void call_inputHandler_ret(IntPtr arg0, AudioTimeStamp arg1, int arg2, @NInt long arg3);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_instantiateWithComponentDescriptionOptionsCompletionHandler {
        @Generated
        void call_instantiateWithComponentDescriptionOptionsCompletionHandler(AUAudioUnit arg0, NSError arg1);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_musicalContextBlock_ret {
        @Generated
        boolean call_musicalContextBlock_ret(DoublePtr arg0, DoublePtr arg1, NIntPtr arg2, DoublePtr arg3, NIntPtr arg4,
                DoublePtr arg5);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_outputProvider_ret {
        @Generated
        int call_outputProvider_ret(IntPtr arg0, AudioTimeStamp arg1, int arg2, @NInt long arg3, AudioBufferList arg4);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_scheduleMIDIEventBlock_ret {
        @Generated
        void call_scheduleMIDIEventBlock_ret(long arg0, byte arg1, @NInt long arg2, ConstBytePtr arg3);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_scheduleParameterBlock_ret {
        @Generated
        void call_scheduleParameterBlock_ret(long arg0, int arg1, long arg2, float arg3);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setInputHandler {
        @Generated
        void call_setInputHandler(IntPtr arg0, AudioTimeStamp arg1, int arg2, @NInt long arg3);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setMusicalContextBlock {
        @Generated
        boolean call_setMusicalContextBlock(DoublePtr arg0, DoublePtr arg1, NIntPtr arg2, DoublePtr arg3, NIntPtr arg4,
                DoublePtr arg5);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setOutputProvider {
        @Generated
        int call_setOutputProvider(IntPtr arg0, AudioTimeStamp arg1, int arg2, @NInt long arg3, AudioBufferList arg4);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setTransportStateBlock {
        @Generated
        boolean call_setTransportStateBlock(NUIntPtr arg0, DoublePtr arg1, DoublePtr arg2, DoublePtr arg3);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_tokenByAddingRenderObserver {
        @Generated
        void call_tokenByAddingRenderObserver(int arg0, AudioTimeStamp arg1, int arg2, @NInt long arg3);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_transportStateBlock_ret {
        @Generated
        boolean call_transportStateBlock_ret(NUIntPtr arg0, DoublePtr arg1, DoublePtr arg2, DoublePtr arg3);
    }
}

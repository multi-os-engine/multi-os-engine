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

package apple.audiounit;

import apple.NSObject;
import apple.audiounit.opaque.AudioComponent;
import apple.audiounit.struct.AudioComponentDescription;
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
@Library("AudioUnit")
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
    @Owned
    @Selector("alloc")
    public static native AUAudioUnit alloc();

    /**
     * instantiateWithComponentDescription:options:completionHandler:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AudioUnit/Reference/AUAudioUnit_ClassReference/index.html#//apple_ref/occ/clm/AUAudioUnit/instantiateWithComponentDescription:options:completionHandler:">iOS Dev Center</a>
     */
    @Generated
    @Selector("instantiateWithComponentDescription:options:completionHandler:")
    public static native void instantiateWithComponentDescriptionOptionsCompletionHandler(
            @ByValue AudioComponentDescription componentDescription, int options,
            @ObjCBlock(name = "call_instantiateWithComponentDescriptionOptionsCompletionHandler") Block_instantiateWithComponentDescriptionOptionsCompletionHandler completionHandler);

    /**
     * registerSubclass:asComponentDescription:name:version:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AudioUnit/Reference/AUAudioUnit_ClassReference/index.html#//apple_ref/occ/clm/AUAudioUnit/registerSubclass:asComponentDescription:name:version:">iOS Dev Center</a>
     */
    @Generated
    @Selector("registerSubclass:asComponentDescription:name:version:")
    public static native void registerSubclassAsComponentDescriptionNameVersion(Class cls,
            @ByValue AudioComponentDescription componentDescription, String name, int version);

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
     * allParameterValues</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AudioUnit/Reference/AUAudioUnit_ClassReference/index.html#//apple_ref/occ/instp/AUAudioUnit/allParameterValues">iOS Dev Center</a>
     */
    @Generated
    @Selector("allParameterValues")
    public native boolean allParameterValues();

    /**
     * allocateRenderResourcesAndReturnError:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AudioUnit/Reference/AUAudioUnit_ClassReference/index.html#//apple_ref/occ/instm/AUAudioUnit/allocateRenderResourcesAndReturnError:">iOS Dev Center</a>
     */
    @Generated
    @Selector("allocateRenderResourcesAndReturnError:")
    public native boolean allocateRenderResourcesAndReturnError(Ptr<NSError> outError);

    /**
     * audioUnitName</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AudioUnit/Reference/AUAudioUnit_ClassReference/index.html#//apple_ref/occ/instp/AUAudioUnit/audioUnitName">iOS Dev Center</a>
     */
    @Generated
    @Selector("audioUnitName")
    public native String audioUnitName();

    /**
     * canPerformInput</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AudioUnit/Reference/AUAudioUnit_ClassReference/index.html#//apple_ref/occ/instp/AUAudioUnit/canPerformInput">iOS Dev Center</a>
     */
    @Generated
    @Selector("canPerformInput")
    public native boolean canPerformInput();

    /**
     * canPerformOutput</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AudioUnit/Reference/AUAudioUnit_ClassReference/index.html#//apple_ref/occ/instp/AUAudioUnit/canPerformOutput">iOS Dev Center</a>
     */
    @Generated
    @Selector("canPerformOutput")
    public native boolean canPerformOutput();

    /**
     * canProcessInPlace</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AudioUnit/Reference/AUAudioUnit_ClassReference/index.html#//apple_ref/occ/instp/AUAudioUnit/canProcessInPlace">iOS Dev Center</a>
     */
    @Generated
    @Selector("canProcessInPlace")
    public native boolean canProcessInPlace();

    /**
     * channelCapabilities</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AudioUnit/Reference/AUAudioUnit_ClassReference/index.html#//apple_ref/occ/instp/AUAudioUnit/channelCapabilities">iOS Dev Center</a>
     */
    @Generated
    @Selector("channelCapabilities")
    public native NSArray<? extends NSNumber> channelCapabilities();

    /**
     * component</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AudioUnit/Reference/AUAudioUnit_ClassReference/index.html#//apple_ref/occ/instp/AUAudioUnit/component">iOS Dev Center</a>
     */
    @Generated
    @Selector("component")
    public native AudioComponent component();

    /**
     * componentDescription</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AudioUnit/Reference/AUAudioUnit_ClassReference/index.html#//apple_ref/occ/instp/AUAudioUnit/componentDescription">iOS Dev Center</a>
     */
    @Generated
    @Selector("componentDescription")
    @ByValue
    public native AudioComponentDescription componentDescription();

    /**
     * componentName</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AudioUnit/Reference/AUAudioUnit_ClassReference/index.html#//apple_ref/occ/instp/AUAudioUnit/componentName">iOS Dev Center</a>
     */
    @Generated
    @Selector("componentName")
    public native String componentName();

    /**
     * componentVersion</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AudioUnit/Reference/AUAudioUnit_ClassReference/index.html#//apple_ref/occ/instp/AUAudioUnit/componentVersion">iOS Dev Center</a>
     */
    @Generated
    @Selector("componentVersion")
    public native int componentVersion();

    /**
     * contextName</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AudioUnit/Reference/AUAudioUnit_ClassReference/index.html#//apple_ref/occ/instp/AUAudioUnit/contextName">iOS Dev Center</a>
     */
    @Generated
    @Selector("contextName")
    public native String contextName();

    /**
     * currentPreset</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AudioUnit/Reference/AUAudioUnit_ClassReference/index.html#//apple_ref/occ/instp/AUAudioUnit/currentPreset">iOS Dev Center</a>
     */
    @Generated
    @Selector("currentPreset")
    public native AUAudioUnitPreset currentPreset();

    /**
     * deallocateRenderResources</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AudioUnit/Reference/AUAudioUnit_ClassReference/index.html#//apple_ref/occ/instm/AUAudioUnit/deallocateRenderResources">iOS Dev Center</a>
     */
    @Generated
    @Selector("deallocateRenderResources")
    public native void deallocateRenderResources();

    /**
     * factoryPresets</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AudioUnit/Reference/AUAudioUnit_ClassReference/index.html#//apple_ref/occ/instp/AUAudioUnit/factoryPresets">iOS Dev Center</a>
     */
    @Generated
    @Selector("factoryPresets")
    public native NSArray<? extends AUAudioUnitPreset> factoryPresets();

    /**
     * fullState</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AudioUnit/Reference/AUAudioUnit_ClassReference/index.html#//apple_ref/occ/instp/AUAudioUnit/fullState">iOS Dev Center</a>
     */
    @Generated
    @Selector("fullState")
    public native NSDictionary<String, ?> fullState();

    /**
     * fullStateForDocument</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AudioUnit/Reference/AUAudioUnit_ClassReference/index.html#//apple_ref/occ/instp/AUAudioUnit/fullStateForDocument">iOS Dev Center</a>
     */
    @Generated
    @Selector("fullStateForDocument")
    public native NSDictionary<String, ?> fullStateForDocument();

    @Generated
    @Selector("init")
    public native AUAudioUnit init();

    /**
     * initWithComponentDescription:error:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AudioUnit/Reference/AUAudioUnit_ClassReference/index.html#//apple_ref/occ/instm/AUAudioUnit/initWithComponentDescription:error:">iOS Dev Center</a>
     */
    @Generated
    @Selector("initWithComponentDescription:error:")
    public native AUAudioUnit initWithComponentDescriptionError(@ByValue AudioComponentDescription componentDescription,
            Ptr<NSError> outError);

    /**
     * initWithComponentDescription:options:error:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AudioUnit/Reference/AUAudioUnit_ClassReference/index.html#//apple_ref/occ/instm/AUAudioUnit/initWithComponentDescription:options:error:">iOS Dev Center</a>
     */
    @Generated
    @Selector("initWithComponentDescription:options:error:")
    public native AUAudioUnit initWithComponentDescriptionOptionsError(
            @ByValue AudioComponentDescription componentDescription, int options, Ptr<NSError> outError);

    /**
     * inputBusses</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AudioUnit/Reference/AUAudioUnit_ClassReference/index.html#//apple_ref/occ/instp/AUAudioUnit/inputBusses">iOS Dev Center</a>
     */
    @Generated
    @Selector("inputBusses")
    public native AUAudioUnitBusArray inputBusses();

    /**
     * inputHandler</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AudioUnit/Reference/AUAudioUnit_ClassReference/index.html#//apple_ref/occ/instp/AUAudioUnit/inputHandler">iOS Dev Center</a>
     */
    @Generated
    @Selector("inputHandler")
    @ObjCBlock(name = "call_inputHandler_ret")
    public native Block_inputHandler_ret inputHandler();

    /**
     * inputEnabled</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AudioUnit/Reference/AUAudioUnit_ClassReference/index.html#//apple_ref/occ/instp/AUAudioUnit/inputEnabled">iOS Dev Center</a>
     */
    @Generated
    @Selector("isInputEnabled")
    public native boolean isInputEnabled();

    /**
     * inputEnabled</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AudioUnit/Reference/AUAudioUnit_ClassReference/index.html#//apple_ref/occ/instp/AUAudioUnit/inputEnabled">iOS Dev Center</a>
     */
    @Generated
    @Selector("setInputEnabled:")
    public native void setInputEnabled(boolean value);

    /**
     * musicDeviceOrEffect</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AudioUnit/Reference/AUAudioUnit_ClassReference/index.html#//apple_ref/occ/instp/AUAudioUnit/musicDeviceOrEffect">iOS Dev Center</a>
     */
    @Generated
    @Selector("isMusicDeviceOrEffect")
    public native boolean isMusicDeviceOrEffect();

    /**
     * outputEnabled</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AudioUnit/Reference/AUAudioUnit_ClassReference/index.html#//apple_ref/occ/instp/AUAudioUnit/outputEnabled">iOS Dev Center</a>
     */
    @Generated
    @Selector("isOutputEnabled")
    public native boolean isOutputEnabled();

    /**
     * outputEnabled</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AudioUnit/Reference/AUAudioUnit_ClassReference/index.html#//apple_ref/occ/instp/AUAudioUnit/outputEnabled">iOS Dev Center</a>
     */
    @Generated
    @Selector("setOutputEnabled:")
    public native void setOutputEnabled(boolean value);

    /**
     * renderingOffline</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AudioUnit/Reference/AUAudioUnit_ClassReference/index.html#//apple_ref/occ/instp/AUAudioUnit/renderingOffline">iOS Dev Center</a>
     */
    @Generated
    @Selector("isRenderingOffline")
    public native boolean isRenderingOffline();

    /**
     * renderingOffline</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AudioUnit/Reference/AUAudioUnit_ClassReference/index.html#//apple_ref/occ/instp/AUAudioUnit/renderingOffline">iOS Dev Center</a>
     */
    @Generated
    @Selector("setRenderingOffline:")
    public native void setRenderingOffline(boolean value);

    /**
     * latency</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AudioUnit/Reference/AUAudioUnit_ClassReference/index.html#//apple_ref/occ/instp/AUAudioUnit/latency">iOS Dev Center</a>
     */
    @Generated
    @Selector("latency")
    public native double latency();

    /**
     * manufacturerName</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AudioUnit/Reference/AUAudioUnit_ClassReference/index.html#//apple_ref/occ/instp/AUAudioUnit/manufacturerName">iOS Dev Center</a>
     */
    @Generated
    @Selector("manufacturerName")
    public native String manufacturerName();

    /**
     * maximumFramesToRender</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AudioUnit/Reference/AUAudioUnit_ClassReference/index.html#//apple_ref/occ/instp/AUAudioUnit/maximumFramesToRender">iOS Dev Center</a>
     */
    @Generated
    @Selector("maximumFramesToRender")
    public native int maximumFramesToRender();

    /**
     * musicalContextBlock</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AudioUnit/Reference/AUAudioUnit_ClassReference/index.html#//apple_ref/occ/instp/AUAudioUnit/musicalContextBlock">iOS Dev Center</a>
     */
    @Generated
    @Selector("musicalContextBlock")
    @ObjCBlock(name = "call_musicalContextBlock_ret")
    public native Block_musicalContextBlock_ret musicalContextBlock();

    /**
     * outputBusses</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AudioUnit/Reference/AUAudioUnit_ClassReference/index.html#//apple_ref/occ/instp/AUAudioUnit/outputBusses">iOS Dev Center</a>
     */
    @Generated
    @Selector("outputBusses")
    public native AUAudioUnitBusArray outputBusses();

    /**
     * outputProvider</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AudioUnit/Reference/AUAudioUnit_ClassReference/index.html#//apple_ref/occ/instp/AUAudioUnit/outputProvider">iOS Dev Center</a>
     */
    @Generated
    @Selector("outputProvider")
    @ObjCBlock(name = "call_outputProvider_ret")
    public native Block_outputProvider_ret outputProvider();

    /**
     * parameterTree</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AudioUnit/Reference/AUAudioUnit_ClassReference/index.html#//apple_ref/occ/instp/AUAudioUnit/parameterTree">iOS Dev Center</a>
     */
    @Generated
    @Selector("parameterTree")
    public native AUParameterTree parameterTree();

    /**
     * parametersForOverviewWithCount:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AudioUnit/Reference/AUAudioUnit_ClassReference/index.html#//apple_ref/occ/instm/AUAudioUnit/parametersForOverviewWithCount:">iOS Dev Center</a>
     */
    @Generated
    @Selector("parametersForOverviewWithCount:")
    public native NSArray<? extends NSNumber> parametersForOverviewWithCount(@NInt long count);

    /**
     * removeRenderObserver:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AudioUnit/Reference/AUAudioUnit_ClassReference/index.html#//apple_ref/occ/instm/AUAudioUnit/removeRenderObserver:">iOS Dev Center</a>
     */
    @Generated
    @Selector("removeRenderObserver:")
    public native void removeRenderObserver(@NInt long token);

    /**
     * renderQuality</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AudioUnit/Reference/AUAudioUnit_ClassReference/index.html#//apple_ref/occ/instp/AUAudioUnit/renderQuality">iOS Dev Center</a>
     */
    @Generated
    @Selector("renderQuality")
    @NInt
    public native long renderQuality();

    /**
     * renderResourcesAllocated</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AudioUnit/Reference/AUAudioUnit_ClassReference/index.html#//apple_ref/occ/instp/AUAudioUnit/renderResourcesAllocated">iOS Dev Center</a>
     */
    @Generated
    @Selector("renderResourcesAllocated")
    public native boolean renderResourcesAllocated();

    /**
     * reset</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AudioUnit/Reference/AUAudioUnit_ClassReference/index.html#//apple_ref/occ/instm/AUAudioUnit/reset">iOS Dev Center</a>
     */
    @Generated
    @Selector("reset")
    public native void reset();

    /**
     * scheduleMIDIEventBlock</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AudioUnit/Reference/AUAudioUnit_ClassReference/index.html#//apple_ref/occ/instp/AUAudioUnit/scheduleMIDIEventBlock">iOS Dev Center</a>
     */
    @Generated
    @Selector("scheduleMIDIEventBlock")
    @ObjCBlock(name = "call_scheduleMIDIEventBlock_ret")
    public native Block_scheduleMIDIEventBlock_ret scheduleMIDIEventBlock();

    /**
     * scheduleParameterBlock</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AudioUnit/Reference/AUAudioUnit_ClassReference/index.html#//apple_ref/occ/instp/AUAudioUnit/scheduleParameterBlock">iOS Dev Center</a>
     */
    @Generated
    @Selector("scheduleParameterBlock")
    @ObjCBlock(name = "call_scheduleParameterBlock_ret")
    public native Block_scheduleParameterBlock_ret scheduleParameterBlock();

    /**
     * contextName</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AudioUnit/Reference/AUAudioUnit_ClassReference/index.html#//apple_ref/occ/instp/AUAudioUnit/contextName">iOS Dev Center</a>
     */
    @Generated
    @Selector("setContextName:")
    public native void setContextName(String value);

    /**
     * currentPreset</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AudioUnit/Reference/AUAudioUnit_ClassReference/index.html#//apple_ref/occ/instp/AUAudioUnit/currentPreset">iOS Dev Center</a>
     */
    @Generated
    @Selector("setCurrentPreset:")
    public native void setCurrentPreset(AUAudioUnitPreset value);

    /**
     * fullState</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AudioUnit/Reference/AUAudioUnit_ClassReference/index.html#//apple_ref/occ/instp/AUAudioUnit/fullState">iOS Dev Center</a>
     */
    @Generated
    @Selector("setFullState:")
    public native void setFullState(NSDictionary<String, ?> value);

    /**
     * fullStateForDocument</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AudioUnit/Reference/AUAudioUnit_ClassReference/index.html#//apple_ref/occ/instp/AUAudioUnit/fullStateForDocument">iOS Dev Center</a>
     */
    @Generated
    @Selector("setFullStateForDocument:")
    public native void setFullStateForDocument(NSDictionary<String, ?> value);

    /**
     * inputHandler</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AudioUnit/Reference/AUAudioUnit_ClassReference/index.html#//apple_ref/occ/instp/AUAudioUnit/inputHandler">iOS Dev Center</a>
     */
    @Generated
    @Selector("setInputHandler:")
    public native void setInputHandler(@ObjCBlock(name = "call_setInputHandler") Block_setInputHandler value);

    /**
     * maximumFramesToRender</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AudioUnit/Reference/AUAudioUnit_ClassReference/index.html#//apple_ref/occ/instp/AUAudioUnit/maximumFramesToRender">iOS Dev Center</a>
     */
    @Generated
    @Selector("setMaximumFramesToRender:")
    public native void setMaximumFramesToRender(int value);

    /**
     * musicalContextBlock</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AudioUnit/Reference/AUAudioUnit_ClassReference/index.html#//apple_ref/occ/instp/AUAudioUnit/musicalContextBlock">iOS Dev Center</a>
     */
    @Generated
    @Selector("setMusicalContextBlock:")
    public native void setMusicalContextBlock(
            @ObjCBlock(name = "call_setMusicalContextBlock") Block_setMusicalContextBlock value);

    /**
     * outputProvider</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AudioUnit/Reference/AUAudioUnit_ClassReference/index.html#//apple_ref/occ/instp/AUAudioUnit/outputProvider">iOS Dev Center</a>
     */
    @Generated
    @Selector("setOutputProvider:")
    public native void setOutputProvider(@ObjCBlock(name = "call_setOutputProvider") Block_setOutputProvider value);

    /**
     * renderQuality</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AudioUnit/Reference/AUAudioUnit_ClassReference/index.html#//apple_ref/occ/instp/AUAudioUnit/renderQuality">iOS Dev Center</a>
     */
    @Generated
    @Selector("setRenderQuality:")
    public native void setRenderQuality(@NInt long value);

    /**
     * setRenderResourcesAllocated:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AudioUnit/Reference/AUAudioUnit_ClassReference/index.html#//apple_ref/occ/instm/AUAudioUnit/setRenderResourcesAllocated:">iOS Dev Center</a>
     */
    @Generated
    @Selector("setRenderResourcesAllocated:")
    public native void setRenderResourcesAllocated(boolean flag);

    /**
     * shouldBypassEffect</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AudioUnit/Reference/AUAudioUnit_ClassReference/index.html#//apple_ref/occ/instp/AUAudioUnit/shouldBypassEffect">iOS Dev Center</a>
     */
    @Generated
    @Selector("setShouldBypassEffect:")
    public native void setShouldBypassEffect(boolean value);

    /**
     * transportStateBlock</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AudioUnit/Reference/AUAudioUnit_ClassReference/index.html#//apple_ref/occ/instp/AUAudioUnit/transportStateBlock">iOS Dev Center</a>
     */
    @Generated
    @Selector("setTransportStateBlock:")
    public native void setTransportStateBlock(
            @ObjCBlock(name = "call_setTransportStateBlock") Block_setTransportStateBlock value);

    /**
     * shouldBypassEffect</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AudioUnit/Reference/AUAudioUnit_ClassReference/index.html#//apple_ref/occ/instp/AUAudioUnit/shouldBypassEffect">iOS Dev Center</a>
     */
    @Generated
    @Selector("shouldBypassEffect")
    public native boolean shouldBypassEffect();

    /**
     * shouldChangeToFormat:forBus:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AudioUnit/Reference/AUAudioUnit_ClassReference/index.html#//apple_ref/occ/instm/AUAudioUnit/shouldChangeToFormat:forBus:">iOS Dev Center</a>
     */
    @Generated
    @Selector("shouldChangeToFormat:forBus:")
    public native boolean shouldChangeToFormatForBus(AVAudioFormat format, AUAudioUnitBus bus);

    /**
     * startHardwareAndReturnError:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AudioUnit/Reference/AUAudioUnit_ClassReference/index.html#//apple_ref/occ/instm/AUAudioUnit/startHardwareAndReturnError:">iOS Dev Center</a>
     */
    @Generated
    @Selector("startHardwareAndReturnError:")
    public native boolean startHardwareAndReturnError(Ptr<NSError> outError);

    /**
     * stopHardware</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AudioUnit/Reference/AUAudioUnit_ClassReference/index.html#//apple_ref/occ/instm/AUAudioUnit/stopHardware">iOS Dev Center</a>
     */
    @Generated
    @Selector("stopHardware")
    public native void stopHardware();

    /**
     * tailTime</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AudioUnit/Reference/AUAudioUnit_ClassReference/index.html#//apple_ref/occ/instp/AUAudioUnit/tailTime">iOS Dev Center</a>
     */
    @Generated
    @Selector("tailTime")
    public native double tailTime();

    /**
     * tokenByAddingRenderObserver:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AudioUnit/Reference/AUAudioUnit_ClassReference/index.html#//apple_ref/occ/instm/AUAudioUnit/tokenByAddingRenderObserver:">iOS Dev Center</a>
     */
    @Generated
    @Selector("tokenByAddingRenderObserver:")
    @NInt
    public native long tokenByAddingRenderObserver(
            @ObjCBlock(name = "call_tokenByAddingRenderObserver") Block_tokenByAddingRenderObserver observer);

    /**
     * transportStateBlock</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AudioUnit/Reference/AUAudioUnit_ClassReference/index.html#//apple_ref/occ/instp/AUAudioUnit/transportStateBlock">iOS Dev Center</a>
     */
    @Generated
    @Selector("transportStateBlock")
    @ObjCBlock(name = "call_transportStateBlock_ret")
    public native Block_transportStateBlock_ret transportStateBlock();

    /**
     * virtualMIDICableCount</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AudioUnit/Reference/AUAudioUnit_ClassReference/index.html#//apple_ref/occ/instp/AUAudioUnit/virtualMIDICableCount">iOS Dev Center</a>
     */
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

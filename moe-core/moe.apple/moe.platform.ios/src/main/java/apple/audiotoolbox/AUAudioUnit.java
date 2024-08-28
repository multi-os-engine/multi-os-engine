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
import apple.avfaudio.AVAudioFormat;
import apple.coreaudiokit.AUAudioUnitViewConfiguration;
import apple.coreaudiotypes.struct.AudioBufferList;
import apple.coreaudiotypes.struct.AudioTimeStamp;
import apple.coremidi.MIDICIProfile;
import apple.coremidi.MIDICIProfileState;
import apple.coremidi.struct.MIDIEventList;
import apple.foundation.NSArray;
import apple.foundation.NSDictionary;
import apple.foundation.NSError;
import apple.foundation.NSIndexSet;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSNumber;
import apple.foundation.NSSet;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.c.map.CStringMapper;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.ReferenceInfo;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ann.UncertainArgument;
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
import apple.audiotoolbox.protocol.AUMessageChannel;
import org.moe.natj.general.ann.MappedReturn;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import apple.audiotoolbox.struct.AudioUnitRenderContext;
import apple.opaque.os_workgroup_t;

/**
 * AUAudioUnit
 * 
 * An audio unit instance.
 * 
 * AUAudioUnit is a host interface to an audio unit. Hosts can instantiate either version 2 or
 * version 3 units with this class, and to some extent control whether an audio unit is
 * instantiated in-process or in a separate extension process.
 * 
 * Implementors of version 3 audio units can and should subclass AUAudioUnit. To port an
 * existing version 2 audio unit easily, AUAudioUnitV2Bridge can be subclassed.
 * 
 * These are the ways in which audio unit components can be registered:
 * 
 * - (v2) Packaged into a component bundle containing an `AudioComponents` Info.plist entry,
 * referring to an `AudioComponentFactoryFunction`. See AudioComponent.h.
 * 
 * - (v2) AudioComponentRegister(). Associates a component description with an
 * AudioComponentFactoryFunction. See AudioComponent.h.
 * 
 * - (v3) Packaged into an app extension containing an AudioComponents Info.plist entry.
 * The principal class must conform to the AUAudioUnitFactory protocol, which will typically
 * instantiate an AUAudioUnit subclass.
 * 
 * - (v3) `+[AUAudioUnit registerSubclass:asComponentDescription:name:version:]`. Associates
 * a component description with an AUAudioUnit subclass.
 * 
 * A host need not be aware of the concrete subclass of AUAudioUnit that is being instantiated.
 * `initWithComponentDescription:options:error:` ensures that the proper subclass is used.
 * 
 * When using AUAudioUnit with a v2 audio unit, or the C AudioComponent and AudioUnit API's
 * with a v3 audio unit, all major pieces of functionality are bridged between the
 * two API's. This header describes, for each v3 method or property, the v2 equivalent.
 * 
 * API-Since: 9.0
 */
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

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native AUAudioUnit allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(
            @NotNull @Mapped(ObjCObjectMapper.class) Object aTarget);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
    public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
            @NotNull @Mapped(ObjCObjectMapper.class) Object aTarget, @NotNull SEL aSelector,
            @Nullable @Mapped(ObjCObjectMapper.class) Object anArgument);

    @NotNull
    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @NotNull
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

    /**
     * instantiateWithComponentDescription:options:completionHandler:
     * 
     * Asynchronously create an AUAudioUnit instance.
     * 
     * Certain types of AUAudioUnits must be instantiated asynchronously -- see
     * the discussion of kAudioComponentFlag_RequiresAsyncInstantiation in
     * AudioToolbox/AudioComponent.h.
     * 
     * Note: Do not block the main thread while waiting for the completion handler to be called;
     * this can deadlock.
     * 
     * @param componentDescription
     *                             The AudioComponentDescription of the audio unit to instantiate.
     * @param options
     *                             See the discussion of AudioComponentInstantiationOptions in
     *                             AudioToolbox/AudioComponent.h.
     * @param completionHandler
     *                             Called in a thread/dispatch queue context internal to the implementation. The client
     *                             should
     *                             retain the supplied AUAudioUnit.
     */
    @Generated
    @Selector("instantiateWithComponentDescription:options:completionHandler:")
    public static native void instantiateWithComponentDescriptionOptionsCompletionHandler(
            @ByValue AudioComponentDescription componentDescription, int options,
            @NotNull @ObjCBlock(name = "call_instantiateWithComponentDescriptionOptionsCompletionHandler") Block_instantiateWithComponentDescriptionOptionsCompletionHandler completionHandler);

    @Generated
    @Selector("isSubclassOfClass:")
    public static native boolean isSubclassOfClass(Class aClass);

    @NotNull
    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    @Generated
    @Owned
    @Selector("new")
    public static native AUAudioUnit new_objc();

    /**
     * Register an audio unit component implemented as an AUAudioUnit subclass.
     * 
     * This method dynamically registers the supplied AUAudioUnit subclass with the Audio Component
     * system, in the context of the current process (only). After registering the subclass, it can
     * be instantiated via AudioComponentInstanceNew,
     * -[AUAudioUnit initWithComponentDescription:options:error:], and via any other API's which
     * instantiate audio units via their component descriptions (e.g. <AudioToolbox/AUGraph.h>, or
     * <AVFoundation/AVAudioUnitEffect.h>).
     */
    @Generated
    @Selector("registerSubclass:asComponentDescription:name:version:")
    public static native void registerSubclassAsComponentDescriptionNameVersion(@NotNull Class cls,
            @ByValue AudioComponentDescription componentDescription, @NotNull String name, int version);

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

    /**
     * allocateRenderResourcesAndReturnError:
     * 
     * Allocate resources required to render.
     * 
     * Hosts must call this before beginning to render. Subclassers should call the superclass
     * implementation.
     * 
     * Bridged to the v2 API AudioUnitInitialize().
     */
    @Generated
    @Selector("allocateRenderResourcesAndReturnError:")
    public native boolean allocateRenderResourcesAndReturnError(
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

    /**
     * [@property] audioUnitName
     * 
     * The audio unit's name.
     */
    @Nullable
    @Generated
    @Selector("audioUnitName")
    public native String audioUnitName();

    /**
     * [@property] canPerformInput
     * 
     * Whether the I/O device can perform input.
     */
    @Generated
    @Selector("canPerformInput")
    public native boolean canPerformInput();

    /**
     * [@property] canPerformOutput
     * 
     * Whether the I/O device can perform output.
     */
    @Generated
    @Selector("canPerformOutput")
    public native boolean canPerformOutput();

    /**
     * [@property] canProcessInPlace
     * 
     * Expresses whether an audio unit can process in place.
     * 
     * In-place processing is the ability for an audio unit to transform an input signal to an
     * output signal in-place in the input buffer, without requiring a separate output buffer.
     * 
     * A host can express its desire to process in place by using null mData pointers in the output
     * buffer list. The audio unit may process in-place in the input buffers. See the discussion of
     * renderBlock.
     * 
     * Partially bridged to the v2 property kAudioUnitProperty_InPlaceProcessing; in v3 it is not
     * settable.
     * 
     * Defaults to NO. Subclassers can override to return YES.
     */
    @Generated
    @Selector("canProcessInPlace")
    public native boolean canProcessInPlace();

    /**
     * [@property] channelCapabilities
     * 
     * Expresses valid combinations of input and output channel counts.
     * 
     * Elements are NSNumber containing integers; [0]=input count, [1]=output count, [2]=2nd input
     * count, [3]=2nd output count, etc.
     * 
     * An input, output count of (2, 2) signifies that the audio unit can process 2 input channels
     * to 2 output channels.
     * 
     * Negative numbers (-1, -2) indicate *any* number of channels. (-1, -1) means any number
     * of channels on input and output as long as they are the same. (-1, -2) means any number of
     * channels on input or output, without the requirement that the counts are the same.
     * 
     * A negative number less than -2 is used to indicate a total number of channels across every
     * bus in that scope, regardless of how many channels are set on any particular bus. For
     * example, (-16, 2) indicates that a unit can accept up to 16 channels of input across its
     * input busses, but will only produce 2 channels of output.
     * 
     * Zero on either side (though typically input) means "not applicable", because there are no
     * elements on that side.
     * 
     * Bridged to the v2 property kAudioUnitProperty_SupportedNumChannels.
     */
    @Nullable
    @Generated
    @Selector("channelCapabilities")
    public native NSArray<? extends NSNumber> channelCapabilities();

    /**
     * [@property] channelMap
     * 
     * Specify a mapping of input channels to output channels.
     * 
     * Converter and input/output audio units may support re-ordering or splitting of input
     * channels to output channels. The number of channels in the channel map is the number of
     * channels of the destination (output format). The channel map entries contain a channel
     * number of the source channel that should be mapped to that destination channel. If -1 is
     * specified, then that destination channel will not contain any channel from the source (so it
     * will be silent).
     * 
     * If the property value is nil, then the audio unit does not support this property.
     * 
     * Bridged to the v2 property kAudioOutputUnitProperty_ChannelMap.
     * 
     * API-Since: 10.0
     */
    @Nullable
    @Generated
    @Selector("channelMap")
    public native NSArray<? extends NSNumber> channelMap();

    /**
     * [@property] component
     * 
     * The AudioComponent which was found based on componentDescription when the
     * audio unit was created.
     */
    @NotNull
    @Generated
    @Selector("component")
    public native AudioComponent component();

    /**
     * [@property] componentDescription
     * 
     * The AudioComponentDescription with which the audio unit was created.
     */
    @Generated
    @Selector("componentDescription")
    @ByValue
    public native AudioComponentDescription componentDescription();

    /**
     * [@property] componentName
     * 
     * The unit's component's name.
     * 
     * By convention, an audio unit's component name is its manufacturer's name, plus ": ",
     * plus the audio unit's name. The audioUnitName and manufacturerName properties are derived
     * from the component name.
     */
    @Nullable
    @Generated
    @Selector("componentName")
    public native String componentName();

    /**
     * [@property] componentVersion
     * 
     * The unit's component's version.
     */
    @Generated
    @Selector("componentVersion")
    public native int componentVersion();

    /**
     * [@property] contextName
     * 
     * Information about the host context in which the audio unit is connected, for display
     * in the audio unit's view.
     * 
     * For example, a host could set "track 3" as the context, so that the audio unit's view could
     * then display to the user "My audio unit on track 3".
     * 
     * Bridged to the v2 property kAudioUnitProperty_ContextName.
     */
    @Nullable
    @Generated
    @Selector("contextName")
    public native String contextName();

    /**
     * [@property] currentPreset
     * 
     * The audio unit's last-selected preset.
     * 
     * Hosts can let the user select a preset by setting this property. Note that when getting
     * this property, it does not reflect whether parameters may have been modified since the
     * preset was selected.
     * 
     * Bridged to the v2 property kAudioUnitProperty_PresentPreset.
     */
    @Nullable
    @Generated
    @Selector("currentPreset")
    public native AUAudioUnitPreset currentPreset();

    /**
     * deallocateRenderResources
     * 
     * Deallocate resources allocated by allocateRenderResourcesAndReturnError:
     * 
     * Hosts should call this after finishing rendering. Subclassers should call the superclass
     * implementation.
     * 
     * Bridged to the v2 API AudioUnitUninitialize().
     */
    @Generated
    @Selector("deallocateRenderResources")
    public native void deallocateRenderResources();

    /**
     * [@property] factoryPresets
     * 
     * A collection of presets provided by the audio unit's developer.
     * 
     * A preset provides users of an audio unit with an easily-selectable, fine-tuned set of
     * parameters provided by the developer. This property returns all of the available factory presets.
     * 
     * Bridged to the v2 property kAudioUnitProperty_FactoryPresets.
     */
    @Nullable
    @Generated
    @Selector("factoryPresets")
    public native NSArray<? extends AUAudioUnitPreset> factoryPresets();

    /**
     * [@property] fullState
     * 
     * A persistable snapshot of the Audio Unit's properties and parameters, suitable for
     * saving as a user preset.
     * 
     * Hosts may use this property to save and restore the state of an Audio Unit being used in a
     * user preset or document. The Audio Unit should not persist transitory properties such as
     * stream formats, but should save and restore all parameters and custom properties.
     * 
     * The base class implementation of this property saves the values of all parameters
     * currently in the parameter tree. A subclass which dynamically produces multiple variants
     * of the parameter tree needs to be aware that the serialization method does a depth-first
     * preorder traversal of the tree.
     * 
     * Bridged to the v2 property kAudioUnitProperty_ClassInfo.
     */
    @Nullable
    @Generated
    @Selector("fullState")
    public native NSDictionary<String, ?> fullState();

    /**
     * [@property] fullStateForDocument
     * 
     * A persistable snapshot of the audio unit's properties and parameters, suitable for
     * saving in a user's document.
     * 
     * This property is distinct from fullState in that some state is suitable for saving in user
     * presets, while other state is not. For example, a synthesizer's master tuning setting could
     * be considered global state, inappropriate for storing in reusable presets, but desirable
     * for storing in a document for a specific live performance.
     * 
     * Hosts saving documents should use this property. If the audio unit does not implement it,
     * the base class simply sets/gets fullState.
     * 
     * Bridged to the v2 property kAudioUnitProperty_ClassInfoFromDocument.
     */
    @Nullable
    @Generated
    @Selector("fullStateForDocument")
    public native NSDictionary<String, ?> fullStateForDocument();

    @Generated
    @Selector("init")
    public native AUAudioUnit init();

    /**
     * initWithComponentDescription:error:
     * 
     * Convenience initializer (omits options).
     */
    @Generated
    @Selector("initWithComponentDescription:error:")
    public native AUAudioUnit initWithComponentDescriptionError(@ByValue AudioComponentDescription componentDescription,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

    /**
     * initWithComponentDescription:options:error:
     * 
     * Designated initializer.
     * 
     * @param componentDescription
     *                             A single AUAudioUnit subclass may implement multiple audio units, for example, an
     *                             effect
     *                             that can also function as a generator, or a cluster of related effects. The component
     *                             description specifies the component which was instantiated.
     * @param options
     *                             Options for loading the unit in-process or out-of-process.
     * @param outError
     *                             Returned in the event of failure.
     */
    @Generated
    @Selector("initWithComponentDescription:options:error:")
    public native AUAudioUnit initWithComponentDescriptionOptionsError(
            @ByValue AudioComponentDescription componentDescription, int options,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

    /**
     * [@property] inputBusses
     * 
     * An audio unit's audio input connection points.
     * 
     * Subclassers must override this property's getter. The implementation should return the same
     * object every time it is asked for it, since clients can install KVO observers on it.
     */
    @NotNull
    @Generated
    @Selector("inputBusses")
    public native AUAudioUnitBusArray inputBusses();

    /**
     * [@property] inputHandler
     * 
     * The block that the output unit will call to notify when input is available.
     * 
     * See discussion for AUInputHandler.
     */
    @Nullable
    @Generated
    @Selector("inputHandler")
    @ObjCBlock(name = "call_inputHandler_ret")
    public native Block_inputHandler_ret inputHandler();

    /**
     * [@property] inputEnabled
     * 
     * Flag enabling audio input from the unit.
     * 
     * Input is disabled by default. This must be set to YES if input audio is desired.
     * Setting to YES will have no effect if canPerformInput is false.
     */
    @Generated
    @Selector("isInputEnabled")
    public native boolean isInputEnabled();

    /**
     * [@property] inputEnabled
     * 
     * Flag enabling audio input from the unit.
     * 
     * Input is disabled by default. This must be set to YES if input audio is desired.
     * Setting to YES will have no effect if canPerformInput is false.
     */
    @Generated
    @Selector("setInputEnabled:")
    public native void setInputEnabled(boolean value);

    /**
     * [@property] musicDeviceOrEffect
     * 
     * Specifies whether an audio unit responds to MIDI events.
     * 
     * This is implemented in the base class and returns YES if the component type is music
     * device or music effect.
     */
    @Generated
    @Selector("isMusicDeviceOrEffect")
    public native boolean isMusicDeviceOrEffect();

    /**
     * [@property] outputEnabled
     * 
     * Flag enabling audio output from the unit.
     * 
     * Output is enabled by default.
     * Setting to YES will have no effect if canPerformOutput is false.
     */
    @Generated
    @Selector("isOutputEnabled")
    public native boolean isOutputEnabled();

    /**
     * [@property] outputEnabled
     * 
     * Flag enabling audio output from the unit.
     * 
     * Output is enabled by default.
     * Setting to YES will have no effect if canPerformOutput is false.
     */
    @Generated
    @Selector("setOutputEnabled:")
    public native void setOutputEnabled(boolean value);

    /**
     * [@property] renderingOffline
     * 
     * Communicates to an audio unit that it is rendering offline.
     * 
     * A host should set this property when using an audio unit in a context where there are no
     * realtime deadlines, before asking the unit to allocate render resources. An audio unit may
     * respond by using a more expensive signal processing algorithm, or allowing itself to block
     * at render time if data being generated on secondary work threads is not ready in time.
     * (Normally, in a realtime thread, this data would have to be dropped).
     * 
     * Bridged to the v2 property kAudioUnitProperty_OfflineRender.
     */
    @Generated
    @Selector("isRenderingOffline")
    public native boolean isRenderingOffline();

    /**
     * [@property] renderingOffline
     * 
     * Communicates to an audio unit that it is rendering offline.
     * 
     * A host should set this property when using an audio unit in a context where there are no
     * realtime deadlines, before asking the unit to allocate render resources. An audio unit may
     * respond by using a more expensive signal processing algorithm, or allowing itself to block
     * at render time if data being generated on secondary work threads is not ready in time.
     * (Normally, in a realtime thread, this data would have to be dropped).
     * 
     * Bridged to the v2 property kAudioUnitProperty_OfflineRender.
     */
    @Generated
    @Selector("setRenderingOffline:")
    public native void setRenderingOffline(boolean value);

    /**
     * [@property] latency
     * 
     * The audio unit's processing latency, in seconds.
     * 
     * This property reflects the delay between when an impulse in the unit's audio unit stream
     * arrives in the input vs. output streams. This should reflect the delay due
     * to signal processing (e.g. filters, FFT's, etc.), not delay or reverberation which is
     * being applied as an effect.
     * 
     * Note that a latency that varies with parameter settings, including bypass, is generally not
     * useful to hosts. A host is usually only prepared to add delays before starting to render and
     * those delays need to be fixed. A variable delay would introduce artifacts even if the host
     * could track it. If an algorithm has a variable latency it should be adjusted upwards to some
     * fixed latency within the audio unit. If for some reason this is not possible, then latency
     * could be regarded as an unavoidable consequence of the algorithm and left unreported (i.e.
     * with a value of 0).
     * 
     * Bridged to the v2 property kAudioUnitProperty_Latency.
     */
    @Generated
    @Selector("latency")
    public native double latency();

    /**
     * [@property] manufacturerName
     * 
     * The manufacturer's name.
     */
    @Nullable
    @Generated
    @Selector("manufacturerName")
    public native String manufacturerName();

    /**
     * [@property] maximumFramesToRender
     * 
     * The maximum number of frames which the audio unit can render at once.
     * 
     * This must be set by the host before render resources are allocated. It cannot be changed
     * while render resources are allocated.
     * 
     * Bridged to the v2 property kAudioUnitProperty_MaximumFramesPerSlice.
     */
    @Generated
    @Selector("maximumFramesToRender")
    public native int maximumFramesToRender();

    /**
     * [@property] musicalContextBlock
     * 
     * A callback for the AU to call the host for musical context information.
     * 
     * Note that an audio unit implementation accessing this property should cache it in
     * realtime-safe storage before beginning to render.
     * 
     * Bridged to the HostCallback_GetBeatAndTempo and HostCallback_GetMusicalTimeLocation
     * callback members in kAudioUnitProperty_HostCallbacks.
     */
    @Nullable
    @Generated
    @Selector("musicalContextBlock")
    @ObjCBlock(name = "call_musicalContextBlock_ret")
    public native Block_musicalContextBlock_ret musicalContextBlock();

    /**
     * [@property] outputBusses
     * 
     * An audio unit's audio output connection points.
     * 
     * Subclassers must override this property's getter. The implementation should return the same
     * object every time it is asked for it, since clients can install KVO observers on it.
     */
    @NotNull
    @Generated
    @Selector("outputBusses")
    public native AUAudioUnitBusArray outputBusses();

    /**
     * [@property] outputProvider
     * 
     * The block that the output unit will call to get audio to send to the output.
     * 
     * This block must be set if output is enabled.
     */
    @Nullable
    @Generated
    @Selector("outputProvider")
    @ObjCBlock(name = "call_outputProvider_ret")
    public native Block_outputProvider_ret outputProvider();

    /**
     * [@property] parameterTree
     * 
     * An audio unit's parameters, organized in a hierarchy.
     * 
     * Audio unit hosts can fetch this property to discover a unit's parameters. KVO notifications
     * are issued on this member to notify the host of changes to the set of available parameters.
     * 
     * AUAudioUnit has an additional pseudo-property, "allParameterValues", on which KVO
     * notifications are issued in response to certain events where potentially all parameter
     * values are invalidated. This includes changes to currentPreset, fullState, and
     * fullStateForDocument.
     * 
     * Hosts should not attempt to set this property.
     * 
     * Subclassers should implement the parameterTree getter to expose parameters to hosts. They
     * should cache as much as possible and send KVO notifications on "parameterTree" when altering
     * the structure of the tree or the static information (ranges, etc) of parameters.
     * 
     * This is similar to the v2 properties kAudioUnitProperty_ParameterList and
     * kAudioUnitProperty_ParameterInfo.
     * 
     * Note that it is not safe to modify this property in a real-time context.
     * 
     * @return
     *         A parameter tree object, or nil if the unit has no parameters.
     */
    @Nullable
    @Generated
    @Selector("parameterTree")
    public native AUParameterTree parameterTree();

    /**
     * parametersForOverviewWithCount:
     * 
     * Returns the audio unit's `count` most important parameters.
     * 
     * This property allows a host to query an audio unit for some small number of parameters which
     * are its "most important", to be displayed in a compact generic view.
     * 
     * An audio unit subclass should return an array of NSNumbers representing the addresses
     * of the `count` most important parameters.
     * 
     * The base class returns an empty array regardless of count.
     * 
     * Partially bridged to kAudioUnitProperty_ParametersForOverview (v2 hosts can use that
     * property to access this v3 method of an audio unit).
     */
    @NotNull
    @Generated
    @Selector("parametersForOverviewWithCount:")
    public native NSArray<? extends NSNumber> parametersForOverviewWithCount(@NInt long count);

    /**
     * removeRenderObserver:
     * 
     * Remove an observer block added via tokenByAddingRenderObserver:
     * 
     * @param token
     *              The token previously returned by tokenByAddingRenderObserver:
     * 
     *              Bridged to the v2 API AudioUnitRemoveRenderNotify().
     */
    @Generated
    @Selector("removeRenderObserver:")
    public native void removeRenderObserver(@NInt long token);

    /**
     * [@property] renderQuality
     * 
     * Provides a trade-off between rendering quality and CPU load.
     * 
     * The range of valid values is 0-127.
     * 
     * Bridged to the v2 property kAudioUnitProperty_RenderQuality.
     */
    @Generated
    @Selector("renderQuality")
    @NInt
    public native long renderQuality();

    /**
     * [@property] renderResourcesAllocated
     * 
     * returns YES if the unit has render resources allocated.
     */
    @Generated
    @Selector("renderResourcesAllocated")
    public native boolean renderResourcesAllocated();

    /**
     * reset
     * 
     * Reset transitory rendering state to its initial state.
     * 
     * Hosts should call this at the point of a discontinuity in the input stream being provided to
     * an audio unit, for example, when seeking forward or backward within a track. In response,
     * implementations should clear delay lines, filters, etc. Subclassers should call the
     * superclass implementation.
     * 
     * Bridged to the v2 API AudioUnitReset(), in the global scope.
     */
    @Generated
    @Selector("reset")
    public native void reset();

    /**
     * [@property] scheduleMIDIEventBlock
     * 
     * Block used to schedule MIDI events.
     * 
     * As with renderBlock, a host should fetch and cache this block before calling
     * allocateRenderResources if it intends to schedule MIDI events.
     * 
     * This is implemented in the base class. It is nil when musicDeviceOrEffect is NO.
     * 
     * Subclasses should not override. When hosts schedule events via this block, they are
     * sent to the Audio Unit via the list of AURenderEvents delivered to
     * internalRenderBlock.
     * 
     * All events sent via this block will be delivered to the internalRenderBlock in the MIDI
     * protocol returned by the AudioUnitMIDIProtocol property. For example, if AudioUnitMIDIProtocol
     * returns kMIDIProtocol_2_0, incoming events will be translated to MIDI 2.0 if necessary.
     * If AudioUnitMIDIProtocol is not set, events will be delivered as legacy MIDI.
     * 
     * This bridged to the v2 API MusicDeviceMIDIEvent.
     */
    @Nullable
    @Generated
    @Selector("scheduleMIDIEventBlock")
    @ObjCBlock(name = "call_scheduleMIDIEventBlock_ret")
    public native Block_scheduleMIDIEventBlock_ret scheduleMIDIEventBlock();

    /**
     * [@property] scheduleParameterBlock
     * 
     * Block which hosts use to schedule parameters.
     * 
     * As with renderBlock, a host should fetch and cache this block before calling
     * allocateRenderResources, if it intends to schedule parameters.
     * 
     * The block is safe to call from any thread context, including realtime audio render
     * threads.
     * 
     * Subclassers should not override this; it is implemented in the base class and will schedule
     * the events to be provided to the internalRenderBlock.
     * 
     * Bridged to the v2 API AudioUnitScheduleParameters().
     */
    @NotNull
    @Generated
    @Selector("scheduleParameterBlock")
    @ObjCBlock(name = "call_scheduleParameterBlock_ret")
    public native Block_scheduleParameterBlock_ret scheduleParameterBlock();

    /**
     * [@property] channelMap
     * 
     * Specify a mapping of input channels to output channels.
     * 
     * Converter and input/output audio units may support re-ordering or splitting of input
     * channels to output channels. The number of channels in the channel map is the number of
     * channels of the destination (output format). The channel map entries contain a channel
     * number of the source channel that should be mapped to that destination channel. If -1 is
     * specified, then that destination channel will not contain any channel from the source (so it
     * will be silent).
     * 
     * If the property value is nil, then the audio unit does not support this property.
     * 
     * Bridged to the v2 property kAudioOutputUnitProperty_ChannelMap.
     * 
     * API-Since: 10.0
     */
    @Generated
    @Selector("setChannelMap:")
    public native void setChannelMap(@Nullable NSArray<? extends NSNumber> value);

    /**
     * [@property] contextName
     * 
     * Information about the host context in which the audio unit is connected, for display
     * in the audio unit's view.
     * 
     * For example, a host could set "track 3" as the context, so that the audio unit's view could
     * then display to the user "My audio unit on track 3".
     * 
     * Bridged to the v2 property kAudioUnitProperty_ContextName.
     */
    @Generated
    @Selector("setContextName:")
    public native void setContextName(@Nullable String value);

    /**
     * [@property] currentPreset
     * 
     * The audio unit's last-selected preset.
     * 
     * Hosts can let the user select a preset by setting this property. Note that when getting
     * this property, it does not reflect whether parameters may have been modified since the
     * preset was selected.
     * 
     * Bridged to the v2 property kAudioUnitProperty_PresentPreset.
     */
    @Generated
    @Selector("setCurrentPreset:")
    public native void setCurrentPreset(@Nullable AUAudioUnitPreset value);

    /**
     * [@property] fullState
     * 
     * A persistable snapshot of the Audio Unit's properties and parameters, suitable for
     * saving as a user preset.
     * 
     * Hosts may use this property to save and restore the state of an Audio Unit being used in a
     * user preset or document. The Audio Unit should not persist transitory properties such as
     * stream formats, but should save and restore all parameters and custom properties.
     * 
     * The base class implementation of this property saves the values of all parameters
     * currently in the parameter tree. A subclass which dynamically produces multiple variants
     * of the parameter tree needs to be aware that the serialization method does a depth-first
     * preorder traversal of the tree.
     * 
     * Bridged to the v2 property kAudioUnitProperty_ClassInfo.
     */
    @Generated
    @Selector("setFullState:")
    public native void setFullState(@Nullable NSDictionary<String, ?> value);

    /**
     * [@property] fullStateForDocument
     * 
     * A persistable snapshot of the audio unit's properties and parameters, suitable for
     * saving in a user's document.
     * 
     * This property is distinct from fullState in that some state is suitable for saving in user
     * presets, while other state is not. For example, a synthesizer's master tuning setting could
     * be considered global state, inappropriate for storing in reusable presets, but desirable
     * for storing in a document for a specific live performance.
     * 
     * Hosts saving documents should use this property. If the audio unit does not implement it,
     * the base class simply sets/gets fullState.
     * 
     * Bridged to the v2 property kAudioUnitProperty_ClassInfoFromDocument.
     */
    @Generated
    @Selector("setFullStateForDocument:")
    public native void setFullStateForDocument(@Nullable NSDictionary<String, ?> value);

    /**
     * [@property] inputHandler
     * 
     * The block that the output unit will call to notify when input is available.
     * 
     * See discussion for AUInputHandler.
     */
    @Generated
    @Selector("setInputHandler:")
    public native void setInputHandler(@Nullable @ObjCBlock(name = "call_setInputHandler") Block_setInputHandler value);

    /**
     * [@property] maximumFramesToRender
     * 
     * The maximum number of frames which the audio unit can render at once.
     * 
     * This must be set by the host before render resources are allocated. It cannot be changed
     * while render resources are allocated.
     * 
     * Bridged to the v2 property kAudioUnitProperty_MaximumFramesPerSlice.
     */
    @Generated
    @Selector("setMaximumFramesToRender:")
    public native void setMaximumFramesToRender(int value);

    /**
     * [@property] musicalContextBlock
     * 
     * A callback for the AU to call the host for musical context information.
     * 
     * Note that an audio unit implementation accessing this property should cache it in
     * realtime-safe storage before beginning to render.
     * 
     * Bridged to the HostCallback_GetBeatAndTempo and HostCallback_GetMusicalTimeLocation
     * callback members in kAudioUnitProperty_HostCallbacks.
     */
    @Generated
    @Selector("setMusicalContextBlock:")
    public native void setMusicalContextBlock(
            @Nullable @ObjCBlock(name = "call_setMusicalContextBlock") Block_setMusicalContextBlock value);

    /**
     * [@property] outputProvider
     * 
     * The block that the output unit will call to get audio to send to the output.
     * 
     * This block must be set if output is enabled.
     */
    @Generated
    @Selector("setOutputProvider:")
    public native void setOutputProvider(
            @Nullable @ObjCBlock(name = "call_setOutputProvider") Block_setOutputProvider value);

    /**
     * [@property] renderQuality
     * 
     * Provides a trade-off between rendering quality and CPU load.
     * 
     * The range of valid values is 0-127.
     * 
     * Bridged to the v2 property kAudioUnitProperty_RenderQuality.
     */
    @Generated
    @Selector("setRenderQuality:")
    public native void setRenderQuality(@NInt long value);

    /**
     * setRenderResourcesAllocated:
     * 
     * @param flag
     *             In the base class implementation of allocateRenderResourcesAndReturnError:, the property
     *             renderResourcesAllocated is set to YES.
     *             If allocateRenderResourcesAndReturnError: should fail in a subclass, subclassers must use this method
     *             to set renderResourcesAllocated to NO.
     */
    @Generated
    @Selector("setRenderResourcesAllocated:")
    public native void setRenderResourcesAllocated(boolean flag);

    /**
     * [@property] shouldBypassEffect
     * 
     * Directs an effect to route input directly to output, without any processing.
     * 
     * Bridged to the v2 property kAudioUnitProperty_BypassEffect.
     */
    @Generated
    @Selector("setShouldBypassEffect:")
    public native void setShouldBypassEffect(boolean value);

    /**
     * [@property] transportStateBlock
     * 
     * A callback for the AU to call the host for transport state information.
     * 
     * Note that an audio unit implementation accessing this property should cache it in
     * realtime-safe storage before beginning to render.
     * 
     * Bridged to the HostCallback_GetTransportState and HostCallback_GetTransportState2
     * callback members in kAudioUnitProperty_HostCallbacks.
     */
    @Generated
    @Selector("setTransportStateBlock:")
    public native void setTransportStateBlock(
            @Nullable @ObjCBlock(name = "call_setTransportStateBlock") Block_setTransportStateBlock value);

    /**
     * [@property] shouldBypassEffect
     * 
     * Directs an effect to route input directly to output, without any processing.
     * 
     * Bridged to the v2 property kAudioUnitProperty_BypassEffect.
     */
    @Generated
    @Selector("shouldBypassEffect")
    public native boolean shouldBypassEffect();

    /**
     * shouldChangeToFormat:forBus:
     * 
     * This is called when setting the format on an AUAudioUnitBus.
     * The bus has already checked that the format meets the channel constraints of the bus.
     * The AU can override this method to check before allowing a new format to be set on the bus.
     * If this method returns NO, then the new format will not be set on the bus.
     * The default implementation returns NO if the unit has renderResourcesAllocated, otherwise it results YES.
     * 
     * @param format
     *               An AVAudioFormat which is proposed as the new format.
     * @param bus
     *               The AUAudioUnitBus on which the format will be changed.
     */
    @Generated
    @Selector("shouldChangeToFormat:forBus:")
    public native boolean shouldChangeToFormatForBus(@NotNull AVAudioFormat format, @NotNull AUAudioUnitBus bus);

    /**
     * startHardwareAndReturnError:
     * 
     * Starts the audio hardware.
     * 
     * @param outError
     *                 Returned in the event of failure.
     */
    @Generated
    @Selector("startHardwareAndReturnError:")
    public native boolean startHardwareAndReturnError(
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

    /**
     * stopHardware
     * 
     * Stops the audio hardware.
     */
    @Generated
    @Selector("stopHardware")
    public native void stopHardware();

    /**
     * [@property] supportsMPE
     * 
     * Specifies whether an audio unit supports Multi-dimensional Polyphonic Expression.
     * 
     * Bridged to the v2 property kAudioUnitProperty_SupportsMPE.
     * 
     * API-Since: 10.0
     */
    @Generated
    @Selector("supportsMPE")
    public native boolean supportsMPE();

    /**
     * [@property] tailTime
     * 
     * The audio unit's tail time, in seconds.
     * 
     * This property reflects the time interval between when the input stream ends or otherwise
     * transitions to silence, and when the output stream becomes silent. Unlike latency, this
     * should reflect the duration of a delay or reverb effect.
     * 
     * Bridged to the v2 property kAudioUnitProperty_TailTime.
     */
    @Generated
    @Selector("tailTime")
    public native double tailTime();

    /**
     * tokenByAddingRenderObserver:
     * 
     * Add a block to be called on each render cycle.
     * 
     * The supplied block is called at the beginning and ending of each render cycle. It should
     * not make any blocking calls.
     * 
     * This method is implemented in the base class AUAudioUnit, and should not be overridden.
     * 
     * Bridged to the v2 API AudioUnitAddRenderNotify().
     * 
     * @param observer
     *                 The block to call.
     * @return
     *         A token to be used when removing the observer.
     */
    @Generated
    @Selector("tokenByAddingRenderObserver:")
    @NInt
    public native long tokenByAddingRenderObserver(
            @NotNull @ObjCBlock(name = "call_tokenByAddingRenderObserver") Block_tokenByAddingRenderObserver observer);

    /**
     * [@property] transportStateBlock
     * 
     * A callback for the AU to call the host for transport state information.
     * 
     * Note that an audio unit implementation accessing this property should cache it in
     * realtime-safe storage before beginning to render.
     * 
     * Bridged to the HostCallback_GetTransportState and HostCallback_GetTransportState2
     * callback members in kAudioUnitProperty_HostCallbacks.
     */
    @Nullable
    @Generated
    @Selector("transportStateBlock")
    @ObjCBlock(name = "call_transportStateBlock_ret")
    public native Block_transportStateBlock_ret transportStateBlock();

    /**
     * [@property] virtualMIDICableCount
     * 
     * The number of virtual MIDI cables implemented by a music device or effect.
     * 
     * A music device or MIDI effect can support up to 256 virtual MIDI cables of input; this
     * property expresses the number of cables supported by the audio unit.
     */
    @Generated
    @Selector("virtualMIDICableCount")
    @NInt
    public native long virtualMIDICableCount();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_inputHandler_ret {
        @Generated
        void call_inputHandler_ret(@NotNull IntPtr actionFlags, @NotNull AudioTimeStamp timestamp, int frameCount,
                @NInt long inputBusNumber);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_instantiateWithComponentDescriptionOptionsCompletionHandler {
        @Generated
        void call_instantiateWithComponentDescriptionOptionsCompletionHandler(@Nullable AUAudioUnit audioUnit,
                @Nullable NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_musicalContextBlock_ret {
        @Generated
        boolean call_musicalContextBlock_ret(@Nullable DoublePtr currentTempo,
                @Nullable DoublePtr timeSignatureNumerator, @Nullable NIntPtr timeSignatureDenominator,
                @Nullable DoublePtr currentBeatPosition, @Nullable NIntPtr sampleOffsetToNextBeat,
                @Nullable DoublePtr currentMeasureDownbeatPosition);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_outputProvider_ret {
        @Generated
        int call_outputProvider_ret(@NotNull IntPtr actionFlags, @NotNull AudioTimeStamp timestamp, int frameCount,
                @NInt long inputBusNumber, @NotNull AudioBufferList inputData);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_scheduleMIDIEventBlock_ret {
        @Generated
        void call_scheduleMIDIEventBlock_ret(long eventSampleTime, byte cable, @NInt long length,
                @NotNull ConstBytePtr midiBytes);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_scheduleParameterBlock_ret {
        @Generated
        void call_scheduleParameterBlock_ret(long eventSampleTime, int rampDurationSampleFrames, long parameterAddress,
                float value);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setInputHandler {
        @Generated
        void call_setInputHandler(@NotNull IntPtr actionFlags, @NotNull AudioTimeStamp timestamp, int frameCount,
                @NInt long inputBusNumber);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setMusicalContextBlock {
        @Generated
        boolean call_setMusicalContextBlock(@Nullable DoublePtr currentTempo,
                @Nullable DoublePtr timeSignatureNumerator, @Nullable NIntPtr timeSignatureDenominator,
                @Nullable DoublePtr currentBeatPosition, @Nullable NIntPtr sampleOffsetToNextBeat,
                @Nullable DoublePtr currentMeasureDownbeatPosition);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setOutputProvider {
        @Generated
        int call_setOutputProvider(@NotNull IntPtr actionFlags, @NotNull AudioTimeStamp timestamp, int frameCount,
                @NInt long inputBusNumber, @NotNull AudioBufferList inputData);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setTransportStateBlock {
        @Generated
        boolean call_setTransportStateBlock(@Nullable NUIntPtr transportStateFlags,
                @Nullable DoublePtr currentSamplePosition, @Nullable DoublePtr cycleStartBeatPosition,
                @Nullable DoublePtr cycleEndBeatPosition);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_tokenByAddingRenderObserver {
        @Generated
        void call_tokenByAddingRenderObserver(int actionFlags, @NotNull AudioTimeStamp timestamp, int frameCount,
                @NInt long outputBusNumber);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_transportStateBlock_ret {
        @Generated
        boolean call_transportStateBlock_ret(@Nullable NUIntPtr transportStateFlags,
                @Nullable DoublePtr currentSamplePosition, @Nullable DoublePtr cycleStartBeatPosition,
                @Nullable DoublePtr cycleEndBeatPosition);
    }

    /**
     * [@property] MIDIOutputBufferSizeHint
     * 
     * Hint to control the size of the allocated buffer for outgoing MIDI events.
     * 
     * This property allows the plug-in to provide a hint to the framework regarding the size of
     * its outgoing MIDI data buffer.
     * 
     * If the plug-in produces more MIDI output data than the default size of the allocated buffer,
     * then the plug-in can provide this property to increase the size of this buffer.
     * 
     * The value represents the number of 3-byte Legacy MIDI messages that fit into the buffer or
     * a single MIDIEventList containing 1 MIDIEventPacket of 2 words when using MIDI 2.0 (MIDIEventList based API's).
     * 
     * This property is set to the default value by the framework.
     * 
     * In case of kAudioUnitErr_MIDIOutputBufferFull errors caused by producing too much MIDI
     * output in one render call, set this property to increase the buffer.
     * 
     * This only provides a recommendation to the framework.
     * 
     * Bridged to kAudioUnitProperty_MIDIOutputBufferSizeHint.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("MIDIOutputBufferSizeHint")
    @NInt
    public native long MIDIOutputBufferSizeHint();

    /**
     * [@property] MIDIOutputEventBlock
     * 
     * Block used by the host to access the MIDI output generated by an Audio Unit.
     * 
     * The host can set this block and the plug-in can call it in its renderBlock to provide to the
     * host the MIDI data associated with the current render cycle.
     * 
     * All events sent via this block will be delivered to the host in the MIDI protocol returned by
     * the hostMIDIProtocol property. For example, if hostMIDIProtocol is set to
     * kMIDIProtocol_2_0, incoming events will be translated to MIDI 2.0. If hostMIDIProtocol
     * is not set, events will be delivered as legacy MIDI.
     * 
     * Note: AUMIDIEventListBlock should be preferred over this block going forward.
     * 
     * This is bridged to the v2 API property kAudioUnitProperty_MIDIOutputCallback.
     * 
     * API-Since: 11.0
     */
    @Nullable
    @Generated
    @Selector("MIDIOutputEventBlock")
    @ObjCBlock(name = "call_MIDIOutputEventBlock_ret")
    public native Block_MIDIOutputEventBlock_ret MIDIOutputEventBlock();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_MIDIOutputEventBlock_ret {
        @Generated
        int call_MIDIOutputEventBlock_ret(long eventSampleTime, byte cable, @NInt long length,
                @NotNull @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") @Mapped(CStringMapper.class) String midiBytes);
    }

    /**
     * [@property] MIDIOutputNames
     * 
     * Count, and names of, a plug-in's MIDI outputs.
     * 
     * A plug-in may override this method to inform hosts about its MIDI outputs. The size of the
     * array is the number of outputs the Audio Unit supports. Each item in the array is the name
     * of the MIDI output at that index.
     * 
     * This is bridged to the v2 API property kAudioUnitProperty_MIDIOutputCallbackInfo.
     * 
     * API-Since: 11.0
     */
    @NotNull
    @Generated
    @Selector("MIDIOutputNames")
    public native NSArray<String> MIDIOutputNames();

    /**
     * [@property] audioUnitShortName
     * 
     * A short name for the audio unit.
     * 
     * Audio unit host applications can display this name in situations where the audioUnitName
     * might be too long. The recommended length is up to 16 characters. Host applications may
     * truncate it.
     * 
     * API-Since: 11.0
     */
    @Nullable
    @Generated
    @Selector("audioUnitShortName")
    public native String audioUnitShortName();

    /**
     * [@property] running
     * 
     * The audio device's running state.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("isRunning")
    public native boolean isRunning();

    /**
     * [@property] providesUserInterface
     * 
     * Specifies whether an audio unit provides UI (normally in the form of a view controller).
     * 
     * Implemented in the framework and should not be overridden by implementators. The
     * framework detects whether any subclass has implemented
     * `requestViewControllerWithCompletionHandler:` or is implemented by an AU extension whose
     * extension point identifier is `com.apple.AudioUnit-UI`. See also
     * `requestViewControllerWithCompletionHandler:` in <CoreAudioKit/AUViewController.h>
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("providesUserInterface")
    public native boolean providesUserInterface();

    /**
     * selectViewConfiguration
     * 
     * Request a view configuration from the audio unit.
     * 
     * The host can use this method to switch the audio unit's view into a new configuration.
     * Audio Units should override this method with the logic needed to adapt their view controller
     * to the requested configuration.
     * 
     * API-Since: 11.0
     * 
     * @param viewConfiguration
     *                          The requested view configuration.
     * 
     *                          The view configuration passed to this method should be one which was indicated as
     *                          supported
     *                          via supportedViewConfigurations. If any other, unsupported, view configuration is passed
     *                          or
     *                          if supportedViewConfigurations returns an empty set, the audio unit implementation
     *                          should
     *                          fall back to its default (largest available) view configuration.
     */
    @Generated
    @Selector("selectViewConfiguration:")
    public native void selectViewConfiguration(@NotNull AUAudioUnitViewConfiguration viewConfiguration);

    /**
     * [@property] MIDIOutputBufferSizeHint
     * 
     * Hint to control the size of the allocated buffer for outgoing MIDI events.
     * 
     * This property allows the plug-in to provide a hint to the framework regarding the size of
     * its outgoing MIDI data buffer.
     * 
     * If the plug-in produces more MIDI output data than the default size of the allocated buffer,
     * then the plug-in can provide this property to increase the size of this buffer.
     * 
     * The value represents the number of 3-byte Legacy MIDI messages that fit into the buffer or
     * a single MIDIEventList containing 1 MIDIEventPacket of 2 words when using MIDI 2.0 (MIDIEventList based API's).
     * 
     * This property is set to the default value by the framework.
     * 
     * In case of kAudioUnitErr_MIDIOutputBufferFull errors caused by producing too much MIDI
     * output in one render call, set this property to increase the buffer.
     * 
     * This only provides a recommendation to the framework.
     * 
     * Bridged to kAudioUnitProperty_MIDIOutputBufferSizeHint.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("setMIDIOutputBufferSizeHint:")
    public native void setMIDIOutputBufferSizeHint(@NInt long value);

    /**
     * [@property] MIDIOutputEventBlock
     * 
     * Block used by the host to access the MIDI output generated by an Audio Unit.
     * 
     * The host can set this block and the plug-in can call it in its renderBlock to provide to the
     * host the MIDI data associated with the current render cycle.
     * 
     * All events sent via this block will be delivered to the host in the MIDI protocol returned by
     * the hostMIDIProtocol property. For example, if hostMIDIProtocol is set to
     * kMIDIProtocol_2_0, incoming events will be translated to MIDI 2.0. If hostMIDIProtocol
     * is not set, events will be delivered as legacy MIDI.
     * 
     * Note: AUMIDIEventListBlock should be preferred over this block going forward.
     * 
     * This is bridged to the v2 API property kAudioUnitProperty_MIDIOutputCallback.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("setMIDIOutputEventBlock:")
    public native void setMIDIOutputEventBlock(
            @Nullable @ObjCBlock(name = "call_setMIDIOutputEventBlock") Block_setMIDIOutputEventBlock value);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setMIDIOutputEventBlock {
        @Generated
        int call_setMIDIOutputEventBlock(long eventSampleTime, byte cable, @NInt long length,
                @NotNull @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") @Mapped(CStringMapper.class) String midiBytes);
    }

    /**
     * supportedViewConfigurations
     * 
     * Query the list of supported view configurations.
     * 
     * The host can query the audio unit for all the view configurations it supports.
     * Hosts can support multiple configurations in which they can display the user interfaces of
     * audio units (for example: full screen, normal, live mode, etc). These configurations can be
     * of different sizes and the host might display its own control surfaces along with the view
     * of the audio unit. The host will call this method and pass an array of supported
     * configurations.
     * 
     * The audio unit should override this method and implement its own logic to report all the
     * view configurations it supports. The size of the view in the selected configuration should
     * be large enough to fit the view of the audio unit, otherwise it might be truncated and a
     * scroll bar might be necessary to navigate it.
     * 
     * In case an empty set is returned from this method, it is considered that the plugin only
     * supports the largest available view configuration.
     * 
     * API-Since: 11.0
     * 
     * @param availableViewConfigurations
     *                                    The list of all available view configurations supported by the host.
     * @return
     *         A set of indices of view configurations from the availableViewConfigurations array that the
     *         audio unit supports.
     */
    @NotNull
    @Generated
    @Selector("supportedViewConfigurations:")
    public native NSIndexSet supportedViewConfigurations(
            @NotNull NSArray<? extends AUAudioUnitViewConfiguration> availableViewConfigurations);

    /**
     * deleteUserPreset:error
     * 
     * Remove a user preset.
     * 
     * The user preset will be removed from userPresets and will be permanently deleted.
     * 
     * The default implementation of this method will delete the user preset from an internal
     * location.
     * 
     * Audio Units are free to override this method to operate on a different location (e.g. their
     * iCloud container).
     * 
     * @param userPreset
     *                   The preset to be deleted.
     * @param outError
     *                   In the event of a failure, the method will return NO and outError will be set to an
     *                   NSError, describing the problem.
     *                   Some possible errors:
     *                   - domain: NSOSStatusErrorDomain code: kAudioUnitErr_NoConnection
     *                   - domain: NSPOSIXErrorDomain code: ENOENT
     *                   - domain: NSOSStatusErrorDomain code: kAudioUnitErr_InvalidFilePath
     * @return
     *         YES for success. NO in the event of a failure, in which case the error is returned in
     *         outError.
     * 
     *         API-Since: 13.0
     */
    @Generated
    @Selector("deleteUserPreset:error:")
    public native boolean deleteUserPresetError(@NotNull AUAudioUnitPreset userPreset,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

    /**
     * disableProfile:cable:onChannel:error:
     * 
     * Disable a MIDI-CI Profile on the specified cable/channel.
     * 
     * @param profile
     *                 The MIDI-CI profile to be disabled.
     * @param cable
     *                 The virtual MIDI cable.
     * @param channel
     *                 The MIDI channel.
     * @param outError
     *                 Returned in the event of failure.
     * @return
     *         YES for success. NO in the event of a failure, in which case the error is returned
     *         in outError.
     * 
     *         API-Since: 12.0
     */
    @Generated
    @Selector("disableProfile:cable:onChannel:error:")
    public native boolean disableProfileCableOnChannelError(@NotNull MIDICIProfile profile, byte cable, byte channel,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

    /**
     * enableProfile:cable:onChannel:error:
     * 
     * Enable a MIDI-CI Profile on the specified cable/channel.
     * 
     * @param profile
     *                 The MIDI-CI profile to be enabled.
     * @param cable
     *                 The virtual MIDI cable.
     * @param channel
     *                 The MIDI channel.
     * @param outError
     *                 Returned in the event of failure.
     * @return
     *         YES for success. NO in the event of a failure, in which case the error is returned
     *         in outError.
     * 
     *         API-Since: 12.0
     */
    @Generated
    @Selector("enableProfile:cable:onChannel:error:")
    public native boolean enableProfileCableOnChannelError(@NotNull MIDICIProfile profile, byte cable, byte channel,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

    /**
     * presetStateFor:error
     * 
     * Retrieve the state stored in a user preset
     * 
     * This method allows access to the contents of a preset without having to set that preset as
     * current. The returned dictionary is assignable to the audio unit's fullState and/or
     * fullStateForDocument properties.
     * 
     * Audio units can override this method in order to vend user presets from a different location
     * (e.g. their iCloud container).
     * 
     * In order to restore the state from a user preset, the audio unit should override the setter
     * for the currentPreset property and check the preset number to determine the type of preset.
     * If the preset number is >= 0 then the preset is a factory preset.
     * If the preset number is < 0 then it is a user preset.
     * 
     * This method can then be called to retrieve the state stored in a user preset and the audio
     * unit can assign this to fullState or fullStateForDocument.
     * 
     * [@kAUPresetSubtypeKey] : NSNumber,
     * [@kAUPresetManufacturerKey] : NSNumber,
     * [@kAUPresetVersionKey] : NSNumber,
     * [@kAUPresetNameKey] : NSString,
     * [@kAUPresetNumberKey] NSNumber,
     * [@kAUPresetDataKey] : NSData
     * 
     * API-Since: 13.0
     * 
     * @param userPreset
     *                   The preset to be selected.
     * @param outError
     *                   In the event of a failure, the method will return nil and outError will be set to an
     *                   NSError, describing the problem.
     *                   Some possible errors:
     *                   - domain: NSOSStatusErrorDomain code: kAudioUnitErr_NoConnection
     *                   - domain: NSPOSIXErrorDomain code: ENOENT
     *                   - domain: NSCocoaErrorDomain code: NSCoderReadCorruptError
     * @return
     *         Returns nil if there was an error, otherwise returns a dictionary containing the full state
     *         of the audio unit saved in the preset.
     *         For details on the possible keys present in the full state dictionary, please see the
     *         documentation for kAudioUnitProperty_ClassInfo.
     *         The minimal set of keys and their type is: @kAUPresetTypeKey : NSNumber,
     */
    @Nullable
    @Generated
    @Selector("presetStateFor:error:")
    public native NSDictionary<String, ?> presetStateForError(@NotNull AUAudioUnitPreset userPreset,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

    /**
     * [@property] profileChangedBlock
     * 
     * A block called when a device notifies that a MIDI-CI profile has been enabled or
     * disabled.
     * 
     * Since enabling / disabling MIDI-CI profiles is an asynchronous operation, the host can set
     * this block and the audio unit is expected to call it every time the state of a MIDI-CI
     * profile has changed.
     * 
     * API-Since: 12.0
     */
    @Nullable
    @Generated
    @Selector("profileChangedBlock")
    @ObjCBlock(name = "call_profileChangedBlock_ret")
    public native Block_profileChangedBlock_ret profileChangedBlock();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_profileChangedBlock_ret {
        @Generated
        void call_profileChangedBlock_ret(byte cable, byte channel, @NotNull MIDICIProfile profile, boolean enabled);
    }

    /**
     * profileStateForCable:channel:
     * 
     * Given a MIDI cable and channel number, return the supported MIDI-CI Profiles.
     * 
     * @param cable
     *                The virtual MIDI cable for which the profiles are requested.
     * @param channel
     *                The MIDI channel for which the profiles are requested.
     * @return
     *         A MIDICIProfileState object containing all the supported MIDI-CI profiles for this channel
     *         on this cable.
     * 
     *         API-Since: 12.0
     */
    @NotNull
    @Generated
    @Selector("profileStateForCable:channel:")
    public native MIDICIProfileState profileStateForCableChannel(byte cable, byte channel);

    /**
     * saveUserPreset:error
     * 
     * Persistently save the current state of the audio unit into a userPreset
     * 
     * The new preset will be added to userPresets and will become selectable by assigning it
     * to the currentPreset property.
     * If a preset with the provided name already exists then it will be overwritten.
     * 
     * For user presets, the preset number is required to be negative.
     * If a positive number is passed, the sign will be changed to negative.
     * If zero is passed, the number will be set to -1.
     * These changes will be reflected on the userPreset argument.
     * 
     * The default implementation of this method will save the user preset to an internal
     * location.
     * 
     * Audio Units are free to override this method to operate on a different location (e.g. their
     * iCloud container).
     * 
     * @param userPreset
     *                   The preset under which the current state will be saved.
     * @param outError
     *                   In the event of a failure, the method will return NO and outError will be set to an
     *                   NSError, describing the problem.
     *                   Some possible errors:
     *                   - domain: NSOSStatusErrorDomain code: kAudioUnitErr_NoConnection
     *                   - domain: NSOSStatusErrorDomain code: kAudioUnitErr_InvalidFilePath
     *                   - domain: NSOSStatusErrorDomain code: kAudioUnitErr_MissingKey
     * @return
     *         YES for success. NO in the event of a failure, in which case the error is returned in
     *         outError.
     * 
     *         API-Since: 13.0
     */
    @Generated
    @Selector("saveUserPreset:error:")
    public native boolean saveUserPresetError(@NotNull AUAudioUnitPreset userPreset,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

    /**
     * [@property] parameterTree
     * 
     * An audio unit's parameters, organized in a hierarchy.
     * 
     * Audio unit hosts can fetch this property to discover a unit's parameters. KVO notifications
     * are issued on this member to notify the host of changes to the set of available parameters.
     * 
     * AUAudioUnit has an additional pseudo-property, "allParameterValues", on which KVO
     * notifications are issued in response to certain events where potentially all parameter
     * values are invalidated. This includes changes to currentPreset, fullState, and
     * fullStateForDocument.
     * 
     * Hosts should not attempt to set this property.
     * 
     * Subclassers should implement the parameterTree getter to expose parameters to hosts. They
     * should cache as much as possible and send KVO notifications on "parameterTree" when altering
     * the structure of the tree or the static information (ranges, etc) of parameters.
     * 
     * This is similar to the v2 properties kAudioUnitProperty_ParameterList and
     * kAudioUnitProperty_ParameterInfo.
     * 
     * Note that it is not safe to modify this property in a real-time context.
     * 
     * @return
     *         A parameter tree object, or nil if the unit has no parameters.
     */
    @Generated
    @Selector("setParameterTree:")
    public native void setParameterTree(@Nullable AUParameterTree value);

    /**
     * [@property] profileChangedBlock
     * 
     * A block called when a device notifies that a MIDI-CI profile has been enabled or
     * disabled.
     * 
     * Since enabling / disabling MIDI-CI profiles is an asynchronous operation, the host can set
     * this block and the audio unit is expected to call it every time the state of a MIDI-CI
     * profile has changed.
     * 
     * API-Since: 12.0
     */
    @Generated
    @Selector("setProfileChangedBlock:")
    public native void setProfileChangedBlock(
            @Nullable @ObjCBlock(name = "call_setProfileChangedBlock") Block_setProfileChangedBlock value);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setProfileChangedBlock {
        @Generated
        void call_setProfileChangedBlock(byte cable, byte channel, @NotNull MIDICIProfile profile, boolean enabled);
    }

    /**
     * [@property] supportsUserPresets
     * 
     * Specifies whether an audio unit supports loading and saving user presets
     * 
     * The audio unit should set this property to YES if a user preset can be assigned to
     * currentPreset.
     * 
     * Audio unit host applications should query this property to determine whether the audio unit
     * supports user presets.
     * 
     * Assigning a user preset to the currentPreset property of an audio unit that does not support
     * restoring state from user presets may result in incorrect behavior.
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("supportsUserPresets")
    public native boolean supportsUserPresets();

    /**
     * [@property] userPresets
     * 
     * A collection of presets saved by the user
     * 
     * In addition to factory presets, provided by the audio unit vendor, users have the ability to
     * save the values of the parameters of an audio unit into a user preset. These users presets
     * can be accessed using this property.
     * 
     * The default implementation of this method will load the user presets from an internal
     * location that might not be directly accessible to the audio unit host application or to the
     * audio unit. Instead of accessing this path directly, the audio unit should rely on the
     * superclass implementation of this method to retrieve the presets.
     * 
     * Audio Units are free to override this method to load their user presets via different means
     * (e.g. from their iCloud container).
     * 
     * API-Since: 13.0
     */
    @NotNull
    @Generated
    @Selector("userPresets")
    public native NSArray<? extends AUAudioUnitPreset> userPresets();

    /**
     * [@property] renderBlock
     * 
     * Block which hosts use to ask the unit to render.
     * 
     * Before invoking an audio unit's rendering functionality, a host should fetch this block and
     * cache the result. The block can then be called from a realtime context without the
     * possibility of blocking and causing an overload at the Core Audio HAL level.
     * 
     * This block will call a subclass' internalRenderBlock, providing all realtime events
     * scheduled for the current render time interval, bracketed by calls to any render observers.
     * 
     * Subclassers should override internalRenderBlock, not this property.
     * 
     * Bridged to the v2 API AudioUnitRender().
     */
    @NotNull
    @Generated
    @Selector("renderBlock")
    @ObjCBlock(name = "call_renderBlock_ret")
    public native Block_renderBlock_ret renderBlock();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_renderBlock_ret {
        @Runtime(ObjCRuntime.class)
        @Generated
        public interface Block_Block_renderBlock_ret {
            @Generated
            int call_Block_renderBlock_ret(@NotNull IntPtr actionFlags,
                    @NotNull @UncertainArgument("Options: reference, array Fallback: reference") AudioTimeStamp timestamp,
                    int frameCount, @NInt long inputBusNumber,
                    @NotNull @UncertainArgument("Options: reference, array Fallback: reference") AudioBufferList inputData);
        }

        @Generated
        int call_renderBlock_ret(@NotNull IntPtr actionFlags,
                @NotNull @UncertainArgument("Options: reference, array Fallback: reference") AudioTimeStamp timestamp,
                int frameCount, @NInt long outputBusNumber,
                @NotNull @UncertainArgument("Options: reference, array Fallback: reference") AudioBufferList outputData,
                @Nullable @ObjCBlock(name = "call_Block_renderBlock_ret") Block_Block_renderBlock_ret pullInputBlock);
    }

    /**
     * [@property] osWorkgroup
     * 
     * The os_workgroup_t to which the input/output audio unit belongs.
     * 
     * For further background, see <AudioToolbox/AudioWorkInterval.h>.
     * 
     * Bridged to the v2 property kAudioOutputUnitProperty_OSWorkgroup.
     * 
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @Selector("osWorkgroup")
    public native os_workgroup_t osWorkgroup();

    /**
     * [@property] renderContextObserver
     * 
     * Block called by the OS when the rendering context changes.
     * 
     * Audio Units which create auxiliary realtime rendering threads should implement this property to
     * return a block which will be called by the OS when the render context changes. Audio Unit hosts
     * must not attempt to interact with the AudioUnit through this block; it is for the exclusive use
     * of the OS. See <AudioToolbox/AudioWorkInterval.h> for more information.
     * 
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @Selector("renderContextObserver")
    @ObjCBlock(name = "call_renderContextObserver_ret")
    public native Block_renderContextObserver_ret renderContextObserver();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_renderContextObserver_ret {
        @Generated
        void call_renderContextObserver_ret(
                @UncertainArgument("Options: reference, array Fallback: reference") @NotNull AudioUnitRenderContext context);
    }

    /**
     * [@property] AudioUnitMIDIProtocol
     * 
     * The MIDI protocol used by the Audio Unit for receiving MIDIEventList data.
     * 
     * Subclassers should override to return the desired protocol in which the Audio Unit wants
     * to receive input MIDI data, otherwise the Audio Unit will default to receiving legacy MIDI.
     * 
     * All translatable messages will be converted (if necessary) to this protocol prior to delivery
     * to the Audio Unit.
     * 
     * This is bridged to the v2 API property kAudioUnitProperty_AudioUnitMIDIProtocol.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("AudioUnitMIDIProtocol")
    public native int AudioUnitMIDIProtocol();

    /**
     * [@property] MIDIOutputEventListBlock
     * 
     * Block used by the host to access the MIDIEventList output generated by an Audio Unit.
     * 
     * The host can set this block and the plug-in can call it in its renderBlock to provide to the
     * host the MIDIEventList data associated with the current render cycle.
     * 
     * All events sent via this block will be delivered to the host in the MIDI protocol returned by
     * the hostMIDIProtocol property. For example, if hostMIDIProtocol is set to
     * kMIDIProtocol_2_0, incoming events will be translated to MIDI 2.0. If hostMIDIProtocol
     * is not set, events will be delivered as legacy MIDI.
     * 
     * Note: This block is cross-compatible with Audio Units using MIDIOutputEventBlock and should be
     * preferred over MIDIOutputEventBlock by hosts going forward. The framework will provide the Audio Unit
     * with both a MIDIOutputEventBlock and MIDIOutputEventListBlock, the Audio Unit is free to call either
     * block as all messages will be translated as described above.
     * 
     * Host should setup in the following order:
     * - Set hostMIDIProtocol
     * - Set MIDIOutputEventListBlock
     * - Call allocateRenderResourcesAndReturnError
     * 
     * This is bridged to the v2 API property kAudioUnitProperty_MIDIOutputEventListCallback.
     * 
     * API-Since: 15.0
     */
    @Nullable
    @Generated
    @Selector("MIDIOutputEventListBlock")
    @ObjCBlock(name = "call_MIDIOutputEventListBlock_ret")
    public native Block_MIDIOutputEventListBlock_ret MIDIOutputEventListBlock();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_MIDIOutputEventListBlock_ret {
        @Generated
        int call_MIDIOutputEventListBlock_ret(long eventSampleTime, byte cable,
                @NotNull @UncertainArgument("Options: reference, array Fallback: reference") MIDIEventList eventList);
    }

    /**
     * [@property] hostMIDIProtocol
     * 
     * The MIDI protocol to be used by the host for receiving MIDIEventList data.
     * 
     * Hosts should set this property to the protocol they wish to receive MIDIEventList data
     * from the Audio Unit. This should be set prior to initialization, all translatable messages
     * will be converted (if necessary) to this property's protocol prior to delivery to the host.
     * 
     * Host should setup in the following order:
     * - Set hostMIDIProtocol
     * - Set MIDIOutputEventListBlock
     * - Call allocateRenderResourcesAndReturnError
     * 
     * This is bridged to the v2 API property kAudioUnitProperty_HostMIDIProtocol.
     * 
     * Notes:
     * - If overriding this property, subclassers must call [super setHostMIDIProtocol:]
     * - hostMIDIProtocol should be set before attempting to query AudioUnitMIDIProtocol
     * or calling allocateRenderResourcesAndReturnError to allow Audio Units to
     * optionally match their input MIDI protocol to the desired host protocol and prevent
     * protocol conversion.
     * 
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("hostMIDIProtocol")
    public native int hostMIDIProtocol();

    /**
     * [@property] scheduleMIDIEventListBlock
     * 
     * Block used to schedule MIDIEventLists.
     * 
     * As with renderBlock, a host should fetch and cache this block before calling
     * allocateRenderResources, if it intends to schedule MIDI events.
     * 
     * When scheduling events during the render cycle (e.g. via a render observer) eventSampleTime can be
     * AUEventSampleTimeImmediate plus an optional buffer offset, in which case the event is
     * scheduled at the provided offset position within the current render cycle.
     * 
     * This is implemented in the base class. It is nil when musicDeviceOrEffect is NO.
     * 
     * Subclassers should not override. When hosts schedule events via this block, they are
     * delivered to the Audio Unit via the list of AURenderEvents delivered to
     * internalRenderBlock.
     * 
     * All events sent via this block will be delivered to the internalRenderBlock in the MIDI protocol returned by
     * the AudioUnitMIDIProtocol property. For example, if this block is called with MIDI-1.0 events but
     * AudioUnitMIDIProtocol returns kMIDIProtocol_2_0, incoming events will be translated to MIDI 2.0.
     * If AudioUnitMIDIProtocol is not set, events will be delivered as legacy MIDI.
     * 
     * Note: This block should be preferred over scheduleMIDIEventBlock going forward.
     * 
     * This bridged to the v2 API MusicDeviceMIDIEventList.
     * 
     * API-Since: 15.0
     */
    @Nullable
    @Generated
    @Selector("scheduleMIDIEventListBlock")
    @ObjCBlock(name = "call_scheduleMIDIEventListBlock_ret")
    public native Block_scheduleMIDIEventListBlock_ret scheduleMIDIEventListBlock();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_scheduleMIDIEventListBlock_ret {
        @Generated
        int call_scheduleMIDIEventListBlock_ret(long eventSampleTime, byte cable,
                @NotNull @UncertainArgument("Options: reference, array Fallback: reference") MIDIEventList eventList);
    }

    /**
     * [@property] hostMIDIProtocol
     * 
     * The MIDI protocol to be used by the host for receiving MIDIEventList data.
     * 
     * Hosts should set this property to the protocol they wish to receive MIDIEventList data
     * from the Audio Unit. This should be set prior to initialization, all translatable messages
     * will be converted (if necessary) to this property's protocol prior to delivery to the host.
     * 
     * Host should setup in the following order:
     * - Set hostMIDIProtocol
     * - Set MIDIOutputEventListBlock
     * - Call allocateRenderResourcesAndReturnError
     * 
     * This is bridged to the v2 API property kAudioUnitProperty_HostMIDIProtocol.
     * 
     * Notes:
     * - If overriding this property, subclassers must call [super setHostMIDIProtocol:]
     * - hostMIDIProtocol should be set before attempting to query AudioUnitMIDIProtocol
     * or calling allocateRenderResourcesAndReturnError to allow Audio Units to
     * optionally match their input MIDI protocol to the desired host protocol and prevent
     * protocol conversion.
     * 
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("setHostMIDIProtocol:")
    public native void setHostMIDIProtocol(int value);

    /**
     * [@property] MIDIOutputEventListBlock
     * 
     * Block used by the host to access the MIDIEventList output generated by an Audio Unit.
     * 
     * The host can set this block and the plug-in can call it in its renderBlock to provide to the
     * host the MIDIEventList data associated with the current render cycle.
     * 
     * All events sent via this block will be delivered to the host in the MIDI protocol returned by
     * the hostMIDIProtocol property. For example, if hostMIDIProtocol is set to
     * kMIDIProtocol_2_0, incoming events will be translated to MIDI 2.0. If hostMIDIProtocol
     * is not set, events will be delivered as legacy MIDI.
     * 
     * Note: This block is cross-compatible with Audio Units using MIDIOutputEventBlock and should be
     * preferred over MIDIOutputEventBlock by hosts going forward. The framework will provide the Audio Unit
     * with both a MIDIOutputEventBlock and MIDIOutputEventListBlock, the Audio Unit is free to call either
     * block as all messages will be translated as described above.
     * 
     * Host should setup in the following order:
     * - Set hostMIDIProtocol
     * - Set MIDIOutputEventListBlock
     * - Call allocateRenderResourcesAndReturnError
     * 
     * This is bridged to the v2 API property kAudioUnitProperty_MIDIOutputEventListCallback.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("setMIDIOutputEventListBlock:")
    public native void setMIDIOutputEventListBlock(
            @Nullable @ObjCBlock(name = "call_setMIDIOutputEventListBlock") Block_setMIDIOutputEventListBlock value);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setMIDIOutputEventListBlock {
        @Generated
        int call_setMIDIOutputEventListBlock(long eventSampleTime, byte cable,
                @NotNull @UncertainArgument("Options: reference, array Fallback: reference") MIDIEventList eventList);
    }

    /**
     * Block which subclassers must provide (via a getter) to implement rendering.
     */
    @NotNull
    @Generated
    @Selector("internalRenderBlock")
    @ObjCBlock(name = "call_internalRenderBlock_ret")
    public native Block_internalRenderBlock_ret internalRenderBlock();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_internalRenderBlock_ret {
        @Runtime(ObjCRuntime.class)
        @Generated
        public interface Block_Block_internalRenderBlock_ret {
            @Generated
            int call_Block_internalRenderBlock_ret(@NotNull IntPtr actionFlags,
                    @NotNull @UncertainArgument("Options: reference, array Fallback: reference") AudioTimeStamp timestamp,
                    int frameCount, @NInt long inputBusNumber,
                    @NotNull @UncertainArgument("Options: reference, array Fallback: reference") AudioBufferList inputData);
        }

        @Generated
        int call_internalRenderBlock_ret(@NotNull IntPtr actionFlags,
                @NotNull @UncertainArgument("Options: reference, array Fallback: reference") AudioTimeStamp timestamp,
                int frameCount, @NInt long outputBusNumber,
                @NotNull @UncertainArgument("Options: reference, array Fallback: reference") AudioBufferList outputData,
                @Nullable VoidPtr realtimeEventListHead,
                @Nullable @ObjCBlock(name = "call_Block_internalRenderBlock_ret") Block_Block_internalRenderBlock_ret pullInputBlock);
    }

    /**
     * messageChannelFor:
     * 
     * Returns an object for bidirectional communication between an Audio Unit and its host.
     * 
     * Message channels provide a flexible way for custom data exchange between an Audio Unit and its host.
     * An Audio Unit can support multiple message channels which are identified by the `channelName`.
     * The message channel object's lifetime is managed by the host. Message channel objects should be designed
     * in such a way that they could outlive the AU that vended them.
     * For further details see discussion for `AUMessageChannel`.
     * 
     * @param channelName
     *                    The name of the message channel to be returned by the Audio Unit if supported.
     * @return
     *         An object that conforms to the `AUMessageChannel` protocol.
     * 
     *         API-Since: 16.0
     */
    @NotNull
    @Generated
    @Selector("messageChannelFor:")
    @MappedReturn(ObjCObjectMapper.class)
    public native AUMessageChannel messageChannelFor(@NotNull String channelName);

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}

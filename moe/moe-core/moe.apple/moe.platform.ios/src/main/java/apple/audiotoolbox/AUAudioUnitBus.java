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
import apple.avfoundation.AVAudioFormat;
import apple.foundation.NSArray;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSNumber;
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
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * @class	AUAudioUnitBus
 * @brief	An input or output connection point on an audio unit.
 */
@Generated
@Library("AudioToolbox")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class AUAudioUnitBus extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected AUAudioUnitBus(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native AUAudioUnitBus alloc();

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
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * @property   busType
     * @brief      The AUAudioUnitBusType.
     */
    @Generated
    @Selector("busType")
    @NInt
    public native long busType();

    /**
     * @property	contextPresentationLatency
     * @brief		Information about latency in the audio unit's processing context.
     * @discussion
     * 	This should not be confused with the audio unit's latency property, where the audio unit
     * 	describes to the host any processing latency it introduces between its input and its output.
     * 
     * 	A host may set this property to describe to the audio unit the presentation latency of its
     * 	input and/or output audio data. Latency is described in seconds. A value of zero means
     * 	either no latency or an unknown latency.
     * 
     * 	A host should set this property on each active bus, since, for example, the audio routing
     * 	path to each of multiple output busses may differ.
     * 
     * 	For input busses:
     * 		Describes how long ago the audio arriving on this bus was acquired. For instance, when
     * 		reading from a file to the first audio unit in a chain, the input presentation latency
     * 		is zero. For audio input from a device, this initial input latency is the presentation
     * 		latency of the device itself, i.e. the device's safety offset and latency.
     * 
     * 		A second chained audio unit's input presentation latency will be the input presentation
     * 		latency of the first unit, plus the processing latency of the first unit.
     * 
     * 	For output busses:
     * 		Describes how long it will be before the output audio of an audio unit is presented. For
     * 		instance, when writing to a file, the output presentation latency of the last audio unit
     * 		in a chain is zero. When the audio from that audio unit is to be played to a device,
     * 		then that initial presentation latency will be the presentation latency of the device
     * 		itself, which is the I/O buffer size, plus the device's safety offset and latency
     * 
     * 		A previous chained audio unit's output presentation latency is the last unit's
     * 		presentation latency plus its processing latency.
     * 
     * 	So, for a given audio unit anywhere within a mixing graph, the input and output presentation 
     * 	latencies describe to that unit how long from the moment of generation it has taken for its 
     * 	input to arrive, and how long it will take for its output to be presented.
     * 
     * 	Bridged to the v2 property kAudioUnitProperty_PresentationLatency.
     */
    @Generated
    @Selector("contextPresentationLatency")
    public native double contextPresentationLatency();

    /**
     * @property	format
     * @brief		The audio format and channel layout of audio being transferred on the bus.
     * @discussion
     * 	Bridged to the v2 property kAudioUnitProperty_StreamFormat.
     */
    @Generated
    @Selector("format")
    public native AVAudioFormat format();

    /**
     * @property   index
     * @brief      The index of this bus in the containing array.
     */
    @Generated
    @Selector("index")
    @NUInt
    public native long index();

    @Generated
    @Selector("init")
    public native AUAudioUnitBus init();

    /**
     * @method		initWithFormat:error:
     * @brief		initialize with a default format.
     * @param format	The initial format for the bus.
     * @param outError	An error if the format is unsupported for the bus.
     */
    @Generated
    @Selector("initWithFormat:error:")
    public native AUAudioUnitBus initWithFormatError(AVAudioFormat format,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

    /**
     * @property	enabled
     * @brief		Whether the bus is active.
     * @discussion
     * 	Hosts must enable input busses before using them. The reason for this is to allow a unit
     * 	such as a mixer to be prepared to render a large number of inputs, but avoid the work
     * 	of preparing to pull inputs which are not in use.
     * 
     * 	Bridged to the v2 properties kAudioUnitProperty_MakeConnection and
     * 	kAudioUnitProperty_SetRenderCallback.
     */
    @Generated
    @Selector("isEnabled")
    public native boolean isEnabled();

    /**
     * @property	enabled
     * @brief		Whether the bus is active.
     * @discussion
     * 	Hosts must enable input busses before using them. The reason for this is to allow a unit
     * 	such as a mixer to be prepared to render a large number of inputs, but avoid the work
     * 	of preparing to pull inputs which are not in use.
     * 
     * 	Bridged to the v2 properties kAudioUnitProperty_MakeConnection and
     * 	kAudioUnitProperty_SetRenderCallback.
     */
    @Generated
    @Selector("setEnabled:")
    public native void setEnabled(boolean value);

    /**
     * @property	maximumChannelCount
     * @brief		The maximum numbers of channels supported for this bus.
     * @discussion
     * 	If supportedChannelCounts is set, then this value is derived from supportedChannelCounts. If
     * 	setting maximumChannelCount makes the current format unsupported, then format will be set to
     * 	nil. The default value is UINT_MAX.
     */
    @Generated
    @Selector("maximumChannelCount")
    public native int maximumChannelCount();

    /**
     * @property	name
     * @brief		A name for the bus. Can be set by host.
     */
    @Generated
    @Selector("name")
    public native String name();

    /**
     * @property   ownerAudioUnit
     * @brief      The audio unit that owns the bus.
     */
    @Generated
    @Selector("ownerAudioUnit")
    public native AUAudioUnit ownerAudioUnit();

    /**
     * @property	contextPresentationLatency
     * @brief		Information about latency in the audio unit's processing context.
     * @discussion
     * 	This should not be confused with the audio unit's latency property, where the audio unit
     * 	describes to the host any processing latency it introduces between its input and its output.
     * 
     * 	A host may set this property to describe to the audio unit the presentation latency of its
     * 	input and/or output audio data. Latency is described in seconds. A value of zero means
     * 	either no latency or an unknown latency.
     * 
     * 	A host should set this property on each active bus, since, for example, the audio routing
     * 	path to each of multiple output busses may differ.
     * 
     * 	For input busses:
     * 		Describes how long ago the audio arriving on this bus was acquired. For instance, when
     * 		reading from a file to the first audio unit in a chain, the input presentation latency
     * 		is zero. For audio input from a device, this initial input latency is the presentation
     * 		latency of the device itself, i.e. the device's safety offset and latency.
     * 
     * 		A second chained audio unit's input presentation latency will be the input presentation
     * 		latency of the first unit, plus the processing latency of the first unit.
     * 
     * 	For output busses:
     * 		Describes how long it will be before the output audio of an audio unit is presented. For
     * 		instance, when writing to a file, the output presentation latency of the last audio unit
     * 		in a chain is zero. When the audio from that audio unit is to be played to a device,
     * 		then that initial presentation latency will be the presentation latency of the device
     * 		itself, which is the I/O buffer size, plus the device's safety offset and latency
     * 
     * 		A previous chained audio unit's output presentation latency is the last unit's
     * 		presentation latency plus its processing latency.
     * 
     * 	So, for a given audio unit anywhere within a mixing graph, the input and output presentation 
     * 	latencies describe to that unit how long from the moment of generation it has taken for its 
     * 	input to arrive, and how long it will take for its output to be presented.
     * 
     * 	Bridged to the v2 property kAudioUnitProperty_PresentationLatency.
     */
    @Generated
    @Selector("setContextPresentationLatency:")
    public native void setContextPresentationLatency(double value);

    /**
     * @property	setFormat:error:
     * @brief		Sets the bus's audio format.
     * @discussion
     * 	Audio units can generally be expected to support AVAudioFormat's standard format
     * 	(deinterleaved 32-bit float), at any sample rate. Channel counts can be more complex;
     * 	see AUAudioUnit.channelCapabilities.
     */
    @Generated
    @Selector("setFormat:error:")
    public native boolean setFormatError(AVAudioFormat format,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

    /**
     * @property	maximumChannelCount
     * @brief		The maximum numbers of channels supported for this bus.
     * @discussion
     * 	If supportedChannelCounts is set, then this value is derived from supportedChannelCounts. If
     * 	setting maximumChannelCount makes the current format unsupported, then format will be set to
     * 	nil. The default value is UINT_MAX.
     */
    @Generated
    @Selector("setMaximumChannelCount:")
    public native void setMaximumChannelCount(int value);

    /**
     * @property	name
     * @brief		A name for the bus. Can be set by host.
     */
    @Generated
    @Selector("setName:")
    public native void setName(String value);

    /**
     * @property	supportedChannelCounts
     * @brief		An array of numbers giving the supported numbers of channels for this bus.
     * @discussion
     * 	If supportedChannelCounts is nil, then any number less than or equal to maximumChannelCount
     * 	is supported. If setting supportedChannelCounts makes the current format unsupported, then
     * 	format will be set to nil. The default value is nil.
     */
    @Generated
    @Selector("setSupportedChannelCounts:")
    public native void setSupportedChannelCounts(NSArray<? extends NSNumber> value);

    /**
     * @property	supportedChannelCounts
     * @brief		An array of numbers giving the supported numbers of channels for this bus.
     * @discussion
     * 	If supportedChannelCounts is nil, then any number less than or equal to maximumChannelCount
     * 	is supported. If setting supportedChannelCounts makes the current format unsupported, then
     * 	format will be set to nil. The default value is nil.
     */
    @Generated
    @Selector("supportedChannelCounts")
    public native NSArray<? extends NSNumber> supportedChannelCounts();

    /**
     * @property	supportedChannelLayoutTags
     * @discussion
     * 	This is an array of NSNumbers representing AudioChannelLayoutTag.
     */
    @Generated
    @Selector("supportedChannelLayoutTags")
    public native NSArray<? extends NSNumber> supportedChannelLayoutTags();

    /**
     * @property	shouldAllocateBuffer
     * @brief		Controls the audio unit's allocation strategy for a bus.
     * @discussion
     *     Hosts can set this flag to communicate whether an audio unit should allocate its own buffer.
     *     By default this flag is set to true.
     * 
     *     On the output side, shouldAllocateBuffer=false means the AU can assume that it will be
     *     called with non-null output buffers. If shouldAllocateBuffer=true (the default), the AU must
     *     be prepared to be called with null pointers and replace them with pointers to its internally
     *     allocated buffer.
     * 
     *     On the input side, shouldAllocateBuffer=false means the AU can pull for input using a buffer
     *     list with null buffer pointers, and assume that the pull input block will provide pointers.
     *     If shouldAllocateBuffer=true (the default), the AU must pull with non-null pointers while
     *     still being prepared for the source to replace them with pointers of its own.
     * 
     *     Bridged to the v2 property kAudioUnitProperty_ShouldAllocateBuffer.
     */
    @Generated
    @Selector("setShouldAllocateBuffer:")
    public native void setShouldAllocateBuffer(boolean value);

    /**
     * @property	shouldAllocateBuffer
     * @brief		Controls the audio unit's allocation strategy for a bus.
     * @discussion
     *     Hosts can set this flag to communicate whether an audio unit should allocate its own buffer.
     *     By default this flag is set to true.
     * 
     *     On the output side, shouldAllocateBuffer=false means the AU can assume that it will be
     *     called with non-null output buffers. If shouldAllocateBuffer=true (the default), the AU must
     *     be prepared to be called with null pointers and replace them with pointers to its internally
     *     allocated buffer.
     * 
     *     On the input side, shouldAllocateBuffer=false means the AU can pull for input using a buffer
     *     list with null buffer pointers, and assume that the pull input block will provide pointers.
     *     If shouldAllocateBuffer=true (the default), the AU must pull with non-null pointers while
     *     still being prepared for the source to replace them with pointers of its own.
     * 
     *     Bridged to the v2 property kAudioUnitProperty_ShouldAllocateBuffer.
     */
    @Generated
    @Selector("shouldAllocateBuffer")
    public native boolean shouldAllocateBuffer();
}

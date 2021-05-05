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
import apple.avfoundation.protocol.AVAudioMixing;
import apple.avfoundation.struct.AVAudio3DPoint;
import apple.coreaudiotypes.struct.AudioBufferList;
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
import org.moe.natj.general.ann.UncertainReturn;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * AVAudioInputNode
 * 
 * 	A node that performs audio input in the engine.
 * 
 * 		When the engine is rendering to/from an audio device, this node connects to the system's 
 * 	audio input.
 * 	When the engine is operating in manual rendering mode, this node can be used to supply
 * 	the input data to the engine.
 * 
 * 	This node has one element.
 * 	The format of the input scope reflects:
 * 		- the audio hardware sample rate and channel count, when connected to the hardware
 * 		- the format of the PCM audio data that the node will supply to the engine, in the
 * 		  manual rendering mode (see `setManualRenderingInputPCMFormat:inputBlock:`)
 * 
 * 	When rendering from an audio device, the input node does not support format conversion.
 * 	Hence the format of the output scope must be same as that of the input, as well as the
 * 	formats for all the nodes connected in the input node chain.
 * 
 * 	In the manual rendering mode, the format of the output scope is initially the same as that
 * 	of the input, but you may set it to a different format, in which case the node will convert.
 */
@Generated
@Library("AVFoundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class AVAudioInputNode extends AVAudioIONode implements AVAudioMixing {
    static {
        NatJ.register();
    }

    @Generated
    protected AVAudioInputNode(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native AVAudioInputNode alloc();

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

    @Generated
    @Selector("destinationForMixer:bus:")
    public native AVAudioMixingDestination destinationForMixerBus(AVAudioNode mixer, @NUInt long bus);

    @Generated
    @Selector("init")
    public native AVAudioInputNode init();

    @Generated
    @Selector("obstruction")
    public native float obstruction();

    @Generated
    @Selector("occlusion")
    public native float occlusion();

    @Generated
    @Selector("pan")
    public native float pan();

    @Generated
    @Selector("position")
    @ByValue
    public native AVAudio3DPoint position();

    @Generated
    @Selector("rate")
    public native float rate();

    @Generated
    @Selector("renderingAlgorithm")
    @NInt
    public native long renderingAlgorithm();

    @Generated
    @Selector("reverbBlend")
    public native float reverbBlend();

    @Generated
    @Selector("setObstruction:")
    public native void setObstruction(float value);

    @Generated
    @Selector("setOcclusion:")
    public native void setOcclusion(float value);

    @Generated
    @Selector("setPan:")
    public native void setPan(float value);

    @Generated
    @Selector("setPosition:")
    public native void setPosition(@ByValue AVAudio3DPoint value);

    @Generated
    @Selector("setRate:")
    public native void setRate(float value);

    @Generated
    @Selector("setRenderingAlgorithm:")
    public native void setRenderingAlgorithm(@NInt long value);

    @Generated
    @Selector("setReverbBlend:")
    public native void setReverbBlend(float value);

    @Generated
    @Selector("setVolume:")
    public native void setVolume(float value);

    @Generated
    @Selector("volume")
    public native float volume();

    /**
     * setManualRenderingInputPCMFormat:inputBlock:
     * 
     * 	Supply the data through the input node to the engine operating in the manual rendering mode.
     * 
     * 		This block must be set if the input node is being used when the engine is operating in 
     * 	manual rendering mode.
     * 	Switching the engine to render to/from an audio device invalidates any previously set block, 
     * 	and makes this method ineffective.
     * 
     * @param format
     * 	The format of the PCM audio data the block will supply to the engine
     * @param block
     * 	The block the engine will call on the input node to get the audio to send to the output,
     * 	when operating in the manual rendering mode. See `AVAudioIONodeInputBlock` for more details
     * @return
     * 	YES for success
     */
    @Generated
    @Selector("setManualRenderingInputPCMFormat:inputBlock:")
    public native boolean setManualRenderingInputPCMFormatInputBlock(AVAudioFormat format,
            @ObjCBlock(name = "call_setManualRenderingInputPCMFormatInputBlock") Block_setManualRenderingInputPCMFormatInputBlock block);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setManualRenderingInputPCMFormatInputBlock {
        @Generated
        @UncertainReturn("Options: reference, array Fallback: reference")
        AudioBufferList call_setManualRenderingInputPCMFormatInputBlock(int inNumberOfFrames);
    }

    /**
     * [@property] voiceProcessingAGCEnabled
     * 
     *     Enable automatic gain control on the processed microphone/uplink
     *     signal. Enabled by default.
     * 
     *     Querying this property when voice processing is disabled will return false.
     */
    @Generated
    @Selector("isVoiceProcessingAGCEnabled")
    public native boolean isVoiceProcessingAGCEnabled();

    /**
     * [@property] voiceProcessingBypassed
     * 
     *    Bypass all processing done by the voice processing unit.
     * 
     *    Querying this property when voice processing is disabled will return false.
     */
    @Generated
    @Selector("isVoiceProcessingBypassed")
    public native boolean isVoiceProcessingBypassed();

    /**
     * [@property] voiceProcessingInputMuted
     * 
     *     Mutes the input of the voice processing unit.
     * 
     *     Querying this property when voice processing is disabled will return false.
     */
    @Generated
    @Selector("isVoiceProcessingInputMuted")
    public native boolean isVoiceProcessingInputMuted();

    @Generated
    @Selector("pointSourceInHeadMode")
    @NInt
    public native long pointSourceInHeadMode();

    @Generated
    @Selector("setPointSourceInHeadMode:")
    public native void setPointSourceInHeadMode(@NInt long value);

    @Generated
    @Selector("setSourceMode:")
    public native void setSourceMode(@NInt long value);

    /**
     * [@property] voiceProcessingAGCEnabled
     * 
     *     Enable automatic gain control on the processed microphone/uplink
     *     signal. Enabled by default.
     * 
     *     Querying this property when voice processing is disabled will return false.
     */
    @Generated
    @Selector("setVoiceProcessingAGCEnabled:")
    public native void setVoiceProcessingAGCEnabled(boolean value);

    /**
     * [@property] voiceProcessingBypassed
     * 
     *    Bypass all processing done by the voice processing unit.
     * 
     *    Querying this property when voice processing is disabled will return false.
     */
    @Generated
    @Selector("setVoiceProcessingBypassed:")
    public native void setVoiceProcessingBypassed(boolean value);

    /**
     * [@property] voiceProcessingInputMuted
     * 
     *     Mutes the input of the voice processing unit.
     * 
     *     Querying this property when voice processing is disabled will return false.
     */
    @Generated
    @Selector("setVoiceProcessingInputMuted:")
    public native void setVoiceProcessingInputMuted(boolean value);

    @Generated
    @Selector("sourceMode")
    @NInt
    public native long sourceMode();
}

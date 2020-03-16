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
public class AVAudioPlayerNode extends AVAudioNode implements AVAudioMixing {
    static {
        NatJ.register();
    }

    @Generated
    protected AVAudioPlayerNode(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native AVAudioPlayerNode alloc();

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
    public native AVAudioPlayerNode init();

    @Generated
    @Selector("isPlaying")
    public native boolean isPlaying();

    @Generated
    @Selector("nodeTimeForPlayerTime:")
    public native AVAudioTime nodeTimeForPlayerTime(AVAudioTime playerTime);

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
    @Selector("pause")
    public native void pause();

    @Generated
    @Selector("play")
    public native void play();

    @Generated
    @Selector("playAtTime:")
    public native void playAtTime(AVAudioTime when);

    @Generated
    @Selector("playerTimeForNodeTime:")
    public native AVAudioTime playerTimeForNodeTime(AVAudioTime nodeTime);

    @Generated
    @Selector("position")
    @ByValue
    public native AVAudio3DPoint position();

    @Generated
    @Selector("prepareWithFrameCount:")
    public native void prepareWithFrameCount(int frameCount);

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
    @Selector("scheduleBuffer:atTime:options:completionHandler:")
    public native void scheduleBufferAtTimeOptionsCompletionHandler(AVAudioPCMBuffer buffer, AVAudioTime when,
            @NUInt long options,
            @ObjCBlock(name = "call_scheduleBufferAtTimeOptionsCompletionHandler") Block_scheduleBufferAtTimeOptionsCompletionHandler completionHandler);

    @Generated
    @Selector("scheduleBuffer:completionHandler:")
    public native void scheduleBufferCompletionHandler(AVAudioPCMBuffer buffer,
            @ObjCBlock(name = "call_scheduleBufferCompletionHandler") Block_scheduleBufferCompletionHandler completionHandler);

    @Generated
    @Selector("scheduleFile:atTime:completionHandler:")
    public native void scheduleFileAtTimeCompletionHandler(AVAudioFile file, AVAudioTime when,
            @ObjCBlock(name = "call_scheduleFileAtTimeCompletionHandler") Block_scheduleFileAtTimeCompletionHandler completionHandler);

    @Generated
    @Selector("scheduleSegment:startingFrame:frameCount:atTime:completionHandler:")
    public native void scheduleSegmentStartingFrameFrameCountAtTimeCompletionHandler(AVAudioFile file, long startFrame,
            int numberFrames, AVAudioTime when,
            @ObjCBlock(name = "call_scheduleSegmentStartingFrameFrameCountAtTimeCompletionHandler") Block_scheduleSegmentStartingFrameFrameCountAtTimeCompletionHandler completionHandler);

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
    @Selector("stop")
    public native void stop();

    @Generated
    @Selector("volume")
    public native float volume();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_scheduleBufferAtTimeOptionsCompletionHandler {
        @Generated
        void call_scheduleBufferAtTimeOptionsCompletionHandler();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_scheduleBufferCompletionHandler {
        @Generated
        void call_scheduleBufferCompletionHandler();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_scheduleFileAtTimeCompletionHandler {
        @Generated
        void call_scheduleFileAtTimeCompletionHandler();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_scheduleSegmentStartingFrameFrameCountAtTimeCompletionHandler {
        @Generated
        void call_scheduleSegmentStartingFrameFrameCountAtTimeCompletionHandler();
    }

    @Generated
    @Selector("scheduleBuffer:atTime:options:completionCallbackType:completionHandler:")
    public native void scheduleBufferAtTimeOptionsCompletionCallbackTypeCompletionHandler(AVAudioPCMBuffer buffer,
            AVAudioTime when, @NUInt long options, @NInt long callbackType,
            @ObjCBlock(name = "call_scheduleBufferAtTimeOptionsCompletionCallbackTypeCompletionHandler") Block_scheduleBufferAtTimeOptionsCompletionCallbackTypeCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_scheduleBufferAtTimeOptionsCompletionCallbackTypeCompletionHandler {
        @Generated
        void call_scheduleBufferAtTimeOptionsCompletionCallbackTypeCompletionHandler(@NInt long arg0);
    }

    @Generated
    @Selector("scheduleBuffer:completionCallbackType:completionHandler:")
    public native void scheduleBufferCompletionCallbackTypeCompletionHandler(AVAudioPCMBuffer buffer,
            @NInt long callbackType,
            @ObjCBlock(name = "call_scheduleBufferCompletionCallbackTypeCompletionHandler") Block_scheduleBufferCompletionCallbackTypeCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_scheduleBufferCompletionCallbackTypeCompletionHandler {
        @Generated
        void call_scheduleBufferCompletionCallbackTypeCompletionHandler(@NInt long arg0);
    }

    @Generated
    @Selector("scheduleFile:atTime:completionCallbackType:completionHandler:")
    public native void scheduleFileAtTimeCompletionCallbackTypeCompletionHandler(AVAudioFile file, AVAudioTime when,
            @NInt long callbackType,
            @ObjCBlock(name = "call_scheduleFileAtTimeCompletionCallbackTypeCompletionHandler") Block_scheduleFileAtTimeCompletionCallbackTypeCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_scheduleFileAtTimeCompletionCallbackTypeCompletionHandler {
        @Generated
        void call_scheduleFileAtTimeCompletionCallbackTypeCompletionHandler(@NInt long arg0);
    }

    @Generated
    @Selector("scheduleSegment:startingFrame:frameCount:atTime:completionCallbackType:completionHandler:")
    public native void scheduleSegmentStartingFrameFrameCountAtTimeCompletionCallbackTypeCompletionHandler(
            AVAudioFile file, long startFrame, int numberFrames, AVAudioTime when, @NInt long callbackType,
            @ObjCBlock(name = "call_scheduleSegmentStartingFrameFrameCountAtTimeCompletionCallbackTypeCompletionHandler") Block_scheduleSegmentStartingFrameFrameCountAtTimeCompletionCallbackTypeCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_scheduleSegmentStartingFrameFrameCountAtTimeCompletionCallbackTypeCompletionHandler {
        @Generated
        void call_scheduleSegmentStartingFrameFrameCountAtTimeCompletionCallbackTypeCompletionHandler(@NInt long arg0);
    }

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

    @Generated
    @Selector("sourceMode")
    @NInt
    public native long sourceMode();
}

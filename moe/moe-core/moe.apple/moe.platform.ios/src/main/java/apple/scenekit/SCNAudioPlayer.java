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

package apple.scenekit;

import apple.NSObject;
import apple.avfaudio.AVAudioNode;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * API-Since: 9.0
 */
@Generated
@Library("SceneKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class SCNAudioPlayer extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected SCNAudioPlayer(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native SCNAudioPlayer alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native SCNAudioPlayer allocWithZone(VoidPtr zone);

    /**
     * [@property] audioPlayerWithAVAudioNode:
     * 
     * Create an audio player with a custom AVAudioNode instance.
     */
    @Generated
    @Selector("audioPlayerWithAVAudioNode:")
    public static native SCNAudioPlayer audioPlayerWithAVAudioNode(@NotNull AVAudioNode audioNode);

    /**
     * [@property] audioPlayerWithSource:
     * 
     * Create an audio player with a source.
     */
    @Generated
    @Selector("audioPlayerWithSource:")
    public static native SCNAudioPlayer audioPlayerWithSource(@NotNull SCNAudioSource source);

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
    public static native SCNAudioPlayer new_objc();

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
     * [@property] audioNode
     * 
     * The audioNode. If this player was not initialised with a custom AVAudioNode this contains the internal audio
     * player node used by scene kit internally.
     */
    @Nullable
    @Generated
    @Selector("audioNode")
    public native AVAudioNode audioNode();

    /**
     * [@property] audioSource
     * 
     * The audioSource if there is one.
     */
    @Nullable
    @Generated
    @Selector("audioSource")
    public native SCNAudioSource audioSource();

    /**
     * [@property] playbackFinished
     * 
     * This block is called when the playback stops in case a valid audio source is present.
     */
    @Nullable
    @Generated
    @Selector("didFinishPlayback")
    @ObjCBlock(name = "call_didFinishPlayback_ret")
    public native Block_didFinishPlayback_ret didFinishPlayback();

    @Generated
    @Selector("init")
    public native SCNAudioPlayer init();

    /**
     * [@property] initWithAVAudioNode:
     * 
     * Init an audio player with an AVAudioNode. Most people should use audioPlayerWithAVAudioNode as it permits to
     * recycle previous players instead of creating new ones for each instance.
     */
    @Generated
    @Selector("initWithAVAudioNode:")
    public native SCNAudioPlayer initWithAVAudioNode(@NotNull AVAudioNode audioNode);

    /**
     * [@property] initWithSource:
     * 
     * Init an audio player with a source. Most people should use audioPlayerWithSource as it permits to recycle
     * previous players instead of creating new ones for each instance.
     */
    @Generated
    @Selector("initWithSource:")
    public native SCNAudioPlayer initWithSource(@NotNull SCNAudioSource source);

    /**
     * [@property] playbackFinished
     * 
     * This block is called when the playback stops in case a valid audio source is present.
     */
    @Generated
    @Selector("setDidFinishPlayback:")
    public native void setDidFinishPlayback(
            @Nullable @ObjCBlock(name = "call_setDidFinishPlayback") Block_setDidFinishPlayback value);

    /**
     * [@property] playbackStarted
     * 
     * This block is called when the playback starts in case a valid audio source is present.
     */
    @Generated
    @Selector("setWillStartPlayback:")
    public native void setWillStartPlayback(
            @Nullable @ObjCBlock(name = "call_setWillStartPlayback") Block_setWillStartPlayback value);

    /**
     * [@property] playbackStarted
     * 
     * This block is called when the playback starts in case a valid audio source is present.
     */
    @Nullable
    @Generated
    @Selector("willStartPlayback")
    @ObjCBlock(name = "call_willStartPlayback_ret")
    public native Block_willStartPlayback_ret willStartPlayback();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_didFinishPlayback_ret {
        @Generated
        void call_didFinishPlayback_ret();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setDidFinishPlayback {
        @Generated
        void call_setDidFinishPlayback();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setWillStartPlayback {
        @Generated
        void call_setWillStartPlayback();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_willStartPlayback_ret {
        @Generated
        void call_willStartPlayback_ret();
    }
}

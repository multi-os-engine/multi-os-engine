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
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.NSURL;
import apple.foundation.protocol.NSCopying;
import apple.foundation.protocol.NSSecureCoding;
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
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * SCNAudioSource
 * 
 * The SCNAudioSource class represents an audio source that can be added to a SCNNode.
 * 
 * API-Since: 9.0
 */
@Generated
@Library("SceneKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class SCNAudioSource extends NSObject implements NSCopying, NSSecureCoding {
    static {
        NatJ.register();
    }

    @Generated
    protected SCNAudioSource(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native SCNAudioSource alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native SCNAudioSource allocWithZone(VoidPtr zone);

    /**
     * audioSourceNamed:
     * 
     * Convenience class initializer that caches audioSources.
     */
    @Generated
    @Selector("audioSourceNamed:")
    public static native SCNAudioSource audioSourceNamed(@NotNull String fileName);

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
    public static native SCNAudioSource new_objc();

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
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @NotNull
    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(@Nullable VoidPtr zone);

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(@NotNull NSCoder coder);

    @Generated
    @Selector("init")
    public native SCNAudioSource init();

    @Generated
    @Selector("initWithCoder:")
    public native SCNAudioSource initWithCoder(@NotNull NSCoder coder);

    /**
     * initWithFileNamed:
     * 
     * Convenience initializer that creates an AVAudioNode from the named audio asset in the main bundle.
     */
    @Generated
    @Selector("initWithFileNamed:")
    public native SCNAudioSource initWithFileNamed(@NotNull String name);

    /**
     * initWithURL:
     * 
     * Convenience initializer that creates an AVAudioNode from the URL that contain a audio asset.
     */
    @Generated
    @Selector("initWithURL:")
    public native SCNAudioSource initWithURL(@NotNull NSURL url);

    /**
     * [@property] positional
     * 
     * Marks the audio source as positional so that the audio mix considers relative position and velocity with regards
     * to the SCNSceneRenderer's current listener node. Defaults to YES.
     * 
     * shouldStream must be set to false in order to get positional audio (see shouldStream).
     * 
     * @see SCNSceneRenderer audioListener.
     */
    @Generated
    @Selector("isPositional")
    public native boolean isPositional();

    /**
     * [@property] positional
     * 
     * Marks the audio source as positional so that the audio mix considers relative position and velocity with regards
     * to the SCNSceneRenderer's current listener node. Defaults to YES.
     * 
     * shouldStream must be set to false in order to get positional audio (see shouldStream).
     * 
     * @see SCNSceneRenderer audioListener.
     */
    @Generated
    @Selector("setPositional:")
    public native void setPositional(boolean value);

    /**
     * load
     * 
     * Load and uncompress the audio source in memory. This method has no effect if "shouldStream" is set to YES or if
     * the audio source is already loaded.
     * 
     * This method let you preload your audio sources. If an audio source is not preloaded, it will be loaded anyway
     * when playing it.
     */
    @Generated
    @Selector("load")
    public native void load_objc();

    /**
     * [@property] loops
     * 
     * Specifies whether the audio source should loop or not. Defaults to NO.
     */
    @Generated
    @Selector("loops")
    public native boolean loops();

    /**
     * [@property] rate
     * 
     * The default rate for this audio buffer. Default is 1.0 (original rate of the audio source).
     */
    @Generated
    @Selector("rate")
    public native float rate();

    /**
     * [@property] reverbBlend
     * 
     * The default reverbBlend for this audio buffer. Default is 0.0 (no sound is sent to the reverb).
     */
    @Generated
    @Selector("reverbBlend")
    public native float reverbBlend();

    /**
     * [@property] loops
     * 
     * Specifies whether the audio source should loop or not. Defaults to NO.
     */
    @Generated
    @Selector("setLoops:")
    public native void setLoops(boolean value);

    /**
     * [@property] rate
     * 
     * The default rate for this audio buffer. Default is 1.0 (original rate of the audio source).
     */
    @Generated
    @Selector("setRate:")
    public native void setRate(float value);

    /**
     * [@property] reverbBlend
     * 
     * The default reverbBlend for this audio buffer. Default is 0.0 (no sound is sent to the reverb).
     */
    @Generated
    @Selector("setReverbBlend:")
    public native void setReverbBlend(float value);

    /**
     * [@property] shouldStream
     * 
     * Specifies whether the audio source should be streamed or not. Defaults to NO.
     */
    @Generated
    @Selector("setShouldStream:")
    public native void setShouldStream(boolean value);

    /**
     * [@property] volume
     * 
     * The default volume for this audio buffer. Default is 1.0 (full volume).
     */
    @Generated
    @Selector("setVolume:")
    public native void setVolume(float value);

    /**
     * [@property] shouldStream
     * 
     * Specifies whether the audio source should be streamed or not. Defaults to NO.
     */
    @Generated
    @Selector("shouldStream")
    public native boolean shouldStream();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    /**
     * [@property] volume
     * 
     * The default volume for this audio buffer. Default is 1.0 (full volume).
     */
    @Generated
    @Selector("volume")
    public native float volume();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}

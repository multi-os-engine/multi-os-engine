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

package apple.gamekit;

import apple.NSObject;
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

/**
 * GKVoiceChat represents an instance of a named voice communications channel
 */
@Generated
@Library("GameKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class GKVoiceChat extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected GKVoiceChat(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native GKVoiceChat alloc();

    @Generated
    @Selector("allocWithZone:")
    public static native GKVoiceChat allocWithZone(VoidPtr zone);

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
    @Selector("isVoIPAllowed")
    public static native boolean isVoIPAllowed();

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

    @Generated
    @Owned
    @Selector("new")
    public static native GKVoiceChat new_objc();

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
    @Selector("init")
    public native GKVoiceChat init();

    /**
     * make this session active and route the microphone
     */
    @Generated
    @Selector("isActive")
    public native boolean isActive();

    /**
     * make this session active and route the microphone
     */
    @Generated
    @Selector("setActive:")
    public native void setActive(boolean value);

    /**
     * name the chat was created with
     */
    @Generated
    @Selector("name")
    public native String name();

    /**
     * This property is obsolete. **
     */
    @Generated
    @Deprecated
    @Selector("playerIDs")
    public native NSArray<String> playerIDs();

    @Generated
    @Deprecated
    @Selector("playerStateUpdateHandler")
    @ObjCBlock(name = "call_playerStateUpdateHandler_ret")
    public native Block_playerStateUpdateHandler_ret playerStateUpdateHandler();

    @Generated
    @Selector("playerVoiceChatStateDidChangeHandler")
    @ObjCBlock(name = "call_playerVoiceChatStateDidChangeHandler_ret")
    public native Block_playerVoiceChatStateDidChangeHandler_ret playerVoiceChatStateDidChangeHandler();

    /**
     * array of GKPlayer *
     */
    @Generated
    @Selector("players")
    public native NSArray<? extends GKPlayer> players();

    /**
     * This method is obsolete. It will never be invoked and its implementation does nothing**
     */
    @Generated
    @Deprecated
    @Selector("setMute:forPlayer:")
    public native void setMuteForPlayer(boolean isMuted, String playerID);

    /**
     * stop receiving audio from the chat
     */
    @Generated
    @Selector("setPlayer:muted:")
    public native void setPlayerMuted(GKPlayer player, boolean isMuted);

    @Generated
    @Deprecated
    @Selector("setPlayerStateUpdateHandler:")
    public native void setPlayerStateUpdateHandler(
            @ObjCBlock(name = "call_setPlayerStateUpdateHandler") Block_setPlayerStateUpdateHandler value);

    @Generated
    @Selector("setPlayerVoiceChatStateDidChangeHandler:")
    public native void setPlayerVoiceChatStateDidChangeHandler(
            @ObjCBlock(name = "call_setPlayerVoiceChatStateDidChangeHandler") Block_setPlayerVoiceChatStateDidChangeHandler value);

    /**
     * default 1.0 (max is 1.0, min is 0.0)
     */
    @Generated
    @Selector("setVolume:")
    public native void setVolume(float value);

    @Generated
    @Selector("start")
    public native void start();

    /**
     * start receiving audio from the chat
     */
    @Generated
    @Selector("stop")
    public native void stop();

    /**
     * default 1.0 (max is 1.0, min is 0.0)
     */
    @Generated
    @Selector("volume")
    public native float volume();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_playerStateUpdateHandler_ret {
        @Generated
        void call_playerStateUpdateHandler_ret(String arg0, @NInt long arg1);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_playerVoiceChatStateDidChangeHandler_ret {
        @Generated
        void call_playerVoiceChatStateDidChangeHandler_ret(GKPlayer arg0, @NInt long arg1);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setPlayerStateUpdateHandler {
        @Generated
        void call_setPlayerStateUpdateHandler(String arg0, @NInt long arg1);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setPlayerVoiceChatStateDidChangeHandler {
        @Generated
        void call_setPlayerVoiceChatStateDidChangeHandler(GKPlayer arg0, @NInt long arg1);
    }
}

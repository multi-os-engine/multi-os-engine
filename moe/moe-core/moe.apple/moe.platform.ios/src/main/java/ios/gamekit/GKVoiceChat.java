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

package ios.gamekit;


import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;

import ios.NSObject;
import ios.foundation.NSArray;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.map.ObjCObjectMapper;
import ios.foundation.NSMethodSignature;
import ios.foundation.NSSet;

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
	@Owned
	@Selector("alloc")
	public static native GKVoiceChat alloc();

	@Generated
	@Selector("init")
	public native GKVoiceChat init();

	/**
	 * active</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameKit/Reference/GKVoiceChat_Ref/index.html#//apple_ref/occ/instp/GKVoiceChat/active">iOS Dev Center</a>
	 */
	@Generated
	@Selector("isActive")
	public native boolean isActive();

	/**
	 * isVoIPAllowed</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameKit/Reference/GKVoiceChat_Ref/index.html#//apple_ref/occ/clm/GKVoiceChat/isVoIPAllowed">iOS Dev Center</a>
	 */
	@Generated
	@Selector("isVoIPAllowed")
	public static native boolean isVoIPAllowed();

	/**
	 * name</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameKit/Reference/GKVoiceChat_Ref/index.html#//apple_ref/occ/instp/GKVoiceChat/name">iOS Dev Center</a>
	 */
	@Generated
	@Selector("name")
	public native String name();

	/**
	 * playerIDs</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameKit/Reference/GKVoiceChat_Ref/index.html#//apple_ref/occ/instp/GKVoiceChat/playerIDs">iOS Dev Center</a>
	 */
	@Generated
	@Deprecated
	@Selector("playerIDs")
	public native NSArray<String> playerIDs();

	/**
	 * players</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameKit/Reference/GKVoiceChat_Ref/index.html#//apple_ref/occ/instp/GKVoiceChat/players">iOS Dev Center</a>
	 */
	@Generated
	@Selector("players")
	public native NSArray<? extends GKPlayer> players();

	/**
	 * active</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameKit/Reference/GKVoiceChat_Ref/index.html#//apple_ref/occ/instp/GKVoiceChat/active">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setActive:")
	public native void setActive(boolean value);

	/**
	 * setMute:forPlayer:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameKit/Reference/GKVoiceChat_Ref/index.html#//apple_ref/occ/instm/GKVoiceChat/setMute:forPlayer:">iOS Dev Center</a>
	 */
	@Generated
	@Deprecated
	@Selector("setMute:forPlayer:")
	public native void setMuteForPlayer(boolean isMuted, String playerID);

	/**
	 * setPlayer:muted:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameKit/Reference/GKVoiceChat_Ref/index.html#//apple_ref/occ/instm/GKVoiceChat/setPlayer:muted:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setPlayer:muted:")
	public native void setPlayerMuted(GKPlayer player, boolean isMuted);

	/**
	 * playerStateUpdateHandler</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameKit/Reference/GKVoiceChat_Ref/index.html#//apple_ref/occ/instp/GKVoiceChat/playerStateUpdateHandler">iOS Dev Center</a>
	 */
	@Generated
	@Deprecated
	@Selector("setPlayerStateUpdateHandler:")
	public native void setPlayerStateUpdateHandler(
			@ObjCBlock(name = "call_setPlayerStateUpdateHandler") Block_setPlayerStateUpdateHandler value);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_setPlayerStateUpdateHandler {
		@Generated
		void call_setPlayerStateUpdateHandler(String arg0,
				@NInt long arg1);
	}

	/**
	 * playerVoiceChatStateDidChangeHandler</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameKit/Reference/GKVoiceChat_Ref/index.html#//apple_ref/occ/instp/GKVoiceChat/playerVoiceChatStateDidChangeHandler">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setPlayerVoiceChatStateDidChangeHandler:")
	public native void setPlayerVoiceChatStateDidChangeHandler(
			@ObjCBlock(name = "call_setPlayerVoiceChatStateDidChangeHandler") Block_setPlayerVoiceChatStateDidChangeHandler value);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_setPlayerVoiceChatStateDidChangeHandler {
		@Generated
		void call_setPlayerVoiceChatStateDidChangeHandler(GKPlayer arg0,
				@NInt long arg1);
	}

	/**
	 * volume</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameKit/Reference/GKVoiceChat_Ref/index.html#//apple_ref/occ/instp/GKVoiceChat/volume">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setVolume:")
	public native void setVolume(float value);

	/**
	 * start</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameKit/Reference/GKVoiceChat_Ref/index.html#//apple_ref/occ/instm/GKVoiceChat/start">iOS Dev Center</a>
	 */
	@Generated
	@Selector("start")
	public native void start();

	/**
	 * stop</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameKit/Reference/GKVoiceChat_Ref/index.html#//apple_ref/occ/instm/GKVoiceChat/stop">iOS Dev Center</a>
	 */
	@Generated
	@Selector("stop")
	public native void stop();

	/**
	 * volume</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameKit/Reference/GKVoiceChat_Ref/index.html#//apple_ref/occ/instp/GKVoiceChat/volume">iOS Dev Center</a>
	 */
	@Generated
	@Selector("volume")
	public native float volume();

	/**
	 * playerStateUpdateHandler</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameKit/Reference/GKVoiceChat_Ref/index.html#//apple_ref/occ/instp/GKVoiceChat/playerStateUpdateHandler">iOS Dev Center</a>
	 */
	@Generated
	@Deprecated
	@Selector("playerStateUpdateHandler")
	@ObjCBlock(name = "call_playerStateUpdateHandler_ret")
	public native Block_playerStateUpdateHandler_ret playerStateUpdateHandler();

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_playerStateUpdateHandler_ret {
		@Generated
		void call_playerStateUpdateHandler_ret(String arg0, @NInt long arg1);
	}

	/**
	 * playerVoiceChatStateDidChangeHandler</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameKit/Reference/GKVoiceChat_Ref/index.html#//apple_ref/occ/instp/GKVoiceChat/playerVoiceChatStateDidChangeHandler">iOS Dev Center</a>
	 */
	@Generated
	@Selector("playerVoiceChatStateDidChangeHandler")
	@ObjCBlock(name = "call_playerVoiceChatStateDidChangeHandler_ret")
	public native Block_playerVoiceChatStateDidChangeHandler_ret playerVoiceChatStateDidChangeHandler();

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_playerVoiceChatStateDidChangeHandler_ret {
		@Generated
		void call_playerVoiceChatStateDidChangeHandler_ret(GKPlayer arg0, @NInt long arg1);
	}

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
	public static native void cancelPreviousPerformRequestsWithTarget(
			@Mapped(ObjCObjectMapper.class) Object aTarget);

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
	public static native NSObject.Function_instanceMethodForSelector_ret instanceMethodForSelector(
			SEL aSelector);

	@Generated
	@Selector("instanceMethodSignatureForSelector:")
	public static native NSMethodSignature instanceMethodSignatureForSelector(
			SEL aSelector);

	@Generated
	@Selector("instancesRespondToSelector:")
	public static native boolean instancesRespondToSelector(SEL aSelector);

	@Generated
	@Selector("isSubclassOfClass:")
	public static native boolean isSubclassOfClass(Class aClass);

	@Generated
	@Selector("keyPathsForValuesAffectingValueForKey:")
	public static native NSSet<String> keyPathsForValuesAffectingValueForKey(
			String key);

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
	public static native void setVersion(@NInt long aVersion);

	@Generated
	@Selector("superclass")
	public static native Class superclass_static();

	@Generated
	@Selector("version")
	@NInt
	public static native long version_static();
}

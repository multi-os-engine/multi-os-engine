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
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;

import ios.NSObject;
import ios.foundation.NSArray;
import ios.foundation.NSError;
import ios.foundation.struct.NSRange;
import ios.uikit.UIImage;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
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
public class GKLeaderboard extends NSObject {
	static {
		NatJ.register();
	}

	@Generated
	protected GKLeaderboard(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native GKLeaderboard alloc();

	/**
	 * category</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameKit/Reference/GKLeaderboard_Ref/index.html#//apple_ref/occ/instp/GKLeaderboard/category">iOS Dev Center</a>
	 */
	@Generated
	@Deprecated
	@Selector("category")
	public native String category();

	/**
	 * groupIdentifier</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameKit/Reference/GKLeaderboard_Ref/index.html#//apple_ref/occ/instp/GKLeaderboard/groupIdentifier">iOS Dev Center</a>
	 */
	@Generated
	@Selector("groupIdentifier")
	public native String groupIdentifier();

	/**
	 * identifier</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameKit/Reference/GKLeaderboard_Ref/index.html#//apple_ref/occ/instp/GKLeaderboard/identifier">iOS Dev Center</a>
	 */
	@Generated
	@Selector("identifier")
	public native String identifier();

	/**
	 * init</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameKit/Reference/GKLeaderboard_Ref/index.html#//apple_ref/occ/instm/GKLeaderboard/init">iOS Dev Center</a>
	 */
	@Generated
	@Selector("init")
	public native GKLeaderboard init();

	/**
	 * initWithPlayerIDs:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameKit/Reference/GKLeaderboard_Ref/index.html#//apple_ref/occ/instm/GKLeaderboard/initWithPlayerIDs:">iOS Dev Center</a>
	 */
	@Generated
	@Deprecated
	@Selector("initWithPlayerIDs:")
	public native GKLeaderboard initWithPlayerIDs(NSArray<String> playerIDs);

	/**
	 * initWithPlayers:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameKit/Reference/GKLeaderboard_Ref/index.html#//apple_ref/occ/instm/GKLeaderboard/initWithPlayers:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("initWithPlayers:")
	public native GKLeaderboard initWithPlayers(NSArray<? extends GKPlayer> players);

	/**
	 * loading</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameKit/Reference/GKLeaderboard_Ref/index.html#//apple_ref/occ/instp/GKLeaderboard/loading">iOS Dev Center</a>
	 */
	@Generated
	@Selector("isLoading")
	public native boolean isLoading();

	/**
	 * loadCategoriesWithCompletionHandler:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameKit/Reference/GKLeaderboard_Ref/index.html#//apple_ref/occ/clm/GKLeaderboard/loadCategoriesWithCompletionHandler:">iOS Dev Center</a>
	 */
	@Generated
	@Deprecated
	@Selector("loadCategoriesWithCompletionHandler:")
	public static native void loadCategoriesWithCompletionHandler(
			@ObjCBlock(name = "call_loadCategoriesWithCompletionHandler") Block_loadCategoriesWithCompletionHandler completionHandler);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_loadCategoriesWithCompletionHandler {
		@Generated
		void call_loadCategoriesWithCompletionHandler(NSArray<String> arg0,
				NSArray<String> arg1, NSError arg2);
	}

	/**
	 * loadImageWithCompletionHandler:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameKit/Reference/GKLeaderboard_Ref/index.html#//apple_ref/occ/instm/GKLeaderboard/loadImageWithCompletionHandler:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("loadImageWithCompletionHandler:")
	public native void loadImageWithCompletionHandler(
			@ObjCBlock(name = "call_loadImageWithCompletionHandler") Block_loadImageWithCompletionHandler completionHandler);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_loadImageWithCompletionHandler {
		@Generated
		void call_loadImageWithCompletionHandler(UIImage arg0,
				NSError arg1);
	}

	/**
	 * loadLeaderboardsWithCompletionHandler:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameKit/Reference/GKLeaderboard_Ref/index.html#//apple_ref/occ/clm/GKLeaderboard/loadLeaderboardsWithCompletionHandler:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("loadLeaderboardsWithCompletionHandler:")
	public static native void loadLeaderboardsWithCompletionHandler(
			@ObjCBlock(name = "call_loadLeaderboardsWithCompletionHandler") Block_loadLeaderboardsWithCompletionHandler completionHandler);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_loadLeaderboardsWithCompletionHandler {
		@Generated
		void call_loadLeaderboardsWithCompletionHandler(NSArray<? extends GKLeaderboard> arg0,
				NSError arg1);
	}

	/**
	 * loadScoresWithCompletionHandler:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameKit/Reference/GKLeaderboard_Ref/index.html#//apple_ref/occ/instm/GKLeaderboard/loadScoresWithCompletionHandler:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("loadScoresWithCompletionHandler:")
	public native void loadScoresWithCompletionHandler(
			@ObjCBlock(name = "call_loadScoresWithCompletionHandler") Block_loadScoresWithCompletionHandler completionHandler);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_loadScoresWithCompletionHandler {
		@Generated
		void call_loadScoresWithCompletionHandler(NSArray<? extends GKScore> arg0,
				NSError arg1);
	}

	/**
	 * localPlayerScore</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameKit/Reference/GKLeaderboard_Ref/index.html#//apple_ref/occ/instp/GKLeaderboard/localPlayerScore">iOS Dev Center</a>
	 */
	@Generated
	@Selector("localPlayerScore")
	public native GKScore localPlayerScore();

	/**
	 * maxRange</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameKit/Reference/GKLeaderboard_Ref/index.html#//apple_ref/occ/instp/GKLeaderboard/maxRange">iOS Dev Center</a>
	 */
	@Generated
	@Selector("maxRange")
	@NUInt
	public native long maxRange();

	/**
	 * playerScope</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameKit/Reference/GKLeaderboard_Ref/index.html#//apple_ref/occ/instp/GKLeaderboard/playerScope">iOS Dev Center</a>
	 */
	@Generated
	@Selector("playerScope")
	@NInt
	public native long playerScope();

	/**
	 * range</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameKit/Reference/GKLeaderboard_Ref/index.html#//apple_ref/occ/instp/GKLeaderboard/range">iOS Dev Center</a>
	 */
	@Generated
	@Selector("range")
	@ByValue
	public native NSRange range();

	/**
	 * scores</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameKit/Reference/GKLeaderboard_Ref/index.html#//apple_ref/occ/instp/GKLeaderboard/scores">iOS Dev Center</a>
	 */
	@Generated
	@Selector("scores")
	public native NSArray<? extends GKScore> scores();

	/**
	 * category</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameKit/Reference/GKLeaderboard_Ref/index.html#//apple_ref/occ/instp/GKLeaderboard/category">iOS Dev Center</a>
	 */
	@Generated
	@Deprecated
	@Selector("setCategory:")
	public native void setCategory(String value);

	/**
	 * setDefaultLeaderboard:withCompletionHandler:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameKit/Reference/GKLeaderboard_Ref/index.html#//apple_ref/occ/clm/GKLeaderboard/setDefaultLeaderboard:withCompletionHandler:">iOS Dev Center</a>
	 */
	@Generated
	@Deprecated
	@Selector("setDefaultLeaderboard:withCompletionHandler:")
	public static native void setDefaultLeaderboardWithCompletionHandler(
			String leaderboardIdentifier,
			@ObjCBlock(name = "call_setDefaultLeaderboardWithCompletionHandler") Block_setDefaultLeaderboardWithCompletionHandler completionHandler);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_setDefaultLeaderboardWithCompletionHandler {
		@Generated
		void call_setDefaultLeaderboardWithCompletionHandler(NSError arg0);
	}

	/**
	 * identifier</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameKit/Reference/GKLeaderboard_Ref/index.html#//apple_ref/occ/instp/GKLeaderboard/identifier">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setIdentifier:")
	public native void setIdentifier(String value);

	/**
	 * playerScope</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameKit/Reference/GKLeaderboard_Ref/index.html#//apple_ref/occ/instp/GKLeaderboard/playerScope">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setPlayerScope:")
	public native void setPlayerScope(@NInt long value);

	/**
	 * range</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameKit/Reference/GKLeaderboard_Ref/index.html#//apple_ref/occ/instp/GKLeaderboard/range">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setRange:")
	public native void setRange(@ByValue NSRange value);

	/**
	 * timeScope</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameKit/Reference/GKLeaderboard_Ref/index.html#//apple_ref/occ/instp/GKLeaderboard/timeScope">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setTimeScope:")
	public native void setTimeScope(@NInt long value);

	/**
	 * timeScope</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameKit/Reference/GKLeaderboard_Ref/index.html#//apple_ref/occ/instp/GKLeaderboard/timeScope">iOS Dev Center</a>
	 */
	@Generated
	@Selector("timeScope")
	@NInt
	public native long timeScope();

	/**
	 * title</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameKit/Reference/GKLeaderboard_Ref/index.html#//apple_ref/occ/instp/GKLeaderboard/title">iOS Dev Center</a>
	 */
	@Generated
	@Selector("title")
	public native String title();

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

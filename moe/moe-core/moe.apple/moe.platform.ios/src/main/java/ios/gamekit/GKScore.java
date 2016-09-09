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
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;

import ios.NSObject;
import ios.foundation.NSArray;
import ios.foundation.NSCoder;
import ios.foundation.NSDate;
import ios.foundation.NSError;
import ios.foundation.protocol.NSCoding;
import ios.foundation.protocol.NSSecureCoding;
import ios.uikit.UIViewController;
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
public class GKScore extends NSObject implements NSCoding, NSSecureCoding {
	static {
		NatJ.register();
	}

	@Generated
	protected GKScore(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native GKScore alloc();

	/**
	 * category</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameKit/Reference/GKScore_Ref/index.html#//apple_ref/occ/instp/GKScore/category">iOS Dev Center</a>
	 */
	@Generated
	@Deprecated
	@Selector("category")
	public native String category();

	/**
	 * challengeComposeControllerWithMessage:players:completionHandler:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameKit/Reference/GKScore_Ref/index.html#//apple_ref/occ/instm/GKScore/challengeComposeControllerWithMessage:players:completionHandler:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("challengeComposeControllerWithMessage:players:completionHandler:")
	public native UIViewController challengeComposeControllerWithMessagePlayersCompletionHandler(
			String message,
			NSArray<? extends GKPlayer> players,
			@ObjCBlock(name = "call_challengeComposeControllerWithMessagePlayersCompletionHandler") Block_challengeComposeControllerWithMessagePlayersCompletionHandler completionHandler);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_challengeComposeControllerWithMessagePlayersCompletionHandler {
		@Generated
		void call_challengeComposeControllerWithMessagePlayersCompletionHandler(
				UIViewController arg0, boolean arg1, NSArray<String> arg2);
	}

	/**
	 * challengeComposeControllerWithPlayers:message:completionHandler:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameKit/Reference/GKScore_Ref/index.html#//apple_ref/occ/instm/GKScore/challengeComposeControllerWithPlayers:message:completionHandler:">iOS Dev Center</a>
	 */
	@Generated
	@Deprecated
	@Selector("challengeComposeControllerWithPlayers:message:completionHandler:")
	public native UIViewController challengeComposeControllerWithPlayersMessageCompletionHandler(
			NSArray<String> playerIDs,
			String message,
			@ObjCBlock(name = "call_challengeComposeControllerWithPlayersMessageCompletionHandler") Block_challengeComposeControllerWithPlayersMessageCompletionHandler completionHandler);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_challengeComposeControllerWithPlayersMessageCompletionHandler {
		@Generated
		void call_challengeComposeControllerWithPlayersMessageCompletionHandler(
				UIViewController arg0, boolean arg1, NSArray<String> arg2);
	}

	/**
	 * context</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameKit/Reference/GKScore_Ref/index.html#//apple_ref/occ/instp/GKScore/context">iOS Dev Center</a>
	 */
	@Generated
	@Selector("context")
	public native long context();

	/**
	 * date</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameKit/Reference/GKScore_Ref/index.html#//apple_ref/occ/instp/GKScore/date">iOS Dev Center</a>
	 */
	@Generated
	@Selector("date")
	public native NSDate date();

	@Generated
	@Selector("encodeWithCoder:")
	public native void encodeWithCoder(NSCoder aCoder);

	/**
	 * formattedValue</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameKit/Reference/GKScore_Ref/index.html#//apple_ref/occ/instp/GKScore/formattedValue">iOS Dev Center</a>
	 */
	@Generated
	@Selector("formattedValue")
	public native String formattedValue();

	@Generated
	@Selector("init")
	public native GKScore init();

	/**
	 * initWithCategory:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameKit/Reference/GKScore_Ref/index.html#//apple_ref/occ/instm/GKScore/initWithCategory:">iOS Dev Center</a>
	 */
	@Generated
	@Deprecated
	@Selector("initWithCategory:")
	public native GKScore initWithCategory(String category);

	@Generated
	@Selector("initWithCoder:")
	public native GKScore initWithCoder(NSCoder aDecoder);

	/**
	 * initWithLeaderboardIdentifier:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameKit/Reference/GKScore_Ref/index.html#//apple_ref/occ/instm/GKScore/initWithLeaderboardIdentifier:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("initWithLeaderboardIdentifier:")
	public native GKScore initWithLeaderboardIdentifier(String identifier);

	/**
	 * initWithLeaderboardIdentifier:forPlayer:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameKit/Reference/GKScore_Ref/index.html#//apple_ref/occ/instm/GKScore/initWithLeaderboardIdentifier:forPlayer:">iOS Dev Center</a>
	 */
	@Generated
	@Deprecated
	@Selector("initWithLeaderboardIdentifier:forPlayer:")
	public native GKScore initWithLeaderboardIdentifierForPlayer(
			String identifier, String playerID);

	/**
	 * initWithLeaderboardIdentifier:player:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameKit/Reference/GKScore_Ref/index.html#//apple_ref/occ/instm/GKScore/initWithLeaderboardIdentifier:player:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("initWithLeaderboardIdentifier:player:")
	public native GKScore initWithLeaderboardIdentifierPlayer(
			String identifier, GKPlayer player);

	/**
	 * issueChallengeToPlayers:message:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameKit/Reference/GKScore_Ref/index.html#//apple_ref/occ/instm/GKScore/issueChallengeToPlayers:message:">iOS Dev Center</a>
	 */
	@Generated
	@Deprecated
	@Selector("issueChallengeToPlayers:message:")
	public native void issueChallengeToPlayersMessage(NSArray<String> playerIDs,
			String message);

	/**
	 * leaderboardIdentifier</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameKit/Reference/GKScore_Ref/index.html#//apple_ref/occ/instp/GKScore/leaderboardIdentifier">iOS Dev Center</a>
	 */
	@Generated
	@Selector("leaderboardIdentifier")
	public native String leaderboardIdentifier();

	/**
	 * player</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameKit/Reference/GKScore_Ref/index.html#//apple_ref/occ/instp/GKScore/player">iOS Dev Center</a>
	 */
	@Generated
	@Selector("player")
	public native GKPlayer player();

	/**
	 * playerID</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameKit/Reference/GKScore_Ref/index.html#//apple_ref/occ/instp/GKScore/playerID">iOS Dev Center</a>
	 */
	@Generated
	@Deprecated
	@Selector("playerID")
	public native String playerID();

	/**
	 * rank</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameKit/Reference/GKScore_Ref/index.html#//apple_ref/occ/instp/GKScore/rank">iOS Dev Center</a>
	 */
	@Generated
	@Selector("rank")
	@NInt
	public native long rank();

	/**
	 * reportScoreWithCompletionHandler:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameKit/Reference/GKScore_Ref/index.html#//apple_ref/occ/instm/GKScore/reportScoreWithCompletionHandler:">iOS Dev Center</a>
	 */
	@Generated
	@Deprecated
	@Selector("reportScoreWithCompletionHandler:")
	public native void reportScoreWithCompletionHandler(
			@ObjCBlock(name = "call_reportScoreWithCompletionHandler") Block_reportScoreWithCompletionHandler completionHandler);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_reportScoreWithCompletionHandler {
		@Generated
		void call_reportScoreWithCompletionHandler(NSError arg0);
	}

	/**
	 * reportScores:withCompletionHandler:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameKit/Reference/GKScore_Ref/index.html#//apple_ref/occ/clm/GKScore/reportScores:withCompletionHandler:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("reportScores:withCompletionHandler:")
	public static native void reportScoresWithCompletionHandler(
			NSArray<? extends GKScore> scores,
			@ObjCBlock(name = "call_reportScoresWithCompletionHandler") Block_reportScoresWithCompletionHandler completionHandler);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_reportScoresWithCompletionHandler {
		@Generated
		void call_reportScoresWithCompletionHandler(NSError arg0);
	}

	/**
	 * reportScores:withEligibleChallenges:withCompletionHandler:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameKit/Reference/GKScore_Ref/index.html#//apple_ref/occ/clm/GKScore/reportScores:withEligibleChallenges:withCompletionHandler:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("reportScores:withEligibleChallenges:withCompletionHandler:")
	public static native void reportScoresWithEligibleChallengesWithCompletionHandler(
			NSArray<? extends GKScore> scores,
			NSArray<? extends GKChallenge> challenges,
			@ObjCBlock(name = "call_reportScoresWithEligibleChallengesWithCompletionHandler") Block_reportScoresWithEligibleChallengesWithCompletionHandler completionHandler);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_reportScoresWithEligibleChallengesWithCompletionHandler {
		@Generated
		void call_reportScoresWithEligibleChallengesWithCompletionHandler(
				NSError arg0);
	}

	/**
	 * category</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameKit/Reference/GKScore_Ref/index.html#//apple_ref/occ/instp/GKScore/category">iOS Dev Center</a>
	 */
	@Generated
	@Deprecated
	@Selector("setCategory:")
	public native void setCategory(String value);

	/**
	 * context</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameKit/Reference/GKScore_Ref/index.html#//apple_ref/occ/instp/GKScore/context">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setContext:")
	public native void setContext(long value);

	/**
	 * leaderboardIdentifier</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameKit/Reference/GKScore_Ref/index.html#//apple_ref/occ/instp/GKScore/leaderboardIdentifier">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setLeaderboardIdentifier:")
	public native void setLeaderboardIdentifier(String value);

	/**
	 * shouldSetDefaultLeaderboard</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameKit/Reference/GKScore_Ref/index.html#//apple_ref/occ/instp/GKScore/shouldSetDefaultLeaderboard">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setShouldSetDefaultLeaderboard:")
	public native void setShouldSetDefaultLeaderboard(boolean value);

	/**
	 * value</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameKit/Reference/GKScore_Ref/index.html#//apple_ref/occ/instp/GKScore/value">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setValue:")
	public native void setValue(long value);

	/**
	 * shouldSetDefaultLeaderboard</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameKit/Reference/GKScore_Ref/index.html#//apple_ref/occ/instp/GKScore/shouldSetDefaultLeaderboard">iOS Dev Center</a>
	 */
	@Generated
	@Selector("shouldSetDefaultLeaderboard")
	public native boolean shouldSetDefaultLeaderboard();

	@Generated
	@Selector("supportsSecureCoding")
	public static native boolean supportsSecureCoding();

	@Generated
	@ProtocolClassMethod("supportsSecureCoding")
	public boolean _supportsSecureCoding() {
		return supportsSecureCoding();
	}

	/**
	 * value</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameKit/Reference/GKScore_Ref/index.html#//apple_ref/occ/instp/GKScore/value">iOS Dev Center</a>
	 */
	@Generated
	@Selector("value")
	public native long value();

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
	public static native void setVersion_static(@NInt long aVersion);

	@Generated
	@Selector("superclass")
	public static native Class superclass_static();

	@Generated
	@Selector("version")
	@NInt
	public static native long version_static();
}

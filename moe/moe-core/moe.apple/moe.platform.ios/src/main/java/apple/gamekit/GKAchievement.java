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
import apple.foundation.NSCoder;
import apple.foundation.NSDate;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSCoding;
import apple.foundation.protocol.NSSecureCoding;
import apple.uikit.UIViewController;
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
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * GKAchievement represents a game achievement that the player has started or completely achieved.
 */
@Generated
@Library("GameKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class GKAchievement extends NSObject implements NSCoding, NSSecureCoding {
    static {
        NatJ.register();
    }

    @Generated
    protected GKAchievement(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native GKAchievement alloc();

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

    /**
     * Asynchronously load all achievements for the local player
     */
    @Generated
    @Selector("loadAchievementsWithCompletionHandler:")
    public static native void loadAchievementsWithCompletionHandler(
            @ObjCBlock(name = "call_loadAchievementsWithCompletionHandler") Block_loadAchievementsWithCompletionHandler completionHandler);

    @Generated
    @Owned
    @Selector("new")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object new_objc();

    /**
     * Report an array of achievements to the server. Percent complete is required. Points, completed state are set based on percentComplete. isHidden is set to NO anytime this method is invoked. Date is optional. Error will be nil on success.
     * Possible reasons for error:
     * 1. Local player not authenticated
     * 2. Communications failure
     * 3. Reported Achievement does not exist
     */
    @Generated
    @Selector("reportAchievements:withCompletionHandler:")
    public static native void reportAchievementsWithCompletionHandler(NSArray<? extends GKAchievement> achievements,
            @ObjCBlock(name = "call_reportAchievementsWithCompletionHandler") Block_reportAchievementsWithCompletionHandler completionHandler);

    /**
     * Use this alternative to reportAchievements:withCompletionHandler: to allow only certain specific challenges to be completed. Pass nil to avoid completing any challenges.
     */
    @Generated
    @Selector("reportAchievements:withEligibleChallenges:withCompletionHandler:")
    public static native void reportAchievementsWithEligibleChallengesWithCompletionHandler(
            NSArray<? extends GKAchievement> achievements, NSArray<? extends GKChallenge> challenges,
            @ObjCBlock(name = "call_reportAchievementsWithEligibleChallengesWithCompletionHandler") Block_reportAchievementsWithEligibleChallengesWithCompletionHandler completionHandler);

    /**
     * Reset the achievements progress for the local player. All the entries for the local player are removed from the server. Error will be nil on success.
     * Possible reasons for error:
     * 1. Local player not authenticated
     * 2. Communications failure
     */
    @Generated
    @Selector("resetAchievementsWithCompletionHandler:")
    public static native void resetAchievementsWithCompletionHandler(
            @ObjCBlock(name = "call_resetAchievementsWithCompletionHandler") Block_resetAchievementsWithCompletionHandler completionHandler);

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

    @Generated
    @Selector("challengeComposeControllerWithMessage:players:completionHandler:")
    public native UIViewController challengeComposeControllerWithMessagePlayersCompletionHandler(String message,
            NSArray<? extends GKPlayer> players,
            @ObjCBlock(name = "call_challengeComposeControllerWithMessagePlayersCompletionHandler") Block_challengeComposeControllerWithMessagePlayersCompletionHandler completionHandler);

    /**
     * rb= GameKit.unavailableForTVOS
     */
    @Generated
    @Deprecated
    @Selector("challengeComposeControllerWithPlayers:message:completionHandler:")
    public native UIViewController challengeComposeControllerWithPlayersMessageCompletionHandler(
            NSArray<String> playerIDs, String message,
            @ObjCBlock(name = "call_challengeComposeControllerWithPlayersMessageCompletionHandler") Block_challengeComposeControllerWithPlayersMessageCompletionHandler completionHandler);

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(NSCoder coder);

    /**
     * Achievement identifier
     */
    @Generated
    @Selector("identifier")
    public native String identifier();

    @Generated
    @Selector("init")
    public native GKAchievement init();

    @Generated
    @Selector("initWithCoder:")
    public native GKAchievement initWithCoder(NSCoder coder);

    /**
     * Designated initializer
     */
    @Generated
    @Selector("initWithIdentifier:")
    public native GKAchievement initWithIdentifier(String identifier);

    /**
     * This method is obsolete. Calling this initialiser does nothing and will return nil **
     */
    @Generated
    @Deprecated
    @Selector("initWithIdentifier:forPlayer:")
    public native GKAchievement initWithIdentifierForPlayer(String identifier, String playerID);

    /**
     * Initialize the achievement for a specific player. Use to submit participant achievements when ending a turn-based match.
     */
    @Generated
    @Selector("initWithIdentifier:player:")
    public native GKAchievement initWithIdentifierPlayer(String identifier, GKPlayer player);

    /**
     * Set to NO until percentComplete = 100.
     */
    @Generated
    @Selector("isCompleted")
    public native boolean isCompleted();

    @Generated
    @Deprecated
    @Selector("isHidden")
    public native boolean isHidden();

    /**
     * This method is obsolete. It will never be invoked and its implementation does nothing**
     */
    @Generated
    @Deprecated
    @Selector("issueChallengeToPlayers:message:")
    public native void issueChallengeToPlayersMessage(NSArray<String> playerIDs, String message);

    /**
     * Date the achievement was last reported. Read-only. Created at initialization
     */
    @Generated
    @Selector("lastReportedDate")
    public native NSDate lastReportedDate();

    /**
     * Required, Percentage of achievement complete.
     */
    @Generated
    @Selector("percentComplete")
    public native double percentComplete();

    /**
     * The identifier of the player that earned the achievement.
     */
    @Generated
    @Selector("player")
    public native GKPlayer player();

    /**
     * This property is obsolete. **
     */
    @Generated
    @Deprecated
    @Selector("playerID")
    public native String playerID();

    @Generated
    @Deprecated
    @Selector("reportAchievementWithCompletionHandler:")
    public native void reportAchievementWithCompletionHandler(
            @ObjCBlock(name = "call_reportAchievementWithCompletionHandler") Block_reportAchievementWithCompletionHandler completionHandler);

    /**
     * This method is obsolete. It will never be invoked and its implementation does nothing**
     */
    @Generated
    @Deprecated
    @Selector("selectChallengeablePlayerIDs:withCompletionHandler:")
    public native void selectChallengeablePlayerIDsWithCompletionHandler(NSArray<String> playerIDs,
            @ObjCBlock(name = "call_selectChallengeablePlayerIDsWithCompletionHandler") Block_selectChallengeablePlayerIDsWithCompletionHandler completionHandler);

    /**
     * Given a list of players, return a subset of that list containing only players that are eligible to receive a challenge for the achievement.
     */
    @Generated
    @Selector("selectChallengeablePlayers:withCompletionHandler:")
    public native void selectChallengeablePlayersWithCompletionHandler(NSArray<? extends GKPlayer> players,
            @ObjCBlock(name = "call_selectChallengeablePlayersWithCompletionHandler") Block_selectChallengeablePlayersWithCompletionHandler completionHandler);

    /**
     * Achievement identifier
     */
    @Generated
    @Selector("setIdentifier:")
    public native void setIdentifier(String value);

    /**
     * Required, Percentage of achievement complete.
     */
    @Generated
    @Selector("setPercentComplete:")
    public native void setPercentComplete(double value);

    /**
     * A banner will be momentarily displayed after reporting a completed achievement
     */
    @Generated
    @Selector("setShowsCompletionBanner:")
    public native void setShowsCompletionBanner(boolean value);

    /**
     * A banner will be momentarily displayed after reporting a completed achievement
     */
    @Generated
    @Selector("showsCompletionBanner")
    public native boolean showsCompletionBanner();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_challengeComposeControllerWithMessagePlayersCompletionHandler {
        @Generated
        void call_challengeComposeControllerWithMessagePlayersCompletionHandler(UIViewController composeController,
                boolean didIssueChallenge, NSArray<String> sentPlayerIDs);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_challengeComposeControllerWithPlayersMessageCompletionHandler {
        @Generated
        void call_challengeComposeControllerWithPlayersMessageCompletionHandler(UIViewController composeController,
                boolean didIssueChallenge, NSArray<String> sentPlayerIDs);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_loadAchievementsWithCompletionHandler {
        @Generated
        void call_loadAchievementsWithCompletionHandler(NSArray<? extends GKAchievement> achievements, NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_reportAchievementWithCompletionHandler {
        @Generated
        void call_reportAchievementWithCompletionHandler(NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_reportAchievementsWithCompletionHandler {
        @Generated
        void call_reportAchievementsWithCompletionHandler(NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_reportAchievementsWithEligibleChallengesWithCompletionHandler {
        @Generated
        void call_reportAchievementsWithEligibleChallengesWithCompletionHandler(NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resetAchievementsWithCompletionHandler {
        @Generated
        void call_resetAchievementsWithCompletionHandler(NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_selectChallengeablePlayerIDsWithCompletionHandler {
        @Generated
        void call_selectChallengeablePlayerIDsWithCompletionHandler(NSArray<String> challengeablePlayerIDs,
                NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_selectChallengeablePlayersWithCompletionHandler {
        @Generated
        void call_selectChallengeablePlayersWithCompletionHandler(NSArray<? extends GKPlayer> challengeablePlayers,
                NSError error);
    }
}

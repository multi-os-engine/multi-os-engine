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
    @Owned
    @Selector("alloc")
    public static native GKAchievement alloc();

    @Generated
    @Selector("loadAchievementsWithCompletionHandler:")
    public static native void loadAchievementsWithCompletionHandler(
            @ObjCBlock(name = "call_loadAchievementsWithCompletionHandler") Block_loadAchievementsWithCompletionHandler completionHandler);

    @Generated
    @Selector("reportAchievements:withCompletionHandler:")
    public static native void reportAchievementsWithCompletionHandler(NSArray<? extends GKAchievement> achievements,
            @ObjCBlock(name = "call_reportAchievementsWithCompletionHandler") Block_reportAchievementsWithCompletionHandler completionHandler);

    @Generated
    @Selector("reportAchievements:withEligibleChallenges:withCompletionHandler:")
    public static native void reportAchievementsWithEligibleChallengesWithCompletionHandler(
            NSArray<? extends GKAchievement> achievements, NSArray<? extends GKChallenge> challenges,
            @ObjCBlock(name = "call_reportAchievementsWithEligibleChallengesWithCompletionHandler") Block_reportAchievementsWithEligibleChallengesWithCompletionHandler completionHandler);

    @Generated
    @Selector("resetAchievementsWithCompletionHandler:")
    public static native void resetAchievementsWithCompletionHandler(
            @ObjCBlock(name = "call_resetAchievementsWithCompletionHandler") Block_resetAchievementsWithCompletionHandler completionHandler);

    @Generated
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

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
    @Selector("initialize")
    public static native void initialize();

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

    @Generated
    @Selector("challengeComposeControllerWithMessage:players:completionHandler:")
    public native UIViewController challengeComposeControllerWithMessagePlayersCompletionHandler(String message,
            NSArray<? extends GKPlayer> players,
            @ObjCBlock(name = "call_challengeComposeControllerWithMessagePlayersCompletionHandler") Block_challengeComposeControllerWithMessagePlayersCompletionHandler completionHandler);

    @Generated
    @Deprecated
    @Selector("challengeComposeControllerWithPlayers:message:completionHandler:")
    public native UIViewController challengeComposeControllerWithPlayersMessageCompletionHandler(
            NSArray<String> playerIDs, String message,
            @ObjCBlock(name = "call_challengeComposeControllerWithPlayersMessageCompletionHandler") Block_challengeComposeControllerWithPlayersMessageCompletionHandler completionHandler);

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(NSCoder aCoder);

    @Generated
    @Selector("identifier")
    public native String identifier();

    @Generated
    @Selector("init")
    public native GKAchievement init();

    @Generated
    @Selector("initWithCoder:")
    public native GKAchievement initWithCoder(NSCoder aDecoder);

    @Generated
    @Selector("initWithIdentifier:")
    public native GKAchievement initWithIdentifier(String identifier);

    @Generated
    @Deprecated
    @Selector("initWithIdentifier:forPlayer:")
    public native GKAchievement initWithIdentifierForPlayer(String identifier, String playerID);

    @Generated
    @Selector("initWithIdentifier:player:")
    public native GKAchievement initWithIdentifierPlayer(String identifier, GKPlayer player);

    @Generated
    @Selector("isCompleted")
    public native boolean isCompleted();

    @Generated
    @Deprecated
    @Selector("isHidden")
    public native boolean isHidden();

    @Generated
    @Deprecated
    @Selector("issueChallengeToPlayers:message:")
    public native void issueChallengeToPlayersMessage(NSArray<String> playerIDs, String message);

    @Generated
    @Selector("lastReportedDate")
    public native NSDate lastReportedDate();

    @Generated
    @Selector("percentComplete")
    public native double percentComplete();

    @Generated
    @Selector("player")
    public native GKPlayer player();

    @Generated
    @Deprecated
    @Selector("playerID")
    public native String playerID();

    @Generated
    @Deprecated
    @Selector("reportAchievementWithCompletionHandler:")
    public native void reportAchievementWithCompletionHandler(
            @ObjCBlock(name = "call_reportAchievementWithCompletionHandler") Block_reportAchievementWithCompletionHandler completionHandler);

    @Generated
    @Deprecated
    @Selector("selectChallengeablePlayerIDs:withCompletionHandler:")
    public native void selectChallengeablePlayerIDsWithCompletionHandler(NSArray<String> playerIDs,
            @ObjCBlock(name = "call_selectChallengeablePlayerIDsWithCompletionHandler") Block_selectChallengeablePlayerIDsWithCompletionHandler completionHandler);

    @Generated
    @Selector("selectChallengeablePlayers:withCompletionHandler:")
    public native void selectChallengeablePlayersWithCompletionHandler(NSArray<? extends GKPlayer> players,
            @ObjCBlock(name = "call_selectChallengeablePlayersWithCompletionHandler") Block_selectChallengeablePlayersWithCompletionHandler completionHandler);

    @Generated
    @Selector("setIdentifier:")
    public native void setIdentifier(String value);

    @Generated
    @Selector("setPercentComplete:")
    public native void setPercentComplete(double value);

    @Generated
    @Selector("setShowsCompletionBanner:")
    public native void setShowsCompletionBanner(boolean value);

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
        void call_challengeComposeControllerWithMessagePlayersCompletionHandler(UIViewController arg0, boolean arg1,
                NSArray<String> arg2);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_challengeComposeControllerWithPlayersMessageCompletionHandler {
        @Generated
        void call_challengeComposeControllerWithPlayersMessageCompletionHandler(UIViewController arg0, boolean arg1,
                NSArray<String> arg2);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_loadAchievementsWithCompletionHandler {
        @Generated
        void call_loadAchievementsWithCompletionHandler(NSArray<? extends GKAchievement> arg0, NSError arg1);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_reportAchievementWithCompletionHandler {
        @Generated
        void call_reportAchievementWithCompletionHandler(NSError arg0);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_reportAchievementsWithCompletionHandler {
        @Generated
        void call_reportAchievementsWithCompletionHandler(NSError arg0);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_reportAchievementsWithEligibleChallengesWithCompletionHandler {
        @Generated
        void call_reportAchievementsWithEligibleChallengesWithCompletionHandler(NSError arg0);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resetAchievementsWithCompletionHandler {
        @Generated
        void call_resetAchievementsWithCompletionHandler(NSError arg0);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_selectChallengeablePlayerIDsWithCompletionHandler {
        @Generated
        void call_selectChallengeablePlayerIDsWithCompletionHandler(NSArray<String> arg0, NSError arg1);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_selectChallengeablePlayersWithCompletionHandler {
        @Generated
        void call_selectChallengeablePlayersWithCompletionHandler(NSArray<? extends GKPlayer> arg0, NSError arg1);
    }
}

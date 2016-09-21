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
public class GKScore extends NSObject implements NSCoding, NSSecureCoding {
    static {
        NatJ.register();
    }

    @Generated
    protected GKScore(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native GKScore alloc();

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
    @Selector("reportScores:withCompletionHandler:")
    public static native void reportScoresWithCompletionHandler(NSArray<? extends GKScore> scores,
            @ObjCBlock(name = "call_reportScoresWithCompletionHandler") Block_reportScoresWithCompletionHandler completionHandler);

    @Generated
    @Selector("reportScores:withEligibleChallenges:withCompletionHandler:")
    public static native void reportScoresWithEligibleChallengesWithCompletionHandler(NSArray<? extends GKScore> scores,
            NSArray<? extends GKChallenge> challenges,
            @ObjCBlock(name = "call_reportScoresWithEligibleChallengesWithCompletionHandler") Block_reportScoresWithEligibleChallengesWithCompletionHandler completionHandler);

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
    @Deprecated
    @Selector("category")
    public native String category();

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
    @Selector("context")
    public native long context();

    @Generated
    @Selector("date")
    public native NSDate date();

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(NSCoder aCoder);

    @Generated
    @Selector("formattedValue")
    public native String formattedValue();

    @Generated
    @Selector("init")
    public native GKScore init();

    @Generated
    @Deprecated
    @Selector("initWithCategory:")
    public native GKScore initWithCategory(String category);

    @Generated
    @Selector("initWithCoder:")
    public native GKScore initWithCoder(NSCoder aDecoder);

    @Generated
    @Selector("initWithLeaderboardIdentifier:")
    public native GKScore initWithLeaderboardIdentifier(String identifier);

    @Generated
    @Deprecated
    @Selector("initWithLeaderboardIdentifier:forPlayer:")
    public native GKScore initWithLeaderboardIdentifierForPlayer(String identifier, String playerID);

    @Generated
    @Selector("initWithLeaderboardIdentifier:player:")
    public native GKScore initWithLeaderboardIdentifierPlayer(String identifier, GKPlayer player);

    @Generated
    @Deprecated
    @Selector("issueChallengeToPlayers:message:")
    public native void issueChallengeToPlayersMessage(NSArray<String> playerIDs, String message);

    @Generated
    @Selector("leaderboardIdentifier")
    public native String leaderboardIdentifier();

    @Generated
    @Selector("player")
    public native GKPlayer player();

    @Generated
    @Deprecated
    @Selector("playerID")
    public native String playerID();

    @Generated
    @Selector("rank")
    @NInt
    public native long rank();

    @Generated
    @Deprecated
    @Selector("reportScoreWithCompletionHandler:")
    public native void reportScoreWithCompletionHandler(
            @ObjCBlock(name = "call_reportScoreWithCompletionHandler") Block_reportScoreWithCompletionHandler completionHandler);

    @Generated
    @Deprecated
    @Selector("setCategory:")
    public native void setCategory(String value);

    @Generated
    @Selector("setContext:")
    public native void setContext(long value);

    @Generated
    @Selector("setLeaderboardIdentifier:")
    public native void setLeaderboardIdentifier(String value);

    @Generated
    @Selector("setShouldSetDefaultLeaderboard:")
    public native void setShouldSetDefaultLeaderboard(boolean value);

    @Generated
    @Selector("setValue:")
    public native void setValue(long value);

    @Generated
    @Selector("shouldSetDefaultLeaderboard")
    public native boolean shouldSetDefaultLeaderboard();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    @Generated
    @Selector("value")
    public native long value();

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
    public interface Block_reportScoreWithCompletionHandler {
        @Generated
        void call_reportScoreWithCompletionHandler(NSError arg0);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_reportScoresWithCompletionHandler {
        @Generated
        void call_reportScoresWithCompletionHandler(NSError arg0);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_reportScoresWithEligibleChallengesWithCompletionHandler {
        @Generated
        void call_reportScoresWithEligibleChallengesWithCompletionHandler(NSError arg0);
    }
}

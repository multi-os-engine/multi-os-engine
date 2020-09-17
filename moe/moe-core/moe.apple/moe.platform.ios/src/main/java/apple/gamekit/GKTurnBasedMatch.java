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
import apple.foundation.NSData;
import apple.foundation.NSDate;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
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
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("GameKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class GKTurnBasedMatch extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected GKTurnBasedMatch(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native GKTurnBasedMatch alloc();

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
    @Selector("findMatchForRequest:withCompletionHandler:")
    public static native void findMatchForRequestWithCompletionHandler(GKMatchRequest request,
            @ObjCBlock(name = "call_findMatchForRequestWithCompletionHandler") Block_findMatchForRequestWithCompletionHandler completionHandler);

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
    @Selector("loadMatchWithID:withCompletionHandler:")
    public static native void loadMatchWithIDWithCompletionHandler(String matchID,
            @ObjCBlock(name = "call_loadMatchWithIDWithCompletionHandler") Block_loadMatchWithIDWithCompletionHandler completionHandler);

    @Generated
    @Selector("loadMatchesWithCompletionHandler:")
    public static native void loadMatchesWithCompletionHandler(
            @ObjCBlock(name = "call_loadMatchesWithCompletionHandler") Block_loadMatchesWithCompletionHandler completionHandler);

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
    @Selector("acceptInviteWithCompletionHandler:")
    public native void acceptInviteWithCompletionHandler(
            @ObjCBlock(name = "call_acceptInviteWithCompletionHandler") Block_acceptInviteWithCompletionHandler completionHandler);

    @Generated
    @Selector("activeExchanges")
    public native NSArray<? extends GKTurnBasedExchange> activeExchanges();

    @Generated
    @Selector("completedExchanges")
    public native NSArray<? extends GKTurnBasedExchange> completedExchanges();

    @Generated
    @Selector("creationDate")
    public native NSDate creationDate();

    @Generated
    @Selector("currentParticipant")
    public native GKTurnBasedParticipant currentParticipant();

    @Generated
    @Selector("declineInviteWithCompletionHandler:")
    public native void declineInviteWithCompletionHandler(
            @ObjCBlock(name = "call_declineInviteWithCompletionHandler") Block_declineInviteWithCompletionHandler completionHandler);

    @Generated
    @Selector("endMatchInTurnWithMatchData:completionHandler:")
    public native void endMatchInTurnWithMatchDataCompletionHandler(NSData matchData,
            @ObjCBlock(name = "call_endMatchInTurnWithMatchDataCompletionHandler") Block_endMatchInTurnWithMatchDataCompletionHandler completionHandler);

    @Generated
    @Selector("endMatchInTurnWithMatchData:scores:achievements:completionHandler:")
    public native void endMatchInTurnWithMatchDataScoresAchievementsCompletionHandler(NSData matchData,
            NSArray<? extends GKScore> scores, NSArray<? extends GKAchievement> achievements,
            @ObjCBlock(name = "call_endMatchInTurnWithMatchDataScoresAchievementsCompletionHandler") Block_endMatchInTurnWithMatchDataScoresAchievementsCompletionHandler completionHandler);

    @Generated
    @Deprecated
    @Selector("endTurnWithNextParticipant:matchData:completionHandler:")
    public native void endTurnWithNextParticipantMatchDataCompletionHandler(GKTurnBasedParticipant nextParticipant,
            NSData matchData,
            @ObjCBlock(name = "call_endTurnWithNextParticipantMatchDataCompletionHandler") Block_endTurnWithNextParticipantMatchDataCompletionHandler completionHandler);

    @Generated
    @Selector("endTurnWithNextParticipants:turnTimeout:matchData:completionHandler:")
    public native void endTurnWithNextParticipantsTurnTimeoutMatchDataCompletionHandler(
            NSArray<? extends GKTurnBasedParticipant> nextParticipants, double timeout, NSData matchData,
            @ObjCBlock(name = "call_endTurnWithNextParticipantsTurnTimeoutMatchDataCompletionHandler") Block_endTurnWithNextParticipantsTurnTimeoutMatchDataCompletionHandler completionHandler);

    @Generated
    @Selector("exchangeDataMaximumSize")
    @NUInt
    public native long exchangeDataMaximumSize();

    @Generated
    @Selector("exchangeMaxInitiatedExchangesPerPlayer")
    @NUInt
    public native long exchangeMaxInitiatedExchangesPerPlayer();

    @Generated
    @Selector("exchanges")
    public native NSArray<? extends GKTurnBasedExchange> exchanges();

    @Generated
    @Selector("init")
    public native GKTurnBasedMatch init();

    @Generated
    @Selector("loadMatchDataWithCompletionHandler:")
    public native void loadMatchDataWithCompletionHandler(
            @ObjCBlock(name = "call_loadMatchDataWithCompletionHandler") Block_loadMatchDataWithCompletionHandler completionHandler);

    @Generated
    @Selector("matchData")
    public native NSData matchData();

    @Generated
    @Selector("matchDataMaximumSize")
    @NUInt
    public native long matchDataMaximumSize();

    @Generated
    @Selector("matchID")
    public native String matchID();

    @Generated
    @Selector("message")
    public native String message();

    @Generated
    @Deprecated
    @Selector("participantQuitInTurnWithOutcome:nextParticipant:matchData:completionHandler:")
    public native void participantQuitInTurnWithOutcomeNextParticipantMatchDataCompletionHandler(
            @NInt long matchOutcome, GKTurnBasedParticipant nextParticipant, NSData matchData,
            @ObjCBlock(name = "call_participantQuitInTurnWithOutcomeNextParticipantMatchDataCompletionHandler") Block_participantQuitInTurnWithOutcomeNextParticipantMatchDataCompletionHandler completionHandler);

    @Generated
    @Selector("participantQuitInTurnWithOutcome:nextParticipants:turnTimeout:matchData:completionHandler:")
    public native void participantQuitInTurnWithOutcomeNextParticipantsTurnTimeoutMatchDataCompletionHandler(
            @NInt long matchOutcome, NSArray<? extends GKTurnBasedParticipant> nextParticipants, double timeout,
            NSData matchData,
            @ObjCBlock(name = "call_participantQuitInTurnWithOutcomeNextParticipantsTurnTimeoutMatchDataCompletionHandler") Block_participantQuitInTurnWithOutcomeNextParticipantsTurnTimeoutMatchDataCompletionHandler completionHandler);

    @Generated
    @Selector("participantQuitOutOfTurnWithOutcome:withCompletionHandler:")
    public native void participantQuitOutOfTurnWithOutcomeWithCompletionHandler(@NInt long matchOutcome,
            @ObjCBlock(name = "call_participantQuitOutOfTurnWithOutcomeWithCompletionHandler") Block_participantQuitOutOfTurnWithOutcomeWithCompletionHandler completionHandler);

    @Generated
    @Selector("participants")
    public native NSArray<? extends GKTurnBasedParticipant> participants();

    @Generated
    @Selector("rematchWithCompletionHandler:")
    public native void rematchWithCompletionHandler(
            @ObjCBlock(name = "call_rematchWithCompletionHandler") Block_rematchWithCompletionHandler completionHandler);

    @Generated
    @Selector("removeWithCompletionHandler:")
    public native void removeWithCompletionHandler(
            @ObjCBlock(name = "call_removeWithCompletionHandler") Block_removeWithCompletionHandler completionHandler);

    @Generated
    @Selector("saveCurrentTurnWithMatchData:completionHandler:")
    public native void saveCurrentTurnWithMatchDataCompletionHandler(NSData matchData,
            @ObjCBlock(name = "call_saveCurrentTurnWithMatchDataCompletionHandler") Block_saveCurrentTurnWithMatchDataCompletionHandler completionHandler);

    @Generated
    @Selector("saveMergedMatchData:withResolvedExchanges:completionHandler:")
    public native void saveMergedMatchDataWithResolvedExchangesCompletionHandler(NSData matchData,
            NSArray<? extends GKTurnBasedExchange> exchanges,
            @ObjCBlock(name = "call_saveMergedMatchDataWithResolvedExchangesCompletionHandler") Block_saveMergedMatchDataWithResolvedExchangesCompletionHandler completionHandler);

    @Generated
    @Selector("sendExchangeToParticipants:data:localizableMessageKey:arguments:timeout:completionHandler:")
    public native void sendExchangeToParticipantsDataLocalizableMessageKeyArgumentsTimeoutCompletionHandler(
            NSArray<? extends GKTurnBasedParticipant> participants, NSData data, String key, NSArray<String> arguments,
            double timeout,
            @ObjCBlock(name = "call_sendExchangeToParticipantsDataLocalizableMessageKeyArgumentsTimeoutCompletionHandler") Block_sendExchangeToParticipantsDataLocalizableMessageKeyArgumentsTimeoutCompletionHandler completionHandler);

    @Generated
    @Selector("sendReminderToParticipants:localizableMessageKey:arguments:completionHandler:")
    public native void sendReminderToParticipantsLocalizableMessageKeyArgumentsCompletionHandler(
            NSArray<? extends GKTurnBasedParticipant> participants, String key, NSArray<String> arguments,
            @ObjCBlock(name = "call_sendReminderToParticipantsLocalizableMessageKeyArgumentsCompletionHandler") Block_sendReminderToParticipantsLocalizableMessageKeyArgumentsCompletionHandler completionHandler);

    @Generated
    @Selector("setLocalizableMessageWithKey:arguments:")
    public native void setLocalizableMessageWithKeyArguments(String key, NSArray<String> arguments);

    @Generated
    @Selector("setMessage:")
    public native void setMessage(String value);

    @Generated
    @Selector("status")
    @NInt
    public native long status();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_acceptInviteWithCompletionHandler {
        @Generated
        void call_acceptInviteWithCompletionHandler(GKTurnBasedMatch match, NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_declineInviteWithCompletionHandler {
        @Generated
        void call_declineInviteWithCompletionHandler(NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_endMatchInTurnWithMatchDataCompletionHandler {
        @Generated
        void call_endMatchInTurnWithMatchDataCompletionHandler(NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_endMatchInTurnWithMatchDataScoresAchievementsCompletionHandler {
        @Generated
        void call_endMatchInTurnWithMatchDataScoresAchievementsCompletionHandler(NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_endTurnWithNextParticipantMatchDataCompletionHandler {
        @Generated
        void call_endTurnWithNextParticipantMatchDataCompletionHandler(NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_endTurnWithNextParticipantsTurnTimeoutMatchDataCompletionHandler {
        @Generated
        void call_endTurnWithNextParticipantsTurnTimeoutMatchDataCompletionHandler(NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_findMatchForRequestWithCompletionHandler {
        @Generated
        void call_findMatchForRequestWithCompletionHandler(GKTurnBasedMatch match, NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_loadMatchDataWithCompletionHandler {
        @Generated
        void call_loadMatchDataWithCompletionHandler(NSData matchData, NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_loadMatchWithIDWithCompletionHandler {
        @Generated
        void call_loadMatchWithIDWithCompletionHandler(GKTurnBasedMatch match, NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_loadMatchesWithCompletionHandler {
        @Generated
        void call_loadMatchesWithCompletionHandler(NSArray<? extends GKTurnBasedMatch> matches, NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_participantQuitInTurnWithOutcomeNextParticipantMatchDataCompletionHandler {
        @Generated
        void call_participantQuitInTurnWithOutcomeNextParticipantMatchDataCompletionHandler(NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_participantQuitInTurnWithOutcomeNextParticipantsTurnTimeoutMatchDataCompletionHandler {
        @Generated
        void call_participantQuitInTurnWithOutcomeNextParticipantsTurnTimeoutMatchDataCompletionHandler(NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_participantQuitOutOfTurnWithOutcomeWithCompletionHandler {
        @Generated
        void call_participantQuitOutOfTurnWithOutcomeWithCompletionHandler(NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_rematchWithCompletionHandler {
        @Generated
        void call_rematchWithCompletionHandler(GKTurnBasedMatch match, NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_removeWithCompletionHandler {
        @Generated
        void call_removeWithCompletionHandler(NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_saveCurrentTurnWithMatchDataCompletionHandler {
        @Generated
        void call_saveCurrentTurnWithMatchDataCompletionHandler(NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_saveMergedMatchDataWithResolvedExchangesCompletionHandler {
        @Generated
        void call_saveMergedMatchDataWithResolvedExchangesCompletionHandler(NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_sendExchangeToParticipantsDataLocalizableMessageKeyArgumentsTimeoutCompletionHandler {
        @Generated
        void call_sendExchangeToParticipantsDataLocalizableMessageKeyArgumentsTimeoutCompletionHandler(
                GKTurnBasedExchange exchange, NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_sendReminderToParticipantsLocalizableMessageKeyArgumentsCompletionHandler {
        @Generated
        void call_sendReminderToParticipantsLocalizableMessageKeyArgumentsCompletionHandler(NSError error);
    }

    @Generated
    @Selector("endMatchInTurnWithMatchData:leaderboardScores:achievements:completionHandler:")
    public native void endMatchInTurnWithMatchDataLeaderboardScoresAchievementsCompletionHandler(NSData matchData,
            NSArray<? extends GKLeaderboardScore> scores, NSArray<?> achievements,
            @ObjCBlock(name = "call_endMatchInTurnWithMatchDataLeaderboardScoresAchievementsCompletionHandler") Block_endMatchInTurnWithMatchDataLeaderboardScoresAchievementsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_endMatchInTurnWithMatchDataLeaderboardScoresAchievementsCompletionHandler {
        @Generated
        void call_endMatchInTurnWithMatchDataLeaderboardScoresAchievementsCompletionHandler(NSError error);
    }
}

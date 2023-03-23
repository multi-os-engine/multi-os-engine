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
 * API-Since: 5.0
 */
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

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native GKTurnBasedMatch allocWithZone(VoidPtr zone);

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

    /**
     * Attempt to find a turn-based match for the specified request. Error will be nil on success.
     * Possible reasons for error:
     * 1. Communications failure
     * 2. Unauthenticated player
     */
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

    /**
     * load a match based on a previously known match ID
     * 
     * API-Since: 5.0
     */
    @Generated
    @Selector("loadMatchWithID:withCompletionHandler:")
    public static native void loadMatchWithIDWithCompletionHandler(String matchID,
            @ObjCBlock(name = "call_loadMatchWithIDWithCompletionHandler") Block_loadMatchWithIDWithCompletionHandler completionHandler);

    /**
     * This method retrieves the list of GKTurnBasedMatches that the current player is or has participated in. The
     * callback’s array contains GKTurnBasedMatches
     */
    @Generated
    @Selector("loadMatchesWithCompletionHandler:")
    public static native void loadMatchesWithCompletionHandler(
            @ObjCBlock(name = "call_loadMatchesWithCompletionHandler") Block_loadMatchesWithCompletionHandler completionHandler);

    @Generated
    @Owned
    @Selector("new")
    public static native GKTurnBasedMatch new_objc();

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
     * If the local participant has status invited then accept the invite, otherwise returns an error
     * 
     * API-Since: 5.0
     */
    @Generated
    @Selector("acceptInviteWithCompletionHandler:")
    public native void acceptInviteWithCompletionHandler(
            @ObjCBlock(name = "call_acceptInviteWithCompletionHandler") Block_acceptInviteWithCompletionHandler completionHandler);

    /**
     * returns the exchanges that currently await a reply from the local player
     * 
     * API-Since: 7.0
     */
    @Generated
    @Selector("activeExchanges")
    public native NSArray<? extends GKTurnBasedExchange> activeExchanges();

    /**
     * returns the exchanges that have been completed and need to be merged by the local participant. This will be nil
     * unless the local participant is the current turn holder for this match
     * 
     * API-Since: 7.0
     */
    @Generated
    @Selector("completedExchanges")
    public native NSArray<? extends GKTurnBasedExchange> completedExchanges();

    @Generated
    @Selector("creationDate")
    public native NSDate creationDate();

    /**
     * This indicates the participant who has the current turn. This is set by passing the next participant into
     * endTurnWithNextParticipant:matchData:completionHandler:
     */
    @Generated
    @Selector("currentParticipant")
    public native GKTurnBasedParticipant currentParticipant();

    /**
     * If the local participant has status invited then decline the invite, otherwise returns an error
     * 
     * API-Since: 5.0
     */
    @Generated
    @Selector("declineInviteWithCompletionHandler:")
    public native void declineInviteWithCompletionHandler(
            @ObjCBlock(name = "call_declineInviteWithCompletionHandler") Block_declineInviteWithCompletionHandler completionHandler);

    /**
     * This will end the match for all participants. You must set each participant’s matchOutcome before calling this
     * method. All completed exchanges must be resolved or canceled before calling this.
     */
    @Generated
    @Selector("endMatchInTurnWithMatchData:completionHandler:")
    public native void endMatchInTurnWithMatchDataCompletionHandler(NSData matchData,
            @ObjCBlock(name = "call_endMatchInTurnWithMatchDataCompletionHandler") Block_endMatchInTurnWithMatchDataCompletionHandler completionHandler);

    /**
     * This will end the match and submit scores and achievements for all participants. Scores should be submitted for
     * all involved players, and multiple scores may be submitted for each to different leaderboards. Earned
     * achievements may also be submitted for any participants. You must set each participant’s matchOutcome before
     * calling this method. All completed exchanges must be resolved or canceled before calling this.
     * 
     * API-Since: 6.0
     * Deprecated-Since: 14.0
     * Deprecated-Message: pass GKLeaderboardScore to endMatchInTurnWithMatchData:scores:completionHandler instead
     */
    @Deprecated
    @Generated
    @Selector("endMatchInTurnWithMatchData:scores:achievements:completionHandler:")
    public native void endMatchInTurnWithMatchDataScoresAchievementsCompletionHandler(NSData matchData,
            NSArray<? extends GKScore> scores, NSArray<? extends GKAchievement> achievements,
            @ObjCBlock(name = "call_endMatchInTurnWithMatchDataScoresAchievementsCompletionHandler") Block_endMatchInTurnWithMatchDataScoresAchievementsCompletionHandler completionHandler);

    /**
     * deprecated methods
     * 
     * API-Since: 5.0
     * Deprecated-Since: 6.0
     * Deprecated-Message: Use endTurnWithNextParticipants:... instead
     */
    @Generated
    @Deprecated
    @Selector("endTurnWithNextParticipant:matchData:completionHandler:")
    public native void endTurnWithNextParticipantMatchDataCompletionHandler(GKTurnBasedParticipant nextParticipant,
            NSData matchData,
            @ObjCBlock(name = "call_endTurnWithNextParticipantMatchDataCompletionHandler") Block_endTurnWithNextParticipantMatchDataCompletionHandler completionHandler);

    /**
     * Ends the current player's turn. You may update the matchOutcome for any GKTurnBasedPlayerInfos that you wish to
     * before ending the turn.
     * This will asynchronously report error in these cases:
     * 1. Communications problem
     * 2. Is not current player's turn
     * 3. Session is closed
     * 
     * API-Since: 6.0
     */
    @Generated
    @Selector("endTurnWithNextParticipants:turnTimeout:matchData:completionHandler:")
    public native void endTurnWithNextParticipantsTurnTimeoutMatchDataCompletionHandler(
            NSArray<? extends GKTurnBasedParticipant> nextParticipants, double timeout, NSData matchData,
            @ObjCBlock(name = "call_endTurnWithNextParticipantsTurnTimeoutMatchDataCompletionHandler") Block_endTurnWithNextParticipantsTurnTimeoutMatchDataCompletionHandler completionHandler);

    /**
     * maximum data allowed for exchange data
     * 
     * API-Since: 7.0
     */
    @Generated
    @Selector("exchangeDataMaximumSize")
    @NUInt
    public native long exchangeDataMaximumSize();

    /**
     * limit of the number of exchanges that this player can have initiated at a given time
     * 
     * API-Since: 7.0
     */
    @Generated
    @Selector("exchangeMaxInitiatedExchangesPerPlayer")
    @NUInt
    public native long exchangeMaxInitiatedExchangesPerPlayer();

    /**
     * exchanges that are in progress on this match. Once an exchange has completed and has been resolved by merging it
     * into the match data by the current turn holder then it will be removed from this list
     * 
     * API-Since: 7.0
     */
    @Generated
    @Selector("exchanges")
    public native NSArray<? extends GKTurnBasedExchange> exchanges();

    @Generated
    @Selector("init")
    public native GKTurnBasedMatch init();

    /**
     * This method fetches the match data and exchanges for this match. This data is the state of the game at this point
     * in time. This may update the status and/or participant properties if they have changed.
     */
    @Generated
    @Selector("loadMatchDataWithCompletionHandler:")
    public native void loadMatchDataWithCompletionHandler(
            @ObjCBlock(name = "call_loadMatchDataWithCompletionHandler") Block_loadMatchDataWithCompletionHandler completionHandler);

    /**
     * Developer-defined data representing the current state of the game. This property is nil until loaded by
     * loadMatchDataWithCompletionHandler:
     * The developer can submit updated matchData by passing it into
     * endTurnWithNextParticipant:matchData:completionHandler: or endMatchInTurnWithMatchData:completionHandler:
     */
    @Generated
    @Selector("matchData")
    public native NSData matchData();

    /**
     * Returns the maximum size for the match data.
     * 
     * API-Since: 6.0
     */
    @Generated
    @Selector("matchDataMaximumSize")
    @NUInt
    public native long matchDataMaximumSize();

    @Generated
    @Selector("matchID")
    public native String matchID();

    /**
     * returns the localizable message in the current locale. Setting this is equivalent to calling [self
     * setLocalizableMessageWithKey:message arguments:nil]
     */
    @Generated
    @Selector("message")
    public native String message();

    /**
     * API-Since: 5.0
     * Deprecated-Since: 6.0
     * Deprecated-Message: Use participantQuitInTurnWithOutcome:nextParticipants:turnTimeout:... instead
     */
    @Generated
    @Deprecated
    @Selector("participantQuitInTurnWithOutcome:nextParticipant:matchData:completionHandler:")
    public native void participantQuitInTurnWithOutcomeNextParticipantMatchDataCompletionHandler(
            @NInt long matchOutcome, GKTurnBasedParticipant nextParticipant, NSData matchData,
            @ObjCBlock(name = "call_participantQuitInTurnWithOutcomeNextParticipantMatchDataCompletionHandler") Block_participantQuitInTurnWithOutcomeNextParticipantMatchDataCompletionHandler completionHandler);

    /**
     * Ends the current player's turn by quitting the match.  The caller must indicate the next player and pass in
     * updated matchData (if used). All completed exchanges must be resolved or canceled before calling this.
     * 
     * API-Since: 6.0
     */
    @Generated
    @Selector("participantQuitInTurnWithOutcome:nextParticipants:turnTimeout:matchData:completionHandler:")
    public native void participantQuitInTurnWithOutcomeNextParticipantsTurnTimeoutMatchDataCompletionHandler(
            @NInt long matchOutcome, NSArray<? extends GKTurnBasedParticipant> nextParticipants, double timeout,
            NSData matchData,
            @ObjCBlock(name = "call_participantQuitInTurnWithOutcomeNextParticipantsTurnTimeoutMatchDataCompletionHandler") Block_participantQuitInTurnWithOutcomeNextParticipantsTurnTimeoutMatchDataCompletionHandler completionHandler);

    /**
     * Abandon the match when it is not the current participant's turn. In this there is no update to matchData and no
     * need to set nextParticipant.
     */
    @Generated
    @Selector("participantQuitOutOfTurnWithOutcome:withCompletionHandler:")
    public native void participantQuitOutOfTurnWithOutcomeWithCompletionHandler(@NInt long matchOutcome,
            @ObjCBlock(name = "call_participantQuitOutOfTurnWithOutcomeWithCompletionHandler") Block_participantQuitOutOfTurnWithOutcomeWithCompletionHandler completionHandler);

    /**
     * array of GKTurnBasedParticipant objects
     */
    @Generated
    @Selector("participants")
    public native NSArray<? extends GKTurnBasedParticipant> participants();

    /**
     * Recreate a previously existing turn based match that ended. A new match with the same set of players will be
     * returned by the completion handler. If multiple players do this then multiple new matches will be created. Error
     * will be nil on success.
     * Possible reasons for error:
     * 1. Communications failure
     * 2. Unauthenticated player
     * 
     * API-Since: 6.0
     */
    @Generated
    @Selector("rematchWithCompletionHandler:")
    public native void rematchWithCompletionHandler(
            @ObjCBlock(name = "call_rematchWithCompletionHandler") Block_rematchWithCompletionHandler completionHandler);

    /**
     * Remove a declined or completed match (one with a matchOutcome set) from the player's list of matches. If using
     * the GKTurnBasedMatchmakerViewController UI, this will remove it from the finished sessions. The developer should
     * not do this without user input.
     */
    @Generated
    @Selector("removeWithCompletionHandler:")
    public native void removeWithCompletionHandler(
            @ObjCBlock(name = "call_removeWithCompletionHandler") Block_removeWithCompletionHandler completionHandler);

    /**
     * saves the matchData for the current turn without ending the turn. If other players have the game running they
     * will receive a handleTurnEventForMatch to indicate that the matchData has changed. This is useful to initialize
     * the game state for the first player when they take their turn or for updating the turn data due to the user
     * taking an irreversible action within their turn. All completed exchanges must be resolved or canceled before
     * calling this. If you are using exchanges use saveMergedMatchData instead.
     * 
     * API-Since: 6.0
     */
    @Generated
    @Selector("saveCurrentTurnWithMatchData:completionHandler:")
    public native void saveCurrentTurnWithMatchDataCompletionHandler(NSData matchData,
            @ObjCBlock(name = "call_saveCurrentTurnWithMatchDataCompletionHandler") Block_saveCurrentTurnWithMatchDataCompletionHandler completionHandler);

    /**
     * saves the merged matchData for the current turn without ending the turn and mark the supplied exchanges as
     * resolved meaning that the data has been merged into the match data. If other players have the game running they
     * will receive a handleTurnEventForMatch to indicate that the matchData has changed. It is required that all
     * completed exchanges are resolved before ending a turn. Otherwise calling endTurn,
     * participantQuitInTurnWithOutCome or endMatchInTurn will return an error
     * 
     * API-Since: 7.0
     */
    @Generated
    @Selector("saveMergedMatchData:withResolvedExchanges:completionHandler:")
    public native void saveMergedMatchDataWithResolvedExchangesCompletionHandler(NSData matchData,
            NSArray<? extends GKTurnBasedExchange> exchanges,
            @ObjCBlock(name = "call_saveMergedMatchDataWithResolvedExchangesCompletionHandler") Block_saveMergedMatchDataWithResolvedExchangesCompletionHandler completionHandler);

    /**
     * Send an exchange request to one or more participants. Each recipient will receive a push notification using
     * supplied localizable message. If any of the participants have an inactive status
     * (GKTurnBasedParticipantStatusDone) then this will return an error.  completionHandler gets passed the updated
     * exchange with identifier, sender and recipients set
     * 
     * API-Since: 7.0
     */
    @Generated
    @Selector("sendExchangeToParticipants:data:localizableMessageKey:arguments:timeout:completionHandler:")
    public native void sendExchangeToParticipantsDataLocalizableMessageKeyArgumentsTimeoutCompletionHandler(
            NSArray<? extends GKTurnBasedParticipant> participants, NSData data, String key, NSArray<String> arguments,
            double timeout,
            @ObjCBlock(name = "call_sendExchangeToParticipantsDataLocalizableMessageKeyArgumentsTimeoutCompletionHandler") Block_sendExchangeToParticipantsDataLocalizableMessageKeyArgumentsTimeoutCompletionHandler completionHandler);

    /**
     * Send a reminder to one or more participants. Each recipient will receive a push notification using supplied
     * localizable message. This allows a game to send reminders that a turn or exchange request needs action. On the
     * receiver side this will generate a turn event for the match.
     * 
     * API-Since: 7.0
     */
    @Generated
    @Selector("sendReminderToParticipants:localizableMessageKey:arguments:completionHandler:")
    public native void sendReminderToParticipantsLocalizableMessageKeyArgumentsCompletionHandler(
            NSArray<? extends GKTurnBasedParticipant> participants, String key, NSArray<String> arguments,
            @ObjCBlock(name = "call_sendReminderToParticipantsLocalizableMessageKeyArgumentsCompletionHandler") Block_sendReminderToParticipantsLocalizableMessageKeyArgumentsCompletionHandler completionHandler);

    /**
     * If the developer wishes to display a message in GKTurnBasedMatchmakerViewController at the end of a turn or end
     * of the match. Only the current participant can set this.
     * Sets a localizable mesage that will be localized on the receiver side if the game is installed and on the sender
     * side as a fallback.
     * The key and arguments offer a subset of formated strings as follows
     * key is a string in a Localizable.strings file for the current localization (which is set by the user’s language
     * preference). key string can be formatted with %@ and %n$@ specifiers to take the variables specified in loc-args
     * arguments is an array of strings that will be substituted using the format string.
     * Notes: The localized message will be evaluated locally from these keys and sent across as well so that devices
     * that do not have the game installed will see the message in the sender's localization
     * The developer can access resulting string using the message property
     * This is a similar concept to the way we handle localization for Push Notifications. See the "Local and Push
     * Notification Programming Guide" for more details.
     * 
     * API-Since: 7.0
     */
    @Generated
    @Selector("setLocalizableMessageWithKey:arguments:")
    public native void setLocalizableMessageWithKeyArguments(String key, NSArray<String> arguments);

    /**
     * returns the localizable message in the current locale. Setting this is equivalent to calling [self
     * setLocalizableMessageWithKey:message arguments:nil]
     */
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

    /**
     * API-Since: 14.0
     */
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

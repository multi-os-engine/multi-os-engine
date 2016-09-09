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
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;

import ios.NSObject;
import ios.foundation.NSArray;
import ios.foundation.NSData;
import ios.foundation.NSDate;
import ios.foundation.NSError;
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
public class GKTurnBasedMatch extends NSObject {
	static {
		NatJ.register();
	}

	@Generated
	protected GKTurnBasedMatch(Pointer peer) {
		super(peer);
	}

	/**
	 * acceptInviteWithCompletionHandler:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameKit/Reference/GKTurnBasedMatch_Ref/index.html#//apple_ref/occ/instm/GKTurnBasedMatch/acceptInviteWithCompletionHandler:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("acceptInviteWithCompletionHandler:")
	public native void acceptInviteWithCompletionHandler(
			@ObjCBlock(name = "call_acceptInviteWithCompletionHandler") Block_acceptInviteWithCompletionHandler completionHandler);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_acceptInviteWithCompletionHandler {
		@Generated
		void call_acceptInviteWithCompletionHandler(
				GKTurnBasedMatch arg0, NSError arg1);
	}

	/**
	 * activeExchanges</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameKit/Reference/GKTurnBasedMatch_Ref/index.html#//apple_ref/occ/instp/GKTurnBasedMatch/activeExchanges">iOS Dev Center</a>
	 */
	@Generated
	@Selector("activeExchanges")
	public native NSArray<? extends GKTurnBasedExchange> activeExchanges();

	@Generated
	@Owned
	@Selector("alloc")
	public static native GKTurnBasedMatch alloc();

	/**
	 * completedExchanges</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameKit/Reference/GKTurnBasedMatch_Ref/index.html#//apple_ref/occ/instp/GKTurnBasedMatch/completedExchanges">iOS Dev Center</a>
	 */
	@Generated
	@Selector("completedExchanges")
	public native NSArray<? extends GKTurnBasedExchange> completedExchanges();

	/**
	 * creationDate</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameKit/Reference/GKTurnBasedMatch_Ref/index.html#//apple_ref/occ/instp/GKTurnBasedMatch/creationDate">iOS Dev Center</a>
	 */
	@Generated
	@Selector("creationDate")
	public native NSDate creationDate();

	/**
	 * currentParticipant</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameKit/Reference/GKTurnBasedMatch_Ref/index.html#//apple_ref/occ/instp/GKTurnBasedMatch/currentParticipant">iOS Dev Center</a>
	 */
	@Generated
	@Selector("currentParticipant")
	public native GKTurnBasedParticipant currentParticipant();

	/**
	 * declineInviteWithCompletionHandler:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameKit/Reference/GKTurnBasedMatch_Ref/index.html#//apple_ref/occ/instm/GKTurnBasedMatch/declineInviteWithCompletionHandler:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("declineInviteWithCompletionHandler:")
	public native void declineInviteWithCompletionHandler(
			@ObjCBlock(name = "call_declineInviteWithCompletionHandler") Block_declineInviteWithCompletionHandler completionHandler);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_declineInviteWithCompletionHandler {
		@Generated
		void call_declineInviteWithCompletionHandler(NSError arg0);
	}

	/**
	 * endMatchInTurnWithMatchData:completionHandler:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameKit/Reference/GKTurnBasedMatch_Ref/index.html#//apple_ref/occ/instm/GKTurnBasedMatch/endMatchInTurnWithMatchData:completionHandler:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("endMatchInTurnWithMatchData:completionHandler:")
	public native void endMatchInTurnWithMatchDataCompletionHandler(
			NSData matchData,
			@ObjCBlock(name = "call_endMatchInTurnWithMatchDataCompletionHandler") Block_endMatchInTurnWithMatchDataCompletionHandler completionHandler);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_endMatchInTurnWithMatchDataCompletionHandler {
		@Generated
		void call_endMatchInTurnWithMatchDataCompletionHandler(
				NSError arg0);
	}

	/**
	 * endMatchInTurnWithMatchData:scores:achievements:completionHandler:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameKit/Reference/GKTurnBasedMatch_Ref/index.html#//apple_ref/occ/instm/GKTurnBasedMatch/endMatchInTurnWithMatchData:scores:achievements:completionHandler:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("endMatchInTurnWithMatchData:scores:achievements:completionHandler:")
	public native void endMatchInTurnWithMatchDataScoresAchievementsCompletionHandler(
			NSData matchData,
			NSArray<? extends GKScore> scores,
			NSArray<? extends GKAchievement> achievements,
			@ObjCBlock(name = "call_endMatchInTurnWithMatchDataScoresAchievementsCompletionHandler") Block_endMatchInTurnWithMatchDataScoresAchievementsCompletionHandler completionHandler);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_endMatchInTurnWithMatchDataScoresAchievementsCompletionHandler {
		@Generated
		void call_endMatchInTurnWithMatchDataScoresAchievementsCompletionHandler(
				NSError arg0);
	}

	/**
	 * endTurnWithNextParticipant:matchData:completionHandler:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameKit/Reference/GKTurnBasedMatch_Ref/index.html#//apple_ref/occ/instm/GKTurnBasedMatch/endTurnWithNextParticipant:matchData:completionHandler:">iOS Dev Center</a>
	 */
	@Generated
	@Deprecated
	@Selector("endTurnWithNextParticipant:matchData:completionHandler:")
	public native void endTurnWithNextParticipantMatchDataCompletionHandler(
			GKTurnBasedParticipant nextParticipant,
			NSData matchData,
			@ObjCBlock(name = "call_endTurnWithNextParticipantMatchDataCompletionHandler") Block_endTurnWithNextParticipantMatchDataCompletionHandler completionHandler);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_endTurnWithNextParticipantMatchDataCompletionHandler {
		@Generated
		void call_endTurnWithNextParticipantMatchDataCompletionHandler(
				NSError arg0);
	}

	/**
	 * endTurnWithNextParticipants:turnTimeout:matchData:completionHandler:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameKit/Reference/GKTurnBasedMatch_Ref/index.html#//apple_ref/occ/instm/GKTurnBasedMatch/endTurnWithNextParticipants:turnTimeout:matchData:completionHandler:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("endTurnWithNextParticipants:turnTimeout:matchData:completionHandler:")
	public native void endTurnWithNextParticipantsTurnTimeoutMatchDataCompletionHandler(
			NSArray<? extends GKTurnBasedParticipant> nextParticipants,
			double timeout,
			NSData matchData,
			@ObjCBlock(name = "call_endTurnWithNextParticipantsTurnTimeoutMatchDataCompletionHandler") Block_endTurnWithNextParticipantsTurnTimeoutMatchDataCompletionHandler completionHandler);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_endTurnWithNextParticipantsTurnTimeoutMatchDataCompletionHandler {
		@Generated
		void call_endTurnWithNextParticipantsTurnTimeoutMatchDataCompletionHandler(
				NSError arg0);
	}

	/**
	 * exchangeDataMaximumSize</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameKit/Reference/GKTurnBasedMatch_Ref/index.html#//apple_ref/occ/instp/GKTurnBasedMatch/exchangeDataMaximumSize">iOS Dev Center</a>
	 */
	@Generated
	@Selector("exchangeDataMaximumSize")
	@NUInt
	public native long exchangeDataMaximumSize();

	/**
	 * exchangeMaxInitiatedExchangesPerPlayer</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameKit/Reference/GKTurnBasedMatch_Ref/index.html#//apple_ref/occ/instp/GKTurnBasedMatch/exchangeMaxInitiatedExchangesPerPlayer">iOS Dev Center</a>
	 */
	@Generated
	@Selector("exchangeMaxInitiatedExchangesPerPlayer")
	@NUInt
	public native long exchangeMaxInitiatedExchangesPerPlayer();

	/**
	 * exchanges</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameKit/Reference/GKTurnBasedMatch_Ref/index.html#//apple_ref/occ/instp/GKTurnBasedMatch/exchanges">iOS Dev Center</a>
	 */
	@Generated
	@Selector("exchanges")
	public native NSArray<? extends GKTurnBasedExchange> exchanges();

	/**
	 * findMatchForRequest:withCompletionHandler:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameKit/Reference/GKTurnBasedMatch_Ref/index.html#//apple_ref/occ/clm/GKTurnBasedMatch/findMatchForRequest:withCompletionHandler:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("findMatchForRequest:withCompletionHandler:")
	public static native void findMatchForRequestWithCompletionHandler(
			GKMatchRequest request,
			@ObjCBlock(name = "call_findMatchForRequestWithCompletionHandler") Block_findMatchForRequestWithCompletionHandler completionHandler);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_findMatchForRequestWithCompletionHandler {
		@Generated
		void call_findMatchForRequestWithCompletionHandler(
				GKTurnBasedMatch arg0, NSError arg1);
	}

	@Generated
	@Selector("init")
	public native GKTurnBasedMatch init();

	/**
	 * loadMatchDataWithCompletionHandler:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameKit/Reference/GKTurnBasedMatch_Ref/index.html#//apple_ref/occ/instm/GKTurnBasedMatch/loadMatchDataWithCompletionHandler:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("loadMatchDataWithCompletionHandler:")
	public native void loadMatchDataWithCompletionHandler(
			@ObjCBlock(name = "call_loadMatchDataWithCompletionHandler") Block_loadMatchDataWithCompletionHandler completionHandler);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_loadMatchDataWithCompletionHandler {
		@Generated
		void call_loadMatchDataWithCompletionHandler(NSData arg0,
				NSError arg1);
	}

	/**
	 * loadMatchWithID:withCompletionHandler:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameKit/Reference/GKTurnBasedMatch_Ref/index.html#//apple_ref/occ/clm/GKTurnBasedMatch/loadMatchWithID:withCompletionHandler:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("loadMatchWithID:withCompletionHandler:")
	public static native void loadMatchWithIDWithCompletionHandler(
			String matchID,
			@ObjCBlock(name = "call_loadMatchWithIDWithCompletionHandler") Block_loadMatchWithIDWithCompletionHandler completionHandler);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_loadMatchWithIDWithCompletionHandler {
		@Generated
		void call_loadMatchWithIDWithCompletionHandler(
				GKTurnBasedMatch arg0, NSError arg1);
	}

	/**
	 * loadMatchesWithCompletionHandler:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameKit/Reference/GKTurnBasedMatch_Ref/index.html#//apple_ref/occ/clm/GKTurnBasedMatch/loadMatchesWithCompletionHandler:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("loadMatchesWithCompletionHandler:")
	public static native void loadMatchesWithCompletionHandler(
			@ObjCBlock(name = "call_loadMatchesWithCompletionHandler") Block_loadMatchesWithCompletionHandler completionHandler);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_loadMatchesWithCompletionHandler {
		@Generated
		void call_loadMatchesWithCompletionHandler(NSArray<? extends GKTurnBasedMatch> arg0,
				NSError arg1);
	}

	/**
	 * matchData</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameKit/Reference/GKTurnBasedMatch_Ref/index.html#//apple_ref/occ/instp/GKTurnBasedMatch/matchData">iOS Dev Center</a>
	 */
	@Generated
	@Selector("matchData")
	public native NSData matchData();

	/**
	 * matchDataMaximumSize</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameKit/Reference/GKTurnBasedMatch_Ref/index.html#//apple_ref/occ/instp/GKTurnBasedMatch/matchDataMaximumSize">iOS Dev Center</a>
	 */
	@Generated
	@Selector("matchDataMaximumSize")
	@NUInt
	public native long matchDataMaximumSize();

	/**
	 * matchID</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameKit/Reference/GKTurnBasedMatch_Ref/index.html#//apple_ref/occ/instp/GKTurnBasedMatch/matchID">iOS Dev Center</a>
	 */
	@Generated
	@Selector("matchID")
	public native String matchID();

	/**
	 * message</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameKit/Reference/GKTurnBasedMatch_Ref/index.html#//apple_ref/occ/instp/GKTurnBasedMatch/message">iOS Dev Center</a>
	 */
	@Generated
	@Selector("message")
	public native String message();

	/**
	 * participantQuitInTurnWithOutcome:nextParticipant:matchData:completionHandler:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameKit/Reference/GKTurnBasedMatch_Ref/index.html#//apple_ref/occ/instm/GKTurnBasedMatch/participantQuitInTurnWithOutcome:nextParticipant:matchData:completionHandler:">iOS Dev Center</a>
	 */
	@Generated
	@Deprecated
	@Selector("participantQuitInTurnWithOutcome:nextParticipant:matchData:completionHandler:")
	public native void participantQuitInTurnWithOutcomeNextParticipantMatchDataCompletionHandler(
			@NInt long matchOutcome,
			GKTurnBasedParticipant nextParticipant,
			NSData matchData,
			@ObjCBlock(name = "call_participantQuitInTurnWithOutcomeNextParticipantMatchDataCompletionHandler") Block_participantQuitInTurnWithOutcomeNextParticipantMatchDataCompletionHandler completionHandler);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_participantQuitInTurnWithOutcomeNextParticipantMatchDataCompletionHandler {
		@Generated
		void call_participantQuitInTurnWithOutcomeNextParticipantMatchDataCompletionHandler(
				NSError arg0);
	}

	/**
	 * participantQuitInTurnWithOutcome:nextParticipants:turnTimeout:matchData:completionHandler:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameKit/Reference/GKTurnBasedMatch_Ref/index.html#//apple_ref/occ/instm/GKTurnBasedMatch/participantQuitInTurnWithOutcome:nextParticipants:turnTimeout:matchData:completionHandler:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("participantQuitInTurnWithOutcome:nextParticipants:turnTimeout:matchData:completionHandler:")
	public native void participantQuitInTurnWithOutcomeNextParticipantsTurnTimeoutMatchDataCompletionHandler(
			@NInt long matchOutcome,
			NSArray<? extends GKTurnBasedParticipant> nextParticipants,
			double timeout,
			NSData matchData,
			@ObjCBlock(name = "call_participantQuitInTurnWithOutcomeNextParticipantsTurnTimeoutMatchDataCompletionHandler") Block_participantQuitInTurnWithOutcomeNextParticipantsTurnTimeoutMatchDataCompletionHandler completionHandler);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_participantQuitInTurnWithOutcomeNextParticipantsTurnTimeoutMatchDataCompletionHandler {
		@Generated
		void call_participantQuitInTurnWithOutcomeNextParticipantsTurnTimeoutMatchDataCompletionHandler(
				NSError arg0);
	}

	/**
	 * participantQuitOutOfTurnWithOutcome:withCompletionHandler:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameKit/Reference/GKTurnBasedMatch_Ref/index.html#//apple_ref/occ/instm/GKTurnBasedMatch/participantQuitOutOfTurnWithOutcome:withCompletionHandler:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("participantQuitOutOfTurnWithOutcome:withCompletionHandler:")
	public native void participantQuitOutOfTurnWithOutcomeWithCompletionHandler(
			@NInt long matchOutcome,
			@ObjCBlock(name = "call_participantQuitOutOfTurnWithOutcomeWithCompletionHandler") Block_participantQuitOutOfTurnWithOutcomeWithCompletionHandler completionHandler);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_participantQuitOutOfTurnWithOutcomeWithCompletionHandler {
		@Generated
		void call_participantQuitOutOfTurnWithOutcomeWithCompletionHandler(
				NSError arg0);
	}

	/**
	 * participants</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameKit/Reference/GKTurnBasedMatch_Ref/index.html#//apple_ref/occ/instp/GKTurnBasedMatch/participants">iOS Dev Center</a>
	 */
	@Generated
	@Selector("participants")
	public native NSArray<? extends GKTurnBasedParticipant> participants();

	/**
	 * rematchWithCompletionHandler:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameKit/Reference/GKTurnBasedMatch_Ref/index.html#//apple_ref/occ/instm/GKTurnBasedMatch/rematchWithCompletionHandler:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("rematchWithCompletionHandler:")
	public native void rematchWithCompletionHandler(
			@ObjCBlock(name = "call_rematchWithCompletionHandler") Block_rematchWithCompletionHandler completionHandler);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_rematchWithCompletionHandler {
		@Generated
		void call_rematchWithCompletionHandler(GKTurnBasedMatch arg0,
				NSError arg1);
	}

	/**
	 * removeWithCompletionHandler:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameKit/Reference/GKTurnBasedMatch_Ref/index.html#//apple_ref/occ/instm/GKTurnBasedMatch/removeWithCompletionHandler:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("removeWithCompletionHandler:")
	public native void removeWithCompletionHandler(
			@ObjCBlock(name = "call_removeWithCompletionHandler") Block_removeWithCompletionHandler completionHandler);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_removeWithCompletionHandler {
		@Generated
		void call_removeWithCompletionHandler(NSError arg0);
	}

	/**
	 * saveCurrentTurnWithMatchData:completionHandler:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameKit/Reference/GKTurnBasedMatch_Ref/index.html#//apple_ref/occ/instm/GKTurnBasedMatch/saveCurrentTurnWithMatchData:completionHandler:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("saveCurrentTurnWithMatchData:completionHandler:")
	public native void saveCurrentTurnWithMatchDataCompletionHandler(
			NSData matchData,
			@ObjCBlock(name = "call_saveCurrentTurnWithMatchDataCompletionHandler") Block_saveCurrentTurnWithMatchDataCompletionHandler completionHandler);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_saveCurrentTurnWithMatchDataCompletionHandler {
		@Generated
		void call_saveCurrentTurnWithMatchDataCompletionHandler(
				NSError arg0);
	}

	/**
	 * saveMergedMatchData:withResolvedExchanges:completionHandler:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameKit/Reference/GKTurnBasedMatch_Ref/index.html#//apple_ref/occ/instm/GKTurnBasedMatch/saveMergedMatchData:withResolvedExchanges:completionHandler:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("saveMergedMatchData:withResolvedExchanges:completionHandler:")
	public native void saveMergedMatchDataWithResolvedExchangesCompletionHandler(
			NSData matchData,
			NSArray<? extends GKTurnBasedExchange> exchanges,
			@ObjCBlock(name = "call_saveMergedMatchDataWithResolvedExchangesCompletionHandler") Block_saveMergedMatchDataWithResolvedExchangesCompletionHandler completionHandler);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_saveMergedMatchDataWithResolvedExchangesCompletionHandler {
		@Generated
		void call_saveMergedMatchDataWithResolvedExchangesCompletionHandler(
				NSError arg0);
	}

	/**
	 * sendExchangeToParticipants:data:localizableMessageKey:arguments:timeout:completionHandler:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameKit/Reference/GKTurnBasedMatch_Ref/index.html#//apple_ref/occ/instm/GKTurnBasedMatch/sendExchangeToParticipants:data:localizableMessageKey:arguments:timeout:completionHandler:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("sendExchangeToParticipants:data:localizableMessageKey:arguments:timeout:completionHandler:")
	public native void sendExchangeToParticipantsDataLocalizableMessageKeyArgumentsTimeoutCompletionHandler(
			NSArray<? extends GKTurnBasedParticipant> participants,
			NSData data,
			String key,
			NSArray<String> arguments,
			double timeout,
			@ObjCBlock(name = "call_sendExchangeToParticipantsDataLocalizableMessageKeyArgumentsTimeoutCompletionHandler") Block_sendExchangeToParticipantsDataLocalizableMessageKeyArgumentsTimeoutCompletionHandler completionHandler);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_sendExchangeToParticipantsDataLocalizableMessageKeyArgumentsTimeoutCompletionHandler {
		@Generated
		void call_sendExchangeToParticipantsDataLocalizableMessageKeyArgumentsTimeoutCompletionHandler(
				GKTurnBasedExchange arg0, NSError arg1);
	}

	/**
	 * sendReminderToParticipants:localizableMessageKey:arguments:completionHandler:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameKit/Reference/GKTurnBasedMatch_Ref/index.html#//apple_ref/occ/instm/GKTurnBasedMatch/sendReminderToParticipants:localizableMessageKey:arguments:completionHandler:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("sendReminderToParticipants:localizableMessageKey:arguments:completionHandler:")
	public native void sendReminderToParticipantsLocalizableMessageKeyArgumentsCompletionHandler(
			NSArray<? extends GKTurnBasedParticipant> participants,
			String key,
			NSArray<String> arguments,
			@ObjCBlock(name = "call_sendReminderToParticipantsLocalizableMessageKeyArgumentsCompletionHandler") Block_sendReminderToParticipantsLocalizableMessageKeyArgumentsCompletionHandler completionHandler);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_sendReminderToParticipantsLocalizableMessageKeyArgumentsCompletionHandler {
		@Generated
		void call_sendReminderToParticipantsLocalizableMessageKeyArgumentsCompletionHandler(
				NSError arg0);
	}

	/**
	 * setLocalizableMessageWithKey:arguments:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameKit/Reference/GKTurnBasedMatch_Ref/index.html#//apple_ref/occ/instm/GKTurnBasedMatch/setLocalizableMessageWithKey:arguments:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setLocalizableMessageWithKey:arguments:")
	public native void setLocalizableMessageWithKeyArguments(String key,
			NSArray<String> arguments);

	/**
	 * message</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameKit/Reference/GKTurnBasedMatch_Ref/index.html#//apple_ref/occ/instp/GKTurnBasedMatch/message">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setMessage:")
	public native void setMessage(String value);

	/**
	 * status</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameKit/Reference/GKTurnBasedMatch_Ref/index.html#//apple_ref/occ/instp/GKTurnBasedMatch/status">iOS Dev Center</a>
	 */
	@Generated
	@Selector("status")
	@NInt
	public native long status();

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

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
public class GKMatchmaker extends NSObject {
	static {
		NatJ.register();
	}

	@Generated
	protected GKMatchmaker(Pointer peer) {
		super(peer);
	}

	/**
	 * addPlayersToMatch:matchRequest:completionHandler:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameKit/Reference/GKMatchmaker_Ref/index.html#//apple_ref/occ/instm/GKMatchmaker/addPlayersToMatch:matchRequest:completionHandler:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("addPlayersToMatch:matchRequest:completionHandler:")
	public native void addPlayersToMatchMatchRequestCompletionHandler(
			GKMatch match,
			GKMatchRequest matchRequest,
			@ObjCBlock(name = "call_addPlayersToMatchMatchRequestCompletionHandler") Block_addPlayersToMatchMatchRequestCompletionHandler completionHandler);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_addPlayersToMatchMatchRequestCompletionHandler {
		@Generated
		void call_addPlayersToMatchMatchRequestCompletionHandler(
				NSError arg0);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native GKMatchmaker alloc();

	/**
	 * cancel</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameKit/Reference/GKMatchmaker_Ref/index.html#//apple_ref/occ/instm/GKMatchmaker/cancel">iOS Dev Center</a>
	 */
	@Generated
	@Selector("cancel")
	public native void cancel();

	/**
	 * cancelInviteToPlayer:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameKit/Reference/GKMatchmaker_Ref/index.html#//apple_ref/occ/instm/GKMatchmaker/cancelInviteToPlayer:">iOS Dev Center</a>
	 */
	@Generated
	@Deprecated
	@Selector("cancelInviteToPlayer:")
	public native void cancelInviteToPlayer(String playerID);

	/**
	 * cancelPendingInviteToPlayer:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameKit/Reference/GKMatchmaker_Ref/index.html#//apple_ref/occ/instm/GKMatchmaker/cancelPendingInviteToPlayer:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("cancelPendingInviteToPlayer:")
	public native void cancelPendingInviteToPlayer(GKPlayer player);

	/**
	 * findMatchForRequest:withCompletionHandler:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameKit/Reference/GKMatchmaker_Ref/index.html#//apple_ref/occ/instm/GKMatchmaker/findMatchForRequest:withCompletionHandler:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("findMatchForRequest:withCompletionHandler:")
	public native void findMatchForRequestWithCompletionHandler(
			GKMatchRequest request,
			@ObjCBlock(name = "call_findMatchForRequestWithCompletionHandler") Block_findMatchForRequestWithCompletionHandler completionHandler);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_findMatchForRequestWithCompletionHandler {
		@Generated
		void call_findMatchForRequestWithCompletionHandler(GKMatch arg0,
				NSError arg1);
	}

	/**
	 * findPlayersForHostedMatchRequest:withCompletionHandler:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameKit/Reference/GKMatchmaker_Ref/index.html#//apple_ref/occ/instm/GKMatchmaker/findPlayersForHostedMatchRequest:withCompletionHandler:">iOS Dev Center</a>
	 */
	@Generated
	@Deprecated
	@Selector("findPlayersForHostedMatchRequest:withCompletionHandler:")
	public native void findPlayersForHostedMatchRequestWithCompletionHandler(
			GKMatchRequest request,
			@ObjCBlock(name = "call_findPlayersForHostedMatchRequestWithCompletionHandler") Block_findPlayersForHostedMatchRequestWithCompletionHandler completionHandler);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_findPlayersForHostedMatchRequestWithCompletionHandler {
		@Generated
		void call_findPlayersForHostedMatchRequestWithCompletionHandler(
				NSArray<String> arg0, NSError arg1);
	}

	/**
	 * findPlayersForHostedRequest:withCompletionHandler:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameKit/Reference/GKMatchmaker_Ref/index.html#//apple_ref/occ/instm/GKMatchmaker/findPlayersForHostedRequest:withCompletionHandler:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("findPlayersForHostedRequest:withCompletionHandler:")
	public native void findPlayersForHostedRequestWithCompletionHandler(
			GKMatchRequest request,
			@ObjCBlock(name = "call_findPlayersForHostedRequestWithCompletionHandler") Block_findPlayersForHostedRequestWithCompletionHandler completionHandler);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_findPlayersForHostedRequestWithCompletionHandler {
		@Generated
		void call_findPlayersForHostedRequestWithCompletionHandler(
				NSArray<? extends GKPlayer> arg0, NSError arg1);
	}

	/**
	 * finishMatchmakingForMatch:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameKit/Reference/GKMatchmaker_Ref/index.html#//apple_ref/occ/instm/GKMatchmaker/finishMatchmakingForMatch:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("finishMatchmakingForMatch:")
	public native void finishMatchmakingForMatch(GKMatch match);

	@Generated
	@Selector("init")
	public native GKMatchmaker init();

	/**
	 * matchForInvite:completionHandler:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameKit/Reference/GKMatchmaker_Ref/index.html#//apple_ref/occ/instm/GKMatchmaker/matchForInvite:completionHandler:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("matchForInvite:completionHandler:")
	public native void matchForInviteCompletionHandler(
			GKInvite invite,
			@ObjCBlock(name = "call_matchForInviteCompletionHandler") Block_matchForInviteCompletionHandler completionHandler);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_matchForInviteCompletionHandler {
		@Generated
		void call_matchForInviteCompletionHandler(GKMatch arg0,
				NSError arg1);
	}

	/**
	 * queryActivityWithCompletionHandler:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameKit/Reference/GKMatchmaker_Ref/index.html#//apple_ref/occ/instm/GKMatchmaker/queryActivityWithCompletionHandler:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("queryActivityWithCompletionHandler:")
	public native void queryActivityWithCompletionHandler(
			@ObjCBlock(name = "call_queryActivityWithCompletionHandler") Block_queryActivityWithCompletionHandler completionHandler);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_queryActivityWithCompletionHandler {
		@Generated
		void call_queryActivityWithCompletionHandler(@NInt long arg0,
				NSError arg1);
	}

	/**
	 * queryPlayerGroupActivity:withCompletionHandler:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameKit/Reference/GKMatchmaker_Ref/index.html#//apple_ref/occ/instm/GKMatchmaker/queryPlayerGroupActivity:withCompletionHandler:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("queryPlayerGroupActivity:withCompletionHandler:")
	public native void queryPlayerGroupActivityWithCompletionHandler(
			@NUInt long playerGroup,
			@ObjCBlock(name = "call_queryPlayerGroupActivityWithCompletionHandler") Block_queryPlayerGroupActivityWithCompletionHandler completionHandler);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_queryPlayerGroupActivityWithCompletionHandler {
		@Generated
		void call_queryPlayerGroupActivityWithCompletionHandler(
				@NInt long arg0, NSError arg1);
	}

	/**
	 * inviteHandler</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameKit/Reference/GKMatchmaker_Ref/index.html#//apple_ref/occ/instp/GKMatchmaker/inviteHandler">iOS Dev Center</a>
	 */
	@Generated
	@Deprecated
	@Selector("setInviteHandler:")
	public native void setInviteHandler(
			@ObjCBlock(name = "call_setInviteHandler") Block_setInviteHandler value);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_setInviteHandler {
		@Generated
		void call_setInviteHandler(GKInvite arg0, NSArray<?> arg1);
	}

	/**
	 * sharedMatchmaker</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameKit/Reference/GKMatchmaker_Ref/index.html#//apple_ref/occ/clm/GKMatchmaker/sharedMatchmaker">iOS Dev Center</a>
	 */
	@Generated
	@Selector("sharedMatchmaker")
	public static native GKMatchmaker sharedMatchmaker();

	/**
	 * startBrowsingForNearbyPlayersWithHandler:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameKit/Reference/GKMatchmaker_Ref/index.html#//apple_ref/occ/instm/GKMatchmaker/startBrowsingForNearbyPlayersWithHandler:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("startBrowsingForNearbyPlayersWithHandler:")
	public native void startBrowsingForNearbyPlayersWithHandler(
			@ObjCBlock(name = "call_startBrowsingForNearbyPlayersWithHandler") Block_startBrowsingForNearbyPlayersWithHandler reachableHandler);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_startBrowsingForNearbyPlayersWithHandler {
		@Generated
		void call_startBrowsingForNearbyPlayersWithHandler(
				GKPlayer arg0, boolean arg1);
	}

	/**
	 * startBrowsingForNearbyPlayersWithReachableHandler:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameKit/Reference/GKMatchmaker_Ref/index.html#//apple_ref/occ/instm/GKMatchmaker/startBrowsingForNearbyPlayersWithReachableHandler:">iOS Dev Center</a>
	 */
	@Generated
	@Deprecated
	@Selector("startBrowsingForNearbyPlayersWithReachableHandler:")
	public native void startBrowsingForNearbyPlayersWithReachableHandler(
			@ObjCBlock(name = "call_startBrowsingForNearbyPlayersWithReachableHandler") Block_startBrowsingForNearbyPlayersWithReachableHandler reachableHandler);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_startBrowsingForNearbyPlayersWithReachableHandler {
		@Generated
		void call_startBrowsingForNearbyPlayersWithReachableHandler(
				String arg0, boolean arg1);
	}

	/**
	 * stopBrowsingForNearbyPlayers</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameKit/Reference/GKMatchmaker_Ref/index.html#//apple_ref/occ/instm/GKMatchmaker/stopBrowsingForNearbyPlayers">iOS Dev Center</a>
	 */
	@Generated
	@Selector("stopBrowsingForNearbyPlayers")
	public native void stopBrowsingForNearbyPlayers();

	/**
	 * inviteHandler</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameKit/Reference/GKMatchmaker_Ref/index.html#//apple_ref/occ/instp/GKMatchmaker/inviteHandler">iOS Dev Center</a>
	 */
	@Generated
	@Deprecated
	@Selector("inviteHandler")
	@ObjCBlock(name = "call_inviteHandler_ret")
	public native Block_inviteHandler_ret inviteHandler();

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_inviteHandler_ret {
		@Generated
		void call_inviteHandler_ret(GKInvite arg0, NSArray<?> arg1);
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

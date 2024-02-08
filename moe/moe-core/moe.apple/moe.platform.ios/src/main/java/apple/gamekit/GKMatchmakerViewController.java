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
import apple.foundation.NSBundle;
import apple.foundation.NSCoder;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.gamekit.protocol.GKMatchmakerViewControllerDelegate;
import apple.uikit.UINavigationController;
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
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Generated
@Library("GameKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class GKMatchmakerViewController extends UINavigationController {
    static {
        NatJ.register();
    }

    @Generated
    protected GKMatchmakerViewController(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native GKMatchmakerViewController alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native GKMatchmakerViewController allocWithZone(VoidPtr zone);

    @Deprecated
    @Generated
    @Selector("attemptRotationToDeviceOrientation")
    public static native void attemptRotationToDeviceOrientation();

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(
            @NotNull @Mapped(ObjCObjectMapper.class) Object aTarget);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
    public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
            @NotNull @Mapped(ObjCObjectMapper.class) Object aTarget, @NotNull SEL aSelector,
            @Nullable @Mapped(ObjCObjectMapper.class) Object anArgument);

    @NotNull
    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @NotNull
    @Generated
    @Selector("classForKeyedUnarchiver")
    public static native Class classForKeyedUnarchiver();

    @Generated
    @Selector("clearTextInputContextIdentifier:")
    public static native void clearTextInputContextIdentifier(@NotNull String identifier);

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

    @NotNull
    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    @Generated
    @Owned
    @Selector("new")
    public static native GKMatchmakerViewController new_objc();

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
     * Add additional players (not currently connected) to an existing peer-to-peer match.
     * Apps should elect a single device to do this, otherwise conflicts could arise resulting in unexpected connection
     * errors.
     * 
     * API-Since: 5.0
     */
    @Generated
    @Selector("addPlayersToMatch:")
    public native void addPlayersToMatch(@NotNull GKMatch match);

    /**
     * default message to use when inviting friends. Can be edited by the user.
     * 
     * API-Since: 5.0
     * Deprecated-Since: 7.0
     */
    @Nullable
    @Generated
    @Deprecated
    @Selector("defaultInvitationMessage")
    public native String defaultInvitationMessage();

    @Generated
    @Selector("init")
    public native GKMatchmakerViewController init();

    @Generated
    @Selector("initWithCoder:")
    public native GKMatchmakerViewController initWithCoder(@NotNull NSCoder coder);

    /**
     * Initialize with an accepted invite, allowing the user to see the status of other invited players and get notified
     * when the game starts
     */
    @Generated
    @Selector("initWithInvite:")
    public native GKMatchmakerViewController initWithInvite(@NotNull GKInvite invite);

    /**
     * Initialize with a matchmaking request, allowing the user to send invites and/or start matchmaking
     */
    @Generated
    @Selector("initWithMatchRequest:")
    public native GKMatchmakerViewController initWithMatchRequest(@NotNull GKMatchRequest request);

    @Generated
    @Selector("initWithNavigationBarClass:toolbarClass:")
    public native GKMatchmakerViewController initWithNavigationBarClassToolbarClass(@Nullable Class navigationBarClass,
            @Nullable Class toolbarClass);

    @Generated
    @Selector("initWithNibName:bundle:")
    public native GKMatchmakerViewController initWithNibNameBundle(@Nullable String nibNameOrNil,
            @Nullable NSBundle nibBundleOrNil);

    @Generated
    @Selector("initWithRootViewController:")
    public native GKMatchmakerViewController initWithRootViewController(@NotNull UIViewController rootViewController);

    /**
     * set to YES to receive hosted (eg. not peer-to-peer) match results. Will cause the controller to return an array
     * of players instead of a match.
     */
    @Generated
    @Selector("isHosted")
    public native boolean isHosted();

    /**
     * set to YES to receive hosted (eg. not peer-to-peer) match results. Will cause the controller to return an array
     * of players instead of a match.
     */
    @Generated
    @Selector("setHosted:")
    public native void setHosted(boolean value);

    @NotNull
    @Generated
    @Selector("matchRequest")
    public native GKMatchRequest matchRequest();

    @Nullable
    @Generated
    @Selector("matchmakerDelegate")
    @MappedReturn(ObjCObjectMapper.class)
    public native GKMatchmakerViewControllerDelegate matchmakerDelegate();

    /**
     * default message to use when inviting friends. Can be edited by the user.
     * 
     * API-Since: 5.0
     * Deprecated-Since: 7.0
     */
    @Generated
    @Deprecated
    @Selector("setDefaultInvitationMessage:")
    public native void setDefaultInvitationMessage(@Nullable String value);

    /**
     * This method is obsolete. It will never be invoked and its implementation does nothing**
     * 
     * API-Since: 5.0
     * Deprecated-Since: 8.0
     */
    @Generated
    @Deprecated
    @Selector("setHostedPlayer:connected:")
    public native void setHostedPlayerConnected(@NotNull String playerID, boolean connected);

    /**
     * API-Since: 8.0
     */
    @Generated
    @Selector("setHostedPlayer:didConnect:")
    public native void setHostedPlayerDidConnect(@NotNull GKPlayer player, boolean connected);

    /**
     * This method is obsolete. It will never be invoked and its implementation does nothing**
     * 
     * API-Since: 4.1
     * Deprecated-Since: 5.0
     * Deprecated-Message: This is never invoked and its implementation does nothing, use setHostedPlayer:connected:
     * instead
     */
    @Generated
    @Deprecated
    @Selector("setHostedPlayerReady:")
    public native void setHostedPlayerReady(@NotNull String playerID);

    @Generated
    @Selector("setMatchmakerDelegate:")
    public native void setMatchmakerDelegate_unsafe(
            @Nullable @Mapped(ObjCObjectMapper.class) GKMatchmakerViewControllerDelegate value);

    @Generated
    public void setMatchmakerDelegate(
            @Nullable @Mapped(ObjCObjectMapper.class) GKMatchmakerViewControllerDelegate value) {
        Object __old = matchmakerDelegate();
        if (value != null) {
            org.moe.natj.objc.ObjCRuntime.associateObjCObject(this, value);
        }
        setMatchmakerDelegate_unsafe(value);
        if (__old != null) {
            org.moe.natj.objc.ObjCRuntime.dissociateObjCObject(this, __old);
        }
    }

    /**
     * this controls which mode of matchmaking to support in the UI (all, nearby only, automatch only, invite only).
     * Throws an exeption if you can not set to the desired mode (due to restrictions)
     */
    @Generated
    @Selector("matchmakingMode")
    @NInt
    public native long matchmakingMode();

    /**
     * this controls which mode of matchmaking to support in the UI (all, nearby only, automatch only, invite only).
     * Throws an exeption if you can not set to the desired mode (due to restrictions)
     */
    @Generated
    @Selector("setMatchmakingMode:")
    public native void setMatchmakingMode(@NInt long value);

    /**
     * A BOOL value to allow the GKMatchMakerViewController to return control to the game once the minimum number of
     * players are connected.
     * By default the value is NO, and the multiplayer match can only proceed after all players are connected.
     * If the value is set to YES, then once the number of connected players is greater than or equal to minPlayers of
     * the match request, matchmakerViewController:didFindMatch: will be called and the game can get the match instance,
     * and update the game scene accordingly. The remaining players wil continue to connect.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("canStartWithMinimumPlayers")
    public native boolean canStartWithMinimumPlayers();

    /**
     * A BOOL value to allow the GKMatchMakerViewController to return control to the game once the minimum number of
     * players are connected.
     * By default the value is NO, and the multiplayer match can only proceed after all players are connected.
     * If the value is set to YES, then once the number of connected players is greater than or equal to minPlayers of
     * the match request, matchmakerViewController:didFindMatch: will be called and the game can get the match instance,
     * and update the game scene accordingly. The remaining players wil continue to connect.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("setCanStartWithMinimumPlayers:")
    public native void setCanStartWithMinimumPlayers(boolean value);

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}

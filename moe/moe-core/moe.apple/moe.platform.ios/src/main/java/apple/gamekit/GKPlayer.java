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
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.uikit.UIImage;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Generated
@Library("GameKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class GKPlayer extends GKBasePlayer {
    static {
        NatJ.register();
    }

    @Generated
    protected GKPlayer(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native GKPlayer alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native GKPlayer allocWithZone(VoidPtr zone);

    /**
     * API-Since: 9.0
     */
    @NotNull
    @Generated
    @Selector("anonymousGuestPlayerWithIdentifier:")
    public static native GKPlayer anonymousGuestPlayerWithIdentifier(@NotNull String guestIdentifier);

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

    /**
     * Load the Game Center players for the playerIDs provided. Error will be nil on success.
     * Possible reasons for error:
     * 1. Unauthenticated local player
     * 2. Communications failure
     * 3. Invalid player identifier
     * 
     * API-Since: 4.1
     * Deprecated-Since: 14.5
     */
    @Deprecated
    @Generated
    @Selector("loadPlayersForIdentifiers:withCompletionHandler:")
    public static native void loadPlayersForIdentifiersWithCompletionHandler(@NotNull NSArray<String> identifiers,
            @Nullable @ObjCBlock(name = "call_loadPlayersForIdentifiersWithCompletionHandler") Block_loadPlayersForIdentifiersWithCompletionHandler completionHandler);

    @Generated
    @Owned
    @Selector("new")
    public static native GKPlayer new_objc();

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
     * The alias property contains the player's nickname. When you need to display the name to the user, consider using
     * displayName instead. The nickname is unique but not invariant: the player may change their nickname. The nickname
     * may be very long, so be sure to use appropriate string truncation API when drawing.
     */
    @NotNull
    @Generated
    @Selector("alias")
    public native String alias();

    /**
     * This is player's alias to be displayed. The display name may be very long, so be sure to use appropriate string
     * truncation API when drawing.
     * 
     * API-Since: 6.0
     */
    @NotNull
    @Generated
    @Selector("displayName")
    public native String displayName();

    /**
     * API-Since: 9.0
     */
    @Nullable
    @Generated
    @Selector("guestIdentifier")
    public native String guestIdentifier();

    @Generated
    @Selector("init")
    public native GKPlayer init();

    /**
     * True if this player is a friend of the local player
     * 
     * API-Since: 4.1
     * Deprecated-Since: 8.0
     */
    @Generated
    @Deprecated
    @Selector("isFriend")
    public native boolean isFriend();

    /**
     * API-Since: 5.0
     */
    @Generated
    @Selector("loadPhotoForSize:withCompletionHandler:")
    public native void loadPhotoForSizeWithCompletionHandler(@NInt long size,
            @Nullable @ObjCBlock(name = "call_loadPhotoForSizeWithCompletionHandler") Block_loadPhotoForSizeWithCompletionHandler completionHandler);

    /**
     * API-Since: 4.1
     * Deprecated-Since: 13.0
     * Deprecated-Message: Use either the gamePlayerID or teamPlayerID property to identify a player.
     */
    @NotNull
    @Deprecated
    @Generated
    @Selector("playerID")
    public native String playerID();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_loadPhotoForSizeWithCompletionHandler {
        @Generated
        void call_loadPhotoForSizeWithCompletionHandler(@Nullable UIImage photo, @Nullable NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_loadPlayersForIdentifiersWithCompletionHandler {
        @Generated
        void call_loadPlayersForIdentifiersWithCompletionHandler(@Nullable NSArray<? extends GKPlayer> players,
                @Nullable NSError error);
    }

    /**
     * This is the player's unique and persistent ID that is scoped to this application.
     * 
     * API-Since: 12.4
     */
    @NotNull
    @Generated
    @Selector("gamePlayerID")
    public native String gamePlayerID();

    /**
     * This convenience method checks if the gamePlayerID and the teamPlayerID (scopedIDs) are persistent or unique for
     * the instantiation of this app.
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("scopedIDsArePersistent")
    public native boolean scopedIDsArePersistent();

    /**
     * This is the player's unique and persistent ID that is scoped to the Apple Store Connect Team identifier of this
     * application.
     * 
     * API-Since: 12.4
     */
    @NotNull
    @Generated
    @Selector("teamPlayerID")
    public native String teamPlayerID();

    /**
     * This convenience method checks if you can invite the player to multiplayer game.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("isInvitable")
    public native boolean isInvitable();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}

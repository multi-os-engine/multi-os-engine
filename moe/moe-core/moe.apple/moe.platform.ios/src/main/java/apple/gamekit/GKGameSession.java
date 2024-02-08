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
import apple.foundation.NSURL;
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

/**
 * API-Since: 10.0
 * Deprecated-Since: 12.0
 * Deprecated-Message: For real-time matches, use GKMatchmakerViewController. For turn-based matches, use
 * GKTurnBasedMatchmakerViewController.
 */
@Deprecated
@Generated
@Library("GameKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class GKGameSession extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected GKGameSession(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    /**
     * API-Since: 10.0
     * Deprecated-Since: 12.0
     */
    @Deprecated
    @Generated
    @Selector("addEventListener:")
    public static native void addEventListener(@NotNull NSObject listener);

    @Generated
    @Owned
    @Selector("alloc")
    public static native GKGameSession alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native GKGameSession allocWithZone(VoidPtr zone);

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

    /**
     * Create a new session with the given title and maximum number of connected players. (You may pass 0 to use the
     * system limit of 16 players.)
     */
    @Generated
    @Selector("createSessionInContainer:withTitle:maxConnectedPlayers:completionHandler:")
    public static native void createSessionInContainerWithTitleMaxConnectedPlayersCompletionHandler(
            @Nullable String containerName, @NotNull String title, @NInt long maxPlayers,
            @NotNull @ObjCBlock(name = "call_createSessionInContainerWithTitleMaxConnectedPlayersCompletionHandler") Block_createSessionInContainerWithTitleMaxConnectedPlayersCompletionHandler completionHandler);

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
     * Load a specific session.
     */
    @Generated
    @Selector("loadSessionWithIdentifier:completionHandler:")
    public static native void loadSessionWithIdentifierCompletionHandler(@NotNull String identifier,
            @NotNull @ObjCBlock(name = "call_loadSessionWithIdentifierCompletionHandler") Block_loadSessionWithIdentifierCompletionHandler completionHandler);

    /**
     * Load all sessions involving the current user.
     */
    @Generated
    @Selector("loadSessionsInContainer:completionHandler:")
    public static native void loadSessionsInContainerCompletionHandler(@Nullable String containerName,
            @NotNull @ObjCBlock(name = "call_loadSessionsInContainerCompletionHandler") Block_loadSessionsInContainerCompletionHandler completionHandler);

    @Generated
    @Owned
    @Selector("new")
    public static native GKGameSession new_objc();

    /**
     * API-Since: 10.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: -[GKLocalPlayer unregisterListener:] or -[GKLocalPlayer unregisterAllListeners:]
     */
    @Deprecated
    @Generated
    @Selector("removeEventListener:")
    public static native void removeEventListener(@NotNull NSObject listener);

    /**
     * Remove a session. If called by the owner this deletes the session from the server.
     */
    @Generated
    @Selector("removeSessionWithIdentifier:completionHandler:")
    public static native void removeSessionWithIdentifierCompletionHandler(@NotNull String identifier,
            @NotNull @ObjCBlock(name = "call_removeSessionWithIdentifierCompletionHandler") Block_removeSessionWithIdentifierCompletionHandler completionHandler);

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

    @NotNull
    @Generated
    @Selector("badgedPlayers")
    public native NSArray<? extends GKCloudPlayer> badgedPlayers();

    /**
     * Clear application badge state for players for this session.
     */
    @Generated
    @Selector("clearBadgeForPlayers:completionHandler:")
    public native void clearBadgeForPlayersCompletionHandler(@NotNull NSArray<? extends GKCloudPlayer> players,
            @NotNull @ObjCBlock(name = "call_clearBadgeForPlayersCompletionHandler") Block_clearBadgeForPlayersCompletionHandler completionHandler);

    /**
     * Get the URL needed to share this session.
     */
    @Generated
    @Selector("getShareURLWithCompletionHandler:")
    public native void getShareURLWithCompletionHandler(
            @NotNull @ObjCBlock(name = "call_getShareURLWithCompletionHandler") Block_getShareURLWithCompletionHandler completionHandler);

    @NotNull
    @Generated
    @Selector("identifier")
    public native String identifier();

    @Generated
    @Selector("init")
    public native GKGameSession init();

    @NotNull
    @Generated
    @Selector("lastModifiedDate")
    public native NSDate lastModifiedDate();

    @NotNull
    @Generated
    @Selector("lastModifiedPlayer")
    public native GKCloudPlayer lastModifiedPlayer();

    /**
     * Load associated persistent data.
     */
    @Generated
    @Selector("loadDataWithCompletionHandler:")
    public native void loadDataWithCompletionHandler(
            @NotNull @ObjCBlock(name = "call_loadDataWithCompletionHandler") Block_loadDataWithCompletionHandler completionHandler);

    @Generated
    @Selector("maxNumberOfConnectedPlayers")
    @NInt
    public native long maxNumberOfConnectedPlayers();

    @NotNull
    @Generated
    @Selector("owner")
    public native GKCloudPlayer owner();

    @NotNull
    @Generated
    @Selector("players")
    public native NSArray<? extends GKCloudPlayer> players();

    /**
     * Get the players with the given connection state.
     */
    @NotNull
    @Generated
    @Selector("playersWithConnectionState:")
    public native NSArray<? extends GKCloudPlayer> playersWithConnectionState(@NInt long state);

    /**
     * Save new/updated persistent data. Data size is limited to 512K. The session's lastModifiedDate and
     * lastModifiedPlayer will be updated upon completion.
     * If a version conflict is detected the handler will include the version currently on the server and an error. In
     * this case the data has not been saved. To resolve the conflict a client would call this method again, presumably
     * after merging data or giving the user a choice on how to resolve the conflict. (Note that when calling again it
     * is possible to get a new conflict, if another device has since written a new version.)
     */
    @Generated
    @Selector("saveData:completionHandler:")
    public native void saveDataCompletionHandler(@NotNull NSData data,
            @NotNull @ObjCBlock(name = "call_saveDataCompletionHandler") Block_saveDataCompletionHandler completionHandler);

    /**
     * Send data to all connected players.
     */
    @Generated
    @Selector("sendData:withTransportType:completionHandler:")
    public native void sendDataWithTransportTypeCompletionHandler(@NotNull NSData data, @NInt long transport,
            @NotNull @ObjCBlock(name = "call_sendDataWithTransportTypeCompletionHandler") Block_sendDataWithTransportTypeCompletionHandler completionHandler);

    /**
     * Send a message to any players in the session. This uses an unreliable push mechanism. Message/data delivery is
     * not guaranteed and may take some time to arrive. Receiving players may optionally have their application badged
     * for this session.
     */
    @Generated
    @Selector("sendMessageWithLocalizedFormatKey:arguments:data:toPlayers:badgePlayers:completionHandler:")
    public native void sendMessageWithLocalizedFormatKeyArgumentsDataToPlayersBadgePlayersCompletionHandler(
            @NotNull String key, @NotNull NSArray<String> arguments, @Nullable NSData data,
            @NotNull NSArray<? extends GKCloudPlayer> players, boolean badgePlayers,
            @NotNull @ObjCBlock(name = "call_sendMessageWithLocalizedFormatKeyArgumentsDataToPlayersBadgePlayersCompletionHandler") Block_sendMessageWithLocalizedFormatKeyArgumentsDataToPlayersBadgePlayersCompletionHandler completionHandler);

    /**
     * Set your connection state. May fail if you attempt to connect but the connected player limit has already been
     * reached or there are network problems. The session's lastModifiedDate and lastModifiedPlayer will be updated upon
     * completion.
     */
    @Generated
    @Selector("setConnectionState:completionHandler:")
    public native void setConnectionStateCompletionHandler(@NInt long state,
            @NotNull @ObjCBlock(name = "call_setConnectionStateCompletionHandler") Block_setConnectionStateCompletionHandler completionHandler);

    @NotNull
    @Generated
    @Selector("title")
    public native String title();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_clearBadgeForPlayersCompletionHandler {
        @Generated
        void call_clearBadgeForPlayersCompletionHandler(@Nullable NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_createSessionInContainerWithTitleMaxConnectedPlayersCompletionHandler {
        @Generated
        void call_createSessionInContainerWithTitleMaxConnectedPlayersCompletionHandler(@Nullable GKGameSession session,
                @Nullable NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_getShareURLWithCompletionHandler {
        @Generated
        void call_getShareURLWithCompletionHandler(@Nullable NSURL url, @Nullable NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_loadDataWithCompletionHandler {
        @Generated
        void call_loadDataWithCompletionHandler(@Nullable NSData data, @Nullable NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_loadSessionWithIdentifierCompletionHandler {
        @Generated
        void call_loadSessionWithIdentifierCompletionHandler(@Nullable GKGameSession session, @Nullable NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_loadSessionsInContainerCompletionHandler {
        @Generated
        void call_loadSessionsInContainerCompletionHandler(@Nullable NSArray<? extends GKGameSession> sessions,
                @Nullable NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_removeSessionWithIdentifierCompletionHandler {
        @Generated
        void call_removeSessionWithIdentifierCompletionHandler(@Nullable NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_saveDataCompletionHandler {
        @Generated
        void call_saveDataCompletionHandler(@Nullable NSData conflictingData, @Nullable NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_sendDataWithTransportTypeCompletionHandler {
        @Generated
        void call_sendDataWithTransportTypeCompletionHandler(@Nullable NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_sendMessageWithLocalizedFormatKeyArgumentsDataToPlayersBadgePlayersCompletionHandler {
        @Generated
        void call_sendMessageWithLocalizedFormatKeyArgumentsDataToPlayersBadgePlayersCompletionHandler(
                @Nullable NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setConnectionStateCompletionHandler {
        @Generated
        void call_setConnectionStateCompletionHandler(@Nullable NSError error);
    }

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}

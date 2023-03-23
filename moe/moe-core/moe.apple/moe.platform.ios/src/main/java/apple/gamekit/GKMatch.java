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
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.gamekit.protocol.GKMatchDelegate;
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
import org.moe.natj.general.ann.ReferenceInfo;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * GKMatch represents an active networking sessions between players. It handles network communications and can report
 * player connection status. All matches are created by a GKMatchmaker.
 * 
 * API-Since: 4.1
 */
@Generated
@Library("GameKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class GKMatch extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected GKMatch(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native GKMatch alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native GKMatch allocWithZone(VoidPtr zone);

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

    @Generated
    @Owned
    @Selector("new")
    public static native GKMatch new_objc();

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
     * This method is obsolete. It will never be invoked and its implementation does nothing**
     * 
     * API-Since: 6.0
     * Deprecated-Since: 8.0
     * Deprecated-Message: This is never invoked and its implementation does nothing, use
     * chooseBestHostingPlayerWithCompletionHandler:
     */
    @Generated
    @Deprecated
    @Selector("chooseBestHostPlayerWithCompletionHandler:")
    public native void chooseBestHostPlayerWithCompletionHandler(
            @ObjCBlock(name = "call_chooseBestHostPlayerWithCompletionHandler") Block_chooseBestHostPlayerWithCompletionHandler completionHandler);

    /**
     * Choose the best host from among the connected players using gathered estimates for bandwidth and packet loss.
     * This is intended for applications that wish to implement a client-server model on top of the match. The returned
     * player ID will be nil if the best host cannot currently be determined (e.g. players are still connecting).
     * 
     * API-Since: 8.0
     */
    @Generated
    @Selector("chooseBestHostingPlayerWithCompletionHandler:")
    public native void chooseBestHostingPlayerWithCompletionHandler(
            @ObjCBlock(name = "call_chooseBestHostingPlayerWithCompletionHandler") Block_chooseBestHostingPlayerWithCompletionHandler completionHandler);

    /**
     * all the GKPlayers in the match
     */
    @Generated
    @Selector("delegate")
    @MappedReturn(ObjCObjectMapper.class)
    public native GKMatchDelegate delegate();

    /**
     * Disconnect the match. This will show all other players in the match that the local player has disconnected. This
     * should be called before releasing the match instance.
     */
    @Generated
    @Selector("disconnect")
    public native void disconnect();

    @Generated
    @Selector("expectedPlayerCount")
    @NUInt
    public native long expectedPlayerCount();

    @Generated
    @Selector("init")
    public native GKMatch init();

    /**
     * NSStrings of player identifiers in the match
     * 
     * API-Since: 4.1
     * Deprecated-Since: 8.0
     * Deprecated-Message: This is never invoked and its implementation does nothing, use players instead.
     */
    @Generated
    @Deprecated
    @Selector("playerIDs")
    public native NSArray<String> playerIDs();

    /**
     * API-Since: 8.0
     */
    @Generated
    @Selector("players")
    public native NSArray<? extends GKPlayer> players();

    /**
     * Automatching to recreate a previous peer-to-peer match that became disconnected. A new match with the same set of
     * players will be returned by the completion handler. All players should perform this when the match has ended for
     * automatching to succeed. Error will be nil on success.
     * Possible reasons for error:
     * 1. Communications failure
     * 2. Timeout
     * 
     * API-Since: 6.0
     */
    @Generated
    @Selector("rematchWithCompletionHandler:")
    public native void rematchWithCompletionHandler(
            @ObjCBlock(name = "call_rematchWithCompletionHandler") Block_rematchWithCompletionHandler completionHandler);

    /**
     * Asynchronously send data to one or more GKPlayers. Returns YES if delivery started, NO if unable to start sending
     * and error will be set.
     * 
     * API-Since: 8.0
     */
    @Generated
    @Selector("sendData:toPlayers:dataMode:error:")
    public native boolean sendDataToPlayersDataModeError(NSData data, NSArray<? extends GKPlayer> players,
            @NInt long mode, @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * This method is obsolete. It will never be invoked and its implementation does nothing**
     * 
     * API-Since: 4.1
     * Deprecated-Since: 8.0
     * Deprecated-Message: This is never invoked and its implementation does nothing, use
     * sendData:toPlayers:dataMode:error:
     */
    @Generated
    @Deprecated
    @Selector("sendData:toPlayers:withDataMode:error:")
    public native boolean sendDataToPlayersWithDataModeError(NSData data, NSArray<String> playerIDs, @NInt long mode,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * Asynchronously broadcasts data to all players. Returns YES if delivery started, NO if unable to start sending and
     * error will be set.
     */
    @Generated
    @Selector("sendDataToAllPlayers:withDataMode:error:")
    public native boolean sendDataToAllPlayersWithDataModeError(NSData data, @NInt long mode,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * all the GKPlayers in the match
     */
    @Generated
    @Selector("setDelegate:")
    public native void setDelegate_unsafe(@Mapped(ObjCObjectMapper.class) GKMatchDelegate value);

    /**
     * all the GKPlayers in the match
     */
    @Generated
    public void setDelegate(@Mapped(ObjCObjectMapper.class) GKMatchDelegate value) {
        Object __old = delegate();
        if (value != null) {
            org.moe.natj.objc.ObjCRuntime.associateObjCObject(this, value);
        }
        setDelegate_unsafe(value);
        if (__old != null) {
            org.moe.natj.objc.ObjCRuntime.dissociateObjCObject(this, __old);
        }
    }

    /**
     * Join a named voice chat channel
     * Will return nil if parental controls are turned on
     */
    @Generated
    @Selector("voiceChatWithName:")
    public native GKVoiceChat voiceChatWithName(String name);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_chooseBestHostPlayerWithCompletionHandler {
        @Generated
        void call_chooseBestHostPlayerWithCompletionHandler(String playerID);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_chooseBestHostingPlayerWithCompletionHandler {
        @Generated
        void call_chooseBestHostingPlayerWithCompletionHandler(GKPlayer player);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_rematchWithCompletionHandler {
        @Generated
        void call_rematchWithCompletionHandler(GKMatch match, NSError error);
    }
}

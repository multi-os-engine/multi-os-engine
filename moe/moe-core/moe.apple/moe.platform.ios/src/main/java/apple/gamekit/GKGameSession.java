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

    @Generated
    @Selector("addEventListener:")
    public static native void addEventListener(NSObject listener);

    @Generated
    @Owned
    @Selector("alloc")
    public static native GKGameSession alloc();

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
    @Selector("createSessionInContainer:withTitle:maxConnectedPlayers:completionHandler:")
    public static native void createSessionInContainerWithTitleMaxConnectedPlayersCompletionHandler(
            String containerName, String title, @NInt long maxPlayers,
            @ObjCBlock(name = "call_createSessionInContainerWithTitleMaxConnectedPlayersCompletionHandler") Block_createSessionInContainerWithTitleMaxConnectedPlayersCompletionHandler completionHandler);

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
    @Selector("loadSessionWithIdentifier:completionHandler:")
    public static native void loadSessionWithIdentifierCompletionHandler(String identifier,
            @ObjCBlock(name = "call_loadSessionWithIdentifierCompletionHandler") Block_loadSessionWithIdentifierCompletionHandler completionHandler);

    @Generated
    @Selector("loadSessionsInContainer:completionHandler:")
    public static native void loadSessionsInContainerCompletionHandler(String containerName,
            @ObjCBlock(name = "call_loadSessionsInContainerCompletionHandler") Block_loadSessionsInContainerCompletionHandler completionHandler);

    @Generated
    @Owned
    @Selector("new")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object new_objc();

    @Generated
    @Selector("removeEventListener:")
    public static native void removeEventListener(NSObject listener);

    @Generated
    @Selector("removeSessionWithIdentifier:completionHandler:")
    public static native void removeSessionWithIdentifierCompletionHandler(String identifier,
            @ObjCBlock(name = "call_removeSessionWithIdentifierCompletionHandler") Block_removeSessionWithIdentifierCompletionHandler completionHandler);

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
    @Selector("badgedPlayers")
    public native NSArray<? extends GKCloudPlayer> badgedPlayers();

    @Generated
    @Selector("clearBadgeForPlayers:completionHandler:")
    public native void clearBadgeForPlayersCompletionHandler(NSArray<? extends GKCloudPlayer> players,
            @ObjCBlock(name = "call_clearBadgeForPlayersCompletionHandler") Block_clearBadgeForPlayersCompletionHandler completionHandler);

    @Generated
    @Selector("getShareURLWithCompletionHandler:")
    public native void getShareURLWithCompletionHandler(
            @ObjCBlock(name = "call_getShareURLWithCompletionHandler") Block_getShareURLWithCompletionHandler completionHandler);

    @Generated
    @Selector("identifier")
    public native String identifier();

    @Generated
    @Selector("init")
    public native GKGameSession init();

    @Generated
    @Selector("lastModifiedDate")
    public native NSDate lastModifiedDate();

    @Generated
    @Selector("lastModifiedPlayer")
    public native GKCloudPlayer lastModifiedPlayer();

    @Generated
    @Selector("loadDataWithCompletionHandler:")
    public native void loadDataWithCompletionHandler(
            @ObjCBlock(name = "call_loadDataWithCompletionHandler") Block_loadDataWithCompletionHandler completionHandler);

    @Generated
    @Selector("maxNumberOfConnectedPlayers")
    @NInt
    public native long maxNumberOfConnectedPlayers();

    @Generated
    @Selector("owner")
    public native GKCloudPlayer owner();

    @Generated
    @Selector("players")
    public native NSArray<? extends GKCloudPlayer> players();

    @Generated
    @Selector("playersWithConnectionState:")
    public native NSArray<? extends GKCloudPlayer> playersWithConnectionState(@NInt long state);

    @Generated
    @Selector("saveData:completionHandler:")
    public native void saveDataCompletionHandler(NSData data,
            @ObjCBlock(name = "call_saveDataCompletionHandler") Block_saveDataCompletionHandler completionHandler);

    @Generated
    @Selector("sendData:withTransportType:completionHandler:")
    public native void sendDataWithTransportTypeCompletionHandler(NSData data, @NInt long transport,
            @ObjCBlock(name = "call_sendDataWithTransportTypeCompletionHandler") Block_sendDataWithTransportTypeCompletionHandler completionHandler);

    @Generated
    @Selector("sendMessageWithLocalizedFormatKey:arguments:data:toPlayers:badgePlayers:completionHandler:")
    public native void sendMessageWithLocalizedFormatKeyArgumentsDataToPlayersBadgePlayersCompletionHandler(String key,
            NSArray<String> arguments, NSData data, NSArray<? extends GKCloudPlayer> players, boolean badgePlayers,
            @ObjCBlock(name = "call_sendMessageWithLocalizedFormatKeyArgumentsDataToPlayersBadgePlayersCompletionHandler") Block_sendMessageWithLocalizedFormatKeyArgumentsDataToPlayersBadgePlayersCompletionHandler completionHandler);

    @Generated
    @Selector("setConnectionState:completionHandler:")
    public native void setConnectionStateCompletionHandler(@NInt long state,
            @ObjCBlock(name = "call_setConnectionStateCompletionHandler") Block_setConnectionStateCompletionHandler completionHandler);

    @Generated
    @Selector("title")
    public native String title();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_clearBadgeForPlayersCompletionHandler {
        @Generated
        void call_clearBadgeForPlayersCompletionHandler(NSError arg0);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_createSessionInContainerWithTitleMaxConnectedPlayersCompletionHandler {
        @Generated
        void call_createSessionInContainerWithTitleMaxConnectedPlayersCompletionHandler(GKGameSession arg0,
                NSError arg1);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_getShareURLWithCompletionHandler {
        @Generated
        void call_getShareURLWithCompletionHandler(NSURL arg0, NSError arg1);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_loadDataWithCompletionHandler {
        @Generated
        void call_loadDataWithCompletionHandler(NSData arg0, NSError arg1);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_loadSessionWithIdentifierCompletionHandler {
        @Generated
        void call_loadSessionWithIdentifierCompletionHandler(GKGameSession arg0, NSError arg1);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_loadSessionsInContainerCompletionHandler {
        @Generated
        void call_loadSessionsInContainerCompletionHandler(NSArray<? extends GKGameSession> arg0, NSError arg1);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_removeSessionWithIdentifierCompletionHandler {
        @Generated
        void call_removeSessionWithIdentifierCompletionHandler(NSError arg0);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_saveDataCompletionHandler {
        @Generated
        void call_saveDataCompletionHandler(NSData arg0, NSError arg1);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_sendDataWithTransportTypeCompletionHandler {
        @Generated
        void call_sendDataWithTransportTypeCompletionHandler(NSError arg0);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_sendMessageWithLocalizedFormatKeyArgumentsDataToPlayersBadgePlayersCompletionHandler {
        @Generated
        void call_sendMessageWithLocalizedFormatKeyArgumentsDataToPlayersBadgePlayersCompletionHandler(NSError arg0);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setConnectionStateCompletionHandler {
        @Generated
        void call_setConnectionStateCompletionHandler(NSError arg0);
    }
}

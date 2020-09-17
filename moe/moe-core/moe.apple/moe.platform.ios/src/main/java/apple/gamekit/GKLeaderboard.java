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
import apple.foundation.NSDate;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.struct.NSRange;
import apple.uikit.UIImage;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
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
public class GKLeaderboard extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected GKLeaderboard(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native GKLeaderboard alloc();

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
    @Deprecated
    @Selector("loadCategoriesWithCompletionHandler:")
    public static native void loadCategoriesWithCompletionHandler(
            @ObjCBlock(name = "call_loadCategoriesWithCompletionHandler") Block_loadCategoriesWithCompletionHandler completionHandler);

    @Generated
    @Selector("loadLeaderboardsWithCompletionHandler:")
    public static native void loadLeaderboardsWithCompletionHandler(
            @ObjCBlock(name = "call_loadLeaderboardsWithCompletionHandler") Block_loadLeaderboardsWithCompletionHandler completionHandler);

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
    @Deprecated
    @Selector("setDefaultLeaderboard:withCompletionHandler:")
    public static native void setDefaultLeaderboardWithCompletionHandler(String leaderboardIdentifier,
            @ObjCBlock(name = "call_setDefaultLeaderboardWithCompletionHandler") Block_setDefaultLeaderboardWithCompletionHandler completionHandler);

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
    @Deprecated
    @Selector("category")
    public native String category();

    @Generated
    @Selector("groupIdentifier")
    public native String groupIdentifier();

    @Generated
    @Selector("identifier")
    public native String identifier();

    @Generated
    @Selector("init")
    public native GKLeaderboard init();

    @Generated
    @Deprecated
    @Selector("initWithPlayerIDs:")
    public native GKLeaderboard initWithPlayerIDs(NSArray<String> playerIDs);

    @Generated
    @Selector("initWithPlayers:")
    public native GKLeaderboard initWithPlayers(NSArray<? extends GKPlayer> players);

    @Generated
    @Selector("isLoading")
    public native boolean isLoading();

    @Generated
    @Selector("loadImageWithCompletionHandler:")
    public native void loadImageWithCompletionHandler(
            @ObjCBlock(name = "call_loadImageWithCompletionHandler") Block_loadImageWithCompletionHandler completionHandler);

    @Generated
    @Selector("loadScoresWithCompletionHandler:")
    public native void loadScoresWithCompletionHandler(
            @ObjCBlock(name = "call_loadScoresWithCompletionHandler") Block_loadScoresWithCompletionHandler completionHandler);

    @Generated
    @Selector("localPlayerScore")
    public native GKScore localPlayerScore();

    @Generated
    @Selector("maxRange")
    @NUInt
    public native long maxRange();

    @Generated
    @Selector("playerScope")
    @NInt
    public native long playerScope();

    @Generated
    @Selector("range")
    @ByValue
    public native NSRange range();

    @Generated
    @Selector("scores")
    public native NSArray<? extends GKScore> scores();

    @Generated
    @Deprecated
    @Selector("setCategory:")
    public native void setCategory(String value);

    @Generated
    @Selector("setIdentifier:")
    public native void setIdentifier(String value);

    @Generated
    @Selector("setPlayerScope:")
    public native void setPlayerScope(@NInt long value);

    @Generated
    @Selector("setRange:")
    public native void setRange(@ByValue NSRange value);

    @Generated
    @Selector("setTimeScope:")
    public native void setTimeScope(@NInt long value);

    @Generated
    @Selector("timeScope")
    @NInt
    public native long timeScope();

    @Generated
    @Selector("title")
    public native String title();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_loadCategoriesWithCompletionHandler {
        @Generated
        void call_loadCategoriesWithCompletionHandler(NSArray<String> categories, NSArray<String> titles,
                NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_loadImageWithCompletionHandler {
        @Generated
        void call_loadImageWithCompletionHandler(UIImage image, NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_loadLeaderboardsWithCompletionHandler {
        @Generated
        void call_loadLeaderboardsWithCompletionHandler(NSArray<? extends GKLeaderboard> leaderboards, NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_loadScoresWithCompletionHandler {
        @Generated
        void call_loadScoresWithCompletionHandler(NSArray<? extends GKScore> scores, NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setDefaultLeaderboardWithCompletionHandler {
        @Generated
        void call_setDefaultLeaderboardWithCompletionHandler(NSError error);
    }

    @Generated
    @Selector("baseLeaderboardID")
    public native String baseLeaderboardID();

    @Generated
    @Selector("duration")
    public native double duration();

    @Generated
    @Selector("loadEntriesForPlayerScope:timeScope:range:completionHandler:")
    public native void loadEntriesForPlayerScopeTimeScopeRangeCompletionHandler(@NInt long playerScope,
            @NInt long timeScope, @ByValue NSRange range,
            @ObjCBlock(name = "call_loadEntriesForPlayerScopeTimeScopeRangeCompletionHandler") Block_loadEntriesForPlayerScopeTimeScopeRangeCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_loadEntriesForPlayerScopeTimeScopeRangeCompletionHandler {
        @Generated
        void call_loadEntriesForPlayerScopeTimeScopeRangeCompletionHandler(GKLeaderboardEntry localPlayerEntry,
                NSArray<? extends GKLeaderboardEntry> entries, @NInt long totalPlayerCount, NSError error);
    }

    @Generated
    @Selector("loadEntriesForPlayers:timeScope:completionHandler:")
    public native void loadEntriesForPlayersTimeScopeCompletionHandler(NSArray<? extends GKPlayer> players,
            @NInt long timeScope,
            @ObjCBlock(name = "call_loadEntriesForPlayersTimeScopeCompletionHandler") Block_loadEntriesForPlayersTimeScopeCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_loadEntriesForPlayersTimeScopeCompletionHandler {
        @Generated
        void call_loadEntriesForPlayersTimeScopeCompletionHandler(GKLeaderboardEntry localPlayerEntry,
                NSArray<? extends GKLeaderboardEntry> entries, NSError error);
    }

    @Generated
    @Selector("loadLeaderboardsWithIDs:completionHandler:")
    public static native void loadLeaderboardsWithIDsCompletionHandler(NSArray<String> leaderboardIDs,
            @ObjCBlock(name = "call_loadLeaderboardsWithIDsCompletionHandler") Block_loadLeaderboardsWithIDsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_loadLeaderboardsWithIDsCompletionHandler {
        @Generated
        void call_loadLeaderboardsWithIDsCompletionHandler(NSArray<? extends GKLeaderboard> leaderboards,
                NSError error);
    }

    @Generated
    @Selector("loadPreviousOccurrenceWithCompletionHandler:")
    public native void loadPreviousOccurrenceWithCompletionHandler(
            @ObjCBlock(name = "call_loadPreviousOccurrenceWithCompletionHandler") Block_loadPreviousOccurrenceWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_loadPreviousOccurrenceWithCompletionHandler {
        @Generated
        void call_loadPreviousOccurrenceWithCompletionHandler(GKLeaderboard leaderboard, NSError error);
    }

    @Generated
    @Selector("nextStartDate")
    public native NSDate nextStartDate();

    @Generated
    @Selector("startDate")
    public native NSDate startDate();

    @Generated
    @Selector("submitScore:context:player:completionHandler:")
    public native void submitScoreContextPlayerCompletionHandler(@NInt long score, @NUInt long context, GKPlayer player,
            @ObjCBlock(name = "call_submitScoreContextPlayerCompletionHandler") Block_submitScoreContextPlayerCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_submitScoreContextPlayerCompletionHandler {
        @Generated
        void call_submitScoreContextPlayerCompletionHandler(NSError error);
    }

    @Generated
    @Selector("submitScore:context:player:leaderboardIDs:completionHandler:")
    public static native void submitScoreContextPlayerLeaderboardIDsCompletionHandler(@NInt long score,
            @NUInt long context, GKPlayer player, NSArray<String> leaderboardIDs,
            @ObjCBlock(name = "call_submitScoreContextPlayerLeaderboardIDsCompletionHandler") Block_submitScoreContextPlayerLeaderboardIDsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_submitScoreContextPlayerLeaderboardIDsCompletionHandler {
        @Generated
        void call_submitScoreContextPlayerLeaderboardIDsCompletionHandler(NSError error);
    }

    @Generated
    @Selector("type")
    @NInt
    public native long type();
}

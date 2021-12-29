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
import apple.foundation.NSCoder;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSCoding;
import apple.foundation.protocol.NSSecureCoding;
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
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * GKLeaderboardSet represents the sets that leaderboards can be broken out into.
 */
@Generated
@Library("GameKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class GKLeaderboardSet extends NSObject implements NSCoding, NSSecureCoding {
    static {
        NatJ.register();
    }

    @Generated
    protected GKLeaderboardSet(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native GKLeaderboardSet alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native GKLeaderboardSet allocWithZone(VoidPtr zone);

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

    /**
     * Loads array with all sets for game
     * Possible reasons for error:
     * 1. Communications problem
     * 2. Unauthenticated player
     * 3. Set not present
     */
    @Generated
    @Selector("loadLeaderboardSetsWithCompletionHandler:")
    public static native void loadLeaderboardSetsWithCompletionHandler(
            @ObjCBlock(name = "call_loadLeaderboardSetsWithCompletionHandler") Block_loadLeaderboardSetsWithCompletionHandler completionHandler);

    @Generated
    @Owned
    @Selector("new")
    public static native GKLeaderboardSet new_objc();

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
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(NSCoder coder);

    /**
     * set when leaderboardSets have been designated a game group; set when loadLeaderboardSetsWithCompletionHandler has been called for leaderboards that support game groups
     */
    @Generated
    @Selector("groupIdentifier")
    public native String groupIdentifier();

    /**
     * leaderboard set.
     */
    @Generated
    @Selector("identifier")
    public native String identifier();

    @Generated
    @Selector("init")
    public native GKLeaderboardSet init();

    @Generated
    @Selector("initWithCoder:")
    public native GKLeaderboardSet initWithCoder(NSCoder coder);

    @Generated
    @Selector("loadImageWithCompletionHandler:")
    public native void loadImageWithCompletionHandler(
            @ObjCBlock(name = "call_loadImageWithCompletionHandler") Block_loadImageWithCompletionHandler completionHandler);

    /**
     * Loads array with all leaderboards for the leaderboardSet
     * Possible reasons for error:
     * 1. Communications problem
     * 2. Unauthenticated player
     */
    @Generated
    @Selector("loadLeaderboardsWithCompletionHandler:")
    public native void loadLeaderboardsWithCompletionHandler(
            @ObjCBlock(name = "call_loadLeaderboardsWithCompletionHandler") Block_loadLeaderboardsWithCompletionHandler completionHandler);

    /**
     * leaderboard set.
     */
    @Generated
    @Selector("setIdentifier:")
    public native void setIdentifier(String value);

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    /**
     * Localized set title.
     */
    @Generated
    @Selector("title")
    public native String title();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_loadImageWithCompletionHandler {
        @Generated
        void call_loadImageWithCompletionHandler(UIImage image, NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_loadLeaderboardSetsWithCompletionHandler {
        @Generated
        void call_loadLeaderboardSetsWithCompletionHandler(NSArray<? extends GKLeaderboardSet> leaderboardSets,
                NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_loadLeaderboardsWithCompletionHandler {
        @Generated
        void call_loadLeaderboardsWithCompletionHandler(NSArray<? extends GKLeaderboard> leaderboards, NSError error);
    }

    /**
     * Loads array with all classic leaderboards and current instances of recurring leaderboards for this leaderboardSet
     * Possible reasons for error:
     * 1. Communications problem
     * 2. Unauthenticated player
     */
    @Generated
    @Selector("loadLeaderboardsWithHandler:")
    public native void loadLeaderboardsWithHandler(
            @ObjCBlock(name = "call_loadLeaderboardsWithHandler") Block_loadLeaderboardsWithHandler handler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_loadLeaderboardsWithHandler {
        @Generated
        void call_loadLeaderboardsWithHandler(NSArray<? extends GKLeaderboard> leaderboards, NSError error);
    }
}

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
import apple.gamekit.protocol.GKGameCenterControllerDelegate;
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

@Generated
@Library("GameKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class GKGameCenterViewController extends UINavigationController {
    static {
        NatJ.register();
    }

    @Generated
    protected GKGameCenterViewController(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native GKGameCenterViewController alloc();

    @Generated
    @Selector("allocWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object allocWithZone(VoidPtr zone);

    @Generated
    @Selector("attemptRotationToDeviceOrientation")
    public static native void attemptRotationToDeviceOrientation();

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
    @Selector("clearTextInputContextIdentifier:")
    public static native void clearTextInputContextIdentifier(String identifier);

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
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @Generated
    @Selector("gameCenterDelegate")
    @MappedReturn(ObjCObjectMapper.class)
    public native GKGameCenterControllerDelegate gameCenterDelegate();

    @Generated
    @Selector("init")
    public native GKGameCenterViewController init();

    @Generated
    @Selector("initWithCoder:")
    public native GKGameCenterViewController initWithCoder(NSCoder coder);

    @Generated
    @Selector("initWithNavigationBarClass:toolbarClass:")
    public native GKGameCenterViewController initWithNavigationBarClassToolbarClass(Class navigationBarClass,
            Class toolbarClass);

    @Generated
    @Selector("initWithNibName:bundle:")
    public native GKGameCenterViewController initWithNibNameBundle(String nibNameOrNil, NSBundle nibBundleOrNil);

    @Generated
    @Selector("initWithRootViewController:")
    public native GKGameCenterViewController initWithRootViewController(UIViewController rootViewController);

    @Generated
    @Deprecated
    @Selector("leaderboardCategory")
    public native String leaderboardCategory();

    @Generated
    @Selector("leaderboardIdentifier")
    public native String leaderboardIdentifier();

    @Generated
    @Selector("leaderboardTimeScope")
    @NInt
    public native long leaderboardTimeScope();

    @Generated
    @Selector("setGameCenterDelegate:")
    public native void setGameCenterDelegate_unsafe(
            @Mapped(ObjCObjectMapper.class) GKGameCenterControllerDelegate value);

    @Generated
    public void setGameCenterDelegate(@Mapped(ObjCObjectMapper.class) GKGameCenterControllerDelegate value) {
        Object __old = gameCenterDelegate();
        if (value != null) {
            org.moe.natj.objc.ObjCRuntime.associateObjCObject(this, value);
        }
        setGameCenterDelegate_unsafe(value);
        if (__old != null) {
            org.moe.natj.objc.ObjCRuntime.dissociateObjCObject(this, __old);
        }
    }

    @Generated
    @Deprecated
    @Selector("setLeaderboardCategory:")
    public native void setLeaderboardCategory(String value);

    @Generated
    @Selector("setLeaderboardIdentifier:")
    public native void setLeaderboardIdentifier(String value);

    @Generated
    @Selector("setLeaderboardTimeScope:")
    public native void setLeaderboardTimeScope(@NInt long value);

    @Generated
    @Selector("setViewState:")
    public native void setViewState(@NInt long value);

    @Generated
    @Selector("viewState")
    @NInt
    public native long viewState();

    /**
     * Use this to display the details associated with the specified achievementID
     */
    @Generated
    @Selector("initWithAchievementID:")
    public native GKGameCenterViewController initWithAchievementID(String achievementID);

    /**
     * Use this to display the scores for the specified leaderboard and player scope. Both classic and recurring leaderboards can use this method to initialize the view with their scores.
     */
    @Generated
    @Selector("initWithLeaderboard:playerScope:")
    public native GKGameCenterViewController initWithLeaderboardPlayerScope(GKLeaderboard leaderboard,
            @NInt long playerScope);

    /**
     * Use this to display the scores for the specified leaderboardID, player scope and time scope. The time scope is only applicable to classic leaderboards. Recurring leaderboards will always be displayed initially with the results (scores) associated with the current instance of the leaderboard.
     */
    @Generated
    @Selector("initWithLeaderboardID:playerScope:timeScope:")
    public native GKGameCenterViewController initWithLeaderboardIDPlayerScopeTimeScope(String leaderboardID,
            @NInt long playerScope, @NInt long timeScope);

    /**
     * Use this to display content associated with the specified state. For example setting the state to GKGameCenterViewControllerStateLeaderboards will display a list of leaderboard sets or leaderboards (if no sets). Setting state to GKGameCenterViewControllerStateAchievements will display a list of achievements.
     */
    @Generated
    @Selector("initWithState:")
    public native GKGameCenterViewController initWithState(@NInt long state);
}

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
import apple.gamekit.protocol.GKLeaderboardViewControllerDelegate;
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

/**
 * View controller that provides the standard user interface for leaderboards. Present modally from the top view
 * controller.
 * 
 * API-Since: 4.1
 * Deprecated-Since: 7.0
 */
@Deprecated
@Generated
@Library("GameKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class GKLeaderboardViewController extends GKGameCenterViewController {
    static {
        NatJ.register();
    }

    @Generated
    protected GKLeaderboardViewController(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native GKLeaderboardViewController alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native GKLeaderboardViewController allocWithZone(VoidPtr zone);

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
    public static native GKLeaderboardViewController new_objc();

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
    @Selector("category")
    public native String category();

    @Generated
    @Selector("init")
    public native GKLeaderboardViewController init();

    @Generated
    @Selector("initWithCoder:")
    public native GKLeaderboardViewController initWithCoder(@NotNull NSCoder coder);

    @Generated
    @Selector("initWithNavigationBarClass:toolbarClass:")
    public native GKLeaderboardViewController initWithNavigationBarClassToolbarClass(@Nullable Class navigationBarClass,
            @Nullable Class toolbarClass);

    @Generated
    @Selector("initWithNibName:bundle:")
    public native GKLeaderboardViewController initWithNibNameBundle(@Nullable String nibNameOrNil,
            @Nullable NSBundle nibBundleOrNil);

    @Generated
    @Selector("initWithRootViewController:")
    public native GKLeaderboardViewController initWithRootViewController(@NotNull UIViewController rootViewController);

    @Generated
    @Selector("leaderboardDelegate")
    @MappedReturn(ObjCObjectMapper.class)
    public native GKLeaderboardViewControllerDelegate leaderboardDelegate();

    @Generated
    @Selector("setCategory:")
    public native void setCategory(String value);

    @Generated
    @Selector("setLeaderboardDelegate:")
    public native void setLeaderboardDelegate_unsafe(
            @Mapped(ObjCObjectMapper.class) GKLeaderboardViewControllerDelegate value);

    @Generated
    public void setLeaderboardDelegate(@Mapped(ObjCObjectMapper.class) GKLeaderboardViewControllerDelegate value) {
        Object __old = leaderboardDelegate();
        if (value != null) {
            org.moe.natj.objc.ObjCRuntime.associateObjCObject(this, value);
        }
        setLeaderboardDelegate_unsafe(value);
        if (__old != null) {
            org.moe.natj.objc.ObjCRuntime.dissociateObjCObject(this, __old);
        }
    }

    @Generated
    @Selector("setTimeScope:")
    public native void setTimeScope(@NInt long value);

    @Generated
    @Selector("timeScope")
    @NInt
    public native long timeScope();

    @Generated
    @Selector("initWithAchievementID:")
    public native GKLeaderboardViewController initWithAchievementID(@NotNull String achievementID);

    @Generated
    @Selector("initWithLeaderboard:playerScope:")
    public native GKLeaderboardViewController initWithLeaderboardPlayerScope(@NotNull GKLeaderboard leaderboard,
            @NInt long playerScope);

    @Generated
    @Selector("initWithLeaderboardID:playerScope:timeScope:")
    public native GKLeaderboardViewController initWithLeaderboardIDPlayerScopeTimeScope(@NotNull String leaderboardID,
            @NInt long playerScope, @NInt long timeScope);

    @Generated
    @Selector("initWithState:")
    public native GKLeaderboardViewController initWithState(@NInt long state);

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}

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

package apple.uikit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
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
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import apple.corefoundation.struct.CGRect;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * API-Since: 3.0
 * Deprecated-Since: 16.0
 * Deprecated-Message: UIMenuController is deprecated. Use UIEditMenuInteraction instead.
 */
@Deprecated
@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class UIMenuController extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected UIMenuController(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native UIMenuController alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native UIMenuController allocWithZone(VoidPtr zone);

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

    @Generated
    @Owned
    @Selector("new")
    public static native UIMenuController new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @NotNull
    @Generated
    @Selector("sharedMenuController")
    public static native UIMenuController sharedMenuController();

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * default is UIMenuControllerArrowDefault
     * 
     * API-Since: 3.2
     */
    @Generated
    @Selector("arrowDirection")
    @NInt
    public native long arrowDirection();

    @Generated
    @Selector("init")
    public native UIMenuController init();

    /**
     * default is NO
     */
    @Generated
    @Selector("isMenuVisible")
    public native boolean isMenuVisible();

    /**
     * API-Since: 3.0
     * Deprecated-Since: 13.0
     * Deprecated-Message: Use showMenuFromView:rect: or hideMenuFromView: instead.
     */
    @Deprecated
    @Generated
    @Selector("setMenuVisible:")
    public native void setMenuVisible(boolean menuVisible);

    @Generated
    @Selector("menuFrame")
    @ByValue
    public native CGRect menuFrame();

    /**
     * default is nil. these are in addition to the standard items
     * 
     * API-Since: 3.2
     */
    @Nullable
    @Generated
    @Selector("menuItems")
    public native NSArray<? extends UIMenuItem> menuItems();

    /**
     * default is UIMenuControllerArrowDefault
     * 
     * API-Since: 3.2
     */
    @Generated
    @Selector("setArrowDirection:")
    public native void setArrowDirection(@NInt long value);

    /**
     * default is nil. these are in addition to the standard items
     * 
     * API-Since: 3.2
     */
    @Generated
    @Selector("setMenuItems:")
    public native void setMenuItems(@Nullable NSArray<? extends UIMenuItem> value);

    /**
     * API-Since: 3.0
     * Deprecated-Since: 13.0
     * Deprecated-Message: Use showMenuFromView:rect: or hideMenuFromView: instead.
     */
    @Deprecated
    @Generated
    @Selector("setMenuVisible:animated:")
    public native void setMenuVisibleAnimated(boolean menuVisible, boolean animated);

    /**
     * API-Since: 3.0
     * Deprecated-Since: 13.0
     * Deprecated-Message: Use showMenuFromView:rect: instead.
     */
    @Deprecated
    @Generated
    @Selector("setTargetRect:inView:")
    public native void setTargetRectInView(@ByValue CGRect targetRect, @NotNull UIView targetView);

    @Generated
    @Selector("update")
    public native void update();

    /**
     * API-Since: 13.0
     */
    @Generated
    @Selector("hideMenu")
    public native void hideMenu();

    /**
     * API-Since: 13.0
     */
    @Generated
    @Selector("hideMenuFromView:")
    public native void hideMenuFromView(@NotNull UIView targetView);

    /**
     * API-Since: 13.0
     */
    @Generated
    @Selector("showMenuFromView:rect:")
    public native void showMenuFromViewRect(@NotNull UIView targetView, @ByValue CGRect targetRect);
}

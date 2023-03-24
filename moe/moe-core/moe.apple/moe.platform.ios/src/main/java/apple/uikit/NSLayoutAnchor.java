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
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.NFloat;
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
 * An NSLayoutAnchor represents an edge or dimension of a layout item. Its concrete subclasses allow concise creation of
 * constraints. The idea is that instead of invoking +[NSLayoutConstraint constraintWithItem: attribute: relatedBy:
 * toItem: attribute: multiplier: constant:] directly, you can instead do something like this:
 * 
 * [myView.topAnchor constraintEqualToAnchor:otherView.topAnchor constant:10];
 * 
 * The -constraint* methods are available in multiple flavors to support use of different relations and omission of
 * unused options.
 * 
 * 
 * API-Since: 9.0
 */
@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSLayoutAnchor<_AnchorType> extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected NSLayoutAnchor(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSLayoutAnchor<?> alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native NSLayoutAnchor<?> allocWithZone(VoidPtr zone);

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
    public static native NSLayoutAnchor<?> new_objc();

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
     * These methods return an inactive constraint of the form thisAnchor = otherAnchor.
     */
    @NotNull
    @Generated
    @Selector("constraintEqualToAnchor:")
    public native NSLayoutConstraint constraintEqualToAnchor(@NotNull NSLayoutAnchor<_AnchorType> anchor);

    /**
     * These methods return an inactive constraint of the form thisAnchor = otherAnchor + constant.
     */
    @NotNull
    @Generated
    @Selector("constraintEqualToAnchor:constant:")
    public native NSLayoutConstraint constraintEqualToAnchorConstant(@NotNull NSLayoutAnchor<_AnchorType> anchor,
            @NFloat double c);

    @NotNull
    @Generated
    @Selector("constraintGreaterThanOrEqualToAnchor:")
    public native NSLayoutConstraint constraintGreaterThanOrEqualToAnchor(@NotNull NSLayoutAnchor<_AnchorType> anchor);

    @NotNull
    @Generated
    @Selector("constraintGreaterThanOrEqualToAnchor:constant:")
    public native NSLayoutConstraint constraintGreaterThanOrEqualToAnchorConstant(
            @NotNull NSLayoutAnchor<_AnchorType> anchor, @NFloat double c);

    @NotNull
    @Generated
    @Selector("constraintLessThanOrEqualToAnchor:")
    public native NSLayoutConstraint constraintLessThanOrEqualToAnchor(@NotNull NSLayoutAnchor<_AnchorType> anchor);

    @NotNull
    @Generated
    @Selector("constraintLessThanOrEqualToAnchor:constant:")
    public native NSLayoutConstraint constraintLessThanOrEqualToAnchorConstant(
            @NotNull NSLayoutAnchor<_AnchorType> anchor, @NFloat double c);

    @Generated
    @Selector("init")
    public native NSLayoutAnchor<?> init();
}

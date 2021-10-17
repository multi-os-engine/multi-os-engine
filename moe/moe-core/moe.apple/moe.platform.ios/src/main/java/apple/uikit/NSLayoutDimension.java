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

/**
 * This layout anchor subclass is used for sizes (width & height).
 */
@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSLayoutDimension extends NSLayoutAnchor<NSLayoutDimension> {
    static {
        NatJ.register();
    }

    @Generated
    protected NSLayoutDimension(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSLayoutDimension alloc();

    @Generated
    @Selector("allocWithZone:")
    public static native NSLayoutDimension allocWithZone(VoidPtr zone);

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
    public static native NSLayoutDimension new_objc();

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
     * These methods return an inactive constraint of the form thisAnchor = otherAnchor * multiplier.
     */
    @Generated
    @Selector("constraintEqualToAnchor:multiplier:")
    public native NSLayoutConstraint constraintEqualToAnchorMultiplier(NSLayoutDimension anchor, @NFloat double m);

    /**
     * These methods return an inactive constraint of the form thisAnchor = otherAnchor * multiplier + constant.
     */
    @Generated
    @Selector("constraintEqualToAnchor:multiplier:constant:")
    public native NSLayoutConstraint constraintEqualToAnchorMultiplierConstant(NSLayoutDimension anchor,
            @NFloat double m, @NFloat double c);

    /**
     * These methods return an inactive constraint of the form thisVariable = constant.
     */
    @Generated
    @Selector("constraintEqualToConstant:")
    public native NSLayoutConstraint constraintEqualToConstant(@NFloat double c);

    @Generated
    @Selector("constraintGreaterThanOrEqualToAnchor:multiplier:")
    public native NSLayoutConstraint constraintGreaterThanOrEqualToAnchorMultiplier(NSLayoutDimension anchor,
            @NFloat double m);

    @Generated
    @Selector("constraintGreaterThanOrEqualToAnchor:multiplier:constant:")
    public native NSLayoutConstraint constraintGreaterThanOrEqualToAnchorMultiplierConstant(NSLayoutDimension anchor,
            @NFloat double m, @NFloat double c);

    @Generated
    @Selector("constraintGreaterThanOrEqualToConstant:")
    public native NSLayoutConstraint constraintGreaterThanOrEqualToConstant(@NFloat double c);

    @Generated
    @Selector("constraintLessThanOrEqualToAnchor:multiplier:")
    public native NSLayoutConstraint constraintLessThanOrEqualToAnchorMultiplier(NSLayoutDimension anchor,
            @NFloat double m);

    @Generated
    @Selector("constraintLessThanOrEqualToAnchor:multiplier:constant:")
    public native NSLayoutConstraint constraintLessThanOrEqualToAnchorMultiplierConstant(NSLayoutDimension anchor,
            @NFloat double m, @NFloat double c);

    @Generated
    @Selector("constraintLessThanOrEqualToConstant:")
    public native NSLayoutConstraint constraintLessThanOrEqualToConstant(@NFloat double c);

    @Generated
    @Selector("init")
    public native NSLayoutDimension init();
}

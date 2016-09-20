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
import org.moe.natj.general.ann.MappedReturn;
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
    @Owned
    @Selector("alloc")
    public static native NSLayoutDimension alloc();

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

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
    public static native void setVersion(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * constraintEqualToAnchor:multiplier:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AppKit/Reference/NSLayoutDimension_ClassReference/index.html#//apple_ref/occ/instm/NSLayoutDimension/constraintEqualToAnchor:multiplier:">iOS Dev Center</a>
     */
    @Generated
    @Selector("constraintEqualToAnchor:multiplier:")
    public native NSLayoutConstraint constraintEqualToAnchorMultiplier(NSLayoutDimension anchor, @NFloat double m);

    /**
     * constraintEqualToAnchor:multiplier:constant:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AppKit/Reference/NSLayoutDimension_ClassReference/index.html#//apple_ref/occ/instm/NSLayoutDimension/constraintEqualToAnchor:multiplier:constant:">iOS Dev Center</a>
     */
    @Generated
    @Selector("constraintEqualToAnchor:multiplier:constant:")
    public native NSLayoutConstraint constraintEqualToAnchorMultiplierConstant(NSLayoutDimension anchor,
            @NFloat double m, @NFloat double c);

    /**
     * constraintEqualToConstant:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AppKit/Reference/NSLayoutDimension_ClassReference/index.html#//apple_ref/occ/instm/NSLayoutDimension/constraintEqualToConstant:">iOS Dev Center</a>
     */
    @Generated
    @Selector("constraintEqualToConstant:")
    public native NSLayoutConstraint constraintEqualToConstant(@NFloat double c);

    /**
     * constraintGreaterThanOrEqualToAnchor:multiplier:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AppKit/Reference/NSLayoutDimension_ClassReference/index.html#//apple_ref/occ/instm/NSLayoutDimension/constraintGreaterThanOrEqualToAnchor:multiplier:">iOS Dev Center</a>
     */
    @Generated
    @Selector("constraintGreaterThanOrEqualToAnchor:multiplier:")
    public native NSLayoutConstraint constraintGreaterThanOrEqualToAnchorMultiplier(NSLayoutDimension anchor,
            @NFloat double m);

    /**
     * constraintGreaterThanOrEqualToAnchor:multiplier:constant:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AppKit/Reference/NSLayoutDimension_ClassReference/index.html#//apple_ref/occ/instm/NSLayoutDimension/constraintGreaterThanOrEqualToAnchor:multiplier:constant:">iOS Dev Center</a>
     */
    @Generated
    @Selector("constraintGreaterThanOrEqualToAnchor:multiplier:constant:")
    public native NSLayoutConstraint constraintGreaterThanOrEqualToAnchorMultiplierConstant(NSLayoutDimension anchor,
            @NFloat double m, @NFloat double c);

    /**
     * constraintGreaterThanOrEqualToConstant:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AppKit/Reference/NSLayoutDimension_ClassReference/index.html#//apple_ref/occ/instm/NSLayoutDimension/constraintGreaterThanOrEqualToConstant:">iOS Dev Center</a>
     */
    @Generated
    @Selector("constraintGreaterThanOrEqualToConstant:")
    public native NSLayoutConstraint constraintGreaterThanOrEqualToConstant(@NFloat double c);

    /**
     * constraintLessThanOrEqualToAnchor:multiplier:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AppKit/Reference/NSLayoutDimension_ClassReference/index.html#//apple_ref/occ/instm/NSLayoutDimension/constraintLessThanOrEqualToAnchor:multiplier:">iOS Dev Center</a>
     */
    @Generated
    @Selector("constraintLessThanOrEqualToAnchor:multiplier:")
    public native NSLayoutConstraint constraintLessThanOrEqualToAnchorMultiplier(NSLayoutDimension anchor,
            @NFloat double m);

    /**
     * constraintLessThanOrEqualToAnchor:multiplier:constant:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AppKit/Reference/NSLayoutDimension_ClassReference/index.html#//apple_ref/occ/instm/NSLayoutDimension/constraintLessThanOrEqualToAnchor:multiplier:constant:">iOS Dev Center</a>
     */
    @Generated
    @Selector("constraintLessThanOrEqualToAnchor:multiplier:constant:")
    public native NSLayoutConstraint constraintLessThanOrEqualToAnchorMultiplierConstant(NSLayoutDimension anchor,
            @NFloat double m, @NFloat double c);

    /**
     * constraintLessThanOrEqualToConstant:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AppKit/Reference/NSLayoutDimension_ClassReference/index.html#//apple_ref/occ/instm/NSLayoutDimension/constraintLessThanOrEqualToConstant:">iOS Dev Center</a>
     */
    @Generated
    @Selector("constraintLessThanOrEqualToConstant:")
    public native NSLayoutConstraint constraintLessThanOrEqualToConstant(@NFloat double c);

    @Generated
    @Selector("init")
    public native NSLayoutDimension init();
}

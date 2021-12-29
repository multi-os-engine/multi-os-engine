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
import apple.coregraphics.struct.CGPoint;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
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

@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class UIPanGestureRecognizer extends UIGestureRecognizer {
    static {
        NatJ.register();
    }

    @Generated
    protected UIPanGestureRecognizer(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native UIPanGestureRecognizer alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native UIPanGestureRecognizer allocWithZone(VoidPtr zone);

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
    public static native UIPanGestureRecognizer new_objc();

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
    @Selector("init")
    public native UIPanGestureRecognizer init();

    @Generated
    @Selector("initWithTarget:action:")
    public native UIPanGestureRecognizer initWithTargetAction(@Mapped(ObjCObjectMapper.class) Object target,
            SEL action);

    /**
     * default is UINT_MAX. the maximum number of touches that can be down
     */
    @Generated
    @Selector("maximumNumberOfTouches")
    @NUInt
    public native long maximumNumberOfTouches();

    /**
     * default is 1. the minimum number of touches required to match
     */
    @Generated
    @Selector("minimumNumberOfTouches")
    @NUInt
    public native long minimumNumberOfTouches();

    /**
     * default is UINT_MAX. the maximum number of touches that can be down
     */
    @Generated
    @Selector("setMaximumNumberOfTouches:")
    public native void setMaximumNumberOfTouches(@NUInt long value);

    /**
     * default is 1. the minimum number of touches required to match
     */
    @Generated
    @Selector("setMinimumNumberOfTouches:")
    public native void setMinimumNumberOfTouches(@NUInt long value);

    @Generated
    @Selector("setTranslation:inView:")
    public native void setTranslationInView(@ByValue CGPoint translation, UIView view);

    /**
     * translation in the coordinate system of the specified view
     */
    @Generated
    @Selector("translationInView:")
    @ByValue
    public native CGPoint translationInView(UIView view);

    /**
     * velocity of the pan in points/second in the coordinate system of the specified view
     */
    @Generated
    @Selector("velocityInView:")
    @ByValue
    public native CGPoint velocityInView(UIView view);

    @Generated
    @Selector("initWithCoder:")
    public native UIPanGestureRecognizer initWithCoder(NSCoder coder);

    @Generated
    @Selector("allowedScrollTypesMask")
    @NInt
    public native long allowedScrollTypesMask();

    @Generated
    @Selector("setAllowedScrollTypesMask:")
    public native void setAllowedScrollTypesMask(@NInt long value);
}

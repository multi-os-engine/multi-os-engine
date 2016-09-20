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
import apple.foundation.NSMethodSignature;
import apple.foundation.NSNumber;
import apple.foundation.NSSet;
import apple.uikit.protocol.UIGestureRecognizerDelegate;
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
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class UIGestureRecognizer extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected UIGestureRecognizer(Pointer peer) {
        super(peer);
    }

    @Generated
    @Owned
    @Selector("alloc")
    public static native UIGestureRecognizer alloc();

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
    public static native long version();

    /**
     * addTarget:action:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIGestureRecognizer_Class/index.html#//apple_ref/occ/instm/UIGestureRecognizer/addTarget:action:">iOS Dev Center</a>
     */
    @Generated
    @Selector("addTarget:action:")
    public native void addTargetAction(@Mapped(ObjCObjectMapper.class) Object target, SEL action);

    /**
     * cancelsTouchesInView</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIGestureRecognizer_Class/index.html#//apple_ref/occ/instp/UIGestureRecognizer/cancelsTouchesInView">iOS Dev Center</a>
     */
    @Generated
    @Selector("cancelsTouchesInView")
    public native boolean cancelsTouchesInView();

    /**
     * delaysTouchesBegan</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIGestureRecognizer_Class/index.html#//apple_ref/occ/instp/UIGestureRecognizer/delaysTouchesBegan">iOS Dev Center</a>
     */
    @Generated
    @Selector("delaysTouchesBegan")
    public native boolean delaysTouchesBegan();

    /**
     * delaysTouchesEnded</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIGestureRecognizer_Class/index.html#//apple_ref/occ/instp/UIGestureRecognizer/delaysTouchesEnded">iOS Dev Center</a>
     */
    @Generated
    @Selector("delaysTouchesEnded")
    public native boolean delaysTouchesEnded();

    /**
     * delegate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIGestureRecognizer_Class/index.html#//apple_ref/occ/instp/UIGestureRecognizer/delegate">iOS Dev Center</a>
     */
    @Generated
    @Selector("delegate")
    @MappedReturn(ObjCObjectMapper.class)
    public native UIGestureRecognizerDelegate delegate();

    @Generated
    @Selector("init")
    public native UIGestureRecognizer init();

    /**
     * initWithTarget:action:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIGestureRecognizer_Class/index.html#//apple_ref/occ/instm/UIGestureRecognizer/initWithTarget:action:">iOS Dev Center</a>
     */
    @Generated
    @Selector("initWithTarget:action:")
    public native UIGestureRecognizer initWithTargetAction(@Mapped(ObjCObjectMapper.class) Object target, SEL action);

    /**
     * enabled</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIGestureRecognizer_Class/index.html#//apple_ref/occ/instp/UIGestureRecognizer/enabled">iOS Dev Center</a>
     */
    @Generated
    @Selector("isEnabled")
    public native boolean isEnabled();

    /**
     * enabled</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIGestureRecognizer_Class/index.html#//apple_ref/occ/instp/UIGestureRecognizer/enabled">iOS Dev Center</a>
     */
    @Generated
    @Selector("setEnabled:")
    public native void setEnabled(boolean value);

    /**
     * locationInView:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIGestureRecognizer_Class/index.html#//apple_ref/occ/instm/UIGestureRecognizer/locationInView:">iOS Dev Center</a>
     */
    @Generated
    @Selector("locationInView:")
    @ByValue
    public native CGPoint locationInView(UIView view);

    /**
     * locationOfTouch:inView:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIGestureRecognizer_Class/index.html#//apple_ref/occ/instm/UIGestureRecognizer/locationOfTouch:inView:">iOS Dev Center</a>
     */
    @Generated
    @Selector("locationOfTouch:inView:")
    @ByValue
    public native CGPoint locationOfTouchInView(@NUInt long touchIndex, UIView view);

    /**
     * numberOfTouches</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIGestureRecognizer_Class/index.html#//apple_ref/occ/instm/UIGestureRecognizer/numberOfTouches">iOS Dev Center</a>
     */
    @Generated
    @Selector("numberOfTouches")
    @NUInt
    public native long numberOfTouches();

    /**
     * removeTarget:action:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIGestureRecognizer_Class/index.html#//apple_ref/occ/instm/UIGestureRecognizer/removeTarget:action:">iOS Dev Center</a>
     */
    @Generated
    @Selector("removeTarget:action:")
    public native void removeTargetAction(@Mapped(ObjCObjectMapper.class) Object target, SEL action);

    /**
     * requireGestureRecognizerToFail:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIGestureRecognizer_Class/index.html#//apple_ref/occ/instm/UIGestureRecognizer/requireGestureRecognizerToFail:">iOS Dev Center</a>
     */
    @Generated
    @Selector("requireGestureRecognizerToFail:")
    public native void requireGestureRecognizerToFail(UIGestureRecognizer otherGestureRecognizer);

    /**
     * cancelsTouchesInView</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIGestureRecognizer_Class/index.html#//apple_ref/occ/instp/UIGestureRecognizer/cancelsTouchesInView">iOS Dev Center</a>
     */
    @Generated
    @Selector("setCancelsTouchesInView:")
    public native void setCancelsTouchesInView(boolean value);

    /**
     * delaysTouchesBegan</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIGestureRecognizer_Class/index.html#//apple_ref/occ/instp/UIGestureRecognizer/delaysTouchesBegan">iOS Dev Center</a>
     */
    @Generated
    @Selector("setDelaysTouchesBegan:")
    public native void setDelaysTouchesBegan(boolean value);

    /**
     * delaysTouchesEnded</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIGestureRecognizer_Class/index.html#//apple_ref/occ/instp/UIGestureRecognizer/delaysTouchesEnded">iOS Dev Center</a>
     */
    @Generated
    @Selector("setDelaysTouchesEnded:")
    public native void setDelaysTouchesEnded(boolean value);

    /**
     * delegate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIGestureRecognizer_Class/index.html#//apple_ref/occ/instp/UIGestureRecognizer/delegate">iOS Dev Center</a>
     */
    @Generated
    @Selector("setDelegate:")
    public native void setDelegate_unsafe(@Mapped(ObjCObjectMapper.class) UIGestureRecognizerDelegate value);

    /**
     * delegate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIGestureRecognizer_Class/index.html#//apple_ref/occ/instp/UIGestureRecognizer/delegate">iOS Dev Center</a>
     */
    @Generated
    public void setDelegate(@Mapped(ObjCObjectMapper.class) UIGestureRecognizerDelegate value) {
        Object __old = delegate();
        if (value != null) {
            org.moe.natj.objc.ObjCRuntime.associateObjCObject(this, value);
        }
        setDelegate_unsafe(value);
        if (__old != null) {
            org.moe.natj.objc.ObjCRuntime.dissociateObjCObject(this, __old);
        }
    }

    /**
     * state</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIGestureRecognizer_Class/index.html#//apple_ref/occ/instp/UIGestureRecognizer/state">iOS Dev Center</a>
     */
    @Generated
    @Selector("state")
    @NInt
    public native long state();

    /**
     * view</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIGestureRecognizer_Class/index.html#//apple_ref/occ/instp/UIGestureRecognizer/view">iOS Dev Center</a>
     */
    @Generated
    @Selector("view")
    public native UIView view();

    /**
     * allowedPressTypes</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIGestureRecognizer_Class/index.html#//apple_ref/occ/instp/UIGestureRecognizer/allowedPressTypes">iOS Dev Center</a>
     */
    @Generated
    @Selector("allowedPressTypes")
    public native NSArray<? extends NSNumber> allowedPressTypes();

    /**
     * allowedTouchTypes</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIGestureRecognizer_Class/index.html#//apple_ref/occ/instp/UIGestureRecognizer/allowedTouchTypes">iOS Dev Center</a>
     */
    @Generated
    @Selector("allowedTouchTypes")
    public native NSArray<? extends NSNumber> allowedTouchTypes();

    /**
     * allowedPressTypes</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIGestureRecognizer_Class/index.html#//apple_ref/occ/instp/UIGestureRecognizer/allowedPressTypes">iOS Dev Center</a>
     */
    @Generated
    @Selector("setAllowedPressTypes:")
    public native void setAllowedPressTypes(NSArray<? extends NSNumber> value);

    /**
     * allowedTouchTypes</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIGestureRecognizer_Class/index.html#//apple_ref/occ/instp/UIGestureRecognizer/allowedTouchTypes">iOS Dev Center</a>
     */
    @Generated
    @Selector("setAllowedTouchTypes:")
    public native void setAllowedTouchTypes(NSArray<? extends NSNumber> value);
}

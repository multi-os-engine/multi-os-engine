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
import apple.foundation.NSCoder;
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
import apple.corefoundation.struct.CGPoint;

/**
 * API-Since: 3.2
 */
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
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native UIGestureRecognizer alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native UIGestureRecognizer allocWithZone(VoidPtr zone);

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
    public static native UIGestureRecognizer new_objc();

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
     * add a target/action pair. you can call this multiple times to specify multiple target/actions
     */
    @Generated
    @Selector("addTarget:action:")
    public native void addTargetAction(@Mapped(ObjCObjectMapper.class) Object target, SEL action);

    /**
     * Array of UIPressTypes as NSNumbers.
     * 
     * API-Since: 9.0
     */
    @Generated
    @Selector("allowedPressTypes")
    public native NSArray<? extends NSNumber> allowedPressTypes();

    /**
     * Array of UITouchTypes as NSNumbers.
     * 
     * API-Since: 9.0
     */
    @Generated
    @Selector("allowedTouchTypes")
    public native NSArray<? extends NSNumber> allowedTouchTypes();

    /**
     * default is YES. causes touchesCancelled:withEvent: or pressesCancelled:withEvent: to be sent to the view for all
     * touches or presses recognized as part of this gesture immediately before the action method is called.
     */
    @Generated
    @Selector("cancelsTouchesInView")
    public native boolean cancelsTouchesInView();

    /**
     * default is NO. causes all touch or press events to be delivered to the target view only after this gesture has
     * failed recognition. set to YES to prevent views from processing any touches or presses that may be recognized as
     * part of this gesture
     */
    @Generated
    @Selector("delaysTouchesBegan")
    public native boolean delaysTouchesBegan();

    /**
     * default is YES. causes touchesEnded or pressesEnded events to be delivered to the target view only after this
     * gesture has failed recognition. this ensures that a touch or press that is part of the gesture can be cancelled
     * if the gesture is recognized
     */
    @Generated
    @Selector("delaysTouchesEnded")
    public native boolean delaysTouchesEnded();

    /**
     * the gesture recognizer's delegate
     */
    @Generated
    @Selector("delegate")
    @MappedReturn(ObjCObjectMapper.class)
    public native UIGestureRecognizerDelegate delegate();

    @Generated
    @Selector("init")
    public native UIGestureRecognizer init();

    /**
     * designated initializer
     */
    @Generated
    @Selector("initWithTarget:action:")
    public native UIGestureRecognizer initWithTargetAction(@Mapped(ObjCObjectMapper.class) Object target, SEL action);

    /**
     * default is YES. disabled gesture recognizers will not receive touches. when changed to NO the gesture recognizer
     * will be cancelled if it's currently recognizing a gesture
     */
    @Generated
    @Selector("isEnabled")
    public native boolean isEnabled();

    /**
     * default is YES. disabled gesture recognizers will not receive touches. when changed to NO the gesture recognizer
     * will be cancelled if it's currently recognizing a gesture
     */
    @Generated
    @Selector("setEnabled:")
    public native void setEnabled(boolean value);

    /**
     * a generic single-point location for the gesture. usually the centroid of the touches involved
     */
    @Generated
    @Selector("locationInView:")
    @ByValue
    public native CGPoint locationInView(UIView view);

    /**
     * the location of a particular touch
     */
    @Generated
    @Selector("locationOfTouch:inView:")
    @ByValue
    public native CGPoint locationOfTouchInView(@NUInt long touchIndex, UIView view);

    /**
     * number of touches involved for which locations can be queried
     */
    @Generated
    @Selector("numberOfTouches")
    @NUInt
    public native long numberOfTouches();

    /**
     * remove the specified target/action pair. passing nil for target matches all targets, and the same for actions
     */
    @Generated
    @Selector("removeTarget:action:")
    public native void removeTargetAction(@Mapped(ObjCObjectMapper.class) Object target, SEL action);

    /**
     * create a relationship with another gesture recognizer that will prevent this gesture's actions from being called
     * until otherGestureRecognizer transitions to UIGestureRecognizerStateFailed
     * if otherGestureRecognizer transitions to UIGestureRecognizerStateRecognized or UIGestureRecognizerStateBegan then
     * this recognizer will instead transition to UIGestureRecognizerStateFailed
     * example usage: a single tap may require a double tap to fail
     */
    @Generated
    @Selector("requireGestureRecognizerToFail:")
    public native void requireGestureRecognizerToFail(UIGestureRecognizer otherGestureRecognizer);

    /**
     * defaults to YES
     * 
     * API-Since: 9.2
     */
    @Generated
    @Selector("requiresExclusiveTouchType")
    public native boolean requiresExclusiveTouchType();

    /**
     * Array of UIPressTypes as NSNumbers.
     * 
     * API-Since: 9.0
     */
    @Generated
    @Selector("setAllowedPressTypes:")
    public native void setAllowedPressTypes(NSArray<? extends NSNumber> value);

    /**
     * Array of UITouchTypes as NSNumbers.
     * 
     * API-Since: 9.0
     */
    @Generated
    @Selector("setAllowedTouchTypes:")
    public native void setAllowedTouchTypes(NSArray<? extends NSNumber> value);

    /**
     * default is YES. causes touchesCancelled:withEvent: or pressesCancelled:withEvent: to be sent to the view for all
     * touches or presses recognized as part of this gesture immediately before the action method is called.
     */
    @Generated
    @Selector("setCancelsTouchesInView:")
    public native void setCancelsTouchesInView(boolean value);

    /**
     * default is NO. causes all touch or press events to be delivered to the target view only after this gesture has
     * failed recognition. set to YES to prevent views from processing any touches or presses that may be recognized as
     * part of this gesture
     */
    @Generated
    @Selector("setDelaysTouchesBegan:")
    public native void setDelaysTouchesBegan(boolean value);

    /**
     * default is YES. causes touchesEnded or pressesEnded events to be delivered to the target view only after this
     * gesture has failed recognition. this ensures that a touch or press that is part of the gesture can be cancelled
     * if the gesture is recognized
     */
    @Generated
    @Selector("setDelaysTouchesEnded:")
    public native void setDelaysTouchesEnded(boolean value);

    /**
     * the gesture recognizer's delegate
     */
    @Generated
    @Selector("setDelegate:")
    public native void setDelegate_unsafe(@Mapped(ObjCObjectMapper.class) UIGestureRecognizerDelegate value);

    /**
     * the gesture recognizer's delegate
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
     * defaults to YES
     * 
     * API-Since: 9.2
     */
    @Generated
    @Selector("setRequiresExclusiveTouchType:")
    public native void setRequiresExclusiveTouchType(boolean value);

    /**
     * the current state of the gesture recognizer
     */
    @Generated
    @Selector("state")
    @NInt
    public native long state();

    /**
     * the view the gesture is attached to. set by adding the recognizer to a UIView using the addGestureRecognizer:
     * method
     */
    @Generated
    @Selector("view")
    public native UIView view();

    /**
     * name for debugging to appear in logging
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("name")
    public native String name();

    /**
     * name for debugging to appear in logging
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("setName:")
    public native void setName(String value);

    @Generated
    @Selector("canBePreventedByGestureRecognizer:")
    public native boolean canBePreventedByGestureRecognizer(UIGestureRecognizer preventingGestureRecognizer);

    /**
     * same behavior as the equivalent delegate methods, but can be used by subclasses to define class-wide prevention
     * rules
     * for example, a UITapGestureRecognizer never prevents another UITapGestureRecognizer with a higher tap count
     */
    @Generated
    @Selector("canPreventGestureRecognizer:")
    public native boolean canPreventGestureRecognizer(UIGestureRecognizer preventedGestureRecognizer);

    /**
     * API-Since: 9.0
     */
    @Generated
    @Selector("ignorePress:forEvent:")
    public native void ignorePressForEvent(UIPress button, UIPressesEvent event);

    /**
     * if a touch isn't part of this gesture it can be passed to this method to be ignored. ignored touches won't be
     * cancelled on the view even if cancelsTouchesInView is YES
     */
    @Generated
    @Selector("ignoreTouch:forEvent:")
    public native void ignoreTouchForEvent(UITouch touch, UIEvent event);

    @Generated
    @Selector("initWithCoder:")
    public native UIGestureRecognizer initWithCoder(NSCoder coder);

    /**
     * API-Since: 9.0
     */
    @Generated
    @Selector("pressesBegan:withEvent:")
    public native void pressesBeganWithEvent(NSSet<? extends UIPress> presses, UIPressesEvent event);

    /**
     * API-Since: 9.0
     */
    @Generated
    @Selector("pressesCancelled:withEvent:")
    public native void pressesCancelledWithEvent(NSSet<? extends UIPress> presses, UIPressesEvent event);

    /**
     * API-Since: 9.0
     */
    @Generated
    @Selector("pressesChanged:withEvent:")
    public native void pressesChangedWithEvent(NSSet<? extends UIPress> presses, UIPressesEvent event);

    /**
     * API-Since: 9.0
     */
    @Generated
    @Selector("pressesEnded:withEvent:")
    public native void pressesEndedWithEvent(NSSet<? extends UIPress> presses, UIPressesEvent event);

    /**
     * called automatically by the runtime after the gesture state has been set to UIGestureRecognizerStateEnded
     * any internal state should be reset to prepare for a new attempt to recognize the gesture
     * after this is received all remaining active touches will be ignored (no further updates will be received for
     * touches that had already begun but haven't ended)
     */
    @Generated
    @Selector("reset")
    public native void reset();

    /**
     * the current state of the gesture recognizer. can only be set by subclasses of UIGestureRecognizer, but can be
     * read by consumers
     */
    @Generated
    @Selector("setState:")
    public native void setState(@NInt long value);

    /**
     * API-Since: 7.0
     */
    @Generated
    @Selector("shouldBeRequiredToFailByGestureRecognizer:")
    public native boolean shouldBeRequiredToFailByGestureRecognizer(UIGestureRecognizer otherGestureRecognizer);

    /**
     * same behavior as the equivalent delegate methods, but can be used by subclasses to define class-wide failure
     * requirements
     * 
     * API-Since: 7.0
     */
    @Generated
    @Selector("shouldRequireFailureOfGestureRecognizer:")
    public native boolean shouldRequireFailureOfGestureRecognizer(UIGestureRecognizer otherGestureRecognizer);

    /**
     * mirror of the touch-delivery methods on UIResponder
     * UIGestureRecognizers aren't in the responder chain, but observe touches hit-tested to their view and their view's
     * subviews
     * UIGestureRecognizers receive touches before the view to which the touch was hit-tested
     */
    @Generated
    @Selector("touchesBegan:withEvent:")
    public native void touchesBeganWithEvent(NSSet<? extends UITouch> touches, UIEvent event);

    @Generated
    @Selector("touchesCancelled:withEvent:")
    public native void touchesCancelledWithEvent(NSSet<? extends UITouch> touches, UIEvent event);

    @Generated
    @Selector("touchesEnded:withEvent:")
    public native void touchesEndedWithEvent(NSSet<? extends UITouch> touches, UIEvent event);

    /**
     * API-Since: 9.1
     */
    @Generated
    @Selector("touchesEstimatedPropertiesUpdated:")
    public native void touchesEstimatedPropertiesUpdated(NSSet<? extends UITouch> touches);

    @Generated
    @Selector("touchesMoved:withEvent:")
    public native void touchesMovedWithEvent(NSSet<? extends UITouch> touches, UIEvent event);

    /**
     * API-Since: 13.4
     */
    @Generated
    @Selector("buttonMask")
    @NInt
    public native long buttonMask();

    /**
     * Values from the last event processed.
     * These values are not considered as requirements for the gesture.
     * 
     * API-Since: 13.4
     */
    @Generated
    @Selector("modifierFlags")
    @NInt
    public native long modifierFlags();

    /**
     * same behavior as the equivalent delegate method
     * 
     * API-Since: 13.4
     */
    @Generated
    @Selector("shouldReceiveEvent:")
    public native boolean shouldReceiveEvent(UIEvent event);
}

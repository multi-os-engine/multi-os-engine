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
import apple.foundation.NSUndoManager;
import apple.foundation.NSUserActivity;
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
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class UIResponder extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected UIResponder(Pointer peer) {
        super(peer);
    }

    @Generated
    @Owned
    @Selector("alloc")
    public static native UIResponder alloc();

    /**
     * becomeFirstResponder</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIResponder_Class/index.html#//apple_ref/occ/instm/UIResponder/becomeFirstResponder">iOS Dev Center</a>
     */
    @Generated
    @Selector("becomeFirstResponder")
    public native boolean becomeFirstResponder();

    /**
     * canBecomeFirstResponder</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIResponder_Class/index.html#//apple_ref/occ/instm/UIResponder/canBecomeFirstResponder">iOS Dev Center</a>
     */
    @Generated
    @Selector("canBecomeFirstResponder")
    public native boolean canBecomeFirstResponder();

    /**
     * canPerformAction:withSender:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIResponder_Class/index.html#//apple_ref/occ/instm/UIResponder/canPerformAction:withSender:">iOS Dev Center</a>
     */
    @Generated
    @Selector("canPerformAction:withSender:")
    public native boolean canPerformActionWithSender(SEL action, @Mapped(ObjCObjectMapper.class) Object sender);

    /**
     * canResignFirstResponder</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIResponder_Class/index.html#//apple_ref/occ/instm/UIResponder/canResignFirstResponder">iOS Dev Center</a>
     */
    @Generated
    @Selector("canResignFirstResponder")
    public native boolean canResignFirstResponder();

    /**
     * clearTextInputContextIdentifier:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIResponder_Class/index.html#//apple_ref/occ/clm/UIResponder/clearTextInputContextIdentifier:">iOS Dev Center</a>
     */
    @Generated
    @Selector("clearTextInputContextIdentifier:")
    public static native void clearTextInputContextIdentifier(String identifier);

    @Generated
    @Selector("init")
    public native UIResponder init();

    /**
     * inputAccessoryView</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIResponder_Class/index.html#//apple_ref/occ/instp/UIResponder/inputAccessoryView">iOS Dev Center</a>
     */
    @Generated
    @Selector("inputAccessoryView")
    public native UIView inputAccessoryView();

    /**
     * inputAccessoryViewController</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIResponder_Class/index.html#//apple_ref/occ/instp/UIResponder/inputAccessoryViewController">iOS Dev Center</a>
     */
    @Generated
    @Selector("inputAccessoryViewController")
    public native UIInputViewController inputAccessoryViewController();

    /**
     * inputView</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIResponder_Class/index.html#//apple_ref/occ/instp/UIResponder/inputView">iOS Dev Center</a>
     */
    @Generated
    @Selector("inputView")
    public native UIView inputView();

    /**
     * inputViewController</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIResponder_Class/index.html#//apple_ref/occ/instp/UIResponder/inputViewController">iOS Dev Center</a>
     */
    @Generated
    @Selector("inputViewController")
    public native UIInputViewController inputViewController();

    /**
     * isFirstResponder</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIResponder_Class/index.html#//apple_ref/occ/instm/UIResponder/isFirstResponder">iOS Dev Center</a>
     */
    @Generated
    @Selector("isFirstResponder")
    public native boolean isFirstResponder();

    /**
     * keyCommands</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIResponder_Class/index.html#//apple_ref/occ/instp/UIResponder/keyCommands">iOS Dev Center</a>
     */
    @Generated
    @Selector("keyCommands")
    public native NSArray<? extends UIKeyCommand> keyCommands();

    /**
     * motionBegan:withEvent:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIResponder_Class/index.html#//apple_ref/occ/instm/UIResponder/motionBegan:withEvent:">iOS Dev Center</a>
     */
    @Generated
    @Selector("motionBegan:withEvent:")
    public native void motionBeganWithEvent(@NInt long motion, UIEvent event);

    /**
     * motionCancelled:withEvent:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIResponder_Class/index.html#//apple_ref/occ/instm/UIResponder/motionCancelled:withEvent:">iOS Dev Center</a>
     */
    @Generated
    @Selector("motionCancelled:withEvent:")
    public native void motionCancelledWithEvent(@NInt long motion, UIEvent event);

    /**
     * motionEnded:withEvent:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIResponder_Class/index.html#//apple_ref/occ/instm/UIResponder/motionEnded:withEvent:">iOS Dev Center</a>
     */
    @Generated
    @Selector("motionEnded:withEvent:")
    public native void motionEndedWithEvent(@NInt long motion, UIEvent event);

    /**
     * nextResponder</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIResponder_Class/index.html#//apple_ref/occ/instm/UIResponder/nextResponder">iOS Dev Center</a>
     */
    @Generated
    @Selector("nextResponder")
    public native UIResponder nextResponder();

    /**
     * reloadInputViews</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIResponder_Class/index.html#//apple_ref/occ/instm/UIResponder/reloadInputViews">iOS Dev Center</a>
     */
    @Generated
    @Selector("reloadInputViews")
    public native void reloadInputViews();

    /**
     * remoteControlReceivedWithEvent:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIResponder_Class/index.html#//apple_ref/occ/instm/UIResponder/remoteControlReceivedWithEvent:">iOS Dev Center</a>
     */
    @Generated
    @Selector("remoteControlReceivedWithEvent:")
    public native void remoteControlReceivedWithEvent(UIEvent event);

    /**
     * resignFirstResponder</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIResponder_Class/index.html#//apple_ref/occ/instm/UIResponder/resignFirstResponder">iOS Dev Center</a>
     */
    @Generated
    @Selector("resignFirstResponder")
    public native boolean resignFirstResponder();

    /**
     * restoreUserActivityState:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIResponder_Class/index.html#//apple_ref/occ/instm/UIResponder/restoreUserActivityState:">iOS Dev Center</a>
     */
    @Generated
    @Selector("restoreUserActivityState:")
    public native void restoreUserActivityState(NSUserActivity activity);

    /**
     * userActivity</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIResponder_Class/index.html#//apple_ref/occ/instp/UIResponder/userActivity">iOS Dev Center</a>
     */
    @Generated
    @Selector("setUserActivity:")
    public native void setUserActivity(NSUserActivity value);

    /**
     * targetForAction:withSender:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIResponder_Class/index.html#//apple_ref/occ/instm/UIResponder/targetForAction:withSender:">iOS Dev Center</a>
     */
    @Generated
    @Selector("targetForAction:withSender:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object targetForActionWithSender(SEL action, @Mapped(ObjCObjectMapper.class) Object sender);

    /**
     * textInputContextIdentifier</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIResponder_Class/index.html#//apple_ref/occ/instp/UIResponder/textInputContextIdentifier">iOS Dev Center</a>
     */
    @Generated
    @Selector("textInputContextIdentifier")
    public native String textInputContextIdentifier();

    /**
     * textInputMode</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIResponder_Class/index.html#//apple_ref/occ/instp/UIResponder/textInputMode">iOS Dev Center</a>
     */
    @Generated
    @Selector("textInputMode")
    public native UITextInputMode textInputMode();

    /**
     * touchesBegan:withEvent:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIResponder_Class/index.html#//apple_ref/occ/instm/UIResponder/touchesBegan:withEvent:">iOS Dev Center</a>
     */
    @Generated
    @Selector("touchesBegan:withEvent:")
    public native void touchesBeganWithEvent(NSSet<? extends UITouch> touches, UIEvent event);

    /**
     * touchesCancelled:withEvent:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIResponder_Class/index.html#//apple_ref/occ/instm/UIResponder/touchesCancelled:withEvent:">iOS Dev Center</a>
     */
    @Generated
    @Selector("touchesCancelled:withEvent:")
    public native void touchesCancelledWithEvent(NSSet<? extends UITouch> touches, UIEvent event);

    /**
     * touchesEnded:withEvent:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIResponder_Class/index.html#//apple_ref/occ/instm/UIResponder/touchesEnded:withEvent:">iOS Dev Center</a>
     */
    @Generated
    @Selector("touchesEnded:withEvent:")
    public native void touchesEndedWithEvent(NSSet<? extends UITouch> touches, UIEvent event);

    /**
     * touchesMoved:withEvent:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIResponder_Class/index.html#//apple_ref/occ/instm/UIResponder/touchesMoved:withEvent:">iOS Dev Center</a>
     */
    @Generated
    @Selector("touchesMoved:withEvent:")
    public native void touchesMovedWithEvent(NSSet<? extends UITouch> touches, UIEvent event);

    /**
     * undoManager</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIResponder_Class/index.html#//apple_ref/occ/instp/UIResponder/undoManager">iOS Dev Center</a>
     */
    @Generated
    @Selector("undoManager")
    public native NSUndoManager undoManager();

    /**
     * updateUserActivityState:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIResponder_Class/index.html#//apple_ref/occ/instm/UIResponder/updateUserActivityState:">iOS Dev Center</a>
     */
    @Generated
    @Selector("updateUserActivityState:")
    public native void updateUserActivityState(NSUserActivity activity);

    /**
     * userActivity</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIResponder_Class/index.html#//apple_ref/occ/instp/UIResponder/userActivity">iOS Dev Center</a>
     */
    @Generated
    @Selector("userActivity")
    public native NSUserActivity userActivity();

    /**
     * inputAssistantItem</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIResponder_Class/index.html#//apple_ref/occ/instp/UIResponder/inputAssistantItem">iOS Dev Center</a>
     */
    @Generated
    @Selector("inputAssistantItem")
    public native UITextInputAssistantItem inputAssistantItem();

    /**
     * pressesBegan:withEvent:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIResponder_Class/index.html#//apple_ref/occ/instm/UIResponder/pressesBegan:withEvent:">iOS Dev Center</a>
     */
    @Generated
    @Selector("pressesBegan:withEvent:")
    public native void pressesBeganWithEvent(NSSet<? extends UIPress> presses, UIPressesEvent event);

    /**
     * pressesCancelled:withEvent:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIResponder_Class/index.html#//apple_ref/occ/instm/UIResponder/pressesCancelled:withEvent:">iOS Dev Center</a>
     */
    @Generated
    @Selector("pressesCancelled:withEvent:")
    public native void pressesCancelledWithEvent(NSSet<? extends UIPress> presses, UIPressesEvent event);

    /**
     * pressesChanged:withEvent:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIResponder_Class/index.html#//apple_ref/occ/instm/UIResponder/pressesChanged:withEvent:">iOS Dev Center</a>
     */
    @Generated
    @Selector("pressesChanged:withEvent:")
    public native void pressesChangedWithEvent(NSSet<? extends UIPress> presses, UIPressesEvent event);

    /**
     * pressesEnded:withEvent:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIResponder_Class/index.html#//apple_ref/occ/instm/UIResponder/pressesEnded:withEvent:">iOS Dev Center</a>
     */
    @Generated
    @Selector("pressesEnded:withEvent:")
    public native void pressesEndedWithEvent(NSSet<? extends UIPress> presses, UIPressesEvent event);

    /**
     * touchesEstimatedPropertiesUpdated:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIResponder_Class/index.html#//apple_ref/occ/instm/UIResponder/touchesEstimatedPropertiesUpdated:">iOS Dev Center</a>
     */
    @Generated
    @Selector("touchesEstimatedPropertiesUpdated:")
    public native void touchesEstimatedPropertiesUpdated(NSSet<?> touches);

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
    public static native void load_objc();

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
}

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
import apple.foundation.NSItemProvider;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.NSUndoManager;
import apple.foundation.NSUserActivity;
import apple.uikit.protocol.UIActivityItemsConfigurationProviding;
import apple.uikit.protocol.UIActivityItemsConfigurationReading;
import apple.uikit.protocol.UIMenuBuilder;
import apple.uikit.protocol.UIPasteConfigurationSupporting;
import apple.uikit.protocol.UIResponderStandardEditActions;
import apple.uikit.protocol.UIUserActivityRestoring;
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
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class UIResponder extends NSObject
        implements UIResponderStandardEditActions, UIUserActivityRestoring, UIPasteConfigurationSupporting,
        UIActivityItemsConfigurationProviding {
    static {
        NatJ.register();
    }

    @Generated
    protected UIResponder(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native UIResponder alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native UIResponder allocWithZone(VoidPtr zone);

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

    /**
     * This call is to remove stored app identifier state that is no longer needed.
     */
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
    public static native UIResponder new_objc();

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
    @Selector("becomeFirstResponder")
    public native boolean becomeFirstResponder();

    /**
     * default is NO
     */
    @Generated
    @Selector("canBecomeFirstResponder")
    public native boolean canBecomeFirstResponder();

    @Generated
    @Selector("canPerformAction:withSender:")
    public native boolean canPerformActionWithSender(SEL action, @Mapped(ObjCObjectMapper.class) Object sender);

    /**
     * default is YES
     */
    @Generated
    @Selector("canResignFirstResponder")
    public native boolean canResignFirstResponder();

    @Generated
    @IsOptional
    @Selector("copy:")
    public native void copy(@Mapped(ObjCObjectMapper.class) Object sender);

    @Generated
    @IsOptional
    @Selector("cut:")
    public native void cut(@Mapped(ObjCObjectMapper.class) Object sender);

    @Generated
    @IsOptional
    @Selector("decreaseSize:")
    public native void decreaseSize(@Mapped(ObjCObjectMapper.class) Object sender);

    @Generated
    @IsOptional
    @Selector("delete:")
    public native void delete(@Mapped(ObjCObjectMapper.class) Object sender);

    @Generated
    @IsOptional
    @Selector("increaseSize:")
    public native void increaseSize(@Mapped(ObjCObjectMapper.class) Object sender);

    @Generated
    @Selector("init")
    public native UIResponder init();

    @Generated
    @Selector("inputAccessoryView")
    public native UIView inputAccessoryView();

    @Generated
    @Selector("inputAccessoryViewController")
    public native UIInputViewController inputAccessoryViewController();

    /**
     * This method is for clients that wish to put buttons on the Shortcuts Bar, shown on top of the keyboard.
     * You may modify the returned inputAssistantItem to add to or replace the existing items on the bar.
     * Modifications made to the returned UITextInputAssistantItem are reflected automatically.
     * This method should not be overridden. Goes up the responder chain.
     */
    @Generated
    @Selector("inputAssistantItem")
    public native UITextInputAssistantItem inputAssistantItem();

    /**
     * Called and presented when object becomes first responder.  Goes up the responder chain.
     */
    @Generated
    @Selector("inputView")
    public native UIView inputView();

    /**
     * For viewController equivalents of -inputView and -inputAccessoryView
     * Called and presented when object becomes first responder.  Goes up the responder chain.
     */
    @Generated
    @Selector("inputViewController")
    public native UIInputViewController inputViewController();

    @Generated
    @Selector("isFirstResponder")
    public native boolean isFirstResponder();

    /**
     * returns an array of UIKeyCommand objects<
     */
    @Generated
    @Selector("keyCommands")
    public native NSArray<? extends UIKeyCommand> keyCommands();

    @Generated
    @IsOptional
    @Selector("makeTextWritingDirectionLeftToRight:")
    public native void makeTextWritingDirectionLeftToRight(@Mapped(ObjCObjectMapper.class) Object sender);

    @Generated
    @IsOptional
    @Selector("makeTextWritingDirectionRightToLeft:")
    public native void makeTextWritingDirectionRightToLeft(@Mapped(ObjCObjectMapper.class) Object sender);

    @Generated
    @Selector("motionBegan:withEvent:")
    public native void motionBeganWithEvent(@NInt long motion, UIEvent event);

    @Generated
    @Selector("motionCancelled:withEvent:")
    public native void motionCancelledWithEvent(@NInt long motion, UIEvent event);

    @Generated
    @Selector("motionEnded:withEvent:")
    public native void motionEndedWithEvent(@NInt long motion, UIEvent event);

    @Generated
    @Selector("nextResponder")
    public native UIResponder nextResponder();

    @Generated
    @IsOptional
    @Selector("paste:")
    public native void paste(@Mapped(ObjCObjectMapper.class) Object sender);

    /**
     * Generally, all responders which do custom press handling should override all four of these methods.
     * Your responder will receive either pressesEnded:withEvent or pressesCancelled:withEvent: for each
     * press it is handling (those presses it received in pressesBegan:withEvent:).
     * pressesChanged:withEvent: will be invoked for presses that provide an analog value
     * (like thumbsticks or analog push buttons)
     * *** You must handle cancelled presses to ensure correct behavior in your application.  Failure to
     * do so is very likely to lead to incorrect behavior or crashes.
     */
    @Generated
    @Selector("pressesBegan:withEvent:")
    public native void pressesBeganWithEvent(NSSet<? extends UIPress> presses, UIPressesEvent event);

    @Generated
    @Selector("pressesCancelled:withEvent:")
    public native void pressesCancelledWithEvent(NSSet<? extends UIPress> presses, UIPressesEvent event);

    @Generated
    @Selector("pressesChanged:withEvent:")
    public native void pressesChangedWithEvent(NSSet<? extends UIPress> presses, UIPressesEvent event);

    @Generated
    @Selector("pressesEnded:withEvent:")
    public native void pressesEndedWithEvent(NSSet<? extends UIPress> presses, UIPressesEvent event);

    /**
     * If called while object is first responder, reloads inputView, inputAccessoryView, and textInputMode.  Otherwise ignored.
     */
    @Generated
    @Selector("reloadInputViews")
    public native void reloadInputViews();

    @Generated
    @Selector("remoteControlReceivedWithEvent:")
    public native void remoteControlReceivedWithEvent(UIEvent event);

    @Generated
    @Selector("resignFirstResponder")
    public native boolean resignFirstResponder();

    @Generated
    @Selector("restoreUserActivityState:")
    public native void restoreUserActivityState(NSUserActivity activity);

    @Generated
    @IsOptional
    @Selector("select:")
    public native void select(@Mapped(ObjCObjectMapper.class) Object sender);

    @Generated
    @IsOptional
    @Selector("selectAll:")
    public native void selectAll(@Mapped(ObjCObjectMapper.class) Object sender);

    @Generated
    @Selector("setUserActivity:")
    public native void setUserActivity(NSUserActivity value);

    /**
     * Allows an action to be forwarded to another target. By default checks -canPerformAction:withSender: to either return self, or go up the responder chain.
     */
    @Generated
    @Selector("targetForAction:withSender:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object targetForActionWithSender(SEL action, @Mapped(ObjCObjectMapper.class) Object sender);

    /**
     * When the first responder changes and an identifier is queried, the system will establish a context to
     * track the textInputMode automatically. The system will save and restore the state of that context to
     * the user defaults via the app identifier. Use of -textInputMode above will supersede use of -textInputContextIdentifier.
     */
    @Generated
    @Selector("textInputContextIdentifier")
    public native String textInputContextIdentifier();

    /**
     * When queried, returns the current UITextInputMode, from which the keyboard language can be determined.
     * When overridden it should return a previously-queried UITextInputMode object, which will attempt to be
     * set inside that app, but not persistently affect the user's system-wide keyboard settings.
     */
    @Generated
    @Selector("textInputMode")
    public native UITextInputMode textInputMode();

    @Generated
    @IsOptional
    @Selector("toggleBoldface:")
    public native void toggleBoldface(@Mapped(ObjCObjectMapper.class) Object sender);

    @Generated
    @IsOptional
    @Selector("toggleItalics:")
    public native void toggleItalics(@Mapped(ObjCObjectMapper.class) Object sender);

    @Generated
    @IsOptional
    @Selector("toggleUnderline:")
    public native void toggleUnderline(@Mapped(ObjCObjectMapper.class) Object sender);

    /**
     * Generally, all responders which do custom touch handling should override all four of these methods.
     * Your responder will receive either touchesEnded:withEvent: or touchesCancelled:withEvent: for each
     * touch it is handling (those touches it received in touchesBegan:withEvent:).
     * *** You must handle cancelled touches to ensure correct behavior in your application.  Failure to
     * do so is very likely to lead to incorrect behavior or crashes.
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

    @Generated
    @Selector("touchesEstimatedPropertiesUpdated:")
    public native void touchesEstimatedPropertiesUpdated(NSSet<? extends UITouch> touches);

    @Generated
    @Selector("touchesMoved:withEvent:")
    public native void touchesMovedWithEvent(NSSet<? extends UITouch> touches, UIEvent event);

    @Generated
    @Selector("undoManager")
    public native NSUndoManager undoManager();

    @Generated
    @Selector("updateUserActivityState:")
    public native void updateUserActivityState(NSUserActivity activity);

    @Generated
    @Selector("userActivity")
    public native NSUserActivity userActivity();

    @Generated
    @IsOptional
    @Selector("canPasteItemProviders:")
    public native boolean canPasteItemProviders(NSArray<? extends NSItemProvider> itemProviders);

    @Generated
    @Selector("pasteConfiguration")
    public native UIPasteConfiguration pasteConfiguration();

    @Generated
    @IsOptional
    @Selector("pasteItemProviders:")
    public native void pasteItemProviders(NSArray<? extends NSItemProvider> itemProviders);

    @Generated
    @Selector("setPasteConfiguration:")
    public native void setPasteConfiguration(UIPasteConfiguration value);

    @Generated
    @Selector("activityItemsConfiguration")
    @MappedReturn(ObjCObjectMapper.class)
    public native UIActivityItemsConfigurationReading activityItemsConfiguration();

    /**
     * Overrides for menu building and validation
     */
    @Generated
    @Selector("buildMenuWithBuilder:")
    public native void buildMenuWithBuilder(@Mapped(ObjCObjectMapper.class) UIMenuBuilder builder);

    /**
     * Productivity editing interaction support for undo/redo/cut/copy/paste gestures
     */
    @Generated
    @Selector("editingInteractionConfiguration")
    @NInt
    public native long editingInteractionConfiguration();

    @Generated
    @Selector("setActivityItemsConfiguration:")
    public native void setActivityItemsConfiguration(
            @Mapped(ObjCObjectMapper.class) UIActivityItemsConfigurationReading value);

    @Generated
    @IsOptional
    @Selector("updateTextAttributesWithConversionHandler:")
    public native void updateTextAttributesWithConversionHandler(
            @ObjCBlock(name = "call_updateTextAttributesWithConversionHandler") UIResponderStandardEditActions.Block_updateTextAttributesWithConversionHandler conversionHandler);

    @Generated
    @Selector("validateCommand:")
    public native void validateCommand(UICommand command);

    @Generated
    @Selector("captureTextFromCamera:")
    public native void captureTextFromCamera(@Mapped(ObjCObjectMapper.class) Object sender);

    @Generated
    @IsOptional
    @Selector("pasteAndGo:")
    public native void pasteAndGo(@Mapped(ObjCObjectMapper.class) Object sender);

    @Generated
    @IsOptional
    @Selector("pasteAndMatchStyle:")
    public native void pasteAndMatchStyle(@Mapped(ObjCObjectMapper.class) Object sender);

    @Generated
    @IsOptional
    @Selector("pasteAndSearch:")
    public native void pasteAndSearch(@Mapped(ObjCObjectMapper.class) Object sender);

    @Generated
    @IsOptional
    @Selector("print:")
    public native void print(@Mapped(ObjCObjectMapper.class) Object sender);
}

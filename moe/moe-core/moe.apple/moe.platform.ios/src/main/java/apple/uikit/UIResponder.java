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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * API-Since: 2.0
 */
@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class UIResponder extends NSObject implements UIResponderStandardEditActions, UIUserActivityRestoring,
        UIPasteConfigurationSupporting, UIActivityItemsConfigurationProviding {
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

    /**
     * This call is to remove stored app identifier state that is no longer needed.
     * 
     * API-Since: 7.0
     */
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

    /**
     * API-Since: 3.0
     */
    @Generated
    @Selector("canPerformAction:withSender:")
    public native boolean canPerformActionWithSender(@NotNull SEL action,
            @Nullable @Mapped(ObjCObjectMapper.class) Object sender);

    /**
     * default is YES
     */
    @Generated
    @Selector("canResignFirstResponder")
    public native boolean canResignFirstResponder();

    @Generated
    @IsOptional
    @Selector("copy:")
    public native void copy(@Nullable @Mapped(ObjCObjectMapper.class) Object sender);

    @Generated
    @IsOptional
    @Selector("cut:")
    public native void cut(@Nullable @Mapped(ObjCObjectMapper.class) Object sender);

    @Generated
    @IsOptional
    @Selector("decreaseSize:")
    public native void decreaseSize(@Nullable @Mapped(ObjCObjectMapper.class) Object sender);

    @Generated
    @IsOptional
    @Selector("delete:")
    public native void delete(@Nullable @Mapped(ObjCObjectMapper.class) Object sender);

    @Generated
    @IsOptional
    @Selector("increaseSize:")
    public native void increaseSize(@Nullable @Mapped(ObjCObjectMapper.class) Object sender);

    @Generated
    @Selector("init")
    public native UIResponder init();

    /**
     * API-Since: 3.2
     */
    @Nullable
    @Generated
    @Selector("inputAccessoryView")
    public native UIView inputAccessoryView();

    /**
     * API-Since: 8.0
     */
    @Nullable
    @Generated
    @Selector("inputAccessoryViewController")
    public native UIInputViewController inputAccessoryViewController();

    /**
     * This method is for clients that wish to put buttons on the Shortcuts Bar, shown on top of the keyboard.
     * You may modify the returned inputAssistantItem to add to or replace the existing items on the bar.
     * Modifications made to the returned UITextInputAssistantItem are reflected automatically.
     * This method should not be overridden. Goes up the responder chain.
     * 
     * API-Since: 9.0
     */
    @NotNull
    @Generated
    @Selector("inputAssistantItem")
    public native UITextInputAssistantItem inputAssistantItem();

    /**
     * Called and presented when object becomes first responder. Goes up the responder chain.
     * 
     * API-Since: 3.2
     */
    @Nullable
    @Generated
    @Selector("inputView")
    public native UIView inputView();

    /**
     * For viewController equivalents of -inputView and -inputAccessoryView
     * Called and presented when object becomes first responder. Goes up the responder chain.
     * 
     * API-Since: 8.0
     */
    @Nullable
    @Generated
    @Selector("inputViewController")
    public native UIInputViewController inputViewController();

    @Generated
    @Selector("isFirstResponder")
    public native boolean isFirstResponder();

    /**
     * returns an array of UIKeyCommand objects<
     * 
     * API-Since: 7.0
     */
    @Nullable
    @Generated
    @Selector("keyCommands")
    public native NSArray<? extends UIKeyCommand> keyCommands();

    @Generated
    @IsOptional
    @Selector("makeTextWritingDirectionLeftToRight:")
    public native void makeTextWritingDirectionLeftToRight(@Nullable @Mapped(ObjCObjectMapper.class) Object sender);

    @Generated
    @IsOptional
    @Selector("makeTextWritingDirectionRightToLeft:")
    public native void makeTextWritingDirectionRightToLeft(@Nullable @Mapped(ObjCObjectMapper.class) Object sender);

    /**
     * API-Since: 3.0
     */
    @Generated
    @Selector("motionBegan:withEvent:")
    public native void motionBeganWithEvent(@NInt long motion, @Nullable UIEvent event);

    /**
     * API-Since: 3.0
     */
    @Generated
    @Selector("motionCancelled:withEvent:")
    public native void motionCancelledWithEvent(@NInt long motion, @Nullable UIEvent event);

    /**
     * API-Since: 3.0
     */
    @Generated
    @Selector("motionEnded:withEvent:")
    public native void motionEndedWithEvent(@NInt long motion, @Nullable UIEvent event);

    @Nullable
    @Generated
    @Selector("nextResponder")
    public native UIResponder nextResponder();

    @Generated
    @IsOptional
    @Selector("paste:")
    public native void paste(@Nullable @Mapped(ObjCObjectMapper.class) Object sender);

    /**
     * Generally, all responders which do custom press handling should override all four of these methods.
     * Your responder will receive either pressesEnded:withEvent or pressesCancelled:withEvent: for each
     * press it is handling (those presses it received in pressesBegan:withEvent:).
     * pressesChanged:withEvent: will be invoked for presses that provide an analog value
     * (like thumbsticks or analog push buttons)
     * *** You must handle cancelled presses to ensure correct behavior in your application. Failure to
     * do so is very likely to lead to incorrect behavior or crashes.
     * 
     * API-Since: 9.0
     */
    @Generated
    @Selector("pressesBegan:withEvent:")
    public native void pressesBeganWithEvent(@NotNull NSSet<? extends UIPress> presses, @Nullable UIPressesEvent event);

    /**
     * API-Since: 9.0
     */
    @Generated
    @Selector("pressesCancelled:withEvent:")
    public native void pressesCancelledWithEvent(@NotNull NSSet<? extends UIPress> presses,
            @Nullable UIPressesEvent event);

    /**
     * API-Since: 9.0
     */
    @Generated
    @Selector("pressesChanged:withEvent:")
    public native void pressesChangedWithEvent(@NotNull NSSet<? extends UIPress> presses,
            @Nullable UIPressesEvent event);

    /**
     * API-Since: 9.0
     */
    @Generated
    @Selector("pressesEnded:withEvent:")
    public native void pressesEndedWithEvent(@NotNull NSSet<? extends UIPress> presses, @Nullable UIPressesEvent event);

    /**
     * If called while object is first responder, reloads inputView, inputAccessoryView, and textInputMode. Otherwise
     * ignored.
     * 
     * API-Since: 3.2
     */
    @Generated
    @Selector("reloadInputViews")
    public native void reloadInputViews();

    /**
     * API-Since: 4.0
     */
    @Generated
    @Selector("remoteControlReceivedWithEvent:")
    public native void remoteControlReceivedWithEvent(@Nullable UIEvent event);

    @Generated
    @Selector("resignFirstResponder")
    public native boolean resignFirstResponder();

    @Generated
    @Selector("restoreUserActivityState:")
    public native void restoreUserActivityState(@NotNull NSUserActivity activity);

    @Generated
    @IsOptional
    @Selector("select:")
    public native void select(@Nullable @Mapped(ObjCObjectMapper.class) Object sender);

    @Generated
    @IsOptional
    @Selector("selectAll:")
    public native void selectAll(@Nullable @Mapped(ObjCObjectMapper.class) Object sender);

    /**
     * API-Since: 8.0
     */
    @Generated
    @Selector("setUserActivity:")
    public native void setUserActivity(@Nullable NSUserActivity value);

    /**
     * Allows an action to be forwarded to another target. By default checks -canPerformAction:withSender: to either
     * return self, or go up the responder chain.
     * 
     * API-Since: 7.0
     */
    @Nullable
    @Generated
    @Selector("targetForAction:withSender:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object targetForActionWithSender(@NotNull SEL action,
            @Nullable @Mapped(ObjCObjectMapper.class) Object sender);

    /**
     * When the first responder changes and an identifier is queried, the system will establish a context to
     * track the textInputMode automatically. The system will save and restore the state of that context to
     * the user defaults via the app identifier. Use of -textInputMode above will supersede use of
     * -textInputContextIdentifier.
     * 
     * API-Since: 7.0
     */
    @Nullable
    @Generated
    @Selector("textInputContextIdentifier")
    public native String textInputContextIdentifier();

    /**
     * When queried, returns the current UITextInputMode, from which the keyboard language can be determined.
     * When overridden it should return a previously-queried UITextInputMode object, which will attempt to be
     * set inside that app, but not persistently affect the user's system-wide keyboard settings.
     * 
     * API-Since: 7.0
     */
    @Nullable
    @Generated
    @Selector("textInputMode")
    public native UITextInputMode textInputMode();

    @Generated
    @IsOptional
    @Selector("toggleBoldface:")
    public native void toggleBoldface(@Nullable @Mapped(ObjCObjectMapper.class) Object sender);

    @Generated
    @IsOptional
    @Selector("toggleItalics:")
    public native void toggleItalics(@Nullable @Mapped(ObjCObjectMapper.class) Object sender);

    @Generated
    @IsOptional
    @Selector("toggleUnderline:")
    public native void toggleUnderline(@Nullable @Mapped(ObjCObjectMapper.class) Object sender);

    /**
     * Generally, all responders which do custom touch handling should override all four of these methods.
     * Your responder will receive either touchesEnded:withEvent: or touchesCancelled:withEvent: for each
     * touch it is handling (those touches it received in touchesBegan:withEvent:).
     * *** You must handle cancelled touches to ensure correct behavior in your application. Failure to
     * do so is very likely to lead to incorrect behavior or crashes.
     */
    @Generated
    @Selector("touchesBegan:withEvent:")
    public native void touchesBeganWithEvent(@NotNull NSSet<? extends UITouch> touches, @Nullable UIEvent event);

    @Generated
    @Selector("touchesCancelled:withEvent:")
    public native void touchesCancelledWithEvent(@NotNull NSSet<? extends UITouch> touches, @Nullable UIEvent event);

    @Generated
    @Selector("touchesEnded:withEvent:")
    public native void touchesEndedWithEvent(@NotNull NSSet<? extends UITouch> touches, @Nullable UIEvent event);

    /**
     * API-Since: 9.1
     */
    @Generated
    @Selector("touchesEstimatedPropertiesUpdated:")
    public native void touchesEstimatedPropertiesUpdated(@NotNull NSSet<? extends UITouch> touches);

    @Generated
    @Selector("touchesMoved:withEvent:")
    public native void touchesMovedWithEvent(@NotNull NSSet<? extends UITouch> touches, @Nullable UIEvent event);

    /**
     * API-Since: 3.0
     */
    @Nullable
    @Generated
    @Selector("undoManager")
    public native NSUndoManager undoManager();

    /**
     * API-Since: 8.0
     */
    @Generated
    @Selector("updateUserActivityState:")
    public native void updateUserActivityState(@NotNull NSUserActivity activity);

    /**
     * API-Since: 8.0
     */
    @Nullable
    @Generated
    @Selector("userActivity")
    public native NSUserActivity userActivity();

    @Generated
    @IsOptional
    @Selector("canPasteItemProviders:")
    public native boolean canPasteItemProviders(@NotNull NSArray<? extends NSItemProvider> itemProviders);

    @Nullable
    @Generated
    @Selector("pasteConfiguration")
    public native UIPasteConfiguration pasteConfiguration();

    @Generated
    @IsOptional
    @Selector("pasteItemProviders:")
    public native void pasteItemProviders(@NotNull NSArray<? extends NSItemProvider> itemProviders);

    @Generated
    @Selector("setPasteConfiguration:")
    public native void setPasteConfiguration(@Nullable UIPasteConfiguration value);

    @Nullable
    @Generated
    @Selector("activityItemsConfiguration")
    @MappedReturn(ObjCObjectMapper.class)
    public native UIActivityItemsConfigurationReading activityItemsConfiguration();

    /**
     * Overrides for menu building and validation
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("buildMenuWithBuilder:")
    public native void buildMenuWithBuilder(@NotNull @Mapped(ObjCObjectMapper.class) UIMenuBuilder builder);

    /**
     * Productivity editing interaction support for undo/redo/cut/copy/paste gestures
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("editingInteractionConfiguration")
    @NInt
    public native long editingInteractionConfiguration();

    /**
     * API-Since: 13.0
     */
    @Generated
    @Selector("setActivityItemsConfiguration:")
    public native void setActivityItemsConfiguration(
            @Nullable @Mapped(ObjCObjectMapper.class) UIActivityItemsConfigurationReading value);

    @Generated
    @IsOptional
    @Selector("updateTextAttributesWithConversionHandler:")
    public native void updateTextAttributesWithConversionHandler(
            @NotNull @ObjCBlock(name = "call_updateTextAttributesWithConversionHandler") UIResponderStandardEditActions.Block_updateTextAttributesWithConversionHandler conversionHandler);

    /**
     * API-Since: 13.0
     */
    @Generated
    @Selector("validateCommand:")
    public native void validateCommand(@NotNull UICommand command);

    /**
     * API-Since: 15.0
     */
    @Generated
    @Selector("captureTextFromCamera:")
    public native void captureTextFromCamera(@Nullable @Mapped(ObjCObjectMapper.class) Object sender);

    @Generated
    @IsOptional
    @Selector("pasteAndGo:")
    public native void pasteAndGo(@Nullable @Mapped(ObjCObjectMapper.class) Object sender);

    @Generated
    @IsOptional
    @Selector("pasteAndMatchStyle:")
    public native void pasteAndMatchStyle(@Nullable @Mapped(ObjCObjectMapper.class) Object sender);

    @Generated
    @IsOptional
    @Selector("pasteAndSearch:")
    public native void pasteAndSearch(@Nullable @Mapped(ObjCObjectMapper.class) Object sender);

    @Generated
    @IsOptional
    @Selector("print:")
    public native void print(@Nullable @Mapped(ObjCObjectMapper.class) Object sender);

    @Generated
    @IsOptional
    @Selector("duplicate:")
    public native void duplicate(@Nullable @Mapped(ObjCObjectMapper.class) Object sender);

    @Generated
    @IsOptional
    @Selector("export:")
    public native void export(@Nullable @Mapped(ObjCObjectMapper.class) Object sender);

    @Generated
    @IsOptional
    @Selector("find:")
    public native void find(@Nullable @Mapped(ObjCObjectMapper.class) Object sender);

    @Generated
    @IsOptional
    @Selector("findAndReplace:")
    public native void findAndReplace(@Nullable @Mapped(ObjCObjectMapper.class) Object sender);

    @Generated
    @IsOptional
    @Selector("findNext:")
    public native void findNext(@Nullable @Mapped(ObjCObjectMapper.class) Object sender);

    @Generated
    @IsOptional
    @Selector("findPrevious:")
    public native void findPrevious(@Nullable @Mapped(ObjCObjectMapper.class) Object sender);

    @Generated
    @IsOptional
    @Selector("move:")
    public native void move(@Nullable @Mapped(ObjCObjectMapper.class) Object sender);

    @Generated
    @IsOptional
    @Selector("rename:")
    public native void rename(@Nullable @Mapped(ObjCObjectMapper.class) Object sender);

    @Generated
    @IsOptional
    @Selector("useSelectionForFind:")
    public native void useSelectionForFind(@Nullable @Mapped(ObjCObjectMapper.class) Object sender);
}

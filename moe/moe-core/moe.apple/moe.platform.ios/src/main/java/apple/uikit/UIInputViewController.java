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
import apple.foundation.NSBundle;
import apple.foundation.NSCoder;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.uikit.protocol.UITextDocumentProxy;
import apple.uikit.protocol.UITextInput;
import apple.uikit.protocol.UITextInputDelegate;
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
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * API-Since: 8.0
 */
@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class UIInputViewController extends UIViewController implements UITextInputDelegate {
    static {
        NatJ.register();
    }

    @Generated
    protected UIInputViewController(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native UIInputViewController alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native UIInputViewController allocWithZone(VoidPtr zone);

    @Deprecated
    @Generated
    @Selector("attemptRotationToDeviceOrientation")
    public static native void attemptRotationToDeviceOrientation();

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
    public static native UIInputViewController new_objc();

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
    @Selector("advanceToNextInputMode")
    public native void advanceToNextInputMode();

    @Generated
    @Selector("dismissKeyboard")
    public native void dismissKeyboard();

    /**
     * Launch inputMode list above the view when long pressing or swiping up from the view,
     * Advance to nextInputMode when short tapping on the view.
     * Example: [KeyboardButton addTarget:self action:@selector(handleInputModeListFromView:withEvent:)
     * forControlEvents:UIControlEventAllTouchEvents].
     * 
     * API-Since: 10.0
     */
    @Generated
    @Selector("handleInputModeListFromView:withEvent:")
    public native void handleInputModeListFromViewWithEvent(@NotNull UIView view, @NotNull UIEvent event);

    @Generated
    @Selector("init")
    public native UIInputViewController init();

    @Generated
    @Selector("initWithCoder:")
    public native UIInputViewController initWithCoder(@NotNull NSCoder coder);

    @Generated
    @Selector("initWithNibName:bundle:")
    public native UIInputViewController initWithNibNameBundle(@Nullable String nibNameOrNil,
            @Nullable NSBundle nibBundleOrNil);

    @Nullable
    @Generated
    @Selector("inputView")
    public native UIInputView inputView();

    /**
     * The primary language of the UIInputViewController. A BCP 47 language identifier such as en-US
     * If specified, this will supersede any PrimaryLanguage in the Info.plist.
     */
    @Nullable
    @Generated
    @Selector("primaryLanguage")
    public native String primaryLanguage();

    /**
     * This will not provide a complete repository of a language's vocabulary.
     * It is solely intended to supplement existing lexicons.
     */
    @Generated
    @Selector("requestSupplementaryLexiconWithCompletion:")
    public native void requestSupplementaryLexiconWithCompletion(
            @NotNull @ObjCBlock(name = "call_requestSupplementaryLexiconWithCompletion") Block_requestSupplementaryLexiconWithCompletion completionHandler);

    @Generated
    @Selector("selectionDidChange:")
    public native void selectionDidChange(@Nullable @Mapped(ObjCObjectMapper.class) UITextInput textInput);

    @Generated
    @Selector("selectionWillChange:")
    public native void selectionWillChange(@Nullable @Mapped(ObjCObjectMapper.class) UITextInput textInput);

    @Generated
    @Selector("setInputView:")
    public native void setInputView(@Nullable UIInputView value);

    /**
     * The primary language of the UIInputViewController. A BCP 47 language identifier such as en-US
     * If specified, this will supersede any PrimaryLanguage in the Info.plist.
     */
    @Generated
    @Selector("setPrimaryLanguage:")
    public native void setPrimaryLanguage(@Nullable String value);

    @Generated
    @Selector("textDidChange:")
    public native void textDidChange(@Nullable @Mapped(ObjCObjectMapper.class) UITextInput textInput);

    @NotNull
    @Generated
    @Selector("textDocumentProxy")
    @MappedReturn(ObjCObjectMapper.class)
    public native UITextDocumentProxy textDocumentProxy();

    @Generated
    @Selector("textWillChange:")
    public native void textWillChange(@Nullable @Mapped(ObjCObjectMapper.class) UITextInput textInput);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_requestSupplementaryLexiconWithCompletion {
        @Generated
        void call_requestSupplementaryLexiconWithCompletion(@NotNull UILexicon arg0);
    }

    /**
     * API-Since: 11.0
     */
    @Generated
    @Selector("hasFullAccess")
    public native boolean hasFullAccess();

    /**
     * API-Since: 11.0
     */
    @Generated
    @Selector("needsInputModeSwitchKey")
    public native boolean needsInputModeSwitchKey();

    /**
     * When this property is set to YES, the system dictation key, if provided, will be disabled.
     */
    @Generated
    @Selector("hasDictationKey")
    public native boolean hasDictationKey();

    /**
     * When this property is set to YES, the system dictation key, if provided, will be disabled.
     */
    @Generated
    @Selector("setHasDictationKey:")
    public native void setHasDictationKey(boolean value);
}

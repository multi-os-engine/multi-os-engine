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

package apple.social;

import apple.NSObject;
import apple.coregraphics.struct.CGPoint;
import apple.foundation.NSArray;
import apple.foundation.NSBundle;
import apple.foundation.NSCoder;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSNumber;
import apple.foundation.NSSet;
import apple.foundation.NSURL;
import apple.foundation.struct.NSRange;
import apple.uikit.NSTextAttachment;
import apple.uikit.UIScrollView;
import apple.uikit.UITextView;
import apple.uikit.UIView;
import apple.uikit.UIViewController;
import apple.uikit.protocol.UITextViewDelegate;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
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
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("Social")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class SLComposeServiceViewController extends UIViewController implements UITextViewDelegate {
    static {
        NatJ.register();
    }

    @Generated
    protected SLComposeServiceViewController(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native SLComposeServiceViewController alloc();

    @Generated
    @Selector("allocWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object allocWithZone(VoidPtr zone);

    @Generated
    @Selector("attemptRotationToDeviceOrientation")
    public static native void attemptRotationToDeviceOrientation();

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
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object new_objc();

    @Generated
    @Selector("prepareInterstitialAds")
    public static native void prepareInterstitialAds();

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
    @Selector("autoCompletionViewController")
    public native UIViewController autoCompletionViewController();

    @Generated
    @Selector("cancel")
    public native void cancel();

    @Generated
    @Selector("charactersRemaining")
    public native NSNumber charactersRemaining();

    @Generated
    @Selector("configurationItems")
    public native NSArray<?> configurationItems();

    @Generated
    @Selector("contentText")
    public native String contentText();

    @Generated
    @Selector("didSelectCancel")
    public native void didSelectCancel();

    @Generated
    @Selector("didSelectPost")
    public native void didSelectPost();

    @Generated
    @Selector("init")
    public native SLComposeServiceViewController init();

    @Generated
    @Selector("initWithCoder:")
    public native SLComposeServiceViewController initWithCoder(NSCoder aDecoder);

    @Generated
    @Selector("initWithNibName:bundle:")
    public native SLComposeServiceViewController initWithNibNameBundle(String nibNameOrNil, NSBundle nibBundleOrNil);

    @Generated
    @Selector("isContentValid")
    public native boolean isContentValid();

    @Generated
    @Selector("loadPreviewView")
    public native UIView loadPreviewView();

    @Generated
    @Selector("placeholder")
    public native String placeholder();

    @Generated
    @Selector("popConfigurationViewController")
    public native void popConfigurationViewController();

    @Generated
    @Selector("presentationAnimationDidFinish")
    public native void presentationAnimationDidFinish();

    @Generated
    @Selector("pushConfigurationViewController:")
    public native void pushConfigurationViewController(UIViewController viewController);

    @Generated
    @Selector("reloadConfigurationItems")
    public native void reloadConfigurationItems();

    @Generated
    @IsOptional
    @Selector("scrollViewDidEndDecelerating:")
    public native void scrollViewDidEndDecelerating(UIScrollView scrollView);

    @Generated
    @IsOptional
    @Selector("scrollViewDidEndDragging:willDecelerate:")
    public native void scrollViewDidEndDraggingWillDecelerate(UIScrollView scrollView, boolean decelerate);

    @Generated
    @IsOptional
    @Selector("scrollViewDidEndScrollingAnimation:")
    public native void scrollViewDidEndScrollingAnimation(UIScrollView scrollView);

    @Generated
    @IsOptional
    @Selector("scrollViewDidEndZooming:withView:atScale:")
    public native void scrollViewDidEndZoomingWithViewAtScale(UIScrollView scrollView, UIView view,
            @NFloat double scale);

    @Generated
    @IsOptional
    @Selector("scrollViewDidScroll:")
    public native void scrollViewDidScroll(UIScrollView scrollView);

    @Generated
    @IsOptional
    @Selector("scrollViewDidScrollToTop:")
    public native void scrollViewDidScrollToTop(UIScrollView scrollView);

    @Generated
    @IsOptional
    @Selector("scrollViewDidZoom:")
    public native void scrollViewDidZoom(UIScrollView scrollView);

    @Generated
    @IsOptional
    @Selector("scrollViewShouldScrollToTop:")
    public native boolean scrollViewShouldScrollToTop(UIScrollView scrollView);

    @Generated
    @IsOptional
    @Selector("scrollViewWillBeginDecelerating:")
    public native void scrollViewWillBeginDecelerating(UIScrollView scrollView);

    @Generated
    @IsOptional
    @Selector("scrollViewWillBeginDragging:")
    public native void scrollViewWillBeginDragging(UIScrollView scrollView);

    @Generated
    @IsOptional
    @Selector("scrollViewWillBeginZooming:withView:")
    public native void scrollViewWillBeginZoomingWithView(UIScrollView scrollView, UIView view);

    @Generated
    @IsOptional
    @Selector("scrollViewWillEndDragging:withVelocity:targetContentOffset:")
    public native void scrollViewWillEndDraggingWithVelocityTargetContentOffset(UIScrollView scrollView,
            @ByValue CGPoint velocity, CGPoint targetContentOffset);

    @Generated
    @Selector("setAutoCompletionViewController:")
    public native void setAutoCompletionViewController(UIViewController value);

    @Generated
    @Selector("setCharactersRemaining:")
    public native void setCharactersRemaining(NSNumber value);

    @Generated
    @Selector("setPlaceholder:")
    public native void setPlaceholder(String value);

    @Generated
    @Selector("textView")
    public native UITextView textView();

    @Generated
    @IsOptional
    @Selector("textView:shouldChangeTextInRange:replacementText:")
    public native boolean textViewShouldChangeTextInRangeReplacementText(UITextView textView, @ByValue NSRange range,
            String text);

    @Generated
    @IsOptional
    @Selector("textView:shouldInteractWithTextAttachment:inRange:")
    public native boolean textViewShouldInteractWithTextAttachmentInRange(UITextView textView,
            NSTextAttachment textAttachment, @ByValue NSRange characterRange);

    @Generated
    @IsOptional
    @Selector("textView:shouldInteractWithTextAttachment:inRange:interaction:")
    public native boolean textViewShouldInteractWithTextAttachmentInRangeInteraction(UITextView textView,
            NSTextAttachment textAttachment, @ByValue NSRange characterRange, @NInt long interaction);

    @Generated
    @IsOptional
    @Selector("textView:shouldInteractWithURL:inRange:")
    public native boolean textViewShouldInteractWithURLInRange(UITextView textView, NSURL URL,
            @ByValue NSRange characterRange);

    @Generated
    @IsOptional
    @Selector("textView:shouldInteractWithURL:inRange:interaction:")
    public native boolean textViewShouldInteractWithURLInRangeInteraction(UITextView textView, NSURL URL,
            @ByValue NSRange characterRange, @NInt long interaction);

    @Generated
    @IsOptional
    @Selector("textViewDidBeginEditing:")
    public native void textViewDidBeginEditing(UITextView textView);

    @Generated
    @IsOptional
    @Selector("textViewDidChange:")
    public native void textViewDidChange(UITextView textView);

    @Generated
    @IsOptional
    @Selector("textViewDidChangeSelection:")
    public native void textViewDidChangeSelection(UITextView textView);

    @Generated
    @IsOptional
    @Selector("textViewDidEndEditing:")
    public native void textViewDidEndEditing(UITextView textView);

    @Generated
    @IsOptional
    @Selector("textViewShouldBeginEditing:")
    public native boolean textViewShouldBeginEditing(UITextView textView);

    @Generated
    @IsOptional
    @Selector("textViewShouldEndEditing:")
    public native boolean textViewShouldEndEditing(UITextView textView);

    @Generated
    @Selector("validateContent")
    public native void validateContent();

    @Generated
    @IsOptional
    @Selector("viewForZoomingInScrollView:")
    public native UIView viewForZoomingInScrollView(UIScrollView scrollView);

    @Generated
    @IsOptional
    @Selector("scrollViewDidChangeAdjustedContentInset:")
    public native void scrollViewDidChangeAdjustedContentInset(UIScrollView scrollView);
}

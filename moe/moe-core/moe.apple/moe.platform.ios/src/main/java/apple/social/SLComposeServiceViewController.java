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

    /**
     * A view controller whose view replaces the configuration item table, sitting just below the text view. Defaults to nil.
     * Set this to a non-nil view controller to implement a mentions picker or something similar. The view controller should set preferredContentSize appropriately. SLComposeServiceViewController observes changes to that property and animates sheet size changes as necessary.
     * Set it to nil to remove your view controller, thus restoring the configuration item table.
     * SLComposeServiceViewController animates the addition/removal of the view controller's view, as appropriate.
     */
    @Generated
    @Selector("autoCompletionViewController")
    public native UIViewController autoCompletionViewController();

    /**
     * Triggers an animated dismissal of the sheet, and then calls -didSelectCancel.
     * Subclasses do not typically need to call this manually, but may choose to in response to a catastrophic failure during the user's interaction with the sheet.
     * Subclasses should not need to override this.
     */
    @Generated
    @Selector("cancel")
    public native void cancel();

    /**
     * Set/change this to something non-nil to cause the character count view to appear/redraw. This is useful for services that have a character count limit on their posts. Defaults to nil.
     */
    @Generated
    @Selector("charactersRemaining")
    public native NSNumber charactersRemaining();

    /**
     * Subclasses should implement this, and return an array of SLComposeSheetConfigurationItem instances, if if needs to display configuration items in the sheet. Defaults to nil.
     */
    @Generated
    @Selector("configurationItems")
    public native NSArray<?> configurationItems();

    /**
     * Convenience. This returns the current text from the textView.
     */
    @Generated
    @Selector("contentText")
    public native String contentText();

    /**
     * Called after the cancel animation has finished (in response to the user selecting the Cancel button, or someone calling -cancel).
     * The default implementation calls the extensionContext's -cancelRequestWithError: method with an NSError/NSUserCancelledError.
     * Subclasses may override this in order to customize the extensionContext completion.
     */
    @Generated
    @Selector("didSelectCancel")
    public native void didSelectCancel();

    /**
     * Called after the post animation has finished (in response to the user selecting the Post button).
     * The default implementation calls the extensionContext's -completeRequestReturningItems:completionHandler: method with nil.
     * Subclasses must override this in order to peform the post, based on contentText and any attachments.
     * Subclasses may call super in order to leverage the default completion behavior; if a subclass does not call super, it must call extensionContext's completion method manually.
     */
    @Generated
    @Selector("didSelectPost")
    public native void didSelectPost();

    @Generated
    @Selector("init")
    public native SLComposeServiceViewController init();

    @Generated
    @Selector("initWithCoder:")
    public native SLComposeServiceViewController initWithCoder(NSCoder coder);

    @Generated
    @Selector("initWithNibName:bundle:")
    public native SLComposeServiceViewController initWithNibNameBundle(String nibNameOrNil, NSBundle nibBundleOrNil);

    /**
     * Called automatically after each text change to help determine the enable state of the Post button, and to give the subclass a chance to update charactersRemaining.
     * Defaults to YES.
     * Subclasses should override this, and return whether contentText and attachments are currently valid for posting.
     */
    @Generated
    @Selector("isContentValid")
    public native boolean isContentValid();

    /**
     * Called when it's time to create a view suitable for previewing the attachments on the extensionContext.
     * Defaults to returning a UIView instance appropriate to the set of attachments in the extensionContext, or nil if a preview is unneccessary for the extensionContext.
     * Subclasses can override this to supply a preview view of their own choosing for the set of attachments on the extensionContext.
     */
    @Generated
    @Selector("loadPreviewView")
    public native UIView loadPreviewView();

    /**
     * When textView is empty, this string is displayed instead.
     * NOTE: This uses the iOS naming convention: "placeholder" vs. "placeholderString" on OS X.
     */
    @Generated
    @Selector("placeholder")
    public native String placeholder();

    /**
     * Dismisses the current configuration view controller.
     */
    @Generated
    @Selector("popConfigurationViewController")
    public native void popConfigurationViewController();

    /**
     * Called when the sheet presentation animation is finished.
     * Subclasses should implement this to begin performing any expensive work (e.g., messaging a server), instead of during initialization, -viewWillAppear, or -viewDidAppear.
     */
    @Generated
    @Selector("presentationAnimationDidFinish")
    public native void presentationAnimationDidFinish();

    /**
     * Presents a configuration view controller. Typically called from a configuration item's tapHandler. Only one configuration view controller is allowed at a time.
     * The pushed view controller should set preferredContentSize appropriately. SLComposeServiceViewController observes changes to that property and animates sheet size changes as necessary.
     */
    @Generated
    @Selector("pushConfigurationViewController:")
    public native void pushConfigurationViewController(UIViewController viewController);

    /**
     * Forces a reload of the configuration items table.
     * This is typically only necessary for subclasses that determine their configuration items in a deferred manner (for example, in -presentationAnimationDidFinish).
     * You do not need to call this after changing a configuration item property; the base class detects and reacts to that automatically.
     */
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

    /**
     * A view controller whose view replaces the configuration item table, sitting just below the text view. Defaults to nil.
     * Set this to a non-nil view controller to implement a mentions picker or something similar. The view controller should set preferredContentSize appropriately. SLComposeServiceViewController observes changes to that property and animates sheet size changes as necessary.
     * Set it to nil to remove your view controller, thus restoring the configuration item table.
     * SLComposeServiceViewController animates the addition/removal of the view controller's view, as appropriate.
     */
    @Generated
    @Selector("setAutoCompletionViewController:")
    public native void setAutoCompletionViewController(UIViewController value);

    /**
     * Set/change this to something non-nil to cause the character count view to appear/redraw. This is useful for services that have a character count limit on their posts. Defaults to nil.
     */
    @Generated
    @Selector("setCharactersRemaining:")
    public native void setCharactersRemaining(NSNumber value);

    /**
     * When textView is empty, this string is displayed instead.
     * NOTE: This uses the iOS naming convention: "placeholder" vs. "placeholderString" on OS X.
     */
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

    /**
     * Calls -isContentValid immediately, performs other internal validation, then updates the enable state of the Post button appropriately.
     * Subclasses should call this whenever they change data used as part of validity checking in their implementation of -isContentValid.
     */
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

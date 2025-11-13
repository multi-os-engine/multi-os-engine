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

package apple.uikit.protocol;

import apple.foundation.NSURL;
import apple.foundation.struct.NSRange;
import apple.uikit.NSTextAttachment;
import apple.uikit.UITextView;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import apple.foundation.NSArray;
import apple.uikit.UIMenu;
import apple.uikit.UIMenuElement;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import apple.uikit.UIAction;
import apple.uikit.UITextItem;
import apple.uikit.UITextItemMenuConfiguration;
import apple.foundation.NSValue;
import apple.uikit.UITextFormattingViewController;
import apple.uikit.UIInputSuggestion;

@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("UITextViewDelegate")
public interface UITextViewDelegate extends UIScrollViewDelegate {
    /**
     * API-Since: 2.0
     * Deprecated-Since: 100000.0
     */
    @Deprecated
    @Generated
    @IsOptional
    @Selector("textView:shouldChangeTextInRange:replacementText:")
    default boolean textViewShouldChangeTextInRangeReplacementText(@NotNull UITextView textView, @ByValue NSRange range,
            @NotNull String text) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * API-Since: 7.0
     * Deprecated-Since: 10.0
     */
    @Deprecated
    @Generated
    @IsOptional
    @Selector("textView:shouldInteractWithTextAttachment:inRange:")
    default boolean textViewShouldInteractWithTextAttachmentInRange(@NotNull UITextView textView,
            @NotNull NSTextAttachment textAttachment, @ByValue NSRange characterRange) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * API-Since: 10.0
     * Deprecated-Since: 17.0
     * Deprecated-Message: Replaced by primaryActionForTextItem: and menuConfigurationForTextItem: for additional
     * customization options.
     */
    @Deprecated
    @Generated
    @IsOptional
    @Selector("textView:shouldInteractWithTextAttachment:inRange:interaction:")
    default boolean textViewShouldInteractWithTextAttachmentInRangeInteraction(@NotNull UITextView textView,
            @NotNull NSTextAttachment textAttachment, @ByValue NSRange characterRange, @NInt long interaction) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * API-Since: 7.0
     * Deprecated-Since: 10.0
     */
    @Deprecated
    @Generated
    @IsOptional
    @Selector("textView:shouldInteractWithURL:inRange:")
    default boolean textViewShouldInteractWithURLInRange(@NotNull UITextView textView, @NotNull NSURL URL,
            @ByValue NSRange characterRange) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * API-Since: 10.0
     * Deprecated-Since: 17.0
     * Deprecated-Message: Replaced by primaryActionForTextItem: and menuConfigurationForTextItem: for additional
     * customization options.
     */
    @Deprecated
    @Generated
    @IsOptional
    @Selector("textView:shouldInteractWithURL:inRange:interaction:")
    default boolean textViewShouldInteractWithURLInRangeInteraction(@NotNull UITextView textView, @NotNull NSURL URL,
            @ByValue NSRange characterRange, @NInt long interaction) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("textViewDidBeginEditing:")
    default void textViewDidBeginEditing(@NotNull UITextView textView) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("textViewDidChange:")
    default void textViewDidChange(@NotNull UITextView textView) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("textViewDidChangeSelection:")
    default void textViewDidChangeSelection(@NotNull UITextView textView) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("textViewDidEndEditing:")
    default void textViewDidEndEditing(@NotNull UITextView textView) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("textViewShouldBeginEditing:")
    default boolean textViewShouldBeginEditing(@NotNull UITextView textView) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("textViewShouldEndEditing:")
    default boolean textViewShouldEndEditing(@NotNull UITextView textView) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Asks the delegate for the menu to be shown for the specified text range.
     * 
     * @param textView         The text view requesting the menu.
     * @param range            The text range for which the menu is presented for.
     * @param suggestedActions The actions and commands that the system suggests.
     * 
     * @return Return a UIMenu describing the desired menu hierarchy. Return @c nil to present the default system menu.
     * 
     *         API-Since: 16.0
     *         Deprecated-Since: 100000.0
     */
    @Deprecated
    @Nullable
    @Generated
    @IsOptional
    @Selector("textView:editMenuForTextInRange:suggestedActions:")
    default UIMenu textViewEditMenuForTextInRangeSuggestedActions(@NotNull UITextView textView, @ByValue NSRange range,
            @NotNull NSArray<? extends UIMenuElement> suggestedActions) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Called when the text view is about to dismiss the edit menu.
     * 
     * @param textView The text view displaying the menu.
     * @param animator Dismissal animator. Add animations to this object to run them alongside the dismissal transition.
     * 
     *                 API-Since: 16.0
     */
    @Generated
    @IsOptional
    @Selector("textView:willDismissEditMenuWithAnimator:")
    default void textViewWillDismissEditMenuWithAnimator(@NotNull UITextView textView,
            @NotNull @Mapped(ObjCObjectMapper.class) UIEditMenuInteractionAnimating animator) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Called when the text view is about to present the edit menu.
     * 
     * @param textView The text view displaying the menu.
     * @param animator Appearance animator. Add animations to this object to run them alongside the appearance
     *                 transition.
     * 
     *                 API-Since: 16.0
     */
    @Generated
    @IsOptional
    @Selector("textView:willPresentEditMenuWithAnimator:")
    default void textViewWillPresentEditMenuWithAnimator(@NotNull UITextView textView,
            @NotNull @Mapped(ObjCObjectMapper.class) UIEditMenuInteractionAnimating animator) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Asks the delegate for the menu configuration to be performed when interacting with a text item.
     * 
     * @param textView    The text view requesting the menu.
     * @param textItem    The text item for performing said action.
     * @param defaultMenu The default menu for the specified text item.
     * 
     * @return Return a menu configuration to be presented when the text item is interacted with. Return @c nil to
     *         prevent the menu from being presented.
     * 
     *         API-Since: 17.0
     */
    @Generated
    @IsOptional
    @Selector("textView:menuConfigurationForTextItem:defaultMenu:")
    @Nullable
    default UITextItemMenuConfiguration textViewMenuConfigurationForTextItemDefaultMenu(@NotNull UITextView textView,
            @NotNull UITextItem textItem, @NotNull UIMenu defaultMenu) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Asks the delegate for the action to be performed when interacting with a text item. If a nil action is provided,
     * the text view
     * will request a menu to be presented on primary action if possible.
     * 
     * @param textView      The text view requesting the primary action.
     * @param textItem      The text item for performing said action.
     * @param defaultAction The default action for the text item. Return this to perform the default action.
     * 
     * @return Return a UIAction to be performed when the text item is interacted with. Return @c nil to prevent the
     *         action from being performed.
     * 
     *         API-Since: 17.0
     */
    @Generated
    @IsOptional
    @Selector("textView:primaryActionForTextItem:defaultAction:")
    @Nullable
    default UIAction textViewPrimaryActionForTextItemDefaultAction(@NotNull UITextView textView,
            @NotNull UITextItem textItem, @NotNull UIAction defaultAction) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Informs the delegate that a text item menu is about to be presented with the specified animator.
     * 
     * @param textView The text view showing the menu.
     * @param textItem The text item for performing said action.
     * @param animator Appearance animator. Add animations to this object to run them alongside the appearance
     *                 transition.
     * 
     *                 API-Since: 17.0
     */
    @Generated
    @IsOptional
    @Selector("textView:textItemMenuWillDisplayForTextItem:animator:")
    default void textViewTextItemMenuWillDisplayForTextItemAnimator(@NotNull UITextView textView,
            @NotNull UITextItem textItem,
            @Mapped(ObjCObjectMapper.class) @NotNull UIContextMenuInteractionAnimating animator) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Informs the delegate that a text item menu is about to be dismissed with the specified animator.
     * 
     * @param textView The text view showing the menu.
     * @param textItem The text item for performing said action.
     * @param animator Dismissal animator. Add animations to this object to run them alongside the dismissal transition.
     * 
     *                 API-Since: 17.0
     */
    @Generated
    @IsOptional
    @Selector("textView:textItemMenuWillEndForTextItem:animator:")
    default void textViewTextItemMenuWillEndForTextItemAnimator(@NotNull UITextView textView,
            @NotNull UITextItem textItem,
            @Mapped(ObjCObjectMapper.class) @NotNull UIContextMenuInteractionAnimating animator) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Informs the delegate that text formatting controller has been presented.
     * 
     * @param viewController The text formatting controller that is being presented.
     * 
     *                       API-Since: 18.0
     */
    @Generated
    @IsOptional
    @Selector("textView:didBeginFormattingWithViewController:")
    default void textViewDidBeginFormattingWithViewController(@NotNull UITextView textView,
            @NotNull UITextFormattingViewController viewController) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Informs the delegate that text formatting controller has been dismissed.
     * 
     * @param viewController The text formatting controller that is being presented.
     * 
     *                       API-Since: 18.0
     */
    @Generated
    @IsOptional
    @Selector("textView:didEndFormattingWithViewController:")
    default void textViewDidEndFormattingWithViewController(@NotNull UITextView textView,
            @NotNull UITextFormattingViewController viewController) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Informs the delegate that text formatting controller is about to be presented.
     * 
     * @param viewController The text formatting controller that is being presented.
     * 
     *                       API-Since: 18.0
     */
    @Generated
    @IsOptional
    @Selector("textView:willBeginFormattingWithViewController:")
    default void textViewWillBeginFormattingWithViewController(@NotNull UITextView textView,
            @NotNull UITextFormattingViewController viewController) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Informs the delegate that text formatting controller is about to be dismissed.
     * 
     * @param viewController The text formatting controller that is being presented.
     * 
     *                       API-Since: 18.0
     */
    @Generated
    @IsOptional
    @Selector("textView:willEndFormattingWithViewController:")
    default void textViewWillEndFormattingWithViewController(@NotNull UITextView textView,
            @NotNull UITextFormattingViewController viewController) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Allows the delegate to specify ranges of text to be ignored by Writing Tools
     * 
     * @param textView       The text view interacting with Writing Tools
     * @param enclosingRange
     * 
     * @return Return an array of ranges in the attributed substring of the textView storage with the enclosing range
     *         representing portions of text to be ignored by Writing Tools when evaluating the text for proofreading,
     *         summarization, rewrites, and so forth.
     * 
     *         API-Since: 18.0
     */
    @Generated
    @IsOptional
    @Selector("textView:writingToolsIgnoredRangesInEnclosingRange:")
    @NotNull
    default NSArray<? extends NSValue> textViewWritingToolsIgnoredRangesInEnclosingRange(@NotNull UITextView textView,
            @ByValue NSRange enclosingRange) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Informs the delegate that Writing Tools has finished manipulating the text view
     * 
     * @param textView The text view interacting with Writing Tools
     * 
     *                 API-Since: 18.0
     */
    @Generated
    @IsOptional
    @Selector("textViewWritingToolsDidEnd:")
    default void textViewWritingToolsDidEnd(@NotNull UITextView textView) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Informs the delegate that Writing Tools will begin manipulating the text view
     * 
     * @param textView The text view interacting with Writing Tools
     * 
     *                 API-Since: 18.0
     */
    @Generated
    @IsOptional
    @Selector("textViewWritingToolsWillBegin:")
    default void textViewWritingToolsWillBegin(@NotNull UITextView textView) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Tells the delegate when the keyboard delivers an input suggestion.
     * 
     * - Parameters:
     * - textView: The text view that is currently the first responder.
     * - inputSuggestion: The input suggestion that the user or system selected.
     * 
     * API-Since: 18.4
     */
    @Generated
    @IsOptional
    @Selector("textView:insertInputSuggestion:")
    default void textViewInsertInputSuggestion(@NotNull UITextView textView,
            @NotNull UIInputSuggestion inputSuggestion) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Asks the delegate for the menu to be shown for the specified text ranges.
     * 
     * If the delegate does not implement this method then the `textView:editMenuForTextInRange:suggestedActions:`
     * method will be called and passed the union range instead. If the delegate also does not implement that method
     * then `nil` is assumed.
     * 
     * @param textView         The text view requesting the menu.
     * @param ranges           The text ranges for which the menu is presented for.
     * @param suggestedActions The actions and commands that the system suggests.
     * 
     * @return Return a UIMenu describing the desired menu hierarchy. Return @c nil to present the default system menu.
     * 
     *         API-Since: 26.0
     */
    @Generated
    @IsOptional
    @Selector("textView:editMenuForTextInRanges:suggestedActions:")
    @Nullable
    default UIMenu textViewEditMenuForTextInRangesSuggestedActions(@NotNull UITextView textView,
            @NotNull NSArray<? extends NSValue> ranges, @NotNull NSArray<? extends UIMenuElement> suggestedActions) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Asks the delegate if the text at the specified `ranges` should be replaced with `text`.
     * 
     * If this method returns YES then the text view will, at its own discretion, choose any one of the specified
     * `ranges` of text and replace it with the specified `replacementText` before deleting the text at the other
     * ranges. If the delegate does not implement this method then the
     * `textView:shouldChangeTextInRange:replacementText:` method will be called and passed the union range instead. If
     * the delegate also does not implement that method then YES is assumed.
     * 
     * @param textView        The text view asking the delegate
     * @param ranges          The ranges of the text that should be deleted before replacing
     * @param replacementText The replacement text
     * 
     * @return Returns true if the text at the `ranges` should be replaced.
     * 
     *         API-Since: 26.0
     */
    @Generated
    @IsOptional
    @Selector("textView:shouldChangeTextInRanges:replacementText:")
    default boolean textViewShouldChangeTextInRangesReplacementText(@NotNull UITextView textView,
            @NotNull NSArray<? extends NSValue> ranges, @NotNull String text) {
        throw new java.lang.UnsupportedOperationException();
    }
}

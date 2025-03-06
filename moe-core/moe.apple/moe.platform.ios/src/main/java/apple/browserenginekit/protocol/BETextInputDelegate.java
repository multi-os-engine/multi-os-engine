package apple.browserenginekit.protocol;

import apple.browserenginekit.BEKeyEntryContext;
import apple.browserenginekit.BETextSuggestion;
import apple.foundation.NSArray;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * API-Since: 17.4
 */
@Generated
@Library("BrowserEngineKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("BETextInputDelegate")
public interface BETextInputDelegate {
    /**
     * Tells the system the text entry context has changed and that text entry UI's need to be refreshed.
     * 
     * This is a costly operation and should only used with intention. For example, when switching focus
     * between different elements.
     * 
     * API-Since: 17.4
     */
    @Generated
    @Selector("invalidateTextEntryContextForTextInput:")
    void invalidateTextEntryContextForTextInput(@Mapped(ObjCObjectMapper.class) @NotNull BETextInput textInput);

    /**
     * Tells the system when the selection has changed in the document.
     * 
     * This method results in an document state refresh with an invocation to:
     * -[BETextInput requestTextContextForAutocorrectionWithCompletionHandler:]
     * 
     * API-Since: 17.4
     */
    @Generated
    @Selector("selectionDidChangeForTextInput:")
    void selectionDidChangeForTextInput(@Mapped(ObjCObjectMapper.class) @NotNull BETextInput textInput);

    /**
     * Tells the system when the selection is about to change in the document.
     * 
     * API-Since: 17.4
     */
    @Generated
    @Selector("selectionWillChangeForTextInput:")
    void selectionWillChangeForTextInput(@Mapped(ObjCObjectMapper.class) @NotNull BETextInput textInput);

    /**
     * Defers the key event to the system and returns whether the key event was handled.
     * 
     * For example, the system will handle key events for character insertions, deletions, key commands, and more.
     * 
     * API-Since: 17.4
     */
    @Generated
    @Selector("shouldDeferEventHandlingToSystemForTextInput:context:")
    boolean shouldDeferEventHandlingToSystemForTextInputContext(
            @Mapped(ObjCObjectMapper.class) @NotNull BETextInput textInput, @NotNull BEKeyEntryContext keyEventContext);

    /**
     * Defers a replace text action to the ssytem.
     * 
     * When handling the replace: action, use this method to defer the replacement to the system.
     * 
     * For example, a replacement could be deferred after it is selected from the autocorrect replacements list.
     * 
     * API-Since: 17.4
     */
    @Generated
    @Selector("textInput:deferReplaceTextActionToSystem:")
    void textInputDeferReplaceTextActionToSystem(@Mapped(ObjCObjectMapper.class) @NotNull BETextInput textInput,
            @Mapped(ObjCObjectMapper.class) @NotNull Object sender);

    /**
     * Provides text suggestions to the system.
     * 
     * For example, suggestions could include data list elements or AutoFill candidates.
     * 
     * API-Since: 17.4
     */
    @Generated
    @Selector("textInput:setCandidateSuggestions:")
    void textInputSetCandidateSuggestions(@Mapped(ObjCObjectMapper.class) @NotNull BETextInput textInput,
            @Nullable NSArray<? extends BETextSuggestion> suggestions);
}
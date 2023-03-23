package apple.uikit.protocol;

import apple.uikit.UITextRange;
import apple.uikit.UITextSearchOptions;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * API-Since: 16.0
 */
@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("UITextSearching")
public interface UITextSearching {
    /**
     * Called when the current search session has changed or ended, with the expectation that all decorations
     * applied via @c decorateFoundTextRange:usingStyle: are cleared.
     */
    @Generated
    @Selector("clearAllDecoratedFoundText")
    void clearAllDecoratedFoundText();

    /**
     * Provide a comparison result comparing developer-provided @c fromRange to @c toRange . This is used by
     * the system find panel to know which @c UITextRange to highlight next when the user taps the "next" or "previous"
     * result buttons.
     * 
     * @param foundRange Developer-provided range to compare from.
     * @param toRange    Developer-provided range to compare to.
     * @param document   If multiple documents are used, a document identifier will be provided here. Ranges are only
     *                   compared between other ranges of the same document.
     */
    @Generated
    @Selector("compareFoundRange:toRange:inDocument:")
    @NInt
    long compareFoundRangeToRangeInDocument(UITextRange foundRange, UITextRange toRange,
            @Mapped(ObjCObjectMapper.class) Object document);

    /**
     * Returns the visible ordering from `fromDocument` to `toDocument`. If your document identifiers
     * are index paths, for example, this would yield the same result as `-[NSIndexPath compare:]`.
     */
    @Generated
    @IsOptional
    @Selector("compareOrderFromDocument:toDocument:")
    @NInt
    default long compareOrderFromDocumentToDocument(@Mapped(ObjCObjectMapper.class) Object fromDocument,
            @Mapped(ObjCObjectMapper.class) Object toDocument) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Given a found @c range , decorate this text appropriately using the provided @c style type.
     * 
     * @param range    The range of text to decorate.
     * @param document If multiple documents are used, the relevant document identifier is provided here.
     *                 Otherwise nil.
     * @param style    A style hint for how to decorate the text. This is ultimately up to the developer, but developers
     *                 are
     *                 encouraged to match the system's appearance (i.e., UITextView) as close as possible.
     */
    @Generated
    @Selector("decorateFoundTextRange:inDocument:usingStyle:")
    void decorateFoundTextRangeInDocumentUsingStyle(UITextRange range, @Mapped(ObjCObjectMapper.class) Object document,
            @NInt long style);

    /**
     * Perform a text search (across all available searchable documents) using @c string. When results are found,
     * provide the results to @c aggregator.
     * 
     * @param string     The query string to search for
     * @param options    Search options provided by the user.
     * @param aggregator When results are found, provide them to the aggregator. The aggregator is thread-safe,
     *                   so you may send it messages on other threads.
     */
    @Generated
    @Selector("performTextSearchWithQueryString:usingOptions:resultAggregator:")
    void performTextSearchWithQueryStringUsingOptionsResultAggregator(String string, UITextSearchOptions options,
            @Mapped(ObjCObjectMapper.class) UITextSearchAggregator aggregator);

    /**
     * When replacing all occurrences at once, this method is called instead of the one above.
     * 
     * @param queryString     The search term to replace.
     * @param options         Search options provided by the find panel UI.
     * @param replacementText The string to replace it with.
     */
    @Generated
    @IsOptional
    @Selector("replaceAllOccurrencesOfQueryString:usingOptions:withText:")
    default void replaceAllOccurrencesOfQueryStringUsingOptionsWithText(String queryString, UITextSearchOptions options,
            String replacementText) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * If you return YES for `-supportsTextReplacement`, this method will be called whenever the user intends to
     * replace a range of text.
     * 
     * @param range           The range of text requesting to be replaced.
     * @param document        If multiple search documents are used, the relevant document identifier is provided
     *                        here. Otherwise nil.
     * @param replacementText The replacement string.
     */
    @Generated
    @IsOptional
    @Selector("replaceFoundTextInRange:inDocument:withText:")
    default void replaceFoundTextInRangeInDocumentWithText(UITextRange range,
            @Mapped(ObjCObjectMapper.class) Object document, String replacementText) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * If scrolling is supported, implement this to know when the document should be scrolled to a particular
     * search result.
     * 
     * @param range    The text range to scroll to.
     * @param document (Optional) If multiple documents are used, the document identifier to scroll to.
     */
    @Generated
    @IsOptional
    @Selector("scrollRangeToVisible:inDocument:")
    default void scrollRangeToVisibleInDocument(UITextRange range, @Mapped(ObjCObjectMapper.class) Object document) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Overlap from UITextInput: Returns the currently selected text range, if applicable. Nil otherwise.
     */
    @Generated
    @Selector("selectedTextRange")
    UITextRange selectedTextRange();

    /**
     * Returns the current search document, if applicable. Nil otherwise.
     */
    @Generated
    @IsOptional
    @Selector("selectedTextSearchDocument")
    @MappedReturn(ObjCObjectMapper.class)
    default Object selectedTextSearchDocument() {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Optionally return NO to disallow the replacement of a particular result @c range . This will disable the
     * "replace"
     * button in the UI. If this method is unimplemented, it is assumed that all results are replaceable.
     * 
     * @param range           Range to replace.
     * @param document        If multiple documents are used, the document from which range originates.
     * @param replacementText Text that the user intends to replace with.
     */
    @Generated
    @IsOptional
    @Selector("shouldReplaceFoundTextInRange:inDocument:withText:")
    default boolean shouldReplaceFoundTextInRangeInDocumentWithText(UITextRange range,
            @Mapped(ObjCObjectMapper.class) Object document, String replacementText) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Return YES if your searchable item also supports replacement. If this method is unimplemented, it is
     * assumed that text replacement is not supported.
     */
    @Generated
    @IsOptional
    @Selector("supportsTextReplacement")
    default boolean supportsTextReplacement() {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Called when the highlighted search result is about to change to @c range .
     */
    @Generated
    @IsOptional
    @Selector("willHighlightFoundTextRange:inDocument:")
    default void willHighlightFoundTextRangeInDocument(UITextRange range,
            @Mapped(ObjCObjectMapper.class) Object document) {
        throw new java.lang.UnsupportedOperationException();
    }
}
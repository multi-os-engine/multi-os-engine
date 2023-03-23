package apple.uikit.protocol;

import apple.foundation.NSOrderedSet;
import apple.uikit.UITextRange;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * API-Since: 16.0
 */
@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("UITextSearchAggregator")
public interface UITextSearchAggregator {
    /**
     * Returns all currently reported found ranges via @c foundRange:forSearchString:.
     */
    @Generated
    @Selector("allFoundRanges")
    NSOrderedSet<? extends UITextRange> allFoundRanges();

    /**
     * Call this method after all documents have been searched.
     */
    @Generated
    @Selector("finishedSearching")
    void finishedSearching();

    /**
     * Call this method when a range of text is found in your document.
     * 
     * @param range    The range of text that was found.
     * @param string   The query string that was used to locate this range of text.
     * @param document (Optional) A developer-defined document identifier, later provided when this range
     *                 needs to be styled.
     */
    @Generated
    @Selector("foundRange:forSearchString:inDocument:")
    void foundRangeForSearchStringInDocument(UITextRange range, String string,
            @Mapped(ObjCObjectMapper.class) Object document);

    /**
     * Call this method to invalidate all currently shown ranges. This will cause the system find panel to update
     * it's current state, and may trigger a new search using `performTextSearchWithQueryString:` immediately after.
     */
    @Generated
    @Selector("invalidate")
    void invalidate();

    /**
     * Call this method when a found @c range is no longer in @c document . This will cause the system find
     * panel to update it's current state, and if the range provided is the currently highlighted range, will advance
     * to the next found result.
     * 
     * @param range    The range that is now invalid.
     * @param document (Optional) If multiple documents are used, the document identifier for the range provided.
     */
    @Generated
    @Selector("invalidateFoundRange:inDocument:")
    void invalidateFoundRangeInDocument(UITextRange range, @Mapped(ObjCObjectMapper.class) Object document);
}
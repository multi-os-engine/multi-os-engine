package apple.uikit.protocol;

import apple.foundation.NSArray;
import apple.foundation.NSError;
import apple.uikit.NSTextElement;
import apple.uikit.NSTextRange;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * NSTextElementProvider is a protocol conformed by NSTextContentManager and its concrete subclasses. It defines the base interface for interacting with a custom text document content type.
 */
@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("NSTextElementProvider")
public interface NSTextElementProvider {
    /**
     * Should be implemented if the location backing store requires manual adjustment after editing. When textRange is intersecting or following the current edited range, the method returns the range adjusted for the modification in the editing session. Returns nil, when no adjustment necessary. forEditingTextSelection indicates if textRange is for the text selection associated with the edit session.
     */
    @Generated
    @IsOptional
    @Selector("adjustedRangeFromRange:forEditingTextSelection:")
    default NSTextRange adjustedRangeFromRangeForEditingTextSelection(NSTextRange textRange,
            boolean forEditingTextSelection) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Declares the starting and ending locations for the document. The subclass could use its own implementation of a location object conforming to NSTextRange.
     */
    @Generated
    @Selector("documentRange")
    NSTextRange documentRange();

    /**
     * Enumerates the text elements starting at textLocation. If textLocation=nil, it assumes self.documentRange.location for forward enumeration; uses self.documentRange.endLocation for reverse enumeration. When enumerating backward, it starts with the element preceding the one containing textLocation. If enumerated at least one element, it returns the edge of the enumerated range. Note that the enumerated range might not match the range of the last element returned. It enumerates the elements in the sequence, but it can skip a range (it can limit the maximum number of text elements enumerated for a single invocation or hide some elements from the layout). Returning NO from block breaks out of the enumeration.
     */
    @Generated
    @Selector("enumerateTextElementsFromLocation:options:usingBlock:")
    @MappedReturn(ObjCObjectMapper.class)
    NSTextLocation enumerateTextElementsFromLocationOptionsUsingBlock(
            @Mapped(ObjCObjectMapper.class) NSTextLocation textLocation, @NUInt long options,
            @ObjCBlock(name = "call_enumerateTextElementsFromLocationOptionsUsingBlock") Block_enumerateTextElementsFromLocationOptionsUsingBlock block);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_enumerateTextElementsFromLocationOptionsUsingBlock {
        @Generated
        boolean call_enumerateTextElementsFromLocationOptionsUsingBlock(NSTextElement element);
    }

    /**
     * Returns a new location from location with offset. The offset value could be positive or negative indicating the logical direction. Could return nil when the inputs don't produce any legal location (i.e. out of bounds index).
     */
    @Generated
    @IsOptional
    @Selector("locationFromLocation:withOffset:")
    @MappedReturn(ObjCObjectMapper.class)
    default NSTextLocation locationFromLocationWithOffset(@Mapped(ObjCObjectMapper.class) NSTextLocation location,
            @NInt long offset) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Returns the offset between from and to. The return value could be positive or negative. Could return NSNotFound when the offset cannot be represented in an integer value (i.e. locations are not in the same document).
     */
    @Generated
    @IsOptional
    @Selector("offsetFromLocation:toLocation:")
    @NInt
    default long offsetFromLocationToLocation(@Mapped(ObjCObjectMapper.class) NSTextLocation from,
            @Mapped(ObjCObjectMapper.class) NSTextLocation to) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Replaces the characters specified by range with textElements. If the edges of range is not at existing element range boundaries, it either split the element if it allows the operation (i.e. NSTextParagraph) or adjust the replacement range. This method is intended to be used only by NSTextLayoutManager.
     */
    @Generated
    @Selector("replaceContentsInRange:withTextElements:")
    void replaceContentsInRangeWithTextElements(NSTextRange range, NSArray<? extends NSTextElement> textElements);

    /**
     * Synchronizes changes to the backing store. If completionHandler=nil, performs the operation synchronously. completionHandler gets passed error if failed. It should block (or fail if synchronous) when there is an active transaction.
     */
    @Generated
    @Selector("synchronizeToBackingStore:")
    void synchronizeToBackingStore(
            @ObjCBlock(name = "call_synchronizeToBackingStore") Block_synchronizeToBackingStore completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_synchronizeToBackingStore {
        @Generated
        void call_synchronizeToBackingStore(NSError error);
    }
}

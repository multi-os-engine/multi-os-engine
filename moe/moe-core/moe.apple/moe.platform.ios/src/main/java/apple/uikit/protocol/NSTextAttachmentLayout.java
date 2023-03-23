package apple.uikit.protocol;

import apple.foundation.NSDictionary;
import apple.uikit.NSTextAttachmentViewProvider;
import apple.uikit.NSTextContainer;
import apple.uikit.UIImage;
import apple.uikit.UIView;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import apple.corefoundation.struct.CGPoint;
import apple.corefoundation.struct.CGRect;

/**
 * This protocol defines the interface to attachment objects from NSTextLayoutManager
 */
@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("NSTextAttachmentLayout")
public interface NSTextAttachmentLayout {
    /**
     * Returns the layout bounds. The bounds origin is interpreted to match position inside proposedLineFragment. The
     * NSTextAttachment implementation returns -bounds if not CGRectZero; otherwise, it derives the bounds value from
     * image.size. Conforming objects can implement more sophisticated logic for negotiating the frame size based on the
     * available container space and proposed line fragment rect.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("attachmentBoundsForAttributes:location:textContainer:proposedLineFragment:position:")
    @ByValue
    CGRect attachmentBoundsForAttributesLocationTextContainerProposedLineFragmentPosition(
            NSDictionary<String, ?> attributes, @Mapped(ObjCObjectMapper.class) NSTextLocation location,
            NSTextContainer textContainer, @ByValue CGRect proposedLineFragment, @ByValue CGPoint position);

    /**
     * Returns the image object rendered at bounds inside textContainer. It should return an image appropriate for the
     * target rendering context derived by arguments to this method. The NSTextAttachment implementation returns -image
     * when non-nil. If -image==nil, it returns an image based on -contents and -fileType properties.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("imageForBounds:attributes:location:textContainer:")
    UIImage imageForBoundsAttributesLocationTextContainer(@ByValue CGRect bounds, NSDictionary<String, ?> attributes,
            @Mapped(ObjCObjectMapper.class) NSTextLocation location, NSTextContainer textContainer);

    /**
     * Returns the text attachment view provider corresponding to -fileType. The default implementation queries the text
     * attachment view provider class via +[NSTextAttachment textAttachmentViewProviderClassForFileType:]. When non-nil,
     * it instantiates a view, then, fills properties declared in NSTextAttachmentViewProvider if implemented
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("viewProviderForParentView:location:textContainer:")
    NSTextAttachmentViewProvider viewProviderForParentViewLocationTextContainer(UIView parentView,
            @Mapped(ObjCObjectMapper.class) NSTextLocation location, NSTextContainer textContainer);
}

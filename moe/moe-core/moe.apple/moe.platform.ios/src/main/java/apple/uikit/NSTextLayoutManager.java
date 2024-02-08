package apple.uikit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSAttributedString;
import apple.foundation.NSCoder;
import apple.foundation.NSDictionary;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSOperationQueue;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSSecureCoding;
import apple.uikit.protocol.NSTextLayoutManagerDelegate;
import apple.uikit.protocol.NSTextLocation;
import apple.uikit.protocol.NSTextSelectionDataSource;
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
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import apple.corefoundation.struct.CGPoint;
import apple.corefoundation.struct.CGRect;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * NSTextLayoutManager is the center piece of the TextKit object network maintaining the layout geometry via an array of
 * NSTextContainer and layout results with NSTextLayoutFragment associated with NSTextElement vended from the owner
 * NSTextContentManager.
 * 
 * API-Since: 15.0
 */
@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSTextLayoutManager extends NSObject implements NSSecureCoding, NSTextSelectionDataSource {
    static {
        NatJ.register();
    }

    @Generated
    protected NSTextLayoutManager(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    /**
     * Sets the rendering attribute. Passing nil value indicates overriding the specified attribute by removing from the
     * final attributes passed to the layout and rendering engine. This is a convenience over
     * -setRenderingAttributes:forTextRange:.
     */
    @Generated
    @Selector("addRenderingAttribute:value:forTextRange:")
    public native void addRenderingAttributeValueForTextRange(@NotNull String renderingAttribute,
            @Nullable @Mapped(ObjCObjectMapper.class) Object value, @NotNull NSTextRange textRange);

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSTextLayoutManager alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native NSTextLayoutManager allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    @Generated
    @Selector("baseWritingDirectionAtLocation:")
    @NInt
    public native long baseWritingDirectionAtLocation(@NotNull @Mapped(ObjCObjectMapper.class) NSTextLocation location);

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
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Nullable
    @Generated
    @Selector("delegate")
    @MappedReturn(ObjCObjectMapper.class)
    public native NSTextLayoutManagerDelegate delegate();

    @Generated
    @Selector("description")
    public static native String description_static();

    @NotNull
    @Generated
    @Selector("documentRange")
    public native NSTextRange documentRange();

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(@NotNull NSCoder coder);

    /**
     * Performs the layout for filling bounds inside the last text container.
     */
    @Generated
    @Selector("ensureLayoutForBounds:")
    public native void ensureLayoutForBounds(@ByValue CGRect bounds);

    /**
     * Performs the layout for textRange.
     */
    @Generated
    @Selector("ensureLayoutForRange:")
    public native void ensureLayoutForRange(@NotNull NSTextRange range);

    @Generated
    @Selector("enumerateCaretOffsetsInLineFragmentAtLocation:usingBlock:")
    public native void enumerateCaretOffsetsInLineFragmentAtLocationUsingBlock(
            @NotNull @Mapped(ObjCObjectMapper.class) NSTextLocation location,
            @NotNull @ObjCBlock(name = "call_enumerateCaretOffsetsInLineFragmentAtLocationUsingBlock") NSTextSelectionDataSource.Block_enumerateCaretOffsetsInLineFragmentAtLocationUsingBlock block);

    @Generated
    @IsOptional
    @Selector("enumerateContainerBoundariesFromLocation:reverse:usingBlock:")
    public native void enumerateContainerBoundariesFromLocationReverseUsingBlock(
            @NotNull @Mapped(ObjCObjectMapper.class) NSTextLocation location, boolean reverse,
            @NotNull @ObjCBlock(name = "call_enumerateContainerBoundariesFromLocationReverseUsingBlock") NSTextSelectionDataSource.Block_enumerateContainerBoundariesFromLocationReverseUsingBlock block);

    /**
     * Enumerates the rendering attributes from location. It enumerates only ranges with rendering attributes specified.
     * Returning NO from block breaks out of the enumeration.
     */
    @Generated
    @Selector("enumerateRenderingAttributesFromLocation:reverse:usingBlock:")
    public native void enumerateRenderingAttributesFromLocationReverseUsingBlock(
            @NotNull @Mapped(ObjCObjectMapper.class) NSTextLocation location, boolean reverse,
            @NotNull @ObjCBlock(name = "call_enumerateRenderingAttributesFromLocationReverseUsingBlock") Block_enumerateRenderingAttributesFromLocationReverseUsingBlock block);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_enumerateRenderingAttributesFromLocationReverseUsingBlock {
        @Generated
        boolean call_enumerateRenderingAttributesFromLocationReverseUsingBlock(
                @NotNull NSTextLayoutManager textLayoutManager, @NotNull NSDictionary<String, ?> attributes,
                @NotNull NSTextRange textRange);
    }

    @Generated
    @Selector("enumerateSubstringsFromLocation:options:usingBlock:")
    public native void enumerateSubstringsFromLocationOptionsUsingBlock(
            @NotNull @Mapped(ObjCObjectMapper.class) NSTextLocation location, @NUInt long options,
            @NotNull @ObjCBlock(name = "call_enumerateSubstringsFromLocationOptionsUsingBlock") NSTextSelectionDataSource.Block_enumerateSubstringsFromLocationOptionsUsingBlock block);

    /**
     * Enumerates the text layout fragments starting at textLocation. If textLocation=nil, it assumes
     * self.textContentManager.documentRange.location; uses self.documentRange.endLocation for reverse enumeration. When
     * enumerating backward, it starts with the fragment preceding the one containing textLocation. If enumerated at
     * least one fragment, it returns the edge of the enumerated range. Note that the enumerated range might not match
     * the range of the last element returned. It enumerates the elements in the sequence, but it can skip a range (it
     * can limit the maximum number of text elements enumerated for a single invocation or hide some elements from the
     * layout). Returning NO from block breaks out of the enumeration.
     */
    @Nullable
    @Generated
    @Selector("enumerateTextLayoutFragmentsFromLocation:options:usingBlock:")
    @MappedReturn(ObjCObjectMapper.class)
    public native NSTextLocation enumerateTextLayoutFragmentsFromLocationOptionsUsingBlock(
            @Nullable @Mapped(ObjCObjectMapper.class) NSTextLocation location, @NUInt long options,
            @NotNull @ObjCBlock(name = "call_enumerateTextLayoutFragmentsFromLocationOptionsUsingBlock") Block_enumerateTextLayoutFragmentsFromLocationOptionsUsingBlock block);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_enumerateTextLayoutFragmentsFromLocationOptionsUsingBlock {
        @Generated
        boolean call_enumerateTextLayoutFragmentsFromLocationOptionsUsingBlock(
                @NotNull NSTextLayoutFragment layoutFragment);
    }

    /**
     * Enumerates text segments of type in textRange. A text segment is both logically and visually contiguous portion
     * of the text content inside a line fragment. It can be defined with a single text range. The segments are
     * enumerated visually from left to right. Returning NO from block breaks out of the enumeration.
     */
    @Generated
    @Selector("enumerateTextSegmentsInRange:type:options:usingBlock:")
    public native void enumerateTextSegmentsInRangeTypeOptionsUsingBlock(@NotNull NSTextRange textRange,
            @NInt long type, @NUInt long options,
            @NotNull @ObjCBlock(name = "call_enumerateTextSegmentsInRangeTypeOptionsUsingBlock") Block_enumerateTextSegmentsInRangeTypeOptionsUsingBlock block);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_enumerateTextSegmentsInRangeTypeOptionsUsingBlock {
        @Generated
        boolean call_enumerateTextSegmentsInRangeTypeOptionsUsingBlock(@Nullable NSTextRange textSegmentRange,
                @ByValue CGRect textSegmentFrame, @NFloat double baselinePosition,
                @NotNull NSTextContainer textContainer);
    }

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native NSTextLayoutManager init();

    @Generated
    @Selector("initWithCoder:")
    public native NSTextLayoutManager initWithCoder(@NotNull NSCoder coder);

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

    /**
     * Invalidates layout information for textRange
     */
    @Generated
    @Selector("invalidateLayoutForRange:")
    public native void invalidateLayoutForRange(@NotNull NSTextRange range);

    /**
     * Invalidates the rendering attributes in textRange. Enumerating rendering attributes will skip the invalidated
     * range.
     */
    @Generated
    @Selector("invalidateRenderingAttributesForTextRange:")
    public native void invalidateRenderingAttributesForTextRange(@NotNull NSTextRange textRange);

    @Generated
    @Selector("isSubclassOfClass:")
    public static native boolean isSubclassOfClass(Class aClass);

    @NotNull
    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    /**
     * If non-nil, it performs layout in the specified queue until estimatedUsageBounds=NO.
     */
    @Nullable
    @Generated
    @Selector("layoutQueue")
    public native NSOperationQueue layoutQueue();

    /**
     * When YES, enables internal security analysis for malicious inputs and activates defensive behaviors. By enabling
     * this functionality, it's possible certain text such as a very long paragraph might result in unexpected layout.
     * NO by default.
     */
    @Generated
    @Selector("limitsLayoutForSuspiciousContents")
    public native boolean limitsLayoutForSuspiciousContents();

    @Nullable
    @Generated
    @Selector("lineFragmentRangeForPoint:inContainerAtLocation:")
    public native NSTextRange lineFragmentRangeForPointInContainerAtLocation(@ByValue CGPoint point,
            @NotNull @Mapped(ObjCObjectMapper.class) NSTextLocation location);

    /**
     * The default set of attributes for rendering NSLinkAttributeName. The base NSTextLayoutManager class returns with
     * NSUnderlineStyleSingle for NSUnderlineStyleAttributeName and the platform link color for
     * NSForegroundColorAttributeName. The platform color for macOS is +linkColor. Other platforms uses +blueColor.
     */
    @NotNull
    @Generated
    @Selector("linkRenderingAttributes")
    public static native NSDictionary<String, ?> linkRenderingAttributes();

    @Nullable
    @Generated
    @Selector("locationFromLocation:withOffset:")
    @MappedReturn(ObjCObjectMapper.class)
    public native NSTextLocation locationFromLocationWithOffset(
            @NotNull @Mapped(ObjCObjectMapper.class) NSTextLocation location, @NInt long offset);

    @Generated
    @Owned
    @Selector("new")
    public static native NSTextLayoutManager new_objc();

    @Generated
    @Selector("offsetFromLocation:toLocation:")
    @NInt
    public native long offsetFromLocationToLocation(@NotNull @Mapped(ObjCObjectMapper.class) NSTextLocation from,
            @NotNull @Mapped(ObjCObjectMapper.class) NSTextLocation to);

    /**
     * Removes attribute from textRange. This is a convenience over -setRenderingAttributes:forTextRange:.
     */
    @Generated
    @Selector("removeRenderingAttribute:forTextRange:")
    public native void removeRenderingAttributeForTextRange(@NotNull String renderingAttribute,
            @NotNull NSTextRange textRange);

    /**
     * Returns a dictionary of rendering attributes for rendering NSLinkAttributeName. Just as other rendering
     * attributes, specifying NSNull removes the attribute from the final attributes used for rendering. It has priority
     * over the general rendering attributes.
     */
    @NotNull
    @Generated
    @Selector("renderingAttributesForLink:atLocation:")
    public native NSDictionary<String, ?> renderingAttributesForLinkAtLocation(
            @NotNull @Mapped(ObjCObjectMapper.class) Object link,
            @NotNull @Mapped(ObjCObjectMapper.class) NSTextLocation location);

    /**
     * A callback block invoked whenever NSTextLayoutManager needs to validate the rendering attributes for the range.
     * The validator should use -setRenderingAttributes:forTextRange: to fill the rendering attributes appropriate for
     * the range inside textLayoutFragment.
     */
    @Nullable
    @Generated
    @Selector("renderingAttributesValidator")
    @ObjCBlock(name = "call_renderingAttributesValidator_ret")
    public native Block_renderingAttributesValidator_ret renderingAttributesValidator();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_renderingAttributesValidator_ret {
        @Generated
        void call_renderingAttributesValidator_ret(@NotNull NSTextLayoutManager arg0,
                @NotNull NSTextLayoutFragment arg1);
    }

    @Generated
    @Selector("replaceContentsInRange:withAttributedString:")
    public native void replaceContentsInRangeWithAttributedString(@NotNull NSTextRange range,
            @NotNull NSAttributedString attributedString);

    @Generated
    @Selector("replaceContentsInRange:withTextElements:")
    public native void replaceContentsInRangeWithTextElements(@NotNull NSTextRange range,
            @NotNull NSArray<? extends NSTextElement> textElements);

    /**
     * This method should be used in order to replace an NSTextContentManager with a new one, leaving all related
     * objects intact. This method makes sure the NSTextLayoutManager doesn't get deallocated while migrating to the new
     * manager.
     */
    @Generated
    @Selector("replaceTextContentManager:")
    public native void replaceTextContentManager(@NotNull NSTextContentManager textContentManager);

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("setDelegate:")
    public native void setDelegate_unsafe(@Nullable @Mapped(ObjCObjectMapper.class) NSTextLayoutManagerDelegate value);

    @Generated
    public void setDelegate(@Nullable @Mapped(ObjCObjectMapper.class) NSTextLayoutManagerDelegate value) {
        Object __old = delegate();
        if (value != null) {
            org.moe.natj.objc.ObjCRuntime.associateObjCObject(this, value);
        }
        setDelegate_unsafe(value);
        if (__old != null) {
            org.moe.natj.objc.ObjCRuntime.dissociateObjCObject(this, __old);
        }
    }

    /**
     * If non-nil, it performs layout in the specified queue until estimatedUsageBounds=NO.
     */
    @Generated
    @Selector("setLayoutQueue:")
    public native void setLayoutQueue(@Nullable NSOperationQueue value);

    /**
     * When YES, enables internal security analysis for malicious inputs and activates defensive behaviors. By enabling
     * this functionality, it's possible certain text such as a very long paragraph might result in unexpected layout.
     * NO by default.
     */
    @Generated
    @Selector("setLimitsLayoutForSuspiciousContents:")
    public native void setLimitsLayoutForSuspiciousContents(boolean value);

    /**
     * Sets the rendering attributes.
     */
    @Generated
    @Selector("setRenderingAttributes:forTextRange:")
    public native void setRenderingAttributesForTextRange(@NotNull NSDictionary<String, ?> renderingAttributes,
            @NotNull NSTextRange textRange);

    /**
     * A callback block invoked whenever NSTextLayoutManager needs to validate the rendering attributes for the range.
     * The validator should use -setRenderingAttributes:forTextRange: to fill the rendering attributes appropriate for
     * the range inside textLayoutFragment.
     */
    @Generated
    @Selector("setRenderingAttributesValidator:")
    public native void setRenderingAttributesValidator(
            @Nullable @ObjCBlock(name = "call_setRenderingAttributesValidator") Block_setRenderingAttributesValidator value);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setRenderingAttributesValidator {
        @Generated
        void call_setRenderingAttributesValidator(@NotNull NSTextLayoutManager arg0,
                @NotNull NSTextLayoutFragment arg1);
    }

    /**
     * The text container object providing geometric information for the layout destination. If
     * isSimpleRectangularTextContainer=NO, NSTextLayoutManager always fill from the top instead of allowing
     * non-contiguous layout support.
     */
    @Generated
    @Selector("setTextContainer:")
    public native void setTextContainer(@Nullable NSTextContainer value);

    /**
     * Returns an NSTextSelectionNavigation configured to have the text layout manager as NSTextSelectionDataSource
     */
    @Generated
    @Selector("setTextSelectionNavigation:")
    public native void setTextSelectionNavigation(@NotNull NSTextSelectionNavigation value);

    /**
     * An array of NSTextSelections associated by the text layout manager. Each NSTextSelection represents an insertion
     * point. The selection state is shared among all view ports connected to the text layout manager via text
     * containers.
     */
    @Generated
    @Selector("setTextSelections:")
    public native void setTextSelections(@NotNull NSArray<? extends NSTextSelection> value);

    /**
     * If YES, uses the leading as specified by the font. However, this is not appropriate for most UI text. YES by
     * default.
     */
    @Generated
    @Selector("setUsesFontLeading:")
    public native void setUsesFontLeading(boolean value);

    /**
     * When YES, NSTextLayoutManager will attempt to hyphenate when wrapping lines. May be overridden on a per-paragraph
     * basis by the NSParagraphStyle's usesDefaultHyphenation. The receiver makes the best effort to decide the exact
     * logic including the hyphenation factor based on the context. The default value is NO. Can be overridden by the
     * preference key @"NSUsesDefaultHyphenation".
     */
    @Generated
    @Selector("setUsesHyphenation:")
    public native void setUsesHyphenation(boolean value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    /**
     * The text container object providing geometric information for the layout destination. If
     * isSimpleRectangularTextContainer=NO, NSTextLayoutManager always fill from the top instead of allowing
     * non-contiguous layout support.
     */
    @Nullable
    @Generated
    @Selector("textContainer")
    public native NSTextContainer textContainer();

    /**
     * Pointing to the NSTextContentManager object strongly referencing the text layout manager.
     */
    @Nullable
    @Generated
    @Selector("textContentManager")
    public native NSTextContentManager textContentManager();

    /**
     * Returns the text layout fragment containing the document location, location.
     */
    @Nullable
    @Generated
    @Selector("textLayoutFragmentForLocation:")
    public native NSTextLayoutFragment textLayoutFragmentForLocation(
            @NotNull @Mapped(ObjCObjectMapper.class) NSTextLocation location);

    /**
     * Returns the text layout fragment containing position inside the coordinate system for textContainer.
     */
    @Nullable
    @Generated
    @Selector("textLayoutFragmentForPosition:")
    public native NSTextLayoutFragment textLayoutFragmentForPosition(@ByValue CGPoint position);

    @Generated
    @IsOptional
    @Selector("textLayoutOrientationAtLocation:")
    @NInt
    public native long textLayoutOrientationAtLocation(
            @NotNull @Mapped(ObjCObjectMapper.class) NSTextLocation location);

    @Nullable
    @Generated
    @Selector("textRangeForSelectionGranularity:enclosingLocation:")
    public native NSTextRange textRangeForSelectionGranularityEnclosingLocation(@NInt long selectionGranularity,
            @NotNull @Mapped(ObjCObjectMapper.class) NSTextLocation location);

    /**
     * Returns an NSTextSelectionNavigation configured to have the text layout manager as NSTextSelectionDataSource
     */
    @NotNull
    @Generated
    @Selector("textSelectionNavigation")
    public native NSTextSelectionNavigation textSelectionNavigation();

    /**
     * An array of NSTextSelections associated by the text layout manager. Each NSTextSelection represents an insertion
     * point. The selection state is shared among all view ports connected to the text layout manager via text
     * containers.
     */
    @NotNull
    @Generated
    @Selector("textSelections")
    public native NSArray<? extends NSTextSelection> textSelections();

    /**
     * Returns NSTextViewportLayoutController associated with textContainer.
     */
    @NotNull
    @Generated
    @Selector("textViewportLayoutController")
    public native NSTextViewportLayoutController textViewportLayoutController();

    /**
     * The usage bounds for textContainer. KVO-compliant. Views can observe this property in order to trigger a resize
     * operation. For example, UIView/NSView should call setNeedsUpdateConstraints() when the usage bounds changes.
     */
    @Generated
    @Selector("usageBoundsForTextContainer")
    @ByValue
    public native CGRect usageBoundsForTextContainer();

    /**
     * If YES, uses the leading as specified by the font. However, this is not appropriate for most UI text. YES by
     * default.
     */
    @Generated
    @Selector("usesFontLeading")
    public native boolean usesFontLeading();

    /**
     * When YES, NSTextLayoutManager will attempt to hyphenate when wrapping lines. May be overridden on a per-paragraph
     * basis by the NSParagraphStyle's usesDefaultHyphenation. The receiver makes the best effort to decide the exact
     * logic including the hyphenation factor based on the context. The default value is NO. Can be overridden by the
     * preference key @"NSUsesDefaultHyphenation".
     */
    @Generated
    @Selector("usesHyphenation")
    public native boolean usesHyphenation();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}

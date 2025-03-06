package apple.browserenginekit.protocol;

import apple.browserenginekit.BEAccessibilityTextMarker;
import apple.browserenginekit.BEAccessibilityTextMarkerRange;
import apple.corefoundation.struct.CGPoint;
import apple.corefoundation.struct.CGRect;
import apple.foundation.struct.NSRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

/**
 * Implement BEAccessibilityTextMarkerSupport to support assistive technology features that rely on granular text
 * offsets.
 * 
 * API-Since: 18.2
 */
@Generated
@Library("BrowserEngineKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("BEAccessibilityTextMarkerSupport")
public interface BEAccessibilityTextMarkerSupport {
    /**
     * The accessibility frame for a text range.
     * 
     * @param range The text marker range.
     * @return The bounds in accessibility space of the text marker range. If the bounds cannot be determined, return
     *         CGRectZero.
     * 
     *         API-Since: 18.2
     */
    @Generated
    @Selector("accessibilityBoundsForTextMarkerRange:")
    @ByValue
    CGRect accessibilityBoundsForTextMarkerRange(@NotNull BEAccessibilityTextMarkerRange range);

    /**
     * The accessibility content for a text range.
     * 
     * @param range The text marker range.
     * 
     *              API-Since: 18.2
     */
    @Generated
    @Selector("accessibilityContentForTextMarkerRange:")
    @Nullable
    String accessibilityContentForTextMarkerRange(@NotNull BEAccessibilityTextMarkerRange range);

    /**
     * The text marker representing the end-of-line position of the line pointed to by the given marker.
     * 
     * @param marker The text marker.
     * 
     *               API-Since: 18.2
     */
    @Generated
    @Selector("accessibilityLineEndMarkerForMarker:")
    @Nullable
    BEAccessibilityTextMarker accessibilityLineEndMarkerForMarker(@NotNull BEAccessibilityTextMarker marker);

    /**
     * The text marker representing the start-of-line position of the line pointed to by the given marker.
     * 
     * @param marker The text marker.
     * 
     *               API-Since: 18.2
     */
    @Generated
    @Selector("accessibilityLineStartMarkerForMarker:")
    @Nullable
    BEAccessibilityTextMarker accessibilityLineStartMarkerForMarker(@NotNull BEAccessibilityTextMarker marker);

    /**
     * The text marker for the specific point.
     * 
     * @param point A point in view space.
     * 
     *              API-Since: 18.2
     */
    @Generated
    @Selector("accessibilityMarkerForPoint:")
    @Nullable
    BEAccessibilityTextMarker accessibilityMarkerForPoint(@ByValue CGPoint point);

    /**
     * The text marker after the marker.
     * 
     * @param marker The text marker.
     * 
     *               API-Since: 18.2
     */
    @Generated
    @Selector("accessibilityNextTextMarker:")
    @Nullable
    BEAccessibilityTextMarker accessibilityNextTextMarker(@NotNull BEAccessibilityTextMarker marker);

    /**
     * The text marker before the marker.
     * 
     * @param marker The text marker.
     * 
     *               API-Since: 18.2
     */
    @Generated
    @Selector("accessibilityPreviousTextMarker:")
    @Nullable
    BEAccessibilityTextMarker accessibilityPreviousTextMarker(@NotNull BEAccessibilityTextMarker marker);

    /**
     * The index-based range given a text marker range.
     * 
     * @param range The text marker range.
     * 
     *              API-Since: 18.2
     */
    @Generated
    @Selector("accessibilityRangeForTextMarkerRange:")
    @ByValue
    NSRange accessibilityRangeForTextMarkerRange(@NotNull BEAccessibilityTextMarkerRange range);

    /**
     * The text marker given an index-based position.
     * 
     * @param position The text position as an index.
     * 
     *                 API-Since: 18.2
     */
    @Generated
    @Selector("accessibilityTextMarkerForPosition:")
    @Nullable
    BEAccessibilityTextMarker accessibilityTextMarkerForPosition(@NInt long position);

    /**
     * The text marker range of the current element.
     * 
     * API-Since: 18.2
     */
    @Generated
    @Selector("accessibilityTextMarkerRange")
    @NotNull
    BEAccessibilityTextMarkerRange accessibilityTextMarkerRange();

    /**
     * The text marker range of the current selection. Return nil if there is none.
     * 
     * API-Since: 18.2
     */
    @Generated
    @Selector("accessibilityTextMarkerRangeForCurrentSelection")
    @Nullable
    BEAccessibilityTextMarkerRange accessibilityTextMarkerRangeForCurrentSelection();

    /**
     * The text marker range given an index-based range.
     * 
     * @param range The text marker range as an NSRange.
     * 
     *              API-Since: 18.2
     */
    @Generated
    @Selector("accessibilityTextMarkerRangeForRange:")
    @Nullable
    BEAccessibilityTextMarkerRange accessibilityTextMarkerRangeForRange(@ByValue NSRange range);
}
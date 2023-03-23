package apple.uikit.protocol;

import apple.uikit.UIImage;
import apple.uikit.struct.UIEdgeInsets;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

/**
 * The large content viewer allow users with relevant settings to view content at a larger size.
 * For example, users with an accessibility content size category can long press on a tab bar button to view a larger
 * version.
 * The viewer should not be used as a replacement for proper Dynamic Type support in general.
 * It is intended only for use with items that must remain small due to unavoidable design constraints.
 * For example, buttons in a tab bar remain small to leave more room for the main content.
 * 
 * API-Since: 13.0
 */
@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("UILargeContentViewerItem")
public interface UILargeContentViewerItem {
    /**
     * Returns an image that should be shown in the large content viewer.
     */
    @Generated
    @Selector("largeContentImage")
    UIImage largeContentImage();

    /**
     * Returns insets appropriate for positioning the image in the viewer so that it appears visually centered.
     */
    @Generated
    @Selector("largeContentImageInsets")
    @ByValue
    UIEdgeInsets largeContentImageInsets();

    /**
     * Returns a title that should be shown in the large content viewer.
     */
    @Generated
    @Selector("largeContentTitle")
    String largeContentTitle();

    /**
     * Returns whether the image should be scaled to a larger size appropriate for the viewer.
     * If not, the image will be shown at its intrinsic size.
     * For best results when scaling, use a PDF asset with its "Preserve Vector Data" checkbox checked.
     */
    @Generated
    @Selector("scalesLargeContentImage")
    boolean scalesLargeContentImage();

    /**
     * Returns whether the item shows the large content viewer.
     * In general, only views that cannot scale for the full range of Dynamic Type sizes should return YES.
     * For this property to take effect, the item or an ancestor view must have a UILargeContentViewerInteraction.
     */
    @Generated
    @Selector("showsLargeContentViewer")
    boolean showsLargeContentViewer();
}
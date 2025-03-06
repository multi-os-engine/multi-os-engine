package apple.uikit.protocol;

import apple.foundation.NSIndexPath;
import apple.quartzcore.struct.CATransform3D;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.NFloat;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import apple.corefoundation.struct.CGAffineTransform;
import apple.corefoundation.struct.CGPoint;
import apple.corefoundation.struct.CGRect;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * API-Since: 13.0
 */
@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("NSCollectionLayoutVisibleItem")
public interface NSCollectionLayoutVisibleItem extends UIDynamicItem {
    /**
     * API-Since: 13.0
     */
    @Generated
    @Selector("alpha")
    @NFloat
    double alpha();

    /**
     * API-Since: 13.0
     */
    @Generated
    @Selector("bounds")
    @ByValue
    CGRect bounds();

    /**
     * API-Since: 13.0
     */
    @Generated
    @Selector("center")
    @ByValue
    CGPoint center();

    /**
     * API-Since: 13.0
     */
    @Generated
    @Selector("frame")
    @ByValue
    CGRect frame();

    /**
     * API-Since: 13.0
     */
    @NotNull
    @Generated
    @Selector("indexPath")
    NSIndexPath indexPath();

    /**
     * API-Since: 13.0
     */
    @Generated
    @Selector("isHidden")
    boolean isHidden();

    /**
     * API-Since: 13.0
     */
    @NotNull
    @Generated
    @Selector("name")
    String name();

    /**
     * API-Since: 13.0
     */
    @Generated
    @Selector("representedElementCategory")
    @NUInt
    long representedElementCategory();

    /**
     * API-Since: 13.0
     */
    @Nullable
    @Generated
    @Selector("representedElementKind")
    String representedElementKind();

    /**
     * API-Since: 13.0
     */
    @Generated
    @Selector("setAlpha:")
    void setAlpha(@NFloat double value);

    /**
     * API-Since: 13.0
     */
    @Generated
    @Selector("setCenter:")
    void setCenter(@ByValue CGPoint value);

    /**
     * API-Since: 13.0
     */
    @Generated
    @Selector("setHidden:")
    void setHidden(boolean value);

    /**
     * API-Since: 13.0
     */
    @Generated
    @Selector("setTransform3D:")
    void setTransform3D(@ByValue CATransform3D value);

    /**
     * API-Since: 13.0
     */
    @Generated
    @Selector("setTransform:")
    void setTransform(@ByValue CGAffineTransform value);

    /**
     * API-Since: 13.0
     */
    @Generated
    @Selector("setZIndex:")
    void setZIndex(@NInt long value);

    /**
     * API-Since: 13.0
     */
    @Generated
    @Selector("transform")
    @ByValue
    CGAffineTransform transform();

    /**
     * API-Since: 13.0
     */
    @Generated
    @Selector("transform3D")
    @ByValue
    CATransform3D transform3D();

    /**
     * API-Since: 13.0
     */
    @Generated
    @Selector("zIndex")
    @NInt
    long zIndex();
}
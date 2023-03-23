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

/**
 * API-Since: 13.0
 */
@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("NSCollectionLayoutVisibleItem")
public interface NSCollectionLayoutVisibleItem extends UIDynamicItem {
    @Generated
    @Selector("alpha")
    @NFloat
    double alpha();

    @Generated
    @Selector("bounds")
    @ByValue
    CGRect bounds();

    @Generated
    @Selector("center")
    @ByValue
    CGPoint center();

    @Generated
    @Selector("frame")
    @ByValue
    CGRect frame();

    @Generated
    @Selector("indexPath")
    NSIndexPath indexPath();

    @Generated
    @Selector("isHidden")
    boolean isHidden();

    @Generated
    @Selector("name")
    String name();

    @Generated
    @Selector("representedElementCategory")
    @NUInt
    long representedElementCategory();

    @Generated
    @Selector("representedElementKind")
    String representedElementKind();

    @Generated
    @Selector("setAlpha:")
    void setAlpha(@NFloat double value);

    @Generated
    @Selector("setCenter:")
    void setCenter(@ByValue CGPoint value);

    @Generated
    @Selector("setHidden:")
    void setHidden(boolean value);

    @Generated
    @Selector("setTransform3D:")
    void setTransform3D(@ByValue CATransform3D value);

    @Generated
    @Selector("setTransform:")
    void setTransform(@ByValue CGAffineTransform value);

    @Generated
    @Selector("setZIndex:")
    void setZIndex(@NInt long value);

    @Generated
    @Selector("transform")
    @ByValue
    CGAffineTransform transform();

    @Generated
    @Selector("transform3D")
    @ByValue
    CATransform3D transform3D();

    @Generated
    @Selector("zIndex")
    @NInt
    long zIndex();
}
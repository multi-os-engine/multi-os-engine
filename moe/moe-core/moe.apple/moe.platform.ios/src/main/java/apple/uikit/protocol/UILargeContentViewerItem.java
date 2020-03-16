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

@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("UILargeContentViewerItem")
public interface UILargeContentViewerItem {
    @Generated
    @Selector("largeContentImage")
    UIImage largeContentImage();

    @Generated
    @Selector("largeContentImageInsets")
    @ByValue
    UIEdgeInsets largeContentImageInsets();

    @Generated
    @Selector("largeContentTitle")
    String largeContentTitle();

    @Generated
    @Selector("scalesLargeContentImage")
    boolean scalesLargeContentImage();

    @Generated
    @Selector("showsLargeContentViewer")
    boolean showsLargeContentViewer();
}
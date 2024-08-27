package apple.uikit.protocol;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import apple.corefoundation.struct.CGRect;
import apple.uikit.UIView;
import org.jetbrains.annotations.NotNull;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.objc.ann.Selector;

/**
 * API-Since: 16.0
 */
@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("UIPopoverPresentationControllerSourceItem")
public interface UIPopoverPresentationControllerSourceItem {

    /**
     * API-Since: 17.0
     */
    @Generated
    @Selector("frameInView:")
    @ByValue
    CGRect frameInView(@NotNull UIView referenceView);
}
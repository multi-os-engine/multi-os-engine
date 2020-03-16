package apple.uikit.protocol;

import apple.coregraphics.struct.CGPoint;
import apple.coregraphics.struct.CGSize;
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
@ObjCProtocolName("UIFocusItemScrollableContainer")
public interface UIFocusItemScrollableContainer extends UIFocusItemContainer {
    @Generated
    @Selector("contentOffset")
    @ByValue
    CGPoint contentOffset();

    @Generated
    @Selector("contentSize")
    @ByValue
    CGSize contentSize();

    @Generated
    @Selector("setContentOffset:")
    void setContentOffset(@ByValue CGPoint value);

    @Generated
    @Selector("visibleSize")
    @ByValue
    CGSize visibleSize();
}
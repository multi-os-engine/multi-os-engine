package apple.uikit.protocol;

import apple.uikit.UIView;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.jetbrains.annotations.Nullable;

/**
 * API-Since: 11.0
 */
@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("UIInteraction")
public interface UIInteraction {
    @Generated
    @Selector("didMoveToView:")
    void didMoveToView(@Nullable UIView view);

    @Nullable
    @Generated
    @Selector("view")
    UIView view();

    @Generated
    @Selector("willMoveToView:")
    void willMoveToView(@Nullable UIView view);
}
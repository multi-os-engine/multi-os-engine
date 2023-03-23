package apple.uikit.protocol;

import apple.uikit.UIView;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import apple.corefoundation.struct.CGPoint;

/**
 * UISpringLoadedContext supplies information about the springloading state and current drag.
 * 
 * API-Since: 11.0
 */
@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("UISpringLoadedInteractionContext")
public interface UISpringLoadedInteractionContext {
    /**
     * Returns the point computed as the location of the current drag in a given view.
     * 
     * @param view A view on which the drag is taking place. Specify nil to indicate the window.
     * @return A point in the local coordinate system of `view`.
     */
    @Generated
    @Selector("locationInView:")
    @ByValue
    CGPoint locationInView(UIView view);

    /**
     * The `targetItem` allows to distinguish a region of the view on which the interaction is installed.
     * It is convenient to set this property to a model object associated to `targetView`.
     */
    @Generated
    @Selector("setTargetItem:")
    void setTargetItem(@Mapped(ObjCObjectMapper.class) Object value);

    /**
     * The view to which the interaction effect is applied. Defaults to the interaction's view.
     */
    @Generated
    @Selector("setTargetView:")
    void setTargetView(UIView value);

    /**
     * The state that describes the current springloading style.
     */
    @Generated
    @Selector("state")
    @NInt
    long state();

    /**
     * The `targetItem` allows to distinguish a region of the view on which the interaction is installed.
     * It is convenient to set this property to a model object associated to `targetView`.
     */
    @Generated
    @Selector("targetItem")
    @MappedReturn(ObjCObjectMapper.class)
    Object targetItem();

    /**
     * The view to which the interaction effect is applied. Defaults to the interaction's view.
     */
    @Generated
    @Selector("targetView")
    UIView targetView();
}

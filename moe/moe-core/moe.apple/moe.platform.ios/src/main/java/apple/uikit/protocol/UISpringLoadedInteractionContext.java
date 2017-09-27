package apple.uikit.protocol;

import apple.coregraphics.struct.CGPoint;
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

@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("UISpringLoadedInteractionContext")
public interface UISpringLoadedInteractionContext {
    @Generated
    @Selector("locationInView:")
    @ByValue
    CGPoint locationInView(UIView view);

    @Generated
    @Selector("setTargetItem:")
    void setTargetItem(@Mapped(ObjCObjectMapper.class) Object value);

    @Generated
    @Selector("setTargetView:")
    void setTargetView(UIView value);

    @Generated
    @Selector("state")
    @NInt
    long state();

    @Generated
    @Selector("targetItem")
    @MappedReturn(ObjCObjectMapper.class)
    Object targetItem();

    @Generated
    @Selector("targetView")
    UIView targetView();
}
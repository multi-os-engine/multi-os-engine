package apple.uikit.protocol;

import apple.coregraphics.struct.CGRect;
import apple.foundation.NSArray;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("UIFocusItemContainer")
public interface UIFocusItemContainer {
    @Generated
    @Selector("coordinateSpace")
    @MappedReturn(ObjCObjectMapper.class)
    UICoordinateSpace coordinateSpace();

    @Generated
    @Selector("focusItemsInRect:")
    NSArray<?> focusItemsInRect(@ByValue CGRect rect);
}
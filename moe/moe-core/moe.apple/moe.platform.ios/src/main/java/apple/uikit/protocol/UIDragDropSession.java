package apple.uikit.protocol;

import apple.coregraphics.struct.CGPoint;
import apple.foundation.NSArray;
import apple.foundation.protocol.NSItemProviderReading;
import apple.uikit.UIDragItem;
import apple.uikit.UIView;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("UIDragDropSession")
public interface UIDragDropSession {
    @Generated
    @Selector("allowsMoveOperation")
    boolean allowsMoveOperation();

    @Generated
    @Selector("canLoadObjectsOfClass:")
    boolean canLoadObjectsOfClass(@Mapped(ObjCObjectMapper.class) NSItemProviderReading aClass);

    @Generated
    @Selector("hasItemsConformingToTypeIdentifiers:")
    boolean hasItemsConformingToTypeIdentifiers(NSArray<String> typeIdentifiers);

    @Generated
    @Selector("isRestrictedToDraggingApplication")
    boolean isRestrictedToDraggingApplication();

    @Generated
    @Selector("items")
    NSArray<? extends UIDragItem> items();

    @Generated
    @Selector("locationInView:")
    @ByValue
    CGPoint locationInView(UIView view);
}
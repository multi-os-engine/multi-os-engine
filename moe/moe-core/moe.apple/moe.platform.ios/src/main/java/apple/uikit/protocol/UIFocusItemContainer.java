package apple.uikit.protocol;

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
import apple.corefoundation.struct.CGRect;

/**
 * Objects conforming to UIFocusItemContainer are responsible for providing which focus items they
 * contain and where they are.
 * 
 * API-Since: 12.0
 */
@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("UIFocusItemContainer")
public interface UIFocusItemContainer {
    /**
     * The coordinate space of the focus items contained in this container. The focus items returned by
     * focusItemsInRect: should report their frames in this coordinate space.
     * If you are implementing this protocol, you may find it convenient to return the UIScreen as your coordinate
     * space, and ensure that your contained items report their frames in screen space.
     * Similarly, you might find that your focus items' containing UIView or UIWindow is the most convenient coordinate
     * space to use.
     * You may also choose to implement your own object that conforms to UICoordinateSpace, if that is the most natural
     * solution for your architecture.
     */
    @Generated
    @Selector("coordinateSpace")
    @MappedReturn(ObjCObjectMapper.class)
    UICoordinateSpace coordinateSpace();

    /**
     * Returns an array of all focus items within this container that intersect with the provided rect. `rect` is
     * expressed in `coordinateSpace`.
     * Note: starting in iOS & tvOS 16.0, UIView will return its subviews from this method. If you override this method
     * in a UIView subclass, it will be your responsibility to call super and merge your array of custom focus items
     * with UIView's default focus items.
     */
    @Generated
    @Selector("focusItemsInRect:")
    NSArray<?> focusItemsInRect(@ByValue CGRect rect);
}
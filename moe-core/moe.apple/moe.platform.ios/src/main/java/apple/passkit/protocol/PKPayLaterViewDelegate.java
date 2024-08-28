package apple.passkit.protocol;

import apple.passkit.PKPayLaterView;
import org.jetbrains.annotations.NotNull;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

/**
 * API-Since: 17.0
 */
@Generated
@Library("PassKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("PKPayLaterViewDelegate")
public interface PKPayLaterViewDelegate {
    /**
     * If rendering this view using manual layout, then conform to this protocol to layout the view when
     * PKPayLaterView's height changes.
     */
    @Generated
    @Selector("payLaterViewDidUpdateHeight:")
    void payLaterViewDidUpdateHeight(@NotNull PKPayLaterView view);
}
package apple.uikit.protocol;

import apple.foundation.struct.NSRange;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

/**
 * The UIAccessibilityContainerDataTable and UIAccessibilityContainerDataTableCell protocols
 * convey more information specific to tables that contain structured data.
 */
@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("UIAccessibilityContainerDataTableCell")
public interface UIAccessibilityContainerDataTableCell {
    @Generated
    @Selector("accessibilityColumnRange")
    @ByValue
    NSRange accessibilityColumnRange();

    /**
     * The row/column index + the row/column span.
     * default == { NSNotFound, 0 }
     */
    @Generated
    @Selector("accessibilityRowRange")
    @ByValue
    NSRange accessibilityRowRange();
}
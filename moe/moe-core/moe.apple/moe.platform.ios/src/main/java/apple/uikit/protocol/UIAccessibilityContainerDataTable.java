package apple.uikit.protocol;

import apple.foundation.NSArray;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("UIAccessibilityContainerDataTable")
public interface UIAccessibilityContainerDataTable {
    @Generated
    @Selector("accessibilityColumnCount")
    @NUInt
    long accessibilityColumnCount();

    /**
     * Return the cell element for a specific row/column, including elements that span rows/columns.
     * default == nil
     */
    @Generated
    @Selector("accessibilityDataTableCellElementForRow:column:")
    @MappedReturn(ObjCObjectMapper.class)
    UIAccessibilityContainerDataTableCell accessibilityDataTableCellElementForRowColumn(@NUInt long row,
            @NUInt long column);

    @Generated
    @IsOptional
    @Selector("accessibilityHeaderElementsForColumn:")
    default NSArray<?> accessibilityHeaderElementsForColumn(@NUInt long column) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Return header elements for a specific row or column.
     * default == nil
     */
    @Generated
    @IsOptional
    @Selector("accessibilityHeaderElementsForRow:")
    default NSArray<?> accessibilityHeaderElementsForRow(@NUInt long row) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @Selector("accessibilityRowCount")
    @NUInt
    long accessibilityRowCount();
}
package apple.uikit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * Specifies a list appearance that encompasses both UICollectionView & UITableView lists.
 * 
 * API-Since: 18.0
 */
@Generated
public final class UIListEnvironment {
    @Generated
    private UIListEnvironment() {
    }

    /**
     * Indicates the absence of any information about whether or not the trait collection is from a view in a list
     * environment.
     * 
     * API-Since: 18.0
     */
    @Generated @NInt public static final long Unspecified = 0x0000000000000000L;
    /**
     * There is no containing list.
     * 
     * API-Since: 18.0
     */
    @Generated @NInt public static final long None = 0x0000000000000001L;
    /**
     * Contained within a plain-style list.
     * 
     * API-Since: 18.0
     */
    @Generated @NInt public static final long Plain = 0x0000000000000002L;
    /**
     * Contained within a grouped-style list.
     * 
     * API-Since: 18.0
     */
    @Generated @NInt public static final long Grouped = 0x0000000000000003L;
    /**
     * Contained within a inset-grouped-style list.
     */
    @Generated @NInt public static final long InsetGrouped = 0x0000000000000004L;
    /**
     * Contained within a sidebar-style list.
     */
    @Generated @NInt public static final long Sidebar = 0x0000000000000005L;
    /**
     * Contained within a sidebar-plain-style list.
     */
    @Generated @NInt public static final long SidebarPlain = 0x0000000000000006L;
}
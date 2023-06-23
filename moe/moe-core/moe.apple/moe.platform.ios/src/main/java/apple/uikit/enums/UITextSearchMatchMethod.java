package apple.uikit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

@Generated
public final class UITextSearchMatchMethod {
    @Generated
    private UITextSearchMatchMethod() {
    }

    /**
     * Word contains search string.
     */
    @Generated @NInt public static final long Contains = 0x0000000000000000L;
    /**
     * Word contains the search string as a prefix.
     */
    @Generated @NInt public static final long StartsWith = 0x0000000000000001L;
    /**
     * Word is an exact match for the search string.
     */
    @Generated @NInt public static final long FullWord = 0x0000000000000002L;
}
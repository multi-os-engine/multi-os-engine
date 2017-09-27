package apple.fileprovider.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

@Generated
public final class NSFileProviderItemCapabilities {
    @Generated
    private NSFileProviderItemCapabilities() {
    }

    @Generated @NUInt public static final long Reading = 0x0000000000000001L;
    @Generated @NUInt public static final long Writing = 0x0000000000000002L;
    @Generated @NUInt public static final long Reparenting = 0x0000000000000004L;
    @Generated @NUInt public static final long Renaming = 0x0000000000000008L;
    @Generated @NUInt public static final long Trashing = 0x0000000000000010L;
    @Generated @NUInt public static final long Deleting = 0x0000000000000020L;
    @Generated @NUInt public static final long AddingSubItems = 0x0000000000000002L;
    @Generated @NUInt public static final long ContentEnumerating = 0x0000000000000001L;
    @Generated @NUInt public static final long All = 0x000000000000003FL;
}
package apple.fileprovider.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

@Generated
public final class NSFileProviderFileSystemFlags {
    @Generated
    private NSFileProviderFileSystemFlags() {
    }

    /**
     * Item has the POSIX user-executable (u+x) permission.
     */
    @Generated @NUInt public static final long UserExecutable = 0x0000000000000001L;
    /**
     * Item has the POSIX user-readable (u+r) permission.
     */
    @Generated @NUInt public static final long UserReadable = 0x0000000000000002L;
    /**
     * Item has the POSIX user-writable (u+w) permission.
     */
    @Generated @NUInt public static final long UserWritable = 0x0000000000000004L;
    /**
     * Item should not be presented in the file viewers.
     * <p>
     * This includes both the UF_HIDDEN BSD flag and the Invisible bit from the
     * FinderInfo. When syncing down, the system only sets the UF_HIDDEN
     * flag.
     */
    @Generated @NUInt public static final long Hidden = 0x0000000000000008L;
    /**
     * The extension of the item should not be presented in the file viewers.
     */
    @Generated @NUInt public static final long PathExtensionHidden = 0x0000000000000010L;
}

package apple.metal.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

@Generated
public final class MTLDynamicLibraryError {
    @Generated
    private MTLDynamicLibraryError() {
    }

    @Generated @NUInt public static final long None = 0x0000000000000000L;
    @Generated @NUInt public static final long InvalidFile = 0x0000000000000001L;
    @Generated @NUInt public static final long CompilationFailure = 0x0000000000000002L;
    @Generated @NUInt public static final long UnresolvedInstallName = 0x0000000000000003L;
    @Generated @NUInt public static final long DependencyLoadFailure = 0x0000000000000004L;
    @Generated @NUInt public static final long Unsupported = 0x0000000000000005L;
}
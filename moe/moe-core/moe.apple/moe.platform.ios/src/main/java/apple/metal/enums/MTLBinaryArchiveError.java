package apple.metal.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

@Generated
public final class MTLBinaryArchiveError {
    @Generated
    private MTLBinaryArchiveError() {
    }

    @Generated @NUInt public static final long None = 0x0000000000000000L;
    @Generated @NUInt public static final long InvalidFile = 0x0000000000000001L;
    @Generated @NUInt public static final long UnexpectedElement = 0x0000000000000002L;
    @Generated @NUInt public static final long CompilationFailure = 0x0000000000000003L;
}
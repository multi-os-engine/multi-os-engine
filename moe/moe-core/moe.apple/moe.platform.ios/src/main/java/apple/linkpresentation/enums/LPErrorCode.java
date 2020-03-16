package apple.linkpresentation.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

@Generated
public final class LPErrorCode {
    @Generated
    private LPErrorCode() {
    }

    @Generated @NInt public static final long Unknown = 0x0000000000000001L;
    @Generated @NInt public static final long MetadataFetchFailed = 0x0000000000000002L;
    @Generated @NInt public static final long MetadataFetchCancelled = 0x0000000000000003L;
    @Generated @NInt public static final long MetadataFetchTimedOut = 0x0000000000000004L;
}
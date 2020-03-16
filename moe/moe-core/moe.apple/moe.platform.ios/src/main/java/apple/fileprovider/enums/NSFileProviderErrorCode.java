package apple.fileprovider.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

@Generated
public final class NSFileProviderErrorCode {
    @Generated
    private NSFileProviderErrorCode() {
    }

    @Generated @NInt public static final long NotAuthenticated = 0xFFFFFFFFFFFFFC18L;
    @Generated @NInt public static final long FilenameCollision = 0xFFFFFFFFFFFFFC17L;
    @Generated @NInt public static final long SyncAnchorExpired = 0xFFFFFFFFFFFFFC16L;
    @Generated @NInt public static final long PageExpired = 0xFFFFFFFFFFFFFC16L;
    @Generated @NInt public static final long InsufficientQuota = 0xFFFFFFFFFFFFFC15L;
    @Generated @NInt public static final long ServerUnreachable = 0xFFFFFFFFFFFFFC14L;
    @Generated @NInt public static final long NoSuchItem = 0xFFFFFFFFFFFFFC13L;
}
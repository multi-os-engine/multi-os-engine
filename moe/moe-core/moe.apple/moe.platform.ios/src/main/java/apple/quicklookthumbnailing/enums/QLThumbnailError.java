package apple.quicklookthumbnailing.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

@Generated
public final class QLThumbnailError {
    @Generated
    private QLThumbnailError() {
    }

    @Generated @NInt public static final long GenerationFailed = 0x0000000000000000L;
    @Generated @NInt public static final long SavingToURLFailed = 0x0000000000000001L;
    @Generated @NInt public static final long NoCachedThumbnail = 0x0000000000000002L;
    @Generated @NInt public static final long NoCloudThumbnail = 0x0000000000000003L;
    @Generated @NInt public static final long RequestInvalid = 0x0000000000000004L;
    @Generated @NInt public static final long RequestCancelled = 0x0000000000000005L;
}
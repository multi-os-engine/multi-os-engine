package apple.backgroundassets.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * [@typedef] Download state
 */
@Generated
public final class BADownloadState {
    @Generated
    private BADownloadState() {
    }

    @Generated @NInt public static final long Failed = 0xFFFFFFFFFFFFFFFFL;
    @Generated @NInt public static final long Created = 0x0000000000000000L;
    @Generated @NInt public static final long Waiting = 0x0000000000000001L;
    @Generated @NInt public static final long Downloading = 0x0000000000000002L;
    @Generated @NInt public static final long Finished = 0x0000000000000003L;
}
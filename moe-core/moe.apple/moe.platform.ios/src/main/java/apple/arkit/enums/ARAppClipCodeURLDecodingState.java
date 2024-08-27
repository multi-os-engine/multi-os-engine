package apple.arkit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * A value describing app clip code URL decoding state.
 */
@Generated
public final class ARAppClipCodeURLDecodingState {
    @Generated
    private ARAppClipCodeURLDecodingState() {
    }

    /**
     * App clip code tracking is attempting to decode the URL.
     */
    @Generated @NInt public static final long Decoding = 0x0000000000000000L;
    /**
     * App clip code tracking failed to decode the URL.
     */
    @Generated @NInt public static final long Failed = 0x0000000000000001L;
    /**
     * App clip code tracking decoded the URL.
     */
    @Generated @NInt public static final long Decoded = 0x0000000000000002L;
}

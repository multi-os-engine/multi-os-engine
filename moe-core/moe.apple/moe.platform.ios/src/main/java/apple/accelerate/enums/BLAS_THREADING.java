package apple.accelerate.enums;

import org.moe.natj.general.ann.Generated;

@Generated
public final class BLAS_THREADING {
    @Generated
    private BLAS_THREADING() {
    }

    /**
     * Accelerate decides how many threads to use
     * 
     * API-Since: 18.0
     */
    @Generated public static final int MULTI_THREADED = 0x00000000;
    /**
     * Single threaded only
     * 
     * API-Since: 18.0
     */
    @Generated public static final int SINGLE_THREADED = 0x00000001;
    /**
     * API-Since: 18.0
     */
    @Generated public static final int MAX_OPTIONS = 0x00000002;
}
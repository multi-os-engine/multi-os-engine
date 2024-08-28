package apple.oslog.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

/**
 * [@enum] OSLogEnumeratorOptions
 * 
 * Control the direction of the iteration.
 * 
 * [@constant] OSLogEnumeratorReverse
 * Iterate backward in time. If no starting position is specified,
 * start at the latest entry.
 * 
 * API-Since: 15.0
 */
@Generated
public final class OSLogEnumeratorOptions {
    @Generated
    private OSLogEnumeratorOptions() {
    }

    /**
     * API-Since: 15.0
     */
    @Generated @NUInt public static final long OSLogEnumeratorReverse = 0x0000000000000001L;
}

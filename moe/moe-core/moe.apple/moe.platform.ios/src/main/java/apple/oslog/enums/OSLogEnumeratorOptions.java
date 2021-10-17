package apple.oslog.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

/**
 * [@enum] OSLogEnumeratorOptions
 * <p>
 * Control the direction of the iteration.
 * <p>
 * [@constant] OSLogEnumeratorReverse
 * Iterate backward in time. If no starting position is specified,
 * start at the latest entry.
 */
@Generated
public final class OSLogEnumeratorOptions {
    @Generated
    private OSLogEnumeratorOptions() {
    }

    @Generated @NUInt public static final long OSLogEnumeratorReverse = 0x0000000000000001L;
}

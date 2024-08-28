package apple.phase.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * [@enum] PHASESoundEventError
 * 
 * Sound event error.
 */
@Generated
public final class PHASESoundEventError {
    @Generated
    private PHASESoundEventError() {
    }

    @Generated @NInt public static final long NotFound = 0x0000000050487461L;
    @Generated @NInt public static final long BadData = 0x0000000050487462L;
    @Generated @NInt public static final long InvalidInstance = 0x0000000050487463L;
    @Generated @NInt public static final long APIMisuse = 0x0000000050487464L;
    @Generated @NInt public static final long SystemNotInitialized = 0x0000000050487465L;
    @Generated @NInt public static final long OutOfMemory = 0x0000000050487466L;
}

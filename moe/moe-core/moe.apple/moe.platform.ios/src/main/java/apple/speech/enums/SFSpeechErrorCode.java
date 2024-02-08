package apple.speech.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * API-Since: 17.0
 */
@Generated
public final class SFSpeechErrorCode {
    @Generated
    private SFSpeechErrorCode() {
    }

    /**
     * Error may include `NSUnderlyingErrorKey` in `userInfo`.
     * 
     * API-Since: 17.0
     */
    @Generated @NInt public static final long InternalServiceError = 0x0000000000000001L;
    /**
     * Templates were malformed *
     * 
     * API-Since: 17.0
     */
    @Generated @NInt public static final long UndefinedTemplateClassName = 0x0000000000000007L;
    /**
     * A custom language model file was malformed *
     * 
     * API-Since: 17.0
     */
    @Generated @NInt public static final long MalformedSupplementalModel = 0x0000000000000008L;
}
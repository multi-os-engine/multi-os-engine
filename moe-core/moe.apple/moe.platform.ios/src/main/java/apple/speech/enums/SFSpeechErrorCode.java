package apple.speech.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * Error codes that can be thrown under the Speech framework's error domain.
 * 
 * API-Since: 17.0
 */
@Generated
public final class SFSpeechErrorCode {
    @Generated
    private SFSpeechErrorCode() {
    }

    /**
     * There was an internal error.
     * 
     * API-Since: 17.0
     */
    @Generated @NInt public static final long InternalServiceError = 0x0000000000000001L;
    /**
     * The custom language model templates were malformed.
     * 
     * API-Since: 17.0
     */
    @Generated @NInt public static final long UndefinedTemplateClassName = 0x0000000000000007L;
    /**
     * The custom language model file was malformed.
     * 
     * API-Since: 17.0
     */
    @Generated @NInt public static final long MalformedSupplementalModel = 0x0000000000000008L;
    /**
     * The audio file could not be read.
     * 
     * API-Since: 17.0
     */
    @Generated @NInt public static final long AudioReadFailed = 0x0000000000000002L;
    /**
     * The operation timed out.
     * 
     * API-Since: 17.0
     */
    @Generated @NInt public static final long Timeout = 0x000000000000000CL;
    /**
     * A required parameter is missing/nil.
     * 
     * API-Since: 17.0
     */
    @Generated @NInt public static final long MissingParameter = 0x000000000000000DL;
}
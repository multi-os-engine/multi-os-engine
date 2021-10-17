package apple.shazamkit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * Error codes returned when generating and matching signatures
 */
@Generated
public final class SHErrorCode {
    @Generated
    private SHErrorCode() {
    }

    /**
     * The @c AVAudioFormat is not supported
     * <p>
     * ShazamKit only accepts certain audio formats
     *
     * @see -[SHSignatureGenerator appendBuffer:atTime:error] for valid formats
     */
    @Generated @NInt public static final long InvalidAudioFormat = 0x0000000000000064L;
    /**
     * The audio provided was not contiguous
     * <p>
     * Shazam requires audio to be contiguous in order
     * to match.
     */
    @Generated @NInt public static final long AudioDiscontinuity = 0x0000000000000065L;
    /**
     * Failed to create a signature from the provided audio
     * <p>
     * Validate the audio you are supplying, it may be silence.
     */
    @Generated @NInt public static final long SignatureInvalid = 0x00000000000000C8L;
    /**
     * The signature duration is outside the valid range
     * <p>
     * The signature is valid but is too long/short for
     * the service attempting to match it
     */
    @Generated @NInt public static final long SignatureDurationInvalid = 0x00000000000000C9L;
    /**
     * The request to match the signature failed
     * <p>
     * The attempt failed and was not matched, trying again may result in success
     * [@note] This code does not indicate a 'No Match'
     */
    @Generated @NInt public static final long MatchAttemptFailed = 0x00000000000000CAL;
    /**
     * Failed to load the Custom Catalog
     * <p>
     * Validate the structure of the Catalog file
     */
    @Generated @NInt public static final long CustomCatalogInvalid = 0x000000000000012CL;
    /**
     * The Custom Catalog URL was invalid
     * <p>
     * The URL must be a filePath URL that contains a valid Catalog
     */
    @Generated @NInt public static final long CustomCatalogInvalidURL = 0x000000000000012DL;
    /**
     * Failed to sync some content to the user's library
     * <p>
     * Failed to add some items to the user's library, trying again may result in success
     * Underlying error may contain more details about the failure
     */
    @Generated @NInt public static final long MediaLibrarySyncFailed = 0x0000000000000190L;
}

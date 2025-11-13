package apple.shazamkit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * An error type that you create, or the system creates, to indicate problems with a catalog, match attempt, or
 * signature, or when saving to a user's Shazam library.
 */
@Generated
public final class SHErrorCode {
    @Generated
    private SHErrorCode() {
    }

    /**
     * The error code to indicate an unsupported audio format.
     * 
     * For the list of the supported audio formats, see ``SHSignatureGenerator/append(_:at:)``.
     */
    @Generated @NInt public static final long InvalidAudioFormat = 0x0000000000000064L;
    /**
     * The error code to indicate the use of noncontiguous audio to request a match.
     */
    @Generated @NInt public static final long AudioDiscontinuity = 0x0000000000000065L;
    /**
     * The error code to indicate that the system is unable to generate a signature from the audio.
     * 
     * The most common cause of this error is silent audio input.
     */
    @Generated @NInt public static final long SignatureInvalid = 0x00000000000000C8L;
    /**
     * The error code to indicate that the length of the generated signature is too long or too short to make a match in
     * the catalog.
     * 
     * This error occurs when the length of the generated signature is less than
     * ``SHCatalog/minimumQuerySignatureDuration`` or greater than ``SHCatalog/maximumQuerySignatureDuration`` for the
     * session ``SHSession/catalog``.
     */
    @Generated @NInt public static final long SignatureDurationInvalid = 0x00000000000000C9L;
    /**
     * The error code to indicate when a Shazam Music catalog server issue prevents finding a match.
     */
    @Generated @NInt public static final long MatchAttemptFailed = 0x00000000000000CAL;
    /**
     * The error code to indicate when the custom catalog fails to load due to an invalid format.
     */
    @Generated @NInt public static final long CustomCatalogInvalid = 0x000000000000012CL;
    /**
     * The error code to indicate that the format for the custom catalog URL is invalid.
     */
    @Generated @NInt public static final long CustomCatalogInvalidURL = 0x000000000000012DL;
    /**
     * The error code that indicates when the system fails to add media items to or remove items from the user's Shazam
     * library.
     */
    @Generated @NInt public static final long MediaLibrarySyncFailed = 0x0000000000000190L;
    /**
     * The error code to indicate a generic framework error.
     * 
     * API-Since: 16.0
     */
    @Generated @NInt public static final long InternalError = 0x00000000000001F4L;
    /**
     * The error code to indicate when the system fails to fetch one or more media items.
     * 
     * API-Since: 17.0
     */
    @Generated @NInt public static final long MediaItemFetchFailed = 0x0000000000000258L;
}

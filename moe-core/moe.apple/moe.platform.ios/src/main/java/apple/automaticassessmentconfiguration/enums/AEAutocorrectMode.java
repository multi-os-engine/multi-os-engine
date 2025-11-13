package apple.automaticassessmentconfiguration.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

/**
 * The set of autocorrect features that you can enable during an assessment.
 * 
 * Use one or more of the autocorrect modes to set the ``AEAssessmentConfiguration/autocorrectMode-swift.property``
 * property of an ``AEAssessmentConfiguration`` instance. For example, you can enable both spelling and punctuation
 * corrections by combining ``AEAssessmentConfiguration/AutocorrectMode-swift.struct/spelling`` and
 * ``AEAssessmentConfiguration/AutocorrectMode-swift.struct/punctuation``:
 * 
 * ```swift
 * let config = AEAssessmentConfiguration()
 * 
 * #if os(iOS) // Available only on iOS and iPadOS.
 * config.autocorrectMode = [.punctuation, .spelling]
 * #endif
 * 
 * let session = AEAssessmentSession(configuration: config)
 * ```
 * 
 * ## Topics
 * 
 * ### Creating a mode
 * 
 * - ``AEAssessmentConfiguration/AutocorrectMode-swift.struct/init(rawValue:)``
 * 
 * ### Modes
 * 
 * - ``AEAssessmentConfiguration/AutocorrectMode-swift.struct/punctuation``
 * - ``AEAssessmentConfiguration/AutocorrectMode-swift.struct/spelling``
 * - ``AEAutocorrectMode/AEAutocorrectModeNone``
 */
@Generated
public final class AEAutocorrectMode {
    @Generated
    private AEAutocorrectMode() {
    }

    @Generated @NUInt public static final long None = 0x0000000000000000L;
    /**
     * A mode in which autocorrect checks for spelling as the user types.
     */
    @Generated @NUInt public static final long Spelling = 0x0000000000000001L;
    /**
     * A mode in which autocorrect checks punctuation as the user types.
     */
    @Generated @NUInt public static final long Punctuation = 0x0000000000000002L;
}

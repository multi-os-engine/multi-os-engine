package apple.foundation.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * NSLinguisticTaggerUnit specifes the size of units in a string to which tagging applies.  The tagging unit may be word, sentence, paragraph, or document.  Methods that do not specify a unit act at the word level.  Not all combinations of scheme and unit are supported; clients can use +availableTagSchemesForUnit:language: to determine which ones are.
 */
@Generated
public final class NSLinguisticTaggerUnit {
    @Generated
    private NSLinguisticTaggerUnit() {
    }

    /**
     * Token units are at word or equivalent level
     */
    @Generated @NInt public static final long Word = 0x0000000000000000L;
    /**
     * Token units are at sentence level
     */
    @Generated @NInt public static final long Sentence = 0x0000000000000001L;
    /**
     * Token units are at paragraph level
     */
    @Generated @NInt public static final long Paragraph = 0x0000000000000002L;
    /**
     * Token unit is the entire string
     */
    @Generated @NInt public static final long Document = 0x0000000000000003L;
}
package apple.naturallanguage.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * NLTokenizer is a class used to automatically segment natural-language text. An instance of this class is created with a specific unit and assigned a string to tokenize, and clients can then obtain ranges for tokens in that string appropriate to the given unit. Units are defined by NLTokenUnit, which specifies the size of the units in a string to which tokenization or tagging applies, whether word, sentence, paragraph, or document.
 */
@Generated
public final class NLTokenUnit {
    @Generated
    private NLTokenUnit() {
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
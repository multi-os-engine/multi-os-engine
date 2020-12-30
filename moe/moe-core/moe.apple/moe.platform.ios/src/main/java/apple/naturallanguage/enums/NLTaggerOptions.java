package apple.naturallanguage.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

/**
 * NLTagger is a class used to automatically tag portions of natural language text with information such as parts of speech, named entities, lemmas, language, and script. An instance of this class is assigned a string to tag, and clients can then obtain tags and ranges for tokens in that string appropriate to a given tag scheme and unit. Predefined tag schemes and tags are defined in NLTagScheme.h.  Options arguments of type NLTaggerOptions may include the following flags, which allow clients interested only in certain general types of tokens to specify that tokens of other types should be omitted from the returned results.
 */
@Generated
public final class NLTaggerOptions {
    @Generated
    private NLTaggerOptions() {
    }

    /**
     * Omit tokens of type NLTagWord.
     */
    @Generated @NUInt public static final long OmitWords = 0x0000000000000001L;
    /**
     * Omit tokens of type NLTagPunctuation.
     */
    @Generated @NUInt public static final long OmitPunctuation = 0x0000000000000002L;
    /**
     * Omit tokens of type NLTagWhitespace.
     */
    @Generated @NUInt public static final long OmitWhitespace = 0x0000000000000004L;
    /**
     * Omit tokens of type NLTagOther.
     */
    @Generated @NUInt public static final long OmitOther = 0x0000000000000008L;
    /**
     * Join tokens of tag scheme NLTagSchemeNameType.
     */
    @Generated @NUInt public static final long JoinNames = 0x0000000000000010L;
    /**
     * Join contractions such as it's, can't, etc.
     */
    @Generated @NUInt public static final long JoinContractions = 0x0000000000000020L;
}
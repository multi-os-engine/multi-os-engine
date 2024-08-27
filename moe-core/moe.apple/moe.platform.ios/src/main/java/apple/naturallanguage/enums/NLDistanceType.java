package apple.naturallanguage.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * NLEmbedding is a class representing a map from a set of strings into a finite-dimensional real vector space.
 * Predefined word embeddings are provided for certain languages.
 */
@Generated
public final class NLDistanceType {
    @Generated
    private NLDistanceType() {
    }

    /**
     * A cosine distance in embedding space, i.e. 1 - cosine similarity, in the range [0.0, 2.0].
     */
    @Generated @NInt public static final long NLDistanceTypeCosine = 0x0000000000000000L;
}
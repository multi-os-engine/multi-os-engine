package apple.naturallanguage.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

/**
 * The tokenizer also conveys some basic information about the content of the token via NLTokenizerAttributes.
 */
@Generated
public final class NLTokenizerAttributes {
    @Generated
    private NLTokenizerAttributes() {
    }

    @Generated @NUInt public static final long Numeric = 0x0000000000000001L;
    @Generated @NUInt public static final long Symbolic = 0x0000000000000002L;
    @Generated @NUInt public static final long Emoji = 0x0000000000000004L;
}
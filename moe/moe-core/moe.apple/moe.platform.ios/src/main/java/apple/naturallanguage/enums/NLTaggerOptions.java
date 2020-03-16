package apple.naturallanguage.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

@Generated
public final class NLTaggerOptions {
    @Generated
    private NLTaggerOptions() {
    }

    @Generated @NUInt public static final long OmitWords = 0x0000000000000001L;
    @Generated @NUInt public static final long OmitPunctuation = 0x0000000000000002L;
    @Generated @NUInt public static final long OmitWhitespace = 0x0000000000000004L;
    @Generated @NUInt public static final long OmitOther = 0x0000000000000008L;
    @Generated @NUInt public static final long JoinNames = 0x0000000000000010L;
    @Generated @NUInt public static final long JoinContractions = 0x0000000000000020L;
}
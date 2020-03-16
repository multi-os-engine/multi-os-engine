package apple.quicklookthumbnailing.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

@Generated
public final class QLThumbnailGenerationRequestRepresentationTypes {
    @Generated
    private QLThumbnailGenerationRequestRepresentationTypes() {
    }

    @Generated @NUInt public static final long Icon = 0x0000000000000001L;
    @Generated @NUInt public static final long LowQualityThumbnail = 0x0000000000000002L;
    @Generated @NUInt public static final long Thumbnail = 0x0000000000000004L;
    @Generated @NUInt public static final long All = org.moe.natj.general.NatJ.is64Bit() ?
            0xFFFFFFFFFFFFFFFFL :
            0x00000000FFFFFFFFL;
}
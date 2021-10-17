package apple.quicklookthumbnailing.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

@Generated
public final class QLThumbnailGenerationRequestRepresentationTypes {
    @Generated
    private QLThumbnailGenerationRequestRepresentationTypes() {
    }

    /**
     * Request an icon, that is an image that represents the file type of the request. The size of an icon may not satisfy the parameters of the request (can be larger or smaller).
     */
    @Generated @NUInt public static final long Icon = 0x0000000000000001L;
    /**
     * Request a thumbnail representing the file that may come from a previously generated and cached copy or faster lower quality generation, not satisfying the parameters of the request (can be larger or smaller).
     */
    @Generated @NUInt public static final long LowQualityThumbnail = 0x0000000000000002L;
    /**
     * Request a thumbnail representing the file, satisfying the parameters of the request (either retrieved from the cache, or generated).
     */
    @Generated @NUInt public static final long Thumbnail = 0x0000000000000004L;
    /**
     * Request all thumbnail representation types.
     */
    @Generated @NUInt public static final long All = org.moe.natj.general.NatJ.is64Bit() ?
            0xFFFFFFFFFFFFFFFFL :
            0x00000000FFFFFFFFL;
}

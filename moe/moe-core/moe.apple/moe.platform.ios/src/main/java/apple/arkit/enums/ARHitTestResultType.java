package apple.arkit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

@Generated
public final class ARHitTestResultType {
    @Generated
    private ARHitTestResultType() {
    }

    @Generated @NUInt public static final long FeaturePoint = 0x0000000000000001L;
    @Generated @NUInt public static final long EstimatedHorizontalPlane = 0x0000000000000002L;
    @Generated @NUInt public static final long ExistingPlane = 0x0000000000000008L;
    @Generated @NUInt public static final long ExistingPlaneUsingExtent = 0x0000000000000010L;
}
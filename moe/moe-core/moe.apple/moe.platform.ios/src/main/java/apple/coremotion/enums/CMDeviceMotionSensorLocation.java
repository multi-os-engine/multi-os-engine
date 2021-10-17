package apple.coremotion.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * CMDeviceMotionSensorLocation
 * <p>
 * Discussion:
 * CMDeviceMotionSensorLocation indicates the location of
 * the sensors used to compute the device motion data.
 */
@Generated
public final class CMDeviceMotionSensorLocation {
    @Generated
    private CMDeviceMotionSensorLocation() {
    }

    @Generated @NInt public static final long Default = 0x0000000000000000L;
    @Generated @NInt public static final long HeadphoneLeft = 0x0000000000000001L;
    @Generated @NInt public static final long HeadphoneRight = 0x0000000000000002L;
}

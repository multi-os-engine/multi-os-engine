package apple.phase.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * [@enum] PHASECalibrationMode
 * <p>
 * Calibration mode.
 * [@note] In general, clients are advised use a calibrated input mode. Setting the value to PHASECalibrationModeNone is not advised.
 * [@constant] PHASECalibrationModeNone
 * Linear gain with no reference (uncailbrated).
 * [@constant] PHASECalibrationModeRelativeSpl
 * SPL relative to a device-tuned SPL (when available).
 * [@constant] PHASECalibrationModeAbsoluteSpl
 * Absolute SPL. The system will hit the value 'if it can' (depending on the capabilities of the current output device).
 */
@Generated
public final class PHASECalibrationMode {
    @Generated
    private PHASECalibrationMode() {
    }

    @Generated @NInt public static final long None = 0x0000000000000000L;
    @Generated @NInt public static final long RelativeSpl = 0x0000000000000001L;
    @Generated @NInt public static final long AbsoluteSpl = 0x0000000000000002L;
}

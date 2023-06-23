package apple.avfoundation.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

/**
 * [@enum] AVCaptureSystemPressureFactors
 * 
 * Constants indicating factors contributing to the current system pressured state.
 * 
 * [@constant] AVCaptureSystemPressureFactorNone
 * Indicates that the system is not currently pressured.
 * [@constant] AVCaptureSystemPressureFactorSystemTemperature
 * Indicates that the entire system is currently experiencing an elevated thermal level.
 * [@constant] AVCaptureSystemPressureFactorPeakPower
 * Indicates that the system's peak power requirements exceed the battery's current capacity and may result in a system
 * power off.
 * [@constant] AVCaptureSystemPressureFactorDepthModuleTemperature
 * Indicates that the module capturing depth information is operating at an elevated temperature. As system pressure
 * increases, depth quality may become degraded.
 * 
 * API-Since: 11.1
 */
@Generated
public final class AVCaptureSystemPressureFactors {
    @Generated
    private AVCaptureSystemPressureFactors() {
    }

    /**
     * API-Since: 11.1
     */
    @Generated @NUInt public static final long None = 0x0000000000000000L;
    /**
     * API-Since: 11.1
     */
    @Generated @NUInt public static final long SystemTemperature = 0x0000000000000001L;
    /**
     * API-Since: 11.1
     */
    @Generated @NUInt public static final long PeakPower = 0x0000000000000002L;
    /**
     * API-Since: 11.1
     */
    @Generated @NUInt public static final long DepthModuleTemperature = 0x0000000000000004L;
}

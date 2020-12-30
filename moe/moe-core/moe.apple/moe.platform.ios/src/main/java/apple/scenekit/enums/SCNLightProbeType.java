package apple.scenekit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

@Generated
public final class SCNLightProbeType {
    @Generated
    private SCNLightProbeType() {
    }

    /**
     * Probe type that was existing before macOS 10.15. Bakes and stores spherical harmonics.
     */
    @Generated @NInt public static final long Irradiance = 0x0000000000000000L;
    /**
     * Probe that captures radiance (reflections) in its `probeExtents`. Either captured or provided as a cube texture using the `probeEnvironment` property.
     */
    @Generated @NInt public static final long Radiance = 0x0000000000000001L;
}
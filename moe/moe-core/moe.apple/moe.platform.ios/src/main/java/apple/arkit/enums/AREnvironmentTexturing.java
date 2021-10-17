package apple.arkit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * Enum constants for indicating the mode of environment texturing to run.
 */
@Generated
public final class AREnvironmentTexturing {
    @Generated
    private AREnvironmentTexturing() {
    }

    /**
     * No texture information is gathered.
     */
    @Generated @NInt public static final long None = 0x0000000000000000L;
    /**
     * Texture information is gathered for the environment.
     * Environment textures will be generated for AREnvironmentProbes added to the session.
     */
    @Generated @NInt public static final long Manual = 0x0000000000000001L;
    /**
     * Texture information is gathered for the environment and probes automatically placed in the scene.
     */
    @Generated @NInt public static final long Automatic = 0x0000000000000002L;
}

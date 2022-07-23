package apple.scenekit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

@Generated
public final class SCNLightProbeUpdateType {
    @Generated
    private SCNLightProbeUpdateType() {
    }

    /**
     * Probe that isn't automatically updated (for instance when baked using the Xcode's SceneKit scene editor or when
     * `probeEnvironment` is specified)
     */
    @Generated @NInt public static final long Never = 0x0000000000000000L;
    /**
     * Probe that is automatically updated by SceneKit at every frame
     */
    @Generated @NInt public static final long Realtime = 0x0000000000000001L;
}
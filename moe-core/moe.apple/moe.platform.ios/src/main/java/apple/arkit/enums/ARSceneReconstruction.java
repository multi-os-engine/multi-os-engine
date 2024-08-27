package apple.arkit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

/**
 * Types of scene reconstruction.
 */
@Generated
public final class ARSceneReconstruction {
    @Generated
    private ARSceneReconstruction() {
    }

    /**
     * No scene reconstruction is run.
     */
    @Generated @NUInt public static final long None = 0x0000000000000000L;
    /**
     * Scene reconstruction generates a mesh of the world
     */
    @Generated @NUInt public static final long Mesh = 0x0000000000000001L;
    /**
     * Scene reconstruction generates a mesh of the world with classification for each face.
     */
    @Generated @NUInt public static final long MeshWithClassification = 0x0000000000000003L;
}
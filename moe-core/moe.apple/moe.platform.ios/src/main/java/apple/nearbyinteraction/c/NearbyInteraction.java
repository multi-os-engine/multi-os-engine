package apple.nearbyinteraction.c;

import org.moe.natj.c.CRuntime;
import org.moe.natj.c.ann.CVariable;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.map.ObjCStringMapper;
import org.moe.natj.c.ann.CFunction;
import org.moe.natj.general.ann.Mapped;
import org.jetbrains.annotations.NotNull;

@Generated
@Library("NearbyInteraction")
@Runtime(CRuntime.class)
public final class NearbyInteraction {
    static {
        NatJ.register();
    }

    @Generated
    private NearbyInteraction() {
    }

    /**
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NIErrorDomain();

    /**
     * A sentinel value indicating that a distance measurement could not be produced
     * 
     * API-Since: 14.0
     */
    @Generated
    @CVariable()
    public static native float NINearbyObjectDistanceNotAvailable();

    /**
     * Helper methods for getting the localized description of the convergence reason
     * 
     * API-Since: 16.0
     */
    @NotNull
    @Generated
    @CFunction
    @MappedReturn(ObjCStringMapper.class)
    public static native String NIAlgorithmConvergenceStatusReasonDescription(
            @NotNull @Mapped(ObjCStringMapper.class) String reason);

    /**
     * Tell user to sweep device horizontally from side to side.
     * 
     * API-Since: 16.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NIAlgorithmConvergenceStatusReasonInsufficientHorizontalSweep();

    /**
     * Tell user to sweep device verically up and down.
     * 
     * API-Since: 16.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NIAlgorithmConvergenceStatusReasonInsufficientVerticalSweep();

    /**
     * Tell user to move around.
     * 
     * API-Since: 16.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NIAlgorithmConvergenceStatusReasonInsufficientMovement();

    /**
     * Tell user to turn on the light.
     * 
     * API-Since: 16.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NIAlgorithmConvergenceStatusReasonInsufficientLighting();

    /**
     * A sentinel value indicating that an angle could not be produced
     * 
     * API-Since: 16.0
     */
    @Generated
    @CVariable()
    public static native float NINearbyObjectAngleNotAvailable();
}

package apple.phase.c;

import org.moe.natj.c.CRuntime;
import org.moe.natj.c.ann.CVariable;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.map.ObjCStringMapper;

@Generated
@Library("PHASE")
@Runtime(CRuntime.class)
public final class PHASE {
    static {
        NatJ.register();
    }

    @Generated
    private PHASE() {
    }

    /**
     * [@const] PHASEErrorDomain
     * <p>
     * The NSErrorDomain for general PHASE errors
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PHASEErrorDomain();

    /**
     * [@const] PHASESoundEventErrorDomain
     * <p>
     * The NSErrorDomain for PHASE sound event errors.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PHASESoundEventErrorDomain();

    /**
     * [@const] PHASEAssetErrorDomain
     * <p>
     * The NSErrorDomain for PHASE Asset errors
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PHASEAssetErrorDomain();

    /**
     * [@constant] PHASESpatialCategoryDirectPathTransmission
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PHASESpatialCategoryDirectPathTransmission();

    /**
     * [@constant] PHASEEarlyReflections
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PHASESpatialCategoryEarlyReflections();

    /**
     * [@constant] PHASELateReverb
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PHASESpatialCategoryLateReverb();
}

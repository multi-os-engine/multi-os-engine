package apple.nearbyinteraction.c;

import org.moe.natj.c.CRuntime;
import org.moe.natj.c.ann.CVariable;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.map.ObjCStringMapper;

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

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NIErrorDomain();

    /**
     * A sentinel value indicating that a distance measurement could not be produced
     */
    @Generated
    @CVariable()
    public static native float NINearbyObjectDistanceNotAvailable();
}

package apple.avrouting.c;

import org.moe.natj.c.CRuntime;
import org.moe.natj.c.ann.CVariable;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.map.ObjCStringMapper;

@Generated
@Library("AVRouting")
@Runtime(CRuntime.class)
public final class AVRouting {
    static {
        NatJ.register();
    }

    @Generated
    private AVRouting() {
    }

    /**
     * [@constant] AVCustomRoutingControllerAuthorizedRoutesDidChangeNotification
     * 
     * Posted when the value of authorizedRoutes changes.
     * 
     * API-Since: 16.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVCustomRoutingControllerAuthorizedRoutesDidChangeNotification();
}
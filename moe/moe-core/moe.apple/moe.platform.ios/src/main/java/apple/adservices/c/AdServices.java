package apple.adservices.c;

import org.moe.natj.c.CRuntime;
import org.moe.natj.c.ann.CVariable;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.map.ObjCStringMapper;

@Generated
@Library("AdServices")
@Runtime(CRuntime.class)
public final class AdServices {
    static {
        NatJ.register();
    }

    @Generated
    private AdServices() {
    }

    /**
     * [@enum] AAAttributionErrorCode
     * 
     * [@const] AAAttributionErrorCodeNetworkNotAvailable
     * A token could not be provided because a network error occured.
     * 
     * [@const] AAAttributionErrorCodeInternalError
     * A token could not be provided because an internal error occurred.
     * 
     * Error codes for NSErrors returned from the attributionTokenWithError: method.
     * 
     * API-Since: 14.3
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AAAttributionErrorDomain();
}

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
     * <p>
     * [@const] AAAttributionErrorCodeNetworkNotAvailable
     * A token could not be provided because a network error occured.
     * <p>
     * [@const] AAAttributionErrorCodeInternalError
     * A token could not be provided because an internal error occurred.
     * <p>
     * Error codes for NSErrors returned from the attributionTokenWithError: method.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AAAttributionErrorDomain();
}

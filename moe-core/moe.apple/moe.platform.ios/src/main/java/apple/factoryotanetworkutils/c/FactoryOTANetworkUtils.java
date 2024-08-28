package apple.factoryotanetworkutils.c;

import apple.foundation.NSError;
import apple.foundation.NSURL;
import org.moe.natj.c.CRuntime;
import org.moe.natj.c.ann.CFunction;
import org.moe.natj.c.ann.CVariable;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.ConstBytePtr;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.objc.map.ObjCStringMapper;

@Generated
@Library("FactoryOTANetworkUtils")
@Runtime(CRuntime.class)
public final class FactoryOTANetworkUtils {
    static {
        NatJ.register();
    }

    @Generated
    private FactoryOTANetworkUtils() {
    }

    @Generated
    @CFunction
    public static native boolean validate_listening_url(NSURL url, Ptr<NSError> error);

    @Generated
    @CFunction
    public static native boolean validate_connection_url(NSURL url, Ptr<NSError> error);

    /**
     * ! Project version number for FactoryOTANetworkUtils.
     */
    @Generated
    @CVariable()
    public static native double FactoryOTANetworkUtilsVersionNumber();

    /**
     * ! Project version string for FactoryOTANetworkUtils.
     */
    @Generated
    @CVariable()
    public static native ConstBytePtr FactoryOTANetworkUtilsVersionString();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kErrorDomain_EZSockets();
}
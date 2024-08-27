package apple.factoryotawifiutils.c;

import org.moe.natj.c.CRuntime;
import org.moe.natj.c.ann.CVariable;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.ConstBytePtr;

@Generated
@Library("FactoryOTAWifiUtils")
@Runtime(CRuntime.class)
public final class FactoryOTAWifiUtils {
    static {
        NatJ.register();
    }

    @Generated
    private FactoryOTAWifiUtils() {
    }

    /**
     * ! Project version number for FactoryOTAWifiUtils.
     */
    @Generated
    @CVariable()
    public static native double FactoryOTAWifiUtilsVersionNumber();

    /**
     * ! Project version string for FactoryOTAWifiUtils.
     */
    @Generated
    @CVariable()
    public static native ConstBytePtr FactoryOTAWifiUtilsVersionString();
}
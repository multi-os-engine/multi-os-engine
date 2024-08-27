package apple.factoryotalogger.c;

import org.moe.natj.c.CRuntime;
import org.moe.natj.c.ann.CVariable;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.ConstBytePtr;

@Generated
@Library("FactoryOTALogger")
@Runtime(CRuntime.class)
public final class FactoryOTALogger {
    static {
        NatJ.register();
    }

    @Generated
    private FactoryOTALogger() {
    }

    /**
     * ! Project version number for FactoryOTALogger.
     */
    @Generated
    @CVariable()
    public static native double FactoryOTALoggerVersionNumber();

    /**
     * ! Project version string for FactoryOTALogger.
     */
    @Generated
    @CVariable()
    public static native ConstBytePtr FactoryOTALoggerVersionString();
}
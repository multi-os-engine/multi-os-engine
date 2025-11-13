package apple.assignables.c;

import org.moe.natj.c.CRuntime;
import org.moe.natj.c.ann.CVariable;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.ConstBytePtr;

@Generated
@Library("Assignables")
@Runtime(CRuntime.class)
public final class Assignables {
    static {
        NatJ.register();
    }

    @Generated
    private Assignables() {
    }

    /**
     * ! Project version number for Assignables.
     */
    @Generated
    @CVariable()
    public static native double AssignablesVersionNumber();

    /**
     * ! Project version string for Assignables.
     */
    @Generated
    @CVariable()
    public static native ConstBytePtr AssignablesVersionString();
}
package apple.alarmkit.c;

import org.moe.natj.c.CRuntime;
import org.moe.natj.c.ann.CVariable;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.ConstBytePtr;

@Generated
@Library("AlarmKit")
@Runtime(CRuntime.class)
public final class AlarmKit {
    static {
        NatJ.register();
    }

    @Generated
    private AlarmKit() {
    }

    /**
     * ! Project version number for AlarmKit.
     */
    @Generated
    @CVariable()
    public static native double AlarmKitVersionNumber();

    /**
     * ! Project version string for AlarmKit.
     */
    @Generated
    @CVariable()
    public static native ConstBytePtr AlarmKitVersionString();
}
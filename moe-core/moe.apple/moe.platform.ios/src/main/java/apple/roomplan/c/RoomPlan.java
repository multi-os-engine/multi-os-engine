package apple.roomplan.c;

import org.moe.natj.c.CRuntime;
import org.moe.natj.c.ann.CVariable;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.ConstBytePtr;

@Generated
@Library("RoomPlan")
@Runtime(CRuntime.class)
public final class RoomPlan {
    static {
        NatJ.register();
    }

    @Generated
    private RoomPlan() {
    }

    /**
     * ! Project version number for RoomPlan.
     */
    @Generated
    @CVariable()
    public static native double RoomPlanVersionNumber();

    /**
     * ! Project version string for RoomPlan.
     */
    @Generated
    @CVariable()
    public static native ConstBytePtr RoomPlanVersionString();
}
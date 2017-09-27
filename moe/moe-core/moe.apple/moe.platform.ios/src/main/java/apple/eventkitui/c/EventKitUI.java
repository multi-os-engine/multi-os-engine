package apple.eventkitui.c;

import apple.foundation.NSBundle;
import org.moe.natj.c.CRuntime;
import org.moe.natj.c.ann.CFunction;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;

@Generated
@Library("EventKitUI")
@Runtime(CRuntime.class)
public final class EventKitUI {
    static {
        NatJ.register();
    }

    @Generated
    private EventKitUI() {
    }

    @Generated
    @CFunction
    public static native NSBundle EventKitUIBundle();
}
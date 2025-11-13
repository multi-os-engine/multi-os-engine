package apple.touchcontroller.c;

import org.jetbrains.annotations.NotNull;
import org.moe.natj.c.CRuntime;
import org.moe.natj.c.ann.CVariable;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.map.ObjCStringMapper;

@Generated
@Library("TouchController")
@Runtime(CRuntime.class)
public final class TouchController {
    static {
        NatJ.register();
    }

    @Generated
    private TouchController() {
    }

    /**
     * API-Since: 26.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    @NotNull
    public static native String TCGameControllerProductCategoryTouchController();
}
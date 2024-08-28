package apple.safetykit.c;

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
@Library("SafetyKit")
@Runtime(CRuntime.class)
public final class SafetyKit {
    static {
        NatJ.register();
    }

    @Generated
    private SafetyKit() {
    }

    /**
     * API-Since: 16.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    @NotNull
    public static native String SAErrorDomain();
}
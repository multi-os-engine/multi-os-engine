package apple.adservices.c;

import org.moe.natj.c.CRuntime;
import org.moe.natj.c.ann.CVariable;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.map.ObjCStringMapper;
import org.jetbrains.annotations.NotNull;

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
     * The framework attribution error domain.
     * 
     * API-Since: 14.3
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AAAttributionErrorDomain();
}

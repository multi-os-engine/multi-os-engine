package apple.accessorysetupkit.c;

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
@Library("AccessorySetupKit")
@Runtime(CRuntime.class)
public final class AccessorySetupKit {
    static {
        NatJ.register();
    }

    @Generated
    private AccessorySetupKit() {
    }

    /**
     * NSError domain for AccessorySetupKit errors.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    @NotNull
    public static native String ASErrorDomain();
}
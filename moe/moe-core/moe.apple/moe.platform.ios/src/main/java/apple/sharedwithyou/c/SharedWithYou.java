package apple.sharedwithyou.c;

import org.moe.natj.c.CRuntime;
import org.moe.natj.c.ann.CVariable;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.map.ObjCStringMapper;

@Generated
@Library("SharedWithYou")
@Runtime(CRuntime.class)
public final class SharedWithYou {
    static {
        NatJ.register();
    }

    @Generated
    private SharedWithYou() {
    }

    /**
     * API-Since: 16.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SWCollaborationMetadataTypeIdentifier();
}
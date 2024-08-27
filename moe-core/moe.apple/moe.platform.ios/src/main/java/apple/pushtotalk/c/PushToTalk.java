package apple.pushtotalk.c;

import org.moe.natj.c.CRuntime;
import org.moe.natj.c.ann.CVariable;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.map.ObjCStringMapper;

@Generated
@Library("PushToTalk")
@Runtime(CRuntime.class)
public final class PushToTalk {
    static {
        NatJ.register();
    }

    @Generated
    private PushToTalk() {
    }

    /**
     * API-Since: 16.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PTInstantiationErrorDomain();

    /**
     * API-Since: 16.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PTChannelErrorDomain();
}
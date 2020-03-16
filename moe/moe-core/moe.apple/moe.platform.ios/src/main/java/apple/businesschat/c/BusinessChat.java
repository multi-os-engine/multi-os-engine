package apple.businesschat.c;

import org.moe.natj.c.CRuntime;
import org.moe.natj.c.ann.CVariable;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.map.ObjCStringMapper;

@Generated
@Library("BusinessChat")
@Runtime(CRuntime.class)
public final class BusinessChat {
    static {
        NatJ.register();
    }

    @Generated
    private BusinessChat() {
    }

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String BCParameterNameIntent();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String BCParameterNameGroup();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String BCParameterNameBody();
}
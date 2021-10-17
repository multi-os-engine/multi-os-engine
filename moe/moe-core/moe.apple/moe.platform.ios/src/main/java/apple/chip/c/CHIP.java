package apple.chip.c;

import org.moe.natj.c.CRuntime;
import org.moe.natj.c.ann.CVariable;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.ConstBytePtr;
import org.moe.natj.objc.map.ObjCStringMapper;

@Generated
@Library("CHIP")
@Runtime(CRuntime.class)
public final class CHIP {
    static {
        NatJ.register();
    }

    @Generated
    private CHIP() {
    }

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CHIPErrorDomain();

    /**
     * ! Project version number for CHIP.
     */
    @Generated
    @CVariable()
    public static native double CHIPVersionNumber();

    /**
     * ! Project version string for CHIP.
     */
    @Generated
    @CVariable()
    public static native ConstBytePtr CHIPVersionString();
}

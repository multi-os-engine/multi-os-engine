package apple.pencilkit.c;

import apple.corefoundation.opaque.CFStringRef;
import org.moe.natj.c.CRuntime;
import org.moe.natj.c.ann.CVariable;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.map.ObjCStringMapper;

@Generated
@Library("PencilKit")
@Runtime(CRuntime.class)
public final class PencilKit {
    static {
        NatJ.register();
    }

    @Generated
    private PencilKit() {
    }

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PKInkTypePen();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PKInkTypePencil();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PKInkTypeMarker();

    @Generated
    @CVariable()
    public static native CFStringRef PKAppleDrawingTypeIdentifier();
}
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
import org.jetbrains.annotations.NotNull;

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

    /**
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PKInkTypePen();

    /**
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PKInkTypePencil();

    /**
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PKInkTypeMarker();

    /**
     * The UTType for storing drawing data.
     * 
     * API-Since: 13.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef PKAppleDrawingTypeIdentifier();

    /**
     * API-Since: 17.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PKInkTypeMonoline();

    /**
     * API-Since: 17.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PKInkTypeFountainPen();

    /**
     * API-Since: 17.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PKInkTypeWatercolor();

    /**
     * API-Since: 17.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PKInkTypeCrayon();
}
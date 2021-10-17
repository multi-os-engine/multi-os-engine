package apple.avfoundation.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class AVSampleCursorDependencyInfo extends StructObject {
    static {
        NatJ.register();
    }

    private static long __natjCache;

    @Generated
    public AVSampleCursorDependencyInfo() {
        super(AVSampleCursorDependencyInfo.class);
    }

    @Generated
    protected AVSampleCursorDependencyInfo(Pointer peer) {
        super(peer);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    public native boolean sampleIndicatesWhetherItHasDependentSamples();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setSampleIndicatesWhetherItHasDependentSamples(boolean value);

    @Generated
    @StructureField(order = 1, isGetter = true)
    public native boolean sampleHasDependentSamples();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setSampleHasDependentSamples(boolean value);

    @Generated
    @StructureField(order = 2, isGetter = true)
    public native boolean sampleIndicatesWhetherItDependsOnOthers();

    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setSampleIndicatesWhetherItDependsOnOthers(boolean value);

    @Generated
    @StructureField(order = 3, isGetter = true)
    public native boolean sampleDependsOnOthers();

    @Generated
    @StructureField(order = 3, isGetter = false)
    public native void setSampleDependsOnOthers(boolean value);

    @Generated
    @StructureField(order = 4, isGetter = true)
    public native boolean sampleIndicatesWhetherItHasRedundantCoding();

    @Generated
    @StructureField(order = 4, isGetter = false)
    public native void setSampleIndicatesWhetherItHasRedundantCoding(boolean value);

    @Generated
    @StructureField(order = 5, isGetter = true)
    public native boolean sampleHasRedundantCoding();

    @Generated
    @StructureField(order = 5, isGetter = false)
    public native void setSampleHasRedundantCoding(boolean value);
}

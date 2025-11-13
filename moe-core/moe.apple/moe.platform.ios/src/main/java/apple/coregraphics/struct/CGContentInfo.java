package apple.coregraphics.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class CGContentInfo extends StructObject {
    static {
        NatJ.register();
    }
    private static long __natjCache;

    @Generated
    public CGContentInfo() {
        super(CGContentInfo.class);
    }

    @Generated
    protected CGContentInfo(Pointer peer) {
        super(peer);
    }

    /**
     * deepest image component
     */
    @Generated
    @StructureField(order = 0, isGetter = true)
    public native int deepestImageComponent();

    /**
     * deepest image component
     */
    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setDeepestImageComponent(int value);

    /**
     * sum of all color models drawn
     */
    @Generated
    @StructureField(order = 1, isGetter = true)
    public native int contentColorModels();

    /**
     * sum of all color models drawn
     */
    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setContentColorModels(int value);

    /**
     * there is content in wide gamut color space
     */
    @Generated
    @StructureField(order = 2, isGetter = true)
    public native boolean hasWideGamut();

    /**
     * there is content in wide gamut color space
     */
    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setHasWideGamut(boolean value);

    /**
     * there is transparent content
     */
    @Generated
    @StructureField(order = 3, isGetter = true)
    public native boolean hasTransparency();

    /**
     * there is transparent content
     */
    @Generated
    @StructureField(order = 3, isGetter = false)
    public native void setHasTransparency(boolean value);

    @Generated
    @StructureField(order = 4, isGetter = true)
    public native float largestContentHeadroom();

    @Generated
    @StructureField(order = 4, isGetter = false)
    public native void setLargestContentHeadroom(float value);
}
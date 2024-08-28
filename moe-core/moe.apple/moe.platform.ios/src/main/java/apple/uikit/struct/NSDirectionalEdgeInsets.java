package apple.uikit.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NFloat;

@Generated
@Structure()
public final class NSDirectionalEdgeInsets extends StructObject {
    static {
        NatJ.register();
    }

    private static long __natjCache;

    @Generated
    public NSDirectionalEdgeInsets() {
        super(NSDirectionalEdgeInsets.class);
    }

    @Generated
    protected NSDirectionalEdgeInsets(Pointer peer) {
        super(peer);
    }

    @Generated
    public NSDirectionalEdgeInsets(@NFloat double top, @NFloat double leading, @NFloat double bottom,
            @NFloat double trailing) {
        super(NSDirectionalEdgeInsets.class);
        setTop(top);
        setLeading(leading);
        setBottom(bottom);
        setTrailing(trailing);
    }

    /**
     * specify amount to inset (positive) for each of the edges. values can be negative to 'outset'
     */
    @Generated
    @StructureField(order = 0, isGetter = true)
    @NFloat
    public native double top();

    /**
     * specify amount to inset (positive) for each of the edges. values can be negative to 'outset'
     */
    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setTop(@NFloat double value);

    /**
     * specify amount to inset (positive) for each of the edges. values can be negative to 'outset'
     */
    @Generated
    @StructureField(order = 1, isGetter = true)
    @NFloat
    public native double leading();

    /**
     * specify amount to inset (positive) for each of the edges. values can be negative to 'outset'
     */
    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setLeading(@NFloat double value);

    /**
     * specify amount to inset (positive) for each of the edges. values can be negative to 'outset'
     */
    @Generated
    @StructureField(order = 2, isGetter = true)
    @NFloat
    public native double bottom();

    /**
     * specify amount to inset (positive) for each of the edges. values can be negative to 'outset'
     */
    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setBottom(@NFloat double value);

    /**
     * specify amount to inset (positive) for each of the edges. values can be negative to 'outset'
     */
    @Generated
    @StructureField(order = 3, isGetter = true)
    @NFloat
    public native double trailing();

    /**
     * specify amount to inset (positive) for each of the edges. values can be negative to 'outset'
     */
    @Generated
    @StructureField(order = 3, isGetter = false)
    public native void setTrailing(@NFloat double value);
}
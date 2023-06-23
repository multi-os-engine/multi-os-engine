package apple.corefoundation.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NFloat;

@Generated
@Structure()
public final class CGAffineTransformComponents extends StructObject {
    static {
        NatJ.register();
    }
    private static long __natjCache;

    @Generated
    public CGAffineTransformComponents() {
        super(CGAffineTransformComponents.class);
    }

    @Generated
    protected CGAffineTransformComponents(Pointer peer) {
        super(peer);
    }

    @Generated
    public CGAffineTransformComponents(@ByValue CGSize scale, @NFloat double horizontalShear, @NFloat double rotation,
            @ByValue CGVector translation) {
        super(CGAffineTransformComponents.class);
        setScale(scale);
        setHorizontalShear(horizontalShear);
        setRotation(rotation);
        setTranslation(translation);
    }

    /**
     * initial scaling in X and Y dimensions. {sx,sy}
     * Negative values indicate the image has been flipped in this dimension.
     */
    @Generated
    @StructureField(order = 0, isGetter = true)
    @ByValue
    public native CGSize scale();

    /**
     * initial scaling in X and Y dimensions. {sx,sy}
     * Negative values indicate the image has been flipped in this dimension.
     */
    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setScale(@ByValue CGSize value);

    /**
     * shear distortion (sh). Turns rectangles to parallelograms. 0 for no shear. Typically 0.
     */
    @Generated
    @StructureField(order = 1, isGetter = true)
    @NFloat
    public native double horizontalShear();

    /**
     * shear distortion (sh). Turns rectangles to parallelograms. 0 for no shear. Typically 0.
     */
    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setHorizontalShear(@NFloat double value);

    /**
     * Rotation angle in radians about the origin. (t) Sign convention for clockwise rotation
     * may differ between various Apple frameworks based on origin placement. Please see discussion.
     */
    @Generated
    @StructureField(order = 2, isGetter = true)
    @NFloat
    public native double rotation();

    /**
     * Rotation angle in radians about the origin. (t) Sign convention for clockwise rotation
     * may differ between various Apple frameworks based on origin placement. Please see discussion.
     */
    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setRotation(@NFloat double value);

    /**
     * Displacement from the origin (ty, ty)
     */
    @Generated
    @StructureField(order = 3, isGetter = true)
    @ByValue
    public native CGVector translation();

    /**
     * Displacement from the origin (ty, ty)
     */
    @Generated
    @StructureField(order = 3, isGetter = false)
    public native void setTranslation(@ByValue CGVector value);
}
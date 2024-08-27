package apple.gamecontroller.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure(alignment = 1)
public final class GCMicroGamepadSnapshotData extends StructObject {
    static {
        NatJ.register();
    }

    private static long __natjCache;

    @Generated
    public GCMicroGamepadSnapshotData() {
        super(GCMicroGamepadSnapshotData.class);
    }

    @Generated
    protected GCMicroGamepadSnapshotData(Pointer peer) {
        super(peer);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    public native char version();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setVersion(char value);

    @Generated
    @StructureField(order = 1, isGetter = true)
    public native char size();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setSize(char value);

    /**
     * Standard gamepad data
     * Axes in the range [-1.0, 1.0]
     */
    @Generated
    @StructureField(order = 2, isGetter = true)
    public native float dpadX();

    /**
     * Standard gamepad data
     * Axes in the range [-1.0, 1.0]
     */
    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setDpadX(float value);

    @Generated
    @StructureField(order = 3, isGetter = true)
    public native float dpadY();

    @Generated
    @StructureField(order = 3, isGetter = false)
    public native void setDpadY(float value);

    /**
     * Buttons in the range [0.0, 1.0]
     */
    @Generated
    @StructureField(order = 4, isGetter = true)
    public native float buttonA();

    /**
     * Buttons in the range [0.0, 1.0]
     */
    @Generated
    @StructureField(order = 4, isGetter = false)
    public native void setButtonA(float value);

    @Generated
    @StructureField(order = 5, isGetter = true)
    public native float buttonX();

    @Generated
    @StructureField(order = 5, isGetter = false)
    public native void setButtonX(float value);
}
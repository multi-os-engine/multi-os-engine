package apple.gamecontroller.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure(alignment = 1)
public final class GCExtendedGamepadSnapshotData extends StructObject {
    static {
        NatJ.register();
    }

    private static long __natjCache;

    @Generated
    public GCExtendedGamepadSnapshotData() {
        super(GCExtendedGamepadSnapshotData.class);
    }

    @Generated
    protected GCExtendedGamepadSnapshotData(Pointer peer) {
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
     * Extended gamepad data
     * Axes in the range [-1.0, 1.0]
     */
    @Generated
    @StructureField(order = 2, isGetter = true)
    public native float dpadX();

    /**
     * Extended gamepad data
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
    public native float buttonB();

    @Generated
    @StructureField(order = 5, isGetter = false)
    public native void setButtonB(float value);

    @Generated
    @StructureField(order = 6, isGetter = true)
    public native float buttonX();

    @Generated
    @StructureField(order = 6, isGetter = false)
    public native void setButtonX(float value);

    @Generated
    @StructureField(order = 7, isGetter = true)
    public native float buttonY();

    @Generated
    @StructureField(order = 7, isGetter = false)
    public native void setButtonY(float value);

    @Generated
    @StructureField(order = 8, isGetter = true)
    public native float leftShoulder();

    @Generated
    @StructureField(order = 8, isGetter = false)
    public native void setLeftShoulder(float value);

    @Generated
    @StructureField(order = 9, isGetter = true)
    public native float rightShoulder();

    @Generated
    @StructureField(order = 9, isGetter = false)
    public native void setRightShoulder(float value);

    /**
     * Axes in the range [-1.0, 1.0]
     */
    @Generated
    @StructureField(order = 10, isGetter = true)
    public native float leftThumbstickX();

    /**
     * Axes in the range [-1.0, 1.0]
     */
    @Generated
    @StructureField(order = 10, isGetter = false)
    public native void setLeftThumbstickX(float value);

    @Generated
    @StructureField(order = 11, isGetter = true)
    public native float leftThumbstickY();

    @Generated
    @StructureField(order = 11, isGetter = false)
    public native void setLeftThumbstickY(float value);

    @Generated
    @StructureField(order = 12, isGetter = true)
    public native float rightThumbstickX();

    @Generated
    @StructureField(order = 12, isGetter = false)
    public native void setRightThumbstickX(float value);

    @Generated
    @StructureField(order = 13, isGetter = true)
    public native float rightThumbstickY();

    @Generated
    @StructureField(order = 13, isGetter = false)
    public native void setRightThumbstickY(float value);

    /**
     * Buttons in the range [0.0, 1.0]
     */
    @Generated
    @StructureField(order = 14, isGetter = true)
    public native float leftTrigger();

    /**
     * Buttons in the range [0.0, 1.0]
     */
    @Generated
    @StructureField(order = 14, isGetter = false)
    public native void setLeftTrigger(float value);

    @Generated
    @StructureField(order = 15, isGetter = true)
    public native float rightTrigger();

    @Generated
    @StructureField(order = 15, isGetter = false)
    public native void setRightTrigger(float value);

    /**
     * Boolean indicating whether the controller supports clickable thumbsticks (1) or not (0)
     */
    @Generated
    @StructureField(order = 16, isGetter = true)
    public native boolean supportsClickableThumbsticks();

    /**
     * Boolean indicating whether the controller supports clickable thumbsticks (1) or not (0)
     */
    @Generated
    @StructureField(order = 16, isGetter = false)
    public native void setSupportsClickableThumbsticks(boolean value);

    /**
     * Left and right thumbstick clickable values (0, 1)
     */
    @Generated
    @StructureField(order = 17, isGetter = true)
    public native boolean leftThumbstickButton();

    /**
     * Left and right thumbstick clickable values (0, 1)
     */
    @Generated
    @StructureField(order = 17, isGetter = false)
    public native void setLeftThumbstickButton(boolean value);

    @Generated
    @StructureField(order = 18, isGetter = true)
    public native boolean rightThumbstickButton();

    @Generated
    @StructureField(order = 18, isGetter = false)
    public native void setRightThumbstickButton(boolean value);
}
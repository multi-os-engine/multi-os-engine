package apple.gamecontroller.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

@Generated
public final class GCDevicePhysicalInputElementChange {
    @Generated
    private GCDevicePhysicalInputElementChange() {
    }

    /**
     * Indicates that a change could not be determined. This is typically
     * because the input state queue filled up and older input state snapshots
     * were dropped.
     */
    @Generated @NInt public static final long UnknownChange = 0xFFFFFFFFFFFFFFFFL;
    /**
     * Indicates that no value of the element changed.
     */
    @Generated @NInt public static final long NoChange = 0x0000000000000000L;
    /**
     * Indicates that a value of the element changed.
     */
    @Generated @NInt public static final long Changed = 0x0000000000000001L;
}
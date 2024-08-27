package apple.pencilkit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * A version specifying which PencilKit features are used/allowed.
 */
@Generated
public final class PKContentVersion {
    @Generated
    private PKContentVersion() {
    }

    /**
     * Version for inks introduced in iOS 14.0.
     * 
     * Inks included are Pen, Pencil, and Marker.
     */
    @Generated @NInt public static final long Version1 = 0x0000000000000001L;
    /**
     * Version for inks introduced in iOS 17.0.
     * 
     * Inks included are Pen, Pencil, Marker, Monoline, Fountain Pen, Watercolor, and Crayon.
     */
    @Generated @NInt public static final long Version2 = 0x0000000000000002L;
    /**
     * The latest version including all features.
     */
    @Generated @NInt public static final long VersionLatest = 0x0000000000000002L;
}
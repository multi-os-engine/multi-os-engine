package apple.avfoundation.struct;

import apple.coremedia.struct.CMTime;
import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

@Generated
@Structure()
public final class AVCaptureTimecode extends StructObject {
    static {
        NatJ.register();
    }
    private static long __natjCache;

    @Generated
    public AVCaptureTimecode() {
        super(AVCaptureTimecode.class);
    }

    @Generated
    protected AVCaptureTimecode(Pointer peer) {
        super(peer);
    }

    /**
     * Time component representing the current timecode in hours.
     */
    @Generated
    @StructureField(order = 0, isGetter = true)
    public native byte hours();

    /**
     * Time component representing the current timecode in hours.
     */
    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setHours(byte value);

    /**
     * Time component representing the current timecode in minutes.
     */
    @Generated
    @StructureField(order = 1, isGetter = true)
    public native byte minutes();

    /**
     * Time component representing the current timecode in minutes.
     */
    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setMinutes(byte value);

    /**
     * Time component representing the current timecode in seconds.
     */
    @Generated
    @StructureField(order = 2, isGetter = true)
    public native byte seconds();

    /**
     * Time component representing the current timecode in seconds.
     */
    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setSeconds(byte value);

    /**
     * Frame component of the timecode, indicating the frame count within the second.
     */
    @Generated
    @StructureField(order = 3, isGetter = true)
    public native byte frames();

    /**
     * Frame component of the timecode, indicating the frame count within the second.
     */
    @Generated
    @StructureField(order = 3, isGetter = false)
    public native void setFrames(byte value);

    /**
     * A 32-bit field carrying SMPTE user bits, which are not strictly standardized. User bits are often used for
     * additional metadata such as scene-take information, reel numbers, or dates, but their exact usage is
     * application-dependent.
     */
    @Generated
    @StructureField(order = 4, isGetter = true)
    public native int userBits();

    /**
     * A 32-bit field carrying SMPTE user bits, which are not strictly standardized. User bits are often used for
     * additional metadata such as scene-take information, reel numbers, or dates, but their exact usage is
     * application-dependent.
     */
    @Generated
    @StructureField(order = 4, isGetter = false)
    public native void setUserBits(int value);

    /**
     * Frame duration of the timecode. If unknown, the value is `kCMTimeInvalid`.
     */
    @Generated
    @StructureField(order = 5, isGetter = true)
    @ByValue
    public native CMTime frameDuration();

    /**
     * Frame duration of the timecode. If unknown, the value is `kCMTimeInvalid`.
     */
    @Generated
    @StructureField(order = 5, isGetter = false)
    public native void setFrameDuration(@ByValue CMTime value);

    /**
     * Source type of the timecode, indicating the emitter, carriage, or transport mechanism.
     */
    @Generated
    @StructureField(order = 6, isGetter = true)
    @NInt
    public native long sourceType();

    /**
     * Source type of the timecode, indicating the emitter, carriage, or transport mechanism.
     */
    @Generated
    @StructureField(order = 6, isGetter = false)
    public native void setSourceType(@NInt long value);
}
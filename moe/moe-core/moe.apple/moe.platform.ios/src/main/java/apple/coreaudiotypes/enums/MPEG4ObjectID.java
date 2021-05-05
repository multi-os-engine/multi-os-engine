package apple.coreaudiotypes.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * [@enum]           MPEG4ObjectID
 * @ deprecated    in version 10.5
 * 
 * Constants that describe the various kinds of MPEG-4 audio data.
 * 
 * These constants are used in the flags field of an AudioStreamBasicDescription
 *                 that describes an MPEG-4 audio stream.
 */
@Generated
public final class MPEG4ObjectID {
    @Generated
    private MPEG4ObjectID() {
    }

    @Generated @NInt public static final long AAC_Main = 0x0000000000000001L;
    @Generated @NInt public static final long AAC_LC = 0x0000000000000002L;
    @Generated @NInt public static final long AAC_SSR = 0x0000000000000003L;
    @Generated @NInt public static final long AAC_LTP = 0x0000000000000004L;
    @Generated @NInt public static final long AAC_SBR = 0x0000000000000005L;
    @Generated @NInt public static final long AAC_Scalable = 0x0000000000000006L;
    @Generated @NInt public static final long TwinVQ = 0x0000000000000007L;
    @Generated @NInt public static final long CELP = 0x0000000000000008L;
    @Generated @NInt public static final long HVXC = 0x0000000000000009L;
}
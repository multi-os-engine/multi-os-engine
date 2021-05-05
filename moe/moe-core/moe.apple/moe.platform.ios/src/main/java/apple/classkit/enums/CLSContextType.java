package apple.classkit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

@Generated
public final class CLSContextType {
    @Generated
    private CLSContextType() {
    }

    @Generated @NInt public static final long None = 0x0000000000000000L;
    /**
     * Reserved for the main app context
     */
    @Generated @NInt public static final long App = 0x0000000000000001L;
    @Generated @NInt public static final long Chapter = 0x0000000000000002L;
    @Generated @NInt public static final long Section = 0x0000000000000003L;
    @Generated @NInt public static final long Level = 0x0000000000000004L;
    @Generated @NInt public static final long Page = 0x0000000000000005L;
    @Generated @NInt public static final long Task = 0x0000000000000006L;
    @Generated @NInt public static final long Challenge = 0x0000000000000007L;
    @Generated @NInt public static final long Quiz = 0x0000000000000008L;
    @Generated @NInt public static final long Exercise = 0x0000000000000009L;
    @Generated @NInt public static final long Lesson = 0x000000000000000AL;
    @Generated @NInt public static final long Book = 0x000000000000000BL;
    @Generated @NInt public static final long Game = 0x000000000000000CL;
    @Generated @NInt public static final long Document = 0x000000000000000DL;
    @Generated @NInt public static final long Audio = 0x000000000000000EL;
    @Generated @NInt public static final long Video = 0x000000000000000FL;
    @Generated @NInt public static final long Course = 0x0000000000000010L;
    @Generated @NInt public static final long Custom = 0x0000000000000011L;
}
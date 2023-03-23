package apple.classkit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * API-Since: 11.3
 */
@Generated
public final class CLSContextType {
    @Generated
    private CLSContextType() {
    }

    /**
     * API-Since: 11.3
     */
    @Generated @NInt public static final long None = 0x0000000000000000L;
    /**
     * Reserved for the main app context
     * 
     * API-Since: 11.3
     */
    @Generated @NInt public static final long App = 0x0000000000000001L;
    /**
     * API-Since: 11.3
     */
    @Generated @NInt public static final long Chapter = 0x0000000000000002L;
    /**
     * API-Since: 11.3
     */
    @Generated @NInt public static final long Section = 0x0000000000000003L;
    /**
     * API-Since: 11.3
     */
    @Generated @NInt public static final long Level = 0x0000000000000004L;
    /**
     * API-Since: 11.3
     */
    @Generated @NInt public static final long Page = 0x0000000000000005L;
    /**
     * API-Since: 11.3
     */
    @Generated @NInt public static final long Task = 0x0000000000000006L;
    /**
     * API-Since: 11.3
     */
    @Generated @NInt public static final long Challenge = 0x0000000000000007L;
    /**
     * API-Since: 11.3
     */
    @Generated @NInt public static final long Quiz = 0x0000000000000008L;
    /**
     * API-Since: 11.3
     */
    @Generated @NInt public static final long Exercise = 0x0000000000000009L;
    /**
     * API-Since: 11.3
     */
    @Generated @NInt public static final long Lesson = 0x000000000000000AL;
    /**
     * API-Since: 11.3
     */
    @Generated @NInt public static final long Book = 0x000000000000000BL;
    /**
     * API-Since: 11.3
     */
    @Generated @NInt public static final long Game = 0x000000000000000CL;
    /**
     * API-Since: 11.3
     */
    @Generated @NInt public static final long Document = 0x000000000000000DL;
    /**
     * API-Since: 11.3
     */
    @Generated @NInt public static final long Audio = 0x000000000000000EL;
    /**
     * API-Since: 11.3
     */
    @Generated @NInt public static final long Video = 0x000000000000000FL;
    /**
     * API-Since: 13.4
     */
    @Generated @NInt public static final long Course = 0x0000000000000010L;
    /**
     * API-Since: 13.4
     */
    @Generated @NInt public static final long Custom = 0x0000000000000011L;
}
package apple.identitylookup.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * Describes various classification actions.
 */
@Generated
public final class ILClassificationAction {
    @Generated
    private ILClassificationAction() {
    }

    /**
     * Indicate that no action is requested.
     */
    @Generated @NInt public static final long None = 0x0000000000000000L;
    /**
     * Report communication(s) as not junk.
     */
    @Generated @NInt public static final long ReportNotJunk = 0x0000000000000001L;
    /**
     * Report communication(s) as junk.
     */
    @Generated @NInt public static final long ReportJunk = 0x0000000000000002L;
    /**
     * Report communication(s) as junk and block the sender.
     */
    @Generated @NInt public static final long ReportJunkAndBlockSender = 0x0000000000000003L;
}
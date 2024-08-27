package apple.webkit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * [@enum] WKDialogResult
 * 
 * Constants returned by showLockdownModeFirstUseMessage to indicate how WebKit should treat first use.
 * [@constant] WKDialogResultShowDefault Indicates that the client did not display a first use message. WebKit should
 * show the default.
 * [@constant] WKDialogResultAskAgain Indicates the client handled the message, but wants to be checked if other
 * WKWebViews are used.
 * [@constant] WKDialogResultHandled Indicates the client handled the message and no further checks are needed.
 * 
 * API-Since: 16.0
 */
@Generated
public final class WKDialogResult {
    @Generated
    private WKDialogResult() {
    }

    /**
     * API-Since: 16.0
     */
    @Generated @NInt public static final long ShowDefault = 0x0000000000000001L;
    /**
     * API-Since: 16.0
     */
    @Generated @NInt public static final long AskAgain = 0x0000000000000002L;
    /**
     * API-Since: 16.0
     */
    @Generated @NInt public static final long Handled = 0x0000000000000003L;
}
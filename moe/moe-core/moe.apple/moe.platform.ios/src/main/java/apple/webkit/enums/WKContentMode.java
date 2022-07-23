package apple.webkit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * [@enum] WKContentMode
 * <p>
 * A content mode represents the type of content to load, as well as
 * additional layout and rendering adaptations that are applied as a result of
 * loading the content
 * [@constant] WKContentModeRecommended The recommended content mode for the current platform
 * [@constant] WKContentModeMobile Represents content targeting mobile browsers
 * [@constant] WKContentModeDesktop Represents content targeting desktop browsers
 * <p>
 * WKContentModeRecommended behaves like WKContentModeMobile on iPhone and iPad mini
 * and WKContentModeDesktop on other iPad models as well as Mac.
 */
@Generated
public final class WKContentMode {
    @Generated
    private WKContentMode() {
    }

    @Generated @NInt public static final long Recommended = 0x0000000000000000L;
    @Generated @NInt public static final long Mobile = 0x0000000000000001L;
    @Generated @NInt public static final long Desktop = 0x0000000000000002L;
}

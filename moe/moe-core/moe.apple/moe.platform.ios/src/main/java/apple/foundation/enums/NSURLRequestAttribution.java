package apple.foundation.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

/**
 * [@enum] NSURLRequestAttribution
 * <p>
 * The NSURLRequestAttribution enum is used to indicate whether the
 * user or developer specified the URL.
 * <p>
 * [@constant] NSURLRequestAttributionDeveloper Indicates that the URL was specified
 * by the developer. This is the default value for an NSURLRequest when created.
 * <p>
 * [@constant] NSURLRequestAttributionUser Indicates that the URL was specified by
 * the user.
 */
@Generated
public final class NSURLRequestAttribution {
    @Generated
    private NSURLRequestAttribution() {
    }

    @Generated @NUInt public static final long Developer = 0x0000000000000000L;
    @Generated @NUInt public static final long User = 0x0000000000000001L;
}

package apple.foundation.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

/**
 * [@enum] NSURLRequestAttribution
 * 
 * The NSURLRequestAttribution enum is used to indicate whether the
 * user or developer specified the URL.
 * 
 * [@constant] NSURLRequestAttributionDeveloper Indicates that the URL was specified
 * by the developer. This is the default value for an NSURLRequest when created.
 * 
 * [@constant] NSURLRequestAttributionUser Indicates that the URL was specified by
 * the user.
 * 
 * API-Since: 15.0
 */
@Generated
public final class NSURLRequestAttribution {
    @Generated
    private NSURLRequestAttribution() {
    }

    /**
     * API-Since: 15.0
     */
    @Generated @NUInt public static final long Developer = 0x0000000000000000L;
    /**
     * API-Since: 15.0
     */
    @Generated @NUInt public static final long User = 0x0000000000000001L;
}

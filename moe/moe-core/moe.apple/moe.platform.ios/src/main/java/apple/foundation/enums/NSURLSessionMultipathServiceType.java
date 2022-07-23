package apple.foundation.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * [@enum] NSURLSessionMultipathServiceType
 * <p>
 * The NSURLSessionMultipathServiceType enum defines constants that
 * can be used to specify the multipath service type to associate an NSURLSession. The
 * multipath service type determines whether multipath TCP should be attempted and the conditions
 * for creating and switching between subflows. Using these service types requires the appropriate entitlement. Any
 * connection attempt will fail if the process does not have the required entitlement.
 * A primary interface is a generally less expensive interface in terms of both cost and power (such as WiFi or
 * ethernet). A secondary interface is more expensive (such as 3G or LTE).
 * <p>
 * [@constant] NSURLSessionMultipathServiceTypeNone Specifies that multipath tcp should not be used. Connections will
 * use a single flow.
 * This is the default value. No entitlement is required to set this value.
 * <p>
 * [@constant] NSURLSessionMultipathServiceTypeHandover Specifies that a secondary subflow should only be used
 * when the primary subflow is not performing adequately. Requires the com.apple.developer.networking.multipath
 * entilement.
 * <p>
 * [@constant] NSURLSessionMultipathServiceTypeInteractive Specifies that a secodary subflow should be used if the
 * primary subflow is not performing adequately (packet loss, high round trip times, bandwidth issues). The secondary
 * subflow will be created more aggressively than with NSURLSessionMultipathServiceTypeHandover. Requires the
 * com.apple.developer.networking.multipath entitlement.
 * <p>
 * [@constant] NSURLSessionMultipathServiceTypeAggregate Specifies that multiple subflows across multiple interfaces
 * should be
 * used for better bandwidth. This mode is only available for experimentation on devices configured for development use.
 * It can be enabled in the Developer section of the Settings app.
 */
@Generated
public final class NSURLSessionMultipathServiceType {
    @Generated
    private NSURLSessionMultipathServiceType() {
    }

    /**
     * None - no multipath (default)
     */
    @Generated @NInt public static final long None = 0x0000000000000000L;
    /**
     * Handover - secondary flows brought up when primary flow is not performing adequately.
     */
    @Generated @NInt public static final long Handover = 0x0000000000000001L;
    /**
     * Interactive - secondary flows created more aggressively.
     */
    @Generated @NInt public static final long Interactive = 0x0000000000000002L;
    /**
     * Aggregate - multiple subflows used for greater bandwitdh.
     */
    @Generated @NInt public static final long Aggregate = 0x0000000000000003L;
}

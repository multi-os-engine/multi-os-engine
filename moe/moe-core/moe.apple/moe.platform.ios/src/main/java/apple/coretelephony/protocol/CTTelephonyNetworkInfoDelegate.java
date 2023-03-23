package apple.coretelephony.protocol;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

/**
 * CTTelephonyNetworkInfoDelegate
 * 
 * Discussion:
 * Delegate interface for CTTelephonyNetworkInfo.
 * All delegate callbacks are dispatched asynchronously to a global queue with QoS QOS_CLASS_DEFAULT.
 * 
 * API-Since: 13.0
 */
@Generated
@Library("CoreTelephony")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("CTTelephonyNetworkInfoDelegate")
public interface CTTelephonyNetworkInfoDelegate {
    /**
     * dataServiceIdentifierDidChange:
     * 
     * Discussion:
     * Selector to be invoked whenever the data service identifier changes.
     * This identifier is meant to be used as a key in associated dictionaries,
     * e.g. serviceSubscriberCellularProviders.
     */
    @Generated
    @IsOptional
    @Selector("dataServiceIdentifierDidChange:")
    default void dataServiceIdentifierDidChange(String identifier) {
        throw new java.lang.UnsupportedOperationException();
    }
}

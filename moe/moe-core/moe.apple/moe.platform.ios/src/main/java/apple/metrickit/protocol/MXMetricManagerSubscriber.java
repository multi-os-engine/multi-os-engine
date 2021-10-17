package apple.metrickit.protocol;

import apple.foundation.NSArray;
import apple.metrickit.MXDiagnosticPayload;
import apple.metrickit.MXMetricPayload;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

/**
 * [@protocol]      MXMetricManagerSubscriber
 * <p>
 * A protocol that allows the conforming object to receive metric payloads from the metric manager.
 * <p>
 * In order to receive metric payloads, atleast one object must conform to this protocol and be subscribed   to the metric manager.
 * <p>
 * Objects which conform to this protocol can be passed to addSubscriber:subscriber and removeSubscriber:subscriber to manage their subscription state.
 */
@Generated
@Library("MetricKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MXMetricManagerSubscriber")
public interface MXMetricManagerSubscriber {
    /**
     * didReceiveMetricPayloads:payloads
     * <p>
     * This method is invoked when a new MXMetricPayload has been received.
     * <p>
     * You can expect for this method to be invoked atleast once per day when the app is running and subscribers are available.
     * <p>
     * If no subscribers are available, this method will not be invoked.
     * <p>
     * Atleast one subscriber must be available to receive metrics.
     * <p>
     * This method is invoked on a background queue.
     *
     * @param payloads An NSArray of MXMetricPayload objects. This array of payloads contains data from previous usage sessions.
     */
    @IsOptional
    @Generated
    @Selector("didReceiveMetricPayloads:")
    default void didReceiveMetricPayloads(NSArray<? extends MXMetricPayload> payloads) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * didReceiveDiagnosticPayloads:payloads
     * <p>
     * This method is invoked when a new MXDiagnosticPayload has been received.
     * <p>
     * You can expect for this method to be invoked atleast once per day when the app is running and subscribers are available.
     * <p>
     * If no subscribers are available, this method will not be invoked.
     * <p>
     * Atleast one subscriber must be available to receive diagnostics.
     * <p>
     * This method is invoked on a background queue.
     *
     * @param payloads An NSArray of MXDiagnosticPayload objects. This array of payloads contains diagnostics from previous usage sessions.
     */
    @Generated
    @IsOptional
    @Selector("didReceiveDiagnosticPayloads:")
    default void didReceiveDiagnosticPayloads(NSArray<? extends MXDiagnosticPayload> payloads) {
        throw new java.lang.UnsupportedOperationException();
    }
}

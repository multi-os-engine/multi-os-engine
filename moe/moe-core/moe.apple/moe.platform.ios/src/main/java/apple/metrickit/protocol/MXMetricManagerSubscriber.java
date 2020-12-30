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
 * @protocol      MXMetricManagerSubscriber
 * @abstract      A protocol that allows the conforming object to receive metric payloads from the metric manager.
 * @discussion    In order to receive metric payloads, atleast one object must conform to this protocol and be subscribed   to the metric manager.
 * @discussion    Objects which conform to this protocol can be passed to addSubscriber:subscriber and removeSubscriber:subscriber to manage their subscription state.
 */
@Generated
@Library("MetricKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MXMetricManagerSubscriber")
public interface MXMetricManagerSubscriber {
    /**
     * @method        didReceiveMetricPayloads:payloads
     * @abstract      This method is invoked when a new MXMetricPayload has been received.
     * @param         payloads
     * An NSArray of MXMetricPayload objects. This array of payloads contains data from previous usage sessions.
     * @discussion    You can expect for this method to be invoked atleast once per day when the app is running and subscribers are available.
     * @discussion    If no subscribers are available, this method will not be invoked.
     * @discussion    Atleast one subscriber must be available to receive metrics.
     * @discussion    This method is invoked on a background queue.
     */
    @Generated
    @Selector("didReceiveMetricPayloads:")
    void didReceiveMetricPayloads(NSArray<? extends MXMetricPayload> payloads);

    /**
     * @method        didReceiveDiagnosticPayloads:payloads
     * @abstract      This method is invoked when a new MXDiagnosticPayload has been received.
     * @param         payloads
     * An NSArray of MXDiagnosticPayload objects. This array of payloads contains diagnostics from previous usage sessions.
     * @discussion    You can expect for this method to be invoked atleast once per day when the app is running and subscribers are available.
     * @discussion    If no subscribers are available, this method will not be invoked.
     * @discussion    Atleast one subscriber must be available to receive diagnostics.
     * @discussion    This method is invoked on a background queue.
     */
    @Generated
    @IsOptional
    @Selector("didReceiveDiagnosticPayloads:")
    default void didReceiveDiagnosticPayloads(NSArray<? extends MXDiagnosticPayload> payloads) {
        throw new java.lang.UnsupportedOperationException();
    }
}
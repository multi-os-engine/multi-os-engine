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

@Generated
@Library("MetricKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MXMetricManagerSubscriber")
public interface MXMetricManagerSubscriber {
    @Generated
    @Selector("didReceiveMetricPayloads:")
    void didReceiveMetricPayloads(NSArray<? extends MXMetricPayload> payloads);

    @Generated
    @IsOptional
    @Selector("didReceiveDiagnosticPayloads:")
    default void didReceiveDiagnosticPayloads(NSArray<? extends MXDiagnosticPayload> payloads) {
        throw new java.lang.UnsupportedOperationException();
    }
}
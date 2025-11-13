package apple.backgroundtasks.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * API-Since: 26.0
 */
@Generated
public final class BGContinuedProcessingTaskRequestResources {
    @Generated
    private BGContinuedProcessingTaskRequestResources() {
    }

    /**
     * No special system resources required.
     * 
     * Unless informed otherwise, the scheduler assumes the default resources, allowing background CPU and network
     * access.
     * 
     * API-Since: 26.0
     */
    @Generated @NInt public static final long Default = 0x0000000000000000L;
    /**
     * Indicate to the scheduler that the workload will require background GPU utilization.
     * 
     * Task submissions will be rejected if the submitting app does not have the correct entitlement. Background GPU
     * execution is not supported on all devices. Additionally, if a device is experiencing heavy GPU contention
     * backgrounded workloads are not guaranteed runtime.
     * 
     * - Important: Applications must have the `com.apple.developer.background-tasks.continued-processing.gpu`
     * entitlement to submit a task request with this resource.
     * 
     * API-Since: 26.0
     */
    @Generated @NInt public static final long GPU = 0x0000000000000001L;
}
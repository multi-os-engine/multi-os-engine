package apple.mlcompute.enums;

import org.moe.natj.general.ann.Generated;

/**
 * [@enum] MLCDeviceType
 * <p>
 * A device type for execution of a neural network.
 */
@Generated
public final class MLCDeviceType {
    @Generated
    private MLCDeviceType() {
    }

    /**
     * The CPU device
     */
    @Generated public static final int CPU = 0x00000000;
    /**
     * The GPU device.
     */
    @Generated public static final int GPU = 0x00000001;
    /**
     * The any device type. When selected, the framework will automatically use the appropriate devices to achieve the
     * best
     * performance.
     */
    @Generated public static final int Any = 0x00000002;
    /**
     * The Apple Neural Engine device. When selected, the framework will use the Neural Engine to execute all layers
     * that can be executed on it.
     * Layers that cannot be executed on the ANE will run on the CPU or GPU. The Neural Engine device must be explicitly
     * selected. MLDeviceTypeAny
     * will not select the Neural Engine device. In addition, this device can be used with inference graphs only. This
     * device cannot be used with a
     * training graph or an inference graph that shares layers with a training graph.
     */
    @Generated public static final int ANE = 0x00000003;
    /**
     * holds the number of MLCDeviceType
     */
    @Generated public static final int Count = 0x00000004;
}

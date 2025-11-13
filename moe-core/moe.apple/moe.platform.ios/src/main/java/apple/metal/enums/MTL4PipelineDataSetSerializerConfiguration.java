package apple.metal.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

/**
 * Configuration options for pipeline dataset serializer objects.
 * 
 * Use these options to enable different functionality in instances of ``MTL4PipelineDataSetSerializer``.
 * 
 * You can combine these values via a logical `OR` and set it to
 * ``MTL4PipelineDataSetSerializerDescriptor/configuration``
 * to specify desired level of serialization support for instances of ``MTL4PipelineDataSetSerializer``.
 * 
 * API-Since: 26.0
 */
@Generated
public final class MTL4PipelineDataSetSerializerConfiguration {
    @Generated
    private MTL4PipelineDataSetSerializerConfiguration() {
    }

    /**
     * Enables serializing pipeline scripts.
     * 
     * Set this mask to use ``MTL4PipelineDataSetSerializer.serializeAsPipelinesScriptWithError``.
     * 
     * This for the default behavior.
     * 
     * API-Since: 26.0
     */
    @Generated @NUInt public static final long Descriptors = 0x0000000000000001L;
    /**
     * Enables serializing pipeline binary functions.
     * 
     * Set this mask to use ``MTL4PipelineDataSetSerializer.serializeAsArchiveAndFlush(toURL:error:)``.
     * 
     * API-Since: 26.0
     */
    @Generated @NUInt public static final long Binaries = 0x0000000000000002L;
}
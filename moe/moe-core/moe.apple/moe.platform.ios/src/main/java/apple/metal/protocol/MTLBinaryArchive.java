package apple.metal.protocol;

import apple.foundation.NSError;
import apple.foundation.NSURL;
import apple.metal.MTLComputePipelineDescriptor;
import apple.metal.MTLFunctionDescriptor;
import apple.metal.MTLRenderPipelineDescriptor;
import apple.metal.MTLTileRenderPipelineDescriptor;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.ReferenceInfo;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * [@protocol] MTLBinaryArchive
 * <p>
 * A container of pipeline state descriptors and their associated compiled code.
 * <p>
 * A MTLBinaryArchive allows to persist compiled pipeline state objects for a device, which can be used to skip
 * recompilation on a subsequent run of the app.
 * One or more archives may be supplied in the descriptor of a pipeline state, allowing the device to attempt to look up
 * compiled code in them before performing compilation.
 * If no archives are provided, or no archives contain the requested content, the pipeline state is created by compiling
 * the code as usual.
 * Note that software updates of the OS or device drivers may cause the archive to become outdated, causing the lookup
 * to fail and the usual path performing on-demand compilation is taken.
 * A MTLBinaryArchive is populated by adding functions from pipeline state descriptors to it, indicating which compiled
 * code should be persisted in the archive.
 * Once all desired pipeline state descriptors have been added, use serializeToURL:error: to write the contents for the
 * current device to disk.
 * MTLBinaryArchive files generated for multiple different devices can be combined using the "lipo" tool into a single
 * archive, which can then be shipped with the application.
 * It is possible to maintain different archive files for different contexts; for example each level in a game may use a
 * different cache object.
 * Note: Metal maintains a separate cache of pipeline states on behalf of each app that contains all compiled code; this
 * cache is populated as compilation occurs.
 * This cache will automatically accelerate pipeline state creation after a pipeline is created for the first time.
 * Use MTLBinaryArchive to augment that cache by accelerating pipeline state creation even on the first run of an app.
 * Updating a MTLBinaryArchive at runtime in a shipping app configuration is not recommended; such a scenario requires
 * corruption resiliency, careful storage space management and may cache hard-to-reproduce errors.
 * These kind of issues are handled transparently by the Metal maintained cache, therefore we recommend that
 * MTLBinaryArchive is populated during development time and shipped as an asset.
 */
@Generated
@Library("Metal")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MTLBinaryArchive")
public interface MTLBinaryArchive {
    /**
     * addComputePipelineFunctionsWithDescriptor:error:
     * <p>
     * Add the function(s) from a compute pipeline state to the archive.
     *
     * @param descriptor The descriptor from which function(s) will be added.
     * @param error      If the function fails, this will be set to describe the failure. This can be (but is not
     *                   required to be) an error from the MTLBinaryArchiveDomain domain.
     * @return Whether or not the addition succeeded. Functions referenced multiple times are silently accepted.
     */
    @Generated
    @Selector("addComputePipelineFunctionsWithDescriptor:error:")
    boolean addComputePipelineFunctionsWithDescriptorError(MTLComputePipelineDescriptor descriptor,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * addRenderPipelineFunctionsWithDescriptor:error:
     * <p>
     * Add the function(s) from a render pipeline state to the archive.
     *
     * @param descriptor The descriptor from which function(s) will be added.
     * @param error      If the function fails, this will be set to describe the failure. This can be (but is not
     *                   required to be) an error from the MTLBinaryArchiveDomain domain.
     * @return Whether or not the addition succeeded. Functions referenced multiple times are silently accepted.
     */
    @Generated
    @Selector("addRenderPipelineFunctionsWithDescriptor:error:")
    boolean addRenderPipelineFunctionsWithDescriptorError(MTLRenderPipelineDescriptor descriptor,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * addTileRenderPipelineFunctionsWithDescriptor:error:
     * <p>
     * Add the function(s) from a tile render pipeline state to the archive.
     *
     * @param descriptor The descriptor from which function(s) will be added.
     * @param error      If the function fails, this will be set to describe the failure. This can be (but is not
     *                   required to be) an error from the MTLBinaryArchiveDomain domain.
     * @return Whether or not the addition succeeded. Functions referenced multiple times are silently accepted.
     */
    @Generated
    @Selector("addTileRenderPipelineFunctionsWithDescriptor:error:")
    boolean addTileRenderPipelineFunctionsWithDescriptorError(MTLTileRenderPipelineDescriptor descriptor,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * [@property] device
     * <p>
     * The device this resource was created against. This resource can only be used with this device.
     */
    @Generated
    @Selector("device")
    @MappedReturn(ObjCObjectMapper.class)
    MTLDevice device();

    /**
     * [@property] label
     * <p>
     * A string to help identify this object.
     */
    @Generated
    @Selector("label")
    String label();

    /**
     * serializeToURL:error:
     * <p>
     * Write the contents of a MTLBinaryArchive to a file.
     * <p>
     * Persisting the archive to a file allows opening the archive on a subsequent instance of the app, making available
     * the contents without recompiling.
     *
     * @param url   The file URL to which to write the file
     * @param error If the function fails, this will be set to describe the failure. This can be (but is not required to
     *              be) an error from the MTLBinaryArchiveDomain domain. Other possible errors can be file access or I/O
     *              related.
     * @return Whether or not the writing the file succeeded.
     */
    @Generated
    @Selector("serializeToURL:error:")
    boolean serializeToURLError(NSURL url, @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * [@property] label
     * <p>
     * A string to help identify this object.
     */
    @Generated
    @Selector("setLabel:")
    void setLabel(String value);

    /**
     * addFunctionWithDescriptor:library:error:
     * <p>
     * Add a `visible` or `intersection` function to the archive.
     *
     * @param descriptor The descriptor from which the function will be added.
     * @param library    Library of functions to add the function from.
     * @param error      If the function fails, this will be set to describe the failure. This can be (but is not
     *                   required to be) an error from the MTLBinaryArchiveDomain domain. Other possible errors can be
     *                   file access or I/O related.
     * @return Whether or not the addition succeeded. Functions referenced multiple times are silently accepted.
     */
    @Generated
    @Selector("addFunctionWithDescriptor:library:error:")
    boolean addFunctionWithDescriptorLibraryError(MTLFunctionDescriptor descriptor,
            @Mapped(ObjCObjectMapper.class) MTLLibrary library,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);
}

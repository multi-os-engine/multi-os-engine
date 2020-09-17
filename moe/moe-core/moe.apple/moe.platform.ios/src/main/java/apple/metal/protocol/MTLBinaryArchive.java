package apple.metal.protocol;

import apple.foundation.NSError;
import apple.foundation.NSURL;
import apple.metal.MTLComputePipelineDescriptor;
import apple.metal.MTLRenderPipelineDescriptor;
import apple.metal.MTLTileRenderPipelineDescriptor;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.ReferenceInfo;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("Metal")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MTLBinaryArchive")
public interface MTLBinaryArchive {
    @Generated
    @Selector("addComputePipelineFunctionsWithDescriptor:error:")
    boolean addComputePipelineFunctionsWithDescriptorError(MTLComputePipelineDescriptor descriptor,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Selector("addRenderPipelineFunctionsWithDescriptor:error:")
    boolean addRenderPipelineFunctionsWithDescriptorError(MTLRenderPipelineDescriptor descriptor,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Selector("addTileRenderPipelineFunctionsWithDescriptor:error:")
    boolean addTileRenderPipelineFunctionsWithDescriptorError(MTLTileRenderPipelineDescriptor descriptor,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Selector("device")
    @MappedReturn(ObjCObjectMapper.class)
    MTLDevice device();

    @Generated
    @Selector("label")
    String label();

    @Generated
    @Selector("serializeToURL:error:")
    boolean serializeToURLError(NSURL url, @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Selector("setLabel:")
    void setLabel(String value);
}
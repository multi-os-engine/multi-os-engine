/*
Copyright 2014-2016 Intel Corporation

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/

package apple.metalkit.c;

import apple.foundation.NSError;
import apple.metal.MTLVertexDescriptor;
import apple.modelio.MDLVertexDescriptor;
import org.moe.natj.c.CRuntime;
import org.moe.natj.c.ann.CFunction;
import org.moe.natj.c.ann.CVariable;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.objc.map.ObjCStringMapper;

@Generated
@Library("MetalKit")
@Runtime(CRuntime.class)
public final class MetalKit {
    static {
        NatJ.register();
    }

    @Generated
    private MetalKit() {
    }

    /**
     * [@function] MTKModelIOVertexDescriptorFromMetal
     * <p>
     * Partially converts a Metal vertex descriptor to a Model I/O vertex descriptor
     * <p>
     * This method can only set vertex format, offset, bufferIndex, and stride information in the produced Model I/O
     * vertex descriptor. It does not add any semantic information such at attributes names. Names must be set in the
     * returned Model I/O vertex descriptor before it can be applied to a a Model I/O mesh.
     */
    @Generated
    @CFunction
    public static native MDLVertexDescriptor MTKModelIOVertexDescriptorFromMetal(MTLVertexDescriptor metalDescriptor);

    /**
     * [@function] MTKModelIOVertexDescriptorFromMetalWithError
     * <p>
     * Partially converts a Metal vertex descriptor to a Model I/O vertex descriptor
     * <p>
     * This method can only set vertex format, offset, bufferIndex, and stride information in the produced Model I/O
     * vertex descriptor. It does not add any semantic information such at attributes names. Names must be set in the
     * returned Model I/O vertex descriptor before it can be applied to a a Model I/O mesh. If error is nonnull, and the
     * conversion cannot be made, it will be set.
     */
    @Generated
    @CFunction
    public static native MDLVertexDescriptor MTKModelIOVertexDescriptorFromMetalWithError(
            MTLVertexDescriptor metalDescriptor, Ptr<NSError> error);

    /**
     * [@function] MTKMetalVertexDescriptorFromModelIO
     * <p>
     * Partially converts a Model I/O vertex descriptor to a Metal vertex descriptor
     * <p>
     * This method can only set vertex format, offset, bufferIndex, and stride information in the produced Metal vertex
     * descriptor. It simply copies attributes 1 for 1. Thus attributes in the given Model I/O vertex descriptor must be
     * arranged in the correct order for the resulting descriptor to properly map mesh data to vertex shader inputs.
     * Layout stepFunction and stepRates for the resulting MTLVertexDescriptor must also be set by application.
     */
    @Generated
    @CFunction
    public static native MTLVertexDescriptor MTKMetalVertexDescriptorFromModelIO(MDLVertexDescriptor modelIODescriptor);

    /**
     * [@function] MTKMetalVertexDescriptorFromModelIOWithError
     * <p>
     * Partially converts a Model I/O vertex descriptor to a Metal vertex descriptor
     * <p>
     * This method can only set vertex format, offset, bufferIndex, and stride information in the produced Metal vertex
     * descriptor. It simply copies attributes 1 for 1. Thus attributes in the given Model I/O vertex descriptor must be
     * arranged in the correct order for the resulting descriptor to properly map mesh data to vertex shader inputs.
     * Layout stepFunction and stepRates for the resulting MTLVertexDescriptor must also be set by application. If error
     * is nonnull, and the conversion cannot be made, it will be set.
     */
    @Generated
    @CFunction
    public static native MTLVertexDescriptor MTKMetalVertexDescriptorFromModelIOWithError(
            MDLVertexDescriptor modelIODescriptor, Ptr<NSError> error);

    /**
     * [@function] MTKModelIOVertexFormatFromMetal
     * <p>
     * Converts a Metal vertex format to a Model I/O vertex format
     *
     * @return A Model I/O vertexformat correspoinding to the given Metal vertex format. Returns MDLVertexFormatInvalid
     *         if no matching Model I/O vertex format exists.
     */
    @Generated
    @CFunction
    @NUInt
    public static native long MTKModelIOVertexFormatFromMetal(@NUInt long vertexFormat);

    /**
     * [@function] MTKMetalVertexFormatFromModelIO
     * <p>
     * Converts a Model I/O vertex format to a Metal vertex format
     *
     * @return A Metal vertexformat correspoinding to the given Model I/O vertex format. Returns MTLVertexFormatInvalid
     *         if no matching Metal vertex format exists.
     */
    @Generated
    @CFunction
    @NUInt
    public static native long MTKMetalVertexFormatFromModelIO(@NUInt long vertexFormat);

    /**
     * [@constant] MTKTextureLoaderErrorDomain
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MTKTextureLoaderErrorDomain();

    /**
     * [@constant] MTKTextureLoaderErrorKey
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MTKTextureLoaderErrorKey();

    /**
     * [@constant] MTKTextureLoaderOptionAllocateMipmaps
     * <p>
     * Identifier to be used in an options NSDictionary with a boolean NSNumber specifying whether to allocate memory
     * for mipmaps when creating the texture
     * <p>
     * If the boolean value specified with this string is true, the resulting Metal texture will have been created with
     * mipmaps whose contents are undefined. It is the responsibility of the caller to fill out the contents of the
     * mipmap data unless MTLTextureLoaderOptionGenerateMipmaps is specified. If the file being loaded contains data for
     * mipmaps (such as in a PVR or KTX file) this option does not need to be specified. In those cases the mipmap
     * memory will be allocated and the image data loaded.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MTKTextureLoaderOptionAllocateMipmaps();

    /**
     * [@constant] MTKTextureLoaderOptionGenerateMipmaps
     * <p>
     * Identifier to be used in an options NSDictionary with a boolean NSNumber specifying whether to generate mipmaps
     * when creating the texture
     * <p>
     * If the boolean value specified with this string is true, the resulting Metal texture will be created with
     * mipmaps. If the file being loaded contains data for mipmaps (such as in a PVR or KTX file), specifying this
     * option will overwrite the existing mipmap data in the loaded texture. This option can only be used if the pixel
     * format of the texture is color filterable and color renderable. This option implies
     * MTKTextureLoaderOptionAllocateMipmaps. Specifying this option will cause the MTKTextureLoader to submit work to
     * the GPU on behalf of the caller.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MTKTextureLoaderOptionGenerateMipmaps();

    /**
     * [@constant] MTKTextureLoaderOptionSRGB
     * <p>
     * Identifier to be used in an options NSDictionary with a boolean NSNumber specifying whether to create the texture
     * with an sRGB (gamma corrected) pixel format
     * <p>
     * If the boolean value specified with this string is true, the texture will be created with an sRGB pixel format
     * regardless of whether the image file specifies that the data has already been gamma corrected. Likewise, if
     * false, the texture will be created with a non-sRGB pixel format regardless of whether the image file specifies
     * that the data has been gamma corrected. To use the sRGB information specified in the file, do not specify this in
     * the options dictionary.
     * [@warning] When deploying to OS's prior to macOS 10.15 / iOS 13.0, this option is ignored for loading KTX
     * textures.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MTKTextureLoaderOptionSRGB();

    /**
     * [@constant] MTKTextureLoaderOptionTextureUsage
     * <p>
     * Identifier to be used with an NSNumber specifying the MTLTextureUsage flags
     * <p>
     * The resulting Metal texture will be created with the MTLTextureUsage flags indicated by the NSNumber associated
     * with this string.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MTKTextureLoaderOptionTextureUsage();

    /**
     * [@constant] MTKTextureLoaderOptionTextureCPUCacheMode
     * <p>
     * Identifier to be used with an NSNumber specifying the MTLCPUCacheMode
     * <p>
     * The resulting Metal texture will be created with the MTLCPUCacheMode indicated by the NSNumber associated with
     * this string.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MTKTextureLoaderOptionTextureCPUCacheMode();

    /**
     * [@constant] MTKTextureLoaderOptionTextureStorageMode
     * <p>
     * Identifier to be used with an NSNumber specifying the MTLStorageMode
     * <p>
     * The resulting Metal texture will be created with the MTLStorageMode indicated by the NSNumber associated with
     * this string. If this option is omitted, the texture will be created with the default storage mode for Metal
     * textures: MTLStorageModeShared on iOS, and MTLStorageModeManaged on OS X. Specifying this option with
     * MTLTextureStorageModePrivate cause the MTKTextureLoader to submit work to the GPU on behalf of the caller.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MTKTextureLoaderOptionTextureStorageMode();

    /**
     * [@constant] MTKTextureLoaderOptionCubeLayout
     * <p>
     * Identifier to be used in an options NSDictionary with an MTKTextureLoaderCubeLayout NSString specifying whether
     * to create a cubemap from a 2D image
     * <p>
     * The NSString value specified with this string must be one option of MTKTextureLoaderCubeLayout. If this option is
     * omitted, the texture loader will not create cubemaps from 2D textures. This option cannot be used with PVR files,
     * KTX files, or MDLTextures, which support cube textures directly.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MTKTextureLoaderOptionCubeLayout();

    /**
     * [@constant] MTKTextureLoaderCubeLayoutVertical
     * <p>
     * Identifier specifying that the texture loader will create a cube texture from six faces arranged vertically
     * within a single 2D image
     * <p>
     * A texture cube will be created from six faces arranged vertically within a single 2D image. The image height must
     * be six times the image width, with faces arranged in the following order from top to bottom: +X, -X, +Y, -Y, +Z,
     * -Z.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MTKTextureLoaderCubeLayoutVertical();

    /**
     * [@constant] MTKTextureLoaderOptionOrigin
     * <p>
     * Identifier to be used in an options NSDictionary with an MTKTextureLoaderOrigin NSString specifying whether to
     * flip textures vertically
     * <p>
     * The NSString value specified with this string must be one option of MTKTextureLoaderOrigin. If this option is
     * omitted, the texture loader will not flip loaded textures. This option cannot be used with block-compressed
     * texture formats, and can only be used with 2D, 2D array, and cube map textures. Each mipmap level and slice of a
     * texture will be flipped.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MTKTextureLoaderOptionOrigin();

    /**
     * [@constant] MTKTextureLoaderOriginTopLeft
     * <p>
     * Identifier specifying that the texture loader should flip textures whose origin is in the bottom-left corner
     * <p>
     * The texture will be flipped vertically if metadata in the file being loaded indicates that the source data starts
     * with the bottom-left corner of the texture.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MTKTextureLoaderOriginTopLeft();

    /**
     * [@constant] MTKTextureLoaderOriginBottomLeft
     * <p>
     * Identifier specifying that the texture loader should flip textures whose origin is in the top-left corner
     * <p>
     * The texture will be flipped vertically if metadata in the file being loaded indicates that the source data starts
     * with the top-left corner of the texture.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MTKTextureLoaderOriginBottomLeft();

    /**
     * [@constant] MTKTextureLoaderOriginFlippedVertically
     * <p>
     * Identifier specifying that the texture loader should always flip textures
     * <p>
     * The texture will be flipped vertically regardless of any metadata in the file indicating the placement of the
     * origin in the source data
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MTKTextureLoaderOriginFlippedVertically();

    /**
     * [@constant] MTKModelErrorDomain
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MTKModelErrorDomain();

    /**
     * [@constant] MTKModelErrorKey
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MTKModelErrorKey();
}

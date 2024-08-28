package apple.metal.protocol;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

/**
 * API-Since: 16.0
 */
@Generated
@Library("Metal")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MTLTextureBinding")
public interface MTLTextureBinding extends MTLBinding {
    @Generated
    @Selector("arrayLength")
    @NUInt
    long arrayLength();

    /**
     * true for depth textures
     */
    @Generated
    @Selector("isDepthTexture")
    boolean isDepthTexture();

    /**
     * half, float, int, or uint.
     */
    @Generated
    @Selector("textureDataType")
    @NUInt
    long textureDataType();

    /**
     * texture1D, texture2D...
     */
    @Generated
    @Selector("textureType")
    @NUInt
    long textureType();
}
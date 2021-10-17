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

package apple.spritekit;

import apple.NSObject;
import apple.coregraphics.opaque.CGImageRef;
import apple.coregraphics.struct.CGRect;
import apple.coregraphics.struct.CGSize;
import apple.coreimage.CIFilter;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSData;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSCopying;
import apple.foundation.protocol.NSSecureCoding;
import apple.gameplaykit.GKNoiseMap;
import apple.uikit.UIImage;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NFloat;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * A texture to be mapped onto SKSpriteNode instances.
 */
@Generated
@Library("SpriteKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class SKTexture extends NSObject implements NSCopying, NSSecureCoding {
    static {
        NatJ.register();
    }

    @Generated
    protected SKTexture(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native SKTexture alloc();

    @Generated
    @Selector("allocWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(String key);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(@Mapped(ObjCObjectMapper.class) Object aTarget);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
    public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
            @Mapped(ObjCObjectMapper.class) Object aTarget, SEL aSelector,
            @Mapped(ObjCObjectMapper.class) Object anArgument);

    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @Generated
    @Selector("classForKeyedUnarchiver")
    public static native Class classForKeyedUnarchiver();

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("instanceMethodForSelector:")
    @FunctionPtr(name = "call_instanceMethodForSelector_ret")
    public static native NSObject.Function_instanceMethodForSelector_ret instanceMethodForSelector(SEL aSelector);

    @Generated
    @Selector("instanceMethodSignatureForSelector:")
    public static native NSMethodSignature instanceMethodSignatureForSelector(SEL aSelector);

    @Generated
    @Selector("instancesRespondToSelector:")
    public static native boolean instancesRespondToSelector(SEL aSelector);

    @Generated
    @Selector("isSubclassOfClass:")
    public static native boolean isSubclassOfClass(Class aClass);

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

    @Generated
    @Owned
    @Selector("new")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object new_objc();

    /**
     * Start a texture preload operation on an array of textures
     *
     * @param textures          an array of SKTextures to be preloaded
     * @param completionHandler will be called upon the preload completion
     */
    @Generated
    @Selector("preloadTextures:withCompletionHandler:")
    public static native void preloadTexturesWithCompletionHandler(NSArray<? extends SKTexture> textures,
            @ObjCBlock(name = "call_preloadTexturesWithCompletionHandler") Block_preloadTexturesWithCompletionHandler completionHandler);

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    /**
     * Create a texture containing colored noise. The noise texture is tileable with itself.
     *
     * @param size       the size of the resulting texture.
     * @param smoothness how similar neighboring pixels are. A value of zero is like static, one is smooth.
     * @param grayscale  if YES, RGB and A will all be the same. If no, RGB and A will all be different. A is not pre-multiplied, because the intent is that if you read a texel in a shader, all four values will be exactly the same value if grayscale, or four different, uncorrelated values if not grayscale.
     */
    @Generated
    @Selector("textureNoiseWithSmoothness:size:grayscale:")
    public static native SKTexture textureNoiseWithSmoothnessSizeGrayscale(@NFloat double smoothness,
            @ByValue CGSize size, boolean grayscale);

    /**
     * Create a texture containing directional noise. The RGBA values in this
     * texture can be used as a normal map or as direction possibly with length. XYZ are a three dimensional direction, and A is a magnitude.
     *
     * @param size       the size of the resulting texture.
     * @param smoothness how similar neighboring pixels are. A value of zero is like static, one is smooth.
     */
    @Generated
    @Selector("textureVectorNoiseWithSmoothness:size:")
    public static native SKTexture textureVectorNoiseWithSmoothnessSize(@NFloat double smoothness,
            @ByValue CGSize size);

    /**
     * Create a texture from a CGImageRef.
     *
     * @param image the CGImageRef to create the texture from
     */
    @Generated
    @Selector("textureWithCGImage:")
    public static native SKTexture textureWithCGImage(CGImageRef image);

    /**
     * Create new texture with bitmap RGBA data in unsigned bytes. Data is copied once, additional changes to the data does not affect the texture. All pixel data is assumed to be premultiplied alpha.
     *
     * @param pixelData the pixelData to read in creating the texture.
     * @param size      the dimensions of the pixelData given.
     */
    @Generated
    @Selector("textureWithData:size:")
    public static native SKTexture textureWithDataSize(NSData pixelData, @ByValue CGSize size);

    @Generated
    @Selector("textureWithData:size:flipped:")
    public static native SKTexture textureWithDataSizeFlipped(NSData pixelData, @ByValue CGSize size, boolean flipped);

    /**
     * Create new texture with bitmap RGBA data in unsigned bytes using a custom row length and row alignment. Data is copied once, additional changes to the data does not affect the texture. All pixel data is assumed to be premultiplied alpha.
     *
     * @param pixelData the data to use
     * @param size      the size in texels
     * @param rowLength the length of each row in pixels (allows byte row pitches greater than the width for aligned data)
     * @param alignment the byte alignment of the data, provide 0 for tightly packed data.
     */
    @Generated
    @Selector("textureWithData:size:rowLength:alignment:")
    public static native SKTexture textureWithDataSizeRowLengthAlignment(NSData pixelData, @ByValue CGSize size,
            int rowLength, int alignment);

    @Generated
    @Selector("textureWithImage:")
    public static native SKTexture textureWithImage(UIImage image);

    /**
     * Create a texture from an image file. Behaves similar to imageNamed: in UIImage or NSImage
     *
     * @param name the name or path of the image to load.
     */
    @Generated
    @Selector("textureWithImageNamed:")
    public static native SKTexture textureWithImageNamed(String name);

    /**
     * Create a texture from a GKNoiseMap.
     *
     * @param noiseMap the GKNoiseMap from which to create the texture.
     */
    @Generated
    @Selector("textureWithNoiseMap:")
    public static native SKTexture textureWithNoiseMap(GKNoiseMap noiseMap);

    /**
     * Create a texture that is a subrect of an existing texture. See textureRect property for details.
     *
     * @param rect    the source rectangle to use in creating a logical copy of the given texture.
     * @param texture the existing texture to reference in the copy.
     */
    @Generated
    @Selector("textureWithRect:inTexture:")
    public static native SKTexture textureWithRectInTexture(@ByValue CGRect rect, SKTexture texture);

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * Convert the current SKTexture into a CGImageRef object
     */
    @Generated
    @Selector("CGImage")
    public native CGImageRef CGImage();

    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(VoidPtr zone);

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(NSCoder coder);

    /**
     * The filtering mode the texture should use when not drawn at native size. Defaults to SKTextureFilteringLinear.
     */
    @Generated
    @Selector("filteringMode")
    @NInt
    public native long filteringMode();

    @Generated
    @Selector("init")
    public native SKTexture init();

    @Generated
    @Selector("initWithCoder:")
    public native SKTexture initWithCoder(NSCoder coder);

    /**
     * Request that this texture be loaded into vram on the next render update, with a callback handler.
     */
    @Generated
    @Selector("preloadWithCompletionHandler:")
    public native void preloadWithCompletionHandler(
            @ObjCBlock(name = "call_preloadWithCompletionHandler") Block_preloadWithCompletionHandler completionHandler);

    /**
     * The filtering mode the texture should use when not drawn at native size. Defaults to SKTextureFilteringLinear.
     */
    @Generated
    @Selector("setFilteringMode:")
    public native void setFilteringMode(@NInt long value);

    /**
     * Request that the texture have mipmaps generated if possible. Only supported for power of 2 texture sizes.
     */
    @Generated
    @Selector("setUsesMipmaps:")
    public native void setUsesMipmaps(boolean value);

    /**
     * The size of the texture's bitmap data in points.
     */
    @Generated
    @Selector("size")
    @ByValue
    public native CGSize size();

    /**
     * Create new texture by applying a CIFilter to an existing one. Any CIFilter that requires only a single "inputImage" and produces an "outputImage" is allowed.
     *
     * @param filter the CI filter to apply in the copy.
     */
    @Generated
    @Selector("textureByApplyingCIFilter:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object textureByApplyingCIFilter(CIFilter filter);

    /**
     * Create new texture by generating a normal map texture.
     */
    @Generated
    @Selector("textureByGeneratingNormalMap")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object textureByGeneratingNormalMap();

    /**
     * Create new texture by generating a normal map texture.
     *
     * @param smoothness the smooth level of the generated normal map.
     * @param contrast   the scale applied to the generated normal map.
     */
    @Generated
    @Selector("textureByGeneratingNormalMapWithSmoothness:contrast:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object textureByGeneratingNormalMapWithSmoothnessContrast(@NFloat double smoothness,
            @NFloat double contrast);

    /**
     * Used to choose the area of the texture you want to display. The origin and size should both be in the range 0.0 - 1.0, values outside of this range produces unpredictable results. Defaults to the entire texture {(0,0) (1,1)}.
     */
    @Generated
    @Selector("textureRect")
    @ByValue
    public native CGRect textureRect();

    /**
     * Request that the texture have mipmaps generated if possible. Only supported for power of 2 texture sizes.
     */
    @Generated
    @Selector("usesMipmaps")
    public native boolean usesMipmaps();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_preloadTexturesWithCompletionHandler {
        @Generated
        void call_preloadTexturesWithCompletionHandler();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_preloadWithCompletionHandler {
        @Generated
        void call_preloadWithCompletionHandler();
    }

    @Generated
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }
}

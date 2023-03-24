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

package apple.modelio;

import apple.NSObject;
import apple.corefoundation.opaque.CFStringRef;
import apple.coregraphics.opaque.CGImageRef;
import apple.foundation.NSArray;
import apple.foundation.NSBundle;
import apple.foundation.NSData;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.NSURL;
import apple.modelio.protocol.MDLAssetResolver;
import apple.modelio.protocol.MDLNamed;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * MDLTexture
 * [@summary] a description of texels provided by a texture object.
 * 
 * A texture optionally generates or loads texels
 * through an access to the data property, or one of the other
 * properties, otherwise the texture object is a lightweight descriptor
 * only.
 * 
 * [@property] data
 * Texel data that will exist when referenced; it may or may not exist
 * before
 * [@property] dimensions
 * texel width and height of the texture
 * [@property] rowStride
 * The number of bytes from the first texel in a row to the first texel
 * in the next row. A rowStride of zero indicates that interleaved x,y
 * addressing of texels is not possible. This might be the case if the
 * texture was compressed in some manner, for example.
 * [@property] channelCount
 * The number of channels incoded in a single texel. For example, an RGB
 * texture has 3 channels. All channels must have the same encoding.
 * [@property] channelEncoding
 * The encoding of a channel in a single texel.
 * [@property] isCube
 * The texture encodes a cube map. If YES, then the layout of the cube
 * map is deduced as a vertical strip if dimension.y is six times
 * dimension.x. Other layouts are possible in the future.
 * 
 * API-Since: 9.0
 */
@Generated
@Library("ModelIO")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MDLTexture extends NSObject implements MDLNamed {
    static {
        NatJ.register();
    }

    @Generated
    protected MDLTexture(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MDLTexture alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native MDLTexture allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(
            @NotNull @Mapped(ObjCObjectMapper.class) Object aTarget);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
    public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
            @NotNull @Mapped(ObjCObjectMapper.class) Object aTarget, @NotNull SEL aSelector,
            @Nullable @Mapped(ObjCObjectMapper.class) Object anArgument);

    @NotNull
    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @NotNull
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

    @NotNull
    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    @Generated
    @Owned
    @Selector("new")
    public static native MDLTexture new_objc();

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
     * Creates a cube texture map image using 6 faces of the same dimensions,
     * ordered +X,-X,+Y,-Y,+Z,-Z If the data is read back the image will be compacted
     * into a single vertical stack where dimensions.y = 6 * dimensions.x
     * isCube will return YES
     * 
     * @param names a collection of mosaiced images in a cross formation or column or row.
     *              - If 6 individual images are given they are assumed to be in order and will be
     *              loaded as is.
     *              - if 3 images of double height or width are given they will be treated as
     *              pairs of + and - in each axis, the order is must be x, then y, then z.
     *              - if 2 images of triple height or width are given they will be treates as a
     *              positive set and a negative set in the order +x, +y, +z, then -x, -y, -z.
     *              - if a single image is given it will be used without conversion if in column
     *              orientation and demosaiced in all other instances.
     */
    @Generated
    @Selector("textureCubeWithImagesNamed:")
    public static native MDLTexture textureCubeWithImagesNamed(@NotNull NSArray<String> names);

    @Generated
    @Selector("textureCubeWithImagesNamed:bundle:")
    public static native MDLTexture textureCubeWithImagesNamedBundle(@NotNull NSArray<String> names,
            @Nullable NSBundle bundleOrNil);

    /**
     * Creates a texture from a source in the main bundle named in a manner matching
     * name.
     */
    @Generated
    @Selector("textureNamed:")
    public static native MDLTexture textureNamed(@NotNull String name);

    @Generated
    @Selector("textureNamed:bundle:")
    public static native MDLTexture textureNamedBundle(@NotNull String name, @Nullable NSBundle bundleOrNil);

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @Generated
    @Selector("channelCount")
    @NUInt
    public native long channelCount();

    @Generated
    @Selector("channelEncoding")
    @NInt
    public native long channelEncoding();

    /**
     * hasAlphaValues
     * [@summary]
     * Can be overridden. If not overridden, hasAlpha will be NO if the texture does not
     * have an alpha channel. It wil be YES if the texture has an alpha channel and
     * there is at least one non-opaque texel in it.
     */
    @Generated
    @Selector("hasAlphaValues")
    public native boolean hasAlphaValues();

    @Nullable
    @Generated
    @Selector("imageFromTexture")
    public native CGImageRef imageFromTexture();

    @Generated
    @Selector("init")
    public native MDLTexture init();

    @Generated
    @Selector("isCube")
    public native boolean isCube();

    @Generated
    @Selector("mipLevelCount")
    @NUInt
    public native long mipLevelCount();

    @NotNull
    @Generated
    @Selector("name")
    public native String name();

    @Generated
    @Selector("rowStride")
    @NInt
    public native long rowStride();

    /**
     * hasAlphaValues
     * [@summary]
     * Can be overridden. If not overridden, hasAlpha will be NO if the texture does not
     * have an alpha channel. It wil be YES if the texture has an alpha channel and
     * there is at least one non-opaque texel in it.
     */
    @Generated
    @Selector("setHasAlphaValues:")
    public native void setHasAlphaValues(boolean value);

    @Generated
    @Selector("setIsCube:")
    public native void setIsCube(boolean value);

    @Generated
    @Selector("setName:")
    public native void setName(@NotNull String value);

    @Nullable
    @Generated
    @Selector("texelDataWithBottomLeftOrigin")
    public native NSData texelDataWithBottomLeftOrigin();

    @Nullable
    @Generated
    @Selector("texelDataWithBottomLeftOriginAtMipLevel:create:")
    public native NSData texelDataWithBottomLeftOriginAtMipLevelCreate(@NInt long level, boolean create);

    @Nullable
    @Generated
    @Selector("texelDataWithTopLeftOrigin")
    public native NSData texelDataWithTopLeftOrigin();

    @Nullable
    @Generated
    @Selector("texelDataWithTopLeftOriginAtMipLevel:create:")
    public native NSData texelDataWithTopLeftOriginAtMipLevelCreate(@NInt long level, boolean create);

    /**
     * write a texture to URL, deducing type from path extension
     */
    @Generated
    @Selector("writeToURL:")
    public native boolean writeToURL(@NotNull NSURL URL);

    /**
     * write a texture to URL, using a specific UT type
     */
    @Generated
    @Selector("writeToURL:type:")
    public native boolean writeToURLType(@NotNull NSURL nsurl, @NotNull CFStringRef type);

    /**
     * API-Since: 11.0
     */
    @Nullable
    @Generated
    @Selector("imageFromTextureAtLevel:")
    public native CGImageRef imageFromTextureAtLevel(@NUInt long level);

    /**
     * write a particular level of a mipped texture to URL, deducing type from path extension
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("writeToURL:level:")
    public native boolean writeToURLLevel(@NotNull NSURL URL, @NUInt long level);

    /**
     * write a particular level of a mipped texture to URL, using a specific UT type
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("writeToURL:type:level:")
    public native boolean writeToURLTypeLevel(@NotNull NSURL nsurl, @NotNull CFStringRef type, @NUInt long level);

    /**
     * API-Since: 12.0
     */
    @Generated
    @Selector("textureNamed:assetResolver:")
    public static native MDLTexture textureNamedAssetResolver(@NotNull String name,
            @NotNull @Mapped(ObjCObjectMapper.class) MDLAssetResolver resolver);
}

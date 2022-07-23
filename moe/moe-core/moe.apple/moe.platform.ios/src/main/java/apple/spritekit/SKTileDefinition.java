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
import apple.coregraphics.struct.CGSize;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSMutableDictionary;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSCopying;
import apple.foundation.protocol.NSSecureCoding;
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
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * A tile definition contains the information needed to represent a single type of tile within a tile map.
 */
@Generated
@Library("SpriteKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class SKTileDefinition extends NSObject implements NSCopying, NSSecureCoding {
    static {
        NatJ.register();
    }

    @Generated
    protected SKTileDefinition(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native SKTileDefinition alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native SKTileDefinition allocWithZone(VoidPtr zone);

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
    public static native SKTileDefinition new_objc();

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
     * Create a tile definition with an SKTexture, and set its size to the SKTexture's width/height.
     *
     * @param texture the texture to reference for size and content
     */
    @Generated
    @Selector("tileDefinitionWithTexture:")
    public static native SKTileDefinition tileDefinitionWithTexture(SKTexture texture);

    /**
     * Create a tile definition with an SKTexture and the specified size.
     *
     * @param texture       the texture to reference for content
     * @param normalTexture the normal texture to use for generating normals for lighting
     * @param size          the size of the tile in points
     */
    @Generated
    @Selector("tileDefinitionWithTexture:normalTexture:size:")
    public static native SKTileDefinition tileDefinitionWithTextureNormalTextureSize(SKTexture texture,
            SKTexture normalTexture, @ByValue CGSize size);

    /**
     * Create a tile definition with an SKTexture and the specified size.
     *
     * @param texture the texture to reference for content
     * @param size    the size of the tile in points
     */
    @Generated
    @Selector("tileDefinitionWithTexture:size:")
    public static native SKTileDefinition tileDefinitionWithTextureSize(SKTexture texture, @ByValue CGSize size);

    /**
     * Create an animated tile definition with an array of SKTextures, the specified size, and the length of time each
     * texture should be displayed for in the animation.
     *
     * @param textures       the textures to reference for animated content
     * @param normalTextures the normal textures to use for generating normals for lighting
     * @param size           the size of the tile in points
     * @param timePerFrame   the duration, in seconds, that each texture in the textures array is displayed before
     *                       switching to the next texture in the sequence
     */
    @Generated
    @Selector("tileDefinitionWithTextures:normalTextures:size:timePerFrame:")
    public static native SKTileDefinition tileDefinitionWithTexturesNormalTexturesSizeTimePerFrame(
            NSArray<? extends SKTexture> textures, NSArray<? extends SKTexture> normalTextures, @ByValue CGSize size,
            @NFloat double timePerFrame);

    /**
     * Create an animated tile definition with an array of SKTextures, the specified size, and the length of time each
     * texture should be displayed for in the animation.
     *
     * @param textures     the textures to reference for animated content
     * @param size         the size of the tile in points
     * @param timePerFrame the duration, in seconds, that each texture in the textures array is displayed before
     *                     switching to the next texture in the sequence
     */
    @Generated
    @Selector("tileDefinitionWithTextures:size:timePerFrame:")
    public static native SKTileDefinition tileDefinitionWithTexturesSizeTimePerFrame(
            NSArray<? extends SKTexture> textures, @ByValue CGSize size, @NFloat double timePerFrame);

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(VoidPtr zone);

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(NSCoder coder);

    /**
     * When set to YES, the tile definition's images will be flipped horizontally (i.e., the left of the image becomes
     * the right). Defaults to NO.
     */
    @Generated
    @Selector("flipHorizontally")
    public native boolean flipHorizontally();

    /**
     * When set to YES, the tile definition's images will be flipped vertically (i.e., the top of the image becomes the
     * bottom). Defaults to NO.
     */
    @Generated
    @Selector("flipVertically")
    public native boolean flipVertically();

    @Generated
    @Selector("init")
    public native SKTileDefinition init();

    @Generated
    @Selector("initWithCoder:")
    public native SKTileDefinition initWithCoder(NSCoder coder);

    /**
     * Initilize a tile definition with an SKTexture, and set its size to the SKTexture's width/height.
     *
     * @param texture the texture to reference for size and content
     */
    @Generated
    @Selector("initWithTexture:")
    public native SKTileDefinition initWithTexture(SKTexture texture);

    /**
     * Initilize a tile definition with an SKTexture and the specified size.
     *
     * @param texture       the texture to reference for content
     * @param normalTexture the normal texture to use for generating normals for lighting
     * @param size          the size of the tile in points
     */
    @Generated
    @Selector("initWithTexture:normalTexture:size:")
    public native SKTileDefinition initWithTextureNormalTextureSize(SKTexture texture, SKTexture normalTexture,
            @ByValue CGSize size);

    /**
     * Initilize a tile definition with an SKTexture and the specified size.
     *
     * @param texture the texture to reference for content
     * @param size    the size of the tile in points
     */
    @Generated
    @Selector("initWithTexture:size:")
    public native SKTileDefinition initWithTextureSize(SKTexture texture, @ByValue CGSize size);

    /**
     * Initilize an animated tile definition with an array of SKTextures, the specified size, and the length of time
     * each texture should be displayed for in the animation.
     *
     * @param textures       the textures to reference for animated content
     * @param normalTextures the normal textures to use for generating normals for lighting
     * @param size           the size of the tile in points
     * @param timePerFrame   the duration, in seconds, that each texture in the textures array is displayed before
     *                       switching to the next texture in the sequence
     */
    @Generated
    @Selector("initWithTextures:normalTextures:size:timePerFrame:")
    public native SKTileDefinition initWithTexturesNormalTexturesSizeTimePerFrame(NSArray<? extends SKTexture> textures,
            NSArray<? extends SKTexture> normalTextures, @ByValue CGSize size, @NFloat double timePerFrame);

    /**
     * Initilize an animated tile definition with an array of SKTextures, the specified size, and the length of time
     * each texture should be displayed for in the animation.
     *
     * @param textures     the textures to reference for animated content
     * @param size         the size of the tile in points
     * @param timePerFrame the duration, in seconds, that each texture in the textures array is displayed before
     *                     switching to the next texture in the sequence
     */
    @Generated
    @Selector("initWithTextures:size:timePerFrame:")
    public native SKTileDefinition initWithTexturesSizeTimePerFrame(NSArray<? extends SKTexture> textures,
            @ByValue CGSize size, @NFloat double timePerFrame);

    /**
     * Client-assignable name for the tile definition. Defaults to nil.
     */
    @Generated
    @Selector("name")
    public native String name();

    /**
     * The textures to use for generating normals that lights use to light this tile. These will only be used if the
     * tile is lit by at least one light. Each normal texture corresponds to a texture in the textures property.
     */
    @Generated
    @Selector("normalTextures")
    public native NSArray<? extends SKTexture> normalTextures();

    /**
     * This value is used to determine how likely this tile definition is to be chosen for placement when a
     * SKTileGroupRule has mulitple tile definitions assigned to it. A higher value relative to the other definitions
     * assigned to the rule make it more likely for this definition to be selected; lower values make it less likely.
     * Defaults to 1. When set to 0, the definition will never be chosen as long as there is at least one other
     * definition with a placementWeight above 0.
     */
    @Generated
    @Selector("placementWeight")
    @NUInt
    public native long placementWeight();

    /**
     * The rotation of the tile definition's images can be set in 90 degree increments. Defaults to
     * SKTileDefinitionRotation0.
     */
    @Generated
    @Selector("rotation")
    @NUInt
    public native long rotation();

    /**
     * When set to YES, the tile definition's images will be flipped horizontally (i.e., the left of the image becomes
     * the right). Defaults to NO.
     */
    @Generated
    @Selector("setFlipHorizontally:")
    public native void setFlipHorizontally(boolean value);

    /**
     * When set to YES, the tile definition's images will be flipped vertically (i.e., the top of the image becomes the
     * bottom). Defaults to NO.
     */
    @Generated
    @Selector("setFlipVertically:")
    public native void setFlipVertically(boolean value);

    /**
     * Client-assignable name for the tile definition. Defaults to nil.
     */
    @Generated
    @Selector("setName:")
    public native void setName(String value);

    /**
     * The textures to use for generating normals that lights use to light this tile. These will only be used if the
     * tile is lit by at least one light. Each normal texture corresponds to a texture in the textures property.
     */
    @Generated
    @Selector("setNormalTextures:")
    public native void setNormalTextures(NSArray<? extends SKTexture> value);

    /**
     * This value is used to determine how likely this tile definition is to be chosen for placement when a
     * SKTileGroupRule has mulitple tile definitions assigned to it. A higher value relative to the other definitions
     * assigned to the rule make it more likely for this definition to be selected; lower values make it less likely.
     * Defaults to 1. When set to 0, the definition will never be chosen as long as there is at least one other
     * definition with a placementWeight above 0.
     */
    @Generated
    @Selector("setPlacementWeight:")
    public native void setPlacementWeight(@NUInt long value);

    /**
     * The rotation of the tile definition's images can be set in 90 degree increments. Defaults to
     * SKTileDefinitionRotation0.
     */
    @Generated
    @Selector("setRotation:")
    public native void setRotation(@NUInt long value);

    /**
     * The size of the tile in points.
     */
    @Generated
    @Selector("setSize:")
    public native void setSize(@ByValue CGSize value);

    /**
     * The textures used to draw the tile. Non-animated tiles use only one texture. When more than one texture is
     * present, the tile will swap through them in sequence, showing each for the duration specified in the timePerFrame
     * property. After displaying the last texture in the array, the sequence is repeated from the first texture.
     */
    @Generated
    @Selector("setTextures:")
    public native void setTextures(NSArray<? extends SKTexture> value);

    /**
     * The duration, in seconds, that each texture in the textures array is displayed before switching to the next
     * texture in the sequence. Only used when there is more than one texture available.
     */
    @Generated
    @Selector("setTimePerFrame:")
    public native void setTimePerFrame(@NFloat double value);

    /**
     * An optional dictionary that can be used to store your own data for each tile definition. Defaults to nil.
     */
    @Generated
    @Selector("setUserData:")
    public native void setUserData(NSMutableDictionary<?, ?> value);

    /**
     * The size of the tile in points.
     */
    @Generated
    @Selector("size")
    @ByValue
    public native CGSize size();

    /**
     * The textures used to draw the tile. Non-animated tiles use only one texture. When more than one texture is
     * present, the tile will swap through them in sequence, showing each for the duration specified in the timePerFrame
     * property. After displaying the last texture in the array, the sequence is repeated from the first texture.
     */
    @Generated
    @Selector("textures")
    public native NSArray<? extends SKTexture> textures();

    /**
     * The duration, in seconds, that each texture in the textures array is displayed before switching to the next
     * texture in the sequence. Only used when there is more than one texture available.
     */
    @Generated
    @Selector("timePerFrame")
    @NFloat
    public native double timePerFrame();

    /**
     * An optional dictionary that can be used to store your own data for each tile definition. Defaults to nil.
     */
    @Generated
    @Selector("userData")
    public native NSMutableDictionary<?, ?> userData();

    @Generated
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }
}

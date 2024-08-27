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
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSDictionary;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.gameplaykit.GKPolygonObstacle;
import apple.spritekit.protocol.SKWarpable;
import apple.uikit.UIColor;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.NFloat;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.ReferenceInfo;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import apple.corefoundation.struct.CGPoint;
import apple.corefoundation.struct.CGRect;
import apple.corefoundation.struct.CGSize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * A Sprite is a textured 2D node. It can be placed, rotated, scaled and animated like any other node except it draws a
 * textured rectangle specified by the bounds and anchor point.
 * 
 * Sprites are used to define quad primitives with color and/or textures applied to them.
 * See <a href="http://en.wikipedia.org/wiki/Sprite_(computer_graphics)">wiki</a> for a definition of a Sprite.
 */
@Generated
@Library("SpriteKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class SKSpriteNode extends SKNode implements SKWarpable {
    static {
        NatJ.register();
    }

    @Generated
    protected SKSpriteNode(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native SKSpriteNode alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native SKSpriteNode allocWithZone(VoidPtr zone);

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
    @Selector("clearTextInputContextIdentifier:")
    public static native void clearTextInputContextIdentifier(@NotNull String identifier);

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
    public static native SKSpriteNode new_objc();

    @Generated
    @Selector("node")
    public static native SKSpriteNode node();

    @Generated
    @Selector("nodeWithFileNamed:")
    public static native SKSpriteNode nodeWithFileNamed(@NotNull String filename);

    @NotNull
    @Generated
    @Selector("obstaclesFromNodeBounds:")
    public static native NSArray<? extends GKPolygonObstacle> obstaclesFromNodeBounds(
            @NotNull NSArray<? extends SKNode> nodes);

    @NotNull
    @Generated
    @Selector("obstaclesFromNodePhysicsBodies:")
    public static native NSArray<? extends GKPolygonObstacle> obstaclesFromNodePhysicsBodies(
            @NotNull NSArray<? extends SKNode> nodes);

    @NotNull
    @Generated
    @Selector("obstaclesFromSpriteTextures:accuracy:")
    public static native NSArray<? extends GKPolygonObstacle> obstaclesFromSpriteTexturesAccuracy(
            @NotNull NSArray<? extends SKNode> sprites, float accuracy);

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * Create a sprite with a color and the specified bounds.
     * 
     * @param color the color to use for tinting the sprite.
     * @param size  the size of the sprite in points
     */
    @Generated
    @Selector("spriteNodeWithColor:size:")
    public static native SKSpriteNode spriteNodeWithColorSize(@NotNull UIColor color, @ByValue CGSize size);

    /**
     * Create a sprite with an image from your app bundle (An SKTexture is created for the image and set on the sprite.
     * Its size is set to the SKTexture's pixel width/height)
     * The position of the sprite is (0, 0) and the texture anchored at (0.5, 0.5), so that it is offset by half the
     * width and half the height.
     * Thus the sprite has the texture centered about the position. If you wish to have the texture anchored at a
     * different offset set the anchorPoint to another pair of values in the interval from 0.0 up to and including 1.0.
     * 
     * @param name is the name of an image file stored in the app bundle.
     */
    @Generated
    @Selector("spriteNodeWithImageNamed:")
    public static native SKSpriteNode spriteNodeWithImageNamed(@NotNull String name);

    @Generated
    @Selector("spriteNodeWithImageNamed:normalMapped:")
    public static native SKSpriteNode spriteNodeWithImageNamedNormalMapped(@NotNull String name,
            boolean generateNormalMap);

    /**
     * Create a sprite with an SKTexture and set its size to the SKTexture's pixel width/height.
     * 
     * @param texture the texture to reference for size and content
     */
    @Generated
    @Selector("spriteNodeWithTexture:")
    public static native SKSpriteNode spriteNodeWithTexture(@Nullable SKTexture texture);

    @Generated
    @Selector("spriteNodeWithTexture:normalMap:")
    public static native SKSpriteNode spriteNodeWithTextureNormalMap(@Nullable SKTexture texture,
            @Nullable SKTexture normalMap);

    /**
     * Create a sprite with an SKTexture and the specified size.
     * 
     * @param texture the texture to reference for size and content
     * @param size    the size of the sprite in points
     */
    @Generated
    @Selector("spriteNodeWithTexture:size:")
    public static native SKSpriteNode spriteNodeWithTextureSize(@Nullable SKTexture texture, @ByValue CGSize size);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * Used to choose the location in the sprite that maps to its 'position' in the parent's coordinate space. The valid
     * interval for each input is from 0.0 up to and including 1.0.
     */
    @Generated
    @Selector("anchorPoint")
    @ByValue
    public native CGPoint anchorPoint();

    /**
     * Optional dictionary of SKAttributeValues
     * Attributes can be used with custom SKShaders.
     * 
     * API-Since: 10.0
     */
    @NotNull
    @Generated
    @Selector("attributeValues")
    public native NSDictionary<String, ? extends SKAttributeValue> attributeValues();

    /**
     * Sets the blend mode to use when composing the sprite with the final framebuffer.
     * 
     * @see SKNode.SKBlendMode
     */
    @Generated
    @Selector("blendMode")
    @NInt
    public native long blendMode();

    /**
     * Controls how the texture is stretched to fill the SKSpriteNode. Stretching is performed via a 9-part algorithm
     * where the upper & lower middle parts are scaled horizontally, the left and right middle parts are scaled
     * vertically, the center is scaled in both directions, and the corners are preserved. The centerRect defines the
     * center region in a (0.0 - 1.0) coordinate space. Defaults to {(0,0) (1,1)} (the entire texture is stretched).
     */
    @Generated
    @Selector("centerRect")
    @ByValue
    public native CGRect centerRect();

    /**
     * Base color for the sprite (If no texture is present, the color still is drawn)
     */
    @NotNull
    @Generated
    @Selector("color")
    public native UIColor color();

    /**
     * Controls the blending between the texture and the sprite's color. The valid interval of values is from 0.0 up to
     * and including 1.0. A value above or below that interval is clamped to the minimum (0.0) if below or the maximum
     * (1.0) if above.
     */
    @Generated
    @Selector("colorBlendFactor")
    @NFloat
    public native double colorBlendFactor();

    @Generated
    @Selector("init")
    public native SKSpriteNode init();

    /**
     * Support coding and decoding via NSKeyedArchiver.
     */
    @Generated
    @Selector("initWithCoder:")
    public native SKSpriteNode initWithCoder(@NotNull NSCoder aDecoder);

    /**
     * Initialize a sprite with a color and the specified bounds.
     * 
     * @param color the color to use for tinting the sprite.
     * @param size  the size of the sprite in points
     */
    @Generated
    @Selector("initWithColor:size:")
    public native SKSpriteNode initWithColorSize(@NotNull UIColor color, @ByValue CGSize size);

    /**
     * Initialize a sprite with an image from your app bundle (An SKTexture is created for the image and set on the
     * sprite. Its size is set to the SKTexture's pixel width/height)
     * The position of the sprite is (0, 0) and the texture anchored at (0.5, 0.5), so that it is offset by half the
     * width and half the height.
     * Thus the sprite has the texture centered about the position. If you wish to have the texture anchored at a
     * different offset set the anchorPoint to another pair of values in the interval from 0.0 up to and including 1.0.
     * 
     * @param name the name or path of the image to load.
     */
    @Generated
    @Selector("initWithImageNamed:")
    public native SKSpriteNode initWithImageNamed(@NotNull String name);

    /**
     * Initialize a sprite with an SKTexture and set its size to the SKTexture's width/height.
     * 
     * @param texture the texture to reference for size and content
     */
    @Generated
    @Selector("initWithTexture:")
    public native SKSpriteNode initWithTexture(@Nullable SKTexture texture);

    /**
     * Designated Initializer
     * Initialize a sprite with a color and the specified bounds.
     * 
     * @param texture the texture to use (can be nil for colored sprite)
     * @param color   the color to use for tinting the sprite.
     * @param size    the size of the sprite in points
     */
    @Generated
    @Selector("initWithTexture:color:size:")
    public native SKSpriteNode initWithTextureColorSize(@Nullable SKTexture texture, @NotNull UIColor color,
            @ByValue CGSize size);

    /**
     * Bitmask to indicate being lit by a set of lights using overlapping lighting categories.
     * 
     * A light whose category is set to a value that masks to non-zero using this mask will
     * apply light to this sprite.
     * 
     * When used together with a normal texture, complex lighting effects can be used.
     * 
     * API-Since: 8.0
     */
    @Generated
    @Selector("lightingBitMask")
    public native int lightingBitMask();

    /**
     * Texture to use for generating normals that lights use to light this sprite.
     * 
     * This will only be used if the sprite is lit by at least one light.
     * 
     * @see SKLightNode
     * @see lightingBitMask
     * 
     *      API-Since: 8.0
     */
    @Nullable
    @Generated
    @Selector("normalTexture")
    public native SKTexture normalTexture();

    /**
     * Adjust the sprite's xScale & yScale to achieve the desired size (in parent's coordinate space)
     * 
     * API-Since: 10.0
     */
    @Generated
    @Selector("scaleToSize:")
    public native void scaleToSize(@ByValue CGSize size);

    /**
     * Used to choose the location in the sprite that maps to its 'position' in the parent's coordinate space. The valid
     * interval for each input is from 0.0 up to and including 1.0.
     */
    @Generated
    @Selector("setAnchorPoint:")
    public native void setAnchorPoint(@ByValue CGPoint value);

    /**
     * Optional dictionary of SKAttributeValues
     * Attributes can be used with custom SKShaders.
     * 
     * API-Since: 10.0
     */
    @Generated
    @Selector("setAttributeValues:")
    public native void setAttributeValues(@NotNull NSDictionary<String, ? extends SKAttributeValue> value);

    /**
     * Sets the blend mode to use when composing the sprite with the final framebuffer.
     * 
     * @see SKNode.SKBlendMode
     */
    @Generated
    @Selector("setBlendMode:")
    public native void setBlendMode(@NInt long value);

    /**
     * Controls how the texture is stretched to fill the SKSpriteNode. Stretching is performed via a 9-part algorithm
     * where the upper & lower middle parts are scaled horizontally, the left and right middle parts are scaled
     * vertically, the center is scaled in both directions, and the corners are preserved. The centerRect defines the
     * center region in a (0.0 - 1.0) coordinate space. Defaults to {(0,0) (1,1)} (the entire texture is stretched).
     */
    @Generated
    @Selector("setCenterRect:")
    public native void setCenterRect(@ByValue CGRect value);

    /**
     * Base color for the sprite (If no texture is present, the color still is drawn)
     */
    @Generated
    @Selector("setColor:")
    public native void setColor(@NotNull UIColor value);

    /**
     * Controls the blending between the texture and the sprite's color. The valid interval of values is from 0.0 up to
     * and including 1.0. A value above or below that interval is clamped to the minimum (0.0) if below or the maximum
     * (1.0) if above.
     */
    @Generated
    @Selector("setColorBlendFactor:")
    public native void setColorBlendFactor(@NFloat double value);

    /**
     * Bitmask to indicate being lit by a set of lights using overlapping lighting categories.
     * 
     * A light whose category is set to a value that masks to non-zero using this mask will
     * apply light to this sprite.
     * 
     * When used together with a normal texture, complex lighting effects can be used.
     * 
     * API-Since: 8.0
     */
    @Generated
    @Selector("setLightingBitMask:")
    public native void setLightingBitMask(int value);

    /**
     * Texture to use for generating normals that lights use to light this sprite.
     * 
     * This will only be used if the sprite is lit by at least one light.
     * 
     * @see SKLightNode
     * @see lightingBitMask
     * 
     *      API-Since: 8.0
     */
    @Generated
    @Selector("setNormalTexture:")
    public native void setNormalTexture(@Nullable SKTexture value);

    /**
     * API-Since: 8.0
     */
    @Generated
    @Selector("setShader:")
    public native void setShader(@Nullable SKShader value);

    /**
     * API-Since: 8.0
     */
    @Generated
    @Selector("setShadowCastBitMask:")
    public native void setShadowCastBitMask(int value);

    /**
     * API-Since: 8.0
     */
    @Generated
    @Selector("setShadowedBitMask:")
    public native void setShadowedBitMask(int value);

    /**
     * Set the size of the sprite (in parent's coordinate space)
     */
    @Generated
    @Selector("setSize:")
    public native void setSize(@ByValue CGSize value);

    @Generated
    @Selector("setSubdivisionLevels:")
    public native void setSubdivisionLevels(@NInt long value);

    /**
     * Texture to be drawn (is stretched to fill the sprite)
     */
    @Generated
    @Selector("setTexture:")
    public native void setTexture(@Nullable SKTexture value);

    /**
     * API-Since: 10.0
     */
    @Generated
    @Selector("setValue:forAttributeNamed:")
    public native void setValueForAttributeNamed(@NotNull SKAttributeValue value, @NotNull String key);

    @Generated
    @Selector("setWarpGeometry:")
    public native void setWarpGeometry(@Nullable SKWarpGeometry value);

    /**
     * API-Since: 8.0
     */
    @Nullable
    @Generated
    @Selector("shader")
    public native SKShader shader();

    /**
     * API-Since: 8.0
     */
    @Generated
    @Selector("shadowCastBitMask")
    public native int shadowCastBitMask();

    /**
     * API-Since: 8.0
     */
    @Generated
    @Selector("shadowedBitMask")
    public native int shadowedBitMask();

    /**
     * Set the size of the sprite (in parent's coordinate space)
     */
    @Generated
    @Selector("size")
    @ByValue
    public native CGSize size();

    @Generated
    @Selector("subdivisionLevels")
    @NInt
    public native long subdivisionLevels();

    /**
     * Texture to be drawn (is stretched to fill the sprite)
     */
    @Nullable
    @Generated
    @Selector("texture")
    public native SKTexture texture();

    /**
     * API-Since: 10.0
     */
    @Nullable
    @Generated
    @Selector("valueForAttributeNamed:")
    public native SKAttributeValue valueForAttributeNamed(@NotNull String key);

    @Nullable
    @Generated
    @Selector("warpGeometry")
    public native SKWarpGeometry warpGeometry();

    @Generated
    @Selector("nodeWithFileNamed:securelyWithClasses:andError:")
    public static native SKSpriteNode nodeWithFileNamedSecurelyWithClassesAndError(@NotNull String filename,
            @NotNull NSSet<? extends Class> classes, @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}

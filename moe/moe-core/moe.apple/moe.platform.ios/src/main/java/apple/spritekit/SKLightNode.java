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
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.gameplaykit.GKPolygonObstacle;
import apple.uikit.UIColor;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * API-Since: 8.0
 */
@Generated
@Library("SpriteKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class SKLightNode extends SKNode {
    static {
        NatJ.register();
    }

    @Generated
    protected SKLightNode(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native SKLightNode alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native SKLightNode allocWithZone(VoidPtr zone);

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
    public static native SKLightNode new_objc();

    @Generated
    @Selector("node")
    public static native SKLightNode node();

    @Generated
    @Selector("nodeWithFileNamed:")
    public static native SKLightNode nodeWithFileNamed(@NotNull String filename);

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

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * Ambient color of the light source, defaults to black.
     * 
     * If you had only a single light in the scene with an ambient color
     * of opaque white and a light color of black,
     * it would appear as if the scene was rendered without lighting.
     * 
     * The alpha component of the color is ignored. The color is not
     * affected by falloff or surface normals.
     * 
     * @see lightColor
     */
    @NotNull
    @Generated
    @Selector("ambientColor")
    public native UIColor ambientColor();

    /**
     * The category of the light, which determines the group(s) a light belongs to.
     * Any node that has its corresponding light and shadow bitmasks set to an overlapping value
     * will be lit, shadow casting or shadowed by this light.
     * 
     * @see SKSpriteNode.lightingBitMask
     * @see SKSpriteNode.shadowCastBitMask
     * @see SKSpriteNode.shadowedBitMask
     */
    @Generated
    @Selector("categoryBitMask")
    public native int categoryBitMask();

    /**
     * Falloff in intensity of the light over distance, defaults to 1.
     * The falloff does not affect the ambient color nor the shadow color.
     * 
     * @see lightColor
     */
    @Generated
    @Selector("falloff")
    @NFloat
    public native double falloff();

    @Generated
    @Selector("init")
    public native SKLightNode init();

    @Generated
    @Selector("initWithCoder:")
    public native SKLightNode initWithCoder(@NotNull NSCoder aDecoder);

    /**
     * Enables or disables lighting contribution from this light node.
     * 
     * Set to YES; sprites using this light will be lit with the ambient color and
     * the light color, with a falloff in intensity according to the falloff property.
     * 
     * Set to NO; this light does not contribute any lighting.
     * 
     * If no lights are active on a sprite it will be drawn normally, as if not lit.
     * 
     * The default value is YES.
     * 
     * @see lightColor
     * @see falloff
     * @see categoryBitMask
     */
    @Generated
    @Selector("isEnabled")
    public native boolean isEnabled();

    /**
     * Enables or disables lighting contribution from this light node.
     * 
     * Set to YES; sprites using this light will be lit with the ambient color and
     * the light color, with a falloff in intensity according to the falloff property.
     * 
     * Set to NO; this light does not contribute any lighting.
     * 
     * If no lights are active on a sprite it will be drawn normally, as if not lit.
     * 
     * The default value is YES.
     * 
     * @see lightColor
     * @see falloff
     * @see categoryBitMask
     */
    @Generated
    @Selector("setEnabled:")
    public native void setEnabled(boolean value);

    /**
     * Diffuse and Specular color of the light source, defaults to opaque white.
     * 
     * The alpha component of the color is ignored.
     * 
     * If using shaders bind a uniform to this property to use scene based custom lighting.
     * 
     * @see SKUniform
     * @see falloff
     */
    @NotNull
    @Generated
    @Selector("lightColor")
    public native UIColor lightColor();

    /**
     * Ambient color of the light source, defaults to black.
     * 
     * If you had only a single light in the scene with an ambient color
     * of opaque white and a light color of black,
     * it would appear as if the scene was rendered without lighting.
     * 
     * The alpha component of the color is ignored. The color is not
     * affected by falloff or surface normals.
     * 
     * @see lightColor
     */
    @Generated
    @Selector("setAmbientColor:")
    public native void setAmbientColor(@NotNull UIColor value);

    /**
     * The category of the light, which determines the group(s) a light belongs to.
     * Any node that has its corresponding light and shadow bitmasks set to an overlapping value
     * will be lit, shadow casting or shadowed by this light.
     * 
     * @see SKSpriteNode.lightingBitMask
     * @see SKSpriteNode.shadowCastBitMask
     * @see SKSpriteNode.shadowedBitMask
     */
    @Generated
    @Selector("setCategoryBitMask:")
    public native void setCategoryBitMask(int value);

    /**
     * Falloff in intensity of the light over distance, defaults to 1.
     * The falloff does not affect the ambient color nor the shadow color.
     * 
     * @see lightColor
     */
    @Generated
    @Selector("setFalloff:")
    public native void setFalloff(@NFloat double value);

    /**
     * Diffuse and Specular color of the light source, defaults to opaque white.
     * 
     * The alpha component of the color is ignored.
     * 
     * If using shaders bind a uniform to this property to use scene based custom lighting.
     * 
     * @see SKUniform
     * @see falloff
     */
    @Generated
    @Selector("setLightColor:")
    public native void setLightColor(@NotNull UIColor value);

    /**
     * Color of the shadow casted on occluded objects, defaults to half opacity black.
     * 
     * The alpha component of the color is used for blending with the regions that are in shadow.
     * 
     * @see SKSpriteNode.shadowCastBitMask
     * @see SKSpriteNode.shadowedBitMask
     */
    @Generated
    @Selector("setShadowColor:")
    public native void setShadowColor(@NotNull UIColor value);

    /**
     * Color of the shadow casted on occluded objects, defaults to half opacity black.
     * 
     * The alpha component of the color is used for blending with the regions that are in shadow.
     * 
     * @see SKSpriteNode.shadowCastBitMask
     * @see SKSpriteNode.shadowedBitMask
     */
    @NotNull
    @Generated
    @Selector("shadowColor")
    public native UIColor shadowColor();

    @Generated
    @Selector("nodeWithFileNamed:securelyWithClasses:andError:")
    public static native SKLightNode nodeWithFileNamedSecurelyWithClassesAndError(@NotNull String filename,
            @NotNull NSSet<? extends Class> classes, @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }
}

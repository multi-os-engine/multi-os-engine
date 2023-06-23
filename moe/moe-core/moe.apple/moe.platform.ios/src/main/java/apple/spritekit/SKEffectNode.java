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
import apple.coreimage.CIFilter;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSDictionary;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.gameplaykit.GKPolygonObstacle;
import apple.spritekit.protocol.SKWarpable;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
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
 * A SpriteKit node that applies frame buffer effects to the rendered results of its child nodes. This is done
 * continuously on live content and is not a simple snapshot of the rendered result at one instant of time.
 */
@Generated
@Library("SpriteKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class SKEffectNode extends SKNode implements SKWarpable {
    static {
        NatJ.register();
    }

    @Generated
    protected SKEffectNode(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native SKEffectNode alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native SKEffectNode allocWithZone(VoidPtr zone);

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
    public static native SKEffectNode new_objc();

    @Generated
    @Selector("node")
    public static native SKEffectNode node();

    @Generated
    @Selector("nodeWithFileNamed:")
    public static native SKEffectNode nodeWithFileNamed(@NotNull String filename);

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
     * Sets the blend mode to use when composing the effect with the final framebuffer.
     * 
     * @see SKNode.SKBlendMode
     */
    @Generated
    @Selector("blendMode")
    @NInt
    public native long blendMode();

    /**
     * A CIFilter to be used as an effect
     * 
     * Any CIFilter that requires only a single "inputImage" and produces an "outputImage" is allowed. The filter is
     * applied to all children of the SKEffectNode. If the filter is nil, the children of this node is flattened before
     * being drawn as long as the SKEffectNode is enabled.
     */
    @Nullable
    @Generated
    @Selector("filter")
    public native CIFilter filter();

    @Generated
    @Selector("init")
    public native SKEffectNode init();

    @Generated
    @Selector("initWithCoder:")
    public native SKEffectNode initWithCoder(@NotNull NSCoder aDecoder);

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
     * Sets the blend mode to use when composing the effect with the final framebuffer.
     * 
     * @see SKNode.SKBlendMode
     */
    @Generated
    @Selector("setBlendMode:")
    public native void setBlendMode(@NInt long value);

    /**
     * A CIFilter to be used as an effect
     * 
     * Any CIFilter that requires only a single "inputImage" and produces an "outputImage" is allowed. The filter is
     * applied to all children of the SKEffectNode. If the filter is nil, the children of this node is flattened before
     * being drawn as long as the SKEffectNode is enabled.
     */
    @Generated
    @Selector("setFilter:")
    public native void setFilter(@Nullable CIFilter value);

    @Generated
    @Selector("setShader:")
    public native void setShader(@Nullable SKShader value);

    /**
     * Controls whether the filter's "inputCenter" (if it exists) should automatically be set to the center of the
     * effect area. Defaults to YES.
     */
    @Generated
    @Selector("setShouldCenterFilter:")
    public native void setShouldCenterFilter(boolean value);

    /**
     * Enable the SKEffectNode.
     * 
     * The SKEffectNode has no effect when appliesEffects is not enabled, this is useful for setting up an effect to use
     * later on. Defaults to YES.
     */
    @Generated
    @Selector("setShouldEnableEffects:")
    public native void setShouldEnableEffects(boolean value);

    /**
     * Enable the rasterization on the SKEffectNode.
     * 
     * The SKEffectNode's output is rasterized and cached internally. This cache is reused when rendering. When the
     * SKEffectNode's children change, the cache is updated, but changing properties on the CIFilter does *not* cause an
     * update (you must disable rasterization and then re-enable it for the changes to apply). This is more expensive
     * than not rasterizing if the node's children change frequently, only enable this option if you know the children
     * is largely static.
     */
    @Generated
    @Selector("setShouldRasterize:")
    public native void setShouldRasterize(boolean value);

    @Generated
    @Selector("setSubdivisionLevels:")
    public native void setSubdivisionLevels(@NInt long value);

    /**
     * API-Since: 10.0
     */
    @Generated
    @Selector("setValue:forAttributeNamed:")
    public native void setValueForAttributeNamed(@NotNull SKAttributeValue value, @NotNull String key);

    @Generated
    @Selector("setWarpGeometry:")
    public native void setWarpGeometry(@Nullable SKWarpGeometry value);

    @Nullable
    @Generated
    @Selector("shader")
    public native SKShader shader();

    /**
     * Controls whether the filter's "inputCenter" (if it exists) should automatically be set to the center of the
     * effect area. Defaults to YES.
     */
    @Generated
    @Selector("shouldCenterFilter")
    public native boolean shouldCenterFilter();

    /**
     * Enable the SKEffectNode.
     * 
     * The SKEffectNode has no effect when appliesEffects is not enabled, this is useful for setting up an effect to use
     * later on. Defaults to YES.
     */
    @Generated
    @Selector("shouldEnableEffects")
    public native boolean shouldEnableEffects();

    /**
     * Enable the rasterization on the SKEffectNode.
     * 
     * The SKEffectNode's output is rasterized and cached internally. This cache is reused when rendering. When the
     * SKEffectNode's children change, the cache is updated, but changing properties on the CIFilter does *not* cause an
     * update (you must disable rasterization and then re-enable it for the changes to apply). This is more expensive
     * than not rasterizing if the node's children change frequently, only enable this option if you know the children
     * is largely static.
     */
    @Generated
    @Selector("shouldRasterize")
    public native boolean shouldRasterize();

    @Generated
    @Selector("subdivisionLevels")
    @NInt
    public native long subdivisionLevels();

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
    public static native SKEffectNode nodeWithFileNamedSecurelyWithClassesAndError(@NotNull String filename,
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

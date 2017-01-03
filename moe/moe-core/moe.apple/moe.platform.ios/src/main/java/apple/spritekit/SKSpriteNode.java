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
import apple.coregraphics.struct.CGPoint;
import apple.coregraphics.struct.CGRect;
import apple.coregraphics.struct.CGSize;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSDictionary;
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
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

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
    @Selector("clearTextInputContextIdentifier:")
    public static native void clearTextInputContextIdentifier(String identifier);

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
    @Selector("initialize")
    public static native void initialize();

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
    @Selector("load")
    public static native void load_objc_static();

    @Generated
    @Owned
    @Selector("new")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object new_objc();

    @Generated
    @Selector("node")
    public static native SKSpriteNode node();

    @Generated
    @Selector("nodeWithFileNamed:")
    public static native SKSpriteNode nodeWithFileNamed(String filename);

    @Generated
    @Selector("obstaclesFromNodeBounds:")
    public static native NSArray<? extends GKPolygonObstacle> obstaclesFromNodeBounds(NSArray<? extends SKNode> nodes);

    @Generated
    @Selector("obstaclesFromNodePhysicsBodies:")
    public static native NSArray<? extends GKPolygonObstacle> obstaclesFromNodePhysicsBodies(
            NSArray<? extends SKNode> nodes);

    @Generated
    @Selector("obstaclesFromSpriteTextures:accuracy:")
    public static native NSArray<? extends GKPolygonObstacle> obstaclesFromSpriteTexturesAccuracy(
            NSArray<? extends SKNode> sprites, float accuracy);

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
    @Selector("spriteNodeWithColor:size:")
    public static native SKSpriteNode spriteNodeWithColorSize(UIColor color, @ByValue CGSize size);

    @Generated
    @Selector("spriteNodeWithImageNamed:")
    public static native SKSpriteNode spriteNodeWithImageNamed(String name);

    @Generated
    @Selector("spriteNodeWithImageNamed:normalMapped:")
    public static native SKSpriteNode spriteNodeWithImageNamedNormalMapped(String name, boolean generateNormalMap);

    @Generated
    @Selector("spriteNodeWithTexture:")
    public static native SKSpriteNode spriteNodeWithTexture(SKTexture texture);

    @Generated
    @Selector("spriteNodeWithTexture:normalMap:")
    public static native SKSpriteNode spriteNodeWithTextureNormalMap(SKTexture texture, SKTexture normalMap);

    @Generated
    @Selector("spriteNodeWithTexture:size:")
    public static native SKSpriteNode spriteNodeWithTextureSize(SKTexture texture, @ByValue CGSize size);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @Generated
    @Selector("anchorPoint")
    @ByValue
    public native CGPoint anchorPoint();

    @Generated
    @Selector("attributeValues")
    public native NSDictionary<String, ? extends SKAttributeValue> attributeValues();

    @Generated
    @Selector("blendMode")
    @NInt
    public native long blendMode();

    @Generated
    @Selector("centerRect")
    @ByValue
    public native CGRect centerRect();

    @Generated
    @Selector("color")
    public native UIColor color();

    @Generated
    @Selector("colorBlendFactor")
    @NFloat
    public native double colorBlendFactor();

    @Generated
    @Selector("init")
    public native SKSpriteNode init();

    @Generated
    @Selector("initWithCoder:")
    public native SKSpriteNode initWithCoder(NSCoder aDecoder);

    @Generated
    @Selector("initWithColor:size:")
    public native SKSpriteNode initWithColorSize(UIColor color, @ByValue CGSize size);

    @Generated
    @Selector("initWithImageNamed:")
    public native SKSpriteNode initWithImageNamed(String name);

    @Generated
    @Selector("initWithTexture:")
    public native SKSpriteNode initWithTexture(SKTexture texture);

    @Generated
    @Selector("initWithTexture:color:size:")
    public native SKSpriteNode initWithTextureColorSize(SKTexture texture, UIColor color, @ByValue CGSize size);

    @Generated
    @Selector("lightingBitMask")
    public native int lightingBitMask();

    @Generated
    @Selector("normalTexture")
    public native SKTexture normalTexture();

    @Generated
    @Selector("scaleToSize:")
    public native void scaleToSize(@ByValue CGSize size);

    @Generated
    @Selector("setAnchorPoint:")
    public native void setAnchorPoint(@ByValue CGPoint value);

    @Generated
    @Selector("setAttributeValues:")
    public native void setAttributeValues(NSDictionary<String, ? extends SKAttributeValue> value);

    @Generated
    @Selector("setBlendMode:")
    public native void setBlendMode(@NInt long value);

    @Generated
    @Selector("setCenterRect:")
    public native void setCenterRect(@ByValue CGRect value);

    @Generated
    @Selector("setColor:")
    public native void setColor(UIColor value);

    @Generated
    @Selector("setColorBlendFactor:")
    public native void setColorBlendFactor(@NFloat double value);

    @Generated
    @Selector("setLightingBitMask:")
    public native void setLightingBitMask(int value);

    @Generated
    @Selector("setNormalTexture:")
    public native void setNormalTexture(SKTexture value);

    @Generated
    @Selector("setShader:")
    public native void setShader(SKShader value);

    @Generated
    @Selector("setShadowCastBitMask:")
    public native void setShadowCastBitMask(int value);

    @Generated
    @Selector("setShadowedBitMask:")
    public native void setShadowedBitMask(int value);

    @Generated
    @Selector("setSize:")
    public native void setSize(@ByValue CGSize value);

    @Generated
    @Selector("setSubdivisionLevels:")
    public native void setSubdivisionLevels(@NInt long value);

    @Generated
    @Selector("setTexture:")
    public native void setTexture(SKTexture value);

    @Generated
    @Selector("setValue:forAttributeNamed:")
    public native void setValueForAttributeNamed(SKAttributeValue value, String key);

    @Generated
    @Selector("setWarpGeometry:")
    public native void setWarpGeometry(SKWarpGeometry value);

    @Generated
    @Selector("shader")
    public native SKShader shader();

    @Generated
    @Selector("shadowCastBitMask")
    public native int shadowCastBitMask();

    @Generated
    @Selector("shadowedBitMask")
    public native int shadowedBitMask();

    @Generated
    @Selector("size")
    @ByValue
    public native CGSize size();

    @Generated
    @Selector("subdivisionLevels")
    @NInt
    public native long subdivisionLevels();

    @Generated
    @Selector("texture")
    public native SKTexture texture();

    @Generated
    @Selector("valueForAttributeNamed:")
    public native SKAttributeValue valueForAttributeNamed(String key);

    @Generated
    @Selector("warpGeometry")
    public native SKWarpGeometry warpGeometry();
}

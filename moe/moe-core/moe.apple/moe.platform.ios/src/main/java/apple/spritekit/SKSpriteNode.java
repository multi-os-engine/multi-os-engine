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
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.gameplaykit.GKPolygonObstacle;
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
public class SKSpriteNode extends SKNode {
    static {
        NatJ.register();
    }

    @Generated
    protected SKSpriteNode(Pointer peer) {
        super(peer);
    }

    @Generated
    @Owned
    @Selector("alloc")
    public static native SKSpriteNode alloc();

    @Generated
    @Selector("node")
    public static native SKSpriteNode node();

    @Generated
    @Selector("nodeWithFileNamed:")
    public static native SKSpriteNode nodeWithFileNamed(String filename);

    /**
     * spriteNodeWithColor:size:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKSpriteNode_Ref/index.html#//apple_ref/occ/clm/SKSpriteNode/spriteNodeWithColor:size:">iOS Dev Center</a>
     */
    @Generated
    @Selector("spriteNodeWithColor:size:")
    public static native SKSpriteNode spriteNodeWithColorSize(UIColor color, @ByValue CGSize size);

    /**
     * spriteNodeWithImageNamed:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKSpriteNode_Ref/index.html#//apple_ref/occ/clm/SKSpriteNode/spriteNodeWithImageNamed:">iOS Dev Center</a>
     */
    @Generated
    @Selector("spriteNodeWithImageNamed:")
    public static native SKSpriteNode spriteNodeWithImageNamed(String name);

    /**
     * spriteNodeWithImageNamed:normalMapped:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKSpriteNode_Ref/index.html#//apple_ref/occ/clm/SKSpriteNode/spriteNodeWithImageNamed:normalMapped:">iOS Dev Center</a>
     */
    @Generated
    @Selector("spriteNodeWithImageNamed:normalMapped:")
    public static native SKSpriteNode spriteNodeWithImageNamedNormalMapped(String name, boolean generateNormalMap);

    /**
     * spriteNodeWithTexture:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKSpriteNode_Ref/index.html#//apple_ref/occ/clm/SKSpriteNode/spriteNodeWithTexture:">iOS Dev Center</a>
     */
    @Generated
    @Selector("spriteNodeWithTexture:")
    public static native SKSpriteNode spriteNodeWithTexture(SKTexture texture);

    /**
     * spriteNodeWithTexture:normalMap:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKSpriteNode_Ref/index.html#//apple_ref/occ/clm/SKSpriteNode/spriteNodeWithTexture:normalMap:">iOS Dev Center</a>
     */
    @Generated
    @Selector("spriteNodeWithTexture:normalMap:")
    public static native SKSpriteNode spriteNodeWithTextureNormalMap(SKTexture texture, SKTexture normalMap);

    /**
     * spriteNodeWithTexture:size:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKSpriteNode_Ref/index.html#//apple_ref/occ/clm/SKSpriteNode/spriteNodeWithTexture:size:">iOS Dev Center</a>
     */
    @Generated
    @Selector("spriteNodeWithTexture:size:")
    public static native SKSpriteNode spriteNodeWithTextureSize(SKTexture texture, @ByValue CGSize size);

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

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
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * anchorPoint</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKSpriteNode_Ref/index.html#//apple_ref/occ/instp/SKSpriteNode/anchorPoint">iOS Dev Center</a>
     */
    @Generated
    @Selector("anchorPoint")
    @ByValue
    public native CGPoint anchorPoint();

    /**
     * blendMode</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKSpriteNode_Ref/index.html#//apple_ref/occ/instp/SKSpriteNode/blendMode">iOS Dev Center</a>
     */
    @Generated
    @Selector("blendMode")
    @NInt
    public native long blendMode();

    /**
     * centerRect</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKSpriteNode_Ref/index.html#//apple_ref/occ/instp/SKSpriteNode/centerRect">iOS Dev Center</a>
     */
    @Generated
    @Selector("centerRect")
    @ByValue
    public native CGRect centerRect();

    /**
     * color</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKSpriteNode_Ref/index.html#//apple_ref/occ/instp/SKSpriteNode/color">iOS Dev Center</a>
     */
    @Generated
    @Selector("color")
    public native UIColor color();

    /**
     * colorBlendFactor</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKSpriteNode_Ref/index.html#//apple_ref/occ/instp/SKSpriteNode/colorBlendFactor">iOS Dev Center</a>
     */
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

    /**
     * initWithColor:size:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKSpriteNode_Ref/index.html#//apple_ref/occ/instm/SKSpriteNode/initWithColor:size:">iOS Dev Center</a>
     */
    @Generated
    @Selector("initWithColor:size:")
    public native SKSpriteNode initWithColorSize(UIColor color, @ByValue CGSize size);

    /**
     * initWithImageNamed:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKSpriteNode_Ref/index.html#//apple_ref/occ/instm/SKSpriteNode/initWithImageNamed:">iOS Dev Center</a>
     */
    @Generated
    @Selector("initWithImageNamed:")
    public native SKSpriteNode initWithImageNamed(String name);

    /**
     * initWithTexture:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKSpriteNode_Ref/index.html#//apple_ref/occ/instm/SKSpriteNode/initWithTexture:">iOS Dev Center</a>
     */
    @Generated
    @Selector("initWithTexture:")
    public native SKSpriteNode initWithTexture(SKTexture texture);

    /**
     * initWithTexture:color:size:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKSpriteNode_Ref/index.html#//apple_ref/occ/instm/SKSpriteNode/initWithTexture:color:size:">iOS Dev Center</a>
     */
    @Generated
    @Selector("initWithTexture:color:size:")
    public native SKSpriteNode initWithTextureColorSize(SKTexture texture, UIColor color, @ByValue CGSize size);

    /**
     * lightingBitMask</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKSpriteNode_Ref/index.html#//apple_ref/occ/instp/SKSpriteNode/lightingBitMask">iOS Dev Center</a>
     */
    @Generated
    @Selector("lightingBitMask")
    public native int lightingBitMask();

    /**
     * normalTexture</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKSpriteNode_Ref/index.html#//apple_ref/occ/instp/SKSpriteNode/normalTexture">iOS Dev Center</a>
     */
    @Generated
    @Selector("normalTexture")
    public native SKTexture normalTexture();

    /**
     * anchorPoint</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKSpriteNode_Ref/index.html#//apple_ref/occ/instp/SKSpriteNode/anchorPoint">iOS Dev Center</a>
     */
    @Generated
    @Selector("setAnchorPoint:")
    public native void setAnchorPoint(@ByValue CGPoint value);

    /**
     * blendMode</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKSpriteNode_Ref/index.html#//apple_ref/occ/instp/SKSpriteNode/blendMode">iOS Dev Center</a>
     */
    @Generated
    @Selector("setBlendMode:")
    public native void setBlendMode(@NInt long value);

    /**
     * centerRect</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKSpriteNode_Ref/index.html#//apple_ref/occ/instp/SKSpriteNode/centerRect">iOS Dev Center</a>
     */
    @Generated
    @Selector("setCenterRect:")
    public native void setCenterRect(@ByValue CGRect value);

    /**
     * color</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKSpriteNode_Ref/index.html#//apple_ref/occ/instp/SKSpriteNode/color">iOS Dev Center</a>
     */
    @Generated
    @Selector("setColor:")
    public native void setColor(UIColor value);

    /**
     * colorBlendFactor</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKSpriteNode_Ref/index.html#//apple_ref/occ/instp/SKSpriteNode/colorBlendFactor">iOS Dev Center</a>
     */
    @Generated
    @Selector("setColorBlendFactor:")
    public native void setColorBlendFactor(@NFloat double value);

    /**
     * lightingBitMask</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKSpriteNode_Ref/index.html#//apple_ref/occ/instp/SKSpriteNode/lightingBitMask">iOS Dev Center</a>
     */
    @Generated
    @Selector("setLightingBitMask:")
    public native void setLightingBitMask(int value);

    /**
     * normalTexture</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKSpriteNode_Ref/index.html#//apple_ref/occ/instp/SKSpriteNode/normalTexture">iOS Dev Center</a>
     */
    @Generated
    @Selector("setNormalTexture:")
    public native void setNormalTexture(SKTexture value);

    /**
     * shader</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKSpriteNode_Ref/index.html#//apple_ref/occ/instp/SKSpriteNode/shader">iOS Dev Center</a>
     */
    @Generated
    @Selector("setShader:")
    public native void setShader(SKShader value);

    /**
     * shadowCastBitMask</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKSpriteNode_Ref/index.html#//apple_ref/occ/instp/SKSpriteNode/shadowCastBitMask">iOS Dev Center</a>
     */
    @Generated
    @Selector("setShadowCastBitMask:")
    public native void setShadowCastBitMask(int value);

    /**
     * shadowedBitMask</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKSpriteNode_Ref/index.html#//apple_ref/occ/instp/SKSpriteNode/shadowedBitMask">iOS Dev Center</a>
     */
    @Generated
    @Selector("setShadowedBitMask:")
    public native void setShadowedBitMask(int value);

    /**
     * size</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKSpriteNode_Ref/index.html#//apple_ref/occ/instp/SKSpriteNode/size">iOS Dev Center</a>
     */
    @Generated
    @Selector("setSize:")
    public native void setSize(@ByValue CGSize value);

    /**
     * texture</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKSpriteNode_Ref/index.html#//apple_ref/occ/instp/SKSpriteNode/texture">iOS Dev Center</a>
     */
    @Generated
    @Selector("setTexture:")
    public native void setTexture(SKTexture value);

    /**
     * shader</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKSpriteNode_Ref/index.html#//apple_ref/occ/instp/SKSpriteNode/shader">iOS Dev Center</a>
     */
    @Generated
    @Selector("shader")
    public native SKShader shader();

    /**
     * shadowCastBitMask</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKSpriteNode_Ref/index.html#//apple_ref/occ/instp/SKSpriteNode/shadowCastBitMask">iOS Dev Center</a>
     */
    @Generated
    @Selector("shadowCastBitMask")
    public native int shadowCastBitMask();

    /**
     * shadowedBitMask</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKSpriteNode_Ref/index.html#//apple_ref/occ/instp/SKSpriteNode/shadowedBitMask">iOS Dev Center</a>
     */
    @Generated
    @Selector("shadowedBitMask")
    public native int shadowedBitMask();

    /**
     * size</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKSpriteNode_Ref/index.html#//apple_ref/occ/instp/SKSpriteNode/size">iOS Dev Center</a>
     */
    @Generated
    @Selector("size")
    @ByValue
    public native CGSize size();

    /**
     * texture</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKSpriteNode_Ref/index.html#//apple_ref/occ/instp/SKSpriteNode/texture">iOS Dev Center</a>
     */
    @Generated
    @Selector("texture")
    public native SKTexture texture();
}

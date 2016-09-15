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
import apple.coregraphics.struct.CGSize;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSDictionary;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.gameplaykit.GKPolygonObstacle;
import apple.scenekit.SCNHitTestResult;
import apple.scenekit.SCNNode;
import apple.scenekit.SCNScene;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
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
public class SK3DNode extends SKNode {
    static {
        NatJ.register();
    }

    @Generated
    protected SK3DNode(Pointer peer) {
        super(peer);
    }

    @Generated
    @Owned
    @Selector("alloc")
    public static native SK3DNode alloc();

    /**
     * autoenablesDefaultLighting</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SK3DNode/index.html#//apple_ref/occ/instp/SK3DNode/autoenablesDefaultLighting">iOS Dev Center</a>
     */
    @Generated
    @Selector("autoenablesDefaultLighting")
    public native boolean autoenablesDefaultLighting();

    /**
     * hitTest:options:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SK3DNode/index.html#//apple_ref/occ/instm/SK3DNode/hitTest:options:">iOS Dev Center</a>
     */
    @Generated
    @Selector("hitTest:options:")
    public native NSArray<? extends SCNHitTestResult> hitTestOptions(@ByValue CGPoint point,
            NSDictionary<String, ?> options);

    @Generated
    @Selector("init")
    public native SK3DNode init();

    @Generated
    @Selector("initWithCoder:")
    public native SK3DNode initWithCoder(NSCoder aDecoder);

    /**
     * initWithViewportSize:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SK3DNode/index.html#//apple_ref/occ/instm/SK3DNode/initWithViewportSize:">iOS Dev Center</a>
     */
    @Generated
    @Selector("initWithViewportSize:")
    public native SK3DNode initWithViewportSize(@ByValue CGSize viewportSize);

    /**
     * playing</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SK3DNode/index.html#//apple_ref/occ/instp/SK3DNode/playing">iOS Dev Center</a>
     */
    @Generated
    @Selector("isPlaying")
    public native boolean isPlaying();

    /**
     * loops</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SK3DNode/index.html#//apple_ref/occ/instp/SK3DNode/loops">iOS Dev Center</a>
     */
    @Generated
    @Selector("loops")
    public native boolean loops();

    @Generated
    @Selector("node")
    public static native SK3DNode node();

    @Generated
    @Selector("nodeWithFileNamed:")
    public static native SK3DNode nodeWithFileNamed(String filename);

    /**
     * nodeWithViewportSize:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SK3DNode/index.html#//apple_ref/occ/clm/SK3DNode/nodeWithViewportSize:">iOS Dev Center</a>
     */
    @Generated
    @Selector("nodeWithViewportSize:")
    public static native SK3DNode nodeWithViewportSize(@ByValue CGSize viewportSize);

    /**
     * pointOfView</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SK3DNode/index.html#//apple_ref/occ/instp/SK3DNode/pointOfView">iOS Dev Center</a>
     */
    @Generated
    @Selector("pointOfView")
    public native SCNNode pointOfView();

    /**
     * sceneTime</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SK3DNode/index.html#//apple_ref/occ/instp/SK3DNode/sceneTime">iOS Dev Center</a>
     */
    @Generated
    @Selector("sceneTime")
    public native double sceneTime();

    /**
     * scnScene</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SK3DNode/index.html#//apple_ref/occ/instp/SK3DNode/scnScene">iOS Dev Center</a>
     */
    @Generated
    @Selector("scnScene")
    public native SCNScene scnScene();

    /**
     * autoenablesDefaultLighting</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SK3DNode/index.html#//apple_ref/occ/instp/SK3DNode/autoenablesDefaultLighting">iOS Dev Center</a>
     */
    @Generated
    @Selector("setAutoenablesDefaultLighting:")
    public native void setAutoenablesDefaultLighting(boolean value);

    /**
     * loops</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SK3DNode/index.html#//apple_ref/occ/instp/SK3DNode/loops">iOS Dev Center</a>
     */
    @Generated
    @Selector("setLoops:")
    public native void setLoops(boolean value);

    /**
     * playing</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SK3DNode/index.html#//apple_ref/occ/instp/SK3DNode/playing">iOS Dev Center</a>
     */
    @Generated
    @Selector("setPlaying:")
    public native void setPlaying(boolean value);

    /**
     * pointOfView</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SK3DNode/index.html#//apple_ref/occ/instp/SK3DNode/pointOfView">iOS Dev Center</a>
     */
    @Generated
    @Selector("setPointOfView:")
    public native void setPointOfView(SCNNode value);

    /**
     * sceneTime</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SK3DNode/index.html#//apple_ref/occ/instp/SK3DNode/sceneTime">iOS Dev Center</a>
     */
    @Generated
    @Selector("setSceneTime:")
    public native void setSceneTime(double value);

    /**
     * scnScene</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SK3DNode/index.html#//apple_ref/occ/instp/SK3DNode/scnScene">iOS Dev Center</a>
     */
    @Generated
    @Selector("setScnScene:")
    public native void setScnScene(SCNScene value);

    /**
     * viewportSize</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SK3DNode/index.html#//apple_ref/occ/instp/SK3DNode/viewportSize">iOS Dev Center</a>
     */
    @Generated
    @Selector("setViewportSize:")
    public native void setViewportSize(@ByValue CGSize value);

    /**
     * viewportSize</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SK3DNode/index.html#//apple_ref/occ/instp/SK3DNode/viewportSize">iOS Dev Center</a>
     */
    @Generated
    @Selector("viewportSize")
    @ByValue
    public native CGSize viewportSize();

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
    public static native void load_objc();

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
    public static native void setVersion(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version();
}

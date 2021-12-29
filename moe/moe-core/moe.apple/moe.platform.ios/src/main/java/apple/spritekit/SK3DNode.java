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
import apple.foundation.NSError;
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
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native SK3DNode alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native SK3DNode allocWithZone(VoidPtr zone);

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
    public static native SK3DNode new_objc();

    @Generated
    @Selector("node")
    public static native SK3DNode node();

    @Generated
    @Selector("nodeWithFileNamed:")
    public static native SK3DNode nodeWithFileNamed(String filename);

    /**
     * Create a 3D Node with the viewport size the 3D content will be rendered with.
     */
    @Generated
    @Selector("nodeWithViewportSize:")
    public static native SK3DNode nodeWithViewportSize(@ByValue CGSize viewportSize);

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
     * [@property] autoenablesDefaultLighting
     * <p>
     * Specifies whether the receiver should automatically light up scenes that have no light source. The default is NO.
     * <p>
     * When enabled, a diffuse light is automatically added and placed while rendering scenes that have no light or only ambient lights.
     */
    @Generated
    @Selector("autoenablesDefaultLighting")
    public native boolean autoenablesDefaultLighting();

    /**
     * hitTest:options:
     * <p>
     * Returns an array of SCNHitTestResult for each node that contains a specified point.
     *
     * @param point   A point in the coordinate system of the receiver.
     * @param options Optional parameters (see the "Hit test options" group for the available options).
     */
    @Generated
    @Selector("hitTest:options:")
    public native NSArray<? extends SCNHitTestResult> hitTestOptions(@ByValue CGPoint point,
            NSDictionary<String, ?> options);

    @Generated
    @Selector("init")
    public native SK3DNode init();

    /**
     * Support coding and decoding via NSKeyedArchiver.
     */
    @Generated
    @Selector("initWithCoder:")
    public native SK3DNode initWithCoder(NSCoder aDecoder);

    /**
     * Designated initializer.
     * Initialize a 3D Node with the viewport size the 3D content will be rendered with.
     */
    @Generated
    @Selector("initWithViewportSize:")
    public native SK3DNode initWithViewportSize(@ByValue CGSize viewportSize);

    /**
     * [@property] playing
     * <p>
     * Returns YES if the scene is playing, NO otherwise.
     */
    @Generated
    @Selector("isPlaying")
    public native boolean isPlaying();

    /**
     * [@property] playing
     * <p>
     * Returns YES if the scene is playing, NO otherwise.
     */
    @Generated
    @Selector("setPlaying:")
    public native void setPlaying(boolean value);

    /**
     * [@property] loops
     * <p>
     * Indicates whether the receiver restarts playback when it reaches the end of its content. Default: YES.
     * <p>
     * YES when the receiver restarts playback when it finishes, NO otherwise.
     */
    @Generated
    @Selector("loops")
    public native boolean loops();

    /**
     * [@property] pointOfView
     * <p>
     * Specifies the point of view used to render the scene.
     * <p>
     * A point of view must have either a camera or a spot light attached.
     */
    @Generated
    @Selector("pointOfView")
    public native SCNNode pointOfView();

    /**
     * [@property] sceneTime
     * <p>
     * Specifies the current time to display the scene.
     */
    @Generated
    @Selector("sceneTime")
    public native double sceneTime();

    /**
     * A SceneKit scene
     */
    @Generated
    @Selector("scnScene")
    public native SCNScene scnScene();

    /**
     * [@property] autoenablesDefaultLighting
     * <p>
     * Specifies whether the receiver should automatically light up scenes that have no light source. The default is NO.
     * <p>
     * When enabled, a diffuse light is automatically added and placed while rendering scenes that have no light or only ambient lights.
     */
    @Generated
    @Selector("setAutoenablesDefaultLighting:")
    public native void setAutoenablesDefaultLighting(boolean value);

    /**
     * [@property] loops
     * <p>
     * Indicates whether the receiver restarts playback when it reaches the end of its content. Default: YES.
     * <p>
     * YES when the receiver restarts playback when it finishes, NO otherwise.
     */
    @Generated
    @Selector("setLoops:")
    public native void setLoops(boolean value);

    /**
     * [@property] pointOfView
     * <p>
     * Specifies the point of view used to render the scene.
     * <p>
     * A point of view must have either a camera or a spot light attached.
     */
    @Generated
    @Selector("setPointOfView:")
    public native void setPointOfView(SCNNode value);

    /**
     * [@property] sceneTime
     * <p>
     * Specifies the current time to display the scene.
     */
    @Generated
    @Selector("setSceneTime:")
    public native void setSceneTime(double value);

    /**
     * A SceneKit scene
     */
    @Generated
    @Selector("setScnScene:")
    public native void setScnScene(SCNScene value);

    /**
     * The viewport size that the 3D content will be rendered with
     */
    @Generated
    @Selector("setViewportSize:")
    public native void setViewportSize(@ByValue CGSize value);

    /**
     * The viewport size that the 3D content will be rendered with
     */
    @Generated
    @Selector("viewportSize")
    @ByValue
    public native CGSize viewportSize();

    @Generated
    @Selector("nodeWithFileNamed:securelyWithClasses:andError:")
    public static native SK3DNode nodeWithFileNamedSecurelyWithClassesAndError(String filename,
            NSSet<? extends Class> classes, @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }
}

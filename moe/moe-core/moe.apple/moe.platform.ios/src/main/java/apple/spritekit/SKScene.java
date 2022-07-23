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
import apple.avfaudio.AVAudioEngine;
import apple.coregraphics.struct.CGPoint;
import apple.coregraphics.struct.CGSize;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.gameplaykit.GKPolygonObstacle;
import apple.gameplaykit.protocol.GKSceneRootNodeType;
import apple.spritekit.protocol.SKSceneDelegate;
import apple.uikit.UIColor;
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

/**
 * A scene is the root node of your content. It is used to display SpriteKit content on an SKView.
 *
 * @see SKView
 */
@Generated
@Library("SpriteKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class SKScene extends SKEffectNode implements GKSceneRootNodeType {
    static {
        NatJ.register();
    }

    @Generated
    protected SKScene(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native SKScene alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native SKScene allocWithZone(VoidPtr zone);

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
    public static native SKScene new_objc();

    @Generated
    @Selector("node")
    public static native SKScene node();

    @Generated
    @Selector("nodeWithFileNamed:")
    public static native SKScene nodeWithFileNamed(String filename);

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
    @Selector("sceneWithSize:")
    public static native SKScene sceneWithSize(@ByValue CGSize size);

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
     * Used to choose the origin of the scene's coordinate system
     */
    @Generated
    @Selector("anchorPoint")
    @ByValue
    public native CGPoint anchorPoint();

    @Generated
    @Selector("audioEngine")
    public native AVAudioEngine audioEngine();

    /**
     * Background color, defaults to gray
     */
    @Generated
    @Selector("backgroundColor")
    public native UIColor backgroundColor();

    /**
     * The camera that is used to obtain the view scale and translation based on where the camera is in relation to the
     * scene.
     */
    @Generated
    @Selector("camera")
    public native SKCameraNode camera();

    @Generated
    @Selector("convertPointFromView:")
    @ByValue
    public native CGPoint convertPointFromView(@ByValue CGPoint point);

    @Generated
    @Selector("convertPointToView:")
    @ByValue
    public native CGPoint convertPointToView(@ByValue CGPoint point);

    @Generated
    @Selector("delegate")
    @MappedReturn(ObjCObjectMapper.class)
    public native SKSceneDelegate delegate();

    /**
     * Override this to perform game logic. Called exactly once per frame after any enabled constraints have been
     * applied. Any additional actions applied is not evaluated until the next update. Any changes to physics bodies is
     * not simulated until the next update. Any changes to constraints will not be applied until the next update.
     */
    @Generated
    @Selector("didApplyConstraints")
    public native void didApplyConstraints();

    @Generated
    @Selector("didChangeSize:")
    public native void didChangeSize(@ByValue CGSize oldSize);

    /**
     * Override this to perform game logic. Called exactly once per frame after any actions have been evaluated but
     * before any physics are simulated. Any additional actions applied is not evaluated until the next update.
     */
    @Generated
    @Selector("didEvaluateActions")
    public native void didEvaluateActions();

    /**
     * Override this to perform game logic. Called after all update logic has been completed. Any additional actions
     * applied are not evaluated until the next update. Any changes to physics bodies are not simulated until the next
     * update. Any changes to constraints will not be applied until the next update.
     * <p>
     * No futher update logic will be applied to the scene after this call. Any values set on nodes here will be used
     * when the scene is rendered for the current frame.
     */
    @Generated
    @Selector("didFinishUpdate")
    public native void didFinishUpdate();

    @Generated
    @Selector("didMoveToView:")
    public native void didMoveToView(SKView view);

    /**
     * Override this to perform game logic. Called exactly once per frame after any actions have been evaluated and any
     * physics have been simulated. Any additional actions applied is not evaluated until the next update. Any changes
     * to physics bodies is not simulated until the next update.
     */
    @Generated
    @Selector("didSimulatePhysics")
    public native void didSimulatePhysics();

    @Generated
    @Selector("init")
    public native SKScene init();

    @Generated
    @Selector("initWithCoder:")
    public native SKScene initWithCoder(NSCoder aDecoder);

    /**
     * A scene is infinitely large, but it has a viewport that is the frame through which you present the content of the
     * scene.
     * The passed in size defines the size of this viewport that you use to present the scene.
     *
     * @param size a size in points that signifies the viewport into the scene that defines your framing of the scene.
     */
    @Generated
    @Selector("initWithSize:")
    public native SKScene initWithSize(@ByValue CGSize size);

    /**
     * The node that is currently the listener for positional audio coming from SKAudioNodes
     *
     * @see SKAudioNode
     */
    @Generated
    @Selector("listener")
    public native SKNode listener();

    /**
     * Physics simulation functionality
     */
    @Generated
    @Selector("physicsWorld")
    public native SKPhysicsWorld physicsWorld();

    /**
     * Used to determine how to scale the scene to match the SKView it is being displayed in.
     */
    @Generated
    @Selector("scaleMode")
    @NInt
    public native long scaleMode();

    /**
     * This is called once after the scene has been initialized or decoded,
     * this is the recommended place to perform one-time setup
     */
    @Generated
    @Selector("sceneDidLoad")
    public native void sceneDidLoad();

    /**
     * Used to choose the origin of the scene's coordinate system
     */
    @Generated
    @Selector("setAnchorPoint:")
    public native void setAnchorPoint(@ByValue CGPoint value);

    /**
     * Background color, defaults to gray
     */
    @Generated
    @Selector("setBackgroundColor:")
    public native void setBackgroundColor(UIColor value);

    /**
     * The camera that is used to obtain the view scale and translation based on where the camera is in relation to the
     * scene.
     */
    @Generated
    @Selector("setCamera:")
    public native void setCamera_unsafe(SKCameraNode value);

    /**
     * The camera that is used to obtain the view scale and translation based on where the camera is in relation to the
     * scene.
     */
    @Generated
    public void setCamera(SKCameraNode value) {
        Object __old = camera();
        if (value != null) {
            org.moe.natj.objc.ObjCRuntime.associateObjCObject(this, value);
        }
        setCamera_unsafe(value);
        if (__old != null) {
            org.moe.natj.objc.ObjCRuntime.dissociateObjCObject(this, __old);
        }
    }

    @Generated
    @Selector("setDelegate:")
    public native void setDelegate_unsafe(@Mapped(ObjCObjectMapper.class) SKSceneDelegate value);

    @Generated
    public void setDelegate(@Mapped(ObjCObjectMapper.class) SKSceneDelegate value) {
        Object __old = delegate();
        if (value != null) {
            org.moe.natj.objc.ObjCRuntime.associateObjCObject(this, value);
        }
        setDelegate_unsafe(value);
        if (__old != null) {
            org.moe.natj.objc.ObjCRuntime.dissociateObjCObject(this, __old);
        }
    }

    /**
     * The node that is currently the listener for positional audio coming from SKAudioNodes
     *
     * @see SKAudioNode
     */
    @Generated
    @Selector("setListener:")
    public native void setListener_unsafe(SKNode value);

    /**
     * The node that is currently the listener for positional audio coming from SKAudioNodes
     *
     * @see SKAudioNode
     */
    @Generated
    public void setListener(SKNode value) {
        Object __old = listener();
        if (value != null) {
            org.moe.natj.objc.ObjCRuntime.associateObjCObject(this, value);
        }
        setListener_unsafe(value);
        if (__old != null) {
            org.moe.natj.objc.ObjCRuntime.dissociateObjCObject(this, __old);
        }
    }

    /**
     * Used to determine how to scale the scene to match the SKView it is being displayed in.
     */
    @Generated
    @Selector("setScaleMode:")
    public native void setScaleMode(@NInt long value);

    @Generated
    @Selector("setSize:")
    public native void setSize(@ByValue CGSize value);

    @Generated
    @Selector("size")
    @ByValue
    public native CGSize size();

    /**
     * Override this to perform per-frame game logic. Called exactly once per frame before any actions are evaluated and
     * any physics are simulated.
     *
     * @param currentTime the current time in the app. This must be monotonically increasing.
     */
    @Generated
    @Selector("update:")
    public native void update(double currentTime);

    /**
     * The SKView this scene is currently presented in, or nil if it is not being presented.
     */
    @Generated
    @Selector("view")
    public native SKView view();

    @Generated
    @Selector("willMoveFromView:")
    public native void willMoveFromView(SKView view);

    @Generated
    @Selector("nodeWithFileNamed:securelyWithClasses:andError:")
    public static native SKScene nodeWithFileNamedSecurelyWithClassesAndError(String filename,
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

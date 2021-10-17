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

package apple.scenekit;

import apple.NSObject;
import apple.coregraphics.struct.CGRect;
import apple.coreimage.CIFilter;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSDictionary;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSCopying;
import apple.foundation.protocol.NSSecureCoding;
import apple.gameplaykit.GKEntity;
import apple.modelio.MDLObject;
import apple.quartzcore.CAAnimation;
import apple.scenekit.protocol.SCNActionable;
import apple.scenekit.protocol.SCNAnimatable;
import apple.scenekit.protocol.SCNAnimation;
import apple.scenekit.protocol.SCNBoundingVolume;
import apple.scenekit.protocol.SCNNodeRendererDelegate;
import apple.scenekit.struct.SCNMatrix4;
import apple.scenekit.struct.SCNVector3;
import apple.scenekit.struct.SCNVector4;
import apple.uikit.UIFocusAnimationCoordinator;
import apple.uikit.UIFocusEffect;
import apple.uikit.UIFocusMovementHint;
import apple.uikit.UIFocusUpdateContext;
import apple.uikit.UIView;
import apple.uikit.protocol.UIFocusEnvironment;
import apple.uikit.protocol.UIFocusItem;
import apple.uikit.protocol.UIFocusItemContainer;
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
import org.moe.natj.general.ptr.BoolPtr;
import org.moe.natj.general.ptr.NFloatPtr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * SCNNode
 * <p>
 * SCNNode is the model class for node-tree objects.
 * <p>
 * It encapsulates the position, rotations, and other transforms of a node, which define a coordinate system.
 * The coordinate systems of all the sub-nodes are relative to the one of their parent node.
 */
@Generated
@Library("SceneKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class SCNNode extends NSObject
        implements NSCopying, NSSecureCoding, SCNAnimatable, SCNActionable, SCNBoundingVolume, UIFocusItem {
    static {
        NatJ.register();
    }

    @Generated
    protected SCNNode(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native SCNNode alloc();

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
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object new_objc();

    /**
     * node
     * <p>
     * Creates and initializes a node instance.
     */
    @Generated
    @Selector("node")
    public static native SCNNode node();

    /**
     * nodeWithGeometry:
     * <p>
     * Creates and initializes a node instance with the specified geometry attached.
     *
     * @param geometry The geometry to attach.
     */
    @Generated
    @Selector("nodeWithGeometry:")
    public static native SCNNode nodeWithGeometry(SCNGeometry geometry);

    @Generated
    @Selector("nodeWithMDLObject:")
    public static native SCNNode nodeWithMDLObject(MDLObject mdlObject);

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
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @Generated
    @Selector("actionForKey:")
    public native SCNAction actionForKey(String key);

    @Generated
    @Selector("actionKeys")
    public native NSArray<String> actionKeys();

    @Generated
    @Selector("addAnimation:forKey:")
    public native void addAnimationForKey(@Mapped(ObjCObjectMapper.class) SCNAnimation animation, String key);

    /**
     * addAudioPlayer:
     * <p>
     * Add an audio player to the node and starts playing it right away.
     */
    @Generated
    @Selector("addAudioPlayer:")
    public native void addAudioPlayer(SCNAudioPlayer player);

    /**
     * addChildNode:
     * <p>
     * Appends the node to the receiver’s childNodes array.
     *
     * @param child The node to be added to the receiver’s childNodes array.
     */
    @Generated
    @Selector("addChildNode:")
    public native void addChildNode(SCNNode child);

    /**
     * Add a particle system to the receiver.
     */
    @Generated
    @Selector("addParticleSystem:")
    public native void addParticleSystem(SCNParticleSystem system);

    @Generated
    @Selector("animationForKey:")
    public native CAAnimation animationForKey(String key);

    @Generated
    @Selector("animationKeys")
    public native NSArray<String> animationKeys();

    /**
     * [@property] audioPlayers
     * <p>
     * Get an array with all the audio players connected and playing on this node.
     */
    @Generated
    @Selector("audioPlayers")
    public native NSArray<? extends SCNAudioPlayer> audioPlayers();

    /**
     * [@property] camera
     * <p>
     * Determines the camera attached to the receiver.
     */
    @Generated
    @Selector("camera")
    public native SCNCamera camera();

    /**
     * [@property] castsShadow
     * <p>
     * Determines if the node is rendered in shadow maps. Defaults to YES.
     */
    @Generated
    @Selector("castsShadow")
    public native boolean castsShadow();

    /**
     * [@property] categoryBitMask
     * <p>
     * Defines what logical 'categories' the receiver belongs too. Defaults to 1.
     * <p>
     * Categories can be used to
     * 1. exclude nodes from the influence of a given light (see SCNLight.categoryBitMask)
     * 2. include/exclude nodes from render passes (see SCNTechnique.h)
     * 3. specify which nodes to use when hit-testing (see SCNHitTestOptionCategoryBitMask)
     */
    @Generated
    @Selector("categoryBitMask")
    @NUInt
    public native long categoryBitMask();

    /**
     * childNodeWithName:recursively:
     * <p>
     * Returns the first node found in the node tree with the specified name.
     * <p>
     * The search uses a pre-order tree traversal.
     *
     * @param name        The name of the node you are searching for.
     * @param recursively Set to YES if you want the search to look through the sub-nodes recursively.
     */
    @Generated
    @Selector("childNodeWithName:recursively:")
    public native SCNNode childNodeWithNameRecursively(String name, boolean recursively);

    /**
     * [@property] childNodes
     * <p>
     * Returns the child node array of the receiver.
     */
    @Generated
    @Selector("childNodes")
    public native NSArray<? extends SCNNode> childNodes();

    /**
     * childNodesPassingTest:
     * <p>
     * Returns the child nodes of the receiver that passes a test in a given Block.
     * <p>
     * The search is recursive and uses a pre-order tree traversal.
     *
     * @param predicate The block to apply to child nodes of the receiver. The block takes two arguments: "child" is a child node and "stop" is a reference to a Boolean value. The block can set the value to YES to stop further processing of the node hierarchy. The stop argument is an out-only argument. You should only ever set this Boolean to YES within the Block. The Block returns a Boolean value that indicates whether "child" passed the test.
     */
    @Generated
    @Selector("childNodesPassingTest:")
    public native NSArray<? extends SCNNode> childNodesPassingTest(
            @ObjCBlock(name = "call_childNodesPassingTest") Block_childNodesPassingTest predicate);

    /**
     * clone
     * <p>
     * Returns a copy of the receiver. The returned instance is autoreleased.
     * <p>
     * The copy is recursive: every child node will be cloned, too. For a non-recursive copy, use copy instead.
     * The copied nodes will share their attached objects (light, geometry, camera, ...) with the original instances;
     * if you want, for example, to change the materials of the copy independently of the original object, you'll
     * have to copy the geometry of the node separately.
     */
    @Generated
    @Selector("clone")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object clone();

    /**
     * [@property] constraints
     * <p>
     * An array of SCNConstraint that are applied to the receiver.
     * <p>
     * Adding or removing a constraint can be implicitly animated based on the current transaction.
     */
    @Generated
    @Selector("constraints")
    public native NSArray<? extends SCNConstraint> constraints();

    /**
     * convertPosition:fromNode:
     * <p>
     * Converts a position from the coordinate system of a given node to that of the receiver.
     *
     * @param position A position specified in the local coordinate system of "node".
     * @param node     The node from whose coordinate system "position" is to be converted. If "node" is nil, this method instead converts from world coordinates.
     */
    @Generated
    @Selector("convertPosition:fromNode:")
    @ByValue
    public native SCNVector3 convertPositionFromNode(@ByValue SCNVector3 position, SCNNode node);

    /**
     * convertPosition:toNode:
     * <p>
     * Converts a position from the receiver’s coordinate system to that of the specified node.
     *
     * @param position A position specified in the local coordinate system of the receiver.
     * @param node     The node into whose coordinate system "position" is to be converted. If "node" is nil, this method instead converts to world coordinates.
     */
    @Generated
    @Selector("convertPosition:toNode:")
    @ByValue
    public native SCNVector3 convertPositionToNode(@ByValue SCNVector3 position, SCNNode node);

    /**
     * convertTransform:fromNode:
     * <p>
     * Converts a transform from the coordinate system of a given node to that of the receiver.
     *
     * @param transform A transform specified in the local coordinate system of "node".
     * @param node      The node from whose coordinate system "transform" is to be converted. If "node" is nil, this method instead converts from world coordinates.
     */
    @Generated
    @Selector("convertTransform:fromNode:")
    @ByValue
    public native SCNMatrix4 convertTransformFromNode(@ByValue SCNMatrix4 transform, SCNNode node);

    /**
     * convertTransform:toNode:
     * <p>
     * Converts a transform from the receiver’s coordinate system to that of the specified node.
     *
     * @param transform A transform specified in the local coordinate system of the receiver.
     * @param node      The node into whose coordinate system "transform" is to be converted. If "node" is nil, this method instead converts to world coordinates.
     */
    @Generated
    @Selector("convertTransform:toNode:")
    @ByValue
    public native SCNMatrix4 convertTransformToNode(@ByValue SCNMatrix4 transform, SCNNode node);

    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(VoidPtr zone);

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(NSCoder coder);

    /**
     * enumerateChildNodesUsingBlock:
     * <p>
     * Executes a given block on each child node under the receiver.
     * <p>
     * The search is recursive and uses a pre-order tree traversal.
     *
     * @param block The block to apply to child nodes of the receiver. The block takes two arguments: "child" is a child node and "stop" is a reference to a Boolean value. The block can set the value to YES to stop further processing of the node hierarchy. The stop argument is an out-only argument. You should only ever set this Boolean to YES within the Block.
     */
    @Generated
    @Selector("enumerateChildNodesUsingBlock:")
    public native void enumerateChildNodesUsingBlock(
            @ObjCBlock(name = "call_enumerateChildNodesUsingBlock") Block_enumerateChildNodesUsingBlock block);

    /**
     * enumerateHierarchyUsingBlock:
     * <p>
     * Executes a given block on the receiver and its child nodes.
     * <p>
     * The search is recursive and uses a pre-order tree traversal.
     *
     * @param block The block to apply to the receiver and its child nodes. The block takes two arguments: "node" is a node in the hierarchy of the receiver (including the receiver) and "stop" is a reference to a Boolean value. The block can set the value to YES to stop further processing of the node hierarchy. The stop argument is an out-only argument. You should only ever set this Boolean to YES within the Block.
     */
    @Generated
    @Selector("enumerateHierarchyUsingBlock:")
    public native void enumerateHierarchyUsingBlock(
            @ObjCBlock(name = "call_enumerateHierarchyUsingBlock") Block_enumerateHierarchyUsingBlock block);

    /**
     * [@property] eulerAngles
     * <p>
     * Determines the receiver's euler angles. Animatable.
     * [@dicussion] The order of components in this vector matches the axes of rotation:
     * 1. Pitch (the x component) is the rotation about the node's x-axis (in radians)
     * 2. Yaw   (the y component) is the rotation about the node's y-axis (in radians)
     * 3. Roll  (the z component) is the rotation about the node's z-axis (in radians)
     * SceneKit applies these rotations in the reverse order of the components:
     * 1. first roll
     * 2. then yaw
     * 3. then pitch
     */
    @Generated
    @Selector("eulerAngles")
    @ByValue
    public native SCNVector3 eulerAngles();

    /**
     * [@property] filters
     * <p>
     * An array of Core Image filters that are applied to the rendering of the receiver and its child nodes. Animatable.
     * <p>
     * Defaults to nil. Filter properties should be modified by calling setValue:forKeyPath: on each node that the filter is attached to. If the inputs of the filter are modified directly after the filter is attached to a node, the behavior is undefined.
     */
    @Generated
    @Selector("filters")
    public native NSArray<? extends CIFilter> filters();

    /**
     * flattenedClone
     * <p>
     * Returns a clone of the node containing a geometry that concatenates all the geometries contained in the node hierarchy.
     * The returned clone is autoreleased.
     */
    @Generated
    @Selector("flattenedClone")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object flattenedClone();

    /**
     * [@property] geometry
     * <p>
     * Returns the geometry attached to the receiver.
     */
    @Generated
    @Selector("geometry")
    public native SCNGeometry geometry();

    @Generated
    @Selector("getBoundingBoxMin:max:")
    public native boolean getBoundingBoxMinMax(SCNVector3 min, SCNVector3 max);

    @Generated
    @Selector("getBoundingSphereCenter:radius:")
    public native boolean getBoundingSphereCenterRadius(SCNVector3 center, NFloatPtr radius);

    @Generated
    @Selector("hasActions")
    public native boolean hasActions();

    /**
     * hitTestWithSegmentFromPoint:toPoint:options:
     * <p>
     * Returns an array of SCNHitTestResult for each node in the receiver's sub tree that intersects the specified segment.
     * <p>
     * See SCNSceneRenderer.h for a screen-space hit testing method.
     *
     * @param pointA  The first point of the segment relative to the receiver.
     * @param pointB  The second point of the segment relative to the receiver.
     * @param options Optional parameters (see the "Hit test options" section in SCNSceneRenderer.h for the available options).
     */
    @Generated
    @Selector("hitTestWithSegmentFromPoint:toPoint:options:")
    public native NSArray<? extends SCNHitTestResult> hitTestWithSegmentFromPointToPointOptions(
            @ByValue SCNVector3 pointA, @ByValue SCNVector3 pointB, NSDictionary<String, ?> options);

    @Generated
    @Selector("init")
    public native SCNNode init();

    @Generated
    @Selector("initWithCoder:")
    public native SCNNode initWithCoder(NSCoder coder);

    /**
     * insertChildNode:atIndex:
     * <p>
     * Insert a node in the childNodes array at the specified index.
     *
     * @param child The node to insert.
     * @param index Index in the childNodes array to insert the node.
     */
    @Generated
    @Selector("insertChildNode:atIndex:")
    public native void insertChildNodeAtIndex(SCNNode child, @NUInt long index);

    @Generated
    @Selector("isAnimationForKeyPaused:")
    public native boolean isAnimationForKeyPaused(String key);

    /**
     * [@property] hidden
     * <p>
     * Determines whether the receiver is displayed. Defaults to NO. Animatable.
     */
    @Generated
    @Selector("isHidden")
    public native boolean isHidden();

    /**
     * [@property] hidden
     * <p>
     * Determines whether the receiver is displayed. Defaults to NO. Animatable.
     */
    @Generated
    @Selector("setHidden:")
    public native void setHidden(boolean value);

    /**
     * [@property] paused
     * <p>
     * Controls whether or not the node's actions and animations are updated or paused. Defaults to NO.
     */
    @Generated
    @Selector("isPaused")
    public native boolean isPaused();

    /**
     * [@property] paused
     * <p>
     * Controls whether or not the node's actions and animations are updated or paused. Defaults to NO.
     */
    @Generated
    @Selector("setPaused:")
    public native void setPaused(boolean value);

    /**
     * [@property] light
     * <p>
     * Determines the light attached to the receiver.
     */
    @Generated
    @Selector("light")
    public native SCNLight light();

    /**
     * [@property] morpher
     * <p>
     * Returns the morpher attached to the receiver.
     */
    @Generated
    @Selector("morpher")
    public native SCNMorpher morpher();

    /**
     * [@property] movabilityHint
     * <p>
     * Communicates to SceneKit’s rendering system about how you want to move content in your scene; it does not affect your ability to change the node’s position or add animations or physics to the node. Defaults to SCNMovabilityHintFixed.
     */
    @Generated
    @Selector("movabilityHint")
    @NInt
    public native long movabilityHint();

    /**
     * [@property] name
     * <p>
     * Determines the name of the receiver.
     */
    @Generated
    @Selector("name")
    public native String name();

    /**
     * [@property] opacity
     * <p>
     * Determines the opacity of the receiver. Default is 1. Animatable.
     */
    @Generated
    @Selector("opacity")
    @NFloat
    public native double opacity();

    /**
     * [@property] orientation
     * <p>
     * Determines the receiver's orientation as a unit quaternion. Animatable.
     */
    @Generated
    @Selector("orientation")
    @ByValue
    public native SCNVector4 orientation();

    /**
     * [@property] parentNode
     * <p>
     * Returns the parent node of the receiver.
     */
    @Generated
    @Selector("parentNode")
    public native SCNNode parentNode();

    /**
     * The particle systems attached to the node.
     */
    @Generated
    @Selector("particleSystems")
    public native NSArray<? extends SCNParticleSystem> particleSystems();

    @Generated
    @Selector("pauseAnimationForKey:")
    public native void pauseAnimationForKey(String key);

    /**
     * [@property] physicsBody
     * <p>
     * The description of the physics body of the receiver.
     * <p>
     * Default is nil.
     */
    @Generated
    @Selector("physicsBody")
    public native SCNPhysicsBody physicsBody();

    /**
     * [@property] physicsField
     * <p>
     * The description of the physics field of the receiver.
     * <p>
     * Default is nil.
     */
    @Generated
    @Selector("physicsField")
    public native SCNPhysicsField physicsField();

    /**
     * [@property] pivot
     * <p>
     * Determines the receiver's pivot. Animatable.
     */
    @Generated
    @Selector("pivot")
    @ByValue
    public native SCNMatrix4 pivot();

    /**
     * [@property] position
     * <p>
     * Determines the receiver's position. Animatable.
     */
    @Generated
    @Selector("position")
    @ByValue
    public native SCNVector3 position();

    /**
     * [@property] presentationNode
     * <p>
     * Returns the presentation node.
     * <p>
     * Returns a copy of the node containing all the properties as they were at the start of the current transaction, with any active animations applied.
     * This gives a close approximation to the version of the node that is currently displayed.
     * The effect of attempting to modify the returned node in any way is undefined. The returned node has no parent and no child nodes.
     */
    @Generated
    @Selector("presentationNode")
    public native SCNNode presentationNode();

    @Generated
    @Selector("removeActionForKey:")
    public native void removeActionForKey(String key);

    @Generated
    @Selector("removeAllActions")
    public native void removeAllActions();

    @Generated
    @Selector("removeAllAnimations")
    public native void removeAllAnimations();

    /**
     * removeAllAudioPlayers
     * <p>
     * Remove all audio players from this node and stop playing them.
     */
    @Generated
    @Selector("removeAllAudioPlayers")
    public native void removeAllAudioPlayers();

    /**
     * Remove all particle systems of the receiver.
     */
    @Generated
    @Selector("removeAllParticleSystems")
    public native void removeAllParticleSystems();

    @Generated
    @Selector("removeAnimationForKey:")
    public native void removeAnimationForKey(String key);

    @Generated
    @Selector("removeAnimationForKey:fadeOutDuration:")
    public native void removeAnimationForKeyFadeOutDuration(String key, @NFloat double duration);

    /**
     * removeAudioPlayer:
     * <p>
     * Remove the given audio player from this node and stop playing it.
     */
    @Generated
    @Selector("removeAudioPlayer:")
    public native void removeAudioPlayer(SCNAudioPlayer player);

    /**
     * removeFromParentNode
     * <p>
     * Removes the node from the childNodes array of the receiver’s parentNode.
     */
    @Generated
    @Selector("removeFromParentNode")
    public native void removeFromParentNode();

    /**
     * Remove the specified particle system from the receiver.
     */
    @Generated
    @Selector("removeParticleSystem:")
    public native void removeParticleSystem(SCNParticleSystem system);

    /**
     * [@property] rendererDelegate
     * <p>
     * Specifies the receiver's renderer delegate object.
     * <p>
     * Setting a renderer delegate prevents the SceneKit renderer from drawing the node and lets you use custom OpenGL code instead.
     * The preferred way to customize the rendering is to tweak the material properties of the different materials of the node's geometry. SCNMaterial conforms to the SCNShadable protocol and allows for more advanced rendering using GLSL.
     * You would typically use a renderer delegate with a node that has no geometry and only serves as a location in space. An example would be attaching a particle system to that node and render it with custom OpenGL code.
     */
    @Generated
    @Selector("rendererDelegate")
    @MappedReturn(ObjCObjectMapper.class)
    public native SCNNodeRendererDelegate rendererDelegate();

    /**
     * [@property] renderingOrder
     * <p>
     * Determines the rendering order of the receiver.
     * <p>
     * Nodes with greater rendering orders are rendered last. Defaults to 0.
     */
    @Generated
    @Selector("renderingOrder")
    @NInt
    public native long renderingOrder();

    /**
     * replaceChildNode:with:
     * <p>
     * Remove `child' from the childNode array of the receiver and insert 'child2' if non-nil in its position.
     * <p>
     * If the parentNode of `child' is not the receiver, the behavior is undefined.
     *
     * @param oldChild The node to replace in the childNodes array.
     * @param newChild The new node that will replace the previous one.
     */
    @Generated
    @Selector("replaceChildNode:with:")
    public native void replaceChildNodeWith(SCNNode oldChild, SCNNode newChild);

    @Generated
    @Selector("resumeAnimationForKey:")
    public native void resumeAnimationForKey(String key);

    /**
     * [@property] rotation
     * <p>
     * Determines the receiver's rotation. Animatable.
     * <p>
     * The rotation is axis angle rotation. The three first components are the axis, the fourth one is the rotation (in radian).
     */
    @Generated
    @Selector("rotation")
    @ByValue
    public native SCNVector4 rotation();

    @Generated
    @Selector("runAction:")
    public native void runAction(SCNAction action);

    @Generated
    @Selector("runAction:completionHandler:")
    public native void runActionCompletionHandler(SCNAction action,
            @ObjCBlock(name = "call_runActionCompletionHandler") SCNActionable.Block_runActionCompletionHandler block);

    @Generated
    @Selector("runAction:forKey:")
    public native void runActionForKey(SCNAction action, String key);

    @Generated
    @Selector("runAction:forKey:completionHandler:")
    public native void runActionForKeyCompletionHandler(SCNAction action, String key,
            @ObjCBlock(name = "call_runActionForKeyCompletionHandler") SCNActionable.Block_runActionForKeyCompletionHandler block);

    /**
     * [@property] scale
     * <p>
     * Determines the receiver's scale. Animatable.
     */
    @Generated
    @Selector("scale")
    @ByValue
    public native SCNVector3 scale();

    @Generated
    @Selector("setBoundingBoxMin:max:")
    public native void setBoundingBoxMinMax(SCNVector3 min, SCNVector3 max);

    /**
     * [@property] camera
     * <p>
     * Determines the camera attached to the receiver.
     */
    @Generated
    @Selector("setCamera:")
    public native void setCamera(SCNCamera value);

    /**
     * [@property] castsShadow
     * <p>
     * Determines if the node is rendered in shadow maps. Defaults to YES.
     */
    @Generated
    @Selector("setCastsShadow:")
    public native void setCastsShadow(boolean value);

    /**
     * [@property] categoryBitMask
     * <p>
     * Defines what logical 'categories' the receiver belongs too. Defaults to 1.
     * <p>
     * Categories can be used to
     * 1. exclude nodes from the influence of a given light (see SCNLight.categoryBitMask)
     * 2. include/exclude nodes from render passes (see SCNTechnique.h)
     * 3. specify which nodes to use when hit-testing (see SCNHitTestOptionCategoryBitMask)
     */
    @Generated
    @Selector("setCategoryBitMask:")
    public native void setCategoryBitMask(@NUInt long value);

    /**
     * [@property] constraints
     * <p>
     * An array of SCNConstraint that are applied to the receiver.
     * <p>
     * Adding or removing a constraint can be implicitly animated based on the current transaction.
     */
    @Generated
    @Selector("setConstraints:")
    public native void setConstraints(NSArray<? extends SCNConstraint> value);

    /**
     * [@property] eulerAngles
     * <p>
     * Determines the receiver's euler angles. Animatable.
     * [@dicussion] The order of components in this vector matches the axes of rotation:
     * 1. Pitch (the x component) is the rotation about the node's x-axis (in radians)
     * 2. Yaw   (the y component) is the rotation about the node's y-axis (in radians)
     * 3. Roll  (the z component) is the rotation about the node's z-axis (in radians)
     * SceneKit applies these rotations in the reverse order of the components:
     * 1. first roll
     * 2. then yaw
     * 3. then pitch
     */
    @Generated
    @Selector("setEulerAngles:")
    public native void setEulerAngles(@ByValue SCNVector3 value);

    /**
     * [@property] filters
     * <p>
     * An array of Core Image filters that are applied to the rendering of the receiver and its child nodes. Animatable.
     * <p>
     * Defaults to nil. Filter properties should be modified by calling setValue:forKeyPath: on each node that the filter is attached to. If the inputs of the filter are modified directly after the filter is attached to a node, the behavior is undefined.
     */
    @Generated
    @Selector("setFilters:")
    public native void setFilters(NSArray<? extends CIFilter> value);

    /**
     * [@property] geometry
     * <p>
     * Returns the geometry attached to the receiver.
     */
    @Generated
    @Selector("setGeometry:")
    public native void setGeometry(SCNGeometry value);

    /**
     * [@property] light
     * <p>
     * Determines the light attached to the receiver.
     */
    @Generated
    @Selector("setLight:")
    public native void setLight(SCNLight value);

    /**
     * [@property] morpher
     * <p>
     * Returns the morpher attached to the receiver.
     */
    @Generated
    @Selector("setMorpher:")
    public native void setMorpher(SCNMorpher value);

    /**
     * [@property] movabilityHint
     * <p>
     * Communicates to SceneKit’s rendering system about how you want to move content in your scene; it does not affect your ability to change the node’s position or add animations or physics to the node. Defaults to SCNMovabilityHintFixed.
     */
    @Generated
    @Selector("setMovabilityHint:")
    public native void setMovabilityHint(@NInt long value);

    /**
     * [@property] name
     * <p>
     * Determines the name of the receiver.
     */
    @Generated
    @Selector("setName:")
    public native void setName(String value);

    /**
     * [@property] opacity
     * <p>
     * Determines the opacity of the receiver. Default is 1. Animatable.
     */
    @Generated
    @Selector("setOpacity:")
    public native void setOpacity(@NFloat double value);

    /**
     * [@property] orientation
     * <p>
     * Determines the receiver's orientation as a unit quaternion. Animatable.
     */
    @Generated
    @Selector("setOrientation:")
    public native void setOrientation(@ByValue SCNVector4 value);

    /**
     * [@property] physicsBody
     * <p>
     * The description of the physics body of the receiver.
     * <p>
     * Default is nil.
     */
    @Generated
    @Selector("setPhysicsBody:")
    public native void setPhysicsBody(SCNPhysicsBody value);

    /**
     * [@property] physicsField
     * <p>
     * The description of the physics field of the receiver.
     * <p>
     * Default is nil.
     */
    @Generated
    @Selector("setPhysicsField:")
    public native void setPhysicsField(SCNPhysicsField value);

    /**
     * [@property] pivot
     * <p>
     * Determines the receiver's pivot. Animatable.
     */
    @Generated
    @Selector("setPivot:")
    public native void setPivot(@ByValue SCNMatrix4 value);

    /**
     * [@property] position
     * <p>
     * Determines the receiver's position. Animatable.
     */
    @Generated
    @Selector("setPosition:")
    public native void setPosition(@ByValue SCNVector3 value);

    /**
     * [@property] rendererDelegate
     * <p>
     * Specifies the receiver's renderer delegate object.
     * <p>
     * Setting a renderer delegate prevents the SceneKit renderer from drawing the node and lets you use custom OpenGL code instead.
     * The preferred way to customize the rendering is to tweak the material properties of the different materials of the node's geometry. SCNMaterial conforms to the SCNShadable protocol and allows for more advanced rendering using GLSL.
     * You would typically use a renderer delegate with a node that has no geometry and only serves as a location in space. An example would be attaching a particle system to that node and render it with custom OpenGL code.
     */
    @Generated
    @Selector("setRendererDelegate:")
    public native void setRendererDelegate_unsafe(@Mapped(ObjCObjectMapper.class) SCNNodeRendererDelegate value);

    /**
     * [@property] rendererDelegate
     * <p>
     * Specifies the receiver's renderer delegate object.
     * <p>
     * Setting a renderer delegate prevents the SceneKit renderer from drawing the node and lets you use custom OpenGL code instead.
     * The preferred way to customize the rendering is to tweak the material properties of the different materials of the node's geometry. SCNMaterial conforms to the SCNShadable protocol and allows for more advanced rendering using GLSL.
     * You would typically use a renderer delegate with a node that has no geometry and only serves as a location in space. An example would be attaching a particle system to that node and render it with custom OpenGL code.
     */
    @Generated
    public void setRendererDelegate(@Mapped(ObjCObjectMapper.class) SCNNodeRendererDelegate value) {
        Object __old = rendererDelegate();
        if (value != null) {
            org.moe.natj.objc.ObjCRuntime.associateObjCObject(this, value);
        }
        setRendererDelegate_unsafe(value);
        if (__old != null) {
            org.moe.natj.objc.ObjCRuntime.dissociateObjCObject(this, __old);
        }
    }

    /**
     * [@property] renderingOrder
     * <p>
     * Determines the rendering order of the receiver.
     * <p>
     * Nodes with greater rendering orders are rendered last. Defaults to 0.
     */
    @Generated
    @Selector("setRenderingOrder:")
    public native void setRenderingOrder(@NInt long value);

    /**
     * [@property] rotation
     * <p>
     * Determines the receiver's rotation. Animatable.
     * <p>
     * The rotation is axis angle rotation. The three first components are the axis, the fourth one is the rotation (in radian).
     */
    @Generated
    @Selector("setRotation:")
    public native void setRotation(@ByValue SCNVector4 value);

    /**
     * [@property] scale
     * <p>
     * Determines the receiver's scale. Animatable.
     */
    @Generated
    @Selector("setScale:")
    public native void setScale(@ByValue SCNVector3 value);

    /**
     * [@property] skinner
     * <p>
     * Returns the skinner attached to the receiver.
     */
    @Generated
    @Selector("setSkinner:")
    public native void setSkinner(SCNSkinner value);

    @Generated
    @Selector("setSpeed:forAnimationKey:")
    public native void setSpeedForAnimationKey(@NFloat double speed, String key);

    /**
     * [@property] transform
     * <p>
     * Determines the receiver's transform. Animatable.
     * <p>
     * The transform is the combination of the position, rotation and scale defined below. So when the transform is set, the receiver's position, rotation and scale are changed to match the new transform.
     */
    @Generated
    @Selector("setTransform:")
    public native void setTransform(@ByValue SCNMatrix4 value);

    /**
     * [@property] skinner
     * <p>
     * Returns the skinner attached to the receiver.
     */
    @Generated
    @Selector("skinner")
    public native SCNSkinner skinner();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    /**
     * [@property] transform
     * <p>
     * Determines the receiver's transform. Animatable.
     * <p>
     * The transform is the combination of the position, rotation and scale defined below. So when the transform is set, the receiver's position, rotation and scale are changed to match the new transform.
     */
    @Generated
    @Selector("transform")
    @ByValue
    public native SCNMatrix4 transform();

    /**
     * [@property] worldTransform
     * <p>
     * Determines the receiver's transform in world space (relative to the scene's root node). Animatable.
     */
    @Generated
    @Selector("worldTransform")
    @ByValue
    public native SCNMatrix4 worldTransform();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_childNodesPassingTest {
        @Generated
        boolean call_childNodesPassingTest(SCNNode child, BoolPtr stop);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_enumerateChildNodesUsingBlock {
        @Generated
        void call_enumerateChildNodesUsingBlock(SCNNode child, BoolPtr stop);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_enumerateHierarchyUsingBlock {
        @Generated
        void call_enumerateHierarchyUsingBlock(SCNNode node, BoolPtr stop);
    }

    @Generated
    @Selector("addAnimationPlayer:forKey:")
    public native void addAnimationPlayerForKey(SCNAnimationPlayer player, String key);

    @Generated
    @Selector("animationPlayerForKey:")
    public native SCNAnimationPlayer animationPlayerForKey(String key);

    @Generated
    @Selector("canBecomeFocused")
    public native boolean canBecomeFocused();

    /**
     * Converts a vector from the coordinate system of a given node to that of the receiver.
     *
     * @param vector A vector specified in the local coordinate system of "node".
     * @param node   The node defining the space to which the vector should be transformed to. If "node" is nil, this method instead converts from world coordinates.
     * @return vector transformed from node space to reveiver local space.
     */
    @Generated
    @Selector("convertVector:fromNode:")
    @ByValue
    public native SCNVector3 convertVectorFromNode(@ByValue SCNVector3 vector, SCNNode node);

    /**
     * Converts a vector from the coordinate system of a given node to that of the receiver.
     *
     * @param vector A vector specified in the local coordinate system the receiver.
     * @param node   The node defining the space from which the vector should be transformed. If "node" is nil, this method instead converts from world coordinates.
     * @return vector transformed from receiver local space to node local space.
     */
    @Generated
    @Selector("convertVector:toNode:")
    @ByValue
    public native SCNVector3 convertVectorToNode(@ByValue SCNVector3 vector, SCNNode node);

    @Generated
    @Selector("didUpdateFocusInContext:withAnimationCoordinator:")
    public native void didUpdateFocusInContextWithAnimationCoordinator(UIFocusUpdateContext context,
            UIFocusAnimationCoordinator coordinator);

    /**
     * The GKEntity associated with the node via a GKSCNNodeComponent.
     *
     * @see GKEntity
     */
    @Generated
    @Selector("entity")
    public native GKEntity entity();

    /**
     * [@property] focusBehavior
     * <p>
     * Controls the behavior of the receiver regarding the UIFocus system. Defaults to SCNNodeFocusBehaviorNone.
     */
    @Generated
    @Selector("focusBehavior")
    @NInt
    public native long focusBehavior();

    /**
     * [@property] localFront
     * <p>
     * The local unit -Z axis (0, 0, -1).
     */
    @Generated
    @Selector("localFront")
    @ByValue
    public static native SCNVector3 localFront();

    /**
     * [@property] localRight
     * <p>
     * The local unit X axis (1, 0, 0).
     */
    @Generated
    @Selector("localRight")
    @ByValue
    public static native SCNVector3 localRight();

    /**
     * Apply a the given rotation to the current one.
     *
     * @param rotation rotation in local space.
     */
    @Generated
    @Selector("localRotateBy:")
    public native void localRotateBy(@ByValue SCNVector4 rotation);

    /**
     * Translate the current node position along the given vector in local space.
     *
     * @param translation the translation in local space.
     */
    @Generated
    @Selector("localTranslateBy:")
    public native void localTranslateBy(@ByValue SCNVector3 translation);

    /**
     * [@property] localUp
     * <p>
     * The local unit Y axis (0, 1, 0).
     */
    @Generated
    @Selector("localUp")
    @ByValue
    public static native SCNVector3 localUp();

    /**
     * Convenience for calling lookAt:up:localFront: with worldUp set to `self.worldUp`
     * and localFront [SCNNode localFront].
     *
     * @param worldTarget target position in world space.
     */
    @Generated
    @Selector("lookAt:")
    public native void lookAt(@ByValue SCNVector3 worldTarget);

    /**
     * Set the orientation of the node so its front vector is pointing toward a given
     * target. Using a reference up vector in world space and a front vector in
     * local space.
     *
     * @param worldTarget position in world space.
     * @param worldUp     the up vector in world space.
     * @param localFront  the front vector in local space.
     */
    @Generated
    @Selector("lookAt:up:localFront:")
    public native void lookAtUpLocalFront(@ByValue SCNVector3 worldTarget, @ByValue SCNVector3 worldUp,
            @ByValue SCNVector3 localFront);

    @Generated
    @Selector("preferredFocusEnvironments")
    public native NSArray<?> preferredFocusEnvironments();

    @Generated
    @IsOptional
    @Selector("preferredFocusedView")
    public native UIView preferredFocusedView();

    @Generated
    @Selector("removeAnimationForKey:blendOutDuration:")
    public native void removeAnimationForKeyBlendOutDuration(String key, @NFloat double duration);

    /**
     * Apply a rotation relative to a target point in parent space.
     *
     * @param worldRotation rotation to apply in world space.
     * @param worldTarget   position of the target in world space.
     */
    @Generated
    @Selector("rotateBy:aroundTarget:")
    public native void rotateByAroundTarget(@ByValue SCNVector4 worldRotation, @ByValue SCNVector3 worldTarget);

    /**
     * The GKEntity associated with the node via a GKSCNNodeComponent.
     *
     * @see GKEntity
     */
    @Generated
    @Selector("setEntity:")
    public native void setEntity_unsafe(GKEntity value);

    /**
     * The GKEntity associated with the node via a GKSCNNodeComponent.
     *
     * @see GKEntity
     */
    @Generated
    public void setEntity(GKEntity value) {
        Object __old = entity();
        if (value != null) {
            org.moe.natj.objc.ObjCRuntime.associateObjCObject(this, value);
        }
        setEntity_unsafe(value);
        if (__old != null) {
            org.moe.natj.objc.ObjCRuntime.dissociateObjCObject(this, __old);
        }
    }

    /**
     * [@property] focusBehavior
     * <p>
     * Controls the behavior of the receiver regarding the UIFocus system. Defaults to SCNNodeFocusBehaviorNone.
     */
    @Generated
    @Selector("setFocusBehavior:")
    public native void setFocusBehavior(@NInt long value);

    @Generated
    @Selector("setNeedsFocusUpdate")
    public native void setNeedsFocusUpdate();

    /**
     * [@property] worldOrientation
     * <p>
     * Determines the receiver's orientation in world space (relative to the scene's root node). Animatable.
     */
    @Generated
    @Selector("setWorldOrientation:")
    public native void setWorldOrientation(@ByValue SCNVector4 value);

    /**
     * [@property] worldPosition
     * <p>
     * Determines the receiver's position in world space (relative to the scene's root node).
     */
    @Generated
    @Selector("setWorldPosition:")
    public native void setWorldPosition(@ByValue SCNVector3 value);

    @Generated
    @Selector("setWorldTransform:")
    public native void setWorldTransform(@ByValue SCNMatrix4 worldTransform);

    @Generated
    @Selector("shouldUpdateFocusInContext:")
    public native boolean shouldUpdateFocusInContext(UIFocusUpdateContext context);

    @Generated
    @Selector("updateFocusIfNeeded")
    public native void updateFocusIfNeeded();

    /**
     * [@property] worldFront
     * <p>
     * The local unit -Z axis (0, 0, -1) in world space.
     */
    @Generated
    @Selector("worldFront")
    @ByValue
    public native SCNVector3 worldFront();

    /**
     * [@property] worldOrientation
     * <p>
     * Determines the receiver's orientation in world space (relative to the scene's root node). Animatable.
     */
    @Generated
    @Selector("worldOrientation")
    @ByValue
    public native SCNVector4 worldOrientation();

    /**
     * [@property] worldPosition
     * <p>
     * Determines the receiver's position in world space (relative to the scene's root node).
     */
    @Generated
    @Selector("worldPosition")
    @ByValue
    public native SCNVector3 worldPosition();

    /**
     * [@property] worldRight
     * <p>
     * The local unit X axis (1, 0, 0) in world space.
     */
    @Generated
    @Selector("worldRight")
    @ByValue
    public native SCNVector3 worldRight();

    /**
     * [@property] worldUp
     * <p>
     * The local unit Y axis (0, 1, 0) in world space.
     */
    @Generated
    @Selector("worldUp")
    @ByValue
    public native SCNVector3 worldUp();

    @Generated
    @IsOptional
    @Selector("didHintFocusMovement:")
    public native void didHintFocusMovement(UIFocusMovementHint hint);

    @Generated
    @Selector("focusItemContainer")
    @MappedReturn(ObjCObjectMapper.class)
    public native UIFocusItemContainer focusItemContainer();

    @Generated
    @Selector("frame")
    @ByValue
    public native CGRect frame();

    @Generated
    @Selector("parentFocusEnvironment")
    @MappedReturn(ObjCObjectMapper.class)
    public native UIFocusEnvironment parentFocusEnvironment();

    @Generated
    @IsOptional
    @Selector("focusGroupIdentifier")
    public native String focusGroupIdentifier();

    @Generated
    @IsOptional
    @Selector("focusEffect")
    public native UIFocusEffect focusEffect();

    @Generated
    @IsOptional
    @Selector("focusGroupPriority")
    @NInt
    public native long focusGroupPriority();

    @Generated
    @IsOptional
    @Selector("isTransparentFocusItem")
    public native boolean isTransparentFocusItem();

    @Generated
    @Selector("removeAllAnimationsWithBlendOutDuration:")
    public native void removeAllAnimationsWithBlendOutDuration(@NFloat double duration);
}

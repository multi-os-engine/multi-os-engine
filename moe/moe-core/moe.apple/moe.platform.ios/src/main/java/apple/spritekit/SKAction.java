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
import apple.coregraphics.opaque.CGPathRef;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSNumber;
import apple.foundation.NSSet;
import apple.foundation.NSURL;
import apple.foundation.protocol.NSCopying;
import apple.foundation.protocol.NSSecureCoding;
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
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import apple.corefoundation.struct.CGPoint;
import apple.corefoundation.struct.CGSize;
import apple.corefoundation.struct.CGVector;

/**
 * An SKAction object is an action that is executed by a node in the scene.
 * Actions are most often used to change the structure and content of the node to
 * which they are attached, but can also make other changes to the scene. When
 * the scene processes its nodes, actions associated with those nodes are evaluated.
 */
@Generated
@Library("SpriteKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class SKAction extends NSObject implements NSCopying, NSSecureCoding {
    static {
        NatJ.register();
    }

    @Generated
    protected SKAction(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    /**
     * Creates an action of the given name from an action file.
     * 
     * @param name The name of the action
     * 
     *             API-Since: 9.0
     */
    @Generated
    @Selector("actionNamed:")
    public static native SKAction actionNamed(String name);

    /**
     * Creates an action of the given name from an action file with a new duration.
     * 
     * @param name     The name of the action
     * @param duration The duration of the action
     * 
     *                 API-Since: 9.0
     */
    @Generated
    @Selector("actionNamed:duration:")
    public static native SKAction actionNamedDuration(String name, double duration);

    /**
     * Creates an action of the given name from an action file.
     * 
     * @param name The name of the action
     * @param url  The url of the file containing the action
     * 
     *             API-Since: 9.0
     */
    @Generated
    @Selector("actionNamed:fromURL:")
    public static native SKAction actionNamedFromURL(String name, NSURL url);

    /**
     * Creates an action of the given name from an action file with a new duration.
     * 
     * @param name     The name of the action
     * @param url      The url of the file containing the action
     * @param duration The duration of the action
     * 
     *                 API-Since: 9.0
     */
    @Generated
    @Selector("actionNamed:fromURL:duration:")
    public static native SKAction actionNamedFromURLDuration(String name, NSURL url, double duration);

    @Generated
    @Owned
    @Selector("alloc")
    public static native SKAction alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native SKAction allocWithZone(VoidPtr zone);

    /**
     * API-Since: 9.0
     */
    @Generated
    @Selector("animateWithNormalTextures:timePerFrame:")
    public static native SKAction animateWithNormalTexturesTimePerFrame(NSArray<? extends SKTexture> textures,
            double sec);

    /**
     * API-Since: 9.0
     */
    @Generated
    @Selector("animateWithNormalTextures:timePerFrame:resize:restore:")
    public static native SKAction animateWithNormalTexturesTimePerFrameResizeRestore(
            NSArray<? extends SKTexture> textures, double sec, boolean resize, boolean restore);

    /**
     * Creates an action that animates changes to a sprite’s texture
     * 
     * @param textures An array of textures to use when animating a sprite
     * @param sec      The amount of time that each texture is displayed
     */
    @Generated
    @Selector("animateWithTextures:timePerFrame:")
    public static native SKAction animateWithTexturesTimePerFrame(NSArray<? extends SKTexture> textures, double sec);

    /**
     * Creates an action that animates changes to a sprite’s texture
     * 
     * @param textures An array of textures to use when animating a sprite
     * @param sec      The amount of time that each texture is displayed
     * @param resize   If YES, the sprite is resized to match each new texture.
     *                 If NO, the size of the sprite remains at a constant size.
     * @param restore  If YES, When the action completes, the sprite’s texture is restored
     *                 to the texture it had before the action completed. (If the
     *                 resize parameter is YES, the sprite is resized to match the
     *                 size of the original texture.
     *                 If NO, when the action completes the sprite’s texture remains
     *                 set to the final texture in the array.
     */
    @Generated
    @Selector("animateWithTextures:timePerFrame:resize:restore:")
    public static native SKAction animateWithTexturesTimePerFrameResizeRestore(NSArray<? extends SKTexture> textures,
            double sec, boolean resize, boolean restore);

    /**
     * Animate through an array of warps
     * 
     * The numberOfColumns and numberOfRows must match for all warps.
     * Times are specified in seconds and must be increasing values.
     * 
     * API-Since: 10.0
     */
    @Generated
    @Selector("animateWithWarps:times:")
    public static native SKAction animateWithWarpsTimes(NSArray<? extends SKWarpGeometry> warps,
            NSArray<? extends NSNumber> times);

    /**
     * Animate through an array of warps
     * 
     * The numberOfColumns and numberOfRows must match for all warps.
     * Times are specified in seconds and must be increasing values.
     * Optionally restore the original node's warpGeometry from before the action.
     * 
     * API-Since: 10.0
     */
    @Generated
    @Selector("animateWithWarps:times:restore:")
    public static native SKAction animateWithWarpsTimesRestore(NSArray<? extends SKWarpGeometry> warps,
            NSArray<? extends NSNumber> times, boolean restore);

    /**
     * API-Since: 9.0
     */
    @Generated
    @Selector("applyAngularImpulse:duration:")
    public static native SKAction applyAngularImpulseDuration(@NFloat double impulse, double duration);

    /**
     * API-Since: 9.0
     */
    @Generated
    @Selector("applyForce:atPoint:duration:")
    public static native SKAction applyForceAtPointDuration(@ByValue CGVector force, @ByValue CGPoint point,
            double duration);

    /**
     * API-Since: 9.0
     */
    @Generated
    @Selector("applyForce:duration:")
    public static native SKAction applyForceDuration(@ByValue CGVector force, double duration);

    /**
     * API-Since: 9.0
     */
    @Generated
    @Selector("applyImpulse:atPoint:duration:")
    public static native SKAction applyImpulseAtPointDuration(@ByValue CGVector impulse, @ByValue CGPoint point,
            double duration);

    /**
     * API-Since: 9.0
     */
    @Generated
    @Selector("applyImpulse:duration:")
    public static native SKAction applyImpulseDuration(@ByValue CGVector impulse, double duration);

    /**
     * API-Since: 9.0
     */
    @Generated
    @Selector("applyTorque:duration:")
    public static native SKAction applyTorqueDuration(@NFloat double torque, double duration);

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

    /**
     * API-Since: 9.0
     */
    @Generated
    @Selector("changeChargeBy:duration:")
    public static native SKAction changeChargeByDuration(float v, double duration);

    /**
     * API-Since: 9.0
     */
    @Generated
    @Selector("changeChargeTo:duration:")
    public static native SKAction changeChargeToDuration(float v, double duration);

    /**
     * API-Since: 9.0
     */
    @Generated
    @Selector("changeMassBy:duration:")
    public static native SKAction changeMassByDuration(float v, double duration);

    /**
     * API-Since: 9.0
     */
    @Generated
    @Selector("changeMassTo:duration:")
    public static native SKAction changeMassToDuration(float v, double duration);

    /**
     * API-Since: 9.0
     */
    @Generated
    @Selector("changeObstructionBy:duration:")
    public static native SKAction changeObstructionByDuration(float v, double duration);

    /**
     * API-Since: 9.0
     */
    @Generated
    @Selector("changeObstructionTo:duration:")
    public static native SKAction changeObstructionToDuration(float v, double duration);

    /**
     * API-Since: 9.0
     */
    @Generated
    @Selector("changeOcclusionBy:duration:")
    public static native SKAction changeOcclusionByDuration(float v, double duration);

    /**
     * API-Since: 9.0
     */
    @Generated
    @Selector("changeOcclusionTo:duration:")
    public static native SKAction changeOcclusionToDuration(float v, double duration);

    /**
     * API-Since: 9.0
     */
    @Generated
    @Selector("changePlaybackRateBy:duration:")
    public static native SKAction changePlaybackRateByDuration(float v, double duration);

    /**
     * API-Since: 9.0
     */
    @Generated
    @Selector("changePlaybackRateTo:duration:")
    public static native SKAction changePlaybackRateToDuration(float v, double duration);

    /**
     * API-Since: 9.0
     */
    @Generated
    @Selector("changeReverbBy:duration:")
    public static native SKAction changeReverbByDuration(float v, double duration);

    /**
     * API-Since: 9.0
     */
    @Generated
    @Selector("changeReverbTo:duration:")
    public static native SKAction changeReverbToDuration(float v, double duration);

    /**
     * API-Since: 9.0
     */
    @Generated
    @Selector("changeVolumeBy:duration:")
    public static native SKAction changeVolumeByDuration(float v, double duration);

    /**
     * API-Since: 9.0
     */
    @Generated
    @Selector("changeVolumeTo:duration:")
    public static native SKAction changeVolumeToDuration(float v, double duration);

    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @Generated
    @Selector("classForKeyedUnarchiver")
    public static native Class classForKeyedUnarchiver();

    /**
     * Creates an animation that animates a sprite’s color and blend factor
     * 
     * @param color            The new color for the sprite
     * @param colorBlendFactor The new blend factor for the sprite
     * @param duration         The duration of the animation, in seconds
     */
    @Generated
    @Selector("colorizeWithColor:colorBlendFactor:duration:")
    public static native SKAction colorizeWithColorColorBlendFactorDuration(UIColor color,
            @NFloat double colorBlendFactor, double duration);

    @Generated
    @Selector("colorizeWithColorBlendFactor:duration:")
    public static native SKAction colorizeWithColorBlendFactorDuration(@NFloat double colorBlendFactor, double sec);

    /**
     * Creates an action that executes a block over a duration
     * 
     * @param duration The duration of the animation, in seconds
     * @param block    The block to run. The block takes the following parameters:
     *                 node The node on which the action is running.
     *                 elapsedTime The amount of time that has passed in the animation.
     */
    @Generated
    @Selector("customActionWithDuration:actionBlock:")
    public static native SKAction customActionWithDurationActionBlock(double duration,
            @ObjCBlock(name = "call_customActionWithDurationActionBlock") Block_customActionWithDurationActionBlock block);

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * Creates an action that adjusts the alpha value of a node by a relative value
     * 
     * @param factor   The amount to modify the node’s alpha value
     * @param duration The duration of the animation, in seconds
     */
    @Generated
    @Selector("fadeAlphaBy:duration:")
    public static native SKAction fadeAlphaByDuration(@NFloat double factor, double duration);

    /**
     * Creates an action that adjusts the alpha value of a node to a new value
     * 
     * @param alpha    The new value of the node’s alpha
     * @param duration The duration of the animation, in seconds
     */
    @Generated
    @Selector("fadeAlphaTo:duration:")
    public static native SKAction fadeAlphaToDuration(@NFloat double alpha, double duration);

    /**
     * Creates an action that changes the alpha value of the node to 1.0
     * 
     * @param duration The duration of the animation, in seconds
     */
    @Generated
    @Selector("fadeInWithDuration:")
    public static native SKAction fadeInWithDuration(double duration);

    /**
     * Creates an action that changes the alpha value of the node to 0.0
     * 
     * @param duration The duration of the animation, in seconds
     */
    @Generated
    @Selector("fadeOutWithDuration:")
    public static native SKAction fadeOutWithDuration(double duration);

    /**
     * Creates an action that sets the falloff of a field
     * 
     * @param falloff  The value to modify falloff by
     * @param duration The duration of the animation, in seconds
     * @see SKFieldNode
     * 
     *      API-Since: 8.0
     */
    @Generated
    @Selector("falloffBy:duration:")
    public static native SKAction falloffByDuration(float falloff, double duration);

    /**
     * Creates an action that sets the falloff of a field
     * 
     * @param falloff  The new value for falloff
     * @param duration The duration of the animation, in seconds
     * @see SKFieldNode
     * 
     *      API-Since: 8.0
     */
    @Generated
    @Selector("falloffTo:duration:")
    public static native SKAction falloffToDuration(float falloff, double duration);

    /**
     * Creates an action that moves the node along a path
     * 
     * @param path     A Core Graphics path whose coordinates are relative to the node’s
     *                 current position
     * @param offset   If YES, the points in the path are relative offsets to the
     *                 node’s starting position. If NO, the points in the node are absolute
     *                 coordinate values.
     * @param orient   If YES, the node’s zRotation property animates so that
     *                 the node turns to follow the path. If NO, the zRotation property of
     *                 the node is unchanged.
     * @param duration The duration of the animation
     */
    @Generated
    @Selector("followPath:asOffset:orientToPath:duration:")
    public static native SKAction followPathAsOffsetOrientToPathDuration(CGPathRef path, boolean offset, boolean orient,
            double duration);

    @Generated
    @Selector("followPath:asOffset:orientToPath:speed:")
    public static native SKAction followPathAsOffsetOrientToPathSpeed(CGPathRef path, boolean offset, boolean orient,
            @NFloat double speed);

    /**
     * Creates an action that moves the node along a relative path, orienting the
     * node to the path
     * 
     * @param path     A Core Graphics path whose coordinates are relative to the node’s
     *                 current position
     * @param duration The duration of the animation, in seconds
     */
    @Generated
    @Selector("followPath:duration:")
    public static native SKAction followPathDuration(CGPathRef path, double duration);

    /**
     * Creates an action that moves the node along a relative path, orienting the
     * node to the path
     * 
     * @param path  A Core Graphics path whose coordinates are relative to the node’s
     *              current position
     * @param speed The speed in pixels per second to move along the path
     */
    @Generated
    @Selector("followPath:speed:")
    public static native SKAction followPathSpeed(CGPathRef path, @NFloat double speed);

    /**
     * Creates an action that runs a collection of actions concurrently
     * 
     * When the action executes, the actions that comprise the group
     * all start immediately and run in parallel. The duration of the group
     * action is the longest duration among the collection of actions. If an
     * action in the group has a duration less than the group’s duration, the
     * action completes, then idles until the group completes the remaining
     * actions. This matters most when creating a repeating action that repeats
     * a group.
     * 
     * @param actions An array of SKAction objects
     */
    @Generated
    @Selector("group:")
    public static native SKAction group(NSArray<? extends SKAction> actions);

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    /**
     * Creates an action that hides a node
     * 
     * API-Since: 8.0
     */
    @Generated
    @Selector("hide")
    public static native SKAction hide();

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

    /**
     * Creates an action that moves a node relative to its current position
     * 
     * @param delta    A vector that describes the change to apply to the node’s position
     * @param duration The duration of the animation, in seconds
     */
    @Generated
    @Selector("moveBy:duration:")
    public static native SKAction moveByDuration(@ByValue CGVector delta, double duration);

    @Generated
    @Selector("moveByX:y:duration:")
    public static native SKAction moveByXYDuration(@NFloat double deltaX, @NFloat double deltaY, double duration);

    /**
     * Creates an action that moves a node to a new position
     * 
     * @param location The coordinates for the node’s new position
     * @param duration The duration of the animation, in seconds
     */
    @Generated
    @Selector("moveTo:duration:")
    public static native SKAction moveToDuration(@ByValue CGPoint location, double duration);

    @Generated
    @Selector("moveToX:duration:")
    public static native SKAction moveToXDuration(@NFloat double x, double duration);

    @Generated
    @Selector("moveToY:duration:")
    public static native SKAction moveToYDuration(@NFloat double y, double duration);

    @Generated
    @Owned
    @Selector("new")
    public static native SKAction new_objc();

    /**
     * API-Since: 9.0
     */
    @Generated
    @Selector("pause")
    public static native SKAction pause();

    /**
     * Creates an action that calls a method on an object
     * 
     * @param selector The selector of the method to call
     * @param target   The target object
     */
    @Generated
    @Selector("performSelector:onTarget:")
    public static native SKAction performSelectorOnTarget(SEL selector, @Mapped(ObjCObjectMapper.class) Object target);

    /**
     * API-Since: 9.0
     */
    @Generated
    @Selector("play")
    public static native SKAction play();

    /**
     * Creates an action that plays a sound
     * 
     * The file name must be the name or path of a file of a platform
     * supported audio file format. Use a LinearPCM format audio file with 8 or 16 bits
     * per channel for best performance
     * 
     * @param soundFile The name of a sound file in the app’s bundle
     * @param wait      If YES, then the duration of this action is the same
     *                  as the length of the audio playback. If NO, the action is considered
     *                  to have completed immediately.
     */
    @Generated
    @Selector("playSoundFileNamed:waitForCompletion:")
    public static native SKAction playSoundFileNamedWaitForCompletion(String soundFile, boolean wait_);

    /**
     * Creates an action that performs an inverse kinematic reach.
     * This action must be run on a descendent of the rootNode for animation to occur.
     * Running this action on the rootNode itself will not cause any animation to occur.
     * 
     * @param position The position (in screen space) to reach for
     * @param root     Where to start the inverse kinematic operation from
     * @param duration The duration of the animation, in seconds
     * 
     *                 API-Since: 8.0
     */
    @Generated
    @Selector("reachTo:rootNode:duration:")
    public static native SKAction reachToRootNodeDuration(@ByValue CGPoint position, SKNode root, double duration);

    /**
     * Creates an action that performs an inverse kinematic reach.
     * This action must be run on a descendent of the rootNode for animation to occur.
     * Running this action on the rootNode itself will not cause any animation to occur.
     * 
     * @param position The position (in screen space) to reach for
     * @param root     Where to start the inverse kinematic operation from
     * @param velocity The speed in points per second of the end node in the chain
     * 
     *                 API-Since: 8.0
     */
    @Generated
    @Selector("reachTo:rootNode:velocity:")
    public static native SKAction reachToRootNodeVelocity(@ByValue CGPoint position, SKNode root,
            @NFloat double velocity);

    /**
     * Creates an action that performs an inverse kinematic reach.
     * This action must be run on a descendent of the rootNode for animation to occur.
     * Running this action on the rootNode itself will not cause any animation to occur.
     * 
     * @param node The node to reach for
     * @param root Where to start the inverse kinematic operation from
     * @param sec  The duration of the animation, in seconds
     * 
     *             API-Since: 8.0
     */
    @Generated
    @Selector("reachToNode:rootNode:duration:")
    public static native SKAction reachToNodeRootNodeDuration(SKNode node, SKNode root, double sec);

    /**
     * Creates an action that performs an inverse kinematic reach.
     * This action must be run on a descendent of the rootNode for animation to occur.
     * Running this action on the rootNode itself will not cause any animation to occur.
     * 
     * @param node     The node to reach for
     * @param root     Where to start the inverse kinematic operation from
     * @param velocity The speed in points per second of the end node in the chain
     * 
     *                 API-Since: 8.0
     */
    @Generated
    @Selector("reachToNode:rootNode:velocity:")
    public static native SKAction reachToNodeRootNodeVelocity(SKNode node, SKNode root, @NFloat double velocity);

    /**
     * Creates an action that removes the node from its parent
     */
    @Generated
    @Selector("removeFromParent")
    public static native SKAction removeFromParent();

    /**
     * Creates an action that repeats another action a specified number of times
     * 
     * @param action The action to execute
     * @param count  The number of times to execute the action
     */
    @Generated
    @Selector("repeatAction:count:")
    public static native SKAction repeatActionCount(SKAction action, @NUInt long count);

    /**
     * Creates an action that repeats forever
     * 
     * @param action The action to execute
     */
    @Generated
    @Selector("repeatActionForever:")
    public static native SKAction repeatActionForever(SKAction action);

    /**
     * Creates an action that adjusts the size of a sprite
     * 
     * @param width    The amount to add to the sprite’s width
     * @param height   The amount to add to the sprite’s height
     * @param duration The duration of the animation, in seconds
     */
    @Generated
    @Selector("resizeByWidth:height:duration:")
    public static native SKAction resizeByWidthHeightDuration(@NFloat double width, @NFloat double height,
            double duration);

    @Generated
    @Selector("resizeToHeight:duration:")
    public static native SKAction resizeToHeightDuration(@NFloat double height, double duration);

    @Generated
    @Selector("resizeToWidth:duration:")
    public static native SKAction resizeToWidthDuration(@NFloat double width, double duration);

    /**
     * Creates an action that changes the width and height of a sprite to a new absolute value
     * 
     * @param width    The new width of the sprite
     * @param height   The new height of the sprite
     * @param duration The duration of the animation, in seconds
     */
    @Generated
    @Selector("resizeToWidth:height:duration:")
    public static native SKAction resizeToWidthHeightDuration(@NFloat double width, @NFloat double height,
            double duration);

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * Creates an action that rotates the node by a relative value
     * 
     * @param radians  The amount to rotate the node, in radians
     * @param duration The duration of the animation, in seconds
     */
    @Generated
    @Selector("rotateByAngle:duration:")
    public static native SKAction rotateByAngleDuration(@NFloat double radians, double duration);

    /**
     * Creates an action that rotates the node counterclockwise to an absolute angle
     * 
     * @param radians  The angle to rotate the node to, in radians
     * @param duration The duration of the animation
     */
    @Generated
    @Selector("rotateToAngle:duration:")
    public static native SKAction rotateToAngleDuration(@NFloat double radians, double duration);

    /**
     * Creates an action that rotates the node to an absolute value
     * 
     * @param radians         The angle to rotate the node to, in radians
     * @param duration        The duration of the animation, in seconds
     * @param shortestUnitArc If YES, then the rotation is performed in whichever
     *                        direction results in the smallest rotation. If NO, then the rotation
     *                        is interpolated
     */
    @Generated
    @Selector("rotateToAngle:duration:shortestUnitArc:")
    public static native SKAction rotateToAngleDurationShortestUnitArc(@NFloat double radians, double duration,
            boolean shortestUnitArc);

    /**
     * Creates an action that runs an action on a named child object
     * 
     * @param action the action to run
     * @param name   the name of a child object
     * @see SKNode.name
     */
    @Generated
    @Selector("runAction:onChildWithName:")
    public static native SKAction runActionOnChildWithName(SKAction action, String name);

    /**
     * Creates an action that executes a block
     * 
     * @param block The block to run
     */
    @Generated
    @Selector("runBlock:")
    public static native SKAction runBlock(@ObjCBlock(name = "call_runBlock") Block_runBlock block);

    /**
     * Creates an action that executes a block
     * 
     * @param block The block to run
     * @param queue The queue to perform the action on
     */
    @Generated
    @Selector("runBlock:queue:")
    public static native SKAction runBlockQueue(@ObjCBlock(name = "call_runBlockQueue") Block_runBlockQueue block,
            NSObject queue);

    /**
     * Creates an action that changes the x and y scale values of a node by a relative value
     * 
     * @param scale    The amount to modify to the node’s x and y scale values
     * @param duration The duration of the animation, in seconds
     */
    @Generated
    @Selector("scaleBy:duration:")
    public static native SKAction scaleByDuration(@NFloat double scale, double duration);

    /**
     * Creates an action that changes the x and y scale values of a node by a relative value
     * 
     * @param scale    The new value for the node’s x and y scale values
     * @param duration The duration of the animation, in seconds
     */
    @Generated
    @Selector("scaleTo:duration:")
    public static native SKAction scaleToDuration(@NFloat double scale, double duration);

    /**
     * Adjust the sprite's xScale & yScale to achieve the desired size (in parent's coordinate space)
     * 
     * @param duration The duration of the animation, in seconds
     * 
     *                 API-Since: 10.0
     */
    @Generated
    @Selector("scaleToSize:duration:")
    public static native SKAction scaleToSizeDuration(@ByValue CGSize size, double duration);

    @Generated
    @Selector("scaleXBy:y:duration:")
    public static native SKAction scaleXByYDuration(@NFloat double xScale, @NFloat double yScale, double duration);

    @Generated
    @Selector("scaleXTo:duration:")
    public static native SKAction scaleXToDuration(@NFloat double scale, double duration);

    @Generated
    @Selector("scaleXTo:y:duration:")
    public static native SKAction scaleXToYDuration(@NFloat double xScale, @NFloat double yScale, double duration);

    @Generated
    @Selector("scaleYTo:duration:")
    public static native SKAction scaleYToDuration(@NFloat double scale, double duration);

    /**
     * Creates an action that runs a collection of actions sequentially
     * 
     * When the action executes, the first action in the sequence starts
     * and runs to completion. Subsequent actions in the sequence run in a
     * similar fashion until all of the actions in the sequence have executed.
     * The duration of the sequence action is the sum of the durations of the
     * actions in the sequence.
     * 
     * This action is reversible; it creates a new sequence action that reverses
     * the order of the actions. Each action in the reversed sequence is itself
     * reversed. For example, if an action sequence is {1,2,3}, the reversed
     * sequence would be {3R,2R,1R}.
     * 
     * @param actions An array of SKAction objects
     */
    @Generated
    @Selector("sequence:")
    public static native SKAction sequence(NSArray<? extends SKAction> actions);

    /**
     * API-Since: 9.0
     */
    @Generated
    @Selector("setNormalTexture:")
    public static native SKAction setNormalTexture(SKTexture texture);

    /**
     * API-Since: 9.0
     */
    @Generated
    @Selector("setNormalTexture:resize:")
    public static native SKAction setNormalTextureResize(SKTexture texture, boolean resize);

    /**
     * Creates an action that changes a sprite’s texture
     * 
     * @param texture The new texture to use on the sprite
     * 
     *                API-Since: 7.1
     */
    @Generated
    @Selector("setTexture:")
    public static native SKAction setTexture(SKTexture texture);

    /**
     * Creates an action that changes a sprite’s texture, possibly resizing the sprite
     * 
     * @param texture The new texture to use on the sprite
     * @param resize  If YES, the sprite is resized to match the new texture.
     *                If NO, the size of the sprite is unchanged.
     * 
     *                API-Since: 7.1
     */
    @Generated
    @Selector("setTexture:resize:")
    public static native SKAction setTextureResize(SKTexture texture, boolean resize);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * Creates an action that changes how fast the node executes actions by a
     * relative value
     * 
     * @param speed    amount to modify the speed by
     * @param duration The duration of the animation, in seconds
     */
    @Generated
    @Selector("speedBy:duration:")
    public static native SKAction speedByDuration(@NFloat double speed, double duration);

    /**
     * Creates an action that changes how fast the node executes actions
     * 
     * @param speed    The new value for the node’s speed
     * @param duration The duration of the animation, in seconds
     */
    @Generated
    @Selector("speedTo:duration:")
    public static native SKAction speedToDuration(@NFloat double speed, double duration);

    /**
     * API-Since: 9.0
     */
    @Generated
    @Selector("stereoPanBy:duration:")
    public static native SKAction stereoPanByDuration(float v, double duration);

    /**
     * API-Since: 9.0
     */
    @Generated
    @Selector("stereoPanTo:duration:")
    public static native SKAction stereoPanToDuration(float v, double duration);

    /**
     * API-Since: 9.0
     */
    @Generated
    @Selector("stop")
    public static native SKAction stop();

    /**
     * Creates an action that sets the strength of a field
     * 
     * @param strength The value to modify strength by
     * @param duration The duration of the animation, in seconds
     * @see SKFieldNode
     * 
     *      API-Since: 8.0
     */
    @Generated
    @Selector("strengthBy:duration:")
    public static native SKAction strengthByDuration(float strength, double duration);

    /**
     * Creates an action that sets the strength of a field
     * 
     * @param strength The new value for strength
     * @param duration The duration of the animation, in seconds
     * @see SKFieldNode
     * 
     *      API-Since: 8.0
     */
    @Generated
    @Selector("strengthTo:duration:")
    public static native SKAction strengthToDuration(float strength, double duration);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    /**
     * Creates an action that unhides a node
     * 
     * API-Since: 8.0
     */
    @Generated
    @Selector("unhide")
    public static native SKAction unhide();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * Creates an action that idles for a specified period of time
     * 
     * @param duration The duration of the idle, in seconds
     */
    @Generated
    @Selector("waitForDuration:")
    public static native SKAction waitForDuration(double duration);

    /**
     * Creates an action that idles for a randomized period of time
     * 
     * @param duration      The duration of the idle, in seconds
     * @param durationRange The range of possible values for the duration
     */
    @Generated
    @Selector("waitForDuration:withRange:")
    public static native SKAction waitForDurationWithRange(double duration, double durationRange);

    /**
     * Animate from the node's current warpGeometry to a new one over the specified duration.
     * 
     * If the numberOfColumns and numberOfRows match, a smooth interpolation will be performed
     * from the node current warp.
     * 
     * API-Since: 10.0
     */
    @Generated
    @Selector("warpTo:duration:")
    public static native SKAction warpToDuration(SKWarpGeometry warp, double duration);

    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(VoidPtr zone);

    /**
     * The duration required to complete an action, in seconds.
     */
    @Generated
    @Selector("duration")
    public native double duration();

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(NSCoder coder);

    @Generated
    @Selector("init")
    public native SKAction init();

    @Generated
    @Selector("initWithCoder:")
    public native SKAction initWithCoder(NSCoder coder);

    /**
     * Creates an action that reverses the behavior of another action
     * 
     * @return This method always returns an action object; however, not all actions
     *         are reversible
     */
    @Generated
    @Selector("reversedAction")
    public native SKAction reversedAction();

    /**
     * The duration required to complete an action, in seconds.
     */
    @Generated
    @Selector("setDuration:")
    public native void setDuration(double value);

    /**
     * A speed factor that modifies how fast an action runs. Default value is 1.0
     */
    @Generated
    @Selector("setSpeed:")
    public native void setSpeed(@NFloat double value);

    /**
     * When set, prodives a custom timing via a block. Applies after
     * the 'timingMode' property is taken into account, defaults to nil
     * 
     * @see SKActionTimingFunction
     * 
     *      API-Since: 8.0
     */
    @Generated
    @Selector("setTimingFunction:")
    public native void setTimingFunction(@ObjCBlock(name = "call_setTimingFunction") Block_setTimingFunction value);

    /**
     * The timing mode used to execute an action
     * 
     * @see SKActionTimingMode
     */
    @Generated
    @Selector("setTimingMode:")
    public native void setTimingMode(@NInt long value);

    /**
     * A speed factor that modifies how fast an action runs. Default value is 1.0
     */
    @Generated
    @Selector("speed")
    @NFloat
    public native double speed();

    /**
     * When set, prodives a custom timing via a block. Applies after
     * the 'timingMode' property is taken into account, defaults to nil
     * 
     * @see SKActionTimingFunction
     * 
     *      API-Since: 8.0
     */
    @Generated
    @Selector("timingFunction")
    @ObjCBlock(name = "call_timingFunction_ret")
    public native Block_timingFunction_ret timingFunction();

    /**
     * The timing mode used to execute an action
     * 
     * @see SKActionTimingMode
     */
    @Generated
    @Selector("timingMode")
    @NInt
    public native long timingMode();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_customActionWithDurationActionBlock {
        @Generated
        void call_customActionWithDurationActionBlock(SKNode node, @NFloat double elapsedTime);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_runBlock {
        @Generated
        void call_runBlock();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_runBlockQueue {
        @Generated
        void call_runBlockQueue();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setTimingFunction {
        @Generated
        float call_setTimingFunction(float time);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_timingFunction_ret {
        @Generated
        float call_timingFunction_ret(float time);
    }

    @Generated
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }
}

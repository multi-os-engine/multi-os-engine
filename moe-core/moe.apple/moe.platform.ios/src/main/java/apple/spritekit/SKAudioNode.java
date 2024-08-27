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
import apple.avfaudio.AVAudioNode;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.NSURL;
import apple.foundation.protocol.NSSecureCoding;
import apple.gameplaykit.GKPolygonObstacle;
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
 * A SpriteKit scene graph audio node that provides a way to link audio graphs to a SpriteKit scene.
 * The currently presented scene is responsible for mixing the audio from nodes in the scene.
 * 
 * Positional sounds will use their relative location and velocity to the scene's listener to apply distance
 * attenuation, doppler shift and pan.
 * 
 * @see AVAudio3DMixing
 * @see SKScene.listener
 * 
 *      API-Since: 9.0
 */
@Generated
@Library("SpriteKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class SKAudioNode extends SKNode implements NSSecureCoding {
    static {
        NatJ.register();
    }

    @Generated
    protected SKAudioNode(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native SKAudioNode alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native SKAudioNode allocWithZone(VoidPtr zone);

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
    public static native SKAudioNode new_objc();

    @Generated
    @Selector("node")
    public static native SKAudioNode node();

    @Generated
    @Selector("nodeWithFileNamed:")
    public static native SKAudioNode nodeWithFileNamed(@NotNull String filename);

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
     * Specifies whether the node is to automatically play sound when added to a scene.
     * If autoplaysLooped is NO, the node and its sound must be explicitly scheduled and played using
     * the scene's engine.
     * 
     * If YES, the node will automatically play sound when added to a scene.
     * 
     * Defaults to YES.
     * 
     * @see SKView.paused
     */
    @Generated
    @Selector("autoplayLooped")
    public native boolean autoplayLooped();

    /**
     * Sets or gets the current AVAudioNode used by this instance.
     */
    @Nullable
    @Generated
    @Selector("avAudioNode")
    public native AVAudioNode avAudioNode();

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(@NotNull NSCoder coder);

    @Generated
    @Selector("init")
    public native SKAudioNode init();

    /**
     * Creates a SpriteKit scene graph audio node from the given AVAudioNode.
     * 
     * @see AVAudioNode
     */
    @Generated
    @Selector("initWithAVAudioNode:")
    public native SKAudioNode initWithAVAudioNode(@Nullable AVAudioNode node);

    @Generated
    @Selector("initWithCoder:")
    public native SKAudioNode initWithCoder(@NotNull NSCoder aDecoder);

    /**
     * Convenience initializer that creates an AVAudioNode from the named audio asset in the main bundle.
     * 
     * @see initWithAVAudioNode
     */
    @Generated
    @Selector("initWithFileNamed:")
    public native SKAudioNode initWithFileNamed(@NotNull String name);

    /**
     * Convenience initializer that creates an AVAudioNode from the URL that contain a audio asset.
     * 
     * @see initWithAVAudioNode
     */
    @Generated
    @Selector("initWithURL:")
    public native SKAudioNode initWithURL(@NotNull NSURL url);

    /**
     * Marks the audio source as positional so that the audio mix considers relative position and velocity
     * with regards to the scene's current listener node.
     * 
     * @see AVAudio3DMixing
     * @see SKScene.listener
     */
    @Generated
    @Selector("isPositional")
    public native boolean isPositional();

    /**
     * Marks the audio source as positional so that the audio mix considers relative position and velocity
     * with regards to the scene's current listener node.
     * 
     * @see AVAudio3DMixing
     * @see SKScene.listener
     */
    @Generated
    @Selector("setPositional:")
    public native void setPositional(boolean value);

    /**
     * Specifies whether the node is to automatically play sound when added to a scene.
     * If autoplaysLooped is NO, the node and its sound must be explicitly scheduled and played using
     * the scene's engine.
     * 
     * If YES, the node will automatically play sound when added to a scene.
     * 
     * Defaults to YES.
     * 
     * @see SKView.paused
     */
    @Generated
    @Selector("setAutoplayLooped:")
    public native void setAutoplayLooped(boolean value);

    /**
     * Sets or gets the current AVAudioNode used by this instance.
     */
    @Generated
    @Selector("setAvAudioNode:")
    public native void setAvAudioNode(@Nullable AVAudioNode value);

    @Generated
    @Selector("nodeWithFileNamed:securelyWithClasses:andError:")
    public static native SKAudioNode nodeWithFileNamedSecurelyWithClassesAndError(@NotNull String filename,
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

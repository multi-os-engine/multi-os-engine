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
import apple.avfoundation.AVPlayer;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.NSURL;
import apple.gameplaykit.GKPolygonObstacle;
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
import apple.corefoundation.struct.CGPoint;
import apple.corefoundation.struct.CGSize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Generated
@Library("SpriteKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class SKVideoNode extends SKNode {
    static {
        NatJ.register();
    }

    @Generated
    protected SKVideoNode(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native SKVideoNode alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native SKVideoNode allocWithZone(VoidPtr zone);

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
    public static native SKVideoNode new_objc();

    @Generated
    @Selector("node")
    public static native SKVideoNode node();

    @Generated
    @Selector("nodeWithFileNamed:")
    public static native SKVideoNode nodeWithFileNamed(@NotNull String filename);

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
     * Create a video node from an AVPlayer. You can use the AVPlayer to control playback.
     */
    @NotNull
    @Generated
    @Selector("videoNodeWithAVPlayer:")
    public static native SKVideoNode videoNodeWithAVPlayer(@NotNull AVPlayer player);

    /**
     * API-Since: 9.0
     */
    @NotNull
    @Generated
    @Selector("videoNodeWithFileNamed:")
    public static native SKVideoNode videoNodeWithFileNamed(@NotNull String videoFile);

    /**
     * API-Since: 9.0
     */
    @NotNull
    @Generated
    @Selector("videoNodeWithURL:")
    public static native SKVideoNode videoNodeWithURL(@NotNull NSURL videoURL);

    /**
     * Create a video node from a file.
     * 
     * API-Since: 7.0
     * Deprecated-Since: 9.0
     */
    @NotNull
    @Generated
    @Deprecated
    @Selector("videoNodeWithVideoFileNamed:")
    public static native SKVideoNode videoNodeWithVideoFileNamed(@NotNull String videoFile);

    /**
     * Create a video node from a URL.
     * 
     * API-Since: 7.0
     * Deprecated-Since: 9.0
     */
    @NotNull
    @Generated
    @Deprecated
    @Selector("videoNodeWithVideoURL:")
    public static native SKVideoNode videoNodeWithVideoURL(@NotNull NSURL videoURL);

    /**
     * The location in the video that maps to its 'position' in the parent's coordinate space. (0.0-1.0)
     */
    @Generated
    @Selector("anchorPoint")
    @ByValue
    public native CGPoint anchorPoint();

    @Generated
    @Selector("init")
    public native SKVideoNode init();

    /**
     * Designated Initializer.
     * 
     * Initialize a video node from an AVPlayer. You can use the AVPlayer to control playback.
     */
    @Generated
    @Selector("initWithAVPlayer:")
    public native SKVideoNode initWithAVPlayer(@NotNull AVPlayer player);

    /**
     * Support coding and decoding via NSKeyedArchiver.
     */
    @Generated
    @Selector("initWithCoder:")
    public native SKVideoNode initWithCoder(@NotNull NSCoder aDecoder);

    /**
     * API-Since: 8.0
     */
    @Generated
    @Selector("initWithFileNamed:")
    public native SKVideoNode initWithFileNamed(@NotNull String videoFile);

    /**
     * API-Since: 8.0
     */
    @Generated
    @Selector("initWithURL:")
    public native SKVideoNode initWithURL(@NotNull NSURL url);

    /**
     * Initialize a video node from a file.
     * 
     * API-Since: 7.0
     * Deprecated-Since: 8.0
     */
    @Generated
    @Deprecated
    @Selector("initWithVideoFileNamed:")
    public native SKVideoNode initWithVideoFileNamed(@NotNull String videoFile);

    /**
     * API-Since: 7.0
     * Deprecated-Since: 8.0
     */
    @Generated
    @Deprecated
    @Selector("initWithVideoURL:")
    public native SKVideoNode initWithVideoURL(@NotNull NSURL url);

    @Generated
    @Selector("pause")
    public native void pause();

    @Generated
    @Selector("play")
    public native void play();

    /**
     * The location in the video that maps to its 'position' in the parent's coordinate space. (0.0-1.0)
     */
    @Generated
    @Selector("setAnchorPoint:")
    public native void setAnchorPoint(@ByValue CGPoint value);

    /**
     * The display size of the video (in parent's coordinate space)
     */
    @Generated
    @Selector("setSize:")
    public native void setSize(@ByValue CGSize value);

    /**
     * The display size of the video (in parent's coordinate space)
     */
    @Generated
    @Selector("size")
    @ByValue
    public native CGSize size();

    @Generated
    @Selector("nodeWithFileNamed:securelyWithClasses:andError:")
    public static native SKVideoNode nodeWithFileNamedSecurelyWithClassesAndError(@NotNull String filename,
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

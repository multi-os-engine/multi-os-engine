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
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSCopying;
import apple.foundation.protocol.NSSecureCoding;
import apple.scenekit.struct.SCNVector3;
import apple.scenekit.struct.SCNVector4;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Generated
@Library("SceneKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class SCNAction extends NSObject implements NSCopying, NSSecureCoding {
    static {
        NatJ.register();
    }

    @Generated
    protected SCNAction(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native SCNAction alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native SCNAction allocWithZone(VoidPtr zone);

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

    /**
     * Creates an action that executes a block over a duration.
     */
    @NotNull
    @Generated
    @Selector("customActionWithDuration:actionBlock:")
    public static native SCNAction customActionWithDurationActionBlock(double seconds,
            @NotNull @ObjCBlock(name = "call_customActionWithDurationActionBlock") Block_customActionWithDurationActionBlock block);

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * Creates an action that changes the opacity value of the node to 1.0
     */
    @NotNull
    @Generated
    @Selector("fadeInWithDuration:")
    public static native SCNAction fadeInWithDuration(double sec);

    /**
     * Creates an action that adjusts the opacity value of a node by a relative value.
     */
    @NotNull
    @Generated
    @Selector("fadeOpacityBy:duration:")
    public static native SCNAction fadeOpacityByDuration(@NFloat double factor, double sec);

    /**
     * Creates an action that adjusts the opacity value of a node to a new value.
     */
    @NotNull
    @Generated
    @Selector("fadeOpacityTo:duration:")
    public static native SCNAction fadeOpacityToDuration(@NFloat double opacity, double sec);

    /**
     * Creates an action that changes the opacity value of the node to 0.0
     */
    @NotNull
    @Generated
    @Selector("fadeOutWithDuration:")
    public static native SCNAction fadeOutWithDuration(double sec);

    /**
     * Creates an action that runs a collection of actions in parallel.
     */
    @NotNull
    @Generated
    @Selector("group:")
    public static native SCNAction group(@NotNull NSArray<? extends SCNAction> actions);

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    /**
     * Creates an action that hides a node
     * 
     * API-Since: 9.0
     */
    @NotNull
    @Generated
    @Selector("hide")
    public static native SCNAction hide();

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

    /**
     * Creates an action that runs a javascript script over a duration. the node can be accessed from javascript via the
     * "node" symbol and the elapsed time (between 0 and 1 relative to the duration) via the "elapsedTime" symbol.
     */
    @NotNull
    @Generated
    @Selector("javaScriptActionWithScript:duration:")
    public static native SCNAction javaScriptActionWithScriptDuration(@NotNull String script, double seconds);

    @NotNull
    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    @NotNull
    @Generated
    @Selector("moveBy:duration:")
    public static native SCNAction moveByDuration(@ByValue SCNVector3 delta, double duration);

    /**
     * Creates an action that moves a node relative to its current position.
     */
    @NotNull
    @Generated
    @Selector("moveByX:y:z:duration:")
    public static native SCNAction moveByXYZDuration(@NFloat double deltaX, @NFloat double deltaY,
            @NFloat double deltaZ, double duration);

    /**
     * Creates an action that moves a node to a new position.
     */
    @NotNull
    @Generated
    @Selector("moveTo:duration:")
    public static native SCNAction moveToDuration(@ByValue SCNVector3 location, double duration);

    @Generated
    @Owned
    @Selector("new")
    public static native SCNAction new_objc();

    /**
     * Creates an action that plays a sound
     * 
     * @param source The audio source to play (see SCNAudioSource.h)
     * @param wait   If YES, then the duration of this action is the same
     *               as the length of the audio playback. If NO, the action is considered
     *               to have completed immediately.
     * 
     *               API-Since: 9.0
     */
    @NotNull
    @Generated
    @Selector("playAudioSource:waitForCompletion:")
    public static native SCNAction playAudioSourceWaitForCompletion(@NotNull SCNAudioSource source, boolean wait_);

    /**
     * Creates an action that removes the node from its parent node.
     */
    @NotNull
    @Generated
    @Selector("removeFromParentNode")
    public static native SCNAction removeFromParentNode();

    /**
     * Creates an action that repeats another action a specified number of times.
     */
    @NotNull
    @Generated
    @Selector("repeatAction:count:")
    public static native SCNAction repeatActionCount(@NotNull SCNAction action, @NUInt long count);

    /**
     * Creates an action that repeats another action forever.
     */
    @NotNull
    @Generated
    @Selector("repeatActionForever:")
    public static native SCNAction repeatActionForever(@NotNull SCNAction action);

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * Creates an action that rotates the node arond an axis by the specified angle in radian
     */
    @NotNull
    @Generated
    @Selector("rotateByAngle:aroundAxis:duration:")
    public static native SCNAction rotateByAngleAroundAxisDuration(@NFloat double angle, @ByValue SCNVector3 axis,
            double duration);

    /**
     * Creates an action that rotates the node by a relative value in radian.
     */
    @NotNull
    @Generated
    @Selector("rotateByX:y:z:duration:")
    public static native SCNAction rotateByXYZDuration(@NFloat double xAngle, @NFloat double yAngle,
            @NFloat double zAngle, double duration);

    @NotNull
    @Generated
    @Selector("rotateToAxisAngle:duration:")
    public static native SCNAction rotateToAxisAngleDuration(@ByValue SCNVector4 axisAngle, double duration);

    /**
     * Creates an action that rotates the node to an absolute angle in radian.
     */
    @NotNull
    @Generated
    @Selector("rotateToX:y:z:duration:")
    public static native SCNAction rotateToXYZDuration(@NFloat double xAngle, @NFloat double yAngle,
            @NFloat double zAngle, double duration);

    @NotNull
    @Generated
    @Selector("rotateToX:y:z:duration:shortestUnitArc:")
    public static native SCNAction rotateToXYZDurationShortestUnitArc(@NFloat double xAngle, @NFloat double yAngle,
            @NFloat double zAngle, double duration, boolean shortestUnitArc);

    /**
     * Creates an action that executes a block.
     */
    @NotNull
    @Generated
    @Selector("runBlock:")
    public static native SCNAction runBlock(@NotNull @ObjCBlock(name = "call_runBlock") Block_runBlock block);

    @NotNull
    @Generated
    @Selector("runBlock:queue:")
    public static native SCNAction runBlockQueue(
            @NotNull @ObjCBlock(name = "call_runBlockQueue") Block_runBlockQueue block, @NotNull NSObject queue);

    /**
     * Creates an action that changes the x, y and z scale values of a node by a relative value.
     */
    @NotNull
    @Generated
    @Selector("scaleBy:duration:")
    public static native SCNAction scaleByDuration(@NFloat double scale, double sec);

    /**
     * Creates an action that changes the x, y and z scale values of a node.
     */
    @NotNull
    @Generated
    @Selector("scaleTo:duration:")
    public static native SCNAction scaleToDuration(@NFloat double scale, double sec);

    /**
     * Creates an action that runs a collection of actions sequentially.
     */
    @NotNull
    @Generated
    @Selector("sequence:")
    public static native SCNAction sequence(@NotNull NSArray<? extends SCNAction> actions);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

    /**
     * Creates an action that unhides a node
     * 
     * API-Since: 9.0
     */
    @NotNull
    @Generated
    @Selector("unhide")
    public static native SCNAction unhide();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * Creates an action that idles for a specified period of time.
     */
    @NotNull
    @Generated
    @Selector("waitForDuration:")
    public static native SCNAction waitForDuration(double sec);

    /**
     * Creates an action that idles for a randomized period of time.
     */
    @NotNull
    @Generated
    @Selector("waitForDuration:withRange:")
    public static native SCNAction waitForDurationWithRange(double sec, double durationRange);

    @NotNull
    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(@Nullable VoidPtr zone);

    /**
     * [@property] duration
     * 
     * This is the expected duration of an action’s animation. The actual time an action takes to complete is modified
     * by the speed property of the action.
     */
    @Generated
    @Selector("duration")
    public native double duration();

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(@NotNull NSCoder coder);

    @Generated
    @Selector("init")
    public native SCNAction init();

    @Generated
    @Selector("initWithCoder:")
    public native SCNAction initWithCoder(@NotNull NSCoder coder);

    /**
     * reversedAction
     * 
     * Creates an action that reverses the behavior of another action.
     */
    @NotNull
    @Generated
    @Selector("reversedAction")
    public native SCNAction reversedAction();

    /**
     * [@property] duration
     * 
     * This is the expected duration of an action’s animation. The actual time an action takes to complete is modified
     * by the speed property of the action.
     */
    @Generated
    @Selector("setDuration:")
    public native void setDuration(double value);

    /**
     * [@property] speed
     * 
     * A speed factor that modifies how fast an action runs. Defaults to 1.
     */
    @Generated
    @Selector("setSpeed:")
    public native void setSpeed(@NFloat double value);

    /**
     * When set, prodives a custom timing via a block. Applies after
     * the 'timingMode' property is taken into account, defaults to nil
     * 
     * @see SCNActionTimingFunction
     */
    @Generated
    @Selector("setTimingFunction:")
    public native void setTimingFunction(
            @Nullable @ObjCBlock(name = "call_setTimingFunction") Block_setTimingFunction value);

    /**
     * [@property] timingMode
     * 
     * The timing mode used to execute an action.
     */
    @Generated
    @Selector("setTimingMode:")
    public native void setTimingMode(@NInt long value);

    /**
     * [@property] speed
     * 
     * A speed factor that modifies how fast an action runs. Defaults to 1.
     */
    @Generated
    @Selector("speed")
    @NFloat
    public native double speed();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    /**
     * When set, prodives a custom timing via a block. Applies after
     * the 'timingMode' property is taken into account, defaults to nil
     * 
     * @see SCNActionTimingFunction
     */
    @Nullable
    @Generated
    @Selector("timingFunction")
    @ObjCBlock(name = "call_timingFunction_ret")
    public native Block_timingFunction_ret timingFunction();

    /**
     * [@property] timingMode
     * 
     * The timing mode used to execute an action.
     */
    @Generated
    @Selector("timingMode")
    @NInt
    public native long timingMode();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_customActionWithDurationActionBlock {
        @Generated
        void call_customActionWithDurationActionBlock(@NotNull SCNNode node, @NFloat double elapsedTime);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_runBlock {
        @Generated
        void call_runBlock(@NotNull SCNNode node);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_runBlockQueue {
        @Generated
        void call_runBlockQueue(@NotNull SCNNode node);
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
}

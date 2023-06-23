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

package apple.gameplaykit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSDictionary;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSNumber;
import apple.foundation.NSSet;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * A GKBehavior that can also contain a number of sub-behaviors
 * Sub-behaviors and goals are both weighted and produce a force to apply to a GKAGENT
 */
@Generated
@Library("GameplayKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class GKCompositeBehavior extends GKBehavior {
    static {
        NatJ.register();
    }

    @Generated
    protected GKCompositeBehavior(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native GKCompositeBehavior alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native GKCompositeBehavior allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    /**
     * Creates a behavior with an array of sub-behaviors
     */
    @Generated
    @Selector("behaviorWithBehaviors:")
    public static native GKCompositeBehavior behaviorWithBehaviors(@NotNull NSArray<? extends GKBehavior> behaviors);

    /**
     * Creates a behavior with two associated arrays of sub-behaviors and weights
     */
    @Generated
    @Selector("behaviorWithBehaviors:andWeights:")
    public static native GKCompositeBehavior behaviorWithBehaviorsAndWeights(
            @NotNull NSArray<? extends GKBehavior> behaviors, @NotNull NSArray<? extends NSNumber> weights);

    @Generated
    @Selector("behaviorWithGoal:weight:")
    public static native GKCompositeBehavior behaviorWithGoalWeight(@NotNull GKGoal goal, float weight);

    @Generated
    @Selector("behaviorWithGoals:")
    public static native GKCompositeBehavior behaviorWithGoals(@NotNull NSArray<? extends GKGoal> goals);

    @Generated
    @Selector("behaviorWithGoals:andWeights:")
    public static native GKCompositeBehavior behaviorWithGoalsAndWeights(@NotNull NSArray<? extends GKGoal> goals,
            @NotNull NSArray<? extends NSNumber> weights);

    @Generated
    @Selector("behaviorWithWeightedGoals:")
    public static native GKCompositeBehavior behaviorWithWeightedGoals(
            @NotNull NSDictionary<? extends GKGoal, ? extends NSNumber> weightedGoals);

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
    public static native GKCompositeBehavior new_objc();

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
     * Number of sub-behaviors in this behavior
     */
    @Generated
    @Selector("behaviorCount")
    @NInt
    public native long behaviorCount();

    @Generated
    @Selector("init")
    public native GKCompositeBehavior init();

    /**
     * Supports getting behaviors via a [int] subscript.
     */
    @NotNull
    @Generated
    @Selector("objectAtIndexedSubscript:")
    public native GKGoal objectAtIndexedSubscript(@NUInt long idx);

    /**
     * Supports getting a weight via a [behavior] subscript.
     */
    @NotNull
    @Generated
    @Selector("objectForKeyedSubscript:")
    public native NSNumber objectForKeyedSubscript(@NotNull GKBehavior behavior);

    /**
     * Removes all the sub-behavior on the behavior.
     */
    @Generated
    @Selector("removeAllBehaviors")
    public native void removeAllBehaviors();

    /**
     * Remove the indicated sub-behavior from this behavior.
     * 
     * @param behavior the sub-behavior to be removed
     */
    @Generated
    @Selector("removeBehavior:")
    public native void removeBehavior(@NotNull GKBehavior behavior);

    /**
     * Supports setting a weight via a [behavior] subscript.
     */
    @Generated
    @Selector("setObject:forKeyedSubscript:")
    public native void setObjectForKeyedSubscript(@NotNull NSNumber weight, @NotNull GKBehavior behavior);

    /**
     * Adds a new sub-behavior or changes the weight of the existing sub-behavior in this behavior.
     * If the sub-behavior does not exist in this behavior, it is added.
     * 
     * @param weight   the weight for this goal
     * @param behavior the sub-behavior who's weight to change
     */
    @Generated
    @Selector("setWeight:forBehavior:")
    public native void setWeightForBehavior(float weight, @NotNull GKBehavior behavior);

    /**
     * Gets the current weight for a given sub-behavior.
     * 
     * @return the weight of the sub-behavior, or 0 if there is no such sub-behavior on this behavior
     */
    @Generated
    @Selector("weightForBehavior:")
    public native float weightForBehavior(@NotNull GKBehavior behavior);
}

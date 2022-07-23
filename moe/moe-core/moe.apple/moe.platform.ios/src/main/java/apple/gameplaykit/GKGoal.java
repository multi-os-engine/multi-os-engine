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
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSCopying;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
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

/**
 * Defines a spatial directive.
 * The various goals cause force to be applied to agents to try to achieve said goal.
 */
@Generated
@Library("GameplayKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class GKGoal extends NSObject implements NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected GKGoal(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native GKGoal alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native GKGoal allocWithZone(VoidPtr zone);

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

    /**
     * Creates a goal to align this agent's orientation with the average orientation of the group of agents.
     *
     * @param maxDistance the distance between agents before alignment happens
     * @param maxAngle    the angle, in radians, between this agent's foward and the vector toward the other agent
     *                    before alignment happens
     */
    @Generated
    @Selector("goalToAlignWithAgents:maxDistance:maxAngle:")
    public static native GKGoal goalToAlignWithAgentsMaxDistanceMaxAngle(NSArray<? extends GKAgent> agents,
            float maxDistance, float maxAngle);

    /**
     * Creates a goal to avoid colliding with a group of agents taking into account those agent's momentum
     *
     * @param maxPredictionTime how far ahead in the future, in seconds, should we look for potential collisions
     */
    @Generated
    @Selector("goalToAvoidAgents:maxPredictionTime:")
    public static native GKGoal goalToAvoidAgentsMaxPredictionTime(NSArray<? extends GKAgent> agents,
            double maxPredictionTime);

    /**
     * Creates a goal to avoid colliding with a group of agents without taking into account those agents' momentum
     *
     * @param maxPredictionTime how far ahead in the future, in seconds, should we look for potential collisions
     */
    @Generated
    @Selector("goalToAvoidObstacles:maxPredictionTime:")
    public static native GKGoal goalToAvoidObstaclesMaxPredictionTime(NSArray<? extends GKObstacle> obstacles,
            double maxPredictionTime);

    /**
     * Creates a goal to seek the average position of the group of agents.
     *
     * @param maxDistance the distance between agents before cohesion happens
     * @param maxAngle    the angle between this agent's foward and the vector toward the other agent before cohesion
     *                    happens
     */
    @Generated
    @Selector("goalToCohereWithAgents:maxDistance:maxAngle:")
    public static native GKGoal goalToCohereWithAgentsMaxDistanceMaxAngle(NSArray<? extends GKAgent> agents,
            float maxDistance, float maxAngle);

    /**
     * Creates a goal to move away from the agent
     *
     * @param agent the agent to flee from
     */
    @Generated
    @Selector("goalToFleeAgent:")
    public static native GKGoal goalToFleeAgent(GKAgent agent);

    /**
     * Creates a goal that will attempt to follow the given path
     *
     * @param path              the path to follow
     * @param maxPredictionTime how far ahead in the future, in seconds, should we look for potential intercepts
     * @param forward           direction to follow the path. forward = NO is reverse
     */
    @Generated
    @Selector("goalToFollowPath:maxPredictionTime:forward:")
    public static native GKGoal goalToFollowPathMaxPredictionTimeForward(GKPath path, double maxPredictionTime,
            boolean forward);

    /**
     * Creates a goal that will attempt to intercept another target agent taking into account that agent's momentum
     *
     * @param target            agent to intercept
     * @param maxPredictionTime how far ahead in the future, in seconds, should we look for potential intercepts
     */
    @Generated
    @Selector("goalToInterceptAgent:maxPredictionTime:")
    public static native GKGoal goalToInterceptAgentMaxPredictionTime(GKAgent target, double maxPredictionTime);

    /**
     * Creates a goal that attempts to change our momentum to reach the target speed
     *
     * @param targetSpeed the target speed
     */
    @Generated
    @Selector("goalToReachTargetSpeed:")
    public static native GKGoal goalToReachTargetSpeed(float targetSpeed);

    /**
     * Creates a goal to move toward the agent
     *
     * @param agent the agent to seek
     */
    @Generated
    @Selector("goalToSeekAgent:")
    public static native GKGoal goalToSeekAgent(GKAgent agent);

    /**
     * Creates a goal that tries to repel this agent away from the other agents and attempts to prevent overlap
     *
     * @param maxDistance the distance between agents before repelling happens
     * @param maxAngle    the angle, in radians, between this agent's foward and the vector toward the other agent
     *                    before the repelling happens
     */
    @Generated
    @Selector("goalToSeparateFromAgents:maxDistance:maxAngle:")
    public static native GKGoal goalToSeparateFromAgentsMaxDistanceMaxAngle(NSArray<? extends GKAgent> agents,
            float maxDistance, float maxAngle);

    /**
     * Creates a goal that will attempt to stay on the given path
     *
     * @param path              the path to follow
     * @param maxPredictionTime how far ahead in the future, in seconds, should we look for potential intercepts
     */
    @Generated
    @Selector("goalToStayOnPath:maxPredictionTime:")
    public static native GKGoal goalToStayOnPathMaxPredictionTime(GKPath path, double maxPredictionTime);

    /**
     * Creates a goal that will make the agent appear to wander, aimlessly moving forward and turning randomly
     *
     * @param speed the speed at which to wander
     */
    @Generated
    @Selector("goalToWander:")
    public static native GKGoal goalToWander(float speed);

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
    public static native GKGoal new_objc();

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

    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(VoidPtr zone);

    @Generated
    @Selector("init")
    public native GKGoal init();
}

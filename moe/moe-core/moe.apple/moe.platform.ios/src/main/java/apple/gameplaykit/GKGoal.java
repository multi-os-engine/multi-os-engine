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
    @Owned
    @Selector("alloc")
    public static native GKGoal alloc();

    /**
     * goalToAlignWithAgents:maxDistance:maxAngle:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameplayKit/Reference/GKGoal_Class/index.html#//apple_ref/occ/clm/GKGoal/goalToAlignWithAgents:maxDistance:maxAngle:">iOS Dev Center</a>
     */
    @Generated
    @Selector("goalToAlignWithAgents:maxDistance:maxAngle:")
    public static native GKGoal goalToAlignWithAgentsMaxDistanceMaxAngle(NSArray<? extends GKAgent> agents,
            float maxDistance, float maxAngle);

    /**
     * goalToAvoidAgents:maxPredictionTime:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameplayKit/Reference/GKGoal_Class/index.html#//apple_ref/occ/clm/GKGoal/goalToAvoidAgents:maxPredictionTime:">iOS Dev Center</a>
     */
    @Generated
    @Selector("goalToAvoidAgents:maxPredictionTime:")
    public static native GKGoal goalToAvoidAgentsMaxPredictionTime(NSArray<? extends GKAgent> agents,
            double maxPredictionTime);

    /**
     * goalToAvoidObstacles:maxPredictionTime:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameplayKit/Reference/GKGoal_Class/index.html#//apple_ref/occ/clm/GKGoal/goalToAvoidObstacles:maxPredictionTime:">iOS Dev Center</a>
     */
    @Generated
    @Selector("goalToAvoidObstacles:maxPredictionTime:")
    public static native GKGoal goalToAvoidObstaclesMaxPredictionTime(NSArray<? extends GKObstacle> obstacles,
            double maxPredictionTime);

    /**
     * goalToCohereWithAgents:maxDistance:maxAngle:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameplayKit/Reference/GKGoal_Class/index.html#//apple_ref/occ/clm/GKGoal/goalToCohereWithAgents:maxDistance:maxAngle:">iOS Dev Center</a>
     */
    @Generated
    @Selector("goalToCohereWithAgents:maxDistance:maxAngle:")
    public static native GKGoal goalToCohereWithAgentsMaxDistanceMaxAngle(NSArray<? extends GKAgent> agents,
            float maxDistance, float maxAngle);

    /**
     * goalToFleeAgent:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameplayKit/Reference/GKGoal_Class/index.html#//apple_ref/occ/clm/GKGoal/goalToFleeAgent:">iOS Dev Center</a>
     */
    @Generated
    @Selector("goalToFleeAgent:")
    public static native GKGoal goalToFleeAgent(GKAgent agent);

    /**
     * goalToFollowPath:maxPredictionTime:forward:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameplayKit/Reference/GKGoal_Class/index.html#//apple_ref/occ/clm/GKGoal/goalToFollowPath:maxPredictionTime:forward:">iOS Dev Center</a>
     */
    @Generated
    @Selector("goalToFollowPath:maxPredictionTime:forward:")
    public static native GKGoal goalToFollowPathMaxPredictionTimeForward(GKPath path, double maxPredictionTime,
            boolean forward);

    /**
     * goalToInterceptAgent:maxPredictionTime:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameplayKit/Reference/GKGoal_Class/index.html#//apple_ref/occ/clm/GKGoal/goalToInterceptAgent:maxPredictionTime:">iOS Dev Center</a>
     */
    @Generated
    @Selector("goalToInterceptAgent:maxPredictionTime:")
    public static native GKGoal goalToInterceptAgentMaxPredictionTime(GKAgent target, double maxPredictionTime);

    /**
     * goalToReachTargetSpeed:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameplayKit/Reference/GKGoal_Class/index.html#//apple_ref/occ/clm/GKGoal/goalToReachTargetSpeed:">iOS Dev Center</a>
     */
    @Generated
    @Selector("goalToReachTargetSpeed:")
    public static native GKGoal goalToReachTargetSpeed(float targetSpeed);

    /**
     * goalToSeekAgent:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameplayKit/Reference/GKGoal_Class/index.html#//apple_ref/occ/clm/GKGoal/goalToSeekAgent:">iOS Dev Center</a>
     */
    @Generated
    @Selector("goalToSeekAgent:")
    public static native GKGoal goalToSeekAgent(GKAgent agent);

    /**
     * goalToSeparateFromAgents:maxDistance:maxAngle:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameplayKit/Reference/GKGoal_Class/index.html#//apple_ref/occ/clm/GKGoal/goalToSeparateFromAgents:maxDistance:maxAngle:">iOS Dev Center</a>
     */
    @Generated
    @Selector("goalToSeparateFromAgents:maxDistance:maxAngle:")
    public static native GKGoal goalToSeparateFromAgentsMaxDistanceMaxAngle(NSArray<? extends GKAgent> agents,
            float maxDistance, float maxAngle);

    /**
     * goalToStayOnPath:maxPredictionTime:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameplayKit/Reference/GKGoal_Class/index.html#//apple_ref/occ/clm/GKGoal/goalToStayOnPath:maxPredictionTime:">iOS Dev Center</a>
     */
    @Generated
    @Selector("goalToStayOnPath:maxPredictionTime:")
    public static native GKGoal goalToStayOnPathMaxPredictionTime(GKPath path, double maxPredictionTime);

    /**
     * goalToWander:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameplayKit/Reference/GKGoal_Class/index.html#//apple_ref/occ/clm/GKGoal/goalToWander:">iOS Dev Center</a>
     */
    @Generated
    @Selector("goalToWander:")
    public static native GKGoal goalToWander(float speed);

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
    public static native void load_objc_static();

    @Generated
    @Owned
    @Selector("new")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object new_objc();

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

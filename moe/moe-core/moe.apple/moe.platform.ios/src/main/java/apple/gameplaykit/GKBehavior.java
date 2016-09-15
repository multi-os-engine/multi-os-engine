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
import apple.foundation.protocol.NSFastEnumeration;
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
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCObject;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("GameplayKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class GKBehavior extends NSObject implements NSFastEnumeration {
    static {
        NatJ.register();
    }

    @Generated
    protected GKBehavior(Pointer peer) {
        super(peer);
    }

    @Generated
    @Owned
    @Selector("alloc")
    public static native GKBehavior alloc();

    /**
     * behaviorWithGoal:weight:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameplayKit/Reference/GKBehavior_Class/index.html#//apple_ref/occ/clm/GKBehavior/behaviorWithGoal:weight:">iOS Dev Center</a>
     */
    @Generated
    @Selector("behaviorWithGoal:weight:")
    public static native GKBehavior behaviorWithGoalWeight(GKGoal goal, float weight);

    /**
     * behaviorWithGoals:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameplayKit/Reference/GKBehavior_Class/index.html#//apple_ref/occ/clm/GKBehavior/behaviorWithGoals:">iOS Dev Center</a>
     */
    @Generated
    @Selector("behaviorWithGoals:")
    public static native GKBehavior behaviorWithGoals(NSArray<? extends GKGoal> goals);

    /**
     * behaviorWithGoals:andWeights:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameplayKit/Reference/GKBehavior_Class/index.html#//apple_ref/occ/clm/GKBehavior/behaviorWithGoals:andWeights:">iOS Dev Center</a>
     */
    @Generated
    @Selector("behaviorWithGoals:andWeights:")
    public static native GKBehavior behaviorWithGoalsAndWeights(NSArray<? extends GKGoal> goals,
            NSArray<? extends NSNumber> weights);

    /**
     * behaviorWithWeightedGoals:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameplayKit/Reference/GKBehavior_Class/index.html#//apple_ref/occ/clm/GKBehavior/behaviorWithWeightedGoals:">iOS Dev Center</a>
     */
    @Generated
    @Selector("behaviorWithWeightedGoals:")
    public static native GKBehavior behaviorWithWeightedGoals(
            NSDictionary<? extends GKGoal, ? extends NSNumber> weightedGoals);

    @Generated
    @Selector("countByEnumeratingWithState:objects:count:")
    @NUInt
    public native long countByEnumeratingWithStateObjectsCount(VoidPtr state, Ptr<ObjCObject> buffer, @NUInt long len);

    /**
     * goalCount</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameplayKit/Reference/GKBehavior_Class/index.html#//apple_ref/occ/instp/GKBehavior/goalCount">iOS Dev Center</a>
     */
    @Generated
    @Selector("goalCount")
    @NInt
    public native long goalCount();

    @Generated
    @Selector("init")
    public native GKBehavior init();

    /**
     * objectAtIndexedSubscript:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameplayKit/Reference/GKBehavior_Class/index.html#//apple_ref/occ/instm/GKBehavior/objectAtIndexedSubscript:">iOS Dev Center</a>
     */
    @Generated
    @Selector("objectAtIndexedSubscript:")
    public native GKGoal objectAtIndexedSubscript(@NUInt long idx);

    /**
     * objectForKeyedSubscript:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameplayKit/Reference/GKBehavior_Class/index.html#//apple_ref/occ/instm/GKBehavior/objectForKeyedSubscript:">iOS Dev Center</a>
     */
    @Generated
    @Selector("objectForKeyedSubscript:")
    public native NSNumber objectForKeyedSubscript(GKGoal goal);

    /**
     * removeAllGoals</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameplayKit/Reference/GKBehavior_Class/index.html#//apple_ref/occ/instm/GKBehavior/removeAllGoals">iOS Dev Center</a>
     */
    @Generated
    @Selector("removeAllGoals")
    public native void removeAllGoals();

    /**
     * removeGoal:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameplayKit/Reference/GKBehavior_Class/index.html#//apple_ref/occ/instm/GKBehavior/removeGoal:">iOS Dev Center</a>
     */
    @Generated
    @Selector("removeGoal:")
    public native void removeGoal(GKGoal goal);

    /**
     * setObject:forKeyedSubscript:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameplayKit/Reference/GKBehavior_Class/index.html#//apple_ref/occ/instm/GKBehavior/setObject:forKeyedSubscript:">iOS Dev Center</a>
     */
    @Generated
    @Selector("setObject:forKeyedSubscript:")
    public native void setObjectForKeyedSubscript(NSNumber weight, GKGoal goal);

    /**
     * setWeight:forGoal:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameplayKit/Reference/GKBehavior_Class/index.html#//apple_ref/occ/instm/GKBehavior/setWeight:forGoal:">iOS Dev Center</a>
     */
    @Generated
    @Selector("setWeight:forGoal:")
    public native void setWeightForGoal(float weight, GKGoal goal);

    /**
     * weightForGoal:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameplayKit/Reference/GKBehavior_Class/index.html#//apple_ref/occ/instm/GKBehavior/weightForGoal:">iOS Dev Center</a>
     */
    @Generated
    @Selector("weightForGoal:")
    public native float weightForGoal(GKGoal goal);

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
}

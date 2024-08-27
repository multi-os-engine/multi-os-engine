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
import apple.foundation.NSPredicate;
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
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * A convenient subclass of GKRule that leverages existing NSPRedicate functionality for evaluating the predicate
 * of the rule.
 */
@Generated
@Library("GameplayKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class GKNSPredicateRule extends GKRule {
    static {
        NatJ.register();
    }

    @Generated
    protected GKNSPredicateRule(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native GKNSPredicateRule alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native GKNSPredicateRule allocWithZone(VoidPtr zone);

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
    public static native GKNSPredicateRule new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("ruleWithBlockPredicate:action:")
    public static native GKNSPredicateRule ruleWithBlockPredicateAction(
            @NotNull @ObjCBlock(name = "call_ruleWithBlockPredicateAction_0") GKRule.Block_ruleWithBlockPredicateAction_0 predicate,
            @NotNull @ObjCBlock(name = "call_ruleWithBlockPredicateAction_1") GKRule.Block_ruleWithBlockPredicateAction_1 action);

    @Generated
    @Selector("ruleWithPredicate:assertingFact:grade:")
    public static native GKNSPredicateRule ruleWithPredicateAssertingFactGrade(@NotNull NSPredicate predicate,
            @NotNull @Mapped(ObjCObjectMapper.class) apple.protocol.NSObject fact, float grade);

    @Generated
    @Selector("ruleWithPredicate:retractingFact:grade:")
    public static native GKNSPredicateRule ruleWithPredicateRetractingFactGrade(@NotNull NSPredicate predicate,
            @NotNull @Mapped(ObjCObjectMapper.class) apple.protocol.NSObject fact, float grade);

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
     * Overridden here to call the predicate's evaluateWithObject:substitutionVariables:, using sys
     * as the object and the system's state dictionary as the source of the substitution variables.
     * 
     * @return YES if the NSPredicate evaluation passes and the action needs to be performed, NO otherwise.
     */
    @Generated
    @Selector("evaluatePredicateWithSystem:")
    public native boolean evaluatePredicateWithSystem(@NotNull GKRuleSystem system);

    @Generated
    @Selector("init")
    public native GKNSPredicateRule init();

    /**
     * Initializes a new rule with the given NSPredicate
     */
    @Generated
    @Selector("initWithPredicate:")
    public native GKNSPredicateRule initWithPredicate(@NotNull NSPredicate predicate);

    /**
     * The NSPredicate that is used inside this subclass's implementation of evaluatePredicateWithSystem:
     * In order to effectively use this class you must still override performActionWithSystem:
     * 
     * @see GKRule.evaluatePredicateWithSystem:
     */
    @NotNull
    @Generated
    @Selector("predicate")
    public native NSPredicate predicate();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}

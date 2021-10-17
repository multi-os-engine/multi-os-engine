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

/**
 * The concrete class that the GKRuleSystem uses to evaluate the current state and facts with predicated rules.
 * These are sharable between systems, so don't retain any state in the rules themselves. Use the system-provided
 * state storage.
 *
 * @see GKRuleSystem.state
 */
@Generated
@Library("GameplayKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class GKRule extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected GKRule(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native GKRule alloc();

    @Generated
    @Selector("allocWithZone:")
    public static native GKRule allocWithZone(VoidPtr zone);

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
    public static native GKRule new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * Short hand for making a rule that uses blocks for the predicate and action. This rule is not able to be archived
     * using NSKeyedArchiver so use a subclass or NSPredicate based rule if serialization of the rule is needed.
     */
    @Generated
    @Selector("ruleWithBlockPredicate:action:")
    public static native GKRule ruleWithBlockPredicateAction(
            @ObjCBlock(name = "call_ruleWithBlockPredicateAction_0") Block_ruleWithBlockPredicateAction_0 predicate,
            @ObjCBlock(name = "call_ruleWithBlockPredicateAction_1") Block_ruleWithBlockPredicateAction_1 action);

    /**
     * Create a data-driven rule that uses NSPredicate and a single assert as the action.
     */
    @Generated
    @Selector("ruleWithPredicate:assertingFact:grade:")
    public static native GKRule ruleWithPredicateAssertingFactGrade(NSPredicate predicate,
            @Mapped(ObjCObjectMapper.class) apple.protocol.NSObject fact, float grade);

    /**
     * Short hand for data-driven rule that uses NSPredicate and a single retract as the action.
     */
    @Generated
    @Selector("ruleWithPredicate:retractingFact:grade:")
    public static native GKRule ruleWithPredicateRetractingFactGrade(NSPredicate predicate,
            @Mapped(ObjCObjectMapper.class) apple.protocol.NSObject fact, float grade);

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
     * Called by the rule system when it is this rule's turn to be evaluated. If the predicate returns YES then
     * the action for the rule will be performed. Once the action is performed the rule will move to the system's
     * executed list until the agenda is reset.
     *
     * @return YES is the predicate passes and the action needs to be performed, NO otherwise.
     * @see performAction
     * @see GKRuleSystem.agenda
     * @see GKRuleSystem.executed
     * @see GKRuleSystem.reset
     */
    @Generated
    @Selector("evaluatePredicateWithSystem:")
    public native boolean evaluatePredicateWithSystem(GKRuleSystem system);

    @Generated
    @Selector("init")
    public native GKRule init();

    /**
     * Performs the action consequence for the rule. This will only be called if the predicate evaluates to YES.
     * Any facts asserted or retracted by the action on the system will cause the system to evaluate the agenda
     * rule set again once the action completes.
     */
    @Generated
    @Selector("performActionWithSystem:")
    public native void performActionWithSystem(GKRuleSystem system);

    /**
     * Salience defines the order in the rule agenda that the system will evaluate. A rule with higher salience will
     * be evaluated before another rule in the agenda that has a lower salience.
     * <p>
     * Defaults to 0.
     *
     * @see GKRuleSystem.agenda
     */
    @Generated
    @Selector("salience")
    @NInt
    public native long salience();

    /**
     * Salience defines the order in the rule agenda that the system will evaluate. A rule with higher salience will
     * be evaluated before another rule in the agenda that has a lower salience.
     * <p>
     * Defaults to 0.
     *
     * @see GKRuleSystem.agenda
     */
    @Generated
    @Selector("setSalience:")
    public native void setSalience(@NInt long value);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_ruleWithBlockPredicateAction_0 {
        @Generated
        boolean call_ruleWithBlockPredicateAction_0(GKRuleSystem arg0);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_ruleWithBlockPredicateAction_1 {
        @Generated
        void call_ruleWithBlockPredicateAction_1(GKRuleSystem arg0);
    }
}

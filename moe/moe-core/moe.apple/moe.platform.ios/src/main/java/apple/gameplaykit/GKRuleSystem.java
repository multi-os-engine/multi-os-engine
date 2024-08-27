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
import apple.foundation.NSMutableDictionary;
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
 * A rule system consists of 3 things:
 * - The current state, which upon creation is considered the inital state.
 * - The current set of rules.
 * - The current set of facts.
 * 
 * Each time a fact is added to the system, the set of rules are evaluated in order and their actions executed in the
 * system if their predicates are true.
 * Rules can be fuzzy, allowing predicates and facts to be asserted to a degree of confidence instead of just boolean
 * on/off.
 * 
 * The facts can be any kind of objects as long as they correctly determine equality using isEqual:
 * The simplest approach is to use strings or dictionaries as they provide the most flexibility in defining
 * facts, but user defined classes work just as well and may describe the problem space better.
 * 
 * The fact set is at all times a fuzzy set, as defined by fact membership in the set being modulated by their
 * grade of membership. The rules may use the grade of membership to predicate their actions and in such a
 * manner create fuzzy logic. The fuzzy logic Zadeh operators are available on the system itself in order
 * to query multiple facts for combined membership grade.
 */
@Generated
@Library("GameplayKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class GKRuleSystem extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected GKRuleSystem(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native GKRuleSystem alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native GKRuleSystem allocWithZone(VoidPtr zone);

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
    public static native GKRuleSystem new_objc();

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
     * Adds a rule to the system. Also adds it to the agenda in salience order.
     */
    @Generated
    @Selector("addRule:")
    public native void addRule(@NotNull GKRule rule);

    /**
     * Adds rules to the system. Also adds them to the agenda in salience order.
     */
    @Generated
    @Selector("addRulesFromArray:")
    public native void addRulesFromArray(@NotNull NSArray<? extends GKRule> rules);

    /**
     * The current set of rules to be evaluated, in salience order, where if the salience is equivalent
     * the order of insertion into the agenda is used to decide which is first.
     * Adjust salience of your rules to adjust the order the next time the agenda is reset. Changing salience
     * on a rule currently in the agenda does not change its order in the agenda.
     * 
     * This is at all times the difference between the rules and executed sets.
     * 
     * @see rules
     * @see executed
     * @see reset
     */
    @NotNull
    @Generated
    @Selector("agenda")
    public native NSArray<? extends GKRule> agenda();

    /**
     * Asserts a fact with membership grade of 1.0.
     * 
     * This will cause the current rules to be evaluated, which may in turn assert or retract more facts
     * or change the state of the system.
     * 
     * This is shorthand for calling assertFact:grade: with a grade of 1.0
     * 
     * @see assertFact:grade:
     * @see evaluate
     * @see NSObject.isEqual:
     */
    @Generated
    @Selector("assertFact:")
    public native void assertFact(@NotNull @Mapped(ObjCObjectMapper.class) apple.protocol.NSObject fact);

    /**
     * Asserts a fact with the supplied membership grade.
     * 
     * This will cause the current rules to be evaluated, which may in turn assert or retract more facts
     * or change the state of the system.
     * 
     * @see evaluate
     */
    @Generated
    @Selector("assertFact:grade:")
    public native void assertFactGrade(@NotNull @Mapped(ObjCObjectMapper.class) apple.protocol.NSObject fact,
            float grade);

    /**
     * Explicitly evaluate the agenda of the rule system based on the current state and the current set of facts.
     * 
     * This may in turn assert or retract more facts or change the state of the system, including activating more
     * rules in the agenda.
     */
    @Generated
    @Selector("evaluate")
    public native void evaluate();

    /**
     * The current set of rules that have already executed. Rules in this set will not be executed again until
     * the system is reset.
     * 
     * This is at all times the difference between the rules and agenda sets.
     * 
     * @see rules
     * @see agenda
     * @see reset
     */
    @NotNull
    @Generated
    @Selector("executed")
    public native NSArray<? extends GKRule> executed();

    /**
     * The current set of facts. Facts have a grade of membership that is >= 0.0. Query the system for the
     * individual grades of membership with gradeForFact:
     * 
     * @see gradeForFact:
     */
    @NotNull
    @Generated
    @Selector("facts")
    public native NSArray<?> facts();

    /**
     * Returns the current membership grade for the given fact, which is 0.0 if the fact
     * is not a member of the current set of facts.
     * 
     * @return The membership grade of the given fact, in the range [0.0, 1.0].
     */
    @Generated
    @Selector("gradeForFact:")
    public native float gradeForFact(@NotNull @Mapped(ObjCObjectMapper.class) apple.protocol.NSObject fact);

    /**
     * Initializes a clean rule system with no state, rules or facts.
     */
    @Generated
    @Selector("init")
    public native GKRuleSystem init();

    /**
     * Returns the maximum membership grade for the any one of the given facts.
     * 
     * This performs the logical OR operation between the given facts.
     * 
     * @return The membership grade by applying the OR operator on the given facts, in the range [0.0, 1.0].
     */
    @Generated
    @Selector("maximumGradeForFacts:")
    public native float maximumGradeForFacts(@NotNull NSArray<?> facts);

    /**
     * Returns the combined membership grade for the all the given facts.
     * 
     * This performs the logical AND operation between the given facts.
     * 
     * @return The membership grade by applying the AND operator on the given facts, in the range [0.0, 1.0].
     */
    @Generated
    @Selector("minimumGradeForFacts:")
    public native float minimumGradeForFacts(@NotNull NSArray<?> facts);

    /**
     * Removes all rules from the system. This also removes them from the agenda and executed sets.
     */
    @Generated
    @Selector("removeAllRules")
    public native void removeAllRules();

    /**
     * Clears the agenda and executed sets and removes all facts currently in the system.
     * It then fills the agenda with rules from the rule set, in salience order.
     * 
     * @see rules
     * @see facts
     */
    @Generated
    @Selector("reset")
    public native void reset();

    /**
     * Retracts a fact, setting its membership grade to 0, which also removes it from the fact set.
     * 
     * This will cause the current rules to be evaluated, which may in turn assert or retract more facts
     * or change the state of the system.
     * 
     * This is short hand for calling retractFact:grade: with a grade of 1.0
     * 
     * @see retractFact:grade:
     * @see evaluate
     */
    @Generated
    @Selector("retractFact:")
    public native void retractFact(@NotNull @Mapped(ObjCObjectMapper.class) apple.protocol.NSObject fact);

    /**
     * Retracts a fact, reducing its membership grade by the supplied grade. If this brings the grade to 0
     * it is also removed from the fact set.
     * 
     * This will cause the current rules to be evaluated, which may in turn assert or retract more facts
     * or change the state of the system.
     * 
     * @see evaluate
     */
    @Generated
    @Selector("retractFact:grade:")
    public native void retractFactGrade(@NotNull @Mapped(ObjCObjectMapper.class) apple.protocol.NSObject fact,
            float grade);

    /**
     * The current set of rules that will be used to set the agenda when rules are first added to the system.
     * They will also be used to refill the agenda whenever it is set.
     * 
     * This is at all times the union of the agenda and executed sets.
     * 
     * @see agenda
     * @see executed
     */
    @NotNull
    @Generated
    @Selector("rules")
    public native NSArray<? extends GKRule> rules();

    /**
     * The implementation-defined state. If any changes are made on this outside the system you must
     * call evaluate to have the system take account of the changes.
     * 
     * @see evaluate
     */
    @NotNull
    @Generated
    @Selector("state")
    public native NSMutableDictionary<?, ?> state();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}

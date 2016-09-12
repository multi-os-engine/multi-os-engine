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

package ios.gameplaykit;


import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

import ios.NSObject;
import ios.foundation.NSPredicate;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.SEL;
import ios.foundation.NSArray;
import ios.foundation.NSMethodSignature;
import ios.foundation.NSSet;

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
	@Owned
	@Selector("alloc")
	public static native GKRule alloc();

	/**
	 * evaluatePredicateWithSystem:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameplayKit/Reference/GKRule_Class/index.html#//apple_ref/occ/instm/GKRule/evaluatePredicateWithSystem:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("evaluatePredicateWithSystem:")
	public native boolean evaluatePredicateWithSystem(GKRuleSystem system);

	@Generated
	@Selector("init")
	public native GKRule init();

	/**
	 * performActionWithSystem:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameplayKit/Reference/GKRule_Class/index.html#//apple_ref/occ/instm/GKRule/performActionWithSystem:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("performActionWithSystem:")
	public native void performActionWithSystem(GKRuleSystem system);

	/**
	 * ruleWithBlockPredicate:action:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameplayKit/Reference/GKRule_Class/index.html#//apple_ref/occ/clm/GKRule/ruleWithBlockPredicate:action:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("ruleWithBlockPredicate:action:")
	public static native GKRule ruleWithBlockPredicateAction(
			@ObjCBlock(name = "call_ruleWithBlockPredicateAction_0") Block_ruleWithBlockPredicateAction_0 predicate,
			@ObjCBlock(name = "call_ruleWithBlockPredicateAction_1") Block_ruleWithBlockPredicateAction_1 action);

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

	/**
	 * ruleWithPredicate:assertingFact:grade:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameplayKit/Reference/GKRule_Class/index.html#//apple_ref/occ/clm/GKRule/ruleWithPredicate:assertingFact:grade:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("ruleWithPredicate:assertingFact:grade:")
	public static native GKRule ruleWithPredicateAssertingFactGrade(NSPredicate predicate,
			@Mapped(ObjCObjectMapper.class) ios.protocol.NSObject fact, float grade);

	/**
	 * ruleWithPredicate:retractingFact:grade:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameplayKit/Reference/GKRule_Class/index.html#//apple_ref/occ/clm/GKRule/ruleWithPredicate:retractingFact:grade:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("ruleWithPredicate:retractingFact:grade:")
	public static native GKRule ruleWithPredicateRetractingFactGrade(NSPredicate predicate,
			@Mapped(ObjCObjectMapper.class) ios.protocol.NSObject fact, float grade);

	/**
	 * salience</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameplayKit/Reference/GKRule_Class/index.html#//apple_ref/occ/instp/GKRule/salience">iOS Dev Center</a>
	 */
	@Generated
	@Selector("salience")
	@NInt
	public native long salience();

	/**
	 * salience</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameplayKit/Reference/GKRule_Class/index.html#//apple_ref/occ/instp/GKRule/salience">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setSalience:")
	public native void setSalience(@NInt long value);

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
	public static native void cancelPreviousPerformRequestsWithTarget(
			@Mapped(ObjCObjectMapper.class) Object aTarget);

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
	public static native NSObject.Function_instanceMethodForSelector_ret instanceMethodForSelector(
			SEL aSelector);

	@Generated
	@Selector("instanceMethodSignatureForSelector:")
	public static native NSMethodSignature instanceMethodSignatureForSelector(
			SEL aSelector);

	@Generated
	@Selector("instancesRespondToSelector:")
	public static native boolean instancesRespondToSelector(SEL aSelector);

	@Generated
	@Selector("isSubclassOfClass:")
	public static native boolean isSubclassOfClass(Class aClass);

	@Generated
	@Selector("keyPathsForValuesAffectingValueForKey:")
	public static native NSSet<String> keyPathsForValuesAffectingValueForKey(
			String key);

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

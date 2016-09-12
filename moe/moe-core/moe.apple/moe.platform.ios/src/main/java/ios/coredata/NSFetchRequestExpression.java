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

package ios.coredata;


import org.moe.natj.c.ann.Variadic;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.BytePtr;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

import ios.foundation.NSArray;
import ios.foundation.NSCoder;
import ios.foundation.NSExpression;
import ios.foundation.NSPredicate;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import ios.NSObject;
import ios.foundation.NSMethodSignature;
import ios.foundation.NSSet;

@Generated
@Library("CoreData")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSFetchRequestExpression extends NSExpression {
	static {
		NatJ.register();
	}

	@Generated
	protected NSFetchRequestExpression(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSFetchRequestExpression alloc();

	/**
	 * contextExpression</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/NSFetchRequestExpression_class/index.html#//apple_ref/occ/instp/NSFetchRequestExpression/contextExpression">iOS Dev Center</a>
	 */
	@Generated
	@Selector("contextExpression")
	public native NSExpression contextExpression();

	@Generated
	@Selector("expressionForAggregate:")
	public static native NSExpression expressionForAggregate(
			NSArray<?> subexpressions);

	@Generated
	@Selector("expressionForAnyKey")
	public static native NSExpression expressionForAnyKey();

	@Generated
	@Selector("expressionForBlock:arguments:")
	public static native NSExpression expressionForBlockArguments(
			@ObjCBlock(name = "call_expressionForBlockArguments") NSExpression.Block_expressionForBlockArguments block,
			NSArray<? extends NSExpression> arguments);

	@Generated
	@Selector("expressionForConstantValue:")
	public static native NSExpression expressionForConstantValue(
			@Mapped(ObjCObjectMapper.class) Object obj);

	@Generated
	@Selector("expressionForEvaluatedObject")
	public static native NSExpression expressionForEvaluatedObject();

	/**
	 * expressionForFetch:context:countOnly:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/NSFetchRequestExpression_class/index.html#//apple_ref/occ/clm/NSFetchRequestExpression/expressionForFetch:context:countOnly:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("expressionForFetch:context:countOnly:")
	public static native NSExpression expressionForFetchContextCountOnly(
			NSExpression fetch, NSExpression context, boolean countFlag);

	@Generated
	@Selector("expressionForFunction:arguments:")
	public static native NSExpression expressionForFunctionArguments(
			String name, NSArray<?> parameters);

	@Generated
	@Selector("expressionForFunction:selectorName:arguments:")
	public static native NSExpression expressionForFunctionSelectorNameArguments(
			NSExpression target, String name, NSArray<?> parameters);

	@Generated
	@Selector("expressionForIntersectSet:with:")
	public static native NSExpression expressionForIntersectSetWith(
			NSExpression left, NSExpression right);

	@Generated
	@Selector("expressionForKeyPath:")
	public static native NSExpression expressionForKeyPath(String keyPath);

	@Generated
	@Selector("expressionForMinusSet:with:")
	public static native NSExpression expressionForMinusSetWith(
			NSExpression left, NSExpression right);

	@Generated
	@Selector("expressionForSubquery:usingIteratorVariable:predicate:")
	public static native NSExpression expressionForSubqueryUsingIteratorVariablePredicate(
			NSExpression expression, String variable,
			@Mapped(ObjCObjectMapper.class) Object predicate);

	@Generated
	@Selector("expressionForUnionSet:with:")
	public static native NSExpression expressionForUnionSetWith(
			NSExpression left, NSExpression right);

	@Generated
	@Selector("expressionForVariable:")
	public static native NSExpression expressionForVariable(String string);

	@Generated
	@Variadic()
	@Selector("expressionWithFormat:")
	public static native NSExpression expressionWithFormat(
			String expressionFormat, Object... varargs);

	@Generated
	@Selector("expressionWithFormat:argumentArray:")
	public static native NSExpression expressionWithFormatArgumentArray(
			String expressionFormat, NSArray<?> arguments);

	@Generated
	@Selector("expressionWithFormat:arguments:")
	public static native NSExpression expressionWithFormatArguments(
			String expressionFormat, BytePtr argList);

	@Generated
	@Selector("init")
	public native NSFetchRequestExpression init();

	@Generated
	@Selector("initWithExpressionType:")
	public native NSFetchRequestExpression initWithExpressionType(
			@NUInt long type);

	/**
	 * countOnlyRequest</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/NSFetchRequestExpression_class/index.html#//apple_ref/occ/instp/NSFetchRequestExpression/countOnlyRequest">iOS Dev Center</a>
	 */
	@Generated
	@Selector("isCountOnlyRequest")
	public native boolean isCountOnlyRequest();

	/**
	 * requestExpression</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/NSFetchRequestExpression_class/index.html#//apple_ref/occ/instp/NSFetchRequestExpression/requestExpression">iOS Dev Center</a>
	 */
	@Generated
	@Selector("requestExpression")
	public native NSExpression requestExpression();

	@Generated
	@Selector("expressionForConditional:trueExpression:falseExpression:")
	public static native NSExpression expressionForConditionalTrueExpressionFalseExpression(NSPredicate predicate,
			NSExpression trueExpression, NSExpression falseExpression);

	@Generated
	@Selector("initWithCoder:")
	public native NSFetchRequestExpression initWithCoder(NSCoder coder);

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
	@Selector("supportsSecureCoding")
	public static native boolean supportsSecureCoding();

	@Generated
	@ProtocolClassMethod("supportsSecureCoding")
	public boolean _supportsSecureCoding() {
		return supportsSecureCoding();
	}

	@Generated
	@Selector("version")
	@NInt
	public static native long version_static();
}

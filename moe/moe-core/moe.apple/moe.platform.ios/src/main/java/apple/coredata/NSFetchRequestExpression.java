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

package apple.coredata;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSExpression;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSPredicate;
import apple.foundation.NSSet;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.c.ann.Variadic;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.BytePtr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

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
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSFetchRequestExpression alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native NSFetchRequestExpression allocWithZone(VoidPtr zone);

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
    @Selector("expressionForAggregate:")
    public static native NSExpression expressionForAggregate(NSArray<? extends NSExpression> subexpressions);

    @Generated
    @Selector("expressionForAnyKey")
    public static native NSExpression expressionForAnyKey();

    @Generated
    @Selector("expressionForBlock:arguments:")
    public static native NSExpression expressionForBlockArguments(
            @ObjCBlock(name = "call_expressionForBlockArguments") NSExpression.Block_expressionForBlockArguments block,
            NSArray<? extends NSExpression> arguments);

    @Generated
    @Selector("expressionForConditional:trueExpression:falseExpression:")
    public static native NSExpression expressionForConditionalTrueExpressionFalseExpression(NSPredicate predicate,
            NSExpression trueExpression, NSExpression falseExpression);

    @Generated
    @Selector("expressionForConstantValue:")
    public static native NSExpression expressionForConstantValue(@Mapped(ObjCObjectMapper.class) Object obj);

    @Generated
    @Selector("expressionForEvaluatedObject")
    public static native NSExpression expressionForEvaluatedObject();

    /**
     * Returns an expression which will evaluate to the result of executing a fetch request on a context. The first
     * argument must be an expression which evaluates to an NSFetchRequest *, and the second must be an expression which
     * evaluates to an NSManagedObjectContext *. If the desired result is simply the count for the request, the
     * "countOnly" argument should be YES.
     */
    @Generated
    @Selector("expressionForFetch:context:countOnly:")
    public static native NSExpression expressionForFetchContextCountOnly(NSExpression fetch, NSExpression context,
            boolean countFlag);

    @Generated
    @Selector("expressionForFunction:arguments:")
    public static native NSExpression expressionForFunctionArguments(String name, NSArray<?> parameters);

    @Generated
    @Selector("expressionForFunction:selectorName:arguments:")
    public static native NSExpression expressionForFunctionSelectorNameArguments(NSExpression target, String name,
            NSArray<?> parameters);

    @Generated
    @Selector("expressionForIntersectSet:with:")
    public static native NSExpression expressionForIntersectSetWith(NSExpression left, NSExpression right);

    @Generated
    @Selector("expressionForKeyPath:")
    public static native NSExpression expressionForKeyPath(String keyPath);

    @Generated
    @Selector("expressionForMinusSet:with:")
    public static native NSExpression expressionForMinusSetWith(NSExpression left, NSExpression right);

    @Generated
    @Selector("expressionForSubquery:usingIteratorVariable:predicate:")
    public static native NSExpression expressionForSubqueryUsingIteratorVariablePredicate(NSExpression expression,
            String variable, NSPredicate predicate);

    @Generated
    @Selector("expressionForUnionSet:with:")
    public static native NSExpression expressionForUnionSetWith(NSExpression left, NSExpression right);

    @Generated
    @Selector("expressionForVariable:")
    public static native NSExpression expressionForVariable(String string);

    @Generated
    @Variadic()
    @Selector("expressionWithFormat:")
    public static native NSExpression expressionWithFormat(String expressionFormat, Object... varargs);

    @Generated
    @Selector("expressionWithFormat:argumentArray:")
    public static native NSExpression expressionWithFormatArgumentArray(String expressionFormat, NSArray<?> arguments);

    @Generated
    @Selector("expressionWithFormat:arguments:")
    public static native NSExpression expressionWithFormatArguments(String expressionFormat, BytePtr argList);

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
    public static native NSFetchRequestExpression new_objc();

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
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * Returns the expression for the managed object context: evaluating it must return an NSManagedObjectContext *.
     */
    @Generated
    @Selector("contextExpression")
    public native NSExpression contextExpression();

    @Generated
    @Selector("init")
    public native NSFetchRequestExpression init();

    @Generated
    @Selector("initWithCoder:")
    public native NSFetchRequestExpression initWithCoder(NSCoder coder);

    @Generated
    @Selector("initWithExpressionType:")
    public native NSFetchRequestExpression initWithExpressionType(@NUInt long type);

    /**
     * Boolean indicating if the request will return object values or merely the count. If the value returns NO, the
     * managed object context (from the contextExpression) will perform executeFetchRequest:error: with the
     * requestExpression; if the value returns YES, the managed object context will perform countForFetchRequest:error
     * with the requestExpression.
     */
    @Generated
    @Selector("isCountOnlyRequest")
    public native boolean isCountOnlyRequest();

    /**
     * Returns the expression for the fetch request: evaluating it must return an NSFetchRequest *.
     */
    @Generated
    @Selector("requestExpression")
    public native NSExpression requestExpression();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }
}

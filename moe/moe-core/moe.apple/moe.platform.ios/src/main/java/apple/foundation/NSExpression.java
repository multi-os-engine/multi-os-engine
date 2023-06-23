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

package apple.foundation;

import apple.NSObject;
import apple.foundation.protocol.NSCopying;
import apple.foundation.protocol.NSSecureCoding;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.c.ann.Variadic;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * API-Since: 3.0
 */
@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSExpression extends NSObject implements NSSecureCoding, NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected NSExpression(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSExpression alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native NSExpression allocWithZone(VoidPtr zone);

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

    /**
     * Expression that returns a collection containing the results of other expressions
     * 
     * API-Since: 3.0
     */
    @NotNull
    @Generated
    @Selector("expressionForAggregate:")
    public static native NSExpression expressionForAggregate(@NotNull NSArray<? extends NSExpression> subexpressions);

    /**
     * API-Since: 7.0
     */
    @NotNull
    @Generated
    @Selector("expressionForAnyKey")
    public static native NSExpression expressionForAnyKey();

    /**
     * Expression that invokes the block with the parameters; note that block expressions are not encodable or
     * representable as parseable strings.
     * 
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @Selector("expressionForBlock:arguments:")
    public static native NSExpression expressionForBlockArguments(
            @NotNull @ObjCBlock(name = "call_expressionForBlockArguments") Block_expressionForBlockArguments block,
            @Nullable NSArray<? extends NSExpression> arguments);

    /**
     * Expression that will return the result of trueExpression or falseExpression depending on the value of predicate
     * 
     * API-Since: 9.0
     */
    @NotNull
    @Generated
    @Selector("expressionForConditional:trueExpression:falseExpression:")
    public static native NSExpression expressionForConditionalTrueExpressionFalseExpression(
            @NotNull NSPredicate predicate, @NotNull NSExpression trueExpression,
            @NotNull NSExpression falseExpression);

    /**
     * Expression that returns a constant value
     */
    @NotNull
    @Generated
    @Selector("expressionForConstantValue:")
    public static native NSExpression expressionForConstantValue(@Nullable @Mapped(ObjCObjectMapper.class) Object obj);

    /**
     * Expression that returns the object being evaluated
     */
    @NotNull
    @Generated
    @Selector("expressionForEvaluatedObject")
    public static native NSExpression expressionForEvaluatedObject();

    /**
     * Expression that invokes one of the predefined functions. Will throw immediately if the selector is bad; will
     * throw at runtime if the parameters are incorrect.
     */
    @NotNull
    @Generated
    @Selector("expressionForFunction:arguments:")
    public static native NSExpression expressionForFunctionArguments(@NotNull String name,
            @NotNull NSArray<?> parameters);

    /**
     * Expression that invokes the selector on target with parameters. Will throw at runtime if target does not
     * implement selector or if parameters are wrong.
     * 
     * API-Since: 3.0
     */
    @NotNull
    @Generated
    @Selector("expressionForFunction:selectorName:arguments:")
    public static native NSExpression expressionForFunctionSelectorNameArguments(@NotNull NSExpression target,
            @NotNull String name, @Nullable NSArray<?> parameters);

    /**
     * return an expression that will return the intersection of the collections expressed by left and right
     * 
     * API-Since: 3.0
     */
    @NotNull
    @Generated
    @Selector("expressionForIntersectSet:with:")
    public static native NSExpression expressionForIntersectSetWith(@NotNull NSExpression left,
            @NotNull NSExpression right);

    /**
     * Expression that invokes valueForKeyPath with keyPath
     */
    @NotNull
    @Generated
    @Selector("expressionForKeyPath:")
    public static native NSExpression expressionForKeyPath(@NotNull String keyPath);

    /**
     * return an expression that will return the disjunction of the collections expressed by left and right
     * 
     * API-Since: 3.0
     */
    @NotNull
    @Generated
    @Selector("expressionForMinusSet:with:")
    public static native NSExpression expressionForMinusSetWith(@NotNull NSExpression left,
            @NotNull NSExpression right);

    /**
     * Expression that filters a collection by storing elements in the collection in the variable variable and keeping
     * the elements for which qualifer returns true; variable is used as a local variable, and will shadow any instances
     * of variable in the bindings dictionary, the variable is removed or the old value replaced once evaluation
     * completes
     * 
     * API-Since: 3.0
     */
    @NotNull
    @Generated
    @Selector("expressionForSubquery:usingIteratorVariable:predicate:")
    public static native NSExpression expressionForSubqueryUsingIteratorVariablePredicate(
            @NotNull NSExpression expression, @NotNull String variable, @NotNull NSPredicate predicate);

    /**
     * return an expression that will return the union of the collections expressed by left and right
     * 
     * API-Since: 3.0
     */
    @NotNull
    @Generated
    @Selector("expressionForUnionSet:with:")
    public static native NSExpression expressionForUnionSetWith(@NotNull NSExpression left,
            @NotNull NSExpression right);

    /**
     * Expression that pulls a value from the variable bindings dictionary
     */
    @NotNull
    @Generated
    @Selector("expressionForVariable:")
    public static native NSExpression expressionForVariable(@NotNull String string);

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @Variadic()
    @Selector("expressionWithFormat:")
    public static native NSExpression expressionWithFormat(@NotNull String expressionFormat, Object... varargs);

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @Selector("expressionWithFormat:argumentArray:")
    public static native NSExpression expressionWithFormatArgumentArray(@NotNull String expressionFormat,
            @NotNull NSArray<?> arguments);

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @Selector("expressionWithFormat:arguments:")
    public static native NSExpression expressionWithFormatArguments(@NotNull String expressionFormat, BytePtr argList);

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
    public static native NSExpression new_objc();

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
     * Force an expression which was securely decoded to allow evaluation
     * 
     * API-Since: 7.0
     */
    @Generated
    @Selector("allowEvaluation")
    public native void allowEvaluation();

    /**
     * array of expressions which will be passed as parameters during invocation of the selector on the operand of a
     * function expression
     */
    @Nullable
    @Generated
    @Selector("arguments")
    public native NSArray<? extends NSExpression> arguments();

    /**
     * API-Since: 3.0
     */
    @NotNull
    @Generated
    @Selector("collection")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object collection();

    @Nullable
    @Generated
    @Selector("constantValue")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object constantValue();

    @NotNull
    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(@Nullable VoidPtr zone);

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(@NotNull NSCoder coder);

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @Selector("expressionBlock")
    @ObjCBlock(name = "call_expressionBlock_ret")
    public native Block_expressionBlock_ret expressionBlock();

    /**
     * accessors for individual parameters - raise if not applicable
     */
    @Generated
    @Selector("expressionType")
    @NUInt
    public native long expressionType();

    /**
     * evaluate the expression using the object and bindings- note that context is mutable here and can be used by
     * expressions to store temporary state for one predicate evaluation
     */
    @Nullable
    @Generated
    @Selector("expressionValueWithObject:context:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object expressionValueWithObjectContext(@Nullable @Mapped(ObjCObjectMapper.class) Object object,
            @Nullable NSMutableDictionary<?, ?> context);

    /**
     * expression which will be evaluated if a conditional expression's predicate evaluates to false
     * 
     * API-Since: 9.0
     */
    @NotNull
    @Generated
    @Selector("falseExpression")
    public native NSExpression falseExpression();

    @NotNull
    @Generated
    @Selector("function")
    public native String function();

    @Generated
    @Selector("init")
    public native NSExpression init();

    @Generated
    @Selector("initWithCoder:")
    public native NSExpression initWithCoder(@NotNull NSCoder coder);

    @Generated
    @Selector("initWithExpressionType:")
    public native NSExpression initWithExpressionType(@NUInt long type);

    @NotNull
    @Generated
    @Selector("keyPath")
    public native String keyPath();

    /**
     * expression which represents the left side of a set expression
     * 
     * API-Since: 3.0
     */
    @NotNull
    @Generated
    @Selector("leftExpression")
    public native NSExpression leftExpression();

    /**
     * the object on which the selector will be invoked (the result of evaluating a key path or one of the defined
     * functions)
     */
    @NotNull
    @Generated
    @Selector("operand")
    public native NSExpression operand();

    /**
     * API-Since: 3.0
     */
    @NotNull
    @Generated
    @Selector("predicate")
    public native NSPredicate predicate();

    /**
     * expression which represents the right side of a set expression
     * 
     * API-Since: 3.0
     */
    @NotNull
    @Generated
    @Selector("rightExpression")
    public native NSExpression rightExpression();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    /**
     * expression which will be evaluated if a conditional expression's predicate evaluates to true
     * 
     * API-Since: 9.0
     */
    @NotNull
    @Generated
    @Selector("trueExpression")
    public native NSExpression trueExpression();

    @NotNull
    @Generated
    @Selector("variable")
    public native String variable();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_expressionBlock_ret {
        @NotNull
        @Generated
        @MappedReturn(ObjCObjectMapper.class)
        Object call_expressionBlock_ret(@Nullable @Mapped(ObjCObjectMapper.class) Object arg0,
                @NotNull NSArray<? extends NSExpression> arg1, @Nullable NSMutableDictionary<?, ?> arg2);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_expressionForBlockArguments {
        @NotNull
        @Generated
        @MappedReturn(ObjCObjectMapper.class)
        Object call_expressionForBlockArguments(@Nullable @Mapped(ObjCObjectMapper.class) Object evaluatedObject,
                @NotNull NSArray<? extends NSExpression> expressions, @Nullable NSMutableDictionary<?, ?> context);
    }
}

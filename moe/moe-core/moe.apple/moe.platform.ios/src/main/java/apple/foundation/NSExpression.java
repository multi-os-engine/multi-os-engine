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
    @Owned
    @Selector("alloc")
    public static native NSExpression alloc();

    /**
     * allowEvaluation</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSExpression_Class/index.html#//apple_ref/occ/instm/NSExpression/allowEvaluation">iOS Dev Center</a>
     */
    @Generated
    @Selector("allowEvaluation")
    public native void allowEvaluation();

    /**
     * arguments</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSExpression_Class/index.html#//apple_ref/occ/instp/NSExpression/arguments">iOS Dev Center</a>
     */
    @Generated
    @Selector("arguments")
    public native NSArray<? extends NSExpression> arguments();

    /**
     * collection</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSExpression_Class/index.html#//apple_ref/occ/instp/NSExpression/collection">iOS Dev Center</a>
     */
    @Generated
    @Selector("collection")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object collection();

    /**
     * constantValue</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSExpression_Class/index.html#//apple_ref/occ/instp/NSExpression/constantValue">iOS Dev Center</a>
     */
    @Generated
    @Selector("constantValue")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object constantValue();

    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(VoidPtr zone);

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(NSCoder aCoder);

    /**
     * expressionForAggregate:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSExpression_Class/index.html#//apple_ref/occ/clm/NSExpression/expressionForAggregate:">iOS Dev Center</a>
     */
    @Generated
    @Selector("expressionForAggregate:")
    public static native NSExpression expressionForAggregate(NSArray<?> subexpressions);

    /**
     * expressionForAnyKey</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSExpression_Class/index.html#//apple_ref/occ/clm/NSExpression/expressionForAnyKey">iOS Dev Center</a>
     */
    @Generated
    @Selector("expressionForAnyKey")
    public static native NSExpression expressionForAnyKey();

    /**
     * expressionForBlock:arguments:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSExpression_Class/index.html#//apple_ref/occ/clm/NSExpression/expressionForBlock:arguments:">iOS Dev Center</a>
     */
    @Generated
    @Selector("expressionForBlock:arguments:")
    public static native NSExpression expressionForBlockArguments(
            @ObjCBlock(name = "call_expressionForBlockArguments") Block_expressionForBlockArguments block,
            NSArray<? extends NSExpression> arguments);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_expressionForBlockArguments {
        @Generated
        @MappedReturn(ObjCObjectMapper.class)
        Object call_expressionForBlockArguments(@Mapped(ObjCObjectMapper.class) Object arg0, NSArray<?> arg1,
                NSMutableDictionary<?, ?> arg2);
    }

    /**
     * expressionForConstantValue:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSExpression_Class/index.html#//apple_ref/occ/clm/NSExpression/expressionForConstantValue:">iOS Dev Center</a>
     */
    @Generated
    @Selector("expressionForConstantValue:")
    public static native NSExpression expressionForConstantValue(@Mapped(ObjCObjectMapper.class) Object obj);

    /**
     * expressionForEvaluatedObject</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSExpression_Class/index.html#//apple_ref/occ/clm/NSExpression/expressionForEvaluatedObject">iOS Dev Center</a>
     */
    @Generated
    @Selector("expressionForEvaluatedObject")
    public static native NSExpression expressionForEvaluatedObject();

    /**
     * expressionForFunction:arguments:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSExpression_Class/index.html#//apple_ref/occ/clm/NSExpression/expressionForFunction:arguments:">iOS Dev Center</a>
     */
    @Generated
    @Selector("expressionForFunction:arguments:")
    public static native NSExpression expressionForFunctionArguments(String name, NSArray<?> parameters);

    /**
     * expressionForFunction:selectorName:arguments:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSExpression_Class/index.html#//apple_ref/occ/clm/NSExpression/expressionForFunction:selectorName:arguments:">iOS Dev Center</a>
     */
    @Generated
    @Selector("expressionForFunction:selectorName:arguments:")
    public static native NSExpression expressionForFunctionSelectorNameArguments(NSExpression target, String name,
            NSArray<?> parameters);

    /**
     * expressionForIntersectSet:with:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSExpression_Class/index.html#//apple_ref/occ/clm/NSExpression/expressionForIntersectSet:with:">iOS Dev Center</a>
     */
    @Generated
    @Selector("expressionForIntersectSet:with:")
    public static native NSExpression expressionForIntersectSetWith(NSExpression left, NSExpression right);

    /**
     * expressionForKeyPath:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSExpression_Class/index.html#//apple_ref/occ/clm/NSExpression/expressionForKeyPath:">iOS Dev Center</a>
     */
    @Generated
    @Selector("expressionForKeyPath:")
    public static native NSExpression expressionForKeyPath(String keyPath);

    /**
     * expressionForMinusSet:with:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSExpression_Class/index.html#//apple_ref/occ/clm/NSExpression/expressionForMinusSet:with:">iOS Dev Center</a>
     */
    @Generated
    @Selector("expressionForMinusSet:with:")
    public static native NSExpression expressionForMinusSetWith(NSExpression left, NSExpression right);

    /**
     * expressionForSubquery:usingIteratorVariable:predicate:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSExpression_Class/index.html#//apple_ref/occ/clm/NSExpression/expressionForSubquery:usingIteratorVariable:predicate:">iOS Dev Center</a>
     */
    @Generated
    @Selector("expressionForSubquery:usingIteratorVariable:predicate:")
    public static native NSExpression expressionForSubqueryUsingIteratorVariablePredicate(NSExpression expression,
            String variable, @Mapped(ObjCObjectMapper.class) Object predicate);

    /**
     * expressionForUnionSet:with:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSExpression_Class/index.html#//apple_ref/occ/clm/NSExpression/expressionForUnionSet:with:">iOS Dev Center</a>
     */
    @Generated
    @Selector("expressionForUnionSet:with:")
    public static native NSExpression expressionForUnionSetWith(NSExpression left, NSExpression right);

    /**
     * expressionForVariable:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSExpression_Class/index.html#//apple_ref/occ/clm/NSExpression/expressionForVariable:">iOS Dev Center</a>
     */
    @Generated
    @Selector("expressionForVariable:")
    public static native NSExpression expressionForVariable(String string);

    /**
     * expressionType</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSExpression_Class/index.html#//apple_ref/occ/instp/NSExpression/expressionType">iOS Dev Center</a>
     */
    @Generated
    @Selector("expressionType")
    @NUInt
    public native long expressionType();

    /**
     * expressionValueWithObject:context:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSExpression_Class/index.html#//apple_ref/occ/instm/NSExpression/expressionValueWithObject:context:">iOS Dev Center</a>
     */
    @Generated
    @Selector("expressionValueWithObject:context:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object expressionValueWithObjectContext(@Mapped(ObjCObjectMapper.class) Object object,
            NSMutableDictionary<?, ?> context);

    /**
     * expressionWithFormat:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSExpression_Class/index.html#//apple_ref/occ/clm/NSExpression/expressionWithFormat:">iOS Dev Center</a>
     */
    @Generated
    @Variadic()
    @Selector("expressionWithFormat:")
    public static native NSExpression expressionWithFormat(String expressionFormat, Object... varargs);

    /**
     * expressionWithFormat:argumentArray:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSExpression_Class/index.html#//apple_ref/occ/clm/NSExpression/expressionWithFormat:argumentArray:">iOS Dev Center</a>
     */
    @Generated
    @Selector("expressionWithFormat:argumentArray:")
    public static native NSExpression expressionWithFormatArgumentArray(String expressionFormat, NSArray<?> arguments);

    /**
     * expressionWithFormat:arguments:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSExpression_Class/index.html#//apple_ref/occ/clm/NSExpression/expressionWithFormat:arguments:">iOS Dev Center</a>
     */
    @Generated
    @Selector("expressionWithFormat:arguments:")
    public static native NSExpression expressionWithFormatArguments(String expressionFormat, BytePtr argList);

    /**
     * function</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSExpression_Class/index.html#//apple_ref/occ/instp/NSExpression/function">iOS Dev Center</a>
     */
    @Generated
    @Selector("function")
    public native String function();

    @Generated
    @Selector("init")
    public native NSExpression init();

    @Generated
    @Selector("initWithCoder:")
    public native NSExpression initWithCoder(NSCoder coder);

    /**
     * initWithExpressionType:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSExpression_Class/index.html#//apple_ref/occ/instm/NSExpression/initWithExpressionType:">iOS Dev Center</a>
     */
    @Generated
    @Selector("initWithExpressionType:")
    public native NSExpression initWithExpressionType(@NUInt long type);

    /**
     * keyPath</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSExpression_Class/index.html#//apple_ref/occ/instp/NSExpression/keyPath">iOS Dev Center</a>
     */
    @Generated
    @Selector("keyPath")
    public native String keyPath();

    /**
     * leftExpression</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSExpression_Class/index.html#//apple_ref/occ/instp/NSExpression/leftExpression">iOS Dev Center</a>
     */
    @Generated
    @Selector("leftExpression")
    public native NSExpression leftExpression();

    /**
     * operand</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSExpression_Class/index.html#//apple_ref/occ/instp/NSExpression/operand">iOS Dev Center</a>
     */
    @Generated
    @Selector("operand")
    public native NSExpression operand();

    /**
     * predicate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSExpression_Class/index.html#//apple_ref/occ/instp/NSExpression/predicate">iOS Dev Center</a>
     */
    @Generated
    @Selector("predicate")
    public native NSPredicate predicate();

    /**
     * rightExpression</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSExpression_Class/index.html#//apple_ref/occ/instp/NSExpression/rightExpression">iOS Dev Center</a>
     */
    @Generated
    @Selector("rightExpression")
    public native NSExpression rightExpression();

    @Generated
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    /**
     * variable</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSExpression_Class/index.html#//apple_ref/occ/instp/NSExpression/variable">iOS Dev Center</a>
     */
    @Generated
    @Selector("variable")
    public native String variable();

    /**
     * expressionBlock</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSExpression_Class/index.html#//apple_ref/occ/instp/NSExpression/expressionBlock">iOS Dev Center</a>
     */
    @Generated
    @Selector("expressionBlock")
    @ObjCBlock(name = "call_expressionBlock_ret")
    public native Block_expressionBlock_ret expressionBlock();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_expressionBlock_ret {
        @Generated
        @MappedReturn(ObjCObjectMapper.class)
        Object call_expressionBlock_ret(@Mapped(ObjCObjectMapper.class) Object arg0, NSArray<?> arg1,
                NSMutableDictionary<?, ?> arg2);
    }

    @Generated
    @Selector("expressionForConditional:trueExpression:falseExpression:")
    public static native NSExpression expressionForConditionalTrueExpressionFalseExpression(NSPredicate predicate,
            NSExpression trueExpression, NSExpression falseExpression);

    @Generated
    @Selector("falseExpression")
    public native NSExpression falseExpression();

    @Generated
    @Selector("trueExpression")
    public native NSExpression trueExpression();

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

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
 * Predicates wrap some combination of expressions and operators and when evaluated return a BOOL.
 * 
 * API-Since: 3.0
 */
@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSPredicate extends NSObject implements NSSecureCoding, NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected NSPredicate(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSPredicate alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native NSPredicate allocWithZone(VoidPtr zone);

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
    public static native NSPredicate new_objc();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @Selector("predicateWithBlock:")
    public static native NSPredicate predicateWithBlock(
            @NotNull @ObjCBlock(name = "call_predicateWithBlock") Block_predicateWithBlock block);

    @NotNull
    @Generated
    @Variadic()
    @Selector("predicateWithFormat:")
    public static native NSPredicate predicateWithFormat(@NotNull String predicateFormat, Object... varargs);

    /**
     * Parse predicateFormat and return an appropriate predicate
     */
    @NotNull
    @Generated
    @Selector("predicateWithFormat:argumentArray:")
    public static native NSPredicate predicateWithFormatArgumentArray(@NotNull String predicateFormat,
            @Nullable NSArray<?> arguments);

    @NotNull
    @Generated
    @Selector("predicateWithFormat:arguments:")
    public static native NSPredicate predicateWithFormatArguments(@NotNull String predicateFormat, BytePtr argList);

    /**
     * return predicates that always evaluate to true/false
     */
    @NotNull
    @Generated
    @Selector("predicateWithValue:")
    public static native NSPredicate predicateWithValue(boolean value);

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
     * Force a predicate which was securely decoded to allow evaluation
     * 
     * API-Since: 7.0
     */
    @Generated
    @Selector("allowEvaluation")
    public native void allowEvaluation();

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
     * evaluate a predicate against a single object
     */
    @Generated
    @Selector("evaluateWithObject:")
    public native boolean evaluateWithObject(@Nullable @Mapped(ObjCObjectMapper.class) Object object);

    /**
     * single pass evaluation substituting variables from the bindings dictionary for any variable expressions
     * encountered
     * 
     * API-Since: 3.0
     */
    @Generated
    @Selector("evaluateWithObject:substitutionVariables:")
    public native boolean evaluateWithObjectSubstitutionVariables(
            @Nullable @Mapped(ObjCObjectMapper.class) Object object, @Nullable NSDictionary<String, ?> bindings);

    @Generated
    @Selector("init")
    public native NSPredicate init();

    @Generated
    @Selector("initWithCoder:")
    public native NSPredicate initWithCoder(@NotNull NSCoder coder);

    /**
     * returns the format string of the predicate
     */
    @NotNull
    @Generated
    @Selector("predicateFormat")
    public native String predicateFormat();

    /**
     * substitute constant values for variables
     */
    @NotNull
    @Generated
    @Selector("predicateWithSubstitutionVariables:")
    public native NSPredicate predicateWithSubstitutionVariables(@NotNull NSDictionary<String, ?> variables);

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_predicateWithBlock {
        @Generated
        boolean call_predicateWithBlock(@Nullable @Mapped(ObjCObjectMapper.class) Object evaluatedObject,
                @Nullable NSDictionary<String, ?> bindings);
    }

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}

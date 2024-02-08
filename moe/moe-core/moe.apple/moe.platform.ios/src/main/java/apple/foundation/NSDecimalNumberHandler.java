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
import apple.foundation.protocol.NSCoding;
import apple.foundation.protocol.NSDecimalNumberBehaviors;
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

@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSDecimalNumberHandler extends NSObject implements NSDecimalNumberBehaviors, NSCoding {
    static {
        NatJ.register();
    }

    @Generated
    protected NSDecimalNumberHandler(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSDecimalNumberHandler alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native NSDecimalNumberHandler allocWithZone(VoidPtr zone);

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
    @Selector("decimalNumberHandlerWithRoundingMode:scale:raiseOnExactness:raiseOnOverflow:raiseOnUnderflow:raiseOnDivideByZero:")
    public static native NSDecimalNumberHandler decimalNumberHandlerWithRoundingModeScaleRaiseOnExactnessRaiseOnOverflowRaiseOnUnderflowRaiseOnDivideByZero(
            @NUInt long roundingMode, short scale, boolean exact, boolean overflow, boolean underflow,
            boolean divideByZero);

    @NotNull
    @Generated
    @Selector("defaultDecimalNumberHandler")
    public static native NSDecimalNumberHandler defaultDecimalNumberHandler();

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
    public static native NSDecimalNumberHandler new_objc();

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

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(@NotNull NSCoder coder);

    @Nullable
    @Generated
    @Selector("exceptionDuringOperation:error:leftOperand:rightOperand:")
    public native NSDecimalNumber exceptionDuringOperationErrorLeftOperandRightOperand(@NotNull SEL operation,
            @NUInt long error, @NotNull NSDecimalNumber leftOperand, @Nullable NSDecimalNumber rightOperand);

    @Generated
    @Selector("init")
    public native NSDecimalNumberHandler init();

    @Generated
    @Selector("initWithCoder:")
    public native NSDecimalNumberHandler initWithCoder(@NotNull NSCoder coder);

    /**
     * rounding mode: NSRoundPlain
     * scale: No defined scale (full precision)
     * ignore exactnessException (return nil)
     * raise on overflow, underflow and divide by zero.
     */
    @Generated
    @Selector("initWithRoundingMode:scale:raiseOnExactness:raiseOnOverflow:raiseOnUnderflow:raiseOnDivideByZero:")
    public native NSDecimalNumberHandler initWithRoundingModeScaleRaiseOnExactnessRaiseOnOverflowRaiseOnUnderflowRaiseOnDivideByZero(
            @NUInt long roundingMode, short scale, boolean exact, boolean overflow, boolean underflow,
            boolean divideByZero);

    @Generated
    @Selector("roundingMode")
    @NUInt
    public native long roundingMode();

    @Generated
    @Selector("scale")
    public native short scale();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}

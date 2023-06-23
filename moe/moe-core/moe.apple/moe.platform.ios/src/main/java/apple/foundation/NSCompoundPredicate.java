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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * API-Since: 3.0
 */
@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSCompoundPredicate extends NSPredicate {
    static {
        NatJ.register();
    }

    @Generated
    protected NSCompoundPredicate(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSCompoundPredicate alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native NSCompoundPredicate allocWithZone(VoidPtr zone);

    /**
     * Convenience Methods **
     */
    @NotNull
    @Generated
    @Selector("andPredicateWithSubpredicates:")
    public static native NSCompoundPredicate andPredicateWithSubpredicates(
            @NotNull NSArray<? extends NSPredicate> subpredicates);

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
    public static native NSCompoundPredicate new_objc();

    @NotNull
    @Generated
    @Selector("notPredicateWithSubpredicate:")
    public static native NSCompoundPredicate notPredicateWithSubpredicate(@NotNull NSPredicate predicate);

    @NotNull
    @Generated
    @Selector("orPredicateWithSubpredicates:")
    public static native NSCompoundPredicate orPredicateWithSubpredicates(
            @NotNull NSArray<? extends NSPredicate> subpredicates);

    @NotNull
    @Generated
    @Selector("predicateWithBlock:")
    public static native NSPredicate predicateWithBlock(
            @NotNull @ObjCBlock(name = "call_predicateWithBlock") NSPredicate.Block_predicateWithBlock block);

    @NotNull
    @Generated
    @Variadic()
    @Selector("predicateWithFormat:")
    public static native NSPredicate predicateWithFormat(@NotNull String predicateFormat, Object... varargs);

    @NotNull
    @Generated
    @Selector("predicateWithFormat:argumentArray:")
    public static native NSPredicate predicateWithFormatArgumentArray(@NotNull String predicateFormat,
            @Nullable NSArray<?> arguments);

    @NotNull
    @Generated
    @Selector("predicateWithFormat:arguments:")
    public static native NSPredicate predicateWithFormatArguments(@NotNull String predicateFormat, BytePtr argList);

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

    @Generated
    @Selector("compoundPredicateType")
    @NUInt
    public native long compoundPredicateType();

    @Generated
    @Selector("init")
    public native NSCompoundPredicate init();

    @Generated
    @Selector("initWithCoder:")
    public native NSCompoundPredicate initWithCoder(@NotNull NSCoder coder);

    @Generated
    @Selector("initWithType:subpredicates:")
    public native NSCompoundPredicate initWithTypeSubpredicates(@NUInt long type,
            @NotNull NSArray<? extends NSPredicate> subpredicates);

    @NotNull
    @Generated
    @Selector("subpredicates")
    public native NSArray<?> subpredicates();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }
}

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
public class NSInvocation extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected NSInvocation(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSInvocation alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native NSInvocation allocWithZone(VoidPtr zone);

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

    @NotNull
    @Generated
    @Selector("invocationWithMethodSignature:")
    public static native NSInvocation invocationWithMethodSignature(@NotNull NSMethodSignature sig);

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
    public static native NSInvocation new_objc();

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
    @Selector("argumentsRetained")
    public native boolean argumentsRetained();

    @Generated
    @Selector("getArgument:atIndex:")
    public native void getArgumentAtIndex(@NotNull VoidPtr argumentLocation, @NInt long idx);

    @Generated
    @Selector("getReturnValue:")
    public native void getReturnValue(@NotNull VoidPtr retLoc);

    @Generated
    @Selector("init")
    public native NSInvocation init();

    @Generated
    @Selector("invoke")
    public native void invoke();

    @Generated
    @Selector("invokeWithTarget:")
    public native void invokeWithTarget(@NotNull @Mapped(ObjCObjectMapper.class) Object target);

    @NotNull
    @Generated
    @Selector("methodSignature")
    public native NSMethodSignature methodSignature();

    @Generated
    @Selector("retainArguments")
    public native void retainArguments();

    @NotNull
    @Generated
    @Selector("selector")
    public native SEL selector();

    @Generated
    @Selector("setArgument:atIndex:")
    public native void setArgumentAtIndex(@NotNull VoidPtr argumentLocation, @NInt long idx);

    @Generated
    @Selector("setReturnValue:")
    public native void setReturnValue(@NotNull VoidPtr retLoc);

    @Generated
    @Selector("setSelector:")
    public native void setSelector(@NotNull SEL value);

    @Generated
    @Selector("setTarget:")
    public native void setTarget_unsafe(@Nullable @Mapped(ObjCObjectMapper.class) Object value);

    @Generated
    public void setTarget(@Nullable @Mapped(ObjCObjectMapper.class) Object value) {
        Object __old = target();
        if (value != null) {
            org.moe.natj.objc.ObjCRuntime.associateObjCObject(this, value);
        }
        setTarget_unsafe(value);
        if (__old != null) {
            org.moe.natj.objc.ObjCRuntime.dissociateObjCObject(this, __old);
        }
    }

    @Nullable
    @Generated
    @Selector("target")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object target();

    @Generated
    @Selector("invokeUsingIMP:")
    public native void invokeUsingIMP(@NotNull @FunctionPtr(name = "call_invokeUsingIMP") Function_invokeUsingIMP imp);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Function_invokeUsingIMP {
        @Generated
        void call_invokeUsingIMP();
    }

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}

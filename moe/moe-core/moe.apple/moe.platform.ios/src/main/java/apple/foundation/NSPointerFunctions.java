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
import org.moe.natj.general.ptr.ConstVoidPtr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.moe.natj.objc.map.ObjCStringMapper;

@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSPointerFunctions extends NSObject implements NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected NSPointerFunctions(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSPointerFunctions alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native NSPointerFunctions allocWithZone(VoidPtr zone);

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
    public static native NSPointerFunctions new_objc();

    @Generated
    @Selector("pointerFunctionsWithOptions:")
    public static native NSPointerFunctions pointerFunctionsWithOptions(@NUInt long options);

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
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(VoidPtr zone);

    @Generated
    @Selector("descriptionFunction")
    @FunctionPtr(name = "call_descriptionFunction_ret")
    public native Function_descriptionFunction_ret descriptionFunction();

    @Generated
    @Selector("init")
    public native NSPointerFunctions init();

    /**
     * construction
     */
    @Generated
    @Selector("initWithOptions:")
    public native NSPointerFunctions initWithOptions(@NUInt long options);

    @Generated
    @Selector("setDescriptionFunction:")
    public native void setDescriptionFunction(
            @FunctionPtr(name = "call_setDescriptionFunction") Function_setDescriptionFunction value);

    @Generated
    @Selector("setSizeFunction:")
    public native void setSizeFunction(@FunctionPtr(name = "call_setSizeFunction") Function_setSizeFunction value);

    /**
     * pointers should (not) be assigned using the GC strong write barrier
     */
    @Generated
    @Selector("setUsesStrongWriteBarrier:")
    public native void setUsesStrongWriteBarrier(boolean value);

    /**
     * pointers should (not) use GC weak read and write barriers
     */
    @Generated
    @Selector("setUsesWeakReadAndWriteBarriers:")
    public native void setUsesWeakReadAndWriteBarriers(boolean value);

    @Generated
    @Selector("sizeFunction")
    @FunctionPtr(name = "call_sizeFunction_ret")
    public native Function_sizeFunction_ret sizeFunction();

    /**
     * pointers should (not) be assigned using the GC strong write barrier
     */
    @Generated
    @Selector("usesStrongWriteBarrier")
    public native boolean usesStrongWriteBarrier();

    /**
     * pointers should (not) use GC weak read and write barriers
     */
    @Generated
    @Selector("usesWeakReadAndWriteBarriers")
    public native boolean usesWeakReadAndWriteBarriers();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Function_descriptionFunction_ret {
        @Generated
        @MappedReturn(ObjCStringMapper.class)
        String call_descriptionFunction_ret(ConstVoidPtr arg0);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Function_setDescriptionFunction {
        @Generated
        @MappedReturn(ObjCStringMapper.class)
        String call_setDescriptionFunction(ConstVoidPtr arg0);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Function_setSizeFunction {
        @Generated
        @NUInt
        long call_setSizeFunction(ConstVoidPtr arg0);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Function_sizeFunction_ret {
        @Generated
        @NUInt
        long call_sizeFunction_ret(ConstVoidPtr arg0);
    }

    @Generated
    @Selector("acquireFunction")
    @FunctionPtr(name = "call_acquireFunction_ret")
    public native Function_acquireFunction_ret acquireFunction();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Function_acquireFunction_ret {
        @Runtime(ObjCRuntime.class)
        @Generated
        public interface Function_Function_acquireFunction_ret {
            @Generated
            @NUInt
            long call_Function_acquireFunction_ret(ConstVoidPtr arg0);
        }

        @Generated
        VoidPtr call_acquireFunction_ret(ConstVoidPtr arg0,
                @FunctionPtr(name = "call_Function_acquireFunction_ret") Function_Function_acquireFunction_ret arg1,
                boolean arg2);
    }

    /**
     * pointer personality functions
     */
    @Generated
    @Selector("hashFunction")
    @FunctionPtr(name = "call_hashFunction_ret")
    public native Function_hashFunction_ret hashFunction();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Function_hashFunction_ret {
        @Runtime(ObjCRuntime.class)
        @Generated
        public interface Function_Function_hashFunction_ret {
            @Generated
            @NUInt
            long call_Function_hashFunction_ret(ConstVoidPtr arg0);
        }

        @Generated
        @NUInt
        long call_hashFunction_ret(ConstVoidPtr arg0,
                @FunctionPtr(name = "call_Function_hashFunction_ret") Function_Function_hashFunction_ret arg1);
    }

    @Generated
    @Selector("isEqualFunction")
    @FunctionPtr(name = "call_isEqualFunction_ret")
    public native Function_isEqualFunction_ret isEqualFunction();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Function_isEqualFunction_ret {
        @Runtime(ObjCRuntime.class)
        @Generated
        public interface Function_Function_isEqualFunction_ret {
            @Generated
            @NUInt
            long call_Function_isEqualFunction_ret(ConstVoidPtr arg0);
        }

        @Generated
        boolean call_isEqualFunction_ret(ConstVoidPtr arg0, ConstVoidPtr arg1,
                @FunctionPtr(name = "call_Function_isEqualFunction_ret") Function_Function_isEqualFunction_ret arg2);
    }

    /**
     * custom memory configuration
     */
    @Generated
    @Selector("relinquishFunction")
    @FunctionPtr(name = "call_relinquishFunction_ret")
    public native Function_relinquishFunction_ret relinquishFunction();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Function_relinquishFunction_ret {
        @Runtime(ObjCRuntime.class)
        @Generated
        public interface Function_Function_relinquishFunction_ret {
            @Generated
            @NUInt
            long call_Function_relinquishFunction_ret(ConstVoidPtr arg0);
        }

        @Generated
        void call_relinquishFunction_ret(ConstVoidPtr arg0,
                @FunctionPtr(name = "call_Function_relinquishFunction_ret") Function_Function_relinquishFunction_ret arg1);
    }

    @Generated
    @Selector("setAcquireFunction:")
    public native void setAcquireFunction(
            @FunctionPtr(name = "call_setAcquireFunction") Function_setAcquireFunction value);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Function_setAcquireFunction {
        @Runtime(ObjCRuntime.class)
        @Generated
        public interface Function_Function_setAcquireFunction {
            @Generated
            @NUInt
            long call_Function_setAcquireFunction(ConstVoidPtr arg0);
        }

        @Generated
        VoidPtr call_setAcquireFunction(ConstVoidPtr arg0,
                @FunctionPtr(name = "call_Function_setAcquireFunction") Function_Function_setAcquireFunction arg1,
                boolean arg2);
    }

    /**
     * pointer personality functions
     */
    @Generated
    @Selector("setHashFunction:")
    public native void setHashFunction(@FunctionPtr(name = "call_setHashFunction") Function_setHashFunction value);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Function_setHashFunction {
        @Runtime(ObjCRuntime.class)
        @Generated
        public interface Function_Function_setHashFunction {
            @Generated
            @NUInt
            long call_Function_setHashFunction(ConstVoidPtr arg0);
        }

        @Generated
        @NUInt
        long call_setHashFunction(ConstVoidPtr arg0,
                @FunctionPtr(name = "call_Function_setHashFunction") Function_Function_setHashFunction arg1);
    }

    @Generated
    @Selector("setIsEqualFunction:")
    public native void setIsEqualFunction(
            @FunctionPtr(name = "call_setIsEqualFunction") Function_setIsEqualFunction value);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Function_setIsEqualFunction {
        @Runtime(ObjCRuntime.class)
        @Generated
        public interface Function_Function_setIsEqualFunction {
            @Generated
            @NUInt
            long call_Function_setIsEqualFunction(ConstVoidPtr arg0);
        }

        @Generated
        boolean call_setIsEqualFunction(ConstVoidPtr arg0, ConstVoidPtr arg1,
                @FunctionPtr(name = "call_Function_setIsEqualFunction") Function_Function_setIsEqualFunction arg2);
    }

    /**
     * custom memory configuration
     */
    @Generated
    @Selector("setRelinquishFunction:")
    public native void setRelinquishFunction(
            @FunctionPtr(name = "call_setRelinquishFunction") Function_setRelinquishFunction value);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Function_setRelinquishFunction {
        @Runtime(ObjCRuntime.class)
        @Generated
        public interface Function_Function_setRelinquishFunction {
            @Generated
            @NUInt
            long call_Function_setRelinquishFunction(ConstVoidPtr arg0);
        }

        @Generated
        void call_setRelinquishFunction(ConstVoidPtr arg0,
                @FunctionPtr(name = "call_Function_setRelinquishFunction") Function_Function_setRelinquishFunction arg1);
    }
}

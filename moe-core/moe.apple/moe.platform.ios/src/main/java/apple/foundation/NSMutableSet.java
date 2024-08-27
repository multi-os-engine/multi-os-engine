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
import org.moe.natj.general.ann.ReferenceInfo;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCObject;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Mutable Set ***************
 */
@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSMutableSet<_ObjectType> extends NSSet<_ObjectType> {
    static {
        NatJ.register();
    }

    @Generated
    protected NSMutableSet(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSMutableSet<?> alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native NSMutableSet<?> allocWithZone(VoidPtr zone);

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
    public static native NSMutableSet<?> new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("set")
    public static native <_ObjectType> NSMutableSet<?> set();

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("setWithArray:")
    public static native <_ObjectType> NSMutableSet<?> setWithArray(@NotNull NSArray<_ObjectType> array);

    @Generated
    @Selector("setWithCapacity:")
    public static native <_ObjectType> NSMutableSet<?> setWithCapacity(@NUInt long numItems);

    @Generated
    @Selector("setWithObject:")
    public static native <_ObjectType> NSMutableSet<?> setWithObject(
            @NotNull @Mapped(ObjCObjectMapper.class) _ObjectType object);

    @Generated
    @Variadic()
    @Selector("setWithObjects:")
    public static native <_ObjectType> NSMutableSet<?> setWithObjects(
            @NotNull @Mapped(ObjCObjectMapper.class) _ObjectType firstObj, Object... varargs);

    @Generated
    @Selector("setWithObjects:count:")
    public static native <_ObjectType> NSMutableSet<?> setWithObjectsCount(
            @NotNull @ReferenceInfo(type = ObjCObject.class) Ptr<_ObjectType> objects, @NUInt long cnt);

    @Generated
    @Selector("setWithSet:")
    public static native <_ObjectType> NSMutableSet<?> setWithSet(@NotNull NSSet<_ObjectType> set);

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
    @Selector("addObject:")
    public native void addObject(@NotNull @Mapped(ObjCObjectMapper.class) _ObjectType object);

    @Generated
    @Selector("addObjectsFromArray:")
    public native void addObjectsFromArray(@NotNull NSArray<_ObjectType> array);

    /**
     * evaluate a predicate against a set of objects and filter the mutable set directly
     * 
     * API-Since: 3.0
     */
    @Generated
    @Selector("filterUsingPredicate:")
    public native void filterUsingPredicate(@NotNull NSPredicate predicate);

    @Generated
    @Selector("init")
    public native NSMutableSet<?> init();

    @Generated
    @Selector("initWithArray:")
    public native NSMutableSet<?> initWithArray(@NotNull NSArray<_ObjectType> array);

    @Generated
    @Selector("initWithCapacity:")
    public native NSMutableSet<?> initWithCapacity(@NUInt long numItems);

    @Generated
    @Selector("initWithCoder:")
    public native NSMutableSet<?> initWithCoder(@NotNull NSCoder coder);

    @Generated
    @Variadic()
    @Selector("initWithObjects:")
    public native NSMutableSet<?> initWithObjects(@NotNull @Mapped(ObjCObjectMapper.class) _ObjectType firstObj,
            Object... varargs);

    @Generated
    @Selector("initWithObjects:count:")
    public native NSMutableSet<?> initWithObjectsCount(
            @Nullable @ReferenceInfo(type = ObjCObject.class) Ptr<_ObjectType> objects, @NUInt long cnt);

    @Generated
    @Selector("initWithSet:")
    public native NSMutableSet<?> initWithSet(@NotNull NSSet<_ObjectType> set);

    @Generated
    @Selector("initWithSet:copyItems:")
    public native NSMutableSet<?> initWithSetCopyItems(@NotNull NSSet<_ObjectType> set, boolean flag);

    @Generated
    @Selector("intersectSet:")
    public native void intersectSet(@NotNull NSSet<_ObjectType> otherSet);

    @Generated
    @Selector("minusSet:")
    public native void minusSet(@NotNull NSSet<_ObjectType> otherSet);

    @Generated
    @Selector("removeAllObjects")
    public native void removeAllObjects();

    @Generated
    @Selector("removeObject:")
    public native void removeObject(@NotNull @Mapped(ObjCObjectMapper.class) _ObjectType object);

    @Generated
    @Selector("setSet:")
    public native void setSet(@NotNull NSSet<_ObjectType> otherSet);

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    @Generated
    @Selector("unionSet:")
    public native void unionSet(@NotNull NSSet<_ObjectType> otherSet);

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}

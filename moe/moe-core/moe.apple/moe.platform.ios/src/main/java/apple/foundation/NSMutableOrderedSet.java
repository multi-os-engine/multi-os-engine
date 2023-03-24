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
import apple.foundation.struct.NSRange;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.c.ann.Variadic;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
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
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Mutable Ordered Set ***************
 * 
 * API-Since: 5.0
 */
@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSMutableOrderedSet<_ObjectType> extends NSOrderedSet<_ObjectType> {
    static {
        NatJ.register();
    }

    @Generated
    protected NSMutableOrderedSet(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSMutableOrderedSet<?> alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native NSMutableOrderedSet<?> allocWithZone(VoidPtr zone);

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
    public static native NSMutableOrderedSet<?> new_objc();

    @Generated
    @Selector("orderedSet")
    public static native <_ObjectType> NSMutableOrderedSet<?> orderedSet();

    @Generated
    @Selector("orderedSetWithArray:")
    public static native <_ObjectType> NSMutableOrderedSet<?> orderedSetWithArray(@NotNull NSArray<_ObjectType> array);

    @Generated
    @Selector("orderedSetWithArray:range:copyItems:")
    public static native <_ObjectType> NSMutableOrderedSet<?> orderedSetWithArrayRangeCopyItems(
            @NotNull NSArray<_ObjectType> array, @ByValue NSRange range, boolean flag);

    @Generated
    @Selector("orderedSetWithCapacity:")
    public static native <_ObjectType> NSMutableOrderedSet<?> orderedSetWithCapacity(@NUInt long numItems);

    @Generated
    @Selector("orderedSetWithObject:")
    public static native <_ObjectType> NSMutableOrderedSet<?> orderedSetWithObject(
            @NotNull @Mapped(ObjCObjectMapper.class) _ObjectType object);

    @Generated
    @Variadic()
    @Selector("orderedSetWithObjects:")
    public static native <_ObjectType> NSMutableOrderedSet<?> orderedSetWithObjects(
            @NotNull @Mapped(ObjCObjectMapper.class) _ObjectType firstObj, Object... varargs);

    @Generated
    @Selector("orderedSetWithObjects:count:")
    public static native <_ObjectType> NSMutableOrderedSet<?> orderedSetWithObjectsCount(
            @NotNull @ReferenceInfo(type = ObjCObject.class) Ptr<_ObjectType> objects, @NUInt long cnt);

    @Generated
    @Selector("orderedSetWithOrderedSet:")
    public static native <_ObjectType> NSMutableOrderedSet<?> orderedSetWithOrderedSet(
            @NotNull NSOrderedSet<_ObjectType> set);

    @Generated
    @Selector("orderedSetWithOrderedSet:range:copyItems:")
    public static native <_ObjectType> NSMutableOrderedSet<?> orderedSetWithOrderedSetRangeCopyItems(
            @NotNull NSOrderedSet<_ObjectType> set, @ByValue NSRange range, boolean flag);

    @Generated
    @Selector("orderedSetWithSet:")
    public static native <_ObjectType> NSMutableOrderedSet<?> orderedSetWithSet(@NotNull NSSet<_ObjectType> set);

    @Generated
    @Selector("orderedSetWithSet:copyItems:")
    public static native <_ObjectType> NSMutableOrderedSet<?> orderedSetWithSetCopyItems(
            @NotNull NSSet<_ObjectType> set, boolean flag);

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
    @Selector("addObject:")
    public native void addObject(@NotNull @Mapped(ObjCObjectMapper.class) _ObjectType object);

    @Generated
    @Selector("addObjects:count:")
    public native void addObjectsCount(@Nullable @ReferenceInfo(type = ObjCObject.class) Ptr<_ObjectType> objects,
            @NUInt long count);

    @Generated
    @Selector("addObjectsFromArray:")
    public native void addObjectsFromArray(@NotNull NSArray<_ObjectType> array);

    @Generated
    @Selector("exchangeObjectAtIndex:withObjectAtIndex:")
    public native void exchangeObjectAtIndexWithObjectAtIndex(@NUInt long idx1, @NUInt long idx2);

    /**
     * evaluate a predicate against an ordered set of objects and filter the mutable ordered set directly
     * 
     * API-Since: 5.0
     */
    @Generated
    @Selector("filterUsingPredicate:")
    public native void filterUsingPredicate(@NotNull NSPredicate p);

    @Generated
    @Selector("init")
    public native NSMutableOrderedSet<?> init();

    @Generated
    @Selector("initWithArray:")
    public native NSMutableOrderedSet<?> initWithArray(@NotNull NSArray<_ObjectType> array);

    @Generated
    @Selector("initWithArray:copyItems:")
    public native NSMutableOrderedSet<?> initWithArrayCopyItems(@NotNull NSArray<_ObjectType> set, boolean flag);

    @Generated
    @Selector("initWithArray:range:copyItems:")
    public native NSMutableOrderedSet<?> initWithArrayRangeCopyItems(@NotNull NSArray<_ObjectType> set,
            @ByValue NSRange range, boolean flag);

    @Generated
    @Selector("initWithCapacity:")
    public native NSMutableOrderedSet<?> initWithCapacity(@NUInt long numItems);

    @Generated
    @Selector("initWithCoder:")
    public native NSMutableOrderedSet<?> initWithCoder(@NotNull NSCoder coder);

    @Generated
    @Selector("initWithObject:")
    public native NSMutableOrderedSet<?> initWithObject(@NotNull @Mapped(ObjCObjectMapper.class) _ObjectType object);

    @Generated
    @Variadic()
    @Selector("initWithObjects:")
    public native NSMutableOrderedSet<?> initWithObjects(@NotNull @Mapped(ObjCObjectMapper.class) _ObjectType firstObj,
            Object... varargs);

    @Generated
    @Selector("initWithObjects:count:")
    public native NSMutableOrderedSet<?> initWithObjectsCount(
            @Nullable @ReferenceInfo(type = ObjCObject.class) Ptr<_ObjectType> objects, @NUInt long cnt);

    @Generated
    @Selector("initWithOrderedSet:")
    public native NSMutableOrderedSet<?> initWithOrderedSet(@NotNull NSOrderedSet<_ObjectType> set);

    @Generated
    @Selector("initWithOrderedSet:copyItems:")
    public native NSMutableOrderedSet<?> initWithOrderedSetCopyItems(@NotNull NSOrderedSet<_ObjectType> set,
            boolean flag);

    @Generated
    @Selector("initWithOrderedSet:range:copyItems:")
    public native NSMutableOrderedSet<?> initWithOrderedSetRangeCopyItems(@NotNull NSOrderedSet<_ObjectType> set,
            @ByValue NSRange range, boolean flag);

    @Generated
    @Selector("initWithSet:")
    public native NSMutableOrderedSet<?> initWithSet(@NotNull NSSet<_ObjectType> set);

    @Generated
    @Selector("initWithSet:copyItems:")
    public native NSMutableOrderedSet<?> initWithSetCopyItems(@NotNull NSSet<_ObjectType> set, boolean flag);

    @Generated
    @Selector("insertObject:atIndex:")
    public native void insertObjectAtIndex(@NotNull @Mapped(ObjCObjectMapper.class) _ObjectType object,
            @NUInt long idx);

    @Generated
    @Selector("insertObjects:atIndexes:")
    public native void insertObjectsAtIndexes(@NotNull NSArray<_ObjectType> objects, @NotNull NSIndexSet indexes);

    @Generated
    @Selector("intersectOrderedSet:")
    public native void intersectOrderedSet(@NotNull NSOrderedSet<_ObjectType> other);

    @Generated
    @Selector("intersectSet:")
    public native void intersectSet(@NotNull NSSet<_ObjectType> other);

    @Generated
    @Selector("minusOrderedSet:")
    public native void minusOrderedSet(@NotNull NSOrderedSet<_ObjectType> other);

    @Generated
    @Selector("minusSet:")
    public native void minusSet(@NotNull NSSet<_ObjectType> other);

    @Generated
    @Selector("moveObjectsAtIndexes:toIndex:")
    public native void moveObjectsAtIndexesToIndex(@NotNull NSIndexSet indexes, @NUInt long idx);

    @Generated
    @Selector("removeAllObjects")
    public native void removeAllObjects();

    @Generated
    @Selector("removeObject:")
    public native void removeObject(@NotNull @Mapped(ObjCObjectMapper.class) _ObjectType object);

    @Generated
    @Selector("removeObjectAtIndex:")
    public native void removeObjectAtIndex(@NUInt long idx);

    @Generated
    @Selector("removeObjectsAtIndexes:")
    public native void removeObjectsAtIndexes(@NotNull NSIndexSet indexes);

    @Generated
    @Selector("removeObjectsInArray:")
    public native void removeObjectsInArray(@NotNull NSArray<_ObjectType> array);

    @Generated
    @Selector("removeObjectsInRange:")
    public native void removeObjectsInRange(@ByValue NSRange range);

    @Generated
    @Selector("replaceObjectAtIndex:withObject:")
    public native void replaceObjectAtIndexWithObject(@NUInt long idx,
            @NotNull @Mapped(ObjCObjectMapper.class) _ObjectType object);

    @Generated
    @Selector("replaceObjectsAtIndexes:withObjects:")
    public native void replaceObjectsAtIndexesWithObjects(@NotNull NSIndexSet indexes,
            @NotNull NSArray<_ObjectType> objects);

    @Generated
    @Selector("replaceObjectsInRange:withObjects:count:")
    public native void replaceObjectsInRangeWithObjectsCount(@ByValue NSRange range,
            @Nullable @ReferenceInfo(type = ObjCObject.class) Ptr<_ObjectType> objects, @NUInt long count);

    @Generated
    @Selector("setObject:atIndex:")
    public native void setObjectAtIndex(@NotNull @Mapped(ObjCObjectMapper.class) _ObjectType obj, @NUInt long idx);

    /**
     * API-Since: 6.0
     */
    @Generated
    @Selector("setObject:atIndexedSubscript:")
    public native void setObjectAtIndexedSubscript(@NotNull @Mapped(ObjCObjectMapper.class) _ObjectType obj,
            @NUInt long idx);

    @Generated
    @Selector("sortRange:options:usingComparator:")
    public native void sortRangeOptionsUsingComparator(@ByValue NSRange range, @NUInt long opts,
            @NotNull @ObjCBlock(name = "call_sortRangeOptionsUsingComparator") Block_sortRangeOptionsUsingComparator cmptr);

    @Generated
    @Selector("sortUsingComparator:")
    public native void sortUsingComparator(
            @NotNull @ObjCBlock(name = "call_sortUsingComparator") Block_sortUsingComparator cmptr);

    /**
     * sorts the ordered set itself
     * 
     * API-Since: 5.0
     */
    @Generated
    @Selector("sortUsingDescriptors:")
    public native void sortUsingDescriptors(@NotNull NSArray<? extends NSSortDescriptor> sortDescriptors);

    @Generated
    @Selector("sortWithOptions:usingComparator:")
    public native void sortWithOptionsUsingComparator(@NUInt long opts,
            @NotNull @ObjCBlock(name = "call_sortWithOptionsUsingComparator") Block_sortWithOptionsUsingComparator cmptr);

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    @Generated
    @Selector("unionOrderedSet:")
    public native void unionOrderedSet(@NotNull NSOrderedSet<_ObjectType> other);

    @Generated
    @Selector("unionSet:")
    public native void unionSet(@NotNull NSSet<_ObjectType> other);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_sortRangeOptionsUsingComparator {
        @Generated
        @NInt
        long call_sortRangeOptionsUsingComparator(@NotNull @Mapped(ObjCObjectMapper.class) Object obj1,
                @NotNull @Mapped(ObjCObjectMapper.class) Object obj2);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_sortUsingComparator {
        @Generated
        @NInt
        long call_sortUsingComparator(@NotNull @Mapped(ObjCObjectMapper.class) Object obj1,
                @NotNull @Mapped(ObjCObjectMapper.class) Object obj2);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_sortWithOptionsUsingComparator {
        @Generated
        @NInt
        long call_sortWithOptionsUsingComparator(@NotNull @Mapped(ObjCObjectMapper.class) Object obj1,
                @NotNull @Mapped(ObjCObjectMapper.class) Object obj2);
    }

    @Generated
    @Selector("applyDifference:")
    public native void applyDifference(@NotNull NSOrderedCollectionDifference<_ObjectType> difference);
}

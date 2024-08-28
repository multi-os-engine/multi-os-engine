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
import apple.foundation.protocol.NSFastEnumeration;
import apple.foundation.protocol.NSMutableCopying;
import apple.foundation.protocol.NSSecureCoding;
import apple.foundation.struct.NSRange;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.c.ann.Variadic;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.ReferenceInfo;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.BoolPtr;
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
 * Immutable Ordered Set ***************
 * 
 * API-Since: 5.0
 */
@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSOrderedSet<_ObjectType> extends NSObject implements NSCopying, NSMutableCopying, NSSecureCoding,
        NSFastEnumeration {
    static {
        NatJ.register();
    }

    @Generated
    protected NSOrderedSet(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSOrderedSet<?> alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native NSOrderedSet<?> allocWithZone(VoidPtr zone);

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
    public static native NSOrderedSet<?> new_objc();

    @Generated
    @Selector("orderedSet")
    public static native <_ObjectType> NSOrderedSet<?> orderedSet();

    @Generated
    @Selector("orderedSetWithArray:")
    public static native <_ObjectType> NSOrderedSet<?> orderedSetWithArray(@NotNull NSArray<_ObjectType> array);

    @Generated
    @Selector("orderedSetWithArray:range:copyItems:")
    public static native <_ObjectType> NSOrderedSet<?> orderedSetWithArrayRangeCopyItems(
            @NotNull NSArray<_ObjectType> array, @ByValue NSRange range, boolean flag);

    @Generated
    @Selector("orderedSetWithObject:")
    public static native <_ObjectType> NSOrderedSet<?> orderedSetWithObject(
            @NotNull @Mapped(ObjCObjectMapper.class) _ObjectType object);

    @Generated
    @Variadic()
    @Selector("orderedSetWithObjects:")
    public static native <_ObjectType> NSOrderedSet<?> orderedSetWithObjects(
            @NotNull @Mapped(ObjCObjectMapper.class) _ObjectType firstObj, Object... varargs);

    @Generated
    @Selector("orderedSetWithObjects:count:")
    public static native <_ObjectType> NSOrderedSet<?> orderedSetWithObjectsCount(
            @NotNull @ReferenceInfo(type = ObjCObject.class) Ptr<_ObjectType> objects, @NUInt long cnt);

    @Generated
    @Selector("orderedSetWithOrderedSet:")
    public static native <_ObjectType> NSOrderedSet<?> orderedSetWithOrderedSet(@NotNull NSOrderedSet<_ObjectType> set);

    @Generated
    @Selector("orderedSetWithOrderedSet:range:copyItems:")
    public static native <_ObjectType> NSOrderedSet<?> orderedSetWithOrderedSetRangeCopyItems(
            @NotNull NSOrderedSet<_ObjectType> set, @ByValue NSRange range, boolean flag);

    @Generated
    @Selector("orderedSetWithSet:")
    public static native <_ObjectType> NSOrderedSet<?> orderedSetWithSet(@NotNull NSSet<_ObjectType> set);

    @Generated
    @Selector("orderedSetWithSet:copyItems:")
    public static native <_ObjectType> NSOrderedSet<?> orderedSetWithSetCopyItems(@NotNull NSSet<_ObjectType> set,
            boolean flag);

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
    public static native <_ObjectType> boolean supportsSecureCoding();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * NSOrderedSets are not observable, so these methods raise exceptions when invoked on NSOrderedSets. Instead of
     * observing an ordered set, observe the ordered to-many relationship for which the ordered set is the collection of
     * related objects.
     */
    @Generated
    @Selector("addObserver:forKeyPath:options:context:")
    public native void addObserverForKeyPathOptionsContext(@NotNull NSObject observer, @NotNull String keyPath,
            @NUInt long options, @Nullable VoidPtr context);

    /**
     * These two methods return a facade object for the receiving ordered set,
     * which acts like an immutable array or set (respectively). Note that
     * while you cannot mutate the ordered set through these facades, mutations
     * to the original ordered set will "show through" the facade and it will
     * appear to change spontaneously, since a copy of the ordered set is not
     * being made.
     */
    @NotNull
    @Generated
    @Selector("array")
    public native NSArray<_ObjectType> array();

    @Generated
    @Selector("containsObject:")
    public native boolean containsObject(@NotNull @Mapped(ObjCObjectMapper.class) _ObjectType object);

    @NotNull
    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(@Nullable VoidPtr zone);

    @Generated
    @Selector("count")
    @NUInt
    public native long count();

    @Generated
    @Selector("countByEnumeratingWithState:objects:count:")
    @NUInt
    public native long countByEnumeratingWithStateObjectsCount(@NotNull VoidPtr state,
            @NotNull @ReferenceInfo(type = ObjCObject.class) Ptr<ObjCObject> buffer, @NUInt long len);

    @NotNull
    @Generated
    @Selector("description")
    public native String description();

    @NotNull
    @Generated
    @Selector("descriptionWithLocale:")
    public native String descriptionWithLocale(@Nullable @Mapped(ObjCObjectMapper.class) Object locale);

    @NotNull
    @Generated
    @Selector("descriptionWithLocale:indent:")
    public native String descriptionWithLocaleIndent(@Nullable @Mapped(ObjCObjectMapper.class) Object locale,
            @NUInt long level);

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(@NotNull NSCoder coder);

    @Generated
    @Selector("enumerateObjectsAtIndexes:options:usingBlock:")
    public native void enumerateObjectsAtIndexesOptionsUsingBlock(@NotNull NSIndexSet s, @NUInt long opts,
            @NotNull @ObjCBlock(name = "call_enumerateObjectsAtIndexesOptionsUsingBlock") Block_enumerateObjectsAtIndexesOptionsUsingBlock block);

    @Generated
    @Selector("enumerateObjectsUsingBlock:")
    public native void enumerateObjectsUsingBlock(
            @NotNull @ObjCBlock(name = "call_enumerateObjectsUsingBlock") Block_enumerateObjectsUsingBlock block);

    @Generated
    @Selector("enumerateObjectsWithOptions:usingBlock:")
    public native void enumerateObjectsWithOptionsUsingBlock(@NUInt long opts,
            @NotNull @ObjCBlock(name = "call_enumerateObjectsWithOptionsUsingBlock") Block_enumerateObjectsWithOptionsUsingBlock block);

    /**
     * evaluate a predicate against an ordered set of objects and return a filtered ordered set
     * 
     * API-Since: 5.0
     */
    @NotNull
    @Generated
    @Selector("filteredOrderedSetUsingPredicate:")
    public native NSOrderedSet<_ObjectType> filteredOrderedSetUsingPredicate(@NotNull NSPredicate p);

    @Nullable
    @Generated
    @Selector("firstObject")
    @MappedReturn(ObjCObjectMapper.class)
    public native _ObjectType firstObject();

    @Generated
    @Selector("getObjects:range:")
    public native void getObjectsRange(@Nullable @ReferenceInfo(type = ObjCObject.class) Ptr<_ObjectType> objects,
            @ByValue NSRange range);

    @Generated
    @Selector("indexOfObject:")
    @NUInt
    public native long indexOfObject(@NotNull @Mapped(ObjCObjectMapper.class) _ObjectType object);

    /**
     * binary search
     */
    @Generated
    @Selector("indexOfObject:inSortedRange:options:usingComparator:")
    @NUInt
    public native long indexOfObjectInSortedRangeOptionsUsingComparator(
            @NotNull @Mapped(ObjCObjectMapper.class) _ObjectType object, @ByValue NSRange range, @NUInt long opts,
            @NotNull @ObjCBlock(name = "call_indexOfObjectInSortedRangeOptionsUsingComparator") Block_indexOfObjectInSortedRangeOptionsUsingComparator cmp);

    @Generated
    @Selector("indexOfObjectAtIndexes:options:passingTest:")
    @NUInt
    public native long indexOfObjectAtIndexesOptionsPassingTest(@NotNull NSIndexSet s, @NUInt long opts,
            @NotNull @ObjCBlock(name = "call_indexOfObjectAtIndexesOptionsPassingTest") Block_indexOfObjectAtIndexesOptionsPassingTest predicate);

    @Generated
    @Selector("indexOfObjectPassingTest:")
    @NUInt
    public native long indexOfObjectPassingTest(
            @NotNull @ObjCBlock(name = "call_indexOfObjectPassingTest") Block_indexOfObjectPassingTest predicate);

    @Generated
    @Selector("indexOfObjectWithOptions:passingTest:")
    @NUInt
    public native long indexOfObjectWithOptionsPassingTest(@NUInt long opts,
            @NotNull @ObjCBlock(name = "call_indexOfObjectWithOptionsPassingTest") Block_indexOfObjectWithOptionsPassingTest predicate);

    @NotNull
    @Generated
    @Selector("indexesOfObjectsAtIndexes:options:passingTest:")
    public native NSIndexSet indexesOfObjectsAtIndexesOptionsPassingTest(@NotNull NSIndexSet s, @NUInt long opts,
            @NotNull @ObjCBlock(name = "call_indexesOfObjectsAtIndexesOptionsPassingTest") Block_indexesOfObjectsAtIndexesOptionsPassingTest predicate);

    @NotNull
    @Generated
    @Selector("indexesOfObjectsPassingTest:")
    public native NSIndexSet indexesOfObjectsPassingTest(
            @NotNull @ObjCBlock(name = "call_indexesOfObjectsPassingTest") Block_indexesOfObjectsPassingTest predicate);

    @NotNull
    @Generated
    @Selector("indexesOfObjectsWithOptions:passingTest:")
    public native NSIndexSet indexesOfObjectsWithOptionsPassingTest(@NUInt long opts,
            @NotNull @ObjCBlock(name = "call_indexesOfObjectsWithOptionsPassingTest") Block_indexesOfObjectsWithOptionsPassingTest predicate);

    @Generated
    @Selector("init")
    public native NSOrderedSet<?> init();

    @Generated
    @Selector("initWithArray:")
    public native NSOrderedSet<?> initWithArray(@NotNull NSArray<_ObjectType> array);

    @Generated
    @Selector("initWithArray:copyItems:")
    public native NSOrderedSet<?> initWithArrayCopyItems(@NotNull NSArray<_ObjectType> set, boolean flag);

    @Generated
    @Selector("initWithArray:range:copyItems:")
    public native NSOrderedSet<?> initWithArrayRangeCopyItems(@NotNull NSArray<_ObjectType> set, @ByValue NSRange range,
            boolean flag);

    @Generated
    @Selector("initWithCoder:")
    public native NSOrderedSet<?> initWithCoder(@NotNull NSCoder coder);

    @Generated
    @Selector("initWithObject:")
    public native NSOrderedSet<?> initWithObject(@NotNull @Mapped(ObjCObjectMapper.class) _ObjectType object);

    @Generated
    @Variadic()
    @Selector("initWithObjects:")
    public native NSOrderedSet<?> initWithObjects(@NotNull @Mapped(ObjCObjectMapper.class) _ObjectType firstObj,
            Object... varargs);

    @Generated
    @Selector("initWithObjects:count:")
    public native NSOrderedSet<?> initWithObjectsCount(
            @Nullable @ReferenceInfo(type = ObjCObject.class) Ptr<_ObjectType> objects, @NUInt long cnt);

    @Generated
    @Selector("initWithOrderedSet:")
    public native NSOrderedSet<?> initWithOrderedSet(@NotNull NSOrderedSet<_ObjectType> set);

    @Generated
    @Selector("initWithOrderedSet:copyItems:")
    public native NSOrderedSet<?> initWithOrderedSetCopyItems(@NotNull NSOrderedSet<_ObjectType> set, boolean flag);

    @Generated
    @Selector("initWithOrderedSet:range:copyItems:")
    public native NSOrderedSet<?> initWithOrderedSetRangeCopyItems(@NotNull NSOrderedSet<_ObjectType> set,
            @ByValue NSRange range, boolean flag);

    @Generated
    @Selector("initWithSet:")
    public native NSOrderedSet<?> initWithSet(@NotNull NSSet<_ObjectType> set);

    @Generated
    @Selector("initWithSet:copyItems:")
    public native NSOrderedSet<?> initWithSetCopyItems(@NotNull NSSet<_ObjectType> set, boolean flag);

    @Generated
    @Selector("intersectsOrderedSet:")
    public native boolean intersectsOrderedSet(@NotNull NSOrderedSet<_ObjectType> other);

    @Generated
    @Selector("intersectsSet:")
    public native boolean intersectsSet(@NotNull NSSet<_ObjectType> set);

    @Generated
    @Selector("isEqualToOrderedSet:")
    public native boolean isEqualToOrderedSet(@NotNull NSOrderedSet<_ObjectType> other);

    @Generated
    @Selector("isSubsetOfOrderedSet:")
    public native boolean isSubsetOfOrderedSet(@NotNull NSOrderedSet<_ObjectType> other);

    @Generated
    @Selector("isSubsetOfSet:")
    public native boolean isSubsetOfSet(@NotNull NSSet<_ObjectType> set);

    @Nullable
    @Generated
    @Selector("lastObject")
    @MappedReturn(ObjCObjectMapper.class)
    public native _ObjectType lastObject();

    @NotNull
    @Owned
    @Generated
    @Selector("mutableCopyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object mutableCopyWithZone(@Nullable VoidPtr zone);

    @NotNull
    @Generated
    @Selector("objectAtIndex:")
    @MappedReturn(ObjCObjectMapper.class)
    public native _ObjectType objectAtIndex(@NUInt long idx);

    /**
     * API-Since: 6.0
     */
    @NotNull
    @Generated
    @Selector("objectAtIndexedSubscript:")
    @MappedReturn(ObjCObjectMapper.class)
    public native _ObjectType objectAtIndexedSubscript(@NUInt long idx);

    @NotNull
    @Generated
    @Selector("objectEnumerator")
    public native NSEnumerator<_ObjectType> objectEnumerator();

    @NotNull
    @Generated
    @Selector("objectsAtIndexes:")
    public native NSArray<_ObjectType> objectsAtIndexes(@NotNull NSIndexSet indexes);

    @Generated
    @Selector("removeObserver:forKeyPath:")
    public native void removeObserverForKeyPath(@NotNull NSObject observer, @NotNull String keyPath);

    /**
     * API-Since: 5.0
     */
    @Generated
    @Selector("removeObserver:forKeyPath:context:")
    public native void removeObserverForKeyPathContext(@NotNull NSObject observer, @NotNull String keyPath,
            @Nullable VoidPtr context);

    @NotNull
    @Generated
    @Selector("reverseObjectEnumerator")
    public native NSEnumerator<_ObjectType> reverseObjectEnumerator();

    @NotNull
    @Generated
    @Selector("reversedOrderedSet")
    public native NSOrderedSet<_ObjectType> reversedOrderedSet();

    @NotNull
    @Generated
    @Selector("set")
    public native NSSet<_ObjectType> set();

    /**
     * Invoke -setValue:forKey: on each of the receiver's members.
     * 
     * API-Since: 5.0
     */
    @Generated
    @Selector("setValue:forKey:")
    public native void setValueForKey(@Nullable @Mapped(ObjCObjectMapper.class) Object value, @NotNull String key);

    @NotNull
    @Generated
    @Selector("sortedArrayUsingComparator:")
    public native NSArray<_ObjectType> sortedArrayUsingComparator(
            @NotNull @ObjCBlock(name = "call_sortedArrayUsingComparator") Block_sortedArrayUsingComparator cmptr);

    /**
     * returns a new array by sorting the objects of the receiver
     * 
     * API-Since: 5.0
     */
    @NotNull
    @Generated
    @Selector("sortedArrayUsingDescriptors:")
    public native NSArray<_ObjectType> sortedArrayUsingDescriptors(
            @NotNull NSArray<? extends NSSortDescriptor> sortDescriptors);

    @NotNull
    @Generated
    @Selector("sortedArrayWithOptions:usingComparator:")
    public native NSArray<_ObjectType> sortedArrayWithOptionsUsingComparator(@NUInt long opts,
            @NotNull @ObjCBlock(name = "call_sortedArrayWithOptionsUsingComparator") Block_sortedArrayWithOptionsUsingComparator cmptr);

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    /**
     * Return an ordered set containing the results of invoking -valueForKey: on each of the receiver's members. The
     * returned ordered set might not have the same number of members as the receiver. The returned ordered set will not
     * contain any elements corresponding to instances of -valueForKey: returning nil, nor will it contain duplicates.
     * 
     * API-Since: 5.0
     */
    @NotNull
    @Generated
    @Selector("valueForKey:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object valueForKey(@NotNull String key);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_enumerateObjectsAtIndexesOptionsUsingBlock {
        @Generated
        void call_enumerateObjectsAtIndexesOptionsUsingBlock(@NotNull @Mapped(ObjCObjectMapper.class) Object obj,
                @NUInt long idx, @NotNull BoolPtr stop);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_enumerateObjectsUsingBlock {
        @Generated
        void call_enumerateObjectsUsingBlock(@NotNull @Mapped(ObjCObjectMapper.class) Object obj, @NUInt long idx,
                @NotNull BoolPtr stop);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_enumerateObjectsWithOptionsUsingBlock {
        @Generated
        void call_enumerateObjectsWithOptionsUsingBlock(@NotNull @Mapped(ObjCObjectMapper.class) Object obj,
                @NUInt long idx, @NotNull BoolPtr stop);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_indexOfObjectInSortedRangeOptionsUsingComparator {
        @Generated
        @NInt
        long call_indexOfObjectInSortedRangeOptionsUsingComparator(@NotNull @Mapped(ObjCObjectMapper.class) Object obj1,
                @NotNull @Mapped(ObjCObjectMapper.class) Object obj2);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_indexOfObjectAtIndexesOptionsPassingTest {
        @Generated
        boolean call_indexOfObjectAtIndexesOptionsPassingTest(@NotNull @Mapped(ObjCObjectMapper.class) Object obj,
                @NUInt long idx, @NotNull BoolPtr stop);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_indexOfObjectPassingTest {
        @Generated
        boolean call_indexOfObjectPassingTest(@NotNull @Mapped(ObjCObjectMapper.class) Object obj, @NUInt long idx,
                @NotNull BoolPtr stop);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_indexOfObjectWithOptionsPassingTest {
        @Generated
        boolean call_indexOfObjectWithOptionsPassingTest(@NotNull @Mapped(ObjCObjectMapper.class) Object obj,
                @NUInt long idx, @NotNull BoolPtr stop);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_indexesOfObjectsAtIndexesOptionsPassingTest {
        @Generated
        boolean call_indexesOfObjectsAtIndexesOptionsPassingTest(@NotNull @Mapped(ObjCObjectMapper.class) Object obj,
                @NUInt long idx, @NotNull BoolPtr stop);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_indexesOfObjectsPassingTest {
        @Generated
        boolean call_indexesOfObjectsPassingTest(@NotNull @Mapped(ObjCObjectMapper.class) Object obj, @NUInt long idx,
                @NotNull BoolPtr stop);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_indexesOfObjectsWithOptionsPassingTest {
        @Generated
        boolean call_indexesOfObjectsWithOptionsPassingTest(@NotNull @Mapped(ObjCObjectMapper.class) Object obj,
                @NUInt long idx, @NotNull BoolPtr stop);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_sortedArrayUsingComparator {
        @Generated
        @NInt
        long call_sortedArrayUsingComparator(@NotNull @Mapped(ObjCObjectMapper.class) Object obj1,
                @NotNull @Mapped(ObjCObjectMapper.class) Object obj2);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_sortedArrayWithOptionsUsingComparator {
        @Generated
        @NInt
        long call_sortedArrayWithOptionsUsingComparator(@NotNull @Mapped(ObjCObjectMapper.class) Object obj1,
                @NotNull @Mapped(ObjCObjectMapper.class) Object obj2);
    }

    /**
     * Uses isEqual: to determine the difference between the parameter and the receiver
     */
    @NotNull
    @Generated
    @Selector("differenceFromOrderedSet:")
    public native NSOrderedCollectionDifference<_ObjectType> differenceFromOrderedSet(
            @NotNull NSOrderedSet<_ObjectType> other);

    @NotNull
    @Generated
    @Selector("differenceFromOrderedSet:withOptions:")
    public native NSOrderedCollectionDifference<_ObjectType> differenceFromOrderedSetWithOptions(
            @NotNull NSOrderedSet<_ObjectType> other, @NUInt long options);

    @NotNull
    @Generated
    @Selector("differenceFromOrderedSet:withOptions:usingEquivalenceTest:")
    public native NSOrderedCollectionDifference<_ObjectType> differenceFromOrderedSetWithOptionsUsingEquivalenceTest(
            @NotNull NSOrderedSet<_ObjectType> other, @NUInt long options,
            @NotNull @ObjCBlock(name = "call_differenceFromOrderedSetWithOptionsUsingEquivalenceTest") Block_differenceFromOrderedSetWithOptionsUsingEquivalenceTest block);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_differenceFromOrderedSetWithOptionsUsingEquivalenceTest {
        @Generated
        boolean call_differenceFromOrderedSetWithOptionsUsingEquivalenceTest(
                @NotNull @Mapped(ObjCObjectMapper.class) Object obj1,
                @NotNull @Mapped(ObjCObjectMapper.class) Object obj2);
    }

    @Nullable
    @Generated
    @Selector("orderedSetByApplyingDifference:")
    public native NSOrderedSet<_ObjectType> orderedSetByApplyingDifference(
            @NotNull NSOrderedCollectionDifference<_ObjectType> difference);

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}

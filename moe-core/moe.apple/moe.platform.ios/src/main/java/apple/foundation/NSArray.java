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
import apple.cloudkit.protocol.CKRecordValue;
import apple.foundation.c.Foundation;
import apple.foundation.protocol.NSCopying;
import apple.foundation.protocol.NSFastEnumeration;
import apple.foundation.protocol.NSMutableCopying;
import apple.foundation.protocol.NSSecureCoding;
import apple.foundation.struct.NSRange;
import apple.gameplaykit.GKRandomSource;
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

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSArray<_ObjectType> extends NSObject implements NSCopying, NSMutableCopying, NSSecureCoding,
        NSFastEnumeration, CKRecordValue, List<_ObjectType> {
    static {
        NatJ.register();
    }

    @Generated
    protected NSArray(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSArray<?> alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native NSArray<?> allocWithZone(VoidPtr zone);

    @Generated
    @Selector("array")
    public static native <_ObjectType> NSArray<?> array();

    @Generated
    @Selector("arrayWithArray:")
    public static native <_ObjectType> NSArray<?> arrayWithArray(@NotNull NSArray<_ObjectType> array);

    /**
     * These methods are deprecated, and will be marked with API_DEPRECATED in a subsequent release. Use the variants
     * that use errors instead.
     * 
     * API-Since: 2.0
     * Deprecated-Since: 100000.0
     */
    @Nullable
    @Deprecated
    @Generated
    @Selector("arrayWithContentsOfFile:")
    public static native <_ObjectType> NSArray<_ObjectType> arrayWithContentsOfFile(@NotNull String path);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 100000.0
     */
    @Nullable
    @Deprecated
    @Generated
    @Selector("arrayWithContentsOfURL:")
    public static native <_ObjectType> NSArray<_ObjectType> arrayWithContentsOfURL(@NotNull NSURL url);

    @Generated
    @Selector("arrayWithObject:")
    public static native <_ObjectType> NSArray<?> arrayWithObject(
            @NotNull @Mapped(ObjCObjectMapper.class) _ObjectType anObject);

    @Generated
    @Variadic()
    @Selector("arrayWithObjects:")
    public static native <_ObjectType> NSArray<?> arrayWithObjects(
            @NotNull @Mapped(ObjCObjectMapper.class) _ObjectType firstObj, Object... varargs);

    @Generated
    @Selector("arrayWithObjects:count:")
    public static native <_ObjectType> NSArray<?> arrayWithObjectsCount(
            @NotNull @ReferenceInfo(type = ObjCObject.class) Ptr<_ObjectType> objects, @NUInt long cnt);

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
    public static native NSArray<?> new_objc();

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
     * NSArrays are not observable, so these methods raise exceptions when invoked on NSArrays. Instead of observing an
     * array, observe the ordered to-many relationship for which the array is the collection of related objects.
     */
    @Generated
    @Selector("addObserver:forKeyPath:options:context:")
    public native void addObserverForKeyPathOptionsContext(@NotNull NSObject observer, @NotNull String keyPath,
            @NUInt long options, @Nullable VoidPtr context);

    /**
     * Register or deregister as an observer of the values at a key path relative to each indexed element of the array.
     * The options determine what is included in observer notifications and when they're sent, as described above, and
     * the context is passed in observer notifications as described above. These are not merely convenience methods;
     * invoking them is potentially much faster than repeatedly invoking NSObject(NSKeyValueObserverRegistration)
     * methods. You should use -removeObserver:fromObjectsAtIndexes:forKeyPath:context: instead of
     * -removeObserver:fromObjectsAtIndexes:forKeyPath: whenever possible for the same reason described in the
     * NSObject(NSKeyValueObserverRegistration) comment.
     */
    @Generated
    @Selector("addObserver:toObjectsAtIndexes:forKeyPath:options:context:")
    public native void addObserverToObjectsAtIndexesForKeyPathOptionsContext(@NotNull NSObject observer,
            @NotNull NSIndexSet indexes, @NotNull String keyPath, @NUInt long options, @Nullable VoidPtr context);

    @NotNull
    @Generated
    @Selector("arrayByAddingObject:")
    public native NSArray<_ObjectType> arrayByAddingObject(
            @NotNull @Mapped(ObjCObjectMapper.class) _ObjectType anObject);

    @NotNull
    @Generated
    @Selector("arrayByAddingObjectsFromArray:")
    public native NSArray<_ObjectType> arrayByAddingObjectsFromArray(@NotNull NSArray<_ObjectType> otherArray);

    @NotNull
    @Generated
    @Selector("componentsJoinedByString:")
    public native String componentsJoinedByString(@NotNull String separator);

    @Generated
    @Selector("containsObject:")
    public native boolean containsObject(@NotNull @Mapped(ObjCObjectMapper.class) _ObjectType anObject);

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

    /**
     * API-Since: 4.0
     */
    @Generated
    @Selector("enumerateObjectsAtIndexes:options:usingBlock:")
    public native void enumerateObjectsAtIndexesOptionsUsingBlock(@NotNull NSIndexSet s, @NUInt long opts,
            @NotNull @ObjCBlock(name = "call_enumerateObjectsAtIndexesOptionsUsingBlock") Block_enumerateObjectsAtIndexesOptionsUsingBlock block);

    /**
     * API-Since: 4.0
     */
    @Generated
    @Selector("enumerateObjectsUsingBlock:")
    public native void enumerateObjectsUsingBlock(
            @NotNull @ObjCBlock(name = "call_enumerateObjectsUsingBlock") Block_enumerateObjectsUsingBlock block);

    /**
     * API-Since: 4.0
     */
    @Generated
    @Selector("enumerateObjectsWithOptions:usingBlock:")
    public native void enumerateObjectsWithOptionsUsingBlock(@NUInt long opts,
            @NotNull @ObjCBlock(name = "call_enumerateObjectsWithOptionsUsingBlock") Block_enumerateObjectsWithOptionsUsingBlock block);

    /**
     * evaluate a predicate against an array of objects and return a filtered array
     */
    @NotNull
    @Generated
    @Selector("filteredArrayUsingPredicate:")
    public native NSArray<_ObjectType> filteredArrayUsingPredicate(@NotNull NSPredicate predicate);

    /**
     * API-Since: 4.0
     */
    @Nullable
    @Generated
    @Selector("firstObject")
    @MappedReturn(ObjCObjectMapper.class)
    public native _ObjectType firstObject();

    @Nullable
    @Generated
    @Selector("firstObjectCommonWithArray:")
    @MappedReturn(ObjCObjectMapper.class)
    public native _ObjectType firstObjectCommonWithArray(@NotNull NSArray<_ObjectType> otherArray);

    /**
     * This method is unsafe because it could potentially cause buffer overruns. You should use -getObjects:range:
     * instead.
     * 
     * API-Since: 2.0
     * Deprecated-Since: 11.0
     * Deprecated-Message: Use -getObjects:range: instead
     */
    @Deprecated
    @Generated
    @Selector("getObjects:")
    public native void getObjects(@NotNull @ReferenceInfo(type = ObjCObject.class) Ptr<_ObjectType> objects);

    @Generated
    @Selector("getObjects:range:")
    public native void getObjectsRange(@NotNull @ReferenceInfo(type = ObjCObject.class) Ptr<_ObjectType> objects,
            @ByValue NSRange range);

    @Generated
    @Selector("indexOfObject:")
    @NUInt
    public native long indexOfObject(@NotNull @Mapped(ObjCObjectMapper.class) _ObjectType anObject);

    @Generated
    @Selector("indexOfObject:inRange:")
    @NUInt
    public native long indexOfObjectInRange(@NotNull @Mapped(ObjCObjectMapper.class) _ObjectType anObject,
            @ByValue NSRange range);

    /**
     * binary search
     * 
     * API-Since: 4.0
     */
    @Generated
    @Selector("indexOfObject:inSortedRange:options:usingComparator:")
    @NUInt
    public native long indexOfObjectInSortedRangeOptionsUsingComparator(
            @NotNull @Mapped(ObjCObjectMapper.class) _ObjectType obj, @ByValue NSRange r, @NUInt long opts,
            @NotNull @ObjCBlock(name = "call_indexOfObjectInSortedRangeOptionsUsingComparator") Block_indexOfObjectInSortedRangeOptionsUsingComparator cmp);

    /**
     * API-Since: 4.0
     */
    @Generated
    @Selector("indexOfObjectAtIndexes:options:passingTest:")
    @NUInt
    public native long indexOfObjectAtIndexesOptionsPassingTest(@NotNull NSIndexSet s, @NUInt long opts,
            @NotNull @ObjCBlock(name = "call_indexOfObjectAtIndexesOptionsPassingTest") Block_indexOfObjectAtIndexesOptionsPassingTest predicate);

    @Generated
    @Selector("indexOfObjectIdenticalTo:")
    @NUInt
    public native long indexOfObjectIdenticalTo(@NotNull @Mapped(ObjCObjectMapper.class) _ObjectType anObject);

    @Generated
    @Selector("indexOfObjectIdenticalTo:inRange:")
    @NUInt
    public native long indexOfObjectIdenticalToInRange(@NotNull @Mapped(ObjCObjectMapper.class) _ObjectType anObject,
            @ByValue NSRange range);

    /**
     * API-Since: 4.0
     */
    @Generated
    @Selector("indexOfObjectPassingTest:")
    @NUInt
    public native long indexOfObjectPassingTest(
            @NotNull @ObjCBlock(name = "call_indexOfObjectPassingTest") Block_indexOfObjectPassingTest predicate);

    /**
     * API-Since: 4.0
     */
    @Generated
    @Selector("indexOfObjectWithOptions:passingTest:")
    @NUInt
    public native long indexOfObjectWithOptionsPassingTest(@NUInt long opts,
            @NotNull @ObjCBlock(name = "call_indexOfObjectWithOptionsPassingTest") Block_indexOfObjectWithOptionsPassingTest predicate);

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @Selector("indexesOfObjectsAtIndexes:options:passingTest:")
    public native NSIndexSet indexesOfObjectsAtIndexesOptionsPassingTest(@NotNull NSIndexSet s, @NUInt long opts,
            @NotNull @ObjCBlock(name = "call_indexesOfObjectsAtIndexesOptionsPassingTest") Block_indexesOfObjectsAtIndexesOptionsPassingTest predicate);

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @Selector("indexesOfObjectsPassingTest:")
    public native NSIndexSet indexesOfObjectsPassingTest(
            @NotNull @ObjCBlock(name = "call_indexesOfObjectsPassingTest") Block_indexesOfObjectsPassingTest predicate);

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @Selector("indexesOfObjectsWithOptions:passingTest:")
    public native NSIndexSet indexesOfObjectsWithOptionsPassingTest(@NUInt long opts,
            @NotNull @ObjCBlock(name = "call_indexesOfObjectsWithOptionsPassingTest") Block_indexesOfObjectsWithOptionsPassingTest predicate);

    @Generated
    @Selector("init")
    public native NSArray<?> init();

    @Generated
    @Selector("initWithArray:")
    public native NSArray<?> initWithArray(@NotNull NSArray<_ObjectType> array);

    @Generated
    @Selector("initWithArray:copyItems:")
    public native NSArray<?> initWithArrayCopyItems(@NotNull NSArray<_ObjectType> array, boolean flag);

    @Generated
    @Selector("initWithCoder:")
    public native NSArray<?> initWithCoder(@NotNull NSCoder coder);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 100000.0
     */
    @Nullable
    @Deprecated
    @Generated
    @Selector("initWithContentsOfFile:")
    public native NSArray<_ObjectType> initWithContentsOfFile(@NotNull String path);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 100000.0
     */
    @Nullable
    @Deprecated
    @Generated
    @Selector("initWithContentsOfURL:")
    public native NSArray<_ObjectType> initWithContentsOfURL(@NotNull NSURL url);

    @Generated
    @Variadic()
    @Selector("initWithObjects:")
    public native NSArray<?> initWithObjects(@NotNull @Mapped(ObjCObjectMapper.class) _ObjectType firstObj,
            Object... varargs);

    @Generated
    @Selector("initWithObjects:count:")
    public native NSArray<?> initWithObjectsCount(
            @Nullable @ReferenceInfo(type = ObjCObject.class) Ptr<_ObjectType> objects, @NUInt long cnt);

    @Generated
    @Selector("isEqualToArray:")
    public native boolean isEqualToArray(@NotNull NSArray<_ObjectType> otherArray);

    @Nullable
    @Generated
    @Selector("lastObject")
    @MappedReturn(ObjCObjectMapper.class)
    public native _ObjectType lastObject();

    @Generated
    @Selector("makeObjectsPerformSelector:")
    public native void makeObjectsPerformSelector(@NotNull SEL aSelector);

    @Generated
    @Selector("makeObjectsPerformSelector:withObject:")
    public native void makeObjectsPerformSelectorWithObject(@NotNull SEL aSelector,
            @Nullable @Mapped(ObjCObjectMapper.class) Object argument);

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
    public native _ObjectType objectAtIndex(@NUInt long index);

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

    @NotNull
    @Generated
    @Selector("pathsMatchingExtensions:")
    public native NSArray<String> pathsMatchingExtensions(@NotNull NSArray<String> filterTypes);

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

    @Generated
    @Selector("removeObserver:fromObjectsAtIndexes:forKeyPath:")
    public native void removeObserverFromObjectsAtIndexesForKeyPath(@NotNull NSObject observer,
            @NotNull NSIndexSet indexes, @NotNull String keyPath);

    /**
     * API-Since: 5.0
     */
    @Generated
    @Selector("removeObserver:fromObjectsAtIndexes:forKeyPath:context:")
    public native void removeObserverFromObjectsAtIndexesForKeyPathContext(@NotNull NSObject observer,
            @NotNull NSIndexSet indexes, @NotNull String keyPath, @Nullable VoidPtr context);

    @NotNull
    @Generated
    @Selector("reverseObjectEnumerator")
    public native NSEnumerator<_ObjectType> reverseObjectEnumerator();

    /**
     * Invoke -setValue:forKey: on each of the receiver's elements.
     */
    @Generated
    @Selector("setValue:forKey:")
    public native void setValueForKey(@Nullable @Mapped(ObjCObjectMapper.class) Object value, @NotNull String key);

    /**
     * Returns a shuffled instance of this array using the systems underlying random source, as with [GKRandomSource
     * sharedRandom]
     */
    @NotNull
    @Generated
    @Selector("shuffledArray")
    public native NSArray<_ObjectType> shuffledArray();

    /**
     * Returns a shuffled instance of this array using the given random source.
     */
    @NotNull
    @Generated
    @Selector("shuffledArrayWithRandomSource:")
    public native NSArray<_ObjectType> shuffledArrayWithRandomSource(@NotNull GKRandomSource randomSource);

    @NotNull
    @Generated
    @Selector("sortedArrayHint")
    public native NSData sortedArrayHint();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @Selector("sortedArrayUsingComparator:")
    public native NSArray<_ObjectType> sortedArrayUsingComparator(
            @NotNull @ObjCBlock(name = "call_sortedArrayUsingComparator") Block_sortedArrayUsingComparator cmptr);

    /**
     * returns a new array by sorting the objects of the receiver
     */
    @NotNull
    @Generated
    @Selector("sortedArrayUsingDescriptors:")
    public native NSArray<_ObjectType> sortedArrayUsingDescriptors(
            @NotNull NSArray<? extends NSSortDescriptor> sortDescriptors);

    @NotNull
    @Generated
    @Selector("sortedArrayUsingFunction:context:")
    public native NSArray<_ObjectType> sortedArrayUsingFunctionContext(
            @NotNull @FunctionPtr(name = "call_sortedArrayUsingFunctionContext") Function_sortedArrayUsingFunctionContext comparator,
            @Nullable VoidPtr context);

    @NotNull
    @Generated
    @Selector("sortedArrayUsingFunction:context:hint:")
    public native NSArray<_ObjectType> sortedArrayUsingFunctionContextHint(
            @NotNull @FunctionPtr(name = "call_sortedArrayUsingFunctionContextHint") Function_sortedArrayUsingFunctionContextHint comparator,
            @Nullable VoidPtr context, @Nullable NSData hint);

    @NotNull
    @Generated
    @Selector("sortedArrayUsingSelector:")
    public native NSArray<_ObjectType> sortedArrayUsingSelector(@NotNull SEL comparator);

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @Selector("sortedArrayWithOptions:usingComparator:")
    public native NSArray<_ObjectType> sortedArrayWithOptionsUsingComparator(@NUInt long opts,
            @NotNull @ObjCBlock(name = "call_sortedArrayWithOptionsUsingComparator") Block_sortedArrayWithOptionsUsingComparator cmptr);

    @NotNull
    @Generated
    @Selector("subarrayWithRange:")
    public native NSArray<_ObjectType> subarrayWithRange(@ByValue NSRange range);

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    /**
     * Return an array containing the results of invoking -valueForKey: on each of the receiver's elements. The returned
     * array will contain NSNull elements for each instance of -valueForKey: returning nil.
     */
    @NotNull
    @Generated
    @Selector("valueForKey:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object valueForKey(@NotNull String key);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 100000.0
     */
    @Deprecated
    @Generated
    @Selector("writeToFile:atomically:")
    public native boolean writeToFileAtomically(@NotNull String path, boolean useAuxiliaryFile);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 100000.0
     */
    @Deprecated
    @Generated
    @Selector("writeToURL:atomically:")
    public native boolean writeToURLAtomically(@NotNull NSURL url, boolean atomically);

    @Override
    public boolean add(_ObjectType e) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void add(int index, _ObjectType element) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean addAll(Collection<? extends _ObjectType> c) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean addAll(int index, Collection<? extends _ObjectType> c) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void clear() {
        throw new UnsupportedOperationException();
    }

    @SuppressWarnings("unchecked")
    @Override
    public boolean contains(Object o) {
        if (o == null) {
            throw new NullPointerException();
        }
        return containsObject((_ObjectType)o);
    }

    @SuppressWarnings("unchecked")
    @Override
    public boolean containsAll(Collection<?> c) {
        if (c == null) {
            throw new NullPointerException();
        }
        Iterator<?> it = c.iterator();
        while (it.hasNext()) {
            Object o = it.next();
            if (o == null) {
                throw new NullPointerException();
            }
            if (!containsObject((_ObjectType)o)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public _ObjectType get(int index) {
        if (index < 0 || index >= count()) {
            throw new IndexOutOfBoundsException();
        }
        return objectAtIndex(index);
    }

    @SuppressWarnings("unchecked")
    @Override
    public int indexOf(Object o) {
        long idx = indexOfObject((_ObjectType)o);
        return idx == Foundation.NSNotFound ? -1 : (int)idx;
    }

    @Override
    public boolean isEmpty() {
        return count() == 0;
    }

    @Override
    public Iterator<_ObjectType> iterator() {
        return new NSArrayIterator<_ObjectType>(this);
    }

    @Override
    public int lastIndexOf(Object o) {
        if (o == null) {
            throw new NullPointerException();
        }
        for (int idx = ((int)count()) - 1; idx >= 0; --idx) {
            if (o.equals(objectAtIndex(idx))) {
                return idx;
            }
        }
        return -1;
    }

    @Override
    public ListIterator<_ObjectType> listIterator() {
        return new NSArrayListIterator<_ObjectType>(this, 0);
    }

    @Override
    public ListIterator<_ObjectType> listIterator(int index) {
        if (index < 0 || index > size()) {
            throw new IndexOutOfBoundsException();
        }
        return new NSArrayListIterator<_ObjectType>(this, index);
    }

    @Override
    public boolean remove(Object o) {
        throw new UnsupportedOperationException();
    }

    @Override
    public _ObjectType remove(int index) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        throw new UnsupportedOperationException();
    }

    @Override
    public _ObjectType set(int index, _ObjectType element) {
        throw new UnsupportedOperationException();
    }

    @Override
    public int size() {
        return (int)count();
    }

    @Override
    public List<_ObjectType> subList(int fromIndex, int toIndex) {
        if (fromIndex < 0 || toIndex > size()) {
            throw new IndexOutOfBoundsException();
        }
        return subarrayWithRange(new NSRange(fromIndex, toIndex - fromIndex));
    }

    @Override
    public Object[] toArray() {
        Object[] a = new Object[(int)count()];
        for (int idx = 0; idx < (int)count(); ++idx) {
            a[idx] = objectAtIndex(idx);
        }
        return a;
    }

    @SuppressWarnings("unchecked")
    @Override
    public Object[] toArray(Object[] a) {
        if (a == null) {
            throw new NullPointerException();
        }
        final int count = (int)count();
        if (a.length < count) {
            return toArray();
        } else {
            for (int idx = 0; idx < count; ++idx) {
                a[idx] = objectAtIndex(idx);
            }
            if (a.length > count) {
                a[count] = null;
            }
            return a;
        }
    }

    @Override
    public int hashCode() {
        int hashCode = 1;
        for (Object e : this) {
            hashCode = 31 * hashCode + (e == null ? 0 : e.hashCode());
        }
        return hashCode;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof List)) return false;

        ListIterator<_ObjectType> e1 = listIterator();
        ListIterator<?> e2 = ((List<?>)o).listIterator();
        while (e1.hasNext() && e2.hasNext()) {
            _ObjectType o1 = e1.next();
            Object o2 = e2.next();
            if (!(o1 == null ? o2 == null : o1.equals(o2))) return false;
        }
        return !(e1.hasNext() || e2.hasNext());
    }

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
    public interface Function_sortedArrayUsingFunctionContext {
        @Generated
        @NInt
        long call_sortedArrayUsingFunctionContext(@NotNull @Mapped(ObjCObjectMapper.class) Object arg0,
                @NotNull @Mapped(ObjCObjectMapper.class) Object arg1, @Nullable VoidPtr arg2);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Function_sortedArrayUsingFunctionContextHint {
        @Generated
        @NInt
        long call_sortedArrayUsingFunctionContextHint(@NotNull @Mapped(ObjCObjectMapper.class) Object arg0,
                @NotNull @Mapped(ObjCObjectMapper.class) Object arg1, @Nullable VoidPtr arg2);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_sortedArrayWithOptionsUsingComparator {
        @Generated
        @NInt
        long call_sortedArrayWithOptionsUsingComparator(@NotNull @Mapped(ObjCObjectMapper.class) Object obj1,
                @NotNull @Mapped(ObjCObjectMapper.class) Object obj2);
    }

    private final static class NSArrayIterator<_ObjectType> implements Iterator<_ObjectType> {

        private final long count;
        private final NSArray<_ObjectType> array;
        private long cursor = 0;

        public NSArrayIterator(NSArray<_ObjectType> array) {
            this.array = array;
            this.count = array.count();
        }

        @Override
        public boolean hasNext() {
            return cursor < count;
        }

        @Override
        public _ObjectType next() {
            if (cursor >= count) {
                throw new NoSuchElementException();
            }
            return array.objectAtIndex(cursor++);
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException();
        }

    }

    private final static class NSArrayListIterator<_ObjectType> implements ListIterator<_ObjectType> {

        private final long count;
        private final NSArray<_ObjectType> array;
        private long cursor;

        public NSArrayListIterator(NSArray<_ObjectType> array, int idx) {
            cursor = idx;
            this.array = array;
            this.count = array.count();
        }

        @Override
        public void add(_ObjectType e) {
            throw new UnsupportedOperationException();
        }

        @Override
        public boolean hasNext() {
            return cursor < count;
        }

        @Override
        public boolean hasPrevious() {
            return cursor - 1 >= 0;
        }

        @Override
        public _ObjectType next() {
            if (cursor >= count) {
                throw new NoSuchElementException();
            }
            return array.objectAtIndex(cursor++);
        }

        @Override
        public int nextIndex() {
            return (int)cursor;
        }

        @Override
        public _ObjectType previous() {
            if (cursor <= 0) {
                throw new NoSuchElementException();
            }
            return array.objectAtIndex(--cursor);
        }

        @Override
        public int previousIndex() {
            return (int)cursor - 1;
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException();
        }

        @Override
        public void set(_ObjectType e) {
            throw new UnsupportedOperationException();
        }

    }

    /**
     * Reads array stored in NSPropertyList format from the specified url.
     * 
     * API-Since: 11.0
     */
    @Nullable
    @Generated
    @Selector("arrayWithContentsOfURL:error:")
    public static native <_ObjectType> NSArray<_ObjectType> arrayWithContentsOfURLError(@NotNull NSURL url,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * Reads array stored in NSPropertyList format from the specified url.
     * 
     * API-Since: 11.0
     */
    @Nullable
    @Generated
    @Selector("initWithContentsOfURL:error:")
    public native NSArray<_ObjectType> initWithContentsOfURLError(@NotNull NSURL url,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * Serializes this instance to the specified URL in the NSPropertyList format (using NSPropertyListXMLFormat_v1_0).
     * For other formats use NSPropertyListSerialization directly.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("writeToURL:error:")
    public native boolean writeToURLError(@NotNull NSURL url,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Nullable
    @Generated
    @Selector("arrayByApplyingDifference:")
    public native NSArray<_ObjectType> arrayByApplyingDifference(
            @NotNull NSOrderedCollectionDifference<_ObjectType> difference);

    /**
     * Uses isEqual: to determine the difference between the parameter and the receiver
     */
    @NotNull
    @Generated
    @Selector("differenceFromArray:")
    public native NSOrderedCollectionDifference<_ObjectType> differenceFromArray(@NotNull NSArray<_ObjectType> other);

    @NotNull
    @Generated
    @Selector("differenceFromArray:withOptions:")
    public native NSOrderedCollectionDifference<_ObjectType> differenceFromArrayWithOptions(
            @NotNull NSArray<_ObjectType> other, @NUInt long options);

    @NotNull
    @Generated
    @Selector("differenceFromArray:withOptions:usingEquivalenceTest:")
    public native NSOrderedCollectionDifference<_ObjectType> differenceFromArrayWithOptionsUsingEquivalenceTest(
            @NotNull NSArray<_ObjectType> other, @NUInt long options,
            @NotNull @ObjCBlock(name = "call_differenceFromArrayWithOptionsUsingEquivalenceTest") Block_differenceFromArrayWithOptionsUsingEquivalenceTest block);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_differenceFromArrayWithOptionsUsingEquivalenceTest {
        @Generated
        boolean call_differenceFromArrayWithOptionsUsingEquivalenceTest(
                @NotNull @Mapped(ObjCObjectMapper.class) Object obj1,
                @NotNull @Mapped(ObjCObjectMapper.class) Object obj2);
    }

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}

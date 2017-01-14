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
import org.moe.natj.general.ptr.ConstPtr;
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

@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSArray<_ObjectType> extends NSObject
        implements NSCopying, NSMutableCopying, NSSecureCoding, NSFastEnumeration, CKRecordValue, List<_ObjectType> {
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

    @Generated
    @Selector("allocWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object allocWithZone(VoidPtr zone);

    @Generated
    @Selector("array")
    public static native <_ObjectType> NSArray<?> array();

    @Generated
    @Selector("arrayWithArray:")
    public static native <_ObjectType> NSArray<?> arrayWithArray(NSArray<_ObjectType> array);

    @Generated
    @Selector("arrayWithContentsOfFile:")
    public static native <_ObjectType> NSArray<_ObjectType> arrayWithContentsOfFile(String path);

    @Generated
    @Selector("arrayWithContentsOfURL:")
    public static native <_ObjectType> NSArray<_ObjectType> arrayWithContentsOfURL(NSURL url);

    @Generated
    @Selector("arrayWithObject:")
    public static native <_ObjectType> NSArray<?> arrayWithObject(@Mapped(ObjCObjectMapper.class) _ObjectType anObject);

    @Generated
    @Variadic()
    @Selector("arrayWithObjects:")
    public static native <_ObjectType> NSArray<?> arrayWithObjects(@Mapped(ObjCObjectMapper.class) _ObjectType firstObj,
            Object... varargs);

    @Generated
    @Selector("arrayWithObjects:count:")
    public static native <_ObjectType> NSArray<?> arrayWithObjectsCount(
            @ReferenceInfo(type = ObjCObject.class) ConstPtr<_ObjectType> objects, @NUInt long cnt);

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
    @Selector("supportsSecureCoding")
    public static native <_ObjectType> boolean supportsSecureCoding();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @Generated
    @Selector("addObserver:forKeyPath:options:context:")
    public native void addObserverForKeyPathOptionsContext(NSObject observer, String keyPath, @NUInt long options,
            VoidPtr context);

    @Generated
    @Selector("addObserver:toObjectsAtIndexes:forKeyPath:options:context:")
    public native void addObserverToObjectsAtIndexesForKeyPathOptionsContext(NSObject observer, NSIndexSet indexes,
            String keyPath, @NUInt long options, VoidPtr context);

    @Generated
    @Selector("arrayByAddingObject:")
    public native NSArray<_ObjectType> arrayByAddingObject(@Mapped(ObjCObjectMapper.class) _ObjectType anObject);

    @Generated
    @Selector("arrayByAddingObjectsFromArray:")
    public native NSArray<_ObjectType> arrayByAddingObjectsFromArray(NSArray<_ObjectType> otherArray);

    @Generated
    @Selector("componentsJoinedByString:")
    public native String componentsJoinedByString(String separator);

    @Generated
    @Selector("containsObject:")
    public native boolean containsObject(@Mapped(ObjCObjectMapper.class) _ObjectType anObject);

    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(VoidPtr zone);

    @Generated
    @Selector("count")
    @NUInt
    public native long count();

    @Generated
    @Selector("countByEnumeratingWithState:objects:count:")
    @NUInt
    public native long countByEnumeratingWithStateObjectsCount(VoidPtr state,
            @ReferenceInfo(type = ObjCObject.class) Ptr<ObjCObject> buffer, @NUInt long len);

    @Generated
    @Selector("description")
    public native String description();

    @Generated
    @Selector("descriptionWithLocale:")
    public native String descriptionWithLocale(@Mapped(ObjCObjectMapper.class) Object locale);

    @Generated
    @Selector("descriptionWithLocale:indent:")
    public native String descriptionWithLocaleIndent(@Mapped(ObjCObjectMapper.class) Object locale, @NUInt long level);

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(NSCoder aCoder);

    @Generated
    @Selector("enumerateObjectsAtIndexes:options:usingBlock:")
    public native void enumerateObjectsAtIndexesOptionsUsingBlock(NSIndexSet s, @NUInt long opts,
            @ObjCBlock(name = "call_enumerateObjectsAtIndexesOptionsUsingBlock") Block_enumerateObjectsAtIndexesOptionsUsingBlock block);

    @Generated
    @Selector("enumerateObjectsUsingBlock:")
    public native void enumerateObjectsUsingBlock(
            @ObjCBlock(name = "call_enumerateObjectsUsingBlock") Block_enumerateObjectsUsingBlock block);

    @Generated
    @Selector("enumerateObjectsWithOptions:usingBlock:")
    public native void enumerateObjectsWithOptionsUsingBlock(@NUInt long opts,
            @ObjCBlock(name = "call_enumerateObjectsWithOptionsUsingBlock") Block_enumerateObjectsWithOptionsUsingBlock block);

    @Generated
    @Selector("filteredArrayUsingPredicate:")
    public native NSArray<_ObjectType> filteredArrayUsingPredicate(NSPredicate predicate);

    @Generated
    @Selector("firstObject")
    @MappedReturn(ObjCObjectMapper.class)
    public native _ObjectType firstObject();

    @Generated
    @Selector("firstObjectCommonWithArray:")
    @MappedReturn(ObjCObjectMapper.class)
    public native _ObjectType firstObjectCommonWithArray(NSArray<_ObjectType> otherArray);

    @Generated
    @Selector("getObjects:")
    public native void getObjects(@ReferenceInfo(type = ObjCObject.class) Ptr<ObjCObject> objects);

    @Generated
    @Selector("getObjects:range:")
    public native void getObjectsRange(@ReferenceInfo(type = ObjCObject.class) Ptr<ObjCObject> objects,
            @ByValue NSRange range);

    @Generated
    @Selector("indexOfObject:")
    @NUInt
    public native long indexOfObject(@Mapped(ObjCObjectMapper.class) _ObjectType anObject);

    @Generated
    @Selector("indexOfObject:inRange:")
    @NUInt
    public native long indexOfObjectInRange(@Mapped(ObjCObjectMapper.class) _ObjectType anObject,
            @ByValue NSRange range);

    @Generated
    @Selector("indexOfObject:inSortedRange:options:usingComparator:")
    @NUInt
    public native long indexOfObjectInSortedRangeOptionsUsingComparator(@Mapped(ObjCObjectMapper.class) _ObjectType obj,
            @ByValue NSRange r, @NUInt long opts,
            @ObjCBlock(name = "call_indexOfObjectInSortedRangeOptionsUsingComparator") Block_indexOfObjectInSortedRangeOptionsUsingComparator cmp);

    @Generated
    @Selector("indexOfObjectAtIndexes:options:passingTest:")
    @NUInt
    public native long indexOfObjectAtIndexesOptionsPassingTest(NSIndexSet s, @NUInt long opts,
            @ObjCBlock(name = "call_indexOfObjectAtIndexesOptionsPassingTest") Block_indexOfObjectAtIndexesOptionsPassingTest predicate);

    @Generated
    @Selector("indexOfObjectIdenticalTo:")
    @NUInt
    public native long indexOfObjectIdenticalTo(@Mapped(ObjCObjectMapper.class) _ObjectType anObject);

    @Generated
    @Selector("indexOfObjectIdenticalTo:inRange:")
    @NUInt
    public native long indexOfObjectIdenticalToInRange(@Mapped(ObjCObjectMapper.class) _ObjectType anObject,
            @ByValue NSRange range);

    @Generated
    @Selector("indexOfObjectPassingTest:")
    @NUInt
    public native long indexOfObjectPassingTest(
            @ObjCBlock(name = "call_indexOfObjectPassingTest") Block_indexOfObjectPassingTest predicate);

    @Generated
    @Selector("indexOfObjectWithOptions:passingTest:")
    @NUInt
    public native long indexOfObjectWithOptionsPassingTest(@NUInt long opts,
            @ObjCBlock(name = "call_indexOfObjectWithOptionsPassingTest") Block_indexOfObjectWithOptionsPassingTest predicate);

    @Generated
    @Selector("indexesOfObjectsAtIndexes:options:passingTest:")
    public native NSIndexSet indexesOfObjectsAtIndexesOptionsPassingTest(NSIndexSet s, @NUInt long opts,
            @ObjCBlock(name = "call_indexesOfObjectsAtIndexesOptionsPassingTest") Block_indexesOfObjectsAtIndexesOptionsPassingTest predicate);

    @Generated
    @Selector("indexesOfObjectsPassingTest:")
    public native NSIndexSet indexesOfObjectsPassingTest(
            @ObjCBlock(name = "call_indexesOfObjectsPassingTest") Block_indexesOfObjectsPassingTest predicate);

    @Generated
    @Selector("indexesOfObjectsWithOptions:passingTest:")
    public native NSIndexSet indexesOfObjectsWithOptionsPassingTest(@NUInt long opts,
            @ObjCBlock(name = "call_indexesOfObjectsWithOptionsPassingTest") Block_indexesOfObjectsWithOptionsPassingTest predicate);

    @Generated
    @Selector("init")
    public native NSArray<?> init();

    @Generated
    @Selector("initWithArray:")
    public native NSArray<?> initWithArray(NSArray<_ObjectType> array);

    @Generated
    @Selector("initWithArray:copyItems:")
    public native NSArray<?> initWithArrayCopyItems(NSArray<_ObjectType> array, boolean flag);

    @Generated
    @Selector("initWithCoder:")
    public native NSArray<?> initWithCoder(NSCoder aDecoder);

    @Generated
    @Selector("initWithContentsOfFile:")
    public native NSArray<_ObjectType> initWithContentsOfFile(String path);

    @Generated
    @Selector("initWithContentsOfURL:")
    public native NSArray<_ObjectType> initWithContentsOfURL(NSURL url);

    @Generated
    @Variadic()
    @Selector("initWithObjects:")
    public native NSArray<?> initWithObjects(@Mapped(ObjCObjectMapper.class) _ObjectType firstObj, Object... varargs);

    @Generated
    @Selector("initWithObjects:count:")
    public native NSArray<?> initWithObjectsCount(@ReferenceInfo(type = ObjCObject.class) Ptr<_ObjectType> objects,
            @NUInt long cnt);

    @Generated
    @Selector("isEqualToArray:")
    public native boolean isEqualToArray(NSArray<_ObjectType> otherArray);

    @Generated
    @Selector("lastObject")
    @MappedReturn(ObjCObjectMapper.class)
    public native _ObjectType lastObject();

    @Generated
    @Selector("makeObjectsPerformSelector:")
    public native void makeObjectsPerformSelector(SEL aSelector);

    @Generated
    @Selector("makeObjectsPerformSelector:withObject:")
    public native void makeObjectsPerformSelectorWithObject(SEL aSelector,
            @Mapped(ObjCObjectMapper.class) Object argument);

    @Generated
    @Selector("mutableCopyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object mutableCopyWithZone(VoidPtr zone);

    @Generated
    @Selector("objectAtIndex:")
    @MappedReturn(ObjCObjectMapper.class)
    public native _ObjectType objectAtIndex(@NUInt long index);

    @Generated
    @Selector("objectAtIndexedSubscript:")
    @MappedReturn(ObjCObjectMapper.class)
    public native _ObjectType objectAtIndexedSubscript(@NUInt long idx);

    @Generated
    @Selector("objectEnumerator")
    public native NSEnumerator<_ObjectType> objectEnumerator();

    @Generated
    @Selector("objectsAtIndexes:")
    public native NSArray<_ObjectType> objectsAtIndexes(NSIndexSet indexes);

    @Generated
    @Selector("pathsMatchingExtensions:")
    public native NSArray<String> pathsMatchingExtensions(NSArray<String> filterTypes);

    @Generated
    @Selector("removeObserver:forKeyPath:")
    public native void removeObserverForKeyPath(NSObject observer, String keyPath);

    @Generated
    @Selector("removeObserver:forKeyPath:context:")
    public native void removeObserverForKeyPathContext(NSObject observer, String keyPath, VoidPtr context);

    @Generated
    @Selector("removeObserver:fromObjectsAtIndexes:forKeyPath:")
    public native void removeObserverFromObjectsAtIndexesForKeyPath(NSObject observer, NSIndexSet indexes,
            String keyPath);

    @Generated
    @Selector("removeObserver:fromObjectsAtIndexes:forKeyPath:context:")
    public native void removeObserverFromObjectsAtIndexesForKeyPathContext(NSObject observer, NSIndexSet indexes,
            String keyPath, VoidPtr context);

    @Generated
    @Selector("reverseObjectEnumerator")
    public native NSEnumerator<_ObjectType> reverseObjectEnumerator();

    @Generated
    @Selector("setValue:forKey:")
    public native void setValueForKey(@Mapped(ObjCObjectMapper.class) Object value, String key);

    @Generated
    @Selector("shuffledArray")
    public native NSArray<_ObjectType> shuffledArray();

    @Generated
    @Selector("shuffledArrayWithRandomSource:")
    public native NSArray<_ObjectType> shuffledArrayWithRandomSource(GKRandomSource randomSource);

    @Generated
    @Selector("sortedArrayHint")
    public native NSData sortedArrayHint();

    @Generated
    @Selector("sortedArrayUsingComparator:")
    public native NSArray<_ObjectType> sortedArrayUsingComparator(
            @ObjCBlock(name = "call_sortedArrayUsingComparator") Block_sortedArrayUsingComparator cmptr);

    @Generated
    @Selector("sortedArrayUsingDescriptors:")
    public native NSArray<_ObjectType> sortedArrayUsingDescriptors(NSArray<? extends NSSortDescriptor> sortDescriptors);

    @Generated
    @Selector("sortedArrayUsingFunction:context:")
    public native NSArray<_ObjectType> sortedArrayUsingFunctionContext(
            @FunctionPtr(name = "call_sortedArrayUsingFunctionContext") Function_sortedArrayUsingFunctionContext comparator,
            VoidPtr context);

    @Generated
    @Selector("sortedArrayUsingFunction:context:hint:")
    public native NSArray<_ObjectType> sortedArrayUsingFunctionContextHint(
            @FunctionPtr(name = "call_sortedArrayUsingFunctionContextHint") Function_sortedArrayUsingFunctionContextHint comparator,
            VoidPtr context, NSData hint);

    @Generated
    @Selector("sortedArrayUsingSelector:")
    public native NSArray<_ObjectType> sortedArrayUsingSelector(SEL comparator);

    @Generated
    @Selector("sortedArrayWithOptions:usingComparator:")
    public native NSArray<_ObjectType> sortedArrayWithOptionsUsingComparator(@NUInt long opts,
            @ObjCBlock(name = "call_sortedArrayWithOptionsUsingComparator") Block_sortedArrayWithOptionsUsingComparator cmptr);

    @Generated
    @Selector("subarrayWithRange:")
    public native NSArray<_ObjectType> subarrayWithRange(@ByValue NSRange range);

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    @Generated
    @Selector("valueForKey:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object valueForKey(String key);

    @Generated
    @Selector("writeToFile:atomically:")
    public native boolean writeToFileAtomically(String path, boolean useAuxiliaryFile);

    @Generated
    @Selector("writeToURL:atomically:")
    public native boolean writeToURLAtomically(NSURL url, boolean atomically);

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
        void call_enumerateObjectsAtIndexesOptionsUsingBlock(@Mapped(ObjCObjectMapper.class) Object arg0,
                @NUInt long arg1, BoolPtr arg2);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_enumerateObjectsUsingBlock {
        @Generated
        void call_enumerateObjectsUsingBlock(@Mapped(ObjCObjectMapper.class) Object arg0, @NUInt long arg1,
                BoolPtr arg2);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_enumerateObjectsWithOptionsUsingBlock {
        @Generated
        void call_enumerateObjectsWithOptionsUsingBlock(@Mapped(ObjCObjectMapper.class) Object arg0, @NUInt long arg1,
                BoolPtr arg2);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_indexOfObjectInSortedRangeOptionsUsingComparator {
        @Generated
        @NInt
        long call_indexOfObjectInSortedRangeOptionsUsingComparator(@Mapped(ObjCObjectMapper.class) Object arg0,
                @Mapped(ObjCObjectMapper.class) Object arg1);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_indexOfObjectAtIndexesOptionsPassingTest {
        @Generated
        boolean call_indexOfObjectAtIndexesOptionsPassingTest(@Mapped(ObjCObjectMapper.class) Object arg0,
                @NUInt long arg1, BoolPtr arg2);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_indexOfObjectPassingTest {
        @Generated
        boolean call_indexOfObjectPassingTest(@Mapped(ObjCObjectMapper.class) Object arg0, @NUInt long arg1,
                BoolPtr arg2);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_indexOfObjectWithOptionsPassingTest {
        @Generated
        boolean call_indexOfObjectWithOptionsPassingTest(@Mapped(ObjCObjectMapper.class) Object arg0, @NUInt long arg1,
                BoolPtr arg2);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_indexesOfObjectsAtIndexesOptionsPassingTest {
        @Generated
        boolean call_indexesOfObjectsAtIndexesOptionsPassingTest(@Mapped(ObjCObjectMapper.class) Object arg0,
                @NUInt long arg1, BoolPtr arg2);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_indexesOfObjectsPassingTest {
        @Generated
        boolean call_indexesOfObjectsPassingTest(@Mapped(ObjCObjectMapper.class) Object arg0, @NUInt long arg1,
                BoolPtr arg2);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_indexesOfObjectsWithOptionsPassingTest {
        @Generated
        boolean call_indexesOfObjectsWithOptionsPassingTest(@Mapped(ObjCObjectMapper.class) Object arg0,
                @NUInt long arg1, BoolPtr arg2);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_sortedArrayUsingComparator {
        @Generated
        @NInt
        long call_sortedArrayUsingComparator(@Mapped(ObjCObjectMapper.class) Object arg0,
                @Mapped(ObjCObjectMapper.class) Object arg1);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Function_sortedArrayUsingFunctionContext {
        @Generated
        @NInt
        long call_sortedArrayUsingFunctionContext(@Mapped(ObjCObjectMapper.class) Object arg0,
                @Mapped(ObjCObjectMapper.class) Object arg1, VoidPtr arg2);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Function_sortedArrayUsingFunctionContextHint {
        @Generated
        @NInt
        long call_sortedArrayUsingFunctionContextHint(@Mapped(ObjCObjectMapper.class) Object arg0,
                @Mapped(ObjCObjectMapper.class) Object arg1, VoidPtr arg2);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_sortedArrayWithOptionsUsingComparator {
        @Generated
        @NInt
        long call_sortedArrayWithOptionsUsingComparator(@Mapped(ObjCObjectMapper.class) Object arg0,
                @Mapped(ObjCObjectMapper.class) Object arg1);
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
}

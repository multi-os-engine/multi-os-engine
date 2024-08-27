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
import org.moe.natj.general.ptr.NUIntPtr;
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
import java.util.ListIterator;
import java.util.NoSuchElementException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSMutableArray<_ObjectType> extends NSArray<_ObjectType> {
    static {
        NatJ.register();
    }

    @Generated
    protected NSMutableArray(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSMutableArray<?> alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native NSMutableArray<?> allocWithZone(VoidPtr zone);

    @Generated
    @Selector("array")
    public static native <_ObjectType> NSMutableArray<?> array();

    @Generated
    @Selector("arrayWithArray:")
    public static native <_ObjectType> NSMutableArray<?> arrayWithArray(@NotNull NSArray<_ObjectType> array);

    @Generated
    @Selector("arrayWithCapacity:")
    public static native <_ObjectType> NSMutableArray<?> arrayWithCapacity(@NUInt long numItems);

    @Nullable
    @Generated
    @Selector("arrayWithContentsOfFile:")
    public static native <_ObjectType> NSMutableArray<_ObjectType> arrayWithContentsOfFile(@NotNull String path);

    @Nullable
    @Generated
    @Selector("arrayWithContentsOfURL:")
    public static native <_ObjectType> NSMutableArray<_ObjectType> arrayWithContentsOfURL(@NotNull NSURL url);

    @Generated
    @Selector("arrayWithObject:")
    public static native <_ObjectType> NSMutableArray<?> arrayWithObject(
            @NotNull @Mapped(ObjCObjectMapper.class) _ObjectType anObject);

    @Generated
    @Variadic()
    @Selector("arrayWithObjects:")
    public static native <_ObjectType> NSMutableArray<?> arrayWithObjects(
            @NotNull @Mapped(ObjCObjectMapper.class) _ObjectType firstObj, Object... varargs);

    @Generated
    @Selector("arrayWithObjects:count:")
    public static native <_ObjectType> NSMutableArray<?> arrayWithObjectsCount(
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
    public static native NSMutableArray<?> new_objc();

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
    public native void addObject(@NotNull @Mapped(ObjCObjectMapper.class) _ObjectType anObject);

    @Generated
    @Selector("addObjectsFromArray:")
    public native void addObjectsFromArray(@NotNull NSArray<_ObjectType> otherArray);

    @Generated
    @Selector("exchangeObjectAtIndex:withObjectAtIndex:")
    public native void exchangeObjectAtIndexWithObjectAtIndex(@NUInt long idx1, @NUInt long idx2);

    /**
     * evaluate a predicate against an array of objects and filter the mutable array directly
     */
    @Generated
    @Selector("filterUsingPredicate:")
    public native void filterUsingPredicate(@NotNull NSPredicate predicate);

    @Generated
    @Selector("init")
    public native NSMutableArray<?> init();

    @Generated
    @Selector("initWithArray:")
    public native NSMutableArray<?> initWithArray(@NotNull NSArray<_ObjectType> array);

    @Generated
    @Selector("initWithArray:copyItems:")
    public native NSMutableArray<?> initWithArrayCopyItems(@NotNull NSArray<_ObjectType> array, boolean flag);

    @Generated
    @Selector("initWithCapacity:")
    public native NSMutableArray<?> initWithCapacity(@NUInt long numItems);

    @Generated
    @Selector("initWithCoder:")
    public native NSMutableArray<?> initWithCoder(@NotNull NSCoder coder);

    @Nullable
    @Generated
    @Selector("initWithContentsOfFile:")
    public native NSMutableArray<_ObjectType> initWithContentsOfFile(@NotNull String path);

    @Nullable
    @Generated
    @Selector("initWithContentsOfURL:")
    public native NSMutableArray<_ObjectType> initWithContentsOfURL(@NotNull NSURL url);

    @Generated
    @Variadic()
    @Selector("initWithObjects:")
    public native NSMutableArray<?> initWithObjects(@NotNull @Mapped(ObjCObjectMapper.class) _ObjectType firstObj,
            Object... varargs);

    @Generated
    @Selector("initWithObjects:count:")
    public native NSMutableArray<?> initWithObjectsCount(
            @Nullable @ReferenceInfo(type = ObjCObject.class) Ptr<_ObjectType> objects, @NUInt long cnt);

    @Generated
    @Selector("insertObject:atIndex:")
    public native void insertObjectAtIndex(@NotNull @Mapped(ObjCObjectMapper.class) _ObjectType anObject,
            @NUInt long index);

    @Generated
    @Selector("insertObjects:atIndexes:")
    public native void insertObjectsAtIndexes(@NotNull NSArray<_ObjectType> objects, @NotNull NSIndexSet indexes);

    @Generated
    @Selector("removeAllObjects")
    public native void removeAllObjects();

    @Generated
    @Selector("removeLastObject")
    public native void removeLastObject();

    @Generated
    @Selector("removeObject:")
    public native void removeObject(@NotNull @Mapped(ObjCObjectMapper.class) _ObjectType anObject);

    @Generated
    @Selector("removeObject:inRange:")
    public native void removeObjectInRange(@NotNull @Mapped(ObjCObjectMapper.class) _ObjectType anObject,
            @ByValue NSRange range);

    @Generated
    @Selector("removeObjectAtIndex:")
    public native void removeObjectAtIndex(@NUInt long index);

    @Generated
    @Selector("removeObjectIdenticalTo:")
    public native void removeObjectIdenticalTo(@NotNull @Mapped(ObjCObjectMapper.class) _ObjectType anObject);

    @Generated
    @Selector("removeObjectIdenticalTo:inRange:")
    public native void removeObjectIdenticalToInRange(@NotNull @Mapped(ObjCObjectMapper.class) _ObjectType anObject,
            @ByValue NSRange range);

    @Generated
    @Selector("removeObjectsAtIndexes:")
    public native void removeObjectsAtIndexes(@NotNull NSIndexSet indexes);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 4.0
     * Deprecated-Message: Not supported
     */
    @Generated
    @Deprecated
    @Selector("removeObjectsFromIndices:numIndices:")
    public native void removeObjectsFromIndicesNumIndices(@NotNull NUIntPtr indices, @NUInt long cnt);

    @Generated
    @Selector("removeObjectsInArray:")
    public native void removeObjectsInArray(@NotNull NSArray<_ObjectType> otherArray);

    @Generated
    @Selector("removeObjectsInRange:")
    public native void removeObjectsInRange(@ByValue NSRange range);

    @Generated
    @Selector("replaceObjectAtIndex:withObject:")
    public native void replaceObjectAtIndexWithObject(@NUInt long index,
            @NotNull @Mapped(ObjCObjectMapper.class) _ObjectType anObject);

    @Generated
    @Selector("replaceObjectsAtIndexes:withObjects:")
    public native void replaceObjectsAtIndexesWithObjects(@NotNull NSIndexSet indexes,
            @NotNull NSArray<_ObjectType> objects);

    @Generated
    @Selector("replaceObjectsInRange:withObjectsFromArray:")
    public native void replaceObjectsInRangeWithObjectsFromArray(@ByValue NSRange range,
            @NotNull NSArray<_ObjectType> otherArray);

    @Generated
    @Selector("replaceObjectsInRange:withObjectsFromArray:range:")
    public native void replaceObjectsInRangeWithObjectsFromArrayRange(@ByValue NSRange range,
            @NotNull NSArray<_ObjectType> otherArray, @ByValue NSRange otherRange);

    @Generated
    @Selector("setArray:")
    public native void setArray(@NotNull NSArray<_ObjectType> otherArray);

    /**
     * API-Since: 6.0
     */
    @Generated
    @Selector("setObject:atIndexedSubscript:")
    public native void setObjectAtIndexedSubscript(@NotNull @Mapped(ObjCObjectMapper.class) _ObjectType obj,
            @NUInt long idx);

    /**
     * API-Since: 4.0
     */
    @Generated
    @Selector("sortUsingComparator:")
    public native void sortUsingComparator(
            @NotNull @ObjCBlock(name = "call_sortUsingComparator") Block_sortUsingComparator cmptr);

    /**
     * sorts the array itself
     */
    @Generated
    @Selector("sortUsingDescriptors:")
    public native void sortUsingDescriptors(@NotNull NSArray<? extends NSSortDescriptor> sortDescriptors);

    @Generated
    @Selector("sortUsingFunction:context:")
    public native void sortUsingFunctionContext(
            @NotNull @FunctionPtr(name = "call_sortUsingFunctionContext") Function_sortUsingFunctionContext compare,
            @Nullable VoidPtr context);

    @Generated
    @Selector("sortUsingSelector:")
    public native void sortUsingSelector(@NotNull SEL comparator);

    /**
     * API-Since: 4.0
     */
    @Generated
    @Selector("sortWithOptions:usingComparator:")
    public native void sortWithOptionsUsingComparator(@NUInt long opts,
            @NotNull @ObjCBlock(name = "call_sortWithOptionsUsingComparator") Block_sortWithOptionsUsingComparator cmptr);

    @Override
    public boolean add(_ObjectType e) {
        if (e == null) {
            throw new NullPointerException();
        }
        addObject(e);
        return true;
    }

    @Override
    public void add(int index, _ObjectType element) {
        if (index < 0 || index > size()) {
            throw new IndexOutOfBoundsException();
        }
        if (element == null) {
            throw new NullPointerException();
        }
        insertObjectAtIndex(element, index);
    }

    @SuppressWarnings("unchecked")
    @Override
    public boolean addAll(Collection<? extends _ObjectType> c) {
        if (c == null) {
            throw new NullPointerException();
        }
        for (Object o : c) {
            if (o == null) {
                throw new NullPointerException();
            }
        }
        boolean changed = false;
        for (Object o : c) {
            addObject((_ObjectType)o);
            changed = true;
        }
        return changed;
    }

    @SuppressWarnings("unchecked")
    @Override
    public boolean addAll(int index, Collection<? extends _ObjectType> c) {
        if (c == null) {
            throw new NullPointerException();
        }
        for (Object o : c) {
            if (o == null) {
                throw new NullPointerException();
            }
        }
        boolean changed = false;
        for (Object o : c) {
            insertObjectAtIndex((_ObjectType)o, index++);
            changed = true;
        }
        return changed;
    }

    @Override
    public void clear() {
        removeAllObjects();
    }

    @Override
    public Iterator<_ObjectType> iterator() {
        return new NSMutableArrayIterator<_ObjectType>(this);
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
        return new NSMutableArrayListIterator<_ObjectType>(this, 0);
    }

    @Override
    public ListIterator<_ObjectType> listIterator(int index) {
        if (index < 0 || index > size()) {
            throw new IndexOutOfBoundsException();
        }
        return new NSMutableArrayListIterator<_ObjectType>(this, index);
    }

    @SuppressWarnings("unchecked")
    @Override
    public boolean remove(Object o) {
        if (o == null) {
            throw new NullPointerException();
        }
        boolean contains = containsObject((_ObjectType)o);
        removeObject((_ObjectType)o);
        return contains;
    }

    @Override
    public _ObjectType remove(int index) {
        if (index < 0 || index >= count()) {
            throw new IndexOutOfBoundsException();
        }
        _ObjectType e = objectAtIndex(index);
        removeObjectAtIndex(index);
        return e;
    }

    @SuppressWarnings("unchecked")
    @Override
    public boolean removeAll(Collection<?> c) {
        if (c == null) {
            throw new NullPointerException();
        }
        for (Object o : c) {
            if (o == null) {
                throw new NullPointerException();
            }
        }
        boolean changed = false;
        for (Object o : c) {
            if (containsObject((_ObjectType)o)) {
                removeObject((_ObjectType)o);
                changed = true;
            }
        }
        return changed;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        if (c == null) {
            throw new NullPointerException();
        }
        for (Object o : c) {
            if (o == null) {
                throw new NullPointerException();
            }
        }
        boolean changed = false;
        Iterator it = iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (!c.contains(next)) {
                it.remove();
                changed = true;
            }
        }
        return changed;
    }

    @Override
    public _ObjectType set(int index, _ObjectType element) {
        if (index < 0 || index >= count()) {
            throw new IndexOutOfBoundsException();
        }
        if (element == null) {
            throw new NullPointerException();
        }
        _ObjectType old = objectAtIndex(index);
        replaceObjectAtIndexWithObject(index, element);
        return old;
    }

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
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
    public interface Function_sortUsingFunctionContext {
        @Generated
        @NInt
        long call_sortUsingFunctionContext(@NotNull @Mapped(ObjCObjectMapper.class) Object arg0,
                @NotNull @Mapped(ObjCObjectMapper.class) Object arg1, @Nullable VoidPtr arg2);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_sortWithOptionsUsingComparator {
        @Generated
        @NInt
        long call_sortWithOptionsUsingComparator(@NotNull @Mapped(ObjCObjectMapper.class) Object obj1,
                @NotNull @Mapped(ObjCObjectMapper.class) Object obj2);
    }

    private final static class NSMutableArrayIterator<_ObjectType> implements Iterator<_ObjectType> {

        private final NSMutableArray<_ObjectType> array;
        private int editCursor = -1;
        private int cursor = 0;

        public NSMutableArrayIterator(NSMutableArray<_ObjectType> array) {
            this.array = array;
        }

        @Override
        public boolean hasNext() {
            return cursor < array.count();
        }

        @Override
        public _ObjectType next() {
            if (cursor >= array.count()) {
                throw new NoSuchElementException();
            }
            editCursor = cursor;
            return array.objectAtIndex(cursor++);
        }

        @Override
        public void remove() {
            if (editCursor == -1) {
                throw new IllegalStateException();
            }
            array.removeObjectAtIndex(editCursor);
            editCursor = -1;
            --cursor;
        }

    }

    private final static class NSMutableArrayListIterator<_ObjectType> implements ListIterator<_ObjectType> {

        private final NSMutableArray<_ObjectType> array;
        private int editCursor = -1;
        private int cursor;

        public NSMutableArrayListIterator(NSMutableArray<_ObjectType> array, int idx) {
            cursor = idx;
            this.array = array;
        }

        @Override
        public void add(_ObjectType e) {
            if (e == null) {
                throw new NullPointerException();
            }
            editCursor = -1;
            array.insertObjectAtIndex(e, cursor);
        }

        @Override
        public boolean hasNext() {
            return cursor < array.count();
        }

        @Override
        public boolean hasPrevious() {
            return cursor - 1 >= 0;
        }

        @Override
        public _ObjectType next() {
            if (cursor >= array.count()) {
                throw new NoSuchElementException();
            }
            editCursor = cursor;
            return array.objectAtIndex(cursor++);
        }

        @Override
        public int nextIndex() {
            return cursor;
        }

        @Override
        public _ObjectType previous() {
            if (cursor <= 0) {
                throw new NoSuchElementException();
            }
            editCursor = cursor - 1;
            return array.objectAtIndex(--cursor);
        }

        @Override
        public int previousIndex() {
            return cursor - 1;
        }

        @Override
        public void remove() {
            if (editCursor == -1) {
                throw new IllegalStateException();
            }
            array.removeObjectAtIndex(editCursor);
            editCursor = -1;
            --cursor;
        }

        @Override
        public void set(_ObjectType e) {
            if (editCursor == -1) {
                throw new IllegalStateException();
            }
            if (e == null) {
                throw new NullPointerException();
            }
            array.replaceObjectAtIndexWithObject(editCursor, e);
        }

    }

    @Nullable
    @Generated
    @Selector("arrayWithContentsOfURL:error:")
    public static native <_ObjectType> NSArray<_ObjectType> arrayWithContentsOfURLError(@NotNull NSURL url,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Nullable
    @Generated
    @Selector("initWithContentsOfURL:error:")
    public native NSArray<_ObjectType> initWithContentsOfURLError(@NotNull NSURL url,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Selector("applyDifference:")
    public native void applyDifference(@NotNull NSOrderedCollectionDifference<_ObjectType> difference);

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}

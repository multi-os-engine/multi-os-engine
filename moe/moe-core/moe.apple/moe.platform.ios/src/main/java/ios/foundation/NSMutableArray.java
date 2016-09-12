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

package ios.foundation;


import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.NoSuchElementException;

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
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.ConstPtr;
import org.moe.natj.general.ptr.NUIntPtr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

import ios.foundation.struct.NSRange;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import ios.NSObject;

@SuppressWarnings({"rawtypes"})
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

	/**
	 * addObject:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSMutableArray_Class/index.html#//apple_ref/occ/instm/NSMutableArray/addObject:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("addObject:")
	public native void addObject(@Mapped(ObjCObjectMapper.class) _ObjectType anObject);

	/**
	 * addObjectsFromArray:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSMutableArray_Class/index.html#//apple_ref/occ/instm/NSMutableArray/addObjectsFromArray:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("addObjectsFromArray:")
	public native void addObjectsFromArray(NSArray<_ObjectType> otherArray);

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSMutableArray<?> alloc();

	@Generated
	@Selector("array")
	public static native <_ObjectType> NSMutableArray<?> array();

	@Generated
	@Selector("arrayWithArray:")
	public static native <_ObjectType> NSMutableArray<?> arrayWithArray(NSArray<_ObjectType> array);

	/**
	 * arrayWithCapacity:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSMutableArray_Class/index.html#//apple_ref/occ/clm/NSMutableArray/arrayWithCapacity:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("arrayWithCapacity:")
	public static native <_ObjectType> NSMutableArray<?> arrayWithCapacity(@NUInt long numItems);

	/**
	 * arrayWithContentsOfFile:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSMutableArray_Class/index.html#//apple_ref/occ/clm/NSMutableArray/arrayWithContentsOfFile:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("arrayWithContentsOfFile:")
	public static native <_ObjectType> NSMutableArray<_ObjectType> arrayWithContentsOfFile(String path);

	/**
	 * arrayWithContentsOfURL:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSMutableArray_Class/index.html#//apple_ref/occ/clm/NSMutableArray/arrayWithContentsOfURL:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("arrayWithContentsOfURL:")
	public static native <_ObjectType> NSMutableArray<_ObjectType> arrayWithContentsOfURL(NSURL url);

	@Generated
	@Selector("arrayWithObject:")
	public static native <_ObjectType> NSMutableArray<?> arrayWithObject(
			@Mapped(ObjCObjectMapper.class) _ObjectType anObject);

	@Generated
	@Variadic()
	@Selector("arrayWithObjects:")
	public static native <_ObjectType> NSMutableArray<?> arrayWithObjects(
			@Mapped(ObjCObjectMapper.class) _ObjectType firstObj, Object... varargs);

	@Generated
	@Selector("arrayWithObjects:count:")
	public static native <_ObjectType> NSMutableArray<?> arrayWithObjectsCount(
			ConstPtr<_ObjectType> objects, @NUInt long cnt);

	/**
	 * exchangeObjectAtIndex:withObjectAtIndex:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSMutableArray_Class/index.html#//apple_ref/occ/instm/NSMutableArray/exchangeObjectAtIndex:withObjectAtIndex:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("exchangeObjectAtIndex:withObjectAtIndex:")
	public native void exchangeObjectAtIndexWithObjectAtIndex(@NUInt long idx1,
			@NUInt long idx2);

	/**
	 * filterUsingPredicate:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSMutableArray_Class/index.html#//apple_ref/occ/instm/NSMutableArray/filterUsingPredicate:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("filterUsingPredicate:")
	public native void filterUsingPredicate(NSPredicate predicate);

	/**
	 * init</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSMutableArray_Class/index.html#//apple_ref/occ/instm/NSMutableArray/init">iOS Dev Center</a>
	 */
	@Generated
	@Selector("init")
	public native NSMutableArray<?> init();

	@Generated
	@Selector("initWithArray:")
	public native NSMutableArray<?> initWithArray(NSArray<_ObjectType> array);

	@Generated
	@Selector("initWithArray:copyItems:")
	public native NSMutableArray<?> initWithArrayCopyItems(NSArray<_ObjectType> array,
			boolean flag);

	/**
	 * initWithCapacity:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSMutableArray_Class/index.html#//apple_ref/occ/instm/NSMutableArray/initWithCapacity:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("initWithCapacity:")
	public native NSMutableArray<?> initWithCapacity(@NUInt long numItems);

	@Generated
	@Selector("initWithCoder:")
	public native NSMutableArray<?> initWithCoder(NSCoder aDecoder);

	/**
	 * initWithContentsOfFile:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSMutableArray_Class/index.html#//apple_ref/occ/instm/NSMutableArray/initWithContentsOfFile:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("initWithContentsOfFile:")
	public native NSMutableArray<_ObjectType> initWithContentsOfFile(String path);

	/**
	 * initWithContentsOfURL:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSMutableArray_Class/index.html#//apple_ref/occ/instm/NSMutableArray/initWithContentsOfURL:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("initWithContentsOfURL:")
	public native NSMutableArray<_ObjectType> initWithContentsOfURL(NSURL url);

	@Generated
	@Variadic()
	@Selector("initWithObjects:")
	public native NSMutableArray<?> initWithObjects(
			@Mapped(ObjCObjectMapper.class) _ObjectType firstObj, Object... varargs);

	@Generated
	@Selector("initWithObjects:count:")
	public native NSMutableArray<?> initWithObjectsCount(
			ConstPtr<_ObjectType> objects, @NUInt long cnt);

	/**
	 * insertObject:atIndex:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSMutableArray_Class/index.html#//apple_ref/occ/instm/NSMutableArray/insertObject:atIndex:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("insertObject:atIndex:")
	public native void insertObjectAtIndex(
			@Mapped(ObjCObjectMapper.class) _ObjectType anObject, @NUInt long index);

	/**
	 * insertObjects:atIndexes:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSMutableArray_Class/index.html#//apple_ref/occ/instm/NSMutableArray/insertObjects:atIndexes:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("insertObjects:atIndexes:")
	public native void insertObjectsAtIndexes(NSArray<_ObjectType> objects,
			NSIndexSet indexes);

	/**
	 * removeAllObjects</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSMutableArray_Class/index.html#//apple_ref/occ/instm/NSMutableArray/removeAllObjects">iOS Dev Center</a>
	 */
	@Generated
	@Selector("removeAllObjects")
	public native void removeAllObjects();

	/**
	 * removeLastObject</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSMutableArray_Class/index.html#//apple_ref/occ/instm/NSMutableArray/removeLastObject">iOS Dev Center</a>
	 */
	@Generated
	@Selector("removeLastObject")
	public native void removeLastObject();

	/**
	 * removeObject:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSMutableArray_Class/index.html#//apple_ref/occ/instm/NSMutableArray/removeObject:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("removeObject:")
	public native void removeObject(
			@Mapped(ObjCObjectMapper.class) _ObjectType anObject);

	/**
	 * removeObject:inRange:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSMutableArray_Class/index.html#//apple_ref/occ/instm/NSMutableArray/removeObject:inRange:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("removeObject:inRange:")
	public native void removeObjectInRange(
			@Mapped(ObjCObjectMapper.class) _ObjectType anObject,
			@ByValue NSRange range);

	/**
	 * removeObjectAtIndex:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSMutableArray_Class/index.html#//apple_ref/occ/instm/NSMutableArray/removeObjectAtIndex:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("removeObjectAtIndex:")
	public native void removeObjectAtIndex(@NUInt long index);

	/**
	 * removeObjectIdenticalTo:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSMutableArray_Class/index.html#//apple_ref/occ/instm/NSMutableArray/removeObjectIdenticalTo:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("removeObjectIdenticalTo:")
	public native void removeObjectIdenticalTo(
			@Mapped(ObjCObjectMapper.class) _ObjectType anObject);

	/**
	 * removeObjectIdenticalTo:inRange:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSMutableArray_Class/index.html#//apple_ref/occ/instm/NSMutableArray/removeObjectIdenticalTo:inRange:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("removeObjectIdenticalTo:inRange:")
	public native void removeObjectIdenticalToInRange(
			@Mapped(ObjCObjectMapper.class) _ObjectType anObject,
			@ByValue NSRange range);

	/**
	 * removeObjectsAtIndexes:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSMutableArray_Class/index.html#//apple_ref/occ/instm/NSMutableArray/removeObjectsAtIndexes:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("removeObjectsAtIndexes:")
	public native void removeObjectsAtIndexes(NSIndexSet indexes);

	/**
	 * removeObjectsFromIndices:numIndices:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSMutableArray_Class/index.html#//apple_ref/occ/instm/NSMutableArray/removeObjectsFromIndices:numIndices:">iOS Dev Center</a>
	 */
	@Generated
	@Deprecated
	@Selector("removeObjectsFromIndices:numIndices:")
	public native void removeObjectsFromIndicesNumIndices(NUIntPtr indices,
			@NUInt long cnt);

	/**
	 * removeObjectsInArray:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSMutableArray_Class/index.html#//apple_ref/occ/instm/NSMutableArray/removeObjectsInArray:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("removeObjectsInArray:")
	public native void removeObjectsInArray(NSArray<_ObjectType> otherArray);

	/**
	 * removeObjectsInRange:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSMutableArray_Class/index.html#//apple_ref/occ/instm/NSMutableArray/removeObjectsInRange:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("removeObjectsInRange:")
	public native void removeObjectsInRange(@ByValue NSRange range);

	/**
	 * replaceObjectAtIndex:withObject:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSMutableArray_Class/index.html#//apple_ref/occ/instm/NSMutableArray/replaceObjectAtIndex:withObject:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("replaceObjectAtIndex:withObject:")
	public native void replaceObjectAtIndexWithObject(@NUInt long index,
			@Mapped(ObjCObjectMapper.class) _ObjectType anObject);

	/**
	 * replaceObjectsAtIndexes:withObjects:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSMutableArray_Class/index.html#//apple_ref/occ/instm/NSMutableArray/replaceObjectsAtIndexes:withObjects:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("replaceObjectsAtIndexes:withObjects:")
	public native void replaceObjectsAtIndexesWithObjects(NSIndexSet indexes,
			NSArray<_ObjectType> objects);

	/**
	 * replaceObjectsInRange:withObjectsFromArray:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSMutableArray_Class/index.html#//apple_ref/occ/instm/NSMutableArray/replaceObjectsInRange:withObjectsFromArray:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("replaceObjectsInRange:withObjectsFromArray:")
	public native void replaceObjectsInRangeWithObjectsFromArray(
			@ByValue NSRange range, NSArray<_ObjectType> otherArray);

	/**
	 * replaceObjectsInRange:withObjectsFromArray:range:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSMutableArray_Class/index.html#//apple_ref/occ/instm/NSMutableArray/replaceObjectsInRange:withObjectsFromArray:range:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("replaceObjectsInRange:withObjectsFromArray:range:")
	public native void replaceObjectsInRangeWithObjectsFromArrayRange(
			@ByValue NSRange range, NSArray<_ObjectType> otherArray,
			@ByValue NSRange otherRange);

	/**
	 * setArray:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSMutableArray_Class/index.html#//apple_ref/occ/instm/NSMutableArray/setArray:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setArray:")
	public native void setArray(NSArray<_ObjectType> otherArray);

	/**
	 * setObject:atIndexedSubscript:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSMutableArray_Class/index.html#//apple_ref/occ/instm/NSMutableArray/setObject:atIndexedSubscript:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setObject:atIndexedSubscript:")
	public native void setObjectAtIndexedSubscript(
			@Mapped(ObjCObjectMapper.class) _ObjectType obj, @NUInt long idx);

	/**
	 * sortUsingComparator:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSMutableArray_Class/index.html#//apple_ref/occ/instm/NSMutableArray/sortUsingComparator:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("sortUsingComparator:")
	public native void sortUsingComparator(
			@ObjCBlock(name = "call_sortUsingComparator") Block_sortUsingComparator cmptr);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_sortUsingComparator {
		@Generated
		@NInt
		long call_sortUsingComparator(
				@Mapped(ObjCObjectMapper.class) Object arg0,
				@Mapped(ObjCObjectMapper.class) Object arg1);
	}

	/**
	 * sortUsingDescriptors:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSMutableArray_Class/index.html#//apple_ref/occ/instm/NSMutableArray/sortUsingDescriptors:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("sortUsingDescriptors:")
	public native void sortUsingDescriptors(NSArray<? extends NSSortDescriptor> sortDescriptors);

	/**
	 * sortUsingFunction:context:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSMutableArray_Class/index.html#//apple_ref/occ/instm/NSMutableArray/sortUsingFunction:context:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("sortUsingFunction:context:")
	public native void sortUsingFunctionContext(
			@FunctionPtr(name = "call_sortUsingFunctionContext") Function_sortUsingFunctionContext compare,
			VoidPtr context);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Function_sortUsingFunctionContext {
		@Generated
		@NInt
		long call_sortUsingFunctionContext(
				@Mapped(ObjCObjectMapper.class) Object arg0,
				@Mapped(ObjCObjectMapper.class) Object arg1, VoidPtr arg2);
	}

	/**
	 * sortUsingSelector:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSMutableArray_Class/index.html#//apple_ref/occ/instm/NSMutableArray/sortUsingSelector:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("sortUsingSelector:")
	public native void sortUsingSelector(SEL comparator);

	/**
	 * sortWithOptions:usingComparator:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSMutableArray_Class/index.html#//apple_ref/occ/instm/NSMutableArray/sortWithOptions:usingComparator:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("sortWithOptions:usingComparator:")
	public native void sortWithOptionsUsingComparator(
			@NUInt long opts,
			@ObjCBlock(name = "call_sortWithOptionsUsingComparator") Block_sortWithOptionsUsingComparator cmptr);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_sortWithOptionsUsingComparator {
		@Generated
		@NInt
		long call_sortWithOptionsUsingComparator(
				@Mapped(ObjCObjectMapper.class) Object arg0,
				@Mapped(ObjCObjectMapper.class) Object arg1);
	}

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

	private final static class NSMutableArrayIterator<_ObjectType> implements Iterator<_ObjectType> {

		private int editCursor = -1;
		private int cursor = 0;
		private final NSMutableArray<_ObjectType> array;

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

	private final static class NSMutableArrayListIterator<_ObjectType> implements ListIterator<_ObjectType> {

		private int editCursor = -1;
		private int cursor;
		private final NSMutableArray<_ObjectType> array;

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
	@Selector("accessInstanceVariablesDirectly")
	public static native boolean accessInstanceVariablesDirectly();

	@Generated
	@Selector("allocWithZone:")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object allocWithZone(VoidPtr zone);

	@Generated
	@Selector("automaticallyNotifiesObserversForKey:")
	public static native boolean automaticallyNotifiesObserversForKey(String key);

	@Generated
	@Selector("cancelPreviousPerformRequestsWithTarget:")
	public static native void cancelPreviousPerformRequestsWithTarget(
			@Mapped(ObjCObjectMapper.class) Object aTarget);

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
	@Selector("initialize")
	public static native void initialize();

	@Generated
	@Selector("instanceMethodForSelector:")
	@FunctionPtr(name = "call_instanceMethodForSelector_ret")
	public static native NSObject.Function_instanceMethodForSelector_ret instanceMethodForSelector(
			SEL aSelector);

	@Generated
	@Selector("instanceMethodSignatureForSelector:")
	public static native NSMethodSignature instanceMethodSignatureForSelector(
			SEL aSelector);

	@Generated
	@Selector("instancesRespondToSelector:")
	public static native boolean instancesRespondToSelector(SEL aSelector);

	@Generated
	@Selector("isSubclassOfClass:")
	public static native boolean isSubclassOfClass(Class aClass);

	@Generated
	@Selector("keyPathsForValuesAffectingValueForKey:")
	public static native NSSet<String> keyPathsForValuesAffectingValueForKey(
			String key);

	@Generated
	@Selector("load")
	public static native void load_objc_static();

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
	public static native boolean supportsSecureCoding();

	@Generated
	@ProtocolClassMethod("supportsSecureCoding")
	public boolean _supportsSecureCoding() {
		return supportsSecureCoding();
	}

	@Generated
	@Selector("version")
	@NInt
	public static native long version_static();
}

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
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.BoolPtr;
import org.moe.natj.general.ptr.ConstPtr;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.ObjCObject;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

import ios.NSObject;
import ios.foundation.protocol.NSCopying;
import ios.foundation.protocol.NSFastEnumeration;
import ios.foundation.protocol.NSMutableCopying;
import ios.foundation.protocol.NSSecureCoding;
import ios.foundation.struct.NSRange;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.SEL;

@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSOrderedSet<_ObjectType> extends NSObject implements NSCopying,
		NSMutableCopying, NSSecureCoding, NSFastEnumeration {
	static {
		NatJ.register();
	}

	@Generated
	protected NSOrderedSet(Pointer peer) {
		super(peer);
	}

	/**
	 * addObserver:forKeyPath:options:context:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSOrderedSet_Class/index.html#//apple_ref/occ/instm/NSOrderedSet/addObserver:forKeyPath:options:context:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("addObserver:forKeyPath:options:context:")
	public native void addObserverForKeyPathOptionsContext(NSObject observer,
			String keyPath, @NUInt long options, VoidPtr context);

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSOrderedSet<?> alloc();

	/**
	 * array</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSOrderedSet_Class/index.html#//apple_ref/occ/instp/NSOrderedSet/array">iOS Dev Center</a>
	 */
	@Generated
	@Selector("array")
	public native NSArray<_ObjectType> array();

	/**
	 * containsObject:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSOrderedSet_Class/index.html#//apple_ref/occ/instm/NSOrderedSet/containsObject:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("containsObject:")
	public native boolean containsObject(
			@Mapped(ObjCObjectMapper.class) _ObjectType object);

	@Generated
	@Owned
	@Selector("copyWithZone:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object copyWithZone(VoidPtr zone);

	/**
	 * count</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSOrderedSet_Class/index.html#//apple_ref/occ/instp/NSOrderedSet/count">iOS Dev Center</a>
	 */
	@Generated
	@Selector("count")
	@NUInt
	public native long count();

	@Generated
	@Selector("countByEnumeratingWithState:objects:count:")
	@NUInt
	public native long countByEnumeratingWithStateObjectsCount(VoidPtr state,
			Ptr<ObjCObject> buffer, @NUInt long len);

	/**
	 * description</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSOrderedSet_Class/index.html#//apple_ref/occ/instp/NSOrderedSet/description">iOS Dev Center</a>
	 */
	@Generated
	@Selector("description")
	public native String description();

	/**
	 * descriptionWithLocale:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSOrderedSet_Class/index.html#//apple_ref/occ/instm/NSOrderedSet/descriptionWithLocale:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("descriptionWithLocale:")
	public native String descriptionWithLocale(
			@Mapped(ObjCObjectMapper.class) Object locale);

	/**
	 * descriptionWithLocale:indent:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSOrderedSet_Class/index.html#//apple_ref/occ/instm/NSOrderedSet/descriptionWithLocale:indent:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("descriptionWithLocale:indent:")
	public native String descriptionWithLocaleIndent(
			@Mapped(ObjCObjectMapper.class) Object locale, @NUInt long level);

	@Generated
	@Selector("encodeWithCoder:")
	public native void encodeWithCoder(NSCoder aCoder);

	/**
	 * enumerateObjectsAtIndexes:options:usingBlock:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSOrderedSet_Class/index.html#//apple_ref/occ/instm/NSOrderedSet/enumerateObjectsAtIndexes:options:usingBlock:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("enumerateObjectsAtIndexes:options:usingBlock:")
	public native void enumerateObjectsAtIndexesOptionsUsingBlock(
			NSIndexSet s,
			@NUInt long opts,
			@ObjCBlock(name = "call_enumerateObjectsAtIndexesOptionsUsingBlock") Block_enumerateObjectsAtIndexesOptionsUsingBlock block);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_enumerateObjectsAtIndexesOptionsUsingBlock {
		@Generated
		void call_enumerateObjectsAtIndexesOptionsUsingBlock(
				@Mapped(ObjCObjectMapper.class) Object arg0, @NUInt long arg1,
				BoolPtr arg2);
	}

	/**
	 * enumerateObjectsUsingBlock:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSOrderedSet_Class/index.html#//apple_ref/occ/instm/NSOrderedSet/enumerateObjectsUsingBlock:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("enumerateObjectsUsingBlock:")
	public native void enumerateObjectsUsingBlock(
			@ObjCBlock(name = "call_enumerateObjectsUsingBlock") Block_enumerateObjectsUsingBlock block);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_enumerateObjectsUsingBlock {
		@Generated
		void call_enumerateObjectsUsingBlock(
				@Mapped(ObjCObjectMapper.class) Object arg0, @NUInt long arg1,
				BoolPtr arg2);
	}

	/**
	 * enumerateObjectsWithOptions:usingBlock:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSOrderedSet_Class/index.html#//apple_ref/occ/instm/NSOrderedSet/enumerateObjectsWithOptions:usingBlock:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("enumerateObjectsWithOptions:usingBlock:")
	public native void enumerateObjectsWithOptionsUsingBlock(
			@NUInt long opts,
			@ObjCBlock(name = "call_enumerateObjectsWithOptionsUsingBlock") Block_enumerateObjectsWithOptionsUsingBlock block);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_enumerateObjectsWithOptionsUsingBlock {
		@Generated
		void call_enumerateObjectsWithOptionsUsingBlock(
				@Mapped(ObjCObjectMapper.class) Object arg0, @NUInt long arg1,
				BoolPtr arg2);
	}

	/**
	 * filteredOrderedSetUsingPredicate:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSOrderedSet_Class/index.html#//apple_ref/occ/instm/NSOrderedSet/filteredOrderedSetUsingPredicate:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("filteredOrderedSetUsingPredicate:")
	public native NSOrderedSet<_ObjectType> filteredOrderedSetUsingPredicate(NSPredicate p);

	/**
	 * firstObject</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSOrderedSet_Class/index.html#//apple_ref/occ/instp/NSOrderedSet/firstObject">iOS Dev Center</a>
	 */
	@MappedReturn(ObjCObjectMapper.class)
	@Generated
	@Selector("firstObject")
	public native _ObjectType firstObject();

	/**
	 * getObjects:range:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSOrderedSet_Class/index.html#//apple_ref/occ/instm/NSOrderedSet/getObjects:range:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("getObjects:range:")
	public native void getObjectsRange(Ptr<ObjCObject> objects,
			@ByValue NSRange range);

	/**
	 * indexOfObject:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSOrderedSet_Class/index.html#//apple_ref/occ/instm/NSOrderedSet/indexOfObject:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("indexOfObject:")
	@NUInt
	public native long indexOfObject(
			@Mapped(ObjCObjectMapper.class) _ObjectType object);

	/**
	 * indexOfObject:inSortedRange:options:usingComparator:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSOrderedSet_Class/index.html#//apple_ref/occ/instm/NSOrderedSet/indexOfObject:inSortedRange:options:usingComparator:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("indexOfObject:inSortedRange:options:usingComparator:")
	@NUInt
	public native long indexOfObjectInSortedRangeOptionsUsingComparator(
			@Mapped(ObjCObjectMapper.class) _ObjectType object,
			@ByValue NSRange range,
			@NUInt long opts,
			@ObjCBlock(name = "call_indexOfObjectInSortedRangeOptionsUsingComparator") Block_indexOfObjectInSortedRangeOptionsUsingComparator cmp);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_indexOfObjectInSortedRangeOptionsUsingComparator {
		@Generated
		@NInt
		long call_indexOfObjectInSortedRangeOptionsUsingComparator(
				@Mapped(ObjCObjectMapper.class) Object arg0,
				@Mapped(ObjCObjectMapper.class) Object arg1);
	}

	/**
	 * indexOfObjectAtIndexes:options:passingTest:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSOrderedSet_Class/index.html#//apple_ref/occ/instm/NSOrderedSet/indexOfObjectAtIndexes:options:passingTest:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("indexOfObjectAtIndexes:options:passingTest:")
	@NUInt
	public native long indexOfObjectAtIndexesOptionsPassingTest(
			NSIndexSet s,
			@NUInt long opts,
			@ObjCBlock(name = "call_indexOfObjectAtIndexesOptionsPassingTest") Block_indexOfObjectAtIndexesOptionsPassingTest predicate);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_indexOfObjectAtIndexesOptionsPassingTest {
		@Generated
		boolean call_indexOfObjectAtIndexesOptionsPassingTest(
				@Mapped(ObjCObjectMapper.class) Object arg0, @NUInt long arg1,
				BoolPtr arg2);
	}

	/**
	 * indexOfObjectPassingTest:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSOrderedSet_Class/index.html#//apple_ref/occ/instm/NSOrderedSet/indexOfObjectPassingTest:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("indexOfObjectPassingTest:")
	@NUInt
	public native long indexOfObjectPassingTest(
			@ObjCBlock(name = "call_indexOfObjectPassingTest") Block_indexOfObjectPassingTest predicate);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_indexOfObjectPassingTest {
		@Generated
		boolean call_indexOfObjectPassingTest(
				@Mapped(ObjCObjectMapper.class) Object arg0, @NUInt long arg1,
				BoolPtr arg2);
	}

	/**
	 * indexOfObjectWithOptions:passingTest:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSOrderedSet_Class/index.html#//apple_ref/occ/instm/NSOrderedSet/indexOfObjectWithOptions:passingTest:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("indexOfObjectWithOptions:passingTest:")
	@NUInt
	public native long indexOfObjectWithOptionsPassingTest(
			@NUInt long opts,
			@ObjCBlock(name = "call_indexOfObjectWithOptionsPassingTest") Block_indexOfObjectWithOptionsPassingTest predicate);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_indexOfObjectWithOptionsPassingTest {
		@Generated
		boolean call_indexOfObjectWithOptionsPassingTest(
				@Mapped(ObjCObjectMapper.class) Object arg0, @NUInt long arg1,
				BoolPtr arg2);
	}

	/**
	 * indexesOfObjectsAtIndexes:options:passingTest:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSOrderedSet_Class/index.html#//apple_ref/occ/instm/NSOrderedSet/indexesOfObjectsAtIndexes:options:passingTest:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("indexesOfObjectsAtIndexes:options:passingTest:")
	public native NSIndexSet indexesOfObjectsAtIndexesOptionsPassingTest(
			NSIndexSet s,
			@NUInt long opts,
			@ObjCBlock(name = "call_indexesOfObjectsAtIndexesOptionsPassingTest") Block_indexesOfObjectsAtIndexesOptionsPassingTest predicate);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_indexesOfObjectsAtIndexesOptionsPassingTest {
		@Generated
		boolean call_indexesOfObjectsAtIndexesOptionsPassingTest(
				@Mapped(ObjCObjectMapper.class) Object arg0, @NUInt long arg1,
				BoolPtr arg2);
	}

	/**
	 * indexesOfObjectsPassingTest:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSOrderedSet_Class/index.html#//apple_ref/occ/instm/NSOrderedSet/indexesOfObjectsPassingTest:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("indexesOfObjectsPassingTest:")
	public native NSIndexSet indexesOfObjectsPassingTest(
			@ObjCBlock(name = "call_indexesOfObjectsPassingTest") Block_indexesOfObjectsPassingTest predicate);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_indexesOfObjectsPassingTest {
		@Generated
		boolean call_indexesOfObjectsPassingTest(
				@Mapped(ObjCObjectMapper.class) Object arg0, @NUInt long arg1,
				BoolPtr arg2);
	}

	/**
	 * indexesOfObjectsWithOptions:passingTest:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSOrderedSet_Class/index.html#//apple_ref/occ/instm/NSOrderedSet/indexesOfObjectsWithOptions:passingTest:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("indexesOfObjectsWithOptions:passingTest:")
	public native NSIndexSet indexesOfObjectsWithOptionsPassingTest(
			@NUInt long opts,
			@ObjCBlock(name = "call_indexesOfObjectsWithOptionsPassingTest") Block_indexesOfObjectsWithOptionsPassingTest predicate);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_indexesOfObjectsWithOptionsPassingTest {
		@Generated
		boolean call_indexesOfObjectsWithOptionsPassingTest(
				@Mapped(ObjCObjectMapper.class) Object arg0, @NUInt long arg1,
				BoolPtr arg2);
	}

	/**
	 * init</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSOrderedSet_Class/index.html#//apple_ref/occ/instm/NSOrderedSet/init">iOS Dev Center</a>
	 */
	@Generated
	@Selector("init")
	public native NSOrderedSet<?> init();

	/**
	 * initWithArray:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSOrderedSet_Class/index.html#//apple_ref/occ/instm/NSOrderedSet/initWithArray:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("initWithArray:")
	public native NSOrderedSet<?> initWithArray(NSArray<_ObjectType> array);

	/**
	 * initWithArray:copyItems:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSOrderedSet_Class/index.html#//apple_ref/occ/instm/NSOrderedSet/initWithArray:copyItems:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("initWithArray:copyItems:")
	public native NSOrderedSet<?> initWithArrayCopyItems(NSArray<_ObjectType> set, boolean flag);

	/**
	 * initWithArray:range:copyItems:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSOrderedSet_Class/index.html#//apple_ref/occ/instm/NSOrderedSet/initWithArray:range:copyItems:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("initWithArray:range:copyItems:")
	public native NSOrderedSet<?> initWithArrayRangeCopyItems(NSArray<_ObjectType> set,
			@ByValue NSRange range, boolean flag);

	@Generated
	@Selector("initWithCoder:")
	public native NSOrderedSet<?> initWithCoder(NSCoder aDecoder);

	/**
	 * initWithObject:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSOrderedSet_Class/index.html#//apple_ref/occ/instm/NSOrderedSet/initWithObject:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("initWithObject:")
	public native NSOrderedSet<?> initWithObject(
			@Mapped(ObjCObjectMapper.class) _ObjectType object);

	/**
	 * initWithObjects:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSOrderedSet_Class/index.html#//apple_ref/occ/instm/NSOrderedSet/initWithObjects:">iOS Dev Center</a>
	 */
	@Generated
	@Variadic()
	@Selector("initWithObjects:")
	public native NSOrderedSet<?> initWithObjects(
			@Mapped(ObjCObjectMapper.class) _ObjectType firstObj, Object... varargs);

	/**
	 * initWithObjects:count:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSOrderedSet_Class/index.html#//apple_ref/occ/instm/NSOrderedSet/initWithObjects:count:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("initWithObjects:count:")
	public native NSOrderedSet<?> initWithObjectsCount(
			ConstPtr<_ObjectType> objects, @NUInt long cnt);

	/**
	 * initWithOrderedSet:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSOrderedSet_Class/index.html#//apple_ref/occ/instm/NSOrderedSet/initWithOrderedSet:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("initWithOrderedSet:")
	public native NSOrderedSet<?> initWithOrderedSet(NSOrderedSet<_ObjectType> set);

	/**
	 * initWithOrderedSet:copyItems:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSOrderedSet_Class/index.html#//apple_ref/occ/instm/NSOrderedSet/initWithOrderedSet:copyItems:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("initWithOrderedSet:copyItems:")
	public native NSOrderedSet<?> initWithOrderedSetCopyItems(NSOrderedSet<_ObjectType> set,
			boolean flag);

	/**
	 * initWithOrderedSet:range:copyItems:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSOrderedSet_Class/index.html#//apple_ref/occ/instm/NSOrderedSet/initWithOrderedSet:range:copyItems:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("initWithOrderedSet:range:copyItems:")
	public native NSOrderedSet<?> initWithOrderedSetRangeCopyItems(
			NSOrderedSet<_ObjectType> set, @ByValue NSRange range, boolean flag);

	/**
	 * initWithSet:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSOrderedSet_Class/index.html#//apple_ref/occ/instm/NSOrderedSet/initWithSet:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("initWithSet:")
	public native NSOrderedSet<?> initWithSet(NSSet<_ObjectType> set);

	/**
	 * initWithSet:copyItems:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSOrderedSet_Class/index.html#//apple_ref/occ/instm/NSOrderedSet/initWithSet:copyItems:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("initWithSet:copyItems:")
	public native NSOrderedSet<?> initWithSetCopyItems(NSSet<_ObjectType> set, boolean flag);

	/**
	 * intersectsOrderedSet:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSOrderedSet_Class/index.html#//apple_ref/occ/instm/NSOrderedSet/intersectsOrderedSet:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("intersectsOrderedSet:")
	public native boolean intersectsOrderedSet(NSOrderedSet<_ObjectType> other);

	/**
	 * intersectsSet:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSOrderedSet_Class/index.html#//apple_ref/occ/instm/NSOrderedSet/intersectsSet:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("intersectsSet:")
	public native boolean intersectsSet(NSSet<_ObjectType> set);

	/**
	 * isEqualToOrderedSet:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSOrderedSet_Class/index.html#//apple_ref/occ/instm/NSOrderedSet/isEqualToOrderedSet:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("isEqualToOrderedSet:")
	public native boolean isEqualToOrderedSet(NSOrderedSet<_ObjectType> other);

	/**
	 * isSubsetOfOrderedSet:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSOrderedSet_Class/index.html#//apple_ref/occ/instm/NSOrderedSet/isSubsetOfOrderedSet:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("isSubsetOfOrderedSet:")
	public native boolean isSubsetOfOrderedSet(NSOrderedSet<_ObjectType> other);

	/**
	 * isSubsetOfSet:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSOrderedSet_Class/index.html#//apple_ref/occ/instm/NSOrderedSet/isSubsetOfSet:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("isSubsetOfSet:")
	public native boolean isSubsetOfSet(NSSet<_ObjectType> set);

	/**
	 * lastObject</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSOrderedSet_Class/index.html#//apple_ref/occ/instp/NSOrderedSet/lastObject">iOS Dev Center</a>
	 */
	@MappedReturn(ObjCObjectMapper.class)
	@Generated
	@Selector("lastObject")
	public native _ObjectType lastObject();

	@Generated
	@Selector("mutableCopyWithZone:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object mutableCopyWithZone(VoidPtr zone);

	/**
	 * objectAtIndex:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSOrderedSet_Class/index.html#//apple_ref/occ/instm/NSOrderedSet/objectAtIndex:">iOS Dev Center</a>
	 */
	@MappedReturn(ObjCObjectMapper.class)
	@Generated
	@Selector("objectAtIndex:")
	public native _ObjectType objectAtIndex(@NUInt long idx);

	/**
	 * objectAtIndexedSubscript:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSOrderedSet_Class/index.html#//apple_ref/occ/instm/NSOrderedSet/objectAtIndexedSubscript:">iOS Dev Center</a>
	 */
	@MappedReturn(ObjCObjectMapper.class)
	@Generated
	@Selector("objectAtIndexedSubscript:")
	public native _ObjectType objectAtIndexedSubscript(@NUInt long idx);

	/**
	 * objectEnumerator</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSOrderedSet_Class/index.html#//apple_ref/occ/instm/NSOrderedSet/objectEnumerator">iOS Dev Center</a>
	 */
	@Generated
	@Selector("objectEnumerator")
	public native NSEnumerator<_ObjectType> objectEnumerator();

	/**
	 * objectsAtIndexes:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSOrderedSet_Class/index.html#//apple_ref/occ/instm/NSOrderedSet/objectsAtIndexes:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("objectsAtIndexes:")
	public native NSArray<_ObjectType> objectsAtIndexes(NSIndexSet indexes);

	/**
	 * orderedSet</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSOrderedSet_Class/index.html#//apple_ref/occ/clm/NSOrderedSet/orderedSet">iOS Dev Center</a>
	 */
	@Generated
	@Selector("orderedSet")
	public static native <_ObjectType> NSOrderedSet<?> orderedSet();

	/**
	 * orderedSetWithArray:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSOrderedSet_Class/index.html#//apple_ref/occ/clm/NSOrderedSet/orderedSetWithArray:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("orderedSetWithArray:")
	public static native <_ObjectType> NSOrderedSet<?> orderedSetWithArray(NSArray<_ObjectType> array);

	/**
	 * orderedSetWithArray:range:copyItems:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSOrderedSet_Class/index.html#//apple_ref/occ/clm/NSOrderedSet/orderedSetWithArray:range:copyItems:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("orderedSetWithArray:range:copyItems:")
	public static native <_ObjectType> NSOrderedSet<?> orderedSetWithArrayRangeCopyItems(
			NSArray<_ObjectType> array, @ByValue NSRange range, boolean flag);

	/**
	 * orderedSetWithObject:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSOrderedSet_Class/index.html#//apple_ref/occ/clm/NSOrderedSet/orderedSetWithObject:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("orderedSetWithObject:")
	public static native <_ObjectType> NSOrderedSet<?> orderedSetWithObject(
			@Mapped(ObjCObjectMapper.class) _ObjectType object);

	/**
	 * orderedSetWithObjects:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSOrderedSet_Class/index.html#//apple_ref/occ/clm/NSOrderedSet/orderedSetWithObjects:">iOS Dev Center</a>
	 */
	@Generated
	@Variadic()
	@Selector("orderedSetWithObjects:")
	public static native <_ObjectType> NSOrderedSet<?> orderedSetWithObjects(
			@Mapped(ObjCObjectMapper.class) _ObjectType firstObj, Object... varargs);

	/**
	 * orderedSetWithObjects:count:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSOrderedSet_Class/index.html#//apple_ref/occ/clm/NSOrderedSet/orderedSetWithObjects:count:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("orderedSetWithObjects:count:")
	public static native <_ObjectType> NSOrderedSet<?> orderedSetWithObjectsCount(
			ConstPtr<_ObjectType> objects, @NUInt long cnt);

	/**
	 * orderedSetWithOrderedSet:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSOrderedSet_Class/index.html#//apple_ref/occ/clm/NSOrderedSet/orderedSetWithOrderedSet:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("orderedSetWithOrderedSet:")
	public static native <_ObjectType> NSOrderedSet<?> orderedSetWithOrderedSet(NSOrderedSet<_ObjectType> set);

	/**
	 * orderedSetWithOrderedSet:range:copyItems:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSOrderedSet_Class/index.html#//apple_ref/occ/clm/NSOrderedSet/orderedSetWithOrderedSet:range:copyItems:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("orderedSetWithOrderedSet:range:copyItems:")
	public static native <_ObjectType> NSOrderedSet<?> orderedSetWithOrderedSetRangeCopyItems(
			NSOrderedSet<_ObjectType> set, @ByValue NSRange range, boolean flag);

	/**
	 * orderedSetWithSet:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSOrderedSet_Class/index.html#//apple_ref/occ/clm/NSOrderedSet/orderedSetWithSet:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("orderedSetWithSet:")
	public static native <_ObjectType> NSOrderedSet<?> orderedSetWithSet(NSSet<_ObjectType> set);

	/**
	 * orderedSetWithSet:copyItems:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSOrderedSet_Class/index.html#//apple_ref/occ/clm/NSOrderedSet/orderedSetWithSet:copyItems:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("orderedSetWithSet:copyItems:")
	public static native <_ObjectType> NSOrderedSet<?> orderedSetWithSetCopyItems(NSSet<_ObjectType> set,
			boolean flag);

	/**
	 * removeObserver:forKeyPath:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSOrderedSet_Class/index.html#//apple_ref/occ/instm/NSOrderedSet/removeObserver:forKeyPath:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("removeObserver:forKeyPath:")
	public native void removeObserverForKeyPath(NSObject observer,
			String keyPath);

	/**
	 * removeObserver:forKeyPath:context:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSOrderedSet_Class/index.html#//apple_ref/occ/instm/NSOrderedSet/removeObserver:forKeyPath:context:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("removeObserver:forKeyPath:context:")
	public native void removeObserverForKeyPathContext(NSObject observer,
			String keyPath, VoidPtr context);

	/**
	 * reverseObjectEnumerator</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSOrderedSet_Class/index.html#//apple_ref/occ/instm/NSOrderedSet/reverseObjectEnumerator">iOS Dev Center</a>
	 */
	@Generated
	@Selector("reverseObjectEnumerator")
	public native NSEnumerator<_ObjectType> reverseObjectEnumerator();

	/**
	 * reversedOrderedSet</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSOrderedSet_Class/index.html#//apple_ref/occ/instp/NSOrderedSet/reversedOrderedSet">iOS Dev Center</a>
	 */
	@Generated
	@Selector("reversedOrderedSet")
	public native NSOrderedSet<_ObjectType> reversedOrderedSet();

	/**
	 * set</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSOrderedSet_Class/index.html#//apple_ref/occ/instp/NSOrderedSet/set">iOS Dev Center</a>
	 */
	@Generated
	@Selector("set")
	public native NSSet<_ObjectType> set();

	/**
	 * setValue:forKey:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSOrderedSet_Class/index.html#//apple_ref/occ/instm/NSOrderedSet/setValue:forKey:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setValue:forKey:")
	public native void setValueForKey(
			@Mapped(ObjCObjectMapper.class) Object value, String key);

	/**
	 * sortedArrayUsingComparator:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSOrderedSet_Class/index.html#//apple_ref/occ/instm/NSOrderedSet/sortedArrayUsingComparator:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("sortedArrayUsingComparator:")
	public native NSArray<_ObjectType> sortedArrayUsingComparator(
			@ObjCBlock(name = "call_sortedArrayUsingComparator") Block_sortedArrayUsingComparator cmptr);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_sortedArrayUsingComparator {
		@Generated
		@NInt
		long call_sortedArrayUsingComparator(
				@Mapped(ObjCObjectMapper.class) Object arg0,
				@Mapped(ObjCObjectMapper.class) Object arg1);
	}

	/**
	 * sortedArrayUsingDescriptors:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSOrderedSet_Class/index.html#//apple_ref/occ/instm/NSOrderedSet/sortedArrayUsingDescriptors:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("sortedArrayUsingDescriptors:")
	public native NSArray<_ObjectType> sortedArrayUsingDescriptors(NSArray<? extends NSSortDescriptor> sortDescriptors);

	/**
	 * sortedArrayWithOptions:usingComparator:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSOrderedSet_Class/index.html#//apple_ref/occ/instm/NSOrderedSet/sortedArrayWithOptions:usingComparator:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("sortedArrayWithOptions:usingComparator:")
	public native NSArray<_ObjectType> sortedArrayWithOptionsUsingComparator(
			@NUInt long opts,
			@ObjCBlock(name = "call_sortedArrayWithOptionsUsingComparator") Block_sortedArrayWithOptionsUsingComparator cmptr);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_sortedArrayWithOptionsUsingComparator {
		@Generated
		@NInt
		long call_sortedArrayWithOptionsUsingComparator(
				@Mapped(ObjCObjectMapper.class) Object arg0,
				@Mapped(ObjCObjectMapper.class) Object arg1);
	}

	@Generated
	@Selector("supportsSecureCoding")
	public static native <_ObjectType> boolean supportsSecureCoding();

	@Generated
	@ProtocolClassMethod("supportsSecureCoding")
	public boolean _supportsSecureCoding() {
		return supportsSecureCoding();
	}

	/**
	 * valueForKey:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSOrderedSet_Class/index.html#//apple_ref/occ/instm/NSOrderedSet/valueForKey:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("valueForKey:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object valueForKey(String key);

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
	@Selector("version")
	@NInt
	public static native long version_static();
}

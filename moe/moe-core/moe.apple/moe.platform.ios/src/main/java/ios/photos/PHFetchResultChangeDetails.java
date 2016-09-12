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

package ios.photos;


import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;

import ios.NSObject;
import ios.foundation.NSArray;
import ios.foundation.NSIndexSet;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.map.ObjCObjectMapper;
import ios.foundation.NSMethodSignature;
import ios.foundation.NSSet;

@Generated
@Library("Photos")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class PHFetchResultChangeDetails extends NSObject {
	static {
		NatJ.register();
	}

	@Generated
	protected PHFetchResultChangeDetails(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native PHFetchResultChangeDetails alloc();

	/**
	 * changeDetailsFromFetchResult:toFetchResult:changedObjects:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Photos/Reference/PHFetchResultChangeDetails_Class/index.html#//apple_ref/occ/clm/PHFetchResultChangeDetails/changeDetailsFromFetchResult:toFetchResult:changedObjects:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("changeDetailsFromFetchResult:toFetchResult:changedObjects:")
	public static native PHFetchResultChangeDetails changeDetailsFromFetchResultToFetchResultChangedObjects(
			PHFetchResult<?> fromResult, PHFetchResult<?> toResult,
			NSArray<? extends PHObject> changedObjects);

	/**
	 * changedIndexes</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Photos/Reference/PHFetchResultChangeDetails_Class/index.html#//apple_ref/occ/instp/PHFetchResultChangeDetails/changedIndexes">iOS Dev Center</a>
	 */
	@Generated
	@Selector("changedIndexes")
	public native NSIndexSet changedIndexes();

	/**
	 * changedObjects</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Photos/Reference/PHFetchResultChangeDetails_Class/index.html#//apple_ref/occ/instp/PHFetchResultChangeDetails/changedObjects">iOS Dev Center</a>
	 */
	@Generated
	@Selector("changedObjects")
	public native NSArray<? extends PHObject> changedObjects();

	/**
	 * enumerateMovesWithBlock:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Photos/Reference/PHFetchResultChangeDetails_Class/index.html#//apple_ref/occ/instm/PHFetchResultChangeDetails/enumerateMovesWithBlock:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("enumerateMovesWithBlock:")
	public native void enumerateMovesWithBlock(
			@ObjCBlock(name = "call_enumerateMovesWithBlock") Block_enumerateMovesWithBlock handler);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_enumerateMovesWithBlock {
		@Generated
		void call_enumerateMovesWithBlock(@NUInt long arg0,
				@NUInt long arg1);
	}

	/**
	 * fetchResultAfterChanges</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Photos/Reference/PHFetchResultChangeDetails_Class/index.html#//apple_ref/occ/instp/PHFetchResultChangeDetails/fetchResultAfterChanges">iOS Dev Center</a>
	 */
	@Generated
	@Selector("fetchResultAfterChanges")
	public native PHFetchResult<?> fetchResultAfterChanges();

	/**
	 * fetchResultBeforeChanges</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Photos/Reference/PHFetchResultChangeDetails_Class/index.html#//apple_ref/occ/instp/PHFetchResultChangeDetails/fetchResultBeforeChanges">iOS Dev Center</a>
	 */
	@Generated
	@Selector("fetchResultBeforeChanges")
	public native PHFetchResult<?> fetchResultBeforeChanges();

	/**
	 * hasIncrementalChanges</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Photos/Reference/PHFetchResultChangeDetails_Class/index.html#//apple_ref/occ/instp/PHFetchResultChangeDetails/hasIncrementalChanges">iOS Dev Center</a>
	 */
	@Generated
	@Selector("hasIncrementalChanges")
	public native boolean hasIncrementalChanges();

	/**
	 * hasMoves</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Photos/Reference/PHFetchResultChangeDetails_Class/index.html#//apple_ref/occ/instp/PHFetchResultChangeDetails/hasMoves">iOS Dev Center</a>
	 */
	@Generated
	@Selector("hasMoves")
	public native boolean hasMoves();

	@Generated
	@Selector("init")
	public native PHFetchResultChangeDetails init();

	/**
	 * insertedIndexes</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Photos/Reference/PHFetchResultChangeDetails_Class/index.html#//apple_ref/occ/instp/PHFetchResultChangeDetails/insertedIndexes">iOS Dev Center</a>
	 */
	@Generated
	@Selector("insertedIndexes")
	public native NSIndexSet insertedIndexes();

	/**
	 * insertedObjects</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Photos/Reference/PHFetchResultChangeDetails_Class/index.html#//apple_ref/occ/instp/PHFetchResultChangeDetails/insertedObjects">iOS Dev Center</a>
	 */
	@Generated
	@Selector("insertedObjects")
	public native NSArray<? extends PHObject> insertedObjects();

	/**
	 * removedIndexes</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Photos/Reference/PHFetchResultChangeDetails_Class/index.html#//apple_ref/occ/instp/PHFetchResultChangeDetails/removedIndexes">iOS Dev Center</a>
	 */
	@Generated
	@Selector("removedIndexes")
	public native NSIndexSet removedIndexes();

	/**
	 * removedObjects</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Photos/Reference/PHFetchResultChangeDetails_Class/index.html#//apple_ref/occ/instp/PHFetchResultChangeDetails/removedObjects">iOS Dev Center</a>
	 */
	@Generated
	@Selector("removedObjects")
	public native NSArray<? extends PHObject> removedObjects();

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
	public static native void setVersion(@NInt long aVersion);

	@Generated
	@Selector("superclass")
	public static native Class superclass_static();

	@Generated
	@Selector("version")
	@NInt
	public static native long version_static();
}

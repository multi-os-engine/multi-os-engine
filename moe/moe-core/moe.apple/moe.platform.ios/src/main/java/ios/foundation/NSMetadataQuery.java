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


import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.BoolPtr;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

import ios.NSObject;
import ios.foundation.protocol.NSMetadataQueryDelegate;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.SEL;

@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSMetadataQuery extends NSObject {
	static {
		NatJ.register();
	}

	@Generated
	protected NSMetadataQuery(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSMetadataQuery alloc();

	/**
	 * delegate</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSMetadataQuery_Class/index.html#//apple_ref/occ/instp/NSMetadataQuery/delegate">iOS Dev Center</a>
	 */
	@Generated
	@Selector("delegate")
	@MappedReturn(ObjCObjectMapper.class)
	public native NSMetadataQueryDelegate delegate();

	/**
	 * disableUpdates</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSMetadataQuery_Class/index.html#//apple_ref/occ/instm/NSMetadataQuery/disableUpdates">iOS Dev Center</a>
	 */
	@Generated
	@Selector("disableUpdates")
	public native void disableUpdates();

	/**
	 * enableUpdates</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSMetadataQuery_Class/index.html#//apple_ref/occ/instm/NSMetadataQuery/enableUpdates">iOS Dev Center</a>
	 */
	@Generated
	@Selector("enableUpdates")
	public native void enableUpdates();

	/**
	 * enumerateResultsUsingBlock:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSMetadataQuery_Class/index.html#//apple_ref/occ/instm/NSMetadataQuery/enumerateResultsUsingBlock:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("enumerateResultsUsingBlock:")
	public native void enumerateResultsUsingBlock(
			@ObjCBlock(name = "call_enumerateResultsUsingBlock") Block_enumerateResultsUsingBlock block);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_enumerateResultsUsingBlock {
		@Generated
		void call_enumerateResultsUsingBlock(
				@Mapped(ObjCObjectMapper.class) Object arg0, @NUInt long arg1,
				BoolPtr arg2);
	}

	/**
	 * enumerateResultsWithOptions:usingBlock:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSMetadataQuery_Class/index.html#//apple_ref/occ/instm/NSMetadataQuery/enumerateResultsWithOptions:usingBlock:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("enumerateResultsWithOptions:usingBlock:")
	public native void enumerateResultsWithOptionsUsingBlock(
			@NUInt long opts,
			@ObjCBlock(name = "call_enumerateResultsWithOptionsUsingBlock") Block_enumerateResultsWithOptionsUsingBlock block);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_enumerateResultsWithOptionsUsingBlock {
		@Generated
		void call_enumerateResultsWithOptionsUsingBlock(
				@Mapped(ObjCObjectMapper.class) Object arg0, @NUInt long arg1,
				BoolPtr arg2);
	}

	/**
	 * groupedResults</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSMetadataQuery_Class/index.html#//apple_ref/occ/instp/NSMetadataQuery/groupedResults">iOS Dev Center</a>
	 */
	@Generated
	@Selector("groupedResults")
	public native NSArray<? extends NSMetadataQueryResultGroup> groupedResults();

	/**
	 * groupingAttributes</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSMetadataQuery_Class/index.html#//apple_ref/occ/instp/NSMetadataQuery/groupingAttributes">iOS Dev Center</a>
	 */
	@Generated
	@Selector("groupingAttributes")
	public native NSArray<String> groupingAttributes();

	/**
	 * indexOfResult:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSMetadataQuery_Class/index.html#//apple_ref/occ/instm/NSMetadataQuery/indexOfResult:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("indexOfResult:")
	@NUInt
	public native long indexOfResult(
			@Mapped(ObjCObjectMapper.class) Object result);

	@Generated
	@Selector("init")
	public native NSMetadataQuery init();

	/**
	 * gathering</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSMetadataQuery_Class/index.html#//apple_ref/occ/instp/NSMetadataQuery/gathering">iOS Dev Center</a>
	 */
	@Generated
	@Selector("isGathering")
	public native boolean isGathering();

	/**
	 * started</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSMetadataQuery_Class/index.html#//apple_ref/occ/instp/NSMetadataQuery/started">iOS Dev Center</a>
	 */
	@Generated
	@Selector("isStarted")
	public native boolean isStarted();

	/**
	 * stopped</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSMetadataQuery_Class/index.html#//apple_ref/occ/instp/NSMetadataQuery/stopped">iOS Dev Center</a>
	 */
	@Generated
	@Selector("isStopped")
	public native boolean isStopped();

	/**
	 * notificationBatchingInterval</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSMetadataQuery_Class/index.html#//apple_ref/occ/instp/NSMetadataQuery/notificationBatchingInterval">iOS Dev Center</a>
	 */
	@Generated
	@Selector("notificationBatchingInterval")
	public native double notificationBatchingInterval();

	/**
	 * operationQueue</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSMetadataQuery_Class/index.html#//apple_ref/occ/instp/NSMetadataQuery/operationQueue">iOS Dev Center</a>
	 */
	@Generated
	@Selector("operationQueue")
	public native NSOperationQueue operationQueue();

	/**
	 * predicate</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSMetadataQuery_Class/index.html#//apple_ref/occ/instp/NSMetadataQuery/predicate">iOS Dev Center</a>
	 */
	@Generated
	@Selector("predicate")
	public native NSPredicate predicate();

	/**
	 * resultAtIndex:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSMetadataQuery_Class/index.html#//apple_ref/occ/instm/NSMetadataQuery/resultAtIndex:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("resultAtIndex:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object resultAtIndex(@NUInt long idx);

	/**
	 * resultCount</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSMetadataQuery_Class/index.html#//apple_ref/occ/instp/NSMetadataQuery/resultCount">iOS Dev Center</a>
	 */
	@Generated
	@Selector("resultCount")
	@NUInt
	public native long resultCount();

	/**
	 * results</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSMetadataQuery_Class/index.html#//apple_ref/occ/instp/NSMetadataQuery/results">iOS Dev Center</a>
	 */
	@Generated
	@Selector("results")
	public native NSArray<?> results();

	/**
	 * searchItems</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSMetadataQuery_Class/index.html#//apple_ref/occ/instp/NSMetadataQuery/searchItems">iOS Dev Center</a>
	 */
	@Generated
	@Selector("searchItems")
	public native NSArray<?> searchItems();

	/**
	 * searchScopes</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSMetadataQuery_Class/index.html#//apple_ref/occ/instp/NSMetadataQuery/searchScopes">iOS Dev Center</a>
	 */
	@Generated
	@Selector("searchScopes")
	public native NSArray<?> searchScopes();

	/**
	 * delegate</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSMetadataQuery_Class/index.html#//apple_ref/occ/instp/NSMetadataQuery/delegate">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setDelegate:")
	public native void setDelegate_unsafe(
			@Mapped(ObjCObjectMapper.class) NSMetadataQueryDelegate value);

	/**
	 * delegate</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSMetadataQuery_Class/index.html#//apple_ref/occ/instp/NSMetadataQuery/delegate">iOS Dev Center</a>
	 */
	@Generated
	public void setDelegate(@Mapped(ObjCObjectMapper.class) NSMetadataQueryDelegate value) {
		Object __old = delegate();
		if (value != null) {
			org.moe.natj.objc.ObjCRuntime.associateObjCObject(this, value);
		}
		setDelegate_unsafe(value);
		if (__old != null) {
			org.moe.natj.objc.ObjCRuntime.dissociateObjCObject(this, __old);
		}
	}

	/**
	 * groupingAttributes</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSMetadataQuery_Class/index.html#//apple_ref/occ/instp/NSMetadataQuery/groupingAttributes">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setGroupingAttributes:")
	public native void setGroupingAttributes(NSArray<String> value);

	/**
	 * notificationBatchingInterval</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSMetadataQuery_Class/index.html#//apple_ref/occ/instp/NSMetadataQuery/notificationBatchingInterval">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setNotificationBatchingInterval:")
	public native void setNotificationBatchingInterval(double value);

	/**
	 * operationQueue</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSMetadataQuery_Class/index.html#//apple_ref/occ/instp/NSMetadataQuery/operationQueue">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setOperationQueue:")
	public native void setOperationQueue(NSOperationQueue value);

	/**
	 * predicate</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSMetadataQuery_Class/index.html#//apple_ref/occ/instp/NSMetadataQuery/predicate">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setPredicate:")
	public native void setPredicate(NSPredicate value);

	/**
	 * searchItems</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSMetadataQuery_Class/index.html#//apple_ref/occ/instp/NSMetadataQuery/searchItems">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setSearchItems:")
	public native void setSearchItems(NSArray<?> value);

	/**
	 * searchScopes</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSMetadataQuery_Class/index.html#//apple_ref/occ/instp/NSMetadataQuery/searchScopes">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setSearchScopes:")
	public native void setSearchScopes(NSArray<?> value);

	/**
	 * sortDescriptors</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSMetadataQuery_Class/index.html#//apple_ref/occ/instp/NSMetadataQuery/sortDescriptors">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setSortDescriptors:")
	public native void setSortDescriptors(NSArray<? extends NSSortDescriptor> value);

	/**
	 * valueListAttributes</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSMetadataQuery_Class/index.html#//apple_ref/occ/instp/NSMetadataQuery/valueListAttributes">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setValueListAttributes:")
	public native void setValueListAttributes(NSArray<String> value);

	/**
	 * sortDescriptors</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSMetadataQuery_Class/index.html#//apple_ref/occ/instp/NSMetadataQuery/sortDescriptors">iOS Dev Center</a>
	 */
	@Generated
	@Selector("sortDescriptors")
	public native NSArray<? extends NSSortDescriptor> sortDescriptors();

	/**
	 * startQuery</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSMetadataQuery_Class/index.html#//apple_ref/occ/instm/NSMetadataQuery/startQuery">iOS Dev Center</a>
	 */
	@Generated
	@Selector("startQuery")
	public native boolean startQuery();

	/**
	 * stopQuery</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSMetadataQuery_Class/index.html#//apple_ref/occ/instm/NSMetadataQuery/stopQuery">iOS Dev Center</a>
	 */
	@Generated
	@Selector("stopQuery")
	public native void stopQuery();

	/**
	 * valueListAttributes</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSMetadataQuery_Class/index.html#//apple_ref/occ/instp/NSMetadataQuery/valueListAttributes">iOS Dev Center</a>
	 */
	@Generated
	@Selector("valueListAttributes")
	public native NSArray<String> valueListAttributes();

	/**
	 * valueLists</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSMetadataQuery_Class/index.html#//apple_ref/occ/instp/NSMetadataQuery/valueLists">iOS Dev Center</a>
	 */
	@Generated
	@Selector("valueLists")
	public native NSDictionary<String, ? extends NSArray<? extends NSMetadataQueryAttributeValueTuple>> valueLists();

	/**
	 * valueOfAttribute:forResultAtIndex:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSMetadataQuery_Class/index.html#//apple_ref/occ/instm/NSMetadataQuery/valueOfAttribute:forResultAtIndex:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("valueOfAttribute:forResultAtIndex:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object valueOfAttributeForResultAtIndex(String attrName,
			@NUInt long idx);

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

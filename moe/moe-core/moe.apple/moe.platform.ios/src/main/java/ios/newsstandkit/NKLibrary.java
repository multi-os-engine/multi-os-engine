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

package ios.newsstandkit;


import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;

import ios.NSObject;
import ios.foundation.NSArray;
import ios.foundation.NSDate;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.map.ObjCObjectMapper;
import ios.foundation.NSMethodSignature;
import ios.foundation.NSSet;

@Generated
@Library("NewsstandKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NKLibrary extends NSObject {
	static {
		NatJ.register();
	}

	@Generated
	protected NKLibrary(Pointer peer) {
		super(peer);
	}

	/**
	 * addIssueWithName:date:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/StoreKit/Reference/NKLibrary_Class/index.html#//apple_ref/occ/instm/NKLibrary/addIssueWithName:date:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("addIssueWithName:date:")
	public native NKIssue addIssueWithNameDate(String name, NSDate date);

	@Generated
	@Owned
	@Selector("alloc")
	public static native NKLibrary alloc();

	/**
	 * currentlyReadingIssue</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/StoreKit/Reference/NKLibrary_Class/index.html#//apple_ref/occ/instp/NKLibrary/currentlyReadingIssue">iOS Dev Center</a>
	 */
	@Generated
	@Selector("currentlyReadingIssue")
	public native NKIssue currentlyReadingIssue();

	/**
	 * downloadingAssets</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/StoreKit/Reference/NKLibrary_Class/index.html#//apple_ref/occ/instp/NKLibrary/downloadingAssets">iOS Dev Center</a>
	 */
	@Generated
	@Selector("downloadingAssets")
	public native NSArray<? extends NKAssetDownload> downloadingAssets();

	@Generated
	@Selector("init")
	public native NKLibrary init();

	/**
	 * issueWithName:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/StoreKit/Reference/NKLibrary_Class/index.html#//apple_ref/occ/instm/NKLibrary/issueWithName:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("issueWithName:")
	public native NKIssue issueWithName(String name);

	/**
	 * issues</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/StoreKit/Reference/NKLibrary_Class/index.html#//apple_ref/occ/instp/NKLibrary/issues">iOS Dev Center</a>
	 */
	@Generated
	@Selector("issues")
	public native NSArray<? extends NKIssue> issues();

	/**
	 * removeIssue:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/StoreKit/Reference/NKLibrary_Class/index.html#//apple_ref/occ/instm/NKLibrary/removeIssue:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("removeIssue:")
	public native void removeIssue(NKIssue issue);

	/**
	 * currentlyReadingIssue</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/StoreKit/Reference/NKLibrary_Class/index.html#//apple_ref/occ/instp/NKLibrary/currentlyReadingIssue">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setCurrentlyReadingIssue:")
	public native void setCurrentlyReadingIssue(NKIssue value);

	/**
	 * sharedLibrary</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/StoreKit/Reference/NKLibrary_Class/index.html#//apple_ref/occ/clm/NKLibrary/sharedLibrary">iOS Dev Center</a>
	 */
	@Generated
	@Selector("sharedLibrary")
	public static native NKLibrary sharedLibrary();

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
	@Selector("version")
	@NInt
	public static native long version_static();
}

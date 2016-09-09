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

package ios.mediaplayer;


import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;

import ios.NSObject;
import ios.foundation.NSCoder;
import ios.foundation.NSDate;
import ios.foundation.protocol.NSSecureCoding;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.objc.ann.ObjCBlock;
import ios.foundation.NSArray;
import ios.foundation.NSError;
import ios.foundation.NSUUID;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.map.ObjCObjectMapper;
import ios.foundation.NSMethodSignature;
import ios.foundation.NSSet;

@Generated
@Library("MediaPlayer")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPMediaLibrary extends NSObject implements NSSecureCoding {
	static {
		NatJ.register();
	}

	@Generated
	protected MPMediaLibrary(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native MPMediaLibrary alloc();

	/**
	 * beginGeneratingLibraryChangeNotifications</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MediaPlayer/Reference/MPMediaLibrary_ClassReference/index.html#//apple_ref/occ/instm/MPMediaLibrary/beginGeneratingLibraryChangeNotifications">iOS Dev Center</a>
	 */
	@Generated
	@Selector("beginGeneratingLibraryChangeNotifications")
	public native void beginGeneratingLibraryChangeNotifications();

	/**
	 * defaultMediaLibrary</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MediaPlayer/Reference/MPMediaLibrary_ClassReference/index.html#//apple_ref/occ/clm/MPMediaLibrary/defaultMediaLibrary">iOS Dev Center</a>
	 */
	@Generated
	@Selector("defaultMediaLibrary")
	public static native MPMediaLibrary defaultMediaLibrary();

	@Generated
	@Selector("encodeWithCoder:")
	public native void encodeWithCoder(NSCoder aCoder);

	/**
	 * endGeneratingLibraryChangeNotifications</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MediaPlayer/Reference/MPMediaLibrary_ClassReference/index.html#//apple_ref/occ/instm/MPMediaLibrary/endGeneratingLibraryChangeNotifications">iOS Dev Center</a>
	 */
	@Generated
	@Selector("endGeneratingLibraryChangeNotifications")
	public native void endGeneratingLibraryChangeNotifications();

	@Generated
	@Selector("init")
	public native MPMediaLibrary init();

	@Generated
	@Selector("initWithCoder:")
	public native MPMediaLibrary initWithCoder(NSCoder aDecoder);

	/**
	 * lastModifiedDate</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MediaPlayer/Reference/MPMediaLibrary_ClassReference/index.html#//apple_ref/occ/instp/MPMediaLibrary/lastModifiedDate">iOS Dev Center</a>
	 */
	@Generated
	@Selector("lastModifiedDate")
	public native NSDate lastModifiedDate();

	@Generated
	@Selector("supportsSecureCoding")
	public static native boolean supportsSecureCoding();

	@Generated
	@ProtocolClassMethod("supportsSecureCoding")
	public boolean _supportsSecureCoding() {
		return supportsSecureCoding();
	}

	@Generated
	@Selector("addItemWithProductID:completionHandler:")
	public native void addItemWithProductIDCompletionHandler(
			String productID,
			@ObjCBlock(name = "call_addItemWithProductIDCompletionHandler") Block_addItemWithProductIDCompletionHandler completionHandler);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_addItemWithProductIDCompletionHandler {
		@Generated
		void call_addItemWithProductIDCompletionHandler(
				NSArray<? extends MPMediaEntity> arg0, NSError arg1);
	}

	@Generated
	@Selector("authorizationStatus")
	@NInt
	public static native long authorizationStatus();

	@Generated
	@Selector("getPlaylistWithUUID:creationMetadata:completionHandler:")
	public native void getPlaylistWithUUIDCreationMetadataCompletionHandler(
			NSUUID uuid,
			MPMediaPlaylistCreationMetadata creationMetadata,
			@ObjCBlock(name = "call_getPlaylistWithUUIDCreationMetadataCompletionHandler") Block_getPlaylistWithUUIDCreationMetadataCompletionHandler completionHandler);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_getPlaylistWithUUIDCreationMetadataCompletionHandler {
		@Generated
		void call_getPlaylistWithUUIDCreationMetadataCompletionHandler(
				MPMediaPlaylist arg0, NSError arg1);
	}

	@Generated
	@Selector("requestAuthorization:")
	public static native void requestAuthorization(
			@ObjCBlock(name = "call_requestAuthorization") Block_requestAuthorization handler);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_requestAuthorization {
		@Generated
		void call_requestAuthorization(@NInt long arg0);
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
	public static native void setVersion(@NInt long aVersion);

	@Generated
	@Selector("superclass")
	public static native Class superclass_static();

	@Generated
	@Selector("version")
	@NInt
	public static native long version_static();
}

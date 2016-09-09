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
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;

import ios.foundation.NSArray;
import ios.foundation.NSData;
import ios.foundation.NSNumber;
import ios.foundation.NSURL;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.map.ObjCObjectMapper;
import ios.NSObject;
import ios.foundation.NSMethodSignature;
import ios.foundation.NSSet;
import ios.foundation.protocol.NSFastEnumeration;
import ios.uikit.UIImage;

@Generated
@Library("Photos")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class PHAssetCreationRequest extends PHAssetChangeRequest {
	static {
		NatJ.register();
	}

	@Generated
	protected PHAssetCreationRequest(Pointer peer) {
		super(peer);
	}

	/**
	 * addResourceWithType:data:options:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Photos/Reference/PHAssetCreationRequest_Class/index.html#//apple_ref/occ/instm/PHAssetCreationRequest/addResourceWithType:data:options:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("addResourceWithType:data:options:")
	public native void addResourceWithTypeDataOptions(@NInt long type, NSData data,
			PHAssetResourceCreationOptions options);

	/**
	 * addResourceWithType:fileURL:options:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Photos/Reference/PHAssetCreationRequest_Class/index.html#//apple_ref/occ/instm/PHAssetCreationRequest/addResourceWithType:fileURL:options:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("addResourceWithType:fileURL:options:")
	public native void addResourceWithTypeFileURLOptions(@NInt long type, NSURL fileURL,
			PHAssetResourceCreationOptions options);

	@Generated
	@Owned
	@Selector("alloc")
	public static native PHAssetCreationRequest alloc();

	@Generated
	@Selector("changeRequestForAsset:")
	public static native PHAssetCreationRequest changeRequestForAsset(PHAsset asset);

	/**
	 * creationRequestForAsset</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Photos/Reference/PHAssetCreationRequest_Class/index.html#//apple_ref/occ/clm/PHAssetCreationRequest/creationRequestForAsset">iOS Dev Center</a>
	 */
	@Generated
	@Selector("creationRequestForAsset")
	public static native PHAssetCreationRequest creationRequestForAsset();

	@Generated
	@Selector("init")
	public native PHAssetCreationRequest init();

	/**
	 * supportsAssetResourceTypes:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Photos/Reference/PHAssetCreationRequest_Class/index.html#//apple_ref/occ/clm/PHAssetCreationRequest/supportsAssetResourceTypes:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("supportsAssetResourceTypes:")
	public static native boolean supportsAssetResourceTypes(NSArray<? extends NSNumber> types);

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
	@Selector("creationRequestForAssetFromImage:")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object creationRequestForAssetFromImage(UIImage image);

	@Generated
	@Selector("creationRequestForAssetFromImageAtFileURL:")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object creationRequestForAssetFromImageAtFileURL(
			NSURL fileURL);

	@Generated
	@Selector("creationRequestForAssetFromVideoAtFileURL:")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object creationRequestForAssetFromVideoAtFileURL(
			NSURL fileURL);

	@Generated
	@Selector("debugDescription")
	public static native String debugDescription_static();

	@Generated
	@Selector("deleteAssets:")
	public static native void deleteAssets(
			@Mapped(ObjCObjectMapper.class) NSFastEnumeration assets);

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

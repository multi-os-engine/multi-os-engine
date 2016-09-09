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
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

import ios.NSObject;
import ios.corelocation.CLLocation;
import ios.foundation.NSDate;
import ios.foundation.NSURL;
import ios.uikit.UIImage;
import ios.foundation.protocol.NSFastEnumeration;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.SEL;
import ios.foundation.NSArray;
import ios.foundation.NSMethodSignature;
import ios.foundation.NSSet;

@Generated
@Library("Photos")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class PHAssetChangeRequest extends NSObject {
	static {
		NatJ.register();
	}

	@Generated
	protected PHAssetChangeRequest(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native PHAssetChangeRequest alloc();

	/**
	 * changeRequestForAsset:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Photos/Reference/PHAssetChangeRequest_Class/index.html#//apple_ref/occ/clm/PHAssetChangeRequest/changeRequestForAsset:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("changeRequestForAsset:")
	public static native PHAssetChangeRequest changeRequestForAsset(
			PHAsset asset);

	/**
	 * contentEditingOutput</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Photos/Reference/PHAssetChangeRequest_Class/index.html#//apple_ref/occ/instp/PHAssetChangeRequest/contentEditingOutput">iOS Dev Center</a>
	 */
	@Generated
	@Selector("contentEditingOutput")
	public native PHContentEditingOutput contentEditingOutput();

	/**
	 * creationDate</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Photos/Reference/PHAssetChangeRequest_Class/index.html#//apple_ref/occ/instp/PHAssetChangeRequest/creationDate">iOS Dev Center</a>
	 */
	@Generated
	@Selector("creationDate")
	public native NSDate creationDate();

	/**
	 * creationRequestForAssetFromImage:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Photos/Reference/PHAssetChangeRequest_Class/index.html#//apple_ref/occ/clm/PHAssetChangeRequest/creationRequestForAssetFromImage:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("creationRequestForAssetFromImage:")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object creationRequestForAssetFromImage(UIImage image);

	/**
	 * creationRequestForAssetFromImageAtFileURL:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Photos/Reference/PHAssetChangeRequest_Class/index.html#//apple_ref/occ/clm/PHAssetChangeRequest/creationRequestForAssetFromImageAtFileURL:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("creationRequestForAssetFromImageAtFileURL:")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object creationRequestForAssetFromImageAtFileURL(
			NSURL fileURL);

	/**
	 * creationRequestForAssetFromVideoAtFileURL:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Photos/Reference/PHAssetChangeRequest_Class/index.html#//apple_ref/occ/clm/PHAssetChangeRequest/creationRequestForAssetFromVideoAtFileURL:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("creationRequestForAssetFromVideoAtFileURL:")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object creationRequestForAssetFromVideoAtFileURL(
			NSURL fileURL);

	/**
	 * deleteAssets:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Photos/Reference/PHAssetChangeRequest_Class/index.html#//apple_ref/occ/clm/PHAssetChangeRequest/deleteAssets:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("deleteAssets:")
	public static native void deleteAssets(
			@Mapped(ObjCObjectMapper.class) NSFastEnumeration assets);

	@Generated
	@Selector("init")
	public native PHAssetChangeRequest init();

	/**
	 * favorite</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Photos/Reference/PHAssetChangeRequest_Class/index.html#//apple_ref/occ/instp/PHAssetChangeRequest/favorite">iOS Dev Center</a>
	 */
	@Generated
	@Selector("isFavorite")
	public native boolean isFavorite();

	/**
	 * hidden</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Photos/Reference/PHAssetChangeRequest_Class/index.html#//apple_ref/occ/instp/PHAssetChangeRequest/hidden">iOS Dev Center</a>
	 */
	@Generated
	@Selector("isHidden")
	public native boolean isHidden();

	/**
	 * location</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Photos/Reference/PHAssetChangeRequest_Class/index.html#//apple_ref/occ/instp/PHAssetChangeRequest/location">iOS Dev Center</a>
	 */
	@Generated
	@Selector("location")
	public native CLLocation location();

	/**
	 * placeholderForCreatedAsset</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Photos/Reference/PHAssetChangeRequest_Class/index.html#//apple_ref/occ/instp/PHAssetChangeRequest/placeholderForCreatedAsset">iOS Dev Center</a>
	 */
	@Generated
	@Selector("placeholderForCreatedAsset")
	public native PHObjectPlaceholder placeholderForCreatedAsset();

	/**
	 * revertAssetContentToOriginal</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Photos/Reference/PHAssetChangeRequest_Class/index.html#//apple_ref/occ/instm/PHAssetChangeRequest/revertAssetContentToOriginal">iOS Dev Center</a>
	 */
	@Generated
	@Selector("revertAssetContentToOriginal")
	public native void revertAssetContentToOriginal();

	/**
	 * contentEditingOutput</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Photos/Reference/PHAssetChangeRequest_Class/index.html#//apple_ref/occ/instp/PHAssetChangeRequest/contentEditingOutput">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setContentEditingOutput:")
	public native void setContentEditingOutput(PHContentEditingOutput value);

	/**
	 * creationDate</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Photos/Reference/PHAssetChangeRequest_Class/index.html#//apple_ref/occ/instp/PHAssetChangeRequest/creationDate">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setCreationDate:")
	public native void setCreationDate(NSDate value);

	/**
	 * favorite</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Photos/Reference/PHAssetChangeRequest_Class/index.html#//apple_ref/occ/instp/PHAssetChangeRequest/favorite">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setFavorite:")
	public native void setFavorite(boolean value);

	/**
	 * hidden</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Photos/Reference/PHAssetChangeRequest_Class/index.html#//apple_ref/occ/instp/PHAssetChangeRequest/hidden">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setHidden:")
	public native void setHidden(boolean value);

	/**
	 * location</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Photos/Reference/PHAssetChangeRequest_Class/index.html#//apple_ref/occ/instp/PHAssetChangeRequest/location">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setLocation:")
	public native void setLocation(CLLocation value);

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

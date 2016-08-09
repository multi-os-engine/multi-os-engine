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
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;

import ios.NSObject;
import ios.avfoundation.AVAsset;
import ios.corelocation.CLLocation;
import ios.foundation.NSDate;
import ios.foundation.NSURL;
import ios.uikit.UIImage;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.map.ObjCObjectMapper;
import ios.foundation.NSArray;
import ios.foundation.NSMethodSignature;
import ios.foundation.NSSet;

@Generated
@Library("Photos")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class PHContentEditingInput extends NSObject {
	static {
		NatJ.register();
	}

	@Generated
	protected PHContentEditingInput(Pointer peer) {
		super(peer);
	}

	/**
	 * adjustmentData</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Photos/Reference/PHContentEditingInput_Class/index.html#//apple_ref/occ/instp/PHContentEditingInput/adjustmentData">iOS Dev Center</a>
	 */
	@Generated
	@Selector("adjustmentData")
	public native PHAdjustmentData adjustmentData();

	@Generated
	@Owned
	@Selector("alloc")
	public static native PHContentEditingInput alloc();

	/**
	 * avAsset</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Photos/Reference/PHContentEditingInput_Class/index.html#//apple_ref/occ/instp/PHContentEditingInput/avAsset">iOS Dev Center</a>
	 */
	@Deprecated
	@Generated
	@Selector("avAsset")
	public native AVAsset avAsset();

	/**
	 * creationDate</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Photos/Reference/PHContentEditingInput_Class/index.html#//apple_ref/occ/instp/PHContentEditingInput/creationDate">iOS Dev Center</a>
	 */
	@Generated
	@Selector("creationDate")
	public native NSDate creationDate();

	/**
	 * displaySizeImage</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Photos/Reference/PHContentEditingInput_Class/index.html#//apple_ref/occ/instp/PHContentEditingInput/displaySizeImage">iOS Dev Center</a>
	 */
	@Generated
	@Selector("displaySizeImage")
	public native UIImage displaySizeImage();

	/**
	 * fullSizeImageOrientation</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Photos/Reference/PHContentEditingInput_Class/index.html#//apple_ref/occ/instp/PHContentEditingInput/fullSizeImageOrientation">iOS Dev Center</a>
	 */
	@Generated
	@Selector("fullSizeImageOrientation")
	public native int fullSizeImageOrientation();

	/**
	 * fullSizeImageURL</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Photos/Reference/PHContentEditingInput_Class/index.html#//apple_ref/occ/instp/PHContentEditingInput/fullSizeImageURL">iOS Dev Center</a>
	 */
	@Generated
	@Selector("fullSizeImageURL")
	public native NSURL fullSizeImageURL();

	@Generated
	@Selector("init")
	public native PHContentEditingInput init();

	/**
	 * location</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Photos/Reference/PHContentEditingInput_Class/index.html#//apple_ref/occ/instp/PHContentEditingInput/location">iOS Dev Center</a>
	 */
	@Generated
	@Selector("location")
	public native CLLocation location();

	/**
	 * mediaSubtypes</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Photos/Reference/PHContentEditingInput_Class/index.html#//apple_ref/occ/instp/PHContentEditingInput/mediaSubtypes">iOS Dev Center</a>
	 */
	@Generated
	@Selector("mediaSubtypes")
	@NUInt
	public native long mediaSubtypes();

	/**
	 * mediaType</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Photos/Reference/PHContentEditingInput_Class/index.html#//apple_ref/occ/instp/PHContentEditingInput/mediaType">iOS Dev Center</a>
	 */
	@Generated
	@Selector("mediaType")
	@NInt
	public native long mediaType();

	/**
	 * uniformTypeIdentifier</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Photos/Reference/PHContentEditingInput_Class/index.html#//apple_ref/occ/instp/PHContentEditingInput/uniformTypeIdentifier">iOS Dev Center</a>
	 */
	@Generated
	@Selector("uniformTypeIdentifier")
	public native String uniformTypeIdentifier();

	/**
	 * audiovisualAsset</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Photos/Reference/PHContentEditingInput_Class/index.html#//apple_ref/occ/instp/PHContentEditingInput/audiovisualAsset">iOS Dev Center</a>
	 */
	@Generated
	@Selector("audiovisualAsset")
	public native AVAsset audiovisualAsset();

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
	public static native void load_objc();

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
	public static native long version();
}

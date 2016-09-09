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
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.BoolPtr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

import ios.NSObject;
import ios.coregraphics.struct.CGRect;
import ios.foundation.NSDictionary;
import ios.foundation.NSError;
import ios.foundation.protocol.NSCopying;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.SEL;
import ios.foundation.NSArray;
import ios.foundation.NSMethodSignature;
import ios.foundation.NSSet;

@Generated
@Library("Photos")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class PHImageRequestOptions extends NSObject implements NSCopying {
	static {
		NatJ.register();
	}

	@Generated
	protected PHImageRequestOptions(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native PHImageRequestOptions alloc();

	@Generated
	@Owned
	@Selector("copyWithZone:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object copyWithZone(VoidPtr zone);

	/**
	 * deliveryMode</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Photos/Reference/PHImageRequestOptions_Class/index.html#//apple_ref/occ/instp/PHImageRequestOptions/deliveryMode">iOS Dev Center</a>
	 */
	@Generated
	@Selector("deliveryMode")
	@NInt
	public native long deliveryMode();

	@Generated
	@Selector("init")
	public native PHImageRequestOptions init();

	/**
	 * networkAccessAllowed</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Photos/Reference/PHImageRequestOptions_Class/index.html#//apple_ref/occ/instp/PHImageRequestOptions/networkAccessAllowed">iOS Dev Center</a>
	 */
	@Generated
	@Selector("isNetworkAccessAllowed")
	public native boolean isNetworkAccessAllowed();

	/**
	 * synchronous</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Photos/Reference/PHImageRequestOptions_Class/index.html#//apple_ref/occ/instp/PHImageRequestOptions/synchronous">iOS Dev Center</a>
	 */
	@Generated
	@Selector("isSynchronous")
	public native boolean isSynchronous();

	/**
	 * normalizedCropRect</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Photos/Reference/PHImageRequestOptions_Class/index.html#//apple_ref/occ/instp/PHImageRequestOptions/normalizedCropRect">iOS Dev Center</a>
	 */
	@Generated
	@Selector("normalizedCropRect")
	@ByValue
	public native CGRect normalizedCropRect();

	/**
	 * resizeMode</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Photos/Reference/PHImageRequestOptions_Class/index.html#//apple_ref/occ/instp/PHImageRequestOptions/resizeMode">iOS Dev Center</a>
	 */
	@Generated
	@Selector("resizeMode")
	@NInt
	public native long resizeMode();

	/**
	 * deliveryMode</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Photos/Reference/PHImageRequestOptions_Class/index.html#//apple_ref/occ/instp/PHImageRequestOptions/deliveryMode">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setDeliveryMode:")
	public native void setDeliveryMode(@NInt long value);

	/**
	 * networkAccessAllowed</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Photos/Reference/PHImageRequestOptions_Class/index.html#//apple_ref/occ/instp/PHImageRequestOptions/networkAccessAllowed">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setNetworkAccessAllowed:")
	public native void setNetworkAccessAllowed(boolean value);

	/**
	 * normalizedCropRect</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Photos/Reference/PHImageRequestOptions_Class/index.html#//apple_ref/occ/instp/PHImageRequestOptions/normalizedCropRect">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setNormalizedCropRect:")
	public native void setNormalizedCropRect(@ByValue CGRect value);

	/**
	 * progressHandler</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Photos/Reference/PHImageRequestOptions_Class/index.html#//apple_ref/occ/instp/PHImageRequestOptions/progressHandler">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setProgressHandler:")
	public native void setProgressHandler(
			@ObjCBlock(name = "call_setProgressHandler") Block_setProgressHandler value);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_setProgressHandler {
		@Generated
		void call_setProgressHandler(double arg0, NSError arg1,
				BoolPtr arg2, NSDictionary<?, ?> arg3);
	}

	/**
	 * resizeMode</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Photos/Reference/PHImageRequestOptions_Class/index.html#//apple_ref/occ/instp/PHImageRequestOptions/resizeMode">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setResizeMode:")
	public native void setResizeMode(@NInt long value);

	/**
	 * synchronous</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Photos/Reference/PHImageRequestOptions_Class/index.html#//apple_ref/occ/instp/PHImageRequestOptions/synchronous">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setSynchronous:")
	public native void setSynchronous(boolean value);

	/**
	 * version</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Photos/Reference/PHImageRequestOptions_Class/index.html#//apple_ref/occ/instp/PHImageRequestOptions/version">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setVersion:")
	public native void setVersion(@NInt long value);

	/**
	 * version</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Photos/Reference/PHImageRequestOptions_Class/index.html#//apple_ref/occ/instp/PHImageRequestOptions/version">iOS Dev Center</a>
	 */
	@Generated
	@Selector("version")
	@NInt
	public native long version();

	/**
	 * progressHandler</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Photos/Reference/PHImageRequestOptions_Class/index.html#//apple_ref/occ/instp/PHImageRequestOptions/progressHandler">iOS Dev Center</a>
	 */
	@Generated
	@Selector("progressHandler")
	@ObjCBlock(name = "call_progressHandler_ret")
	public native Block_progressHandler_ret progressHandler();

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_progressHandler_ret {
		@Generated
		void call_progressHandler_ret(double arg0, NSError arg1, BoolPtr arg2, NSDictionary<?, ?> arg3);
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
	@Selector("superclass")
	public static native Class superclass_static();
}

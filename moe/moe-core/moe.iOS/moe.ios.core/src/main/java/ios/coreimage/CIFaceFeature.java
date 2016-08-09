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

package ios.coreimage;


import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;

import ios.coregraphics.struct.CGPoint;
import ios.coregraphics.struct.CGRect;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.map.ObjCObjectMapper;
import ios.NSObject;
import ios.foundation.NSArray;
import ios.foundation.NSMethodSignature;
import ios.foundation.NSSet;

@Generated
@Library("CoreImage")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class CIFaceFeature extends CIFeature {
	static {
		NatJ.register();
	}

	@Generated
	protected CIFaceFeature(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native CIFaceFeature alloc();

	/**
	 * bounds</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreImage/Reference/CIFaceFeature/index.html#//apple_ref/occ/instp/CIFaceFeature/bounds">iOS Dev Center</a>
	 */
	@Generated
	@Selector("bounds")
	@ByValue
	public native CGRect bounds();

	/**
	 * faceAngle</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreImage/Reference/CIFaceFeature/index.html#//apple_ref/occ/instp/CIFaceFeature/faceAngle">iOS Dev Center</a>
	 */
	@Generated
	@Selector("faceAngle")
	public native float faceAngle();

	/**
	 * hasFaceAngle</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreImage/Reference/CIFaceFeature/index.html#//apple_ref/occ/instp/CIFaceFeature/hasFaceAngle">iOS Dev Center</a>
	 */
	@Generated
	@Selector("hasFaceAngle")
	public native boolean hasFaceAngle();

	/**
	 * hasLeftEyePosition</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreImage/Reference/CIFaceFeature/index.html#//apple_ref/occ/instp/CIFaceFeature/hasLeftEyePosition">iOS Dev Center</a>
	 */
	@Generated
	@Selector("hasLeftEyePosition")
	public native boolean hasLeftEyePosition();

	/**
	 * hasMouthPosition</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreImage/Reference/CIFaceFeature/index.html#//apple_ref/occ/instp/CIFaceFeature/hasMouthPosition">iOS Dev Center</a>
	 */
	@Generated
	@Selector("hasMouthPosition")
	public native boolean hasMouthPosition();

	/**
	 * hasRightEyePosition</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreImage/Reference/CIFaceFeature/index.html#//apple_ref/occ/instp/CIFaceFeature/hasRightEyePosition">iOS Dev Center</a>
	 */
	@Generated
	@Selector("hasRightEyePosition")
	public native boolean hasRightEyePosition();

	/**
	 * hasSmile</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreImage/Reference/CIFaceFeature/index.html#//apple_ref/occ/instp/CIFaceFeature/hasSmile">iOS Dev Center</a>
	 */
	@Generated
	@Selector("hasSmile")
	public native boolean hasSmile();

	/**
	 * hasTrackingFrameCount</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreImage/Reference/CIFaceFeature/index.html#//apple_ref/occ/instp/CIFaceFeature/hasTrackingFrameCount">iOS Dev Center</a>
	 */
	@Generated
	@Selector("hasTrackingFrameCount")
	public native boolean hasTrackingFrameCount();

	/**
	 * hasTrackingID</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreImage/Reference/CIFaceFeature/index.html#//apple_ref/occ/instp/CIFaceFeature/hasTrackingID">iOS Dev Center</a>
	 */
	@Generated
	@Selector("hasTrackingID")
	public native boolean hasTrackingID();

	@Generated
	@Selector("init")
	public native CIFaceFeature init();

	/**
	 * leftEyeClosed</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreImage/Reference/CIFaceFeature/index.html#//apple_ref/occ/instp/CIFaceFeature/leftEyeClosed">iOS Dev Center</a>
	 */
	@Generated
	@Selector("leftEyeClosed")
	public native boolean leftEyeClosed();

	/**
	 * leftEyePosition</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreImage/Reference/CIFaceFeature/index.html#//apple_ref/occ/instp/CIFaceFeature/leftEyePosition">iOS Dev Center</a>
	 */
	@Generated
	@Selector("leftEyePosition")
	@ByValue
	public native CGPoint leftEyePosition();

	/**
	 * mouthPosition</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreImage/Reference/CIFaceFeature/index.html#//apple_ref/occ/instp/CIFaceFeature/mouthPosition">iOS Dev Center</a>
	 */
	@Generated
	@Selector("mouthPosition")
	@ByValue
	public native CGPoint mouthPosition();

	/**
	 * rightEyeClosed</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreImage/Reference/CIFaceFeature/index.html#//apple_ref/occ/instp/CIFaceFeature/rightEyeClosed">iOS Dev Center</a>
	 */
	@Generated
	@Selector("rightEyeClosed")
	public native boolean rightEyeClosed();

	/**
	 * rightEyePosition</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreImage/Reference/CIFaceFeature/index.html#//apple_ref/occ/instp/CIFaceFeature/rightEyePosition">iOS Dev Center</a>
	 */
	@Generated
	@Selector("rightEyePosition")
	@ByValue
	public native CGPoint rightEyePosition();

	/**
	 * trackingFrameCount</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreImage/Reference/CIFaceFeature/index.html#//apple_ref/occ/instp/CIFaceFeature/trackingFrameCount">iOS Dev Center</a>
	 */
	@Generated
	@Selector("trackingFrameCount")
	public native int trackingFrameCount();

	/**
	 * trackingID</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreImage/Reference/CIFaceFeature/index.html#//apple_ref/occ/instp/CIFaceFeature/trackingID">iOS Dev Center</a>
	 */
	@Generated
	@Selector("trackingID")
	public native int trackingID();

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

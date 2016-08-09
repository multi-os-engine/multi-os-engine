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

package ios.avfoundation;


import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ann.UncertainArgument;
import org.moe.natj.general.ptr.FloatPtr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

import ios.NSObject;
import ios.coregraphics.struct.CGAffineTransform;
import ios.coregraphics.struct.CGRect;
import ios.coremedia.struct.CMTime;
import ios.coremedia.struct.CMTimeRange;
import ios.foundation.NSCoder;
import ios.foundation.protocol.NSCopying;
import ios.foundation.protocol.NSMutableCopying;
import ios.foundation.protocol.NSSecureCoding;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.SEL;
import ios.foundation.NSArray;
import ios.foundation.NSMethodSignature;
import ios.foundation.NSSet;

@Generated
@Library("AVFoundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class AVVideoCompositionLayerInstruction extends NSObject implements
		NSSecureCoding, NSCopying, NSMutableCopying {
	static {
		NatJ.register();
	}

	@Generated
	protected AVVideoCompositionLayerInstruction(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native AVVideoCompositionLayerInstruction alloc();

	@Generated
	@Owned
	@Selector("copyWithZone:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object copyWithZone(VoidPtr zone);

	@Generated
	@Selector("encodeWithCoder:")
	public native void encodeWithCoder(NSCoder aCoder);

	/**
	 * getCropRectangleRampForTime:startCropRectangle:endCropRectangle:timeRange:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVVideoCompositionLayerInstruction_Class/index.html#//apple_ref/occ/instm/AVVideoCompositionLayerInstruction/getCropRectangleRampForTime:startCropRectangle:endCropRectangle:timeRange:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("getCropRectangleRampForTime:startCropRectangle:endCropRectangle:timeRange:")
	public native boolean getCropRectangleRampForTimeStartCropRectangleEndCropRectangleTimeRange(
			@ByValue CMTime time,
			CGRect startCropRectangle,
			CGRect endCropRectangle,
			CMTimeRange timeRange);

	/**
	 * getOpacityRampForTime:startOpacity:endOpacity:timeRange:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVVideoCompositionLayerInstruction_Class/index.html#//apple_ref/occ/instm/AVVideoCompositionLayerInstruction/getOpacityRampForTime:startOpacity:endOpacity:timeRange:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("getOpacityRampForTime:startOpacity:endOpacity:timeRange:")
	public native boolean getOpacityRampForTimeStartOpacityEndOpacityTimeRange(
			@ByValue CMTime time,
			FloatPtr startOpacity,
			FloatPtr endOpacity,
			CMTimeRange timeRange);

	/**
	 * getTransformRampForTime:startTransform:endTransform:timeRange:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVVideoCompositionLayerInstruction_Class/index.html#//apple_ref/occ/instm/AVVideoCompositionLayerInstruction/getTransformRampForTime:startTransform:endTransform:timeRange:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("getTransformRampForTime:startTransform:endTransform:timeRange:")
	public native boolean getTransformRampForTimeStartTransformEndTransformTimeRange(
			@ByValue CMTime time,
			CGAffineTransform startTransform,
			CGAffineTransform endTransform,
			CMTimeRange timeRange);

	@Generated
	@Selector("init")
	public native AVVideoCompositionLayerInstruction init();

	@Generated
	@Selector("initWithCoder:")
	public native AVVideoCompositionLayerInstruction initWithCoder(NSCoder aDecoder);

	@Generated
	@Selector("mutableCopyWithZone:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object mutableCopyWithZone(VoidPtr zone);

	@Generated
	@Selector("supportsSecureCoding")
	public static native boolean supportsSecureCoding();

	@Generated
	@ProtocolClassMethod("supportsSecureCoding")
	public boolean _supportsSecureCoding() {
		return supportsSecureCoding();
	}

	/**
	 * trackID</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVVideoCompositionLayerInstruction_Class/index.html#//apple_ref/occ/instp/AVVideoCompositionLayerInstruction/trackID">iOS Dev Center</a>
	 */
	@Generated
	@Selector("trackID")
	public native int trackID();

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

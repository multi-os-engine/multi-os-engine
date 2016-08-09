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
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

import ios.NSObject;
import ios.coregraphics.struct.CGSize;
import ios.coremedia.struct.CMTime;
import ios.coremedia.struct.CMTimeRange;
import ios.foundation.NSArray;
import ios.foundation.protocol.NSCopying;
import ios.foundation.protocol.NSMutableCopying;
import ios.avfoundation.protocol.AVVideoCompositing;
import ios.avfoundation.protocol.AVVideoCompositionValidationHandling;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.SEL;
import ios.foundation.NSMethodSignature;
import ios.foundation.NSSet;

@Generated
@Library("AVFoundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class AVVideoComposition extends NSObject implements NSCopying,
		NSMutableCopying {
	static {
		NatJ.register();
	}

	@Generated
	protected AVVideoComposition(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native AVVideoComposition alloc();

	/**
	 * animationTool</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVVideoComposition_Class/index.html#//apple_ref/occ/instp/AVVideoComposition/animationTool">iOS Dev Center</a>
	 */
	@Generated
	@Selector("animationTool")
	public native AVVideoCompositionCoreAnimationTool animationTool();

	@Generated
	@Owned
	@Selector("copyWithZone:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object copyWithZone(VoidPtr zone);

	/**
	 * customVideoCompositorClass</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVVideoComposition_Class/index.html#//apple_ref/occ/instp/AVVideoComposition/customVideoCompositorClass">iOS Dev Center</a>
	 */
	@Generated
	@Selector("customVideoCompositorClass")
	@MappedReturn(ObjCObjectMapper.class)
	public native AVVideoCompositing customVideoCompositorClass();

	/**
	 * frameDuration</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVVideoComposition_Class/index.html#//apple_ref/occ/instp/AVVideoComposition/frameDuration">iOS Dev Center</a>
	 */
	@Generated
	@Selector("frameDuration")
	@ByValue
	public native CMTime frameDuration();

	@Generated
	@Selector("init")
	public native AVVideoComposition init();

	/**
	 * instructions</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVVideoComposition_Class/index.html#//apple_ref/occ/instp/AVVideoComposition/instructions">iOS Dev Center</a>
	 */
	@Generated
	@Selector("instructions")
	public native NSArray<?> instructions();

	/**
	 * isValidForAsset:timeRange:validationDelegate:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVVideoComposition_Class/index.html#//apple_ref/occ/instm/AVVideoComposition/isValidForAsset:timeRange:validationDelegate:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("isValidForAsset:timeRange:validationDelegate:")
	public native boolean isValidForAssetTimeRangeValidationDelegate(
			AVAsset asset, @ByValue CMTimeRange timeRange,
			@Mapped(ObjCObjectMapper.class) AVVideoCompositionValidationHandling validationDelegate);

	@Generated
	@Selector("mutableCopyWithZone:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object mutableCopyWithZone(VoidPtr zone);

	/**
	 * renderScale</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVVideoComposition_Class/index.html#//apple_ref/occ/instp/AVVideoComposition/renderScale">iOS Dev Center</a>
	 */
	@Generated
	@Selector("renderScale")
	public native float renderScale();

	/**
	 * renderSize</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVVideoComposition_Class/index.html#//apple_ref/occ/instp/AVVideoComposition/renderSize">iOS Dev Center</a>
	 */
	@Generated
	@Selector("renderSize")
	@ByValue
	public native CGSize renderSize();

	/**
	 * videoCompositionWithPropertiesOfAsset:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVVideoComposition_Class/index.html#//apple_ref/occ/clm/AVVideoComposition/videoCompositionWithPropertiesOfAsset:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("videoCompositionWithPropertiesOfAsset:")
	public static native AVVideoComposition videoCompositionWithPropertiesOfAsset(
			AVAsset asset);

	@Generated
	@Selector("videoCompositionWithAsset:applyingCIFiltersWithHandler:")
	public static native AVVideoComposition videoCompositionWithAssetApplyingCIFiltersWithHandler(AVAsset asset,
			@ObjCBlock(name = "call_videoCompositionWithAssetApplyingCIFiltersWithHandler") Block_videoCompositionWithAssetApplyingCIFiltersWithHandler applier);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_videoCompositionWithAssetApplyingCIFiltersWithHandler {
		@Generated
		void call_videoCompositionWithAssetApplyingCIFiltersWithHandler(
				AVAsynchronousCIImageFilteringRequest arg0);
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

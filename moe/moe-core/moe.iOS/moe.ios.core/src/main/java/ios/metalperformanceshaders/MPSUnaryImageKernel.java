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

package ios.metalperformanceshaders;


import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.objc.ObjCObject;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

import ios.metal.struct.MTLRegion;
import ios.metal.struct.MTLSize;
import ios.metalperformanceshaders.struct.MPSOffset;
import ios.metalperformanceshaders.struct.MPSRegion;
import ios.metal.protocol.MTLCommandBuffer;
import ios.metal.protocol.MTLDevice;
import ios.metal.protocol.MTLTexture;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.SEL;
import ios.NSObject;
import ios.foundation.NSArray;
import ios.foundation.NSMethodSignature;
import ios.foundation.NSSet;

@Generated
@Library("MetalPerformanceShaders")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPSUnaryImageKernel extends MPSKernel {
	static {
		NatJ.register();
	}

	@Generated
	protected MPSUnaryImageKernel(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native MPSUnaryImageKernel alloc();

	/**
	 * clipRect</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MetalPerformanceShaders/Reference/MPSUnaryImageKernel_ClassReference/index.html#//apple_ref/occ/instp/MPSUnaryImageKernel/clipRect">iOS Dev Center</a>
	 */
	@Generated
	@Selector("clipRect")
	@ByValue
	public native MTLRegion clipRect();

	/**
	 * edgeMode</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MetalPerformanceShaders/Reference/MPSUnaryImageKernel_ClassReference/index.html#//apple_ref/occ/instp/MPSUnaryImageKernel/edgeMode">iOS Dev Center</a>
	 */
	@Generated
	@Selector("edgeMode")
	@NUInt
	public native long edgeMode();

	/**
	 * encodeToCommandBuffer:inPlaceTexture:fallbackCopyAllocator:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MetalPerformanceShaders/Reference/MPSUnaryImageKernel_ClassReference/index.html#//apple_ref/occ/instm/MPSUnaryImageKernel/encodeToCommandBuffer:inPlaceTexture:fallbackCopyAllocator:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("encodeToCommandBuffer:inPlaceTexture:fallbackCopyAllocator:")
	public native boolean encodeToCommandBufferInPlaceTextureFallbackCopyAllocator(
			@Mapped(ObjCObjectMapper.class) MTLCommandBuffer commandBuffer, Ptr<ObjCObject> texture,
			@ObjCBlock(name = "call_encodeToCommandBufferInPlaceTextureFallbackCopyAllocator") Block_encodeToCommandBufferInPlaceTextureFallbackCopyAllocator copyAllocator);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_encodeToCommandBufferInPlaceTextureFallbackCopyAllocator {
		@Generated
		@MappedReturn(ObjCObjectMapper.class)
		Object call_encodeToCommandBufferInPlaceTextureFallbackCopyAllocator(MPSKernel arg0,
				@Mapped(ObjCObjectMapper.class) Object arg1, @Mapped(ObjCObjectMapper.class) Object arg2);
	}

	/**
	 * encodeToCommandBuffer:sourceTexture:destinationTexture:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MetalPerformanceShaders/Reference/MPSUnaryImageKernel_ClassReference/index.html#//apple_ref/occ/instm/MPSUnaryImageKernel/encodeToCommandBuffer:sourceTexture:destinationTexture:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("encodeToCommandBuffer:sourceTexture:destinationTexture:")
	public native void encodeToCommandBufferSourceTextureDestinationTexture(
			@Mapped(ObjCObjectMapper.class) MTLCommandBuffer commandBuffer, @Mapped(ObjCObjectMapper.class) MTLTexture sourceTexture,
			@Mapped(ObjCObjectMapper.class) MTLTexture destinationTexture);

	@Generated
	@Selector("init")
	public native MPSUnaryImageKernel init();

	@Generated
	@Selector("initWithDevice:")
	public native MPSUnaryImageKernel initWithDevice(@Mapped(ObjCObjectMapper.class) MTLDevice device);

	/**
	 * offset</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MetalPerformanceShaders/Reference/MPSUnaryImageKernel_ClassReference/index.html#//apple_ref/occ/instp/MPSUnaryImageKernel/offset">iOS Dev Center</a>
	 */
	@Generated
	@Selector("offset")
	@ByValue
	public native MPSOffset offset();

	/**
	 * clipRect</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MetalPerformanceShaders/Reference/MPSUnaryImageKernel_ClassReference/index.html#//apple_ref/occ/instp/MPSUnaryImageKernel/clipRect">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setClipRect:")
	public native void setClipRect(@ByValue MTLRegion value);

	/**
	 * edgeMode</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MetalPerformanceShaders/Reference/MPSUnaryImageKernel_ClassReference/index.html#//apple_ref/occ/instp/MPSUnaryImageKernel/edgeMode">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setEdgeMode:")
	public native void setEdgeMode(@NUInt long value);

	/**
	 * offset</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MetalPerformanceShaders/Reference/MPSUnaryImageKernel_ClassReference/index.html#//apple_ref/occ/instp/MPSUnaryImageKernel/offset">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setOffset:")
	public native void setOffset(@ByValue MPSOffset value);

	/**
	 * sourceRegionForDestinationSize:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MetalPerformanceShaders/Reference/MPSUnaryImageKernel_ClassReference/index.html#//apple_ref/occ/instm/MPSUnaryImageKernel/sourceRegionForDestinationSize:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("sourceRegionForDestinationSize:")
	@ByValue
	public native MPSRegion sourceRegionForDestinationSize(@ByValue MTLSize destinationSize);

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

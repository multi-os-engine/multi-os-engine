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

package ios.metal;


import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

import ios.NSObject;
import ios.foundation.protocol.NSCopying;
import ios.metal.protocol.MTLFunction;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.SEL;
import ios.foundation.NSArray;
import ios.foundation.NSMethodSignature;
import ios.foundation.NSSet;

@Generated
@Library("Metal")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MTLRenderPipelineDescriptor extends NSObject implements NSCopying {
	static {
		NatJ.register();
	}

	@Generated
	protected MTLRenderPipelineDescriptor(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native MTLRenderPipelineDescriptor alloc();

	/**
	 * colorAttachments</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Metal/Reference/MTLRenderPipelineDescriptor_Ref/index.html#//apple_ref/occ/instp/MTLRenderPipelineDescriptor/colorAttachments">iOS Dev Center</a>
	 */
	@Generated
	@Selector("colorAttachments")
	public native MTLRenderPipelineColorAttachmentDescriptorArray colorAttachments();

	@Generated
	@Owned
	@Selector("copyWithZone:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object copyWithZone(VoidPtr zone);

	/**
	 * depthAttachmentPixelFormat</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Metal/Reference/MTLRenderPipelineDescriptor_Ref/index.html#//apple_ref/occ/instp/MTLRenderPipelineDescriptor/depthAttachmentPixelFormat">iOS Dev Center</a>
	 */
	@Generated
	@Selector("depthAttachmentPixelFormat")
	@NUInt
	public native long depthAttachmentPixelFormat();

	/**
	 * fragmentFunction</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Metal/Reference/MTLRenderPipelineDescriptor_Ref/index.html#//apple_ref/occ/instp/MTLRenderPipelineDescriptor/fragmentFunction">iOS Dev Center</a>
	 */
	@Generated
	@Selector("fragmentFunction")
	@MappedReturn(ObjCObjectMapper.class)
	public native MTLFunction fragmentFunction();

	@Generated
	@Selector("init")
	public native MTLRenderPipelineDescriptor init();

	/**
	 * alphaToCoverageEnabled</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Metal/Reference/MTLRenderPipelineDescriptor_Ref/index.html#//apple_ref/occ/instp/MTLRenderPipelineDescriptor/alphaToCoverageEnabled">iOS Dev Center</a>
	 */
	@Generated
	@Selector("isAlphaToCoverageEnabled")
	public native boolean isAlphaToCoverageEnabled();

	/**
	 * alphaToOneEnabled</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Metal/Reference/MTLRenderPipelineDescriptor_Ref/index.html#//apple_ref/occ/instp/MTLRenderPipelineDescriptor/alphaToOneEnabled">iOS Dev Center</a>
	 */
	@Generated
	@Selector("isAlphaToOneEnabled")
	public native boolean isAlphaToOneEnabled();

	/**
	 * rasterizationEnabled</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Metal/Reference/MTLRenderPipelineDescriptor_Ref/index.html#//apple_ref/occ/instp/MTLRenderPipelineDescriptor/rasterizationEnabled">iOS Dev Center</a>
	 */
	@Generated
	@Selector("isRasterizationEnabled")
	public native boolean isRasterizationEnabled();

	/**
	 * label</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Metal/Reference/MTLRenderPipelineDescriptor_Ref/index.html#//apple_ref/occ/instp/MTLRenderPipelineDescriptor/label">iOS Dev Center</a>
	 */
	@Generated
	@Selector("label")
	public native String label();

	/**
	 * reset</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Metal/Reference/MTLRenderPipelineDescriptor_Ref/index.html#//apple_ref/occ/instm/MTLRenderPipelineDescriptor/reset">iOS Dev Center</a>
	 */
	@Generated
	@Selector("reset")
	public native void reset();

	/**
	 * sampleCount</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Metal/Reference/MTLRenderPipelineDescriptor_Ref/index.html#//apple_ref/occ/instp/MTLRenderPipelineDescriptor/sampleCount">iOS Dev Center</a>
	 */
	@Generated
	@Selector("sampleCount")
	@NUInt
	public native long sampleCount();

	/**
	 * alphaToCoverageEnabled</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Metal/Reference/MTLRenderPipelineDescriptor_Ref/index.html#//apple_ref/occ/instp/MTLRenderPipelineDescriptor/alphaToCoverageEnabled">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setAlphaToCoverageEnabled:")
	public native void setAlphaToCoverageEnabled(boolean value);

	/**
	 * alphaToOneEnabled</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Metal/Reference/MTLRenderPipelineDescriptor_Ref/index.html#//apple_ref/occ/instp/MTLRenderPipelineDescriptor/alphaToOneEnabled">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setAlphaToOneEnabled:")
	public native void setAlphaToOneEnabled(boolean value);

	/**
	 * depthAttachmentPixelFormat</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Metal/Reference/MTLRenderPipelineDescriptor_Ref/index.html#//apple_ref/occ/instp/MTLRenderPipelineDescriptor/depthAttachmentPixelFormat">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setDepthAttachmentPixelFormat:")
	public native void setDepthAttachmentPixelFormat(@NUInt long value);

	/**
	 * fragmentFunction</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Metal/Reference/MTLRenderPipelineDescriptor_Ref/index.html#//apple_ref/occ/instp/MTLRenderPipelineDescriptor/fragmentFunction">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setFragmentFunction:")
	public native void setFragmentFunction(
			@Mapped(ObjCObjectMapper.class) MTLFunction value);

	/**
	 * label</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Metal/Reference/MTLRenderPipelineDescriptor_Ref/index.html#//apple_ref/occ/instp/MTLRenderPipelineDescriptor/label">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setLabel:")
	public native void setLabel(String value);

	/**
	 * rasterizationEnabled</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Metal/Reference/MTLRenderPipelineDescriptor_Ref/index.html#//apple_ref/occ/instp/MTLRenderPipelineDescriptor/rasterizationEnabled">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setRasterizationEnabled:")
	public native void setRasterizationEnabled(boolean value);

	/**
	 * sampleCount</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Metal/Reference/MTLRenderPipelineDescriptor_Ref/index.html#//apple_ref/occ/instp/MTLRenderPipelineDescriptor/sampleCount">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setSampleCount:")
	public native void setSampleCount(@NUInt long value);

	/**
	 * stencilAttachmentPixelFormat</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Metal/Reference/MTLRenderPipelineDescriptor_Ref/index.html#//apple_ref/occ/instp/MTLRenderPipelineDescriptor/stencilAttachmentPixelFormat">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setStencilAttachmentPixelFormat:")
	public native void setStencilAttachmentPixelFormat(@NUInt long value);

	/**
	 * vertexDescriptor</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Metal/Reference/MTLRenderPipelineDescriptor_Ref/index.html#//apple_ref/occ/instp/MTLRenderPipelineDescriptor/vertexDescriptor">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setVertexDescriptor:")
	public native void setVertexDescriptor(MTLVertexDescriptor value);

	/**
	 * vertexFunction</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Metal/Reference/MTLRenderPipelineDescriptor_Ref/index.html#//apple_ref/occ/instp/MTLRenderPipelineDescriptor/vertexFunction">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setVertexFunction:")
	public native void setVertexFunction(
			@Mapped(ObjCObjectMapper.class) MTLFunction value);

	/**
	 * stencilAttachmentPixelFormat</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Metal/Reference/MTLRenderPipelineDescriptor_Ref/index.html#//apple_ref/occ/instp/MTLRenderPipelineDescriptor/stencilAttachmentPixelFormat">iOS Dev Center</a>
	 */
	@Generated
	@Selector("stencilAttachmentPixelFormat")
	@NUInt
	public native long stencilAttachmentPixelFormat();

	/**
	 * vertexDescriptor</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Metal/Reference/MTLRenderPipelineDescriptor_Ref/index.html#//apple_ref/occ/instp/MTLRenderPipelineDescriptor/vertexDescriptor">iOS Dev Center</a>
	 */
	@Generated
	@Selector("vertexDescriptor")
	public native MTLVertexDescriptor vertexDescriptor();

	/**
	 * vertexFunction</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Metal/Reference/MTLRenderPipelineDescriptor_Ref/index.html#//apple_ref/occ/instp/MTLRenderPipelineDescriptor/vertexFunction">iOS Dev Center</a>
	 */
	@Generated
	@Selector("vertexFunction")
	@MappedReturn(ObjCObjectMapper.class)
	public native MTLFunction vertexFunction();

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

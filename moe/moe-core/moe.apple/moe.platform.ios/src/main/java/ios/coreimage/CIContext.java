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
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

import ios.NSObject;
import ios.coregraphics.opaque.CGColorSpaceRef;
import ios.coregraphics.opaque.CGContextRef;
import ios.coregraphics.opaque.CGImageRef;
import ios.coregraphics.struct.CGPoint;
import ios.coregraphics.struct.CGRect;
import ios.coregraphics.struct.CGSize;
import ios.corevideo.opaque.CVBufferRef;
import ios.foundation.NSDictionary;
import ios.opengles.EAGLContext;
import ios.metal.protocol.MTLCommandBuffer;
import ios.metal.protocol.MTLDevice;
import ios.metal.protocol.MTLTexture;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.SEL;
import ios.foundation.NSArray;
import ios.foundation.NSMethodSignature;
import ios.foundation.NSSet;

@Generated
@Library("CoreImage")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class CIContext extends NSObject {
	static {
		NatJ.register();
	}

	@Generated
	protected CIContext(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native CIContext alloc();

	/**
	 * contextWithEAGLContext:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/QuartzCoreFramework/Classes/CIContext_Class/index.html#//apple_ref/occ/clm/CIContext/contextWithEAGLContext:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("contextWithEAGLContext:")
	public static native CIContext contextWithEAGLContext(
			EAGLContext eaglContext);

	/**
	 * contextWithEAGLContext:options:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/QuartzCoreFramework/Classes/CIContext_Class/index.html#//apple_ref/occ/clm/CIContext/contextWithEAGLContext:options:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("contextWithEAGLContext:options:")
	public static native CIContext contextWithEAGLContextOptions(
			EAGLContext eaglContext, NSDictionary<String, ?> options);

	/**
	 * contextWithOptions:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/QuartzCoreFramework/Classes/CIContext_Class/index.html#//apple_ref/occ/clm/CIContext/contextWithOptions:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("contextWithOptions:")
	public static native CIContext contextWithOptions(NSDictionary<String, ?> options);

	/**
	 * createCGImage:fromRect:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/QuartzCoreFramework/Classes/CIContext_Class/index.html#//apple_ref/occ/instm/CIContext/createCGImage:fromRect:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("createCGImage:fromRect:")
	public native CGImageRef createCGImageFromRect(CIImage image, @ByValue CGRect fromRect);

	/**
	 * createCGImage:fromRect:format:colorSpace:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/QuartzCoreFramework/Classes/CIContext_Class/index.html#//apple_ref/occ/instm/CIContext/createCGImage:fromRect:format:colorSpace:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("createCGImage:fromRect:format:colorSpace:")
	public native CGImageRef createCGImageFromRectFormatColorSpace(CIImage image,
			@ByValue CGRect fromRect, int format, CGColorSpaceRef colorSpace);

	/**
	 * drawImage:atPoint:fromRect:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/QuartzCoreFramework/Classes/CIContext_Class/index.html#//apple_ref/occ/instm/CIContext/drawImage:atPoint:fromRect:">iOS Dev Center</a>
	 */
	@Generated
	@Deprecated
	@Selector("drawImage:atPoint:fromRect:")
	public native void drawImageAtPointFromRect(CIImage image, @ByValue CGPoint atPoint,
			@ByValue CGRect fromRect);

	/**
	 * drawImage:inRect:fromRect:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/QuartzCoreFramework/Classes/CIContext_Class/index.html#//apple_ref/occ/instm/CIContext/drawImage:inRect:fromRect:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("drawImage:inRect:fromRect:")
	public native void drawImageInRectFromRect(CIImage image,
			@ByValue CGRect inRect, @ByValue CGRect fromRect);

	@Generated
	@Selector("init")
	public native CIContext init();

	/**
	 * inputImageMaximumSize</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/QuartzCoreFramework/Classes/CIContext_Class/index.html#//apple_ref/occ/instm/CIContext/inputImageMaximumSize">iOS Dev Center</a>
	 */
	@Generated
	@Selector("inputImageMaximumSize")
	@ByValue
	public native CGSize inputImageMaximumSize();

	/**
	 * outputImageMaximumSize</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/QuartzCoreFramework/Classes/CIContext_Class/index.html#//apple_ref/occ/instm/CIContext/outputImageMaximumSize">iOS Dev Center</a>
	 */
	@Generated
	@Selector("outputImageMaximumSize")
	@ByValue
	public native CGSize outputImageMaximumSize();

	/**
	 * render:toBitmap:rowBytes:bounds:format:colorSpace:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/QuartzCoreFramework/Classes/CIContext_Class/index.html#//apple_ref/occ/instm/CIContext/render:toBitmap:rowBytes:bounds:format:colorSpace:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("render:toBitmap:rowBytes:bounds:format:colorSpace:")
	public native void renderToBitmapRowBytesBoundsFormatColorSpace(CIImage image,
			VoidPtr data, @NInt long rowBytes, @ByValue CGRect bounds, int format,
			CGColorSpaceRef colorSpace);

	/**
	 * render:toCVPixelBuffer:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/QuartzCoreFramework/Classes/CIContext_Class/index.html#//apple_ref/occ/instm/CIContext/render:toCVPixelBuffer:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("render:toCVPixelBuffer:")
	public native void renderToCVPixelBuffer(CIImage image, CVBufferRef buffer);

	/**
	 * render:toCVPixelBuffer:bounds:colorSpace:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/QuartzCoreFramework/Classes/CIContext_Class/index.html#//apple_ref/occ/instm/CIContext/render:toCVPixelBuffer:bounds:colorSpace:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("render:toCVPixelBuffer:bounds:colorSpace:")
	public native void renderToCVPixelBufferBoundsColorSpace(CIImage image,
			CVBufferRef buffer, @ByValue CGRect bounds, CGColorSpaceRef colorSpace);

	/**
	 * contextWithCGContext:options:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/QuartzCoreFramework/Classes/CIContext_Class/index.html#//apple_ref/occ/clm/CIContext/contextWithCGContext:options:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("contextWithCGContext:options:")
	public static native CIContext contextWithCGContextOptions(CGContextRef cgctx, NSDictionary<String, ?> options);

	/**
	 * contextWithMTLDevice:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/QuartzCoreFramework/Classes/CIContext_Class/index.html#//apple_ref/occ/clm/CIContext/contextWithMTLDevice:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("contextWithMTLDevice:")
	public static native CIContext contextWithMTLDevice(@Mapped(ObjCObjectMapper.class) MTLDevice device);

	/**
	 * contextWithMTLDevice:options:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/QuartzCoreFramework/Classes/CIContext_Class/index.html#//apple_ref/occ/clm/CIContext/contextWithMTLDevice:options:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("contextWithMTLDevice:options:")
	public static native CIContext contextWithMTLDeviceOptions(@Mapped(ObjCObjectMapper.class) MTLDevice device,
			NSDictionary<String, ?> options);

	/**
	 * render:toMTLTexture:commandBuffer:bounds:colorSpace:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/QuartzCoreFramework/Classes/CIContext_Class/index.html#//apple_ref/occ/instm/CIContext/render:toMTLTexture:commandBuffer:bounds:colorSpace:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("render:toMTLTexture:commandBuffer:bounds:colorSpace:")
	public native void renderToMTLTextureCommandBufferBoundsColorSpace(CIImage image,
			@Mapped(ObjCObjectMapper.class) MTLTexture texture, @Mapped(ObjCObjectMapper.class) MTLCommandBuffer commandBuffer,
			@ByValue CGRect bounds, CGColorSpaceRef colorSpace);

	/**
	 * workingColorSpace</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/QuartzCoreFramework/Classes/CIContext_Class/index.html#//apple_ref/occ/instp/CIContext/workingColorSpace">iOS Dev Center</a>
	 */
	@Generated
	@Selector("workingColorSpace")
	public native CGColorSpaceRef workingColorSpace();

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

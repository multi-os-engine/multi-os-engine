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

package ios.corevideo.c;


import org.moe.natj.c.CRuntime;
import org.moe.natj.c.ann.CFunction;
import org.moe.natj.c.ann.CVariable;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.ReferenceInfo;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.ConstVoidPtr;
import org.moe.natj.general.ptr.IntPtr;
import org.moe.natj.general.ptr.NUIntPtr;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.map.ObjCObjectMapper;

import ios.corefoundation.opaque.CFAllocatorRef;
import ios.corefoundation.opaque.CFArrayRef;
import ios.corefoundation.opaque.CFDictionaryRef;
import ios.corefoundation.opaque.CFStringRef;
import ios.coregraphics.struct.CGRect;
import ios.coregraphics.struct.CGSize;
import ios.corevideo.opaque.CVBufferRef;
import ios.corevideo.opaque.CVMetalTextureCacheRef;
import ios.corevideo.opaque.CVOpenGLESTextureCacheRef;
import ios.corevideo.opaque.CVPixelBufferPoolRef;
import ios.corevideo.struct.CVTime;
import ios.opengles.EAGLContext;

@Generated
@Library("CoreVideo")
@Runtime(CRuntime.class)
public final class CoreVideo {
	static {
		NatJ.register();
	}

	@Generated
	private CoreVideo() {
	}

	/**
	 * CVBufferRetain</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/QuartzCore/Reference/CVBufferRef/index.html#//apple_ref/c/func/CVBufferRetain">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	public static native CVBufferRef CVBufferRetain(CVBufferRef buffer);

	/**
	 * CVBufferRelease</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/QuartzCore/Reference/CVBufferRef/index.html#//apple_ref/c/func/CVBufferRelease">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	public static native void CVBufferRelease(CVBufferRef buffer);

	/**
	 * CVBufferSetAttachment</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/QuartzCore/Reference/CVBufferRef/index.html#//apple_ref/c/func/CVBufferSetAttachment">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	public static native void CVBufferSetAttachment(CVBufferRef buffer,
			CFStringRef key, ConstVoidPtr value, int attachmentMode);

	/**
	 * CVBufferGetAttachment</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/QuartzCore/Reference/CVBufferRef/index.html#//apple_ref/c/func/CVBufferGetAttachment">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	public static native ConstVoidPtr CVBufferGetAttachment(CVBufferRef buffer,
			CFStringRef key, IntPtr attachmentMode);

	/**
	 * CVBufferRemoveAttachment</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/QuartzCore/Reference/CVBufferRef/index.html#//apple_ref/c/func/CVBufferRemoveAttachment">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	public static native void CVBufferRemoveAttachment(CVBufferRef buffer,
			CFStringRef key);

	/**
	 * CVBufferRemoveAllAttachments</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/QuartzCore/Reference/CVBufferRef/index.html#//apple_ref/c/func/CVBufferRemoveAllAttachments">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	public static native void CVBufferRemoveAllAttachments(CVBufferRef buffer);

	/**
	 * CVBufferGetAttachments</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/QuartzCore/Reference/CVBufferRef/index.html#//apple_ref/c/func/CVBufferGetAttachments">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	public static native CFDictionaryRef CVBufferGetAttachments(
			CVBufferRef buffer, int attachmentMode);

	/**
	 * CVBufferSetAttachments</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/QuartzCore/Reference/CVBufferRef/index.html#//apple_ref/c/func/CVBufferSetAttachments">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	public static native void CVBufferSetAttachments(CVBufferRef buffer,
			CFDictionaryRef theAttachments, int attachmentMode);

	/**
	 * CVBufferPropagateAttachments</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/QuartzCore/Reference/CVBufferRef/index.html#//apple_ref/c/func/CVBufferPropagateAttachments">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	public static native void CVBufferPropagateAttachments(
			CVBufferRef sourceBuffer, CVBufferRef destinationBuffer);

	/**
	 * CVImageBufferGetEncodedSize</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/QuartzCore/Reference/CVImageBufferRef/index.html#//apple_ref/c/func/CVImageBufferGetEncodedSize">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	@ByValue
	public static native CGSize CVImageBufferGetEncodedSize(
			CVBufferRef imageBuffer);

	/**
	 * CVImageBufferGetDisplaySize</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/QuartzCore/Reference/CVImageBufferRef/index.html#//apple_ref/c/func/CVImageBufferGetDisplaySize">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	@ByValue
	public static native CGSize CVImageBufferGetDisplaySize(
			CVBufferRef imageBuffer);

	/**
	 * CVImageBufferGetCleanRect</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/QuartzCore/Reference/CVImageBufferRef/index.html#//apple_ref/c/func/CVImageBufferGetCleanRect">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	@ByValue
	public static native CGRect CVImageBufferGetCleanRect(
			CVBufferRef imageBuffer);

	/**
	 * CVImageBufferIsFlipped</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/QuartzCore/Reference/CVImageBufferRef/index.html#//apple_ref/c/func/CVImageBufferIsFlipped">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	public static native byte CVImageBufferIsFlipped(CVBufferRef imageBuffer);

	/**
	 * CVPixelBufferGetTypeID</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/QuartzCore/Reference/CVPixelBufferRef/index.html#//apple_ref/c/func/CVPixelBufferGetTypeID">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	@NUInt
	public static native long CVPixelBufferGetTypeID();

	/**
	 * CVPixelBufferRetain</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/QuartzCore/Reference/CVPixelBufferRef/index.html#//apple_ref/c/func/CVPixelBufferRetain">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	public static native CVBufferRef CVPixelBufferRetain(CVBufferRef texture);

	/**
	 * CVPixelBufferRelease</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/QuartzCore/Reference/CVPixelBufferRef/index.html#//apple_ref/c/func/CVPixelBufferRelease">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	public static native void CVPixelBufferRelease(CVBufferRef texture);

	/**
	 * CVPixelBufferCreateResolvedAttributesDictionary</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/QuartzCore/Reference/CVPixelBufferRef/index.html#//apple_ref/c/func/CVPixelBufferCreateResolvedAttributesDictionary">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	public static native int CVPixelBufferCreateResolvedAttributesDictionary(
			CFAllocatorRef allocator, CFArrayRef attributes,
			Ptr<CFDictionaryRef> resolvedDictionaryOut);

	/**
	 * CVPixelBufferCreate</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/QuartzCore/Reference/CVPixelBufferRef/index.html#//apple_ref/c/func/CVPixelBufferCreate">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	public static native int CVPixelBufferCreate(CFAllocatorRef allocator,
			@NUInt long width, @NUInt long height, int pixelFormatType,
			CFDictionaryRef pixelBufferAttributes,
			Ptr<CVBufferRef> pixelBufferOut);

	/**
	 * CVPixelBufferCreateWithBytes</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/QuartzCore/Reference/CVPixelBufferRef/index.html#//apple_ref/c/func/CVPixelBufferCreateWithBytes">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	public static native int CVPixelBufferCreateWithBytes(
			CFAllocatorRef allocator,
			@NUInt long width,
			@NUInt long height,
			int pixelFormatType,
			VoidPtr baseAddress,
			@NUInt long bytesPerRow,
			@FunctionPtr(name = "call_CVPixelBufferCreateWithBytes") Function_CVPixelBufferCreateWithBytes releaseCallback,
			VoidPtr releaseRefCon, CFDictionaryRef pixelBufferAttributes,
			Ptr<CVBufferRef> pixelBufferOut);

	@Runtime(CRuntime.class)
	@Generated
	public interface Function_CVPixelBufferCreateWithBytes {
		@Generated
		void call_CVPixelBufferCreateWithBytes(VoidPtr arg0,
				ConstVoidPtr arg1);
	}

	/**
	 * CVPixelBufferCreateWithPlanarBytes</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/QuartzCore/Reference/CVPixelBufferRef/index.html#//apple_ref/c/func/CVPixelBufferCreateWithPlanarBytes">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	public static native int CVPixelBufferCreateWithPlanarBytes(
			CFAllocatorRef allocator,
			@NUInt long width,
			@NUInt long height,
			int pixelFormatType,
			VoidPtr dataPtr,
			@NUInt long dataSize,
			@NUInt long numberOfPlanes,
			Ptr<VoidPtr> planeBaseAddress,
			NUIntPtr planeWidth,
			NUIntPtr planeHeight,
			NUIntPtr planeBytesPerRow,
			@FunctionPtr(name = "call_CVPixelBufferCreateWithPlanarBytes") Function_CVPixelBufferCreateWithPlanarBytes releaseCallback,
			VoidPtr releaseRefCon, CFDictionaryRef pixelBufferAttributes,
			Ptr<CVBufferRef> pixelBufferOut);

	@Runtime(CRuntime.class)
	@Generated
	public interface Function_CVPixelBufferCreateWithPlanarBytes {
		@Generated
		void call_CVPixelBufferCreateWithPlanarBytes(VoidPtr arg0,
				ConstVoidPtr arg1, @NUInt long arg2, @NUInt long arg3,
				@ReferenceInfo(type = Void.class, depth = 2) Ptr<ConstVoidPtr> arg4);
	}

	/**
	 * CVPixelBufferLockBaseAddress</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/QuartzCore/Reference/CVPixelBufferRef/index.html#//apple_ref/c/func/CVPixelBufferLockBaseAddress">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	public static native int CVPixelBufferLockBaseAddress(
			CVBufferRef pixelBuffer, long lockFlags);

	/**
	 * CVPixelBufferUnlockBaseAddress</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/QuartzCore/Reference/CVPixelBufferRef/index.html#//apple_ref/c/func/CVPixelBufferUnlockBaseAddress">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	public static native int CVPixelBufferUnlockBaseAddress(
			CVBufferRef pixelBuffer, long unlockFlags);

	/**
	 * CVPixelBufferGetWidth</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/QuartzCore/Reference/CVPixelBufferRef/index.html#//apple_ref/c/func/CVPixelBufferGetWidth">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	@NUInt
	public static native long CVPixelBufferGetWidth(CVBufferRef pixelBuffer);

	/**
	 * CVPixelBufferGetHeight</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/QuartzCore/Reference/CVPixelBufferRef/index.html#//apple_ref/c/func/CVPixelBufferGetHeight">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	@NUInt
	public static native long CVPixelBufferGetHeight(CVBufferRef pixelBuffer);

	/**
	 * CVPixelBufferGetPixelFormatType</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/QuartzCore/Reference/CVPixelBufferRef/index.html#//apple_ref/c/func/CVPixelBufferGetPixelFormatType">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	public static native int CVPixelBufferGetPixelFormatType(
			CVBufferRef pixelBuffer);

	/**
	 * CVPixelBufferGetBaseAddress</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/QuartzCore/Reference/CVPixelBufferRef/index.html#//apple_ref/c/func/CVPixelBufferGetBaseAddress">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	public static native VoidPtr CVPixelBufferGetBaseAddress(
			CVBufferRef pixelBuffer);

	/**
	 * CVPixelBufferGetBytesPerRow</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/QuartzCore/Reference/CVPixelBufferRef/index.html#//apple_ref/c/func/CVPixelBufferGetBytesPerRow">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	@NUInt
	public static native long CVPixelBufferGetBytesPerRow(
			CVBufferRef pixelBuffer);

	/**
	 * CVPixelBufferGetDataSize</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/QuartzCore/Reference/CVPixelBufferRef/index.html#//apple_ref/c/func/CVPixelBufferGetDataSize">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	@NUInt
	public static native long CVPixelBufferGetDataSize(CVBufferRef pixelBuffer);

	/**
	 * CVPixelBufferIsPlanar</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/QuartzCore/Reference/CVPixelBufferRef/index.html#//apple_ref/c/func/CVPixelBufferIsPlanar">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	public static native byte CVPixelBufferIsPlanar(CVBufferRef pixelBuffer);

	/**
	 * CVPixelBufferGetPlaneCount</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/QuartzCore/Reference/CVPixelBufferRef/index.html#//apple_ref/c/func/CVPixelBufferGetPlaneCount">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	@NUInt
	public static native long CVPixelBufferGetPlaneCount(CVBufferRef pixelBuffer);

	/**
	 * CVPixelBufferGetWidthOfPlane</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/QuartzCore/Reference/CVPixelBufferRef/index.html#//apple_ref/c/func/CVPixelBufferGetWidthOfPlane">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	@NUInt
	public static native long CVPixelBufferGetWidthOfPlane(
			CVBufferRef pixelBuffer, @NUInt long planeIndex);

	/**
	 * CVPixelBufferGetHeightOfPlane</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/QuartzCore/Reference/CVPixelBufferRef/index.html#//apple_ref/c/func/CVPixelBufferGetHeightOfPlane">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	@NUInt
	public static native long CVPixelBufferGetHeightOfPlane(
			CVBufferRef pixelBuffer, @NUInt long planeIndex);

	/**
	 * CVPixelBufferGetBaseAddressOfPlane</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/QuartzCore/Reference/CVPixelBufferRef/index.html#//apple_ref/c/func/CVPixelBufferGetBaseAddressOfPlane">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	public static native VoidPtr CVPixelBufferGetBaseAddressOfPlane(
			CVBufferRef pixelBuffer, @NUInt long planeIndex);

	/**
	 * CVPixelBufferGetBytesPerRowOfPlane</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/QuartzCore/Reference/CVPixelBufferRef/index.html#//apple_ref/c/func/CVPixelBufferGetBytesPerRowOfPlane">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	@NUInt
	public static native long CVPixelBufferGetBytesPerRowOfPlane(
			CVBufferRef pixelBuffer, @NUInt long planeIndex);

	/**
	 * CVPixelBufferGetExtendedPixels</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/QuartzCore/Reference/CVPixelBufferRef/index.html#//apple_ref/c/func/CVPixelBufferGetExtendedPixels">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	public static native void CVPixelBufferGetExtendedPixels(
			CVBufferRef pixelBuffer, NUIntPtr extraColumnsOnLeft,
			NUIntPtr extraColumnsOnRight, NUIntPtr extraRowsOnTop,
			NUIntPtr extraRowsOnBottom);

	/**
	 * CVPixelBufferFillExtendedPixels</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/QuartzCore/Reference/CVPixelBufferRef/index.html#//apple_ref/c/func/CVPixelBufferFillExtendedPixels">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	public static native int CVPixelBufferFillExtendedPixels(
			CVBufferRef pixelBuffer);

	/**
	 * CVPixelBufferPoolGetTypeID</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/QuartzCore/Reference/CVPixelBufferPoolRef/index.html#//apple_ref/c/func/CVPixelBufferPoolGetTypeID">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	@NUInt
	public static native long CVPixelBufferPoolGetTypeID();

	/**
	 * CVPixelBufferPoolRetain</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/QuartzCore/Reference/CVPixelBufferPoolRef/index.html#//apple_ref/c/func/CVPixelBufferPoolRetain">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	public static native CVPixelBufferPoolRef CVPixelBufferPoolRetain(
			CVPixelBufferPoolRef pixelBufferPool);

	/**
	 * CVPixelBufferPoolRelease</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/QuartzCore/Reference/CVPixelBufferPoolRef/index.html#//apple_ref/c/func/CVPixelBufferPoolRelease">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	public static native void CVPixelBufferPoolRelease(
			CVPixelBufferPoolRef pixelBufferPool);

	/**
	 * CVPixelBufferPoolCreate</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/QuartzCore/Reference/CVPixelBufferPoolRef/index.html#//apple_ref/c/func/CVPixelBufferPoolCreate">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	public static native int CVPixelBufferPoolCreate(CFAllocatorRef allocator,
			CFDictionaryRef poolAttributes,
			CFDictionaryRef pixelBufferAttributes,
			Ptr<CVPixelBufferPoolRef> poolOut);

	/**
	 * CVPixelBufferPoolGetAttributes</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/QuartzCore/Reference/CVPixelBufferPoolRef/index.html#//apple_ref/c/func/CVPixelBufferPoolGetAttributes">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	public static native CFDictionaryRef CVPixelBufferPoolGetAttributes(
			CVPixelBufferPoolRef pool);

	/**
	 * CVPixelBufferPoolGetPixelBufferAttributes</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/QuartzCore/Reference/CVPixelBufferPoolRef/index.html#//apple_ref/c/func/CVPixelBufferPoolGetPixelBufferAttributes">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	public static native CFDictionaryRef CVPixelBufferPoolGetPixelBufferAttributes(
			CVPixelBufferPoolRef pool);

	/**
	 * CVPixelBufferPoolCreatePixelBuffer</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/QuartzCore/Reference/CVPixelBufferPoolRef/index.html#//apple_ref/c/func/CVPixelBufferPoolCreatePixelBuffer">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	public static native int CVPixelBufferPoolCreatePixelBuffer(
			CFAllocatorRef allocator, CVPixelBufferPoolRef pixelBufferPool,
			Ptr<CVBufferRef> pixelBufferOut);

	/**
	 * CVPixelBufferPoolCreatePixelBufferWithAuxAttributes</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/QuartzCore/Reference/CVPixelBufferPoolRef/index.html#//apple_ref/c/func/CVPixelBufferPoolCreatePixelBufferWithAuxAttributes">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	public static native int CVPixelBufferPoolCreatePixelBufferWithAuxAttributes(
			CFAllocatorRef allocator, CVPixelBufferPoolRef pixelBufferPool,
			CFDictionaryRef auxAttributes, Ptr<CVBufferRef> pixelBufferOut);

	/**
	 * CVOpenGLESTextureGetTypeID</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreVideo/Reference/CVOpenGLESTextureRef/index.html#//apple_ref/c/func/CVOpenGLESTextureGetTypeID">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	@NUInt
	public static native long CVOpenGLESTextureGetTypeID();

	/**
	 * CVOpenGLESTextureGetTarget</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreVideo/Reference/CVOpenGLESTextureRef/index.html#//apple_ref/c/func/CVOpenGLESTextureGetTarget">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	public static native int CVOpenGLESTextureGetTarget(CVBufferRef image);

	/**
	 * CVOpenGLESTextureGetName</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreVideo/Reference/CVOpenGLESTextureRef/index.html#//apple_ref/c/func/CVOpenGLESTextureGetName">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	public static native int CVOpenGLESTextureGetName(CVBufferRef image);

	/**
	 * CVOpenGLESTextureIsFlipped</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreVideo/Reference/CVOpenGLESTextureRef/index.html#//apple_ref/c/func/CVOpenGLESTextureIsFlipped">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	public static native byte CVOpenGLESTextureIsFlipped(CVBufferRef image);

	/**
	 * CVOpenGLESTextureCacheGetTypeID</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreVideo/Reference/CVOpenGLESTextureCacheRef/index.html#//apple_ref/c/func/CVOpenGLESTextureCacheGetTypeID">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	@NUInt
	public static native long CVOpenGLESTextureCacheGetTypeID();

	/**
	 * CVOpenGLESTextureCacheCreate</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreVideo/Reference/CVOpenGLESTextureCacheRef/index.html#//apple_ref/c/func/CVOpenGLESTextureCacheCreate">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	public static native int CVOpenGLESTextureCacheCreate(
			CFAllocatorRef allocator, CFDictionaryRef cacheAttributes,
			EAGLContext eaglContext, CFDictionaryRef textureAttributes,
			Ptr<CVOpenGLESTextureCacheRef> cacheOut);

	/**
	 * CVOpenGLESTextureCacheCreateTextureFromImage</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreVideo/Reference/CVOpenGLESTextureCacheRef/index.html#//apple_ref/c/func/CVOpenGLESTextureCacheCreateTextureFromImage">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	public static native int CVOpenGLESTextureCacheCreateTextureFromImage(
			CFAllocatorRef allocator, CVOpenGLESTextureCacheRef textureCache,
			CVBufferRef sourceImage, CFDictionaryRef textureAttributes,
			int target, int internalFormat, int width, int height, int format,
			int type, @NUInt long planeIndex, Ptr<CVBufferRef> textureOut);

	/**
	 * CVOpenGLESTextureCacheFlush</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreVideo/Reference/CVOpenGLESTextureCacheRef/index.html#//apple_ref/c/func/CVOpenGLESTextureCacheFlush">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	public static native void CVOpenGLESTextureCacheFlush(
			CVOpenGLESTextureCacheRef textureCache, long options);

	/**
	 * CVPixelFormatDescriptionCreateWithPixelFormatType</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/QuartzCore/Reference/CVPixelFormatDescriptionRef/index.html#//apple_ref/c/func/CVPixelFormatDescriptionCreateWithPixelFormatType">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	public static native CFDictionaryRef CVPixelFormatDescriptionCreateWithPixelFormatType(
			CFAllocatorRef allocator, int pixelFormat);

	/**
	 * CVPixelFormatDescriptionArrayCreateWithAllPixelFormatTypes</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/QuartzCore/Reference/CVPixelFormatDescriptionRef/index.html#//apple_ref/c/func/CVPixelFormatDescriptionArrayCreateWithAllPixelFormatTypes">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	public static native CFArrayRef CVPixelFormatDescriptionArrayCreateWithAllPixelFormatTypes(
			CFAllocatorRef allocator);

	/**
	 * CVPixelFormatDescriptionRegisterDescriptionWithPixelFormatType</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/QuartzCore/Reference/CVPixelFormatDescriptionRef/index.html#//apple_ref/c/func/CVPixelFormatDescriptionRegisterDescriptionWithPixelFormatType">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	public static native void CVPixelFormatDescriptionRegisterDescriptionWithPixelFormatType(
			CFDictionaryRef description, int pixelFormat);

	/**
	 * CVMetalTextureGetTypeID</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreVideo/Reference/CVMetalTextureRef/index.html#//apple_ref/c/func/CVMetalTextureGetTypeID">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	@NUInt
	public static native long CVMetalTextureGetTypeID();

	/**
	 * CVMetalTextureGetTexture</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreVideo/Reference/CVMetalTextureRef/index.html#//apple_ref/c/func/CVMetalTextureGetTexture">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object CVMetalTextureGetTexture(CVBufferRef image);

	/**
	 * CVMetalTextureIsFlipped</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreVideo/Reference/CVMetalTextureRef/index.html#//apple_ref/c/func/CVMetalTextureIsFlipped">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	public static native byte CVMetalTextureIsFlipped(CVBufferRef image);

	/**
	 * CVMetalTextureCacheGetTypeID</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreVideo/Reference/CVMetalTextureCacheRef/index.html#//apple_ref/c/func/CVMetalTextureCacheGetTypeID">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	@NUInt
	public static native long CVMetalTextureCacheGetTypeID();

	/**
	 * CVMetalTextureCacheCreate</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreVideo/Reference/CVMetalTextureCacheRef/index.html#//apple_ref/c/func/CVMetalTextureCacheCreate">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	public static native int CVMetalTextureCacheCreate(
			CFAllocatorRef allocator, CFDictionaryRef cacheAttributes,
			@Mapped(ObjCObjectMapper.class) Object metalDevice,
			CFDictionaryRef textureAttributes,
			Ptr<CVMetalTextureCacheRef> cacheOut);

	/**
	 * CVMetalTextureCacheCreateTextureFromImage</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreVideo/Reference/CVMetalTextureCacheRef/index.html#//apple_ref/c/func/CVMetalTextureCacheCreateTextureFromImage">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	public static native int CVMetalTextureCacheCreateTextureFromImage(
			CFAllocatorRef allocator, CVMetalTextureCacheRef textureCache,
			CVBufferRef sourceImage, CFDictionaryRef textureAttributes,
			@NUInt long pixelFormat, @NUInt long width, @NUInt long height,
			@NUInt long planeIndex, Ptr<CVBufferRef> textureOut);

	/**
	 * CVMetalTextureCacheFlush</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreVideo/Reference/CVMetalTextureCacheRef/index.html#//apple_ref/c/func/CVMetalTextureCacheFlush">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	public static native void CVMetalTextureCacheFlush(
			CVMetalTextureCacheRef textureCache, long options);

	@Generated
	@CVariable()
	@ByValue
	public static native CVTime kCVZeroTime();

	@Generated
	@CVariable()
	@ByValue
	public static native CVTime kCVIndefiniteTime();

	@Generated
	@CVariable()
	public static native CFStringRef kCVBufferPropagatedAttachmentsKey();

	@Generated
	@CVariable()
	public static native CFStringRef kCVBufferNonPropagatedAttachmentsKey();

	@Generated
	@CVariable()
	public static native CFStringRef kCVBufferMovieTimeKey();

	@Generated
	@CVariable()
	public static native CFStringRef kCVBufferTimeValueKey();

	@Generated
	@CVariable()
	public static native CFStringRef kCVBufferTimeScaleKey();

	@Generated
	@CVariable()
	public static native CFStringRef kCVImageBufferCGColorSpaceKey();

	@Generated
	@CVariable()
	public static native CFStringRef kCVImageBufferCleanApertureKey();

	@Generated
	@CVariable()
	public static native CFStringRef kCVImageBufferCleanApertureWidthKey();

	@Generated
	@CVariable()
	public static native CFStringRef kCVImageBufferCleanApertureHeightKey();

	@Generated
	@CVariable()
	public static native CFStringRef kCVImageBufferCleanApertureHorizontalOffsetKey();

	@Generated
	@CVariable()
	public static native CFStringRef kCVImageBufferCleanApertureVerticalOffsetKey();

	@Generated
	@CVariable()
	public static native CFStringRef kCVImageBufferPreferredCleanApertureKey();

	@Generated
	@CVariable()
	public static native CFStringRef kCVImageBufferFieldCountKey();

	@Generated
	@CVariable()
	public static native CFStringRef kCVImageBufferFieldDetailKey();

	@Generated
	@CVariable()
	public static native CFStringRef kCVImageBufferFieldDetailTemporalTopFirst();

	@Generated
	@CVariable()
	public static native CFStringRef kCVImageBufferFieldDetailTemporalBottomFirst();

	@Generated
	@CVariable()
	public static native CFStringRef kCVImageBufferFieldDetailSpatialFirstLineEarly();

	@Generated
	@CVariable()
	public static native CFStringRef kCVImageBufferFieldDetailSpatialFirstLineLate();

	@Generated
	@CVariable()
	public static native CFStringRef kCVImageBufferPixelAspectRatioKey();

	@Generated
	@CVariable()
	public static native CFStringRef kCVImageBufferPixelAspectRatioHorizontalSpacingKey();

	@Generated
	@CVariable()
	public static native CFStringRef kCVImageBufferPixelAspectRatioVerticalSpacingKey();

	@Generated
	@CVariable()
	public static native CFStringRef kCVImageBufferDisplayDimensionsKey();

	@Generated
	@CVariable()
	public static native CFStringRef kCVImageBufferDisplayWidthKey();

	@Generated
	@CVariable()
	public static native CFStringRef kCVImageBufferDisplayHeightKey();

	@Generated
	@CVariable()
	public static native CFStringRef kCVImageBufferGammaLevelKey();

	@Generated
	@CVariable()
	public static native CFStringRef kCVImageBufferICCProfileKey();

	@Generated
	@CVariable()
	public static native CFStringRef kCVImageBufferYCbCrMatrixKey();

	@Generated
	@CVariable()
	public static native CFStringRef kCVImageBufferYCbCrMatrix_ITU_R_709_2();

	@Generated
	@CVariable()
	public static native CFStringRef kCVImageBufferYCbCrMatrix_ITU_R_601_4();

	@Generated
	@CVariable()
	public static native CFStringRef kCVImageBufferYCbCrMatrix_SMPTE_240M_1995();

	@Generated
	@CVariable()
	public static native CFStringRef kCVImageBufferColorPrimariesKey();

	@Generated
	@CVariable()
	public static native CFStringRef kCVImageBufferColorPrimaries_ITU_R_709_2();

	@Generated
	@CVariable()
	public static native CFStringRef kCVImageBufferColorPrimaries_EBU_3213();

	@Generated
	@CVariable()
	public static native CFStringRef kCVImageBufferColorPrimaries_SMPTE_C();

	@Generated
	@CVariable()
	public static native CFStringRef kCVImageBufferColorPrimaries_P22();

	@Generated
	@CVariable()
	public static native CFStringRef kCVImageBufferTransferFunctionKey();

	@Generated
	@CVariable()
	public static native CFStringRef kCVImageBufferTransferFunction_ITU_R_709_2();

	@Generated
	@CVariable()
	public static native CFStringRef kCVImageBufferTransferFunction_SMPTE_240M_1995();

	@Generated
	@CVariable()
	public static native CFStringRef kCVImageBufferTransferFunction_UseGamma();

	@Generated
	@CVariable()
	public static native CFStringRef kCVImageBufferChromaLocationTopFieldKey();

	@Generated
	@CVariable()
	public static native CFStringRef kCVImageBufferChromaLocationBottomFieldKey();

	@Generated
	@CVariable()
	public static native CFStringRef kCVImageBufferChromaLocation_Left();

	@Generated
	@CVariable()
	public static native CFStringRef kCVImageBufferChromaLocation_Center();

	@Generated
	@CVariable()
	public static native CFStringRef kCVImageBufferChromaLocation_TopLeft();

	@Generated
	@CVariable()
	public static native CFStringRef kCVImageBufferChromaLocation_Top();

	@Generated
	@CVariable()
	public static native CFStringRef kCVImageBufferChromaLocation_BottomLeft();

	@Generated
	@CVariable()
	public static native CFStringRef kCVImageBufferChromaLocation_Bottom();

	@Generated
	@CVariable()
	public static native CFStringRef kCVImageBufferChromaLocation_DV420();

	@Generated
	@CVariable()
	public static native CFStringRef kCVImageBufferChromaSubsamplingKey();

	@Generated
	@CVariable()
	public static native CFStringRef kCVImageBufferChromaSubsampling_420();

	@Generated
	@CVariable()
	public static native CFStringRef kCVImageBufferChromaSubsampling_422();

	@Generated
	@CVariable()
	public static native CFStringRef kCVImageBufferChromaSubsampling_411();

	@Generated
	@CVariable()
	public static native CFStringRef kCVImageBufferAlphaChannelIsOpaque();

	@Generated
	@CVariable()
	public static native CFStringRef kCVPixelBufferPixelFormatTypeKey();

	@Generated
	@CVariable()
	public static native CFStringRef kCVPixelBufferMemoryAllocatorKey();

	@Generated
	@CVariable()
	public static native CFStringRef kCVPixelBufferWidthKey();

	@Generated
	@CVariable()
	public static native CFStringRef kCVPixelBufferHeightKey();

	@Generated
	@CVariable()
	public static native CFStringRef kCVPixelBufferExtendedPixelsLeftKey();

	@Generated
	@CVariable()
	public static native CFStringRef kCVPixelBufferExtendedPixelsTopKey();

	@Generated
	@CVariable()
	public static native CFStringRef kCVPixelBufferExtendedPixelsRightKey();

	@Generated
	@CVariable()
	public static native CFStringRef kCVPixelBufferExtendedPixelsBottomKey();

	@Generated
	@CVariable()
	public static native CFStringRef kCVPixelBufferBytesPerRowAlignmentKey();

	@Generated
	@CVariable()
	public static native CFStringRef kCVPixelBufferCGBitmapContextCompatibilityKey();

	@Generated
	@CVariable()
	public static native CFStringRef kCVPixelBufferCGImageCompatibilityKey();

	@Generated
	@CVariable()
	public static native CFStringRef kCVPixelBufferOpenGLCompatibilityKey();

	@Generated
	@CVariable()
	public static native CFStringRef kCVPixelBufferPlaneAlignmentKey();

	@Generated
	@CVariable()
	public static native CFStringRef kCVPixelBufferIOSurfacePropertiesKey();

	@Generated
	@CVariable()
	public static native CFStringRef kCVPixelBufferOpenGLESCompatibilityKey();

	@Generated
	@CVariable()
	public static native CFStringRef kCVPixelBufferMetalCompatibilityKey();

	@Generated
	@CVariable()
	public static native CFStringRef kCVPixelBufferPoolMinimumBufferCountKey();

	@Generated
	@CVariable()
	public static native CFStringRef kCVPixelBufferPoolMaximumBufferAgeKey();

	@Generated
	@CVariable()
	public static native CFStringRef kCVPixelBufferPoolAllocationThresholdKey();

	@Generated
	@CVariable()
	public static native CFStringRef kCVPixelBufferPoolFreeBufferNotification();

	@Generated
	@CVariable()
	public static native CFStringRef kCVOpenGLESTextureCacheMaximumTextureAgeKey();

	@Generated
	@CVariable()
	public static native CFStringRef kCVPixelFormatName();

	@Generated
	@CVariable()
	public static native CFStringRef kCVPixelFormatConstant();

	@Generated
	@CVariable()
	public static native CFStringRef kCVPixelFormatCodecType();

	@Generated
	@CVariable()
	public static native CFStringRef kCVPixelFormatFourCC();

	@Generated
	@CVariable()
	public static native CFStringRef kCVPixelFormatContainsAlpha();

	@Generated
	@CVariable()
	public static native CFStringRef kCVPixelFormatContainsYCbCr();

	@Generated
	@CVariable()
	public static native CFStringRef kCVPixelFormatContainsRGB();

	@Generated
	@CVariable()
	public static native CFStringRef kCVPixelFormatPlanes();

	@Generated
	@CVariable()
	public static native CFStringRef kCVPixelFormatBlockWidth();

	@Generated
	@CVariable()
	public static native CFStringRef kCVPixelFormatBlockHeight();

	@Generated
	@CVariable()
	public static native CFStringRef kCVPixelFormatBitsPerBlock();

	@Generated
	@CVariable()
	public static native CFStringRef kCVPixelFormatBlockHorizontalAlignment();

	@Generated
	@CVariable()
	public static native CFStringRef kCVPixelFormatBlockVerticalAlignment();

	@Generated
	@CVariable()
	public static native CFStringRef kCVPixelFormatBlackBlock();

	@Generated
	@CVariable()
	public static native CFStringRef kCVPixelFormatHorizontalSubsampling();

	@Generated
	@CVariable()
	public static native CFStringRef kCVPixelFormatVerticalSubsampling();

	@Generated
	@CVariable()
	public static native CFStringRef kCVPixelFormatOpenGLFormat();

	@Generated
	@CVariable()
	public static native CFStringRef kCVPixelFormatOpenGLType();

	@Generated
	@CVariable()
	public static native CFStringRef kCVPixelFormatOpenGLInternalFormat();

	@Generated
	@CVariable()
	public static native CFStringRef kCVPixelFormatCGBitmapInfo();

	@Generated
	@CVariable()
	public static native CFStringRef kCVPixelFormatQDCompatibility();

	@Generated
	@CVariable()
	public static native CFStringRef kCVPixelFormatCGBitmapContextCompatibility();

	@Generated
	@CVariable()
	public static native CFStringRef kCVPixelFormatCGImageCompatibility();

	@Generated
	@CVariable()
	public static native CFStringRef kCVPixelFormatOpenGLCompatibility();

	@Generated
	@CVariable()
	public static native CFStringRef kCVPixelFormatOpenGLESCompatibility();

	@Generated
	@CVariable()
	public static native CFStringRef kCVPixelFormatFillExtendedPixelsCallback();

	@Generated
	@CVariable()
	public static native CFStringRef kCVMetalTextureCacheMaximumTextureAgeKey();

	@Generated
	@CFunction
	public static native void CVPixelBufferPoolFlush(CVPixelBufferPoolRef pool, long options);

	@Generated
	@CVariable()
	public static native CFStringRef kCVImageBufferYCbCrMatrix_DCI_P3();

	@Generated
	@CVariable()
	public static native CFStringRef kCVImageBufferYCbCrMatrix_P3_D65();

	@Generated
	@CVariable()
	public static native CFStringRef kCVImageBufferYCbCrMatrix_ITU_R_2020();

	@Generated
	@CVariable()
	public static native CFStringRef kCVImageBufferColorPrimaries_DCI_P3();

	@Generated
	@CVariable()
	public static native CFStringRef kCVImageBufferColorPrimaries_P3_D65();

	@Generated
	@CVariable()
	public static native CFStringRef kCVImageBufferColorPrimaries_ITU_R_2020();

	@Generated
	@CVariable()
	public static native CFStringRef kCVImageBufferTransferFunction_ITU_R_2020();

	@Generated
	@CVariable()
	public static native CFStringRef kCVPixelBufferOpenGLESTextureCacheCompatibilityKey();

	@Generated
	@CVariable()
	public static native CFStringRef kCVPixelFormatComponentRange();

	@Generated
	@CVariable()
	public static native CFStringRef kCVPixelFormatComponentRange_VideoRange();

	@Generated
	@CVariable()
	public static native CFStringRef kCVPixelFormatComponentRange_FullRange();

	@Generated
	@CVariable()
	public static native CFStringRef kCVPixelFormatComponentRange_WideRange();
}

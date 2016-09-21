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

package apple.coreimage;

import apple.NSObject;
import apple.coregraphics.opaque.CGColorSpaceRef;
import apple.coregraphics.opaque.CGContextRef;
import apple.coregraphics.opaque.CGImageRef;
import apple.coregraphics.struct.CGPoint;
import apple.coregraphics.struct.CGRect;
import apple.coregraphics.struct.CGSize;
import apple.corevideo.opaque.CVBufferRef;
import apple.foundation.NSArray;
import apple.foundation.NSDictionary;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.metal.protocol.MTLCommandBuffer;
import apple.metal.protocol.MTLDevice;
import apple.metal.protocol.MTLTexture;
import apple.opengles.EAGLContext;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

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

    @Generated
    @Selector("contextWithEAGLContext:")
    public static native CIContext contextWithEAGLContext(EAGLContext eaglContext);

    @Generated
    @Selector("contextWithEAGLContext:options:")
    public static native CIContext contextWithEAGLContextOptions(EAGLContext eaglContext,
            NSDictionary<String, ?> options);

    @Generated
    @Selector("contextWithOptions:")
    public static native CIContext contextWithOptions(NSDictionary<String, ?> options);

    @Generated
    @Selector("contextWithCGContext:options:")
    public static native CIContext contextWithCGContextOptions(CGContextRef cgctx, NSDictionary<String, ?> options);

    @Generated
    @Selector("contextWithMTLDevice:")
    public static native CIContext contextWithMTLDevice(@Mapped(ObjCObjectMapper.class) MTLDevice device);

    @Generated
    @Selector("contextWithMTLDevice:options:")
    public static native CIContext contextWithMTLDeviceOptions(@Mapped(ObjCObjectMapper.class) MTLDevice device,
            NSDictionary<String, ?> options);

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
    public static native void cancelPreviousPerformRequestsWithTarget(@Mapped(ObjCObjectMapper.class) Object aTarget);

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
    public static native NSObject.Function_instanceMethodForSelector_ret instanceMethodForSelector(SEL aSelector);

    @Generated
    @Selector("instanceMethodSignatureForSelector:")
    public static native NSMethodSignature instanceMethodSignatureForSelector(SEL aSelector);

    @Generated
    @Selector("instancesRespondToSelector:")
    public static native boolean instancesRespondToSelector(SEL aSelector);

    @Generated
    @Selector("isSubclassOfClass:")
    public static native boolean isSubclassOfClass(Class aClass);

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

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

    @Generated
    @Selector("createCGImage:fromRect:")
    public native CGImageRef createCGImageFromRect(CIImage image, @ByValue CGRect fromRect);

    @Generated
    @Selector("createCGImage:fromRect:format:colorSpace:")
    public native CGImageRef createCGImageFromRectFormatColorSpace(CIImage image, @ByValue CGRect fromRect, int format,
            CGColorSpaceRef colorSpace);

    @Generated
    @Deprecated
    @Selector("drawImage:atPoint:fromRect:")
    public native void drawImageAtPointFromRect(CIImage image, @ByValue CGPoint atPoint, @ByValue CGRect fromRect);

    @Generated
    @Selector("drawImage:inRect:fromRect:")
    public native void drawImageInRectFromRect(CIImage image, @ByValue CGRect inRect, @ByValue CGRect fromRect);

    @Generated
    @Selector("init")
    public native CIContext init();

    @Generated
    @Selector("inputImageMaximumSize")
    @ByValue
    public native CGSize inputImageMaximumSize();

    @Generated
    @Selector("outputImageMaximumSize")
    @ByValue
    public native CGSize outputImageMaximumSize();

    @Generated
    @Selector("render:toBitmap:rowBytes:bounds:format:colorSpace:")
    public native void renderToBitmapRowBytesBoundsFormatColorSpace(CIImage image, VoidPtr data, @NInt long rowBytes,
            @ByValue CGRect bounds, int format, CGColorSpaceRef colorSpace);

    @Generated
    @Selector("render:toCVPixelBuffer:")
    public native void renderToCVPixelBuffer(CIImage image, CVBufferRef buffer);

    @Generated
    @Selector("render:toCVPixelBuffer:bounds:colorSpace:")
    public native void renderToCVPixelBufferBoundsColorSpace(CIImage image, CVBufferRef buffer, @ByValue CGRect bounds,
            CGColorSpaceRef colorSpace);

    @Generated
    @Selector("render:toMTLTexture:commandBuffer:bounds:colorSpace:")
    public native void renderToMTLTextureCommandBufferBoundsColorSpace(CIImage image,
            @Mapped(ObjCObjectMapper.class) MTLTexture texture,
            @Mapped(ObjCObjectMapper.class) MTLCommandBuffer commandBuffer, @ByValue CGRect bounds,
            CGColorSpaceRef colorSpace);

    @Generated
    @Selector("workingColorSpace")
    public native CGColorSpaceRef workingColorSpace();
}

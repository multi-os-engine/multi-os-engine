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

package apple.metalperformanceshaders;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.metal.protocol.MTLCommandBuffer;
import apple.metal.protocol.MTLTexture;
import apple.metal.struct.MTLRegion;
import apple.metal.struct.MTLSize;
import apple.metalperformanceshaders.struct.MPSOffset;
import apple.metalperformanceshaders.struct.MPSRegion;
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
import org.moe.natj.general.ann.ReferenceInfo;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCObject;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

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
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MPSUnaryImageKernel alloc();

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
    @Selector("clipRect")
    @ByValue
    public native MTLRegion clipRect();

    @Generated
    @Selector("edgeMode")
    @NUInt
    public native long edgeMode();

    @Generated
    @Selector("encodeToCommandBuffer:inPlaceTexture:fallbackCopyAllocator:")
    public native boolean encodeToCommandBufferInPlaceTextureFallbackCopyAllocator(
            @Mapped(ObjCObjectMapper.class) MTLCommandBuffer commandBuffer,
            @ReferenceInfo(type = ObjCObject.class) Ptr<ObjCObject> texture,
            @ObjCBlock(name = "call_encodeToCommandBufferInPlaceTextureFallbackCopyAllocator") Block_encodeToCommandBufferInPlaceTextureFallbackCopyAllocator copyAllocator);

    @Generated
    @Selector("encodeToCommandBuffer:sourceTexture:destinationTexture:")
    public native void encodeToCommandBufferSourceTextureDestinationTexture(
            @Mapped(ObjCObjectMapper.class) MTLCommandBuffer commandBuffer,
            @Mapped(ObjCObjectMapper.class) MTLTexture sourceTexture,
            @Mapped(ObjCObjectMapper.class) MTLTexture destinationTexture);

    @Generated
    @Selector("init")
    public native MPSUnaryImageKernel init();

    @Generated
    @Selector("initWithDevice:")
    public native MPSUnaryImageKernel initWithDevice(@Mapped(ObjCObjectMapper.class) Object device);

    @Generated
    @Selector("offset")
    @ByValue
    public native MPSOffset offset();

    @Generated
    @Selector("setClipRect:")
    public native void setClipRect(@ByValue MTLRegion value);

    @Generated
    @Selector("setEdgeMode:")
    public native void setEdgeMode(@NUInt long value);

    @Generated
    @Selector("setOffset:")
    public native void setOffset(@ByValue MPSOffset value);

    @Generated
    @Selector("sourceRegionForDestinationSize:")
    @ByValue
    public native MPSRegion sourceRegionForDestinationSize(@ByValue MTLSize destinationSize);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_encodeToCommandBufferInPlaceTextureFallbackCopyAllocator {
        @Generated
        @MappedReturn(ObjCObjectMapper.class)
        Object call_encodeToCommandBufferInPlaceTextureFallbackCopyAllocator(MPSKernel arg0,
                @Mapped(ObjCObjectMapper.class) Object arg1, @Mapped(ObjCObjectMapper.class) Object arg2);
    }

    @Generated
    @Selector("encodeToCommandBuffer:sourceImage:destinationImage:")
    public native void encodeToCommandBufferSourceImageDestinationImage(
            @Mapped(ObjCObjectMapper.class) MTLCommandBuffer commandBuffer, MPSImage sourceImage,
            MPSImage destinationImage);

    @Generated
    @Selector("initWithCoder:")
    public native MPSUnaryImageKernel initWithCoder(NSCoder aDecoder);

    @Generated
    @Selector("initWithCoder:device:")
    public native MPSUnaryImageKernel initWithCoderDevice(NSCoder aDecoder,
            @Mapped(ObjCObjectMapper.class) Object device);

    @Generated
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }
}

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
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.metal.protocol.MTLCommandBuffer;
import apple.metal.protocol.MTLDevice;
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
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCObject;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("MetalPerformanceShaders")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPSBinaryImageKernel extends MPSKernel {
    static {
        NatJ.register();
    }

    @Generated
    protected MPSBinaryImageKernel(Pointer peer) {
        super(peer);
    }

    @Generated
    @Owned
    @Selector("alloc")
    public static native MPSBinaryImageKernel alloc();

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

    /**
     * clipRect</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MetalPerformanceShaders/Reference/MPSBinaryImageKernel_ClassReference/index.html#//apple_ref/occ/instp/MPSBinaryImageKernel/clipRect">iOS Dev Center</a>
     */
    @Generated
    @Selector("clipRect")
    @ByValue
    public native MTLRegion clipRect();

    /**
     * encodeToCommandBuffer:inPlacePrimaryTexture:secondaryTexture:fallbackCopyAllocator:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MetalPerformanceShaders/Reference/MPSBinaryImageKernel_ClassReference/index.html#//apple_ref/occ/instm/MPSBinaryImageKernel/encodeToCommandBuffer:inPlacePrimaryTexture:secondaryTexture:fallbackCopyAllocator:">iOS Dev Center</a>
     */
    @Generated
    @Selector("encodeToCommandBuffer:inPlacePrimaryTexture:secondaryTexture:fallbackCopyAllocator:")
    public native boolean encodeToCommandBufferInPlacePrimaryTextureSecondaryTextureFallbackCopyAllocator(
            @Mapped(ObjCObjectMapper.class) MTLCommandBuffer commandBuffer, Ptr<ObjCObject> inPlacePrimaryTexture,
            @Mapped(ObjCObjectMapper.class) MTLTexture secondaryTexture,
            @ObjCBlock(name = "call_encodeToCommandBufferInPlacePrimaryTextureSecondaryTextureFallbackCopyAllocator") Block_encodeToCommandBufferInPlacePrimaryTextureSecondaryTextureFallbackCopyAllocator copyAllocator);

    /**
     * encodeToCommandBuffer:primaryTexture:inPlaceSecondaryTexture:fallbackCopyAllocator:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MetalPerformanceShaders/Reference/MPSBinaryImageKernel_ClassReference/index.html#//apple_ref/occ/instm/MPSBinaryImageKernel/encodeToCommandBuffer:primaryTexture:inPlaceSecondaryTexture:fallbackCopyAllocator:">iOS Dev Center</a>
     */
    @Generated
    @Selector("encodeToCommandBuffer:primaryTexture:inPlaceSecondaryTexture:fallbackCopyAllocator:")
    public native boolean encodeToCommandBufferPrimaryTextureInPlaceSecondaryTextureFallbackCopyAllocator(
            @Mapped(ObjCObjectMapper.class) MTLCommandBuffer commandBuffer,
            @Mapped(ObjCObjectMapper.class) MTLTexture primaryTexture, Ptr<ObjCObject> inPlaceSecondaryTexture,
            @ObjCBlock(name = "call_encodeToCommandBufferPrimaryTextureInPlaceSecondaryTextureFallbackCopyAllocator") Block_encodeToCommandBufferPrimaryTextureInPlaceSecondaryTextureFallbackCopyAllocator copyAllocator);

    /**
     * encodeToCommandBuffer:primaryTexture:secondaryTexture:destinationTexture:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MetalPerformanceShaders/Reference/MPSBinaryImageKernel_ClassReference/index.html#//apple_ref/occ/instm/MPSBinaryImageKernel/encodeToCommandBuffer:primaryTexture:secondaryTexture:destinationTexture:">iOS Dev Center</a>
     */
    @Generated
    @Selector("encodeToCommandBuffer:primaryTexture:secondaryTexture:destinationTexture:")
    public native void encodeToCommandBufferPrimaryTextureSecondaryTextureDestinationTexture(
            @Mapped(ObjCObjectMapper.class) MTLCommandBuffer commandBuffer,
            @Mapped(ObjCObjectMapper.class) MTLTexture primaryTexture,
            @Mapped(ObjCObjectMapper.class) MTLTexture secondaryTexture,
            @Mapped(ObjCObjectMapper.class) MTLTexture destinationTexture);

    @Generated
    @Selector("init")
    public native MPSBinaryImageKernel init();

    @Generated
    @Selector("initWithDevice:")
    public native MPSBinaryImageKernel initWithDevice(@Mapped(ObjCObjectMapper.class) MTLDevice device);

    /**
     * primaryEdgeMode</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MetalPerformanceShaders/Reference/MPSBinaryImageKernel_ClassReference/index.html#//apple_ref/occ/instp/MPSBinaryImageKernel/primaryEdgeMode">iOS Dev Center</a>
     */
    @Generated
    @Selector("primaryEdgeMode")
    @NUInt
    public native long primaryEdgeMode();

    /**
     * primaryOffset</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MetalPerformanceShaders/Reference/MPSBinaryImageKernel_ClassReference/index.html#//apple_ref/occ/instp/MPSBinaryImageKernel/primaryOffset">iOS Dev Center</a>
     */
    @Generated
    @Selector("primaryOffset")
    @ByValue
    public native MPSOffset primaryOffset();

    /**
     * primarySourceRegionForDestinationSize:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MetalPerformanceShaders/Reference/MPSBinaryImageKernel_ClassReference/index.html#//apple_ref/occ/instm/MPSBinaryImageKernel/primarySourceRegionForDestinationSize:">iOS Dev Center</a>
     */
    @Generated
    @Selector("primarySourceRegionForDestinationSize:")
    @ByValue
    public native MPSRegion primarySourceRegionForDestinationSize(@ByValue MTLSize destinationSize);

    /**
     * secondaryEdgeMode</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MetalPerformanceShaders/Reference/MPSBinaryImageKernel_ClassReference/index.html#//apple_ref/occ/instp/MPSBinaryImageKernel/secondaryEdgeMode">iOS Dev Center</a>
     */
    @Generated
    @Selector("secondaryEdgeMode")
    @NUInt
    public native long secondaryEdgeMode();

    /**
     * secondaryOffset</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MetalPerformanceShaders/Reference/MPSBinaryImageKernel_ClassReference/index.html#//apple_ref/occ/instp/MPSBinaryImageKernel/secondaryOffset">iOS Dev Center</a>
     */
    @Generated
    @Selector("secondaryOffset")
    @ByValue
    public native MPSOffset secondaryOffset();

    /**
     * secondarySourceRegionForDestinationSize:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MetalPerformanceShaders/Reference/MPSBinaryImageKernel_ClassReference/index.html#//apple_ref/occ/instm/MPSBinaryImageKernel/secondarySourceRegionForDestinationSize:">iOS Dev Center</a>
     */
    @Generated
    @Selector("secondarySourceRegionForDestinationSize:")
    @ByValue
    public native MPSRegion secondarySourceRegionForDestinationSize(@ByValue MTLSize destinationSize);

    /**
     * clipRect</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MetalPerformanceShaders/Reference/MPSBinaryImageKernel_ClassReference/index.html#//apple_ref/occ/instp/MPSBinaryImageKernel/clipRect">iOS Dev Center</a>
     */
    @Generated
    @Selector("setClipRect:")
    public native void setClipRect(@ByValue MTLRegion value);

    /**
     * primaryEdgeMode</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MetalPerformanceShaders/Reference/MPSBinaryImageKernel_ClassReference/index.html#//apple_ref/occ/instp/MPSBinaryImageKernel/primaryEdgeMode">iOS Dev Center</a>
     */
    @Generated
    @Selector("setPrimaryEdgeMode:")
    public native void setPrimaryEdgeMode(@NUInt long value);

    /**
     * primaryOffset</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MetalPerformanceShaders/Reference/MPSBinaryImageKernel_ClassReference/index.html#//apple_ref/occ/instp/MPSBinaryImageKernel/primaryOffset">iOS Dev Center</a>
     */
    @Generated
    @Selector("setPrimaryOffset:")
    public native void setPrimaryOffset(@ByValue MPSOffset value);

    /**
     * secondaryEdgeMode</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MetalPerformanceShaders/Reference/MPSBinaryImageKernel_ClassReference/index.html#//apple_ref/occ/instp/MPSBinaryImageKernel/secondaryEdgeMode">iOS Dev Center</a>
     */
    @Generated
    @Selector("setSecondaryEdgeMode:")
    public native void setSecondaryEdgeMode(@NUInt long value);

    /**
     * secondaryOffset</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MetalPerformanceShaders/Reference/MPSBinaryImageKernel_ClassReference/index.html#//apple_ref/occ/instp/MPSBinaryImageKernel/secondaryOffset">iOS Dev Center</a>
     */
    @Generated
    @Selector("setSecondaryOffset:")
    public native void setSecondaryOffset(@ByValue MPSOffset value);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_encodeToCommandBufferInPlacePrimaryTextureSecondaryTextureFallbackCopyAllocator {
        @Generated
        @MappedReturn(ObjCObjectMapper.class)
        Object call_encodeToCommandBufferInPlacePrimaryTextureSecondaryTextureFallbackCopyAllocator(MPSKernel arg0,
                @Mapped(ObjCObjectMapper.class) Object arg1, @Mapped(ObjCObjectMapper.class) Object arg2);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_encodeToCommandBufferPrimaryTextureInPlaceSecondaryTextureFallbackCopyAllocator {
        @Generated
        @MappedReturn(ObjCObjectMapper.class)
        Object call_encodeToCommandBufferPrimaryTextureInPlaceSecondaryTextureFallbackCopyAllocator(MPSKernel arg0,
                @Mapped(ObjCObjectMapper.class) Object arg1, @Mapped(ObjCObjectMapper.class) Object arg2);
    }
}

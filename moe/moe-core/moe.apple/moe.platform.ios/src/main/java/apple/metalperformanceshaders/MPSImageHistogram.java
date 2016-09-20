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
import apple.metal.protocol.MTLBuffer;
import apple.metal.protocol.MTLCommandBuffer;
import apple.metal.protocol.MTLDevice;
import apple.metal.protocol.MTLTexture;
import apple.metal.struct.MTLRegion;
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
@Library("MetalPerformanceShaders")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPSImageHistogram extends MPSKernel {
    static {
        NatJ.register();
    }

    @Generated
    protected MPSImageHistogram(Pointer peer) {
        super(peer);
    }

    @Generated
    @Owned
    @Selector("alloc")
    public static native MPSImageHistogram alloc();

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
    public static native void setVersion(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * clipRectSource</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MetalPerformanceShaders/Reference/MPSImageHistogram_ClassReference/index.html#//apple_ref/occ/instp/MPSImageHistogram/clipRectSource">iOS Dev Center</a>
     */
    @Generated
    @Selector("clipRectSource")
    @ByValue
    public native MTLRegion clipRectSource();

    /**
     * encodeToCommandBuffer:sourceTexture:histogram:histogramOffset:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MetalPerformanceShaders/Reference/MPSImageHistogram_ClassReference/index.html#//apple_ref/occ/instm/MPSImageHistogram/encodeToCommandBuffer:sourceTexture:histogram:histogramOffset:">iOS Dev Center</a>
     */
    @Generated
    @Selector("encodeToCommandBuffer:sourceTexture:histogram:histogramOffset:")
    public native void encodeToCommandBufferSourceTextureHistogramHistogramOffset(
            @Mapped(ObjCObjectMapper.class) MTLCommandBuffer commandBuffer,
            @Mapped(ObjCObjectMapper.class) MTLTexture source, @Mapped(ObjCObjectMapper.class) MTLBuffer histogram,
            @NUInt long histogramOffset);

    /**
     * histogramSizeForSourceFormat:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MetalPerformanceShaders/Reference/MPSImageHistogram_ClassReference/index.html#//apple_ref/occ/instm/MPSImageHistogram/histogramSizeForSourceFormat:">iOS Dev Center</a>
     */
    @Generated
    @Selector("histogramSizeForSourceFormat:")
    @NUInt
    public native long histogramSizeForSourceFormat(@NUInt long sourceFormat);

    @Generated
    @Selector("init")
    public native MPSImageHistogram init();

    @Generated
    @Selector("initWithDevice:")
    public native MPSImageHistogram initWithDevice(@Mapped(ObjCObjectMapper.class) MTLDevice device);

    /**
     * initWithDevice:histogramInfo:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MetalPerformanceShaders/Reference/MPSImageHistogram_ClassReference/index.html#//apple_ref/occ/instm/MPSImageHistogram/initWithDevice:histogramInfo:">iOS Dev Center</a>
     */
    @Generated
    @Selector("initWithDevice:histogramInfo:")
    public native MPSImageHistogram initWithDeviceHistogramInfo(@Mapped(ObjCObjectMapper.class) MTLDevice device,
            VoidPtr histogramInfo);

    /**
     * clipRectSource</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MetalPerformanceShaders/Reference/MPSImageHistogram_ClassReference/index.html#//apple_ref/occ/instp/MPSImageHistogram/clipRectSource">iOS Dev Center</a>
     */
    @Generated
    @Selector("setClipRectSource:")
    public native void setClipRectSource(@ByValue MTLRegion value);

    /**
     * zeroHistogram</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MetalPerformanceShaders/Reference/MPSImageHistogram_ClassReference/index.html#//apple_ref/occ/instp/MPSImageHistogram/zeroHistogram">iOS Dev Center</a>
     */
    @Generated
    @Selector("setZeroHistogram:")
    public native void setZeroHistogram(boolean value);

    /**
     * zeroHistogram</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MetalPerformanceShaders/Reference/MPSImageHistogram_ClassReference/index.html#//apple_ref/occ/instp/MPSImageHistogram/zeroHistogram">iOS Dev Center</a>
     */
    @Generated
    @Selector("zeroHistogram")
    public native boolean zeroHistogram();
}

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

package apple.metal;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSCopying;
import apple.metal.protocol.MTLFunction;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
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
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MTLRenderPipelineDescriptor alloc();

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
    @Selector("colorAttachments")
    public native MTLRenderPipelineColorAttachmentDescriptorArray colorAttachments();

    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(VoidPtr zone);

    @Generated
    @Selector("depthAttachmentPixelFormat")
    @NUInt
    public native long depthAttachmentPixelFormat();

    @Generated
    @Selector("fragmentFunction")
    @MappedReturn(ObjCObjectMapper.class)
    public native MTLFunction fragmentFunction();

    @Generated
    @Selector("init")
    public native MTLRenderPipelineDescriptor init();

    @Generated
    @Selector("isAlphaToCoverageEnabled")
    public native boolean isAlphaToCoverageEnabled();

    @Generated
    @Selector("setAlphaToCoverageEnabled:")
    public native void setAlphaToCoverageEnabled(boolean value);

    @Generated
    @Selector("isAlphaToOneEnabled")
    public native boolean isAlphaToOneEnabled();

    @Generated
    @Selector("setAlphaToOneEnabled:")
    public native void setAlphaToOneEnabled(boolean value);

    @Generated
    @Selector("isRasterizationEnabled")
    public native boolean isRasterizationEnabled();

    @Generated
    @Selector("setRasterizationEnabled:")
    public native void setRasterizationEnabled(boolean value);

    @Generated
    @Selector("isTessellationFactorScaleEnabled")
    public native boolean isTessellationFactorScaleEnabled();

    @Generated
    @Selector("setTessellationFactorScaleEnabled:")
    public native void setTessellationFactorScaleEnabled(boolean value);

    @Generated
    @Selector("label")
    public native String label();

    @Generated
    @Selector("maxTessellationFactor")
    @NUInt
    public native long maxTessellationFactor();

    @Generated
    @Selector("reset")
    public native void reset();

    @Generated
    @Selector("sampleCount")
    @NUInt
    public native long sampleCount();

    @Generated
    @Selector("setDepthAttachmentPixelFormat:")
    public native void setDepthAttachmentPixelFormat(@NUInt long value);

    @Generated
    @Selector("setFragmentFunction:")
    public native void setFragmentFunction(@Mapped(ObjCObjectMapper.class) MTLFunction value);

    @Generated
    @Selector("setLabel:")
    public native void setLabel(String value);

    @Generated
    @Selector("setMaxTessellationFactor:")
    public native void setMaxTessellationFactor(@NUInt long value);

    @Generated
    @Selector("setSampleCount:")
    public native void setSampleCount(@NUInt long value);

    @Generated
    @Selector("setStencilAttachmentPixelFormat:")
    public native void setStencilAttachmentPixelFormat(@NUInt long value);

    @Generated
    @Selector("setTessellationControlPointIndexType:")
    public native void setTessellationControlPointIndexType(@NUInt long value);

    @Generated
    @Selector("setTessellationFactorFormat:")
    public native void setTessellationFactorFormat(@NUInt long value);

    @Generated
    @Selector("setTessellationFactorStepFunction:")
    public native void setTessellationFactorStepFunction(@NUInt long value);

    @Generated
    @Selector("setTessellationOutputWindingOrder:")
    public native void setTessellationOutputWindingOrder(@NUInt long value);

    @Generated
    @Selector("setTessellationPartitionMode:")
    public native void setTessellationPartitionMode(@NUInt long value);

    @Generated
    @Selector("setVertexDescriptor:")
    public native void setVertexDescriptor(MTLVertexDescriptor value);

    @Generated
    @Selector("setVertexFunction:")
    public native void setVertexFunction(@Mapped(ObjCObjectMapper.class) MTLFunction value);

    @Generated
    @Selector("stencilAttachmentPixelFormat")
    @NUInt
    public native long stencilAttachmentPixelFormat();

    @Generated
    @Selector("tessellationControlPointIndexType")
    @NUInt
    public native long tessellationControlPointIndexType();

    @Generated
    @Selector("tessellationFactorFormat")
    @NUInt
    public native long tessellationFactorFormat();

    @Generated
    @Selector("tessellationFactorStepFunction")
    @NUInt
    public native long tessellationFactorStepFunction();

    @Generated
    @Selector("tessellationOutputWindingOrder")
    @NUInt
    public native long tessellationOutputWindingOrder();

    @Generated
    @Selector("tessellationPartitionMode")
    @NUInt
    public native long tessellationPartitionMode();

    @Generated
    @Selector("vertexDescriptor")
    public native MTLVertexDescriptor vertexDescriptor();

    @Generated
    @Selector("vertexFunction")
    @MappedReturn(ObjCObjectMapper.class)
    public native MTLFunction vertexFunction();
}

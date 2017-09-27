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
import apple.metal.protocol.MTLBuffer;
import apple.metal.struct.MTLSamplePosition;
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
import org.moe.natj.general.ann.UncertainArgument;
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
public class MTLRenderPassDescriptor extends NSObject implements NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected MTLRenderPassDescriptor(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MTLRenderPassDescriptor alloc();

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
    @Selector("renderPassDescriptor")
    public static native MTLRenderPassDescriptor renderPassDescriptor();

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
    public native MTLRenderPassColorAttachmentDescriptorArray colorAttachments();

    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(VoidPtr zone);

    @Generated
    @Selector("depthAttachment")
    public native MTLRenderPassDepthAttachmentDescriptor depthAttachment();

    @Generated
    @Selector("init")
    public native MTLRenderPassDescriptor init();

    @Generated
    @Selector("setDepthAttachment:")
    public native void setDepthAttachment(MTLRenderPassDepthAttachmentDescriptor value);

    @Generated
    @Selector("setStencilAttachment:")
    public native void setStencilAttachment(MTLRenderPassStencilAttachmentDescriptor value);

    @Generated
    @Selector("setVisibilityResultBuffer:")
    public native void setVisibilityResultBuffer(@Mapped(ObjCObjectMapper.class) MTLBuffer value);

    @Generated
    @Selector("stencilAttachment")
    public native MTLRenderPassStencilAttachmentDescriptor stencilAttachment();

    @Generated
    @Selector("visibilityResultBuffer")
    @MappedReturn(ObjCObjectMapper.class)
    public native MTLBuffer visibilityResultBuffer();

    @Generated
    @Selector("defaultRasterSampleCount")
    @NUInt
    public native long defaultRasterSampleCount();

    @Generated
    @Selector("defaultSampleCount")
    @NUInt
    public native long defaultSampleCount();

    @Generated
    @Selector("getSamplePositions:count:")
    @NUInt
    public native long getSamplePositionsCount(
            @UncertainArgument("Options: reference, array Fallback: reference") MTLSamplePosition positions,
            @NUInt long count);

    @Generated
    @Selector("imageblockSampleLength")
    @NUInt
    public native long imageblockSampleLength();

    @Generated
    @Selector("renderTargetHeight")
    @NUInt
    public native long renderTargetHeight();

    @Generated
    @Selector("renderTargetWidth")
    @NUInt
    public native long renderTargetWidth();

    @Generated
    @Selector("setDefaultRasterSampleCount:")
    public native void setDefaultRasterSampleCount(@NUInt long value);

    @Generated
    @Selector("setDefaultSampleCount:")
    public native void setDefaultSampleCount(@NUInt long value);

    @Generated
    @Selector("setImageblockSampleLength:")
    public native void setImageblockSampleLength(@NUInt long value);

    @Generated
    @Selector("setRenderTargetHeight:")
    public native void setRenderTargetHeight(@NUInt long value);

    @Generated
    @Selector("setRenderTargetWidth:")
    public native void setRenderTargetWidth(@NUInt long value);

    @Generated
    @Selector("setSamplePositions:count:")
    public native void setSamplePositionsCount(
            @UncertainArgument("Options: reference, array Fallback: reference") MTLSamplePosition positions,
            @NUInt long count);

    @Generated
    @Selector("setThreadgroupMemoryLength:")
    public native void setThreadgroupMemoryLength(@NUInt long value);

    @Generated
    @Selector("setTileHeight:")
    public native void setTileHeight(@NUInt long value);

    @Generated
    @Selector("setTileWidth:")
    public native void setTileWidth(@NUInt long value);

    @Generated
    @Selector("threadgroupMemoryLength")
    @NUInt
    public native long threadgroupMemoryLength();

    @Generated
    @Selector("tileHeight")
    @NUInt
    public native long tileHeight();

    @Generated
    @Selector("tileWidth")
    @NUInt
    public native long tileWidth();
}

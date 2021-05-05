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
public class MTLRenderPipelineColorAttachmentDescriptor extends NSObject implements NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected MTLRenderPipelineColorAttachmentDescriptor(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MTLRenderPipelineColorAttachmentDescriptor alloc();

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

    /**
     * Defaults to MTLBlendOperationAdd
     */
    @Generated
    @Selector("alphaBlendOperation")
    @NUInt
    public native long alphaBlendOperation();

    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(VoidPtr zone);

    /**
     * Defaults to MTLBlendFactorZero
     */
    @Generated
    @Selector("destinationAlphaBlendFactor")
    @NUInt
    public native long destinationAlphaBlendFactor();

    /**
     * Defaults to MTLBlendFactorZero
     */
    @Generated
    @Selector("destinationRGBBlendFactor")
    @NUInt
    public native long destinationRGBBlendFactor();

    @Generated
    @Selector("init")
    public native MTLRenderPipelineColorAttachmentDescriptor init();

    /**
     * Enable blending.  Defaults to NO.
     */
    @Generated
    @Selector("isBlendingEnabled")
    public native boolean isBlendingEnabled();

    /**
     * Enable blending.  Defaults to NO.
     */
    @Generated
    @Selector("setBlendingEnabled:")
    public native void setBlendingEnabled(boolean value);

    /**
     * Pixel format.  Defaults to MTLPixelFormatInvalid
     */
    @Generated
    @Selector("pixelFormat")
    @NUInt
    public native long pixelFormat();

    /**
     * Defaults to MTLBlendOperationAdd
     */
    @Generated
    @Selector("rgbBlendOperation")
    @NUInt
    public native long rgbBlendOperation();

    /**
     * Defaults to MTLBlendOperationAdd
     */
    @Generated
    @Selector("setAlphaBlendOperation:")
    public native void setAlphaBlendOperation(@NUInt long value);

    /**
     * Defaults to MTLBlendFactorZero
     */
    @Generated
    @Selector("setDestinationAlphaBlendFactor:")
    public native void setDestinationAlphaBlendFactor(@NUInt long value);

    /**
     * Defaults to MTLBlendFactorZero
     */
    @Generated
    @Selector("setDestinationRGBBlendFactor:")
    public native void setDestinationRGBBlendFactor(@NUInt long value);

    /**
     * Pixel format.  Defaults to MTLPixelFormatInvalid
     */
    @Generated
    @Selector("setPixelFormat:")
    public native void setPixelFormat(@NUInt long value);

    /**
     * Defaults to MTLBlendOperationAdd
     */
    @Generated
    @Selector("setRgbBlendOperation:")
    public native void setRgbBlendOperation(@NUInt long value);

    /**
     * Defaults to MTLBlendFactorOne
     */
    @Generated
    @Selector("setSourceAlphaBlendFactor:")
    public native void setSourceAlphaBlendFactor(@NUInt long value);

    /**
     * Defaults to MTLBlendFactorOne
     */
    @Generated
    @Selector("setSourceRGBBlendFactor:")
    public native void setSourceRGBBlendFactor(@NUInt long value);

    /**
     * Defaults to MTLColorWriteMaskAll
     */
    @Generated
    @Selector("setWriteMask:")
    public native void setWriteMask(@NUInt long value);

    /**
     * Defaults to MTLBlendFactorOne
     */
    @Generated
    @Selector("sourceAlphaBlendFactor")
    @NUInt
    public native long sourceAlphaBlendFactor();

    /**
     * Defaults to MTLBlendFactorOne
     */
    @Generated
    @Selector("sourceRGBBlendFactor")
    @NUInt
    public native long sourceRGBBlendFactor();

    /**
     * Defaults to MTLColorWriteMaskAll
     */
    @Generated
    @Selector("writeMask")
    @NUInt
    public native long writeMask();
}

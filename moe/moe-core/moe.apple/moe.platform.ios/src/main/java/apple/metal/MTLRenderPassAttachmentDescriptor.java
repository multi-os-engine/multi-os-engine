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
import apple.metal.protocol.MTLTexture;
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
public class MTLRenderPassAttachmentDescriptor extends NSObject implements NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected MTLRenderPassAttachmentDescriptor(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MTLRenderPassAttachmentDescriptor alloc();

    @Generated
    @Selector("allocWithZone:")
    public static native MTLRenderPassAttachmentDescriptor allocWithZone(VoidPtr zone);

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
    public static native MTLRenderPassAttachmentDescriptor new_objc();

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
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(VoidPtr zone);

    /**
     * [@property] depthPlane
     * <p>
     * The depth plane of the texture to be used for rendering.  Default is zero.
     */
    @Generated
    @Selector("depthPlane")
    @NUInt
    public native long depthPlane();

    @Generated
    @Selector("init")
    public native MTLRenderPassAttachmentDescriptor init();

    /**
     * [@property] level
     * <p>
     * The mipmap level of the texture to be used for rendering.  Default is zero.
     */
    @Generated
    @Selector("level")
    @NUInt
    public native long level();

    /**
     * [@property] loadAction
     * <p>
     * The action to be performed with this attachment at the beginning of a render pass.  Default is
     * MTLLoadActionDontCare unless specified by a creation or init method.
     */
    @Generated
    @Selector("loadAction")
    @NUInt
    public native long loadAction();

    /**
     * [@property] resolveDepthPlane
     * <p>
     * The texture depth plane of the resolve texture to be used for multisample resolve.  Defaults to zero.
     */
    @Generated
    @Selector("resolveDepthPlane")
    @NUInt
    public native long resolveDepthPlane();

    /**
     * [@property] resolveLevel
     * <p>
     * The mipmap level of the resolve texture to be used for multisample resolve.  Defaults to zero.
     */
    @Generated
    @Selector("resolveLevel")
    @NUInt
    public native long resolveLevel();

    /**
     * [@property] resolveLevel
     * <p>
     * The texture slice of the resolve texture to be used for multisample resolve.  Defaults to zero.
     */
    @Generated
    @Selector("resolveSlice")
    @NUInt
    public native long resolveSlice();

    /**
     * [@property] resolveTexture
     * <p>
     * The texture used for multisample resolve operations.  Only used (and required)
     * if the store action is set to MTLStoreActionMultisampleResolve.
     */
    @Generated
    @Selector("resolveTexture")
    @MappedReturn(ObjCObjectMapper.class)
    public native MTLTexture resolveTexture();

    /**
     * [@property] depthPlane
     * <p>
     * The depth plane of the texture to be used for rendering.  Default is zero.
     */
    @Generated
    @Selector("setDepthPlane:")
    public native void setDepthPlane(@NUInt long value);

    /**
     * [@property] level
     * <p>
     * The mipmap level of the texture to be used for rendering.  Default is zero.
     */
    @Generated
    @Selector("setLevel:")
    public native void setLevel(@NUInt long value);

    /**
     * [@property] loadAction
     * <p>
     * The action to be performed with this attachment at the beginning of a render pass.  Default is
     * MTLLoadActionDontCare unless specified by a creation or init method.
     */
    @Generated
    @Selector("setLoadAction:")
    public native void setLoadAction(@NUInt long value);

    /**
     * [@property] resolveDepthPlane
     * <p>
     * The texture depth plane of the resolve texture to be used for multisample resolve.  Defaults to zero.
     */
    @Generated
    @Selector("setResolveDepthPlane:")
    public native void setResolveDepthPlane(@NUInt long value);

    /**
     * [@property] resolveLevel
     * <p>
     * The mipmap level of the resolve texture to be used for multisample resolve.  Defaults to zero.
     */
    @Generated
    @Selector("setResolveLevel:")
    public native void setResolveLevel(@NUInt long value);

    /**
     * [@property] resolveLevel
     * <p>
     * The texture slice of the resolve texture to be used for multisample resolve.  Defaults to zero.
     */
    @Generated
    @Selector("setResolveSlice:")
    public native void setResolveSlice(@NUInt long value);

    /**
     * [@property] resolveTexture
     * <p>
     * The texture used for multisample resolve operations.  Only used (and required)
     * if the store action is set to MTLStoreActionMultisampleResolve.
     */
    @Generated
    @Selector("setResolveTexture:")
    public native void setResolveTexture(@Mapped(ObjCObjectMapper.class) MTLTexture value);

    /**
     * [@property] slice
     * <p>
     * The slice of the texture to be used for rendering.  Default is zero.
     */
    @Generated
    @Selector("setSlice:")
    public native void setSlice(@NUInt long value);

    /**
     * [@property] storeAction
     * <p>
     * The action to be performed with this attachment at the end of a render pass.  Default is
     * MTLStoreActionDontCare unless specified by a creation or init method.
     */
    @Generated
    @Selector("setStoreAction:")
    public native void setStoreAction(@NUInt long value);

    /**
     * [@property] texture
     * <p>
     * The MTLTexture object for this attachment.
     */
    @Generated
    @Selector("setTexture:")
    public native void setTexture(@Mapped(ObjCObjectMapper.class) MTLTexture value);

    /**
     * [@property] slice
     * <p>
     * The slice of the texture to be used for rendering.  Default is zero.
     */
    @Generated
    @Selector("slice")
    @NUInt
    public native long slice();

    /**
     * [@property] storeAction
     * <p>
     * The action to be performed with this attachment at the end of a render pass.  Default is
     * MTLStoreActionDontCare unless specified by a creation or init method.
     */
    @Generated
    @Selector("storeAction")
    @NUInt
    public native long storeAction();

    /**
     * [@property] texture
     * <p>
     * The MTLTexture object for this attachment.
     */
    @Generated
    @Selector("texture")
    @MappedReturn(ObjCObjectMapper.class)
    public native MTLTexture texture();

    /**
     * [@property] storeActionOptions
     * <p>
     * Optional configuration for the store action performed with this attachment at the end of a render pass.  Default is
     * MTLStoreActionOptionNone.
     */
    @Generated
    @Selector("setStoreActionOptions:")
    public native void setStoreActionOptions(@NUInt long value);

    /**
     * [@property] storeActionOptions
     * <p>
     * Optional configuration for the store action performed with this attachment at the end of a render pass.  Default is
     * MTLStoreActionOptionNone.
     */
    @Generated
    @Selector("storeActionOptions")
    @NUInt
    public native long storeActionOptions();
}

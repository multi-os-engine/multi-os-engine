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
    @Owned
    @Selector("alloc")
    public static native MTLRenderPassAttachmentDescriptor alloc();

    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(VoidPtr zone);

    /**
     * depthPlane</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Metal/Reference/MTLRenderPassAttachmentDescriptor_Ref/index.html#//apple_ref/occ/instp/MTLRenderPassAttachmentDescriptor/depthPlane">iOS Dev Center</a>
     */
    @Generated
    @Selector("depthPlane")
    @NUInt
    public native long depthPlane();

    @Generated
    @Selector("init")
    public native MTLRenderPassAttachmentDescriptor init();

    /**
     * level</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Metal/Reference/MTLRenderPassAttachmentDescriptor_Ref/index.html#//apple_ref/occ/instp/MTLRenderPassAttachmentDescriptor/level">iOS Dev Center</a>
     */
    @Generated
    @Selector("level")
    @NUInt
    public native long level();

    /**
     * loadAction</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Metal/Reference/MTLRenderPassAttachmentDescriptor_Ref/index.html#//apple_ref/occ/instp/MTLRenderPassAttachmentDescriptor/loadAction">iOS Dev Center</a>
     */
    @Generated
    @Selector("loadAction")
    @NUInt
    public native long loadAction();

    /**
     * resolveDepthPlane</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Metal/Reference/MTLRenderPassAttachmentDescriptor_Ref/index.html#//apple_ref/occ/instp/MTLRenderPassAttachmentDescriptor/resolveDepthPlane">iOS Dev Center</a>
     */
    @Generated
    @Selector("resolveDepthPlane")
    @NUInt
    public native long resolveDepthPlane();

    /**
     * resolveLevel</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Metal/Reference/MTLRenderPassAttachmentDescriptor_Ref/index.html#//apple_ref/occ/instp/MTLRenderPassAttachmentDescriptor/resolveLevel">iOS Dev Center</a>
     */
    @Generated
    @Selector("resolveLevel")
    @NUInt
    public native long resolveLevel();

    /**
     * resolveSlice</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Metal/Reference/MTLRenderPassAttachmentDescriptor_Ref/index.html#//apple_ref/occ/instp/MTLRenderPassAttachmentDescriptor/resolveSlice">iOS Dev Center</a>
     */
    @Generated
    @Selector("resolveSlice")
    @NUInt
    public native long resolveSlice();

    /**
     * resolveTexture</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Metal/Reference/MTLRenderPassAttachmentDescriptor_Ref/index.html#//apple_ref/occ/instp/MTLRenderPassAttachmentDescriptor/resolveTexture">iOS Dev Center</a>
     */
    @Generated
    @Selector("resolveTexture")
    @MappedReturn(ObjCObjectMapper.class)
    public native MTLTexture resolveTexture();

    /**
     * depthPlane</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Metal/Reference/MTLRenderPassAttachmentDescriptor_Ref/index.html#//apple_ref/occ/instp/MTLRenderPassAttachmentDescriptor/depthPlane">iOS Dev Center</a>
     */
    @Generated
    @Selector("setDepthPlane:")
    public native void setDepthPlane(@NUInt long value);

    /**
     * level</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Metal/Reference/MTLRenderPassAttachmentDescriptor_Ref/index.html#//apple_ref/occ/instp/MTLRenderPassAttachmentDescriptor/level">iOS Dev Center</a>
     */
    @Generated
    @Selector("setLevel:")
    public native void setLevel(@NUInt long value);

    /**
     * loadAction</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Metal/Reference/MTLRenderPassAttachmentDescriptor_Ref/index.html#//apple_ref/occ/instp/MTLRenderPassAttachmentDescriptor/loadAction">iOS Dev Center</a>
     */
    @Generated
    @Selector("setLoadAction:")
    public native void setLoadAction(@NUInt long value);

    /**
     * resolveDepthPlane</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Metal/Reference/MTLRenderPassAttachmentDescriptor_Ref/index.html#//apple_ref/occ/instp/MTLRenderPassAttachmentDescriptor/resolveDepthPlane">iOS Dev Center</a>
     */
    @Generated
    @Selector("setResolveDepthPlane:")
    public native void setResolveDepthPlane(@NUInt long value);

    /**
     * resolveLevel</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Metal/Reference/MTLRenderPassAttachmentDescriptor_Ref/index.html#//apple_ref/occ/instp/MTLRenderPassAttachmentDescriptor/resolveLevel">iOS Dev Center</a>
     */
    @Generated
    @Selector("setResolveLevel:")
    public native void setResolveLevel(@NUInt long value);

    /**
     * resolveSlice</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Metal/Reference/MTLRenderPassAttachmentDescriptor_Ref/index.html#//apple_ref/occ/instp/MTLRenderPassAttachmentDescriptor/resolveSlice">iOS Dev Center</a>
     */
    @Generated
    @Selector("setResolveSlice:")
    public native void setResolveSlice(@NUInt long value);

    /**
     * resolveTexture</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Metal/Reference/MTLRenderPassAttachmentDescriptor_Ref/index.html#//apple_ref/occ/instp/MTLRenderPassAttachmentDescriptor/resolveTexture">iOS Dev Center</a>
     */
    @Generated
    @Selector("setResolveTexture:")
    public native void setResolveTexture(@Mapped(ObjCObjectMapper.class) MTLTexture value);

    /**
     * slice</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Metal/Reference/MTLRenderPassAttachmentDescriptor_Ref/index.html#//apple_ref/occ/instp/MTLRenderPassAttachmentDescriptor/slice">iOS Dev Center</a>
     */
    @Generated
    @Selector("setSlice:")
    public native void setSlice(@NUInt long value);

    /**
     * storeAction</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Metal/Reference/MTLRenderPassAttachmentDescriptor_Ref/index.html#//apple_ref/occ/instp/MTLRenderPassAttachmentDescriptor/storeAction">iOS Dev Center</a>
     */
    @Generated
    @Selector("setStoreAction:")
    public native void setStoreAction(@NUInt long value);

    /**
     * texture</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Metal/Reference/MTLRenderPassAttachmentDescriptor_Ref/index.html#//apple_ref/occ/instp/MTLRenderPassAttachmentDescriptor/texture">iOS Dev Center</a>
     */
    @Generated
    @Selector("setTexture:")
    public native void setTexture(@Mapped(ObjCObjectMapper.class) MTLTexture value);

    /**
     * slice</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Metal/Reference/MTLRenderPassAttachmentDescriptor_Ref/index.html#//apple_ref/occ/instp/MTLRenderPassAttachmentDescriptor/slice">iOS Dev Center</a>
     */
    @Generated
    @Selector("slice")
    @NUInt
    public native long slice();

    /**
     * storeAction</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Metal/Reference/MTLRenderPassAttachmentDescriptor_Ref/index.html#//apple_ref/occ/instp/MTLRenderPassAttachmentDescriptor/storeAction">iOS Dev Center</a>
     */
    @Generated
    @Selector("storeAction")
    @NUInt
    public native long storeAction();

    /**
     * texture</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Metal/Reference/MTLRenderPassAttachmentDescriptor_Ref/index.html#//apple_ref/occ/instp/MTLRenderPassAttachmentDescriptor/texture">iOS Dev Center</a>
     */
    @Generated
    @Selector("texture")
    @MappedReturn(ObjCObjectMapper.class)
    public native MTLTexture texture();

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
}

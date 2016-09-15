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
public class MTLStencilDescriptor extends NSObject implements NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected MTLStencilDescriptor(Pointer peer) {
        super(peer);
    }

    @Generated
    @Owned
    @Selector("alloc")
    public static native MTLStencilDescriptor alloc();

    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(VoidPtr zone);

    /**
     * depthFailureOperation</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Metal/Reference/MTLStencilDescriptor_Ref/index.html#//apple_ref/occ/instp/MTLStencilDescriptor/depthFailureOperation">iOS Dev Center</a>
     */
    @Generated
    @Selector("depthFailureOperation")
    @NUInt
    public native long depthFailureOperation();

    /**
     * depthStencilPassOperation</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Metal/Reference/MTLStencilDescriptor_Ref/index.html#//apple_ref/occ/instp/MTLStencilDescriptor/depthStencilPassOperation">iOS Dev Center</a>
     */
    @Generated
    @Selector("depthStencilPassOperation")
    @NUInt
    public native long depthStencilPassOperation();

    @Generated
    @Selector("init")
    public native MTLStencilDescriptor init();

    /**
     * readMask</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Metal/Reference/MTLStencilDescriptor_Ref/index.html#//apple_ref/occ/instp/MTLStencilDescriptor/readMask">iOS Dev Center</a>
     */
    @Generated
    @Selector("readMask")
    public native int readMask();

    /**
     * depthFailureOperation</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Metal/Reference/MTLStencilDescriptor_Ref/index.html#//apple_ref/occ/instp/MTLStencilDescriptor/depthFailureOperation">iOS Dev Center</a>
     */
    @Generated
    @Selector("setDepthFailureOperation:")
    public native void setDepthFailureOperation(@NUInt long value);

    /**
     * depthStencilPassOperation</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Metal/Reference/MTLStencilDescriptor_Ref/index.html#//apple_ref/occ/instp/MTLStencilDescriptor/depthStencilPassOperation">iOS Dev Center</a>
     */
    @Generated
    @Selector("setDepthStencilPassOperation:")
    public native void setDepthStencilPassOperation(@NUInt long value);

    /**
     * readMask</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Metal/Reference/MTLStencilDescriptor_Ref/index.html#//apple_ref/occ/instp/MTLStencilDescriptor/readMask">iOS Dev Center</a>
     */
    @Generated
    @Selector("setReadMask:")
    public native void setReadMask(int value);

    /**
     * stencilCompareFunction</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Metal/Reference/MTLStencilDescriptor_Ref/index.html#//apple_ref/occ/instp/MTLStencilDescriptor/stencilCompareFunction">iOS Dev Center</a>
     */
    @Generated
    @Selector("setStencilCompareFunction:")
    public native void setStencilCompareFunction(@NUInt long value);

    /**
     * stencilFailureOperation</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Metal/Reference/MTLStencilDescriptor_Ref/index.html#//apple_ref/occ/instp/MTLStencilDescriptor/stencilFailureOperation">iOS Dev Center</a>
     */
    @Generated
    @Selector("setStencilFailureOperation:")
    public native void setStencilFailureOperation(@NUInt long value);

    /**
     * writeMask</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Metal/Reference/MTLStencilDescriptor_Ref/index.html#//apple_ref/occ/instp/MTLStencilDescriptor/writeMask">iOS Dev Center</a>
     */
    @Generated
    @Selector("setWriteMask:")
    public native void setWriteMask(int value);

    /**
     * stencilCompareFunction</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Metal/Reference/MTLStencilDescriptor_Ref/index.html#//apple_ref/occ/instp/MTLStencilDescriptor/stencilCompareFunction">iOS Dev Center</a>
     */
    @Generated
    @Selector("stencilCompareFunction")
    @NUInt
    public native long stencilCompareFunction();

    /**
     * stencilFailureOperation</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Metal/Reference/MTLStencilDescriptor_Ref/index.html#//apple_ref/occ/instp/MTLStencilDescriptor/stencilFailureOperation">iOS Dev Center</a>
     */
    @Generated
    @Selector("stencilFailureOperation")
    @NUInt
    public native long stencilFailureOperation();

    /**
     * writeMask</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Metal/Reference/MTLStencilDescriptor_Ref/index.html#//apple_ref/occ/instp/MTLStencilDescriptor/writeMask">iOS Dev Center</a>
     */
    @Generated
    @Selector("writeMask")
    public native int writeMask();

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

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

package apple.photos;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSDictionary;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.BoolPtr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import apple.foundation.protocol.NSCopying;
import org.moe.natj.general.ann.MappedReturn;

/**
 * API-Since: 8.0
 */
@Generated
@Library("Photos")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class PHVideoRequestOptions extends NSObject implements NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected PHVideoRequestOptions(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native PHVideoRequestOptions alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native PHVideoRequestOptions allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(
            @NotNull @Mapped(ObjCObjectMapper.class) Object aTarget);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
    public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
            @NotNull @Mapped(ObjCObjectMapper.class) Object aTarget, @NotNull SEL aSelector,
            @Nullable @Mapped(ObjCObjectMapper.class) Object anArgument);

    @NotNull
    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @NotNull
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

    @NotNull
    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    @Generated
    @Owned
    @Selector("new")
    public static native PHVideoRequestOptions new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    /**
     * API-Since: 8.0
     */
    @Generated
    @Selector("deliveryMode")
    @NInt
    public native long deliveryMode();

    @Generated
    @Selector("init")
    public native PHVideoRequestOptions init();

    /**
     * API-Since: 8.0
     */
    @Generated
    @Selector("isNetworkAccessAllowed")
    public native boolean isNetworkAccessAllowed();

    /**
     * API-Since: 8.0
     */
    @Generated
    @Selector("setNetworkAccessAllowed:")
    public native void setNetworkAccessAllowed(boolean value);

    /**
     * API-Since: 8.0
     */
    @Nullable
    @Generated
    @Selector("progressHandler")
    @ObjCBlock(name = "call_progressHandler_ret")
    public native Block_progressHandler_ret progressHandler();

    /**
     * API-Since: 8.0
     */
    @Generated
    @Selector("setDeliveryMode:")
    public native void setDeliveryMode(@NInt long value);

    /**
     * API-Since: 8.0
     */
    @Generated
    @Selector("setProgressHandler:")
    public native void setProgressHandler(
            @Nullable @ObjCBlock(name = "call_setProgressHandler") Block_setProgressHandler value);

    /**
     * API-Since: 8.0
     */
    @Generated
    @Selector("setVersion:")
    public native void setVersion(@NInt long value);

    /**
     * API-Since: 8.0
     */
    @Generated
    @Selector("version")
    @NInt
    public native long version();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_progressHandler_ret {
        @Generated
        void call_progressHandler_ret(double progress, @Nullable NSError error, @NotNull BoolPtr stop,
                @Nullable NSDictionary<?, ?> info);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setProgressHandler {
        @Generated
        void call_setProgressHandler(double progress, @Nullable NSError error, @NotNull BoolPtr stop,
                @Nullable NSDictionary<?, ?> info);
    }

    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    @NotNull
    public native Object copyWithZone(@Nullable VoidPtr zone);

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}

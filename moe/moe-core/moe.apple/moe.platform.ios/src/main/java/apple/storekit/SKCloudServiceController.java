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

package apple.storekit;

import apple.NSObject;
import apple.foundation.NSArray;
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

/**
 * API-Since: 9.3
 */
@Generated
@Library("StoreKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class SKCloudServiceController extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected SKCloudServiceController(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native SKCloudServiceController alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native SKCloudServiceController allocWithZone(VoidPtr zone);

    /**
     * API-Since: 9.3
     */
    @Generated
    @Selector("authorizationStatus")
    @NInt
    public static native long authorizationStatus();

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
    public static native SKCloudServiceController new_objc();

    /**
     * API-Since: 9.3
     */
    @Generated
    @Selector("requestAuthorization:")
    public static native void requestAuthorization(
            @NotNull @ObjCBlock(name = "call_requestAuthorization") Block_requestAuthorization completionHandler);

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
    @Selector("init")
    public native SKCloudServiceController init();

    /**
     * API-Since: 9.3
     */
    @Generated
    @Selector("requestCapabilitiesWithCompletionHandler:")
    public native void requestCapabilitiesWithCompletionHandler(
            @NotNull @ObjCBlock(name = "call_requestCapabilitiesWithCompletionHandler") Block_requestCapabilitiesWithCompletionHandler completionHandler);

    /**
     * API-Since: 9.3
     */
    @Generated
    @Selector("requestStorefrontIdentifierWithCompletionHandler:")
    public native void requestStorefrontIdentifierWithCompletionHandler(
            @NotNull @ObjCBlock(name = "call_requestStorefrontIdentifierWithCompletionHandler") Block_requestStorefrontIdentifierWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_requestAuthorization {
        @Generated
        void call_requestAuthorization(@NInt long authorizationStatus);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_requestCapabilitiesWithCompletionHandler {
        @Generated
        void call_requestCapabilitiesWithCompletionHandler(@NUInt long capabilities, @Nullable NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_requestStorefrontIdentifierWithCompletionHandler {
        @Generated
        void call_requestStorefrontIdentifierWithCompletionHandler(@Nullable String storefrontIdentifier,
                @Nullable NSError error);
    }

    /**
     * API-Since: 10.3
     * Deprecated-Since: 11.0
     */
    @Deprecated
    @Generated
    @Selector("requestPersonalizationTokenForClientToken:withCompletionHandler:")
    public native void requestPersonalizationTokenForClientTokenWithCompletionHandler(@NotNull String clientToken,
            @NotNull @ObjCBlock(name = "call_requestPersonalizationTokenForClientTokenWithCompletionHandler") Block_requestPersonalizationTokenForClientTokenWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_requestPersonalizationTokenForClientTokenWithCompletionHandler {
        @Generated
        void call_requestPersonalizationTokenForClientTokenWithCompletionHandler(@Nullable String personalizationToken,
                @Nullable NSError error);
    }

    /**
     * API-Since: 11.0
     */
    @Generated
    @Selector("requestStorefrontCountryCodeWithCompletionHandler:")
    public native void requestStorefrontCountryCodeWithCompletionHandler(
            @NotNull @ObjCBlock(name = "call_requestStorefrontCountryCodeWithCompletionHandler") Block_requestStorefrontCountryCodeWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_requestStorefrontCountryCodeWithCompletionHandler {
        @Generated
        void call_requestStorefrontCountryCodeWithCompletionHandler(@Nullable String storefrontCountryCode,
                @Nullable NSError error);
    }

    /**
     * API-Since: 11.0
     */
    @Generated
    @Selector("requestUserTokenForDeveloperToken:completionHandler:")
    public native void requestUserTokenForDeveloperTokenCompletionHandler(@NotNull String developerToken,
            @NotNull @ObjCBlock(name = "call_requestUserTokenForDeveloperTokenCompletionHandler") Block_requestUserTokenForDeveloperTokenCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_requestUserTokenForDeveloperTokenCompletionHandler {
        @Generated
        void call_requestUserTokenForDeveloperTokenCompletionHandler(@Nullable String userToken,
                @Nullable NSError error);
    }
}

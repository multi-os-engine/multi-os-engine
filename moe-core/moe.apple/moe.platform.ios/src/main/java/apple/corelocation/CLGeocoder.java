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

package apple.corelocation;

import apple.NSObject;
import apple.contacts.CNPostalAddress;
import apple.foundation.NSArray;
import apple.foundation.NSDictionary;
import apple.foundation.NSError;
import apple.foundation.NSLocale;
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
 * API-Since: 5.0
 */
@Generated
@Library("CoreLocation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class CLGeocoder extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected CLGeocoder(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native CLGeocoder alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native CLGeocoder allocWithZone(VoidPtr zone);

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
    public static native CLGeocoder new_objc();

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
    @Selector("cancelGeocode")
    public native void cancelGeocode();

    /**
     * API-Since: 5.0
     * Deprecated-Since: 11.0
     * Deprecated-Message: Use -geocodePostalAddress:completionHandler:
     */
    @Deprecated
    @Generated
    @Selector("geocodeAddressDictionary:completionHandler:")
    public native void geocodeAddressDictionaryCompletionHandler(@NotNull NSDictionary<?, ?> addressDictionary,
            @NotNull @ObjCBlock(name = "call_geocodeAddressDictionaryCompletionHandler") Block_geocodeAddressDictionaryCompletionHandler completionHandler);

    @Generated
    @Selector("geocodeAddressString:completionHandler:")
    public native void geocodeAddressStringCompletionHandler(@NotNull String addressString,
            @NotNull @ObjCBlock(name = "call_geocodeAddressStringCompletionHandler") Block_geocodeAddressStringCompletionHandler completionHandler);

    @Generated
    @Selector("geocodeAddressString:inRegion:completionHandler:")
    public native void geocodeAddressStringInRegionCompletionHandler(@NotNull String addressString,
            @Nullable CLRegion region,
            @NotNull @ObjCBlock(name = "call_geocodeAddressStringInRegionCompletionHandler") Block_geocodeAddressStringInRegionCompletionHandler completionHandler);

    @Generated
    @Selector("init")
    public native CLGeocoder init();

    @Generated
    @Selector("isGeocoding")
    public native boolean isGeocoding();

    /**
     * reverse geocode requests
     */
    @Generated
    @Selector("reverseGeocodeLocation:completionHandler:")
    public native void reverseGeocodeLocationCompletionHandler(@NotNull CLLocation location,
            @NotNull @ObjCBlock(name = "call_reverseGeocodeLocationCompletionHandler") Block_reverseGeocodeLocationCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_geocodeAddressDictionaryCompletionHandler {
        @Generated
        void call_geocodeAddressDictionaryCompletionHandler(@Nullable NSArray<? extends CLPlacemark> placemarks,
                @Nullable NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_geocodeAddressStringCompletionHandler {
        @Generated
        void call_geocodeAddressStringCompletionHandler(@Nullable NSArray<? extends CLPlacemark> placemarks,
                @Nullable NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_geocodeAddressStringInRegionCompletionHandler {
        @Generated
        void call_geocodeAddressStringInRegionCompletionHandler(@Nullable NSArray<? extends CLPlacemark> placemarks,
                @Nullable NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_reverseGeocodeLocationCompletionHandler {
        @Generated
        void call_reverseGeocodeLocationCompletionHandler(@Nullable NSArray<? extends CLPlacemark> placemarks,
                @Nullable NSError error);
    }

    /**
     * API-Since: 11.0
     */
    @Generated
    @Selector("geocodeAddressString:inRegion:preferredLocale:completionHandler:")
    public native void geocodeAddressStringInRegionPreferredLocaleCompletionHandler(@NotNull String addressString,
            @Nullable CLRegion region, @Nullable NSLocale locale,
            @NotNull @ObjCBlock(name = "call_geocodeAddressStringInRegionPreferredLocaleCompletionHandler") Block_geocodeAddressStringInRegionPreferredLocaleCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_geocodeAddressStringInRegionPreferredLocaleCompletionHandler {
        @Generated
        void call_geocodeAddressStringInRegionPreferredLocaleCompletionHandler(
                @Nullable NSArray<? extends CLPlacemark> placemarks, @Nullable NSError error);
    }

    /**
     * API-Since: 11.0
     */
    @Generated
    @Selector("geocodePostalAddress:completionHandler:")
    public native void geocodePostalAddressCompletionHandler(@NotNull CNPostalAddress postalAddress,
            @NotNull @ObjCBlock(name = "call_geocodePostalAddressCompletionHandler") Block_geocodePostalAddressCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_geocodePostalAddressCompletionHandler {
        @Generated
        void call_geocodePostalAddressCompletionHandler(@Nullable NSArray<? extends CLPlacemark> placemarks,
                @Nullable NSError error);
    }

    /**
     * API-Since: 11.0
     */
    @Generated
    @Selector("geocodePostalAddress:preferredLocale:completionHandler:")
    public native void geocodePostalAddressPreferredLocaleCompletionHandler(@NotNull CNPostalAddress postalAddress,
            @Nullable NSLocale locale,
            @NotNull @ObjCBlock(name = "call_geocodePostalAddressPreferredLocaleCompletionHandler") Block_geocodePostalAddressPreferredLocaleCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_geocodePostalAddressPreferredLocaleCompletionHandler {
        @Generated
        void call_geocodePostalAddressPreferredLocaleCompletionHandler(
                @Nullable NSArray<? extends CLPlacemark> placemarks, @Nullable NSError error);
    }

    /**
     * API-Since: 11.0
     */
    @Generated
    @Selector("reverseGeocodeLocation:preferredLocale:completionHandler:")
    public native void reverseGeocodeLocationPreferredLocaleCompletionHandler(@NotNull CLLocation location,
            @Nullable NSLocale locale,
            @NotNull @ObjCBlock(name = "call_reverseGeocodeLocationPreferredLocaleCompletionHandler") Block_reverseGeocodeLocationPreferredLocaleCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_reverseGeocodeLocationPreferredLocaleCompletionHandler {
        @Generated
        void call_reverseGeocodeLocationPreferredLocaleCompletionHandler(
                @Nullable NSArray<? extends CLPlacemark> placemarks, @Nullable NSError error);
    }

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}

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

package apple.intents;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSDate;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSNumber;
import apple.foundation.NSSet;
import apple.foundation.NSUserActivity;
import apple.foundation.protocol.NSCopying;
import apple.foundation.protocol.NSSecureCoding;
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
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * API-Since: 10.0
 */
@Generated
@Library("Intents")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class INRideOption extends NSObject implements NSCopying, NSSecureCoding {
    static {
        NatJ.register();
    }

    @Generated
    protected INRideOption(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native INRideOption alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native INRideOption allocWithZone(VoidPtr zone);

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
    public static native INRideOption new_objc();

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
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * Possible party size options for this ride. An empty array indicates selecting a party size is not required.
     */
    @Nullable
    @Generated
    @Selector("availablePartySizeOptions")
    public native NSArray<? extends INRidePartySizeOption> availablePartySizeOptions();

    /**
     * A message that is shown besides the available party sizes for the user.
     */
    @Nullable
    @Generated
    @Selector("availablePartySizeOptionsSelectionPrompt")
    public native String availablePartySizeOptionsSelectionPrompt();

    @NotNull
    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(@Nullable VoidPtr zone);

    /**
     * A message that includes warnings or disclaimers shown to the user before they confirm the request. For example:
     * "This ride may make multiple stops", or "This ride may be shared with other passengers".
     */
    @Nullable
    @Generated
    @Selector("disclaimerMessage")
    public native String disclaimerMessage();

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(@NotNull NSCoder coder);

    /**
     * used for providing an ETA to the user.
     */
    @NotNull
    @Generated
    @Selector("estimatedPickupDate")
    public native NSDate estimatedPickupDate();

    /**
     * A set of line items for fare pricing.
     */
    @Nullable
    @Generated
    @Selector("fareLineItems")
    public native NSArray<? extends INRideFareLineItem> fareLineItems();

    /**
     * a unique identifier for this ride.
     */
    @Nullable
    @Generated
    @Selector("identifier")
    public native String identifier();

    @Generated
    @Selector("init")
    public native INRideOption init();

    @Generated
    @Selector("initWithCoder:")
    public native INRideOption initWithCoder(@NotNull NSCoder decoder);

    @Generated
    @Selector("initWithName:estimatedPickupDate:")
    public native INRideOption initWithNameEstimatedPickupDate(@NotNull String name,
            @NotNull NSDate estimatedPickupDate);

    /**
     * a name for the ride option.
     */
    @NotNull
    @Generated
    @Selector("name")
    public native String name();

    /**
     * The indicative range of prices for this option.
     */
    @Nullable
    @Generated
    @Selector("priceRange")
    public native INPriceRange priceRange();

    /**
     * Possible party size options for this ride. An empty array indicates selecting a party size is not required.
     */
    @Generated
    @Selector("setAvailablePartySizeOptions:")
    public native void setAvailablePartySizeOptions(@Nullable NSArray<? extends INRidePartySizeOption> value);

    /**
     * A message that is shown besides the available party sizes for the user.
     */
    @Generated
    @Selector("setAvailablePartySizeOptionsSelectionPrompt:")
    public native void setAvailablePartySizeOptionsSelectionPrompt(@Nullable String value);

    /**
     * A message that includes warnings or disclaimers shown to the user before they confirm the request. For example:
     * "This ride may make multiple stops", or "This ride may be shared with other passengers".
     */
    @Generated
    @Selector("setDisclaimerMessage:")
    public native void setDisclaimerMessage(@Nullable String value);

    /**
     * used for providing an ETA to the user.
     */
    @Generated
    @Selector("setEstimatedPickupDate:")
    public native void setEstimatedPickupDate(@NotNull NSDate value);

    /**
     * A set of line items for fare pricing.
     */
    @Generated
    @Selector("setFareLineItems:")
    public native void setFareLineItems(@Nullable NSArray<? extends INRideFareLineItem> value);

    /**
     * a unique identifier for this ride.
     */
    @Generated
    @Selector("setIdentifier:")
    public native void setIdentifier(@Nullable String value);

    /**
     * a name for the ride option.
     */
    @Generated
    @Selector("setName:")
    public native void setName(@NotNull String value);

    /**
     * The indicative range of prices for this option.
     */
    @Generated
    @Selector("setPriceRange:")
    public native void setPriceRange(@Nullable INPriceRange value);

    /**
     * eg "47.5x Surge" or "Sale"
     */
    @Generated
    @Selector("setSpecialPricing:")
    public native void setSpecialPricing(@Nullable String value);

    /**
     * a vendor-specific badge image that represents special pricing.
     */
    @Generated
    @Selector("setSpecialPricingBadgeImage:")
    public native void setSpecialPricingBadgeImage(@Nullable INImage value);

    /**
     * If set, the user will be asked to open the ride booking application to book for this ride option. (When the user
     * selects this option, the system will open your application and continue this NSUserActivity in it.) Leave this
     * set to nil to allow an Apple client (e.g. Siri, Maps) to instead book the ride on your app's behalf, which is
     * preferred where possible.
     */
    @Generated
    @Selector("setUserActivityForBookingInApplication:")
    public native void setUserActivityForBookingInApplication(@Nullable NSUserActivity value);

    /**
     * If true, the fare will be metered by the driver, and price range information will be noted as unavailable.
     */
    @Generated
    @Selector("setUsesMeteredFare:")
    public native void setUsesMeteredFare(@Nullable NSNumber value);

    /**
     * eg "47.5x Surge" or "Sale"
     */
    @Nullable
    @Generated
    @Selector("specialPricing")
    public native String specialPricing();

    /**
     * a vendor-specific badge image that represents special pricing.
     */
    @Nullable
    @Generated
    @Selector("specialPricingBadgeImage")
    public native INImage specialPricingBadgeImage();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    /**
     * If set, the user will be asked to open the ride booking application to book for this ride option. (When the user
     * selects this option, the system will open your application and continue this NSUserActivity in it.) Leave this
     * set to nil to allow an Apple client (e.g. Siri, Maps) to instead book the ride on your app's behalf, which is
     * preferred where possible.
     */
    @Nullable
    @Generated
    @Selector("userActivityForBookingInApplication")
    public native NSUserActivity userActivityForBookingInApplication();

    /**
     * If true, the fare will be metered by the driver, and price range information will be noted as unavailable.
     */
    @Nullable
    @Generated
    @Selector("usesMeteredFare")
    public native NSNumber usesMeteredFare();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}

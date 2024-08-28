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
import apple.foundation.NSDateComponents;
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
public class INBookRestaurantReservationIntent extends INIntent implements NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected INBookRestaurantReservationIntent(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native INBookRestaurantReservationIntent alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native INBookRestaurantReservationIntent allocWithZone(VoidPtr zone);

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
    public static native INBookRestaurantReservationIntent new_objc();

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

    @NotNull
    @Generated
    @Selector("bookingDateComponents")
    public native NSDateComponents bookingDateComponents();

    /**
     * unique identifier supplied by vendor to this booking
     */
    @Nullable
    @Generated
    @Selector("bookingIdentifier")
    public native String bookingIdentifier();

    @NotNull
    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(@Nullable VoidPtr zone);

    /**
     * model object containing contact information
     */
    @Nullable
    @Generated
    @Selector("guest")
    public native INRestaurantGuest guest();

    /**
     * text captured in UI from user for special requests
     */
    @Nullable
    @Generated
    @Selector("guestProvidedSpecialRequestText")
    public native String guestProvidedSpecialRequestText();

    @Generated
    @Selector("init")
    public native INBookRestaurantReservationIntent init();

    @Generated
    @Selector("initWithCoder:")
    public native INBookRestaurantReservationIntent initWithCoder(@NotNull NSCoder coder);

    @Generated
    @Selector("partySize")
    @NUInt
    public native long partySize();

    @NotNull
    @Generated
    @Selector("restaurant")
    public native INRestaurant restaurant();

    /**
     * offer selected by user, if one exists
     */
    @Nullable
    @Generated
    @Selector("selectedOffer")
    public native INRestaurantOffer selectedOffer();

    @Generated
    @Selector("setBookingDateComponents:")
    public native void setBookingDateComponents(@NotNull NSDateComponents value);

    /**
     * unique identifier supplied by vendor to this booking
     */
    @Generated
    @Selector("setBookingIdentifier:")
    public native void setBookingIdentifier(@Nullable String value);

    /**
     * model object containing contact information
     */
    @Generated
    @Selector("setGuest:")
    public native void setGuest(@Nullable INRestaurantGuest value);

    /**
     * text captured in UI from user for special requests
     */
    @Generated
    @Selector("setGuestProvidedSpecialRequestText:")
    public native void setGuestProvidedSpecialRequestText(@Nullable String value);

    @Generated
    @Selector("setPartySize:")
    public native void setPartySize(@NUInt long value);

    @Generated
    @Selector("setRestaurant:")
    public native void setRestaurant(@NotNull INRestaurant value);

    /**
     * offer selected by user, if one exists
     */
    @Generated
    @Selector("setSelectedOffer:")
    public native void setSelectedOffer(@Nullable INRestaurantOffer value);

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    /**
     * API-Since: 11.0
     */
    @Generated
    @Selector("initWithRestaurant:bookingDateComponents:partySize:bookingIdentifier:guest:selectedOffer:guestProvidedSpecialRequestText:")
    public native INBookRestaurantReservationIntent initWithRestaurantBookingDateComponentsPartySizeBookingIdentifierGuestSelectedOfferGuestProvidedSpecialRequestText(
            @NotNull INRestaurant restaurant, @NotNull NSDateComponents bookingDateComponents, @NUInt long partySize,
            @Nullable String bookingIdentifier, @Nullable INRestaurantGuest guest,
            @Nullable INRestaurantOffer selectedOffer, @Nullable String guestProvidedSpecialRequestText);

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}

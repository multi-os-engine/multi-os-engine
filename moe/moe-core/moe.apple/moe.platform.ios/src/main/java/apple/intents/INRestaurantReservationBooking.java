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
import apple.foundation.NSSet;
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

/**
 * represents a booking at a restaurant during a given time for a given party size
 */
@Generated
@Library("Intents")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class INRestaurantReservationBooking extends NSObject implements NSSecureCoding, NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected INRestaurantReservationBooking(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native INRestaurantReservationBooking alloc();

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
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @Generated
    @Selector("bookingDate")
    public native NSDate bookingDate();

    /**
     * A nullable string describing the booking
     */
    @Generated
    @Selector("bookingDescription")
    public native String bookingDescription();

    /**
     * A vendor specific identifier that refers to this booking.
     */
    @Generated
    @Selector("bookingIdentifier")
    public native String bookingIdentifier();

    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(VoidPtr zone);

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(NSCoder coder);

    @Generated
    @Selector("init")
    public native INRestaurantReservationBooking init();

    @Generated
    @Selector("initWithCoder:")
    public native INRestaurantReservationBooking initWithCoder(NSCoder coder);

    @Generated
    @Selector("initWithRestaurant:bookingDate:partySize:bookingIdentifier:")
    public native INRestaurantReservationBooking initWithRestaurantBookingDatePartySizeBookingIdentifier(
            INRestaurant restaurant, NSDate bookingDate, @NUInt long partySize, String bookingIdentifier);

    /**
     * Boolean indicating whether timeslot is available for booking. Defaults to YES.
     */
    @Generated
    @Selector("isBookingAvailable")
    public native boolean isBookingAvailable();

    /**
     * Boolean indicating whether timeslot is available for booking. Defaults to YES.
     */
    @Generated
    @Selector("setBookingAvailable:")
    public native void setBookingAvailable(boolean value);

    @Generated
    @Selector("offers")
    public native NSArray<? extends INRestaurantOffer> offers();

    @Generated
    @Selector("partySize")
    @NUInt
    public native long partySize();

    /**
     * YES means an email address is required to book. Defaults to NO.
     */
    @Generated
    @Selector("requiresEmailAddress")
    public native boolean requiresEmailAddress();

    /**
     * YES means restaurant must be contacted by phone before confirmation is given. Defaults to NO.
     */
    @Generated
    @Selector("requiresManualRequest")
    public native boolean requiresManualRequest();

    /**
     * YES means a name is required to book. Defaults to NO.
     */
    @Generated
    @Selector("requiresName")
    public native boolean requiresName();

    /**
     * YES means a phone number required to book. Defaults to NO.
     */
    @Generated
    @Selector("requiresPhoneNumber")
    public native boolean requiresPhoneNumber();

    @Generated
    @Selector("restaurant")
    public native INRestaurant restaurant();

    @Generated
    @Selector("setBookingDate:")
    public native void setBookingDate(NSDate value);

    /**
     * A nullable string describing the booking
     */
    @Generated
    @Selector("setBookingDescription:")
    public native void setBookingDescription(String value);

    /**
     * A vendor specific identifier that refers to this booking.
     */
    @Generated
    @Selector("setBookingIdentifier:")
    public native void setBookingIdentifier(String value);

    @Generated
    @Selector("setOffers:")
    public native void setOffers(NSArray<? extends INRestaurantOffer> value);

    @Generated
    @Selector("setPartySize:")
    public native void setPartySize(@NUInt long value);

    /**
     * YES means an email address is required to book. Defaults to NO.
     */
    @Generated
    @Selector("setRequiresEmailAddress:")
    public native void setRequiresEmailAddress(boolean value);

    /**
     * YES means restaurant must be contacted by phone before confirmation is given. Defaults to NO.
     */
    @Generated
    @Selector("setRequiresManualRequest:")
    public native void setRequiresManualRequest(boolean value);

    /**
     * YES means a name is required to book. Defaults to NO.
     */
    @Generated
    @Selector("setRequiresName:")
    public native void setRequiresName(boolean value);

    /**
     * YES means a phone number required to book. Defaults to NO.
     */
    @Generated
    @Selector("setRequiresPhoneNumber:")
    public native void setRequiresPhoneNumber(boolean value);

    @Generated
    @Selector("setRestaurant:")
    public native void setRestaurant(INRestaurant value);

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }
}

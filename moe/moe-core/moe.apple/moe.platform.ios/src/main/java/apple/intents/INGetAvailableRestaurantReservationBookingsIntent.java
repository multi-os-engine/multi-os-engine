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
import apple.foundation.NSDateComponents;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSNumber;
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

@Generated
@Library("Intents")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class INGetAvailableRestaurantReservationBookingsIntent extends INIntent implements NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected INGetAvailableRestaurantReservationBookingsIntent(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native INGetAvailableRestaurantReservationBookingsIntent alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native INGetAvailableRestaurantReservationBookingsIntent allocWithZone(VoidPtr zone);

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
    public static native INGetAvailableRestaurantReservationBookingsIntent new_objc();

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
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(VoidPtr zone);

    @Generated
    @Selector("earliestBookingDateForResults")
    public native NSDate earliestBookingDateForResults();

    @Generated
    @Selector("init")
    public native INGetAvailableRestaurantReservationBookingsIntent init();

    @Generated
    @Selector("initWithCoder:")
    public native INGetAvailableRestaurantReservationBookingsIntent initWithCoder(NSCoder coder);

    @Generated
    @Selector("latestBookingDateForResults")
    public native NSDate latestBookingDateForResults();

    /**
     * if the caller has a preferred maximum number of results, one can optionally be specified. a nil here leaves it up
     * to the extension
     */
    @Generated
    @Selector("maximumNumberOfResults")
    public native NSNumber maximumNumberOfResults();

    @Generated
    @Selector("partySize")
    @NUInt
    public native long partySize();

    @Generated
    @Selector("preferredBookingDateComponents")
    public native NSDateComponents preferredBookingDateComponents();

    @Generated
    @Selector("restaurant")
    public native INRestaurant restaurant();

    @Generated
    @Selector("setEarliestBookingDateForResults:")
    public native void setEarliestBookingDateForResults(NSDate value);

    @Generated
    @Selector("setLatestBookingDateForResults:")
    public native void setLatestBookingDateForResults(NSDate value);

    /**
     * if the caller has a preferred maximum number of results, one can optionally be specified. a nil here leaves it up
     * to the extension
     */
    @Generated
    @Selector("setMaximumNumberOfResults:")
    public native void setMaximumNumberOfResults(NSNumber value);

    @Generated
    @Selector("setPartySize:")
    public native void setPartySize(@NUInt long value);

    @Generated
    @Selector("setPreferredBookingDateComponents:")
    public native void setPreferredBookingDateComponents(NSDateComponents value);

    @Generated
    @Selector("setRestaurant:")
    public native void setRestaurant(INRestaurant value);

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    @Generated
    @Selector("initWithRestaurant:partySize:preferredBookingDateComponents:maximumNumberOfResults:earliestBookingDateForResults:latestBookingDateForResults:")
    public native INGetAvailableRestaurantReservationBookingsIntent initWithRestaurantPartySizePreferredBookingDateComponentsMaximumNumberOfResultsEarliestBookingDateForResultsLatestBookingDateForResults(
            INRestaurant restaurant, @NUInt long partySize, NSDateComponents preferredBookingDateComponents,
            NSNumber maximumNumberOfResults, NSDate earliestBookingDateForResults, NSDate latestBookingDateForResults);
}

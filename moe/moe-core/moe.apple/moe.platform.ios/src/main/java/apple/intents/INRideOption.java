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
    @Selector("availablePartySizeOptions")
    public native NSArray<? extends INRidePartySizeOption> availablePartySizeOptions();

    @Generated
    @Selector("availablePartySizeOptionsSelectionPrompt")
    public native String availablePartySizeOptionsSelectionPrompt();

    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(VoidPtr zone);

    @Generated
    @Selector("disclaimerMessage")
    public native String disclaimerMessage();

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(NSCoder aCoder);

    @Generated
    @Selector("estimatedPickupDate")
    public native NSDate estimatedPickupDate();

    @Generated
    @Selector("fareLineItems")
    public native NSArray<? extends INRideFareLineItem> fareLineItems();

    @Generated
    @Selector("identifier")
    public native String identifier();

    @Generated
    @Selector("init")
    public native INRideOption init();

    @Generated
    @Selector("initWithCoder:")
    public native INRideOption initWithCoder(NSCoder decoder);

    @Generated
    @Selector("initWithName:estimatedPickupDate:")
    public native INRideOption initWithNameEstimatedPickupDate(String name, NSDate estimatedPickupDate);

    @Generated
    @Selector("name")
    public native String name();

    @Generated
    @Selector("priceRange")
    public native INPriceRange priceRange();

    @Generated
    @Selector("setAvailablePartySizeOptions:")
    public native void setAvailablePartySizeOptions(NSArray<? extends INRidePartySizeOption> value);

    @Generated
    @Selector("setAvailablePartySizeOptionsSelectionPrompt:")
    public native void setAvailablePartySizeOptionsSelectionPrompt(String value);

    @Generated
    @Selector("setDisclaimerMessage:")
    public native void setDisclaimerMessage(String value);

    @Generated
    @Selector("setEstimatedPickupDate:")
    public native void setEstimatedPickupDate(NSDate value);

    @Generated
    @Selector("setFareLineItems:")
    public native void setFareLineItems(NSArray<? extends INRideFareLineItem> value);

    @Generated
    @Selector("setIdentifier:")
    public native void setIdentifier(String value);

    @Generated
    @Selector("setName:")
    public native void setName(String value);

    @Generated
    @Selector("setPriceRange:")
    public native void setPriceRange(INPriceRange value);

    @Generated
    @Selector("setSpecialPricing:")
    public native void setSpecialPricing(String value);

    @Generated
    @Selector("setSpecialPricingBadgeImage:")
    public native void setSpecialPricingBadgeImage(INImage value);

    @Generated
    @Selector("setUserActivityForBookingInApplication:")
    public native void setUserActivityForBookingInApplication(NSUserActivity value);

    @Generated
    @Selector("setUsesMeteredFare:")
    public native void setUsesMeteredFare(NSNumber value);

    @Generated
    @Selector("specialPricing")
    public native String specialPricing();

    @Generated
    @Selector("specialPricingBadgeImage")
    public native INImage specialPricingBadgeImage();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    @Generated
    @Selector("userActivityForBookingInApplication")
    public native NSUserActivity userActivityForBookingInApplication();

    @Generated
    @Selector("usesMeteredFare")
    public native NSNumber usesMeteredFare();
}

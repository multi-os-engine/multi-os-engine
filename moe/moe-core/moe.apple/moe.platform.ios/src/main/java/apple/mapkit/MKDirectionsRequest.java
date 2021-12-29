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

package apple.mapkit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSDate;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.NSURL;
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
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("MapKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MKDirectionsRequest extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected MKDirectionsRequest(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MKDirectionsRequest alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native MKDirectionsRequest allocWithZone(VoidPtr zone);

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
    @Selector("isDirectionsRequestURL:")
    public static native boolean isDirectionsRequestURL(NSURL url);

    @Generated
    @Selector("isSubclassOfClass:")
    public static native boolean isSubclassOfClass(Class aClass);

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

    @Generated
    @Owned
    @Selector("new")
    public static native MKDirectionsRequest new_objc();

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
    @Selector("arrivalDate")
    public native NSDate arrivalDate();

    /**
     * Set either departure or arrival date to hint to the route server when the trip will take place.
     */
    @Generated
    @Selector("departureDate")
    public native NSDate departureDate();

    @Generated
    @Selector("destination")
    public native MKMapItem destination();

    @Generated
    @Selector("init")
    public native MKDirectionsRequest init();

    @Generated
    @Selector("initWithContentsOfURL:")
    public native MKDirectionsRequest initWithContentsOfURL(NSURL url);

    /**
     * if YES and there is more than one reasonable way to route from source to destination, allow the route server to return multiple routes. Default is NO.
     */
    @Generated
    @Selector("requestsAlternateRoutes")
    public native boolean requestsAlternateRoutes();

    @Generated
    @Selector("setArrivalDate:")
    public native void setArrivalDate(NSDate value);

    /**
     * Set either departure or arrival date to hint to the route server when the trip will take place.
     */
    @Generated
    @Selector("setDepartureDate:")
    public native void setDepartureDate(NSDate value);

    @Generated
    @Selector("setDestination:")
    public native void setDestination(MKMapItem destination);

    /**
     * if YES and there is more than one reasonable way to route from source to destination, allow the route server to return multiple routes. Default is NO.
     */
    @Generated
    @Selector("setRequestsAlternateRoutes:")
    public native void setRequestsAlternateRoutes(boolean value);

    @Generated
    @Selector("setSource:")
    public native void setSource(MKMapItem source);

    /**
     * Default is MKDirectionsTransportTypeAny
     */
    @Generated
    @Selector("setTransportType:")
    public native void setTransportType(@NUInt long value);

    @Generated
    @Selector("source")
    public native MKMapItem source();

    /**
     * Default is MKDirectionsTransportTypeAny
     */
    @Generated
    @Selector("transportType")
    @NUInt
    public native long transportType();
}

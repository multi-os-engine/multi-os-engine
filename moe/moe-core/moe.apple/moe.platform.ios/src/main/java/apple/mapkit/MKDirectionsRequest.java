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
    @Owned
    @Selector("alloc")
    public static native MKDirectionsRequest alloc();

    /**
     * arrivalDate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MapKit/Reference/MKDirectionsRequest_class/index.html#//apple_ref/occ/instp/MKDirectionsRequest/arrivalDate">iOS Dev Center</a>
     */
    @Generated
    @Selector("arrivalDate")
    public native NSDate arrivalDate();

    /**
     * departureDate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MapKit/Reference/MKDirectionsRequest_class/index.html#//apple_ref/occ/instp/MKDirectionsRequest/departureDate">iOS Dev Center</a>
     */
    @Generated
    @Selector("departureDate")
    public native NSDate departureDate();

    /**
     * destination</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MapKit/Reference/MKDirectionsRequest_class/index.html#//apple_ref/occ/instp/MKDirectionsRequest/destination">iOS Dev Center</a>
     */
    @Generated
    @Selector("destination")
    public native MKMapItem destination();

    @Generated
    @Selector("init")
    public native MKDirectionsRequest init();

    /**
     * initWithContentsOfURL:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MapKit/Reference/MKDirectionsRequest_class/index.html#//apple_ref/occ/instm/MKDirectionsRequest/initWithContentsOfURL:">iOS Dev Center</a>
     */
    @Generated
    @Selector("initWithContentsOfURL:")
    public native MKDirectionsRequest initWithContentsOfURL(NSURL url);

    /**
     * isDirectionsRequestURL:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MapKit/Reference/MKDirectionsRequest_class/index.html#//apple_ref/occ/clm/MKDirectionsRequest/isDirectionsRequestURL:">iOS Dev Center</a>
     */
    @Generated
    @Selector("isDirectionsRequestURL:")
    public static native boolean isDirectionsRequestURL(NSURL url);

    /**
     * requestsAlternateRoutes</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MapKit/Reference/MKDirectionsRequest_class/index.html#//apple_ref/occ/instp/MKDirectionsRequest/requestsAlternateRoutes">iOS Dev Center</a>
     */
    @Generated
    @Selector("requestsAlternateRoutes")
    public native boolean requestsAlternateRoutes();

    /**
     * arrivalDate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MapKit/Reference/MKDirectionsRequest_class/index.html#//apple_ref/occ/instp/MKDirectionsRequest/arrivalDate">iOS Dev Center</a>
     */
    @Generated
    @Selector("setArrivalDate:")
    public native void setArrivalDate(NSDate value);

    /**
     * departureDate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MapKit/Reference/MKDirectionsRequest_class/index.html#//apple_ref/occ/instp/MKDirectionsRequest/departureDate">iOS Dev Center</a>
     */
    @Generated
    @Selector("setDepartureDate:")
    public native void setDepartureDate(NSDate value);

    /**
     * setDestination:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MapKit/Reference/MKDirectionsRequest_class/index.html#//apple_ref/occ/instm/MKDirectionsRequest/setDestination:">iOS Dev Center</a>
     */
    @Generated
    @Selector("setDestination:")
    public native void setDestination(MKMapItem destination);

    /**
     * requestsAlternateRoutes</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MapKit/Reference/MKDirectionsRequest_class/index.html#//apple_ref/occ/instp/MKDirectionsRequest/requestsAlternateRoutes">iOS Dev Center</a>
     */
    @Generated
    @Selector("setRequestsAlternateRoutes:")
    public native void setRequestsAlternateRoutes(boolean value);

    /**
     * setSource:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MapKit/Reference/MKDirectionsRequest_class/index.html#//apple_ref/occ/instm/MKDirectionsRequest/setSource:">iOS Dev Center</a>
     */
    @Generated
    @Selector("setSource:")
    public native void setSource(MKMapItem source);

    /**
     * transportType</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MapKit/Reference/MKDirectionsRequest_class/index.html#//apple_ref/occ/instp/MKDirectionsRequest/transportType">iOS Dev Center</a>
     */
    @Generated
    @Selector("setTransportType:")
    public native void setTransportType(@NUInt long value);

    /**
     * source</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MapKit/Reference/MKDirectionsRequest_class/index.html#//apple_ref/occ/instp/MKDirectionsRequest/source">iOS Dev Center</a>
     */
    @Generated
    @Selector("source")
    public native MKMapItem source();

    /**
     * transportType</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MapKit/Reference/MKDirectionsRequest_class/index.html#//apple_ref/occ/instp/MKDirectionsRequest/transportType">iOS Dev Center</a>
     */
    @Generated
    @Selector("transportType")
    @NUInt
    public native long transportType();

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

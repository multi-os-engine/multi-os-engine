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
import apple.corelocation.struct.CLLocationCoordinate2D;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSCopying;
import apple.foundation.protocol.NSSecureCoding;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NFloat;
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
@Library("MapKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MKMapCamera extends NSObject implements NSSecureCoding, NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected MKMapCamera(Pointer peer) {
        super(peer);
    }

    @Generated
    @Owned
    @Selector("alloc")
    public static native MKMapCamera alloc();

    /**
     * camera</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MapKit/Reference/MKMapCamera_class/index.html#//apple_ref/occ/clm/MKMapCamera/camera">iOS Dev Center</a>
     */
    @Generated
    @Selector("camera")
    public static native MKMapCamera camera();

    /**
     * cameraLookingAtCenterCoordinate:fromEyeCoordinate:eyeAltitude:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MapKit/Reference/MKMapCamera_class/index.html#//apple_ref/occ/clm/MKMapCamera/cameraLookingAtCenterCoordinate:fromEyeCoordinate:eyeAltitude:">iOS Dev Center</a>
     */
    @Generated
    @Selector("cameraLookingAtCenterCoordinate:fromEyeCoordinate:eyeAltitude:")
    public static native MKMapCamera cameraLookingAtCenterCoordinateFromEyeCoordinateEyeAltitude(
            @ByValue CLLocationCoordinate2D centerCoordinate, @ByValue CLLocationCoordinate2D eyeCoordinate,
            double eyeAltitude);

    @Generated
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

    /**
     * cameraLookingAtCenterCoordinate:fromDistance:pitch:heading:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MapKit/Reference/MKMapCamera_class/index.html#//apple_ref/occ/clm/MKMapCamera/cameraLookingAtCenterCoordinate:fromDistance:pitch:heading:">iOS Dev Center</a>
     */
    @Generated
    @Selector("cameraLookingAtCenterCoordinate:fromDistance:pitch:heading:")
    public static native MKMapCamera cameraLookingAtCenterCoordinateFromDistancePitchHeading(
            @ByValue CLLocationCoordinate2D centerCoordinate, double distance, @NFloat double pitch, double heading);

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
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * altitude</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MapKit/Reference/MKMapCamera_class/index.html#//apple_ref/occ/instp/MKMapCamera/altitude">iOS Dev Center</a>
     */
    @Generated
    @Selector("altitude")
    public native double altitude();

    /**
     * centerCoordinate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MapKit/Reference/MKMapCamera_class/index.html#//apple_ref/occ/instp/MKMapCamera/centerCoordinate">iOS Dev Center</a>
     */
    @Generated
    @Selector("centerCoordinate")
    @ByValue
    public native CLLocationCoordinate2D centerCoordinate();

    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(VoidPtr zone);

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(NSCoder aCoder);

    /**
     * heading</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MapKit/Reference/MKMapCamera_class/index.html#//apple_ref/occ/instp/MKMapCamera/heading">iOS Dev Center</a>
     */
    @Generated
    @Selector("heading")
    public native double heading();

    @Generated
    @Selector("init")
    public native MKMapCamera init();

    @Generated
    @Selector("initWithCoder:")
    public native MKMapCamera initWithCoder(NSCoder aDecoder);

    /**
     * pitch</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MapKit/Reference/MKMapCamera_class/index.html#//apple_ref/occ/instp/MKMapCamera/pitch">iOS Dev Center</a>
     */
    @Generated
    @Selector("pitch")
    @NFloat
    public native double pitch();

    /**
     * altitude</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MapKit/Reference/MKMapCamera_class/index.html#//apple_ref/occ/instp/MKMapCamera/altitude">iOS Dev Center</a>
     */
    @Generated
    @Selector("setAltitude:")
    public native void setAltitude(double value);

    /**
     * centerCoordinate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MapKit/Reference/MKMapCamera_class/index.html#//apple_ref/occ/instp/MKMapCamera/centerCoordinate">iOS Dev Center</a>
     */
    @Generated
    @Selector("setCenterCoordinate:")
    public native void setCenterCoordinate(@ByValue CLLocationCoordinate2D value);

    /**
     * heading</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MapKit/Reference/MKMapCamera_class/index.html#//apple_ref/occ/instp/MKMapCamera/heading">iOS Dev Center</a>
     */
    @Generated
    @Selector("setHeading:")
    public native void setHeading(double value);

    /**
     * pitch</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MapKit/Reference/MKMapCamera_class/index.html#//apple_ref/occ/instp/MKMapCamera/pitch">iOS Dev Center</a>
     */
    @Generated
    @Selector("setPitch:")
    public native void setPitch(@NFloat double value);

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }
}

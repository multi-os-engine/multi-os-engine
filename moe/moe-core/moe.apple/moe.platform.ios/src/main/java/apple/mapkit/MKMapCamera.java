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
import apple.corefoundation.struct.CGSize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

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
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MKMapCamera alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native MKMapCamera allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    @Generated
    @Selector("camera")
    public static native MKMapCamera camera();

    /**
     * API-Since: 9.0
     */
    @Generated
    @Selector("cameraLookingAtCenterCoordinate:fromDistance:pitch:heading:")
    public static native MKMapCamera cameraLookingAtCenterCoordinateFromDistancePitchHeading(
            @ByValue CLLocationCoordinate2D centerCoordinate, double distance, @NFloat double pitch, double heading);

    @Generated
    @Selector("cameraLookingAtCenterCoordinate:fromEyeCoordinate:eyeAltitude:")
    public static native MKMapCamera cameraLookingAtCenterCoordinateFromEyeCoordinateEyeAltitude(
            @ByValue CLLocationCoordinate2D centerCoordinate, @ByValue CLLocationCoordinate2D eyeCoordinate,
            double eyeAltitude);

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
    public static native MKMapCamera new_objc();

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
     * API-Since: 7.0
     * Deprecated-Since: 100000.0
     * Deprecated-Message: Use centerCoordinateDistance
     */
    @Deprecated
    @Generated
    @Selector("altitude")
    public native double altitude();

    @Generated
    @Selector("centerCoordinate")
    @ByValue
    public native CLLocationCoordinate2D centerCoordinate();

    @NotNull
    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(@Nullable VoidPtr zone);

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(@NotNull NSCoder coder);

    @Generated
    @Selector("heading")
    public native double heading();

    @Generated
    @Selector("init")
    public native MKMapCamera init();

    @Generated
    @Selector("initWithCoder:")
    public native MKMapCamera initWithCoder(@NotNull NSCoder coder);

    /**
     * In degrees where 0 is looking straight down. Pitch may be clamped to an appropriate value.
     */
    @Generated
    @Selector("pitch")
    @NFloat
    public native double pitch();

    /**
     * API-Since: 7.0
     * Deprecated-Since: 100000.0
     * Deprecated-Message: Use centerCoordinateDistance
     */
    @Deprecated
    @Generated
    @Selector("setAltitude:")
    public native void setAltitude(double value);

    @Generated
    @Selector("setCenterCoordinate:")
    public native void setCenterCoordinate(@ByValue CLLocationCoordinate2D value);

    @Generated
    @Selector("setHeading:")
    public native void setHeading(double value);

    /**
     * In degrees where 0 is looking straight down. Pitch may be clamped to an appropriate value.
     */
    @Generated
    @Selector("setPitch:")
    public native void setPitch(@NFloat double value);

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    /**
     * API-Since: 13.0
     */
    @Generated
    @Selector("centerCoordinateDistance")
    public native double centerCoordinateDistance();

    /**
     * API-Since: 13.0
     */
    @Generated
    @Selector("setCenterCoordinateDistance:")
    public native void setCenterCoordinateDistance(double value);

    /**
     * API-Since: 16.0
     */
    @Generated
    @Selector("cameraLookingAtMapItem:forViewSize:allowPitch:")
    public static native MKMapCamera cameraLookingAtMapItemForViewSizeAllowPitch(@NotNull MKMapItem mapItem,
            @ByValue CGSize viewSize, boolean allowPitch);

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}

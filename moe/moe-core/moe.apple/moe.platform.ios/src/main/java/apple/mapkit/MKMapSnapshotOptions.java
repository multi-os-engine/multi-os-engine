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
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSCopying;
import apple.mapkit.struct.MKCoordinateRegion;
import apple.mapkit.struct.MKMapRect;
import apple.uikit.UITraitCollection;
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
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import apple.corefoundation.struct.CGSize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * API-Since: 7.0
 */
@Generated
@Library("MapKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MKMapSnapshotOptions extends NSObject implements NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected MKMapSnapshotOptions(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MKMapSnapshotOptions alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native MKMapSnapshotOptions allocWithZone(VoidPtr zone);

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
    public static native MKMapSnapshotOptions new_objc();

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

    @NotNull
    @Generated
    @Selector("camera")
    public native MKMapCamera camera();

    @NotNull
    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(@Nullable VoidPtr zone);

    @Generated
    @Selector("init")
    public native MKMapSnapshotOptions init();

    @Generated
    @Selector("mapRect")
    @ByValue
    public native MKMapRect mapRect();

    @Generated
    @Selector("mapType")
    @NUInt
    public native long mapType();

    @Generated
    @Selector("region")
    @ByValue
    public native MKCoordinateRegion region();

    /**
     * Defaults to the device's screen scale
     * 
     * API-Since: 7.0
     * Deprecated-Since: 100000.0
     * Deprecated-Message: Use traitCollection.displayScale
     */
    @Deprecated
    @Generated
    @Selector("scale")
    @NFloat
    public native double scale();

    @Generated
    @Selector("setCamera:")
    public native void setCamera(@NotNull MKMapCamera value);

    @Generated
    @Selector("setMapRect:")
    public native void setMapRect(@ByValue MKMapRect value);

    @Generated
    @Selector("setMapType:")
    public native void setMapType(@NUInt long value);

    @Generated
    @Selector("setRegion:")
    public native void setRegion(@ByValue MKCoordinateRegion value);

    /**
     * Defaults to the device's screen scale
     * 
     * API-Since: 7.0
     * Deprecated-Since: 100000.0
     * Deprecated-Message: Use traitCollection.displayScale
     */
    @Deprecated
    @Generated
    @Selector("setScale:")
    public native void setScale(@NFloat double value);

    /**
     * Affects MKMapTypeStandard
     */
    @Generated
    @Selector("setShowsBuildings:")
    public native void setShowsBuildings(boolean value);

    /**
     * Affects MKMapTypeStandard and MKMapTypeHybrid
     * 
     * API-Since: 7.0
     * Deprecated-Since: 13.0
     * Deprecated-Message: Use pointOfInterestFilter
     */
    @Deprecated
    @Generated
    @Selector("setShowsPointsOfInterest:")
    public native void setShowsPointsOfInterest(boolean value);

    @Generated
    @Selector("setSize:")
    public native void setSize(@ByValue CGSize value);

    /**
     * Affects MKMapTypeStandard
     */
    @Generated
    @Selector("showsBuildings")
    public native boolean showsBuildings();

    /**
     * Affects MKMapTypeStandard and MKMapTypeHybrid
     * 
     * API-Since: 7.0
     * Deprecated-Since: 13.0
     * Deprecated-Message: Use pointOfInterestFilter
     */
    @Deprecated
    @Generated
    @Selector("showsPointsOfInterest")
    public native boolean showsPointsOfInterest();

    @Generated
    @Selector("size")
    @ByValue
    public native CGSize size();

    /**
     * API-Since: 13.0
     */
    @Nullable
    @Generated
    @Selector("pointOfInterestFilter")
    public native MKPointOfInterestFilter pointOfInterestFilter();

    /**
     * API-Since: 13.0
     */
    @Generated
    @Selector("setPointOfInterestFilter:")
    public native void setPointOfInterestFilter(@Nullable MKPointOfInterestFilter value);

    /**
     * API-Since: 13.0
     */
    @Generated
    @Selector("setTraitCollection:")
    public native void setTraitCollection(@NotNull UITraitCollection value);

    /**
     * API-Since: 13.0
     */
    @NotNull
    @Generated
    @Selector("traitCollection")
    public native UITraitCollection traitCollection();
}

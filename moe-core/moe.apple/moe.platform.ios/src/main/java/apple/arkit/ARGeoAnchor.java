package apple.arkit;

import apple.NSObject;
import apple.arkit.protocol.ARTrackable;
import apple.corelocation.struct.CLLocationCoordinate2D;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
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
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * An anchor representing a geographical location in the world.
 * 
 * The anchor's transform will be automatically updated by the session based on location and heading.
 * The session needs to be configured with ARGeoTrackingConfiguration.
 * 
 * API-Since: 14.0
 */
@Generated
@Library("ARKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class ARGeoAnchor extends ARAnchor implements ARTrackable {
    static {
        NatJ.register();
    }

    @Generated
    protected ARGeoAnchor(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native ARGeoAnchor alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native ARGeoAnchor allocWithZone(VoidPtr zone);

    /**
     * The distance to mean sea level, in meters (negative values indicate it's below sea level).
     * 
     * Only valid when altitudeSource is not ARAltitudeSourceUnknown.
     */
    @Generated
    @Selector("altitude")
    public native double altitude();

    /**
     * The source of altitude information. If the user did not provide the altitude, ARKit populates this property to
     * indicate the expected accuracy depending on the available altitude data.
     */
    @Generated
    @Selector("altitudeSource")
    @NInt
    public native long altitudeSource();

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

    /**
     * The coordinate where this anchor will be placed.
     * 
     * The anchor's transform will be automatically updated by the session when ARGeoTrackingConfiguration is set.
     */
    @Generated
    @Selector("coordinate")
    @ByValue
    public native CLLocationCoordinate2D coordinate();

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
    @Selector("init")
    public native ARGeoAnchor init();

    @Generated
    @Selector("initWithAnchor:")
    public native ARGeoAnchor initWithAnchor(@NotNull ARAnchor anchor);

    @Generated
    @Selector("initWithCoder:")
    public native ARGeoAnchor initWithCoder(@NotNull NSCoder coder);

    /**
     * Initializes a new ARGeoAnchor with the given coordinates.
     * 
     * ARKit will query the ground level altitude during runtime, and populate the altitude as soon as that information
     * becomes available.
     * 
     * @param coordinate Coordinates.
     */
    @Generated
    @Selector("initWithCoordinate:")
    public native ARGeoAnchor initWithCoordinate(@ByValue CLLocationCoordinate2D coordinate);

    /**
     * Initializes a new ARGeoAnchor with the given coordinates and altitude.
     * 
     * @param coordinate Coordinates.
     * @param altitude   Altitude in meters.
     */
    @Generated
    @Selector("initWithCoordinate:altitude:")
    public native ARGeoAnchor initWithCoordinateAltitude(@ByValue CLLocationCoordinate2D coordinate, double altitude);

    /**
     * Initializes a new named ARGeoAnchor with the given coordinates.
     * 
     * ARKit will query the ground level altitude during runtime, and populate the altitude as soon as that information
     * becomes available.
     * 
     * @param name       Name of the anchor.
     * @param coordinate Coordinates.
     */
    @Generated
    @Selector("initWithName:coordinate:")
    public native ARGeoAnchor initWithNameCoordinate(@NotNull String name, @ByValue CLLocationCoordinate2D coordinate);

    /**
     * Initializes a new named ARGeoAnchor with the given coordinates and altitude.
     * 
     * @param name       Name of the anchor.
     * @param coordinate Coordinates.
     * @param altitude   Altitude in meters.
     */
    @Generated
    @Selector("initWithName:coordinate:altitude:")
    public native ARGeoAnchor initWithNameCoordinateAltitude(@NotNull String name,
            @ByValue CLLocationCoordinate2D coordinate, double altitude);

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
    @Selector("isTracked")
    public native boolean isTracked();

    @NotNull
    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    @Generated
    @Owned
    @Selector("new")
    public static native ARGeoAnchor new_objc();

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
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}

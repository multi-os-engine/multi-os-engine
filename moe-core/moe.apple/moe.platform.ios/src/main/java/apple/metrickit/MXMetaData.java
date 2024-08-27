package apple.metrickit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSData;
import apple.foundation.NSDictionary;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSSecureCoding;
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
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * MXMetaData
 * 
 * A class that contains miscellaneous metadata about an associated payload.
 * 
 * API-Since: 13.0
 */
@Generated
@Library("MetricKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MXMetaData extends NSObject implements NSSecureCoding {
    static {
        NatJ.register();
    }

    @Generated
    protected MXMetaData(Pointer peer) {
        super(peer);
    }

    /**
     * DictionaryRepresentation
     * 
     * Convenience method to return a NSDictionary representation of this metadata.
     * 
     * @return An NSDictionary object containing the dictionary representation
     * 
     *         API-Since: 13.0
     *         Deprecated-Since: 100000.0
     */
    @NotNull
    @Deprecated
    @Generated
    @Selector("DictionaryRepresentation")
    public native NSDictionary<?, ?> DictionaryRepresentation();

    /**
     * JSONRepresentation
     * 
     * Convenience method to return a JSON representation of this metadata.
     * 
     * @return An NSData object containing the JSON representation
     */
    @NotNull
    @Generated
    @Selector("JSONRepresentation")
    public native NSData JSONRepresentation();

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MXMetaData alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native MXMetaData allocWithZone(VoidPtr zone);

    /**
     * [@property] applicationBuildVersion
     * 
     * An NSString designating the app build version.
     */
    @NotNull
    @Generated
    @Selector("applicationBuildVersion")
    public native String applicationBuildVersion();

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

    /**
     * [@property] deviceType
     * 
     * An NSString designating the device type associated with this device.
     */
    @NotNull
    @Generated
    @Selector("deviceType")
    public native String deviceType();

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(@NotNull NSCoder coder);

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native MXMetaData init();

    @Generated
    @Selector("initWithCoder:")
    public native MXMetaData initWithCoder(@NotNull NSCoder coder);

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
    public static native MXMetaData new_objc();

    /**
     * [@property] osVersion
     * 
     * An NSString designating the OS version associated with the device.
     */
    @NotNull
    @Generated
    @Selector("osVersion")
    public native String osVersion();

    /**
     * [@property] regionFormat
     * 
     * An NSString designating the region format associated with the application.
     */
    @NotNull
    @Generated
    @Selector("regionFormat")
    public native String regionFormat();

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

    /**
     * dictionaryRepresentation
     * 
     * Convenience method to return a NSDictionary representation of this metadata.
     * 
     * @return An NSDictionary object containing the dictionary representation
     * 
     *         API-Since: 14.0
     */
    @NotNull
    @Generated
    @Selector("dictionaryRepresentation")
    public native NSDictionary<?, ?> dictionaryRepresentation();

    /**
     * [@property] platformArchitecture
     * 
     * An NSString designating the current architecture.
     * 
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @Selector("platformArchitecture")
    public native String platformArchitecture();

    /**
     * [@property] isTestFlightApp
     * 
     * A boolean representing if the app is registered as a testFlightApp
     * 
     * API-Since: 17.0
     */
    @Generated
    @Selector("isTestFlightApp")
    public native boolean isTestFlightApp();

    /**
     * [@property] lowPowerModeEnabled
     * 
     * A boolean representing low power mode enablement on device
     * 
     * API-Since: 17.0
     */
    @Generated
    @Selector("lowPowerModeEnabled")
    public native boolean lowPowerModeEnabled();

    /**
     * [@property] pid
     * 
     * pid of the process
     * [@note] A value of -1 indicates that the PID was unavailable for the containing payload.
     * 
     * API-Since: 17.0
     */
    @Generated
    @Selector("pid")
    public native int pid();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}

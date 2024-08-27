package apple.matter;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSDictionary;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSNumber;
import apple.foundation.NSSet;
import apple.opaque.dispatch_queue_t;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
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

/**
 * * Cluster Basic Information
 * * This cluster provides attributes and events for determining basic information about Nodes, which supports both
 * Commissioning and operational determination of Node characteristics, such as Vendor ID, Product ID and serial number,
 * which apply to the whole Node. Also allows setting user device information such as location.
 * 
 * API-Since: 16.4
 */
@Generated
@Library("Matter")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MTRClusterBasicInformation extends MTRCluster {
    static {
        NatJ.register();
    }

    @Generated
    protected MTRClusterBasicInformation(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MTRClusterBasicInformation alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native MTRClusterBasicInformation allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(
            @Mapped(ObjCObjectMapper.class) @NotNull Object aTarget);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
    public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
            @Mapped(ObjCObjectMapper.class) @NotNull Object aTarget, @NotNull SEL aSelector,
            @Mapped(ObjCObjectMapper.class) @Nullable Object anArgument);

    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    @NotNull
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @Generated
    @Selector("classForKeyedUnarchiver")
    @NotNull
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
    @Selector("init")
    public native MTRClusterBasicInformation init();

    /**
     * For all instance methods that take a completion (i.e. command invocations),
     * the completion will be called on the provided queue.
     * 
     * API-Since: 16.4
     */
    @Generated
    @Selector("initWithDevice:endpointID:queue:")
    public native MTRClusterBasicInformation initWithDeviceEndpointIDQueue(@NotNull MTRDevice device,
            @NotNull NSNumber endpointID, @NotNull dispatch_queue_t queue);

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
    @NotNull
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    @Generated
    @Owned
    @Selector("new")
    public static native MTRClusterBasicInformation new_objc();

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeAcceptedCommandListWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeAcceptedCommandListWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeAttributeListWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeAttributeListWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeCapabilityMinimaWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeCapabilityMinimaWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeClusterRevisionWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeClusterRevisionWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeDataModelRevisionWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeDataModelRevisionWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeFeatureMapWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeFeatureMapWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeGeneratedCommandListWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeGeneratedCommandListWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeHardwareVersionStringWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeHardwareVersionStringWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeHardwareVersionWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeHardwareVersionWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeLocalConfigDisabledWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeLocalConfigDisabledWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeLocationWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeLocationWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeManufacturingDateWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeManufacturingDateWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeNodeLabelWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeNodeLabelWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributePartNumberWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributePartNumberWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 17.0
     */
    @Generated
    @Selector("readAttributeProductAppearanceWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeProductAppearanceWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeProductIDWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeProductIDWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeProductLabelWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeProductLabelWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeProductNameWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeProductNameWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeProductURLWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeProductURLWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeReachableWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeReachableWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeSerialNumberWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeSerialNumberWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeSoftwareVersionStringWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeSoftwareVersionStringWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeSoftwareVersionWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeSoftwareVersionWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeUniqueIDWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeUniqueIDWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeVendorIDWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeVendorIDWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeVendorNameWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeVendorNameWithParams(@Nullable MTRReadParams params);

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
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeLocalConfigDisabledWithValue:expectedValueInterval:")
    public native void writeAttributeLocalConfigDisabledWithValueExpectedValueInterval(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeLocalConfigDisabledWithValue:expectedValueInterval:params:")
    public native void writeAttributeLocalConfigDisabledWithValueExpectedValueIntervalParams(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs,
            @Nullable MTRWriteParams params);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeLocationWithValue:expectedValueInterval:")
    public native void writeAttributeLocationWithValueExpectedValueInterval(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeLocationWithValue:expectedValueInterval:params:")
    public native void writeAttributeLocationWithValueExpectedValueIntervalParams(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs,
            @Nullable MTRWriteParams params);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeNodeLabelWithValue:expectedValueInterval:")
    public native void writeAttributeNodeLabelWithValueExpectedValueInterval(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeNodeLabelWithValue:expectedValueInterval:params:")
    public native void writeAttributeNodeLabelWithValueExpectedValueIntervalParams(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs,
            @Nullable MTRWriteParams params);
}
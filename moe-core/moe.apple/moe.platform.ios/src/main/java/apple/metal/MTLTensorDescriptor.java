package apple.metal;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSCopying;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
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

/**
 * A configuration type for creating new tensor instances.
 * 
 * API-Since: 26.0
 */
@Generated
@Library("Metal")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MTLTensorDescriptor extends NSObject implements NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected MTLTensorDescriptor(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MTLTensorDescriptor alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native MTLTensorDescriptor allocWithZone(VoidPtr zone);

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
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    @NotNull
    public native Object copyWithZone(@Nullable VoidPtr zone);

    /**
     * A value that configures the cache mode of CPU mapping of tensors you create with this descriptor.
     * 
     * The default value of this property is ``MTLCPUCacheMode/MTLCPUCacheModeDefaultCache``.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("cpuCacheMode")
    @NUInt
    public native long cpuCacheMode();

    /**
     * A data format for the tensors you create with this descriptor.
     * 
     * The default value of this property is ``MTLTensorDataType/MTLTensorDataTypeFloat32``.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("dataType")
    @NInt
    public native long dataType();

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * An array of sizes, in elements, one for each dimension of the tensors you create with this descriptor.
     * 
     * The default value of this property is a rank one extents with size one.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("dimensions")
    @NotNull
    public native MTLTensorExtents dimensions();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    /**
     * A value that configures the hazard tracking of tensors you create with this descriptor.
     * 
     * The default value of this property is ``MTLHazardTrackingMode/MTLHazardTrackingModeDefault``.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("hazardTrackingMode")
    @NUInt
    public native long hazardTrackingMode();

    @Generated
    @Selector("init")
    public native MTLTensorDescriptor init();

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
    public static native MTLTensorDescriptor new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * A packed set of the `storageMode`, `cpuCacheMode` and `hazardTrackingMode` properties.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("resourceOptions")
    @NUInt
    public native long resourceOptions();

    /**
     * A value that configures the cache mode of CPU mapping of tensors you create with this descriptor.
     * 
     * The default value of this property is ``MTLCPUCacheMode/MTLCPUCacheModeDefaultCache``.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setCpuCacheMode:")
    public native void setCpuCacheMode(@NUInt long value);

    /**
     * A data format for the tensors you create with this descriptor.
     * 
     * The default value of this property is ``MTLTensorDataType/MTLTensorDataTypeFloat32``.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setDataType:")
    public native void setDataType(@NInt long value);

    /**
     * An array of sizes, in elements, one for each dimension of the tensors you create with this descriptor.
     * 
     * The default value of this property is a rank one extents with size one.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setDimensions:")
    public native void setDimensions(@NotNull MTLTensorExtents value);

    /**
     * A value that configures the hazard tracking of tensors you create with this descriptor.
     * 
     * The default value of this property is ``MTLHazardTrackingMode/MTLHazardTrackingModeDefault``.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setHazardTrackingMode:")
    public native void setHazardTrackingMode(@NUInt long value);

    /**
     * A packed set of the `storageMode`, `cpuCacheMode` and `hazardTrackingMode` properties.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setResourceOptions:")
    public native void setResourceOptions(@NUInt long value);

    /**
     * A value that configures the memory location and access permissions of tensors you create with this descriptor.
     * 
     * The default value of this property defaults to ``MTLStorageMode/MTLStorageModeShared``.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setStorageMode:")
    public native void setStorageMode(@NUInt long value);

    /**
     * An array of strides, in elements, one for each dimension in the tensors you create with this descriptor, if
     * applicable.
     * 
     * This property only applies to tensors you create from a buffer, otherwise it is nil. You are responsible for
     * ensuring `strides` meets the following requirements:
     * - Elements of `strides`are in monotonically non-decreasing order.
     * - The first element of `strides` is one.
     * - For any `i` larger than zero, `strides[i]` is greater than or equal to `strides[i-1] * dimensions[i-1]`.
     * - If `usage` contains ``MTLTensorUsage/MTLTensorUsageMachineLearning``, the second element of `strides` is
     * aligned to 64 bytes, and for any `i` larger than one, `strides[i]` is equal to `strides[i-1] * dimensions[i-1]`.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setStrides:")
    public native void setStrides(@Nullable MTLTensorExtents value);

    /**
     * A set of contexts in which you can use tensors you create with this descriptor.
     * 
     * The default value for this property is a bitwise `OR` of:
     * - ``MTLTensorUsage/MTLTensorUsageRender``
     * - ``MTLTensorUsage/MTLTensorUsageCompute``
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setUsage:")
    public native void setUsage(@NUInt long value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * A value that configures the memory location and access permissions of tensors you create with this descriptor.
     * 
     * The default value of this property defaults to ``MTLStorageMode/MTLStorageModeShared``.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("storageMode")
    @NUInt
    public native long storageMode();

    /**
     * An array of strides, in elements, one for each dimension in the tensors you create with this descriptor, if
     * applicable.
     * 
     * This property only applies to tensors you create from a buffer, otherwise it is nil. You are responsible for
     * ensuring `strides` meets the following requirements:
     * - Elements of `strides`are in monotonically non-decreasing order.
     * - The first element of `strides` is one.
     * - For any `i` larger than zero, `strides[i]` is greater than or equal to `strides[i-1] * dimensions[i-1]`.
     * - If `usage` contains ``MTLTensorUsage/MTLTensorUsageMachineLearning``, the second element of `strides` is
     * aligned to 64 bytes, and for any `i` larger than one, `strides[i]` is equal to `strides[i-1] * dimensions[i-1]`.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("strides")
    @Nullable
    public native MTLTensorExtents strides();

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    /**
     * A set of contexts in which you can use tensors you create with this descriptor.
     * 
     * The default value for this property is a bitwise `OR` of:
     * - ``MTLTensorUsage/MTLTensorUsageRender``
     * - ``MTLTensorUsage/MTLTensorUsageCompute``
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("usage")
    @NUInt
    public native long usage();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}
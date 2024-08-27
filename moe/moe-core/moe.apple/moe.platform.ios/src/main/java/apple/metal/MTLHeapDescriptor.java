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

package apple.metal;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSCopying;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * MTLHeapDescriptor
 * 
 * API-Since: 10.0
 */
@Generated
@Library("Metal")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MTLHeapDescriptor extends NSObject implements NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected MTLHeapDescriptor(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MTLHeapDescriptor alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native MTLHeapDescriptor allocWithZone(VoidPtr zone);

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
    public static native MTLHeapDescriptor new_objc();

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
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(@Nullable VoidPtr zone);

    /**
     * [@property] cpuCacheMode
     * 
     * CPU cache mode for the heap. Default is MTLCPUCacheModeDefaultCache.
     * 
     * All resources created from this heap share the same cache mode.
     * CPU cache mode is ignored for MTLStorageModePrivate.
     */
    @Generated
    @Selector("cpuCacheMode")
    @NUInt
    public native long cpuCacheMode();

    @Generated
    @Selector("init")
    public native MTLHeapDescriptor init();

    /**
     * [@property] cpuCacheMode
     * 
     * CPU cache mode for the heap. Default is MTLCPUCacheModeDefaultCache.
     * 
     * All resources created from this heap share the same cache mode.
     * CPU cache mode is ignored for MTLStorageModePrivate.
     */
    @Generated
    @Selector("setCpuCacheMode:")
    public native void setCpuCacheMode(@NUInt long value);

    /**
     * [@property] size
     * 
     * Requested size of the heap's backing memory.
     * 
     * The size may be rounded up to GPU page granularity.
     */
    @Generated
    @Selector("setSize:")
    public native void setSize(@NUInt long value);

    /**
     * [@property] storageMode
     * 
     * Storage mode for the heap. Default is MTLStorageModePrivate.
     * 
     * All resources created from this heap share the same storage mode.
     * MTLStorageModeManaged and MTLStorageModeMemoryless are disallowed.
     */
    @Generated
    @Selector("setStorageMode:")
    public native void setStorageMode(@NUInt long value);

    /**
     * [@property] size
     * 
     * Requested size of the heap's backing memory.
     * 
     * The size may be rounded up to GPU page granularity.
     */
    @Generated
    @Selector("size")
    @NUInt
    public native long size();

    /**
     * [@property] storageMode
     * 
     * Storage mode for the heap. Default is MTLStorageModePrivate.
     * 
     * All resources created from this heap share the same storage mode.
     * MTLStorageModeManaged and MTLStorageModeMemoryless are disallowed.
     */
    @Generated
    @Selector("storageMode")
    @NUInt
    public native long storageMode();

    /**
     * [@property] hazardTrackingMode
     * 
     * Set hazard tracking mode for the heap. The default value is MTLHazardTrackingModeDefault.
     * 
     * For heaps, MTLHazardTrackingModeDefault is treated as MTLHazardTrackingModeUntracked.
     * Setting hazardTrackingMode to MTLHazardTrackingModeTracked causes hazard tracking to be enabled heap.
     * When a resource on a hazard tracked heap is modified, reads and writes from all resources suballocated on that
     * heap will be delayed until the modification is complete.
     * Similarly, modifying heap resources will be delayed until all in-flight reads and writes from all resources
     * suballocated on that heap have completed.
     * For optimal performance, perform hazard tracking manually through MTLFence or MTLEvent instead.
     * All resources created from this heap shared the same hazard tracking mode.
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("hazardTrackingMode")
    @NUInt
    public native long hazardTrackingMode();

    /**
     * [@property] resourceOptions
     * 
     * A packed tuple of the storageMode, cpuCacheMode and hazardTrackingMode properties.
     * 
     * Modifications to this property are reflected in the other properties and vice versa.
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("resourceOptions")
    @NUInt
    public native long resourceOptions();

    /**
     * [@property] hazardTrackingMode
     * 
     * Set hazard tracking mode for the heap. The default value is MTLHazardTrackingModeDefault.
     * 
     * For heaps, MTLHazardTrackingModeDefault is treated as MTLHazardTrackingModeUntracked.
     * Setting hazardTrackingMode to MTLHazardTrackingModeTracked causes hazard tracking to be enabled heap.
     * When a resource on a hazard tracked heap is modified, reads and writes from all resources suballocated on that
     * heap will be delayed until the modification is complete.
     * Similarly, modifying heap resources will be delayed until all in-flight reads and writes from all resources
     * suballocated on that heap have completed.
     * For optimal performance, perform hazard tracking manually through MTLFence or MTLEvent instead.
     * All resources created from this heap shared the same hazard tracking mode.
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("setHazardTrackingMode:")
    public native void setHazardTrackingMode(@NUInt long value);

    /**
     * [@property] resourceOptions
     * 
     * A packed tuple of the storageMode, cpuCacheMode and hazardTrackingMode properties.
     * 
     * Modifications to this property are reflected in the other properties and vice versa.
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("setResourceOptions:")
    public native void setResourceOptions(@NUInt long value);

    /**
     * [@property] type
     * 
     * The type of the heap. The default value is MTLHeapTypeAutomatic.
     * 
     * This constrains the resource creation functions that are available.
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("setType:")
    public native void setType(@NInt long value);

    /**
     * [@property] type
     * 
     * The type of the heap. The default value is MTLHeapTypeAutomatic.
     * 
     * This constrains the resource creation functions that are available.
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("type")
    @NInt
    public native long type();

    /**
     * [@property] sparsePageSize
     * 
     * The sparse page size to use for resources created from the heap.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("setSparsePageSize:")
    public native void setSparsePageSize(@NInt long value);

    /**
     * [@property] sparsePageSize
     * 
     * The sparse page size to use for resources created from the heap.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("sparsePageSize")
    @NInt
    public native long sparsePageSize();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}

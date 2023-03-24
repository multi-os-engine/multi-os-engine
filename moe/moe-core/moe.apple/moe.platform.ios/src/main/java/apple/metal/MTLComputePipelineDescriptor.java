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
import apple.metal.protocol.MTLFunction;
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
 * API-Since: 9.0
 */
@Generated
@Library("Metal")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MTLComputePipelineDescriptor extends NSObject implements NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected MTLComputePipelineDescriptor(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MTLComputePipelineDescriptor alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native MTLComputePipelineDescriptor allocWithZone(VoidPtr zone);

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
    public static native MTLComputePipelineDescriptor new_objc();

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
     * [@property] computeFunction
     * 
     * The function to use with the MTLComputePipelineState
     */
    @Nullable
    @Generated
    @Selector("computeFunction")
    @MappedReturn(ObjCObjectMapper.class)
    public native MTLFunction computeFunction();

    @NotNull
    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(@Nullable VoidPtr zone);

    @Generated
    @Selector("init")
    public native MTLComputePipelineDescriptor init();

    /**
     * [@property] label
     * 
     * A string to help identify this object.
     */
    @Nullable
    @Generated
    @Selector("label")
    public native String label();

    /**
     * reset
     * 
     * Restore all compute pipeline descriptor properties to their default values.
     */
    @Generated
    @Selector("reset")
    public native void reset();

    /**
     * [@property] computeFunction
     * 
     * The function to use with the MTLComputePipelineState
     */
    @Generated
    @Selector("setComputeFunction:")
    public native void setComputeFunction(@Nullable @Mapped(ObjCObjectMapper.class) MTLFunction value);

    /**
     * [@property] label
     * 
     * A string to help identify this object.
     */
    @Generated
    @Selector("setLabel:")
    public native void setLabel(@Nullable String value);

    /**
     * [@property] computeDataDescriptor
     * 
     * An MTLStageInputOutputDescriptor to fetch data from buffers
     * 
     * API-Since: 10.0
     */
    @Generated
    @Selector("setStageInputDescriptor:")
    public native void setStageInputDescriptor(@Nullable MTLStageInputOutputDescriptor value);

    /**
     * [@property] threadGroupSizeIsMultipleOfThreadExecutionWidth
     * 
     * An optimization flag, set if the thread group size will always be a multiple of thread execution width
     */
    @Generated
    @Selector("setThreadGroupSizeIsMultipleOfThreadExecutionWidth:")
    public native void setThreadGroupSizeIsMultipleOfThreadExecutionWidth(boolean value);

    /**
     * [@property] computeDataDescriptor
     * 
     * An MTLStageInputOutputDescriptor to fetch data from buffers
     * 
     * API-Since: 10.0
     */
    @Nullable
    @Generated
    @Selector("stageInputDescriptor")
    public native MTLStageInputOutputDescriptor stageInputDescriptor();

    /**
     * [@property] threadGroupSizeIsMultipleOfThreadExecutionWidth
     * 
     * An optimization flag, set if the thread group size will always be a multiple of thread execution width
     */
    @Generated
    @Selector("threadGroupSizeIsMultipleOfThreadExecutionWidth")
    public native boolean threadGroupSizeIsMultipleOfThreadExecutionWidth();

    /**
     * [@property] buffers
     * 
     * Optional properties for each buffer binding used by the compute function.
     * 
     * API-Since: 11.0
     */
    @NotNull
    @Generated
    @Selector("buffers")
    public native MTLPipelineBufferDescriptorArray buffers();

    /**
     * [@property] maxTotalThreadsPerThreadgroup
     * 
     * Optional property. Set the maxTotalThreadsPerThreadgroup. If it is not set, returns zero.
     * 
     * API-Since: 12.0
     */
    @Generated
    @Selector("maxTotalThreadsPerThreadgroup")
    @NUInt
    public native long maxTotalThreadsPerThreadgroup();

    /**
     * [@property] maxTotalThreadsPerThreadgroup
     * 
     * Optional property. Set the maxTotalThreadsPerThreadgroup. If it is not set, returns zero.
     * 
     * API-Since: 12.0
     */
    @Generated
    @Selector("setMaxTotalThreadsPerThreadgroup:")
    public native void setMaxTotalThreadsPerThreadgroup(@NUInt long value);

    /**
     * [@property] supportIndirectCommandBuffers
     * 
     * This flag makes this pipeline usable with indirect command buffers.
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("setSupportIndirectCommandBuffers:")
    public native void setSupportIndirectCommandBuffers(boolean value);

    /**
     * [@property] supportIndirectCommandBuffers
     * 
     * This flag makes this pipeline usable with indirect command buffers.
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("supportIndirectCommandBuffers")
    public native boolean supportIndirectCommandBuffers();

    /**
     * [@property] binaryArchives
     * 
     * The set of MTLBinaryArchive to search for compiled code when creating the pipeline state.
     * 
     * Accelerate pipeline state creation by providing archives of compiled code such that no compilation needs to
     * happen on the fast path.
     * 
     * @see MTLBinaryArchive
     * 
     *      API-Since: 14.0
     */
    @Nullable
    @Generated
    @Selector("binaryArchives")
    public native NSArray<?> binaryArchives();

    /**
     * [@property] insertLibraries
     * 
     * The set of MTLDynamicLibrary to use to resolve external symbols before considering symbols from dependent
     * MTLDynamicLibrary.
     * 
     * Typical workflows use the libraries property of MTLCompileOptions to record dependent libraries at compile time
     * without having to use insertLibraries.
     * This property can be used to override symbols from dependent libraries for experimentation or evaluating
     * alternative implementations.
     * It can also be used to provide dynamic libraries that are dynamically created (for example, from source) that
     * have no stable installName that can be used to automatically load from the file system.
     * 
     * @see MTLDynamicLibrary
     * 
     *      API-Since: 14.0
     *      Deprecated-Since: 15.0
     */
    @Nullable
    @Deprecated
    @Generated
    @Selector("insertLibraries")
    public native NSArray<?> insertLibraries();

    /**
     * [@property] linkedFunctions
     * 
     * The set of functions to be linked with the pipeline state and accessed from the compute function.
     * 
     * @see MTLLinkedFunctions
     * 
     *      API-Since: 14.0
     */
    @Nullable
    @Generated
    @Selector("linkedFunctions")
    public native MTLLinkedFunctions linkedFunctions();

    /**
     * [@property] maxCallStackDepth
     * 
     * The maximum depth of the call stack in stack frames from the kernel. Defaults to 1 additional stack frame.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("maxCallStackDepth")
    @NUInt
    public native long maxCallStackDepth();

    /**
     * [@property] binaryArchives
     * 
     * The set of MTLBinaryArchive to search for compiled code when creating the pipeline state.
     * 
     * Accelerate pipeline state creation by providing archives of compiled code such that no compilation needs to
     * happen on the fast path.
     * 
     * @see MTLBinaryArchive
     * 
     *      API-Since: 14.0
     */
    @Generated
    @Selector("setBinaryArchives:")
    public native void setBinaryArchives(@Nullable NSArray<?> value);

    /**
     * [@property] insertLibraries
     * 
     * The set of MTLDynamicLibrary to use to resolve external symbols before considering symbols from dependent
     * MTLDynamicLibrary.
     * 
     * Typical workflows use the libraries property of MTLCompileOptions to record dependent libraries at compile time
     * without having to use insertLibraries.
     * This property can be used to override symbols from dependent libraries for experimentation or evaluating
     * alternative implementations.
     * It can also be used to provide dynamic libraries that are dynamically created (for example, from source) that
     * have no stable installName that can be used to automatically load from the file system.
     * 
     * @see MTLDynamicLibrary
     * 
     *      API-Since: 14.0
     *      Deprecated-Since: 15.0
     */
    @Deprecated
    @Generated
    @Selector("setInsertLibraries:")
    public native void setInsertLibraries(@Nullable NSArray<?> value);

    /**
     * [@property] linkedFunctions
     * 
     * The set of functions to be linked with the pipeline state and accessed from the compute function.
     * 
     * @see MTLLinkedFunctions
     * 
     *      API-Since: 14.0
     */
    @Generated
    @Selector("setLinkedFunctions:")
    public native void setLinkedFunctions(@Nullable MTLLinkedFunctions value);

    /**
     * [@property] maxCallStackDepth
     * 
     * The maximum depth of the call stack in stack frames from the kernel. Defaults to 1 additional stack frame.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("setMaxCallStackDepth:")
    public native void setMaxCallStackDepth(@NUInt long value);

    /**
     * [@property] supportAddingBinaryFunctions
     * 
     * This flag makes this pipeline support creating a new pipeline by adding binary functions.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("setSupportAddingBinaryFunctions:")
    public native void setSupportAddingBinaryFunctions(boolean value);

    /**
     * [@property] supportAddingBinaryFunctions
     * 
     * This flag makes this pipeline support creating a new pipeline by adding binary functions.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("supportAddingBinaryFunctions")
    public native boolean supportAddingBinaryFunctions();

    /**
     * [@property] preloadedLibraries
     * 
     * The set of MTLDynamicLibrary to use to resolve external symbols before considering symbols from dependent
     * MTLDynamicLibrary.
     * 
     * Typical workflows use the libraries property of MTLCompileOptions to record dependent libraries at compile time
     * without having to use preloadedLibraries.
     * This property can be used to override symbols from dependent libraries for experimentation or evaluating
     * alternative implementations.
     * It can also be used to provide dynamic libraries that are dynamically created (for example, from source) that
     * have no stable installName that can be used to automatically load from the file system.
     * 
     * @see MTLDynamicLibrary
     * 
     *      API-Since: 15.0
     */
    @NotNull
    @Generated
    @Selector("preloadedLibraries")
    public native NSArray<?> preloadedLibraries();

    /**
     * [@property] preloadedLibraries
     * 
     * The set of MTLDynamicLibrary to use to resolve external symbols before considering symbols from dependent
     * MTLDynamicLibrary.
     * 
     * Typical workflows use the libraries property of MTLCompileOptions to record dependent libraries at compile time
     * without having to use preloadedLibraries.
     * This property can be used to override symbols from dependent libraries for experimentation or evaluating
     * alternative implementations.
     * It can also be used to provide dynamic libraries that are dynamically created (for example, from source) that
     * have no stable installName that can be used to automatically load from the file system.
     * 
     * @see MTLDynamicLibrary
     * 
     *      API-Since: 15.0
     */
    @Generated
    @Selector("setPreloadedLibraries:")
    public native void setPreloadedLibraries(@NotNull NSArray<?> value);
}

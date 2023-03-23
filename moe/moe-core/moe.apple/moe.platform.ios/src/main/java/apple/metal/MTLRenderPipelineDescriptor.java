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

/**
 * API-Since: 8.0
 */
@Generated
@Library("Metal")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MTLRenderPipelineDescriptor extends NSObject implements NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected MTLRenderPipelineDescriptor(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MTLRenderPipelineDescriptor alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native MTLRenderPipelineDescriptor allocWithZone(VoidPtr zone);

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
    @Owned
    @Selector("new")
    public static native MTLRenderPipelineDescriptor new_objc();

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

    @Generated
    @Selector("colorAttachments")
    public native MTLRenderPipelineColorAttachmentDescriptorArray colorAttachments();

    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(VoidPtr zone);

    @Generated
    @Selector("depthAttachmentPixelFormat")
    @NUInt
    public native long depthAttachmentPixelFormat();

    @Generated
    @Selector("fragmentFunction")
    @MappedReturn(ObjCObjectMapper.class)
    public native MTLFunction fragmentFunction();

    @Generated
    @Selector("init")
    public native MTLRenderPipelineDescriptor init();

    @Generated
    @Selector("isAlphaToCoverageEnabled")
    public native boolean isAlphaToCoverageEnabled();

    @Generated
    @Selector("setAlphaToCoverageEnabled:")
    public native void setAlphaToCoverageEnabled(boolean value);

    @Generated
    @Selector("isAlphaToOneEnabled")
    public native boolean isAlphaToOneEnabled();

    @Generated
    @Selector("setAlphaToOneEnabled:")
    public native void setAlphaToOneEnabled(boolean value);

    @Generated
    @Selector("isRasterizationEnabled")
    public native boolean isRasterizationEnabled();

    @Generated
    @Selector("setRasterizationEnabled:")
    public native void setRasterizationEnabled(boolean value);

    /**
     * API-Since: 10.0
     */
    @Generated
    @Selector("isTessellationFactorScaleEnabled")
    public native boolean isTessellationFactorScaleEnabled();

    /**
     * API-Since: 10.0
     */
    @Generated
    @Selector("setTessellationFactorScaleEnabled:")
    public native void setTessellationFactorScaleEnabled(boolean value);

    @Generated
    @Selector("label")
    public native String label();

    /**
     * API-Since: 10.0
     */
    @Generated
    @Selector("maxTessellationFactor")
    @NUInt
    public native long maxTessellationFactor();

    /**
     * reset
     * 
     * Restore all pipeline descriptor properties to their default values.
     */
    @Generated
    @Selector("reset")
    public native void reset();

    /**
     * Rasterization and visibility state
     * 
     * API-Since: 8.0
     * Deprecated-Since: 16.0
     */
    @Deprecated
    @Generated
    @Selector("sampleCount")
    @NUInt
    public native long sampleCount();

    @Generated
    @Selector("setDepthAttachmentPixelFormat:")
    public native void setDepthAttachmentPixelFormat(@NUInt long value);

    @Generated
    @Selector("setFragmentFunction:")
    public native void setFragmentFunction(@Mapped(ObjCObjectMapper.class) MTLFunction value);

    @Generated
    @Selector("setLabel:")
    public native void setLabel(String value);

    /**
     * API-Since: 10.0
     */
    @Generated
    @Selector("setMaxTessellationFactor:")
    public native void setMaxTessellationFactor(@NUInt long value);

    /**
     * Rasterization and visibility state
     * 
     * API-Since: 8.0
     * Deprecated-Since: 16.0
     */
    @Deprecated
    @Generated
    @Selector("setSampleCount:")
    public native void setSampleCount(@NUInt long value);

    @Generated
    @Selector("setStencilAttachmentPixelFormat:")
    public native void setStencilAttachmentPixelFormat(@NUInt long value);

    /**
     * API-Since: 10.0
     */
    @Generated
    @Selector("setTessellationControlPointIndexType:")
    public native void setTessellationControlPointIndexType(@NUInt long value);

    /**
     * API-Since: 10.0
     */
    @Generated
    @Selector("setTessellationFactorFormat:")
    public native void setTessellationFactorFormat(@NUInt long value);

    /**
     * API-Since: 10.0
     */
    @Generated
    @Selector("setTessellationFactorStepFunction:")
    public native void setTessellationFactorStepFunction(@NUInt long value);

    /**
     * API-Since: 10.0
     */
    @Generated
    @Selector("setTessellationOutputWindingOrder:")
    public native void setTessellationOutputWindingOrder(@NUInt long value);

    /**
     * API-Since: 10.0
     */
    @Generated
    @Selector("setTessellationPartitionMode:")
    public native void setTessellationPartitionMode(@NUInt long value);

    @Generated
    @Selector("setVertexDescriptor:")
    public native void setVertexDescriptor(MTLVertexDescriptor value);

    @Generated
    @Selector("setVertexFunction:")
    public native void setVertexFunction(@Mapped(ObjCObjectMapper.class) MTLFunction value);

    @Generated
    @Selector("stencilAttachmentPixelFormat")
    @NUInt
    public native long stencilAttachmentPixelFormat();

    /**
     * API-Since: 10.0
     */
    @Generated
    @Selector("tessellationControlPointIndexType")
    @NUInt
    public native long tessellationControlPointIndexType();

    /**
     * API-Since: 10.0
     */
    @Generated
    @Selector("tessellationFactorFormat")
    @NUInt
    public native long tessellationFactorFormat();

    /**
     * API-Since: 10.0
     */
    @Generated
    @Selector("tessellationFactorStepFunction")
    @NUInt
    public native long tessellationFactorStepFunction();

    /**
     * API-Since: 10.0
     */
    @Generated
    @Selector("tessellationOutputWindingOrder")
    @NUInt
    public native long tessellationOutputWindingOrder();

    /**
     * API-Since: 10.0
     */
    @Generated
    @Selector("tessellationPartitionMode")
    @NUInt
    public native long tessellationPartitionMode();

    @Generated
    @Selector("vertexDescriptor")
    public native MTLVertexDescriptor vertexDescriptor();

    @Generated
    @Selector("vertexFunction")
    @MappedReturn(ObjCObjectMapper.class)
    public native MTLFunction vertexFunction();

    /**
     * API-Since: 11.0
     */
    @Generated
    @Selector("fragmentBuffers")
    public native MTLPipelineBufferDescriptorArray fragmentBuffers();

    @Generated
    @Selector("rasterSampleCount")
    @NUInt
    public native long rasterSampleCount();

    @Generated
    @Selector("setRasterSampleCount:")
    public native void setRasterSampleCount(@NUInt long value);

    /**
     * API-Since: 11.0
     */
    @Generated
    @Selector("vertexBuffers")
    public native MTLPipelineBufferDescriptorArray vertexBuffers();

    /**
     * API-Since: 12.0
     */
    @Generated
    @Selector("inputPrimitiveTopology")
    @NUInt
    public native long inputPrimitiveTopology();

    /**
     * API-Since: 13.0
     */
    @Generated
    @Selector("maxVertexAmplificationCount")
    @NUInt
    public native long maxVertexAmplificationCount();

    /**
     * API-Since: 12.0
     */
    @Generated
    @Selector("setInputPrimitiveTopology:")
    public native void setInputPrimitiveTopology(@NUInt long value);

    /**
     * API-Since: 13.0
     */
    @Generated
    @Selector("setMaxVertexAmplificationCount:")
    public native void setMaxVertexAmplificationCount(@NUInt long value);

    /**
     * API-Since: 12.0
     */
    @Generated
    @Selector("setSupportIndirectCommandBuffers:")
    public native void setSupportIndirectCommandBuffers(boolean value);

    /**
     * API-Since: 12.0
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
    @Generated
    @Selector("binaryArchives")
    public native NSArray<?> binaryArchives();

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
    public native void setBinaryArchives(NSArray<?> value);

    /**
     * [@property] fragmentLinkedFunctions
     * 
     * The set of functions to be linked with the pipeline state and accessed from the fragment function.
     * 
     * @see MTLLinkedFunctions
     * 
     *      API-Since: 15.0
     */
    @Generated
    @Selector("fragmentLinkedFunctions")
    public native MTLLinkedFunctions fragmentLinkedFunctions();

    /**
     * [@property] fragmentPreloadedLibraries
     * 
     * The set of MTLDynamicLibrary to use to resolve external symbols for the fragmentFunction before considering
     * symbols from dependent MTLDynamicLibrary.
     * 
     * Typical workflows use the libraries property of MTLCompileOptions to record dependent libraries at compile time
     * without having to use fragmentPreloadedLibraries.
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
    @Selector("fragmentPreloadedLibraries")
    public native NSArray<?> fragmentPreloadedLibraries();

    /**
     * [@property] maxFragmentCallStackDepth
     * 
     * The maximum depth of the call stack in stack frames from the shader. Defaults to 1 additional stack frame.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("maxFragmentCallStackDepth")
    @NUInt
    public native long maxFragmentCallStackDepth();

    /**
     * [@property] maxVertexCallStackDepth
     * 
     * The maximum depth of the call stack in stack frames from the shader. Defaults to 1 additional stack frame.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("maxVertexCallStackDepth")
    @NUInt
    public native long maxVertexCallStackDepth();

    /**
     * [@property] fragmentLinkedFunctions
     * 
     * The set of functions to be linked with the pipeline state and accessed from the fragment function.
     * 
     * @see MTLLinkedFunctions
     * 
     *      API-Since: 15.0
     */
    @Generated
    @Selector("setFragmentLinkedFunctions:")
    public native void setFragmentLinkedFunctions(MTLLinkedFunctions value);

    /**
     * [@property] fragmentPreloadedLibraries
     * 
     * The set of MTLDynamicLibrary to use to resolve external symbols for the fragmentFunction before considering
     * symbols from dependent MTLDynamicLibrary.
     * 
     * Typical workflows use the libraries property of MTLCompileOptions to record dependent libraries at compile time
     * without having to use fragmentPreloadedLibraries.
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
    @Selector("setFragmentPreloadedLibraries:")
    public native void setFragmentPreloadedLibraries(NSArray<?> value);

    /**
     * [@property] maxFragmentCallStackDepth
     * 
     * The maximum depth of the call stack in stack frames from the shader. Defaults to 1 additional stack frame.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("setMaxFragmentCallStackDepth:")
    public native void setMaxFragmentCallStackDepth(@NUInt long value);

    /**
     * [@property] maxVertexCallStackDepth
     * 
     * The maximum depth of the call stack in stack frames from the shader. Defaults to 1 additional stack frame.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("setMaxVertexCallStackDepth:")
    public native void setMaxVertexCallStackDepth(@NUInt long value);

    /**
     * [@property] supportFragmentAddingBinaryFunctions
     * 
     * This flag makes this pipeline support creating a new pipeline by adding binary functions.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("setSupportAddingFragmentBinaryFunctions:")
    public native void setSupportAddingFragmentBinaryFunctions(boolean value);

    /**
     * [@property] supportAddingVertexBinaryFunctions
     * 
     * This flag makes this pipeline support creating a new pipeline by adding binary functions.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("setSupportAddingVertexBinaryFunctions:")
    public native void setSupportAddingVertexBinaryFunctions(boolean value);

    /**
     * [@property] vertexLinkedFunctions
     * 
     * The set of functions to be linked with the pipeline state and accessed from the vertex function.
     * 
     * @see MTLLinkedFunctions
     * 
     *      API-Since: 15.0
     */
    @Generated
    @Selector("setVertexLinkedFunctions:")
    public native void setVertexLinkedFunctions(MTLLinkedFunctions value);

    /**
     * [@property] vertexPreloadedLibraries
     * 
     * The set of MTLDynamicLibrary to use to resolve external symbols for the vertexFunction before considering symbols
     * from dependent MTLDynamicLibrary.
     * 
     * Typical workflows use the libraries property of MTLCompileOptions to record dependent libraries at compile time
     * without having to use vertexPreloadedLibraries.
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
    @Selector("setVertexPreloadedLibraries:")
    public native void setVertexPreloadedLibraries(NSArray<?> value);

    /**
     * [@property] supportFragmentAddingBinaryFunctions
     * 
     * This flag makes this pipeline support creating a new pipeline by adding binary functions.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("supportAddingFragmentBinaryFunctions")
    public native boolean supportAddingFragmentBinaryFunctions();

    /**
     * [@property] supportAddingVertexBinaryFunctions
     * 
     * This flag makes this pipeline support creating a new pipeline by adding binary functions.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("supportAddingVertexBinaryFunctions")
    public native boolean supportAddingVertexBinaryFunctions();

    /**
     * [@property] vertexLinkedFunctions
     * 
     * The set of functions to be linked with the pipeline state and accessed from the vertex function.
     * 
     * @see MTLLinkedFunctions
     * 
     *      API-Since: 15.0
     */
    @Generated
    @Selector("vertexLinkedFunctions")
    public native MTLLinkedFunctions vertexLinkedFunctions();

    /**
     * [@property] vertexPreloadedLibraries
     * 
     * The set of MTLDynamicLibrary to use to resolve external symbols for the vertexFunction before considering symbols
     * from dependent MTLDynamicLibrary.
     * 
     * Typical workflows use the libraries property of MTLCompileOptions to record dependent libraries at compile time
     * without having to use vertexPreloadedLibraries.
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
    @Selector("vertexPreloadedLibraries")
    public native NSArray<?> vertexPreloadedLibraries();
}

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
 * API-Since: 11.0
 */
@Generated
@Library("Metal")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MTLTileRenderPipelineDescriptor extends NSObject implements NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected MTLTileRenderPipelineDescriptor(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MTLTileRenderPipelineDescriptor alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native MTLTileRenderPipelineDescriptor allocWithZone(VoidPtr zone);

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
    @Selector("colorAttachments")
    public native MTLTileRenderPipelineColorAttachmentDescriptorArray colorAttachments();

    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(VoidPtr zone);

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
    public native MTLTileRenderPipelineDescriptor init();

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

    /**
     * [@property] label:
     * 
     * The descriptor label.
     */
    @Generated
    @Selector("label")
    public native String label();

    @Generated
    @Owned
    @Selector("new")
    public static native MTLTileRenderPipelineDescriptor new_objc();

    /**
     * Rasterization and visibility state
     */
    @Generated
    @Selector("rasterSampleCount")
    @NUInt
    public native long rasterSampleCount();

    @Generated
    @Selector("reset")
    public native void reset();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * [@property] label:
     * 
     * The descriptor label.
     */
    @Generated
    @Selector("setLabel:")
    public native void setLabel(String value);

    /**
     * Rasterization and visibility state
     */
    @Generated
    @Selector("setRasterSampleCount:")
    public native void setRasterSampleCount(@NUInt long value);

    /**
     * [@property] threadgroupSizeMatchesTileSize:
     * 
     * Whether all threadgroups associated with this pipeline will cover tiles entirely.
     * 
     * Metal can optimize code generation for this case.
     */
    @Generated
    @Selector("setThreadgroupSizeMatchesTileSize:")
    public native void setThreadgroupSizeMatchesTileSize(boolean value);

    /**
     * [@property] tileFunction:
     * 
     * The kernel or fragment function that serves as the tile shader for this pipeline.
     * 
     * Both kernel-based and fragment-based tile pipelines dispatches will barrier against previous
     * draws and other dispatches. Kernel-based pipelines will wait until all prior access to the tile completes.
     * Fragment-based pipelines will only wait until all prior access to the fragment's location completes.
     */
    @Generated
    @Selector("setTileFunction:")
    public native void setTileFunction(@Mapped(ObjCObjectMapper.class) MTLFunction value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    /**
     * [@property] threadgroupSizeMatchesTileSize:
     * 
     * Whether all threadgroups associated with this pipeline will cover tiles entirely.
     * 
     * Metal can optimize code generation for this case.
     */
    @Generated
    @Selector("threadgroupSizeMatchesTileSize")
    public native boolean threadgroupSizeMatchesTileSize();

    /**
     * API-Since: 11.0
     */
    @Generated
    @Selector("tileBuffers")
    public native MTLPipelineBufferDescriptorArray tileBuffers();

    /**
     * [@property] tileFunction:
     * 
     * The kernel or fragment function that serves as the tile shader for this pipeline.
     * 
     * Both kernel-based and fragment-based tile pipelines dispatches will barrier against previous
     * draws and other dispatches. Kernel-based pipelines will wait until all prior access to the tile completes.
     * Fragment-based pipelines will only wait until all prior access to the fragment's location completes.
     */
    @Generated
    @Selector("tileFunction")
    @MappedReturn(ObjCObjectMapper.class)
    public native MTLFunction tileFunction();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

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
     * [@property] linkedFunctions
     * 
     * The set of functions to be linked with the pipeline state and accessed from the tile function.
     * 
     * @see MTLLinkedFunctions
     * 
     *      API-Since: 15.0
     */
    @Generated
    @Selector("linkedFunctions")
    public native MTLLinkedFunctions linkedFunctions();

    /**
     * [@property] maxCallStackDepth
     * 
     * The maximum depth of the call stack in stack frames from the tile function. Defaults to 1 additional stack frame.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("maxCallStackDepth")
    @NUInt
    public native long maxCallStackDepth();

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
    @Selector("preloadedLibraries")
    public native NSArray<?> preloadedLibraries();

    /**
     * [@property] linkedFunctions
     * 
     * The set of functions to be linked with the pipeline state and accessed from the tile function.
     * 
     * @see MTLLinkedFunctions
     * 
     *      API-Since: 15.0
     */
    @Generated
    @Selector("setLinkedFunctions:")
    public native void setLinkedFunctions(MTLLinkedFunctions value);

    /**
     * [@property] maxCallStackDepth
     * 
     * The maximum depth of the call stack in stack frames from the tile function. Defaults to 1 additional stack frame.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("setMaxCallStackDepth:")
    public native void setMaxCallStackDepth(@NUInt long value);

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
    public native void setPreloadedLibraries(NSArray<?> value);

    /**
     * [@property] supportAddingBinaryFunctions
     * 
     * This flag makes this pipeline support creating a new pipeline by adding binary functions.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("setSupportAddingBinaryFunctions:")
    public native void setSupportAddingBinaryFunctions(boolean value);

    /**
     * [@property] supportAddingBinaryFunctions
     * 
     * This flag makes this pipeline support creating a new pipeline by adding binary functions.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("supportAddingBinaryFunctions")
    public native boolean supportAddingBinaryFunctions();
}

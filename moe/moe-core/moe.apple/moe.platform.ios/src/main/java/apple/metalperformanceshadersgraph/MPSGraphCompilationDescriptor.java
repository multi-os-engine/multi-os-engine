package apple.metalperformanceshadersgraph;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
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
import apple.foundation.NSError;
import apple.foundation.protocol.NSCopying;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.objc.ann.ObjCBlock;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * MPSGraphCompilationDescriptor
 * 
 * A structure which consists of all the levers users can use to compile their graphs
 * 
 * 
 * API-Since: 15.0
 */
@Generated
@Library("MetalPerformanceShadersGraph")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPSGraphCompilationDescriptor extends NSObject implements NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected MPSGraphCompilationDescriptor(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MPSGraphCompilationDescriptor alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native MPSGraphCompilationDescriptor allocWithZone(VoidPtr zone);

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
     * Turns off type inference and we rely on type inference during runtime
     */
    @Generated
    @Selector("disableTypeInference")
    public native void disableTypeInference();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native MPSGraphCompilationDescriptor init();

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
    public static native MPSGraphCompilationDescriptor new_objc();

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
     * [@property] compilationCompletionHandler
     * 
     * compilationCompletionHandler for the compilation, default value is nil, it is called after compilation is
     * completed
     * 
     * API-Since: 16.0
     */
    @NotNull
    @Generated
    @Selector("compilationCompletionHandler")
    @ObjCBlock(name = "call_compilationCompletionHandler_ret")
    public native Block_compilationCompletionHandler_ret compilationCompletionHandler();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_compilationCompletionHandler_ret {
        @Generated
        void call_compilationCompletionHandler_ret(@NotNull MPSGraphExecutable executable, @Nullable NSError error);
    }

    @NotNull
    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(@Nullable VoidPtr zone);

    /**
     * [@property] dispatchQueue
     * 
     * dispatchQueue for the compilation, default value is nil
     * 
     * API-Since: 16.0
     */
    @NotNull
    @Generated
    @Selector("dispatchQueue")
    public native NSObject dispatchQueue();

    /**
     * [@property] optimizationLevel
     * 
     * optimization level for the graph execution, default is MPSGraphOptimizationLevel0
     * 
     * API-Since: 15.4
     */
    @Generated
    @Selector("optimizationLevel")
    public native long optimizationLevel();

    /**
     * [@property] optimizationProfile
     * 
     * optimization profile for the graph optimization, default is MPSGraphOptimizationProfilePerformance
     * 
     * API-Since: 15.4
     */
    @Generated
    @Selector("optimizationProfile")
    public native long optimizationProfile();

    /**
     * [@property] compilationCompletionHandler
     * 
     * compilationCompletionHandler for the compilation, default value is nil, it is called after compilation is
     * completed
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("setCompilationCompletionHandler:")
    public native void setCompilationCompletionHandler(
            @NotNull @ObjCBlock(name = "call_setCompilationCompletionHandler") Block_setCompilationCompletionHandler value);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setCompilationCompletionHandler {
        @Generated
        void call_setCompilationCompletionHandler(@NotNull MPSGraphExecutable executable, @Nullable NSError error);
    }

    /**
     * [@property] dispatchQueue
     * 
     * dispatchQueue for the compilation, default value is nil
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("setDispatchQueue:")
    public native void setDispatchQueue(@NotNull NSObject value);

    /**
     * [@property] optimizationLevel
     * 
     * optimization level for the graph execution, default is MPSGraphOptimizationLevel0
     * 
     * API-Since: 15.4
     */
    @Generated
    @Selector("setOptimizationLevel:")
    public native void setOptimizationLevel(long value);

    /**
     * [@property] optimizationProfile
     * 
     * optimization profile for the graph optimization, default is MPSGraphOptimizationProfilePerformance
     * 
     * API-Since: 15.4
     */
    @Generated
    @Selector("setOptimizationProfile:")
    public native void setOptimizationProfile(long value);

    /**
     * [@property] waitForCompilationCompletion
     * 
     * makes the compile or specialize call blocking till the entire compilation is completed, defaults to NO
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("setWaitForCompilationCompletion:")
    public native void setWaitForCompilationCompletion(boolean value);

    /**
     * [@property] waitForCompilationCompletion
     * 
     * makes the compile or specialize call blocking till the entire compilation is completed, defaults to NO
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("waitForCompilationCompletion")
    public native boolean waitForCompilationCompletion();
}

package apple.coreml;

import apple.NSObject;
import apple.coreml.protocol.MLBatchProvider;
import apple.foundation.NSArray;
import apple.foundation.NSDictionary;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.NSURL;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.ReferenceInfo;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Main class for setting up and controlling a model update. It provides some utility class methods for performing an
 * update synchronously as well as class constructors for configuring an update and give developers control for the
 * execution of that update.
 * 
 * API-Since: 13.0
 */
@Generated
@Library("CoreML")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MLUpdateTask extends MLTask {
    static {
        NatJ.register();
    }

    @Generated
    protected MLUpdateTask(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MLUpdateTask alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native MLUpdateTask allocWithZone(VoidPtr zone);

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
    @Selector("init")
    public native MLUpdateTask init();

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
    public static native MLUpdateTask new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * Request a resume with new parameters. Should be used within a progressHandler
     */
    @Generated
    @Selector("resumeWithParameters:")
    public native void resumeWithParameters(@NotNull NSDictionary<? extends MLParameterKey, ?> updateParameters);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    /**
     * Update via task control with completion handler
     */
    @Generated
    @Selector("updateTaskForModelAtURL:trainingData:configuration:completionHandler:error:")
    public static native MLUpdateTask updateTaskForModelAtURLTrainingDataConfigurationCompletionHandlerError(
            @NotNull NSURL modelURL, @NotNull @Mapped(ObjCObjectMapper.class) MLBatchProvider trainingData,
            @Nullable MLModelConfiguration configuration,
            @NotNull @ObjCBlock(name = "call_updateTaskForModelAtURLTrainingDataConfigurationCompletionHandlerError") Block_updateTaskForModelAtURLTrainingDataConfigurationCompletionHandlerError completionHandler,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_updateTaskForModelAtURLTrainingDataConfigurationCompletionHandlerError {
        @Generated
        void call_updateTaskForModelAtURLTrainingDataConfigurationCompletionHandlerError(
                @NotNull MLUpdateContext context);
    }

    /**
     * Update via task control and custom progress callbacks
     */
    @Generated
    @Selector("updateTaskForModelAtURL:trainingData:configuration:progressHandlers:error:")
    public static native MLUpdateTask updateTaskForModelAtURLTrainingDataConfigurationProgressHandlersError(
            @NotNull NSURL modelURL, @NotNull @Mapped(ObjCObjectMapper.class) MLBatchProvider trainingData,
            @Nullable MLModelConfiguration configuration, @NotNull MLUpdateProgressHandlers progressHandlers,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * Update via task control with completion handler supplying default configuration
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("updateTaskForModelAtURL:trainingData:completionHandler:error:")
    public static native MLUpdateTask updateTaskForModelAtURLTrainingDataCompletionHandlerError(@NotNull NSURL modelURL,
            @NotNull @Mapped(ObjCObjectMapper.class) MLBatchProvider trainingData,
            @NotNull @ObjCBlock(name = "call_updateTaskForModelAtURLTrainingDataCompletionHandlerError") Block_updateTaskForModelAtURLTrainingDataCompletionHandlerError completionHandler,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_updateTaskForModelAtURLTrainingDataCompletionHandlerError {
        @Generated
        void call_updateTaskForModelAtURLTrainingDataCompletionHandlerError(@NotNull MLUpdateContext arg0);
    }

    /**
     * Update via task control and custom progress callbacks supplying default configuration
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("updateTaskForModelAtURL:trainingData:progressHandlers:error:")
    public static native MLUpdateTask updateTaskForModelAtURLTrainingDataProgressHandlersError(@NotNull NSURL modelURL,
            @NotNull @Mapped(ObjCObjectMapper.class) MLBatchProvider trainingData,
            @NotNull MLUpdateProgressHandlers progressHandlers,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);
}

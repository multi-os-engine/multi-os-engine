package apple.coreml;

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
import apple.foundation.NSDictionary;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * MLPredictionOptions
 * 
 * An object to hold options / controls / parameters of how
 * model prediction is performed
 * 
 * API-Since: 11.0
 */
@Generated
@Library("CoreML")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MLPredictionOptions extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected MLPredictionOptions(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MLPredictionOptions alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native MLPredictionOptions allocWithZone(VoidPtr zone);

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
    public native MLPredictionOptions init();

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
    public static native MLPredictionOptions new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * Set to YES to force computation to be on the CPU only
     * 
     * API-Since: 11.0
     * Deprecated-Since: 15.0
     */
    @Deprecated
    @Generated
    @Selector("setUsesCPUOnly:")
    public native void setUsesCPUOnly(boolean value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    /**
     * Set to YES to force computation to be on the CPU only
     * 
     * API-Since: 11.0
     * Deprecated-Since: 15.0
     */
    @Deprecated
    @Generated
    @Selector("usesCPUOnly")
    public native boolean usesCPUOnly();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * Propose the model to use the specified backing objects for the
     * output feature values.
     * 
     * Use the property to get the inference result directly into the
     * client allocated buffer when possible for efficient memory management.
     * 
     * The property is a dictionary of the feature name and the output backing
     * object.
     * 
     * The framework may not use the specified backing object and instead allocates
     * one by itself if the outputBacking dictionary doesn't contain the entry for
     * the feature name, the model doesn't support the user allocated buffers, or in
     * the batch prediction mode. To check if the backing object was used, compare
     * the output prediction and the backing object by object identity.
     * 
     * \code
     * CVPixelBufferRef outputBacking = ...;
     * [options setOutputBackings:@{@"outputImage" : (__bridge id)outputBacking}];
     * id<MLFeatureProvider> prediction = [model predictionFromFeatures:inputFeatures options:options error:&error];
     * if ([prediction featureValueForName:@"outputImage"].imageBufferValue == outputBacking) {
     * // backing was used.
     * }
     * else {
     * // backing was NOT used.
     * }
     * \endcode
     * 
     * The backing object must be either CVPixelBuffer or MLMultiArray depending on
     * the feature value type.
     * 
     * Do not lock the base address of the CVPixelBuffer. In the case of a MLMultiArray
     * backed by a pixel buffer, make sure not to lock the underlying pixel buffer by not
     * calling any data methods such as `.dataPointer` and subscript methods before the
     * prediction.
     * 
     * The framework ignores a backing object with an unknown feature name.
     * 
     * For the best performance, use page-aligned address in MLMultiArray.
     * 
     * \code
     * #import <mach/vm_page_size.h>
     * :
     * void *backingBuffer = aligned_alloc(vm_page_size, round_page(backingBufferSize));
     * if (backingBuffer == NULL) { ... error handling ... }
     * MLMultiArray *outputBacking = [[MLMultiArray alloc] initWithDataPointer:(char *)backingBuffer
     * ...
     * deallocator:^(void *) { free(backingBuffer); }
     * ... ];
     * \endcode
     * 
     * For CVPixelBuffer backing, consider to use IOSurface-backed CVPixelBuffer
     * created by CVPixelBufferPool because it is often the most efficient choice for
     * memory footprint and performance, especially when the pixel buffers are
     * subsequently used for playback or export. (See also AVSampleBufferDisplayLayer
     * and AVAssetWriter.)
     * 
     * The output backing object must satisfy the output feature description's
     * `-isAllowedValue:` test, or the framework reporets an error at the prediction
     * time. The exception is FP16 MLMultiArray backed by CVPixelBuffer, which may be
     * accepted in Double or Float32 multi array output feature depending on the
     * underlying inference engine.
     * 
     * 
     * API-Since: 16.0
     */
    @NotNull
    @Generated
    @Selector("outputBackings")
    public native NSDictionary<String, ?> outputBackings();

    /**
     * Propose the model to use the specified backing objects for the
     * output feature values.
     * 
     * Use the property to get the inference result directly into the
     * client allocated buffer when possible for efficient memory management.
     * 
     * The property is a dictionary of the feature name and the output backing
     * object.
     * 
     * The framework may not use the specified backing object and instead allocates
     * one by itself if the outputBacking dictionary doesn't contain the entry for
     * the feature name, the model doesn't support the user allocated buffers, or in
     * the batch prediction mode. To check if the backing object was used, compare
     * the output prediction and the backing object by object identity.
     * 
     * \code
     * CVPixelBufferRef outputBacking = ...;
     * [options setOutputBackings:@{@"outputImage" : (__bridge id)outputBacking}];
     * id<MLFeatureProvider> prediction = [model predictionFromFeatures:inputFeatures options:options error:&error];
     * if ([prediction featureValueForName:@"outputImage"].imageBufferValue == outputBacking) {
     * // backing was used.
     * }
     * else {
     * // backing was NOT used.
     * }
     * \endcode
     * 
     * The backing object must be either CVPixelBuffer or MLMultiArray depending on
     * the feature value type.
     * 
     * Do not lock the base address of the CVPixelBuffer. In the case of a MLMultiArray
     * backed by a pixel buffer, make sure not to lock the underlying pixel buffer by not
     * calling any data methods such as `.dataPointer` and subscript methods before the
     * prediction.
     * 
     * The framework ignores a backing object with an unknown feature name.
     * 
     * For the best performance, use page-aligned address in MLMultiArray.
     * 
     * \code
     * #import <mach/vm_page_size.h>
     * :
     * void *backingBuffer = aligned_alloc(vm_page_size, round_page(backingBufferSize));
     * if (backingBuffer == NULL) { ... error handling ... }
     * MLMultiArray *outputBacking = [[MLMultiArray alloc] initWithDataPointer:(char *)backingBuffer
     * ...
     * deallocator:^(void *) { free(backingBuffer); }
     * ... ];
     * \endcode
     * 
     * For CVPixelBuffer backing, consider to use IOSurface-backed CVPixelBuffer
     * created by CVPixelBufferPool because it is often the most efficient choice for
     * memory footprint and performance, especially when the pixel buffers are
     * subsequently used for playback or export. (See also AVSampleBufferDisplayLayer
     * and AVAssetWriter.)
     * 
     * The output backing object must satisfy the output feature description's
     * `-isAllowedValue:` test, or the framework reporets an error at the prediction
     * time. The exception is FP16 MLMultiArray backed by CVPixelBuffer, which may be
     * accepted in Double or Float32 multi array output feature depending on the
     * underlying inference engine.
     * 
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("setOutputBackings:")
    public native void setOutputBackings(@NotNull NSDictionary<String, ?> value);
}

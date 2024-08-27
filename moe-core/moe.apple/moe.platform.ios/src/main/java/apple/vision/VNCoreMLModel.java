package apple.vision;

import apple.NSObject;
import apple.coreml.MLModel;
import apple.coreml.protocol.MLFeatureProvider;
import apple.foundation.NSArray;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
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
import org.moe.natj.general.ann.ReferenceInfo;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.Ptr;
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
 * The VNCoreMLModel uses an CoreML based model and prepares it for use with VNCoreMLRequests.
 * 
 * API-Since: 11.0
 */
@Generated
@Library("Vision")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class VNCoreMLModel extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected VNCoreMLModel(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native VNCoreMLModel alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native VNCoreMLModel allocWithZone(VoidPtr zone);

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
    public native VNCoreMLModel init();

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

    /**
     * Create a model container to be used with VNCoreMLRequest based on a Core ML model. This can fail if the model is
     * not supported. Examples for a model that is not supported is a model that does not take an image as any of its
     * inputs.
     * 
     * @param model The MLModel from CoreML to be used.
     * 
     * @param error Returns the error code and description, if the model is not supported.
     */
    @Generated
    @Selector("modelForMLModel:error:")
    public static native VNCoreMLModel modelForMLModelError(@NotNull MLModel model,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Owned
    @Selector("new")
    public static native VNCoreMLModel new_objc();

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
     * An optional object conforming to the MLFeatureProvider protocol that is used by the model during the predict call
     * to support inputs that are not supplied by Vision. Vision will provide the image for the inputImageFeatureName
     * from the the VNRequestHandler. A feature provider is necessary for models that have more than one input and
     * require those parameters to be set. Models that only have one image input will not use the feature provider as
     * that input will be set by Vision.
     * 
     * API-Since: 13.0
     */
    @Nullable
    @Generated
    @Selector("featureProvider")
    @MappedReturn(ObjCObjectMapper.class)
    public native MLFeatureProvider featureProvider();

    /**
     * The name of the MLFeatureValue that Vision will set from the VNRequestHandler. Vision will use the first input it
     * finds by default but it can be set to another featureName instead.
     * 
     * API-Since: 13.0
     */
    @NotNull
    @Generated
    @Selector("inputImageFeatureName")
    public native String inputImageFeatureName();

    /**
     * An optional object conforming to the MLFeatureProvider protocol that is used by the model during the predict call
     * to support inputs that are not supplied by Vision. Vision will provide the image for the inputImageFeatureName
     * from the the VNRequestHandler. A feature provider is necessary for models that have more than one input and
     * require those parameters to be set. Models that only have one image input will not use the feature provider as
     * that input will be set by Vision.
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("setFeatureProvider:")
    public native void setFeatureProvider(@Nullable @Mapped(ObjCObjectMapper.class) MLFeatureProvider value);

    /**
     * The name of the MLFeatureValue that Vision will set from the VNRequestHandler. Vision will use the first input it
     * finds by default but it can be set to another featureName instead.
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("setInputImageFeatureName:")
    public native void setInputImageFeatureName(@NotNull String value);

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}

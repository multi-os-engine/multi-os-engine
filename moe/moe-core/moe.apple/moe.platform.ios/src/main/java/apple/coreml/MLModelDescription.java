package apple.coreml;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSDictionary;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSSecureCoding;
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
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * A description of a model containing input and output feature descriptions, optionally outputted features
 * with special meaning and metadata.
 * 
 * API-Since: 11.0
 */
@Generated
@Library("CoreML")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MLModelDescription extends NSObject implements NSSecureCoding {
    static {
        NatJ.register();
    }

    @Generated
    protected MLModelDescription(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MLModelDescription alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native MLModelDescription allocWithZone(VoidPtr zone);

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
    public native MLModelDescription init();

    /**
     * Description of the inputs to the model
     */
    @NotNull
    @Generated
    @Selector("inputDescriptionsByName")
    public native NSDictionary<String, ? extends MLFeatureDescription> inputDescriptionsByName();

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
     * Optional metadata describing the model
     */
    @NotNull
    @Generated
    @Selector("metadata")
    public native NSDictionary<String, ?> metadata();

    @Generated
    @Owned
    @Selector("new")
    public static native MLModelDescription new_objc();

    /**
     * Description of the outputs from the model
     */
    @NotNull
    @Generated
    @Selector("outputDescriptionsByName")
    public native NSDictionary<String, ? extends MLFeatureDescription> outputDescriptionsByName();

    /**
     * Name of the primary target / predicted output feature in the output descriptions
     */
    @Nullable
    @Generated
    @Selector("predictedFeatureName")
    public native String predictedFeatureName();

    /**
     * Key for all predicted probabilities stored as a MLFeatureTypeDictionary in the output descriptions
     */
    @Nullable
    @Generated
    @Selector("predictedProbabilitiesName")
    public native String predictedProbabilitiesName();

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
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(@NotNull NSCoder coder);

    @Generated
    @Selector("initWithCoder:")
    public native MLModelDescription initWithCoder(@NotNull NSCoder coder);

    /**
     * Indicates if the model has to been configured for updation using model update API.
     */
    @Generated
    @Selector("isUpdatable")
    public native boolean isUpdatable();

    /**
     * Allows for access of each parameter as parameter description.
     */
    @NotNull
    @Generated
    @Selector("parameterDescriptionsByKey")
    public native NSDictionary<? extends MLParameterKey, ? extends MLParameterDescription> parameterDescriptionsByKey();

    @Generated
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    /**
     * Allows for access of each training input as a feature description.
     */
    @NotNull
    @Generated
    @Selector("trainingInputDescriptionsByName")
    public native NSDictionary<String, ? extends MLFeatureDescription> trainingInputDescriptionsByName();

    /**
     * Array to map a class index to the corresponding label, which is either Number or String.
     * 
     * The property is populated from the classLabels entry specified in the model's protobuf message. When the model is
     * a pipeline, which contains one or more sub models, the property value is calculated as follows.
     * 
     * 1. If the pipeline model's proto message specifies predictedFeatureName parameter, use classLabels property value
     * of the sub model with the output feature with the name.
     * 
     * 2. Otherwise, if the pipeline model has only one sub model with non-nil classLabels property, use the property
     * value.
     * 
     * 3. Otherwise, the property is nil.
     * 
     * API-Since: 14.0
     */
    @Nullable
    @Generated
    @Selector("classLabels")
    public native NSArray<?> classLabels();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}

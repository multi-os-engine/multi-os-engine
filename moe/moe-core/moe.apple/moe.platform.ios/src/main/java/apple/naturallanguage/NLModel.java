package apple.naturallanguage;

import apple.NSObject;
import apple.coreml.MLModel;
import apple.foundation.NSArray;
import apple.foundation.NSDictionary;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSNumber;
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
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * API-Since: 12.0
 */
@Generated
@Library("NaturalLanguage")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NLModel extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected NLModel(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NLModel alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native NLModel allocWithZone(VoidPtr zone);

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

    /**
     * API-Since: 12.0
     */
    @NotNull
    @Generated
    @Selector("configuration")
    public native NLModelConfiguration configuration();

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
    public native NLModel init();

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
     * API-Since: 12.0
     */
    @Generated
    @Selector("modelWithContentsOfURL:error:")
    public static native NLModel modelWithContentsOfURLError(@NotNull NSURL url,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * API-Since: 12.0
     */
    @Generated
    @Selector("modelWithMLModel:error:")
    public static native NLModel modelWithMLModelError(@NotNull MLModel mlModel,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Owned
    @Selector("new")
    public static native NLModel new_objc();

    /**
     * For inference purposes, a model will usually be attached to an NLTagger via -setModels:forTagScheme:, and the
     * tagger will then take care of calling the model to produce tags as appropriate. However, it is also possible to
     * use a model to make an individual prediction, either of the label for a given pieces of text (for a classifier
     * model), or of the labels for a given sequence of tokens (for a sequence model). In addition, it is possible to
     * obtain multiple hypotheses for a given label with associated probability scores.
     * 
     * API-Since: 12.0
     */
    @Nullable
    @Generated
    @Selector("predictedLabelForString:")
    public native String predictedLabelForString(@NotNull String string);

    /**
     * API-Since: 12.0
     */
    @NotNull
    @Generated
    @Selector("predictedLabelsForTokens:")
    public native NSArray<String> predictedLabelsForTokens(@NotNull NSArray<String> tokens);

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
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @Selector("predictedLabelHypothesesForString:maximumCount:")
    public native NSDictionary<String, ? extends NSNumber> predictedLabelHypothesesForStringMaximumCount(
            @NotNull String string, @NUInt long maximumCount);

    /**
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @Selector("predictedLabelHypothesesForTokens:maximumCount:")
    public native NSArray<? extends NSDictionary<String, ? extends NSNumber>> predictedLabelHypothesesForTokensMaximumCount(
            @NotNull NSArray<String> tokens, @NUInt long maximumCount);
}

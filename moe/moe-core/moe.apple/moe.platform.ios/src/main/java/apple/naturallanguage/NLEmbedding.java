package apple.naturallanguage;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSDictionary;
import apple.foundation.NSError;
import apple.foundation.NSIndexSet;
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
import org.moe.natj.general.ptr.BoolPtr;
import org.moe.natj.general.ptr.FloatPtr;
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
 * API-Since: 13.0
 */
@Generated
@Library("NaturalLanguage")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NLEmbedding extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected NLEmbedding(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NLEmbedding alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native NLEmbedding allocWithZone(VoidPtr zone);

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
     * API-Since: 13.0
     */
    @Generated
    @Selector("containsString:")
    public native boolean containsString(@NotNull String string);

    /**
     * API-Since: 13.0
     */
    @Generated
    @Selector("currentRevisionForLanguage:")
    @NUInt
    public static native long currentRevisionForLanguage(@NotNull String language);

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * API-Since: 13.0
     */
    @Generated
    @Selector("dimension")
    @NUInt
    public native long dimension();

    /**
     * API-Since: 13.0
     */
    @Generated
    @Selector("distanceBetweenString:andString:distanceType:")
    public native double distanceBetweenStringAndStringDistanceType(@NotNull String firstString,
            @NotNull String secondString, @NInt long distanceType);

    /**
     * API-Since: 13.0
     */
    @Generated
    @Selector("embeddingWithContentsOfURL:error:")
    public static native NLEmbedding embeddingWithContentsOfURLError(@NotNull NSURL url,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * API-Since: 13.0
     */
    @Generated
    @Selector("enumerateNeighborsForString:maximumCount:distanceType:usingBlock:")
    public native void enumerateNeighborsForStringMaximumCountDistanceTypeUsingBlock(@NotNull String string,
            @NUInt long maxCount, @NInt long distanceType,
            @NotNull @ObjCBlock(name = "call_enumerateNeighborsForStringMaximumCountDistanceTypeUsingBlock") Block_enumerateNeighborsForStringMaximumCountDistanceTypeUsingBlock block);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_enumerateNeighborsForStringMaximumCountDistanceTypeUsingBlock {
        @Generated
        void call_enumerateNeighborsForStringMaximumCountDistanceTypeUsingBlock(@NotNull String neighbor,
                double distance, @NotNull BoolPtr stop);
    }

    /**
     * API-Since: 13.0
     */
    @Generated
    @Selector("enumerateNeighborsForString:maximumCount:maximumDistance:distanceType:usingBlock:")
    public native void enumerateNeighborsForStringMaximumCountMaximumDistanceDistanceTypeUsingBlock(
            @NotNull String string, @NUInt long maxCount, double maxDistance, @NInt long distanceType,
            @NotNull @ObjCBlock(name = "call_enumerateNeighborsForStringMaximumCountMaximumDistanceDistanceTypeUsingBlock") Block_enumerateNeighborsForStringMaximumCountMaximumDistanceDistanceTypeUsingBlock block);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_enumerateNeighborsForStringMaximumCountMaximumDistanceDistanceTypeUsingBlock {
        @Generated
        void call_enumerateNeighborsForStringMaximumCountMaximumDistanceDistanceTypeUsingBlock(@NotNull String neighbor,
                double distance, @NotNull BoolPtr stop);
    }

    /**
     * API-Since: 13.0
     */
    @Generated
    @Selector("enumerateNeighborsForVector:maximumCount:distanceType:usingBlock:")
    public native void enumerateNeighborsForVectorMaximumCountDistanceTypeUsingBlock(
            @NotNull NSArray<? extends NSNumber> vector, @NUInt long maxCount, @NInt long distanceType,
            @NotNull @ObjCBlock(name = "call_enumerateNeighborsForVectorMaximumCountDistanceTypeUsingBlock") Block_enumerateNeighborsForVectorMaximumCountDistanceTypeUsingBlock block);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_enumerateNeighborsForVectorMaximumCountDistanceTypeUsingBlock {
        @Generated
        void call_enumerateNeighborsForVectorMaximumCountDistanceTypeUsingBlock(@NotNull String neighbor,
                double distance, @NotNull BoolPtr stop);
    }

    /**
     * API-Since: 13.0
     */
    @Generated
    @Selector("enumerateNeighborsForVector:maximumCount:maximumDistance:distanceType:usingBlock:")
    public native void enumerateNeighborsForVectorMaximumCountMaximumDistanceDistanceTypeUsingBlock(
            @NotNull NSArray<? extends NSNumber> vector, @NUInt long maxCount, double maxDistance,
            @NInt long distanceType,
            @NotNull @ObjCBlock(name = "call_enumerateNeighborsForVectorMaximumCountMaximumDistanceDistanceTypeUsingBlock") Block_enumerateNeighborsForVectorMaximumCountMaximumDistanceDistanceTypeUsingBlock block);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_enumerateNeighborsForVectorMaximumCountMaximumDistanceDistanceTypeUsingBlock {
        @Generated
        void call_enumerateNeighborsForVectorMaximumCountMaximumDistanceDistanceTypeUsingBlock(@NotNull String neighbor,
                double distance, @NotNull BoolPtr stop);
    }

    /**
     * API-Since: 13.0
     */
    @Generated
    @Selector("getVector:forString:")
    public native boolean getVectorForString(@NotNull FloatPtr vector, @NotNull String string);

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native NLEmbedding init();

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
     * API-Since: 13.0
     */
    @Nullable
    @Generated
    @Selector("language")
    public native String language();

    /**
     * API-Since: 13.0
     */
    @Nullable
    @Generated
    @Selector("neighborsForString:maximumCount:distanceType:")
    public native NSArray<String> neighborsForStringMaximumCountDistanceType(@NotNull String string,
            @NUInt long maxCount, @NInt long distanceType);

    /**
     * API-Since: 13.0
     */
    @Nullable
    @Generated
    @Selector("neighborsForString:maximumCount:maximumDistance:distanceType:")
    public native NSArray<String> neighborsForStringMaximumCountMaximumDistanceDistanceType(@NotNull String string,
            @NUInt long maxCount, double maxDistance, @NInt long distanceType);

    /**
     * API-Since: 13.0
     */
    @NotNull
    @Generated
    @Selector("neighborsForVector:maximumCount:distanceType:")
    public native NSArray<String> neighborsForVectorMaximumCountDistanceType(
            @NotNull NSArray<? extends NSNumber> vector, @NUInt long maxCount, @NInt long distanceType);

    /**
     * API-Since: 13.0
     */
    @NotNull
    @Generated
    @Selector("neighborsForVector:maximumCount:maximumDistance:distanceType:")
    public native NSArray<String> neighborsForVectorMaximumCountMaximumDistanceDistanceType(
            @NotNull NSArray<? extends NSNumber> vector, @NUInt long maxCount, double maxDistance,
            @NInt long distanceType);

    @Generated
    @Owned
    @Selector("new")
    public static native NLEmbedding new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * API-Since: 13.0
     */
    @Generated
    @Selector("revision")
    @NUInt
    public native long revision();

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    /**
     * API-Since: 13.0
     */
    @NotNull
    @Generated
    @Selector("supportedRevisionsForLanguage:")
    public static native NSIndexSet supportedRevisionsForLanguage(@NotNull String language);

    /**
     * API-Since: 13.0
     */
    @Nullable
    @Generated
    @Selector("vectorForString:")
    public native NSArray<? extends NSNumber> vectorForString(@NotNull String string);

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * API-Since: 13.0
     */
    @Generated
    @Selector("vocabularySize")
    @NUInt
    public native long vocabularySize();

    /**
     * API-Since: 13.0
     */
    @Nullable
    @Generated
    @Selector("wordEmbeddingForLanguage:")
    public static native NLEmbedding wordEmbeddingForLanguage(@NotNull String language);

    /**
     * API-Since: 13.0
     */
    @Nullable
    @Generated
    @Selector("wordEmbeddingForLanguage:revision:")
    public static native NLEmbedding wordEmbeddingForLanguageRevision(@NotNull String language, @NUInt long revision);

    /**
     * API-Since: 13.0
     */
    @Generated
    @Selector("writeEmbeddingForDictionary:language:revision:toURL:error:")
    public static native boolean writeEmbeddingForDictionaryLanguageRevisionToURLError(
            @NotNull NSDictionary<String, ? extends NSArray<? extends NSNumber>> dictionary, @Nullable String language,
            @NUInt long revision, @NotNull NSURL url,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * API-Since: 14.0
     */
    @Generated
    @Selector("currentSentenceEmbeddingRevisionForLanguage:")
    @NUInt
    public static native long currentSentenceEmbeddingRevisionForLanguage(@NotNull String language);

    /**
     * API-Since: 14.0
     */
    @Nullable
    @Generated
    @Selector("sentenceEmbeddingForLanguage:")
    public static native NLEmbedding sentenceEmbeddingForLanguage(@NotNull String language);

    /**
     * API-Since: 14.0
     */
    @Nullable
    @Generated
    @Selector("sentenceEmbeddingForLanguage:revision:")
    public static native NLEmbedding sentenceEmbeddingForLanguageRevision(@NotNull String language,
            @NUInt long revision);

    /**
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @Selector("supportedSentenceEmbeddingRevisionsForLanguage:")
    public static native NSIndexSet supportedSentenceEmbeddingRevisionsForLanguage(@NotNull String language);
}

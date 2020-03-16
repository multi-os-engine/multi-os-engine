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
import org.moe.natj.general.ann.MappedReturn;
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

    @Generated
    @Selector("allocWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object allocWithZone(VoidPtr zone);

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
    @Selector("containsString:")
    public native boolean containsString(String string);

    @Generated
    @Selector("currentRevisionForLanguage:")
    @NUInt
    public static native long currentRevisionForLanguage(String language);

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("dimension")
    @NUInt
    public native long dimension();

    @Generated
    @Selector("distanceBetweenString:andString:distanceType:")
    public native double distanceBetweenStringAndStringDistanceType(String firstString, String secondString,
            @NInt long distanceType);

    @Generated
    @Selector("embeddingWithContentsOfURL:error:")
    public static native NLEmbedding embeddingWithContentsOfURLError(NSURL url,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Selector("enumerateNeighborsForString:maximumCount:distanceType:usingBlock:")
    public native void enumerateNeighborsForStringMaximumCountDistanceTypeUsingBlock(String string,
            @NUInt long maxCount, @NInt long distanceType,
            @ObjCBlock(name = "call_enumerateNeighborsForStringMaximumCountDistanceTypeUsingBlock") Block_enumerateNeighborsForStringMaximumCountDistanceTypeUsingBlock block);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_enumerateNeighborsForStringMaximumCountDistanceTypeUsingBlock {
        @Generated
        void call_enumerateNeighborsForStringMaximumCountDistanceTypeUsingBlock(String arg0, double arg1, BoolPtr arg2);
    }

    @Generated
    @Selector("enumerateNeighborsForString:maximumCount:maximumDistance:distanceType:usingBlock:")
    public native void enumerateNeighborsForStringMaximumCountMaximumDistanceDistanceTypeUsingBlock(String string,
            @NUInt long maxCount, double maxDistance, @NInt long distanceType,
            @ObjCBlock(name = "call_enumerateNeighborsForStringMaximumCountMaximumDistanceDistanceTypeUsingBlock") Block_enumerateNeighborsForStringMaximumCountMaximumDistanceDistanceTypeUsingBlock block);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_enumerateNeighborsForStringMaximumCountMaximumDistanceDistanceTypeUsingBlock {
        @Generated
        void call_enumerateNeighborsForStringMaximumCountMaximumDistanceDistanceTypeUsingBlock(String arg0, double arg1,
                BoolPtr arg2);
    }

    @Generated
    @Selector("enumerateNeighborsForVector:maximumCount:distanceType:usingBlock:")
    public native void enumerateNeighborsForVectorMaximumCountDistanceTypeUsingBlock(NSArray<? extends NSNumber> vector,
            @NUInt long maxCount, @NInt long distanceType,
            @ObjCBlock(name = "call_enumerateNeighborsForVectorMaximumCountDistanceTypeUsingBlock") Block_enumerateNeighborsForVectorMaximumCountDistanceTypeUsingBlock block);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_enumerateNeighborsForVectorMaximumCountDistanceTypeUsingBlock {
        @Generated
        void call_enumerateNeighborsForVectorMaximumCountDistanceTypeUsingBlock(String arg0, double arg1, BoolPtr arg2);
    }

    @Generated
    @Selector("enumerateNeighborsForVector:maximumCount:maximumDistance:distanceType:usingBlock:")
    public native void enumerateNeighborsForVectorMaximumCountMaximumDistanceDistanceTypeUsingBlock(
            NSArray<? extends NSNumber> vector, @NUInt long maxCount, double maxDistance, @NInt long distanceType,
            @ObjCBlock(name = "call_enumerateNeighborsForVectorMaximumCountMaximumDistanceDistanceTypeUsingBlock") Block_enumerateNeighborsForVectorMaximumCountMaximumDistanceDistanceTypeUsingBlock block);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_enumerateNeighborsForVectorMaximumCountMaximumDistanceDistanceTypeUsingBlock {
        @Generated
        void call_enumerateNeighborsForVectorMaximumCountMaximumDistanceDistanceTypeUsingBlock(String arg0, double arg1,
                BoolPtr arg2);
    }

    @Generated
    @Selector("getVector:forString:")
    public native boolean getVectorForString(FloatPtr vector, String string);

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

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

    @Generated
    @Selector("language")
    public native String language();

    @Generated
    @Selector("neighborsForString:maximumCount:distanceType:")
    public native NSArray<String> neighborsForStringMaximumCountDistanceType(String string, @NUInt long maxCount,
            @NInt long distanceType);

    @Generated
    @Selector("neighborsForString:maximumCount:maximumDistance:distanceType:")
    public native NSArray<String> neighborsForStringMaximumCountMaximumDistanceDistanceType(String string,
            @NUInt long maxCount, double maxDistance, @NInt long distanceType);

    @Generated
    @Selector("neighborsForVector:maximumCount:distanceType:")
    public native NSArray<String> neighborsForVectorMaximumCountDistanceType(NSArray<? extends NSNumber> vector,
            @NUInt long maxCount, @NInt long distanceType);

    @Generated
    @Selector("neighborsForVector:maximumCount:maximumDistance:distanceType:")
    public native NSArray<String> neighborsForVectorMaximumCountMaximumDistanceDistanceType(
            NSArray<? extends NSNumber> vector, @NUInt long maxCount, double maxDistance, @NInt long distanceType);

    @Generated
    @Owned
    @Selector("new")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

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

    @Generated
    @Selector("supportedRevisionsForLanguage:")
    public static native NSIndexSet supportedRevisionsForLanguage(String language);

    @Generated
    @Selector("vectorForString:")
    public native NSArray<? extends NSNumber> vectorForString(String string);

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @Generated
    @Selector("vocabularySize")
    @NUInt
    public native long vocabularySize();

    @Generated
    @Selector("wordEmbeddingForLanguage:")
    public static native NLEmbedding wordEmbeddingForLanguage(String language);

    @Generated
    @Selector("wordEmbeddingForLanguage:revision:")
    public static native NLEmbedding wordEmbeddingForLanguageRevision(String language, @NUInt long revision);

    @Generated
    @Selector("writeEmbeddingForDictionary:language:revision:toURL:error:")
    public static native boolean writeEmbeddingForDictionaryLanguageRevisionToURLError(
            NSDictionary<String, ? extends NSArray<? extends NSNumber>> dictionary, String language,
            @NUInt long revision, NSURL url, @ReferenceInfo(type = NSError.class) Ptr<NSError> error);
}
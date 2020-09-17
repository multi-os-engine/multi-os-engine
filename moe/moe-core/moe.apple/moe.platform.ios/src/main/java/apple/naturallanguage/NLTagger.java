package apple.naturallanguage;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSDictionary;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSNumber;
import apple.foundation.NSOrthography;
import apple.foundation.NSSet;
import apple.foundation.NSValue;
import apple.foundation.struct.NSRange;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.ReferenceInfo;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ann.UncertainArgument;
import org.moe.natj.general.ptr.BoolPtr;
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
public class NLTagger extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected NLTagger(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NLTagger alloc();

    @Generated
    @Selector("allocWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(String key);

    @Generated
    @Selector("availableTagSchemesForUnit:language:")
    public static native NSArray<String> availableTagSchemesForUnitLanguage(@NInt long unit, String language);

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
    @Selector("dominantLanguage")
    public native String dominantLanguage();

    @Generated
    @Selector("enumerateTagsInRange:unit:scheme:options:usingBlock:")
    public native void enumerateTagsInRangeUnitSchemeOptionsUsingBlock(@ByValue NSRange range, @NInt long unit,
            String scheme, @NUInt long options,
            @ObjCBlock(name = "call_enumerateTagsInRangeUnitSchemeOptionsUsingBlock") Block_enumerateTagsInRangeUnitSchemeOptionsUsingBlock block);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_enumerateTagsInRangeUnitSchemeOptionsUsingBlock {
        @Generated
        void call_enumerateTagsInRangeUnitSchemeOptionsUsingBlock(String tag, @ByValue NSRange tokenRange,
                BoolPtr stop);
    }

    @Generated
    @Selector("gazetteersForTagScheme:")
    public native NSArray<? extends NLGazetteer> gazetteersForTagScheme(String tagScheme);

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native NLTagger init();

    @Generated
    @Selector("initWithTagSchemes:")
    public native NLTagger initWithTagSchemes(NSArray<String> tagSchemes);

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
    @Selector("modelsForTagScheme:")
    public native NSArray<? extends NLModel> modelsForTagScheme(String tagScheme);

    @Generated
    @Owned
    @Selector("new")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object new_objc();

    @Generated
    @Selector("requestAssetsForLanguage:tagScheme:completionHandler:")
    public static native void requestAssetsForLanguageTagSchemeCompletionHandler(String language, String tagScheme,
            @ObjCBlock(name = "call_requestAssetsForLanguageTagSchemeCompletionHandler") Block_requestAssetsForLanguageTagSchemeCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_requestAssetsForLanguageTagSchemeCompletionHandler {
        @Generated
        void call_requestAssetsForLanguageTagSchemeCompletionHandler(@NInt long result, NSError error);
    }

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("setGazetteers:forTagScheme:")
    public native void setGazetteersForTagScheme(NSArray<? extends NLGazetteer> gazetteers, String tagScheme);

    @Generated
    @Selector("setLanguage:range:")
    public native void setLanguageRange(String language, @ByValue NSRange range);

    @Generated
    @Selector("setModels:forTagScheme:")
    public native void setModelsForTagScheme(NSArray<? extends NLModel> models, String tagScheme);

    @Generated
    @Selector("setOrthography:range:")
    public native void setOrthographyRange(NSOrthography orthography, @ByValue NSRange range);

    @Generated
    @Selector("setString:")
    public native void setString(String value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("string")
    public native String string();

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("tagAtIndex:unit:scheme:tokenRange:")
    public native String tagAtIndexUnitSchemeTokenRange(@NUInt long characterIndex, @NInt long unit, String scheme,
            @UncertainArgument("Options: reference, array Fallback: reference") NSRange tokenRange);

    @Generated
    @Selector("tagSchemes")
    public native NSArray<String> tagSchemes();

    @Generated
    @Selector("tagsInRange:unit:scheme:options:tokenRanges:")
    public native NSArray<String> tagsInRangeUnitSchemeOptionsTokenRanges(@ByValue NSRange range, @NInt long unit,
            String scheme, @NUInt long options,
            @ReferenceInfo(type = NSArray.class) Ptr<NSArray<? extends NSValue>> tokenRanges);

    @Generated
    @Selector("tokenRangeAtIndex:unit:")
    @ByValue
    public native NSRange tokenRangeAtIndexUnit(@NUInt long characterIndex, @NInt long unit);

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @Generated
    @Selector("tagHypothesesAtIndex:unit:scheme:maximumCount:tokenRange:")
    public native NSDictionary<String, ? extends NSNumber> tagHypothesesAtIndexUnitSchemeMaximumCountTokenRange(
            @NUInt long characterIndex, @NInt long unit, String scheme, @NUInt long maximumCount,
            @UncertainArgument("Options: reference, array Fallback: reference") NSRange tokenRange);

    @Generated
    @Selector("tokenRangeForRange:unit:")
    @ByValue
    public native NSRange tokenRangeForRangeUnit(@ByValue NSRange range, @NInt long unit);
}
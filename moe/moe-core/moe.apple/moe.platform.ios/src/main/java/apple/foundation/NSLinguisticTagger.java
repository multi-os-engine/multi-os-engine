/*
Copyright 2014-2016 Intel Corporation

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/

package apple.foundation;

import apple.NSObject;
import apple.foundation.struct.NSRange;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * API-Since: 5.0
 * Deprecated-Since: 100000.0
 * Deprecated-Message: All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API
 */
@Deprecated
@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSLinguisticTagger extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected NSLinguisticTagger(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSLinguisticTagger alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native NSLinguisticTagger allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    /**
     * Clients wishing to know the tag schemes supported in NSLinguisticTagger for a particular language at the word
     * level may query them with this method. The language should be specified using a standard abbreviation as with
     * NSOrthography.
     * 
     * API-Since: 5.0
     * Deprecated-Since: 100000.0
     * Deprecated-Message: All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API
     */
    @NotNull
    @Deprecated
    @Generated
    @Selector("availableTagSchemesForLanguage:")
    public static native NSArray<String> availableTagSchemesForLanguage(@NotNull String language);

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
    public static native NSLinguisticTagger new_objc();

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
     * Methods that do not specify a unit act at the word level.
     * 
     * API-Since: 5.0
     * Deprecated-Since: 100000.0
     * Deprecated-Message: All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API
     */
    @Deprecated
    @Generated
    @Selector("enumerateTagsInRange:scheme:options:usingBlock:")
    public native void enumerateTagsInRangeSchemeOptionsUsingBlock(@ByValue NSRange range, @NotNull String tagScheme,
            @NUInt long opts,
            @NotNull @ObjCBlock(name = "call_enumerateTagsInRangeSchemeOptionsUsingBlock") Block_enumerateTagsInRangeSchemeOptionsUsingBlock block);

    @Generated
    @Selector("init")
    public native NSLinguisticTagger init();

    /**
     * An instance of NSLinguisticTagger is created with an array of tag schemes. The tagger will be able to supply tags
     * corresponding to any of the schemes in this array.
     * 
     * API-Since: 5.0
     * Deprecated-Since: 100000.0
     * Deprecated-Message: All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API
     */
    @Deprecated
    @Generated
    @Selector("initWithTagSchemes:options:")
    public native NSLinguisticTagger initWithTagSchemesOptions(@NotNull NSArray<String> tagSchemes, @NUInt long opts);

    /**
     * API-Since: 5.0
     * Deprecated-Since: 100000.0
     * Deprecated-Message: All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API
     */
    @Nullable
    @Deprecated
    @Generated
    @Selector("orthographyAtIndex:effectiveRange:")
    public native NSOrthography orthographyAtIndexEffectiveRange(@NUInt long charIndex,
            @Nullable NSRange effectiveRange);

    /**
     * Deprecated method for obtaining a list of possible tags for the token at a given index.
     * 
     * API-Since: 5.0
     * Deprecated-Since: 100000.0
     * Deprecated-Message: All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API
     */
    @Nullable
    @Deprecated
    @Generated
    @Selector("possibleTagsAtIndex:scheme:tokenRange:sentenceRange:scores:")
    public native NSArray<String> possibleTagsAtIndexSchemeTokenRangeSentenceRangeScores(@NUInt long charIndex,
            @NotNull String tagScheme, @Nullable NSRange tokenRange, @Nullable NSRange sentenceRange,
            @Nullable @ReferenceInfo(type = NSArray.class) Ptr<NSArray<? extends NSValue>> scores);

    /**
     * Returns a range covering all sentences intersecting the given range.
     * 
     * API-Since: 5.0
     * Deprecated-Since: 100000.0
     * Deprecated-Message: All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API
     */
    @Deprecated
    @Generated
    @Selector("sentenceRangeForRange:")
    @ByValue
    public native NSRange sentenceRangeForRange(@ByValue NSRange range);

    /**
     * If clients know the orthography for a given portion of the string, they may supply it to the tagger. Otherwise,
     * the tagger will infer the language from the contents of the text. In each case, the charIndex or range passed in
     * must not extend beyond the end of the tagger's string, or the methods will raise an exception.
     * 
     * API-Since: 5.0
     * Deprecated-Since: 100000.0
     * Deprecated-Message: All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API
     */
    @Deprecated
    @Generated
    @Selector("setOrthography:range:")
    public native void setOrthographyRange(@Nullable NSOrthography orthography, @ByValue NSRange range);

    /**
     * API-Since: 5.0
     * Deprecated-Since: 100000.0
     * Deprecated-Message: All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API
     */
    @Deprecated
    @Generated
    @Selector("setString:")
    public native void setString(@Nullable String value);

    /**
     * API-Since: 5.0
     * Deprecated-Since: 100000.0
     * Deprecated-Message: All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API
     */
    @Nullable
    @Deprecated
    @Generated
    @Selector("string")
    public native String string();

    /**
     * If the string attached to the tagger is mutable, this method must be called to inform the tagger whenever the
     * string changes. The newRange is the range in the final string which was explicitly edited, and delta is the
     * change in length from the previous version to the current version of the string. Alternatively, the client may
     * call setString: again to reset all information about the string, but this has the disadvantage of not preserving
     * information about portions of the string that have not changed.
     * 
     * API-Since: 5.0
     * Deprecated-Since: 100000.0
     * Deprecated-Message: All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API
     */
    @Deprecated
    @Generated
    @Selector("stringEditedInRange:changeInLength:")
    public native void stringEditedInRangeChangeInLength(@ByValue NSRange newRange, @NInt long delta);

    /**
     * API-Since: 5.0
     * Deprecated-Since: 100000.0
     * Deprecated-Message: All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API
     */
    @Nullable
    @Deprecated
    @Generated
    @Selector("tagAtIndex:scheme:tokenRange:sentenceRange:")
    public native String tagAtIndexSchemeTokenRangeSentenceRange(@NUInt long charIndex, @NotNull String scheme,
            @Nullable NSRange tokenRange, @Nullable NSRange sentenceRange);

    /**
     * API-Since: 5.0
     * Deprecated-Since: 100000.0
     * Deprecated-Message: All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API
     */
    @NotNull
    @Deprecated
    @Generated
    @Selector("tagSchemes")
    public native NSArray<String> tagSchemes();

    /**
     * API-Since: 5.0
     * Deprecated-Since: 100000.0
     * Deprecated-Message: All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API
     */
    @NotNull
    @Deprecated
    @Generated
    @Selector("tagsInRange:scheme:options:tokenRanges:")
    public native NSArray<String> tagsInRangeSchemeOptionsTokenRanges(@ByValue NSRange range, @NotNull String tagScheme,
            @NUInt long opts,
            @Nullable @ReferenceInfo(type = NSArray.class) Ptr<NSArray<? extends NSValue>> tokenRanges);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_enumerateTagsInRangeSchemeOptionsUsingBlock {
        @Generated
        void call_enumerateTagsInRangeSchemeOptionsUsingBlock(@Nullable String tag, @ByValue NSRange tokenRange,
                @ByValue NSRange sentenceRange, @NotNull BoolPtr stop);
    }

    /**
     * Clients wishing to know the tag schemes supported in NSLinguisticTagger for a particular unit and language may
     * query them with this method. The language should be specified using a standard BCP-47 language tag as with
     * NSOrthography.
     * 
     * API-Since: 11.0
     * Deprecated-Since: 100000.0
     * Deprecated-Message: All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API
     */
    @NotNull
    @Deprecated
    @Generated
    @Selector("availableTagSchemesForUnit:language:")
    public static native NSArray<String> availableTagSchemesForUnitLanguage(@NInt long unit, @NotNull String language);

    /**
     * Returns the top identified language (if any) for the entire string. Convenience for tagAtIndex: with
     * NSLinguisticTagSchemeLanguage and NSLinguisticTaggerUnitDocument.
     * 
     * API-Since: 11.0
     * Deprecated-Since: 100000.0
     * Deprecated-Message: All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API
     */
    @Nullable
    @Deprecated
    @Generated
    @Selector("dominantLanguage")
    public native String dominantLanguage();

    /**
     * The following class methods are conveniences for clients who wish to perform a single analysis on a string
     * without having to create an instance of NSLinguisticTagger. If more than one tagging operation is needed on a
     * given string, it is more efficient to use an explicit NSLinguisticTagger instance.
     * 
     * API-Since: 11.0
     * Deprecated-Since: 100000.0
     * Deprecated-Message: All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API
     */
    @Nullable
    @Deprecated
    @Generated
    @Selector("dominantLanguageForString:")
    public static native String dominantLanguageForString(@NotNull String string);

    /**
     * API-Since: 11.0
     * Deprecated-Since: 100000.0
     * Deprecated-Message: All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API
     */
    @Deprecated
    @Generated
    @Selector("enumerateTagsForString:range:unit:scheme:options:orthography:usingBlock:")
    public static native void enumerateTagsForStringRangeUnitSchemeOptionsOrthographyUsingBlock(@NotNull String string,
            @ByValue NSRange range, @NInt long unit, @NotNull String scheme, @NUInt long options,
            @Nullable NSOrthography orthography,
            @NotNull @ObjCBlock(name = "call_enumerateTagsForStringRangeUnitSchemeOptionsOrthographyUsingBlock") Block_enumerateTagsForStringRangeUnitSchemeOptionsOrthographyUsingBlock block);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_enumerateTagsForStringRangeUnitSchemeOptionsOrthographyUsingBlock {
        @Generated
        void call_enumerateTagsForStringRangeUnitSchemeOptionsOrthographyUsingBlock(@Nullable String tag,
                @ByValue NSRange tokenRange, @NotNull BoolPtr stop);
    }

    /**
     * The tagger will segment the string as needed into tokens for the given unit, and return those ranges along with a
     * tag for any scheme in its array of tag schemes. The fundamental tagging method on NSLinguisticTagger is a block
     * iterator, that iterates over all tokens intersecting a given range, supplying tags and ranges. There are several
     * additional convenience methods, for obtaining a sentence range, information about a single token, or for
     * obtaining information about all tokens intersecting a given range at once, in arrays. In each case, the charIndex
     * or range passed in must not extend beyond the end of the tagger's string, or the methods will raise an exception.
     * Note that a given instance of NSLinguisticTagger should not be used from more than one thread simultaneously.
     * 
     * API-Since: 11.0
     * Deprecated-Since: 100000.0
     * Deprecated-Message: All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API
     */
    @Deprecated
    @Generated
    @Selector("enumerateTagsInRange:unit:scheme:options:usingBlock:")
    public native void enumerateTagsInRangeUnitSchemeOptionsUsingBlock(@ByValue NSRange range, @NInt long unit,
            @NotNull String scheme, @NUInt long options,
            @NotNull @ObjCBlock(name = "call_enumerateTagsInRangeUnitSchemeOptionsUsingBlock") Block_enumerateTagsInRangeUnitSchemeOptionsUsingBlock block);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_enumerateTagsInRangeUnitSchemeOptionsUsingBlock {
        @Generated
        void call_enumerateTagsInRangeUnitSchemeOptionsUsingBlock(@Nullable String tag, @ByValue NSRange tokenRange,
                @NotNull BoolPtr stop);
    }

    /**
     * API-Since: 11.0
     * Deprecated-Since: 100000.0
     * Deprecated-Message: All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API
     */
    @Nullable
    @Deprecated
    @Generated
    @Selector("tagAtIndex:unit:scheme:tokenRange:")
    public native String tagAtIndexUnitSchemeTokenRange(@NUInt long charIndex, @NInt long unit, @NotNull String scheme,
            @Nullable @UncertainArgument("Options: reference, array Fallback: reference") NSRange tokenRange);

    /**
     * API-Since: 11.0
     * Deprecated-Since: 100000.0
     * Deprecated-Message: All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API
     */
    @Nullable
    @Deprecated
    @Generated
    @Selector("tagForString:atIndex:unit:scheme:orthography:tokenRange:")
    public static native String tagForStringAtIndexUnitSchemeOrthographyTokenRange(@NotNull String string,
            @NUInt long charIndex, @NInt long unit, @NotNull String scheme, @Nullable NSOrthography orthography,
            @Nullable @UncertainArgument("Options: reference, array Fallback: reference") NSRange tokenRange);

    /**
     * API-Since: 11.0
     * Deprecated-Since: 100000.0
     * Deprecated-Message: All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API
     */
    @NotNull
    @Deprecated
    @Generated
    @Selector("tagsForString:range:unit:scheme:options:orthography:tokenRanges:")
    public static native NSArray<String> tagsForStringRangeUnitSchemeOptionsOrthographyTokenRanges(
            @NotNull String string, @ByValue NSRange range, @NInt long unit, @NotNull String scheme,
            @NUInt long options, @Nullable NSOrthography orthography,
            @Nullable @ReferenceInfo(type = NSArray.class) Ptr<NSArray<? extends NSValue>> tokenRanges);

    /**
     * API-Since: 11.0
     * Deprecated-Since: 100000.0
     * Deprecated-Message: All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API
     */
    @NotNull
    @Deprecated
    @Generated
    @Selector("tagsInRange:unit:scheme:options:tokenRanges:")
    public native NSArray<String> tagsInRangeUnitSchemeOptionsTokenRanges(@ByValue NSRange range, @NInt long unit,
            @NotNull String scheme, @NUInt long options,
            @Nullable @ReferenceInfo(type = NSArray.class) Ptr<NSArray<? extends NSValue>> tokenRanges);

    /**
     * Returns the range corresponding to the token for the given unit that contains the given character index.
     * 
     * API-Since: 11.0
     * Deprecated-Since: 100000.0
     * Deprecated-Message: All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API
     */
    @Deprecated
    @Generated
    @Selector("tokenRangeAtIndex:unit:")
    @ByValue
    public native NSRange tokenRangeAtIndexUnit(@NUInt long charIndex, @NInt long unit);
}

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

    @Generated
    @Selector("allocWithZone:")
    public static native NSLinguisticTagger allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(String key);

    /**
     * Clients wishing to know the tag schemes supported in NSLinguisticTagger for a particular language at the word level may query them with this method.  The language should be specified using a standard abbreviation as with NSOrthography.
     */
    @Generated
    @Selector("availableTagSchemesForLanguage:")
    public static native NSArray<String> availableTagSchemesForLanguage(String language);

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

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

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
     */
    @Generated
    @Selector("enumerateTagsInRange:scheme:options:usingBlock:")
    public native void enumerateTagsInRangeSchemeOptionsUsingBlock(@ByValue NSRange range, String tagScheme,
            @NUInt long opts,
            @ObjCBlock(name = "call_enumerateTagsInRangeSchemeOptionsUsingBlock") Block_enumerateTagsInRangeSchemeOptionsUsingBlock block);

    @Generated
    @Selector("init")
    public native NSLinguisticTagger init();

    /**
     * An instance of NSLinguisticTagger is created with an array of tag schemes.  The tagger will be able to supply tags corresponding to any of the schemes in this array.
     */
    @Generated
    @Selector("initWithTagSchemes:options:")
    public native NSLinguisticTagger initWithTagSchemesOptions(NSArray<String> tagSchemes, @NUInt long opts);

    @Generated
    @Selector("orthographyAtIndex:effectiveRange:")
    public native NSOrthography orthographyAtIndexEffectiveRange(@NUInt long charIndex, NSRange effectiveRange);

    /**
     * Deprecated method for obtaining a list of possible tags for the token at a given index.
     */
    @Generated
    @Selector("possibleTagsAtIndex:scheme:tokenRange:sentenceRange:scores:")
    public native NSArray<String> possibleTagsAtIndexSchemeTokenRangeSentenceRangeScores(@NUInt long charIndex,
            String tagScheme, NSRange tokenRange, NSRange sentenceRange,
            @ReferenceInfo(type = NSArray.class) Ptr<NSArray<? extends NSValue>> scores);

    /**
     * Returns a range covering all sentences intersecting the given range.
     */
    @Generated
    @Selector("sentenceRangeForRange:")
    @ByValue
    public native NSRange sentenceRangeForRange(@ByValue NSRange range);

    /**
     * If clients know the orthography for a given portion of the string, they may supply it to the tagger.  Otherwise, the tagger will infer the language from the contents of the text.  In each case, the charIndex or range passed in must not extend beyond the end of the tagger's string, or the methods will raise an exception.
     */
    @Generated
    @Selector("setOrthography:range:")
    public native void setOrthographyRange(NSOrthography orthography, @ByValue NSRange range);

    @Generated
    @Selector("setString:")
    public native void setString(String value);

    @Generated
    @Selector("string")
    public native String string();

    /**
     * If the string attached to the tagger is mutable, this method must be called to inform the tagger whenever the string changes.  The newRange is the range in the final string which was explicitly edited, and delta is the change in length from the previous version to the current version of the string.  Alternatively, the client may call setString: again to reset all information about the string, but this has the disadvantage of not preserving information about portions of the string that have not changed.
     */
    @Generated
    @Selector("stringEditedInRange:changeInLength:")
    public native void stringEditedInRangeChangeInLength(@ByValue NSRange newRange, @NInt long delta);

    @Generated
    @Selector("tagAtIndex:scheme:tokenRange:sentenceRange:")
    public native String tagAtIndexSchemeTokenRangeSentenceRange(@NUInt long charIndex, String scheme,
            NSRange tokenRange, NSRange sentenceRange);

    @Generated
    @Selector("tagSchemes")
    public native NSArray<String> tagSchemes();

    @Generated
    @Selector("tagsInRange:scheme:options:tokenRanges:")
    public native NSArray<String> tagsInRangeSchemeOptionsTokenRanges(@ByValue NSRange range, String tagScheme,
            @NUInt long opts, @ReferenceInfo(type = NSArray.class) Ptr<NSArray<? extends NSValue>> tokenRanges);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_enumerateTagsInRangeSchemeOptionsUsingBlock {
        @Generated
        void call_enumerateTagsInRangeSchemeOptionsUsingBlock(String tag, @ByValue NSRange tokenRange,
                @ByValue NSRange sentenceRange, BoolPtr stop);
    }

    /**
     * Clients wishing to know the tag schemes supported in NSLinguisticTagger for a particular unit and language may query them with this method.  The language should be specified using a standard BCP-47 language tag as with NSOrthography.
     */
    @Generated
    @Selector("availableTagSchemesForUnit:language:")
    public static native NSArray<String> availableTagSchemesForUnitLanguage(@NInt long unit, String language);

    /**
     * Returns the top identified language (if any) for the entire string.  Convenience for tagAtIndex: with NSLinguisticTagSchemeLanguage and NSLinguisticTaggerUnitDocument.
     */
    @Generated
    @Selector("dominantLanguage")
    public native String dominantLanguage();

    /**
     * The following class methods are conveniences for clients who wish to perform a single analysis on a string without having to create an instance of NSLinguisticTagger.  If more than one tagging operation is needed on a given string, it is more efficient to use an explicit NSLinguisticTagger instance.
     */
    @Generated
    @Selector("dominantLanguageForString:")
    public static native String dominantLanguageForString(String string);

    @Generated
    @Selector("enumerateTagsForString:range:unit:scheme:options:orthography:usingBlock:")
    public static native void enumerateTagsForStringRangeUnitSchemeOptionsOrthographyUsingBlock(String string,
            @ByValue NSRange range, @NInt long unit, String scheme, @NUInt long options, NSOrthography orthography,
            @ObjCBlock(name = "call_enumerateTagsForStringRangeUnitSchemeOptionsOrthographyUsingBlock") Block_enumerateTagsForStringRangeUnitSchemeOptionsOrthographyUsingBlock block);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_enumerateTagsForStringRangeUnitSchemeOptionsOrthographyUsingBlock {
        @Generated
        void call_enumerateTagsForStringRangeUnitSchemeOptionsOrthographyUsingBlock(String tag,
                @ByValue NSRange tokenRange, BoolPtr stop);
    }

    /**
     * The tagger will segment the string as needed into tokens for the given unit, and return those ranges along with a tag for any scheme in its array of tag schemes.  The fundamental tagging method on NSLinguisticTagger is a block iterator, that iterates over all tokens intersecting a given range, supplying tags and ranges.  There are several additional convenience methods, for obtaining a sentence range, information about a single token, or for obtaining information about all tokens intersecting a given range at once, in arrays.  In each case, the charIndex or range passed in must not extend beyond the end of the tagger's string, or the methods will raise an exception.  Note that a given instance of NSLinguisticTagger should not be used from more than one thread simultaneously.
     */
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
    @Selector("tagAtIndex:unit:scheme:tokenRange:")
    public native String tagAtIndexUnitSchemeTokenRange(@NUInt long charIndex, @NInt long unit, String scheme,
            @UncertainArgument("Options: reference, array Fallback: reference") NSRange tokenRange);

    @Generated
    @Selector("tagForString:atIndex:unit:scheme:orthography:tokenRange:")
    public static native String tagForStringAtIndexUnitSchemeOrthographyTokenRange(String string, @NUInt long charIndex,
            @NInt long unit, String scheme, NSOrthography orthography,
            @UncertainArgument("Options: reference, array Fallback: reference") NSRange tokenRange);

    @Generated
    @Selector("tagsForString:range:unit:scheme:options:orthography:tokenRanges:")
    public static native NSArray<String> tagsForStringRangeUnitSchemeOptionsOrthographyTokenRanges(String string,
            @ByValue NSRange range, @NInt long unit, String scheme, @NUInt long options, NSOrthography orthography,
            @ReferenceInfo(type = NSArray.class) Ptr<NSArray<? extends NSValue>> tokenRanges);

    @Generated
    @Selector("tagsInRange:unit:scheme:options:tokenRanges:")
    public native NSArray<String> tagsInRangeUnitSchemeOptionsTokenRanges(@ByValue NSRange range, @NInt long unit,
            String scheme, @NUInt long options,
            @ReferenceInfo(type = NSArray.class) Ptr<NSArray<? extends NSValue>> tokenRanges);

    /**
     * Returns the range corresponding to the token for the given unit that contains the given character index.
     */
    @Generated
    @Selector("tokenRangeAtIndex:unit:")
    @ByValue
    public native NSRange tokenRangeAtIndexUnit(@NUInt long charIndex, @NInt long unit);
}

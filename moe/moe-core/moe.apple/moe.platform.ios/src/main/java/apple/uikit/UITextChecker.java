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

package apple.uikit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
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
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * A UITextChecker object is used by a client (e.g. a document in an application) to check a given NSString. Generally one UITextChecker instance should be created per document.  Multiple related pieces of text may share a single UITextChecker instance, if they are intended to share ignored words and other similar state.
 */
@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class UITextChecker extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected UITextChecker(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native UITextChecker alloc();

    @Generated
    @Selector("allocWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(String key);

    /**
     * Entries in the availableLanguages list are all available spellchecking languages in user preference order, usually language abbreviations such as en_US.
     */
    @Generated
    @Selector("availableLanguages")
    public static native NSArray<String> availableLanguages();

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
    @Selector("hasLearnedWord:")
    public static native boolean hasLearnedWord(String word);

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

    /**
     * These allow clients to programmatically instruct the checker to learn and unlearn words, and to determine whether a word has been learned (and hence can potentially be unlearned).
     */
    @Generated
    @Selector("learnWord:")
    public static native void learnWord(String word);

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
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("unlearnWord:")
    public static native void unlearnWord(String word);

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * Returns an array of strings, in the order in which they should be presented, representing complete words that the user might be trying to type when starting by typing the partial word at the given range in the given string.
     */
    @Generated
    @Selector("completionsForPartialWordRange:inString:language:")
    public native NSArray<String> completionsForPartialWordRangeInStringLanguage(@ByValue NSRange range, String string,
            String language);

    /**
     * Returns an array of strings, in the order in which they should be presented, representing guesses for words that might have been intended in place of the misspelled word at the given range in the given string.
     */
    @Generated
    @Selector("guessesForWordRange:inString:language:")
    public native NSArray<String> guessesForWordRangeInStringLanguage(@ByValue NSRange range, String string,
            String language);

    /**
     * Methods for dealing with ignored words.
     */
    @Generated
    @Selector("ignoreWord:")
    public native void ignoreWord(String wordToIgnore);

    @Generated
    @Selector("ignoredWords")
    public native NSArray<String> ignoredWords();

    @Generated
    @Selector("init")
    public native UITextChecker init();

    /**
     * Initiates a spell-check of a string.  Returns the range of the first misspelled word, or {NSNotFound, 0} if none is found.  Checking is limited to the range specified, and starts at the specified offset (which should lie within the range), but if wrapFlag is YES then it will check from the beginning of the range if no misspelling is found between startingOffset and the end of the range.
     */
    @Generated
    @Selector("rangeOfMisspelledWordInString:range:startingAt:wrap:language:")
    @ByValue
    public native NSRange rangeOfMisspelledWordInStringRangeStartingAtWrapLanguage(String stringToCheck,
            @ByValue NSRange range, @NInt long startingOffset, boolean wrapFlag, String language);

    @Generated
    @Selector("setIgnoredWords:")
    public native void setIgnoredWords(NSArray<String> value);
}

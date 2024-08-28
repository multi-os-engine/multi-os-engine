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
import apple.foundation.protocol.NSCopying;
import apple.foundation.protocol.NSSecureCoding;
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
 * NSOrthography is a class used to describe the linguistic content of a piece of text, especially for the purposes of
 * spelling and grammar checking. It describes (a) which scripts the text contains, (b) a dominant language and possibly
 * other languages for each of these scripts, and (c) a dominant script and language for the text as a whole. Scripts
 * are uniformly described by standard four-letter tags (Latn, Grek, Cyrl, etc.) with the supertags Jpan and Kore
 * typically used for Japanese and Korean text, Hans and Hant for Chinese text; the tag Zyyy is used if a specific
 * script cannot be identified. Languages are uniformly described by BCP-47 tags, preferably in canonical form; the tag
 * und is used if a specific language cannot be determined.
 * 
 * API-Since: 4.0
 */
@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSOrthography extends NSObject implements NSCopying, NSSecureCoding {
    static {
        NatJ.register();
    }

    @Generated
    protected NSOrthography(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSOrthography alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native NSOrthography allocWithZone(VoidPtr zone);

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
    public static native NSOrthography new_objc();

    /**
     * API-Since: 4.0
     */
    @Generated
    @Selector("orthographyWithDominantScript:languageMap:")
    public static native NSOrthography orthographyWithDominantScriptLanguageMap(@NotNull String script,
            @NotNull NSDictionary<String, ? extends NSArray<String>> map);

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
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @Selector("allLanguages")
    public native NSArray<String> allLanguages();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @Selector("allScripts")
    public native NSArray<String> allScripts();

    @NotNull
    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(@Nullable VoidPtr zone);

    /**
     * The dominantLanguage is the first in the list of languages for the dominant script, allScripts includes the
     * dominant script and all others appearing as keys in the language map, and allLanguages includes all languages
     * appearing in the values of the language map.
     * 
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @Selector("dominantLanguage")
    public native String dominantLanguage();

    /**
     * API-Since: 4.0
     */
    @Nullable
    @Generated
    @Selector("dominantLanguageForScript:")
    public native String dominantLanguageForScript(@NotNull String script);

    /**
     * These are the primitive properties which a subclass must implement. The dominantScript should be a script tag
     * (such as Latn, Cyrl, and so forth) and the languageMap should be a dictionary whose keys are script tags and
     * whose values are arrays of language tags (such as en, fr, de, and so forth).
     */
    @NotNull
    @Generated
    @Selector("dominantScript")
    public native String dominantScript();

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(@NotNull NSCoder coder);

    @Generated
    @Selector("init")
    public native NSOrthography init();

    @Generated
    @Selector("initWithCoder:")
    public native NSOrthography initWithCoder(@NotNull NSCoder coder);

    /**
     * API-Since: 4.0
     */
    @Generated
    @Selector("initWithDominantScript:languageMap:")
    public native NSOrthography initWithDominantScriptLanguageMap(@NotNull String script,
            @NotNull NSDictionary<String, ? extends NSArray<String>> map);

    @NotNull
    @Generated
    @Selector("languageMap")
    public native NSDictionary<String, ? extends NSArray<String>> languageMap();

    /**
     * languagesForScript: returns the list of languages for the specified script, and dominantLanguageForScript:
     * returns the first item on that list.
     * 
     * API-Since: 4.0
     */
    @Nullable
    @Generated
    @Selector("languagesForScript:")
    public native NSArray<String> languagesForScript(@NotNull String script);

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    /**
     * API-Since: 11.0
     */
    @NotNull
    @Generated
    @Selector("defaultOrthographyForLanguage:")
    public static native NSOrthography defaultOrthographyForLanguage(@NotNull String language);

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}

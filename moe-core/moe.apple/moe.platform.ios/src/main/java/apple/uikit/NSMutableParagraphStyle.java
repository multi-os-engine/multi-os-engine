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
import apple.foundation.NSCoder;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.NFloat;
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
 * API-Since: 6.0
 */
@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSMutableParagraphStyle extends NSParagraphStyle {
    static {
        NatJ.register();
    }

    @Generated
    protected NSMutableParagraphStyle(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSMutableParagraphStyle alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native NSMutableParagraphStyle allocWithZone(VoidPtr zone);

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

    @NotNull
    @Generated
    @Selector("defaultParagraphStyle")
    public static native NSParagraphStyle defaultParagraphStyle();

    @Generated
    @Selector("defaultWritingDirectionForLanguage:")
    @NInt
    public static native long defaultWritingDirectionForLanguage(@Nullable String languageName);

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
    public static native NSMutableParagraphStyle new_objc();

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
     * API-Since: 9.0
     */
    @Generated
    @Selector("addTabStop:")
    public native void addTabStop(@NotNull NSTextTab anObject);

    @Generated
    @Selector("alignment")
    @NInt
    public native long alignment();

    /**
     * API-Since: 9.0
     */
    @Generated
    @Selector("allowsDefaultTighteningForTruncation")
    public native boolean allowsDefaultTighteningForTruncation();

    @Generated
    @Selector("baseWritingDirection")
    @NInt
    public native long baseWritingDirection();

    /**
     * API-Since: 7.0
     */
    @Generated
    @Selector("defaultTabInterval")
    @NFloat
    public native double defaultTabInterval();

    @Generated
    @Selector("firstLineHeadIndent")
    @NFloat
    public native double firstLineHeadIndent();

    @Generated
    @Selector("headIndent")
    @NFloat
    public native double headIndent();

    @Generated
    @Selector("hyphenationFactor")
    public native float hyphenationFactor();

    @Generated
    @Selector("init")
    public native NSMutableParagraphStyle init();

    @Generated
    @Selector("initWithCoder:")
    public native NSMutableParagraphStyle initWithCoder(@NotNull NSCoder coder);

    @Generated
    @Selector("lineBreakMode")
    @NInt
    public native long lineBreakMode();

    @Generated
    @Selector("lineHeightMultiple")
    @NFloat
    public native double lineHeightMultiple();

    @Generated
    @Selector("lineSpacing")
    @NFloat
    public native double lineSpacing();

    @Generated
    @Selector("maximumLineHeight")
    @NFloat
    public native double maximumLineHeight();

    @Generated
    @Selector("minimumLineHeight")
    @NFloat
    public native double minimumLineHeight();

    @Generated
    @Selector("paragraphSpacing")
    @NFloat
    public native double paragraphSpacing();

    @Generated
    @Selector("paragraphSpacingBefore")
    @NFloat
    public native double paragraphSpacingBefore();

    /**
     * API-Since: 9.0
     */
    @Generated
    @Selector("removeTabStop:")
    public native void removeTabStop(@NotNull NSTextTab anObject);

    @Generated
    @Selector("setAlignment:")
    public native void setAlignment(@NInt long value);

    /**
     * API-Since: 9.0
     */
    @Generated
    @Selector("setAllowsDefaultTighteningForTruncation:")
    public native void setAllowsDefaultTighteningForTruncation(boolean value);

    @Generated
    @Selector("setBaseWritingDirection:")
    public native void setBaseWritingDirection(@NInt long value);

    /**
     * API-Since: 7.0
     */
    @Generated
    @Selector("setDefaultTabInterval:")
    public native void setDefaultTabInterval(@NFloat double value);

    @Generated
    @Selector("setFirstLineHeadIndent:")
    public native void setFirstLineHeadIndent(@NFloat double value);

    @Generated
    @Selector("setHeadIndent:")
    public native void setHeadIndent(@NFloat double value);

    @Generated
    @Selector("setHyphenationFactor:")
    public native void setHyphenationFactor(float value);

    @Generated
    @Selector("setLineBreakMode:")
    public native void setLineBreakMode(@NInt long value);

    @Generated
    @Selector("setLineHeightMultiple:")
    public native void setLineHeightMultiple(@NFloat double value);

    @Generated
    @Selector("setLineSpacing:")
    public native void setLineSpacing(@NFloat double value);

    @Generated
    @Selector("setMaximumLineHeight:")
    public native void setMaximumLineHeight(@NFloat double value);

    @Generated
    @Selector("setMinimumLineHeight:")
    public native void setMinimumLineHeight(@NFloat double value);

    @Generated
    @Selector("setParagraphSpacing:")
    public native void setParagraphSpacing(@NFloat double value);

    @Generated
    @Selector("setParagraphSpacingBefore:")
    public native void setParagraphSpacingBefore(@NFloat double value);

    /**
     * API-Since: 9.0
     */
    @Generated
    @Selector("setParagraphStyle:")
    public native void setParagraphStyle(@NotNull NSParagraphStyle obj);

    /**
     * API-Since: 7.0
     */
    @Generated
    @Selector("setTabStops:")
    public native void setTabStops(NSArray<? extends NSTextTab> value);

    @Generated
    @Selector("setTailIndent:")
    public native void setTailIndent(@NFloat double value);

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    /**
     * API-Since: 7.0
     */
    @Generated
    @Selector("tabStops")
    public native NSArray<? extends NSTextTab> tabStops();

    @Generated
    @Selector("tailIndent")
    @NFloat
    public native double tailIndent();

    /**
     * API-Since: 9.0
     */
    @Generated
    @Selector("lineBreakStrategy")
    @NUInt
    public native long lineBreakStrategy();

    /**
     * API-Since: 9.0
     */
    @Generated
    @Selector("setLineBreakStrategy:")
    public native void setLineBreakStrategy(@NUInt long value);

    /**
     * API-Since: 15.0
     */
    @Generated
    @Selector("setUsesDefaultHyphenation:")
    public native void setUsesDefaultHyphenation(boolean value);

    /**
     * API-Since: 15.0
     */
    @Generated
    @Selector("usesDefaultHyphenation")
    public native boolean usesDefaultHyphenation();

    /**
     * API-Since: 7.0
     */
    @Generated
    @Selector("setTextLists:")
    public native void setTextLists(@NotNull NSArray<? extends NSTextList> value);

    /**
     * API-Since: 7.0
     */
    @NotNull
    @Generated
    @Selector("textLists")
    public native NSArray<? extends NSTextList> textLists();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}

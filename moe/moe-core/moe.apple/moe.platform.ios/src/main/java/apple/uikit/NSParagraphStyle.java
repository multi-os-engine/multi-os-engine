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
import apple.foundation.protocol.NSCopying;
import apple.foundation.protocol.NSMutableCopying;
import apple.foundation.protocol.NSSecureCoding;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
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

/**
 * NSParagraphStyle
 */
@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSParagraphStyle extends NSObject implements NSCopying, NSMutableCopying, NSSecureCoding {
    static {
        NatJ.register();
    }

    @Generated
    protected NSParagraphStyle(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSParagraphStyle alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native NSParagraphStyle allocWithZone(VoidPtr zone);

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
    @Selector("debugDescription")
    public static native String debugDescription_static();

    /**
     * This class property returns a shared and cached NSParagraphStyle instance with the default style settings, with
     * same value as the result of [[NSParagraphStyle alloc] init].
     */
    @Generated
    @Selector("defaultParagraphStyle")
    public static native NSParagraphStyle defaultParagraphStyle();

    /**
     * languageName is in ISO lang region format
     */
    @Generated
    @Selector("defaultWritingDirectionForLanguage:")
    @NInt
    public static native long defaultWritingDirectionForLanguage(String languageName);

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
    public static native NSParagraphStyle new_objc();

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

    @Generated
    @Selector("alignment")
    @NInt
    public native long alignment();

    /**
     * Tightens inter-character spacing in attempt to fit lines wider than the available space if the line break mode is
     * one of the truncation modes before starting to truncate. NO by default. The maximum amount of tightening
     * performed is determined by the system based on contexts such as font, line width, etc.
     */
    @Generated
    @Selector("allowsDefaultTighteningForTruncation")
    public native boolean allowsDefaultTighteningForTruncation();

    @Generated
    @Selector("baseWritingDirection")
    @NInt
    public native long baseWritingDirection();

    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(VoidPtr zone);

    /**
     * The default tab interval used for locations beyond the last element in tabStops
     */
    @Generated
    @Selector("defaultTabInterval")
    @NFloat
    public native double defaultTabInterval();

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(NSCoder coder);

    /**
     * Distance from margin to edge appropriate for text direction
     */
    @Generated
    @Selector("firstLineHeadIndent")
    @NFloat
    public native double firstLineHeadIndent();

    /**
     * Distance from margin to front edge of paragraph
     */
    @Generated
    @Selector("headIndent")
    @NFloat
    public native double headIndent();

    /**
     * Specifies the threshold for hyphenation. Valid values lie between 0.0 and 1.0 inclusive. Hyphenation will be
     * attempted when the ratio of the text width as broken without hyphenation to the width of the line fragment is
     * less than the hyphenation factor. When this takes on its default value of 0.0, the layout manager's hyphenation
     * factor is used instead. When both are 0.0, hyphenation is disabled.
     */
    @Generated
    @Selector("hyphenationFactor")
    public native float hyphenationFactor();

    @Generated
    @Selector("init")
    public native NSParagraphStyle init();

    @Generated
    @Selector("initWithCoder:")
    public native NSParagraphStyle initWithCoder(NSCoder coder);

    @Generated
    @Selector("lineBreakMode")
    @NInt
    public native long lineBreakMode();

    /**
     * Natural line height is multiplied by this factor (if positive) before being constrained by minimum and maximum
     * line height.
     */
    @Generated
    @Selector("lineHeightMultiple")
    @NFloat
    public native double lineHeightMultiple();

    /**
     * "Leading": distance between the bottom of one line fragment and top of next (applied between lines in the same
     * container). This value is included in the line fragment heights in layout manager.
     */
    @Generated
    @Selector("lineSpacing")
    @NFloat
    public native double lineSpacing();

    /**
     * 0 implies no maximum.
     */
    @Generated
    @Selector("maximumLineHeight")
    @NFloat
    public native double maximumLineHeight();

    /**
     * Line height is the distance from bottom of descenders to top of ascenders; basically the line fragment height.
     * Does not include lineSpacing (which is added after this computation).
     */
    @Generated
    @Selector("minimumLineHeight")
    @NFloat
    public native double minimumLineHeight();

    @Owned
    @Generated
    @Selector("mutableCopyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object mutableCopyWithZone(VoidPtr zone);

    /**
     * Distance between the bottom of this paragraph and top of next (or the beginning of its paragraphSpacingBefore, if
     * any).
     */
    @Generated
    @Selector("paragraphSpacing")
    @NFloat
    public native double paragraphSpacing();

    /**
     * Distance between the bottom of the previous paragraph (or the end of its paragraphSpacing, if any) and the top of
     * this paragraph.
     */
    @Generated
    @Selector("paragraphSpacingBefore")
    @NFloat
    public native double paragraphSpacingBefore();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    /**
     * An array of NSTextTabs. Contents should be ordered by location. The default value is an array of 12 left-aligned
     * tabs at 28pt interval
     */
    @Generated
    @Selector("tabStops")
    public native NSArray<? extends NSTextTab> tabStops();

    /**
     * Distance from margin to back edge of paragraph; if negative or 0, from other margin
     */
    @Generated
    @Selector("tailIndent")
    @NFloat
    public native double tailIndent();

    /**
     * Specifies the line break strategies that may be used for laying out the paragraph. The default value is
     * NSLineBreakStrategyNone.
     */
    @Generated
    @Selector("lineBreakStrategy")
    @NUInt
    public native long lineBreakStrategy();

    /**
     * A property controlling the hyphenation behavior for the paragraph associated with the paragraph style. The exact
     * hyphenation logic is dynamically determined by the layout context such as language, platform, etc. When YES, it
     * affects the return value from -hyphenationFactor when the property is set to 0.0.
     */
    @Generated
    @Selector("usesDefaultHyphenation")
    public native boolean usesDefaultHyphenation();
}

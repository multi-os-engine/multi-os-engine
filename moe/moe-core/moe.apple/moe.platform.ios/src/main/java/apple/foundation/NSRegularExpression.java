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
import org.moe.natj.general.ptr.BoolPtr;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * API-Since: 4.0
 */
@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSRegularExpression extends NSObject implements NSCopying, NSSecureCoding {
    static {
        NatJ.register();
    }

    @Generated
    protected NSRegularExpression(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSRegularExpression alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native NSRegularExpression allocWithZone(VoidPtr zone);

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

    /**
     * This class method will produce a string by adding backslash escapes as necessary to the given string, to escape
     * any characters that would otherwise be treated as pattern metacharacters.
     */
    @NotNull
    @Generated
    @Selector("escapedPatternForString:")
    public static native String escapedPatternForString(@NotNull String string);

    /**
     * This class method will produce a string by adding backslash escapes as necessary to the given string, to escape
     * any characters that would otherwise be treated as template metacharacters.
     */
    @NotNull
    @Generated
    @Selector("escapedTemplateForString:")
    public static native String escapedTemplateForString(@NotNull String string);

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
    public static native NSRegularExpression new_objc();

    /**
     * An instance of NSRegularExpression is created from a regular expression pattern and a set of options. If the
     * pattern is invalid, nil will be returned and an NSError will be returned by reference. The pattern syntax
     * currently supported is that specified by ICU.
     */
    @Nullable
    @Generated
    @Selector("regularExpressionWithPattern:options:error:")
    public static native NSRegularExpression regularExpressionWithPatternOptionsError(@NotNull String pattern,
            @NUInt long options, @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

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

    @NotNull
    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(@Nullable VoidPtr zone);

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(@NotNull NSCoder coder);

    /**
     * The fundamental matching method on NSRegularExpression is a block iterator. There are several additional
     * convenience methods, for returning all matches at once, the number of matches, the first match, or the range of
     * the first match. Each match is specified by an instance of NSTextCheckingResult (of type
     * NSTextCheckingTypeRegularExpression) in which the overall match range is given by the range property (equivalent
     * to rangeAtIndex:0) and any capture group ranges are given by rangeAtIndex: for indexes from 1 to
     * numberOfCaptureGroups. {NSNotFound, 0} is used if a particular capture group does not participate in the match.
     */
    @Generated
    @Selector("enumerateMatchesInString:options:range:usingBlock:")
    public native void enumerateMatchesInStringOptionsRangeUsingBlock(@NotNull String string, @NUInt long options,
            @ByValue NSRange range,
            @NotNull @ObjCBlock(name = "call_enumerateMatchesInStringOptionsRangeUsingBlock") Block_enumerateMatchesInStringOptionsRangeUsingBlock block);

    @Nullable
    @Generated
    @Selector("firstMatchInString:options:range:")
    public native NSTextCheckingResult firstMatchInStringOptionsRange(@NotNull String string, @NUInt long options,
            @ByValue NSRange range);

    @Generated
    @Selector("init")
    public native NSRegularExpression init();

    @Generated
    @Selector("initWithCoder:")
    public native NSRegularExpression initWithCoder(@NotNull NSCoder coder);

    @Generated
    @Selector("initWithPattern:options:error:")
    public native NSRegularExpression initWithPatternOptionsError(@NotNull String pattern, @NUInt long options,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @NotNull
    @Generated
    @Selector("matchesInString:options:range:")
    public native NSArray<? extends NSTextCheckingResult> matchesInStringOptionsRange(@NotNull String string,
            @NUInt long options, @ByValue NSRange range);

    @Generated
    @Selector("numberOfCaptureGroups")
    @NUInt
    public native long numberOfCaptureGroups();

    @Generated
    @Selector("numberOfMatchesInString:options:range:")
    @NUInt
    public native long numberOfMatchesInStringOptionsRange(@NotNull String string, @NUInt long options,
            @ByValue NSRange range);

    @Generated
    @Selector("options")
    @NUInt
    public native long options();

    @NotNull
    @Generated
    @Selector("pattern")
    public native String pattern();

    @Generated
    @Selector("rangeOfFirstMatchInString:options:range:")
    @ByValue
    public native NSRange rangeOfFirstMatchInStringOptionsRange(@NotNull String string, @NUInt long options,
            @ByValue NSRange range);

    @Generated
    @Selector("replaceMatchesInString:options:range:withTemplate:")
    @NUInt
    public native long replaceMatchesInStringOptionsRangeWithTemplate(@NotNull NSMutableString string,
            @NUInt long options, @ByValue NSRange range, @NotNull String templ);

    /**
     * For clients implementing their own replace functionality, this is a method to perform the template substitution
     * for a single result, given the string from which the result was matched, an offset to be added to the location of
     * the result in the string (for example, in case modifications to the string moved the result since it was
     * matched), and a replacement template.
     */
    @NotNull
    @Generated
    @Selector("replacementStringForResult:inString:offset:template:")
    public native String replacementStringForResultInStringOffsetTemplate(@NotNull NSTextCheckingResult result,
            @NotNull String string, @NInt long offset, @NotNull String templ);

    /**
     * NSRegularExpression also provides find-and-replace methods for both immutable and mutable strings. The
     * replacement is treated as a template, with $0 being replaced by the contents of the matched range, $1 by the
     * contents of the first capture group, and so on. Additional digits beyond the maximum required to represent the
     * number of capture groups will be treated as ordinary characters, as will a $ not followed by digits. Backslash
     * will escape both $ and itself.
     */
    @NotNull
    @Generated
    @Selector("stringByReplacingMatchesInString:options:range:withTemplate:")
    public native String stringByReplacingMatchesInStringOptionsRangeWithTemplate(@NotNull String string,
            @NUInt long options, @ByValue NSRange range, @NotNull String templ);

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_enumerateMatchesInStringOptionsRangeUsingBlock {
        @Generated
        void call_enumerateMatchesInStringOptionsRangeUsingBlock(@Nullable NSTextCheckingResult result,
                @NUInt long flags, @NotNull BoolPtr stop);
    }
}

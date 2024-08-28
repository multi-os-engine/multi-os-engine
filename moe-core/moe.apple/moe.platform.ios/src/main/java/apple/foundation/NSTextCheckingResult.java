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
import org.moe.natj.general.ptr.Ptr;
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
 * API-Since: 4.0
 */
@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSTextCheckingResult extends NSObject implements NSCopying, NSSecureCoding {
    static {
        NatJ.register();
    }

    @Generated
    protected NSTextCheckingResult(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @NotNull
    @Generated
    @Selector("addressCheckingResultWithRange:components:")
    public static native NSTextCheckingResult addressCheckingResultWithRangeComponents(@ByValue NSRange range,
            @NotNull NSDictionary<String, String> components);

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSTextCheckingResult alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native NSTextCheckingResult allocWithZone(VoidPtr zone);

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

    @NotNull
    @Generated
    @Selector("correctionCheckingResultWithRange:replacementString:")
    public static native NSTextCheckingResult correctionCheckingResultWithRangeReplacementString(@ByValue NSRange range,
            @NotNull String replacementString);

    /**
     * API-Since: 7.0
     */
    @NotNull
    @Generated
    @Selector("correctionCheckingResultWithRange:replacementString:alternativeStrings:")
    public static native NSTextCheckingResult correctionCheckingResultWithRangeReplacementStringAlternativeStrings(
            @ByValue NSRange range, @NotNull String replacementString, @NotNull NSArray<String> alternativeStrings);

    @NotNull
    @Generated
    @Selector("dashCheckingResultWithRange:replacementString:")
    public static native NSTextCheckingResult dashCheckingResultWithRangeReplacementString(@ByValue NSRange range,
            @NotNull String replacementString);

    @NotNull
    @Generated
    @Selector("dateCheckingResultWithRange:date:")
    public static native NSTextCheckingResult dateCheckingResultWithRangeDate(@ByValue NSRange range,
            @NotNull NSDate date);

    @NotNull
    @Generated
    @Selector("dateCheckingResultWithRange:date:timeZone:duration:")
    public static native NSTextCheckingResult dateCheckingResultWithRangeDateTimeZoneDuration(@ByValue NSRange range,
            @NotNull NSDate date, @NotNull NSTimeZone timeZone, double duration);

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    @NotNull
    @Generated
    @Selector("grammarCheckingResultWithRange:details:")
    public static native NSTextCheckingResult grammarCheckingResultWithRangeDetails(@ByValue NSRange range,
            @NotNull NSArray<? extends NSDictionary<String, ?>> details);

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

    @NotNull
    @Generated
    @Selector("linkCheckingResultWithRange:URL:")
    public static native NSTextCheckingResult linkCheckingResultWithRangeURL(@ByValue NSRange range,
            @NotNull NSURL url);

    @Generated
    @Owned
    @Selector("new")
    public static native NSTextCheckingResult new_objc();

    /**
     * Methods for creating instances of the various types of results.
     */
    @NotNull
    @Generated
    @Selector("orthographyCheckingResultWithRange:orthography:")
    public static native NSTextCheckingResult orthographyCheckingResultWithRangeOrthography(@ByValue NSRange range,
            @NotNull NSOrthography orthography);

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @Selector("phoneNumberCheckingResultWithRange:phoneNumber:")
    public static native NSTextCheckingResult phoneNumberCheckingResultWithRangePhoneNumber(@ByValue NSRange range,
            @NotNull String phoneNumber);

    @NotNull
    @Generated
    @Selector("quoteCheckingResultWithRange:replacementString:")
    public static native NSTextCheckingResult quoteCheckingResultWithRangeReplacementString(@ByValue NSRange range,
            @NotNull String replacementString);

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @Selector("regularExpressionCheckingResultWithRanges:count:regularExpression:")
    public static native NSTextCheckingResult regularExpressionCheckingResultWithRangesCountRegularExpression(
            @NotNull @ReferenceInfo(type = NSRange.class) Ptr<NSRange> ranges, @NUInt long count,
            @NotNull NSRegularExpression regularExpression);

    @NotNull
    @Generated
    @Selector("replacementCheckingResultWithRange:replacementString:")
    public static native NSTextCheckingResult replacementCheckingResultWithRangeReplacementString(
            @ByValue NSRange range, @NotNull String replacementString);

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @NotNull
    @Generated
    @Selector("spellCheckingResultWithRange:")
    public static native NSTextCheckingResult spellCheckingResultWithRange(@ByValue NSRange range);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @Selector("transitInformationCheckingResultWithRange:components:")
    public static native NSTextCheckingResult transitInformationCheckingResultWithRangeComponents(
            @ByValue NSRange range, @NotNull NSDictionary<String, String> components);

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @Nullable
    @Generated
    @Selector("URL")
    public native NSURL URL();

    /**
     * Deprecated in favor of components
     */
    @Nullable
    @Generated
    @Selector("addressComponents")
    public native NSDictionary<String, String> addressComponents();

    /**
     * API-Since: 7.0
     */
    @Nullable
    @Generated
    @Selector("alternativeStrings")
    public native NSArray<String> alternativeStrings();

    /**
     * API-Since: 4.0
     */
    @Nullable
    @Generated
    @Selector("components")
    public native NSDictionary<String, String> components();

    @NotNull
    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(@Nullable VoidPtr zone);

    @Nullable
    @Generated
    @Selector("date")
    public native NSDate date();

    @Generated
    @Selector("duration")
    public native double duration();

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(@NotNull NSCoder coder);

    @Nullable
    @Generated
    @Selector("grammarDetails")
    public native NSArray<? extends NSDictionary<String, ?>> grammarDetails();

    @Generated
    @Selector("init")
    public native NSTextCheckingResult init();

    @Generated
    @Selector("initWithCoder:")
    public native NSTextCheckingResult initWithCoder(@NotNull NSCoder coder);

    /**
     * A result must have at least one range, but may optionally have more (for example, to represent regular expression
     * capture groups). The range at index 0 always matches the range property. Additional ranges, if any, will have
     * indexes from 1 to numberOfRanges-1. rangeWithName: can be used with named regular expression capture groups.
     * 
     * API-Since: 4.0
     */
    @Generated
    @Selector("numberOfRanges")
    @NUInt
    public native long numberOfRanges();

    /**
     * Optional properties, used with certain types of results.
     */
    @Nullable
    @Generated
    @Selector("orthography")
    public native NSOrthography orthography();

    /**
     * API-Since: 4.0
     */
    @Nullable
    @Generated
    @Selector("phoneNumber")
    public native String phoneNumber();

    @Generated
    @Selector("range")
    @ByValue
    public native NSRange range();

    /**
     * API-Since: 4.0
     */
    @Generated
    @Selector("rangeAtIndex:")
    @ByValue
    public native NSRange rangeAtIndex(@NUInt long idx);

    /**
     * API-Since: 4.0
     */
    @Nullable
    @Generated
    @Selector("regularExpression")
    public native NSRegularExpression regularExpression();

    @Nullable
    @Generated
    @Selector("replacementString")
    public native String replacementString();

    /**
     * API-Since: 5.0
     */
    @NotNull
    @Generated
    @Selector("resultByAdjustingRangesWithOffset:")
    public native NSTextCheckingResult resultByAdjustingRangesWithOffset(@NInt long offset);

    /**
     * Mandatory properties, used with all types of results.
     */
    @Generated
    @Selector("resultType")
    public native long resultType();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    @Nullable
    @Generated
    @Selector("timeZone")
    public native NSTimeZone timeZone();

    /**
     * API-Since: 11.0
     */
    @Generated
    @Selector("rangeWithName:")
    @ByValue
    public native NSRange rangeWithName(@NotNull String name);

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}

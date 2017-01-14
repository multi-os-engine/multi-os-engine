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

    @Generated
    @Selector("addressCheckingResultWithRange:components:")
    public static native NSTextCheckingResult addressCheckingResultWithRangeComponents(@ByValue NSRange range,
            NSDictionary<String, String> components);

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSTextCheckingResult alloc();

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
    @Selector("correctionCheckingResultWithRange:replacementString:")
    public static native NSTextCheckingResult correctionCheckingResultWithRangeReplacementString(@ByValue NSRange range,
            String replacementString);

    @Generated
    @Selector("correctionCheckingResultWithRange:replacementString:alternativeStrings:")
    public static native NSTextCheckingResult correctionCheckingResultWithRangeReplacementStringAlternativeStrings(
            @ByValue NSRange range, String replacementString, NSArray<String> alternativeStrings);

    @Generated
    @Selector("dashCheckingResultWithRange:replacementString:")
    public static native NSTextCheckingResult dashCheckingResultWithRangeReplacementString(@ByValue NSRange range,
            String replacementString);

    @Generated
    @Selector("dateCheckingResultWithRange:date:")
    public static native NSTextCheckingResult dateCheckingResultWithRangeDate(@ByValue NSRange range, NSDate date);

    @Generated
    @Selector("dateCheckingResultWithRange:date:timeZone:duration:")
    public static native NSTextCheckingResult dateCheckingResultWithRangeDateTimeZoneDuration(@ByValue NSRange range,
            NSDate date, NSTimeZone timeZone, double duration);

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("grammarCheckingResultWithRange:details:")
    public static native NSTextCheckingResult grammarCheckingResultWithRangeDetails(@ByValue NSRange range,
            NSArray<? extends NSDictionary<String, ?>> details);

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
    @Selector("linkCheckingResultWithRange:URL:")
    public static native NSTextCheckingResult linkCheckingResultWithRangeURL(@ByValue NSRange range, NSURL url);

    @Generated
    @Owned
    @Selector("new")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object new_objc();

    @Generated
    @Selector("orthographyCheckingResultWithRange:orthography:")
    public static native NSTextCheckingResult orthographyCheckingResultWithRangeOrthography(@ByValue NSRange range,
            NSOrthography orthography);

    @Generated
    @Selector("phoneNumberCheckingResultWithRange:phoneNumber:")
    public static native NSTextCheckingResult phoneNumberCheckingResultWithRangePhoneNumber(@ByValue NSRange range,
            String phoneNumber);

    @Generated
    @Selector("quoteCheckingResultWithRange:replacementString:")
    public static native NSTextCheckingResult quoteCheckingResultWithRangeReplacementString(@ByValue NSRange range,
            String replacementString);

    @Generated
    @Selector("regularExpressionCheckingResultWithRanges:count:regularExpression:")
    public static native NSTextCheckingResult regularExpressionCheckingResultWithRangesCountRegularExpression(
            @ReferenceInfo(type = NSRange.class) Ptr<NSRange> ranges, @NUInt long count,
            NSRegularExpression regularExpression);

    @Generated
    @Selector("replacementCheckingResultWithRange:replacementString:")
    public static native NSTextCheckingResult replacementCheckingResultWithRangeReplacementString(
            @ByValue NSRange range, String replacementString);

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
    @Selector("spellCheckingResultWithRange:")
    public static native NSTextCheckingResult spellCheckingResultWithRange(@ByValue NSRange range);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

    @Generated
    @Selector("transitInformationCheckingResultWithRange:components:")
    public static native NSTextCheckingResult transitInformationCheckingResultWithRangeComponents(
            @ByValue NSRange range, NSDictionary<String, String> components);

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @Generated
    @Selector("URL")
    public native NSURL URL();

    @Generated
    @Selector("addressComponents")
    public native NSDictionary<String, String> addressComponents();

    @Generated
    @Selector("alternativeStrings")
    public native NSArray<String> alternativeStrings();

    @Generated
    @Selector("components")
    public native NSDictionary<String, String> components();

    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(VoidPtr zone);

    @Generated
    @Selector("date")
    public native NSDate date();

    @Generated
    @Selector("duration")
    public native double duration();

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(NSCoder aCoder);

    @Generated
    @Selector("grammarDetails")
    public native NSArray<? extends NSDictionary<String, ?>> grammarDetails();

    @Generated
    @Selector("init")
    public native NSTextCheckingResult init();

    @Generated
    @Selector("initWithCoder:")
    public native NSTextCheckingResult initWithCoder(NSCoder aDecoder);

    @Generated
    @Selector("numberOfRanges")
    @NUInt
    public native long numberOfRanges();

    @Generated
    @Selector("orthography")
    public native NSOrthography orthography();

    @Generated
    @Selector("phoneNumber")
    public native String phoneNumber();

    @Generated
    @Selector("range")
    @ByValue
    public native NSRange range();

    @Generated
    @Selector("rangeAtIndex:")
    @ByValue
    public native NSRange rangeAtIndex(@NUInt long idx);

    @Generated
    @Selector("regularExpression")
    public native NSRegularExpression regularExpression();

    @Generated
    @Selector("replacementString")
    public native String replacementString();

    @Generated
    @Selector("resultByAdjustingRangesWithOffset:")
    public native NSTextCheckingResult resultByAdjustingRangesWithOffset(@NInt long offset);

    @Generated
    @Selector("resultType")
    public native long resultType();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    @Generated
    @Selector("timeZone")
    public native NSTimeZone timeZone();
}

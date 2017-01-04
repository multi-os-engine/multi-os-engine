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
import org.moe.natj.objc.ObjCObject;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSNumberFormatter extends NSFormatter {
    static {
        NatJ.register();
    }

    @Generated
    protected NSNumberFormatter(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSNumberFormatter alloc();

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
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("defaultFormatterBehavior")
    @NUInt
    public static native long defaultFormatterBehavior();

    @Generated
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("initialize")
    public static native void initialize();

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
    @Selector("load")
    public static native void load_objc_static();

    @Generated
    @Selector("localizedStringFromNumber:numberStyle:")
    public static native String localizedStringFromNumberNumberStyle(NSNumber num, @NUInt long nstyle);

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
    @Selector("setDefaultFormatterBehavior:")
    public static native void setDefaultFormatterBehavior(@NUInt long behavior);

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

    @Generated
    @Selector("allowsFloats")
    public native boolean allowsFloats();

    @Generated
    @Selector("alwaysShowsDecimalSeparator")
    public native boolean alwaysShowsDecimalSeparator();

    @Generated
    @Selector("currencyCode")
    public native String currencyCode();

    @Generated
    @Selector("currencyDecimalSeparator")
    public native String currencyDecimalSeparator();

    @Generated
    @Selector("currencyGroupingSeparator")
    public native String currencyGroupingSeparator();

    @Generated
    @Selector("currencySymbol")
    public native String currencySymbol();

    @Generated
    @Selector("decimalSeparator")
    public native String decimalSeparator();

    @Generated
    @Selector("exponentSymbol")
    public native String exponentSymbol();

    @Generated
    @Selector("formatWidth")
    @NUInt
    public native long formatWidth();

    @Generated
    @Selector("formatterBehavior")
    @NUInt
    public native long formatterBehavior();

    @Generated
    @Selector("formattingContext")
    @NInt
    public native long formattingContext();

    @Generated
    @Selector("generatesDecimalNumbers")
    public native boolean generatesDecimalNumbers();

    @Generated
    @Selector("getObjectValue:forString:range:error:")
    public native boolean getObjectValueForStringRangeError(@ReferenceInfo(type = ObjCObject.class) Ptr<ObjCObject> obj,
            String string, NSRange rangep, @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Selector("groupingSeparator")
    public native String groupingSeparator();

    @Generated
    @Selector("groupingSize")
    @NUInt
    public native long groupingSize();

    @Generated
    @Selector("init")
    public native NSNumberFormatter init();

    @Generated
    @Selector("initWithCoder:")
    public native NSNumberFormatter initWithCoder(NSCoder aDecoder);

    @Generated
    @Selector("internationalCurrencySymbol")
    public native String internationalCurrencySymbol();

    @Generated
    @Selector("isLenient")
    public native boolean isLenient();

    @Generated
    @Selector("setLenient:")
    public native void setLenient(boolean value);

    @Generated
    @Selector("isPartialStringValidationEnabled")
    public native boolean isPartialStringValidationEnabled();

    @Generated
    @Selector("setPartialStringValidationEnabled:")
    public native void setPartialStringValidationEnabled(boolean value);

    @Generated
    @Selector("locale")
    public native NSLocale locale();

    @Generated
    @Selector("maximum")
    public native NSNumber maximum();

    @Generated
    @Selector("maximumFractionDigits")
    @NUInt
    public native long maximumFractionDigits();

    @Generated
    @Selector("maximumIntegerDigits")
    @NUInt
    public native long maximumIntegerDigits();

    @Generated
    @Selector("maximumSignificantDigits")
    @NUInt
    public native long maximumSignificantDigits();

    @Generated
    @Selector("minimum")
    public native NSNumber minimum();

    @Generated
    @Selector("minimumFractionDigits")
    @NUInt
    public native long minimumFractionDigits();

    @Generated
    @Selector("minimumIntegerDigits")
    @NUInt
    public native long minimumIntegerDigits();

    @Generated
    @Selector("minimumSignificantDigits")
    @NUInt
    public native long minimumSignificantDigits();

    @Generated
    @Selector("minusSign")
    public native String minusSign();

    @Generated
    @Selector("multiplier")
    public native NSNumber multiplier();

    @Generated
    @Selector("negativeFormat")
    public native String negativeFormat();

    @Generated
    @Selector("negativeInfinitySymbol")
    public native String negativeInfinitySymbol();

    @Generated
    @Selector("negativePrefix")
    public native String negativePrefix();

    @Generated
    @Selector("negativeSuffix")
    public native String negativeSuffix();

    @Generated
    @Selector("nilSymbol")
    public native String nilSymbol();

    @Generated
    @Selector("notANumberSymbol")
    public native String notANumberSymbol();

    @Generated
    @Selector("numberFromString:")
    public native NSNumber numberFromString(String string);

    @Generated
    @Selector("numberStyle")
    @NUInt
    public native long numberStyle();

    @Generated
    @Selector("paddingCharacter")
    public native String paddingCharacter();

    @Generated
    @Selector("paddingPosition")
    @NUInt
    public native long paddingPosition();

    @Generated
    @Selector("perMillSymbol")
    public native String perMillSymbol();

    @Generated
    @Selector("percentSymbol")
    public native String percentSymbol();

    @Generated
    @Selector("plusSign")
    public native String plusSign();

    @Generated
    @Selector("positiveFormat")
    public native String positiveFormat();

    @Generated
    @Selector("positiveInfinitySymbol")
    public native String positiveInfinitySymbol();

    @Generated
    @Selector("positivePrefix")
    public native String positivePrefix();

    @Generated
    @Selector("positiveSuffix")
    public native String positiveSuffix();

    @Generated
    @Selector("roundingIncrement")
    public native NSNumber roundingIncrement();

    @Generated
    @Selector("roundingMode")
    @NUInt
    public native long roundingMode();

    @Generated
    @Selector("secondaryGroupingSize")
    @NUInt
    public native long secondaryGroupingSize();

    @Generated
    @Selector("setAllowsFloats:")
    public native void setAllowsFloats(boolean value);

    @Generated
    @Selector("setAlwaysShowsDecimalSeparator:")
    public native void setAlwaysShowsDecimalSeparator(boolean value);

    @Generated
    @Selector("setCurrencyCode:")
    public native void setCurrencyCode(String value);

    @Generated
    @Selector("setCurrencyDecimalSeparator:")
    public native void setCurrencyDecimalSeparator(String value);

    @Generated
    @Selector("setCurrencyGroupingSeparator:")
    public native void setCurrencyGroupingSeparator(String value);

    @Generated
    @Selector("setCurrencySymbol:")
    public native void setCurrencySymbol(String value);

    @Generated
    @Selector("setDecimalSeparator:")
    public native void setDecimalSeparator(String value);

    @Generated
    @Selector("setExponentSymbol:")
    public native void setExponentSymbol(String value);

    @Generated
    @Selector("setFormatWidth:")
    public native void setFormatWidth(@NUInt long value);

    @Generated
    @Selector("setFormatterBehavior:")
    public native void setFormatterBehavior(@NUInt long value);

    @Generated
    @Selector("setFormattingContext:")
    public native void setFormattingContext(@NInt long value);

    @Generated
    @Selector("setGeneratesDecimalNumbers:")
    public native void setGeneratesDecimalNumbers(boolean value);

    @Generated
    @Selector("setGroupingSeparator:")
    public native void setGroupingSeparator(String value);

    @Generated
    @Selector("setGroupingSize:")
    public native void setGroupingSize(@NUInt long value);

    @Generated
    @Selector("setInternationalCurrencySymbol:")
    public native void setInternationalCurrencySymbol(String value);

    @Generated
    @Selector("setLocale:")
    public native void setLocale(NSLocale value);

    @Generated
    @Selector("setMaximum:")
    public native void setMaximum(NSNumber value);

    @Generated
    @Selector("setMaximumFractionDigits:")
    public native void setMaximumFractionDigits(@NUInt long value);

    @Generated
    @Selector("setMaximumIntegerDigits:")
    public native void setMaximumIntegerDigits(@NUInt long value);

    @Generated
    @Selector("setMaximumSignificantDigits:")
    public native void setMaximumSignificantDigits(@NUInt long value);

    @Generated
    @Selector("setMinimum:")
    public native void setMinimum(NSNumber value);

    @Generated
    @Selector("setMinimumFractionDigits:")
    public native void setMinimumFractionDigits(@NUInt long value);

    @Generated
    @Selector("setMinimumIntegerDigits:")
    public native void setMinimumIntegerDigits(@NUInt long value);

    @Generated
    @Selector("setMinimumSignificantDigits:")
    public native void setMinimumSignificantDigits(@NUInt long value);

    @Generated
    @Selector("setMinusSign:")
    public native void setMinusSign(String value);

    @Generated
    @Selector("setMultiplier:")
    public native void setMultiplier(NSNumber value);

    @Generated
    @Selector("setNegativeFormat:")
    public native void setNegativeFormat(String value);

    @Generated
    @Selector("setNegativeInfinitySymbol:")
    public native void setNegativeInfinitySymbol(String value);

    @Generated
    @Selector("setNegativePrefix:")
    public native void setNegativePrefix(String value);

    @Generated
    @Selector("setNegativeSuffix:")
    public native void setNegativeSuffix(String value);

    @Generated
    @Selector("setNilSymbol:")
    public native void setNilSymbol(String value);

    @Generated
    @Selector("setNotANumberSymbol:")
    public native void setNotANumberSymbol(String value);

    @Generated
    @Selector("setNumberStyle:")
    public native void setNumberStyle(@NUInt long value);

    @Generated
    @Selector("setPaddingCharacter:")
    public native void setPaddingCharacter(String value);

    @Generated
    @Selector("setPaddingPosition:")
    public native void setPaddingPosition(@NUInt long value);

    @Generated
    @Selector("setPerMillSymbol:")
    public native void setPerMillSymbol(String value);

    @Generated
    @Selector("setPercentSymbol:")
    public native void setPercentSymbol(String value);

    @Generated
    @Selector("setPlusSign:")
    public native void setPlusSign(String value);

    @Generated
    @Selector("setPositiveFormat:")
    public native void setPositiveFormat(String value);

    @Generated
    @Selector("setPositiveInfinitySymbol:")
    public native void setPositiveInfinitySymbol(String value);

    @Generated
    @Selector("setPositivePrefix:")
    public native void setPositivePrefix(String value);

    @Generated
    @Selector("setPositiveSuffix:")
    public native void setPositiveSuffix(String value);

    @Generated
    @Selector("setRoundingIncrement:")
    public native void setRoundingIncrement(NSNumber value);

    @Generated
    @Selector("setRoundingMode:")
    public native void setRoundingMode(@NUInt long value);

    @Generated
    @Selector("setSecondaryGroupingSize:")
    public native void setSecondaryGroupingSize(@NUInt long value);

    @Generated
    @Selector("setTextAttributesForNegativeInfinity:")
    public native void setTextAttributesForNegativeInfinity(NSDictionary<String, ?> value);

    @Generated
    @Selector("setTextAttributesForNegativeValues:")
    public native void setTextAttributesForNegativeValues(NSDictionary<String, ?> value);

    @Generated
    @Selector("setTextAttributesForNil:")
    public native void setTextAttributesForNil(NSDictionary<String, ?> value);

    @Generated
    @Selector("setTextAttributesForNotANumber:")
    public native void setTextAttributesForNotANumber(NSDictionary<String, ?> value);

    @Generated
    @Selector("setTextAttributesForPositiveInfinity:")
    public native void setTextAttributesForPositiveInfinity(NSDictionary<String, ?> value);

    @Generated
    @Selector("setTextAttributesForPositiveValues:")
    public native void setTextAttributesForPositiveValues(NSDictionary<String, ?> value);

    @Generated
    @Selector("setTextAttributesForZero:")
    public native void setTextAttributesForZero(NSDictionary<String, ?> value);

    @Generated
    @Selector("setUsesGroupingSeparator:")
    public native void setUsesGroupingSeparator(boolean value);

    @Generated
    @Selector("setUsesSignificantDigits:")
    public native void setUsesSignificantDigits(boolean value);

    @Generated
    @Selector("setZeroSymbol:")
    public native void setZeroSymbol(String value);

    @Generated
    @Selector("stringFromNumber:")
    public native String stringFromNumber(NSNumber number);

    @Generated
    @Selector("textAttributesForNegativeInfinity")
    public native NSDictionary<String, ?> textAttributesForNegativeInfinity();

    @Generated
    @Selector("textAttributesForNegativeValues")
    public native NSDictionary<String, ?> textAttributesForNegativeValues();

    @Generated
    @Selector("textAttributesForNil")
    public native NSDictionary<String, ?> textAttributesForNil();

    @Generated
    @Selector("textAttributesForNotANumber")
    public native NSDictionary<String, ?> textAttributesForNotANumber();

    @Generated
    @Selector("textAttributesForPositiveInfinity")
    public native NSDictionary<String, ?> textAttributesForPositiveInfinity();

    @Generated
    @Selector("textAttributesForPositiveValues")
    public native NSDictionary<String, ?> textAttributesForPositiveValues();

    @Generated
    @Selector("textAttributesForZero")
    public native NSDictionary<String, ?> textAttributesForZero();

    @Generated
    @Selector("usesGroupingSeparator")
    public native boolean usesGroupingSeparator();

    @Generated
    @Selector("usesSignificantDigits")
    public native boolean usesSignificantDigits();

    @Generated
    @Selector("zeroSymbol")
    public native String zeroSymbol();
}

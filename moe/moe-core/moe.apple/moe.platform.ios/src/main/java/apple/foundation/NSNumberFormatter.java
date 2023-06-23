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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

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

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native NSNumberFormatter allocWithZone(VoidPtr zone);

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

    /**
     * Attributes of an NSNumberFormatter
     */
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

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @Selector("localizedStringFromNumber:numberStyle:")
    public static native String localizedStringFromNumberNumberStyle(@NotNull NSNumber num, @NUInt long nstyle);

    @Generated
    @Owned
    @Selector("new")
    public static native NSNumberFormatter new_objc();

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

    /**
     * API-Since: 2.0
     */
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

    /**
     * default is NSFormattingContextUnknown
     * 
     * API-Since: 8.0
     */
    @Generated
    @Selector("formattingContext")
    @NInt
    public native long formattingContext();

    @Generated
    @Selector("generatesDecimalNumbers")
    public native boolean generatesDecimalNumbers();

    /**
     * Report the used range of the string and an NSError, in addition to the usual stuff from NSFormatter
     */
    @Generated
    @Selector("getObjectValue:forString:range:error:")
    public native boolean getObjectValueForStringRangeError(
            @Nullable @ReferenceInfo(type = ObjCObject.class) Ptr<ObjCObject> obj, @NotNull String string,
            @Nullable NSRange rangep, @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

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
    public native NSNumberFormatter initWithCoder(@NotNull NSCoder coder);

    @Generated
    @Selector("internationalCurrencySymbol")
    public native String internationalCurrencySymbol();

    /**
     * API-Since: 2.0
     */
    @Generated
    @Selector("isLenient")
    public native boolean isLenient();

    /**
     * API-Since: 2.0
     */
    @Generated
    @Selector("setLenient:")
    public native void setLenient(boolean value);

    /**
     * API-Since: 2.0
     */
    @Generated
    @Selector("isPartialStringValidationEnabled")
    public native boolean isPartialStringValidationEnabled();

    /**
     * API-Since: 2.0
     */
    @Generated
    @Selector("setPartialStringValidationEnabled:")
    public native void setPartialStringValidationEnabled(boolean value);

    @Generated
    @Selector("locale")
    public native NSLocale locale();

    @Nullable
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

    /**
     * API-Since: 2.0
     */
    @Generated
    @Selector("maximumSignificantDigits")
    @NUInt
    public native long maximumSignificantDigits();

    @Nullable
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

    /**
     * API-Since: 2.0
     */
    @Generated
    @Selector("minimumSignificantDigits")
    @NUInt
    public native long minimumSignificantDigits();

    @Generated
    @Selector("minusSign")
    public native String minusSign();

    @Nullable
    @Generated
    @Selector("multiplier")
    public native NSNumber multiplier();

    @Generated
    @Selector("negativeFormat")
    public native String negativeFormat();

    @NotNull
    @Generated
    @Selector("negativeInfinitySymbol")
    public native String negativeInfinitySymbol();

    @Generated
    @Selector("negativePrefix")
    public native String negativePrefix();

    @Generated
    @Selector("negativeSuffix")
    public native String negativeSuffix();

    @NotNull
    @Generated
    @Selector("nilSymbol")
    public native String nilSymbol();

    @Generated
    @Selector("notANumberSymbol")
    public native String notANumberSymbol();

    @Nullable
    @Generated
    @Selector("numberFromString:")
    public native NSNumber numberFromString(@NotNull String string);

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

    @NotNull
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

    /**
     * API-Since: 2.0
     */
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

    /**
     * default is NSFormattingContextUnknown
     * 
     * API-Since: 8.0
     */
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
    public native void setMaximum(@Nullable NSNumber value);

    @Generated
    @Selector("setMaximumFractionDigits:")
    public native void setMaximumFractionDigits(@NUInt long value);

    @Generated
    @Selector("setMaximumIntegerDigits:")
    public native void setMaximumIntegerDigits(@NUInt long value);

    /**
     * API-Since: 2.0
     */
    @Generated
    @Selector("setMaximumSignificantDigits:")
    public native void setMaximumSignificantDigits(@NUInt long value);

    @Generated
    @Selector("setMinimum:")
    public native void setMinimum(@Nullable NSNumber value);

    @Generated
    @Selector("setMinimumFractionDigits:")
    public native void setMinimumFractionDigits(@NUInt long value);

    @Generated
    @Selector("setMinimumIntegerDigits:")
    public native void setMinimumIntegerDigits(@NUInt long value);

    /**
     * API-Since: 2.0
     */
    @Generated
    @Selector("setMinimumSignificantDigits:")
    public native void setMinimumSignificantDigits(@NUInt long value);

    @Generated
    @Selector("setMinusSign:")
    public native void setMinusSign(String value);

    @Generated
    @Selector("setMultiplier:")
    public native void setMultiplier(@Nullable NSNumber value);

    @Generated
    @Selector("setNegativeFormat:")
    public native void setNegativeFormat(String value);

    @Generated
    @Selector("setNegativeInfinitySymbol:")
    public native void setNegativeInfinitySymbol(@NotNull String value);

    @Generated
    @Selector("setNegativePrefix:")
    public native void setNegativePrefix(String value);

    @Generated
    @Selector("setNegativeSuffix:")
    public native void setNegativeSuffix(String value);

    @Generated
    @Selector("setNilSymbol:")
    public native void setNilSymbol(@NotNull String value);

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
    public native void setPositiveInfinitySymbol(@NotNull String value);

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
    public native void setTextAttributesForNegativeInfinity(@Nullable NSDictionary<String, ?> value);

    @Generated
    @Selector("setTextAttributesForNegativeValues:")
    public native void setTextAttributesForNegativeValues(@Nullable NSDictionary<String, ?> value);

    @Generated
    @Selector("setTextAttributesForNil:")
    public native void setTextAttributesForNil(@Nullable NSDictionary<String, ?> value);

    @Generated
    @Selector("setTextAttributesForNotANumber:")
    public native void setTextAttributesForNotANumber(@Nullable NSDictionary<String, ?> value);

    @Generated
    @Selector("setTextAttributesForPositiveInfinity:")
    public native void setTextAttributesForPositiveInfinity(@Nullable NSDictionary<String, ?> value);

    @Generated
    @Selector("setTextAttributesForPositiveValues:")
    public native void setTextAttributesForPositiveValues(@Nullable NSDictionary<String, ?> value);

    @Generated
    @Selector("setTextAttributesForZero:")
    public native void setTextAttributesForZero(@Nullable NSDictionary<String, ?> value);

    @Generated
    @Selector("setUsesGroupingSeparator:")
    public native void setUsesGroupingSeparator(boolean value);

    /**
     * API-Since: 2.0
     */
    @Generated
    @Selector("setUsesSignificantDigits:")
    public native void setUsesSignificantDigits(boolean value);

    @Generated
    @Selector("setZeroSymbol:")
    public native void setZeroSymbol(@Nullable String value);

    /**
     * Even though NSNumberFormatter responds to the usual NSFormatter methods,
     * here are some convenience methods which are a little more obvious.
     */
    @Nullable
    @Generated
    @Selector("stringFromNumber:")
    public native String stringFromNumber(@NotNull NSNumber number);

    @Nullable
    @Generated
    @Selector("textAttributesForNegativeInfinity")
    public native NSDictionary<String, ?> textAttributesForNegativeInfinity();

    @Nullable
    @Generated
    @Selector("textAttributesForNegativeValues")
    public native NSDictionary<String, ?> textAttributesForNegativeValues();

    @Nullable
    @Generated
    @Selector("textAttributesForNil")
    public native NSDictionary<String, ?> textAttributesForNil();

    @Nullable
    @Generated
    @Selector("textAttributesForNotANumber")
    public native NSDictionary<String, ?> textAttributesForNotANumber();

    @Nullable
    @Generated
    @Selector("textAttributesForPositiveInfinity")
    public native NSDictionary<String, ?> textAttributesForPositiveInfinity();

    @Nullable
    @Generated
    @Selector("textAttributesForPositiveValues")
    public native NSDictionary<String, ?> textAttributesForPositiveValues();

    @Nullable
    @Generated
    @Selector("textAttributesForZero")
    public native NSDictionary<String, ?> textAttributesForZero();

    @Generated
    @Selector("usesGroupingSeparator")
    public native boolean usesGroupingSeparator();

    /**
     * API-Since: 2.0
     */
    @Generated
    @Selector("usesSignificantDigits")
    public native boolean usesSignificantDigits();

    @Nullable
    @Generated
    @Selector("zeroSymbol")
    public native String zeroSymbol();
}

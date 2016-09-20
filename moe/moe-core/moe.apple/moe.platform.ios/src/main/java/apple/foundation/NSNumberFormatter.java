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
    @Owned
    @Selector("alloc")
    public static native NSNumberFormatter alloc();

    /**
     * defaultFormatterBehavior</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSNumberFormatter_Class/index.html#//apple_ref/occ/clm/NSNumberFormatter/defaultFormatterBehavior">iOS Dev Center</a>
     */
    @Generated
    @Selector("defaultFormatterBehavior")
    @NUInt
    public static native long defaultFormatterBehavior();

    /**
     * localizedStringFromNumber:numberStyle:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSNumberFormatter_Class/index.html#//apple_ref/occ/clm/NSNumberFormatter/localizedStringFromNumber:numberStyle:">iOS Dev Center</a>
     */
    @Generated
    @Selector("localizedStringFromNumber:numberStyle:")
    public static native String localizedStringFromNumberNumberStyle(NSNumber num, @NUInt long nstyle);

    /**
     * setDefaultFormatterBehavior:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSNumberFormatter_Class/index.html#//apple_ref/occ/clm/NSNumberFormatter/setDefaultFormatterBehavior:">iOS Dev Center</a>
     */
    @Generated
    @Selector("setDefaultFormatterBehavior:")
    public static native void setDefaultFormatterBehavior(@NUInt long behavior);

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

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
    public static native void setVersion(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * allowsFloats</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSNumberFormatter_Class/index.html#//apple_ref/occ/instp/NSNumberFormatter/allowsFloats">iOS Dev Center</a>
     */
    @Generated
    @Selector("allowsFloats")
    public native boolean allowsFloats();

    /**
     * alwaysShowsDecimalSeparator</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSNumberFormatter_Class/index.html#//apple_ref/occ/instp/NSNumberFormatter/alwaysShowsDecimalSeparator">iOS Dev Center</a>
     */
    @Generated
    @Selector("alwaysShowsDecimalSeparator")
    public native boolean alwaysShowsDecimalSeparator();

    /**
     * currencyCode</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSNumberFormatter_Class/index.html#//apple_ref/occ/instp/NSNumberFormatter/currencyCode">iOS Dev Center</a>
     */
    @Generated
    @Selector("currencyCode")
    public native String currencyCode();

    /**
     * currencyDecimalSeparator</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSNumberFormatter_Class/index.html#//apple_ref/occ/instp/NSNumberFormatter/currencyDecimalSeparator">iOS Dev Center</a>
     */
    @Generated
    @Selector("currencyDecimalSeparator")
    public native String currencyDecimalSeparator();

    /**
     * currencyGroupingSeparator</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSNumberFormatter_Class/index.html#//apple_ref/occ/instp/NSNumberFormatter/currencyGroupingSeparator">iOS Dev Center</a>
     */
    @Generated
    @Selector("currencyGroupingSeparator")
    public native String currencyGroupingSeparator();

    /**
     * currencySymbol</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSNumberFormatter_Class/index.html#//apple_ref/occ/instp/NSNumberFormatter/currencySymbol">iOS Dev Center</a>
     */
    @Generated
    @Selector("currencySymbol")
    public native String currencySymbol();

    /**
     * decimalSeparator</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSNumberFormatter_Class/index.html#//apple_ref/occ/instp/NSNumberFormatter/decimalSeparator">iOS Dev Center</a>
     */
    @Generated
    @Selector("decimalSeparator")
    public native String decimalSeparator();

    /**
     * exponentSymbol</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSNumberFormatter_Class/index.html#//apple_ref/occ/instp/NSNumberFormatter/exponentSymbol">iOS Dev Center</a>
     */
    @Generated
    @Selector("exponentSymbol")
    public native String exponentSymbol();

    /**
     * formatWidth</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSNumberFormatter_Class/index.html#//apple_ref/occ/instp/NSNumberFormatter/formatWidth">iOS Dev Center</a>
     */
    @Generated
    @Selector("formatWidth")
    @NUInt
    public native long formatWidth();

    /**
     * formatterBehavior</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSNumberFormatter_Class/index.html#//apple_ref/occ/instp/NSNumberFormatter/formatterBehavior">iOS Dev Center</a>
     */
    @Generated
    @Selector("formatterBehavior")
    @NUInt
    public native long formatterBehavior();

    /**
     * formattingContext</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSNumberFormatter_Class/index.html#//apple_ref/occ/instp/NSNumberFormatter/formattingContext">iOS Dev Center</a>
     */
    @Generated
    @Selector("formattingContext")
    @NInt
    public native long formattingContext();

    /**
     * generatesDecimalNumbers</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSNumberFormatter_Class/index.html#//apple_ref/occ/instp/NSNumberFormatter/generatesDecimalNumbers">iOS Dev Center</a>
     */
    @Generated
    @Selector("generatesDecimalNumbers")
    public native boolean generatesDecimalNumbers();

    /**
     * getObjectValue:forString:range:error:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSNumberFormatter_Class/index.html#//apple_ref/occ/instm/NSNumberFormatter/getObjectValue:forString:range:error:">iOS Dev Center</a>
     */
    @Generated
    @Selector("getObjectValue:forString:range:error:")
    public native boolean getObjectValueForStringRangeError(Ptr<ObjCObject> obj, String string, NSRange rangep,
            Ptr<NSError> error);

    /**
     * groupingSeparator</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSNumberFormatter_Class/index.html#//apple_ref/occ/instp/NSNumberFormatter/groupingSeparator">iOS Dev Center</a>
     */
    @Generated
    @Selector("groupingSeparator")
    public native String groupingSeparator();

    /**
     * groupingSize</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSNumberFormatter_Class/index.html#//apple_ref/occ/instp/NSNumberFormatter/groupingSize">iOS Dev Center</a>
     */
    @Generated
    @Selector("groupingSize")
    @NUInt
    public native long groupingSize();

    @Generated
    @Selector("init")
    public native NSNumberFormatter init();

    /**
     * internationalCurrencySymbol</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSNumberFormatter_Class/index.html#//apple_ref/occ/instp/NSNumberFormatter/internationalCurrencySymbol">iOS Dev Center</a>
     */
    @Generated
    @Selector("internationalCurrencySymbol")
    public native String internationalCurrencySymbol();

    /**
     * lenient</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSNumberFormatter_Class/index.html#//apple_ref/occ/instp/NSNumberFormatter/lenient">iOS Dev Center</a>
     */
    @Generated
    @Selector("isLenient")
    public native boolean isLenient();

    /**
     * lenient</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSNumberFormatter_Class/index.html#//apple_ref/occ/instp/NSNumberFormatter/lenient">iOS Dev Center</a>
     */
    @Generated
    @Selector("setLenient:")
    public native void setLenient(boolean value);

    /**
     * partialStringValidationEnabled</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSNumberFormatter_Class/index.html#//apple_ref/occ/instp/NSNumberFormatter/partialStringValidationEnabled">iOS Dev Center</a>
     */
    @Generated
    @Selector("isPartialStringValidationEnabled")
    public native boolean isPartialStringValidationEnabled();

    /**
     * partialStringValidationEnabled</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSNumberFormatter_Class/index.html#//apple_ref/occ/instp/NSNumberFormatter/partialStringValidationEnabled">iOS Dev Center</a>
     */
    @Generated
    @Selector("setPartialStringValidationEnabled:")
    public native void setPartialStringValidationEnabled(boolean value);

    /**
     * locale</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSNumberFormatter_Class/index.html#//apple_ref/occ/instp/NSNumberFormatter/locale">iOS Dev Center</a>
     */
    @Generated
    @Selector("locale")
    public native NSLocale locale();

    /**
     * maximum</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSNumberFormatter_Class/index.html#//apple_ref/occ/instp/NSNumberFormatter/maximum">iOS Dev Center</a>
     */
    @Generated
    @Selector("maximum")
    public native NSNumber maximum();

    /**
     * maximumFractionDigits</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSNumberFormatter_Class/index.html#//apple_ref/occ/instp/NSNumberFormatter/maximumFractionDigits">iOS Dev Center</a>
     */
    @Generated
    @Selector("maximumFractionDigits")
    @NUInt
    public native long maximumFractionDigits();

    /**
     * maximumIntegerDigits</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSNumberFormatter_Class/index.html#//apple_ref/occ/instp/NSNumberFormatter/maximumIntegerDigits">iOS Dev Center</a>
     */
    @Generated
    @Selector("maximumIntegerDigits")
    @NUInt
    public native long maximumIntegerDigits();

    /**
     * maximumSignificantDigits</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSNumberFormatter_Class/index.html#//apple_ref/occ/instp/NSNumberFormatter/maximumSignificantDigits">iOS Dev Center</a>
     */
    @Generated
    @Selector("maximumSignificantDigits")
    @NUInt
    public native long maximumSignificantDigits();

    /**
     * minimum</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSNumberFormatter_Class/index.html#//apple_ref/occ/instp/NSNumberFormatter/minimum">iOS Dev Center</a>
     */
    @Generated
    @Selector("minimum")
    public native NSNumber minimum();

    /**
     * minimumFractionDigits</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSNumberFormatter_Class/index.html#//apple_ref/occ/instp/NSNumberFormatter/minimumFractionDigits">iOS Dev Center</a>
     */
    @Generated
    @Selector("minimumFractionDigits")
    @NUInt
    public native long minimumFractionDigits();

    /**
     * minimumIntegerDigits</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSNumberFormatter_Class/index.html#//apple_ref/occ/instp/NSNumberFormatter/minimumIntegerDigits">iOS Dev Center</a>
     */
    @Generated
    @Selector("minimumIntegerDigits")
    @NUInt
    public native long minimumIntegerDigits();

    /**
     * minimumSignificantDigits</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSNumberFormatter_Class/index.html#//apple_ref/occ/instp/NSNumberFormatter/minimumSignificantDigits">iOS Dev Center</a>
     */
    @Generated
    @Selector("minimumSignificantDigits")
    @NUInt
    public native long minimumSignificantDigits();

    /**
     * minusSign</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSNumberFormatter_Class/index.html#//apple_ref/occ/instp/NSNumberFormatter/minusSign">iOS Dev Center</a>
     */
    @Generated
    @Selector("minusSign")
    public native String minusSign();

    /**
     * multiplier</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSNumberFormatter_Class/index.html#//apple_ref/occ/instp/NSNumberFormatter/multiplier">iOS Dev Center</a>
     */
    @Generated
    @Selector("multiplier")
    public native NSNumber multiplier();

    /**
     * negativeFormat</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSNumberFormatter_Class/index.html#//apple_ref/occ/instp/NSNumberFormatter/negativeFormat">iOS Dev Center</a>
     */
    @Generated
    @Selector("negativeFormat")
    public native String negativeFormat();

    /**
     * negativeInfinitySymbol</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSNumberFormatter_Class/index.html#//apple_ref/occ/instp/NSNumberFormatter/negativeInfinitySymbol">iOS Dev Center</a>
     */
    @Generated
    @Selector("negativeInfinitySymbol")
    public native String negativeInfinitySymbol();

    /**
     * negativePrefix</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSNumberFormatter_Class/index.html#//apple_ref/occ/instp/NSNumberFormatter/negativePrefix">iOS Dev Center</a>
     */
    @Generated
    @Selector("negativePrefix")
    public native String negativePrefix();

    /**
     * negativeSuffix</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSNumberFormatter_Class/index.html#//apple_ref/occ/instp/NSNumberFormatter/negativeSuffix">iOS Dev Center</a>
     */
    @Generated
    @Selector("negativeSuffix")
    public native String negativeSuffix();

    /**
     * nilSymbol</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSNumberFormatter_Class/index.html#//apple_ref/occ/instp/NSNumberFormatter/nilSymbol">iOS Dev Center</a>
     */
    @Generated
    @Selector("nilSymbol")
    public native String nilSymbol();

    /**
     * notANumberSymbol</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSNumberFormatter_Class/index.html#//apple_ref/occ/instp/NSNumberFormatter/notANumberSymbol">iOS Dev Center</a>
     */
    @Generated
    @Selector("notANumberSymbol")
    public native String notANumberSymbol();

    /**
     * numberFromString:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSNumberFormatter_Class/index.html#//apple_ref/occ/instm/NSNumberFormatter/numberFromString:">iOS Dev Center</a>
     */
    @Generated
    @Selector("numberFromString:")
    public native NSNumber numberFromString(String string);

    /**
     * numberStyle</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSNumberFormatter_Class/index.html#//apple_ref/occ/instp/NSNumberFormatter/numberStyle">iOS Dev Center</a>
     */
    @Generated
    @Selector("numberStyle")
    @NUInt
    public native long numberStyle();

    /**
     * paddingCharacter</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSNumberFormatter_Class/index.html#//apple_ref/occ/instp/NSNumberFormatter/paddingCharacter">iOS Dev Center</a>
     */
    @Generated
    @Selector("paddingCharacter")
    public native String paddingCharacter();

    /**
     * paddingPosition</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSNumberFormatter_Class/index.html#//apple_ref/occ/instp/NSNumberFormatter/paddingPosition">iOS Dev Center</a>
     */
    @Generated
    @Selector("paddingPosition")
    @NUInt
    public native long paddingPosition();

    /**
     * perMillSymbol</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSNumberFormatter_Class/index.html#//apple_ref/occ/instp/NSNumberFormatter/perMillSymbol">iOS Dev Center</a>
     */
    @Generated
    @Selector("perMillSymbol")
    public native String perMillSymbol();

    /**
     * percentSymbol</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSNumberFormatter_Class/index.html#//apple_ref/occ/instp/NSNumberFormatter/percentSymbol">iOS Dev Center</a>
     */
    @Generated
    @Selector("percentSymbol")
    public native String percentSymbol();

    /**
     * plusSign</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSNumberFormatter_Class/index.html#//apple_ref/occ/instp/NSNumberFormatter/plusSign">iOS Dev Center</a>
     */
    @Generated
    @Selector("plusSign")
    public native String plusSign();

    /**
     * positiveFormat</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSNumberFormatter_Class/index.html#//apple_ref/occ/instp/NSNumberFormatter/positiveFormat">iOS Dev Center</a>
     */
    @Generated
    @Selector("positiveFormat")
    public native String positiveFormat();

    /**
     * positiveInfinitySymbol</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSNumberFormatter_Class/index.html#//apple_ref/occ/instp/NSNumberFormatter/positiveInfinitySymbol">iOS Dev Center</a>
     */
    @Generated
    @Selector("positiveInfinitySymbol")
    public native String positiveInfinitySymbol();

    /**
     * positivePrefix</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSNumberFormatter_Class/index.html#//apple_ref/occ/instp/NSNumberFormatter/positivePrefix">iOS Dev Center</a>
     */
    @Generated
    @Selector("positivePrefix")
    public native String positivePrefix();

    /**
     * positiveSuffix</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSNumberFormatter_Class/index.html#//apple_ref/occ/instp/NSNumberFormatter/positiveSuffix">iOS Dev Center</a>
     */
    @Generated
    @Selector("positiveSuffix")
    public native String positiveSuffix();

    /**
     * roundingIncrement</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSNumberFormatter_Class/index.html#//apple_ref/occ/instp/NSNumberFormatter/roundingIncrement">iOS Dev Center</a>
     */
    @Generated
    @Selector("roundingIncrement")
    public native NSNumber roundingIncrement();

    /**
     * roundingMode</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSNumberFormatter_Class/index.html#//apple_ref/occ/instp/NSNumberFormatter/roundingMode">iOS Dev Center</a>
     */
    @Generated
    @Selector("roundingMode")
    @NUInt
    public native long roundingMode();

    /**
     * secondaryGroupingSize</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSNumberFormatter_Class/index.html#//apple_ref/occ/instp/NSNumberFormatter/secondaryGroupingSize">iOS Dev Center</a>
     */
    @Generated
    @Selector("secondaryGroupingSize")
    @NUInt
    public native long secondaryGroupingSize();

    /**
     * allowsFloats</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSNumberFormatter_Class/index.html#//apple_ref/occ/instp/NSNumberFormatter/allowsFloats">iOS Dev Center</a>
     */
    @Generated
    @Selector("setAllowsFloats:")
    public native void setAllowsFloats(boolean value);

    /**
     * alwaysShowsDecimalSeparator</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSNumberFormatter_Class/index.html#//apple_ref/occ/instp/NSNumberFormatter/alwaysShowsDecimalSeparator">iOS Dev Center</a>
     */
    @Generated
    @Selector("setAlwaysShowsDecimalSeparator:")
    public native void setAlwaysShowsDecimalSeparator(boolean value);

    /**
     * currencyCode</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSNumberFormatter_Class/index.html#//apple_ref/occ/instp/NSNumberFormatter/currencyCode">iOS Dev Center</a>
     */
    @Generated
    @Selector("setCurrencyCode:")
    public native void setCurrencyCode(String value);

    /**
     * currencyDecimalSeparator</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSNumberFormatter_Class/index.html#//apple_ref/occ/instp/NSNumberFormatter/currencyDecimalSeparator">iOS Dev Center</a>
     */
    @Generated
    @Selector("setCurrencyDecimalSeparator:")
    public native void setCurrencyDecimalSeparator(String value);

    /**
     * currencyGroupingSeparator</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSNumberFormatter_Class/index.html#//apple_ref/occ/instp/NSNumberFormatter/currencyGroupingSeparator">iOS Dev Center</a>
     */
    @Generated
    @Selector("setCurrencyGroupingSeparator:")
    public native void setCurrencyGroupingSeparator(String value);

    /**
     * currencySymbol</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSNumberFormatter_Class/index.html#//apple_ref/occ/instp/NSNumberFormatter/currencySymbol">iOS Dev Center</a>
     */
    @Generated
    @Selector("setCurrencySymbol:")
    public native void setCurrencySymbol(String value);

    /**
     * decimalSeparator</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSNumberFormatter_Class/index.html#//apple_ref/occ/instp/NSNumberFormatter/decimalSeparator">iOS Dev Center</a>
     */
    @Generated
    @Selector("setDecimalSeparator:")
    public native void setDecimalSeparator(String value);

    /**
     * exponentSymbol</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSNumberFormatter_Class/index.html#//apple_ref/occ/instp/NSNumberFormatter/exponentSymbol">iOS Dev Center</a>
     */
    @Generated
    @Selector("setExponentSymbol:")
    public native void setExponentSymbol(String value);

    /**
     * formatWidth</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSNumberFormatter_Class/index.html#//apple_ref/occ/instp/NSNumberFormatter/formatWidth">iOS Dev Center</a>
     */
    @Generated
    @Selector("setFormatWidth:")
    public native void setFormatWidth(@NUInt long value);

    /**
     * formatterBehavior</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSNumberFormatter_Class/index.html#//apple_ref/occ/instp/NSNumberFormatter/formatterBehavior">iOS Dev Center</a>
     */
    @Generated
    @Selector("setFormatterBehavior:")
    public native void setFormatterBehavior(@NUInt long value);

    /**
     * formattingContext</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSNumberFormatter_Class/index.html#//apple_ref/occ/instp/NSNumberFormatter/formattingContext">iOS Dev Center</a>
     */
    @Generated
    @Selector("setFormattingContext:")
    public native void setFormattingContext(@NInt long value);

    /**
     * generatesDecimalNumbers</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSNumberFormatter_Class/index.html#//apple_ref/occ/instp/NSNumberFormatter/generatesDecimalNumbers">iOS Dev Center</a>
     */
    @Generated
    @Selector("setGeneratesDecimalNumbers:")
    public native void setGeneratesDecimalNumbers(boolean value);

    /**
     * groupingSeparator</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSNumberFormatter_Class/index.html#//apple_ref/occ/instp/NSNumberFormatter/groupingSeparator">iOS Dev Center</a>
     */
    @Generated
    @Selector("setGroupingSeparator:")
    public native void setGroupingSeparator(String value);

    /**
     * groupingSize</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSNumberFormatter_Class/index.html#//apple_ref/occ/instp/NSNumberFormatter/groupingSize">iOS Dev Center</a>
     */
    @Generated
    @Selector("setGroupingSize:")
    public native void setGroupingSize(@NUInt long value);

    /**
     * internationalCurrencySymbol</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSNumberFormatter_Class/index.html#//apple_ref/occ/instp/NSNumberFormatter/internationalCurrencySymbol">iOS Dev Center</a>
     */
    @Generated
    @Selector("setInternationalCurrencySymbol:")
    public native void setInternationalCurrencySymbol(String value);

    /**
     * locale</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSNumberFormatter_Class/index.html#//apple_ref/occ/instp/NSNumberFormatter/locale">iOS Dev Center</a>
     */
    @Generated
    @Selector("setLocale:")
    public native void setLocale(NSLocale value);

    /**
     * maximum</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSNumberFormatter_Class/index.html#//apple_ref/occ/instp/NSNumberFormatter/maximum">iOS Dev Center</a>
     */
    @Generated
    @Selector("setMaximum:")
    public native void setMaximum(NSNumber value);

    /**
     * maximumFractionDigits</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSNumberFormatter_Class/index.html#//apple_ref/occ/instp/NSNumberFormatter/maximumFractionDigits">iOS Dev Center</a>
     */
    @Generated
    @Selector("setMaximumFractionDigits:")
    public native void setMaximumFractionDigits(@NUInt long value);

    /**
     * maximumIntegerDigits</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSNumberFormatter_Class/index.html#//apple_ref/occ/instp/NSNumberFormatter/maximumIntegerDigits">iOS Dev Center</a>
     */
    @Generated
    @Selector("setMaximumIntegerDigits:")
    public native void setMaximumIntegerDigits(@NUInt long value);

    /**
     * maximumSignificantDigits</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSNumberFormatter_Class/index.html#//apple_ref/occ/instp/NSNumberFormatter/maximumSignificantDigits">iOS Dev Center</a>
     */
    @Generated
    @Selector("setMaximumSignificantDigits:")
    public native void setMaximumSignificantDigits(@NUInt long value);

    /**
     * minimum</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSNumberFormatter_Class/index.html#//apple_ref/occ/instp/NSNumberFormatter/minimum">iOS Dev Center</a>
     */
    @Generated
    @Selector("setMinimum:")
    public native void setMinimum(NSNumber value);

    /**
     * minimumFractionDigits</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSNumberFormatter_Class/index.html#//apple_ref/occ/instp/NSNumberFormatter/minimumFractionDigits">iOS Dev Center</a>
     */
    @Generated
    @Selector("setMinimumFractionDigits:")
    public native void setMinimumFractionDigits(@NUInt long value);

    /**
     * minimumIntegerDigits</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSNumberFormatter_Class/index.html#//apple_ref/occ/instp/NSNumberFormatter/minimumIntegerDigits">iOS Dev Center</a>
     */
    @Generated
    @Selector("setMinimumIntegerDigits:")
    public native void setMinimumIntegerDigits(@NUInt long value);

    /**
     * minimumSignificantDigits</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSNumberFormatter_Class/index.html#//apple_ref/occ/instp/NSNumberFormatter/minimumSignificantDigits">iOS Dev Center</a>
     */
    @Generated
    @Selector("setMinimumSignificantDigits:")
    public native void setMinimumSignificantDigits(@NUInt long value);

    /**
     * minusSign</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSNumberFormatter_Class/index.html#//apple_ref/occ/instp/NSNumberFormatter/minusSign">iOS Dev Center</a>
     */
    @Generated
    @Selector("setMinusSign:")
    public native void setMinusSign(String value);

    /**
     * multiplier</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSNumberFormatter_Class/index.html#//apple_ref/occ/instp/NSNumberFormatter/multiplier">iOS Dev Center</a>
     */
    @Generated
    @Selector("setMultiplier:")
    public native void setMultiplier(NSNumber value);

    /**
     * negativeFormat</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSNumberFormatter_Class/index.html#//apple_ref/occ/instp/NSNumberFormatter/negativeFormat">iOS Dev Center</a>
     */
    @Generated
    @Selector("setNegativeFormat:")
    public native void setNegativeFormat(String value);

    /**
     * negativeInfinitySymbol</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSNumberFormatter_Class/index.html#//apple_ref/occ/instp/NSNumberFormatter/negativeInfinitySymbol">iOS Dev Center</a>
     */
    @Generated
    @Selector("setNegativeInfinitySymbol:")
    public native void setNegativeInfinitySymbol(String value);

    /**
     * negativePrefix</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSNumberFormatter_Class/index.html#//apple_ref/occ/instp/NSNumberFormatter/negativePrefix">iOS Dev Center</a>
     */
    @Generated
    @Selector("setNegativePrefix:")
    public native void setNegativePrefix(String value);

    /**
     * negativeSuffix</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSNumberFormatter_Class/index.html#//apple_ref/occ/instp/NSNumberFormatter/negativeSuffix">iOS Dev Center</a>
     */
    @Generated
    @Selector("setNegativeSuffix:")
    public native void setNegativeSuffix(String value);

    /**
     * nilSymbol</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSNumberFormatter_Class/index.html#//apple_ref/occ/instp/NSNumberFormatter/nilSymbol">iOS Dev Center</a>
     */
    @Generated
    @Selector("setNilSymbol:")
    public native void setNilSymbol(String value);

    /**
     * notANumberSymbol</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSNumberFormatter_Class/index.html#//apple_ref/occ/instp/NSNumberFormatter/notANumberSymbol">iOS Dev Center</a>
     */
    @Generated
    @Selector("setNotANumberSymbol:")
    public native void setNotANumberSymbol(String value);

    /**
     * numberStyle</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSNumberFormatter_Class/index.html#//apple_ref/occ/instp/NSNumberFormatter/numberStyle">iOS Dev Center</a>
     */
    @Generated
    @Selector("setNumberStyle:")
    public native void setNumberStyle(@NUInt long value);

    /**
     * paddingCharacter</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSNumberFormatter_Class/index.html#//apple_ref/occ/instp/NSNumberFormatter/paddingCharacter">iOS Dev Center</a>
     */
    @Generated
    @Selector("setPaddingCharacter:")
    public native void setPaddingCharacter(String value);

    /**
     * paddingPosition</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSNumberFormatter_Class/index.html#//apple_ref/occ/instp/NSNumberFormatter/paddingPosition">iOS Dev Center</a>
     */
    @Generated
    @Selector("setPaddingPosition:")
    public native void setPaddingPosition(@NUInt long value);

    /**
     * perMillSymbol</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSNumberFormatter_Class/index.html#//apple_ref/occ/instp/NSNumberFormatter/perMillSymbol">iOS Dev Center</a>
     */
    @Generated
    @Selector("setPerMillSymbol:")
    public native void setPerMillSymbol(String value);

    /**
     * percentSymbol</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSNumberFormatter_Class/index.html#//apple_ref/occ/instp/NSNumberFormatter/percentSymbol">iOS Dev Center</a>
     */
    @Generated
    @Selector("setPercentSymbol:")
    public native void setPercentSymbol(String value);

    /**
     * plusSign</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSNumberFormatter_Class/index.html#//apple_ref/occ/instp/NSNumberFormatter/plusSign">iOS Dev Center</a>
     */
    @Generated
    @Selector("setPlusSign:")
    public native void setPlusSign(String value);

    /**
     * positiveFormat</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSNumberFormatter_Class/index.html#//apple_ref/occ/instp/NSNumberFormatter/positiveFormat">iOS Dev Center</a>
     */
    @Generated
    @Selector("setPositiveFormat:")
    public native void setPositiveFormat(String value);

    /**
     * positiveInfinitySymbol</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSNumberFormatter_Class/index.html#//apple_ref/occ/instp/NSNumberFormatter/positiveInfinitySymbol">iOS Dev Center</a>
     */
    @Generated
    @Selector("setPositiveInfinitySymbol:")
    public native void setPositiveInfinitySymbol(String value);

    /**
     * positivePrefix</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSNumberFormatter_Class/index.html#//apple_ref/occ/instp/NSNumberFormatter/positivePrefix">iOS Dev Center</a>
     */
    @Generated
    @Selector("setPositivePrefix:")
    public native void setPositivePrefix(String value);

    /**
     * positiveSuffix</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSNumberFormatter_Class/index.html#//apple_ref/occ/instp/NSNumberFormatter/positiveSuffix">iOS Dev Center</a>
     */
    @Generated
    @Selector("setPositiveSuffix:")
    public native void setPositiveSuffix(String value);

    /**
     * roundingIncrement</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSNumberFormatter_Class/index.html#//apple_ref/occ/instp/NSNumberFormatter/roundingIncrement">iOS Dev Center</a>
     */
    @Generated
    @Selector("setRoundingIncrement:")
    public native void setRoundingIncrement(NSNumber value);

    /**
     * roundingMode</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSNumberFormatter_Class/index.html#//apple_ref/occ/instp/NSNumberFormatter/roundingMode">iOS Dev Center</a>
     */
    @Generated
    @Selector("setRoundingMode:")
    public native void setRoundingMode(@NUInt long value);

    /**
     * secondaryGroupingSize</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSNumberFormatter_Class/index.html#//apple_ref/occ/instp/NSNumberFormatter/secondaryGroupingSize">iOS Dev Center</a>
     */
    @Generated
    @Selector("setSecondaryGroupingSize:")
    public native void setSecondaryGroupingSize(@NUInt long value);

    /**
     * textAttributesForNegativeInfinity</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSNumberFormatter_Class/index.html#//apple_ref/occ/instp/NSNumberFormatter/textAttributesForNegativeInfinity">iOS Dev Center</a>
     */
    @Generated
    @Selector("setTextAttributesForNegativeInfinity:")
    public native void setTextAttributesForNegativeInfinity(NSDictionary<String, ?> value);

    /**
     * textAttributesForNegativeValues</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSNumberFormatter_Class/index.html#//apple_ref/occ/instp/NSNumberFormatter/textAttributesForNegativeValues">iOS Dev Center</a>
     */
    @Generated
    @Selector("setTextAttributesForNegativeValues:")
    public native void setTextAttributesForNegativeValues(NSDictionary<String, ?> value);

    /**
     * textAttributesForNil</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSNumberFormatter_Class/index.html#//apple_ref/occ/instp/NSNumberFormatter/textAttributesForNil">iOS Dev Center</a>
     */
    @Generated
    @Selector("setTextAttributesForNil:")
    public native void setTextAttributesForNil(NSDictionary<String, ?> value);

    /**
     * textAttributesForNotANumber</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSNumberFormatter_Class/index.html#//apple_ref/occ/instp/NSNumberFormatter/textAttributesForNotANumber">iOS Dev Center</a>
     */
    @Generated
    @Selector("setTextAttributesForNotANumber:")
    public native void setTextAttributesForNotANumber(NSDictionary<String, ?> value);

    /**
     * textAttributesForPositiveInfinity</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSNumberFormatter_Class/index.html#//apple_ref/occ/instp/NSNumberFormatter/textAttributesForPositiveInfinity">iOS Dev Center</a>
     */
    @Generated
    @Selector("setTextAttributesForPositiveInfinity:")
    public native void setTextAttributesForPositiveInfinity(NSDictionary<String, ?> value);

    /**
     * textAttributesForPositiveValues</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSNumberFormatter_Class/index.html#//apple_ref/occ/instp/NSNumberFormatter/textAttributesForPositiveValues">iOS Dev Center</a>
     */
    @Generated
    @Selector("setTextAttributesForPositiveValues:")
    public native void setTextAttributesForPositiveValues(NSDictionary<String, ?> value);

    /**
     * textAttributesForZero</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSNumberFormatter_Class/index.html#//apple_ref/occ/instp/NSNumberFormatter/textAttributesForZero">iOS Dev Center</a>
     */
    @Generated
    @Selector("setTextAttributesForZero:")
    public native void setTextAttributesForZero(NSDictionary<String, ?> value);

    /**
     * usesGroupingSeparator</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSNumberFormatter_Class/index.html#//apple_ref/occ/instp/NSNumberFormatter/usesGroupingSeparator">iOS Dev Center</a>
     */
    @Generated
    @Selector("setUsesGroupingSeparator:")
    public native void setUsesGroupingSeparator(boolean value);

    /**
     * usesSignificantDigits</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSNumberFormatter_Class/index.html#//apple_ref/occ/instp/NSNumberFormatter/usesSignificantDigits">iOS Dev Center</a>
     */
    @Generated
    @Selector("setUsesSignificantDigits:")
    public native void setUsesSignificantDigits(boolean value);

    /**
     * zeroSymbol</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSNumberFormatter_Class/index.html#//apple_ref/occ/instp/NSNumberFormatter/zeroSymbol">iOS Dev Center</a>
     */
    @Generated
    @Selector("setZeroSymbol:")
    public native void setZeroSymbol(String value);

    /**
     * stringFromNumber:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSNumberFormatter_Class/index.html#//apple_ref/occ/instm/NSNumberFormatter/stringFromNumber:">iOS Dev Center</a>
     */
    @Generated
    @Selector("stringFromNumber:")
    public native String stringFromNumber(NSNumber number);

    /**
     * textAttributesForNegativeInfinity</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSNumberFormatter_Class/index.html#//apple_ref/occ/instp/NSNumberFormatter/textAttributesForNegativeInfinity">iOS Dev Center</a>
     */
    @Generated
    @Selector("textAttributesForNegativeInfinity")
    public native NSDictionary<String, ?> textAttributesForNegativeInfinity();

    /**
     * textAttributesForNegativeValues</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSNumberFormatter_Class/index.html#//apple_ref/occ/instp/NSNumberFormatter/textAttributesForNegativeValues">iOS Dev Center</a>
     */
    @Generated
    @Selector("textAttributesForNegativeValues")
    public native NSDictionary<String, ?> textAttributesForNegativeValues();

    /**
     * textAttributesForNil</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSNumberFormatter_Class/index.html#//apple_ref/occ/instp/NSNumberFormatter/textAttributesForNil">iOS Dev Center</a>
     */
    @Generated
    @Selector("textAttributesForNil")
    public native NSDictionary<String, ?> textAttributesForNil();

    /**
     * textAttributesForNotANumber</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSNumberFormatter_Class/index.html#//apple_ref/occ/instp/NSNumberFormatter/textAttributesForNotANumber">iOS Dev Center</a>
     */
    @Generated
    @Selector("textAttributesForNotANumber")
    public native NSDictionary<String, ?> textAttributesForNotANumber();

    /**
     * textAttributesForPositiveInfinity</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSNumberFormatter_Class/index.html#//apple_ref/occ/instp/NSNumberFormatter/textAttributesForPositiveInfinity">iOS Dev Center</a>
     */
    @Generated
    @Selector("textAttributesForPositiveInfinity")
    public native NSDictionary<String, ?> textAttributesForPositiveInfinity();

    /**
     * textAttributesForPositiveValues</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSNumberFormatter_Class/index.html#//apple_ref/occ/instp/NSNumberFormatter/textAttributesForPositiveValues">iOS Dev Center</a>
     */
    @Generated
    @Selector("textAttributesForPositiveValues")
    public native NSDictionary<String, ?> textAttributesForPositiveValues();

    /**
     * textAttributesForZero</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSNumberFormatter_Class/index.html#//apple_ref/occ/instp/NSNumberFormatter/textAttributesForZero">iOS Dev Center</a>
     */
    @Generated
    @Selector("textAttributesForZero")
    public native NSDictionary<String, ?> textAttributesForZero();

    /**
     * usesGroupingSeparator</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSNumberFormatter_Class/index.html#//apple_ref/occ/instp/NSNumberFormatter/usesGroupingSeparator">iOS Dev Center</a>
     */
    @Generated
    @Selector("usesGroupingSeparator")
    public native boolean usesGroupingSeparator();

    /**
     * usesSignificantDigits</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSNumberFormatter_Class/index.html#//apple_ref/occ/instp/NSNumberFormatter/usesSignificantDigits">iOS Dev Center</a>
     */
    @Generated
    @Selector("usesSignificantDigits")
    public native boolean usesSignificantDigits();

    /**
     * zeroSymbol</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSNumberFormatter_Class/index.html#//apple_ref/occ/instp/NSNumberFormatter/zeroSymbol">iOS Dev Center</a>
     */
    @Generated
    @Selector("zeroSymbol")
    public native String zeroSymbol();

    @Generated
    @Selector("initWithCoder:")
    public native NSNumberFormatter initWithCoder(NSCoder aDecoder);
}

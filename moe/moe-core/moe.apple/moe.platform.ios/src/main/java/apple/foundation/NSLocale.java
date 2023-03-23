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

@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSLocale extends NSObject implements NSCopying, NSSecureCoding {
    static {
        NatJ.register();
    }

    @Generated
    protected NSLocale(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("ISOCountryCodes")
    public static native NSArray<String> ISOCountryCodes();

    @Generated
    @Selector("ISOCurrencyCodes")
    public static native NSArray<String> ISOCurrencyCodes();

    @Generated
    @Selector("ISOLanguageCodes")
    public static native NSArray<String> ISOLanguageCodes();

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSLocale alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native NSLocale allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(String key);

    /**
     * generally you should use this property
     * 
     * API-Since: 2.0
     */
    @Generated
    @Selector("autoupdatingCurrentLocale")
    public static native NSLocale autoupdatingCurrentLocale();

    @Generated
    @Selector("availableLocaleIdentifiers")
    public static native NSArray<String> availableLocaleIdentifiers();

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(@Mapped(ObjCObjectMapper.class) Object aTarget);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
    public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
            @Mapped(ObjCObjectMapper.class) Object aTarget, SEL aSelector,
            @Mapped(ObjCObjectMapper.class) Object anArgument);

    @Generated
    @Selector("canonicalLanguageIdentifierFromString:")
    public static native String canonicalLanguageIdentifierFromString(String string);

    @Generated
    @Selector("canonicalLocaleIdentifierFromString:")
    public static native String canonicalLocaleIdentifierFromString(String string);

    /**
     * API-Since: 4.0
     */
    @Generated
    @Selector("characterDirectionForLanguage:")
    @NUInt
    public static native long characterDirectionForLanguage(String isoLangCode);

    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @Generated
    @Selector("classForKeyedUnarchiver")
    public static native Class classForKeyedUnarchiver();

    /**
     * API-Since: 2.0
     */
    @Generated
    @Selector("commonISOCurrencyCodes")
    public static native NSArray<String> commonISOCurrencyCodes();

    @Generated
    @Selector("componentsFromLocaleIdentifier:")
    public static native NSDictionary<String, String> componentsFromLocaleIdentifier(String string);

    /**
     * an object representing the user's current locale
     */
    @Generated
    @Selector("currentLocale")
    public static native NSLocale currentLocale();

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

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

    /**
     * API-Since: 4.0
     */
    @Generated
    @Selector("lineDirectionForLanguage:")
    @NUInt
    public static native long lineDirectionForLanguage(String isoLangCode);

    @Generated
    @Selector("localeIdentifierFromComponents:")
    public static native String localeIdentifierFromComponents(NSDictionary<String, String> dict);

    /**
     * API-Since: 4.0
     */
    @Generated
    @Selector("localeIdentifierFromWindowsLocaleCode:")
    public static native String localeIdentifierFromWindowsLocaleCode(int lcid);

    /**
     * API-Since: 4.0
     */
    @Generated
    @Selector("localeWithLocaleIdentifier:")
    public static native NSLocale localeWithLocaleIdentifier(String ident);

    @Generated
    @Owned
    @Selector("new")
    public static native NSLocale new_objc();

    /**
     * note that this list does not indicate what language the app is actually running in; the NSBundle.mainBundle
     * object determines that at launch and knows that information
     * 
     * API-Since: 2.0
     */
    @Generated
    @Selector("preferredLanguages")
    public static native NSArray<String> preferredLanguages();

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

    /**
     * the default generic root locale with little localization
     */
    @Generated
    @Selector("systemLocale")
    public static native NSLocale systemLocale();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * API-Since: 4.0
     */
    @Generated
    @Selector("windowsLocaleCodeFromLocaleIdentifier:")
    public static native int windowsLocaleCodeFromLocaleIdentifier(String localeIdentifier);

    /**
     * API-Since: 10.0
     */
    @Generated
    @Selector("alternateQuotationBeginDelimiter")
    public native String alternateQuotationBeginDelimiter();

    /**
     * API-Since: 10.0
     */
    @Generated
    @Selector("alternateQuotationEndDelimiter")
    public native String alternateQuotationEndDelimiter();

    /**
     * API-Since: 10.0
     */
    @Generated
    @Selector("calendarIdentifier")
    public native String calendarIdentifier();

    /**
     * API-Since: 10.0
     */
    @Generated
    @Selector("collationIdentifier")
    public native String collationIdentifier();

    /**
     * API-Since: 10.0
     */
    @Generated
    @Selector("collatorIdentifier")
    public native String collatorIdentifier();

    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(VoidPtr zone);

    /**
     * API-Since: 10.0
     */
    @Generated
    @Selector("countryCode")
    public native String countryCode();

    /**
     * API-Since: 10.0
     */
    @Generated
    @Selector("currencyCode")
    public native String currencyCode();

    /**
     * API-Since: 10.0
     */
    @Generated
    @Selector("currencySymbol")
    public native String currencySymbol();

    /**
     * API-Since: 10.0
     */
    @Generated
    @Selector("decimalSeparator")
    public native String decimalSeparator();

    @Generated
    @Selector("displayNameForKey:value:")
    public native String displayNameForKeyValue(String key, @Mapped(ObjCObjectMapper.class) Object value);

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(NSCoder coder);

    /**
     * API-Since: 10.0
     */
    @Generated
    @Selector("exemplarCharacterSet")
    public native NSCharacterSet exemplarCharacterSet();

    /**
     * API-Since: 10.0
     */
    @Generated
    @Selector("groupingSeparator")
    public native String groupingSeparator();

    @Generated
    @Selector("init")
    public native NSLocale init();

    @Generated
    @Selector("initWithCoder:")
    public native NSLocale initWithCoder(NSCoder coder);

    @Generated
    @Selector("initWithLocaleIdentifier:")
    public native NSLocale initWithLocaleIdentifier(String string);

    /**
     * API-Since: 10.0
     */
    @Generated
    @Selector("languageCode")
    public native String languageCode();

    /**
     * same as NSLocaleIdentifier
     */
    @Generated
    @Selector("localeIdentifier")
    public native String localeIdentifier();

    /**
     * API-Since: 10.0
     */
    @Generated
    @Selector("localizedStringForCalendarIdentifier:")
    public native String localizedStringForCalendarIdentifier(String calendarIdentifier);

    /**
     * API-Since: 10.0
     */
    @Generated
    @Selector("localizedStringForCollationIdentifier:")
    public native String localizedStringForCollationIdentifier(String collationIdentifier);

    /**
     * API-Since: 10.0
     */
    @Generated
    @Selector("localizedStringForCollatorIdentifier:")
    public native String localizedStringForCollatorIdentifier(String collatorIdentifier);

    /**
     * API-Since: 10.0
     */
    @Generated
    @Selector("localizedStringForCountryCode:")
    public native String localizedStringForCountryCode(String countryCode);

    /**
     * API-Since: 10.0
     */
    @Generated
    @Selector("localizedStringForCurrencyCode:")
    public native String localizedStringForCurrencyCode(String currencyCode);

    /**
     * API-Since: 10.0
     */
    @Generated
    @Selector("localizedStringForLanguageCode:")
    public native String localizedStringForLanguageCode(String languageCode);

    /**
     * API-Since: 10.0
     */
    @Generated
    @Selector("localizedStringForLocaleIdentifier:")
    public native String localizedStringForLocaleIdentifier(String localeIdentifier);

    /**
     * API-Since: 10.0
     */
    @Generated
    @Selector("localizedStringForScriptCode:")
    public native String localizedStringForScriptCode(String scriptCode);

    /**
     * API-Since: 10.0
     */
    @Generated
    @Selector("localizedStringForVariantCode:")
    public native String localizedStringForVariantCode(String variantCode);

    @Generated
    @Selector("objectForKey:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object objectForKey(String key);

    /**
     * API-Since: 10.0
     */
    @Generated
    @Selector("quotationBeginDelimiter")
    public native String quotationBeginDelimiter();

    /**
     * API-Since: 10.0
     */
    @Generated
    @Selector("quotationEndDelimiter")
    public native String quotationEndDelimiter();

    /**
     * API-Since: 10.0
     */
    @Generated
    @Selector("scriptCode")
    public native String scriptCode();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    /**
     * API-Since: 10.0
     */
    @Generated
    @Selector("usesMetricSystem")
    public native boolean usesMetricSystem();

    /**
     * API-Since: 10.0
     */
    @Generated
    @Selector("variantCode")
    public native String variantCode();
}

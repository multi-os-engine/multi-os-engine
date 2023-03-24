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

    @NotNull
    @Generated
    @Selector("ISOCountryCodes")
    public static native NSArray<String> ISOCountryCodes();

    @NotNull
    @Generated
    @Selector("ISOCurrencyCodes")
    public static native NSArray<String> ISOCurrencyCodes();

    @NotNull
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
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    /**
     * generally you should use this property
     * 
     * API-Since: 2.0
     */
    @NotNull
    @Generated
    @Selector("autoupdatingCurrentLocale")
    public static native NSLocale autoupdatingCurrentLocale();

    @NotNull
    @Generated
    @Selector("availableLocaleIdentifiers")
    public static native NSArray<String> availableLocaleIdentifiers();

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
    @Selector("canonicalLanguageIdentifierFromString:")
    public static native String canonicalLanguageIdentifierFromString(@NotNull String string);

    @NotNull
    @Generated
    @Selector("canonicalLocaleIdentifierFromString:")
    public static native String canonicalLocaleIdentifierFromString(@NotNull String string);

    /**
     * API-Since: 4.0
     */
    @Generated
    @Selector("characterDirectionForLanguage:")
    @NUInt
    public static native long characterDirectionForLanguage(@NotNull String isoLangCode);

    @NotNull
    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @NotNull
    @Generated
    @Selector("classForKeyedUnarchiver")
    public static native Class classForKeyedUnarchiver();

    /**
     * API-Since: 2.0
     */
    @NotNull
    @Generated
    @Selector("commonISOCurrencyCodes")
    public static native NSArray<String> commonISOCurrencyCodes();

    @NotNull
    @Generated
    @Selector("componentsFromLocaleIdentifier:")
    public static native NSDictionary<String, String> componentsFromLocaleIdentifier(@NotNull String string);

    /**
     * an object representing the user's current locale
     */
    @NotNull
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

    @NotNull
    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    /**
     * API-Since: 4.0
     */
    @Generated
    @Selector("lineDirectionForLanguage:")
    @NUInt
    public static native long lineDirectionForLanguage(@NotNull String isoLangCode);

    @NotNull
    @Generated
    @Selector("localeIdentifierFromComponents:")
    public static native String localeIdentifierFromComponents(@NotNull NSDictionary<String, String> dict);

    /**
     * API-Since: 4.0
     */
    @Nullable
    @Generated
    @Selector("localeIdentifierFromWindowsLocaleCode:")
    public static native String localeIdentifierFromWindowsLocaleCode(int lcid);

    /**
     * API-Since: 4.0
     */
    @Generated
    @Selector("localeWithLocaleIdentifier:")
    public static native NSLocale localeWithLocaleIdentifier(@NotNull String ident);

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
    @NotNull
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
    @NotNull
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
    public static native int windowsLocaleCodeFromLocaleIdentifier(@NotNull String localeIdentifier);

    /**
     * API-Since: 10.0
     */
    @NotNull
    @Generated
    @Selector("alternateQuotationBeginDelimiter")
    public native String alternateQuotationBeginDelimiter();

    /**
     * API-Since: 10.0
     */
    @NotNull
    @Generated
    @Selector("alternateQuotationEndDelimiter")
    public native String alternateQuotationEndDelimiter();

    /**
     * API-Since: 10.0
     */
    @NotNull
    @Generated
    @Selector("calendarIdentifier")
    public native String calendarIdentifier();

    /**
     * API-Since: 10.0
     */
    @Nullable
    @Generated
    @Selector("collationIdentifier")
    public native String collationIdentifier();

    /**
     * API-Since: 10.0
     */
    @NotNull
    @Generated
    @Selector("collatorIdentifier")
    public native String collatorIdentifier();

    @NotNull
    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(@Nullable VoidPtr zone);

    /**
     * API-Since: 10.0
     */
    @Nullable
    @Generated
    @Selector("countryCode")
    public native String countryCode();

    /**
     * API-Since: 10.0
     */
    @Nullable
    @Generated
    @Selector("currencyCode")
    public native String currencyCode();

    /**
     * API-Since: 10.0
     */
    @NotNull
    @Generated
    @Selector("currencySymbol")
    public native String currencySymbol();

    /**
     * API-Since: 10.0
     */
    @NotNull
    @Generated
    @Selector("decimalSeparator")
    public native String decimalSeparator();

    @Nullable
    @Generated
    @Selector("displayNameForKey:value:")
    public native String displayNameForKeyValue(@NotNull String key,
            @NotNull @Mapped(ObjCObjectMapper.class) Object value);

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(@NotNull NSCoder coder);

    /**
     * API-Since: 10.0
     */
    @NotNull
    @Generated
    @Selector("exemplarCharacterSet")
    public native NSCharacterSet exemplarCharacterSet();

    /**
     * API-Since: 10.0
     */
    @NotNull
    @Generated
    @Selector("groupingSeparator")
    public native String groupingSeparator();

    @Generated
    @Selector("init")
    public native NSLocale init();

    @Generated
    @Selector("initWithCoder:")
    public native NSLocale initWithCoder(@NotNull NSCoder coder);

    @Generated
    @Selector("initWithLocaleIdentifier:")
    public native NSLocale initWithLocaleIdentifier(@NotNull String string);

    /**
     * API-Since: 10.0
     */
    @NotNull
    @Generated
    @Selector("languageCode")
    public native String languageCode();

    /**
     * same as NSLocaleIdentifier
     */
    @NotNull
    @Generated
    @Selector("localeIdentifier")
    public native String localeIdentifier();

    /**
     * API-Since: 10.0
     */
    @Nullable
    @Generated
    @Selector("localizedStringForCalendarIdentifier:")
    public native String localizedStringForCalendarIdentifier(@NotNull String calendarIdentifier);

    /**
     * API-Since: 10.0
     */
    @Nullable
    @Generated
    @Selector("localizedStringForCollationIdentifier:")
    public native String localizedStringForCollationIdentifier(@NotNull String collationIdentifier);

    /**
     * API-Since: 10.0
     */
    @Nullable
    @Generated
    @Selector("localizedStringForCollatorIdentifier:")
    public native String localizedStringForCollatorIdentifier(@NotNull String collatorIdentifier);

    /**
     * API-Since: 10.0
     */
    @Nullable
    @Generated
    @Selector("localizedStringForCountryCode:")
    public native String localizedStringForCountryCode(@NotNull String countryCode);

    /**
     * API-Since: 10.0
     */
    @Nullable
    @Generated
    @Selector("localizedStringForCurrencyCode:")
    public native String localizedStringForCurrencyCode(@NotNull String currencyCode);

    /**
     * API-Since: 10.0
     */
    @Nullable
    @Generated
    @Selector("localizedStringForLanguageCode:")
    public native String localizedStringForLanguageCode(@NotNull String languageCode);

    /**
     * API-Since: 10.0
     */
    @NotNull
    @Generated
    @Selector("localizedStringForLocaleIdentifier:")
    public native String localizedStringForLocaleIdentifier(@NotNull String localeIdentifier);

    /**
     * API-Since: 10.0
     */
    @Nullable
    @Generated
    @Selector("localizedStringForScriptCode:")
    public native String localizedStringForScriptCode(@NotNull String scriptCode);

    /**
     * API-Since: 10.0
     */
    @Nullable
    @Generated
    @Selector("localizedStringForVariantCode:")
    public native String localizedStringForVariantCode(@NotNull String variantCode);

    @Nullable
    @Generated
    @Selector("objectForKey:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object objectForKey(@NotNull String key);

    /**
     * API-Since: 10.0
     */
    @NotNull
    @Generated
    @Selector("quotationBeginDelimiter")
    public native String quotationBeginDelimiter();

    /**
     * API-Since: 10.0
     */
    @NotNull
    @Generated
    @Selector("quotationEndDelimiter")
    public native String quotationEndDelimiter();

    /**
     * API-Since: 10.0
     */
    @Nullable
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
    @Nullable
    @Generated
    @Selector("variantCode")
    public native String variantCode();
}

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

    @Generated
    @Selector("allocWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(String key);

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

    @Generated
    @Selector("commonISOCurrencyCodes")
    public static native NSArray<String> commonISOCurrencyCodes();

    @Generated
    @Selector("componentsFromLocaleIdentifier:")
    public static native NSDictionary<String, String> componentsFromLocaleIdentifier(String string);

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
    @Selector("lineDirectionForLanguage:")
    @NUInt
    public static native long lineDirectionForLanguage(String isoLangCode);

    @Generated
    @Selector("load")
    public static native void load_objc_static();

    @Generated
    @Selector("localeIdentifierFromComponents:")
    public static native String localeIdentifierFromComponents(NSDictionary<String, String> dict);

    @Generated
    @Selector("localeIdentifierFromWindowsLocaleCode:")
    public static native String localeIdentifierFromWindowsLocaleCode(int lcid);

    @Generated
    @Selector("localeWithLocaleIdentifier:")
    public static native NSLocale localeWithLocaleIdentifier(String ident);

    @Generated
    @Owned
    @Selector("new")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object new_objc();

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

    @Generated
    @Selector("systemLocale")
    public static native NSLocale systemLocale();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @Generated
    @Selector("windowsLocaleCodeFromLocaleIdentifier:")
    public static native int windowsLocaleCodeFromLocaleIdentifier(String localeIdentifier);

    @Generated
    @Selector("alternateQuotationBeginDelimiter")
    public native String alternateQuotationBeginDelimiter();

    @Generated
    @Selector("alternateQuotationEndDelimiter")
    public native String alternateQuotationEndDelimiter();

    @Generated
    @Selector("calendarIdentifier")
    public native String calendarIdentifier();

    @Generated
    @Selector("collationIdentifier")
    public native String collationIdentifier();

    @Generated
    @Selector("collatorIdentifier")
    public native String collatorIdentifier();

    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(VoidPtr zone);

    @Generated
    @Selector("countryCode")
    public native String countryCode();

    @Generated
    @Selector("currencyCode")
    public native String currencyCode();

    @Generated
    @Selector("currencySymbol")
    public native String currencySymbol();

    @Generated
    @Selector("decimalSeparator")
    public native String decimalSeparator();

    @Generated
    @Selector("displayNameForKey:value:")
    public native String displayNameForKeyValue(String key, @Mapped(ObjCObjectMapper.class) Object value);

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(NSCoder aCoder);

    @Generated
    @Selector("exemplarCharacterSet")
    public native NSCharacterSet exemplarCharacterSet();

    @Generated
    @Selector("groupingSeparator")
    public native String groupingSeparator();

    @Generated
    @Selector("init")
    public native NSLocale init();

    @Generated
    @Selector("initWithCoder:")
    public native NSLocale initWithCoder(NSCoder aDecoder);

    @Generated
    @Selector("initWithLocaleIdentifier:")
    public native NSLocale initWithLocaleIdentifier(String string);

    @Generated
    @Selector("languageCode")
    public native String languageCode();

    @Generated
    @Selector("localeIdentifier")
    public native String localeIdentifier();

    @Generated
    @Selector("localizedStringForCalendarIdentifier:")
    public native String localizedStringForCalendarIdentifier(String calendarIdentifier);

    @Generated
    @Selector("localizedStringForCollationIdentifier:")
    public native String localizedStringForCollationIdentifier(String collationIdentifier);

    @Generated
    @Selector("localizedStringForCollatorIdentifier:")
    public native String localizedStringForCollatorIdentifier(String collatorIdentifier);

    @Generated
    @Selector("localizedStringForCountryCode:")
    public native String localizedStringForCountryCode(String countryCode);

    @Generated
    @Selector("localizedStringForCurrencyCode:")
    public native String localizedStringForCurrencyCode(String currencyCode);

    @Generated
    @Selector("localizedStringForLanguageCode:")
    public native String localizedStringForLanguageCode(String languageCode);

    @Generated
    @Selector("localizedStringForLocaleIdentifier:")
    public native String localizedStringForLocaleIdentifier(String localeIdentifier);

    @Generated
    @Selector("localizedStringForScriptCode:")
    public native String localizedStringForScriptCode(String scriptCode);

    @Generated
    @Selector("localizedStringForVariantCode:")
    public native String localizedStringForVariantCode(String variantCode);

    @Generated
    @Selector("objectForKey:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object objectForKey(String key);

    @Generated
    @Selector("quotationBeginDelimiter")
    public native String quotationBeginDelimiter();

    @Generated
    @Selector("quotationEndDelimiter")
    public native String quotationEndDelimiter();

    @Generated
    @Selector("scriptCode")
    public native String scriptCode();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    @Generated
    @Selector("usesMetricSystem")
    public native boolean usesMetricSystem();

    @Generated
    @Selector("variantCode")
    public native String variantCode();
}

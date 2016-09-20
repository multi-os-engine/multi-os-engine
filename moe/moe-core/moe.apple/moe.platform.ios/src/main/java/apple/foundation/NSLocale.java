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

    /**
     * ISOCountryCodes</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSLocale_Class/index.html#//apple_ref/occ/clm/NSLocale/ISOCountryCodes">iOS Dev Center</a>
     */
    @Generated
    @Selector("ISOCountryCodes")
    public static native NSArray<String> ISOCountryCodes();

    /**
     * ISOCurrencyCodes</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSLocale_Class/index.html#//apple_ref/occ/clm/NSLocale/ISOCurrencyCodes">iOS Dev Center</a>
     */
    @Generated
    @Selector("ISOCurrencyCodes")
    public static native NSArray<String> ISOCurrencyCodes();

    /**
     * ISOLanguageCodes</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSLocale_Class/index.html#//apple_ref/occ/clm/NSLocale/ISOLanguageCodes">iOS Dev Center</a>
     */
    @Generated
    @Selector("ISOLanguageCodes")
    public static native NSArray<String> ISOLanguageCodes();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSLocale alloc();

    /**
     * autoupdatingCurrentLocale</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSLocale_Class/index.html#//apple_ref/occ/clm/NSLocale/autoupdatingCurrentLocale">iOS Dev Center</a>
     */
    @Generated
    @Selector("autoupdatingCurrentLocale")
    public static native NSLocale autoupdatingCurrentLocale();

    /**
     * availableLocaleIdentifiers</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSLocale_Class/index.html#//apple_ref/occ/clm/NSLocale/availableLocaleIdentifiers">iOS Dev Center</a>
     */
    @Generated
    @Selector("availableLocaleIdentifiers")
    public static native NSArray<String> availableLocaleIdentifiers();

    /**
     * canonicalLanguageIdentifierFromString:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSLocale_Class/index.html#//apple_ref/occ/clm/NSLocale/canonicalLanguageIdentifierFromString:">iOS Dev Center</a>
     */
    @Generated
    @Selector("canonicalLanguageIdentifierFromString:")
    public static native String canonicalLanguageIdentifierFromString(String string);

    /**
     * canonicalLocaleIdentifierFromString:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSLocale_Class/index.html#//apple_ref/occ/clm/NSLocale/canonicalLocaleIdentifierFromString:">iOS Dev Center</a>
     */
    @Generated
    @Selector("canonicalLocaleIdentifierFromString:")
    public static native String canonicalLocaleIdentifierFromString(String string);

    /**
     * characterDirectionForLanguage:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSLocale_Class/index.html#//apple_ref/occ/clm/NSLocale/characterDirectionForLanguage:">iOS Dev Center</a>
     */
    @Generated
    @Selector("characterDirectionForLanguage:")
    @NUInt
    public static native long characterDirectionForLanguage(String isoLangCode);

    /**
     * commonISOCurrencyCodes</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSLocale_Class/index.html#//apple_ref/occ/clm/NSLocale/commonISOCurrencyCodes">iOS Dev Center</a>
     */
    @Generated
    @Selector("commonISOCurrencyCodes")
    public static native NSArray<String> commonISOCurrencyCodes();

    /**
     * componentsFromLocaleIdentifier:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSLocale_Class/index.html#//apple_ref/occ/clm/NSLocale/componentsFromLocaleIdentifier:">iOS Dev Center</a>
     */
    @Generated
    @Selector("componentsFromLocaleIdentifier:")
    public static native NSDictionary<String, String> componentsFromLocaleIdentifier(String string);

    /**
     * currentLocale</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSLocale_Class/index.html#//apple_ref/occ/clm/NSLocale/currentLocale">iOS Dev Center</a>
     */
    @Generated
    @Selector("currentLocale")
    public static native NSLocale currentLocale();

    /**
     * lineDirectionForLanguage:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSLocale_Class/index.html#//apple_ref/occ/clm/NSLocale/lineDirectionForLanguage:">iOS Dev Center</a>
     */
    @Generated
    @Selector("lineDirectionForLanguage:")
    @NUInt
    public static native long lineDirectionForLanguage(String isoLangCode);

    /**
     * localeIdentifierFromComponents:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSLocale_Class/index.html#//apple_ref/occ/clm/NSLocale/localeIdentifierFromComponents:">iOS Dev Center</a>
     */
    @Generated
    @Selector("localeIdentifierFromComponents:")
    public static native String localeIdentifierFromComponents(NSDictionary<String, String> dict);

    /**
     * localeIdentifierFromWindowsLocaleCode:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSLocale_Class/index.html#//apple_ref/occ/clm/NSLocale/localeIdentifierFromWindowsLocaleCode:">iOS Dev Center</a>
     */
    @Generated
    @Selector("localeIdentifierFromWindowsLocaleCode:")
    public static native String localeIdentifierFromWindowsLocaleCode(int lcid);

    /**
     * localeWithLocaleIdentifier:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSLocale_Class/index.html#//apple_ref/occ/clm/NSLocale/localeWithLocaleIdentifier:">iOS Dev Center</a>
     */
    @Generated
    @Selector("localeWithLocaleIdentifier:")
    public static native NSLocale localeWithLocaleIdentifier(String ident);

    /**
     * preferredLanguages</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSLocale_Class/index.html#//apple_ref/occ/clm/NSLocale/preferredLanguages">iOS Dev Center</a>
     */
    @Generated
    @Selector("preferredLanguages")
    public static native NSArray<String> preferredLanguages();

    @Generated
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

    /**
     * systemLocale</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSLocale_Class/index.html#//apple_ref/occ/clm/NSLocale/systemLocale">iOS Dev Center</a>
     */
    @Generated
    @Selector("systemLocale")
    public static native NSLocale systemLocale();

    /**
     * windowsLocaleCodeFromLocaleIdentifier:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSLocale_Class/index.html#//apple_ref/occ/clm/NSLocale/windowsLocaleCodeFromLocaleIdentifier:">iOS Dev Center</a>
     */
    @Generated
    @Selector("windowsLocaleCodeFromLocaleIdentifier:")
    public static native int windowsLocaleCodeFromLocaleIdentifier(String localeIdentifier);

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

    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(VoidPtr zone);

    /**
     * displayNameForKey:value:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSLocale_Class/index.html#//apple_ref/occ/instm/NSLocale/displayNameForKey:value:">iOS Dev Center</a>
     */
    @Generated
    @Selector("displayNameForKey:value:")
    public native String displayNameForKeyValue(@Mapped(ObjCObjectMapper.class) Object key,
            @Mapped(ObjCObjectMapper.class) Object value);

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(NSCoder aCoder);

    @Generated
    @Selector("init")
    public native NSLocale init();

    @Generated
    @Selector("initWithCoder:")
    public native NSLocale initWithCoder(NSCoder aDecoder);

    /**
     * initWithLocaleIdentifier:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSLocale_Class/index.html#//apple_ref/occ/instm/NSLocale/initWithLocaleIdentifier:">iOS Dev Center</a>
     */
    @Generated
    @Selector("initWithLocaleIdentifier:")
    public native NSLocale initWithLocaleIdentifier(String string);

    /**
     * localeIdentifier</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSLocale_Class/index.html#//apple_ref/occ/instp/NSLocale/localeIdentifier">iOS Dev Center</a>
     */
    @Generated
    @Selector("localeIdentifier")
    public native String localeIdentifier();

    /**
     * objectForKey:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSLocale_Class/index.html#//apple_ref/occ/instm/NSLocale/objectForKey:">iOS Dev Center</a>
     */
    @Generated
    @Selector("objectForKey:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object objectForKey(@Mapped(ObjCObjectMapper.class) Object key);

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }
}

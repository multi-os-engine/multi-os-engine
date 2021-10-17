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

package apple.contacts;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSAttributedString;
import apple.foundation.NSCoder;
import apple.foundation.NSDictionary;
import apple.foundation.NSFormatter;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * Formats a postal address.
 * <p>
 * This formatter handles international formatting of a postal address.
 */
@Generated
@Library("Contacts")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class CNPostalAddressFormatter extends NSFormatter {
    static {
        NatJ.register();
    }

    @Generated
    protected CNPostalAddressFormatter(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native CNPostalAddressFormatter alloc();

    @Generated
    @Selector("allocWithZone:")
    public static native CNPostalAddressFormatter allocWithZone(VoidPtr zone);

    /**
     * Formats the postal address returning an attributed string.
     * <p>
     * This behaves like +stringFromPostalAddress: except it returns an attributed string. Includes attribute keys CNPostalAddressPropertyAttribute and CNPostalAddressLocalizedPropertyNameAttribute.
     *
     * @param postalAddress The postal address to be formatted.
     * @param style         The formatting style to be used for the postal address.
     * @param attributes    The default attributes to use. See NSFormatter for details.
     * @return The formatted postal address as an attributed string.
     */
    @Generated
    @Selector("attributedStringFromPostalAddress:style:withDefaultAttributes:")
    public static native NSAttributedString attributedStringFromPostalAddressStyleWithDefaultAttributes(
            CNPostalAddress postalAddress, @NInt long style, NSDictionary<?, ?> attributes);

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
    @Owned
    @Selector("new")
    public static native CNPostalAddressFormatter new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * Formats the postal address.
     *
     * @param postalAddress The postal address to be formatted.
     * @param style         The formatting style to be used for the postal address.
     * @return The formatted postal address.
     */
    @Generated
    @Selector("stringFromPostalAddress:style:")
    public static native String stringFromPostalAddressStyle(CNPostalAddress postalAddress, @NInt long style);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * Formats the postal address returning an attributed string.
     * <p>
     * This behaves like +stringFromPostalAddress: except it returns an attributed string. Includes attribute keys CNPostalAddressPropertyAttribute and CNPostalAddressLocalizedPropertyNameAttribute.
     *
     * @param postalAddress The postal address to be formatted.
     * @param attributes    The default attributes to use. See NSFormatter for details.
     * @return The formatted postal address as an attributed string.
     */
    @Generated
    @Selector("attributedStringFromPostalAddress:withDefaultAttributes:")
    public native NSAttributedString attributedStringFromPostalAddressWithDefaultAttributes(
            CNPostalAddress postalAddress, NSDictionary<?, ?> attributes);

    @Generated
    @Selector("init")
    public native CNPostalAddressFormatter init();

    @Generated
    @Selector("initWithCoder:")
    public native CNPostalAddressFormatter initWithCoder(NSCoder coder);

    /**
     * The style for a postal address formatter instance.
     * <p>
     * The default value is CNPostalAddressFormatterStyleMailingAddress.
     */
    @Generated
    @Selector("setStyle:")
    public native void setStyle(@NInt long value);

    /**
     * Formats the postal address.
     *
     * @param postalAddress The postal address to be formatted.
     * @return The formatted postal address.
     */
    @Generated
    @Selector("stringFromPostalAddress:")
    public native String stringFromPostalAddress(CNPostalAddress postalAddress);

    /**
     * The style for a postal address formatter instance.
     * <p>
     * The default value is CNPostalAddressFormatterStyleMailingAddress.
     */
    @Generated
    @Selector("style")
    @NInt
    public native long style();
}

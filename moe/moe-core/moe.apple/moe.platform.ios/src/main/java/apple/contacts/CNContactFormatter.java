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
import apple.contacts.protocol.CNKeyDescriptor;
import apple.foundation.NSArray;
import apple.foundation.NSAttributedString;
import apple.foundation.NSCoder;
import apple.foundation.NSDictionary;
import apple.foundation.NSFormatter;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
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

/**
 * Formats a contact name.
 * 
 * This formatter handles international ordering and delimiting of the contact name components. This includes applying
 * the user defaults when appropriate.
 * 
 * API-Since: 9.0
 */
@Generated
@Library("Contacts")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class CNContactFormatter extends NSFormatter implements NSSecureCoding {
    static {
        NatJ.register();
    }

    @Generated
    protected CNContactFormatter(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native CNContactFormatter alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native CNContactFormatter allocWithZone(VoidPtr zone);

    /**
     * Formats the contact name returning an attributed string.
     * 
     * This behaves like +stringFromContact:style: except it returns an attributed string. Includes the attribute key
     * CNContactPropertyAttribute.
     * 
     * @param contact    The contact whose name is to be formatted.
     * @param style      The formatting style to be used for the contact name.
     * @param attributes The default attributes to use. See NSFormatter for details.
     * @return The formatted contact name as an attributed string.
     */
    @Generated
    @Selector("attributedStringFromContact:style:defaultAttributes:")
    public static native NSAttributedString attributedStringFromContactStyleDefaultAttributes(CNContact contact,
            @NInt long style, NSDictionary<?, ?> attributes);

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

    /**
     * The recommended delimiter to use between name components for a given contact.
     */
    @Generated
    @Selector("delimiterForContact:")
    public static native String delimiterForContact(CNContact contact);

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * The contact key descriptor required for the formatter.
     * 
     * Use to fetch all contact keys required for the formatter style. Can combine key descriptors for different
     * formatter styles in the fetch.
     * 
     * @param style The formatting style to be used for the contact name.
     * @return The contact key descriptor for the formatting style.
     */
    @Generated
    @Selector("descriptorForRequiredKeysForStyle:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native CNKeyDescriptor descriptorForRequiredKeysForStyle(@NInt long style);

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
     * The recommended name order for a given contact.
     */
    @Generated
    @Selector("nameOrderForContact:")
    @NInt
    public static native long nameOrderForContact(CNContact contact);

    @Generated
    @Owned
    @Selector("new")
    public static native CNContactFormatter new_objc();

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
     * Formats the contact name.
     * 
     * @param contact The contact whose name is to be formatted.
     * @param style   The formatting style to be used for the contact name.
     * @return The formatted contact name.
     */
    @Generated
    @Selector("stringFromContact:style:")
    public static native String stringFromContactStyle(CNContact contact, @NInt long style);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * Formats the contact name returning an attributed string.
     * 
     * This behaves like -stringFromContact:style: except it returns an attributed string. CNContactPropertyAttribute
     * key has the value of a CNContact name property key.
     * 
     * @param contact    The contact whose name is to be formatted.
     * @param attributes The default attributes to use. See NSFormatter for details.
     * @return The formatted contact name as an attributed string.
     */
    @Generated
    @Selector("attributedStringFromContact:defaultAttributes:")
    public native NSAttributedString attributedStringFromContactDefaultAttributes(CNContact contact,
            NSDictionary<?, ?> attributes);

    @Generated
    @Selector("init")
    public native CNContactFormatter init();

    @Generated
    @Selector("initWithCoder:")
    public native CNContactFormatter initWithCoder(NSCoder coder);

    /**
     * The style for a contact formatter instance.
     * 
     * The default value is CNContactFormatterStyleFullName.
     */
    @Generated
    @Selector("setStyle:")
    public native void setStyle(@NInt long value);

    /**
     * Formats the contact name.
     * 
     * @param contact The contact whose name is to be formatted.
     * @return The formatted contact name.
     */
    @Generated
    @Selector("stringFromContact:")
    public native String stringFromContact(CNContact contact);

    /**
     * The style for a contact formatter instance.
     * 
     * The default value is CNContactFormatterStyleFullName.
     */
    @Generated
    @Selector("style")
    @NInt
    public native long style();

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(NSCoder coder);

    @Generated
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    /**
     * The contact key descriptor required for the name delimiter.
     * 
     * Use to fetch all contact keys required for +delimiterForContact:. Can combine key descriptors for different
     * formatter styles in the fetch.
     * 
     * @return The contact key descriptor for the name delimiter.
     */
    @Generated
    @Selector("descriptorForRequiredKeysForDelimiter")
    @MappedReturn(ObjCObjectMapper.class)
    public static native CNKeyDescriptor descriptorForRequiredKeysForDelimiter();

    /**
     * The contact key descriptor required for the name order.
     * 
     * Use to fetch all contact keys required for +nameOrderForContact:. Can combine key descriptors for different
     * formatter styles in the fetch.
     * 
     * @return The contact key descriptor for the name order.
     */
    @Generated
    @Selector("descriptorForRequiredKeysForNameOrder")
    @MappedReturn(ObjCObjectMapper.class)
    public static native CNKeyDescriptor descriptorForRequiredKeysForNameOrder();
}

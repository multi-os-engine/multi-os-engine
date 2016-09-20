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
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("Contacts")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class CNContactFormatter extends NSFormatter {
    static {
        NatJ.register();
    }

    @Generated
    protected CNContactFormatter(Pointer peer) {
        super(peer);
    }

    @Generated
    @Owned
    @Selector("alloc")
    public static native CNContactFormatter alloc();

    /**
     * attributedStringFromContact:style:defaultAttributes:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Contacts/Reference/CNContactFormatter_Class/index.html#//apple_ref/occ/clm/CNContactFormatter/attributedStringFromContact:style:defaultAttributes:">iOS Dev Center</a>
     */
    @Generated
    @Selector("attributedStringFromContact:style:defaultAttributes:")
    public static native NSAttributedString attributedStringFromContactStyleDefaultAttributes(CNContact contact,
            @NInt long style, NSDictionary<?, ?> attributes);

    /**
     * delimiterForContact:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Contacts/Reference/CNContactFormatter_Class/index.html#//apple_ref/occ/clm/CNContactFormatter/delimiterForContact:">iOS Dev Center</a>
     */
    @Generated
    @Selector("delimiterForContact:")
    public static native String delimiterForContact(CNContact contact);

    /**
     * descriptorForRequiredKeysForStyle:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Contacts/Reference/CNContactFormatter_Class/index.html#//apple_ref/occ/clm/CNContactFormatter/descriptorForRequiredKeysForStyle:">iOS Dev Center</a>
     */
    @Generated
    @Selector("descriptorForRequiredKeysForStyle:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native CNKeyDescriptor descriptorForRequiredKeysForStyle(@NInt long style);

    /**
     * nameOrderForContact:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Contacts/Reference/CNContactFormatter_Class/index.html#//apple_ref/occ/clm/CNContactFormatter/nameOrderForContact:">iOS Dev Center</a>
     */
    @Generated
    @Selector("nameOrderForContact:")
    @NInt
    public static native long nameOrderForContact(CNContact contact);

    /**
     * stringFromContact:style:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Contacts/Reference/CNContactFormatter_Class/index.html#//apple_ref/occ/clm/CNContactFormatter/stringFromContact:style:">iOS Dev Center</a>
     */
    @Generated
    @Selector("stringFromContact:style:")
    public static native String stringFromContactStyle(CNContact contact, @NInt long style);

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
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * attributedStringFromContact:defaultAttributes:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Contacts/Reference/CNContactFormatter_Class/index.html#//apple_ref/occ/instm/CNContactFormatter/attributedStringFromContact:defaultAttributes:">iOS Dev Center</a>
     */
    @Generated
    @Selector("attributedStringFromContact:defaultAttributes:")
    public native NSAttributedString attributedStringFromContactDefaultAttributes(CNContact contact,
            NSDictionary<?, ?> attributes);

    @Generated
    @Selector("init")
    public native CNContactFormatter init();

    /**
     * style</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Contacts/Reference/CNContactFormatter_Class/index.html#//apple_ref/occ/instp/CNContactFormatter/style">iOS Dev Center</a>
     */
    @Generated
    @Selector("setStyle:")
    public native void setStyle(@NInt long value);

    /**
     * stringFromContact:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Contacts/Reference/CNContactFormatter_Class/index.html#//apple_ref/occ/instm/CNContactFormatter/stringFromContact:">iOS Dev Center</a>
     */
    @Generated
    @Selector("stringFromContact:")
    public native String stringFromContact(CNContact contact);

    /**
     * style</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Contacts/Reference/CNContactFormatter_Class/index.html#//apple_ref/occ/instp/CNContactFormatter/style">iOS Dev Center</a>
     */
    @Generated
    @Selector("style")
    @NInt
    public native long style();

    @Generated
    @Selector("initWithCoder:")
    public native CNContactFormatter initWithCoder(NSCoder aDecoder);
}

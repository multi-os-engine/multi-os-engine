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
import apple.foundation.NSCoder;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSPredicate;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSSecureCoding;
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
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * Specifies the search criteria to fetch contacts.
 * <p>
 * Used with [CNContactStore enumerateContactsWithFetchRequest:error:usingBlock:]. Can combine any of these options to create a contact fetch request.
 */
@Generated
@Library("Contacts")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class CNContactFetchRequest extends CNFetchRequest implements NSSecureCoding {
    static {
        NatJ.register();
    }

    @Generated
    protected CNContactFetchRequest(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native CNContactFetchRequest alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native CNContactFetchRequest allocWithZone(VoidPtr zone);

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
    public static native CNContactFetchRequest new_objc();

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
    @Selector("version")
    @NInt
    public static native long version_static();

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(NSCoder coder);

    @Generated
    @Selector("init")
    public native CNContactFetchRequest init();

    @Generated
    @Selector("initWithCoder:")
    public native CNContactFetchRequest initWithCoder(NSCoder coder);

    /**
     * Only fetch the properties that will be used.
     *
     * @param keysToFetch The properties to fetch for the returned contacts.
     */
    @Generated
    @Selector("initWithKeysToFetch:")
    public native CNContactFetchRequest initWithKeysToFetch(NSArray<?> keysToFetch);

    /**
     * The properties to fetch in the returned contacts.
     * <p>
     * Should only fetch the properties that will be used. Can combine contact keys and contact key descriptors.
     */
    @Generated
    @Selector("keysToFetch")
    public native NSArray<?> keysToFetch();

    /**
     * To return mutable contacts.
     * <p>
     * If YES returns CNMutableContact objects, otherwise returns CNContact objects. Default is NO.
     */
    @Generated
    @Selector("mutableObjects")
    public native boolean mutableObjects();

    /**
     * The predicate to match contacts against.
     * <p>
     * Use only predicates from CNContact+Predicates.h. Compound predicates are not supported. Set to nil to match all contacts.
     */
    @Generated
    @Selector("predicate")
    public native NSPredicate predicate();

    /**
     * The properties to fetch in the returned contacts.
     * <p>
     * Should only fetch the properties that will be used. Can combine contact keys and contact key descriptors.
     */
    @Generated
    @Selector("setKeysToFetch:")
    public native void setKeysToFetch(NSArray<?> value);

    /**
     * To return mutable contacts.
     * <p>
     * If YES returns CNMutableContact objects, otherwise returns CNContact objects. Default is NO.
     */
    @Generated
    @Selector("setMutableObjects:")
    public native void setMutableObjects(boolean value);

    /**
     * The predicate to match contacts against.
     * <p>
     * Use only predicates from CNContact+Predicates.h. Compound predicates are not supported. Set to nil to match all contacts.
     */
    @Generated
    @Selector("setPredicate:")
    public native void setPredicate(NSPredicate value);

    /**
     * To return contacts in a specific sort order.
     * <p>
     * Default is CNContactSortOrderNone.
     */
    @Generated
    @Selector("setSortOrder:")
    public native void setSortOrder(@NInt long value);

    /**
     * To return linked contacts as unified contacts.
     * <p>
     * If YES returns unified contacts, otherwise returns individual contacts. Default is YES.
     * <p>
     * [@note] A unified contact is the aggregation of properties from a set of linked individual contacts. If an individual contact is not linked then the unified contact is simply that individual contact.
     */
    @Generated
    @Selector("setUnifyResults:")
    public native void setUnifyResults(boolean value);

    /**
     * To return contacts in a specific sort order.
     * <p>
     * Default is CNContactSortOrderNone.
     */
    @Generated
    @Selector("sortOrder")
    @NInt
    public native long sortOrder();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    /**
     * To return linked contacts as unified contacts.
     * <p>
     * If YES returns unified contacts, otherwise returns individual contacts. Default is YES.
     * <p>
     * [@note] A unified contact is the aggregation of properties from a set of linked individual contacts. If an individual contact is not linked then the unified contact is simply that individual contact.
     */
    @Generated
    @Selector("unifyResults")
    public native boolean unifyResults();
}

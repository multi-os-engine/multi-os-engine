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

package apple.corespotlight;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSDate;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
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
@Library("CoreSpotlight")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class CSSearchableItem extends NSObject implements NSSecureCoding, NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected CSSearchableItem(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native CSSearchableItem alloc();

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
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * Set of attributes containing meta data for the item
     */
    @Generated
    @Selector("attributeSet")
    public native CSSearchableItemAttributeSet attributeSet();

    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(VoidPtr zone);

    /**
     * An optional identifier that represents the "domain" or owner of this item.
     * This might be an identifier for a mailbox in an account whose indexed data you may want to remove when the account is deleted.
     * In that case the domainIdentifier should be of the form <account-id>.<mailbox-id> where <account-id> and <mailbox-id> should not contains periods.
     * Calling deleteSearchableItemsWithDomainIdentifiers with <account-id>.<mailbox-id> will delete all items with that domain identifier.
     * Calling deleteSearchableItemsWithDomainIdentifiers with <account-id> will delete all items with <account-id> and any <mailbox-id>.
     */
    @Generated
    @Selector("domainIdentifier")
    public native String domainIdentifier();

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(NSCoder coder);

    /**
     * Searchable items have an expiration date or time to live.  By default it's set to 1 month.
     */
    @Generated
    @Selector("expirationDate")
    public native NSDate expirationDate();

    @Generated
    @Selector("init")
    public native CSSearchableItem init();

    @Generated
    @Selector("initWithCoder:")
    public native CSSearchableItem initWithCoder(NSCoder coder);

    /**
     * Can be null, one will be generated
     */
    @Generated
    @Selector("initWithUniqueIdentifier:domainIdentifier:attributeSet:")
    public native CSSearchableItem initWithUniqueIdentifierDomainIdentifierAttributeSet(String uniqueIdentifier,
            String domainIdentifier, CSSearchableItemAttributeSet attributeSet);

    /**
     * Set of attributes containing meta data for the item
     */
    @Generated
    @Selector("setAttributeSet:")
    public native void setAttributeSet(CSSearchableItemAttributeSet value);

    /**
     * An optional identifier that represents the "domain" or owner of this item.
     * This might be an identifier for a mailbox in an account whose indexed data you may want to remove when the account is deleted.
     * In that case the domainIdentifier should be of the form <account-id>.<mailbox-id> where <account-id> and <mailbox-id> should not contains periods.
     * Calling deleteSearchableItemsWithDomainIdentifiers with <account-id>.<mailbox-id> will delete all items with that domain identifier.
     * Calling deleteSearchableItemsWithDomainIdentifiers with <account-id> will delete all items with <account-id> and any <mailbox-id>.
     */
    @Generated
    @Selector("setDomainIdentifier:")
    public native void setDomainIdentifier(String value);

    /**
     * Searchable items have an expiration date or time to live.  By default it's set to 1 month.
     */
    @Generated
    @Selector("setExpirationDate:")
    public native void setExpirationDate(NSDate value);

    /**
     * Should be unique to your application group.
     * REQUIRED since this is the way you will refer to the item to update the index / delete it from the index
     * Starts with an UUID for ease of use, but you can replace it with an UID of your own before the item is first indexed if you wish.
     */
    @Generated
    @Selector("setUniqueIdentifier:")
    public native void setUniqueIdentifier(String value);

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    /**
     * Should be unique to your application group.
     * REQUIRED since this is the way you will refer to the item to update the index / delete it from the index
     * Starts with an UUID for ease of use, but you can replace it with an UID of your own before the item is first indexed if you wish.
     */
    @Generated
    @Selector("uniqueIdentifier")
    public native String uniqueIdentifier();
}

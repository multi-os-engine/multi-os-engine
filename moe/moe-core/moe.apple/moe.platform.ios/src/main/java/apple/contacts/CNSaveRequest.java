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
 * Specifies the changes to save.
 * <p>
 * Create a new save request for each save execution on the contact store. Can have many changes batched into one save
 * request. Do not access objects in the save request when it is executing. A save request only applies the changes to
 * the objects. If there are overlapping changes with multiple, concurrent CNSaveRequests then the last saved change
 * wins.
 * <p>
 * If adding an object (contact, group, container) and it is already in the contact store then the executing save
 * request will fail to add that object and will return the error CNErrorCodeInsertedRecordAlreadyExists with
 * CNErrorUserInfoAffectedRecordsKey value as an array containing that object.
 * <p>
 * If updating/deleting an object (contact, group, container) and it is not in the contact store then the executing save
 * request will fail to update/delete that object and will return the error CNErrorCodeRecordDoesNotExist with
 * CNErrorUserInfoAffectedRecordsKey value as an array containing that object.
 */
@Generated
@Library("Contacts")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class CNSaveRequest extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected CNSaveRequest(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native CNSaveRequest alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native CNSaveRequest allocWithZone(VoidPtr zone);

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
    public static native CNSaveRequest new_objc();

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
     * Add a new contact to the contact store.
     * <p>
     * The contact may be modified by the executing save request. If the contact was previously specified to be deleted
     * in the save request that will no longer occur.
     *
     * @param contact    The new contact to add.
     * @param identifier The container identifier to add the new contact to. Set to nil for the default container.
     */
    @Generated
    @Selector("addContact:toContainerWithIdentifier:")
    public native void addContactToContainerWithIdentifier(CNMutableContact contact, String identifier);

    /**
     * Add a new group to the contact store.
     * <p>
     * If the group was previously specified to be deleted in the save request that will no longer occur.
     *
     * @param group      The new group to add.
     * @param identifier The container identifier to add the new group to. Set to nil for the default container.
     */
    @Generated
    @Selector("addGroup:toContainerWithIdentifier:")
    public native void addGroupToContainerWithIdentifier(CNMutableGroup group, String identifier);

    /**
     * Add a new member to a group.
     * <p>
     * If the membership was previously specified to be deleted in the save request that will no longer occur.
     *
     * @param contact The new member to add to the group.
     * @param group   The group to add the member to.
     */
    @Generated
    @Selector("addMember:toGroup:")
    public native void addMemberToGroup(CNContact contact, CNGroup group);

    /**
     * Delete a contact from the contact store.
     * <p>
     * If the contact was previously specified to be added in the save request that will no longer occur.
     */
    @Generated
    @Selector("deleteContact:")
    public native void deleteContact(CNMutableContact contact);

    /**
     * Delete a group from the contact store.
     * <p>
     * The contacts in the group are not deleted. If the group was previously specified to be added in the save request
     * that will no longer occur.
     */
    @Generated
    @Selector("deleteGroup:")
    public native void deleteGroup(CNMutableGroup group);

    @Generated
    @Selector("init")
    public native CNSaveRequest init();

    /**
     * Remove a member from a group.
     * <p>
     * The contact is not deleted. It is only removed as a member of the group. If the membership was previously
     * specified to be added in the save request that will no longer occur.
     *
     * @param contact The member to remove from the group.
     * @param group   The group to remove the member from.
     */
    @Generated
    @Selector("removeMember:fromGroup:")
    public native void removeMemberFromGroup(CNContact contact, CNGroup group);

    /**
     * Update an existing contact in the contact store.
     * <p>
     * The contact must already exist in the contact store. The contact may be modified by the executing save request.
     */
    @Generated
    @Selector("updateContact:")
    public native void updateContact(CNMutableContact contact);

    /**
     * Update an existing group in the contact store.
     * <p>
     * The group must already exist in the contact store.
     */
    @Generated
    @Selector("updateGroup:")
    public native void updateGroup(CNMutableGroup group);

    /**
     * The author of this transaction.
     * <p>
     * Use this, in conjunction with @c CNChangeHistoryFetchRequest.excludedTransactionAuthors,
     * to suppress fetching of changes the author already knows about.
     */
    @Generated
    @Selector("setTransactionAuthor:")
    public native void setTransactionAuthor(String value);

    /**
     * The author of this transaction.
     * <p>
     * Use this, in conjunction with @c CNChangeHistoryFetchRequest.excludedTransactionAuthors,
     * to suppress fetching of changes the author already knows about.
     */
    @Generated
    @Selector("transactionAuthor")
    public native String transactionAuthor();
}

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

package apple.contactsui;

import apple.NSObject;
import apple.contacts.CNContact;
import apple.contacts.CNContactStore;
import apple.contacts.CNContainer;
import apple.contacts.CNGroup;
import apple.contacts.protocol.CNKeyDescriptor;
import apple.contactsui.protocol.CNContactViewControllerDelegate;
import apple.foundation.NSArray;
import apple.foundation.NSBundle;
import apple.foundation.NSCoder;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.uikit.UIViewController;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * The @c CNContactViewController is used to display a contact.
 * 
 * This class can display a new contact, unknown contact or existing contact.
 * You must use one of the class factory methods.
 * 
 * API-Since: 9.0
 */
@Generated
@Library("ContactsUI")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class CNContactViewController extends UIViewController {
    static {
        NatJ.register();
    }

    @Generated
    protected CNContactViewController(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native CNContactViewController alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native CNContactViewController allocWithZone(VoidPtr zone);

    @Deprecated
    @Generated
    @Selector("attemptRotationToDeviceOrientation")
    public static native void attemptRotationToDeviceOrientation();

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

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
    @Selector("classFallbacksForKeyedArchiver")
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @NotNull
    @Generated
    @Selector("classForKeyedUnarchiver")
    public static native Class classForKeyedUnarchiver();

    @Generated
    @Selector("clearTextInputContextIdentifier:")
    public static native void clearTextInputContextIdentifier(@NotNull String identifier);

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * Descriptor for all keys that must be fetched on a contact before setting it on the view controller.
     * 
     * If you want to display an existing contact in a @c CNContactViewController,
     * this descriptor must have been included in the @c keysToFetch property of the
     * [@c] CNContactFetchRequest. (A newly created @c CNMutableContact may be used safely.)
     */
    @NotNull
    @Generated
    @Selector("descriptorForRequiredKeys")
    @MappedReturn(ObjCObjectMapper.class)
    public static native CNKeyDescriptor descriptorForRequiredKeys();

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

    @Generated
    @Owned
    @Selector("new")
    public static native CNContactViewController new_objc();

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
     * Initializes a contact view controller for a known contact.
     * 
     * Use this view controller for a contact that has been fetched
     * from the user’s contacts database.
     * Allows editing of the contact by default.
     * [@note] All keys of the given contact must be fetched.
     * 
     * @see contactStore
     * @see allowsEditing
     */
    @Generated
    @Selector("viewControllerForContact:")
    public static native CNContactViewController viewControllerForContact(@NotNull CNContact contact);

    /**
     * Initializes a contact view controller for creating a new contact.
     * 
     * Use this view controller with a contact to be added to the user's contacts.
     * [@note] The given contact should be a newly initialized contact and
     * not one fetched from the user's contacts.
     */
    @Generated
    @Selector("viewControllerForNewContact:")
    public static native CNContactViewController viewControllerForNewContact(@Nullable CNContact contact);

    /**
     * Initializes a contact view controller for an unknown contact.
     * 
     * Use this view controller for a populated contact not fetched from the user’s contacts.
     * Such a contact might be obtained by parsing a vCard or setting properties on a newly
     * created @c CNMutableContact.
     * This controller does not allow editing, but by default does allow actions
     * for adding the contact to the contacts database.
     * 
     * @see contactStore
     */
    @Generated
    @Selector("viewControllerForUnknownContact:")
    public static native CNContactViewController viewControllerForUnknownContact(@NotNull CNContact contact);

    /**
     * YES by default
     */
    @Generated
    @Selector("allowsActions")
    public native boolean allowsActions();

    /**
     * YES by default
     */
    @Generated
    @Selector("allowsEditing")
    public native boolean allowsEditing();

    /**
     * The name to use if the contact has no display name.
     */
    @Nullable
    @Generated
    @Selector("alternateName")
    public native String alternateName();

    /**
     * The contact being displayed.
     */
    @NotNull
    @Generated
    @Selector("contact")
    public native CNContact contact();

    /**
     * The @c CNContactStore where the contact was fetched from or will be saved to.
     * 
     * If @c contactStore is not set, actions for adding the contact to the
     * user's contacts are disabled. This does not affect the ability to edit
     * the contact.
     * 
     * If the user edits the contact and the editing is committed, the contact
     * will be updated in the user's contacts database or added to the user's
     * contacts database if not already present.
     * 
     * To prevent editing of a known contact, set @c allowsEditing to @c NO.
     * 
     * @see allowsEditing
     */
    @Nullable
    @Generated
    @Selector("contactStore")
    public native CNContactStore contactStore();

    /**
     * The delegate to be notified.
     */
    @Nullable
    @Generated
    @Selector("delegate")
    @MappedReturn(ObjCObjectMapper.class)
    public native CNContactViewControllerDelegate delegate();

    /**
     * The @c CNContact property keys to display.
     * 
     * If @c nil, all properties are displayed. (The property is @c nil by default.)
     * [@note] All properties are visible when editing the contact.
     */
    @Nullable
    @Generated
    @Selector("displayedPropertyKeys")
    public native NSArray<?> displayedPropertyKeys();

    /**
     * Highlight a property.
     * 
     * Indicates whether to highlight a certain property value for the contact.
     * If a single value property key is specified, identifier will be ignored.
     */
    @Generated
    @Selector("highlightPropertyWithKey:identifier:")
    public native void highlightPropertyWithKeyIdentifier(@NotNull String key, @Nullable String identifier);

    @Generated
    @Selector("init")
    public native CNContactViewController init();

    @Generated
    @Selector("initWithCoder:")
    public native CNContactViewController initWithCoder(@NotNull NSCoder coder);

    @Generated
    @Selector("initWithNibName:bundle:")
    public native CNContactViewController initWithNibNameBundle(@Nullable String nibNameOrNil,
            @Nullable NSBundle nibBundleOrNil);

    /**
     * The message to display under the name.
     */
    @Nullable
    @Generated
    @Selector("message")
    public native String message();

    /**
     * A @c CNContainer where the new contact will be created.
     * 
     * If not set the contact is added to the default container.
     */
    @Nullable
    @Generated
    @Selector("parentContainer")
    public native CNContainer parentContainer();

    /**
     * A @c CNGroup where the new contact will be assigned membership.
     * 
     * If not set the contact is added only to the default @c CNContainer with no group membership.
     * [@note] When set to a group not in the default container, the container
     * property must also be set to the container of parentGroup.
     */
    @Nullable
    @Generated
    @Selector("parentGroup")
    public native CNGroup parentGroup();

    /**
     * YES by default
     */
    @Generated
    @Selector("setAllowsActions:")
    public native void setAllowsActions(boolean value);

    /**
     * YES by default
     */
    @Generated
    @Selector("setAllowsEditing:")
    public native void setAllowsEditing(boolean value);

    /**
     * The name to use if the contact has no display name.
     */
    @Generated
    @Selector("setAlternateName:")
    public native void setAlternateName(@Nullable String value);

    /**
     * The @c CNContactStore where the contact was fetched from or will be saved to.
     * 
     * If @c contactStore is not set, actions for adding the contact to the
     * user's contacts are disabled. This does not affect the ability to edit
     * the contact.
     * 
     * If the user edits the contact and the editing is committed, the contact
     * will be updated in the user's contacts database or added to the user's
     * contacts database if not already present.
     * 
     * To prevent editing of a known contact, set @c allowsEditing to @c NO.
     * 
     * @see allowsEditing
     */
    @Generated
    @Selector("setContactStore:")
    public native void setContactStore(@Nullable CNContactStore value);

    /**
     * The delegate to be notified.
     */
    @Generated
    @Selector("setDelegate:")
    public native void setDelegate_unsafe(
            @Nullable @Mapped(ObjCObjectMapper.class) CNContactViewControllerDelegate value);

    /**
     * The delegate to be notified.
     */
    @Generated
    public void setDelegate(@Nullable @Mapped(ObjCObjectMapper.class) CNContactViewControllerDelegate value) {
        Object __old = delegate();
        if (value != null) {
            org.moe.natj.objc.ObjCRuntime.associateObjCObject(this, value);
        }
        setDelegate_unsafe(value);
        if (__old != null) {
            org.moe.natj.objc.ObjCRuntime.dissociateObjCObject(this, __old);
        }
    }

    /**
     * The @c CNContact property keys to display.
     * 
     * If @c nil, all properties are displayed. (The property is @c nil by default.)
     * [@note] All properties are visible when editing the contact.
     */
    @Generated
    @Selector("setDisplayedPropertyKeys:")
    public native void setDisplayedPropertyKeys(@Nullable NSArray<?> value);

    /**
     * The message to display under the name.
     */
    @Generated
    @Selector("setMessage:")
    public native void setMessage(@Nullable String value);

    /**
     * A @c CNContainer where the new contact will be created.
     * 
     * If not set the contact is added to the default container.
     */
    @Generated
    @Selector("setParentContainer:")
    public native void setParentContainer(@Nullable CNContainer value);

    /**
     * A @c CNGroup where the new contact will be assigned membership.
     * 
     * If not set the contact is added only to the default @c CNContainer with no group membership.
     * [@note] When set to a group not in the default container, the container
     * property must also be set to the container of parentGroup.
     */
    @Generated
    @Selector("setParentGroup:")
    public native void setParentGroup(@Nullable CNGroup value);

    /**
     * NO by default
     */
    @Generated
    @Selector("setShouldShowLinkedContacts:")
    public native void setShouldShowLinkedContacts(boolean value);

    /**
     * NO by default
     */
    @Generated
    @Selector("shouldShowLinkedContacts")
    public native boolean shouldShowLinkedContacts();
}

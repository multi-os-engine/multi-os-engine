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

package apple.addressbookui;

import apple.NSObject;
import apple.addressbookui.protocol.ABPeoplePickerNavigationControllerDelegate;
import apple.foundation.NSArray;
import apple.foundation.NSBundle;
import apple.foundation.NSCoder;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSNumber;
import apple.foundation.NSPredicate;
import apple.foundation.NSSet;
import apple.uikit.UINavigationController;
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
import org.moe.natj.general.ptr.ConstVoidPtr;
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
 * API-Since: 2.0
 * Deprecated-Since: 9.0
 * Deprecated-Message: Use CNContactPickerViewController from ContactsUI.framework instead
 */
@Deprecated
@Generated
@Library("AddressBookUI")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class ABPeoplePickerNavigationController extends UINavigationController {
    static {
        NatJ.register();
    }

    @Generated
    protected ABPeoplePickerNavigationController(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native ABPeoplePickerNavigationController alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native ABPeoplePickerNavigationController allocWithZone(VoidPtr zone);

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
    public static native ABPeoplePickerNavigationController new_objc();

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
     * The Address Book to browse. Contacts will be returned from this ABAddressBook instance.
     * If not set, a new ABAddressBook will be created the first time the property is accessed.
     * Note this property is only used if the app has access to the user's contacts, otherwise it remains NULL.
     */
    @Nullable
    @Generated
    @Selector("addressBook")
    public native ConstVoidPtr addressBook();

    /**
     * An array of ABPropertyIDs listing the properties that should be visible when viewing a person.
     * If you are interested in one particular type of data (for example a phone number), displayedProperties
     * should be an array with a single NSNumber instance (representing kABPersonPhoneProperty).
     * Note that name information will always be shown if available.
     */
    @Nullable
    @Generated
    @Selector("displayedProperties")
    public native NSArray<? extends NSNumber> displayedProperties();

    @Generated
    @Selector("init")
    public native ABPeoplePickerNavigationController init();

    @Generated
    @Selector("initWithCoder:")
    public native ABPeoplePickerNavigationController initWithCoder(@NotNull NSCoder coder);

    @Generated
    @Selector("initWithNavigationBarClass:toolbarClass:")
    public native ABPeoplePickerNavigationController initWithNavigationBarClassToolbarClass(
            @Nullable Class navigationBarClass, @Nullable Class toolbarClass);

    @Generated
    @Selector("initWithNibName:bundle:")
    public native ABPeoplePickerNavigationController initWithNibNameBundle(@Nullable String nibNameOrNil,
            @Nullable NSBundle nibBundleOrNil);

    @Generated
    @Selector("initWithRootViewController:")
    public native ABPeoplePickerNavigationController initWithRootViewController(
            @NotNull UIViewController rootViewController);

    /**
     * Optional to get the selected contact, selected property or cancellation of the people picker.
     */
    @Nullable
    @Generated
    @Selector("peoplePickerDelegate")
    @MappedReturn(ObjCObjectMapper.class)
    public native ABPeoplePickerNavigationControllerDelegate peoplePickerDelegate();

    /**
     * Optionally determines if a person can be selected or not.
     * If not set, all persons will be selectable.
     * 
     * 
     * API-Since: 8.0
     */
    @Nullable
    @Generated
    @Selector("predicateForEnablingPerson")
    public native NSPredicate predicateForEnablingPerson();

    /**
     * Optionally determines if a selected person should be returned to the app (predicate evaluates to TRUE),
     * or if the selected person should be displayed (predicate evaluates to FALSE).
     * If not set and -peoplePickerNavigationController:didSelectPerson: is implemented the selected person is returned
     * to the app,
     * or if not set and -peoplePickerNavigationController:didSelectPerson:identifier: is implemented the selected
     * person is displayed.
     * 
     * 
     * API-Since: 8.0
     */
    @Nullable
    @Generated
    @Selector("predicateForSelectionOfPerson")
    public native NSPredicate predicateForSelectionOfPerson();

    /**
     * Optionally determines if a selected property should be returned to the app (predicate evaluates to TRUE),
     * or if the default action for the property should be performed (predicate evaluates to FALSE).
     * If not set and -peoplePickerNavigationController:didSelectPerson:identifier: is implemented the selected property
     * is returned to the app.
     * 
     * 
     * API-Since: 8.0
     */
    @Nullable
    @Generated
    @Selector("predicateForSelectionOfProperty")
    public native NSPredicate predicateForSelectionOfProperty();

    /**
     * The Address Book to browse. Contacts will be returned from this ABAddressBook instance.
     * If not set, a new ABAddressBook will be created the first time the property is accessed.
     * Note this property is only used if the app has access to the user's contacts, otherwise it remains NULL.
     */
    @Generated
    @Selector("setAddressBook:")
    public native void setAddressBook(@Nullable ConstVoidPtr value);

    /**
     * An array of ABPropertyIDs listing the properties that should be visible when viewing a person.
     * If you are interested in one particular type of data (for example a phone number), displayedProperties
     * should be an array with a single NSNumber instance (representing kABPersonPhoneProperty).
     * Note that name information will always be shown if available.
     */
    @Generated
    @Selector("setDisplayedProperties:")
    public native void setDisplayedProperties(@Nullable NSArray<? extends NSNumber> value);

    /**
     * Optional to get the selected contact, selected property or cancellation of the people picker.
     */
    @Generated
    @Selector("setPeoplePickerDelegate:")
    public native void setPeoplePickerDelegate_unsafe(
            @Nullable @Mapped(ObjCObjectMapper.class) ABPeoplePickerNavigationControllerDelegate value);

    /**
     * Optional to get the selected contact, selected property or cancellation of the people picker.
     */
    @Generated
    public void setPeoplePickerDelegate(
            @Nullable @Mapped(ObjCObjectMapper.class) ABPeoplePickerNavigationControllerDelegate value) {
        Object __old = peoplePickerDelegate();
        if (value != null) {
            org.moe.natj.objc.ObjCRuntime.associateObjCObject(this, value);
        }
        setPeoplePickerDelegate_unsafe(value);
        if (__old != null) {
            org.moe.natj.objc.ObjCRuntime.dissociateObjCObject(this, __old);
        }
    }

    /**
     * Optionally determines if a person can be selected or not.
     * If not set, all persons will be selectable.
     * 
     * 
     * API-Since: 8.0
     */
    @Generated
    @Selector("setPredicateForEnablingPerson:")
    public native void setPredicateForEnablingPerson(@Nullable NSPredicate value);

    /**
     * Optionally determines if a selected person should be returned to the app (predicate evaluates to TRUE),
     * or if the selected person should be displayed (predicate evaluates to FALSE).
     * If not set and -peoplePickerNavigationController:didSelectPerson: is implemented the selected person is returned
     * to the app,
     * or if not set and -peoplePickerNavigationController:didSelectPerson:identifier: is implemented the selected
     * person is displayed.
     * 
     * 
     * API-Since: 8.0
     */
    @Generated
    @Selector("setPredicateForSelectionOfPerson:")
    public native void setPredicateForSelectionOfPerson(@Nullable NSPredicate value);

    /**
     * Optionally determines if a selected property should be returned to the app (predicate evaluates to TRUE),
     * or if the default action for the property should be performed (predicate evaluates to FALSE).
     * If not set and -peoplePickerNavigationController:didSelectPerson:identifier: is implemented the selected property
     * is returned to the app.
     * 
     * 
     * API-Since: 8.0
     */
    @Generated
    @Selector("setPredicateForSelectionOfProperty:")
    public native void setPredicateForSelectionOfProperty(@Nullable NSPredicate value);
}

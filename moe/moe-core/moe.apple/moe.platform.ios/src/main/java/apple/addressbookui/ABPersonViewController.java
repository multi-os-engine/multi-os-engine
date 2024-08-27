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
import apple.addressbookui.protocol.ABPersonViewControllerDelegate;
import apple.foundation.NSArray;
import apple.foundation.NSBundle;
import apple.foundation.NSCoder;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSNumber;
import apple.foundation.NSSet;
import apple.uikit.UIViewController;
import apple.uikit.protocol.UIViewControllerRestoration;
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
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * API-Since: 2.0
 * Deprecated-Since: 9.0
 * Deprecated-Message: Use +[CNContactViewController viewControllerForContact:] from ContactsUI.framework instead
 */
@Deprecated
@Generated
@Library("AddressBookUI")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class ABPersonViewController extends UIViewController implements UIViewControllerRestoration {
    static {
        NatJ.register();
    }

    @Generated
    protected ABPersonViewController(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native ABPersonViewController alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native ABPersonViewController allocWithZone(VoidPtr zone);

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
    public static native ABPersonViewController new_objc();

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

    @Nullable
    @Generated
    @Selector("viewControllerWithRestorationIdentifierPath:coder:")
    public static native UIViewController viewControllerWithRestorationIdentifierPathCoder(
            @NotNull NSArray<String> identifierComponents, @NotNull NSCoder coder);

    /**
     * The Address Book to use. Any contact returned will be from this ABAddressBook instance.
     * If not set, a new ABAddressBook will be created the first time the property is accessed.
     */
    @Nullable
    @Generated
    @Selector("addressBook")
    public native ConstVoidPtr addressBook();

    /**
     * Specifies whether buttons appear to let the user perform actions such as sharing the contact,
     * initiating a FaceTime call, or sending a text message.
     * 
     * API-Since: 4.0
     */
    @Generated
    @Selector("allowsActions")
    public native boolean allowsActions();

    /**
     * Indicates whether an edit/save button should be shown.
     */
    @Generated
    @Selector("allowsEditing")
    public native boolean allowsEditing();

    /**
     * If displayedPerson has been added to an ABAddressBook, then the addressBook
     * property will be updated to use the displayedPerson's ABAddressBook.
     */
    @NotNull
    @Generated
    @Selector("displayedPerson")
    public native ConstVoidPtr displayedPerson();

    /**
     * An array of NSNumber instances representing the properties (ABPropertyID) that should
     * be visible when viewing the person. Note that all the properties are visible when
     * editing a person.
     */
    @Nullable
    @Generated
    @Selector("displayedProperties")
    public native NSArray<? extends NSNumber> displayedProperties();

    @Generated
    @Selector("init")
    public native ABPersonViewController init();

    @Generated
    @Selector("initWithCoder:")
    public native ABPersonViewController initWithCoder(@NotNull NSCoder coder);

    @Generated
    @Selector("initWithNibName:bundle:")
    public native ABPersonViewController initWithNibNameBundle(@Nullable String nibNameOrNil,
            @Nullable NSBundle nibBundleOrNil);

    /**
     * ABPersonViewController does not support subclassing in iOS 7.0 and later. A nil instance will be returned.
     */
    @Nullable
    @Generated
    @Selector("personViewDelegate")
    @MappedReturn(ObjCObjectMapper.class)
    public native ABPersonViewControllerDelegate personViewDelegate();

    /**
     * The Address Book to use. Any contact returned will be from this ABAddressBook instance.
     * If not set, a new ABAddressBook will be created the first time the property is accessed.
     */
    @Generated
    @Selector("setAddressBook:")
    public native void setAddressBook(@Nullable ConstVoidPtr value);

    /**
     * Specifies whether buttons appear to let the user perform actions such as sharing the contact,
     * initiating a FaceTime call, or sending a text message.
     * 
     * API-Since: 4.0
     */
    @Generated
    @Selector("setAllowsActions:")
    public native void setAllowsActions(boolean value);

    /**
     * Indicates whether an edit/save button should be shown.
     */
    @Generated
    @Selector("setAllowsEditing:")
    public native void setAllowsEditing(boolean value);

    /**
     * If displayedPerson has been added to an ABAddressBook, then the addressBook
     * property will be updated to use the displayedPerson's ABAddressBook.
     */
    @Generated
    @Selector("setDisplayedPerson:")
    public native void setDisplayedPerson(@NotNull ConstVoidPtr value);

    /**
     * An array of NSNumber instances representing the properties (ABPropertyID) that should
     * be visible when viewing the person. Note that all the properties are visible when
     * editing a person.
     */
    @Generated
    @Selector("setDisplayedProperties:")
    public native void setDisplayedProperties(@Nullable NSArray<? extends NSNumber> value);

    /**
     * Indicates whether to highlight a certain value for the displayedPerson,
     * if a single value property is specified, identifier will be ignored.
     */
    @Generated
    @Selector("setHighlightedItemForProperty:withIdentifier:")
    public native void setHighlightedItemForPropertyWithIdentifier(int property, int identifier);

    /**
     * ABPersonViewController does not support subclassing in iOS 7.0 and later. A nil instance will be returned.
     */
    @Generated
    @Selector("setPersonViewDelegate:")
    public native void setPersonViewDelegate_unsafe(
            @Nullable @Mapped(ObjCObjectMapper.class) ABPersonViewControllerDelegate value);

    /**
     * ABPersonViewController does not support subclassing in iOS 7.0 and later. A nil instance will be returned.
     */
    @Generated
    public void setPersonViewDelegate(@Nullable @Mapped(ObjCObjectMapper.class) ABPersonViewControllerDelegate value) {
        Object __old = personViewDelegate();
        if (value != null) {
            org.moe.natj.objc.ObjCRuntime.associateObjCObject(this, value);
        }
        setPersonViewDelegate_unsafe(value);
        if (__old != null) {
            org.moe.natj.objc.ObjCRuntime.dissociateObjCObject(this, __old);
        }
    }

    /**
     * Indicates whether to show data from people linked to the displayedPerson, defaults to NO
     * 
     * API-Since: 4.0
     */
    @Generated
    @Selector("setShouldShowLinkedPeople:")
    public native void setShouldShowLinkedPeople(boolean value);

    /**
     * Indicates whether to show data from people linked to the displayedPerson, defaults to NO
     * 
     * API-Since: 4.0
     */
    @Generated
    @Selector("shouldShowLinkedPeople")
    public native boolean shouldShowLinkedPeople();

    @Nullable
    @Generated
    @ProtocolClassMethod("viewControllerWithRestorationIdentifierPathCoder")
    public UIViewController _viewControllerWithRestorationIdentifierPathCoder(
            @NotNull NSArray<String> identifierComponents, @NotNull NSCoder coder) {
        return viewControllerWithRestorationIdentifierPathCoder(identifierComponents, coder);
    }

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}

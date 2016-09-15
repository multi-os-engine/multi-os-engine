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

    /**
     * addressBook</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AddressBookUI/Reference/ABPersonViewController_Class/index.html#//apple_ref/occ/instp/ABPersonViewController/addressBook">iOS Dev Center</a>
     */
    @Generated
    @Selector("addressBook")
    public native ConstVoidPtr addressBook();

    @Generated
    @Owned
    @Selector("alloc")
    public static native ABPersonViewController alloc();

    /**
     * allowsActions</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AddressBookUI/Reference/ABPersonViewController_Class/index.html#//apple_ref/occ/instp/ABPersonViewController/allowsActions">iOS Dev Center</a>
     */
    @Generated
    @Selector("allowsActions")
    public native boolean allowsActions();

    /**
     * allowsEditing</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AddressBookUI/Reference/ABPersonViewController_Class/index.html#//apple_ref/occ/instp/ABPersonViewController/allowsEditing">iOS Dev Center</a>
     */
    @Generated
    @Selector("allowsEditing")
    public native boolean allowsEditing();

    /**
     * displayedPerson</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AddressBookUI/Reference/ABPersonViewController_Class/index.html#//apple_ref/occ/instp/ABPersonViewController/displayedPerson">iOS Dev Center</a>
     */
    @Generated
    @Selector("displayedPerson")
    public native ConstVoidPtr displayedPerson();

    /**
     * displayedProperties</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AddressBookUI/Reference/ABPersonViewController_Class/index.html#//apple_ref/occ/instp/ABPersonViewController/displayedProperties">iOS Dev Center</a>
     */
    @Generated
    @Selector("displayedProperties")
    public native NSArray<? extends NSNumber> displayedProperties();

    @Generated
    @Selector("init")
    public native ABPersonViewController init();

    @Generated
    @Selector("initWithNibName:bundle:")
    public native ABPersonViewController initWithNibNameBundle(String nibNameOrNil, NSBundle nibBundleOrNil);

    /**
     * personViewDelegate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AddressBookUI/Reference/ABPersonViewController_Class/index.html#//apple_ref/occ/instp/ABPersonViewController/personViewDelegate">iOS Dev Center</a>
     */
    @Generated
    @Selector("personViewDelegate")
    @MappedReturn(ObjCObjectMapper.class)
    public native ABPersonViewControllerDelegate personViewDelegate();

    /**
     * addressBook</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AddressBookUI/Reference/ABPersonViewController_Class/index.html#//apple_ref/occ/instp/ABPersonViewController/addressBook">iOS Dev Center</a>
     */
    @Generated
    @Selector("setAddressBook:")
    public native void setAddressBook(ConstVoidPtr value);

    /**
     * allowsActions</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AddressBookUI/Reference/ABPersonViewController_Class/index.html#//apple_ref/occ/instp/ABPersonViewController/allowsActions">iOS Dev Center</a>
     */
    @Generated
    @Selector("setAllowsActions:")
    public native void setAllowsActions(boolean value);

    /**
     * allowsEditing</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AddressBookUI/Reference/ABPersonViewController_Class/index.html#//apple_ref/occ/instp/ABPersonViewController/allowsEditing">iOS Dev Center</a>
     */
    @Generated
    @Selector("setAllowsEditing:")
    public native void setAllowsEditing(boolean value);

    /**
     * displayedPerson</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AddressBookUI/Reference/ABPersonViewController_Class/index.html#//apple_ref/occ/instp/ABPersonViewController/displayedPerson">iOS Dev Center</a>
     */
    @Generated
    @Selector("setDisplayedPerson:")
    public native void setDisplayedPerson(ConstVoidPtr value);

    /**
     * displayedProperties</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AddressBookUI/Reference/ABPersonViewController_Class/index.html#//apple_ref/occ/instp/ABPersonViewController/displayedProperties">iOS Dev Center</a>
     */
    @Generated
    @Selector("setDisplayedProperties:")
    public native void setDisplayedProperties(NSArray<? extends NSNumber> value);

    /**
     * setHighlightedItemForProperty:withIdentifier:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AddressBookUI/Reference/ABPersonViewController_Class/index.html#//apple_ref/occ/instm/ABPersonViewController/setHighlightedItemForProperty:withIdentifier:">iOS Dev Center</a>
     */
    @Generated
    @Selector("setHighlightedItemForProperty:withIdentifier:")
    public native void setHighlightedItemForPropertyWithIdentifier(int property, int identifier);

    /**
     * personViewDelegate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AddressBookUI/Reference/ABPersonViewController_Class/index.html#//apple_ref/occ/instp/ABPersonViewController/personViewDelegate">iOS Dev Center</a>
     */
    @Generated
    @Selector("setPersonViewDelegate:")
    public native void setPersonViewDelegate_unsafe(
            @Mapped(ObjCObjectMapper.class) ABPersonViewControllerDelegate value);

    /**
     * personViewDelegate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AddressBookUI/Reference/ABPersonViewController_Class/index.html#//apple_ref/occ/instp/ABPersonViewController/personViewDelegate">iOS Dev Center</a>
     */
    @Generated
    public void setPersonViewDelegate(@Mapped(ObjCObjectMapper.class) ABPersonViewControllerDelegate value) {
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
     * shouldShowLinkedPeople</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AddressBookUI/Reference/ABPersonViewController_Class/index.html#//apple_ref/occ/instp/ABPersonViewController/shouldShowLinkedPeople">iOS Dev Center</a>
     */
    @Generated
    @Selector("setShouldShowLinkedPeople:")
    public native void setShouldShowLinkedPeople(boolean value);

    /**
     * shouldShowLinkedPeople</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AddressBookUI/Reference/ABPersonViewController_Class/index.html#//apple_ref/occ/instp/ABPersonViewController/shouldShowLinkedPeople">iOS Dev Center</a>
     */
    @Generated
    @Selector("shouldShowLinkedPeople")
    public native boolean shouldShowLinkedPeople();

    @Generated
    @Selector("viewControllerWithRestorationIdentifierPath:coder:")
    public static native UIViewController viewControllerWithRestorationIdentifierPathCoder(
            NSArray<?> identifierComponents, NSCoder coder);

    @Generated
    @ProtocolClassMethod("viewControllerWithRestorationIdentifierPathCoder")
    public UIViewController _viewControllerWithRestorationIdentifierPathCoder(NSArray<?> identifierComponents,
            NSCoder coder) {
        return viewControllerWithRestorationIdentifierPathCoder(identifierComponents, coder);
    }

    @Generated
    @Selector("initWithCoder:")
    public native ABPersonViewController initWithCoder(NSCoder aDecoder);

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Selector("allocWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object allocWithZone(VoidPtr zone);

    @Generated
    @Selector("attemptRotationToDeviceOrientation")
    public static native void attemptRotationToDeviceOrientation();

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
    @Selector("clearTextInputContextIdentifier:")
    public static native void clearTextInputContextIdentifier(String identifier);

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
    @Selector("prepareInterstitialAds")
    public static native void prepareInterstitialAds();

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
}

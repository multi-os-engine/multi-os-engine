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
import apple.addressbookui.protocol.ABNewPersonViewControllerDelegate;
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
import org.moe.natj.general.ptr.ConstVoidPtr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("AddressBookUI")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class ABNewPersonViewController extends UIViewController {
    static {
        NatJ.register();
    }

    @Generated
    protected ABNewPersonViewController(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native ABNewPersonViewController alloc();

    @Generated
    @Selector("allocWithZone:")
    public static native ABNewPersonViewController allocWithZone(VoidPtr zone);

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
    public static native ABNewPersonViewController new_objc();

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
     * The Address Book to use. Any contact returned will be from this ABAddressBook instance.
     * If not set, a new ABAddressBook will be created the first time the property is accessed.
     */
    @Generated
    @Selector("addressBook")
    public native ConstVoidPtr addressBook();

    /**
     * Specify a displayedPerson to prefill some fields in the card. This is optional.
     * If displayedPerson has been added to an ABAddressBook, then the addressBook
     * property will be updated to use the displayedPerson's ABAddressBook.
     */
    @Generated
    @Selector("displayedPerson")
    public native ConstVoidPtr displayedPerson();

    @Generated
    @Selector("init")
    public native ABNewPersonViewController init();

    @Generated
    @Selector("initWithCoder:")
    public native ABNewPersonViewController initWithCoder(NSCoder coder);

    @Generated
    @Selector("initWithNibName:bundle:")
    public native ABNewPersonViewController initWithNibNameBundle(String nibNameOrNil, NSBundle nibBundleOrNil);

    @Generated
    @Selector("newPersonViewDelegate")
    @MappedReturn(ObjCObjectMapper.class)
    public native ABNewPersonViewControllerDelegate newPersonViewDelegate();

    /**
     * Specify a parentGroup the person should be added to when saved. This is optional.
     */
    @Generated
    @Selector("parentGroup")
    public native ConstVoidPtr parentGroup();

    /**
     * The Address Book to use. Any contact returned will be from this ABAddressBook instance.
     * If not set, a new ABAddressBook will be created the first time the property is accessed.
     */
    @Generated
    @Selector("setAddressBook:")
    public native void setAddressBook(ConstVoidPtr value);

    /**
     * Specify a displayedPerson to prefill some fields in the card. This is optional.
     * If displayedPerson has been added to an ABAddressBook, then the addressBook
     * property will be updated to use the displayedPerson's ABAddressBook.
     */
    @Generated
    @Selector("setDisplayedPerson:")
    public native void setDisplayedPerson(ConstVoidPtr value);

    /**
     * ABNewPersonViewController does not support subclassing in iOS 7.0 and later. A nil instance will be returned.
     */
    @Generated
    @Selector("setNewPersonViewDelegate:")
    public native void setNewPersonViewDelegate_unsafe(
            @Mapped(ObjCObjectMapper.class) ABNewPersonViewControllerDelegate value);

    /**
     * ABNewPersonViewController does not support subclassing in iOS 7.0 and later. A nil instance will be returned.
     */
    @Generated
    public void setNewPersonViewDelegate(@Mapped(ObjCObjectMapper.class) ABNewPersonViewControllerDelegate value) {
        Object __old = newPersonViewDelegate();
        if (value != null) {
            org.moe.natj.objc.ObjCRuntime.associateObjCObject(this, value);
        }
        setNewPersonViewDelegate_unsafe(value);
        if (__old != null) {
            org.moe.natj.objc.ObjCRuntime.dissociateObjCObject(this, __old);
        }
    }

    /**
     * Specify a parentGroup the person should be added to when saved. This is optional.
     */
    @Generated
    @Selector("setParentGroup:")
    public native void setParentGroup(ConstVoidPtr value);
}

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

package apple.uikit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSBundle;
import apple.foundation.NSCoder;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.NSURL;
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

@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class UIDocumentPickerExtensionViewController extends UIViewController {
    static {
        NatJ.register();
    }

    @Generated
    protected UIDocumentPickerExtensionViewController(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native UIDocumentPickerExtensionViewController alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native UIDocumentPickerExtensionViewController allocWithZone(VoidPtr zone);

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
    public static native UIDocumentPickerExtensionViewController new_objc();

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
     * The preconditions for the URL passed to dismissGrantingAccessToURL: vary depending on the document picker mode.
     * In Import mode, any URL that the extension has access to is valid.
     * In Open mode, the URL needs to be on a level below the documentStorageURL returned by the corresponding non-UI extension.
     * In Export mode, the URL needs to be below the documentStorageURL and should point to a duplicate of the object at originalURL.
     */
    @Generated
    @Selector("dismissGrantingAccessToURL:")
    public native void dismissGrantingAccessToURL(NSURL url);

    /**
     * only valid after prepareForDocumentSelectionInMode: has been called
     */
    @Generated
    @Selector("documentPickerMode")
    @NUInt
    public native long documentPickerMode();

    @Generated
    @Selector("documentStorageURL")
    public native NSURL documentStorageURL();

    @Generated
    @Selector("init")
    public native UIDocumentPickerExtensionViewController init();

    @Generated
    @Selector("initWithCoder:")
    public native UIDocumentPickerExtensionViewController initWithCoder(NSCoder coder);

    @Generated
    @Selector("initWithNibName:bundle:")
    public native UIDocumentPickerExtensionViewController initWithNibNameBundle(String nibNameOrNil,
            NSBundle nibBundleOrNil);

    /**
     * Contains the URL to duplicate if in mode UIDocumentPickerModeExportToService. nil otherwise.
     */
    @Generated
    @Selector("originalURL")
    public native NSURL originalURL();

    @Generated
    @Selector("prepareForPresentationInMode:")
    public native void prepareForPresentationInMode(@NUInt long mode);

    /**
     * if a corresponding non-UI picker component is found, these return the values returned by the corresponding methods
     * in the non-UI component. Otherwise, they will return the values corresponding to the default implementation of a non-UI picker.
     */
    @Generated
    @Selector("providerIdentifier")
    public native String providerIdentifier();

    /**
     * Contains the list of valid types if in mode UIDocumentPickerModeImport or UIDocumentPickerModeOpen. nil otherwise.
     */
    @Generated
    @Selector("validTypes")
    public native NSArray<String> validTypes();
}

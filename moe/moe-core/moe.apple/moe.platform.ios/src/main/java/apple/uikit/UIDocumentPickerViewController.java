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
import apple.uikit.protocol.UIDocumentPickerDelegate;
import apple.uniformtypeidentifiers.UTType;
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
 * API-Since: 8.0
 */
@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class UIDocumentPickerViewController extends UIViewController {
    static {
        NatJ.register();
    }

    @Generated
    protected UIDocumentPickerViewController(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native UIDocumentPickerViewController alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native UIDocumentPickerViewController allocWithZone(VoidPtr zone);

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
    public static native UIDocumentPickerViewController new_objc();

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
    @Selector("delegate")
    @MappedReturn(ObjCObjectMapper.class)
    public native UIDocumentPickerDelegate delegate();

    /**
     * API-Since: 8.0
     * Deprecated-Since: 14.0
     * Deprecated-Message: Use appropriate initializers instead
     */
    @Deprecated
    @Generated
    @Selector("documentPickerMode")
    @NUInt
    public native long documentPickerMode();

    @Generated
    @Selector("init")
    public native UIDocumentPickerViewController init();

    @Generated
    @Selector("initWithCoder:")
    public native UIDocumentPickerViewController initWithCoder(@NotNull NSCoder coder);

    /**
     * Initializes the picker instance for selecting a document in a remote location. The valid modes are Import and
     * Open.
     * 
     * API-Since: 8.0
     * Deprecated-Since: 14.0
     */
    @Deprecated
    @Generated
    @Selector("initWithDocumentTypes:inMode:")
    public native UIDocumentPickerViewController initWithDocumentTypesInMode(@NotNull NSArray<String> allowedUTIs,
            @NUInt long mode);

    @Generated
    @Selector("initWithNibName:bundle:")
    public native UIDocumentPickerViewController initWithNibNameBundle(@Nullable String nibNameOrNil,
            @Nullable NSBundle nibBundleOrNil);

    /**
     * Initializes the picker for exporting a local file to an external location. The valid modes are Export and Move.
     * The new location will be returned using `didPickDocumentAtURL:`.
     * 
     * API-Since: 8.0
     * Deprecated-Since: 14.0
     */
    @Deprecated
    @Generated
    @Selector("initWithURL:inMode:")
    public native UIDocumentPickerViewController initWithURLInMode(@NotNull NSURL url, @NUInt long mode);

    @Generated
    @Selector("setDelegate:")
    public native void setDelegate_unsafe(@Nullable @Mapped(ObjCObjectMapper.class) UIDocumentPickerDelegate value);

    @Generated
    public void setDelegate(@Nullable @Mapped(ObjCObjectMapper.class) UIDocumentPickerDelegate value) {
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
     * API-Since: 11.0
     */
    @Generated
    @Selector("allowsMultipleSelection")
    public native boolean allowsMultipleSelection();

    /**
     * Initializes the picker for exporting local files to an external location. The valid modes are Export and Move.
     * The new locations will be returned using `didPickDocumentAtURLs:`.
     * 
     * API-Since: 11.0
     * Deprecated-Since: 14.0
     */
    @Deprecated
    @Generated
    @Selector("initWithURLs:inMode:")
    public native UIDocumentPickerViewController initWithURLsInMode(@NotNull NSArray<? extends NSURL> urls,
            @NUInt long mode);

    /**
     * API-Since: 11.0
     */
    @Generated
    @Selector("setAllowsMultipleSelection:")
    public native void setAllowsMultipleSelection(boolean value);

    /**
     * Picker will try to display this URL when presented
     * 
     * API-Since: 13.0
     */
    @Nullable
    @Generated
    @Selector("directoryURL")
    public native NSURL directoryURL();

    /**
     * Picker will try to display this URL when presented
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("setDirectoryURL:")
    public native void setDirectoryURL(@Nullable NSURL value);

    /**
     * Force the display of supported file extensions (default: NO).
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("setShouldShowFileExtensions:")
    public native void setShouldShowFileExtensions(boolean value);

    /**
     * Force the display of supported file extensions (default: NO).
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("shouldShowFileExtensions")
    public native boolean shouldShowFileExtensions();

    /**
     * Initializes the picker for exporting local documents to an external location. The new locations will be returned
     * using `didPickDocumentAtURLs:`. The original document will be moved to the destination.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("initForExportingURLs:")
    public native UIDocumentPickerViewController initForExportingURLs(@NotNull NSArray<? extends NSURL> urls);

    /**
     * Initializes the picker for exporting local documents to an external location. The new locations will be returned
     * using `didPickDocumentAtURLs:`.
     * 
     * @param asCopy if true, a copy will be exported to the destination, otherwise the original document will be moved
     *               to the destination. For performance reasons and to avoid copies, we recommend you set `asCopy` to
     *               false.
     * 
     *               API-Since: 14.0
     */
    @Generated
    @Selector("initForExportingURLs:asCopy:")
    public native UIDocumentPickerViewController initForExportingURLsAsCopy(@NotNull NSArray<? extends NSURL> urls,
            boolean asCopy);

    /**
     * Initializes the picker instance for selecting a document in a remote location, giving you access to the original
     * document.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("initForOpeningContentTypes:")
    public native UIDocumentPickerViewController initForOpeningContentTypes(
            @NotNull NSArray<? extends UTType> contentTypes);

    /**
     * Initializes the picker instance for selecting a document in a remote location.
     * 
     * @param asCopy if true, the picker will give you access to a local copy of the document, otherwise you will have
     *               access to the original document
     * 
     *               API-Since: 14.0
     */
    @Generated
    @Selector("initForOpeningContentTypes:asCopy:")
    public native UIDocumentPickerViewController initForOpeningContentTypesAsCopy(
            @NotNull NSArray<? extends UTType> contentTypes, boolean asCopy);

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}

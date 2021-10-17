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
import apple.coredata.NSManagedObjectContext;
import apple.coredata.NSManagedObjectModel;
import apple.foundation.NSArray;
import apple.foundation.NSDictionary;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.NSURL;
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
import org.moe.natj.general.ann.ReferenceInfo;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.Ptr;
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
public class UIManagedDocument extends UIDocument {
    static {
        NatJ.register();
    }

    @Generated
    protected UIManagedDocument(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native UIManagedDocument alloc();

    @Generated
    @Selector("allocWithZone:")
    public static native UIManagedDocument allocWithZone(VoidPtr zone);

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
    public static native UIManagedDocument new_objc();

    /**
     * The name for the persistent store file inside the document's file wrapper.  When working with the Core Data APIs, this path component is appended to the document URL provided by the UIDocument APIs.  The default name is @"documentpersistentstore.db"
     */
    @Generated
    @Selector("persistentStoreName")
    public static native String persistentStoreName();

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
     * An optional call out by contentsForType:error: to handle non-Core Data content in the document's file wrapper.  The returned object will be passed to -writeAdditionalContent: It is not necessary to call super.
     */
    @Generated
    @Selector("additionalContentForURL:error:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object additionalContentForURLError(NSURL absoluteURL,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * Customize the loading or creation of a persistent store to the coordinator.
     */
    @Generated
    @Selector("configurePersistentStoreCoordinatorForURL:ofType:modelConfiguration:storeOptions:error:")
    public native boolean configurePersistentStoreCoordinatorForURLOfTypeModelConfigurationStoreOptionsError(
            NSURL storeURL, String fileType, String configuration, NSDictionary<?, ?> storeOptions,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Selector("init")
    public native UIManagedDocument init();

    @Generated
    @Selector("initWithFileURL:")
    public native UIManagedDocument initWithFileURL(NSURL url);

    /**
     * Persistent documents always have a managed object context and a persistent store coordinator through that context.  The managed object context is required to be initialized with the concurrency type NSMainQueueConcurrencyType and it must have a parent context initialized with the concurrency type NSPrivateQueueConcurrencyType.
     */
    @Generated
    @Selector("managedObjectContext")
    public native NSManagedObjectContext managedObjectContext();

    /**
     * Persistent documents always have a managed object model.  The default model is the union of all models in the main bundle.
     */
    @Generated
    @Selector("managedObjectModel")
    public native NSManagedObjectModel managedObjectModel();

    /**
     * Optionally specify a model configuration name to be passed when configuring the persistent store
     */
    @Generated
    @Selector("modelConfiguration")
    public native String modelConfiguration();

    /**
     * Optionally provide a collection of store options to be passed when configuring the persistent store
     */
    @Generated
    @Selector("persistentStoreOptions")
    public native NSDictionary<?, ?> persistentStoreOptions();

    /**
     * Returns the Core Data store type string for the given document fileType. The default returns NSSQLiteStoreType. See NSPersistentStoreCoordinator.h for store type information.
     */
    @Generated
    @Selector("persistentStoreTypeForFileType:")
    public native String persistentStoreTypeForFileType(String fileType);

    /**
     * An optional call out by readFromURL:error: to handle non-Core Data content in the document's file wrapper.  It is not necessary to call super.
     */
    @Generated
    @Selector("readAdditionalContentFromURL:error:")
    public native boolean readAdditionalContentFromURLError(NSURL absoluteURL,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * Optionally specify a model configuration name to be passed when configuring the persistent store
     */
    @Generated
    @Selector("setModelConfiguration:")
    public native void setModelConfiguration(String value);

    /**
     * Optionally provide a collection of store options to be passed when configuring the persistent store
     */
    @Generated
    @Selector("setPersistentStoreOptions:")
    public native void setPersistentStoreOptions(NSDictionary<?, ?> value);

    /**
     * An optional call out by writeContents:andAttributes:safelyToURL:forSaveOperation:error: to handle non-Core Data content in the document's file wrapper.  The Core Data content is handled by the primary UIDocument -writeContents:andAttributes:safelyToURL:forSaveOperation:error: method.  It is not necessary to call super.
     */
    @Generated
    @Selector("writeAdditionalContent:toURL:originalContentsURL:error:")
    public native boolean writeAdditionalContentToURLOriginalContentsURLError(
            @Mapped(ObjCObjectMapper.class) Object content, NSURL absoluteURL, NSURL absoluteOriginalContentsURL,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);
}

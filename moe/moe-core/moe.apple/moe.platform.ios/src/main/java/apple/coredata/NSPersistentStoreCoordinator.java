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

package apple.coredata;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSDictionary;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.NSURL;
import apple.foundation.NSValue;
import apple.foundation.protocol.NSLocking;
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
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("CoreData")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSPersistentStoreCoordinator extends NSObject implements NSLocking {
    static {
        NatJ.register();
    }

    @Generated
    protected NSPersistentStoreCoordinator(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSPersistentStoreCoordinator alloc();

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
    @Deprecated
    @Selector("metadataForPersistentStoreOfType:URL:error:")
    public static native NSDictionary<String, ?> metadataForPersistentStoreOfTypeURLError(String storeType, NSURL url,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Selector("metadataForPersistentStoreOfType:URL:options:error:")
    public static native NSDictionary<String, ?> metadataForPersistentStoreOfTypeURLOptionsError(String storeType,
            NSURL url, NSDictionary<?, ?> options, @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Owned
    @Selector("new")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object new_objc();

    @Generated
    @Selector("registerStoreClass:forStoreType:")
    public static native void registerStoreClassForStoreType(Class storeClass, String storeType);

    @Generated
    @Selector("registeredStoreTypes")
    public static native NSDictionary<String, ? extends NSValue> registeredStoreTypes();

    @Generated
    @Selector("removeUbiquitousContentAndPersistentStoreAtURL:options:error:")
    public static native boolean removeUbiquitousContentAndPersistentStoreAtURLOptionsError(NSURL storeURL,
            NSDictionary<?, ?> options, @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Deprecated
    @Selector("setMetadata:forPersistentStoreOfType:URL:error:")
    public static native boolean setMetadataForPersistentStoreOfTypeURLError(NSDictionary<String, ?> metadata,
            String storeType, NSURL url, @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Selector("setMetadata:forPersistentStoreOfType:URL:options:error:")
    public static native boolean setMetadataForPersistentStoreOfTypeURLOptionsError(NSDictionary<String, ?> metadata,
            String storeType, NSURL url, NSDictionary<?, ?> options,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

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

    @Generated
    @Selector("URLForPersistentStore:")
    public native NSURL URLForPersistentStore(NSPersistentStore store);

    @Generated
    @Selector("addPersistentStoreWithDescription:completionHandler:")
    public native void addPersistentStoreWithDescriptionCompletionHandler(NSPersistentStoreDescription storeDescription,
            @ObjCBlock(name = "call_addPersistentStoreWithDescriptionCompletionHandler") Block_addPersistentStoreWithDescriptionCompletionHandler block);

    @Generated
    @Selector("addPersistentStoreWithType:configuration:URL:options:error:")
    public native NSPersistentStore addPersistentStoreWithTypeConfigurationURLOptionsError(String storeType,
            String configuration, NSURL storeURL, NSDictionary<?, ?> options,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Selector("destroyPersistentStoreAtURL:withType:options:error:")
    public native boolean destroyPersistentStoreAtURLWithTypeOptionsError(NSURL url, String storeType,
            NSDictionary<?, ?> options, @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Selector("executeRequest:withContext:error:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object executeRequestWithContextError(NSPersistentStoreRequest request,
            NSManagedObjectContext context, @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Selector("init")
    public native NSPersistentStoreCoordinator init();

    @Generated
    @Selector("initWithManagedObjectModel:")
    public native NSPersistentStoreCoordinator initWithManagedObjectModel(NSManagedObjectModel model);

    @Generated
    @Deprecated
    @Selector("lock")
    public native void lock();

    @Generated
    @Selector("managedObjectIDForURIRepresentation:")
    public native NSManagedObjectID managedObjectIDForURIRepresentation(NSURL url);

    @Generated
    @Selector("managedObjectModel")
    public native NSManagedObjectModel managedObjectModel();

    @Generated
    @Selector("metadataForPersistentStore:")
    public native NSDictionary<String, ?> metadataForPersistentStore(NSPersistentStore store);

    @Generated
    @Selector("migratePersistentStore:toURL:options:withType:error:")
    public native NSPersistentStore migratePersistentStoreToURLOptionsWithTypeError(NSPersistentStore store, NSURL URL,
            NSDictionary<?, ?> options, String storeType, @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Selector("name")
    public native String name();

    @Generated
    @Selector("performBlock:")
    public native void performBlock(@ObjCBlock(name = "call_performBlock") Block_performBlock block);

    @Generated
    @Selector("performBlockAndWait:")
    public native void performBlockAndWait(
            @ObjCBlock(name = "call_performBlockAndWait") Block_performBlockAndWait block);

    @Generated
    @Selector("persistentStoreForURL:")
    public native NSPersistentStore persistentStoreForURL(NSURL URL);

    @Generated
    @Selector("persistentStores")
    public native NSArray<? extends NSPersistentStore> persistentStores();

    @Generated
    @Selector("removePersistentStore:error:")
    public native boolean removePersistentStoreError(NSPersistentStore store,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Selector("replacePersistentStoreAtURL:destinationOptions:withPersistentStoreFromURL:sourceOptions:storeType:error:")
    public native boolean replacePersistentStoreAtURLDestinationOptionsWithPersistentStoreFromURLSourceOptionsStoreTypeError(
            NSURL destinationURL, NSDictionary<?, ?> destinationOptions, NSURL sourceURL,
            NSDictionary<?, ?> sourceOptions, String storeType,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Selector("setMetadata:forPersistentStore:")
    public native void setMetadataForPersistentStore(NSDictionary<String, ?> metadata, NSPersistentStore store);

    @Generated
    @Selector("setName:")
    public native void setName(String value);

    @Generated
    @Selector("setURL:forPersistentStore:")
    public native boolean setURLForPersistentStore(NSURL url, NSPersistentStore store);

    @Generated
    @Deprecated
    @Selector("tryLock")
    public native boolean tryLock();

    @Generated
    @Deprecated
    @Selector("unlock")
    public native void unlock();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_addPersistentStoreWithDescriptionCompletionHandler {
        @Generated
        void call_addPersistentStoreWithDescriptionCompletionHandler(NSPersistentStoreDescription arg0, NSError arg1);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_performBlock {
        @Generated
        void call_performBlock();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_performBlockAndWait {
        @Generated
        void call_performBlockAndWait();
    }

    @Generated
    @Selector("currentPersistentHistoryTokenFromStores:")
    public native NSPersistentHistoryToken currentPersistentHistoryTokenFromStores(NSArray<?> stores);
}

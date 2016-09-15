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

    /**
     * URLForPersistentStore:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/CoreDataFramework/Classes/NSPersistentStoreCoordinator_Class/index.html#//apple_ref/occ/instm/NSPersistentStoreCoordinator/URLForPersistentStore:">iOS Dev Center</a>
     */
    @Generated
    @Selector("URLForPersistentStore:")
    public native NSURL URLForPersistentStore(NSPersistentStore store);

    /**
     * addPersistentStoreWithType:configuration:URL:options:error:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/CoreDataFramework/Classes/NSPersistentStoreCoordinator_Class/index.html#//apple_ref/occ/instm/NSPersistentStoreCoordinator/addPersistentStoreWithType:configuration:URL:options:error:">iOS Dev Center</a>
     */
    @Generated
    @Selector("addPersistentStoreWithType:configuration:URL:options:error:")
    public native NSPersistentStore addPersistentStoreWithTypeConfigurationURLOptionsError(String storeType,
            String configuration, NSURL storeURL, NSDictionary<?, ?> options, Ptr<NSError> error);

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSPersistentStoreCoordinator alloc();

    /**
     * executeRequest:withContext:error:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/CoreDataFramework/Classes/NSPersistentStoreCoordinator_Class/index.html#//apple_ref/occ/instm/NSPersistentStoreCoordinator/executeRequest:withContext:error:">iOS Dev Center</a>
     */
    @Generated
    @Selector("executeRequest:withContext:error:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object executeRequestWithContextError(NSPersistentStoreRequest request,
            NSManagedObjectContext context, Ptr<NSError> error);

    @Generated
    @Selector("init")
    public native NSPersistentStoreCoordinator init();

    /**
     * initWithManagedObjectModel:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/CoreDataFramework/Classes/NSPersistentStoreCoordinator_Class/index.html#//apple_ref/occ/instm/NSPersistentStoreCoordinator/initWithManagedObjectModel:">iOS Dev Center</a>
     */
    @Generated
    @Selector("initWithManagedObjectModel:")
    public native NSPersistentStoreCoordinator initWithManagedObjectModel(NSManagedObjectModel model);

    @Generated
    @Deprecated
    @Selector("lock")
    public native void lock();

    /**
     * managedObjectIDForURIRepresentation:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/CoreDataFramework/Classes/NSPersistentStoreCoordinator_Class/index.html#//apple_ref/occ/instm/NSPersistentStoreCoordinator/managedObjectIDForURIRepresentation:">iOS Dev Center</a>
     */
    @Generated
    @Selector("managedObjectIDForURIRepresentation:")
    public native NSManagedObjectID managedObjectIDForURIRepresentation(NSURL url);

    /**
     * managedObjectModel</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/CoreDataFramework/Classes/NSPersistentStoreCoordinator_Class/index.html#//apple_ref/occ/instp/NSPersistentStoreCoordinator/managedObjectModel">iOS Dev Center</a>
     */
    @Generated
    @Selector("managedObjectModel")
    public native NSManagedObjectModel managedObjectModel();

    /**
     * metadataForPersistentStore:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/CoreDataFramework/Classes/NSPersistentStoreCoordinator_Class/index.html#//apple_ref/occ/instm/NSPersistentStoreCoordinator/metadataForPersistentStore:">iOS Dev Center</a>
     */
    @Generated
    @Selector("metadataForPersistentStore:")
    public native NSDictionary<String, ?> metadataForPersistentStore(NSPersistentStore store);

    /**
     * metadataForPersistentStoreOfType:URL:error:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/CoreDataFramework/Classes/NSPersistentStoreCoordinator_Class/index.html#//apple_ref/occ/clm/NSPersistentStoreCoordinator/metadataForPersistentStoreOfType:URL:error:">iOS Dev Center</a>
     */
    @Deprecated
    @Generated
    @Selector("metadataForPersistentStoreOfType:URL:error:")
    public static native NSDictionary<String, ?> metadataForPersistentStoreOfTypeURLError(String storeType, NSURL url,
            Ptr<NSError> error);

    /**
     * migratePersistentStore:toURL:options:withType:error:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/CoreDataFramework/Classes/NSPersistentStoreCoordinator_Class/index.html#//apple_ref/occ/instm/NSPersistentStoreCoordinator/migratePersistentStore:toURL:options:withType:error:">iOS Dev Center</a>
     */
    @Generated
    @Selector("migratePersistentStore:toURL:options:withType:error:")
    public native NSPersistentStore migratePersistentStoreToURLOptionsWithTypeError(NSPersistentStore store, NSURL URL,
            NSDictionary<?, ?> options, String storeType, Ptr<NSError> error);

    @Generated
    @Selector("name")
    public native String name();

    @Generated
    @Selector("performBlock:")
    public native void performBlock(@ObjCBlock(name = "call_performBlock") Block_performBlock block);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_performBlock {
        @Generated
        void call_performBlock();
    }

    @Generated
    @Selector("performBlockAndWait:")
    public native void performBlockAndWait(
            @ObjCBlock(name = "call_performBlockAndWait") Block_performBlockAndWait block);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_performBlockAndWait {
        @Generated
        void call_performBlockAndWait();
    }

    /**
     * persistentStoreForURL:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/CoreDataFramework/Classes/NSPersistentStoreCoordinator_Class/index.html#//apple_ref/occ/instm/NSPersistentStoreCoordinator/persistentStoreForURL:">iOS Dev Center</a>
     */
    @Generated
    @Selector("persistentStoreForURL:")
    public native NSPersistentStore persistentStoreForURL(NSURL URL);

    /**
     * persistentStores</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/CoreDataFramework/Classes/NSPersistentStoreCoordinator_Class/index.html#//apple_ref/occ/instp/NSPersistentStoreCoordinator/persistentStores">iOS Dev Center</a>
     */
    @Generated
    @Selector("persistentStores")
    public native NSArray<? extends NSPersistentStore> persistentStores();

    /**
     * registerStoreClass:forStoreType:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/CoreDataFramework/Classes/NSPersistentStoreCoordinator_Class/index.html#//apple_ref/occ/clm/NSPersistentStoreCoordinator/registerStoreClass:forStoreType:">iOS Dev Center</a>
     */
    @Generated
    @Selector("registerStoreClass:forStoreType:")
    public static native void registerStoreClassForStoreType(Class storeClass, String storeType);

    /**
     * registeredStoreTypes</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/CoreDataFramework/Classes/NSPersistentStoreCoordinator_Class/index.html#//apple_ref/occ/clm/NSPersistentStoreCoordinator/registeredStoreTypes">iOS Dev Center</a>
     */
    @Generated
    @Selector("registeredStoreTypes")
    public static native NSDictionary<String, ? extends NSValue> registeredStoreTypes();

    /**
     * removePersistentStore:error:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/CoreDataFramework/Classes/NSPersistentStoreCoordinator_Class/index.html#//apple_ref/occ/instm/NSPersistentStoreCoordinator/removePersistentStore:error:">iOS Dev Center</a>
     */
    @Generated
    @Selector("removePersistentStore:error:")
    public native boolean removePersistentStoreError(NSPersistentStore store, Ptr<NSError> error);

    /**
     * removeUbiquitousContentAndPersistentStoreAtURL:options:error:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/CoreDataFramework/Classes/NSPersistentStoreCoordinator_Class/index.html#//apple_ref/occ/clm/NSPersistentStoreCoordinator/removeUbiquitousContentAndPersistentStoreAtURL:options:error:">iOS Dev Center</a>
     */
    @Generated
    @Selector("removeUbiquitousContentAndPersistentStoreAtURL:options:error:")
    public static native boolean removeUbiquitousContentAndPersistentStoreAtURLOptionsError(NSURL storeURL,
            NSDictionary<?, ?> options, Ptr<NSError> error);

    /**
     * setMetadata:forPersistentStore:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/CoreDataFramework/Classes/NSPersistentStoreCoordinator_Class/index.html#//apple_ref/occ/instm/NSPersistentStoreCoordinator/setMetadata:forPersistentStore:">iOS Dev Center</a>
     */
    @Generated
    @Selector("setMetadata:forPersistentStore:")
    public native void setMetadataForPersistentStore(NSDictionary<String, ?> metadata, NSPersistentStore store);

    /**
     * setMetadata:forPersistentStoreOfType:URL:error:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/CoreDataFramework/Classes/NSPersistentStoreCoordinator_Class/index.html#//apple_ref/occ/clm/NSPersistentStoreCoordinator/setMetadata:forPersistentStoreOfType:URL:error:">iOS Dev Center</a>
     */
    @Deprecated
    @Generated
    @Selector("setMetadata:forPersistentStoreOfType:URL:error:")
    public static native boolean setMetadataForPersistentStoreOfTypeURLError(NSDictionary<String, ?> metadata,
            String storeType, NSURL url, Ptr<NSError> error);

    @Generated
    @Selector("setName:")
    public native void setName(String value);

    /**
     * setURL:forPersistentStore:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/CoreDataFramework/Classes/NSPersistentStoreCoordinator_Class/index.html#//apple_ref/occ/instm/NSPersistentStoreCoordinator/setURL:forPersistentStore:">iOS Dev Center</a>
     */
    @Generated
    @Selector("setURL:forPersistentStore:")
    public native boolean setURLForPersistentStore(NSURL url, NSPersistentStore store);

    /**
     * tryLock</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/CoreDataFramework/Classes/NSPersistentStoreCoordinator_Class/index.html#//apple_ref/occ/instm/NSPersistentStoreCoordinator/tryLock">iOS Dev Center</a>
     */
    @Generated
    @Deprecated
    @Selector("tryLock")
    public native boolean tryLock();

    @Generated
    @Deprecated
    @Selector("unlock")
    public native void unlock();

    @Generated
    @Selector("destroyPersistentStoreAtURL:withType:options:error:")
    public native boolean destroyPersistentStoreAtURLWithTypeOptionsError(NSURL url, String storeType,
            NSDictionary<?, ?> options, Ptr<NSError> error);

    @Generated
    @Selector("metadataForPersistentStoreOfType:URL:options:error:")
    public static native NSDictionary<String, ?> metadataForPersistentStoreOfTypeURLOptionsError(String storeType,
            NSURL url, NSDictionary<?, ?> options, Ptr<NSError> error);

    @Generated
    @Selector("replacePersistentStoreAtURL:destinationOptions:withPersistentStoreFromURL:sourceOptions:storeType:error:")
    public native boolean replacePersistentStoreAtURLDestinationOptionsWithPersistentStoreFromURLSourceOptionsStoreTypeError(
            NSURL destinationURL, NSDictionary<?, ?> destinationOptions, NSURL sourceURL,
            NSDictionary<?, ?> sourceOptions, String storeType, Ptr<NSError> error);

    @Generated
    @Selector("setMetadata:forPersistentStoreOfType:URL:options:error:")
    public static native boolean setMetadataForPersistentStoreOfTypeURLOptionsError(NSDictionary<String, ?> metadata,
            String storeType, NSURL url, NSDictionary<?, ?> options, Ptr<NSError> error);

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

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
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}

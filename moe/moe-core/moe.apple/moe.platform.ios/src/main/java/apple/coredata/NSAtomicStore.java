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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * API-Since: 3.0
 */
@Generated
@Library("CoreData")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSAtomicStore extends NSPersistentStore {
    static {
        NatJ.register();
    }

    @Generated
    protected NSAtomicStore(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSAtomicStore alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native NSAtomicStore allocWithZone(VoidPtr zone);

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

    @Nullable
    @Generated
    @Selector("metadataForPersistentStoreWithURL:error:")
    public static native NSDictionary<String, ?> metadataForPersistentStoreWithURLError(@NotNull NSURL url,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @NotNull
    @Generated
    @Selector("migrationManagerClass")
    public static native Class migrationManagerClass();

    @Generated
    @Owned
    @Selector("new")
    public static native NSAtomicStore new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("setMetadata:forPersistentStoreWithURL:error:")
    public static native boolean setMetadataForPersistentStoreWithURLError(@Nullable NSDictionary<String, ?> metadata,
            @NotNull NSURL url, @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

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
     * Utility method with implementation provided by NSAtomicStore
     */
    @Generated
    @Selector("addCacheNodes:")
    public native void addCacheNodes(@NotNull NSSet<? extends NSAtomicStoreCacheNode> cacheNodes);

    /**
     * Utility method with implementation provided by NSAtomicStore
     */
    @Nullable
    @Generated
    @Selector("cacheNodeForObjectID:")
    public native NSAtomicStoreCacheNode cacheNodeForObjectID(@NotNull NSManagedObjectID objectID);

    /**
     * Utility method with implementation provided by NSAtomicStore
     */
    @NotNull
    @Generated
    @Selector("cacheNodes")
    public native NSSet<? extends NSAtomicStoreCacheNode> cacheNodes();

    @Generated
    @Selector("init")
    public native NSAtomicStore init();

    /**
     * API method that may be overriden by subclasses for custom initialization
     */
    @Generated
    @Selector("initWithPersistentStoreCoordinator:configurationName:URL:options:")
    public native NSAtomicStore initWithPersistentStoreCoordinatorConfigurationNameURLOptions(
            @Nullable NSPersistentStoreCoordinator coordinator, @Nullable String configurationName, @NotNull NSURL url,
            @Nullable NSDictionary<?, ?> options);

    /**
     * API method that must be overriden by subclasses
     */
    @Generated
    @Selector("load:")
    public native boolean load_objc(@Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * API method that must be overriden by subclasses
     */
    @NotNull
    @Generated
    @Selector("newCacheNodeForManagedObject:")
    public native NSAtomicStoreCacheNode newCacheNodeForManagedObject(@NotNull NSManagedObject managedObject);

    /**
     * API method that must be overriden by subclasses
     */
    @NotNull
    @Generated
    @Selector("newReferenceObjectForManagedObject:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object newReferenceObjectForManagedObject(@NotNull NSManagedObject managedObject);

    /**
     * Utility method with implementation provided by NSAtomicStore
     */
    @NotNull
    @Generated
    @Selector("objectIDForEntity:referenceObject:")
    public native NSManagedObjectID objectIDForEntityReferenceObject(@NotNull NSEntityDescription entity,
            @NotNull @Mapped(ObjCObjectMapper.class) Object data);

    /**
     * Utility method with implementation provided by NSAtomicStore
     */
    @NotNull
    @Generated
    @Selector("referenceObjectForObjectID:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object referenceObjectForObjectID(@NotNull NSManagedObjectID objectID);

    /**
     * API method that must be overriden by subclasses
     */
    @Generated
    @Selector("save:")
    public native boolean save(@Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * API method that must be overriden by subclasses
     */
    @Generated
    @Selector("updateCacheNode:fromManagedObject:")
    public native void updateCacheNodeFromManagedObject(@NotNull NSAtomicStoreCacheNode node,
            @NotNull NSManagedObject managedObject);

    /**
     * Called before cache nodes are removed
     */
    @Generated
    @Selector("willRemoveCacheNodes:")
    public native void willRemoveCacheNodes(@NotNull NSSet<? extends NSAtomicStoreCacheNode> cacheNodes);

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}

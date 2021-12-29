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
@Library("CoreData")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSPersistentStore extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected NSPersistentStore(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSPersistentStore alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native NSPersistentStore allocWithZone(VoidPtr zone);

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

    /**
     * Get metadata from the persistent store at url. Must be overriden by subclasses.
     * Subclasses should validate that the URL is the type of URL they are expecting, and
     * should verify that the file contents are appropriate for the store type before
     * attempting to read from it. This method should never raise an exception.
     */
    @Generated
    @Selector("metadataForPersistentStoreWithURL:error:")
    public static native NSDictionary<String, ?> metadataForPersistentStoreWithURLError(NSURL url,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * Returns the NSMigrationManager class optimized for this store class.  Subclasses of NSPersistentStore can override this to provide a custom migration manager subclass (eg to take advantage of store-specific functionality to improve migration performance).
     */
    @Generated
    @Selector("migrationManagerClass")
    public static native Class migrationManagerClass();

    @Generated
    @Owned
    @Selector("new")
    public static native NSPersistentStore new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * Set the medatada of the store at url to metadata. Must be overriden by subclasses.
     */
    @Generated
    @Selector("setMetadata:forPersistentStoreWithURL:error:")
    public static native boolean setMetadataForPersistentStoreWithURLError(NSDictionary<String, ?> metadata, NSURL url,
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
    @Selector("URL")
    public native NSURL URL();

    /**
     * Which configuration does this store contain
     */
    @Generated
    @Selector("configurationName")
    public native String configurationName();

    /**
     * Gives the store a chance to do any post-init work that's necessary
     */
    @Generated
    @Selector("didAddToPersistentStoreCoordinator:")
    public native void didAddToPersistentStoreCoordinator(NSPersistentStoreCoordinator coordinator);

    @Generated
    @Selector("identifier")
    public native String identifier();

    @Generated
    @Selector("init")
    public native NSPersistentStore init();

    /**
     * the designated initializer for object stores.
     */
    @Generated
    @Selector("initWithPersistentStoreCoordinator:configurationName:URL:options:")
    public native NSPersistentStore initWithPersistentStoreCoordinatorConfigurationNameURLOptions(
            NSPersistentStoreCoordinator root, String name, NSURL url, NSDictionary<?, ?> options);

    /**
     * Do we know a priori the store is read only?
     */
    @Generated
    @Selector("isReadOnly")
    public native boolean isReadOnly();

    /**
     * Do we know a priori the store is read only?
     */
    @Generated
    @Selector("setReadOnly:")
    public native void setReadOnly(boolean value);

    /**
     * Store metadata must be accessible before -load: is called, but there is no way to return an error if the store is invalid
     */
    @Generated
    @Selector("loadMetadata:")
    public native boolean loadMetadata(@ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * includes store type and UUID
     */
    @Generated
    @Selector("metadata")
    public native NSDictionary<String, ?> metadata();

    /**
     * the options the store was initialized with
     */
    @Generated
    @Selector("options")
    public native NSDictionary<?, ?> options();

    /**
     * the bridge between the control & access layers.
     */
    @Generated
    @Selector("persistentStoreCoordinator")
    public native NSPersistentStoreCoordinator persistentStoreCoordinator();

    @Generated
    @Selector("setIdentifier:")
    public native void setIdentifier(String value);

    /**
     * includes store type and UUID
     */
    @Generated
    @Selector("setMetadata:")
    public native void setMetadata(NSDictionary<String, ?> value);

    @Generated
    @Selector("setURL:")
    public native void setURL(NSURL value);

    /**
     * stores always know their type
     */
    @Generated
    @Selector("type")
    public native String type();

    /**
     * Gives the store a chance to do any non-dealloc teardown (for example, closing a network connection)
     * before removal.
     */
    @Generated
    @Selector("willRemoveFromPersistentStoreCoordinator:")
    public native void willRemoveFromPersistentStoreCoordinator(NSPersistentStoreCoordinator coordinator);

    /**
     * Return the Core Spotlight exporter if one exists for this store. The exporter
     * can be set as part of the store options when it is added to the coordinator.
     */
    @Generated
    @Selector("coreSpotlightExporter")
    public native NSCoreDataCoreSpotlightDelegate coreSpotlightExporter();
}

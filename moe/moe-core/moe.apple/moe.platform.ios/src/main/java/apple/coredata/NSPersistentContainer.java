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
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * An instance of NSPersistentContainer includes all objects needed to represent a functioning Core Data stack, and
 * provides convenience methods and properties for common patterns.
 * 
 * API-Since: 10.0
 */
@Generated
@Library("CoreData")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSPersistentContainer extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected NSPersistentContainer(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSPersistentContainer alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native NSPersistentContainer allocWithZone(VoidPtr zone);

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
    @Selector("defaultDirectoryURL")
    public static native NSURL defaultDirectoryURL();

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
    public static native NSPersistentContainer new_objc();

    @Generated
    @Selector("persistentContainerWithName:")
    public static native NSPersistentContainer persistentContainerWithName(String name);

    @Generated
    @Selector("persistentContainerWithName:managedObjectModel:")
    public static native NSPersistentContainer persistentContainerWithNameManagedObjectModel(String name,
            NSManagedObjectModel model);

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

    @Generated
    @Selector("init")
    public native NSPersistentContainer init();

    /**
     * Creates a container using the model named `name` in the main bundle
     */
    @Generated
    @Selector("initWithName:")
    public native NSPersistentContainer initWithName(String name);

    @Generated
    @Selector("initWithName:managedObjectModel:")
    public native NSPersistentContainer initWithNameManagedObjectModel(String name, NSManagedObjectModel model);

    /**
     * Load stores from the storeDescriptions property that have not already been successfully added to the container.
     * The completion handler is called once for each store that succeeds or fails.
     */
    @Generated
    @Selector("loadPersistentStoresWithCompletionHandler:")
    public native void loadPersistentStoresWithCompletionHandler(
            @ObjCBlock(name = "call_loadPersistentStoresWithCompletionHandler") Block_loadPersistentStoresWithCompletionHandler block);

    @Generated
    @Selector("managedObjectModel")
    public native NSManagedObjectModel managedObjectModel();

    @Generated
    @Selector("name")
    public native String name();

    @Generated
    @Selector("newBackgroundContext")
    public native NSManagedObjectContext newBackgroundContext();

    @Generated
    @Selector("performBackgroundTask:")
    public native void performBackgroundTask(
            @ObjCBlock(name = "call_performBackgroundTask") Block_performBackgroundTask block);

    @Generated
    @Selector("persistentStoreCoordinator")
    public native NSPersistentStoreCoordinator persistentStoreCoordinator();

    @Generated
    @Selector("persistentStoreDescriptions")
    public native NSArray<? extends NSPersistentStoreDescription> persistentStoreDescriptions();

    @Generated
    @Selector("setPersistentStoreDescriptions:")
    public native void setPersistentStoreDescriptions(NSArray<? extends NSPersistentStoreDescription> value);

    @Generated
    @Selector("viewContext")
    public native NSManagedObjectContext viewContext();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_loadPersistentStoresWithCompletionHandler {
        @Generated
        void call_loadPersistentStoresWithCompletionHandler(NSPersistentStoreDescription arg0, NSError arg1);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_performBackgroundTask {
        @Generated
        void call_performBackgroundTask(NSManagedObjectContext arg0);
    }
}

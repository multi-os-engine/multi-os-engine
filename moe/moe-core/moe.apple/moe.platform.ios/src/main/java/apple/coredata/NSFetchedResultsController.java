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
import apple.coredata.protocol.NSFetchRequestResult;
import apple.coredata.protocol.NSFetchedResultsControllerDelegate;
import apple.foundation.NSArray;
import apple.foundation.NSError;
import apple.foundation.NSIndexPath;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
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
@Library("CoreData")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSFetchedResultsController<_ResultType> extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected NSFetchedResultsController(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSFetchedResultsController<?> alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native NSFetchedResultsController<?> allocWithZone(VoidPtr zone);

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

    /**
     * Deletes the cached section information with the given name.
     * If name is nil, then all caches are deleted.
     */
    @Generated
    @Selector("deleteCacheWithName:")
    public static native <_ResultType> void deleteCacheWithName(String name);

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
    public static native NSFetchedResultsController<?> new_objc();

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
     * Name of the persistent cached section information. Use nil to disable persistent caching, or +deleteCacheWithName
     * to clear a cache.
     */
    @Generated
    @Selector("cacheName")
    public native String cacheName();

    /**
     * Delegate that is notified when the result set changes.
     */
    @Generated
    @Selector("delegate")
    @MappedReturn(ObjCObjectMapper.class)
    public native NSFetchedResultsControllerDelegate delegate();

    /**
     * NSFetchRequest instance used to do the fetching. You must not change it, its predicate, or its sort descriptor
     * after initialization without disabling caching or calling +deleteCacheWithName. The sort descriptor used in the
     * request groups objects into sections.
     */
    @Generated
    @Selector("fetchRequest")
    public native NSFetchRequest<?> fetchRequest();

    /**
     * Returns the results of the fetch.
     * Returns nil if the performFetch: hasn't been called.
     */
    @Generated
    @Selector("fetchedObjects")
    public native NSArray<?> fetchedObjects();

    /**
     * Returns the indexPath of a given object.
     */
    @Generated
    @Selector("indexPathForObject:")
    public native NSIndexPath indexPathForObject(@Mapped(ObjCObjectMapper.class) NSFetchRequestResult object);

    @Generated
    @Selector("init")
    public native NSFetchedResultsController<?> init();

    /**
     * Initializes an instance of NSFetchedResultsController
     * fetchRequest - the fetch request used to get the objects. It's expected that the sort descriptor used in the
     * request groups the objects into sections.
     * context - the context that will hold the fetched objects
     * sectionNameKeyPath - keypath on resulting objects that returns the section name. This will be used to pre-compute
     * the section information.
     * cacheName - Section info is cached persistently to a private file under this name. Cached sections are checked to
     * see if the time stamp matches the store, but not if you have illegally mutated the readonly fetch request,
     * predicate, or sort descriptor.
     */
    @Generated
    @Selector("initWithFetchRequest:managedObjectContext:sectionNameKeyPath:cacheName:")
    public native NSFetchedResultsController<?> initWithFetchRequestManagedObjectContextSectionNameKeyPathCacheName(
            NSFetchRequest<?> fetchRequest, NSManagedObjectContext context, String sectionNameKeyPath, String name);

    /**
     * Managed Object Context used to fetch objects. The controller registers to listen to change notifications on this
     * context and properly update its result set and section information.
     */
    @Generated
    @Selector("managedObjectContext")
    public native NSManagedObjectContext managedObjectContext();

    /**
     * Returns the fetched object at a given indexPath.
     */
    @Generated
    @Selector("objectAtIndexPath:")
    @MappedReturn(ObjCObjectMapper.class)
    public native NSFetchRequestResult objectAtIndexPath(NSIndexPath indexPath);

    /**
     * Executes the fetch request on the store to get objects.
     * Returns YES if successful or NO (and an error) if a problem occurred.
     * An error is returned if the fetch request specified doesn't include a sort descriptor that uses
     * sectionNameKeyPath.
     * After executing this method, the fetched objects can be accessed with the property 'fetchedObjects'
     */
    @Generated
    @Selector("performFetch:")
    public native boolean performFetch(@ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * Returns the section number for a given section title and index in the section index.
     */
    @Generated
    @Selector("sectionForSectionIndexTitle:atIndex:")
    @NInt
    public native long sectionForSectionIndexTitleAtIndex(String title, @NInt long sectionIndex);

    /**
     * Returns the corresponding section index entry for a given section name.
     * Default implementation returns the capitalized first letter of the section name.
     * Developers that need different behavior can implement the delegate method
     * -(NSString*)controller:(NSFetchedResultsController *)controller sectionIndexTitleForSectionName
     * Only needed if a section index is used.
     */
    @Generated
    @Selector("sectionIndexTitleForSectionName:")
    public native String sectionIndexTitleForSectionName(String sectionName);

    /**
     * Returns the array of section index titles.
     * Default implementation returns the array created by calling sectionIndexTitleForSectionName: on all the known
     * sections.
     * Developers should override this method if they wish to return a different array for the section index.
     * Only needed if a section index is used.
     */
    @Generated
    @Selector("sectionIndexTitles")
    public native NSArray<String> sectionIndexTitles();

    /**
     * The keyPath on the fetched objects used to determine the section they belong to.
     */
    @Generated
    @Selector("sectionNameKeyPath")
    public native String sectionNameKeyPath();

    /**
     * Returns an array of objects that implement the NSFetchedResultsSectionInfo protocol.
     * This provide a convenience interface for determining the number of sections, the names and titles of the
     * sections, and access to the model objects that belong to each section.
     */
    @Generated
    @Selector("sections")
    public native NSArray<?> sections();

    /**
     * Delegate that is notified when the result set changes.
     */
    @Generated
    @Selector("setDelegate:")
    public native void setDelegate_unsafe(@Mapped(ObjCObjectMapper.class) NSFetchedResultsControllerDelegate value);

    /**
     * Delegate that is notified when the result set changes.
     */
    @Generated
    public void setDelegate(@Mapped(ObjCObjectMapper.class) NSFetchedResultsControllerDelegate value) {
        Object __old = delegate();
        if (value != null) {
            org.moe.natj.objc.ObjCRuntime.associateObjCObject(this, value);
        }
        setDelegate_unsafe(value);
        if (__old != null) {
            org.moe.natj.objc.ObjCRuntime.dissociateObjCObject(this, __old);
        }
    }
}

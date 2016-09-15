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
public class NSFetchedResultsController extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected NSFetchedResultsController(Pointer peer) {
        super(peer);
    }

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSFetchedResultsController alloc();

    /**
     * cacheName</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreData/Reference/NSFetchedResultsController_Class/index.html#//apple_ref/occ/instp/NSFetchedResultsController/cacheName">iOS Dev Center</a>
     */
    @Generated
    @Selector("cacheName")
    public native String cacheName();

    /**
     * delegate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreData/Reference/NSFetchedResultsController_Class/index.html#//apple_ref/occ/instp/NSFetchedResultsController/delegate">iOS Dev Center</a>
     */
    @Generated
    @Selector("delegate")
    @MappedReturn(ObjCObjectMapper.class)
    public native NSFetchedResultsControllerDelegate delegate();

    /**
     * deleteCacheWithName:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreData/Reference/NSFetchedResultsController_Class/index.html#//apple_ref/occ/clm/NSFetchedResultsController/deleteCacheWithName:">iOS Dev Center</a>
     */
    @Generated
    @Selector("deleteCacheWithName:")
    public static native void deleteCacheWithName(String name);

    /**
     * fetchRequest</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreData/Reference/NSFetchedResultsController_Class/index.html#//apple_ref/occ/instp/NSFetchedResultsController/fetchRequest">iOS Dev Center</a>
     */
    @Generated
    @Selector("fetchRequest")
    public native NSFetchRequest fetchRequest();

    /**
     * fetchedObjects</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreData/Reference/NSFetchedResultsController_Class/index.html#//apple_ref/occ/instp/NSFetchedResultsController/fetchedObjects">iOS Dev Center</a>
     */
    @Generated
    @Selector("fetchedObjects")
    public native NSArray<?> fetchedObjects();

    /**
     * indexPathForObject:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreData/Reference/NSFetchedResultsController_Class/index.html#//apple_ref/occ/instm/NSFetchedResultsController/indexPathForObject:">iOS Dev Center</a>
     */
    @Generated
    @Selector("indexPathForObject:")
    public native NSIndexPath indexPathForObject(@Mapped(ObjCObjectMapper.class) Object object);

    @Generated
    @Selector("init")
    public native NSFetchedResultsController init();

    /**
     * initWithFetchRequest:managedObjectContext:sectionNameKeyPath:cacheName:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreData/Reference/NSFetchedResultsController_Class/index.html#//apple_ref/occ/instm/NSFetchedResultsController/initWithFetchRequest:managedObjectContext:sectionNameKeyPath:cacheName:">iOS Dev Center</a>
     */
    @Generated
    @Selector("initWithFetchRequest:managedObjectContext:sectionNameKeyPath:cacheName:")
    public native NSFetchedResultsController initWithFetchRequestManagedObjectContextSectionNameKeyPathCacheName(
            NSFetchRequest fetchRequest, NSManagedObjectContext context, String sectionNameKeyPath, String name);

    /**
     * managedObjectContext</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreData/Reference/NSFetchedResultsController_Class/index.html#//apple_ref/occ/instp/NSFetchedResultsController/managedObjectContext">iOS Dev Center</a>
     */
    @Generated
    @Selector("managedObjectContext")
    public native NSManagedObjectContext managedObjectContext();

    /**
     * objectAtIndexPath:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreData/Reference/NSFetchedResultsController_Class/index.html#//apple_ref/occ/instm/NSFetchedResultsController/objectAtIndexPath:">iOS Dev Center</a>
     */
    @Generated
    @Selector("objectAtIndexPath:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object objectAtIndexPath(NSIndexPath indexPath);

    /**
     * performFetch:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreData/Reference/NSFetchedResultsController_Class/index.html#//apple_ref/occ/instm/NSFetchedResultsController/performFetch:">iOS Dev Center</a>
     */
    @Generated
    @Selector("performFetch:")
    public native boolean performFetch(Ptr<NSError> error);

    /**
     * sectionForSectionIndexTitle:atIndex:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreData/Reference/NSFetchedResultsController_Class/index.html#//apple_ref/occ/instm/NSFetchedResultsController/sectionForSectionIndexTitle:atIndex:">iOS Dev Center</a>
     */
    @Generated
    @Selector("sectionForSectionIndexTitle:atIndex:")
    @NInt
    public native long sectionForSectionIndexTitleAtIndex(String title, @NInt long sectionIndex);

    /**
     * sectionIndexTitleForSectionName:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreData/Reference/NSFetchedResultsController_Class/index.html#//apple_ref/occ/instm/NSFetchedResultsController/sectionIndexTitleForSectionName:">iOS Dev Center</a>
     */
    @Generated
    @Selector("sectionIndexTitleForSectionName:")
    public native String sectionIndexTitleForSectionName(String sectionName);

    /**
     * sectionIndexTitles</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreData/Reference/NSFetchedResultsController_Class/index.html#//apple_ref/occ/instp/NSFetchedResultsController/sectionIndexTitles">iOS Dev Center</a>
     */
    @Generated
    @Selector("sectionIndexTitles")
    public native NSArray<String> sectionIndexTitles();

    /**
     * sectionNameKeyPath</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreData/Reference/NSFetchedResultsController_Class/index.html#//apple_ref/occ/instp/NSFetchedResultsController/sectionNameKeyPath">iOS Dev Center</a>
     */
    @Generated
    @Selector("sectionNameKeyPath")
    public native String sectionNameKeyPath();

    /**
     * sections</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreData/Reference/NSFetchedResultsController_Class/index.html#//apple_ref/occ/instp/NSFetchedResultsController/sections">iOS Dev Center</a>
     */
    @Generated
    @Selector("sections")
    public native NSArray<?> sections();

    /**
     * delegate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreData/Reference/NSFetchedResultsController_Class/index.html#//apple_ref/occ/instp/NSFetchedResultsController/delegate">iOS Dev Center</a>
     */
    @Generated
    @Selector("setDelegate:")
    public native void setDelegate_unsafe(@Mapped(ObjCObjectMapper.class) NSFetchedResultsControllerDelegate value);

    /**
     * delegate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreData/Reference/NSFetchedResultsController_Class/index.html#//apple_ref/occ/instp/NSFetchedResultsController/delegate">iOS Dev Center</a>
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
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}

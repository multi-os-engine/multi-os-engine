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
import apple.foundation.NSCoder;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSPredicate;
import apple.foundation.NSSet;
import apple.foundation.NSSortDescriptor;
import apple.foundation.protocol.NSCoding;
import apple.foundation.protocol.NSCopying;
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
public class NSFetchRequest<_ResultType> extends NSPersistentStoreRequest implements NSCoding, NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected NSFetchRequest(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSFetchRequest<?> alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native NSFetchRequest<?> allocWithZone(VoidPtr zone);

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
    @Selector("fetchRequestWithEntityName:")
    public static native <_ResultType> NSFetchRequest<?> fetchRequestWithEntityName(String entityName);

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
    public static native NSFetchRequest<?> new_objc();

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
    @Selector("affectedStores")
    public native NSArray<? extends NSPersistentStore> affectedStores();

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(NSCoder coder);

    @Generated
    @Selector("entity")
    public native NSEntityDescription entity();

    @Generated
    @Selector("entityName")
    public native String entityName();

    /**
     * Executes the fetch request using the current managed object context. This method must be called from within a
     * block submitted to a managed object context.
     */
    @Generated
    @Selector("execute:")
    public native NSArray<?> execute(@ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * This breaks the result set into batches. The entire request will be evaluated, and the identities of all matching
     * objects will be recorded, but no more than batchSize objects' data will be fetched from the persistent store at a
     * time. The array returned from executing the request will be a subclass that transparently faults batches on
     * demand. For purposes of thread safety, the returned array proxy is owned by the NSManagedObjectContext the
     * request is executed against, and should be treated as if it were a managed object registered with that context. A
     * batch size of 0 is treated as infinite, which disables the batch faulting behavior. The default is 0.
     */
    @Generated
    @Selector("fetchBatchSize")
    @NUInt
    public native long fetchBatchSize();

    @Generated
    @Selector("fetchLimit")
    @NUInt
    public native long fetchLimit();

    /**
     * Allows you to specify an offset at which rows will begin being returned. Effectively, the request will skip over
     * 'offset' number of matching entries. For example, given a fetch which would normally return a, b, c, and d,
     * specifying an offset of 1 will return b, c, and d and an offset of 4 will return an empty array. Offsets are
     * ignored in nested requests such as subqueries. Default value is 0.
     */
    @Generated
    @Selector("fetchOffset")
    @NUInt
    public native long fetchOffset();

    /**
     * Specifies a predicate that will be used to filter rows being returned by a query containing a GROUP BY. If a
     * having predicate is
     * supplied, it will be run after the GROUP BY. Specifying a HAVING predicate requires that a GROUP BY also be
     * specified.
     */
    @Generated
    @Selector("havingPredicate")
    public native NSPredicate havingPredicate();

    /**
     * Results accommodate the currently unsaved changes in the NSManagedObjectContext. When disabled, the fetch request
     * skips checking unsaved changes and only returns objects that matched the predicate in the persistent store.
     * Defaults to YES.
     */
    @Generated
    @Selector("includesPendingChanges")
    public native boolean includesPendingChanges();

    /**
     * Returns/sets if, when the fetch is executed, property data is obtained from the persistent store. If the value is
     * set to NO, the request will not obtain property information, but only information to identify each object (used
     * to create NSManagedObjectIDs.) If managed objects for these IDs are later faulted (as a result attempting to
     * access property values), they will incur subsequent access to the persistent store to obtain their property
     * values. Defaults to YES.
     */
    @Generated
    @Selector("includesPropertyValues")
    public native boolean includesPropertyValues();

    /**
     * Returns/sets if the fetch request includes subentities. If set to NO, the request will fetch objects of exactly
     * the entity type of the request; if set to YES, the request will include all subentities of the entity for the
     * request. Defaults to YES.
     */
    @Generated
    @Selector("includesSubentities")
    public native boolean includesSubentities();

    @Generated
    @Selector("init")
    public native NSFetchRequest<?> init();

    @Generated
    @Selector("initWithCoder:")
    public native NSFetchRequest<?> initWithCoder(NSCoder coder);

    @Generated
    @Selector("initWithEntityName:")
    public native NSFetchRequest<?> initWithEntityName(String entityName);

    @Generated
    @Selector("predicate")
    public native NSPredicate predicate();

    /**
     * Specifies a collection of either NSPropertyDescriptions or NSString property names that should be fetched. The
     * collection may represent attributes, to-one relationships, or NSExpressionDescription. If NSDictionaryResultType
     * is set, the results of the fetch will be dictionaries containing key/value pairs where the key is the name of the
     * specified property description. If NSManagedObjectResultType is set, then NSExpressionDescription cannot be used,
     * and the results are managed object faults partially pre-populated with the named properties
     */
    @Generated
    @Selector("propertiesToFetch")
    public native NSArray<?> propertiesToFetch();

    /**
     * Specifies the way in which data should be grouped before a select statement is run in an SQL database.
     * Values passed to propertiesToGroupBy must be NSPropertyDescriptions, NSExpressionDescriptions, or keypath
     * strings; keypaths can not contain
     * any to-many steps.
     * If GROUP BY is used, then you must set the resultsType to NSDictionaryResultsType, and the SELECT values must be
     * literals, aggregates,
     * or columns specified in the GROUP BY. Aggregates will operate on the groups specified in the GROUP BY rather than
     * the whole table.
     */
    @Generated
    @Selector("propertiesToGroupBy")
    public native NSArray<?> propertiesToGroupBy();

    /**
     * Returns/sets an array of relationship keypaths to prefetch along with the entity for the request. The array
     * contains keypath strings in NSKeyValueCoding notation, as you would normally use with valueForKeyPath.
     * (Prefetching allows Core Data to obtain developer-specified related objects in a single fetch (per entity),
     * rather than incurring subsequent access to the store for each individual record as their faults are tripped.)
     * Defaults to an empty array (no prefetching.)
     */
    @Generated
    @Selector("relationshipKeyPathsForPrefetching")
    public native NSArray<String> relationshipKeyPathsForPrefetching();

    /**
     * Returns/sets the result type of the fetch request (the instance type of objects returned from executing the
     * request.) Setting the value to NSManagedObjectIDResultType will demote any sort orderings to "best effort" hints
     * if property values are not included in the request. Defaults to NSManagedObjectResultType.
     */
    @Generated
    @Selector("resultType")
    @NUInt
    public native long resultType();

    /**
     * Returns/sets if the fetch request returns only distinct values for the fields specified by propertiesToFetch.
     * This value is only used for NSDictionaryResultType. Defaults to NO.
     */
    @Generated
    @Selector("returnsDistinctResults")
    public native boolean returnsDistinctResults();

    /**
     * Returns/sets if the objects resulting from a fetch request are faults. If the value is set to NO, the returned
     * objects are pre-populated with their property values (making them fully-faulted objects, which will immediately
     * return NO if sent the -isFault message.) If the value is set to YES, the returned objects are not pre-populated
     * (and will receive a -didFireFault message when the properties are accessed the first time.) This setting is not
     * utilized if the result type of the request is NSManagedObjectIDResultType, as object IDs do not have property
     * values. Defaults to YES.
     */
    @Generated
    @Selector("returnsObjectsAsFaults")
    public native boolean returnsObjectsAsFaults();

    @Generated
    @Selector("setAffectedStores:")
    public native void setAffectedStores(NSArray<? extends NSPersistentStore> value);

    @Generated
    @Selector("setEntity:")
    public native void setEntity(NSEntityDescription value);

    /**
     * This breaks the result set into batches. The entire request will be evaluated, and the identities of all matching
     * objects will be recorded, but no more than batchSize objects' data will be fetched from the persistent store at a
     * time. The array returned from executing the request will be a subclass that transparently faults batches on
     * demand. For purposes of thread safety, the returned array proxy is owned by the NSManagedObjectContext the
     * request is executed against, and should be treated as if it were a managed object registered with that context. A
     * batch size of 0 is treated as infinite, which disables the batch faulting behavior. The default is 0.
     */
    @Generated
    @Selector("setFetchBatchSize:")
    public native void setFetchBatchSize(@NUInt long value);

    @Generated
    @Selector("setFetchLimit:")
    public native void setFetchLimit(@NUInt long value);

    /**
     * Allows you to specify an offset at which rows will begin being returned. Effectively, the request will skip over
     * 'offset' number of matching entries. For example, given a fetch which would normally return a, b, c, and d,
     * specifying an offset of 1 will return b, c, and d and an offset of 4 will return an empty array. Offsets are
     * ignored in nested requests such as subqueries. Default value is 0.
     */
    @Generated
    @Selector("setFetchOffset:")
    public native void setFetchOffset(@NUInt long value);

    /**
     * Specifies a predicate that will be used to filter rows being returned by a query containing a GROUP BY. If a
     * having predicate is
     * supplied, it will be run after the GROUP BY. Specifying a HAVING predicate requires that a GROUP BY also be
     * specified.
     */
    @Generated
    @Selector("setHavingPredicate:")
    public native void setHavingPredicate(NSPredicate value);

    /**
     * Results accommodate the currently unsaved changes in the NSManagedObjectContext. When disabled, the fetch request
     * skips checking unsaved changes and only returns objects that matched the predicate in the persistent store.
     * Defaults to YES.
     */
    @Generated
    @Selector("setIncludesPendingChanges:")
    public native void setIncludesPendingChanges(boolean value);

    /**
     * Returns/sets if, when the fetch is executed, property data is obtained from the persistent store. If the value is
     * set to NO, the request will not obtain property information, but only information to identify each object (used
     * to create NSManagedObjectIDs.) If managed objects for these IDs are later faulted (as a result attempting to
     * access property values), they will incur subsequent access to the persistent store to obtain their property
     * values. Defaults to YES.
     */
    @Generated
    @Selector("setIncludesPropertyValues:")
    public native void setIncludesPropertyValues(boolean value);

    /**
     * Returns/sets if the fetch request includes subentities. If set to NO, the request will fetch objects of exactly
     * the entity type of the request; if set to YES, the request will include all subentities of the entity for the
     * request. Defaults to YES.
     */
    @Generated
    @Selector("setIncludesSubentities:")
    public native void setIncludesSubentities(boolean value);

    @Generated
    @Selector("setPredicate:")
    public native void setPredicate(NSPredicate value);

    /**
     * Specifies a collection of either NSPropertyDescriptions or NSString property names that should be fetched. The
     * collection may represent attributes, to-one relationships, or NSExpressionDescription. If NSDictionaryResultType
     * is set, the results of the fetch will be dictionaries containing key/value pairs where the key is the name of the
     * specified property description. If NSManagedObjectResultType is set, then NSExpressionDescription cannot be used,
     * and the results are managed object faults partially pre-populated with the named properties
     */
    @Generated
    @Selector("setPropertiesToFetch:")
    public native void setPropertiesToFetch(NSArray<?> value);

    /**
     * Specifies the way in which data should be grouped before a select statement is run in an SQL database.
     * Values passed to propertiesToGroupBy must be NSPropertyDescriptions, NSExpressionDescriptions, or keypath
     * strings; keypaths can not contain
     * any to-many steps.
     * If GROUP BY is used, then you must set the resultsType to NSDictionaryResultsType, and the SELECT values must be
     * literals, aggregates,
     * or columns specified in the GROUP BY. Aggregates will operate on the groups specified in the GROUP BY rather than
     * the whole table.
     */
    @Generated
    @Selector("setPropertiesToGroupBy:")
    public native void setPropertiesToGroupBy(NSArray<?> value);

    /**
     * Returns/sets an array of relationship keypaths to prefetch along with the entity for the request. The array
     * contains keypath strings in NSKeyValueCoding notation, as you would normally use with valueForKeyPath.
     * (Prefetching allows Core Data to obtain developer-specified related objects in a single fetch (per entity),
     * rather than incurring subsequent access to the store for each individual record as their faults are tripped.)
     * Defaults to an empty array (no prefetching.)
     */
    @Generated
    @Selector("setRelationshipKeyPathsForPrefetching:")
    public native void setRelationshipKeyPathsForPrefetching(NSArray<String> value);

    /**
     * Returns/sets the result type of the fetch request (the instance type of objects returned from executing the
     * request.) Setting the value to NSManagedObjectIDResultType will demote any sort orderings to "best effort" hints
     * if property values are not included in the request. Defaults to NSManagedObjectResultType.
     */
    @Generated
    @Selector("setResultType:")
    public native void setResultType(@NUInt long value);

    /**
     * Returns/sets if the fetch request returns only distinct values for the fields specified by propertiesToFetch.
     * This value is only used for NSDictionaryResultType. Defaults to NO.
     */
    @Generated
    @Selector("setReturnsDistinctResults:")
    public native void setReturnsDistinctResults(boolean value);

    /**
     * Returns/sets if the objects resulting from a fetch request are faults. If the value is set to NO, the returned
     * objects are pre-populated with their property values (making them fully-faulted objects, which will immediately
     * return NO if sent the -isFault message.) If the value is set to YES, the returned objects are not pre-populated
     * (and will receive a -didFireFault message when the properties are accessed the first time.) This setting is not
     * utilized if the result type of the request is NSManagedObjectIDResultType, as object IDs do not have property
     * values. Defaults to YES.
     */
    @Generated
    @Selector("setReturnsObjectsAsFaults:")
    public native void setReturnsObjectsAsFaults(boolean value);

    @Generated
    @Selector("setShouldRefreshRefetchedObjects:")
    public native void setShouldRefreshRefetchedObjects(boolean value);

    @Generated
    @Selector("setSortDescriptors:")
    public native void setSortDescriptors(NSArray<? extends NSSortDescriptor> value);

    @Generated
    @Selector("shouldRefreshRefetchedObjects")
    public native boolean shouldRefreshRefetchedObjects();

    @Generated
    @Selector("sortDescriptors")
    public native NSArray<? extends NSSortDescriptor> sortDescriptors();

    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(VoidPtr zone);
}

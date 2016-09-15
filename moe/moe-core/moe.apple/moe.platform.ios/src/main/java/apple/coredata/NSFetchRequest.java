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
import apple.foundation.NSMethodSignature;
import apple.foundation.NSPredicate;
import apple.foundation.NSSet;
import apple.foundation.NSSortDescriptor;
import apple.foundation.protocol.NSCoding;
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

@Generated
@Library("CoreData")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSFetchRequest extends NSPersistentStoreRequest implements NSCoding {
    static {
        NatJ.register();
    }

    @Generated
    protected NSFetchRequest(Pointer peer) {
        super(peer);
    }

    /**
     * affectedStores</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/CoreDataFramework/Classes/NSFetchRequest_Class/index.html#//apple_ref/occ/instp/NSFetchRequest/affectedStores">iOS Dev Center</a>
     */
    @Generated
    @Selector("affectedStores")
    public native NSArray<? extends NSPersistentStore> affectedStores();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSFetchRequest alloc();

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(NSCoder aCoder);

    /**
     * entity</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/CoreDataFramework/Classes/NSFetchRequest_Class/index.html#//apple_ref/occ/instp/NSFetchRequest/entity">iOS Dev Center</a>
     */
    @Generated
    @Selector("entity")
    public native NSEntityDescription entity();

    /**
     * entityName</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/CoreDataFramework/Classes/NSFetchRequest_Class/index.html#//apple_ref/occ/instp/NSFetchRequest/entityName">iOS Dev Center</a>
     */
    @Generated
    @Selector("entityName")
    public native String entityName();

    /**
     * fetchBatchSize</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/CoreDataFramework/Classes/NSFetchRequest_Class/index.html#//apple_ref/occ/instp/NSFetchRequest/fetchBatchSize">iOS Dev Center</a>
     */
    @Generated
    @Selector("fetchBatchSize")
    @NUInt
    public native long fetchBatchSize();

    /**
     * fetchLimit</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/CoreDataFramework/Classes/NSFetchRequest_Class/index.html#//apple_ref/occ/instp/NSFetchRequest/fetchLimit">iOS Dev Center</a>
     */
    @Generated
    @Selector("fetchLimit")
    @NUInt
    public native long fetchLimit();

    /**
     * fetchOffset</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/CoreDataFramework/Classes/NSFetchRequest_Class/index.html#//apple_ref/occ/instp/NSFetchRequest/fetchOffset">iOS Dev Center</a>
     */
    @Generated
    @Selector("fetchOffset")
    @NUInt
    public native long fetchOffset();

    /**
     * fetchRequestWithEntityName:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/CoreDataFramework/Classes/NSFetchRequest_Class/index.html#//apple_ref/occ/clm/NSFetchRequest/fetchRequestWithEntityName:">iOS Dev Center</a>
     */
    @Generated
    @Selector("fetchRequestWithEntityName:")
    public static native NSFetchRequest fetchRequestWithEntityName(String entityName);

    /**
     * havingPredicate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/CoreDataFramework/Classes/NSFetchRequest_Class/index.html#//apple_ref/occ/instp/NSFetchRequest/havingPredicate">iOS Dev Center</a>
     */
    @Generated
    @Selector("havingPredicate")
    public native NSPredicate havingPredicate();

    /**
     * includesPendingChanges</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/CoreDataFramework/Classes/NSFetchRequest_Class/index.html#//apple_ref/occ/instp/NSFetchRequest/includesPendingChanges">iOS Dev Center</a>
     */
    @Generated
    @Selector("includesPendingChanges")
    public native boolean includesPendingChanges();

    /**
     * includesPropertyValues</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/CoreDataFramework/Classes/NSFetchRequest_Class/index.html#//apple_ref/occ/instp/NSFetchRequest/includesPropertyValues">iOS Dev Center</a>
     */
    @Generated
    @Selector("includesPropertyValues")
    public native boolean includesPropertyValues();

    /**
     * includesSubentities</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/CoreDataFramework/Classes/NSFetchRequest_Class/index.html#//apple_ref/occ/instp/NSFetchRequest/includesSubentities">iOS Dev Center</a>
     */
    @Generated
    @Selector("includesSubentities")
    public native boolean includesSubentities();

    @Generated
    @Selector("init")
    public native NSFetchRequest init();

    @Generated
    @Selector("initWithCoder:")
    public native NSFetchRequest initWithCoder(NSCoder aDecoder);

    /**
     * initWithEntityName:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/CoreDataFramework/Classes/NSFetchRequest_Class/index.html#//apple_ref/occ/instm/NSFetchRequest/initWithEntityName:">iOS Dev Center</a>
     */
    @Generated
    @Selector("initWithEntityName:")
    public native NSFetchRequest initWithEntityName(String entityName);

    /**
     * predicate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/CoreDataFramework/Classes/NSFetchRequest_Class/index.html#//apple_ref/occ/instp/NSFetchRequest/predicate">iOS Dev Center</a>
     */
    @Generated
    @Selector("predicate")
    public native NSPredicate predicate();

    /**
     * propertiesToFetch</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/CoreDataFramework/Classes/NSFetchRequest_Class/index.html#//apple_ref/occ/instp/NSFetchRequest/propertiesToFetch">iOS Dev Center</a>
     */
    @Generated
    @Selector("propertiesToFetch")
    public native NSArray<?> propertiesToFetch();

    /**
     * propertiesToGroupBy</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/CoreDataFramework/Classes/NSFetchRequest_Class/index.html#//apple_ref/occ/instp/NSFetchRequest/propertiesToGroupBy">iOS Dev Center</a>
     */
    @Generated
    @Selector("propertiesToGroupBy")
    public native NSArray<?> propertiesToGroupBy();

    /**
     * relationshipKeyPathsForPrefetching</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/CoreDataFramework/Classes/NSFetchRequest_Class/index.html#//apple_ref/occ/instp/NSFetchRequest/relationshipKeyPathsForPrefetching">iOS Dev Center</a>
     */
    @Generated
    @Selector("relationshipKeyPathsForPrefetching")
    public native NSArray<String> relationshipKeyPathsForPrefetching();

    /**
     * resultType</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/CoreDataFramework/Classes/NSFetchRequest_Class/index.html#//apple_ref/occ/instp/NSFetchRequest/resultType">iOS Dev Center</a>
     */
    @Generated
    @Selector("resultType")
    @NUInt
    public native long resultType();

    /**
     * returnsDistinctResults</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/CoreDataFramework/Classes/NSFetchRequest_Class/index.html#//apple_ref/occ/instp/NSFetchRequest/returnsDistinctResults">iOS Dev Center</a>
     */
    @Generated
    @Selector("returnsDistinctResults")
    public native boolean returnsDistinctResults();

    /**
     * returnsObjectsAsFaults</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/CoreDataFramework/Classes/NSFetchRequest_Class/index.html#//apple_ref/occ/instp/NSFetchRequest/returnsObjectsAsFaults">iOS Dev Center</a>
     */
    @Generated
    @Selector("returnsObjectsAsFaults")
    public native boolean returnsObjectsAsFaults();

    /**
     * affectedStores</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/CoreDataFramework/Classes/NSFetchRequest_Class/index.html#//apple_ref/occ/instp/NSFetchRequest/affectedStores">iOS Dev Center</a>
     */
    @Generated
    @Selector("setAffectedStores:")
    public native void setAffectedStores(NSArray<? extends NSPersistentStore> value);

    /**
     * entity</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/CoreDataFramework/Classes/NSFetchRequest_Class/index.html#//apple_ref/occ/instp/NSFetchRequest/entity">iOS Dev Center</a>
     */
    @Generated
    @Selector("setEntity:")
    public native void setEntity(NSEntityDescription value);

    /**
     * fetchBatchSize</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/CoreDataFramework/Classes/NSFetchRequest_Class/index.html#//apple_ref/occ/instp/NSFetchRequest/fetchBatchSize">iOS Dev Center</a>
     */
    @Generated
    @Selector("setFetchBatchSize:")
    public native void setFetchBatchSize(@NUInt long value);

    /**
     * fetchLimit</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/CoreDataFramework/Classes/NSFetchRequest_Class/index.html#//apple_ref/occ/instp/NSFetchRequest/fetchLimit">iOS Dev Center</a>
     */
    @Generated
    @Selector("setFetchLimit:")
    public native void setFetchLimit(@NUInt long value);

    /**
     * fetchOffset</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/CoreDataFramework/Classes/NSFetchRequest_Class/index.html#//apple_ref/occ/instp/NSFetchRequest/fetchOffset">iOS Dev Center</a>
     */
    @Generated
    @Selector("setFetchOffset:")
    public native void setFetchOffset(@NUInt long value);

    /**
     * havingPredicate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/CoreDataFramework/Classes/NSFetchRequest_Class/index.html#//apple_ref/occ/instp/NSFetchRequest/havingPredicate">iOS Dev Center</a>
     */
    @Generated
    @Selector("setHavingPredicate:")
    public native void setHavingPredicate(NSPredicate value);

    /**
     * includesPendingChanges</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/CoreDataFramework/Classes/NSFetchRequest_Class/index.html#//apple_ref/occ/instp/NSFetchRequest/includesPendingChanges">iOS Dev Center</a>
     */
    @Generated
    @Selector("setIncludesPendingChanges:")
    public native void setIncludesPendingChanges(boolean value);

    /**
     * includesPropertyValues</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/CoreDataFramework/Classes/NSFetchRequest_Class/index.html#//apple_ref/occ/instp/NSFetchRequest/includesPropertyValues">iOS Dev Center</a>
     */
    @Generated
    @Selector("setIncludesPropertyValues:")
    public native void setIncludesPropertyValues(boolean value);

    /**
     * includesSubentities</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/CoreDataFramework/Classes/NSFetchRequest_Class/index.html#//apple_ref/occ/instp/NSFetchRequest/includesSubentities">iOS Dev Center</a>
     */
    @Generated
    @Selector("setIncludesSubentities:")
    public native void setIncludesSubentities(boolean value);

    /**
     * predicate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/CoreDataFramework/Classes/NSFetchRequest_Class/index.html#//apple_ref/occ/instp/NSFetchRequest/predicate">iOS Dev Center</a>
     */
    @Generated
    @Selector("setPredicate:")
    public native void setPredicate(NSPredicate value);

    /**
     * propertiesToFetch</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/CoreDataFramework/Classes/NSFetchRequest_Class/index.html#//apple_ref/occ/instp/NSFetchRequest/propertiesToFetch">iOS Dev Center</a>
     */
    @Generated
    @Selector("setPropertiesToFetch:")
    public native void setPropertiesToFetch(NSArray<?> value);

    /**
     * propertiesToGroupBy</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/CoreDataFramework/Classes/NSFetchRequest_Class/index.html#//apple_ref/occ/instp/NSFetchRequest/propertiesToGroupBy">iOS Dev Center</a>
     */
    @Generated
    @Selector("setPropertiesToGroupBy:")
    public native void setPropertiesToGroupBy(NSArray<?> value);

    /**
     * relationshipKeyPathsForPrefetching</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/CoreDataFramework/Classes/NSFetchRequest_Class/index.html#//apple_ref/occ/instp/NSFetchRequest/relationshipKeyPathsForPrefetching">iOS Dev Center</a>
     */
    @Generated
    @Selector("setRelationshipKeyPathsForPrefetching:")
    public native void setRelationshipKeyPathsForPrefetching(NSArray<String> value);

    /**
     * resultType</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/CoreDataFramework/Classes/NSFetchRequest_Class/index.html#//apple_ref/occ/instp/NSFetchRequest/resultType">iOS Dev Center</a>
     */
    @Generated
    @Selector("setResultType:")
    public native void setResultType(@NUInt long value);

    /**
     * returnsDistinctResults</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/CoreDataFramework/Classes/NSFetchRequest_Class/index.html#//apple_ref/occ/instp/NSFetchRequest/returnsDistinctResults">iOS Dev Center</a>
     */
    @Generated
    @Selector("setReturnsDistinctResults:")
    public native void setReturnsDistinctResults(boolean value);

    /**
     * returnsObjectsAsFaults</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/CoreDataFramework/Classes/NSFetchRequest_Class/index.html#//apple_ref/occ/instp/NSFetchRequest/returnsObjectsAsFaults">iOS Dev Center</a>
     */
    @Generated
    @Selector("setReturnsObjectsAsFaults:")
    public native void setReturnsObjectsAsFaults(boolean value);

    /**
     * shouldRefreshRefetchedObjects</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/CoreDataFramework/Classes/NSFetchRequest_Class/index.html#//apple_ref/occ/instp/NSFetchRequest/shouldRefreshRefetchedObjects">iOS Dev Center</a>
     */
    @Generated
    @Selector("setShouldRefreshRefetchedObjects:")
    public native void setShouldRefreshRefetchedObjects(boolean value);

    /**
     * sortDescriptors</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/CoreDataFramework/Classes/NSFetchRequest_Class/index.html#//apple_ref/occ/instp/NSFetchRequest/sortDescriptors">iOS Dev Center</a>
     */
    @Generated
    @Selector("setSortDescriptors:")
    public native void setSortDescriptors(NSArray<? extends NSSortDescriptor> value);

    /**
     * shouldRefreshRefetchedObjects</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/CoreDataFramework/Classes/NSFetchRequest_Class/index.html#//apple_ref/occ/instp/NSFetchRequest/shouldRefreshRefetchedObjects">iOS Dev Center</a>
     */
    @Generated
    @Selector("shouldRefreshRefetchedObjects")
    public native boolean shouldRefreshRefetchedObjects();

    /**
     * sortDescriptors</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/CoreDataFramework/Classes/NSFetchRequest_Class/index.html#//apple_ref/occ/instp/NSFetchRequest/sortDescriptors">iOS Dev Center</a>
     */
    @Generated
    @Selector("sortDescriptors")
    public native NSArray<? extends NSSortDescriptor> sortDescriptors();

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

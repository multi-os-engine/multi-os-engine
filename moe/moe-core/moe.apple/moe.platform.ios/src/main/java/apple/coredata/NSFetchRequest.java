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
public class NSFetchRequest<_ResultType> extends NSPersistentStoreRequest implements NSCoding {
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

    @Generated
    @Selector("execute:")
    public native NSArray<?> execute(@ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Selector("fetchBatchSize")
    @NUInt
    public native long fetchBatchSize();

    @Generated
    @Selector("fetchLimit")
    @NUInt
    public native long fetchLimit();

    @Generated
    @Selector("fetchOffset")
    @NUInt
    public native long fetchOffset();

    @Generated
    @Selector("havingPredicate")
    public native NSPredicate havingPredicate();

    @Generated
    @Selector("includesPendingChanges")
    public native boolean includesPendingChanges();

    @Generated
    @Selector("includesPropertyValues")
    public native boolean includesPropertyValues();

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

    @Generated
    @Selector("propertiesToFetch")
    public native NSArray<?> propertiesToFetch();

    @Generated
    @Selector("propertiesToGroupBy")
    public native NSArray<?> propertiesToGroupBy();

    @Generated
    @Selector("relationshipKeyPathsForPrefetching")
    public native NSArray<String> relationshipKeyPathsForPrefetching();

    @Generated
    @Selector("resultType")
    @NUInt
    public native long resultType();

    @Generated
    @Selector("returnsDistinctResults")
    public native boolean returnsDistinctResults();

    @Generated
    @Selector("returnsObjectsAsFaults")
    public native boolean returnsObjectsAsFaults();

    @Generated
    @Selector("setAffectedStores:")
    public native void setAffectedStores(NSArray<? extends NSPersistentStore> value);

    @Generated
    @Selector("setEntity:")
    public native void setEntity(NSEntityDescription value);

    @Generated
    @Selector("setFetchBatchSize:")
    public native void setFetchBatchSize(@NUInt long value);

    @Generated
    @Selector("setFetchLimit:")
    public native void setFetchLimit(@NUInt long value);

    @Generated
    @Selector("setFetchOffset:")
    public native void setFetchOffset(@NUInt long value);

    @Generated
    @Selector("setHavingPredicate:")
    public native void setHavingPredicate(NSPredicate value);

    @Generated
    @Selector("setIncludesPendingChanges:")
    public native void setIncludesPendingChanges(boolean value);

    @Generated
    @Selector("setIncludesPropertyValues:")
    public native void setIncludesPropertyValues(boolean value);

    @Generated
    @Selector("setIncludesSubentities:")
    public native void setIncludesSubentities(boolean value);

    @Generated
    @Selector("setPredicate:")
    public native void setPredicate(NSPredicate value);

    @Generated
    @Selector("setPropertiesToFetch:")
    public native void setPropertiesToFetch(NSArray<?> value);

    @Generated
    @Selector("setPropertiesToGroupBy:")
    public native void setPropertiesToGroupBy(NSArray<?> value);

    @Generated
    @Selector("setRelationshipKeyPathsForPrefetching:")
    public native void setRelationshipKeyPathsForPrefetching(NSArray<String> value);

    @Generated
    @Selector("setResultType:")
    public native void setResultType(@NUInt long value);

    @Generated
    @Selector("setReturnsDistinctResults:")
    public native void setReturnsDistinctResults(boolean value);

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
}

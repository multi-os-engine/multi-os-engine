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
import apple.foundation.NSArray;
import apple.foundation.NSDictionary;
import apple.foundation.NSError;
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
import org.moe.natj.objc.ObjCObject;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("CoreData")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSManagedObject extends NSObject implements NSFetchRequestResult {
    static {
        NatJ.register();
    }

    @Generated
    protected NSManagedObject(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSManagedObject alloc();

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
    @Selector("contextShouldIgnoreUnmodeledPropertyChanges")
    public static native boolean contextShouldIgnoreUnmodeledPropertyChanges();

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("entity")
    public static native NSEntityDescription entity_static();

    @Generated
    @Selector("fetchRequest")
    public static native NSFetchRequest<?> fetchRequest();

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

    @Generated
    @Selector("awakeFromFetch")
    public native void awakeFromFetch();

    @Generated
    @Selector("awakeFromInsert")
    public native void awakeFromInsert();

    @Generated
    @Selector("awakeFromSnapshotEvents:")
    public native void awakeFromSnapshotEvents(@NUInt long flags);

    @Generated
    @Selector("changedValues")
    public native NSDictionary<String, ?> changedValues();

    @Generated
    @Selector("changedValuesForCurrentEvent")
    public native NSDictionary<String, ?> changedValuesForCurrentEvent();

    @Generated
    @Selector("committedValuesForKeys:")
    public native NSDictionary<String, ?> committedValuesForKeys(NSArray<String> keys);

    @Generated
    @Selector("didAccessValueForKey:")
    public native void didAccessValueForKey(String key);

    @Generated
    @Selector("didChangeValueForKey:")
    public native void didChangeValueForKey(String key);

    @Generated
    @Selector("didChangeValueForKey:withSetMutation:usingObjects:")
    public native void didChangeValueForKeyWithSetMutationUsingObjects(String inKey, @NUInt long inMutationKind,
            NSSet<?> inObjects);

    @Generated
    @Selector("didSave")
    public native void didSave();

    @Generated
    @Selector("didTurnIntoFault")
    public native void didTurnIntoFault();

    @Generated
    @Selector("entity")
    public native NSEntityDescription entity();

    @Generated
    @Selector("faultingState")
    @NUInt
    public native long faultingState();

    @Generated
    @Selector("hasChanges")
    public native boolean hasChanges();

    @Generated
    @Selector("hasFaultForRelationshipNamed:")
    public native boolean hasFaultForRelationshipNamed(String key);

    @Generated
    @Selector("hasPersistentChangedValues")
    public native boolean hasPersistentChangedValues();

    @Generated
    @Selector("init")
    public native NSManagedObject init();

    @Generated
    @Selector("initWithContext:")
    public native NSManagedObject initWithContext(NSManagedObjectContext moc);

    @Generated
    @Selector("initWithEntity:insertIntoManagedObjectContext:")
    public native NSManagedObject initWithEntityInsertIntoManagedObjectContext(NSEntityDescription entity,
            NSManagedObjectContext context);

    @Generated
    @Selector("isDeleted")
    public native boolean isDeleted();

    @Generated
    @Selector("isFault")
    public native boolean isFault();

    @Generated
    @Selector("isInserted")
    public native boolean isInserted();

    @Generated
    @Selector("isUpdated")
    public native boolean isUpdated();

    @Generated
    @Selector("managedObjectContext")
    public native NSManagedObjectContext managedObjectContext();

    @Generated
    @Selector("objectID")
    public native NSManagedObjectID objectID();

    @Generated
    @Selector("objectIDsForRelationshipNamed:")
    public native NSArray<? extends NSManagedObjectID> objectIDsForRelationshipNamed(String key);

    @Generated
    @Selector("prepareForDeletion")
    public native void prepareForDeletion();

    @Generated
    @Selector("primitiveValueForKey:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object primitiveValueForKey(String key);

    @Generated
    @Selector("setPrimitiveValue:forKey:")
    public native void setPrimitiveValueForKey(@Mapped(ObjCObjectMapper.class) Object value, String key);

    @Generated
    @Selector("setValue:forKey:")
    public native void setValueForKey(@Mapped(ObjCObjectMapper.class) Object value, String key);

    @Generated
    @Selector("validateForDelete:")
    public native boolean validateForDelete(@ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Selector("validateForInsert:")
    public native boolean validateForInsert(@ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Selector("validateForUpdate:")
    public native boolean validateForUpdate(@ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Selector("validateValue:forKey:error:")
    public native boolean validateValueForKeyError(@ReferenceInfo(type = ObjCObject.class) Ptr<ObjCObject> value,
            String key, @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Selector("valueForKey:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object valueForKey(String key);

    @Generated
    @Selector("willAccessValueForKey:")
    public native void willAccessValueForKey(String key);

    @Generated
    @Selector("willChangeValueForKey:")
    public native void willChangeValueForKey(String key);

    @Generated
    @Selector("willChangeValueForKey:withSetMutation:usingObjects:")
    public native void willChangeValueForKeyWithSetMutationUsingObjects(String inKey, @NUInt long inMutationKind,
            NSSet<?> inObjects);

    @Generated
    @Selector("willSave")
    public native void willSave();

    @Generated
    @Selector("willTurnIntoFault")
    public native void willTurnIntoFault();
}

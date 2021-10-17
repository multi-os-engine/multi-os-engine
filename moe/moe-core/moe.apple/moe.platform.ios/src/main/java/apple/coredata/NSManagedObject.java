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
    public static native NSManagedObject allocWithZone(VoidPtr zone);

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

    /**
     * Distinguish between changes that should and should not dirty the object for any key unknown to Core Data.  10.5 & earlier default to NO.  10.6 and later default to YES.
     * Similarly, transient attributes may be individually flagged as not dirtying the object by adding +(BOOL)contextShouldIgnoreChangesFor<key> where <key> is the property name.
     */
    @Generated
    @Selector("contextShouldIgnoreUnmodeledPropertyChanges")
    public static native boolean contextShouldIgnoreUnmodeledPropertyChanges();

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * The Entity represented by this subclass. This method is only legal to call on subclasses of NSManagedObject that represent a single entity in the model.
     */
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
    public static native NSManagedObject new_objc();

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
     * invoked after a fetch or after unfaulting (commonly used for computing derived values from the persisted properties)
     */
    @Generated
    @Selector("awakeFromFetch")
    public native void awakeFromFetch();

    /**
     * invoked after an insert (commonly used for initializing special default/initial settings)
     */
    @Generated
    @Selector("awakeFromInsert")
    public native void awakeFromInsert();

    /**
     * Callback for undo, redo, and other multi-property state resets
     */
    @Generated
    @Selector("awakeFromSnapshotEvents:")
    public native void awakeFromSnapshotEvents(@NUInt long flags);

    /**
     * returns a dictionary with the keys and (new) values that have been changed since last fetching or saving the object (this is implemented efficiently without firing relationship faults)
     */
    @Generated
    @Selector("changedValues")
    public native NSDictionary<String, ?> changedValues();

    @Generated
    @Selector("changedValuesForCurrentEvent")
    public native NSDictionary<String, ?> changedValuesForCurrentEvent();

    /**
     * returns a dictionary of the last fetched or saved keys and values of this object.  Pass nil to get all persistent modeled properties.
     */
    @Generated
    @Selector("committedValuesForKeys:")
    public native NSDictionary<String, ?> committedValuesForKeys(NSArray<String> keys);

    /**
     * read notification (together with willAccessValueForKey used to maintain inverse relationships, to fire faults, etc.) - each read access has to be wrapped in this method pair (in the same way as each write access has to be wrapped in the KVO method pair)
     */
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

    /**
     * commonly used to notify other objects after a save
     */
    @Generated
    @Selector("didSave")
    public native void didSave();

    /**
     * commonly used to clear out additional transient values or caches
     */
    @Generated
    @Selector("didTurnIntoFault")
    public native void didTurnIntoFault();

    @Generated
    @Selector("entity")
    public native NSEntityDescription entity();

    /**
     * Allow developers to determine if an object is in a transitional phase when receiving a KVO notification.  Returns 0 if the object is fully initialized as a managed object and not transitioning to or from another state
     */
    @Generated
    @Selector("faultingState")
    @NUInt
    public native long faultingState();

    @Generated
    @Selector("hasChanges")
    public native boolean hasChanges();

    /**
     * returns a Boolean indicating if the relationship for the specified key is a fault.  If a value of NO is returned, the resulting relationship is a realized object;  otherwise the relationship is a fault.  If the specified relationship is a fault, calling this method does not result in the fault firing.
     */
    @Generated
    @Selector("hasFaultForRelationshipNamed:")
    public native boolean hasFaultForRelationshipNamed(String key);

    /**
     * returns YES if any persistent properties do not compare isEqual to their last saved state.  Relationship faults will not be unnecessarily fired.  This differs from the existing -hasChanges method which is a simple dirty flag and also includes transient properties
     */
    @Generated
    @Selector("hasPersistentChangedValues")
    public native boolean hasPersistentChangedValues();

    @Generated
    @Selector("init")
    public native NSManagedObject init();

    /**
     * Returns a new object, inserted into managedObjectContext. This method is only legal to call on subclasses of NSManagedObject that represent a single entity in the model.
     */
    @Generated
    @Selector("initWithContext:")
    public native NSManagedObject initWithContext(NSManagedObjectContext moc);

    /**
     * The designated initializer.
     */
    @Generated
    @Selector("initWithEntity:insertIntoManagedObjectContext:")
    public native NSManagedObject initWithEntityInsertIntoManagedObjectContext(NSEntityDescription entity,
            NSManagedObjectContext context);

    @Generated
    @Selector("isDeleted")
    public native boolean isDeleted();

    /**
     * this information is useful in many situations when computations are optional - this can be used to avoid growing the object graph unnecessarily (which allows to control performance as it can avoid time consuming fetches from databases)
     */
    @Generated
    @Selector("isFault")
    public native boolean isFault();

    /**
     * state - methods
     */
    @Generated
    @Selector("isInserted")
    public native boolean isInserted();

    @Generated
    @Selector("isUpdated")
    public native boolean isUpdated();

    /**
     * identity
     */
    @Generated
    @Selector("managedObjectContext")
    public native NSManagedObjectContext managedObjectContext();

    @Generated
    @Selector("objectID")
    public native NSManagedObjectID objectID();

    /**
     * returns an array of objectIDs for the contents of a relationship.  to-one relationships will return an NSArray with a single NSManagedObjectID.  Optional relationships may return an empty NSArray.  The objectIDs will be returned in an NSArray regardless of the type of the relationship.
     */
    @Generated
    @Selector("objectIDsForRelationshipNamed:")
    public native NSArray<? extends NSManagedObjectID> objectIDsForRelationshipNamed(String key);

    /**
     * Callback before delete propagation while the object is still alive.  Useful to perform custom propagation before the relationships are torn down or reconfigure KVO observers.
     */
    @Generated
    @Selector("prepareForDeletion")
    public native void prepareForDeletion();

    /**
     * primitive methods give access to the generic dictionary storage from subclasses that implement explicit accessors like -setName/-name to add custom document logic
     */
    @Generated
    @Selector("primitiveValueForKey:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object primitiveValueForKey(String key);

    @Generated
    @Selector("setPrimitiveValue:forKey:")
    public native void setPrimitiveValueForKey(@Mapped(ObjCObjectMapper.class) Object value, String key);

    /**
     * KVC - overridden to access generic dictionary storage unless subclasses explicitly provide accessors
     */
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

    /**
     * KVC
     */
    @Generated
    @Selector("validateValue:forKey:error:")
    public native boolean validateValueForKeyError(@ReferenceInfo(type = ObjCObject.class) Ptr<ObjCObject> value,
            String key, @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * KVC - overridden to access generic dictionary storage unless subclasses explicitly provide accessors
     */
    @Generated
    @Selector("valueForKey:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object valueForKey(String key);

    /**
     * read notification
     */
    @Generated
    @Selector("willAccessValueForKey:")
    public native void willAccessValueForKey(String key);

    /**
     * KVO change notification
     */
    @Generated
    @Selector("willChangeValueForKey:")
    public native void willChangeValueForKey(String key);

    @Generated
    @Selector("willChangeValueForKey:withSetMutation:usingObjects:")
    public native void willChangeValueForKeyWithSetMutationUsingObjects(String inKey, @NUInt long inMutationKind,
            NSSet<?> inObjects);

    /**
     * commonly used to compute persisted values from other transient/scratchpad values, to set timestamps, etc. - this method can have "side effects" on the persisted values
     */
    @Generated
    @Selector("willSave")
    public native void willSave();

    /**
     * invoked automatically by the Core Data framework before receiver is converted (back) to a fault.  This method is the companion of the -didTurnIntoFault method, and may be used to (re)set state which requires access to property values (for example, observers across keypaths.)  The default implementation does nothing.
     */
    @Generated
    @Selector("willTurnIntoFault")
    public native void willTurnIntoFault();
}

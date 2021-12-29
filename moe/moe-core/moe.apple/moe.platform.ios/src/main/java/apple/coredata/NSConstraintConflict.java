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
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
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
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * Used to report merge conflicts which include uniqueness constraint violations. Optimistic locking failures will be reported
 * separately from uniquness conflicts and will be resolved first. Each constraint violated will result in a separate NSMergeConflict,
 * although if an entity hierarchy has a constraint which is extended in subentities, all constraint violations for that constraint
 * will be collapsed into a single report.
 */
@Generated
@Library("CoreData")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSConstraintConflict extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected NSConstraintConflict(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSConstraintConflict alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native NSConstraintConflict allocWithZone(VoidPtr zone);

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

    @Generated
    @Owned
    @Selector("new")
    public static native NSConstraintConflict new_objc();

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
     * The objects in violation of the constraint. May contain one (in the case of a db level conflict) or more objects.
     */
    @Generated
    @Selector("conflictingObjects")
    public native NSArray<? extends NSManagedObject> conflictingObjects();

    /**
     * The original property values of objects in violation of the constraint.  Will contain as many objects as there are conflictingObjects. If an object was unchanged, its snapshot will instead be -[NSNull null].
     */
    @Generated
    @Selector("conflictingSnapshots")
    public native NSArray<? extends NSDictionary<?, ?>> conflictingSnapshots();

    /**
     * The constraint which has been violated.
     */
    @Generated
    @Selector("constraint")
    public native NSArray<String> constraint();

    /**
     * The values which the conflictingObjects had when this conflict was created. May no longer match the values of any conflicted object if something else resolved the conflict.
     */
    @Generated
    @Selector("constraintValues")
    public native NSDictionary<String, ?> constraintValues();

    /**
     * Object whose DB row is using constraint values. May be null if this is a context-level violation.
     */
    @Generated
    @Selector("databaseObject")
    public native NSManagedObject databaseObject();

    /**
     * DB row already using constraint values. May be null if this is a context-level violation.
     */
    @Generated
    @Selector("databaseSnapshot")
    public native NSDictionary<String, ?> databaseSnapshot();

    @Generated
    @Selector("init")
    public native NSConstraintConflict init();

    /**
     * There are two situations in which a constraint conflict may occur:
     * <p>
     * 1. Between multiple objects being saved in a single managed object context. In this case, the conflict
     * will have a nil database object/snapshot, and multiple conflicting objects/snapshots representing
     * the state of the objects when they were first faulted or inserted into the context.
     * <p>
     * 2. Between a single object being saved in a managed object context and the external store. In this case, the
     * constraint conflict will have a database object, the current row snapshot for the database object, plus a
     * a single conflicting object and its snapshot from when it was first faulted or inserted.
     * <p>
     * Snapshot dictionaries include values for all attributes and to-one relationships, but not to-many relationships.
     * Relationship values are NSManagedObjectID references. to-many relationships must be pulled from the persistent store as needed.
     */
    @Generated
    @Selector("initWithConstraint:databaseObject:databaseSnapshot:conflictingObjects:conflictingSnapshots:")
    public native NSConstraintConflict initWithConstraintDatabaseObjectDatabaseSnapshotConflictingObjectsConflictingSnapshots(
            NSArray<String> contraint, NSManagedObject databaseObject, NSDictionary<?, ?> databaseSnapshot,
            NSArray<? extends NSManagedObject> conflictingObjects, NSArray<?> conflictingSnapshots);
}

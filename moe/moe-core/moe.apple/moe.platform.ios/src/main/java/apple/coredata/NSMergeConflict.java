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

@Generated
@Library("CoreData")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSMergeConflict extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected NSMergeConflict(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSMergeConflict alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native NSMergeConflict allocWithZone(VoidPtr zone);

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
    public static native NSMergeConflict new_objc();

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
    @Selector("cachedSnapshot")
    public native NSDictionary<String, ?> cachedSnapshot();

    @Generated
    @Selector("init")
    public native NSMergeConflict init();

    /**
     * There are two situations in which a conflict may occur:
     * <p>
     * 1. Between the NSManagedObjectContext and its in-memory cached state at the NSPersistentStoreCoordinator layer.
     * In this case, the merge conflict has a source object and a cached snapshot but no persisted snapshot (persnap is
     * nil).
     * <p>
     * 2. Between the cached state at the NSPersistentStoreCoordinator and the external store (file, database, etc.).
     * In this case, the merge conflict has a cached snapshot and a persisted snapshot. The source object is also
     * provided as a convenience,
     * but it is not directly involved in the conflict.
     * <p>
     * Snapshot dictionaries include values for all attributes and to-one relationships, but not to-many relationships.
     * Relationship values are NSManagedObjectID references. to-many relationships must be pulled from the persistent
     * store as needed.
     * <p>
     * A newVersion number of 0 means the object was deleted and the corresponding snapshot is nil.
     */
    @Generated
    @Selector("initWithSource:newVersion:oldVersion:cachedSnapshot:persistedSnapshot:")
    public native NSMergeConflict initWithSourceNewVersionOldVersionCachedSnapshotPersistedSnapshot(
            NSManagedObject srcObject, @NUInt long newvers, @NUInt long oldvers, NSDictionary<String, ?> cachesnap,
            NSDictionary<String, ?> persnap);

    @Generated
    @Selector("newVersionNumber")
    @NUInt
    public native long newVersionNumber();

    @Generated
    @Selector("objectSnapshot")
    public native NSDictionary<String, ?> objectSnapshot();

    @Generated
    @Selector("oldVersionNumber")
    @NUInt
    public native long oldVersionNumber();

    @Generated
    @Selector("persistedSnapshot")
    public native NSDictionary<String, ?> persistedSnapshot();

    @Generated
    @Selector("sourceObject")
    public native NSManagedObject sourceObject();
}

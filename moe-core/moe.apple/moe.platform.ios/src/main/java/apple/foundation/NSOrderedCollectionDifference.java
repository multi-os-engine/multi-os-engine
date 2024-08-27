package apple.foundation;

import apple.NSObject;
import apple.foundation.protocol.NSFastEnumeration;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
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
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * API-Since: 13.0
 */
@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSOrderedCollectionDifference<_ObjectType> extends NSObject implements NSFastEnumeration {
    static {
        NatJ.register();
    }

    @Generated
    protected NSOrderedCollectionDifference(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSOrderedCollectionDifference<?> alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native NSOrderedCollectionDifference<?> allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(
            @NotNull @Mapped(ObjCObjectMapper.class) Object aTarget);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
    public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
            @NotNull @Mapped(ObjCObjectMapper.class) Object aTarget, @NotNull SEL aSelector,
            @Nullable @Mapped(ObjCObjectMapper.class) Object anArgument);

    @NotNull
    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @NotNull
    @Generated
    @Selector("classForKeyedUnarchiver")
    public static native Class classForKeyedUnarchiver();

    @Generated
    @Selector("countByEnumeratingWithState:objects:count:")
    @NUInt
    public native long countByEnumeratingWithStateObjectsCount(@NotNull VoidPtr state,
            @NotNull @ReferenceInfo(type = ObjCObject.class) Ptr<ObjCObject> buffer, @NUInt long len);

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * Create a new difference by mapping over this difference's members
     */
    @NotNull
    @Generated
    @Selector("differenceByTransformingChangesWithBlock:")
    public native NSOrderedCollectionDifference<Object> differenceByTransformingChangesWithBlock(
            @NotNull @ObjCBlock(name = "call_differenceByTransformingChangesWithBlock") Block_differenceByTransformingChangesWithBlock block);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_differenceByTransformingChangesWithBlock {
        @NotNull
        @Generated
        NSOrderedCollectionChange<Object> call_differenceByTransformingChangesWithBlock(
                @NotNull NSOrderedCollectionChange<Object> arg0);
    }

    @Generated
    @Selector("hasChanges")
    public native boolean hasChanges();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native NSOrderedCollectionDifference<?> init();

    /**
     * Creates a new difference representing the changes in the parameter.
     * 
     * For clients interested in the difference between two collections, the
     * collection's differenceFrom method should be used instead.
     * 
     * To guarantee that instances are unambiguous and safe for compatible base
     * states, this method requires that its parameter conform to the following
     * requirements:
     * 
     * 1) All insertion offsets are unique
     * 2) All removal offsets are unique
     * 3) All associated indexes match a change with the opposite parity.
     */
    @Generated
    @Selector("initWithChanges:")
    public native NSOrderedCollectionDifference<?> initWithChanges(
            @NotNull NSArray<? extends NSOrderedCollectionChange<_ObjectType>> changes);

    @Generated
    @Selector("initWithInsertIndexes:insertedObjects:removeIndexes:removedObjects:")
    public native NSOrderedCollectionDifference<?> initWithInsertIndexesInsertedObjectsRemoveIndexesRemovedObjects(
            @NotNull NSIndexSet inserts, @Nullable NSArray<_ObjectType> insertedObjects, @NotNull NSIndexSet removes,
            @Nullable NSArray<_ObjectType> removedObjects);

    @Generated
    @Selector("initWithInsertIndexes:insertedObjects:removeIndexes:removedObjects:additionalChanges:")
    public native NSOrderedCollectionDifference<?> initWithInsertIndexesInsertedObjectsRemoveIndexesRemovedObjectsAdditionalChanges(
            @NotNull NSIndexSet inserts, @Nullable NSArray<_ObjectType> insertedObjects, @NotNull NSIndexSet removes,
            @Nullable NSArray<_ObjectType> removedObjects,
            @NotNull NSArray<? extends NSOrderedCollectionChange<_ObjectType>> changes);

    /**
     * API-Since: 13.0
     */
    @NotNull
    @Generated
    @Selector("insertions")
    public native NSArray<? extends NSOrderedCollectionChange<_ObjectType>> insertions();

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

    /**
     * Returns a difference that is the inverse of the receiver.
     * 
     * In other words, given a valid difference `diff` the array `a` is equal to
     * [[a arrayByApplyingDifference:diff] arrayByApplyingDifference:diff.inverseDifference]
     * 
     * To revert a chronological sequence of diffs, apply their inverses in reverse order.
     * 
     * API-Since: 13.0
     */
    @NotNull
    @Generated
    @Selector("inverseDifference")
    public native NSOrderedCollectionDifference<?> inverseDifference();

    @Generated
    @Selector("isSubclassOfClass:")
    public static native boolean isSubclassOfClass(Class aClass);

    @NotNull
    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    @Generated
    @Owned
    @Selector("new")
    public static native NSOrderedCollectionDifference<?> new_objc();

    /**
     * API-Since: 13.0
     */
    @NotNull
    @Generated
    @Selector("removals")
    public native NSArray<? extends NSOrderedCollectionChange<_ObjectType>> removals();

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
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}

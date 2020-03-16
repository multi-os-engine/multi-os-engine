package apple.foundation;

import apple.NSObject;
import apple.foundation.protocol.NSFastEnumeration;
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
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

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
    @Selector("countByEnumeratingWithState:objects:count:")
    @NUInt
    public native long countByEnumeratingWithStateObjectsCount(VoidPtr state,
            @ReferenceInfo(type = ObjCObject.class) Ptr<ObjCObject> buffer, @NUInt long len);

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("differenceByTransformingChangesWithBlock:")
    public native NSOrderedCollectionDifference<Object> differenceByTransformingChangesWithBlock(
            @ObjCBlock(name = "call_differenceByTransformingChangesWithBlock") Block_differenceByTransformingChangesWithBlock block);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_differenceByTransformingChangesWithBlock {
        @Generated
        NSOrderedCollectionChange<Object> call_differenceByTransformingChangesWithBlock(
                NSOrderedCollectionChange<Object> arg0);
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

    @Generated
    @Selector("initWithChanges:")
    public native NSOrderedCollectionDifference<?> initWithChanges(
            NSArray<? extends NSOrderedCollectionChange<_ObjectType>> changes);

    @Generated
    @Selector("initWithInsertIndexes:insertedObjects:removeIndexes:removedObjects:")
    public native NSOrderedCollectionDifference<?> initWithInsertIndexesInsertedObjectsRemoveIndexesRemovedObjects(
            NSIndexSet inserts, NSArray<_ObjectType> insertedObjects, NSIndexSet removes,
            NSArray<_ObjectType> removedObjects);

    @Generated
    @Selector("initWithInsertIndexes:insertedObjects:removeIndexes:removedObjects:additionalChanges:")
    public native NSOrderedCollectionDifference<?> initWithInsertIndexesInsertedObjectsRemoveIndexesRemovedObjectsAdditionalChanges(
            NSIndexSet inserts, NSArray<_ObjectType> insertedObjects, NSIndexSet removes,
            NSArray<_ObjectType> removedObjects, NSArray<? extends NSOrderedCollectionChange<_ObjectType>> changes);

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

    @Generated
    @Selector("inverseDifference")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object inverseDifference();

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
}
package apple.foundation;

import apple.NSObject;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * API-Since: 13.0
 */
@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSOrderedCollectionChange<_ObjectType> extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected NSOrderedCollectionChange(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSOrderedCollectionChange<?> alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native NSOrderedCollectionChange<?> allocWithZone(VoidPtr zone);

    /**
     * When non-NSNotFound, indicates that this change is one half of a move, with
     * this value referring to the index of the other change that completes it.
     * For differences produced by identity comparison (instead of equality), each
     * change representing a move operation may store different objects.
     */
    @Generated
    @Selector("associatedIndex")
    @NUInt
    public native long associatedIndex();

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

    /**
     * The change type: insert or remove
     */
    @Generated
    @Selector("changeType")
    @NInt
    public native long changeType();

    @NotNull
    @Generated
    @Selector("changeWithObject:type:index:")
    public static native <_ObjectType> NSOrderedCollectionChange<_ObjectType> changeWithObjectTypeIndex(
            @Nullable @Mapped(ObjCObjectMapper.class) _ObjectType anObject, @NInt long type, @NUInt long index);

    @NotNull
    @Generated
    @Selector("changeWithObject:type:index:associatedIndex:")
    public static native <_ObjectType> NSOrderedCollectionChange<_ObjectType> changeWithObjectTypeIndexAssociatedIndex(
            @Nullable @Mapped(ObjCObjectMapper.class) _ObjectType anObject, @NInt long type, @NUInt long index,
            @NUInt long associatedIndex);

    @NotNull
    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @NotNull
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

    /**
     * For removes, the index of the object in the original state.
     * For inserts, the index of the object in the final state.
     */
    @Generated
    @Selector("index")
    @NUInt
    public native long index();

    @Generated
    @Selector("init")
    public native NSOrderedCollectionChange<?> init();

    @Generated
    @Selector("initWithObject:type:index:")
    public native NSOrderedCollectionChange<?> initWithObjectTypeIndex(
            @Nullable @Mapped(ObjCObjectMapper.class) _ObjectType anObject, @NInt long type, @NUInt long index);

    @Generated
    @Selector("initWithObject:type:index:associatedIndex:")
    public native NSOrderedCollectionChange<?> initWithObjectTypeIndexAssociatedIndex(
            @Nullable @Mapped(ObjCObjectMapper.class) _ObjectType anObject, @NInt long type, @NUInt long index,
            @NUInt long associatedIndex);

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

    @NotNull
    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    @Generated
    @Owned
    @Selector("new")
    public static native NSOrderedCollectionChange<?> new_objc();

    /**
     * The object that was inserted or removed, if recorded
     */
    @Nullable
    @Generated
    @Selector("object")
    @MappedReturn(ObjCObjectMapper.class)
    public native _ObjectType object();

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

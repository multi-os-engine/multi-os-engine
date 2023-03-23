package apple.uikit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
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
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * API-Since: 14.0
 */
@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class UICollectionViewDiffableDataSourceSectionSnapshotHandlers<_ItemType> extends NSObject implements
        NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected UICollectionViewDiffableDataSourceSectionSnapshotHandlers(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native UICollectionViewDiffableDataSourceSectionSnapshotHandlers<?> alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native UICollectionViewDiffableDataSourceSectionSnapshotHandlers<?> allocWithZone(VoidPtr zone);

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
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(VoidPtr zone);

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
    @Selector("init")
    public native UICollectionViewDiffableDataSourceSectionSnapshotHandlers<?> init();

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
    public static native UICollectionViewDiffableDataSourceSectionSnapshotHandlers<?> new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("setShouldCollapseItemHandler:")
    public native void setShouldCollapseItemHandler(
            @ObjCBlock(name = "call_setShouldCollapseItemHandler") Block_setShouldCollapseItemHandler value);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setShouldCollapseItemHandler {
        @Generated
        boolean call_setShouldCollapseItemHandler(@Mapped(ObjCObjectMapper.class) Object arg0);
    }

    @Generated
    @Selector("setShouldExpandItemHandler:")
    public native void setShouldExpandItemHandler(
            @ObjCBlock(name = "call_setShouldExpandItemHandler") Block_setShouldExpandItemHandler value);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setShouldExpandItemHandler {
        @Generated
        boolean call_setShouldExpandItemHandler(@Mapped(ObjCObjectMapper.class) Object arg0);
    }

    @Generated
    @Selector("setSnapshotForExpandingParentItemHandler:")
    public native void setSnapshotForExpandingParentItemHandler(
            @ObjCBlock(name = "call_setSnapshotForExpandingParentItemHandler") Block_setSnapshotForExpandingParentItemHandler value);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setSnapshotForExpandingParentItemHandler {
        @Generated
        NSDiffableDataSourceSectionSnapshot<Object> call_setSnapshotForExpandingParentItemHandler(
                @Mapped(ObjCObjectMapper.class) Object arg0, NSDiffableDataSourceSectionSnapshot<Object> arg1);
    }

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("setWillCollapseItemHandler:")
    public native void setWillCollapseItemHandler(
            @ObjCBlock(name = "call_setWillCollapseItemHandler") Block_setWillCollapseItemHandler value);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setWillCollapseItemHandler {
        @Generated
        void call_setWillCollapseItemHandler(@Mapped(ObjCObjectMapper.class) Object arg0);
    }

    @Generated
    @Selector("setWillExpandItemHandler:")
    public native void setWillExpandItemHandler(
            @ObjCBlock(name = "call_setWillExpandItemHandler") Block_setWillExpandItemHandler value);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setWillExpandItemHandler {
        @Generated
        void call_setWillExpandItemHandler(@Mapped(ObjCObjectMapper.class) Object arg0);
    }

    @Generated
    @Selector("shouldCollapseItemHandler")
    @ObjCBlock(name = "call_shouldCollapseItemHandler_ret")
    public native Block_shouldCollapseItemHandler_ret shouldCollapseItemHandler();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_shouldCollapseItemHandler_ret {
        @Generated
        boolean call_shouldCollapseItemHandler_ret(@Mapped(ObjCObjectMapper.class) Object arg0);
    }

    @Generated
    @Selector("shouldExpandItemHandler")
    @ObjCBlock(name = "call_shouldExpandItemHandler_ret")
    public native Block_shouldExpandItemHandler_ret shouldExpandItemHandler();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_shouldExpandItemHandler_ret {
        @Generated
        boolean call_shouldExpandItemHandler_ret(@Mapped(ObjCObjectMapper.class) Object arg0);
    }

    @Generated
    @Selector("snapshotForExpandingParentItemHandler")
    @ObjCBlock(name = "call_snapshotForExpandingParentItemHandler_ret")
    public native Block_snapshotForExpandingParentItemHandler_ret snapshotForExpandingParentItemHandler();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_snapshotForExpandingParentItemHandler_ret {
        @Generated
        NSDiffableDataSourceSectionSnapshot<Object> call_snapshotForExpandingParentItemHandler_ret(
                @Mapped(ObjCObjectMapper.class) Object arg0, NSDiffableDataSourceSectionSnapshot<Object> arg1);
    }

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @Generated
    @Selector("willCollapseItemHandler")
    @ObjCBlock(name = "call_willCollapseItemHandler_ret")
    public native Block_willCollapseItemHandler_ret willCollapseItemHandler();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_willCollapseItemHandler_ret {
        @Generated
        void call_willCollapseItemHandler_ret(@Mapped(ObjCObjectMapper.class) Object arg0);
    }

    @Generated
    @Selector("willExpandItemHandler")
    @ObjCBlock(name = "call_willExpandItemHandler_ret")
    public native Block_willExpandItemHandler_ret willExpandItemHandler();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_willExpandItemHandler_ret {
        @Generated
        void call_willExpandItemHandler_ret(@Mapped(ObjCObjectMapper.class) Object arg0);
    }
}

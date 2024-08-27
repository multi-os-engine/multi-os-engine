package apple.coredata;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
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
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * Each decomposed version of the app's model should be represented using an NSCustomMigrationStage and contain
 * a source model reference and a destination model reference. NSCustomMigrationStage provides optional handlers
 * that run immediately prior to and after the migration stage.
 * 
 * API-Since: 17.0
 */
@Generated
@Library("CoreData")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSCustomMigrationStage extends NSMigrationStage {
    static {
        NatJ.register();
    }

    @Generated
    protected NSCustomMigrationStage(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSCustomMigrationStage alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native NSCustomMigrationStage allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(
            @Mapped(ObjCObjectMapper.class) @NotNull Object aTarget);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
    public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
            @Mapped(ObjCObjectMapper.class) @NotNull Object aTarget, @NotNull SEL aSelector,
            @Mapped(ObjCObjectMapper.class) @Nullable Object anArgument);

    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    @NotNull
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @Generated
    @Selector("classForKeyedUnarchiver")
    @NotNull
    public static native Class classForKeyedUnarchiver();

    @Generated
    @Selector("currentModel")
    @NotNull
    public native NSManagedObjectModelReference currentModel();

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * This handler will be called immediately after to migrating the store schema. Use this handler to
     * execute any tasks your app may need. Access to the persistent container may be obtained from the
     * NSStagedMigrationManager.
     */
    @Generated
    @Selector("didMigrateHandler")
    @ObjCBlock(name = "call_didMigrateHandler_ret")
    @Nullable
    public native Block_didMigrateHandler_ret didMigrateHandler();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_didMigrateHandler_ret {
        @Generated
        boolean call_didMigrateHandler_ret(@NotNull NSStagedMigrationManager arg0, @NotNull NSCustomMigrationStage arg1,
                @ReferenceInfo(type = NSError.class) @Nullable Ptr<NSError> arg2);
    }

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native NSCustomMigrationStage init();

    @Generated
    @Selector("initWithCurrentModelReference:nextModelReference:")
    public native NSCustomMigrationStage initWithCurrentModelReferenceNextModelReference(
            @NotNull NSManagedObjectModelReference currentModel, @NotNull NSManagedObjectModelReference nextModel);

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
    @NotNull
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    @Generated
    @Owned
    @Selector("new")
    public static native NSCustomMigrationStage new_objc();

    @Generated
    @Selector("nextModel")
    @NotNull
    public native NSManagedObjectModelReference nextModel();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * This handler will be called immediately after to migrating the store schema. Use this handler to
     * execute any tasks your app may need. Access to the persistent container may be obtained from the
     * NSStagedMigrationManager.
     */
    @Generated
    @Selector("setDidMigrateHandler:")
    public native void setDidMigrateHandler(
            @ObjCBlock(name = "call_setDidMigrateHandler") @Nullable Block_setDidMigrateHandler value);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setDidMigrateHandler {
        @Generated
        boolean call_setDidMigrateHandler(@NotNull NSStagedMigrationManager arg0, @NotNull NSCustomMigrationStage arg1,
                @ReferenceInfo(type = NSError.class) @Nullable Ptr<NSError> arg2);
    }

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * This handler will be called immediately prior to migrating the store schema. Use this handler to
     * execute any tasks your app may need. Access to the persistent container may be obtained from the
     * NSStagedMigrationManager.
     */
    @Generated
    @Selector("setWillMigrateHandler:")
    public native void setWillMigrateHandler(
            @ObjCBlock(name = "call_setWillMigrateHandler") @Nullable Block_setWillMigrateHandler value);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setWillMigrateHandler {
        @Generated
        boolean call_setWillMigrateHandler(@NotNull NSStagedMigrationManager arg0, @NotNull NSCustomMigrationStage arg1,
                @ReferenceInfo(type = NSError.class) @Nullable Ptr<NSError> arg2);
    }

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * This handler will be called immediately prior to migrating the store schema. Use this handler to
     * execute any tasks your app may need. Access to the persistent container may be obtained from the
     * NSStagedMigrationManager.
     */
    @Generated
    @Selector("willMigrateHandler")
    @ObjCBlock(name = "call_willMigrateHandler_ret")
    @Nullable
    public native Block_willMigrateHandler_ret willMigrateHandler();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_willMigrateHandler_ret {
        @Generated
        boolean call_willMigrateHandler_ret(@NotNull NSStagedMigrationManager arg0,
                @NotNull NSCustomMigrationStage arg1, @ReferenceInfo(type = NSError.class) @Nullable Ptr<NSError> arg2);
    }
}
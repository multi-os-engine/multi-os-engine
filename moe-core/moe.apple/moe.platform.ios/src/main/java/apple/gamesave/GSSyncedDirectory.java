package apple.gamesave;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.uikit.UIWindow;
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
 * A cloud-synced directory for game-save data.
 * 
 * To get an instance of the directory,
 * call ``openDirectoryForContainerIdentifier:``,
 * which returns the directory for the iCloud container associated with the specified identifier.
 * Calling this method starts syncing the directory in the background on the specified container.
 * When the game needs to access the contents of the directory,
 * show a UI while the directory fully syncs using
 * the ``finishSyncing:completionHandler:`` method.
 * If you're showing your own UI,
 * call the ``finishSyncingWithCompletionHandler:`` method to wait for the directory to finish syncing.
 * 
 * After the directory is ready to use,
 * syncing pauses until you close the directory object or the object is deallocated.
 * To resume syncing during the game,
 * close and re-open the directory by calling ``close`` and then ``openDirectoryForContainerIdentifier:``.
 */
@Generated
@Library("GameSave")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class GSSyncedDirectory extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected GSSyncedDirectory(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native GSSyncedDirectory alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native GSSyncedDirectory allocWithZone(VoidPtr zone);

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

    /**
     * Closes the directory, and resumes syncing the directory to the cloud.
     */
    @Generated
    @Selector("close")
    public native void close();

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * The state of the directory.
     */
    @Generated
    @Selector("directoryState")
    @NotNull
    public native GSSyncedDirectoryState directoryState();

    /**
     * Waits for the directory sync to complete, showing the sync's progress in a modal alert.
     * 
     * - Parameters:
     * - statusDisplay: The window where the system shows progress and alerts.
     * - completion: The block that GameSave calls after syncing finishes.
     * 
     * If the sync results in a conflict, the framework displays a conflict resolution UI
     * for the user to chose a version that will be used.
     * If the user isn't signed in to iCloud or iCloud drive,
     * the framework informs the user and then switches to local saving.
     */
    @Generated
    @Selector("finishSyncing:completionHandler:")
    public native void finishSyncingCompletionHandler(@NotNull UIWindow statusDisplay,
            @ObjCBlock(name = "call_finishSyncingCompletionHandler") @NotNull Block_finishSyncingCompletionHandler completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_finishSyncingCompletionHandler {
        @Generated
        void call_finishSyncingCompletionHandler();
    }

    /**
     * Waits for the directory sync to complete, without showing any user interface.
     * 
     * Use this method to wait if your app displays its own syncing UI.
     */
    @Generated
    @Selector("finishSyncingWithCompletionHandler:")
    public native void finishSyncingWithCompletionHandler(
            @ObjCBlock(name = "call_finishSyncingWithCompletionHandler") @NotNull Block_finishSyncingWithCompletionHandler completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_finishSyncingWithCompletionHandler {
        @Generated
        void call_finishSyncingWithCompletionHandler();
    }

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native GSSyncedDirectory init();

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
    public static native GSSyncedDirectory new_objc();

    /**
     * Requests an instance of the game-save directory.
     * 
     * - Parameter containerIdentifier: The identifier of the directory to request.
     * If you pass `nil`, this method uses the first container identifier
     * listed in the `com.apple.developer.icloud-container-identifiers` entitlements array.
     * 
     * This method returns immediately, and starts syncing the directory in the background.
     * To wait for syncing to complete, call the ``finishSyncingWithCompletionHandler:`` method.
     */
    @Generated
    @Selector("openDirectoryForContainerIdentifier:")
    @NotNull
    public static native GSSyncedDirectory openDirectoryForContainerIdentifier(@Nullable String containerIdentifier);

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    /**
     * Indicates that you resolved a conflict.
     * 
     * - Parameter version: The version to use.
     * 
     * If you're implementing your own conflict resolution,
     * read all of the conflicting versions,
     * and modify one of them to incorporate the state and changes from the others.
     * Then call this method, passing that version.
     * 
     * Call this method only when the directory is in the ``GSSyncState/GSSyncStateConflicted`` state.
     */
    @Generated
    @Selector("resolveConflictsWithVersion:")
    public native void resolveConflictsWithVersion(@NotNull GSSyncedDirectoryVersion version);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    /**
     * Triggers an upload of the directory for any changes that were pending.
     * 
     * Calls the completion block with `YES` if there were pending uploads; otherwise with `NO`.
     */
    @Generated
    @Selector("triggerPendingUploadWithCompletionHandler:")
    public native void triggerPendingUploadWithCompletionHandler(
            @ObjCBlock(name = "call_triggerPendingUploadWithCompletionHandler") @NotNull Block_triggerPendingUploadWithCompletionHandler completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_triggerPendingUploadWithCompletionHandler {
        @Generated
        void call_triggerPendingUploadWithCompletionHandler(boolean arg0);
    }

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}
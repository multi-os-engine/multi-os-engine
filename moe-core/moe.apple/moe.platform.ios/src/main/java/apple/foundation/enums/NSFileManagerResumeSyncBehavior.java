package apple.foundation.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * The behaviors the file manager can apply to resolve conflicts when resuming a sync.
 * 
 * You use this type when calling ``FileManager/resumeSyncForUbiquitousItem(at:with:completionHandler:)`` to resume
 * synchronizing.
 * In most situations, the ``NSFileManagerResumeSyncBehavior/preserveLocalChanges`` behavior is the best choice to avoid
 * risk of data loss.
 * 
 * API-Since: 26.0
 */
@Generated
public final class NSFileManagerResumeSyncBehavior {
    @Generated
    private NSFileManagerResumeSyncBehavior() {
    }

    /**
     * Resumes synchronizing by uploading the local version of the file.
     * 
     * If the server has a newer version, the server may create a conflict copy of the file, or may automatically pick
     * the winner of the conflict.
     * Apps can choose to implement conflict handling themselves by passing
     * `NSFileManagerResumeSyncBehaviorAfterUploadWithFailOnConflict`.
     * 
     * API-Since: 26.0
     */
    @Generated @NInt public static final long PreserveLocalChanges = 0x0000000000000000L;
    /**
     * Resumes sync by first uploading the local version of the file, failing if the provider detects a conflict.
     * 
     * If the upload succeeds, the sync resumes with the ``preserveLocalChanges`` behavior.
     * 
     * If the provider detects a conflict, the upload fails with an ``NSFileWriteUnknownError-enum.case``, with the
     * underlying error of
     * <doc://com.apple.documentation/documentation/FileProvider/NSFileProviderError/localVersionConflictingWithServer>.
     * In this case, the app needs to call ``FileManager/fetchLatestRemoteVersionOfItem(at:completionHandler:)``, rebase
     * local changes on top of the newly fetched version to resolve the conflict, and try again to resume sync.
     * This scenario is only available on paused items for which the file provider supports the fail-on-conflict
     * behavior.
     * To check that the file provider supports the behavior, get the ``NSURLUbiquitousItemSupportedSyncControlsKey``
     * URL resource and verify that ``NSFileManagerSupportedSyncControls/failUploadOnConflict`` is `true`.
     * 
     * API-Since: 26.0
     */
    @Generated @NInt public static final long AfterUploadWithFailOnConflict = 0x0000000000000001L;
    /**
     * Resumes synchronizing by overwriting any local changes with the remote version of the file.
     * 
     * If a conflict occurs, the file manager stores the local changes as an alternate version.
     * Only use this behavior if you provide a separate means of resolving and merging conflicts.
     * 
     * API-Since: 26.0
     */
    @Generated @NInt public static final long DropLocalChanges = 0x0000000000000002L;
}
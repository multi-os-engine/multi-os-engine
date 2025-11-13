package apple.foundation.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * The policies the file manager can apply to resolve conflicts when uploading a local version of a file.
 * 
 * API-Since: 26.0
 */
@Generated
public final class NSFileManagerUploadLocalVersionConflictPolicy {
    @Generated
    private NSFileManagerUploadLocalVersionConflictPolicy() {
    }

    /**
     * Resolves the conflict using the policy defined by the file provider.
     * 
     * API-Since: 26.0
     */
    @Generated @NInt public static final long Default = 0x0000000000000000L;
    /**
     * Resolves the conflict by causing the upload to fail.
     * 
     * This policy causes an upload to fail if the local version of a file, with any local changes applied, doesn't
     * match the server version.
     * In this scenario, call ``FileManager/fetchLatestRemoteVersionOfItem(at:completionHandler:)``, rebase local
     * changes on top of the newly fetched version, and retry the upload.
     * 
     * This policy is only available on paused items for which the file provider supports the fail-on-conflict behavior.
     * To check that the file provider supports the behavior, get the ``NSURLUbiquitousItemSupportedSyncControlsKey``
     * URL resource and verify that ``NSFileManagerSupportedSyncControls/failUploadOnConflict`` is `true`.
     * 
     * API-Since: 26.0
     */
    @Generated @NInt public static final long FailOnConflict = 0x0000000000000001L;
}
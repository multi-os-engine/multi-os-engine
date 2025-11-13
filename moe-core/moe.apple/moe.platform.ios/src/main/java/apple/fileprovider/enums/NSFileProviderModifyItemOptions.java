package apple.fileprovider.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

/**
 * Options for modifying items.
 * 
 * API-Since: 16.0
 */
@Generated
public final class NSFileProviderModifyItemOptions {
    @Generated
    private NSFileProviderModifyItemOptions() {
    }

    /**
     * An option that indicates the changes may already exist in your remote storage.
     * 
     * This option applies when moving the item to a location where it may refer to an item that already exists.
     * This situation may occur when merging two directories together.
     * 
     * API-Since: 16.0
     */
    @Generated @NUInt public static final long MayAlreadyExist = 0x0000000000000001L;
    /**
     * An option to fail an upload in the event of a version conflict.
     * 
     * If you adopt this option, and an uploaded item's base version doesn't match the version on the server, fail and
     * return ``NSFileProviderError/localVersionConflictingWithServer`` (Swift) or
     * ``NSFileProviderErrorCode/NSFileProviderErrorLocalVersionConflictingWithServer`` (Objective-C) in your
     * implementation of `modifyItem`.
     * 
     * To support the fail-on-conflict behavior in your file provider, indicate the support by adding the following
     * key/value pair to the extension's Info pane.
     * 
     * ```
     * <key>NSExtension</key>
     * <dict>
     * <key>NSExtensionFileProviderSupportsFailingUploadOnConflict</key>
     * <true/>
     * </dict>
     * ```
     * 
     * API-Since: 26.0
     */
    @Generated @NUInt public static final long FailOnConflict = 0x0000000000000002L;
    /**
     * An option to require the upload to complete before calling the completion handler.
     * 
     * This option allows the calling application to know when the uploaded version of the file is on the server.
     * 
     * API-Since: 26.0
     */
    @Generated @NUInt public static final long IsImmediateUploadRequestByPresentingApplication = 0x0000000000000004L;
}
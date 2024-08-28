package apple.backgroundassets.protocol;

import apple.backgroundassets.BADownload;
import apple.foundation.NSError;
import apple.foundation.NSURL;
import apple.foundation.NSURLAuthenticationChallenge;
import apple.foundation.NSURLCredential;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

/**
 * API-Since: 16.1
 */
@Generated
@Library("BackgroundAssets")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("BADownloadManagerDelegate")
public interface BADownloadManagerDelegate {
    /**
     * A download has tried to start but gotten a challenge quest.
     */
    @Generated
    @IsOptional
    @Selector("download:didReceiveChallenge:completionHandler:")
    default void downloadDidReceiveChallengeCompletionHandler(@NotNull BADownload download,
            @NotNull NSURLAuthenticationChallenge challenge,
            @ObjCBlock(name = "call_downloadDidReceiveChallengeCompletionHandler") @NotNull Block_downloadDidReceiveChallengeCompletionHandler completionHandler) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_downloadDidReceiveChallengeCompletionHandler {
        @Generated
        void call_downloadDidReceiveChallengeCompletionHandler(@NInt long disposition,
                @Nullable NSURLCredential credential);
    }

    /**
     * A download has made progress in bytes / total so far / total expected.
     */
    @Generated
    @IsOptional
    @Selector("download:didWriteBytes:totalBytesWritten:totalBytesExpectedToWrite:")
    default void downloadDidWriteBytesTotalBytesWrittenTotalBytesExpectedToWrite(@NotNull BADownload download,
            long bytesWritten, long totalBytesWritten, long totalExpectedBytes) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * A download has failed with a specific error.
     */
    @Generated
    @IsOptional
    @Selector("download:failedWithError:")
    default void downloadFailedWithError(@NotNull BADownload download, @NotNull NSError error) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Download has finished.
     * 
     * The file located at `fileURL` must be moved before this method exits scope, or it will be deleted.
     * It is strongly advised to move the file to its permanent destination rather than copy it.
     * [@warning] The file is marked by the system for deletion when the device becomes low on storage. Avoid copying or
     * modifying
     * the file, as this may remove the system's ability to delete the file.
     * 
     * @param fileURL A location to the file that has been downloaded.
     */
    @Generated
    @IsOptional
    @Selector("download:finishedWithFileURL:")
    default void downloadFinishedWithFileURL(@NotNull BADownload download, @NotNull NSURL fileURL) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * A download has started.
     */
    @Generated
    @IsOptional
    @Selector("downloadDidBegin:")
    default void downloadDidBegin(@NotNull BADownload download) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * A download has paused.
     */
    @Generated
    @IsOptional
    @Selector("downloadDidPause:")
    default void downloadDidPause(@NotNull BADownload download) {
        throw new java.lang.UnsupportedOperationException();
    }
}
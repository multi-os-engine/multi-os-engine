package apple.backgroundassets.protocol;

import apple.backgroundassets.BAAppExtensionInfo;
import apple.backgroundassets.BADownload;
import apple.foundation.NSError;
import apple.foundation.NSSet;
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
@ObjCProtocolName("BADownloaderExtension")
public interface BADownloaderExtension {
    /**
     * Download is about to begin but requires an authentication challenge to continue.
     */
    @Generated
    @IsOptional
    @Selector("backgroundDownload:didReceiveChallenge:completionHandler:")
    default void backgroundDownloadDidReceiveChallengeCompletionHandler(@NotNull BADownload download,
            @NotNull NSURLAuthenticationChallenge challenge,
            @ObjCBlock(name = "call_backgroundDownloadDidReceiveChallengeCompletionHandler") @NotNull Block_backgroundDownloadDidReceiveChallengeCompletionHandler completionHandler) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_backgroundDownloadDidReceiveChallengeCompletionHandler {
        @Generated
        void call_backgroundDownloadDidReceiveChallengeCompletionHandler(@NInt long disposition,
                @Nullable NSURLCredential credential);
    }

    /**
     * This method is called when a download has failed but there is no `BADownloadManager` delegate to handle the
     * completion event.
     * 
     * When a download has failed, this method will be invoked.
     * If a download fails you may reschedule it with `BADownloadManager`.
     * 
     * @param download The download object that has failed.
     * @param error    The error that caused the failure.
     */
    @Generated
    @IsOptional
    @Selector("backgroundDownload:failedWithError:")
    default void backgroundDownloadFailedWithError(@NotNull BADownload download, @NotNull NSError error) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * This method is called when a download has finished but there is no `BADownloadManager` delegate to handle the
     * completion event.
     * 
     * When a download succeeds, this method will be invoked; however it is only invoked if there is no other client
     * using `BADownloadManager`
     * with a hooked in `delegate`. The file located at `fileURL` must be moved before this method exits scope, or it
     * will be deleted.
     * It is strongly advised to move the file to its permanent destination rather than copy it.
     * [@warning] The file is marked by the system for deletion when the device becomes low on storage. Avoid copying or
     * modifying
     * the file, as this may remove the system's ability to delete the file.
     * 
     * @param download Download that has completed successfully.
     * @param fileURL  A location to the file that has been downloaded.
     */
    @Generated
    @IsOptional
    @Selector("backgroundDownload:finishedWithFileURL:")
    default void backgroundDownloadFinishedWithFileURL(@NotNull BADownload download, @NotNull NSURL fileURL) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Invoked by the system when the extension should check for updated content.
     * 
     * This method will be invoked by the system upon requested events defined in `BAContentRequest`.
     * This method should return a set of all `BAURLDownload`'s that your extension would like to schedule.
     * During the invocation of this method, `BADownloadManager` will prohibit the ability to schedule additional
     * downloads
     * until this method exits scope. Therefore, all downloads needing to be scheduled should be returned here.
     * If a download fails, it can be rescheduled using `BADownloadManager` in any other method in this protocol.
     * [@warning] You cannot use `BADownloadManager` to manually schedule downloads using this method. All downloads to
     * enqueue must be returned.
     * 
     * @param contentRequest The content request event that occured that caused this method to be invoked.
     * @param manifestURL    A file URL to the local manifest that was pre-downloaded and specified in your App's
     *                       Info.plist under the `BAManifestURL`.
     *                       The file is read-only and will be deleted after this method returns. If you wish to keep
     *                       it, you must copy it out.
     * @param extensionInfo  Information about your extension that may be useful for making a decision about
     *                       what content needs to be scheduled.
     * @return A set of unique `BAURLDownload` objects that the extension should schedule for download.
     */
    @Generated
    @IsOptional
    @Selector("downloadsForRequest:manifestURL:extensionInfo:")
    @NotNull
    default NSSet<? extends BADownload> downloadsForRequestManifestURLExtensionInfo(@NInt long contentRequest,
            @NotNull NSURL manifestURL, @NotNull BAAppExtensionInfo extensionInfo) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * This method may be called shortly before the extension is terminated.
     * 
     * This method is invoked if all extension callbacks have returned or if the extension has run over it's alotted
     * runtime.
     * This callback provides a last chance to tidy up state before process termination.
     * [@warning] This method is advisory only, there will be instances where the extension is terminated before this
     * method is invoked.
     * Do not rely on this method being invoked before the extension is terminated.
     * 
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: extensionWillTerminate will not be invoked in all applicable circumstances and should not be
     * relied upon.
     */
    @Generated
    @IsOptional
    @Deprecated
    @Selector("extensionWillTerminate")
    default void extensionWillTerminate() {
        throw new java.lang.UnsupportedOperationException();
    }
}
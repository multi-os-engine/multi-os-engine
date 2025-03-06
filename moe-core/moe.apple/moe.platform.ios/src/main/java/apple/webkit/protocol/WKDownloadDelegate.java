package apple.webkit.protocol;

import apple.foundation.NSData;
import apple.foundation.NSError;
import apple.foundation.NSHTTPURLResponse;
import apple.foundation.NSURL;
import apple.foundation.NSURLAuthenticationChallenge;
import apple.foundation.NSURLCredential;
import apple.foundation.NSURLRequest;
import apple.foundation.NSURLResponse;
import apple.webkit.WKDownload;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Generated
@Library("WebKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("WKDownloadDelegate")
public interface WKDownloadDelegate {
    /**
     * Invoked when the download needs a location to write the downloaded bytes.
     * 
     * suggestedFilename will often be the same as response.suggestedFilename,
     * but web content can specify the suggested download filename. If the destination file
     * URL is non-null, it must be a file that does not exist in a directory that does exist
     * and can be written to.
     * 
     * @param download          The download for which we need a file to which to write.
     * @param response          The server response if this download was the result of an HTTP request,
     *                          or a synthesized response for blob downloads.
     * @param suggestedFilename The suggested filename.
     * @param completionHandler The completion handler you must invoke with
     *                          either a file URL to begin the download or nil to cancel the download.
     */
    @Generated
    @Selector("download:decideDestinationUsingResponse:suggestedFilename:completionHandler:")
    void downloadDecideDestinationUsingResponseSuggestedFilenameCompletionHandler(@NotNull WKDownload download,
            @NotNull NSURLResponse response, @NotNull String suggestedFilename,
            @NotNull @ObjCBlock(name = "call_downloadDecideDestinationUsingResponseSuggestedFilenameCompletionHandler") Block_downloadDecideDestinationUsingResponseSuggestedFilenameCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_downloadDecideDestinationUsingResponseSuggestedFilenameCompletionHandler {
        @Generated
        void call_downloadDecideDestinationUsingResponseSuggestedFilenameCompletionHandler(@Nullable NSURL destination);
    }

    /**
     * Invoked when the download has failed.
     * 
     * @param download   The download that has failed.
     * @param error      The error indicating the failure reason.
     * @param resumeData This data can be passed to WKWebView resumeDownloadFromResumeData: to attempt to resume this
     *                   download.
     */
    @Generated
    @IsOptional
    @Selector("download:didFailWithError:resumeData:")
    default void downloadDidFailWithErrorResumeData(@NotNull WKDownload download, @NotNull NSError error,
            @Nullable NSData resumeData) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Invoked when the download needs to respond to an authentication challenge.
     * 
     * If you do not implement this method, the web view will respond to the authentication challenge with the
     * NSURLSessionAuthChallengeRejectProtectionSpace disposition.
     * 
     * @param download          The download that received the authentication challenge.
     * @param challenge         The authentication challenge.
     * @param completionHandler The completion handler you must invoke to respond to the challenge. The
     *                          disposition argument is one of the constants of the enumerated type
     *                          NSURLSessionAuthChallengeDisposition. When disposition is
     *                          NSURLSessionAuthChallengeUseCredential,
     *                          the credential argument is the credential to use, or nil to indicate continuing without
     *                          a
     *                          credential.
     */
    @Generated
    @IsOptional
    @Selector("download:didReceiveAuthenticationChallenge:completionHandler:")
    default void downloadDidReceiveAuthenticationChallengeCompletionHandler(@NotNull WKDownload download,
            @NotNull NSURLAuthenticationChallenge challenge,
            @NotNull @ObjCBlock(name = "call_downloadDidReceiveAuthenticationChallengeCompletionHandler") Block_downloadDidReceiveAuthenticationChallengeCompletionHandler completionHandler) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_downloadDidReceiveAuthenticationChallengeCompletionHandler {
        @Generated
        void call_downloadDidReceiveAuthenticationChallengeCompletionHandler(@NInt long arg0,
                @Nullable NSURLCredential arg1);
    }

    /**
     * Invoked when the download has received an HTTP redirection response.
     * 
     * If you do not implement this method, all server suggested redirects will be taken.
     * 
     * @param download          The download that received the redirect.
     * @param response          The redirection response.
     * @param newRequest        The new request that will be sent.
     * @param completionHandler The completion handler you must invoke to indicate whether or not
     *                          to proceed with the redirection.
     */
    @Generated
    @IsOptional
    @Selector("download:willPerformHTTPRedirection:newRequest:decisionHandler:")
    default void downloadWillPerformHTTPRedirectionNewRequestDecisionHandler(@NotNull WKDownload download,
            @NotNull NSHTTPURLResponse response, @NotNull NSURLRequest request,
            @NotNull @ObjCBlock(name = "call_downloadWillPerformHTTPRedirectionNewRequestDecisionHandler") Block_downloadWillPerformHTTPRedirectionNewRequestDecisionHandler decisionHandler) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_downloadWillPerformHTTPRedirectionNewRequestDecisionHandler {
        @Generated
        void call_downloadWillPerformHTTPRedirectionNewRequestDecisionHandler(@NInt long arg0);
    }

    /**
     * Invoked when the download has finished successfully.
     * 
     * @param download The download that finished.
     */
    @Generated
    @IsOptional
    @Selector("downloadDidFinish:")
    default void downloadDidFinish(@NotNull WKDownload download) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Invoked when the download needs a placeholder policy from the client.
     * 
     * The placeholder policy specifies whether a placeholder file should be created in
     * the Downloads directory when the download is in progress. This function is called after
     * the destination for the download has been decided, and before the download begins.
     * If the client opts into the placeholder feature, the system will create a placeholder file in
     * the Downloads directory, which is updated with the download's progress. When the download is
     * done, the placeholder file is replaced with the actual downloaded file. If the client opts
     * out of the placeholder feature, it can choose to provide a custom URL to publish progress
     * against. This is useful if the client maintains it's own placeholder file. If this delegate
     * is not implemented, the placeholder feature will be disabled.
     * 
     * API-Since: 18.2
     * 
     * @param download          The download for which we need a placeholder policy
     * @param completionHandler The completion handler that should be invoked with the chosen policy.
     *                          If the client implements it's own placeholder, it can choose to provide an alternate
     *                          placeholder
     *                          URL, which progress will be published against.
     *                          The download will not proceed until the completion handler is called.
     */
    @Generated
    @IsOptional
    @Selector("download:decidePlaceholderPolicy:")
    default void downloadDecidePlaceholderPolicy(@NotNull WKDownload download,
            @ObjCBlock(name = "call_downloadDecidePlaceholderPolicy") @NotNull Block_downloadDecidePlaceholderPolicy completionHandler) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_downloadDecidePlaceholderPolicy {
        @Generated
        void call_downloadDecidePlaceholderPolicy(@NInt long arg0, @Nullable NSURL arg1);
    }

    /**
     * Called when the download receives a final URL
     * 
     * This function is called after didReceivePlaceholderURL was called and after the download finished.
     * The final URL will normally refer to a file in the Downloads directory
     * 
     * API-Since: 18.2
     * 
     * @param download The download for which we received a final URL
     * @param url      The URL of the final download location
     */
    @Generated
    @IsOptional
    @Selector("download:didReceiveFinalURL:")
    default void downloadDidReceiveFinalURL(@NotNull WKDownload download, @NotNull NSURL url) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Called when the download receives a placeholder URL
     * 
     * This function is called only if the client opted into the placeholder feature, and it is called
     * before receiving the final URL of the download. The placeholder URL will normally refer to a file in the
     * Downloads directory.
     * 
     * API-Since: 18.2
     * 
     * @param download          The download for which we received a placeholder URL
     * @param completionHandler The completion handler that should be called by the client in response to this call.
     *                          The didReceiveFinalURL function will not be called until the completion handler has been
     *                          called.
     */
    @Generated
    @IsOptional
    @Selector("download:didReceivePlaceholderURL:completionHandler:")
    default void downloadDidReceivePlaceholderURLCompletionHandler(@NotNull WKDownload download, @NotNull NSURL url,
            @ObjCBlock(name = "call_downloadDidReceivePlaceholderURLCompletionHandler") @NotNull Block_downloadDidReceivePlaceholderURLCompletionHandler completionHandler) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_downloadDidReceivePlaceholderURLCompletionHandler {
        @Generated
        void call_downloadDidReceivePlaceholderURLCompletionHandler();
    }
}

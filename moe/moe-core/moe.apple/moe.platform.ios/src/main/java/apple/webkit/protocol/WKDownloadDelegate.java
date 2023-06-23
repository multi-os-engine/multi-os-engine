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
}

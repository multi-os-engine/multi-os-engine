package apple.webkit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * [@enum] WKDownloadRedirectPolicy
 * <p>
 * The policy to pass back to the decision handler from the download:willPerformHTTPRedirection:newRequest:decisionHandler: method.
 * [@constant] WKDownloadRedirectPolicyCancel   Cancel the redirect.
 * [@constant] WKDownloadRedirectPolicyAllow    Allow the redirect.
 */
@Generated
public final class WKDownloadRedirectPolicy {
    @Generated
    private WKDownloadRedirectPolicy() {
    }

    @Generated @NInt public static final long Cancel = 0x0000000000000000L;
    @Generated @NInt public static final long Allow = 0x0000000000000001L;
}

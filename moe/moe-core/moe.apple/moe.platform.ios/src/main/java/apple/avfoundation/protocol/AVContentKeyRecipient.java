package apple.avfoundation.protocol;

import apple.avfoundation.AVContentKey;
import apple.avfoundation.AVContentKeySession;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

/**
 * [@protocol]      AVContentKeyRecipient
 * <p>
 * Classes of objects that may require decryption keys for media data in order to enable processing, such as parsing or playback, conform to this protocol.
 */
@Generated
@Library("AVFoundation")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("AVContentKeyRecipient")
public interface AVContentKeyRecipient {
    /**
     * [@property]      mayRequireContentKeysForMediaDataProcessing
     * <p>
     * Indicates whether the receiver may require decryption keys for media data in order to enable processing.
     * <p>
     * When the value of mayRequireContentKeysForMediaDataProcessing is YES, adding the receiver to an AVContentKeySession allows it to employ the session's already existing keys and also enables the handling of new key requests by the AVContentKeySession's delegate.
     */
    @Generated
    @Selector("mayRequireContentKeysForMediaDataProcessing")
    boolean mayRequireContentKeysForMediaDataProcessing();

    /**
     * contentKeySession:didProvideContentKey:
     * <p>
     * Informs the receiver that an AVContentKey has been obtained as the result of an invocation of -[AVContentKeyRequest processContentKeyResponse:].
     * <p>
     * The recipient may employ the AVContentKey for use with objects that support manual attachment of keys, such as CMSampleBuffer via an invocation of AVSampleBufferAttachContentKey.
     */
    @Generated
    @IsOptional
    @Selector("contentKeySession:didProvideContentKey:")
    default void contentKeySessionDidProvideContentKey(AVContentKeySession contentKeySession, AVContentKey contentKey) {
        throw new java.lang.UnsupportedOperationException();
    }
}

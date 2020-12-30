package apple.avfoundation.protocol;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

/**
 * [@protocol]      AVContentKeyRecipient
 * 
 *   Classes of objects that may require decryption keys for media data in order to enable processing, such as parsing or playback, conform to this protocol.
 */
@Generated
@Library("AVFoundation")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("AVContentKeyRecipient")
public interface AVContentKeyRecipient {
    /**
     * [@property]      mayRequireContentKeysForMediaDataProcessing
     * 
     * Indicates whether the receiver may require decryption keys for media data in order to enable processing.
     * 
     * When the value of mayRequireContentKeysForMediaDataProcessing is YES, adding the receiver to an AVContentKeySession allows it to employ the session's already existing keys and also enables the handling of new key requests by the AVContentKeySession's delegate.
     */
    @Generated
    @Selector("mayRequireContentKeysForMediaDataProcessing")
    boolean mayRequireContentKeysForMediaDataProcessing();
}
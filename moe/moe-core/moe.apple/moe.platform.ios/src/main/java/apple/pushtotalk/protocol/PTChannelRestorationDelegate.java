package apple.pushtotalk.protocol;

import apple.foundation.NSUUID;
import apple.pushtotalk.PTChannelDescriptor;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

/**
 * API-Since: 16.0
 */
@Generated
@Library("PushToTalk")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("PTChannelRestorationDelegate")
public interface PTChannelRestorationDelegate {
    /**
     * If the system had been tracking a channel previously, this method will be called.
     */
    @Generated
    @Selector("channelDescriptorForRestoredChannelUUID:")
    PTChannelDescriptor channelDescriptorForRestoredChannelUUID(NSUUID channelUUID);
}
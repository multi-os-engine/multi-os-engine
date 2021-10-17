package apple.homekit.protocol;

import apple.homekit.HMNetworkConfigurationProfile;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

@Generated
@Library("HomeKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("HMNetworkConfigurationProfileDelegate")
public interface HMNetworkConfigurationProfileDelegate {
    /**
     * Informs the delegate that the network access mode has updated.
     *
     * @param profile Sender of the message.
     */
    @Generated
    @IsOptional
    @Selector("profileDidUpdateNetworkAccessMode:")
    default void profileDidUpdateNetworkAccessMode(HMNetworkConfigurationProfile profile) {
        throw new java.lang.UnsupportedOperationException();
    }
}

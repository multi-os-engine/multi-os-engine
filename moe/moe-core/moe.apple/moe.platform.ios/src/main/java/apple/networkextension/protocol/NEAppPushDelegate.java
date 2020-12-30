package apple.networkextension.protocol;

import apple.foundation.NSDictionary;
import apple.networkextension.NEAppPushManager;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

/**
 * [@protocol] NEAppPushDelegate
 * 
 * Delegate for NEAppPushManager.
 */
@Generated
@Library("NetworkExtension")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("NEAppPushDelegate")
public interface NEAppPushDelegate {
    /**
     * appPushManager:didReceiveIncomingCallWithUserInfo:userInfo
     * 
     * This delegate method is called when the provider reports incoming call using reportIncomingCommunicationWithUserInfo method.
     * 
     * @param userInfo A dictionary of custom information that the provider passes to reportIncomingCommunicationWithUserInfo method.
     */
    @Generated
    @Selector("appPushManager:didReceiveIncomingCallWithUserInfo:")
    void appPushManagerDidReceiveIncomingCallWithUserInfo(NEAppPushManager manager, NSDictionary<?, ?> userInfo);
}
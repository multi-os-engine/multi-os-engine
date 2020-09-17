package apple.networkextension.protocol;

import apple.foundation.NSDictionary;
import apple.networkextension.NEAppPushManager;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

@Generated
@Library("NetworkExtension")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("NEAppPushDelegate")
public interface NEAppPushDelegate {
    @Generated
    @Selector("appPushManager:didReceiveIncomingCallWithUserInfo:")
    void appPushManagerDidReceiveIncomingCallWithUserInfo(NEAppPushManager manager, NSDictionary<?, ?> userInfo);
}